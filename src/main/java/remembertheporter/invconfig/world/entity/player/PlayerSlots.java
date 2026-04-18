package remembertheporter.invconfig.world.entity.player;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import remembertheporter.invconfig.config.ServerConfig;
import remembertheporter.invconfig.init.ModAttributes;
import remembertheporter.invconfig.world.inventory.SlotUtils;

/**
 * Should be the only way to get information about the slots the player has
 */
public class PlayerSlots {
    
    private static double getDirectAttributeValue(Player player, Attribute attribute){
        return player.getAttributes().getValue(attribute);
    }
    public static int getSlots(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return Inventory.INVENTORY_SIZE;
        return (int) (ServerConfig.inventorySlots.get() + getDirectAttributeValue(player, ModAttributes.SLOTS.get()));
    }
    public static int getHotbarSlots(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return Inventory.getSelectionSize();
        int result = 0;
        if(getSlot0(player)) result++;
        if(getSlot1(player)) result++;
        if(getSlot2(player)) result++;
        if(getSlot3(player)) result++;
        if(getSlot4(player)) result++;
        if(getSlot5(player)) result++;
        if(getSlot6(player)) result++;
        if(getSlot7(player)) result++;
        if(getSlot8(player)) result++;
        return result;
    }

    public static boolean getSlot0(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot0.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_0.get()))));
    }

    public static boolean getSlot1(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot1.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_1.get()))));
    }

    public static boolean getSlot2(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot2.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_2.get()))));
    }

    public static boolean getSlot3(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot3.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_3.get()))));
    }

    public static boolean getSlot4(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot4.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_4.get()))));
    }

    public static boolean getSlot5(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot5.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_5.get()))));
    }

    public static boolean getSlot6(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot6.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_6.get()))));
    }

    public static boolean getSlot7(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot7.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_7.get()))));
    }

    public static boolean getSlot8(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot8.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_8.get()))));
    }

    public static boolean getSlot9(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot9.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_9.get()))));
    }

    public static boolean getSlot10(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot10.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_10.get()))));
    }

    public static boolean getSlot11(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot11.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_11.get()))));
    }

    public static boolean getSlot12(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot12.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_12.get()))));
    }

    public static boolean getSlot13(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot13.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_13.get()))));
    }

    public static boolean getSlot14(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot14.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_14.get()))));
    }

    public static boolean getSlot15(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot15.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_15.get()))));
    }

    public static boolean getSlot16(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot16.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_16.get()))));
    }

    public static boolean getSlot17(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot17.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_17.get()))));
    }

    public static boolean getSlot18(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot18.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_18.get()))));
    }

    public static boolean getSlot19(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot19.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_19.get()))));
    }

    public static boolean getSlot20(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot20.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_20.get()))));
    }

    public static boolean getSlot21(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot21.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_21.get()))));
    }

    public static boolean getSlot22(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot22.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_22.get()))));
    }

    public static boolean getSlot23(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot23.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_23.get()))));
    }

    public static boolean getSlot24(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot24.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_24.get()))));
    }

    public static boolean getSlot25(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot25.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_25.get()))));
    }

    public static boolean getSlot26(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot26.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_26.get()))));
    }

    public static boolean getSlot27(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot27.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_27.get()))));
    }

    public static boolean getSlot28(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot28.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_28.get()))));
    }

    public static boolean getSlot29(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot29.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_29.get()))));
    }

    public static boolean getSlot30(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot30.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_30.get()))));
    }

    public static boolean getSlot31(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot31.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_31.get()))));
    }

    public static boolean getSlot32(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot32.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_32.get()))));
    }

    public static boolean getSlot33(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot33.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_33.get()))));
    }

    public static boolean getSlot34(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot34.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_34.get()))));
    }

    public static boolean getSlot35(Player player) {
        if(SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return(intToBoolean((int)(booleanToInt(ServerConfig.slot35.get()) + getDirectAttributeValue(player, ModAttributes.SLOT_35.get()))));
    }

    public static boolean getOffhandSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.offhandSlot.get()) + getDirectAttributeValue(player, ModAttributes.OFFHAND_SLOT.get())));
    }
    public static boolean getHeadSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.headSlot.get()) + getDirectAttributeValue(player, ModAttributes.HEAD_SLOT.get())));
    }
    public static boolean getChestSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.chestSlot.get()) + getDirectAttributeValue(player, ModAttributes.CHEST_SLOT.get())));
    }
    public static boolean getLegsSLot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.legsSlot.get()) + getDirectAttributeValue(player, ModAttributes.LEGS_SLOT.get())));
    }
    public static boolean getFeetSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.feetSlot.get()) + getDirectAttributeValue(player, ModAttributes.FEET_SLOT.get())));
    }
    public static boolean getCraftingTopLeftSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.craftingTLSlot.get()) + getDirectAttributeValue(player, ModAttributes.CRAFT_TOP_LEFT_SLOT.get())));
    }
    public static boolean getCraftingTopRightSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.craftingTRSlot.get()) + getDirectAttributeValue(player, ModAttributes.CRAFT_TOP_RIGHT_SLOT.get())));
    }
    public static boolean getCraftingBottomRightSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.craftingBRSlot.get()) + getDirectAttributeValue(player, ModAttributes.CRAFT_BOTTOM_RIGHT_SLOT.get())));
    }
    public static boolean getCraftingBottomLeftSlot(Player player){
        if (SlotUtils.shouldPlayerBeExcluded(player)) return true;
        return intToBoolean((int) (booleanToInt(ServerConfig.craftingBLSlot.get()) + getDirectAttributeValue(player, ModAttributes.CRAFT_BOTTOM_LEFT_SLOT.get())));
    }

    private static int booleanToInt(boolean bool){
        return bool ? 1 : 0;
    }

    private static boolean intToBoolean(int i){
        return i > 0;
    }


}
