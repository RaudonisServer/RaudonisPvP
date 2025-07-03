package de.raudonis.raudonisPvP.events;

import org.bukkit.*;
import org.bukkit.block.Vault;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Objects;

public class PlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        Location arena = new Location(Bukkit.getWorlds().getFirst(), 1500, -60, 1500);
        e.setShouldDropExperience(false);
        if (Objects.requireNonNull(e.getPlayer().getLastDeathLocation()).distance(arena) < 413) {
           //TODO
        }
    }
}
