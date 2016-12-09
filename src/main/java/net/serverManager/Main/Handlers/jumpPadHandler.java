package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.hashMapStorage;
import net.serverManager.Main.Utils.util;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class jumpPadHandler implements Listener {
	@SuppressWarnings("unused")
	private main plugin;

	public jumpPadHandler(main hub) {
		this.plugin = hub;
	}

	public static void update(Player p){
		if(hashMapStorage.jumpPad.containsKey("JP")){
			hashMapStorage.jumpPad.remove("JP");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eJump pads have been &cdisabled&e!"));
		}else if(!(hashMapStorage.jumpPad.containsKey("JP"))){
			hashMapStorage.jumpPad.put("JP", "JP");
			p.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eJump pads have been &aenabled&e!"));
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLaunch(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(p.getLocation().getWorld().getBlockAt(p.getLocation()).getType() == Material.IRON_PLATE){
			if(hashMapStorage.jumpPad.containsKey("JP")){
			p.setVelocity(p.getLocation().getDirection().multiply(1.5).setY(1.5));
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playEffect(p.getLocation(), Effect.PORTAL, Integer.MAX_VALUE);
			p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
		}
		}
	}
	
	

}
