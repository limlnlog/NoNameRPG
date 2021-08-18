package com.kimit.nonamerpg.world;

import com.kimit.nonamerpg.block.BlockRegistry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WorldGen
{
	public static void genOre(final BiomeLoadingEvent event)
	{
		event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
						BlockRegistry.ANTIMO_ORE.get().defaultBlockState(),
						12)).range(15).squared().count(8));
	}
}