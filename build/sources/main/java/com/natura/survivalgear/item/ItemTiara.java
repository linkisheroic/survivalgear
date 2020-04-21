package com.natura.survivalgear.item;

import java.util.UUID;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;

public class ItemTiara extends ItemAttributeBauble implements IBauble {
	
	int protection = 0;
	int toughness = 0;
	protected static final UUID ARMOR_MODIFIER = UUID.fromString("2a38a6d8-2d5b-11e9-b210-d663bd873d93");
	protected static final UUID TOUGHNESS_MODIFIER = UUID.fromString("3a952a42-2d5b-11e9-b210-d663bd873d93");
	
	public ItemTiara(String unlocalizedName, String registryName, int protection, int toughness) {
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.protection = protection;
		this.toughness = toughness;
		this.setMaxStackSize(1);
		
		this.attributeMap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIER, "tiara armor", protection, 0));
		this.attributeMap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(TOUGHNESS_MODIFIER, "tiara toughness", toughness, 0));
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		
		return BaubleType.HEAD;
		
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		IBauble.super.onWornTick(itemstack, player);
		
		
	}

}
