
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemAcidBath;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
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
import net.minecraftforge.fluids.*;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAcidBath extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acid_bath")
	public static final Block block = null;

	public BlockAcidBath(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acid_bath);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("acid_bath"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityAcidBath.class, "lepidodendron:tileentityacid_bath");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:acid_bath", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyInteger ACID = PropertyInteger.create("acid", 0, 15);

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_acid_bath");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ACID, 0));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemAcidBath.block, 1);
		}

		//NORTH
		protected static final AxisAlignedBB AABBN = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 0.625D);

		//SOUTH
		protected static final AxisAlignedBB AABBS = new AxisAlignedBB(0.0D, 0.0D, 0.375, 1.0D, 0.875D, 1.0D);

		//EAST
		protected static final AxisAlignedBB AABBE = new AxisAlignedBB(0.375, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

		//WEST
		protected static final AxisAlignedBB AABBW = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.625D, 0.875D, 1.0D);

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				return AABBN;
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				return AABBS;
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				return AABBE;
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				return AABBW;
			}
			else {
				return new AxisAlignedBB(0,0,0,1,1,1);
			}
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN);
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS);
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE);
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW);
			}
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity instanceof TileEntityAcidBath) {
					TileEntityAcidBath te = (TileEntityAcidBath) tileEntity;
					return state.withProperty(ACID, te.getFill());
				}
			}

			return state.withProperty(ACID, 0);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(ItemAcidBath.block, 1).getItem());
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity instanceof TileEntityAcidBath) {
					TileEntityAcidBath te = (TileEntityAcidBath) tileEntity;
					return te.getFillFloor();
				}
			}
			return 0;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new TileEntityAcidBath();
		}

		public TileEntityAcidBath createNewTileEntity(World worldIn, int meta) {
			return new TileEntityAcidBath();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
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
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity instanceof TileEntityAcidBath) {
					TileEntityAcidBath te = (TileEntityAcidBath) tileEntity;
					if (te.getFill() > 7) {
						world.setBlockState(pos, BlockAcid.block.getDefaultState());
					}
					if (te.getFill() == 15) {
						world.setBlockState(pos.offset(state.getValue(FACING)), BlockAcid.block.getDefaultState());
					}
				}
			}
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING)));
			if (endState.getBlock() != BlockAcidBathEnd.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING).getOpposite()) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockAcidBathUp.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			boolean pipe = false;
			TileEntity tileEntity = world.getTileEntity(pos.down().offset(state.getValue(FACING).getOpposite()));
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te == null || (!(te instanceof TileEntityAcidBath))) {
				return false;
			}

			IFluidHandler handler = ((TileEntityAcidBath)te).getCapabilityBucket(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, facing);
			ItemStack stack = playerIn.getHeldItem(hand);

			if (FluidUtil.getFluidContained(stack) != null) {
				if (FluidUtil.getFluidContained(stack).getFluid() != FluidRegistry.lookupFluidForBlock(BlockAcid.block)) {
					return false;
				}
			}

			if (FluidUtil.interactWithFluidHandler(playerIn, hand, handler)) {
				return true;
			}

			return FluidUtil.getFluidHandler(stack) != null; //Stops buckets getting placed
		}

	}

	public static class TileEntityAcidBath extends TileEntityLockableLoot implements IFluidTank, IFluidHandler, ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);

		protected FluidStack fluid;
		protected int capacity = Fluid.BUCKET_VOLUME * 2;
		protected TileEntity tile;
		protected boolean canFill = true;
		protected boolean canDrain = true;
		protected IFluidTankProperties[] tankProperties;

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

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 4;
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}



		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 1)
				return false;
			if (index == 2)
				return false;
			if (index == 3)
				return false;
			if (index == 4)
				return false;
			return true;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "container.acidbath_helper";
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		public int getCapacity()
		{
			return capacity;
		}

		public void setCapacity(int capacity)
		{
			this.capacity = capacity;
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
				this.tankProperties = new IFluidTankProperties[] { new AcidBathPropertiesWrapper(this) };
			}
			return this.tankProperties;
		}

		@Override
		public int fill(FluidStack resource, boolean doFill)
		{
			if (!canFillFluidType(resource))
			{
				return 0;
			}

			return fillInternal(resource, doFill);
		}

		/**
		 * Use this method to bypass the restrictions from {@link #canFillFluidType(FluidStack)}
		 * Meant for use by the owner of the tank when they have {@link #canFill() set to false}.
		 */
		public int fillInternal(FluidStack resource, boolean doFill)
		{

			if (resource == null || resource.amount <= 0)
			{
				return 0;
			}

			if (!doFill)
			{
				if (fluid == null)
				{
					return Math.min(capacity, resource.amount);
				}

				if (!fluid.isFluidEqual(resource))
				{
					return 0;
				}

				return Math.min(capacity - fluid.amount, resource.amount);
			}

			if (fluid == null)
			{
				fluid = new FluidStack(resource, Math.min(capacity, resource.amount));

				onContentsChanged();

				if (tile != null)
				{
					FluidEvent.fireEvent(new FluidEvent.FluidFillingEvent(fluid, tile.getWorld(), tile.getPos(), this, fluid.amount));
				}
				return fluid.amount;
			}

			if (!fluid.isFluidEqual(resource))
			{
				return 0;
			}
			int filled = capacity - fluid.amount;

			if (resource.amount < filled)
			{
				fluid.amount += resource.amount;
				filled = resource.amount;
			}
			else
			{
				fluid.amount = capacity;
			}

			onContentsChanged();

			if (tile != null)
			{
				FluidEvent.fireEvent(new FluidEvent.FluidFillingEvent(fluid, tile.getWorld(), tile.getPos(), this, filled));
			}
			return filled;
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

				onContentsChanged();

				if (tile != null)
				{
					FluidEvent.fireEvent(new FluidEvent.FluidDrainingEvent(fluid, tile.getWorld(), tile.getPos(), this, drained));
				}
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
			if (fluid.getFluid().getBlock() == BlockAcid.block) {
				return canFill();
			}
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
				double fillPercent = ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * 2);
				return (int) Math.ceil(fillPercent * 15D);
			}
			return 0;
		}

		public double acidFraction() {
			if (this.getFluidAmount() > 0) {
				return ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * 2);
			}
			return 0;
		}

		public int getFillFloor() {
			double fillPercent = ((double) this.getFluidAmount()) / (Fluid.BUCKET_VOLUME * 2);
			return (int) Math.floor(fillPercent * 15D);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (!compound.hasKey("Empty"))
			{
				FluidStack fluid = FluidStack.loadFluidStackFromNBT(compound);
				setFluid(fluid);
			}
			else
			{
				setFluid(null);
			}
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.stacks);
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
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}
			return compound;
		}

		private void notifyBlockUpdate() {
			this.getWorld().notifyNeighborsOfStateChange(this.getPos(), this.getBlockType(), true);
			this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
			this.getWorld().markBlockRangeForRenderUpdate(this.getPos(), this.getPos());
		}

		@Override
		public void markDirty() {
			super.markDirty();
			notifyBlockUpdate();
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
		public boolean hasCapability(Capability<?> capability, @Nullable EnumFacing facing) {
			EnumFacing blockFacing = this.world.getBlockState(this.getPos()).getValue(BlockAcidBath.BlockCustom.FACING);
			boolean faceCheck = false;
			if (blockFacing == EnumFacing.NORTH) {
				faceCheck = (facing == EnumFacing.SOUTH);
			}
			else if (blockFacing == EnumFacing.SOUTH) {
				faceCheck = (facing == EnumFacing.NORTH);
			}
			else if (blockFacing == EnumFacing.EAST) {
				faceCheck = (facing == EnumFacing.WEST);
			}
			else if (blockFacing == EnumFacing.WEST) {
				faceCheck = (facing == EnumFacing.EAST);
			}
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY && faceCheck) {
				return true;
			}
			return super.hasCapability(capability, facing);
		}

		net.minecraftforge.items.IItemHandler handlerNull = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.UP);
		net.minecraftforge.items.IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.DOWN);


		@Nullable
		@Override
		public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
			EnumFacing blockFacing = this.world.getBlockState(this.getPos()).getValue(BlockAcidBath.BlockCustom.FACING);

			if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
				if (facing == EnumFacing.DOWN) {
					return (T) handlerBottom;
				} else {
					return (T) handlerNull;
				}
			}

			boolean faceCheck = false;
			if (blockFacing == EnumFacing.NORTH) {
				faceCheck = (facing == EnumFacing.SOUTH);
			}
			else if (blockFacing == EnumFacing.SOUTH) {
				faceCheck = (facing == EnumFacing.NORTH);
			}
			else if (blockFacing == EnumFacing.EAST) {
				faceCheck = (facing == EnumFacing.WEST);
			}
			else if (blockFacing == EnumFacing.WEST) {
				faceCheck = (facing == EnumFacing.EAST);
			}
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY && faceCheck) {
				return (T) this;
			}
			return super.getCapability(capability, facing);
		}

		public boolean hasCapabilityBucket(Capability<?> capability, @Nullable EnumFacing facing) {
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
				return true;
			}
			return super.hasCapability(capability, facing);
		}

		@Nullable
		public <T> T getCapabilityBucket(Capability<T> capability, @Nullable EnumFacing facing) {
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY) {
				return (T) this;
			}
			return super.getCapability(capability, facing);
		}


		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		public String getGuiID() {
			return null;
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			if (side == EnumFacing.DOWN) {
				return new int[] {0,1,2,3};
			}
			return new int[0];
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (direction == EnumFacing.DOWN) {
				return true;
			}
			return false;
		}
	}

	public static class AcidBathInfo
	{
		@Nullable
		public final FluidStack fluid;
		public final int capacity;

		public AcidBathInfo(@Nullable FluidStack fluid, int capacity)
		{
			this.fluid = fluid;
			this.capacity = capacity;
		}

		public AcidBathInfo(TileEntityAcidBath tank)
		{
			this.fluid = tank.getFluid();
			this.capacity = tank.getCapacity();
		}
	}

	public static class AcidBathPropertiesWrapper implements IFluidTankProperties
	{
		protected final TileEntityAcidBath tank;

		public AcidBathPropertiesWrapper(TileEntityAcidBath tank)
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

}


