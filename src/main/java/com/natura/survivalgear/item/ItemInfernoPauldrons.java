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

public class ItemInfernoPauldrons extends ItemAttributeBauble implements IBauble {
	
	int protection = 0;
	int toughness = 0;
	protected static final UUID ARMOR_MODIFIER = UUID.fromString("47ca6e75-2f0d-416e-af45-0062fbd481f8");
	protected static final UUID TOUGHNESS_MODIFIER = UUID.fromString("2819b71c-46eb-11e9-b210-d663bd873d93");
	
	public ItemInfernoPauldrons(String unlocalizedName, String registryName, int protection, int toughness) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.protection = protection;
		this.toughness = toughness;
		this.setMaxStackSize(1);
		
		this.attributeMap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIER, "pauldron armor", protection, 0));
		this.attributeMap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(TOUGHNESS_MODIFIER, "pauldron toughness", toughness, 0));
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		
		return BaubleType.BODY;
		
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		IBauble.super.onWornTick(itemstack, player);
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 90));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 90));

	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add("");
		tooltip.add("Pauldron's forged within the depths of the Nether. They prevent you from being burned.");
	}

}
