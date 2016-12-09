package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatHandler implements Listener{
	
	@SuppressWarnings("unused")
	private main plugin;
	public chatHandler(main listener) {
		this.plugin = listener;		
	}
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
	    if(!(p.hasPermission("servermanager.chatbypass"))){
		    if(hashMapStorage.chatMuted.containsKey("Muted")){
				e.setCancelled(true);
				p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cChat is currently muted!"));
			}else{
				if(cooldownHandler.tryCooldown(p, "Chat", 4000)){
				e.setCancelled(false);
				}else{
					e.setCancelled(true);
					p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cYou must wait &e" + (cooldownHandler.getCooldown(p, "Chat") / 1000) + " &cmore seconds to chat!"));
				}
			}
		}else{
			e.setCancelled(false);
		}
	}

}
