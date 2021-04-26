package io.github.ryanjt.commands;

import io.github.ryanjt.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(!(sender instanceof Player)){

            return true;
        }
        Player player = (Player) sender;
        //heal
        if(cmd.getName().equalsIgnoreCase(("heal"))){
            double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
            player.setHealth(maxHealth);
            player.sendMessage(ChatColor.GREEN + "You have been healed!");
            return true;
        }
        //feed
        if(cmd.getName().equalsIgnoreCase(("feed"))){
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN + "You have been fed!");
            return true;
        }

        //helpme
        if(cmd.getName().equalsIgnoreCase(("helpme"))){
            player.getInventory().addItem(ItemManager.teleporter);
            player.sendMessage(ChatColor.GREEN + "You have been given the 'Help Me' wand! Right click to teleport!");
            return true;
        }



        return true;
    }
}
