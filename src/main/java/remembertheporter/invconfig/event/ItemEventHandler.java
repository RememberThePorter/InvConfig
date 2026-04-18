package remembertheporter.invconfig.event;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import remembertheporter.invconfig.data.attributes.AttributeDataManager;

@Mod.EventBusSubscriber
public class ItemEventHandler {

    @SubscribeEvent
    public static void onItemAttributeModifier(ItemAttributeModifierEvent event){
        ItemStack stack = event.getItemStack();
        AttributeDataManager.INSTANCE.itemModifiers(stack.getItem(), event.getSlotType()).forEach(
            (attribute, attributeModifiers) -> attributeModifiers.forEach(attributeModifier -> event.addModifier(attribute, attributeModifier))
        );
    }
}
