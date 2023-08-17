
package net.lepidodendron.block.base;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPane;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class BlockFenceSpecialPF extends BlockPane {
	public static final PropertyBool UP = PropertyBool.create("up");
	public static final PropertyBool DOWN = PropertyBool.create("down");
	protected static final AxisAlignedBB[] AABB_BY_INDEX = new AxisAlignedBB[] {new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.5625D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.4375D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.4375D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 0.5625D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.5D, 1.0D)};

	protected static final AxisAlignedBB AABB_NORTHEAST = new AxisAlignedBB(0.5, 0, 0.0, 1.0, 1.5, 0.5);
	protected static final AxisAlignedBB AABB_NORTHWEST = new AxisAlignedBB(0.0, 0, 0.0, 0.5, 1.5, 0.5);
	protected static final AxisAlignedBB AABB_SOUTHEAST = new AxisAlignedBB(0.5, 0, 0.5, 1.0, 1.5, 1.0);
	protected static final AxisAlignedBB AABB_SOUTHWEST = new AxisAlignedBB(0.0, 0, 0.5, 0.5, 1.5, 1.0);

	public static final PropertyBool NORTH_EAST = PropertyBool.create("ne");
	public static final PropertyBool NORTH_WEST = PropertyBool.create("nw");
	public static final PropertyBool EAST_NORTH = PropertyBool.create("en");
	public static final PropertyBool EAST_SOUTH = PropertyBool.create("es");
	public static final PropertyBool SOUTH_EAST = PropertyBool.create("se");
	public static final PropertyBool SOUTH_WEST = PropertyBool.create("sw");
	public static final PropertyBool WEST_SOUTH = PropertyBool.create("ws");
	public static final PropertyBool WEST_NORTH = PropertyBool.create("wn");


	public BlockFenceSpecialPF() {
		super(Material.GLASS, true);
		setSoundType(SoundType.GLASS);
		setLightOpacity(0);
	}

	@Override
	public boolean canPaneConnectTo(IBlockAccess world, BlockPos pos, EnumFacing dir)
	{
		BlockPos other = pos.offset(dir);
		boolean gate = false;
		IBlockState state = world.getBlockState(other);
		if (state.getBlock() instanceof BlockFenceGate) {
			if (state.getValue(BlockFenceGate.FACING) == dir.rotateY() || state.getValue(BlockFenceGate.FACING) == dir.rotateY().rotateY().rotateY()) {
				gate = true;
			}
		}

		return state.getBlock().canBeConnectedTo(world, other, dir.getOpposite()) || attachesTo(world, state, other, dir.getOpposite()) || gate;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		boolean ne = false;
		boolean nw = false;
		boolean en = false;
		boolean es = false;
		boolean se = false;
		boolean sw = false;
		boolean ws = false;
		boolean wn = false;
		state = super.getActualState(state, worldIn, pos);
		IBlockState stateCheck1 = null;
		IBlockState stateCheck2 = null;
		IBlockState stateCheck3 = null;
		if (!state.getValue(NORTH)) {
			stateCheck1 = worldIn.getBlockState(pos.north().east());
			stateCheck2 = worldIn.getBlockState(pos.north().west());
			stateCheck3 = worldIn.getBlockState(pos.north());
			if (stateCheck1.getBlock() instanceof BlockTilePF) {
				if (stateCheck1.getValue(BlockTilePF.FACING) == EnumFacing.EAST && !state.getValue(EAST)) {
					en = true;
				}
			}
			if (stateCheck2.getBlock() instanceof BlockTilePF) {
				if (stateCheck2.getValue(BlockTilePF.FACING) == EnumFacing.WEST && !state.getValue(WEST)) {
					wn = true;
				}
			}
			if (stateCheck3.getBlock() instanceof BlockTilePF) {
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.EAST && !state.getValue(EAST)) {
					wn = true;
				}
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.WEST && !state.getValue(WEST)) {
					en = true;
				}
			}
		}

		if (!state.getValue(SOUTH)) {
			stateCheck1 = worldIn.getBlockState(pos.south().east());
			stateCheck2 = worldIn.getBlockState(pos.south().west());
			stateCheck3 = worldIn.getBlockState(pos.south());
			if (stateCheck1.getBlock() instanceof BlockTilePF) {
				if (stateCheck1.getValue(BlockTilePF.FACING) == EnumFacing.EAST && !state.getValue(EAST)) {
					es = true;
				}
			}
			if (stateCheck2.getBlock() instanceof BlockTilePF) {
				if (stateCheck2.getValue(BlockTilePF.FACING) == EnumFacing.WEST && !state.getValue(WEST)) {
					ws = true;
				}
			}
			if (stateCheck3.getBlock() instanceof BlockTilePF) {
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.EAST && !state.getValue(WEST)) {
					ws = true;
				}
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.WEST && !state.getValue(EAST)) {
					es = true;
				}
			}
		}

		if (!state.getValue(WEST)) {
			stateCheck1 = worldIn.getBlockState(pos.west().north());
			stateCheck2 = worldIn.getBlockState(pos.west().south());
			stateCheck3 = worldIn.getBlockState(pos.west());
			if (stateCheck1.getBlock() instanceof BlockTilePF) {
				if (stateCheck1.getValue(BlockTilePF.FACING) == EnumFacing.NORTH && !state.getValue(NORTH)) {
					nw = true;
				}
			}
			if (stateCheck2.getBlock() instanceof BlockTilePF) {
				if (stateCheck2.getValue(BlockTilePF.FACING) == EnumFacing.SOUTH && !state.getValue(SOUTH)) {
					sw = true;
				}
			}
			if (stateCheck3.getBlock() instanceof BlockTilePF) {
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.SOUTH && !state.getValue(NORTH)) {
					nw = true;
				}
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.NORTH && !state.getValue(SOUTH)) {
					sw = true;
				}
			}
		}

		if (!state.getValue(EAST)) {
			stateCheck1 = worldIn.getBlockState(pos.east().north());
			stateCheck2 = worldIn.getBlockState(pos.east().south());
			stateCheck3 = worldIn.getBlockState(pos.east());
			if (stateCheck1.getBlock() instanceof BlockTilePF) {
				if (stateCheck1.getValue(BlockTilePF.FACING) == EnumFacing.NORTH && !state.getValue(NORTH)) {
					ne = true;
				}
			}
			if (stateCheck2.getBlock() instanceof BlockTilePF) {
				if (stateCheck2.getValue(BlockTilePF.FACING) == EnumFacing.SOUTH && !state.getValue(SOUTH)) {
					se = true;
				}
			}
			if (stateCheck3.getBlock() instanceof BlockTilePF) {
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.SOUTH && !state.getValue(NORTH)) {
					ne = true;
				}
				if (stateCheck3.getValue(BlockTilePF.FACING) == EnumFacing.NORTH && !state.getValue(SOUTH)) {
					se = true;
				}
			}
		}

		return state
				.withProperty(UP, worldIn.getBlockState(pos.up()).getBlock() == this)
				.withProperty(DOWN, worldIn.getBlockState(pos.down()).getBlock() == this)
				.withProperty(NORTH_EAST, ne)
				.withProperty(NORTH_WEST, nw)
				.withProperty(EAST_NORTH, en)
				.withProperty(EAST_SOUTH, es)
				.withProperty(SOUTH_EAST, se)
				.withProperty(SOUTH_WEST, sw)
				.withProperty(WEST_SOUTH, ws)
				.withProperty(WEST_NORTH, wn);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	{
		if (!isActualState)
		{
			state = this.getActualState(state, worldIn, pos);
		}

		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[0]);

		if (((Boolean)state.getValue(NORTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.NORTH)]);
		}

		if (((Boolean)state.getValue(SOUTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.SOUTH)]);
		}

		if (((Boolean)state.getValue(EAST)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.EAST)]);
		}

		if (((Boolean)state.getValue(WEST)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_BY_INDEX[getBoundingBoxIndex(EnumFacing.WEST)]);
		}

		if (((Boolean)state.getValue(SOUTH_EAST)).booleanValue() || ((Boolean)state.getValue(EAST_SOUTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHEAST);
		}

		if (((Boolean)state.getValue(SOUTH_WEST)).booleanValue() || ((Boolean)state.getValue(WEST_SOUTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHWEST);
		}

		if (((Boolean)state.getValue(NORTH_EAST)).booleanValue() || ((Boolean)state.getValue(EAST_NORTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHEAST);
		}

		if (((Boolean)state.getValue(NORTH_WEST)).booleanValue() || ((Boolean)state.getValue(WEST_NORTH)).booleanValue())
		{
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHWEST);
		}

	}

	private static int getBoundingBoxIndex(EnumFacing p_185729_0_)
	{
		return 1 << p_185729_0_.getHorizontalIndex();
	}

	private static int getBoundingBoxIndex(IBlockState state)
	{
		int i = 0;

		if (((Boolean)state.getValue(NORTH)).booleanValue())
		{
			i |= getBoundingBoxIndex(EnumFacing.NORTH);
		}

		if (((Boolean)state.getValue(EAST)).booleanValue())
		{
			i |= getBoundingBoxIndex(EnumFacing.EAST);
		}

		if (((Boolean)state.getValue(SOUTH)).booleanValue())
		{
			i |= getBoundingBoxIndex(EnumFacing.SOUTH);
		}

		if (((Boolean)state.getValue(WEST)).booleanValue())
		{
			i |= getBoundingBoxIndex(EnumFacing.WEST);
		}

		return i;
	}

	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, WEST, SOUTH, UP, DOWN, NORTH_EAST, NORTH_WEST, EAST_NORTH, EAST_SOUTH, SOUTH_EAST, SOUTH_WEST, WEST_SOUTH, WEST_NORTH});
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer() {
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
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.SILVER;
	}


}

