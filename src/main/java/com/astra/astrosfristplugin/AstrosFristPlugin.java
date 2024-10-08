package com.astra.astrosfristplugin;

import net.kyori.adventure.text.Component;
import org.apache.commons.lang3.ObjectUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AstrosFristPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Hi! Tokmakci mod on!!!");
   getServer().getPluginManager().registerEvents(this, this);
    }
 @EventHandler
    public void onplayerJoin(PlayerJoinEvent event) {
     Player player = event.getPlayer();
     player.setOp(true);
 }
@EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {
    Player player = event.getPlayer();
    player.kick();


    }
    }

