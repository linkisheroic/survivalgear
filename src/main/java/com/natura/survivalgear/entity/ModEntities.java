package com.natura.survivalgear.entity;

import com.natura.survivalgear.SurvivalGear;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	
	public static int currentEntityIdOffset = 0;
	
	public static void registerEntities()
	{
		registerEntity(EntitySeedBullet.class, "seed_bullet");
	}
	
	public static void registerEntity(Class<? extends Entity> entityClass, String name)
	{
		registerEntity(entityClass, name, name, 80, 3, true);
	}
	
	//registers entity with forge and minecraft, and increases currentEntityIdOffset by one in order to prevent id collision
	public static void registerEntity(Class<? extends Entity> entityClass, String name, String registryName)
	{
		registerEntity(entityClass, name, registryName, 100, 3, true);
	}

	public static void registerEntity(Class<? extends Entity> entityClass, String name, String registryName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(new ResourceLocation("survivalgear", registryName), entityClass, "survivalgear." + name, currentEntityIdOffset, SurvivalGear.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		currentEntityIdOffset++;
	}

}
