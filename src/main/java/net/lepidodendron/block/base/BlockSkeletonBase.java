
package net.lepidodendron.block.base;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSkeletonBase  extends Block {

	public BlockSkeletonBase() {
		super(Material.ROCK);
		setSoundType(LepidodendronMod.SKELETON);
		setHardness(0.5F);
		setResistance(1.00F);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(TabLepidodendronMobile.tab);
	}

	public int getRotation(World world, BlockPos pos) {
		int currentRotation = 0;
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity != null) {
			if (tileEntity.getTileData().hasKey("rotation")) {
				currentRotation = tileEntity.getTileData().getInteger("rotation");
			}
		}
		return currentRotation;
	}

	public int getStage(World world, BlockPos pos) {
		int currentStage = 1;
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity != null) {
			if (tileEntity.getTileData().hasKey("stage")) {
				currentStage = tileEntity.getTileData().getInteger("stage");
			}
		}
		return currentStage;
	}

	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
		return true;
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
		super.eventReceived(state, worldIn, pos, eventID, eventParam);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		if (!world.isRemote) {
			TileEntity tileEntity = world.getTileEntity(pos);
			IBlockState blockstate = world.getBlockState(pos);
			if (tileEntity != null) {
				tileEntity.getTileData().setInteger("rotation", 0);
				tileEntity.getTileData().setInteger("stage", 1);
			}
			world.notifyBlockUpdate(pos, blockstate, blockstate, 3);}
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		int count = this.getStage(world, pos);
		for (int i = 0; i < count; i++)
		{
			spawnAsEntity(world, pos, new ItemStack(this, 1));
		}
		world.removeTileEntity(pos);
		super.breakBlock(world, pos, state);
	}

}

