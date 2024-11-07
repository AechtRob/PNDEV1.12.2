
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.gui.GUIArchiveSorterBottom;
import net.lepidodendron.item.ItemArchiveSorter;
import net.lepidodendron.util.BlockSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
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
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockArchiveSorterBottom extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archive_sorter_bottom")
	public static final Block block = null;

	public BlockArchiveSorterBottom(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archive_sorter_top);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("archive_sorter_bottom"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityArchiveBottom.class, "lepidodendron:tileentityarchive_sorter_bottom");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:archive_sorter_bottom", "inventory"));
	}

	public static class BlockCustom extends BlockHopper {
		public static final PropertyBool OPEN = PropertyBool.create("open");

		public BlockCustom() {
			super();
			setTranslationKey("pf_archive_sorter_bottom");
			setSoundType(SoundType.WOOD);
			setHardness(5F);
			setResistance(12F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ENABLED, Boolean.valueOf(true)));
		}

		@Override
		public Material getMaterial(IBlockState state) {
			return Material.WOOD;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemArchiveSorter.block, 1);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).getLocked()) {
					state = state.withProperty(OPEN, true);
				}
				else {
					state = state.withProperty(OPEN, false);
				}
			}
			else {
				state = state.withProperty(OPEN, false);
			}
			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				return state.withProperty(FACING, EnumFacing.NORTH);
			}
			return state;
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new TileEntityArchiveBottom();
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, ENABLED, OPEN});
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.SOLID;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			TileEntity te = world.getTileEntity(pos);
			if (te != null) {
				if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
					if (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).getLocked() && world.isRemote) {
						//Send chat message to inform who is using it:
						entity.sendMessage(new TextComponentString("Sorry, someone else is currently using the inventory here!"));
					}
					else if (entity instanceof EntityPlayer) {
						((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterBottom.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
					}
				}
			}
			return true;
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityArchiveBottom) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityArchiveBottom) tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}

			super.breakBlock(worldIn, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (!worldIn.isRemote) {
				TileEntity te = worldIn.getTileEntity(pos);
				if (te == null) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				if (!(te instanceof TileEntityArchiveBottom)) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				boolean flag = false;
				if (worldIn.getBlockState(pos.up()).getBlock() != BlockArchiveSorterBottomFiller.block) {
					flag = true;
				}
				switch (((TileEntityArchiveBottom) te).filingCategory) {
					case 0:
					default:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != this) {
							flag = true;
						}
						break;

					case 1:
					case 2:
					case 3:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != this) {
							flag = true;
						}
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite().rotateY())).getBlock() != this) {
							flag = true;
						}
						break;

					case 4:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite().rotateY())).getBlock() != this) {
							flag = true;
						}
						break;

				}
				if (flag) {
					worldIn.destroyBlock(pos, true);
				}
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

	}

	public static class TileEntityArchiveBottom extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(256, ItemStack.EMPTY);
		protected int filingCategory;
		protected boolean locked;

		private int transferCooldown = -1;

		public void searchResults(String str) {
			resetStacks();
			if (str.trim().equalsIgnoreCase("")) {
				return;
			}
			else {
				//Move slots 1-9 to the spare holding slots at the end (indices 247-255):
				for (int n = 0; n < 9; n++) {
					this.setInventorySlotContents(247 + n, this.getStackInSlot(n));
					this.setInventorySlotContents(n, ItemStack.EMPTY);
 				}
				//Get the matches for the search:
				int i = 0;
				int n = 0;
				for (ItemStack itemstack : this.stacks) {
					if (n >= 9) {
						break;
					}
					if (!itemstack.isEmpty() && n < 9) {
						if (str.contains(" ")) {
							//wildcard has been used:
							String[] searchList = str.split(" ");
							boolean notfound = false;
							for (String strMember : searchList) {
								if (!strMember.trim().equalsIgnoreCase("")) {
									if (!itemstack.getDisplayName().toUpperCase().contains(strMember.trim().toUpperCase())) {
										notfound = true;
										break;
									}
								}
							}
							if (!notfound) {
								this.setInventorySlotContents(n, itemstack);
								this.stacks.set(i, ItemStack.EMPTY);
								n++;
							}
						}
						else if (itemstack.getDisplayName().toUpperCase().contains(str.trim().toUpperCase())) {
							this.setInventorySlotContents(n, itemstack);
							this.stacks.set(i, ItemStack.EMPTY);
							n++;
						}
					}
					i++;
				}
			}
		}

		public String stackName(ItemStack stack) {
			if (stack.isEmpty()) {
				return "zzzzzzzzzzzz";
			}
			return stack.getDisplayName().toUpperCase();
		}

		public void resetStacks() {
			//Sort all stacks from slots 0 to 246 and alphabetically
			Collections.sort(this.stacks, new Comparator<ItemStack>() {
				@Override
				public int compare(ItemStack o1, ItemStack o2) {
					return stackName(o1).compareTo(stackName(o2));
				}
			});
		}

		public void setLocked(boolean val) {
			this.locked = val;
			resetStacks();
			if (val) {
				world.playSound(null, pos, BlockSounds.OPEN_DRAWER, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
			else {
				world.playSound(null, pos, BlockSounds.CLOSE_DRAWER, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}

		public boolean getLocked() {
			return this.locked;
		}

		public void setCategory(int type) {
			this.filingCategory = type;
		}

		public int getCategory() {
			return this.filingCategory;
		}

		private boolean isFull()
		{
			for (ItemStack itemstack : this.stacks)
			{
				if (itemstack.isEmpty() || itemstack.getCount() != itemstack.getMaxStackSize())
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

		private static boolean isInventoryEmpty(IInventory inventoryIn, EnumFacing side)
		{
			if (inventoryIn instanceof ISidedInventory)
			{
				ISidedInventory isidedinventory = (ISidedInventory)inventoryIn;
				int[] aint = isidedinventory.getSlotsForFace(side);

				for (int i : aint)
				{
					if (!isidedinventory.getStackInSlot(i).isEmpty())
					{
						return false;
					}
				}
			}
			else
			{
				int j = inventoryIn.getSizeInventory();

				for (int k = 0; k < j; ++k)
				{
					if (!inventoryIn.getStackInSlot(k).isEmpty())
					{
						return false;
					}
				}
			}

			return true;
		}

		private static boolean canExtractItemFromSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side)
		{
			return !(inventoryIn instanceof ISidedInventory) || ((ISidedInventory)inventoryIn).canExtractItem(index, stack, side);
		}

		public ItemStack putStackInInventoryAllSlots(IInventory source, ItemStack stack, @Nullable EnumFacing direction)
		{
			if (direction != null)
			{
				int[] aint = this.getSlotsForFace(direction);

				for (int k = 0; k < aint.length && !stack.isEmpty(); ++k)
				{
					stack = insertStack(source, this, stack, aint[k], direction);
				}
			}
			else
			{
				int i = this.getSizeInventory();

				for (int j = 0; j < i && !stack.isEmpty(); ++j)
				{
					stack = insertStack(source, this, stack, j, direction);
				}
			}

			return stack;
		}

		private boolean pullItemFromSlot(IInventory inventoryIn, int index, EnumFacing direction)
		{
			ItemStack itemstack = inventoryIn.getStackInSlot(index);

			if (!itemstack.isEmpty() && canExtractItemFromSlot(inventoryIn, itemstack, index, direction))
			{
				ItemStack itemstack1 = itemstack.copy();
				ItemStack itemstack2 = putStackInInventoryAllSlots(inventoryIn, inventoryIn.decrStackSize(index, 1), (EnumFacing)null);

				if (itemstack2.isEmpty())
				{
					inventoryIn.markDirty();
					return true;
				}

				inventoryIn.setInventorySlotContents(index, itemstack1);
			}

			return false;
		}

		public boolean pullItems() {

			//Get the main tile entity with the inventory:
			EnumFacing facing = world.getBlockState(pos).getValue(BlockArchiveSorterBottom.BlockCustom.FACING).rotateY().getOpposite();
			IInventory iinventory = TileEntityHopper.getInventoryAtPosition(this.getWorld(), pos.offset(facing, this.getCategory()).getX(), pos.offset(facing, this.getCategory()).getY() + 2.0D, pos.offset(facing, this.getCategory()).getZ());

			if (iinventory != null)
			{
				EnumFacing enumfacing = EnumFacing.DOWN;

				if (this.isInventoryEmpty(iinventory, enumfacing))
				{
					return false;
				}

				if (iinventory instanceof ISidedInventory)
				{
					ISidedInventory isidedinventory = (ISidedInventory)iinventory;
					int[] aint = isidedinventory.getSlotsForFace(enumfacing);

					for (int i : aint)
					{
						if (pullItemFromSlot(iinventory, i, enumfacing))
						{
							return true;
						}
					}
				}
				else
				{
					int j = iinventory.getSizeInventory();

					for (int k = 0; k < j; ++k)
					{
						if (pullItemFromSlot(iinventory, k, enumfacing))
						{
							return true;
						}
					}
				}
			}
			return false;
		}

		private boolean isOnTransferCooldown()
		{
			return this.transferCooldown > 0;
		}

		public void setTransferCooldown(int ticks)
		{
			this.transferCooldown = ticks;
		}

		@Override
		public void update() {

			if (this.world != null && !this.world.isRemote) {
				--this.transferCooldown;

				if (!this.isOnTransferCooldown()) {
					this.setTransferCooldown(0);
					this.updateHopper();
				}
			}
		}

		protected void updateHopper() {

			if (this.getWorld().isRemote) {
				return;
			}

			//Are there items to pull in?
			boolean flag = false;

			if (!this.isFull())
			{
				flag = pullItems() || flag;
			}

			if (flag)
			{
				this.setTransferCooldown(8);
				this.markDirty();
			}

		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 256;
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}

		public int countSlots() {
			int fullSlots = 0;
			for (ItemStack itemstack : this.stacks) {
					if (!itemstack.isEmpty()) {
					fullSlots ++;
				}
			}
			return fullSlots;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (this.getLocked()) {
				return false;
			}
			if (index >= 247) {
				return false; //these last 9 slots are for holding stuff for GUI purposes only
			}

			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PFMob")) {
					if (stack.getTagCompound().hasKey("mobtype")) {
						if (stack.getTagCompound().getString("mobtype").equalsIgnoreCase("vertebrate")) {
							return this.getCategory() == 0;
						}
						else if (stack.getTagCompound().getString("mobtype").equalsIgnoreCase("invertebrate")) {
							return this.getCategory() == 1;
						}
					}
				}
				else if (stack.getTagCompound().hasKey("PFStatic")) {
					return this.getCategory() == 2;
				}
				else if (stack.getTagCompound().hasKey("PFPlant")) {
					return this.getCategory() == 3;
				}
			}
			return this.getCategory() == 4;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "container.archive_sorter_bottom";
		}

		@Override
		public String getGuiID() {
			return "lepidodendron:gui_archive_sorter_bottom";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIArchiveSorterBottom.GUILepidodendronArchiveSorterBottom(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.stacks);
			}
			this.transferCooldown = compound.getInteger("TransferCooldown");
			if (compound.hasKey("filingCategory")) {
				this.filingCategory = compound.getInteger("filingCategory");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}
			compound.setInteger("TransferCooldown", this.transferCooldown);
			compound.setInteger("filingCategory", this.filingCategory);
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
			this.getWorld().markBlockRangeForRenderUpdate(this.pos, this.pos);
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[] {
					0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
					16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,
					32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,
					48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,
					64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,
					80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,
					96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,
					112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,
					128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,
					144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,
					160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,
					176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,
					192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,
					208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,
					224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,
					240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255
			};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (this.getLocked()) {
				return false;
			}
			return this.isItemValidForSlot(index, itemStackIn);
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (this.getLocked()) {
				return false;
			}
			return true;
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