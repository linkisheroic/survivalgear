package com.natura.survivalgear.item;

import java.util.UUID;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRing extends ItemAttributeBauble implements IBauble {
	
	int protection = 0;
	int toughness = 0;
	protected static final UUID ARMOR_MODIFIER = UUID.fromString("371929FC-4CBC-11E8-842F-0ED5F89F718B");
	protected static final UUID TOUGHNESS_MODIFIER = UUID.fromString("22E6BD72-4CBD-11E8-842F-0ED5F89F718B");
	
	public ItemRing(String unlocalizedName, String registryName, int protection, int toughness) {
		
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.protection = protection;
		this.toughness = toughness;
		this.setMaxStackSize(1);
		
		this.attributeMap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIER, "ring armor", protection, 0));
		this.attributeMap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(TOUGHNESS_MODIFIER, "ring toughness", toughness, 0));
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		
		return BaubleType.RING;
		
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		IBauble.super.onWornTick(itemstack, player);
		
		
	}
	

}
