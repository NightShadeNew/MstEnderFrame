package EnderFrame;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ru.leymooo.antirelog.event.PvpStartedEvent;

import java.util.ArrayList;

public class EnderFrameItem implements CommandExecutor {
    public static ItemStack getEnder() {
        return ender;
    }

    private static ItemStack ender;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            Inventory inventory = player.getInventory();


            ender = new ItemStack(Material.END_PORTAL_FRAME);
            ItemMeta meta = ender.getItemMeta();
            meta.setDisplayName("§x§F§F§7§8§F§C❰§x§F§8§7§8§F§C❰§x§F§1§7§8§F§DР§x§E§A§7§7§F§Dа§x§E§3§7§7§F§Dм§x§D§C§7§7§F§Dк§x§D§6§7§7§F§Eа §x§C§8§7§7§F§Eп§x§C§1§7§6§F§Eо§x§B§A§7§6§F§Fр§x§B§3§7§6§F§Fт§x§B§A§7§6§F§Fа§x§C§1§7§6§F§Eл§x§C§8§7§7§F§Eа §x§D§6§7§7§F§Eв §x§E§3§7§7§F§Dэ§x§E§A§7§7§F§Dн§x§F§1§7§8§F§Dд§x§F§8§7§8§F§C❱§x§F§F§7§8§F§C❱");
            ArrayList<String> lore = new ArrayList<String>();
            lore.add("§x§F§C§F§F§0§0╔ §fПри размещении создает §x§F§F§7§8§F§Cэ§x§F§2§7§8§F§Dн§x§E§6§7§7§F§Dд§x§D§9§7§7§F§Eе§x§C§C§7§7§F§Eр §x§B§3§7§6§F§Fп§x§C§2§7§6§F§Eо§x§D§1§7§7§F§Eр§x§E§1§7§7§F§Dт§x§F§0§7§8§F§Dа§x§F§F§7§8§F§Cл");
            lore.add("§x§F§C§F§F§0§0╚ §fИспользование §e1");
            meta.setLore(lore);
            ender.setItemMeta(meta);

            inventory.addItem(ender);

        }
        return true;
    }
}
