
package net.lepidodendron.block.base;

import net.lepidodendron.block.BlockAraucarioxylonLogPetrified;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockLitterbinPF extends Block implements ITileEntityProvider {

	public static final PropertyInteger VARIANT = PropertyInteger.create("variant", 0, 15);

	public BlockLitterbinPF() {
		super(Material.WOOD);
		setSoundType(SoundType.WOOD);
		setHarvestLevel("axe", 1);
		setHardness(2F);
		setResistance(3F);
		setCreativeTab(TabLepidodendronBuilding.tab);
		setTickRandomly(true);
	}

	protected static final AxisAlignedBB AABBNORTH = new AxisAlignedBB(0.0D, 0.0D, 0.1D, 1.0D, 0.95D, 0.1D);
	protected static final AxisAlignedBB AABBEAST = new AxisAlignedBB(0.9D, 0.0D, 0.0D, 0.9D, 0.95D, 1.0D);
	protected static final AxisAlignedBB AABBSOUTH = new AxisAlignedBB(0.0D, 0.0D, 0.9D, 1.0D, 0.95D, 0.9D);
	protected static final AxisAlignedBB AABBWEST = new AxisAlignedBB(0.1D, 0.0D, 0.0D, 0.1D, 0.95D, 1.0D);
	protected static final AxisAlignedBB AABBBOTTOM = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.01D, 1.0D);

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 5;
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
		return MapColor.WOOD;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBNORTH);
		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBEAST);
		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBSOUTH);
		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBWEST);
		addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBBOTTOM);
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
			else if (playerIn.getHeldItemMainhand().getItem() == (new ItemStack(Items.DYE, 1)).getItem()) {
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
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemAnthracite.block, (int) (1)).getItem()){
				enumUsed = 13;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSalt.block, (int) (1)).getItem()){
				enumUsed = 14;
			}
			else if (playerIn.getHeldItemMainhand().getItem() == new ItemStack(ItemSulphur.block, (int) (1)).getItem()){
				enumUsed = 15;
			}

			if (enumUsed > 0) {
				ItemStack itemstack = playerIn.getHeldItem(hand);
				if (!playerIn.isCreative()) {
					itemstack.shrink(1);
				}

				worldIn.setBlockState(pos, this.getDefaultState().withProperty(VARIANT, enumUsed));
				TileEntity te = worldIn.getTileEntity(pos);
				if (te !=  null) {
					if (te instanceof BlockLitterbinPF.TileEntityLitterbin) {
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
		int variant = new Object() {
			public int getValue(BlockPos pos1, String tag) {
				TileEntity tileEntity = worldIn.getTileEntity(pos1);
				if (tileEntity != null)
					return tileEntity.getTileData().getInteger(tag);
				return 0;
			}
		}.getValue(pos, "variant");

		return state.withProperty(VARIANT, variant);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[]{VARIANT});
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState();
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
		if (face == EnumFacing.DOWN) {
			return BlockFaceShape.SOLID;
		}
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
		return new TileEntityLitterbin();
	}

	@Override
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
		super.eventReceived(state, worldIn, pos, eventID, eventParam);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		super.randomTick(worldIn, pos, state, random);
		List<EntityItem> Entities = worldIn.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(pos, pos));
		for (EntityItem currentEntity : Entities) {
			//Check it's inside the bin, and if so, kill it:
			if (currentEntity instanceof EntityItem) {
				double xx = currentEntity.posX - currentEntity.getPosition().getX();
				double yy = currentEntity.posY - currentEntity.getPosition().getY();
				double zz = currentEntity.posZ - currentEntity.getPosition().getZ();
				if (xx >= 0.2 && xx <= 0.8) {
					if (zz >= 0.2 && zz <= 0.8) {
						if (yy <= 0.6) {
							currentEntity.setDead();
						}
					}
				}
			}
		}
	}

	public static class TileEntityLitterbin extends TileEntity {

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


