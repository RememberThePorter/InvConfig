package remembertheporter.invconfig.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import remembertheporter.invconfig.TinyInv;
import remembertheporter.invconfig.world.item.FakeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TinyInv.MODID);
    public static final RegistryObject<FakeItem> FAKE_ITEM = ITEMS.register("fake_item", FakeItem::new);
}
