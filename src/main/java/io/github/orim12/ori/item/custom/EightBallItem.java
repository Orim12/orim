package io.github.orim12.ori.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EightBallItem extends Item {

	public EightBallItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

		if (!world.isClient && hand == Hand.MAIN_HAND) {
			ItemStack itemStack = user.getStackInHand(hand);
		}

		return super.use(world, user, hand);
	}

	private int randomnumber(){

	}
}
