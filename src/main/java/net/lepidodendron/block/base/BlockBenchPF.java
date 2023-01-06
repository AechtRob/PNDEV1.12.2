
package net.lepidodendron.block.base;

import net.lepidodendron.block.BlockAraucarioxylonLogPetrified;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class BlockBenchPF extends Block implements ITileEntityProvider {

	public static final PropertyDirection FACING = BlockDirectional.FACING;
	public static final PropertyBool LEFT = PropertyBool.create("left");
	public static final PropertyBool RIGHT = PropertyBool.create("right");
	public static final PropertyInteger VARIANT = PropertyInteger.create("variant", 0, 15);

	public BlockBenchPF() {
		super(Material.WOOD, MapColor.WOOD);
		setHarvestLevel("axe", 1);
		setSoundType(SoundType.WOOD);
		setHardness(2F);
		setResistance(3F);
		setLightOpacity(0);
		setCreativeTab(null);
		setCreativeTab(TabLepidodendronBuilding.tab);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {

		if (!isActualState)
		{
			state = state.getActualState(worldIn, pos);
		}

		if (state.getValue(FACING) == EnumFacing.WEST) {
			//Seat:
			//From 5-6 px tall
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.4, 0.3125,  0 , 0.875, 0.375, 1));
			//Back-rest:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.875, 0.375, 0, 0.9375, 1, 1));
		}
		if (this.getActualState(state, worldIn, pos).getValue(FACING) == EnumFacing.EAST) {
			//Seat:
			//From 5-6 px tall
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0625, 0.3125, 0, 0.625, 0.375, 1));
			//Back-rest:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0625, 0.375, 0, 0.125, 1, 1));
		}

		if (state.getValue(FACING) == EnumFacing.NORTH) {
			//Seat:
			//From 5-6 px tall
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0, 0.3125, 0.4, 1, 0.375, 0.875));
			//Back-rest:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0.375, 0.875, 1, 1, 0.9375));

		}
		if (state.getValue(FACING) == EnumFacing.SOUTH) {
			//Seat:
			//From 5-6 px tall
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0, 0.3125, 0.0625, 1, 0.375, 0.625));
			//Back-rest:
			addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0.375, 0.0625, 1, 1, 0.125));

		}
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0, 0.0, 0, 1, 1, 1);
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 5;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		if (!playerIn.capabilities.allowEdit)
		{
			return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
		}
		else if (hand == EnumHand.MAIN_HAND) {
			int enumUsed = 0;
			if (playerIn.getHeldItemMainhand().getItem() == Items.IRON_NUGGET) {
				enumUsed = 1;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == Items.GOLD_NUGGET) {
				enumUsed = 2;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemZircon.block, 1).getItem()) {
				enumUsed = 3;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == Items.EMERALD) {
				enumUsed = 4;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == Items.DIAMOND) {
				enumUsed = 5;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemBalticAmberChunk.block, 1).getItem()) {
				enumUsed = 6;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemDominicanAmberChunk.block, 1).getItem()) {
				enumUsed = 7;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == Items.QUARTZ) {
				enumUsed = 8;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == (new ItemStack(Items.DYE, 1, 4)).getItem()) {
				if (playerIn.getHeldItem(hand).getMetadata() == 4) {
					enumUsed = 9;
				}
			}
			else if (playerIn.getHeldItemMainhand().getItem() == Items.COAL) {
				enumUsed = 10;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(BlockAraucarioxylonLogPetrified.block, 1).getItem()){
				enumUsed = 11;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(Blocks.REDSTONE_TORCH, 1).getItem()){
				enumUsed = 12;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemAnthracite.block, 1).getItem()) {
				enumUsed = 13;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSalt.block, 1).getItem()) {
				enumUsed = 14;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSulphur.block, 1).getItem()) {
				enumUsed = 15;
			}

			if (enumUsed > 0) {
				ItemStack itemstack = playerIn.getHeldItem(hand);
				if (!playerIn.isCreative()) {
					itemstack.shrink(1);
				}
				EnumFacing bsFacing = this.getActualState(state, worldIn, pos).getValue(FACING);
				boolean left = this.getActualState(state, worldIn, pos).getValue(LEFT);
				boolean right = this.getActualState(state, worldIn, pos).getValue(RIGHT);

				worldIn.setBlockState(pos, this.getDefaultState().withProperty(FACING, bsFacing).withProperty(LEFT, left).withProperty(RIGHT, right).withProperty(VARIANT, enumUsed));
				TileEntity te = worldIn.getTileEntity(pos);
				if (te !=  null) {
					if (te instanceof BlockBenchPF.TileEntityBench) {
						te.getTileData().setInteger("variant", enumUsed);
						worldIn.notifyBlockUpdate(pos, state, this.getActualState(state, worldIn, pos), 3);
					}
				}
				return true;
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		EnumFacing facing = state.getValue(FACING);
		if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
			facing = EnumFacing.NORTH;
		}

		//0. Wood base
		//1. Iron
		//2. Gold
		//3. Zircon
		//4. Emerald
		//5. Diamond
		//6. Baltic Amber
		//7. Dominican Amber
		//8. Quartz
		//9. Lapis
		//10. Coal
		//11. Petrified Wood
		//12. Redstone
		//13. Anthracite
		//14. Salt
		//15. Sulphur
		int variant = new Object() {
			public int getValue(BlockPos pos1, String tag) {
				TileEntity tileEntity = worldIn.getTileEntity(pos1);
				if (tileEntity != null)
					return tileEntity.getTileData().getInteger(tag);
				return 0;
			}
		}.getValue(pos, "variant");

		boolean left = false;
		boolean right = false;
		if (state.getValue(FACING) == EnumFacing.NORTH) {
			if (worldIn.getBlockState(pos.east()).getBlock() instanceof BlockBenchPF) {
				right = worldIn.getBlockState(pos.east()).getValue(FACING) == EnumFacing.NORTH;
			}
			if (worldIn.getBlockState(pos.west()).getBlock() instanceof BlockBenchPF) {
				left = worldIn.getBlockState(pos.west()).getValue(FACING) == EnumFacing.NORTH;
			}
		} else if (state.getValue(FACING) == EnumFacing.SOUTH) {
			if (worldIn.getBlockState(pos.east()).getBlock() instanceof BlockBenchPF) {
				left = worldIn.getBlockState(pos.east()).getValue(FACING) == EnumFacing.SOUTH;
			}
			if (worldIn.getBlockState(pos.west()).getBlock() instanceof BlockBenchPF) {
				right = worldIn.getBlockState(pos.west()).getValue(FACING) == EnumFacing.SOUTH;
			}
		} else if (state.getValue(FACING) == EnumFacing.WEST) {
			if (worldIn.getBlockState(pos.north()).getBlock() instanceof BlockBenchPF) {
				right = worldIn.getBlockState(pos.north()).getValue(FACING) == EnumFacing.WEST;
			}
			if (worldIn.getBlockState(pos.south()).getBlock() instanceof BlockBenchPF) {
				left = worldIn.getBlockState(pos.south()).getValue(FACING) == EnumFacing.WEST;
			}
		} else if (state.getValue(FACING) == EnumFacing.EAST) {
			if (worldIn.getBlockState(pos.north()).getBlock() instanceof BlockBenchPF) {
				left = worldIn.getBlockState(pos.north()).getValue(FACING) == EnumFacing.EAST;
			}
			if (worldIn.getBlockState(pos.south()).getBlock() instanceof BlockBenchPF) {
				right = worldIn.getBlockState(pos.south()).getValue(FACING) == EnumFacing.EAST;
			}
		}
		return state.withProperty(VARIANT, variant).withProperty(FACING, facing).withProperty(LEFT, !left).withProperty(RIGHT, !right);
	}

	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		//System.err.println("Placed by: " + placer);
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing enumfacing = EnumFacing.byIndex(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	@Override
	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[]{FACING, LEFT, RIGHT, VARIANT});
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
	public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
		return false;
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
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		TileEntity tileentity = world.getTileEntity(pos);
		world.removeTileEntity(pos);
		super.breakBlock(world, pos, state);
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
		if (!world.isRemote && !player.isCreative()) {
			int variant = this.getActualState(state, world, pos).getValue(VARIANT);
			if (variant > 0) {
				EntityItem entityToSpawn = null;
				if (variant == 1) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.IRON_NUGGET, (int) (1)));
				}
				else if (variant == 2) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GOLD_NUGGET, (int) (1)));
				}
				else if (variant == 3) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemZircon.block, (int) (1)));
				}
				else if (variant == 4) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD, (int) (1)));
				}
				else if (variant == 5) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND, (int) (1)));
				}
				else if (variant == 6) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemBalticAmberChunk.block, (int) (1)));
				}
				else if (variant == 7) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemDominicanAmberChunk.block, (int) (1)));
				}
				else if (variant == 8) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.QUARTZ, (int) (1)));
				}
				else if (variant == 9) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DYE, 1, 4));
				}
				else if (variant == 10) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.COAL, (int) (1)));
				}
				else if (variant == 11) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockAraucarioxylonLogPetrified.block, (int) (1)));
				}
				else if (variant == 12) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Blocks.REDSTONE_TORCH, (int) (1)));
				}
				else if (variant == 13) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemAnthracite.block, (int) (1)));
				}
				else if (variant == 14) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemSalt.block, (int) (1)));
				}
				else if (variant == 15) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemSulphur.block, (int) (1)));
				}
				if (entityToSpawn != null) {
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		return super.removedByPlayer(state, world, pos, player, willHarvest);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new BlockBenchPF.TileEntityBench();
	}

	@Override
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
		super.eventReceived(state, worldIn, pos, eventID, eventParam);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
	}


	public static class TileEntityBench extends TileEntity {

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
			return (oldState.getBlock() != newSate.getBlock());
		}

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
			this.readFromNBT(pkt.getNbtCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

	}
}


