
package net.lepidodendron.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockInsectEggs extends Block {

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public BlockInsectEggs() {
		super(Material.PLANTS);
		setSoundType(SoundType.SLIME);
		setHardness(0.0F);
		setResistance(0.0F);
		setLightLevel(0F);
		setLightOpacity(0);
		//this.setTickRandomly(true);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(this, (int) (1));
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		return NULL_AABB;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
			case SOUTH :
			default :
				return new AxisAlignedBB(0D, 0D, 0D, 1D, 1D, 0.3D);
			case NORTH :
				return new AxisAlignedBB(0D, 0D, 0.7D, 1D, 1D, 1D);
			case WEST :
				return new AxisAlignedBB(0.7D, 0D, 0D, 1D, 1D, 1D);
			case EAST :
				return new AxisAlignedBB(0D, 0D, 0D, 0.3D, 1D, 1D);
			case UP :
				return new AxisAlignedBB(0.0D, 0D, 0D, 1.0D, 0.3D, 1.0D);
			case DOWN :
				return new AxisAlignedBB(0.0D, 0.7D, 0D, 1.0D, 1.0D, 1.0D);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer()
{
	return BlockRenderLayer.CUTOUT;
}

	@Override
	public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
		return layer == BlockRenderLayer.CUTOUT_MIPPED;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
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
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, facing);
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 60;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 30;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.FOLIAGE;
	}

	@Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
		if (!canPlaceBlockAt(world, pos)) {
			//worldIn.setBlockToAir(pos);
			world.destroyBlock(pos, true);
		}
		else {
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = world.getBlockState(pos.south());
				if (world.isAirBlock(pos.south()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.south()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = world.getBlockState(pos.north());
				if (world.isAirBlock(pos.north()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.north()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = world.getBlockState(pos.west());
				if (world.isAirBlock(pos.west()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.west()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = world.getBlockState(pos.east());
				if (world.isAirBlock(pos.east()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.east()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = world.getBlockState(pos.down());
				if (world.isAirBlock(pos.down()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.down()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = world.getBlockState(pos.up());
				if (world.isAirBlock(pos.up()) ||
						(
								(iblockstate.getBlockFaceShape(world, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.up()))
						)
				)
				{
					world.destroyBlock(pos, true);

				}
			}
		}
		super.neighborChanged(state, world, pos, neighborBlock, fromPos);
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (!canPlaceBlockAt(worldIn, pos)) {
			//worldIn.setBlockToAir(pos);
			worldIn.destroyBlock(pos, true);
		} else {
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.south());
				if (worldIn.isAirBlock(pos.south()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.south()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.north());
				if (worldIn.isAirBlock(pos.north()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.north()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.west());
				if (worldIn.isAirBlock(pos.west()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.west()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.east());
				if (worldIn.isAirBlock(pos.east()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.east()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = worldIn.getBlockState(pos.down());
				if (worldIn.isAirBlock(pos.down()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = worldIn.getBlockState(pos.up());
				if (worldIn.isAirBlock(pos.up()) ||
						(
								(iblockstate.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
										&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.up()))
						)
				) {
					worldIn.destroyBlock(pos, true);

				}
			}
		}
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	{
		return BlockFaceShape.UNDEFINED;
	}

	@Override
	public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return true;
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		if ((worldIn.getBlockState(pos).getMaterial() != Material.WATER) && (worldIn.getBlockState(pos).getMaterial() != Material.LAVA)) {
			return super.canPlaceBlockAt(worldIn, pos);
		}
		return false;
	}

	@Override
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	{
		boolean blockface  = true;
		if (side == EnumFacing.NORTH) {
			if (worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}
		if (side == EnumFacing.SOUTH) {
			if (worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}
		if (side == EnumFacing.EAST) {
			if (worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}
		if (side == EnumFacing.WEST) {
			if (worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}
		if (side == EnumFacing.UP) {
			if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}
		if (side == EnumFacing.DOWN) {
			if (worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID)
				blockface = false;
		}

		return (blockface && canPlaceBlockAt(worldIn, pos));

	}

	@Override
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	{
		return true;
	}

}
