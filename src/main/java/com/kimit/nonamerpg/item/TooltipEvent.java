package com.kimit.nonamerpg.item;

import com.kimit.nonamerpg.NoNameRPG;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NoNameRPG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class TooltipEvent
{
	@SubscribeEvent
	public static void addTooltip(ItemTooltipEvent event)
	{
		ItemStack stack = event.getItemStack();
		if (stack.getItem() == ItemRegistry.SENTIMENT.get())
			event.getToolTip().add(new TranslationTextComponent("L Class").withStyle(TextFormatting.LIGHT_PURPLE));
		else if (stack.getItem() == ItemRegistry.POISON_IVY.get()) // Add other S Class weapons
			event.getToolTip().add(new TranslationTextComponent("S Class").withStyle(TextFormatting.LIGHT_PURPLE));
	}
}
