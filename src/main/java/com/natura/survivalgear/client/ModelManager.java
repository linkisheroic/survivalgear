package com.natura.survivalgear.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static com.natura.survivalgear.item.ModItems.*;
import static com.natura.survivalgear.block.ModBlocks.*;

@SideOnly(Side.CLIENT)	
public class ModelManager {

	@SubscribeEvent
	public static void handleModelRegistry(ModelRegistryEvent event)
	{
		
		itemModels();
		blockModels();
		
	}
	
	private static void itemModels()
	{
		
		register(fireStarter);
		register(survivalKnife);
		register(fishHook);
		register(paracord);
		register(slingshot);
		register(ironSlingshot);
		register(diamondSlingshot);
		register(ration);
		register(hideCow);
		register(hidePig);
		register(hideSheep);
		register(hideDeer);
		register(leatherRaw);
		register(ringWood);
		register(ringIron);
		register(ringGold);
		register(tiaraWood);
		register(tiaraIron);
		register(tiaraGold);
		register(beltDwarf);
		register(pendantMermaid);
		register(pauldronInferno);
		
	}
	
	private static void blockModels()
	{
		register(lantern);
		register(stickBundle);
	}
	
	private static void register(Item item)
	{
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Item.REGISTRY.getNameForObject(item), "inventory"));
	
	}
	
	private static void register(Block block)
	{
		
		register(Item.getItemFromBlock(block));
		
	}
}
