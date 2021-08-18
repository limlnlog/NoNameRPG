package com.kimit.nonamerpg.block;

import com.kimit.nonamerpg.NoNameRPG;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NoNameRPG.MOD_ID);
	public static final RegistryObject<Block> ANTIMO_ORE = BLOCKS.register("antimo_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).requiresCorrectToolForDrops().strength(3.0f, 3.0f)));
}