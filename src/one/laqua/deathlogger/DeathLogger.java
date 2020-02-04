package one.laqua.deathlogger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathLogger extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location playerLoc = player.getLocation();

        System.out.println(player.getName() + " died: " + event.getDeathMessage() + " #XPlost=" + event.getDroppedExp() + " @[" + playerLoc.getBlockX() + "," + playerLoc.getBlockY() + "," + playerLoc.getBlockZ() + "]");
    }
}
