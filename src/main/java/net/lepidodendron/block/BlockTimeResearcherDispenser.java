
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIPortalBlock;
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
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTimeResearcherDispenser extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher_dispenser")
	public static final Block block = null;

	public BlockTimeResearcherDispenser(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("time_researcher_dispenser"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTimeResearcherDispenser.class, "lepidodendron:tileentitytime_researcher_dispenser");
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:time_researcher_dispenser", "inventory"));
//	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_time_researcher_dispenser");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return BlockTimeResearcher.BlockCustom.dropStack(world, pos.up());
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser();
		}

		public BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser createNewTileEntity(World worldIn, int meta) {
			return new BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser();
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
				if (tileentity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileentity);
				}
				world.removeTileEntity(pos);
			}

			super.breakBlock(world, pos, state);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockTimeResearcher.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY())).getBlock() != BlockTimeResearcherFinderBottom.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}
		
		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIPortalBlock.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

	}

	public static class TileEntityTimeResearcherDispenser extends TileEntityLockableLoot implements ITickable, ISidedInventory, IEnergyStorage {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		private int dimensionSelected = -1;
		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 200; //10 seconds
		private int minEnergyNeeded = 200;

		public boolean canSelectDimension(int dimID) {
			TileEntity tileEntity = world.getTileEntity(pos.up());
			if (!(tileEntity instanceof BlockTimeResearcher.TileEntityTimeResearcher)) {
				return false;
			}
			BlockTimeResearcher.TileEntityTimeResearcher te = (BlockTimeResearcher.TileEntityTimeResearcher) tileEntity;
			switch (dimID) {
				case 0: default:
					return true;

				case 1:
					return Loader.isModLoaded("pnprecambrian")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 2:
					return Loader.isModLoaded("pncambrian")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 3:
					return Loader.isModLoaded("pnordovician")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 4:
					return Loader.isModLoaded("pnsilurian")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 5:
					return Loader.isModLoaded("pndevonian")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 6:
					return Loader.isModLoaded("pncarboniferous")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 7:
					return Loader.isModLoaded("pnpermian")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 8:
					return Loader.isModLoaded("pntriassic")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 9:
					return Loader.isModLoaded("pnjurassic")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 10:
					return Loader.isModLoaded("pncretaceousearly")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 11:
					return Loader.isModLoaded("pncretaceouslate")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 12:
					return Loader.isModLoaded("pnpaleogene")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 13:
					return Loader.isModLoaded("pnneogene")
							&& te.getResearchPercent(dimID) > te.portalResearch;

				case 14:
					return Loader.isModLoaded("pnpleistocene")
							&& te.getResearchPercent(dimID) > te.portalResearch;
			}
		}

		public void setPeriodLock(int period, boolean resetTicks) {
			dimensionSelected = period;
			if (resetTicks) {
				this.processTick = 0;
				this.isProcessing = false;
			}
		}

		public int getPeriodLock() {
			return this.dimensionSelected;
		}

		public boolean canStartProcess() {

			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}

			if (this.isProcessing) {
				return false;
			}
			if (isValidItemForProcess(this.getStackInSlot(0)) > 0 && this.isRoomForOutputStack()) {
				//System.err.println("canStartProcess");
				return true;
			}
			//System.err.println("cannotStartProcess");
			return false;
		}
		
		public int isValidItemForProcess(ItemStack stack) {
			if (this.isItemValidForSlot(0, stack)) {
				return this.processTickTime;
			}
			return -1;
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

			if (LepidodendronConfig.machinesRF) {
				TileEntity tileEntity = world.getTileEntity(this.pos);
				if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
					BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockTimeResearcherDispenser.BlockCustom.FACING);
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
									this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
								}
							}
						}
					}
				}
			}

			boolean updated = false;

			//System.err.println("Tick: " + this.processTick);
			//System.err.println("TickTotal: " + this.processTickTime);

			if (this.canStartProcess()) {
				this.processTick = 0;
				this.isProcessing = true;
				updated = true;
			}

			if (this.isProcessing && this.hasEnergy(minEnergyNeeded)) {
				this.processTick ++;
				this.drainEnergy(40);
				//if (this.getWorld().rand.nextInt(10) == 0) {
				//	world.playSound(null, pos, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F, 0.8F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
				//}
				updated = true;
			}

			if (!this.isRoomForOutputStack() || this.dimensionSelected < 0 || (!canSelectDimension(this.dimensionSelected))) {
				this.processTick = 0;
				this.isProcessing = false;
				this.dimensionSelected = -1;
			}

			if (this.isProcessing && ((this.isRoomForOutputStack() && this.processTick > this.processTickTime) || !(isValidItemForProcess(this.getStackInSlot(0)) > 0))) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.isProcessing = false;
				//move to output:
				if (isValidItemForProcess(this.getStackInSlot(0)) > 0) {
					ItemStack stackProcessing = this.getStackInSlot(0);
					stackProcessing.shrink(1);
					switch (this.dimensionSelected) {
						case 0: default:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockOverworld.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 1:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockPrecambrian.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 2:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockCambrian.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 3:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockOrdovician.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 4:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockSilurian.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 5:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockDevonian.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 6:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockCarboniferous.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 7:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockPermian.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 8:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockTriassic.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 9:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockJurassic.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 10:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockCretaceousEarly.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 11:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockCretaceousLate.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 12:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockPaleogene.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 13:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockNeogene.block, 1 + this.getStackInSlot(1).getCount()));
							break;

						case 14:
							this.setInventorySlotContents(1, new ItemStack(BlockPortalBlockPleistocene.block, 1 + this.getStackInSlot(1).getCount()));
							break;

					}
					this.dimensionSelected = -1;
				}
				updated = true;
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		public boolean isRoomForOutputStack() {
			if (this.getStackInSlot(1).isEmpty()) {
				return true;
			}
			if ((!this.getStackInSlot(1).isEmpty()) && !(Block.getBlockFromItem(this.getStackInSlot(1).getItem()) instanceof BlockPortalBlock)) {
				return false;
			}
			if ((this.getStackInSlot(1).getCount() + 1) <= 64) {
				switch (this.dimensionSelected) {
					case 0:
					default:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockOverworld.block;

					case 1:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockPrecambrian.block;

					case 2:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockCambrian.block;

					case 3:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockOrdovician.block;

					case 4:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockSilurian.block;

					case 5:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockDevonian.block;

					case 6:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockCarboniferous.block;

					case 7:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockPermian.block;

					case 8:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockTriassic.block;

					case 9:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockJurassic.block;

					case 10:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockCretaceousEarly.block;

					case 11:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockCretaceousLate.block;

					case 12:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockPaleogene.block;

					case 13:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockNeogene.block;

					case 14:
						return Block.getBlockFromItem(this.getStackInSlot(1).getItem()) == BlockPortalBlockPleistocene.block;
				}

			}
			if (this.getStackInSlot(1).isEmpty()) {
				return true;
			}
			return false;
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
			return "container.time_researcher_dispenser";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_time_researcher_dispenser";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("energystored")) {
				this.energy = compound.getInteger("energystored");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
			this.dimensionSelected = compound.getInteger("dimensionSelected");
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("energystored", this.energy);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
			compound.setInteger("dimensionSelected", this.dimensionSelected);
			return compound;
		}

		private void notifyBlockUpdate() {
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
			if (index == 0) {
				return Block.getBlockFromItem(itemStackIn.getItem()) instanceof BlockPortalBlock;
			}
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return index == 1;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0) {
				return Block.getBlockFromItem(stack.getItem()) instanceof BlockPortalBlock;
			}
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
			if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
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
				if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
					BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
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
				if (tileEntity instanceof BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) {
					BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser te = (BlockTimeResearcherDispenser.TileEntityTimeResearcherDispenser) tileEntity;
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
				if (blockstate.getBlock() == BlockTimeResearcherDispenser.block) {
					EnumFacing blockFacing = blockstate.getValue(BlockTimeResearcherDispenser.BlockCustom.FACING).getOpposite();
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