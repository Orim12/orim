package io.github.orim12.ori;

import io.github.orim12.ori.block.ModBlocks;
import io.github.orim12.ori.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Ori implements ModInitializer {
	public static final String MOD_ID = "ori";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Initializing Ori");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
