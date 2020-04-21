package com.natura.survivalgear;

import com.natura.survivalgear.block.ModBlocks;
import com.natura.survivalgear.entity.ModEntities;
import com.natura.survivalgear.event.ServerEventHandler;
import com.natura.survivalgear.item.ModItems;
import com.natura.survivalgear.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SurvivalGear.MODID, name = SurvivalGear.MODNAME, version = SurvivalGear.VERSION, useMetadata = true, acceptedMinecraftVersions = "[1.12,1.12.2]")
public class SurvivalGear {

	public static final String MODID = "survivalgear";
    public static final String MODNAME = "Survival Gear";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide = "com.natura.survivalgear.proxy.ClientProxy", serverSide = "com.natura.survivalgear.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static SurvivalGear instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	MinecraftForge.EVENT_BUS.register(ModBlocks.class);
    	MinecraftForge.EVENT_BUS.register(ModItems.class);
    	ModRecipes.doRecipes();
    	
    	proxy.preInit();
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	
    	ModEntities.registerEntities();
    	MinecraftForge.EVENT_BUS.register(new ServerEventHandler());
    	
    	proxy.init();
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	
    	proxy.postInit();
    	
    }
    
}
