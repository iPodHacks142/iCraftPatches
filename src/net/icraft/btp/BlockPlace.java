package net.icraft.btp;

import com.massivecraft.factions.listeners.FactionsListenerMain;
import com.massivecraft.mcore.ps.PS;
import java.util.List;
import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGH)
  public void onBlockPlace(BlockPlaceEvent event)
  {
    Player player = event.getPlayer();
    Block block = event.getBlock();
    int i = block.getTypeId();
    World world1 = block.getWorld();
    
    int yA = block.getY();
    int xA = block.getX();
    int zA = block.getZ();
    Block a1 = world1.getBlockAt(xA, yA - 1, zA);
    Block a2 = world1.getBlockAt(xA, yA - 2, zA);
    
    if ((a1.getTypeId() == 1567) || (a2.getTypeId() == 1567)){
    	event.setCancelled(true);
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "There must be at least a two block space above Koa Chests!");
    }
    
    if (i == 7)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);
      if ((c1.getTypeId() == 1038) || (c2.getTypeId() == 1038) || (c3.getTypeId() == 1038) || (c4.getTypeId() == 1038) || (c5.getTypeId() == 1038) || (c6.getTypeId() == 1038))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to move bedrock!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near a Block Teleporter!");
      }
    }
    if (i == 1038)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);
      if ((c1.getTypeId() == 7) || (c2.getTypeId() == 7) || (c3.getTypeId() == 7) || (c4.getTypeId() == 7) || (c5.getTypeId() == 7) || (c6.getTypeId() == 7))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to move bedrock!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near bedrock!");
      }
    }
    if (i == 1281)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);
      if ((c1.getTypeId() == 1058) || (c2.getTypeId() == 1058) || (c3.getTypeId() == 1058) || (c4.getTypeId() == 1058) || (c5.getTypeId() == 1058) || (c6.getTypeId() == 1058))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe power!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near Aluminium Wire!");
      }
    }
    if (i == 1058)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c1 = world.getBlockAt(x + 1, y, z);
      Block c2 = world.getBlockAt(x - 1, y, z);
      Block c3 = world.getBlockAt(x, y, z + 1);
      Block c4 = world.getBlockAt(x, y, z - 1);
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y - 1, z);
      if ((c1.getTypeId() == 10714) || (c2.getTypeId() == 10714) || (c3.getTypeId() == 10714) || (c4.getTypeId() == 10714) || (c5.getTypeId() == 10714) || (c6.getTypeId() == 10714))
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe power!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this near Energy Conduits!");
      }
    }
    if (i == 1971)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c6 = world.getBlockAt(x, y - 1, z);
      if (c6.getTypeId() == 1281)
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe liquid using fluiducts and tanks!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this above fluiducts!");
      }
    }
    if (i == 1281)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c5 = world.getBlockAt(x, y + 1, z);
      if (c5.getTypeId() == 1971)
      {
        event.setCancelled(true);
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to dupe liquid using fluiducts and tanks!", "tcd.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this below portable tanks!");
      }
    }
    if (i == 1567)
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
      World world = block.getWorld();
      
      Block c5 = world.getBlockAt(x, y + 1, z);
      Block c6 = world.getBlockAt(x, y + 2, z);
      if ((c5.getTypeId() != 0) || (c6.getTypeId() != 0))
      {
        event.setCancelled(true);
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "There must be at least a two block space above Koa Chests!");
      }
    }
    
    
    
    if ((main.nearclaim.contains(block.getTypeId() + ":" + block.getData())) || (main.nearclaim.contains(block.getTypeId() + ":*")))
    {
      int y = block.getY();
      int x = block.getX();
      int z = block.getZ();
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
        String player2 = event.getPlayer().getName();
        Bukkit.broadcast(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + player2 + " Tried to grief near a claim", "icp.notify");
        player.sendMessage(ChatColor.GOLD + "[iCraftPatches] " + ChatColor.RED + "You can't place this here! You are too close to a claim.");
      }
    }
    if ((main.helm.contains(block.getTypeId() + ":" + block.getData())) || (main.helm.contains(block.getTypeId() + ":*"))) {
      player.sendMessage(ChatColor.DARK_RED + "WARNING: " + ChatColor.DARK_RED + "If you dismount an airship while in a claim you will lose access to it.");
    }
    if ((main.sync.contains(block.getTypeId() + ":" + block.getData())) || (main.sync.contains(block.getTypeId() + ":*"))) {
      player.sendMessage(ChatColor.DARK_RED + "WARNING: " + ChatColor.DARK_RED + "The sync mod has been known to, on rare occasions, erase the inventory of clones. Please do not leave items in clone inventorys or you risk losing them.");
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
