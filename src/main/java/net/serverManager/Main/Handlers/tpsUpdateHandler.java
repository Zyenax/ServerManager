package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class tpsUpdateHandler implements Listener{
	
	public static main plugin;
	public tpsUpdateHandler(main listener) {
		tpsUpdateHandler.plugin = listener;	
		updateTps();
	}
	
	public static void update(Player p){
		if(!(hashMapStorage.tpsUpdate.containsKey(p))){
			hashMapStorage.tpsUpdate.put(p, "TPS");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eNow sending ticks per second every 10 seconds!"));
		}else if(hashMapStorage.tpsUpdate.containsKey(p)){
			hashMapStorage.tpsUpdate.remove(p);
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eStopped sending ticks per second!"));
		}
	}
	
	public void updateTps(){
		final Integer ticks = (int) tpsMonitor.getTPS();
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
	        public void run(){
	        	for(final Player p : Bukkit.getOnlinePlayers()){
	        		if(hashMapStorage.tpsUpdate.containsKey(p)){
	        			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eThe server is running at &6" + ticks + " &eticks per second!"));
	        		}
	        	}
	        }
		}, 0, 20 * 10);
	}

}
