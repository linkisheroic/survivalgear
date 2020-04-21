package com.natura.survivalgear.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;

public class ItemFireStarter extends ItemFlintAndSteel {
	
	public ItemFireStarter() {
		
		this.setUnlocalizedName("fireStarter");
		this.setRegistryName("fire_starter");
		this.setMaxDamage(0);
		
	}
	
	@Override
	public boolean isDamageable() {
		
		return false;
		
	}

}
