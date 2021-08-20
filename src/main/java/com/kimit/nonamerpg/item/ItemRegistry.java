package com.kimit.nonamerpg.item;

import com.kimit.nonamerpg.NoNameRPG;
import com.kimit.nonamerpg.block.BlockRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NoNameRPG.MOD_ID);
	// Blocks
	public static final RegistryObject<Item> ANTIMO_ORE = ITEMS.register("antimo_ore", () -> new BlockItem(BlockRegistry.ANTIMO_ORE.get(), new Item.Properties().tab(NoNameRPG.GROUP)));
	// Ingots
	public static final RegistryObject<Item> ANTIMO_INGOT = ITEMS.register("antimo_ingot", () -> new Item(new Item.Properties().tab(NoNameRPG.GROUP)));
	// Weapons
	// L Class
	public static final RegistryObject<Item> SENTIMENT = ITEMS.register("sentiment", () -> new Weapons.Sentiment(AntimoItemTier.ClassL, 35, 0.0f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).rarity(Rarity.EPIC)));
	// S Class
	public static final RegistryObject<Item> POISON_IVY = ITEMS.register("poison_ivy", () -> new Weapons.PoisonIvy(AntimoItemTier.ClassS, 35, -2.4f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> BLOODROAR = ITEMS.register("bloodroar", () -> new Weapons.Bloodroar(AntimoItemTier.ClassS, 15, -0.5f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.RARE)));
	public static final RegistryObject<Item> BESTFRIEND = ITEMS.register("bestfriend", () -> new Weapons.BestFriend(AntimoItemTier.ClassS, 75, -3.1f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.RARE)));
	// C Class
	public static final RegistryObject<Item> HANDAXE = ITEMS.register("handaxe", () -> new SwordItem(AntimoItemTier.ClassC, 2, -1.2f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> BONECLARE = ITEMS.register("boneclare", () -> new SwordItem(AntimoItemTier.ClassC, 1, -0.9f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> GREATBLOW = ITEMS.register("greatblow", () -> new SwordItem(AntimoItemTier.ClassC, 9, -2.5f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> DAMASCUS = ITEMS.register("damascus", () -> new SwordItem(AntimoItemTier.ClassC, 11, -2.7f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> INITIALLOYSWORD = ITEMS.register("initialloysword", () -> new SwordItem(AntimoItemTier.ClassC, 23, -3.3f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	public static final RegistryObject<Item> QUAD = ITEMS.register("quad", () -> new SwordItem(AntimoItemTier.ClassC, 27, -3.5f, new Item.Properties().tab(NoNameRPG.GROUP).stacksTo(1).setNoRepair().rarity(Rarity.COMMON)));
	// Armors
	public static final RegistryObject<Item> VALDOR_SHINE = ITEMS.register("valdor_shine", () -> new ArmorItem(ArmorMaterial.NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(NoNameRPG.GROUP)));
}