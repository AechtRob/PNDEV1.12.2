
package net.lepidodendron.block.base;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockSkeletonBase  extends Block {

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public BlockSkeletonBase() {
		super(Material.ROCK);
		setSoundType(LepidodendronMod.SKELETON);
		setHardness(0.5F);
		setResistance(1.00F);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(TabLepidodendronMobile.tab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
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
	protected net.minecraft.block.state.BlockStateContainer createBlockState() {
		return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
	}

	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
	}

	@Override
	public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
		return new ItemStack(Items.AIR, (int) (1)).getItem();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
											EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, facing);
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

