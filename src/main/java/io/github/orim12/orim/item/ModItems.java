package io.github.orim12.orim.item;

import io.github.orim12.orim.Orim;
import io.github.orim12.orim.block.ModBlocks;
import io.github.orim12.orim.item.custom.EightBallItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	//items
	public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
		new Item(new QuiltItemSettings().group(ModItemGroup.ORIM)));
	public static final Item TANZANITE = registerItem("tanzanite",
		new Item(new QuiltItemSettings().group(ModItemGroup.ORIM)));
	public static final Item EIGHTBALL = registerItem("eight_ball",
		new EightBallItem(new QuiltItemSettings().group(ModItemGroup.ORIM).maxCount(1)));
	public static final Item EGGPLANT = registerItem("eggplant",
		new Item(new QuiltItemSettings().group(ModItemGroup.ORIM).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));
	public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
		new AliasedBlockItem(ModBlocks.EGGPALNT_CROP,new QuiltItemSettings().group(ModItemGroup.ORIM)));

	//register items
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Orim.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Orim.LOGGER.debug("Registering Mod Items for" + Orim.MOD_ID);
	}
}
