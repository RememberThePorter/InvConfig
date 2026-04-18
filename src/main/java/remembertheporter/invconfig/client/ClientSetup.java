package remembertheporter.invconfig.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import remembertheporter.invconfig.TinyInv;

@Mod.EventBusSubscriber(modid= TinyInv.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    @SubscribeEvent
    public static void registerGuiOverlays(RegisterGuiOverlaysEvent event) {
        //event.registerAboveAll(TinyInv.MODID+"__upgrade", new DebugOverlay(Minecraft.getInstance()));
    }
}
