
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIDNACentrifuge;
import net.lepidodendron.item.ItemDNARecombiner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerCentrifuge extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_centrifuge")
	public static final Block block = null;
	public BlockDNARecombinerCentrifuge(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_centrifuge);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_centrifuge"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge.class, "lepidodendron:tileentitydna_recombiner_centrifuge");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:dna_recombiner_centrifuge", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_dna_recombiner_centrifuge");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.5F);
			setResistance(2F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(RF, LepidodendronConfig.machinesRF));
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
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemDNARecombiner.block, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(ItemDNARecombiner.block, 1).getItem());
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}


		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIDNACentrifuge.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge();
		}

		public BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge createNewTileEntity(World worldIn, int meta) {
			return new BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge();
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
				if (tileentity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
				return;
			}

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY()));
			if (endState.getBlock() != BlockDNARecombinerForge.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING)) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY()).up()).getBlock() != BlockDNARecombinerRail.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
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
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.DOWN) {
				return true;
			}
			return false;
		}
	}

	public static class TileEntityDNARecombinerCentrifuge extends TileEntityLockableLoot implements ITickable, ISidedInventory, IEnergyStorage {

		private NonNullList<ItemStack> centrifugeContents = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);

		protected boolean isLocked;
		protected boolean isProcessing;
		public int processTick;
		public double centrifugeAngle;
		public double flareAngle;
		public double hatchVal;
		public long startTick;
		private int totalRevolutions = 16; //16 full revs for the process
		private int processCooldown = 200; //10 seconds to startup/slowdown
		private int processTickTime = 600; //30 seconds to spin (including startup/cooldown)
		public double cooldownDegrees = 360 * 7; //during warmup and cooldown we rotate this amount
		private int minEnergyNeeded = 500;

		public float lidAngle;
		public float prevLidAngle;
		public int numPlayersUsing;
		private int ticksSinceSync;


		public boolean canStartProcess() {
			
			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}
			
			if ((!this.isProcessing)
					&& (!isCentrifugePaused())
					&& (!this.isLocked)
					&& this.lidAngle <= 0.0F
					&& (
						(!getStackInSlot(0).isEmpty()) && (!getStackInSlot(2).isEmpty())
						|| (!getStackInSlot(1).isEmpty()) && (!getStackInSlot(3).isEmpty())
					)
					&& (!((!getStackInSlot(0).isEmpty()) && getStackInSlot(2).isEmpty()))
					&& (!((!getStackInSlot(2).isEmpty()) && getStackInSlot(0).isEmpty()))
					&& (!((!getStackInSlot(1).isEmpty()) && getStackInSlot(3).isEmpty()))
					&& (!((!getStackInSlot(3).isEmpty()) && getStackInSlot(1).isEmpty()))
				) {
				boolean flag1 = false;
				boolean flag2 = false;
				boolean flag3 = false;
				boolean flag4 = false;
				if (!getStackInSlot(0).isEmpty()) {
					if (getStackInSlot(0).hasTagCompound()) {
						if (this.getStackInSlot(0).getTagCompound().hasKey("PFPlant")
						|| this.getStackInSlot(0).getTagCompound().hasKey("PFStatic")
						|| this.getStackInSlot(0).getTagCompound().hasKey("PFMob")) {
							flag1 = true;
						}
					}
				}
				if (!getStackInSlot(1).isEmpty()) {
					if (getStackInSlot(1).hasTagCompound()) {
						if (this.getStackInSlot(1).getTagCompound().hasKey("PFPlant")
								|| this.getStackInSlot(1).getTagCompound().hasKey("PFStatic")
								|| this.getStackInSlot(1).getTagCompound().hasKey("PFMob")) {
							flag2 = true;
						}
					}
				}
				if (!getStackInSlot(2).isEmpty()) {
					if (getStackInSlot(2).hasTagCompound()) {
						if (this.getStackInSlot(2).getTagCompound().hasKey("PFPlant")
								|| this.getStackInSlot(2).getTagCompound().hasKey("PFStatic")
								|| this.getStackInSlot(2).getTagCompound().hasKey("PFMob")) {
							flag3 = true;
						}
					}
				}
				if (!getStackInSlot(3).isEmpty()) {
					if (getStackInSlot(3).hasTagCompound()) {
						if (this.getStackInSlot(3).getTagCompound().hasKey("PFPlant")
								|| this.getStackInSlot(3).getTagCompound().hasKey("PFStatic")
								|| this.getStackInSlot(3).getTagCompound().hasKey("PFMob")) {
							flag4 = true;
						}
					}
				}
				return (flag1 || flag2 || flag3 || flag4);
			}
			return false;
		}

		public double progressFraction() {
			if (this.isProcessing) {
				return (double)this.processTick / (double)this.processTickTime;
			}
			if (this.isLocked) {
				return 1;
			}
			return 0;
		}

		public boolean isLocked() {
			return this.isLocked;
		}

		public void setLocked(boolean locked) {
			this.isLocked = locked;
		}

		public boolean isProcessing() {
			return this.isProcessing;
		}

		public boolean isCentrifugePaused() {
			IBlockState state = this.getWorld().getBlockState(this.getPos());
			EnumFacing face = EnumFacing.NORTH;
			if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.NORTH) {
				face = EnumFacing.SOUTH;
			}
			else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.SOUTH) {
				face = EnumFacing.NORTH;
			}
			else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.EAST) {
				face = EnumFacing.WEST;
			}
			else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.WEST) {
				face = EnumFacing.EAST;
			}
			if (this.getWorld().isSidePowered(this.getPos().offset(face), face.getOpposite())
					||
					this.getWorld().isBlockPowered(this.getPos())
			) {
				return true;
			}
			return false;
		}

		public boolean isEmpty()
		{
			for (ItemStack itemstack : this.centrifugeContents)
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

			if (LepidodendronConfig.machinesRF) {
				TileEntity tileEntity = world.getTileEntity(this.pos);
				if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockDNARecombinerCentrifuge.BlockCustom.FACING);
						BlockPos powerBlockPos = this.pos.offset(facing.rotateY());
						TileEntity teStorage = this.getWorld().getTileEntity(powerBlockPos);
						if (teStorage != null) {
							IEnergyStorage powerBlockStorage = teStorage.getCapability(CapabilityEnergy.ENERGY, facing.rotateY().rotateY().rotateY());
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

			int i = this.pos.getX();
			int j = this.pos.getY();
			int k = this.pos.getZ();
			++this.ticksSinceSync;
			if (!this.isLocked) {
				if (!this.world.isRemote && this.numPlayersUsing != 0 && (this.ticksSinceSync + i + j + k) % 200 == 0) {
					this.numPlayersUsing = 0;
					float f = 5.0F;

					for (EntityPlayer entityplayer : this.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB((double) ((float) i - 5.0F), (double) ((float) j - 5.0F), (double) ((float) k - 5.0F), (double) ((float) (i + 1) + 5.0F), (double) ((float) (j + 1) + 5.0F), (double) ((float) (k + 1) + 5.0F)))) {
						if (entityplayer.openContainer instanceof GUIDNACentrifuge.GUILepidodendronDNACentrifuge) {
							IInventory iinventory = ((GUIDNACentrifuge.GUILepidodendronDNACentrifuge) entityplayer.openContainer).getLowerChestInventory();

							if (iinventory == this) {
								++this.numPlayersUsing;
							}
						}
					}

				}

				this.prevLidAngle = this.lidAngle;
				float f1 = 0.1F;

				if (this.numPlayersUsing > 0 && this.lidAngle == 0.0F) {
					double d1 = (double) i + 0.5D;
					double d2 = (double) k + 0.5D;

					this.world.playSound((EntityPlayer) null, d1, (double) j + 0.5D, d2, SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
				}

				if (this.numPlayersUsing == 0 && this.lidAngle > 0.0F || this.numPlayersUsing > 0 && this.lidAngle < 1.0F) {
					float f2 = this.lidAngle;

					if (this.numPlayersUsing > 0) {
						this.lidAngle += 0.1F;
					} else {
						this.lidAngle -= 0.1F;
					}

					if (this.lidAngle > 1.0F) {
						this.lidAngle = 1.0F;
					}

					float f3 = 0.5F;

					if (this.lidAngle < 0.5F && f2 >= 0.5F) {
						double d3 = (double) i + 0.5D;
						double d0 = (double) k + 0.5D;

						this.world.playSound((EntityPlayer) null, d3, (double) j + 0.5D, d0, SoundEvents.BLOCK_CHEST_CLOSE, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
					}

					if (this.lidAngle < 0.0F) {
						this.lidAngle = 0.0F;
					}
					updated = true;
				}
			}

			if (this.getWorld().isRemote) {
				return;
			}

			//Do stuff
			if (canStartProcess()) {
				this.isProcessing = true;
				this.isLocked = true;
				processTick = 0;
				startTick = world.getTotalWorldTime(); //Used for rendering
				updated = true;
			}

			if (this.isProcessing && this.processTick < this.processTickTime) { //We will allow the centrifuge to run a ful cycle even if the power runs out :)
				this.processTick++;
				this.drainEnergy(100);

				//Calculate the rotation needed:
				this.centrifugeAngle = floorAngle(this.getRotationAngle(this.processTick));
				updated = true;
			}
			else {
				this.flareAngle = 0;
				this.centrifugeAngle = 0;
			}

			if (this.processTick >= this.processTickTime) {
				this.processTick = 0;
				this.isProcessing = false; //Not processing but should be left locked if it was locked before
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		public float getRotationAngle(double processticks) {
			double angle = 0D;
			if (processticks >= this.processTickTime || !this.isProcessing) {
				return 0;
			}
			if (processticks <= this.processCooldown) {
				//Is warming up:
				angle = (1D - Math.cos((processticks / (double)this.processCooldown) * (Math.PI / 2D))) * this.cooldownDegrees;
			}
			else if (processticks >= (this.processTickTime - this.processCooldown)) {
				//Is cooling down:
				angle = this.cooldownDegrees - (1D - Math.cos((((double)this.processTickTime - processticks - 1D) / (double)this.processCooldown) * (Math.PI / 2D))) * this.cooldownDegrees;
			}
			else {
				//is spinning
				angle = this.cooldownDegrees + (((processticks - this.processCooldown) / (this.processTickTime - (2 * this.processCooldown) - 1)) * (360 * this.totalRevolutions));
			}

			return (float) angle;
		}

		public float getFlareAngle(double processticks) {
			double angle = 0D;
			if (processticks >= this.processTickTime || !this.isProcessing) {
				return 0;
			}
			if (processticks <= this.processCooldown) {
				//Is warming up:
				angle = getRotationAngle(processticks);
				angle = (angle / this.cooldownDegrees) * 80;
			}
			else if (processticks >= (this.processTickTime - this.processCooldown)) {
				//Is cooling down:
				angle = getRotationAngle(processticks);
				angle = 80 - ((angle / this.cooldownDegrees) * 80);
			}
			else {
				//is spinning
				angle = 80;
			}

			return (float) angle;
		}

		public double floorAngle(double angle) {
			if (angle >= 360) {
				return angle - (Math.floor(angle / 360D) * 360D);
			}
			return angle;
		}

		@Override
		public int getInventoryStackLimit() {
			return 1;
		}

		@Override
		public int getSizeInventory() {
			return 4;
		}

		@Override
		public String getName() {
			return "container.centrifuge";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_dna_centrifuge";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIDNACentrifuge.GUILepidodendronDNACentrifuge(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("energystored")) {
				this.energy = compound.getInteger("energystored");
			}
			if (compound.hasKey("lidAngle")) {
				this.lidAngle = compound.getFloat("lidAngle");
			}
			if (compound.hasKey("prevLidAngle")) {
				this.prevLidAngle = compound.getFloat("prevLidAngle");
			}
			if (compound.hasKey("numPlayersUsing")) {
				this.numPlayersUsing = compound.getInteger("numPlayersUsing");
			}
			if (compound.hasKey("ticksSinceSync")) {
				this.ticksSinceSync = compound.getInteger("ticksSinceSync");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isLocked")) {
				this.isLocked = compound.getBoolean("isLocked");
			}
			if (compound.hasKey("hatchVal")) {
				this.hatchVal = compound.getDouble("hatchVal");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("startTick")) {
				this.startTick = compound.getLong("startTick");
			}
			this.centrifugeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.centrifugeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("energystored", this.energy);
			compound.setFloat("lidAngle", this.lidAngle);
			compound.setFloat("prevLidAngle", this.prevLidAngle);
			compound.setInteger("numPlayersUsing", this.numPlayersUsing);
			compound.setInteger("ticksSinceSync", this.ticksSinceSync);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setBoolean("isLocked", this.isLocked);
			compound.setDouble("hatchVal", this.hatchVal);
			compound.setInteger("processTick", this.processTick);
			compound.setLong("startTick", this.startTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.centrifugeContents);
			}
			return compound;
		}

		public double getHatchVal() {
			return this.hatchVal;
		}

		public void setHatchVal(double val) {
			this.hatchVal = val;
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
		public boolean receiveClientEvent(int id, int type)
		{
			if (id == 1)
			{
				this.numPlayersUsing = type;
				return true;
			}
			else
			{
				return super.receiveClientEvent(id, type);
			}
		}

		@Override
		public void openInventory(EntityPlayer player)
		{
			//System.err.println("openInventory");
			if ((!player.isSpectator()) && (!this.isLocked))
			{
				if (this.numPlayersUsing < 0)
				{
					this.numPlayersUsing = 0;
				}

				++this.numPlayersUsing;
				this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
				this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);

			}
		}

		@Override
		public void closeInventory(EntityPlayer player)
		{
			//System.err.println("closeInventory");
			if ((!player.isSpectator()) && (!this.isLocked) && this.getBlockType() instanceof BlockDNARecombinerCentrifuge.BlockCustom)
			{
				--this.numPlayersUsing;
				this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
				this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);
			}
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
			return this.centrifugeContents;
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[] {0,1,2,3};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return !this.isLocked() && isItemValidForSlot(index, itemStackIn);
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
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
			EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockDNARecombinerCentrifuge.BlockCustom.FACING).rotateY();
			return (capability == CapabilityEnergy.ENERGY && facing == blockFacing) ? (T) this : null;
		}

		public void drainEnergy(int energy) {
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
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
				if (tileEntity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge te = (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileEntity;
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
				if (blockstate.getBlock() == BlockDNARecombinerCentrifuge.block) {
					EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockDNARecombinerCentrifuge.BlockCustom.FACING).rotateY();
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