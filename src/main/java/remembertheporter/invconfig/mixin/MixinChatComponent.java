package remembertheporter.invconfig.mixin;

import net.minecraft.client.gui.components.ChatComponent;
import remembertheporter.invconfig.client.event.ClientEventHandler;
import remembertheporter.invconfig.client.gui.InGameOverlayHelper;
import remembertheporter.invconfig.config.ClientConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatComponent.class)
public class MixinChatComponent {
    @Inject(at = @At("RETURN"), method = "getHeight()I", cancellable = true)
    private void createAttributes(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(cir.getReturnValue() - (ClientConfig.transformChat.get() ? ((InGameOverlayHelper.HOTBAR_SLOT_HEIGHT - 1) * (ClientEventHandler.getRows())) : 0));
    }
}
