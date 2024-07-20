package io.github.orim12.orim;

import io.github.orim12.orim.block.ModBlocks;
import io.github.orim12.orim.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
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
	}
}
