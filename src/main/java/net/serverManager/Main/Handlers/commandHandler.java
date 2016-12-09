package net.serverManager.Main.Handlers;

import net.serverManager.Main.main;
import net.serverManager.Main.Menus.serverManagerMenu;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.util;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class commandHandler extends BukkitCommand {
	
	@SuppressWarnings("unused")
	private main plugin;

	public commandHandler(String string) {
		super(string);
		this.description = serverManager.managerDescription;
	}

	public boolean execute(CommandSender sender,
			String alias, String[] args) {
		Player player = (Player) sender;
		if(sender.equals(player)){
		
		if (alias.equalsIgnoreCase(serverManager.managerName)){
			if(args.length >= 2 || args.length < 1 || args.equals(null)){
				serverManagerMenu.Menu(player);
			}else if(args[0].equalsIgnoreCase("ping")){
					player.sendMessage(util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &eYour ping is &a" + ((CraftPlayer) player).getHandle().ping + "&e!"));
				}
			}
		}
		
		
		return true;
	}
}
