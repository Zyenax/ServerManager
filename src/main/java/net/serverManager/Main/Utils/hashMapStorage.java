package net.serverManager.Main.Utils;

import java.util.HashMap;

import net.serverManager.Main.main;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class hashMapStorage implements Listener{
	
	@SuppressWarnings("unused")
	private main plugin;
	public hashMapStorage(main listener) {
		this.plugin = listener;		
	}
	
	public static HashMap<String, String> chatMuted = new HashMap<String, String>();
	public static HashMap<Player, String> tpsUpdate = new HashMap<Player, String>();
	public static HashMap<String, Integer> PlayerCount = new HashMap<String, Integer>();
	public static HashMap<String, String> jumpPad = new HashMap<String, String>();
	public static HashMap<String, String> building = new HashMap<String, String>();
	public static HashMap<String, String> explosions = new HashMap<String, String>();
	
}
