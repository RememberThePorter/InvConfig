package remembertheporter.invconfig.client.gui;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.AttackIndicatorStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import remembertheporter.invconfig.client.ClientSlotUtils;
import remembertheporter.invconfig.config.Alignment;
import remembertheporter.invconfig.config.ClientConfig;
import remembertheporter.invconfig.world.entity.player.PlayerSlots;
import remembertheporter.invconfig.world.inventory.SlotUtils;

import java.util.ArrayList;

public class InGameOverlayHelper {

    public static final int HOTBAR_SLOT_WIDTH = 20;
    public static final int HOTBAR_SLOT_HEIGHT = 22;
    public static final int HOTBAR_SLOT_FIRST_X = 0;
    public static final int HOTBAR_SLOT_LAST_X = 161;

    private static Player getCameraPlayer() {
        return !(Minecraft.getInstance().getCameraEntity() instanceof Player) ? null : (Player) Minecraft.getInstance().getCameraEntity();
    }

    public static void renderHotbar(Window window, float partialTicks, GuiGraphics guiGraphics) {
        Player player = getCameraPlayer();
        if (player != null) {
            int screenHeight = window.getGuiScaledHeight();
            int screenWidth = window.getGuiScaledWidth();

            int rows = ClientSlotUtils.getHotbarRows(window) - 1;
            ArrayList<Integer> slots = ClientSlotUtils.getHotbarSlots();
            int slotsPerRow = ClientConfig.maxSlotsInHotbarRow.get() == 0 ? slots.size() : Math.min(ClientConfig.maxSlotsInHotbarRow.get(), slots.size());

            Minecraft minecraft = Minecraft.getInstance();
            ItemStack itemstack = player.getOffhandItem();
            HumanoidArm humanoidarm = player.getMainArm().getOpposite();
            int i = screenWidth / 2;
            int j = 182;
            int k = 91;
            guiGraphics.pose().pushPose();
            guiGraphics.pose().translate(0.0F, 0.0F, -90.0F);

            int largestRowWidth = hotbarRowWidth(slotsPerRow);

            int hotbarStart = i - (largestRowWidth / 2);
            int hotbarEnd = i + (largestRowWidth / 2);

            renderHotbarGraphics(guiGraphics, hotbarStart, hotbarEnd, i, slots, screenHeight, slotsPerRow);

            if (!itemstack.isEmpty() && PlayerSlots.getOffhandSlot(player) && !ClientConfig.hideOffhand.get()) {
                if (humanoidarm == HumanoidArm.LEFT) {
                    guiGraphics.blit(Textures.WIDGETS_LOCATION, hotbarStart - 29, screenHeight - 23, 24, 22, 29, 24);
                } else {
                    guiGraphics.blit(Textures.WIDGETS_LOCATION, hotbarEnd, screenHeight - 23, 53, 22, 29, 24);
                }
            }

            guiGraphics.pose().popPose();

            int l = renderHotbarItems(guiGraphics, hotbarStart, hotbarEnd, i, slots, screenHeight, slotsPerRow, partialTicks, player);

            if (!itemstack.isEmpty() && PlayerSlots.getOffhandSlot(player) && !ClientConfig.hideOffhand.get()) {
                int i2 = screenHeight - 16 - 3;
                if (humanoidarm == HumanoidArm.LEFT) {
                    renderSlot(guiGraphics, hotbarStart - 26, i2, partialTicks, player, itemstack, l++);
                } else {
                    renderSlot(guiGraphics, hotbarEnd + 10, i2, partialTicks, player, itemstack, l++);
                }
            }

            RenderSystem.enableBlend();
            if (minecraft.options.attackIndicator().get() == AttackIndicatorStatus.HOTBAR) {
                float f = minecraft.player.getAttackStrengthScale(0.0F);
                if (f < 1.0F) {
                    int j2 = screenHeight - 20;
                    int k2 = i + 91 + 6;
                    if (humanoidarm == HumanoidArm.RIGHT) {
                        k2 = i - 91 - 22;
                    }

                    int l1 = (int) (f * 19.0F);
                    guiGraphics.blit(Textures.GUI_ICONS_LOCATION, k2, j2, 0, 94, 18, 18);
                    guiGraphics.blit(Textures.GUI_ICONS_LOCATION, k2, j2 + 18 - l1, 18, 112 - l1, 18, l1);
                }
            }

            RenderSystem.disableBlend();
        }
    }

    private static void renderSlot(GuiGraphics guiGraphics, int p_283213_, int p_281301_, float partialTicks, Player player, ItemStack stack, int p_283261_) {
        if (!stack.isEmpty()) {
            float f = (float) stack.getPopTime() - partialTicks;
            if (f > 0.0F) {
                float f1 = 1.0F + f / 5.0F;
                guiGraphics.pose().pushPose();
                guiGraphics.pose().translate((float) (p_283213_ + 8), (float) (p_281301_ + 12), 0.0F);
                guiGraphics.pose().scale(1.0F / f1, (f1 + 1.0F) / 2.0F, 1.0F);
                guiGraphics.pose().translate((float) (-(p_283213_ + 8)), (float) (-(p_281301_ + 12)), 0.0F);
            }

            guiGraphics.renderItem(player, stack, p_283213_, p_281301_, p_283261_);
            if (f > 0.0F) {
                guiGraphics.pose().popPose();
            }

            guiGraphics.renderItemDecorations(Minecraft.getInstance().font, stack, p_283213_, p_281301_);
        }
    }

    private static void renderHotbarGraphics(GuiGraphics guiGraphics, int hotbarStart, int hotbarEnd, int middle, ArrayList<Integer> slots, int screenHeight, int slotsPerRow) {
        int totalSlots = 0;
        int row = 1;
        Alignment alignment = ClientConfig.hotbarAlignment.get();
        while (totalSlots < slots.size()) {
            int slotsInRow = Math.min(slots.size() - totalSlots, slotsPerRow);
            int left = alignment == Alignment.LEFT ? hotbarStart : (alignment == Alignment.CENTER ? middle - (hotbarRowWidth(slotsInRow) / 2) : hotbarEnd - hotbarRowWidth(slotsInRow));
            int top = screenHeight - 1 - (HOTBAR_SLOT_HEIGHT - 1) * (row);
            renderHotbarRow(guiGraphics, slots, slotsInRow, left, top);
            totalSlots += slotsInRow;
            row++;
        }
    }

    public static void renderHotbarRow(GuiGraphics guiGraphics, ArrayList<Integer> slots, int amount,int left, int top){
        for (int slot : slots) {
            int textureX;
            int width = HOTBAR_SLOT_WIDTH;
            if (slot == 0) {
                textureX = HOTBAR_SLOT_FIRST_X;
                width++;
            } else if (slot == amount - 1) {
                textureX = HOTBAR_SLOT_LAST_X;
                width++;
            } else {
                textureX = (HOTBAR_SLOT_WIDTH + 1) + HOTBAR_SLOT_WIDTH * (((slot - 1) % 7));
            }

            guiGraphics.blit(Textures.WIDGETS_LOCATION, left, top, textureX, 0, width, HOTBAR_SLOT_HEIGHT);
            left += width;
        }
    }

    private static int renderHotbarItems(GuiGraphics guiGraphics, int hotbarStart, int hotbarEnd, int middle, ArrayList<Integer> slots, int screenHeight, int slotsPerRow, float partialTicks, Player player) {
        int l = 1;
        int totalSlots = 0;
        int row = 1;
        Alignment alignment = ClientConfig.hotbarAlignment.get();
        int slotsInRow = Math.min(slots.size() - totalSlots, slotsPerRow);
        int left = alignment == Alignment.LEFT ? hotbarStart : (alignment == Alignment.CENTER ? middle - (hotbarRowWidth(slotsInRow) / 2) : hotbarEnd - hotbarRowWidth(slotsInRow));
        int top = screenHeight - 1 - (HOTBAR_SLOT_HEIGHT - 1) * (row);
        l += renderHotbarItemsRow(guiGraphics, slots, left, top, partialTicks, player);
        return l;
    }

    public static int renderHotbarItemsRow(GuiGraphics guiGraphics, ArrayList<Integer> slots, int left, int top, float partialTicks, Player player) {
        int renderedSlots = 0;
        for (int slot = 0; slot < 9; slot++) {
            if(slots.contains(slot)) {
                int j1 = left + 1 + renderedSlots * 20 + 2;
                int k1 = top + 3;
                int normalized = SlotUtils.normalizeSlotId(slot);
                if (normalized == player.getInventory().selected) {
                    guiGraphics.blit(Textures.WIDGETS_LOCATION, j1 - 4, k1 - 4, 0, 22, 24, 23);
                }
                renderSlot(guiGraphics, j1, k1, partialTicks, player, player.getInventory().items.get(normalized), renderedSlots++);
            }
        }
        return renderedSlots;
    }

    private static int hotbarRowWidth(int slots){
        return slots <= 1 ? HOTBAR_SLOT_WIDTH + 1 : Math.max(0, (slots - 2)) * HOTBAR_SLOT_WIDTH + 2 * (HOTBAR_SLOT_WIDTH + 1);
    }
}
