package com.kimit.nonamerpg.world;

import com.kimit.nonamerpg.NoNameRPG;
import com.kimit.nonamerpg.block.BlockRegistry;
import com.kimit.nonamerpg.item.ItemRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.BiomeManager;

import java.util.Objects;

public class BiomeRegistry
{
	//public static final RegistryKey<ConfiguredSurfaceBuilder<?>> SURFACE = RegistryKey.create()
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, NoNameRPG.MOD_ID);
	public static final RegistryObject<Biome> CRIMSON = BIOMES.register("crimson", () -> makeCrimsonBiome());

	public static Biome makeCrimsonBiome()
	{
		final BiomeGenerationSettings.Builder GENERAITON = new BiomeGenerationSettings.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(BlockRegistry.ANTIMO_ORE.get().defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.IRON_BLOCK.defaultBlockState())));
		final MobSpawnInfo.Builder SPAWN = new MobSpawnInfo.Builder();
		DefaultBiomeFeatures.commonSpawns(SPAWN);
		DefaultBiomeFeatures.addDefaultOverworldLandStructures(GENERAITON);
		DefaultBiomeFeatures.addDefaultCarvers(GENERAITON);
		DefaultBiomeFeatures.addDefaultUndergroundVariety(GENERAITON);
		DefaultBiomeFeatures.addDefaultOres(GENERAITON);
		return new Biome.Builder().precipitation(Biome.RainType.NONE).biomeCategory(Biome.Category.FOREST).depth(0.125f).scale(0.05f).temperature(0.8f).downfall(0).specialEffects(new BiomeAmbience.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7907327).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).build()).generationSettings(GENERAITON.build()).mobSpawnSettings(SPAWN.build()).build();
	}

	public static void setCrimson(final Biome biome, final BiomeManager.BiomeType biomeType, final int weight, final BiomeDictionary.Type... types)
	{
		BiomeDictionary.addTypes(key(biome), types);
		BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(key(biome), weight));
	}
	private static RegistryKey<Biome> key(final Biome biome)
	{
		return RegistryKey.create(ForgeRegistries.Keys.BIOMES, Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome), "Biome registry name was null"));
	}
}
