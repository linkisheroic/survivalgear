package com.natura.survivalgear.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import static com.natura.survivalgear.block.ModBlocks.*;

public class ModItems {
	
	public static Item fireStarter = new ItemFireStarter();
	public static Item survivalKnife = new ItemSurvivalKnife();
	public static Item fishHook = new Item().setRegistryName("fish_hook").setUnlocalizedName("fishHook").setCreativeTab(CreativeTabs.TOOLS);
	public static Item paracord = new Item().setRegistryName("paracord").setUnlocalizedName("paracord").setCreativeTab(CreativeTabs.MISC);
	public static Item slingshot = new ItemSlingshot(4, "slingshot", "slingshot");
	public static Item ironSlingshot = new ItemSlingshot(8, "ironSlingshot", "iron_slingshot");
	public static Item diamondSlingshot = new ItemSlingshot(12, "diamondSlingshot", "diamond_slingshot");
	public static Item ration = new ItemFood(16, 1.0F, false).setRegistryName("ration").setUnlocalizedName("ration").setCreativeTab(CreativeTabs.FOOD);
	public static Item hideCow = new Item().setRegistryName("hide_cow").setUnlocalizedName("hideCow").setCreativeTab(CreativeTabs.MATERIALS);
	public static Item hidePig = new Item().setRegistryName("hide_pig").setUnlocalizedName("hidePig").setCreativeTab(CreativeTabs.MATERIALS);
	public static Item hideSheep = new Item().setRegistryName("hide_sheep").setUnlocalizedName("hideSheep").setCreativeTab(CreativeTabs.MATERIALS);
	public static Item hideDeer = new Item().setRegistryName("hide_deer").setUnlocalizedName("hideDeer").setCreativeTab(CreativeTabs.MATERIALS);
	public static Item leatherRaw = new Item().setRegistryName("leather_raw").setUnlocalizedName("leatherRaw").setCreativeTab(CreativeTabs.MATERIALS);
	public static Item ringWood = new ItemRing("ringWood", "ring_wood", 1, 0);
	public static Item ringIron = new ItemRing("ringIron", "ring_iron", 2, 0);
	public static Item ringGold = new ItemRing("ringGold", "ring_gold", 4, 1);
	public static Item tiaraWood = new ItemTiara("tiaraWood", "tiara_wood", 1, 0);
	public static Item tiaraIron = new ItemTiara("tiaraIron", "tiara_iron", 2, 0);
	public static Item tiaraGold = new ItemTiara("tiaraGold", "tiara_gold", 4, 1);
	
	public static Item beltDwarf = new ItemDwarfBelt("beltDwarf", "belt_dwarf", 6, 2);
	public static Item pendantMermaid = new ItemMermaidPendant("pendantMermaid", "pendant_mermaid", 2, 1);
	public static Item pauldronInferno = new ItemInfernoPauldrons("pauldronInferno", "pauldron_inferno", 8, 4);
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		
		IForgeRegistry<Item> registry = event.getRegistry();
		
		registry.register(fireStarter);
		registry.register(survivalKnife);
		registry.register(fishHook);
		registry.register(paracord);
		registry.register(slingshot);
		registry.register(ironSlingshot);
		registry.register(diamondSlingshot);
		registry.register(ration);
		registry.register(hideCow);
		registry.register(hidePig);
		registry.register(hideSheep);
		registry.register(hideDeer);
		registry.register(leatherRaw);
		registry.register(ringWood);
		registry.register(ringIron);
		registry.register(ringGold);
		registry.register(tiaraWood);
		registry.register(tiaraIron);
		registry.register(tiaraGold);
		
		registry.register(beltDwarf);
		registry.register(pendantMermaid);
		registry.register(pauldronInferno);
		
		registerItemBlock(registry, new ItemBlock(lantern));
		registerItemBlock(registry, new ItemBlock(stickBundle));
		
	}
	
	private static Item registerItemBlock(IForgeRegistry<Item> registry, ItemBlock item)
	{
		registry.register(item.setRegistryName(item.getBlock().getRegistryName()));
		return item;
	}
	
	
	
}
