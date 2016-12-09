package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class muteChatHandler implements Listener {
	
	public static main plugin;
	public muteChatHandler(main listener) {
		muteChatHandler.plugin = listener;	
	}
	
	public static void muteChat(Player p){
		for(Player player : Bukkit.getOnlinePlayers()){
		if(!(hashMapStorage.chatMuted.containsKey("Muted"))){
			hashMapStorage.chatMuted.put("Muted", "Muted");
			player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cChat was muted by &e" + p.getName()));
			player.playSound(player.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
		}
	}
	
	public static void unMuteChat(Player p){
		for(Player player : Bukkit.getOnlinePlayers()){
		if(hashMapStorage.chatMuted.containsKey("Muted")){
			hashMapStorage.chatMuted.clear();
			player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cChat was unmuted by &e" + p.getName()));
			player.playSound(player.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
		}
	}

}
