
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.util.BlockSounds;
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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
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
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTimeResearcherHopper extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher_hopper")
	public static final Block block = null;

	public BlockTimeResearcherHopper(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("time_researcher_hopper"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTimeResearcherHopper.class, "lepidodendron:tileentitytime_researcher_hopper");
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:time_researcher_hopper", "inventory"));
//	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_time_researcher_hopper");
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
			return BlockTimeResearcher.BlockCustom.dropStack(world, pos.down());
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTimeResearcherHopper.TileEntityTimeResearcherHopper();
		}

		public BlockTimeResearcherHopper.TileEntityTimeResearcherHopper createNewTileEntity(World worldIn, int meta) {
			return new BlockTimeResearcherHopper.TileEntityTimeResearcherHopper();
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
				if (tileentity instanceof BlockTimeResearcherHopper.TileEntityTimeResearcherHopper) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTimeResearcherHopper.TileEntityTimeResearcherHopper) tileentity);
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
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (worldIn.getBlockState(pos.down()).getBlock() != BlockTimeResearcher.block) {
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
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
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

	public static class TileEntityTimeResearcherHopper extends TileEntityLockableLoot implements ITickable, ISidedInventory {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(13, ItemStack.EMPTY);

		public int processTick;
		public float crusherRotation;
		public int soundLength = 42;
		public int soundTick;
		private int minEnergyNeeded = 100;

		private boolean isFull()
		{
			for (ItemStack itemstack : this.forgeContents)
			{
				if (itemstack.isEmpty() || itemstack.getCount() != itemstack.getMaxStackSize())
				{
					return false;
				}
			}

			return true;
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

		public static List<EntityItem> getCaptureItems(World worldIn, double p_184292_1_, double p_184292_3_, double p_184292_5_)
		{
			return worldIn.<EntityItem>getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(p_184292_1_ - 0.5D, p_184292_3_, p_184292_5_ - 0.5D, p_184292_1_ + 0.5D, p_184292_3_ + 1.5D, p_184292_5_ + 0.5D), EntitySelectors.IS_ALIVE);
		}

		public static boolean putDropInInventoryAllSlots(IInventory source, IInventory destination, EntityItem entity)
		{
			boolean flag = false;

			if (entity == null)
			{
				return false;
			}
			else
			{
				ItemStack itemstack = entity.getItem().copy();
				ItemStack itemstack1 = putStackInInventoryAllSlots(source, destination, itemstack, (EnumFacing)null);

				if (itemstack1.isEmpty())
				{
					flag = true;
					entity.setDead();
				}
				else
				{
					entity.setItem(itemstack1);
				}

				return flag;
			}
		}

		public static ItemStack putStackInInventoryAllSlots(IInventory source, IInventory destination, ItemStack stack, @Nullable EnumFacing direction)
		{

			int i = destination.getSizeInventory();

			for (int j = 0; j < i && !stack.isEmpty(); ++j)
			{
				stack = insertStack(source, destination, stack, j, direction);
			}

			return stack;
		}

		private static boolean canInsertItemInSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side)
		{
			if (!inventoryIn.isItemValidForSlot(index, stack))
			{
				return false;
			}
			else
			{
				return !(inventoryIn instanceof ISidedInventory) || ((ISidedInventory)inventoryIn).canInsertItem(index, stack, side);
			}
		}

		private static boolean canCombine(ItemStack stack1, ItemStack stack2)
		{
			if (stack1.getItem() != stack2.getItem())
			{
				return false;
			}
			else if (stack1.getMetadata() != stack2.getMetadata())
			{
				return false;
			}
			else if (stack1.getCount() > stack1.getMaxStackSize())
			{
				return false;
			}
			else
			{
				return ItemStack.areItemStackTagsEqual(stack1, stack2);
			}
		}

		private static ItemStack insertStack(IInventory source, IInventory destination, ItemStack stack, int index, EnumFacing direction)
		{
			ItemStack itemstack = destination.getStackInSlot(index);

			if (canInsertItemInSlot(destination, stack, index, direction))
			{
				boolean flag = false;
				boolean flag1 = destination.isEmpty();

				if (itemstack.isEmpty())
				{
					destination.setInventorySlotContents(index, stack);
					stack = ItemStack.EMPTY;
					flag = true;
				}
				else if (canCombine(itemstack, stack))
				{
					int i = stack.getMaxStackSize() - itemstack.getCount();
					int j = Math.min(stack.getCount(), i);
					stack.shrink(j);
					itemstack.grow(j);
					flag = j > 0;
				}

				if (flag)
				{
					destination.markDirty();
				}
			}

			return stack;
		}

		public boolean pullItems() {
			for (EntityItem entityitem : getCaptureItems(this.getWorld(), pos.getX(), pos.getY(), pos.getZ()))
			{
				if (this.isItemValidForSlot(0, entityitem.getItem())) {
					if (putDropInInventoryAllSlots((IInventory) null, this, entityitem)) {
						return true;
					}
				}
			}
			return false;
		}

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			if (LepidodendronConfig.machinesRF) {
				TileEntity te = world.getTileEntity(pos.down());
				if (te != null) {
					if (te instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
						if (!((BlockTimeResearcher.TileEntityTimeResearcher)te).hasEnergy(minEnergyNeeded)) {
							return;
						}
					}
				}
			}

			this.soundTick --;
			if (soundTick < 0) {
				this.soundTick = 0;
			}

			//Are there items to pull in?
			boolean flag = false;

			if (!this.isFull())
			{
				flag = pullItems() || flag;
			}

			if (flag)
			{
				this.markDirty();
			}

			if (this.processTick > 0) {
				TileEntity te = world.getTileEntity(pos.down());
				if (te != null) {
					if (te instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
						((BlockTimeResearcher.TileEntityTimeResearcher)te).drainEnergy(10);
					}
				}
				this.crusherRotation = this.crusherRotation + (0.5F * Math.min(this.processTick, 20));
				if (this.crusherRotation >= 360) {
					this.crusherRotation = 0;
				}
				if (this.processTick >= 40 && !isSoundPlaying()) {
					playSound(world, pos);
				}
				this.notifyBlockUpdate();
			}

			if ((!(isItemValidForSlot(0, this.getStackInSlot(0))))
			|| this.getStackInSlot(0).isEmpty()) {
				this.processTick --;
				if (this.processTick < 0) {
					this.processTick = 0;
				}
				return;
			}


			IBlockState state = world.getBlockState(pos.down());
			if (state.getBlock() != BlockTimeResearcher.block) {
				this.processTick = 0;
				return;
			}

			TileEntity te = world.getTileEntity(pos.down());
			if (te == null) {
				this.processTick = 0;
				return;
			}
			if (te instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
				BlockTimeResearcher.TileEntityTimeResearcher tileEntity = (BlockTimeResearcher.TileEntityTimeResearcher) te;
				if (tileEntity.getStackInSlot(0).isEmpty()) {
					//Cycle over the inventory:
					int ii = 0;
					while (ii <= this.getSizeInventory()) {
						if ((!this.getStackInSlot(ii).isEmpty()) && tileEntity.isItemValidForSlot(0, this.getStackInSlot(ii))) {
							tileEntity.setInventorySlotContents(0, new ItemStack(this.getStackInSlot(ii).getItem(), 1));
							this.getStackInSlot(ii).shrink(1);
							this.notifyBlockUpdate();
							tileEntity.notifyBlockUpdate();
							this.processTick = 100;
							markDirty();
							return;
						}
						ii ++;
					}
				}
				else {
					//Something is in the slot in the researcher underneath so keep the animations going:
					if (!isSoundPlaying()) {
						playSound(world, pos);
					}
				}
				return;
			}
			this.processTick = 0;
		}

		public void playSound(World world, BlockPos pos) {
			world.playSound(null, pos, BlockSounds.TIME_RESEARCHER_CRUSHER, SoundCategory.BLOCKS, 1.0F, 1.0F);
			this.soundTick = this.soundLength;
		}

		public boolean isSoundPlaying() {
			return this.soundTick > 0;
		}

		public float getCrusherRotation() {
			return this.crusherRotation;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 13;
		}

		@Override
		public String getName() {
			return "container.time_researcher_hopper";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_time_researcher_hopper";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("crusherRotation")) {
				this.crusherRotation = compound.getFloat("crusherRotation");
			}
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("processTick", this.processTick);
			compound.setFloat("crusherRotation", this.crusherRotation);
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
			return new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (direction == null || direction == EnumFacing.UP) { //Fossil
				return isItemValidForSlot(index, itemStackIn);
			}
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
//			if (index == 0) {
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
//			}
//			if (index == 1)
//				return false;

//			return false;
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

	}
}