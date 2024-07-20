package io.github.orim12.orim;

import io.github.orim12.orim.block.ModBlocks;
import io.github.orim12.orim.item.ModItems;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Orim implements ModInitializer {
	public static final String MOD_ID = "orim";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Initializing " + MOD_ID);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.EGGPALNT_CROP);
	}
}
