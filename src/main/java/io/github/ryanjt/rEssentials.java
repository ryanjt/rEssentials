package io.github.ryanjt;
import io.github.ryanjt.commands.Commands;
import io.github.ryanjt.events.Events;
import io.github.ryanjt.items.ItemManager;
import org.bukkit.ChatColor;

import org.bukkit.plugin.java.JavaPlugin;
public class rEssentials extends JavaPlugin{
    private static rEssentials plugin;

    public static rEssentials getPlugin(){
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        ItemManager.init();
        Commands executor = new Commands();
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("heal").setExecutor(executor);
        getCommand("feed").setExecutor(executor);
        getCommand("helpme").setExecutor(executor);
        getCommand("tools").setExecutor(executor);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[rEssentials]: Plugin is enabled!");


    }

    @Override
    public void onDisable() {


        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[rEssentials]: Plugin is disabled!");
    }


}
