package com.natura.survivalgear.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static Block lantern = new BlockLantern();
	public static Block stickBundle = new Block(Material.WOOD, MapColor.BROWN).setUnlocalizedName("stickBundle").setRegistryName("stick_bundle").setCreativeTab(CreativeTabs.DECORATIONS).setHardness(4.0F).setResistance(1.0F);
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		IForgeRegistry<Block> registry = event.getRegistry();
		
		registry.register(lantern);
		registry.register(stickBundle);
		
	}
}
