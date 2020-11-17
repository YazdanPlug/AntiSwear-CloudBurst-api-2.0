package ir.yzplug.CB;

//import packages
import org.cloudburstmc.server.plugin.PluginBase;
import org.cloudburstmc.server.plugin.PluginManager;
import ir.yzplug.CB.events.playerChat;

//public class Main extends PluginBase
public class Main extends PluginBase {
	
	//@Override and public void onEnable
	@Override
	public void onEnable() {
		this.getLogger().info("Plugin AntiSwear enabled");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new playerChat(), this);
		super.onEnable();
	}
	//@Override and public void onDisable
	@Override
	public void onDisable() {
		this.getLogger().info("Plugin AntiSwear disabled");
		super.onDisable();
	}

}
