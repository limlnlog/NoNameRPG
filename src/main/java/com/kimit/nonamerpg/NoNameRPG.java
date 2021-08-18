package com.kimit.nonamerpg;

import com.kimit.nonamerpg.block.BlockRegistry;
import com.kimit.nonamerpg.item.ItemRegistry;
import com.kimit.nonamerpg.world.WorldGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.addListener(WorldGen::genOre);
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
