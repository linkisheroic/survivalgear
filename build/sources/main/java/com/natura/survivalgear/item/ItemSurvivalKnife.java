package com.natura.survivalgear.item;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSurvivalKnife extends ItemSword {

	public ItemSurvivalKnife() {
		
		super(ToolMaterial.STONE);
		this.setMaxDamage(0);
		this.setRegistryName("survival_knife");
		this.setUnlocalizedName("survivalKnife");
		this.setContainerItem(this);
		
	}
	
	@Override
	public boolean isDamageable() {
		
		return false;
		
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		
		if(state.getMaterial() == Material.LEAVES || state.getMaterial() == Material.PLANTS || state.getMaterial() == Material.VINE || state.getMaterial() == Material.WEB) {
			return 12.0F;
		}
		
		else return 1.0F;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		// TODO Auto-generated method stub
		return new ItemStack(this);
	}
	
	@Override
	public boolean hasContainerItem() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public Item getContainerItem() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
