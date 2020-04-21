package com.natura.survivalgear.item;

import java.util.List;
import java.util.UUID;

import javax.annotation.Nullable;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDwarfBelt extends ItemAttributeBauble implements IBauble{
	
	int protection = 0;
	int toughness = 0;
	protected static final UUID ARMOR_MODIFIER = UUID.fromString("479ec186-45e2-11e9-b210-d663bd873d93");
	protected static final UUID TOUGHNESS_MODIFIER = UUID.fromString("50be644c-45e2-11e9-b210-d663bd873d93");
	
	public ItemDwarfBelt(String unlocalizedName, String registryName, int protection, int toughness) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.protection = protection;
		this.toughness = toughness;
		this.setMaxStackSize(1);
		
		this.attributeMap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIER, "belt armor", protection, 0));
		this.attributeMap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(TOUGHNESS_MODIFIER, "belt toughness", toughness, 0));
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		
		return BaubleType.BELT;
		
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		IBauble.super.onWornTick(itemstack, player);
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(3), 90, 2));
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add("");
		tooltip.add("A sash with a buckle made of an ancient metal. It improves your mining ability.");
	}
}
