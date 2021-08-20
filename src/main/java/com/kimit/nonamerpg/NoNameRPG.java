package com.kimit.nonamerpg;

import com.kimit.nonamerpg.block.BlockRegistry;
import com.kimit.nonamerpg.item.ItemRegistry;
import com.kimit.nonamerpg.world.BiomeRegistry;
import com.kimit.nonamerpg.world.WorldGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

@Mod(NoNameRPG.MOD_ID)
public class NoNameRPG
{
    public static final String MOD_ID = "nonamerpg";
    private static final Logger LOGGER = LogManager.getLogger();

    public NoNameRPG()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomeRegistry.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.addListener(WorldGen::genOre);
        event.enqueueWork(() -> {
            BiomeRegistry.setCrimson(BiomeRegistry.CRIMSON.get(), BiomeManager.BiomeType.DESERT, 1000, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
        });
    }
    public static final ItemGroup GROUP = new ItemGroup("nonamerpg")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistry.ANTIMO_INGOT.get());
        }
    };
}
