package net.serverManager.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

import net.serverManager.Main.Bungee.bUtil;
import net.serverManager.Main.Handlers.buildHandler;
import net.serverManager.Main.Handlers.chatHandler;
import net.serverManager.Main.Handlers.clearChatHandler;
import net.serverManager.Main.Handlers.commandHandler;
import net.serverManager.Main.Handlers.explosionHandler;
import net.serverManager.Main.Handlers.jumpPadHandler;
import net.serverManager.Main.Handlers.muteChatHandler;
import net.serverManager.Main.Handlers.shutDownHandler;
import net.serverManager.Main.Handlers.tpsMonitor;
import net.serverManager.Main.Handlers.tpsUpdateHandler;
import net.serverManager.Main.Menus.muteChatMenu;
import net.serverManager.Main.Menus.serverManagerMenu;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.packets;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.craftbukkit.v1_10_R1.CraftServer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class main extends JavaPlugin implements Listener, PluginMessageListener{
	
	public static String GetServer;
	public static String[] serverList;
	
	public void onEnable(){
		listeners();
		commands();
		registerBungee();
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
	    console.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + " " + serverManager.managerEnable));
	}
	
	public void onDisable(){
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + " " + serverManager.managerDisable));
	}
	
	public void listeners(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new bUtil(this), this);
		pm.registerEvents(new chatHandler(this), this);
		pm.registerEvents(new clearChatHandler(this), this);
		pm.registerEvents(new muteChatHandler(this), this);
		pm.registerEvents(new shutDownHandler(this), this);
		pm.registerEvents(new muteChatMenu(this), this);
		pm.registerEvents(new serverManagerMenu(this), this);
		pm.registerEvents(new serverManager(this), this);
		pm.registerEvents(new hashMapStorage(this), this);
		pm.registerEvents(new packets(this), this);
		pm.registerEvents(new util(this), this);
		pm.registerEvents(new tpsUpdateHandler(this), this);
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new tpsMonitor(), 100L, 1L);
		pm.registerEvents(new jumpPadHandler(this), this);
		pm.registerEvents(new buildHandler(this), this);
		pm.registerEvents(new explosionHandler(this), this);
	}
	
	public void commands(){
		((CraftServer) this.getServer()).getCommandMap().register(serverManager.managerName, new commandHandler(serverManager.managerName));
	}
	
	public void registerBungee(){
		Bukkit.getServer().getMessenger().registerOutgoingPluginChannel(this,"BungeeCord");
	    Bukkit.getServer().getMessenger().registerIncomingPluginChannel(this, "BungeeCord", this);
	}
	
	public void onPluginMessageReceived(String channel, Player player, byte[] message) {
	    if (!channel.equals("BungeeCord")) {
	      return;
	    }
	    try{
	    	DataInputStream in = new DataInputStream(new ByteArrayInputStream(message));
		    String subchannel = in.readUTF();
	    if (subchannel.equals("PlayerCount")) {
	    	String PlayerCountServer = in.readUTF();
	    	Integer playercount = in.readInt();
	    	hashMapStorage.PlayerCount.remove(PlayerCountServer);
	    	hashMapStorage.PlayerCount.put(PlayerCountServer, playercount);
        } else if (subchannel.equals("GetServers")) {
        	serverList = in.readUTF().split("\n");
        } else if (subchannel.equals("GetServer")) {
            // Example: GetServer subchannel
        	GetServer = in.readUTF();
        }
	    }catch (Exception e){
	    	e.printStackTrace();
	    }
	  }
}
