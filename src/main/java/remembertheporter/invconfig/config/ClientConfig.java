package remembertheporter.invconfig.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.common.ForgeConfigSpec.EnumValue;


public class ClientConfig {
    public static BooleanValue disabledSlotOverlay;
    public static IntValue disabledSlotOverlayColor;
    public static IntValue maxSlotsInHotbarRow;
    public static BooleanValue hideOffhand;
    public static EnumValue<Alignment> hotbarAlignment;
    public static EnumValue<Order> hotbarRowOrder;
    public static BooleanValue transformChat;


    public static void init(ForgeConfigSpec.Builder client) {
        disabledSlotOverlay = client.comment("Should draw overlay over the disabled slots").define("general.disabled_slot_overlay", true);
        disabledSlotOverlayColor = client.comment("Color of the disabled slot overlay").defineInRange("general.disabled_slot_overlay_color", 0xC6C6C6, 0, Integer.MAX_VALUE);
        hideOffhand = client.comment("Should hide the offhand slot? Ignored if disableOffhand in the common config is true").define("general.hide_offhand", false);
        maxSlotsInHotbarRow = client.comment("DEPRECATED - DO NOT CHANGE").defineInRange("general.max_slots_in_hotbar_row", 18, 0, Integer.MAX_VALUE);
        hotbarAlignment = client.comment("DEPRECATED - DO NOT CHANGE").defineEnum("general.alignment", Alignment.CENTER, Alignment.values());
        hotbarRowOrder = client.comment("DEPRECATED - DO NOT CHANGE").defineEnum("general.order", Order.NORMAL, Order.values());
        transformChat = client.comment("Should move and resize the chat so it is not obstructing the hotbar rows?").define("general.transform_chat", true);
    }
}
