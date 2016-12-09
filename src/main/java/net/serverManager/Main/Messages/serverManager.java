package net.serverManager.Main.Messages;

import net.serverManager.Main.main;
import net.serverManager.Main.Utils.util;

import org.bukkit.event.Listener;

public class serverManager implements Listener{
	
	public static main plugin;
	public serverManager(main listener) {
		serverManager.plugin = listener;	
	}
	
	public static String managerName = "Zues";
	public static String managerHubName = "Hub1";
	public static String managerDescription = "This command is used to open the servers manager menu!";
	public static String managerColor = util.color("&a&l");
	public static String managerEnable = util.color("&aHas been enabled!");
	public static String managerDisable = util.color("&cHas been disabled!");
	public static String managerMenu = util.color(managerColor + managerName + " Menu");
	public static String noAccess = util.color(serverManager.managerColor + serverManager.managerName + "&8&l» &cYou don't have access to that!");

}
