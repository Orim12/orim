package io.github.orim12.orim;

import io.github.orim12.orim.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.Fluid;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;
import org.quiltmc.qsl.block.extensions.impl.client.BlockRenderLayerMapImpl;

import java.util.function.BiConsumer;

public class OrimClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		//BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.EGGPALNT_CROP);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.EGGPALNT_CROP);
	}
}
