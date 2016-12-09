package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Bungee.bUtil;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.packets;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Sound;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class shutDownHandler implements Listener {
	
	public static main plugin;
	public shutDownHandler(main listener) {
		shutDownHandler.plugin = listener;	
	}
	
	public static void shutDown(){
		for(final Player player : Bukkit.getOnlinePlayers()){
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player, util.color("&c&lSHUTTING DOWN IN..."), util.color("&c&l10 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e10 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 0);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l9 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e9 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 20);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l8 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e8 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 40);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l7 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e7 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 60);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l6 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e6 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 80);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l5 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e5 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							Bukkit.getServer().dispatchCommand(console,
									util.color("save-all"));
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 100);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l4 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e4 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 120);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l3 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e3 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 140);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l2 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e2 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 160);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							packets.sendTitle(player,
									util.color("&c&lSHUTTING DOWN IN..."),
									util.color("&c&l1 SECONDS!"));
							player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cShutting down in &e1 &cseconds!"));
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
							bUtil.sendToServer(player, serverManager.managerHubName);
						}
					}, 180);
			Bukkit.getServer().getScheduler()
					.scheduleSyncDelayedTask(plugin, new Runnable() {
						public void run() {
							Bukkit.getServer().shutdown();
							player.playSound(player.getLocation(),
									Sound.BLOCK_DISPENSER_DISPENSE, Integer.MAX_VALUE,
									Integer.MAX_VALUE);
							FireworkEffect redEffect = FireworkEffect.builder().trail(true).flicker(true).withColor(new Color[] { Color.RED }).with(FireworkEffect.Type.BURST).build();
							packets.playFirework(player.getLocation(), redEffect, 1);
						}
					}, 200);
	}
	}

}
