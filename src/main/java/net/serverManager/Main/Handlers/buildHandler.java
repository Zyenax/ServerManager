package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class buildHandler implements Listener {
	@SuppressWarnings("unused")
	private main plugin;

	public buildHandler(main hub) {
		this.plugin = hub;
	}

	public static void update(Player p){
		if(hashMapStorage.building.containsKey("BUILD")){
			hashMapStorage.building.remove("BUILD");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eBuilding has been &aenabled&e!"));
		}else if(!(hashMapStorage.building.containsKey("BUILD"))){
			hashMapStorage.building.put("BUILD", "BUILD");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eBuilding has been &cdisabled&e!"));
		}
	}
	
	@EventHandler
	public void onBreakEvent(BlockBreakEvent e) {
		if(hashMapStorage.building.containsKey("BUILD")){
			e.setCancelled(true);
			e.getPlayer().sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eBuilding is currently &cdisabled&e!"));
		}else if(!(hashMapStorage.building.containsKey("BUILD"))){
			e.setCancelled(false);
		}
	}

	@EventHandler
	public void onPlaceEvent(BlockPlaceEvent e) {
		if(hashMapStorage.building.containsKey("BUILD")){
			e.setCancelled(true);
			e.getPlayer().sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eBuilding is currently &cdisabled&e!"));
		}else if(!(hashMapStorage.building.containsKey("BUILD"))){
			e.setCancelled(false);
		}
	}

}
