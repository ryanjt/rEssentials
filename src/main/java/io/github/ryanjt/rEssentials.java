package io.github.ryanjt;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
public class rEssentials extends JavaPlugin{
    @Override
    public void onDisable() {
        // Don't log disabling, Spigot does that for you automatically!
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[rEssentials]: Plugin is disabled!");
    }

    @Override
    public void onEnable() {
        // Don't log enabling, Spigot does that for you automatically!

        // Commands enabled with following method must have entries in plugin.yml
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[rEssentials]: Plugin is enabled!");


    }

}
