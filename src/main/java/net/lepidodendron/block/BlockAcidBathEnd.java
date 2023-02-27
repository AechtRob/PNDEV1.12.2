
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemAcidBath;
import net.lepidodendron.item.ItemBottleOfAcidSulphuric;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAcidBathEnd extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acid_bath_end")
	public static final Block block = null;

	public BlockAcidBathEnd(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acid_bath);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("acid_bath_end"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockAcidBathEnd.TileEntityAcidBathEnd.class, "lepidodendron:tileentityacid_bath_end");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:acid_bath_end", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyInteger ACID = PropertyInteger.create("acid", 0, 15);

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_acid_bath_end");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH).withProperty(ACID, 0));
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockAcidBathEnd.TileEntityAcidBathEnd();
		}

		public BlockAcidBathEnd.TileEntityAcidBathEnd createNewTileEntity(World worldIn, int meta) {
			return new BlockAcidBathEnd.TileEntityAcidBathEnd();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		//NORTH
		protected static final AxisAlignedBB AABBN = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 0.9375D);

		//SOUTH
		protected static final AxisAlignedBB AABBS = new AxisAlignedBB(0.0D, 0.0D, 0.0625D, 1.0D, 0.875D, 1.0D);

		//EAST
		protected static final AxisAlignedBB AABBE = new AxisAlignedBB(0.0625D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

		//WEST
		protected static final AxisAlignedBB AABBW = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.9375D, 0.875D, 1.0D);

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				return AABBN;
			} else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				return AABBS;
			} else if (state.getValue(FACING) == EnumFacing.EAST) {
				return AABBE;
			} else if (state.getValue(FACING) == EnumFacing.WEST) {
				return AABBW;
			} else {
				return new AxisAlignedBB(0, 0, 0, 1, 1, 1);
			}
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN);
			} else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS);
			} else if (state.getValue(FACING) == EnumFacing.EAST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE);
			} else if (state.getValue(FACING) == EnumFacing.WEST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW);
			}

		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemAcidBath.block, 1);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING)));
			if (endState.getBlock() != BlockAcidBath.block) {
				worldIn.destroyBlock(pos, true);
				return;
			} else {
				if (endState.getValue(FACING) != state.getValue(FACING).getOpposite()) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockAcidBathEndUp.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}


		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos.offset(state.getValue(FACING)));
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
					BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					return state.withProperty(ACID, te.getFill());
				}
			}

			return state.withProperty(ACID, 0);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos.offset(blockState.getValue(FACING)));
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
					BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					return te.getFillFloor();
				}
			}
			return 0;
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, ACID});
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (state.getValue(FACING) == EnumFacing.NORTH && ((face == EnumFacing.SOUTH && LepidodendronConfig.machinesRF) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.SOUTH && ((face == EnumFacing.NORTH && LepidodendronConfig.machinesRF) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.EAST && ((face == EnumFacing.WEST && LepidodendronConfig.machinesRF) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
					|| state.getValue(FACING) == EnumFacing.WEST && ((face == EnumFacing.EAST && LepidodendronConfig.machinesRF) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
					|| face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			TileEntity te = worldIn.getTileEntity(pos.offset(state.getValue(FACING)));
			if (te == null || (!(te instanceof BlockAcidBath.TileEntityAcidBath))) {
				return false;
			}
			IFluidHandler handler = ((BlockAcidBath.TileEntityAcidBath) te).getCapabilityBucket(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, facing);
			ItemStack stack = playerIn.getHeldItem(hand);

			if (stack.getItem() == ItemBottleOfAcidSulphuric.block) {
				BlockAcidBath.TileEntityAcidBath bath = (BlockAcidBath.TileEntityAcidBath) te;
				if (bath.getCapacity() - bath.getFluidAmount() >= 333) {
					bath.fillInternal(new FluidStack(FluidRegistry.getFluid("pn_sulfuric_acid"), 333), true);
					SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_EMPTY;
					playerIn.getEntityWorld().playSound(playerIn, playerIn.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					if (!playerIn.isCreative()) {
						stack.shrink(1);
						ItemHandlerHelper.giveItemToPlayer(playerIn, new ItemStack(Items.GLASS_BOTTLE, 1));
					}
					return true;
				}
			}

			if (FluidUtil.getFluidContained(stack) != null) {
				if (FluidUtil.getFluidContained(stack).getFluid() != FluidRegistry.getFluid("pn_sulfuric_acid")) {
					return false;
				}
			}

			if (FluidUtil.interactWithFluidHandler(playerIn, hand, handler)) {
				return true;
			}

			return FluidUtil.getFluidHandler(stack) != null; //Stops buckets getting placed
		}
	}

	public static class TileEntityAcidBathEnd extends TileEntity implements ITickable, IEnergyStorage {

		@Override
		public void update() {
			if (LepidodendronConfig.machinesRF) {
				TileEntity tileEntity = world.getTileEntity(this.pos);
				if (tileEntity instanceof BlockAcidBathEnd.TileEntityAcidBathEnd) {
					BlockAcidBathEnd.TileEntityAcidBathEnd te = (BlockAcidBathEnd.TileEntityAcidBathEnd) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockAcidBathEnd.BlockCustom.FACING);
						BlockPos powerBlockPos = this.pos.offset(facing.getOpposite());
						TileEntity teStorage = this.getWorld().getTileEntity(powerBlockPos);
						if (teStorage != null) {
							IEnergyStorage powerBlockStorage = teStorage.getCapability(CapabilityEnergy.ENERGY, facing);
							if (powerBlockStorage != null) {
								if (powerBlockStorage.canExtract()) {
									int energyTransferOut = powerBlockStorage.extractEnergy(this.maxReceive, true);
									int energyTransferIn = this.receiveEnergy(energyTransferOut, true);
									powerBlockStorage.extractEnergy(energyTransferIn, false);
									this.receiveEnergy(energyTransferIn, false);
									//this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
								}
							}
						}
					}
				}
			}
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("energystored")) {
				this.energy = compound.getInteger("energystored");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("energystored", this.energy);
			return compound;
		}

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

		//Energy addin:
		//-------------
		protected int energy;
		protected int capacity = 50000;
		protected int maxReceive = 500;
		protected int maxExtract = 250;

		@Override
		public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
			IBlockState blockstate = this.getWorld().getBlockState(this.getPos());
			if (blockstate != null) {
				if (blockstate.getBlock() == BlockAcidBathEnd.block) {
					EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockAcidBathEnd.BlockCustom.FACING).getOpposite();
					if (capability == CapabilityEnergy.ENERGY && facing == blockFacing) {
						return true;
					}
				}
			}
			return super.hasCapability(capability, facing);
		}

		@Nullable
		@Override
		public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing)
		{
			EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockAcidBathEnd.BlockCustom.FACING).getOpposite();
			return (capability == CapabilityEnergy.ENERGY && facing == blockFacing) ? (T) this : null;
		}

		@Override
		public int receiveEnergy(int maxReceive, boolean simulate)
		{
			if (!canReceive())
				return 0;

			int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));
			if (!simulate) {
				energy += energyReceived;
				if (energyReceived > 0) {
					this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
			}
			return energyReceived;
		}

		@Override
		public int extractEnergy(int maxExtract, boolean simulate)
		{
			if (!canExtract())
				return 0;

			int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
			if (!simulate) {
				energy -= energyExtracted;
				if (energyExtracted > 0) {
					this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
			}
			return energyExtracted;
		}

		@Override
		public int getEnergyStored()
		{
			return energy;
		}

		@Override
		public int getMaxEnergyStored()
		{
			return capacity;
		}

		@Override
		public boolean canExtract()
		{
			return this.maxExtract > 0;
		}

		@Override
		public boolean canReceive()
		{
			return this.maxReceive > 0;
		}

		public double getEnergyFraction() {
			if (this.capacity > 0) {
				return ((double) this.energy) / ((double) this.capacity);
			}
			return 0;
		}

	}
}