package com.kimit.nonamerpg.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum AntimoItemTier implements IItemTier
{
	ClassL(-1, 1.0F, 4.0F, 4, 15, () ->
	{
		return Ingredient.of(ItemRegistry.ANTIMO_INGOT.get());
	}),
	ClassS(2000, 1.0F, 4.0F, 3, 15, () ->
	{
		return Ingredient.of(ItemRegistry.ANTIMO_INGOT.get());
	}),
	ClassA(3000, 1.0F, 9.0F, 4, 15, () ->
	{
		return Ingredient.of(ItemRegistry.ANTIMO_INGOT.get());
	}),
	ClassB(3000, 1.0F, 9.0F, 4, 15, () ->
	{
		return Ingredient.of(ItemRegistry.ANTIMO_INGOT.get());
	}),
	ClassC(600, 1.0F, 4.0F, 4, 15, () ->
	{
		return Ingredient.of(ItemRegistry.ANTIMO_INGOT.get());
	});

	private final int USES;
	private final float SPEED;
	private final float DAMAGE;
	private final int LEVEL;
	private final int ENCHANTMENTVALUE;
	private final LazyValue<Ingredient> REPAIRINGREDIENT;

	private AntimoItemTier(int A, float B, float C, int D, int E, Supplier<Ingredient> F)
	{
		this.USES = A;
		this.SPEED = B;
		this.DAMAGE = C;
		this.LEVEL = D;
		this.ENCHANTMENTVALUE = E;
		this.REPAIRINGREDIENT = new LazyValue<>(F);
	}

	@Override
	public int getUses() {
		return this.USES;
	}

	@Override
	public float getSpeed() {
		return this.SPEED;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.DAMAGE;
	}

	@Override
	public int getLevel() {
		return this.LEVEL;
	}

	@Override
	public int getEnchantmentValue() {
		return this.ENCHANTMENTVALUE;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.REPAIRINGREDIENT.get();
	}
}