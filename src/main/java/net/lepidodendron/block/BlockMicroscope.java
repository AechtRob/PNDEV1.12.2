
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IArchiveInvertebrate;
import net.lepidodendron.block.base.IArchivePlant;
import net.lepidodendron.block.base.IArchiveStatic;
import net.lepidodendron.block.base.IArchiveVertebrate;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIMicroscope;
import net.lepidodendron.item.*;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.IDimensionRestricted;
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
import net.minecraft.init.SoundEvents;
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
public class BlockMicroscope extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:microscope")
	public static final Block block = null;

	public BlockMicroscope(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.microscope);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("microscope"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityMicroscope.class, "lepidodendron:tileentitymicroscope");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:microscope", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_microscope");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockMicroscope.TileEntityMicroscope();
		}

		public BlockMicroscope.TileEntityMicroscope createNewTileEntity(World worldIn, int meta) {
			return new BlockMicroscope.TileEntityMicroscope();
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
				if (tileentity instanceof BlockMicroscope.TileEntityMicroscope) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockMicroscope.TileEntityMicroscope) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIMicroscope.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
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

	public static class TileEntityMicroscope extends TileEntityLockableLoot implements ITickable, ISidedInventory, IEnergyStorage {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 20;
		protected int periodLock;
		private int minEnergyNeeded = 600;

		public boolean canStartProcess() {

			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}
			
			if (this.isProcessing) {
				return false;
			}
			if (isItemValidForSlot(0, this.getStackInSlot(0))
				&& this.getStackInSlot(1).isEmpty()) {
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

			if (LepidodendronConfig.machinesRF) {
				TileEntity tileEntity = world.getTileEntity(this.pos);
				if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
					BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockMicroscope.BlockCustom.FACING);
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

			if (this.inputType(this.getStackInSlot(0)) == 1) {
				//Analysing raw fossils to get the mob type from them:
				boolean updated = false;
				setPeriodLock(0);

				if (this.canStartProcess()) {
					this.processTick = 0;
					this.isProcessing = true;
					updated = true;
				}

				if (this.isProcessing && this.hasEnergy(minEnergyNeeded)) {
					this.processTick++;
					this.drainEnergy(80);
					updated = true;
				}

				if (this.isProcessing && this.processTick > this.processTickTime) {
					//System.err.println("Ending process");
					this.processTick = 0;
					this.isProcessing = false;
					this.periodLock = 0;
					//move to output:
					String type = "";
					if (isItemValidForSlot(0, this.getStackInSlot(0))
							&& getStackInSlot(1).isEmpty()) {
						ItemStack stackProcessing = this.getStackInSlot(0);
						ItemStack outputStack = stackProcessing.copy();
						outputStack.setCount(1);
						stackProcessing.shrink(1);

						//Has this already been tagged somehow?
						if (outputStack.hasTagCompound()) {
							if (outputStack.getTagCompound().hasKey("PFPlant")) {
								NBTTagCompound plantNBT = new NBTTagCompound();
								plantNBT.setString("id", "");
								NBTTagCompound stackNBT = new NBTTagCompound();
								stackNBT.setTag("PFPlant", plantNBT);
								outputStack.setTagCompound(stackNBT);
								world.playSound(null, pos, SoundEvents.BLOCK_NOTE_PLING, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
								this.setInventorySlotContents(1, outputStack);
								markDirty();
								updated = true;
								return;
							}
							if (outputStack.getTagCompound().hasKey("PFMob")) {
								NBTTagCompound plantNBT = new NBTTagCompound();
								plantNBT.setString("id", "");
								NBTTagCompound stackNBT = new NBTTagCompound();
								stackNBT.setTag("PFMob", plantNBT);
								outputStack.setTagCompound(stackNBT);
								world.playSound(null, pos, SoundEvents.BLOCK_NOTE_PLING, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
								this.setInventorySlotContents(1, outputStack);
								markDirty();
								updated = true;
								return;
							}
							if (outputStack.getTagCompound().hasKey("PFStatic")) {
								NBTTagCompound plantNBT = new NBTTagCompound();
								plantNBT.setString("id", "");
								NBTTagCompound stackNBT = new NBTTagCompound();
								stackNBT.setTag("PFStatic", plantNBT);
								outputStack.setTagCompound(stackNBT);
								world.playSound(null, pos, SoundEvents.BLOCK_NOTE_PLING, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
								this.setInventorySlotContents(1, outputStack);
								markDirty();
								updated = true;
								return;
							}
						}

						//Copied logic from AcidBathUp:
						if (Math.random() > 0.55) { //Plants:
							if ((outputStack.getItem() == ItemFossilPrecambrian.block && (!(AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants().length >= 1)))
									|| (outputStack.getItem() == ItemFossilCambrian.block && (!(AcidBathOutputPlants.getCambrianCleanedFossilsPlants().length >= 1)))
							) {
								type = "PFStatic";
							} else {
								type = "PFPlant";
							}
						} else if (Math.random() > 0.4) { //Mobs:
							type = "PFMob";
						} else { //Static creatures
							type = "PFStatic";
						}
						NBTTagCompound plantNBT = new NBTTagCompound();
						plantNBT.setString("id", "");
						NBTTagCompound stackNBT = new NBTTagCompound();
						stackNBT.setTag(type, plantNBT);
						outputStack.setTagCompound(stackNBT);
						world.playSound(null, pos, SoundEvents.BLOCK_NOTE_PLING, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
						this.setInventorySlotContents(1, outputStack);
					}
					updated = true;
				}

				if (updated) {
					this.notifyBlockUpdate();
				}
				markDirty();
			}

			else if (this.inputType(this.getStackInSlot(0)) == 2) {
				//Tagging with a period:
				boolean updated = false;

				if (this.canStartProcess() && this.periodLock != 0) {
					this.processTick = 0;
					this.isProcessing = true;
					updated = true;
				}

				if (this.isProcessing) {
					this.processTick++;
					updated = true;
				}

				if (this.isProcessing && this.processTick > this.processTickTime) {
					//System.err.println("Ending process");
					this.processTick = 0;
					this.isProcessing = false;
					//move to output:
					if (isItemValidForSlot(0, this.getStackInSlot(0))
							&& getStackInSlot(1).isEmpty()) {
						ItemStack stackProcessing = this.getStackInSlot(0);
						ItemStack outputStack = stackProcessing.copy();
						outputStack.setCount(1);
						stackProcessing.shrink(1);
						if (outputStack.hasTagCompound()) {
							if ((!outputStack.getTagCompound().hasKey("period")) && this.periodLock != 0) {
								outputStack.getTagCompound().setInteger("period", this.periodLock);
							}
							if ((!outputStack.getTagCompound().hasKey("PFMob"))
									&& (!outputStack.getTagCompound().hasKey("PFStatic"))
									&& (!outputStack.getTagCompound().hasKey("PFPlant"))) {
								if (outputStack.getItem() instanceof IArchiveVertebrate
									|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveVertebrate) {
									NBTTagCompound entityNBT = new NBTTagCompound();
									entityNBT.setString("id", "");
									outputStack.getTagCompound().setTag("PFMob", entityNBT);
									outputStack.getTagCompound().setString("mobtype", "vertebrate");
								}
								if (outputStack.getItem() instanceof IArchiveInvertebrate
										|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveInvertebrate) {
									NBTTagCompound entityNBT = new NBTTagCompound();
									entityNBT.setString("id", "");
									outputStack.getTagCompound().setTag("PFMob", entityNBT);
									outputStack.getTagCompound().setString("mobtype", "invertebrate");
								}
								if (outputStack.getItem() instanceof IArchiveStatic
										|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveStatic) {
									NBTTagCompound entityNBT = new NBTTagCompound();
									entityNBT.setString("id", "");
									outputStack.getTagCompound().setTag("PFStatic", entityNBT);
								}
								if (outputStack.getItem() instanceof IArchivePlant
										|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchivePlant) {
									NBTTagCompound entityNBT = new NBTTagCompound();
									entityNBT.setString("id", "");
									outputStack.getTagCompound().setTag("PFPlant", entityNBT);
								}
							}
						}
						else {
							NBTTagCompound compound = new NBTTagCompound();
							compound.setInteger("period", this.periodLock);
							outputStack.setTagCompound(compound);
							if (outputStack.getItem() instanceof IArchiveVertebrate
									|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveVertebrate) {
								NBTTagCompound entityNBT = new NBTTagCompound();
								entityNBT.setString("id", "");
								outputStack.getTagCompound().setTag("PFMob", entityNBT);
								outputStack.getTagCompound().setString("mobtype", "vertebrate");
							}
							if (outputStack.getItem() instanceof IArchiveInvertebrate
									|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveInvertebrate) {
								NBTTagCompound entityNBT = new NBTTagCompound();
								entityNBT.setString("id", "");
								outputStack.getTagCompound().setTag("PFMob", entityNBT);
								outputStack.getTagCompound().setString("mobtype", "invertebrate");
							}
							if (outputStack.getItem() instanceof IArchiveStatic
									|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchiveStatic) {
								NBTTagCompound entityNBT = new NBTTagCompound();
								entityNBT.setString("id", "");
								outputStack.getTagCompound().setTag("PFStatic", entityNBT);
							}
							if (outputStack.getItem() instanceof IArchivePlant
									|| Block.getBlockFromItem(outputStack.getItem()) instanceof IArchivePlant) {
								NBTTagCompound entityNBT = new NBTTagCompound();
								entityNBT.setString("id", "");
								outputStack.getTagCompound().setTag("PFPlant", entityNBT);
							}
						}
						world.playSound(null, pos, SoundEvents.BLOCK_NOTE_PLING, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
						this.setInventorySlotContents(1, outputStack);
						markDirty();
						updated = true;
						this.periodLock = 0;
					}
				}

				if (updated) {
					this.notifyBlockUpdate();
				}
				markDirty();
			}
			else {
				setPeriodLock(0);
			}
		}

		public void setPeriodLock(int period) {
			periodLock = period;
			this.processTick = 0;
			this.isProcessing = false;
		}

		public int getPeriodLock() {
			return this.periodLock;
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
			return "container.microscope";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_microscope";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIMicroscope.GUILepidodendronMicroscope(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("energystored")) {
				this.energy = compound.getInteger("energystored");
			}
			this.periodLock = compound.getInteger("periodLock");
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
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("energystored", this.energy);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			compound.setInteger("periodLock", this.periodLock);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
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
				return (inputType(stack) > 0);
			}
			if (index == 1)
				return false;

			return false;
		}

		public static int inputType(ItemStack stack) {
			Item item = stack.getItem();
			if (item == ItemFossilPrecambrian.block
					|| item == ItemFossilCambrian.block
					|| item == ItemFossilOrdovician.block
					|| item == ItemFossilSilurian.block
					|| item == ItemFossilDevonian.block
					|| item == ItemFossilCarboniferous.block
					|| item == ItemFossilPermian.block
					|| item == ItemFossilTriassic.block
					|| item == ItemFossilJurassic.block
					|| item == ItemFossilCretaceous.block
					|| item == ItemFossilPaleogene.block
					|| item == ItemFossilNeogene.block
					|| item == ItemFossilPleistocene.block) {
				return 1;
			}
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("period")) {
					return 0;
				}
				if (stack.getTagCompound().hasKey("PFMob")
						|| stack.getTagCompound().hasKey("PFStatic")
						|| stack.getTagCompound().hasKey("PFPlant")) {
					return 2;
				}
			}
			if (stack.getItem() instanceof IDimensionRestricted) {
				return 2;
			}
			if (Block.getBlockFromItem(stack.getItem()) instanceof IDimensionRestricted) {
				return 2;
			}
			return 0;
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
				if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
					BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
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
				if (tileEntity instanceof BlockMicroscope.TileEntityMicroscope) {
					BlockMicroscope.TileEntityMicroscope te = (BlockMicroscope.TileEntityMicroscope) tileEntity;
					return te.getEnergyStored() > minEnergy;
				}
			}
			return false;
		}

		//Energy addin:
		//-------------
		protected int energy;
		protected int capacity = 10000;
		protected int maxReceive = 1000;
		protected int maxExtract = 500;

		@Override
		public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
			IBlockState blockstate = this.getWorld().getBlockState(this.getPos());
			if (blockstate != null) {
				if (blockstate.getBlock() == BlockMicroscope.block) {
					EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockMicroscope.BlockCustom.FACING).getOpposite();
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