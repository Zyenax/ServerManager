package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

public class explosionHandler implements Listener {
	@SuppressWarnings("unused")
	private main plugin;

	public explosionHandler(main hub) {
		this.plugin = hub;
	}

	public static void update(Player p){
		if(hashMapStorage.explosions.containsKey("BOOM")){
			hashMapStorage.explosions.remove("BOOM");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eExplosions have been &aenabled&e!"));
		}else if(!(hashMapStorage.explosions.containsKey("BOOM"))){
			hashMapStorage.explosions.put("BOOM", "BOOM");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eExplosions have been &cdisabled&e!"));
		}
	}

	@EventHandler
	public void onExplode(EntityExplodeEvent e) {
		if(hashMapStorage.explosions.containsKey("BOOM")){
			e.setCancelled(true);
		}else if(!(hashMapStorage.explosions.containsKey("BOOM"))){
			e.setCancelled(false);
		}
	}
	
	@EventHandler
	public void onExplode(BlockExplodeEvent e) {
		if(hashMapStorage.explosions.containsKey("BOOM")){
			e.setCancelled(true);
		}else if(!(hashMapStorage.explosions.containsKey("BOOM"))){
			e.setCancelled(false);
		}
	}
	
	

}
