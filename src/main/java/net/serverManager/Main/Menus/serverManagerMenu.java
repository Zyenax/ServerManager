package net.serverManager.Main.Menus;

import java.util.Arrays;

import net.serverManager.Main.main;
import net.serverManager.Main.Bungee.bUtil;
import net.serverManager.Main.Handlers.buildHandler;
import net.serverManager.Main.Handlers.clearChatHandler;
import net.serverManager.Main.Handlers.explosionHandler;
import net.serverManager.Main.Handlers.jumpPadHandler;
import net.serverManager.Main.Handlers.shutDownHandler;
import net.serverManager.Main.Handlers.tpsUpdateHandler;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class serverManagerMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private main plugin;
	public serverManagerMenu(main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, util.color(serverManager.managerMenu));
		Border();
		chatClear(p);
		shutDown(p);
		muteChat(p);
		tpsUpdate(p);
		playerStats(p);
		jumpPad(p);
		building(p);
		explosions(p);
		p.openInventory(inv);
	}
	
	public static void Border(){
		ItemStack border = util.createItem(Material.STAINED_GLASS_PANE, 1, 15, util.color(" "), null);
		inv.setItem(0, border);
		inv.setItem(1, border);
		inv.setItem(2, border);
		inv.setItem(3, border);
		inv.setItem(4, border);
		inv.setItem(5, border);
		inv.setItem(6, border);
		inv.setItem(7, border);
		inv.setItem(8, border);
		inv.setItem(9, border);
		inv.setItem(17, border);
		inv.setItem(18, border);
		inv.setItem(26, border);
		inv.setItem(27, border);
		inv.setItem(35, border);
		inv.setItem(36, border);
		inv.setItem(37, border);
		inv.setItem(38, border);
		inv.setItem(39, border);
		inv.setItem(40, border);
		inv.setItem(41, border);
		inv.setItem(42, border);
		inv.setItem(43, border);
		inv.setItem(44, border);
	}
	
	public static void shutDown(Player p){
		if(p.hasPermission("servermanager.shutdown")){
			ItemStack item = util.createItem(Material.BARRIER, 1, 0, util.color("           &a&lSHUT DOWN"), Arrays.asList(util.color(" "), util.color("    &7Shuts the server down"), util.color("&7while warning the players and"), util.color("        &7saving the world!"), util.color(" "), util.color("            &a&lACCESS ✔"), util.color("        &8Click to activate")));
			inv.setItem(10, item);
		}else {
			ItemStack item = util.createItem(Material.BARRIER, 1, 0, util.color("           &c&lSHUT DOWN"), Arrays.asList(util.color(" "), util.color("    &7Shuts the server down"), util.color("&7while warning the players and"), util.color("        &7saving the world!"), util.color(" "), util.color("            &c&lACCESS ✘"), util.color("        &8Click to activate")));
			inv.setItem(10, item);
		}
	}
	
	public static void chatClear(Player p){
		if(p.hasPermission("servermanager.clearchat")){
			ItemStack item = util.createItem(Material.NAME_TAG, 1, 0, util.color("             &a&lCLEAR CHAT"), Arrays.asList(util.color(" "), util.color("       &7Clears the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(12, item);
		}else {
			ItemStack item = util.createItem(Material.NAME_TAG, 1, 0, util.color("             &c&lCLEAR CHAT"), Arrays.asList(util.color(" "), util.color("       &7Clears the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(12, item);
		}
	}
	
	public static void muteChat(Player p){
		if(p.hasPermission("servermanager.mutechat")){
			ItemStack item = util.createItem(Material.NAME_TAG, 1, 0, util.color("              &a&lMUTE CHAT"), Arrays.asList(util.color(" "), util.color("        &7Mutes the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(14, item);
		}else {
			ItemStack item = util.createItem(Material.NAME_TAG, 1, 0, util.color("              &c&lMUTE CHAT"), Arrays.asList(util.color(" "), util.color("        &7Mutes the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(14, item);
		}
	}
	
	public static void tpsUpdate(Player p){
		if(p.hasPermission("servermanager.tpsupdate")){
			ItemStack item = util.createItem(Material.DISPENSER, 1, 0, util.color("             &a&lTPS UPDATE"), Arrays.asList(util.color(" "), util.color("      &7Sends you messages of"), util.color(" &7the servers ticks per second"), util.color("       &7every couple seconds!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(16, item);
		}else {
			ItemStack item = util.createItem(Material.DISPENSER, 1, 0, util.color("             &c&lTPS UPDATE"), Arrays.asList(util.color(" "), util.color("      &7Sends you messages of"), util.color(" &7the servers ticks per second"), util.color("       &7every couple seconds!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(16, item);
		}
	}
	
	public static void jumpPad(Player p){
		if(p.hasPermission("servermanager.jumppad")){
			ItemStack item = util.createItem(Material.IRON_PLATE, 1, 0, util.color("             &a&lJUMP PADS"), Arrays.asList(util.color(" "), util.color("      &7Lets players use iron"), util.color("&7plates that you place around the"), util.color("      &7server as jump pads!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(20, item);
		}else {
			ItemStack item = util.createItem(Material.IRON_PLATE, 1, 0, util.color("             &c&lJUMP PADS"), Arrays.asList(util.color(" "), util.color("      &7Lets players use iron"), util.color("&7plates that you place around the"), util.color("      &7server as jump pads!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(20, item);
		}
	}
	
	public static void playerStats(Player p){
		String server = bUtil.getServer(p);
		if(server == null){
			server = Bukkit.getServerName();
		}
		Integer slotNumber = 22;
		if(p.isOp()){
			ItemStack PlayerStats = util.createSkull(p.getName(), util.color("&aCharacter Information"), Arrays.asList(util.color(" "), util.color("&6Username: &7" + p.getName()), util.color("&6Server: &7" + server), util.color("&6Gamemode: &7" + p.getGameMode()), util.color("&6Operator: &aYes"), util.color("&6Ping: &7" + ((CraftPlayer) p).getHandle().ping)));
			inv.setItem(slotNumber, PlayerStats);
		}else if(!(p.isOp())){
			ItemStack PlayerStats = util.createSkull(p.getName(), util.color("&aCharacter Information"), Arrays.asList(util.color(" "), util.color("&6Username: &7" + p.getName()), util.color("&6Server: &7" + server), util.color("&6Gamemode: &7" + p.getGameMode()), util.color("&6Operator: &cNo"), util.color("&6Ping: &7" + ((CraftPlayer) p).getHandle().ping)));
			inv.setItem(slotNumber, PlayerStats);
		}
	}
	
	public static void building(Player p){
		if(p.hasPermission("servermanager.building")){
			ItemStack item = util.createItem(Material.WORKBENCH, 1, 0, util.color("             &a&lBUILDING"), Arrays.asList(util.color(" "), util.color("       &7Toggles the players"), util.color("&7ability to build or break blocks"), util.color("    &7across the servers map!"), util.color(" "), util.color("             &a&lACCESS ✔"), util.color("         &8Click to activate")));
			inv.setItem(24, item);
		}else {
			ItemStack item = util.createItem(Material.WORKBENCH, 1, 0, util.color("             &c&lBUILDING"), Arrays.asList(util.color(" "), util.color("       &7Toggles the players"), util.color("&7ability to build or break blocks"), util.color("    &7across the servers map!"), util.color(" "), util.color("             &c&lACCESS ✘"), util.color("         &8Click to activate")));
			inv.setItem(24, item);
		}
	}
	
	public static void explosions(Player p){
		if(p.hasPermission("servermanager.explosions")){
			ItemStack item = util.createItem(Material.TNT, 1, 0, util.color("            &a&lEXPLOSIONS"), Arrays.asList(util.color(" "), util.color("       &7Toggles the players"), util.color("&7ability to explode types of blocks"), util.color("    &7across the servers map!"), util.color(" "), util.color("             &a&lACCESS ✔"), util.color("         &8Click to activate")));
			inv.setItem(28, item);
		}else {
			ItemStack item = util.createItem(Material.TNT, 1, 0, util.color("            &c&lEXPLOSIONS"), Arrays.asList(util.color(" "), util.color("       &7Toggles the players"), util.color("&7ability to explode types of blocks"), util.color("    &7across the servers map!"), util.color(" "), util.color("             &c&lACCESS ✘"), util.color("         &8Click to activate")));
			inv.setItem(28, item);
		}
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		final Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(util.color(serverManager.managerMenu))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							
							
							//SHUTDOWN SERVER ACCESS
							if(e.getCurrentItem().getType().equals(Material.BARRIER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("           &a&lSHUT DOWN"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									shutDownHandler.shutDown();
								}
							}
							//SHUT DOWN SERVER NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.BARRIER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("           &c&lSHUT DOWN"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							//CLEAR CHAT ACCESS
							if(e.getCurrentItem().getType().equals(Material.NAME_TAG)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &a&lCLEAR CHAT"))){
									//ACTION GOES HERE
									e.setCancelled(true);
									e.getWhoClicked().closeInventory();
									clearChatHandler.clearChat(p);
								}
							}
							//CLEAR CHAT NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.NAME_TAG)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &c&lCLEAR CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//MUTE CHAT ACCESS
							if(e.getCurrentItem().getType().equals(Material.NAME_TAG)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("              &a&lMUTE CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									muteChatMenu.Menu(p);
								}
							}
							//MUTE CHAT NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.NAME_TAG)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("              &c&lMUTE CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//TPS UPDATE ACCESS
							if(e.getCurrentItem().getType().equals(Material.DISPENSER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &a&lTPS UPDATE"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									tpsUpdateHandler.update(p);
								}
							}
							//TPS UPDATE NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.DISPENSER)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &c&lTPS UPDATE"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//JUMPPAD ACCESS
							if(e.getCurrentItem().getType().equals(Material.IRON_PLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &a&lJUMP PADS"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									jumpPadHandler.update(p);
								}
							}
							//JUMPPAD NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.IRON_PLATE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &c&lJUMP PADS"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							if(e.getCurrentItem().getType().equals(Material.SKULL_ITEM)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("&5&lCharacter Information"))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//BUILDING ACCESS
							if(e.getCurrentItem().getType().equals(Material.WORKBENCH)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &a&lBUILDING"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									buildHandler.update(p);
								}
							}
							//BUILDING NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.WORKBENCH)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("             &c&lBUILDING"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//EXPLOSIONS ACCESS
							if(e.getCurrentItem().getType().equals(Material.TNT)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("            &a&lEXPLOSIONS"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									explosionHandler.update(p);
								}
							}
							//EXPLOSIONS NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.TNT)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("            &c&lEXPLOSIONS"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							
							
							//BORDER
							if(e.getCurrentItem().getType().equals(Material.STAINED_GLASS_PANE)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color(" "))){
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							
							
						}else{
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
						}
					}else{
						e.setCancelled(true);
						p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
					}
				}else{
					e.setCancelled(true);
				}
			}else{
				e.setCancelled(true);
			}
		}
	}

}
