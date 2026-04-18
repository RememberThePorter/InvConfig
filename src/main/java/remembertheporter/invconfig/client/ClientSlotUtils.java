package remembertheporter.invconfig.client;

import com.mojang.blaze3d.platform.Window;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import remembertheporter.invconfig.config.ClientConfig;
import remembertheporter.invconfig.world.entity.player.PlayerSlots;

import java.util.ArrayList;

public class ClientSlotUtils {

    public static int getHotbarRows(Window window){
        Player player = Minecraft.getInstance().player;
        int slots = PlayerSlots.getHotbarSlots(player);
        if(slots <= 0){
            return 1;
        }
        int maxRowLength = ClientConfig.maxSlotsInHotbarRow.get() == 0 ? window.getScreenWidth() / 21 : ClientConfig.maxSlotsInHotbarRow.get();
        return (int) Math.ceil((float) slots / maxRowLength);
    }

    public static ArrayList<Integer> getHotbarSlots(){
        ArrayList<Integer> activeHotbarSlots = new ArrayList<>();
        Entity camera = Minecraft.getInstance().getCameraEntity();
        if(camera == Minecraft.getInstance().player){
            Player player = Minecraft.getInstance().player;
            if(!player.isSpectator()){
                if(PlayerSlots.getSlot0(player)) activeHotbarSlots.add(0);
                if(PlayerSlots.getSlot1(player)) activeHotbarSlots.add(1);
                if(PlayerSlots.getSlot2(player)) activeHotbarSlots.add(2);
                if(PlayerSlots.getSlot3(player)) activeHotbarSlots.add(3);
                if(PlayerSlots.getSlot4(player)) activeHotbarSlots.add(4);
                if(PlayerSlots.getSlot5(player)) activeHotbarSlots.add(5);
                if(PlayerSlots.getSlot6(player)) activeHotbarSlots.add(6);
                if(PlayerSlots.getSlot7(player)) activeHotbarSlots.add(7);
                if(PlayerSlots.getSlot8(player)) activeHotbarSlots.add(8);
                return activeHotbarSlots;
            }
        }
        else{
            if(camera instanceof Player player){
                if(PlayerSlots.getSlot0(player)) activeHotbarSlots.add(0);
                if(PlayerSlots.getSlot1(player)) activeHotbarSlots.add(1);
                if(PlayerSlots.getSlot2(player)) activeHotbarSlots.add(2);
                if(PlayerSlots.getSlot3(player)) activeHotbarSlots.add(3);
                if(PlayerSlots.getSlot4(player)) activeHotbarSlots.add(4);
                if(PlayerSlots.getSlot5(player)) activeHotbarSlots.add(5);
                if(PlayerSlots.getSlot6(player)) activeHotbarSlots.add(6);
                if(PlayerSlots.getSlot7(player)) activeHotbarSlots.add(7);
                if(PlayerSlots.getSlot8(player)) activeHotbarSlots.add(8);
                return activeHotbarSlots;
            }
        }
        activeHotbarSlots.add(0);
        activeHotbarSlots.add(1);
        activeHotbarSlots.add(2);
        activeHotbarSlots.add(3);
        activeHotbarSlots.add(4);
        activeHotbarSlots.add(5);
        activeHotbarSlots.add(6);
        activeHotbarSlots.add(7);
        activeHotbarSlots.add(8);
        return activeHotbarSlots;
    }
}
