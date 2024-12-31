package EnderFrame;

import EnderFrame.EnderFrameItem;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class EnderFrameListener implements Listener {

    @EventHandler
    public void onFramePlace(BlockPlaceEvent event) {
        ItemStack enderFrame = EnderFrameItem.getEnder();
        Player player = event.getPlayer();
        ItemStack inHand = player.getItemInHand();

        if (inHand.isSimilar(enderFrame)) {
            inHand.setAmount(inHand.getAmount() - 1);
            player.sendMessage("§aВы успешно разместили Энд Портал!");

            Block placeBlock = event.getBlock();
            World world = player.getWorld();
            Location spawnLocation = placeBlock.getLocation();

            world.getBlockAt(spawnLocation).setType(Material.END_PORTAL);
        }
    }
}
