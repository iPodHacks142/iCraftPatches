package net.icraft.btp;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


@SuppressWarnings("deprecation")
public class ChatListener 
  implements Listener {

	@SuppressWarnings({ "null" })
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerChat(AsyncPlayerChatEvent chat){
		Player player = (Player)chat.getPlayer();
		String message = chat.getMessage();
		if (message.startsWith("!")){
			chat.setCancelled(true);
			player.sendMessage(ChatColor.DARK_RED + "You cannot start messages with '!'"); return;
		}
	}

}
