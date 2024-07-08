package io.github.orim12.ori.item;

import io.github.orim12.ori.Ori;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	//items
	public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
		new Item(new QuiltItemSettings().group(ItemGroup.MISC)));
	public static final Item TANZANITE = registerItem("tanzanite",
		new Item(new QuiltItemSettings().group(ItemGroup.MISC)));

	//register items
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Ori.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Ori.LOGGER.debug("Registering Mod Items for" + Ori.MOD_ID);
	}
}
