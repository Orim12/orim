package io.github.orim12.ori.block;

import io.github.orim12.ori.Ori;
import io.github.orim12.ori.item.ModItemGroup;
import net.minecraft.block.Block;
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
		new Block(QuiltBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.ORI
		);
	public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORI
		);
	public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORI
		);
	public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORI
		);
	public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
		new OreBlock(QuiltBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
			UniformIntProvider.create(3, 7)), ModItemGroup.ORI
		);

	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block,tab);
		return Registry.register(Registry.BLOCK, new Identifier(Ori.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(Ori.MOD_ID, name), new BlockItem(block, new QuiltItemSettings().group(tab)));
	}

	public static void registerModBlocks(){
		Ori.LOGGER.debug("Registering ModBlocks for " + Ori.MOD_ID);
	}
}
