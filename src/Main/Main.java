package iR.yzplug.AS;

import org.cloudburstmc.server.event.Listener;
import org.cloudburstmc.server.event.player.PlayerChatEvent;
import org.cloudburstmc.server.event.server.ServerInitializationEvent;
import org.cloudburstmc.server.player.Player;
import org.cloudburstmc.server.plugin.Plugin;
import org.cloudburstmc.server.utils.TextFormat;

@Plugin(id = "AntiSwear", version = "1.1", description = "the players cant swearing in server CloudBurst", authors = "YazdanPlug")
public class AntiSwear {
	
	@Listener
	public void onServerInitialization(ServerInitializationEvent event) {
	    
	}
	@Listener
	public void onPlayerChat(PlayerChatEvent event){
		Player player = event.getPlayer();
		if (event.getMessage().toLowerCase().contains("fuck")){
			event.setCancelled(true);
			player.sendMessage(TextFormat.RED + "You cant swearing in this server. you saying "+TextFormat.YELLOW+"[ fuck ]");
		}
		if (event.getMessage().toLowerCase().contains("dick")){
			event.setCancelled(true);
			player.sendMessage(TextFormat.RED + "You cant swearing in this server. you saying "+TextFormat.YELLOW+"[ dick ]");
		}
		if (event.getMessage().toLowerCase().contains("sex")){
			event.setCancelled(true);
			player.sendMessage(TextFormat.RED + "You cant swearing in this server. you saying "+TextFormat.YELLOW+"[ sex ]");
		}
		if (event.getMessage().toLowerCase().contains("xxnx")){
			event.setCancelled(true);
			player.sendMessage(TextFormat.RED + "You cant swearing in this server. you saying "+TextFormat.YELLOW+"[ xxnx ]");
		}
		if (event.getMessage().toLowerCase().contains("poup")){
			event.setCancelled(true);
			player.sendMessage(TextFormat.RED + "You cant swearing in this server. you saying "+TextFormat.YELLOW+"[ poup ]");
		}
	}
}
