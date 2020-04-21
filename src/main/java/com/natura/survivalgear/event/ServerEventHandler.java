package com.natura.survivalgear.event;

import com.natura.survivalgear.item.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ServerEventHandler {
	
	public ServerEventHandler()
	{
		
	}
	
	@SubscribeEvent
	public void onEntityKilled(LivingDropsEvent e) {
		Entity entity = e.getEntity();
		World world = entity.getEntityWorld();
		BlockPos pos = entity.getPosition();
		
		if(!e.getEntity().world.isRemote) {
			
			EntityItem boneDrop = new EntityItem(world, pos.getX()+.5, pos.getY()+.5, pos.getZ()+.5, new ItemStack(Items.BONE));
			
			if(entity instanceof EntityCow) {
				EntityItem hideDropCow = new EntityItem(world, pos.getX()+.5, pos.getY()+.5, pos.getZ()+.5, new ItemStack(ModItems.hideCow));
				
				world.spawnEntity(hideDropCow);
				world.spawnEntity(boneDrop);
				
				e.getDrops().add(hideDropCow);
				e.getDrops().add(boneDrop);
			}
			
			else if(entity instanceof EntityPig) {
				EntityItem hideDropPig = new EntityItem(world, pos.getX()+.5, pos.getY()+.5, pos.getZ()+.5, new ItemStack(ModItems.hidePig));
				
				world.spawnEntity(hideDropPig);
				world.spawnEntity(boneDrop);
				
				e.getDrops().add(hideDropPig);
				e.getDrops().add(boneDrop);
			}
			
			else if(entity instanceof EntitySheep) {
				EntityItem hideDropSheep = new EntityItem(world, pos.getX()+.5, pos.getY()+.5, pos.getZ()+.5, new ItemStack(ModItems.hideSheep));
				
				world.spawnEntity(hideDropSheep);
				world.spawnEntity(boneDrop);
				
				e.getDrops().add(hideDropSheep);
				e.getDrops().add(boneDrop);
				
			}
			
		}
	}

}
