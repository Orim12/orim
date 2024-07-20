package io.github.orim12.orim.block;

import io.github.orim12.orim.Orim;
import io.github.orim12.orim.block.custom.EggplantCropBlock;
import io.github.orim12.orim.block.custom.JumpyBlock;
import io.github.orim12.orim.block.custom.TanzaniteLampBlock;
import io.github.orim12.orim.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
		new Block(QuiltBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ORIM
		);
	public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORIM
		);
	public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORIM
		);
	public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORIM
		);
	public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORIM
		);
	public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
		new JumpyBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ORIM
		);
	public static final Block TANZANITE_LAMP = registerBlock("tanzanite_lamp",
		new TanzaniteLampBlock(QuiltBlockSettings.of(Material.REDSTONE_LAMP).strength(4f).requiresTool().luminance(state -> state.get(TanzaniteLampBlock.LIT) ? 16 : 0)), ModItemGroup.ORIM
		);
	public static final Block EGGPALNT_CROP = registerBlockWithoutItem("eggplant_crop",
		new EggplantCropBlock(QuiltBlockSettings.copy(Blocks.WHEAT)));

	private static Block registerBlockWithoutItem(String name, Block block) {
		return Registry.register(Registry.BLOCK, new Identifier(Orim.MOD_ID, name), block);
	}
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block,tab);
		return Registry.register(Registry.BLOCK, new Identifier(Orim.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(Orim.MOD_ID, name), new BlockItem(block, new QuiltItemSettings().group(tab)));
	}

	public static void registerModBlocks(){
		Orim.LOGGER.debug("Registering ModBlocks for " + Orim.MOD_ID);
	}
}
