package io.github.orim12.orim.item;

import io.github.orim12.orim.Orim;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static final ItemGroup ORIM = FabricItemGroupBuilder.build(
			new Identifier(Orim.MOD_ID, "orim"), () -> new ItemStack(ModItems.TANZANITE));
}
