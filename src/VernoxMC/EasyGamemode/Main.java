package src.VernoxMC.EasyGamemode;

import java.util.*;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
    public class Main extends PluginBase {


        public void onEnable() {

            this.getLogger().info(TextFormat.GREEN + "EasyGamemode Enabled");

        }

        public void onDisable() {

            this.getLogger().info(TextFormat.RED + "EasygGamemode Disabled!");

        }


        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            {
                switch (cmd.getName()) {

                    case "gmc":
                        if(!sender.hasPermission("gmc.comamnd")){
                            sender.sendMessage(TextFormat.RED + "You do not have permission too use this command");
                            break;
                        }

                        Player player = sender.getServer().getPlayer(sender.getName());
                        if (!(sender instanceof Player)) {
                            sender.sendMessage(TextFormat.RED + "This command can only be ran ingame!");
                            break;
                        }

                        player.setGamemode(1);
                        sender.sendMessage(TextFormat.GREEN + "[EasyGamemode] You are now in Creative Mode!");
                        break;
                    case "gms":
                        if(!sender.hasPermission("gms.comamnd")){
                            sender.sendMessage(TextFormat.RED + "You do not have permission too use this command");
                            break;
                        }
                        Player player0 = sender.getServer().getPlayer(sender.getName());
                        if (!(sender instanceof Player)) {
                            sender.sendMessage(TextFormat.RED + "This command can only be ran ingame!");
                            break;
                        }

                        player0.setGamemode(0);
                        sender.sendMessage(TextFormat.GREEN + "[EasyGamemode] You are now in Survival Mode!");
                        break;
                    case "gmspc":
                        if(!sender.hasPermission("gmspc.comamnd")){
                            sender.sendMessage(TextFormat.RED + "You do not have permission too use this command");
                            break;
                        }
                        Player player3 = sender.getServer().getPlayer(sender.getName());
                        if (!(sender instanceof Player)) {
                            sender.sendMessage(TextFormat.RED + "This command can only be ran ingame!");
                            break;
                        }

                        player3.setGamemode(3);
                        sender.sendMessage(TextFormat.GREEN + "[EasyGamemode] You are now in Spectator Mode!");
                        break;
                }

                return true;

            }
        }
    }

