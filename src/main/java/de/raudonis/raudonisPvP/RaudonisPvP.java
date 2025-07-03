package de.raudonis.raudonisPvP;

import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RaudonisPvP extends JavaPlugin {

    public static final Logger LOGGER = LoggerFactory.getLogger("RaudonisPvP");

    @Override
    public void onEnable() {
        LOGGER.info("Starting RaudonisPvP...");
        LOGGER.info("Started RaudonisPvP!");
    }

    @Override
    public void onDisable() {

    }
}
