package com.natura.survivalgear.proxy;


import com.natura.survivalgear.client.ModelManager;
import com.natura.survivalgear.entity.EntitySeedBullet;
import com.natura.survivalgear.entity.RenderEntitySeedBullet;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit() {
		
		super.preInit();
		
		MinecraftForge.EVENT_BUS.register(ModelManager.class);
		RenderingRegistry.registerEntityRenderingHandler(EntitySeedBullet.class, RenderEntitySeedBullet.getFactory(1.0F));
		
	}
	
	@Override
	public void init() {
		
		super.init();
		
	}
	
	@Override
	public void postInit() {
		
		super.postInit();
		
	}
	
}
