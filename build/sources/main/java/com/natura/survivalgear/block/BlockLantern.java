package com.natura.survivalgear.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLantern extends Block {
	
	protected static final AxisAlignedBB AABB_LANTERN = new AxisAlignedBB(0.3D, 0.0D, 0.3D, 0.7D, 0.8D, 0.7D);
	
	public BlockLantern() {
		super(Material.IRON);
		this.setHardness(3.0F);
		this.setResistance(4.0F);
		this.setLightLevel(1.0F);
		this.setCreativeTab(CreativeTabs.DECORATIONS);
		this.setUnlocalizedName("lantern");
		this.setRegistryName("lantern");
	}
	
	@Override
	public boolean isBlockNormalCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		
		return BlockFaceShape.UNDEFINED;
		
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public boolean isTopSolid(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		// TODO Auto-generated method stub
		return AABB_LANTERN;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return AABB_LANTERN;
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		return worldIn.getBlockState(pos.down()).isTopSolid();
	}

}
