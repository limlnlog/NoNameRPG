package com.kimit.nonamerpg.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Weapons
{
	// L Class
	public static class Sentiment extends SwordItem
	{
		public Sentiment(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_)
		{
			super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
		}
		@Override
		public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
		{
			super.hurtEnemy(stack, target, attacker);
			target.addEffect(new EffectInstance(Effects.WEAKNESS, 400, 1));
			target.addEffect(new EffectInstance(Effects.BLINDNESS, 100, 1));
			target.addEffect(new EffectInstance(Effects.HUNGER, 200, 1));
			return true;
		}
	}
	// S Class
	public static class PoisonIvy extends SwordItem
	{
		public PoisonIvy(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_)
		{
			super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
		}
		@Override
		public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
		{
			super.hurtEnemy(stack, target, attacker);
			target.addEffect(new EffectInstance(Effects.POISON, 100, 2));
			return true;
		}
	}
	public static class Bloodroar extends SwordItem
	{
		public Bloodroar(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_)
		{
			super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
		}
		@Override
		public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
		{
			super.hurtEnemy(stack, target, attacker);
			target.addEffect(new EffectInstance(Effects.WITHER, 20, 1));
			attacker.heal(8);
			return true;
		}
	}
	public static class BestFriend extends SwordItem
	{
		public BestFriend(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_)
		{
			super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
		}
		@Override
		public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker)
		{
			super.hurtEnemy(stack, target, attacker);
			target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 120, 2));
			return true;
		}
	}
}
