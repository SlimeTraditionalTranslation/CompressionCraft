package me.jasperchasetoq.compressioncraft;

import io.github.bakedlibs.dough.updater.GitHubBuildsUpdater;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import me.jasperchasetoq.compressioncraft.setup.CompressionCraftItemsSetup;

//import org.bstats.bukkit.Metrics;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class CompressionCraft extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        CompressionCraftItemsSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("EFI - ")) {
            new GitHubBuildsUpdater(this, getFile(), "SlimeTraditionalTranslation/CompressionCraft/master").start();

            //int pluginId = 15648; // <-- Replace with the id of your plugin!
            //Metrics metrics = new Metrics(this, pluginId);
        }
    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }
    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimeTraditionalTranslation/CompressionCraft/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static CompressionCraft instance;

  public CompressionCraft() {
            instance = this;
        }

        public static CompressionCraft getInstance() {
            return instance;
        }
    public static String getVersion() {
        return instance.getDescription().getVersion();
    }
    }

