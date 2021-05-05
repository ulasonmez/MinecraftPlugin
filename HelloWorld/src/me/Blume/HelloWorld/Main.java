package me.Blume.HelloWorld;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if(label.equals("reset")) {
			if(sender instanceof Player) {
				
				if(args.length== 0) {
					player.setHealth(20.0);
					player.setFoodLevel(24);
					player.sendMessage(ChatColor.YELLOW+"Saglik yenilendi");
					return true;
				}
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if(target==null) {
				player.sendMessage(ChatColor.RED+"Boyle bir oyuncu yok");				}
				return true;
			}
	
			else {
				sender.sendMessage(ChatColor.RED+"Sadece oyuncular can yenileyebilir");
				return true;
			}
		}
		
		
		return false;
	}
	
}

