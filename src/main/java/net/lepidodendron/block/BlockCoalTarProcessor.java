
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUICoalTarProcessor;
import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.lepidodendron.item.ItemBottleOfTar;
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
import net.minecraft.init.Items;
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
import net.minecraft.tileentity.TileEntityFurnace;
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
import net.minecraftforge.fluids.*;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCoalTarProcessor extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:coal_tar_processor")
	public static final Block block = null;
	public BlockCoalTarProcessor(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.coal_tar_processor);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("coal_tar_processor"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockCoalTarProcessor.TileEntityCoalTarProcessor.class, "lepidodendron:tileentitycoal_tar_processor");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:coal_tar_processor", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_coal_tar_processor");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 0);
			setHardness(2.5F);
			setResistance(3.5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.BLACK;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			super.onBlockAdded(worldIn, pos, state);
			worldIn.setBlockState(pos.up(), BlockCoalTarProcessorCentre.block.getDefaultState().withProperty(BlockCoalTarProcessorCentre.BlockCustom.FACING, state.getValue(FACING)));
			worldIn.setBlockState(pos.up(2), BlockCoalTarProcessorTop.block.getDefaultState().withProperty(BlockCoalTarProcessorTop.BlockCustom.FACING, state.getValue(FACING)));
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			return super.canPlaceBlockAt(worldIn, pos) && super.canPlaceBlockAt(worldIn, pos.up()) && super.canPlaceBlockAt(worldIn, pos.up(2));
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockCoalTarProcessor.TileEntityCoalTarProcessor();
		}

		public BlockCoalTarProcessor.TileEntityCoalTarProcessor createNewTileEntity(World worldIn, int meta) {
			return new BlockCoalTarProcessor.TileEntityCoalTarProcessor();
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
				if (tileentity instanceof BlockCoalTarProcessor.TileEntityCoalTarProcessor) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockCoalTarProcessor.TileEntityCoalTarProcessor) tileentity);
					BlockCoalTarProcessor.TileEntityCoalTarProcessor tile = (BlockCoalTarProcessor.TileEntityCoalTarProcessor)tileentity;
					if (tile.getFluidAmount() >= 1000) {
						world.setBlockState(pos, FluidRegistry.getFluid("pn_tar").getBlock().getDefaultState());
					}
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);

			if (entity instanceof EntityPlayer) {
				ItemStack stack = entity.getHeldItem(hand);
				Item item = stack.getItem();

				TileEntity te = world.getTileEntity(pos);
				BlockCoalTarProcessor.TileEntityCoalTarProcessor tile = (BlockCoalTarProcessor.TileEntityCoalTarProcessor)te;

				if (item == Items.GLASS_BOTTLE && tile.getFluidAmount() >= 333) {
					if (!world.isRemote) {
						stack.shrink(1);
						ItemStack _setstack = new ItemStack(ItemBottleOfTar.block, 1);
						if (stack.isEmpty()) {
							entity.setHeldItem(hand, _setstack);
						} else if (!entity.inventory.addItemStackToInventory(_setstack)) {
							entity.dropItem(_setstack, false);
						}
						tile.fluid = new FluidStack(FluidRegistry.getFluid("pn_tar"), tile.getFluidAmount() - 333);
						world.playSound((EntityPlayer)null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
					}
					return true;
				}
				if (item == Items.BUCKET && tile.getFluidAmount() >= 1000) {
					if (!world.isRemote) {
						stack.shrink(1);
						ItemStack _setstack = FluidUtil.getFilledBucket(new FluidStack(FluidRegistry.getFluid("pn_tar"), 1000));
						if (stack.isEmpty()) {
							entity.setHeldItem(hand, _setstack);
						} else if (!entity.inventory.addItemStackToInventory(_setstack)) {
							entity.dropItem(_setstack, false);
						}
						tile.fluid = new FluidStack(FluidRegistry.getFluid("pn_tar"), tile.getFluidAmount() - 1000);
						world.playSound((EntityPlayer)null, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
					}
					return true;
				}
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUICoalTarProcessor.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		{
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockCoalTarProcessorCentre.block) {
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			boolean pipe = false;
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, state.getValue(FACING)) != null) {
					pipe = true;
				}
			}
			if (state.getValue(FACING) == EnumFacing.NORTH && ((face == EnumFacing.SOUTH && pipe) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.SOUTH && ((face == EnumFacing.NORTH && pipe) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.EAST && ((face == EnumFacing.WEST && pipe) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
					|| state.getValue(FACING) == EnumFacing.WEST && ((face == EnumFacing.EAST && pipe) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
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

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);

			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity instanceof BlockCoalTarProcessor.TileEntityCoalTarProcessor) {
					BlockCoalTarProcessor.TileEntityCoalTarProcessor te = (BlockCoalTarProcessor.TileEntityCoalTarProcessor) tileEntity;
					if (te.isProcessing && random.nextInt(8) == 0) {
						for (int l = 0; l < 8; ++l) {
							world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + 0.5, (double) pos.getY() + 3.0, (double) pos.getZ() + 0.5, 0, 0.075D, 0);
						}
					}
				}
			}
		}
	}

	public static class CoalTarProcessorPropertiesWrapper implements IFluidTankProperties
	{
		protected final TileEntityCoalTarProcessor tank;

		public CoalTarProcessorPropertiesWrapper(BlockCoalTarProcessor.TileEntityCoalTarProcessor tank)
		{
			this.tank = tank;
		}

		@Nullable
		@Override
		public FluidStack getContents()
		{
			FluidStack contents = tank.getFluid();
			return contents == null ? null : contents.copy();
		}

		@Override
		public int getCapacity()
		{
			return tank.getCapacity();
		}

		@Override
		public boolean canFill()
		{
			return tank.canFill();
		}

		@Override
		public boolean canDrain()
		{
			return tank.canDrain();
		}

		@Override
		public boolean canFillFluidType(FluidStack fluidStack)
		{
			return tank.canFillFluidType(fluidStack);
		}

		@Override
		public boolean canDrainFluidType(FluidStack fluidStack)
		{
			return tank.canDrainFluidType(fluidStack);
		}
	}

	public static class TileEntityCoalTarProcessor extends TileEntityLockableLoot implements IFluidTank, IFluidHandler, ITickable, ISidedInventory, IEnergyStorage {

		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		protected FluidStack fluid;
		protected int capacityFluid = Fluid.BUCKET_VOLUME * LepidodendronConfig.tarLimitInProcessor;
		protected TileEntity tile;
		protected boolean canFill = false;
		protected boolean canDrain = true;
		protected IFluidTankProperties[] tankProperties;
		protected boolean isProcessing;
		public int processTick;
		private int processTickTime; //Depends on what we are doing it to
		public int GUIFlameHeight;
		private int minEnergyNeeded = 200;

		public FluidStack getFluid()
		{
			return fluid;
		}

		public void setFluid(@Nullable FluidStack fluid)
		{
			this.fluid = fluid;
		}

		public int getFluidAmount()
		{
			if (fluid == null)
			{
				return 0;
			}
			return fluid.amount;
		}

		public int getCapacity()
		{
			return capacityFluid;
		}

		public void setCapacity(int capacity)
		{
			this.capacityFluid = capacity;
		}

		public void setTileEntity(TileEntity tile)
		{
			this.tile = tile;
		}

		public FluidTankInfo getInfo()
		{
			return new FluidTankInfo(this);
		}

		public IFluidTankProperties[] getTankProperties()
		{
			if (this.tankProperties == null)
			{
				this.tankProperties = new IFluidTankProperties[] { new CoalTarProcessorPropertiesWrapper(this) };
			}
			return this.tankProperties;
		}



		@Override
		public int fill(FluidStack resource, boolean doFill)
		{
				return 0;
		}

		/**
		 * Use this method to bypass the restrictions from {@link #canFillFluidType(FluidStack)}
		 * Meant for use by the owner of the tank when they have {@link #canFill() set to false}.
		 */
		public int fillInternal(FluidStack resource, boolean doFill)
		{
			return 0;
		}

		@Override
		public FluidStack drain(FluidStack resource, boolean doDrain)
		{

			if (!canDrainFluidType(getFluid()))
			{
				return null;
			}
			return drainInternal(resource, doDrain);
		}

		@Override
		public FluidStack drain(int maxDrain, boolean doDrain)
		{

			if (!canDrainFluidType(fluid))
			{
				return null;
			}
			return drainInternal(maxDrain, doDrain);
		}

		/**
		 * Use this method to bypass the restrictions from {@link #canDrainFluidType(FluidStack)}
		 * Meant for use by the owner of the tank when they have {@link #canDrain()} set to false}.
		 */
		@Nullable
		public FluidStack drainInternal(FluidStack resource, boolean doDrain)
		{

			if (resource == null || !resource.isFluidEqual(getFluid()))
			{
				return null;
			}
			return drainInternal(resource.amount, doDrain);
		}

		/**
		 * Use this method to bypass the restrictions from {@link #canDrainFluidType(FluidStack)}
		 * Meant for use by the owner of the tank when they have {@link #canDrain()} set to false}.
		 */
		@Nullable
		public FluidStack drainInternal(int maxDrain, boolean doDrain)
		{

			if (fluid == null || maxDrain <= 0)
			{
				return null;
			}

			int drained = maxDrain;
			if (fluid.amount < drained)
			{
				drained = fluid.amount;
			}

			FluidStack stack = new FluidStack(fluid, drained);
			if (doDrain)
			{
				fluid.amount -= drained;
				if (fluid.amount <= 0)
				{
					fluid = null;
				}

				if (tile != null)
				{
					FluidEvent.fireEvent(new FluidEvent.FluidDrainingEvent(fluid, tile.getWorld(), tile.getPos(), this, drained));
				}

				onContentsChanged();
			}
			return stack;
		}

		/**
		 * Whether this tank can be filled with {@link IFluidHandler}
		 *
		 * @see IFluidTankProperties#canFill()
		 */
		public boolean canFill()
		{
			return canFill;
		}

		/**
		 * Whether this tank can be drained with {@link IFluidHandler}
		 *
		 * @see IFluidTankProperties#canDrain()
		 */
		public boolean canDrain()
		{
			return canDrain;
		}

		/**
		 * Set whether this tank can be filled with {@link IFluidHandler}
		 *
		 * @see IFluidTankProperties#canFill()
		 */
		public void setCanFill(boolean canFill)
		{
			this.canFill = canFill;
		}

		/**
		 * Set whether this tank can be drained with {@link IFluidHandler}
		 *
		 * @see IFluidTankProperties#canDrain()
		 */
		public void setCanDrain(boolean canDrain)
		{
			this.canDrain = canDrain;
		}

		/**
		 * Returns true if the tank can be filled with this type of fluid.
		 * Used as a filter for fluid types.
		 * Does not consider the current contents or capacity of the tank,
		 * only whether it could ever fill with this type of fluid.
		 *
		 * @see IFluidTankProperties#canFillFluidType(FluidStack)
		 */
		public boolean canFillFluidType(FluidStack fluid)
		{

			return false;
		}

		/**
		 * Returns true if the tank can drain out this type of fluid.
		 * Used as a filter for fluid types.
		 * Does not consider the current contents or capacity of the tank,
		 * only whether it could ever drain out this type of fluid.
		 *
		 * @see IFluidTankProperties#canDrainFluidType(FluidStack)
		 */
		public boolean canDrainFluidType(@Nullable FluidStack fluid)
		{
			return fluid != null && canDrain();
		}

		protected void onContentsChanged()
		{
			this.markDirty();
		}


		public int getFill() {
			if (this.getFluidAmount() > 0) {
				double fillPercent = ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * LepidodendronConfig.tarLimitInProcessor);
				return (int) Math.ceil(fillPercent * 15D);
			}
			return 0;
		}

		public double progressFraction() {
			return this.isProcessing ? (double)this.processTick / (double)this.processTickTime : (double)0.0F;
		}

		public double tarFraction() {
			//return 1;
			if (this.getFluidAmount() > 0) {
				return ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * LepidodendronConfig.tarLimitInProcessor);
			}
			return 0;
		}

		public int getFillFloor() {
			double fillPercent = ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * LepidodendronConfig.tarLimitInProcessor);
			return (int) Math.floor(fillPercent * 15D);
		}

		public boolean canStartProcess() {

			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}

			if (this.getFluidAmount() >= capacityFluid) {
				return false;
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
				return TileEntityFurnace.getItemBurnTime(stack);
			}
			return -1;
		}

		public double progTarFraction() {
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
				if (tileEntity instanceof BlockCoalTarProcessor.TileEntityCoalTarProcessor) {
					BlockCoalTarProcessor.TileEntityCoalTarProcessor te = (BlockCoalTarProcessor.TileEntityCoalTarProcessor) tileEntity;
					if (te.getEnergyStored() < te.getMaxEnergyStored()) {
						//Is there a power-supplying block in the right place?
						EnumFacing facing = this.getWorld().getBlockState(this.getPos()).getValue(BlockCoalTarProcessor.BlockCustom.FACING);
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
				this.processTickTime = (int)Math.round(Math.sqrt(TileEntityFurnace.getItemBurnTime(this.getStackInSlot(0))) * 10);
				this.processTick = 0;
				this.isProcessing = true;
				updated = true;
			}

			if (this.isProcessing && this.hasEnergy(minEnergyNeeded)) {
				this.processTick ++;
				this.drainEnergy(40);
				this.GUIFlameHeight = Math.min(60, this.GUIFlameHeight + 1);
				if (this.getWorld().rand.nextInt(10) == 0) {
					world.playSound(null, pos, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F, 0.8F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
				}
				updated = true;
			}

			if ((!this.isProcessing || !this.hasEnergy(minEnergyNeeded)) && this.GUIFlameHeight > 0) {
				this.GUIFlameHeight = Math.max(0, this.GUIFlameHeight - 1);
				updated = true;
			}

			if (!this.isRoomForOutputStack()) {
				this.processTick = 0;
				this.processTickTime = 0;
				this.isProcessing = false;
			}

			if (this.isProcessing && ((this.isRoomForOutputStack() && this.processTick > this.processTickTime) || !(isValidItemForProcess(this.getStackInSlot(0)) > 0))) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.processTickTime = 0;
				this.isProcessing = false;
				//move to output:
				if (isValidItemForProcess(this.getStackInSlot(0)) > 0) {
					double burntime = Math.min(32000D, Math.round((double)isValidItemForProcess(this.getStackInSlot(0))));
					double fraction = (burntime / 32000D) * 4;
					int resultSize = (int)Math.round(16D * fraction);
					ItemStack stackProcessing = this.getStackInSlot(0);
					stackProcessing.shrink(1);
					this.setInventorySlotContents(1, new ItemStack(ItemBottleOfDNASolvent.block, resultSize + this.getStackInSlot(1).getCount()));
					this.fluid = new FluidStack(FluidRegistry.getFluid("pn_tar"), Math.min(this.getFluidAmount() + (resultSize * 50), this.capacityFluid));

				}
				updated = true;
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		public boolean isRoomForOutputStack() {
			double burntime = Math.min(32000D, Math.round((double)isValidItemForProcess(this.getStackInSlot(0))));
			//System.err.println("burntime " + burntime);
			double fraction = (burntime / 32000D) * 4;
			//System.err.println("fraction " + fraction);
			int resultSize = (int)Math.round(16D * fraction);
			//System.err.println("resultSize " + resultSize);
			if ((!this.getStackInSlot(1).isEmpty()) && this.getStackInSlot(1).getItem() != ItemBottleOfDNASolvent.block) {
				return false;
			}
			if ((this.getStackInSlot(1).getCount() + resultSize) <= 64) {
				return true;
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
			return "container.coal_tar_processor";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_coal_tar_processor";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUICoalTarProcessor.GUILepidodendronCoalTarProcessor(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		public double getGUIFlameHeight() {
			return (double)this.GUIFlameHeight / 60D;
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
			if (compound.hasKey("processTickTime")) {
				this.processTickTime = compound.getInteger("processTickTime");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("GUIFlameHeight")) {
				this.GUIFlameHeight = compound.getInteger("GUIFlameHeight");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
			if (!compound.hasKey("Empty"))
			{
				FluidStack fluid = FluidStack.loadFluidStackFromNBT(compound);
				setFluid(fluid);
			}
			else
			{
				setFluid(null);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			if (fluid != null)
			{
				fluid.writeToNBT(compound);
			}
			else
			{
				compound.setString("Empty", "");
			}
			compound.setInteger("energystored", this.energy);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			compound.setInteger("processTickTime", this.processTickTime);
			compound.setInteger("GUIFlameHeight", this.GUIFlameHeight);
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
			if (index == 0) {
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
				//System.err.println("Checking for slot 0");
				boolean flag = false;
				if (OreDictionary.containsMatch(false, OreDictionary.getOres("itemCoal"), stack)) {
					flag = true;
				}
				if (OreDictionary.containsMatch(false, OreDictionary.getOres("blockCoal"), stack)) {
					flag = true;
				}
				if (OreDictionary.containsMatch(false, OreDictionary.getOres("logWood"), stack)) {
					flag = true;
				}
				//System.err.println(stack + " flag " + flag);
				return flag;
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

			EnumFacing blockFacing = this.world.getBlockState(this.getPos()).getValue(BlockAcidBath.BlockCustom.FACING);
			if (facing != null && capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY ) {
				boolean faceCheck = false;
				if (facing == EnumFacing.DOWN) {
					faceCheck = true;
				} else if (blockFacing == EnumFacing.NORTH) {
					faceCheck = (facing == EnumFacing.WEST || facing == EnumFacing.EAST || facing == EnumFacing.SOUTH);
				} else if (blockFacing == EnumFacing.SOUTH) {
					faceCheck = (facing == EnumFacing.WEST || facing == EnumFacing.EAST || facing == EnumFacing.NORTH);
				} else if (blockFacing == EnumFacing.EAST) {
					faceCheck = (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH || facing == EnumFacing.WEST);
				} else if (blockFacing == EnumFacing.WEST) {
					faceCheck = (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH || facing == EnumFacing.EAST);
				}
				if (faceCheck) {
					return (T) this;
				}
			}

			blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockCoalTarProcessor.BlockCustom.FACING).getOpposite();
			return (capability == CapabilityEnergy.ENERGY && facing == blockFacing) ? (T) this : null;

		}

		@Nullable
		public <T> T getCapabilityBucket(Capability<T> capability, @Nullable EnumFacing facing) {
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
				return (T) this;
			}
			return super.getCapability(capability, facing);
		}

		public void drainEnergy(int energy) {
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockCoalTarProcessor.TileEntityCoalTarProcessor) {
					BlockCoalTarProcessor.TileEntityCoalTarProcessor te = (BlockCoalTarProcessor.TileEntityCoalTarProcessor) tileEntity;
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
				if (tileEntity instanceof BlockCoalTarProcessor.TileEntityCoalTarProcessor) {
					BlockCoalTarProcessor.TileEntityCoalTarProcessor te = (BlockCoalTarProcessor.TileEntityCoalTarProcessor) tileEntity;
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
				if (blockstate.getBlock() == BlockCoalTarProcessor.block) {
					EnumFacing blockFacing = this.getWorld().getBlockState(this.getPos()).getValue(BlockCoalTarProcessor.BlockCustom.FACING).getOpposite();
					if (capability == CapabilityEnergy.ENERGY && facing == blockFacing) {
						return true;
					}
				}
			}
			if (blockstate != null) {
				if (blockstate.getBlock() == BlockCoalTarProcessor.block) {
					EnumFacing blockFacing = this.world.getBlockState(this.getPos()).getValue(BlockCoalTarProcessor.BlockCustom.FACING);

					boolean faceCheck = false;
					if (facing == EnumFacing.DOWN) {
						faceCheck = true;
					} else if (blockFacing == EnumFacing.NORTH) {
						faceCheck = (facing == EnumFacing.WEST || facing == EnumFacing.EAST || facing == EnumFacing.SOUTH);
					} else if (blockFacing == EnumFacing.SOUTH) {
						faceCheck = (facing == EnumFacing.WEST || facing == EnumFacing.EAST || facing == EnumFacing.NORTH);
					} else if (blockFacing == EnumFacing.EAST) {
						faceCheck = (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH || facing == EnumFacing.WEST);
					} else if (blockFacing == EnumFacing.WEST) {
						faceCheck = (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH || facing == EnumFacing.EAST);
					}
					if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY && faceCheck) {
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