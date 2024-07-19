package io.github.orim12.ori.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TanzaniteLampBlock extends Block {
	public static final BooleanProperty LIT = BooleanProperty.of("lit");
	public TanzaniteLampBlock(Settings settings) {
		super(settings);
	}
//todo fix texture of block placed
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (!world.isClient && hand == Hand.MAIN_HAND) {
			world.setBlockState(pos, state.cycle(LIT));
		}
		return super.onUse(state, world, pos, player, hand, hit);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(LIT);
		super.appendProperties(builder);
	}
}
