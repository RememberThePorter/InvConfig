package remembertheporter.invconfig.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;


public class ServerConfig {

    public static IntValue inventorySlots;
    public static IntValue hotbarSlots;
    public static BooleanValue slot0;
    public static BooleanValue slot1;
    public static BooleanValue slot2;
    public static BooleanValue slot3;
    public static BooleanValue slot4;
    public static BooleanValue slot5;
    public static BooleanValue slot6;
    public static BooleanValue slot7;
    public static BooleanValue slot8;
    public static BooleanValue slot9;
    public static BooleanValue slot10;
    public static BooleanValue slot11;
    public static BooleanValue slot12;
    public static BooleanValue slot13;
    public static BooleanValue slot14;
    public static BooleanValue slot15;
    public static BooleanValue slot16;
    public static BooleanValue slot17;
    public static BooleanValue slot18;
    public static BooleanValue slot19;
    public static BooleanValue slot20;
    public static BooleanValue slot21;
    public static BooleanValue slot22;
    public static BooleanValue slot23;
    public static BooleanValue slot24;
    public static BooleanValue slot25;
    public static BooleanValue slot26;
    public static BooleanValue slot27;
    public static BooleanValue slot28;
    public static BooleanValue slot29;
    public static BooleanValue slot30;
    public static BooleanValue slot31;
    public static BooleanValue slot32;
    public static BooleanValue slot33;
    public static BooleanValue slot34;
    public static BooleanValue slot35;
    public static BooleanValue offhandSlot;
    public static BooleanValue headSlot;
    public static BooleanValue chestSlot;
    public static BooleanValue legsSlot;
    public static BooleanValue feetSlot;
    public static BooleanValue craftingTLSlot;
    public static BooleanValue craftingTRSlot;
    public static BooleanValue craftingBLSlot;
    public static BooleanValue craftingBRSlot;
    public static BooleanValue excludeCreativeModePlayers;
    public static ForgeConfigSpec.EnumValue<Indexing> indexing;



    public static void init(ForgeConfigSpec.Builder server) {
        inventorySlots = server.comment("The default number of slots").defineInRange("general.inventory_slots", 36, 0, 36);
        hotbarSlots = server.comment("The default number of hotbar slots").defineInRange("general.hotbar_slots", 9, 0, 36);
        slot0 = server.comment("Should slot index 0 be enabled?").define("general.slot_0", true);
        slot1 = server.comment("Should slot index 1 be enabled?").define("general.slot_1", true);
        slot2 = server.comment("Should slot index 2 be enabled?").define("general.slot_2", true);
        slot3 = server.comment("Should slot index 3 be enabled?").define("general.slot_3", true);
        slot4 = server.comment("Should slot index 4 be enabled?").define("general.slot_4", true);
        slot5 = server.comment("Should slot index 5 be enabled?").define("general.slot_5", true);
        slot6 = server.comment("Should slot index 6 be enabled?").define("general.slot_6", true);
        slot7 = server.comment("Should slot index 7 be enabled?").define("general.slot_7", true);
        slot8 = server.comment("Should slot index 8 be enabled?").define("general.slot_8", true);
        slot9 = server.comment("Should slot index 9 be enabled?").define("general.slot_9", true);
        slot10 = server.comment("Should slot index 10 be enabled?").define("general.slot_10", true);
        slot11 = server.comment("Should slot index 11 be enabled?").define("general.slot_11", true);
        slot12 = server.comment("Should slot index 12 be enabled?").define("general.slot_12", true);
        slot13 = server.comment("Should slot index 13 be enabled?").define("general.slot_13", true);
        slot14 = server.comment("Should slot index 14 be enabled?").define("general.slot_14", true);
        slot15 = server.comment("Should slot index 15 be enabled?").define("general.slot_15", true);
        slot16 = server.comment("Should slot index 16 be enabled?").define("general.slot_16", true);
        slot17 = server.comment("Should slot index 17 be enabled?").define("general.slot_17", true);
        slot18 = server.comment("Should slot index 18 be enabled?").define("general.slot_18", true);
        slot19 = server.comment("Should slot index 19 be enabled?").define("general.slot_19", true);
        slot20 = server.comment("Should slot index 20 be enabled?").define("general.slot_20", true);
        slot21 = server.comment("Should slot index 21 be enabled?").define("general.slot_21", true);
        slot22 = server.comment("Should slot index 22 be enabled?").define("general.slot_22", true);
        slot23 = server.comment("Should slot index 23 be enabled?").define("general.slot_23", true);
        slot24 = server.comment("Should slot index 24 be enabled?").define("general.slot_24", true);
        slot25 = server.comment("Should slot index 25 be enabled?").define("general.slot_25", true);
        slot26 = server.comment("Should slot index 26 be enabled?").define("general.slot_26", true);
        slot27 = server.comment("Should slot index 27 be enabled?").define("general.slot_27", true);
        slot28 = server.comment("Should slot index 28 be enabled?").define("general.slot_28", true);
        slot29 = server.comment("Should slot index 29 be enabled?").define("general.slot_29", true);
        slot30 = server.comment("Should slot index 30 be enabled?").define("general.slot_30", true);
        slot31 = server.comment("Should slot index 31 be enabled?").define("general.slot_31", true);
        slot32 = server.comment("Should slot index 32 be enabled?").define("general.slot_32", true);
        slot33 = server.comment("Should slot index 33 be enabled?").define("general.slot_33", true);
        slot34 = server.comment("Should slot index 34 be enabled?").define("general.slot_34", true);
        slot35 = server.comment("Should slot index 35 be enabled?").define("general.slot_35", true);
        offhandSlot = server.comment("Should offhand slot be enabled?").define("general.offhand_slot", true);
        headSlot = server.comment("Should offhand slot be enabled?").define("general.head_slot", true);
        chestSlot = server.comment("Should offhand slot be enabled?").define("general.chest_slot", true);
        legsSlot = server.comment("Should offhand slot be enabled?").define("general.legs_slot", true);
        feetSlot = server.comment("Should offhand slot be enabled?").define("general.feet_slot", true);
        craftingTLSlot = server.comment("Should offhand slot be enabled?").define("general.crafting_top_left_slot", true);
        craftingTRSlot = server.comment("Should offhand slot be enabled?").define("general.crafting_top_right_slot", true);
        craftingBLSlot = server.comment("Should offhand slot be enabled?").define("general.crafting_bottom_left_slot", true);
        craftingBRSlot = server.comment("Should offhand slot be enabled?").define("general.crafting_bottom_right_slot", true);

        excludeCreativeModePlayers = server.comment("Should exclude the players who are in creative mode?").define("general.exclude_creative_mode_players", true);
        indexing = server.comment("What indexing to use? Mojang counts inventory slots from top to bottom, while TinyInv counts from bottom to top (which lines up better with hotbar indexes)").defineEnum("general.indexing",Indexing.TINYINV,Indexing.values());

    }
}
