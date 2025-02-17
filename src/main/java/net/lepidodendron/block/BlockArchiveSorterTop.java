
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronRecipeFossils;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.gui.GUIArchiveSorterTop;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockArchiveSorterTop extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archive_sorter_top")
	public static final Block block = null;

	public BlockArchiveSorterTop(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archive_sorter_top);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("archive_sorter_top"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityArchiveSorterTop.class, "lepidodendron:tileentityarchive_sorter_top");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:archive_sorter_top", "inventory"));
	}

	public static class BlockCustom extends BlockHopper {

		public BlockCustom() {
			super();
			setTranslationKey("pf_archive_sorter_top");
			setSoundType(SoundType.WOOD);
			setHardness(10F);
			setResistance(1200F);
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
			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				return state.withProperty(FACING, EnumFacing.NORTH);
			}
			return state;
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new TileEntityArchiveSorterTop();
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(ItemArchiveSorter.block, 1).getItem());
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, ENABLED});
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP) {
				return BlockFaceShape.BOWL;
			}
			if (face == state.getValue(FACING).getOpposite()) {
				return BlockFaceShape.UNDEFINED;
			}
			return BlockFaceShape.SOLID;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing()).withProperty(ENABLED, Boolean.valueOf(true));
		}

		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
			super.onBlockPlacedBy(worldIn, pos, state, placer, stack);

			if (stack.hasDisplayName()) {
				TileEntity tileentity = worldIn.getTileEntity(pos);

				if (tileentity instanceof TileEntityArchiveSorterTop) {
					((TileEntityArchiveSorterTop) tileentity).setCustomName(stack.getDisplayName());
				}
			}
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterTop.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityArchiveSorterTop) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityArchiveSorterTop) tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}

			super.breakBlock(worldIn, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (!worldIn.isRemote) {
				TileEntity te = worldIn.getTileEntity(pos.down(2));
				if (te == null) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				if (!(te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom)) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				boolean flag = false;
				if (worldIn.getBlockState(pos.down()).getBlock() != BlockArchiveSorterBottomFiller.block) {
					flag = true;
				}
				switch (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).filingCategory) {
					case 0:
					default:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != BlockArchiveSorterTopFiller.block) {
							flag = true;
						}
						break;

					case 1:
					case 2:
					case 3:
					case 4:
						flag = true;
						break;

				}
				if (flag) {
					worldIn.destroyBlock(pos, true);
				}
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

	}

	public static class TileEntityArchiveSorterTop extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(14, ItemStack.EMPTY);
		public boolean stackPrecambrian;
		public boolean stackCambrian;
		public boolean stackOrdovician;
		public boolean stackSilurian;
		public boolean stackDevonian;
		public boolean stackCarboniferous;
		public boolean stackPermian;
		public boolean stackTriassic;
		public boolean stackJurassic;
		public boolean stackCretaceous;
		public boolean stackPaleogene;
		public boolean stackNeogene;
		public boolean stackPleistocene;
		public boolean stackOther;

		private int transferCooldown = -1;

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

		public static boolean putDropInInventoryAllSlots(World worldIn, IInventory source, IInventory destination, EntityItem entity)
		{
			boolean flag = false;

			if (entity == null)
			{
				return false;
			}
			else
			{
				ItemStack itemstack = entity.getItem().copy();
				tagFossilFully(worldIn, itemstack);
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

			boolean isAnySlotValid = false;
			for (int s = 0; s <= this.getSizeInventory() - 1; s++) {
				if (this.isItemValidForSlot(s, itemstack)) {
					if (!this.getStackInSlot(s).isEmpty()) {
						if (this.getStackInSlot(s).getCount() >=
								this.getStackInSlot(s).getMaxStackSize()) {
							return false;
						}
						ItemStack is1 = this.getStackInSlot(s).copy();
						is1.setCount(1);
						ItemStack is2 = itemstack.copy();
						is2.setCount(1);
						if (!ItemStack.areItemStacksEqual(is1, is2) ) {
							return false;
						}
						isAnySlotValid = true;
					}
					else {
						isAnySlotValid = true;
					}
				}
			}

			if (!isAnySlotValid) {
				return false;
			}

			if (!itemstack.isEmpty() && canExtractItemFromSlot(inventoryIn, itemstack, index, direction))
			{
				ItemStack itemstack1 = itemstack.copy();
				tagFossilFully(world, itemstack1);

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

		public static void tagFossilFully(World worldIn, ItemStack stack) {
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("mobtype")) {
					return;
				}
				if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
					String id_dna = resourcelocation.toString();
					if (id_dna.indexOf("@") > 0) {
						id_dna = id_dna.substring(0, id_dna.indexOf("@"));
					}
					boolean isArthropod = LepidodendronRecipeFossils.isArthropod(worldIn, id_dna);
					if (isArthropod) {
						stack.getTagCompound().setString("mobtype", "invertebrate");
					} else {
						stack.getTagCompound().setString("mobtype", "vertebrate");
					}
				}
			}
		}

		public boolean pullItems() {

			IInventory iinventory = TileEntityHopper.getInventoryAtPosition(this.getWorld(), pos.getX(), pos.getY() + 1.0D, pos.getZ());

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
			else {
				for (EntityItem entityitem : getCaptureItems(this.getWorld(), pos.getX(), pos.getY(), pos.getZ())) {
					if (putDropInInventoryAllSlots(world, (IInventory) null, this, entityitem)) {
						return true;
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
			return 14;
		}

		@Override
		public boolean isEmpty() {
			for (ItemStack itemstack : this.stacks)
				if (!itemstack.isEmpty())
					return false;
			return true;
		}

		public static int periodTag(ItemStack stack) {
			if (stack.getTagCompound() != null) {
				if (stack.getTagCompound().hasKey("period")) {
					return stack.getTagCompound().getInteger("period");
				}
			}
			if (stack.getItem() == ItemFossilPrecambrian.block
				|| stack.getItem() == Item.getItemFromBlock(BlockFossilPrecambrian.block)) {
				return 1;
			}
			if (stack.getItem() == ItemFossilCambrian.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilCambrian.block)) {
				return 2;
			}
			if (stack.getItem() == ItemFossilOrdovician.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilOrdovician.block)) {
				return 3;
			}
			if (stack.getItem() == ItemFossilSilurian.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilSilurian.block)) {
				return 4;
			}
			if (stack.getItem() == ItemFossilDevonian.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilDevonian.block)) {
				return 5;
			}
			if (stack.getItem() == ItemFossilCarboniferous.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilCarboniferous.block)) {
				return 6;
			}
			if (stack.getItem() == ItemFossilPermian.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilPermian.block)) {
				return 7;
			}
			if (stack.getItem() == ItemFossilTriassic.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilTriassic.block)) {
				return 8;
			}
			if (stack.getItem() == ItemFossilJurassic.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilJurassic.block)) {
				return 9;
			}
			if (stack.getItem() == ItemFossilCretaceous.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilCretaceous.block)) {
				return 10;
			}
			if (stack.getItem() == ItemFossilPaleogene.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilPaleogene.block)) {
				return 11;
			}
			if (stack.getItem() == ItemFossilNeogene.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilNeogene.block)) {
				return 12;
			}
			if (stack.getItem() == ItemFossilPleistocene.block
					|| stack.getItem() == Item.getItemFromBlock(BlockFossilPleistocene.block)) {
				return 13;
			}
			return 0;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0 && stackPrecambrian)
				return periodTag(stack) == 1;
			if (index == 1 && stackCambrian)
				return periodTag(stack) == 2;
			if (index == 2 && stackOrdovician)
				return periodTag(stack) == 3;
			if (index == 3 && stackSilurian)
				return periodTag(stack) == 4;
			if (index == 4 && stackDevonian)
				return periodTag(stack) == 5;
			if (index == 5 && stackCarboniferous)
				return periodTag(stack) == 6;
			if (index == 6 && stackPermian)
				return periodTag(stack) == 7;
			if (index == 7 && stackTriassic)
				return periodTag(stack) == 8;
			if (index == 8 && stackJurassic)
				return periodTag(stack) == 9;
			if (index == 9 && stackCretaceous)
				return periodTag(stack) == 10;
			if (index == 10 && stackPaleogene)
				return periodTag(stack) == 11;
			if (index == 11 && stackNeogene)
				return periodTag(stack) == 12;
			if (index == 12 && stackPleistocene)
				return periodTag(stack) == 13;
			if (index == 13 && stackOther)
				return periodTag(stack) == 0;

			return false;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "container.archive_sorter_top";
		}

		@Override
		public String getGuiID() {
			return "lepidodendron:gui_archive_sorter_top";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIArchiveSorterTop.GUILepidodendronArchiveSorterTop(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
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
			if (compound.hasKey("stackPrecambrian")) {
				this.stackPrecambrian = compound.getBoolean("stackPrecambrian");
			}
			if (compound.hasKey("stackCambrian")) {
				this.stackCambrian = compound.getBoolean("stackCambrian");
			}
			if (compound.hasKey("stackOrdovician")) {
				this.stackOrdovician = compound.getBoolean("stackOrdovician");
			}
			if (compound.hasKey("stackSilurian")) {
				this.stackSilurian = compound.getBoolean("stackSilurian");
			}
			if (compound.hasKey("stackDevonian")) {
				this.stackDevonian = compound.getBoolean("stackDevonian");
			}
			if (compound.hasKey("stackCarboniferous")) {
				this.stackCarboniferous = compound.getBoolean("stackCarboniferous");
			}
			if (compound.hasKey("stackPermian")) {
				this.stackPermian = compound.getBoolean("stackPermian");
			}
			if (compound.hasKey("stackTriassic")) {
				this.stackTriassic = compound.getBoolean("stackTriassic");
			}
			if (compound.hasKey("stackJurassic")) {
				this.stackJurassic = compound.getBoolean("stackJurassic");
			}
			if (compound.hasKey("stackCretaceous")) {
				this.stackCretaceous = compound.getBoolean("stackCretaceous");
			}
			if (compound.hasKey("stackPaleogene")) {
				this.stackPaleogene = compound.getBoolean("stackPaleogene");
			}
			if (compound.hasKey("stackNeogene")) {
				this.stackNeogene = compound.getBoolean("stackNeogene");
			}
			if (compound.hasKey("stackPleistocene")) {
				this.stackPleistocene = compound.getBoolean("stackPleistocene");
			}
			if (compound.hasKey("stackOther")) {
				this.stackOther = compound.getBoolean("stackOther");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}
			compound.setInteger("TransferCooldown", this.transferCooldown);
			compound.setBoolean("stackPrecambrian", this.stackPrecambrian);
			compound.setBoolean("stackCambrian", this.stackCambrian);
			compound.setBoolean("stackOrdovician", this.stackOrdovician);
			compound.setBoolean("stackSilurian", this.stackSilurian);
			compound.setBoolean("stackDevonian", this.stackDevonian);
			compound.setBoolean("stackCarboniferous", this.stackCarboniferous);
			compound.setBoolean("stackPermian", this.stackPermian);
			compound.setBoolean("stackTriassic", this.stackTriassic);
			compound.setBoolean("stackJurassic", this.stackJurassic);
			compound.setBoolean("stackCretaceous", this.stackCretaceous);
			compound.setBoolean("stackPaleogene", this.stackPaleogene);
			compound.setBoolean("stackNeogene", this.stackNeogene);
			compound.setBoolean("stackPleistocene", this.stackPleistocene);
			compound.setBoolean("stackOther", this.stackOther);
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
					0,1,2,3,4,5,6,7,8,9,10,11,12,13
			};
			}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return this.isItemValidForSlot(index, itemStackIn);
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (direction == EnumFacing.DOWN) {
				return true;
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
	}
}