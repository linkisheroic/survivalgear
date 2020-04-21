package com.natura.survivalgear;

import com.natura.survivalgear.item.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void doRecipes() {
		GameRegistry.addSmelting(ModItems.leatherRaw, new ItemStack(Items.LEATHER), 0.2F);
	}

}
