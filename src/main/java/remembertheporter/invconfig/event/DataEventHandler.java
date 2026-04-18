package remembertheporter.invconfig.event;

import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.OnDatapackSyncEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import remembertheporter.invconfig.TinyInv;
import remembertheporter.invconfig.data.attributes.AttributeDataManager;
import remembertheporter.invconfig.network.PacketManager;
import remembertheporter.invconfig.network.packets.SyncItemAttributeDataToClient;

@Mod.EventBusSubscriber(modid = TinyInv.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DataEventHandler {
    @SubscribeEvent
    public static void addReloadListener(AddReloadListenerEvent event) {
        event.addListener(AttributeDataManager.INSTANCE);
    }
    @SubscribeEvent
    public static void onDatapackSync(OnDatapackSyncEvent event) {
        if(event.getPlayer() != null){
            PacketManager.sendTo(PacketManager.syncItemAttributeData,new SyncItemAttributeDataToClient(), event.getPlayer());
        }
        else{
            event.getPlayerList().getPlayers()
                    .forEach(player -> PacketManager.sendTo(PacketManager.syncItemAttributeData,new SyncItemAttributeDataToClient(), player));
        }
    }
}
