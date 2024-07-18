package io.github.orim12.ori.block.custom;

import io.github.orim12.ori.chattext.ChatTextMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JumpyBlock extends Block {

	public JumpyBlock(Settings settings) {
		super(settings);
	}

	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if(world.isClient && hand == Hand.MAIN_HAND) {
			ChatTextMain.text("you just right clicked it yay", player);
		}

		return super.onUse(state, world, pos, player, hand, hit);
	}

	@Override
	public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
		if (Screen.hasShiftDown()) {
			tooltip.add(Text.literal("stand on it to get a effect and right click it to get text").formatted(Formatting.BLUE));
		}else {
			tooltip.add(Text.literal("Press Shift for more info!").formatted(Formatting.BLUE));
		}
		super.appendTooltip(stack, world, tooltip, options);
	}

	@Override
	public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
		if (entity instanceof LivingEntity livingEntity) {
			livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 4, true, false));
		}
		super.onSteppedOn(world, pos, state, entity);
	}
}
