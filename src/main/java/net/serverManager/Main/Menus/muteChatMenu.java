package net.serverManager.Main.Menus;

import java.util.Arrays;

import net.serverManager.Main.main;
import net.serverManager.Main.Handlers.muteChatHandler;
import net.serverManager.Main.Messages.serverManager;
import net.serverManager.Main.Utils.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class muteChatMenu implements Listener{
	
	public static Inventory inv;
	
	@SuppressWarnings("unused")
	private main plugin;
	public muteChatMenu(main listener) {
		this.plugin = listener;	
	}
	
	public static void Menu(Player p){
		inv = Bukkit.createInventory(null, 45, util.color(serverManager.managerColor + "Mute Chat Menu"));
		Border();
		chatMute(p);
		chatUnMute(p);
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
	
	public static void chatMute(Player p){
		if(p.hasPermission("servermanager.mutechat")){
			ItemStack item = util.createItem(Material.STAINED_CLAY, 1, 5, util.color("              &a&lMUTE CHAT"), Arrays.asList(util.color(" "), util.color("        &7Mutes the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(20, item);
		}else {
			ItemStack item = util.createItem(Material.STAINED_CLAY, 1, 14, util.color("              &c&lMUTE CHAT"), Arrays.asList(util.color(" "), util.color("        &7Mutes the chat of the"), util.color("&7server from spammers and other"), util.color("         &7malicious messages!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(20, item);
		}
	}
	
	public static void chatUnMute(Player p){
		if(p.hasPermission("servermanager.mutechat")){
			ItemStack item = util.createItem(Material.STAINED_CLAY, 1, 14, util.color("            &a&lUNMUTE CHAT"), Arrays.asList(util.color(" "), util.color("      &7Unmutes the chat of the"), util.color(" &7server and lets players have"), util.color("        &7the joy to talk again!"), util.color(" "), util.color("               &a&lACCESS ✔"), util.color("           &8Click to activate")));
			inv.setItem(24, item);
		}else {
			ItemStack item = util.createItem(Material.STAINED_CLAY, 1, 14, util.color("            &c&lUNMUTE CHAT"), Arrays.asList(util.color(" "), util.color("      &7Unmutes the chat of the"), util.color(" &7server and lets players have"), util.color("        &7the joy to talk again!"), util.color(" "), util.color("               &c&lACCESS ✘"), util.color("           &8Click to activate")));
			inv.setItem(24, item);
		}
	}
	
	
	@EventHandler
	public void menuClickEvent(InventoryClickEvent e){
		final Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().equals(util.color(serverManager.managerColor + "Mute Chat Menu"))){
			e.setCancelled(true);
			if(e.getWhoClicked() instanceof Player){
				if(!(e.getInventory() == null)){
					if(!(e.getCurrentItem() == null)){
						if(!(e.getCurrentItem().getType() == Material.AIR)){
							
							
							//MUTE CHAT ACCESS
							if(e.getCurrentItem().getType().equals(Material.STAINED_CLAY)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("              &a&lMUTE CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									muteChatHandler.muteChat(p);
								}
							}
							//MUTE CHAT NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.STAINED_CLAY)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("              &c&lMUTE CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									p.sendMessage(serverManager.noAccess);
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SHOOT, Integer.MAX_VALUE, Integer.MAX_VALUE);
								}
							}
							
							//UNMUTE CHAT ACCESS
							if(e.getCurrentItem().getType().equals(Material.STAINED_CLAY)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("            &a&lUNMUTE CHAT"))){
									//ACTION GOES HERE
									e.getWhoClicked().closeInventory();
									e.setCancelled(true);
									p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, Integer.MAX_VALUE, Integer.MAX_VALUE);
									muteChatHandler.unMuteChat(p);
								}
							}
							//UNMUTE CHAT NO ACCESS
							if(e.getCurrentItem().getType().equals(Material.STAINED_CLAY)){
								if(e.getCurrentItem().getItemMeta().getDisplayName().equals(util.color("            &c&lUNMUTE CHAT"))){
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
