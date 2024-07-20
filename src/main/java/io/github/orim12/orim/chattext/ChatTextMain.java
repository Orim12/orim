package io.github.orim12.orim.chattext;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class ChatTextMain  {
	public static void text(String text, PlayerEntity player){
		player.sendMessage(Text.literal("<orim> " + text));
	}
}
