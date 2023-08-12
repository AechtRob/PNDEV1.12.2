
package net.lepidodendron.block.base;

import net.lepidodendron.ElementsLepidodendronMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTilePF extends Block {
	public static final PropertyDirection FACING = BlockDirectional.FACING;

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyBool NORTHEAST = PropertyBool.create("northeast");
	public static final PropertyBool NORTHWEST = PropertyBool.create("northwest");
	public static final PropertyBool SOUTHEAST = PropertyBool.create("southeast");
	public static final PropertyBool SOUTHWEST = PropertyBool.create("southwest");

	protected static final AxisAlignedBB AABB_NORTHEAST = new AxisAlignedBB(1.0, 0, -0.5, 1.5, 0.1D, 0.0);
	protected static final AxisAlignedBB AABB_NORTHWEST = new AxisAlignedBB(-0.5, 0, -0.5, 0.0, 0.1D, 0.0);
	protected static final AxisAlignedBB AABB_SOUTHEAST = new AxisAlignedBB(1.0, 0, 1.0, 1.5, 0.1D, 1.5);
	protected static final AxisAlignedBB AABB_SOUTHWEST = new AxisAlignedBB(-0.5, 0, 1.0, 0.0, 0.1D, 1.5);
	protected static final AxisAlignedBB AABB_NORTH = new AxisAlignedBB(0.0D, 0D, -0.5D, 1.0D, 0.1D, 0.0);//
	protected static final AxisAlignedBB AABB_SOUTH = new AxisAlignedBB(0.0D, 0D, 1.0D, 1.0D, 0.1D, 1.5);//
	protected static final AxisAlignedBB AABB_EAST = new AxisAlignedBB(1.0, 0D, 0.0, 1.5, 0.1D, 1.0);//
	protected static final AxisAlignedBB AABB_WEST = new AxisAlignedBB(-0.5, 0D, 0.0, 0.0, 0.1D, 1.0);//

	protected static final AxisAlignedBB AABB_NORTHEAST_TOP = new AxisAlignedBB(1.0, 0.9D, -0.5, 1.5, 1.0D, 0.0);
	protected static final AxisAlignedBB AABB_NORTHWEST_TOP = new AxisAlignedBB(-0.5, 0.9D, -0.5, 0.0, 1.0D, 0.0);
	protected static final AxisAlignedBB AABB_SOUTHEAST_TOP = new AxisAlignedBB(1.0, 0.9D, 1.0, 1.5, 1.0D, 1.5);
	protected static final AxisAlignedBB AABB_SOUTHWEST_TOP = new AxisAlignedBB(-0.5, 0.9D, 1.0, 0.0, 1.0D, 1.5);
	protected static final AxisAlignedBB AABB_NORTH_TOP = new AxisAlignedBB(0.0D, 0.9D, -0.5D, 1.0D, 1.0D, 0.0);//
	protected static final AxisAlignedBB AABB_SOUTH_TOP = new AxisAlignedBB(0.0D, 0.9D, 1.0D, 1.0D, 1.0D, 1.5);//
	protected static final AxisAlignedBB AABB_EAST_TOP = new AxisAlignedBB(1.0, 0.9D, 0.0, 1.5, 1.0D, 1.0);//
	protected static final AxisAlignedBB AABB_WEST_TOP = new AxisAlignedBB(-0.5, 0.9D, 0.0, 0.0, 1.0D, 1.0);//


	public BlockTilePF() {
		super(Material.GLASS);
		setLightLevel(0F);
		setLightOpacity(0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
	}

	public boolean makesJoins() {
		return true;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	{
		super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn, isActualState);
		if (this.makesJoins()) {
			if (!isActualState)
			{
				state = this.getActualState(state, worldIn, pos);
			}
			if (state.getValue(FACING) == EnumFacing.UP) {
				if (state.getValue(NORTH)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTH);
				}
				if (state.getValue(EAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_EAST);
				}
				if (state.getValue(SOUTH)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTH);
				}
				if (state.getValue(WEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_WEST);
				}
				if (state.getValue(NORTHEAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHEAST);
				}
				if (state.getValue(NORTHWEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHWEST);
				}
				if (state.getValue(SOUTHEAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHEAST);
				}
				if (state.getValue(SOUTHWEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHWEST);
				}
			}
			if (state.getValue(FACING) == EnumFacing.DOWN) { //top
				if (state.getValue(NORTH)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTH_TOP);
				}
				if (state.getValue(EAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_EAST_TOP);
				}
				if (state.getValue(SOUTH)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTH_TOP);
				}
				if (state.getValue(WEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_WEST_TOP);
				}
				if (state.getValue(NORTHEAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHEAST_TOP);
				}
				if (state.getValue(NORTHWEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_NORTHWEST_TOP);
				}
				if (state.getValue(SOUTHEAST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHEAST_TOP);
				}
				if (state.getValue(SOUTHWEST)) {
					this.addCollisionBoxToList(pos, entityBox, collidingBoxes, AABB_SOUTHWEST_TOP);
				}
			}
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
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		state = super.getActualState(state, worldIn, pos);

		boolean north = false;
		boolean south = false;
		boolean east = false;
		boolean west = false;
		boolean northeast = false;
		boolean northwest = false;
		boolean southeast = false;
		boolean southwest = false;
		if (this.makesJoins()) {
			if (state.getValue(FACING) == EnumFacing.DOWN) {
				if (isFenceOrPane(worldIn, pos.north()) || (isFenceOrPane(worldIn, pos.north().up()) && worldIn.isAirBlock(pos.north()))) {
					north = true;
				}
				if (isFenceOrPane(worldIn, pos.south()) || (isFenceOrPane(worldIn, pos.south().up()) && worldIn.isAirBlock(pos.south()))) {
					south = true;
				}
				if (isFenceOrPane(worldIn, pos.east()) || (isFenceOrPane(worldIn, pos.east().up()) && worldIn.isAirBlock(pos.east()))) {
					east = true;
				}
				if (isFenceOrPane(worldIn, pos.west()) || (isFenceOrPane(worldIn, pos.west().up()) && worldIn.isAirBlock(pos.west()))) {
					west = true;
				}
				if (isFenceOrPane(worldIn, pos.north().east()) || (isFenceOrPane(worldIn, pos.north().east().up()) && worldIn.isAirBlock(pos.north().east()))) {
					northeast = true;
				}
				if (isFenceOrPane(worldIn, pos.north().west()) || (isFenceOrPane(worldIn, pos.north().west().up()) && worldIn.isAirBlock(pos.north().west()))) {
					northwest = true;
				}
				if (isFenceOrPane(worldIn, pos.south().east()) || (isFenceOrPane(worldIn, pos.south().east().up()) && worldIn.isAirBlock(pos.south().east()))) {
					southeast = true;
				}
				if (isFenceOrPane(worldIn, pos.south().west()) || (isFenceOrPane(worldIn, pos.south().west().up()) && worldIn.isAirBlock(pos.south().west()))) {
					southwest = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.UP) {
				if (isFenceOrPane(worldIn, pos.north()) || (isFenceOrPane(worldIn, pos.north().down()) && worldIn.isAirBlock(pos.north()))) {
					north = true;
				}
				if (isFenceOrPane(worldIn, pos.south()) || (isFenceOrPane(worldIn, pos.south().down()) && worldIn.isAirBlock(pos.south()))) {
					south = true;
				}
				if (isFenceOrPane(worldIn, pos.east()) || (isFenceOrPane(worldIn, pos.east().down()) && worldIn.isAirBlock(pos.east()))) {
					east = true;
				}
				if (isFenceOrPane(worldIn, pos.west()) || (isFenceOrPane(worldIn, pos.west().down()) && worldIn.isAirBlock(pos.west()))) {
					west = true;
				}
				if (isFenceOrPane(worldIn, pos.north().east()) || (isFenceOrPane(worldIn, pos.north().east().down()) && worldIn.isAirBlock(pos.north().east()))) {
					northeast = true;
				}
				if (isFenceOrPane(worldIn, pos.north().west()) || (isFenceOrPane(worldIn, pos.north().west().down()) && worldIn.isAirBlock(pos.north().west()))) {
					northwest = true;
				}
				if (isFenceOrPane(worldIn, pos.south().east()) || (isFenceOrPane(worldIn, pos.south().east().down()) && worldIn.isAirBlock(pos.south().east()))) {
					southeast = true;
				}
				if (isFenceOrPane(worldIn, pos.south().west()) || (isFenceOrPane(worldIn, pos.south().west().down()) && worldIn.isAirBlock(pos.south().west()))) {
					southwest = true;
				}
			}
		}
		return state.withProperty(NORTH, north).withProperty(SOUTH, south).withProperty(EAST, east).withProperty(WEST, west).withProperty(NORTHEAST, northeast).withProperty(NORTHWEST, northwest).withProperty(SOUTHEAST, southeast).withProperty(SOUTHWEST, southwest);
	}

	public static boolean isFenceOrPane(IBlockAccess world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		return (state.getBlock() instanceof BlockFence || state.getBlock() instanceof BlockPane);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
			case NORTH:
			default :
				return new AxisAlignedBB(0, 0D, 0.9D, 1, 1.0D, 1);
			case SOUTH:
				return new AxisAlignedBB(0, 0D, 0, 1, 1.0D, 0.1);
			case EAST:
				return new AxisAlignedBB(0, 0D, 0, 0.1, 1.0D, 1);
			case WEST:
				return new AxisAlignedBB(0.9D, 0D, 0, 1, 1.0D, 1);
			case UP :
				return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);
			case DOWN :
				return new AxisAlignedBB(0.0D, 0.9D, 0.0D, 1.0D, 1.0D, 1.0D);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
	{
		return true;
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
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[]{FACING, NORTH, SOUTH, EAST, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST});
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {

		EnumFacing enumfacing = EnumFacing.getDirectionFromEntityLiving(pos, placer);
		if (placer.rotationPitch < -50 || enumfacing == EnumFacing.DOWN) {
			if (hitY <= 0.5F && hitY > 0.0) {
				return this.getDefaultState().withProperty(FACING, EnumFacing.UP);
			}
			return this.getDefaultState().withProperty(FACING, EnumFacing.DOWN);
		}
		if (placer.rotationPitch > 50 || enumfacing == EnumFacing.UP) {
			if (hitY >= 0.5F && hitY < 1.0F) {
				return this.getDefaultState().withProperty(FACING, EnumFacing.DOWN);
			}
			return this.getDefaultState().withProperty(FACING, EnumFacing.UP);
		}

		enumfacing = EnumFacing.fromAngle((double)placer.rotationYaw);
		if (enumfacing == EnumFacing.NORTH) {
			if (hitZ >= 0.5F && hitZ < 1.0F) {
				return this.getDefaultState().withProperty(FACING, enumfacing);
			}
			else {
				return this.getDefaultState().withProperty(FACING, enumfacing.getOpposite());
			}
		}
		if (enumfacing == EnumFacing.SOUTH) {
			if (hitZ <= 0.5F && hitZ > 0.0F) {
				return this.getDefaultState().withProperty(FACING, enumfacing);
			}
			else {
				return this.getDefaultState().withProperty(FACING, enumfacing.getOpposite());
			}
		}
		if (enumfacing == EnumFacing.WEST) {
			if (hitX >= 0.5F && hitX < 1.0F) {
				return this.getDefaultState().withProperty(FACING, enumfacing);
			}
			else {
				return this.getDefaultState().withProperty(FACING, enumfacing.getOpposite());
			}
		}
		if (enumfacing == EnumFacing.EAST) {
			if (hitX <= 0.5F && hitX > 0.0F) {
				return this.getDefaultState().withProperty(FACING, enumfacing);
			}
			else {
				return this.getDefaultState().withProperty(FACING, enumfacing.getOpposite());
			}
		}

		return this.getDefaultState().withProperty(FACING, facing);
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
		if (state.getValue(FACING) == EnumFacing.NORTH && face == EnumFacing.SOUTH) {
			return BlockFaceShape.SOLID;
		}
		if (state.getValue(FACING) == EnumFacing.EAST && face == EnumFacing.WEST) {
			return BlockFaceShape.SOLID;
		}
		if (state.getValue(FACING) == EnumFacing.SOUTH && face == EnumFacing.NORTH) {
			return BlockFaceShape.SOLID;
		}
		if (state.getValue(FACING) == EnumFacing.WEST && face == EnumFacing.EAST) {
			return BlockFaceShape.SOLID;
		}
		if (state.getValue(FACING) == EnumFacing.UP && face == EnumFacing.DOWN) {
			return BlockFaceShape.SOLID;
		}
		if (state.getValue(FACING) == EnumFacing.DOWN && face == EnumFacing.UP) {
			return BlockFaceShape.SOLID;
		}

		return BlockFaceShape.UNDEFINED;
	}

}