package ir.yzplug.CB.events;

//import packages
import org.cloudburstmc.server.event.EventHandler;
import org.cloudburstmc.server.event.Listener;
import org.cloudburstmc.server.event.player.PlayerChatEvent;
import org.cloudburstmc.server.player.Player;
import org.cloudburstmc.server.utils.TextFormat;

//public class playerChat implements Listener
public class playerChat implements Listener {
	
	//@EventHandler and public void playerChat
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e) {
		if(e.getMessage().toLowerCase().contains("fuck")) {
		e.setCancelled(true);
		Player player = e.getPlayer();
		player.sendMessage(TextFormat.RED + "Please dont swearing");
		}
		if(e.getMessage().toLowerCase().contains("dick")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please dont swearing");
			}
		if(e.getMessage().toLowerCase().contains("sex")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please dont swearing");
			}
		if(e.getMessage().toLowerCase().contains("xxnx")) {  
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please dont swearing");
			}
	}

}
