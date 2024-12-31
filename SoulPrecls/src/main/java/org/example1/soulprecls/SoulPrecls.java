package org.example1.soulprecls;

import EnderFrame.EnderFrameItem;
import EnderFrame.EnderFrameListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import ru.leymooo.antirelog.Antirelog;
import ru.leymooo.antirelog.manager.PvPManager;
import sea.item;
import sea.listener;

import java.util.ArrayList;

public final class SoulPrecls extends JavaPlugin {

    public static SoulPrecls plugin;

    public static SoulPrecls getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        getCommand("pvesea").setExecutor(new item());
        getCommand("enderframe").setExecutor(new EnderFrameItem());
        getServer().getPluginManager().registerEvents(new listener(), this);
        getServer().getPluginManager().registerEvents(new EnderFrameListener(), this);
    }

    

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

