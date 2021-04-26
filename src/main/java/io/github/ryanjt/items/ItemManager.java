package io.github.ryanjt.items;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack teleporter;

    public static void init(){
    createTeleporter();
    }

    private static void createTeleporter(){
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        final TextComponent title = Component.text("I'm lost")
                .color(NamedTextColor.LIGHT_PURPLE)
                .decoration(TextDecoration.BOLD, true);
        final TextComponent lore1 = Component.text("Erin's help me wand. Right click to teleport when lost!");
        List<Component> lore = new ArrayList<>();
        lore.add(lore1);
        meta.lore(lore);
        meta.displayName(title);
        item.setItemMeta(meta);
        teleporter = item;


    }
}
