package net.icraft.btp;

import com.massivecraft.factions.listeners.FactionsListenerMain;
import com.massivecraft.mcore.ps.PS;

import java.util.List;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import net.minecraft.server.v1_5_R3.Material;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteract
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGH)
  public void onPlayerInteract(PlayerInteractEvent event)
  {
    Player player = event.getPlayer();
    if (((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR)) && 
      (main.hammerid.contains(String.valueOf(player.getItemInHand().getTypeId()))))
    {
      Block block = event.getClickedBlock();
      PS block2 = PS.valueOf(block);
      if ((!checkBlock(player, block)) || (!checkBlockF(player, block2)))
      {
        if (player.getItemInHand().getTypeId() == 7583)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Hammer confiscated! Do not try to use this in claimed land again.");
        }
        if (player.getItemInHand().getTypeId() == 7805)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Witches Hand confiscated! Do not try to use this in claimed land again.");
        }
        if (player.getItemInHand().getTypeId() == 7783)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Chalk confiscated! Do not try to use this in claimed land again.");
        }
        if (player.getItemInHand().getTypeId() == 7784)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Chalk confiscated! Do not try to use this in claimed land again.");
        }
        if (player.getItemInHand().getTypeId() == 7785)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Chalk confiscated! Do not try to use this in claimed land again.");
        }
        if (player.getItemInHand().getTypeId() == 7786)
        {
          player.setItemInHand(null);
          event.setCancelled(true);
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Chalk confiscated! Do not try to use this in claimed land again.");
        }
      }
    }
    
    if (((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR)) && 
    	      (main.guns.contains(String.valueOf(player.getItemInHand().getTypeId()))))
    	    {
    	      Block block = event.getClickedBlock();
    	      PS block2 = PS.valueOf(block);
    	      if ((!checkBlock(player, block)) || (!checkBlockF(player, block2)))
    	      {
    	    	  
    	      }
    	    }
    
    if (event.getAction() == Action.RIGHT_CLICK_BLOCK){
      if (main.itemids.contains(String.valueOf(player.getItemInHand().getTypeId())))
      {
        Block block = event.getClickedBlock();
        PS block2 = PS.valueOf(block);
        if ((!checkBlock(player, block)) || (!checkBlockF(player, block2)))
        {
          player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't use this item in a claim.");
          event.setCancelled(true);
        }
        if ((!checkBlock(player, block)) || (!checkBlockF(player, block2))) {
          event.setCancelled(true);
        }
      }
//      else if (player.getItemInHand().getType().equals(Material.AIR)) {
//      	if (player.getInventory().getChestplate().getTypeId() == 2352){
//      		Block block = event.getClickedBlock();
//              PS block2 = PS.valueOf(block);
//              if ((!checkBlock(player, block)) || (!checkBlockF(player, block2)))
//              {
//                player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place backpacks here.");
//                event.setCancelled(true);
//              }
//              //block backpacks being placed in claims - DOESN'T WORK (get item in hand broken)
//      	}
//     }
    }  
    
    if (((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR)) && main.itemids3.contains(String.valueOf(player.getItemInHand().getTypeId())))
    {
      Location block = player.getLocation();
      int y = block.getBlockY();
      int x = block.getBlockX();
      int z = block.getBlockZ();
      World world = block.getWorld();
      Block c9 = world.getBlockAt(x, y, z);
      Block c1 = world.getBlockAt(x + 11, y, z);
      Block c2 = world.getBlockAt(x - 11, y, z);
      Block c3 = world.getBlockAt(x, y, z + 11);
      Block c4 = world.getBlockAt(x, y, z - 11);
      Block c5 = world.getBlockAt(x + 11, y, z + 11);
      Block c6 = world.getBlockAt(x + 11, y, z - 11);
      Block c7 = world.getBlockAt(x - 11, y, z + 11);
      Block c8 = world.getBlockAt(x - 11, y, z - 11);
      PS f9 = PS.valueOf(x, z);
      PS f1 = PS.valueOf(x + 1, z);
      PS f2 = PS.valueOf(x - 1, z);
      PS f3 = PS.valueOf(x, z + 1);
      PS f4 = PS.valueOf(x, z - 1);
      PS f5 = PS.valueOf(x + 1, z + 1);
      PS f6 = PS.valueOf(x + 1, z - 1);
      PS f7 = PS.valueOf(x - 1, z + 1);
      PS f8 = PS.valueOf(x - 1, z - 1);
      boolean check = false;
      if ((!checkBlock(player, c1)) || (!checkBlockF(player, f1))) {
        check = true;
      }
      if ((!checkBlock(player, c2)) || (!checkBlockF(player, f2))) {
        check = true;
      }
      if ((!checkBlock(player, c3)) || (!checkBlockF(player, f3))) {
        check = true;
      }
      if ((!checkBlock(player, c4)) || (!checkBlockF(player, f4))) {
        check = true;
      }
      if ((!checkBlock(player, c5)) || (!checkBlockF(player, f5))) {
        check = true;
      }
      if ((!checkBlock(player, c6)) || (!checkBlockF(player, f6))) {
        check = true;
      }
      if ((!checkBlock(player, c7)) || (!checkBlockF(player, f7))) {
        check = true;
      }
      if ((!checkBlock(player, c8)) || (!checkBlockF(player, f8))) {
        check = true;
      }
      if ((!checkBlock(player, c9)) || (!checkBlockF(player, f9))) {
        check = true;
      }
      if (check)
      {
        event.setCancelled(true);
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "Item used too close to a claim.");
      }
    }
    else if (event.getAction() == Action.RIGHT_CLICK_AIR)
    {
      if (main.click.contains(String.valueOf(player.getItemInHand().getTypeId()))) {
        event.setCancelled(true);
      }
    }
  }
  
  private boolean checkBlockF(Player player, PS block)
  {
    return FactionsListenerMain.canPlayerBuildAt(player, block, true);
  }
  
  private boolean checkBlock(Player player, Block block)
  {
    String c = GriefPrevention.instance.allowBreak(player, block.getLocation());
    if (c != null) {
      return false;
    }
    return true;
  }
}
