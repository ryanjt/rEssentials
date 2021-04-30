package io.github.ryanjt.events;

import io.github.ryanjt.rEssentials;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import static org.bukkit.event.block.Action.RIGHT_CLICK_AIR;
import static org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;


public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to the server! <3");
    }

    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event){
        Player player = event.getPlayer();

        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer data = meta.getPersistentDataContainer();

        if(data.has(new NamespacedKey(rEssentials.getPlugin(), "message"), PersistentDataType.STRING)){
            if(data.get(new NamespacedKey(rEssentials.getPlugin(), "message"), PersistentDataType.STRING).equalsIgnoreCase("Helpme Wand")){
                if(event.getAction().equals(RIGHT_CLICK_AIR) || event.getAction().equals(RIGHT_CLICK_BLOCK)){
                    Location loc = new Location(Bukkit.getWorld("world"), -776.997, 80, -353.019);
                    player.teleport(loc);
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "A magical force teleports you back home!");
                }
            }
        }




    }






}
