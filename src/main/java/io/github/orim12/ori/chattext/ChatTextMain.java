package io.github.orim12.ori.chattext;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;

public class ChatTextMain  {
	public static void text(String text, PlayerEntity player){
		player.sendMessage(Text.literal("<ori> " + text));
	}
}
