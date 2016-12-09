package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class clearChatHandler implements Listener {
	
	public static main plugin;
	public clearChatHandler(main listener) {
		clearChatHandler.plugin = listener;	
	}
	
	public static void clearChat(Player p){
		for(final Player player : Bukkit.getOnlinePlayers()){
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color("                     "));
			player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cChat was cleared by &e" + p.getName()));
		    player.playSound(player.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
	}

}
