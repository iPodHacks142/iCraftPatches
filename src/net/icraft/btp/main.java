package net.icraft.btp;

import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main
  extends JavaPlugin
{
  Logger log = Logger.getLogger("Minecraft");
  public static List<String> itemids;
  public static List<String> itemids3;
  public static List<String> click;
  public static List<String> nearclaim;
  public static List<String> hammerid;
  public static List<String> helm;
  public static List<String> handid;
  public static List<String> confc;
  public static List<String> sync;
  public static List<String> guns;
  
  public ChatListener playerListener;
  
  public void onDisable()
  {
    this.log.info("|=================================|");
    this.log.info("|     Created by iPodHacks142     |");
    this.log.info("|             And Lee             |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|          iCraftPatches          |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|      --==  Disabled  ==--       |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|              v1.0               |");
    this.log.info("|=================================|");
  }
  
  public void onEnable()
  {
    this.log.info("|=================================|");
    this.log.info("|     Created by iPodHacks142     |");
    this.log.info("|             And Lee             |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|          iCraftPatches          |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|       --==  Enabled  ==--       |");
    this.log.info("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
    this.log.info("|               v1.0              |");
    this.log.info("|=================================|");
    
    saveDefaultConfig();
    itemids = getConfig().getStringList("RightClickBlockInClaim");
    itemids3 = getConfig().getStringList("ClickAroundClaim");
    click = getConfig().getStringList("AirclickWorld");
    nearclaim = getConfig().getStringList("PlaceNearClaim");
    hammerid = getConfig().getStringList("HammerID");
    helm = getConfig().getStringList("HelmID");
    handid = getConfig().getStringList("WitchesHandID");
    confc = getConfig().getStringList("ConfiscateInClaim");
    sync = getConfig().getStringList("SyncWarning");
    guns = getConfig().getStringList("Guns");
    
    getServer().getPluginManager().registerEvents(new BlockPlace(), this);
    getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
    getServer().getPluginManager().registerEvents((Listener) new ChatListener(), this);
  }
}
