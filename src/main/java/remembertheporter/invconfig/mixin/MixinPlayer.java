package remembertheporter.invconfig.mixin;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import remembertheporter.invconfig.init.ModAttributes;
import remembertheporter.invconfig.init.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public class MixinPlayer {
    @Inject(at = @At("RETURN"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes(CallbackInfoReturnable<AttributeSupplier.Builder> cir) {
        cir.setReturnValue(cir.getReturnValue()
                .add(ModAttributes.SLOTS.get())
                .add(ModAttributes.HOTBAR_SLOTS.get())
                .add(ModAttributes.SLOT_0.get())
                .add(ModAttributes.SLOT_1.get())
                .add(ModAttributes.SLOT_2.get())
                .add(ModAttributes.SLOT_3.get())
                .add(ModAttributes.SLOT_4.get())
                .add(ModAttributes.SLOT_5.get())
                .add(ModAttributes.SLOT_6.get())
                .add(ModAttributes.SLOT_7.get())
                .add(ModAttributes.SLOT_8.get())
                .add(ModAttributes.SLOT_9.get())
                .add(ModAttributes.SLOT_10.get())
                .add(ModAttributes.SLOT_11.get())
                .add(ModAttributes.SLOT_12.get())
                .add(ModAttributes.SLOT_13.get())
                .add(ModAttributes.SLOT_14.get())
                .add(ModAttributes.SLOT_15.get())
                .add(ModAttributes.SLOT_16.get())
                .add(ModAttributes.SLOT_17.get())
                .add(ModAttributes.SLOT_18.get())
                .add(ModAttributes.SLOT_19.get())
                .add(ModAttributes.SLOT_20.get())
                .add(ModAttributes.SLOT_21.get())
                .add(ModAttributes.SLOT_22.get())
                .add(ModAttributes.SLOT_23.get())
                .add(ModAttributes.SLOT_24.get())
                .add(ModAttributes.SLOT_25.get())
                .add(ModAttributes.SLOT_26.get())
                .add(ModAttributes.SLOT_27.get())
                .add(ModAttributes.SLOT_28.get())
                .add(ModAttributes.SLOT_29.get())
                .add(ModAttributes.SLOT_30.get())
                .add(ModAttributes.SLOT_31.get())
                .add(ModAttributes.SLOT_32.get())
                .add(ModAttributes.SLOT_33.get())
                .add(ModAttributes.SLOT_34.get())
                .add(ModAttributes.SLOT_35.get())
                .add(ModAttributes.OFFHAND_SLOT.get())
                .add(ModAttributes.HEAD_SLOT.get())
                .add(ModAttributes.CHEST_SLOT.get())
                .add(ModAttributes.LEGS_SLOT.get())
                .add(ModAttributes.FEET_SLOT.get())
                .add(ModAttributes.CRAFT_TOP_LEFT_SLOT.get())
                .add(ModAttributes.CRAFT_TOP_RIGHT_SLOT.get())
                .add(ModAttributes.CRAFT_BOTTOM_LEFT_SLOT.get())
                .add(ModAttributes.CRAFT_BOTTOM_RIGHT_SLOT.get())
        );
    }

    @Inject(at = @At("RETURN"), method = "getItemBySlot(Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItemBySlot(EquipmentSlot slot, CallbackInfoReturnable<ItemStack> cir) {
        if (slot == EquipmentSlot.OFFHAND && cir.getReturnValue().is(ModItems.FAKE_ITEM.get())) {
            cir.setReturnValue(ItemStack.EMPTY);
        }
    }
}
