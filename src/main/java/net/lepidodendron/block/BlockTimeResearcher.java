
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITimeResearcher;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTimeResearcher extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher")
	public static final Block block = null;

	public BlockTimeResearcher(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("time_researcher"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTimeResearcher.class, "lepidodendron:tileentitytime_researcher");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:time_researcher", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_time_researcher");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTimeResearcher.TileEntityTimeResearcher();
		}

		public BlockTimeResearcher.TileEntityTimeResearcher createNewTileEntity(World worldIn, int meta) {
			return new BlockTimeResearcher.TileEntityTimeResearcher();
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
				if (tileentity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTimeResearcher.TileEntityTimeResearcher) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITimeResearcher.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(this, 1).getItem());
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, RF});
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockTimeResearcherHopper.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}
			if (worldIn.getBlockState(pos.down()).getBlock() != BlockTimeResearcherDispenser.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}
			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY())).getBlock() != BlockTimeResearcherFinderTop.block) {
				worldIn.destroyBlock(pos, false);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP || face == EnumFacing.DOWN) {
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
	}

	public static class TileEntityTimeResearcher extends TileEntityLockableLoot implements ITickable, ISidedInventory, IEnergyStorage {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 20;

		public int maxResearch = Math.max(0, LepidodendronConfig.maxResearch);

		public int dimPrecambrian;
		public int dimCambrian;
		public int dimOrdovician;
		public int dimSilurian;
		public int dimDevonian;
		public int dimCarboniferous;
		public int dimPermian;
		public int dimTriassic;
		public int dimJurassic;
		public int dimCretaceousEarly;
		public int dimCretaceousLate;
		public int dimPaleogene;
		public int dimNeogene;
		public int dimPleistocene;

		public float getResearchPercent(int dimIn) {
			if (maxResearch <= 0) {
				return 100;
			}
			switch (dimIn) {
				case 1: default:
					return ((float)dimPrecambrian) / ((float)maxResearch);

				case 2:
					return ((float)dimCambrian) / ((float)maxResearch);

				case 3:
					return ((float)dimOrdovician) / ((float)maxResearch);

				case 4:
					return ((float)dimSilurian) / ((float)maxResearch);

				case 5:
					return ((float)dimDevonian) / ((float)maxResearch);

				case 6:
					return ((float)dimCarboniferous) / ((float)maxResearch);

				case 7:
					return ((float)dimPermian) / ((float)maxResearch);

				case 8:
					return ((float)dimTriassic) / ((float)maxResearch);

				case 9:
					return ((float)dimJurassic) / ((float)maxResearch);

				case 10:
					return ((float)dimCretaceousEarly) / ((float)maxResearch);

				case 11:
					return ((float)dimCretaceousLate) / ((float)maxResearch);

				case 12:
					return ((float)dimPaleogene) / ((float)maxResearch);

				case 13:
					return ((float)dimNeogene) / ((float)maxResearch);

				case 14:
					return ((float)dimPleistocene) / ((float)maxResearch);

			}
		}

		public boolean canStartProcess() {

			if (this.isProcessing) {
				return false;
			}
			if (isItemValidForSlot(0, this.getStackInSlot(0))
				&& (this.getStackInSlot(1).isEmpty()
			 		|| this.getStackInSlot(1).getCount() < this.getStackInSlot(1).getMaxStackSize()
				)
			) {
				return true;
			}
			return false;
		}

		public double progressFraction() {
			if (this.isProcessing) {
				return (double)this.processTick / (double)this.processTickTime;
			}
			return 0;
		}

		public boolean isProcessing() {
			return this.isProcessing;
		}

		public boolean isEmpty()
		{
			for (ItemStack itemstack : this.forgeContents)
			{
				if (!itemstack.isEmpty())
				{
					return false;
				}
			}

			return true;
		}

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			if (!(isItemValidForSlot(0, this.getStackInSlot(0))
				&& (this.getStackInSlot(1).isEmpty()
					|| this.getStackInSlot(1).getCount() < this.getStackInSlot(1).getMaxStackSize()
				)
			)) {
				this.processTick = 0;
				this.isProcessing = false;
				return;
			}

			if (this.canStartProcess()) {
				this.processTick = 0;
				this.isProcessing = true;
			}

			if (this.isProcessing) {
				this.processTick ++;
			}

			if (this.isProcessing && this.processTick > this.processTickTime) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.isProcessing = false;
				if (isItemValidForSlot(0, this.getStackInSlot(0))
						&& (this.getStackInSlot(1).isEmpty()
						|| this.getStackInSlot(1).getCount() < this.getStackInSlot(1).getMaxStackSize()
					)
				) {
					ItemStack stackProcessing = this.getStackInSlot(0);
					//Assign knowledge:
					if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)
						&& this.dimPrecambrian < this.maxResearch) {
						this.dimPrecambrian ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)
							&& this.dimCambrian < this.maxResearch) {
						this.dimCambrian ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)
							&& this.dimOrdovician < this.maxResearch) {
						this.dimOrdovician ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)
							&& this.dimSilurian < this.maxResearch) {
						this.dimSilurian ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)
							&& this.dimDevonian < this.maxResearch) {
						this.dimDevonian ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)
							&& this.dimCarboniferous < this.maxResearch) {
						this.dimCarboniferous ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPermian.block)
							&& this.dimPermian < this.maxResearch) {
						this.dimPermian ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)
							&& this.dimTriassic < this.maxResearch) {
						this.dimTriassic ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)
							&& this.dimJurassic < this.maxResearch) {
						this.dimJurassic ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)) {
						if (world.rand.nextBoolean()) {
							if (this.dimCretaceousEarly < this.maxResearch) {
								this.dimCretaceousEarly++;
							}
						}
						else {
							if (this.dimCretaceousLate < this.maxResearch) {
								this.dimCretaceousLate++;
							}
						}
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)
							&& this.dimPaleogene < this.maxResearch) {
						this.dimPaleogene ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)
							&& this.dimNeogene < this.maxResearch) {
						this.dimNeogene ++;
					}
					else if (stackProcessing.getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)
							&& this.dimPleistocene < this.maxResearch) {
						this.dimPleistocene ++;
					}
					stackProcessing.shrink(1);
					if (this.getStackInSlot(1).isEmpty()) {
						this.setInventorySlotContents(1, new ItemStack(Blocks.GRAVEL, 1));
					}
					else {
						this.setInventorySlotContents(1, new ItemStack(Blocks.GRAVEL, this.getStackInSlot(1).getCount() + 1));
					}
					this.notifyBlockUpdate();
				}
			}
			markDirty();
		}

		public boolean getProcessing() {
			return this.isProcessing;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 2;
		}

		@Override
		public String getName() {
			return "container.time_researcher";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_time_researcher";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUITimeResearcher.GUILepidodendronTimeResearcher(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("dimPrecambrian")) {
				this.dimPrecambrian = compound.getInteger("dimPrecambrian");
			}
			if (compound.hasKey("dimCambrian")) {
				this.dimCambrian = compound.getInteger("dimCambrian");
			}
			if (compound.hasKey("dimOrdovician")) {
				this.dimOrdovician = compound.getInteger("dimOrdovician");
			}
			if (compound.hasKey("dimSilurian")) {
				this.dimSilurian = compound.getInteger("dimSilurian");
			}
			if (compound.hasKey("dimDevonian")) {
				this.dimDevonian = compound.getInteger("dimDevonian");
			}
			if (compound.hasKey("dimCarboniferous")) {
				this.dimCarboniferous = compound.getInteger("dimCarboniferous");
			}
			if (compound.hasKey("dimPermian")) {
				this.dimPermian = compound.getInteger("dimPermian");
			}
			if (compound.hasKey("dimTriassic")) {
				this.dimTriassic = compound.getInteger("dimTriassic");
			}
			if (compound.hasKey("dimJurassic")) {
				this.dimJurassic = compound.getInteger("dimJurassic");
			}
			if (compound.hasKey("dimCretaceousEarly")) {
				this.dimCretaceousEarly = compound.getInteger("dimCretaceousEarly");
			}
			if (compound.hasKey("dimCretaceousLate")) {
				this.dimCretaceousLate = compound.getInteger("dimCretaceousLate");
			}
			if (compound.hasKey("dimPaleogene")) {
				this.dimPaleogene = compound.getInteger("dimPaleogene");
			}
			if (compound.hasKey("dimNeogene")) {
				this.dimNeogene = compound.getInteger("dimNeogene");
			}
			if (compound.hasKey("dimPleistocene")) {
				this.dimPleistocene = compound.getInteger("dimPleistocene");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			compound.setInteger("dimPrecambrian", this.dimPrecambrian);
			compound.setInteger("dimCambrian", this.dimCambrian);
			compound.setInteger("dimOrdovician", this.dimOrdovician);
			compound.setInteger("dimSilurian", this.dimSilurian);
			compound.setInteger("dimDevonian", this.dimDevonian);
			compound.setInteger("dimCarboniferous", this.dimCarboniferous);
			compound.setInteger("dimPermian", this.dimPermian);
			compound.setInteger("dimTriassic", this.dimTriassic);
			compound.setInteger("dimJurassic", this.dimJurassic);
			compound.setInteger("dimCretaceousEarly", this.dimCretaceousEarly);
			compound.setInteger("dimCretaceousLate", this.dimCretaceousLate);
			compound.setInteger("dimPaleogene", this.dimPaleogene);
			compound.setInteger("dimNeogene", this.dimNeogene);
			compound.setInteger("dimPleistocene", this.dimPleistocene);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
			return compound;
		}

		public void notifyBlockUpdate() {
			//this.getWorld().notifyNeighborsOfStateChange(this.getPos(), this.getBlockType(), true);
			this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
			//this.getWorld().markBlockRangeForRenderUpdate(this.getPos(), this.getPos());
		}

		@Override
		public void markDirty() {
			super.markDirty();
			//notifyBlockUpdate();
		}

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
		{
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
			this.getWorld().markBlockRangeForRenderUpdate(this.pos, this.pos);
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public void invalidate()
		{
			super.invalidate();
			this.updateContainingBlockInfo();
		}

		@Override
		protected NonNullList<ItemStack> getItems()
		{
			return this.forgeContents;
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[]{0,1};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (index == 0) { //Fossil
				return isItemValidForSlot(index, itemStackIn);
			}
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (index == 1) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0) {
				Block item = Block.getBlockFromItem(stack.getItem());
				if (item == BlockFossilPrecambrian.block
						|| item == BlockFossilCambrian.block
						|| item == BlockFossilOrdovician.block
						|| item == BlockFossilSilurian.block
						|| item == BlockFossilDevonian.block
						|| item == BlockFossilCarboniferous.block
						|| item == BlockFossilPermian.block
						|| item == BlockFossilTriassic.block
						|| item == BlockFossilJurassic.block
						|| item == BlockFossilCretaceous.block
						|| item == BlockFossilPaleogene.block
						|| item == BlockFossilNeogene.block
						|| item == BlockFossilPleistocene.block) {
					return true;
				}
				return false;
			}
			if (index == 1)
				return false;

			return false;
		}

		net.minecraftforge.items.IItemHandler handlerUp = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.UP);
		net.minecraftforge.items.IItemHandler handlerDown = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.DOWN);
		net.minecraftforge.items.IItemHandler handlerNorth = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.NORTH);
		net.minecraftforge.items.IItemHandler handlerSouth = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.SOUTH);
		net.minecraftforge.items.IItemHandler handlerEast = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.EAST);
		net.minecraftforge.items.IItemHandler handlerWest = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, EnumFacing.WEST);

		@Nullable
		@Override
		public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
			EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockTimeResearcher.BlockCustom.FACING).getOpposite();
			if (capability == CapabilityEnergy.ENERGY) {
				return (facing == blockFacing) ? (T) this : null;
			}
			else if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
				if (facing == EnumFacing.UP) {
					return (T) handlerUp;
				}
				if (facing == EnumFacing.DOWN) {
					return (T) handlerDown;
				}
				if (facing == EnumFacing.NORTH) {
					return (T) handlerNorth;
				}
				if (facing == EnumFacing.SOUTH) {
					return (T) handlerSouth;
				}
				if (facing == EnumFacing.EAST) {
					return (T) handlerEast;
				}
				if (facing == EnumFacing.WEST) {
					return (T) handlerWest;
				}

			}
			return super.getCapability(capability, facing);
		}

		public void drainEnergy(int energy) {
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					te.extractEnergy(energy,false);
				}
			}
		}

		public boolean hasEnergy(int minEnergy) {
			if (!LepidodendronConfig.machinesRF) {
				return true;
			}
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
					BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
					return te.getEnergyStored() > minEnergy;
				}
			}
			return false;
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