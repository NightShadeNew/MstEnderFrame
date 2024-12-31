package org.example1.soulprecls;

import EnderFrame.EnderFrameItem;
import EnderFrame.EnderFrameListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class SoulPrecls extends JavaPlugin {


    @Override
    public void onEnable() {

        getCommand("enderframe").setExecutor(new EnderFrameItem());
        getServer().getPluginManager().registerEvents(new EnderFrameListener(), this);
    }
}

