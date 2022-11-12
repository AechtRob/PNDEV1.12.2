
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUISorterFossil;
import net.lepidodendron.util.FossilSorterHooks;
import net.lepidodendron.util.FossilSorterItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSorterFossil extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:fossil_sorter")
	public static final Block block = null;

	public BlockSorterFossil(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.fossil_sorter);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("fossil_sorter"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntitySorterFossil.class, "lepidodendron:tileentityfossil_sorter");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:fossil_sorter", "inventory"));
	}

	public static class BlockCustom extends BlockHopper {

		public BlockCustom() {
			super();
			setTranslationKey("pf_fossil_sorter");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ENABLED, Boolean.valueOf(true)));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Sorts fossils and DNA into plants, mobs and static creatures");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta) {
			return new TileEntitySorterFossil();
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, ENABLED});
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP) {
				return BlockFaceShape.BOWL;
			}
			if (face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
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

				if (tileentity instanceof TileEntitySorterFossil) {
					((TileEntitySorterFossil) tileentity).setCustomName(stack.getDisplayName());
				}
			}
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUISorterFossil.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntitySorterFossil) {
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntitySorterFossil) tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}

			super.breakBlock(worldIn, pos, state);
		}

	}

	public static class TileEntitySorterFossil extends TileEntityLockableLoot implements IHopper, ITickable {
		private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(5, ItemStack.EMPTY);
		private int transferCooldown = -1;
		private long tickedGameTime;

		public void readFromNBT(NBTTagCompound compound)
		{
			super.readFromNBT(compound);
			this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);

			if (!this.checkLootAndRead(compound))
			{
				ItemStackHelper.loadAllItems(compound, this.inventory);
			}

			if (compound.hasKey("CustomName", 8))
			{
				this.customName = compound.getString("CustomName");
			}

			this.transferCooldown = compound.getInteger("TransferCooldown");
		}

		public NBTTagCompound writeToNBT(NBTTagCompound compound)
		{
			super.writeToNBT(compound);

			if (!this.checkLootAndWrite(compound))
			{
				ItemStackHelper.saveAllItems(compound, this.inventory);
			}

			compound.setInteger("TransferCooldown", this.transferCooldown);

			if (this.hasCustomName())
			{
				compound.setString("CustomName", this.customName);
			}

			return compound;
		}

		public int getSizeInventory()
		{
			return this.inventory.size();
		}

		public ItemStack decrStackSize(int index, int count)
		{
			this.fillWithLoot((EntityPlayer)null);
			ItemStack itemstack = ItemStackHelper.getAndSplit(this.getItems(), index, count);
			return itemstack;
		}

		public void setInventorySlotContents(int index, ItemStack stack)
		{
			this.fillWithLoot((EntityPlayer)null);
			this.getItems().set(index, stack);

			if (stack.getCount() > this.getInventoryStackLimit())
			{
				stack.setCount(this.getInventoryStackLimit());
			}
		}

		public String getName()
		{
			return this.hasCustomName() ? this.customName : "container.hopper";
		}

		public int getInventoryStackLimit()
		{
			return 64;
		}

		public void update()
		{
			if (this.world != null && !this.world.isRemote)
			{
				--this.transferCooldown;
				this.tickedGameTime = this.world.getTotalWorldTime();

				if (!this.isOnTransferCooldown())
				{
					this.setTransferCooldown(0);
					this.updateHopper();
				}
			}
		}

		protected boolean updateHopper()
		{
			if (this.world != null && !this.world.isRemote)
			{
				if (!this.isOnTransferCooldown() && BlockHopper.isEnabled(this.getBlockMetadata()))
				{
					boolean flag = false;

					if (!this.isInventoryEmpty())
					{
						flag = this.transferItemsOut();
					}

					if (!this.isFull())
					{
						flag = pullItems(this) || flag;
					}

					if (flag)
					{
						this.setTransferCooldown(8);
						this.markDirty();
						return true;
					}
				}

				return false;
			}
			else
			{
				return false;
			}
		}

		private boolean isInventoryEmpty()
		{
			for (ItemStack itemstack : this.inventory)
			{
				if (!itemstack.isEmpty())
				{
					return false;
				}
			}

			return true;
		}

		public boolean isEmpty()
		{
			return this.isInventoryEmpty();
		}

		private boolean isFull()
		{
			for (ItemStack itemstack : this.inventory)
			{
				if (itemstack.isEmpty() || itemstack.getCount() != itemstack.getMaxStackSize())
				{
					return false;
				}
			}

			return true;
		}


		private boolean isInventoryFull(IInventory inventoryIn, EnumFacing side)
		{
			if (inventoryIn instanceof ISidedInventory)
			{
				ISidedInventory isidedinventory = (ISidedInventory)inventoryIn;
				int[] aint = isidedinventory.getSlotsForFace(side);

				for (int k : aint)
				{
					ItemStack itemstack1 = isidedinventory.getStackInSlot(k);

					if (itemstack1.isEmpty() || itemstack1.getCount() != itemstack1.getMaxStackSize())
					{
						return false;
					}
				}
			}
			else
			{
				int i = inventoryIn.getSizeInventory();

				for (int j = 0; j < i; ++j)
				{
					ItemStack itemstack = inventoryIn.getStackInSlot(j);

					if (itemstack.isEmpty() || itemstack.getCount() != itemstack.getMaxStackSize())
					{
						return false;
					}
				}
			}

			return true;
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

		public static boolean pullItems(IHopper hopper)
		{
			Boolean ret = FossilSorterHooks.extractHook(hopper);
			if (ret != null) return ret;
			IInventory iinventory = getSourceInventory(hopper);

			if (iinventory != null)
			{
				EnumFacing enumfacing = EnumFacing.DOWN;

				if (isInventoryEmpty(iinventory, enumfacing))
				{
					return false;
				}

				if (iinventory instanceof ISidedInventory)
				{
					ISidedInventory isidedinventory = (ISidedInventory)iinventory;
					int[] aint = isidedinventory.getSlotsForFace(enumfacing);

					for (int i : aint)
					{
						if (pullItemFromSlot(hopper, iinventory, i, enumfacing))
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
						if (pullItemFromSlot(hopper, iinventory, k, enumfacing))
						{
							return true;
						}
					}
				}
			}
			else
			{
				for (EntityItem entityitem : getCaptureItems(hopper.getWorld(), hopper.getXPos(), hopper.getYPos(), hopper.getZPos()))
				{
					if (putDropInInventoryAllSlots((IInventory)null, hopper, entityitem))
					{
						return true;
					}
				}
			}

			return false;
		}

		private static boolean pullItemFromSlot(IHopper hopper, IInventory inventoryIn, int index, EnumFacing direction)
		{
			ItemStack itemstack = inventoryIn.getStackInSlot(index);

			if (!itemstack.isEmpty() && canExtractItemFromSlot(inventoryIn, itemstack, index, direction))
			{
				ItemStack itemstack1 = itemstack.copy();
				ItemStack itemstack2 = putStackInInventoryAllSlots(inventoryIn, hopper, inventoryIn.decrStackSize(index, 1), (EnumFacing)null);

				if (itemstack2.isEmpty())
				{
					inventoryIn.markDirty();
					return true;
				}

				inventoryIn.setInventorySlotContents(index, itemstack1);
			}

			return false;
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


		protected net.minecraftforge.items.IItemHandler createUnSidedHandler()
		{
			return new FossilSorterItemHandler(this);
		}

		public static ItemStack putStackInInventoryAllSlots(IInventory source, IInventory destination, ItemStack stack, @Nullable EnumFacing direction)
		{
			if (destination instanceof ISidedInventory && direction != null)
			{
				ISidedInventory isidedinventory = (ISidedInventory)destination;
				int[] aint = isidedinventory.getSlotsForFace(direction);

				for (int k = 0; k < aint.length && !stack.isEmpty(); ++k)
				{
					stack = insertStack(source, destination, stack, aint[k], direction);
				}
			}
			else
			{
				int i = destination.getSizeInventory();

				for (int j = 0; j < i && !stack.isEmpty(); ++j)
				{
					stack = insertStack(source, destination, stack, j, direction);
				}
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

		private static boolean canExtractItemFromSlot(IInventory inventoryIn, ItemStack stack, int index, EnumFacing side)
		{
			return !(inventoryIn instanceof ISidedInventory) || ((ISidedInventory)inventoryIn).canExtractItem(index, stack, side);
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
					if (flag1 && destination instanceof TileEntityHopper)
					{
						TileEntityHopper tileentityhopper1 = (TileEntityHopper)destination;

						if (!tileentityhopper1.mayTransfer())
						{
							tileentityhopper1.setTransferCooldown(8);
						}
					}

					destination.markDirty();
				}
			}

			return stack;
		}

		private IInventory getInventoryForHopperTransfer()
		{
			EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata());
			return getInventoryAtPosition(this.getWorld(), this.getXPos() + (double)enumfacing.getXOffset(), this.getYPos() + (double)enumfacing.getYOffset(), this.getZPos() + (double)enumfacing.getZOffset());
		}

		public static IInventory getSourceInventory(IHopper hopper)
		{
			return getInventoryAtPosition(hopper.getWorld(), hopper.getXPos(), hopper.getYPos() + 1.0D, hopper.getZPos());
		}

		public static List<EntityItem> getCaptureItems(World worldIn, double p_184292_1_, double p_184292_3_, double p_184292_5_)
		{
			return worldIn.<EntityItem>getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(p_184292_1_ - 0.5D, p_184292_3_, p_184292_5_ - 0.5D, p_184292_1_ + 0.5D, p_184292_3_ + 1.5D, p_184292_5_ + 0.5D), EntitySelectors.IS_ALIVE);
		}

		public static IInventory getInventoryAtPosition(World worldIn, double x, double y, double z)
		{
			IInventory iinventory = null;
			int i = MathHelper.floor(x);
			int j = MathHelper.floor(y);
			int k = MathHelper.floor(z);
			BlockPos blockpos = new BlockPos(i, j, k);
			net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
			Block block = state.getBlock();

			if (block.hasTileEntity(state))
			{
				TileEntity tileentity = worldIn.getTileEntity(blockpos);

				if (tileentity instanceof IInventory)
				{
					iinventory = (IInventory)tileentity;

					if (iinventory instanceof TileEntityChest && block instanceof BlockChest)
					{
						iinventory = ((BlockChest)block).getContainer(worldIn, blockpos, true);
					}
				}
			}

			if (iinventory == null)
			{
				List<Entity> list = worldIn.getEntitiesInAABBexcluding((Entity)null, new AxisAlignedBB(x - 0.5D, y - 0.5D, z - 0.5D, x + 0.5D, y + 0.5D, z + 0.5D), EntitySelectors.HAS_INVENTORY);

				if (!list.isEmpty())
				{
					iinventory = (IInventory)list.get(worldIn.rand.nextInt(list.size()));
				}
			}

			return iinventory;
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

		public double getXPos()
		{
			return (double)this.pos.getX() + 0.5D;
		}

		public double getYPos()
		{
			return (double)this.pos.getY() + 0.5D;
		}

		public double getZPos()
		{
			return (double)this.pos.getZ() + 0.5D;
		}

		public void setTransferCooldown(int ticks)
		{
			this.transferCooldown = ticks;
		}

		private boolean isOnTransferCooldown()
		{
			return this.transferCooldown > 0;
		}

		public boolean mayTransfer()
		{
			return this.transferCooldown > 8;
		}

		public String getGuiID()
		{
			return "minecraft:hopper";
		}

		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
		{
			this.fillWithLoot(playerIn);
			return new ContainerHopper(playerInventory, this, playerIn);
		}

		protected NonNullList<ItemStack> getItems()
		{
			return this.inventory;
		}

		public long getLastUpdateTime() { return tickedGameTime; } // Forge







		private IInventory getInventoryForHopperTransferFront()
		{
			EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata());
			if (enumfacing == EnumFacing.NORTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() + 1);
			}
			if (enumfacing == EnumFacing.SOUTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() - 1);
			}
			if (enumfacing == EnumFacing.EAST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() - 1, this.getYPos(), this.getZPos());
			}
			if (enumfacing == EnumFacing.WEST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() + 1, this.getYPos(), this.getZPos());
			}
			return getInventoryAtPosition(this.getWorld(), this.getXPos() + (double)enumfacing.getXOffset(), this.getYPos() + (double)enumfacing.getYOffset(), this.getZPos() + (double)enumfacing.getZOffset());
		}

		private IInventory getInventoryForHopperTransferRight()
		{
			EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata());
			if (enumfacing == EnumFacing.NORTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() + 1, this.getYPos(), this.getZPos());
			}
			if (enumfacing == EnumFacing.SOUTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() - 1, this.getYPos(), this.getZPos());
			}
			if (enumfacing == EnumFacing.EAST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() - 1);
			}
			if (enumfacing == EnumFacing.WEST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() + 1);
			}
			return getInventoryAtPosition(this.getWorld(), this.getXPos() + (double)enumfacing.getXOffset(), this.getYPos() + (double)enumfacing.getYOffset(), this.getZPos() + (double)enumfacing.getZOffset());
		}

		private IInventory getInventoryForHopperTransferLeft()
		{
			EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata());
			if (enumfacing == EnumFacing.NORTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() - 1, this.getYPos(), this.getZPos());
			}
			if (enumfacing == EnumFacing.SOUTH) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos() + 1, this.getYPos(), this.getZPos());
			}
			if (enumfacing == EnumFacing.EAST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() + 1);
			}
			if (enumfacing == EnumFacing.WEST) {
				return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos(), this.getZPos() - 1);
			}
			return getInventoryAtPosition(this.getWorld(), this.getXPos() + (double)enumfacing.getXOffset(), this.getYPos() + (double)enumfacing.getYOffset(), this.getZPos() + (double)enumfacing.getZOffset());
		}

		private IInventory getInventoryForHopperTransferDown()
		{
			return getInventoryAtPosition(this.getWorld(), this.getXPos(), this.getYPos() - 1, this.getZPos());
		}


		private boolean transferItemsOut()
		{
			if (FossilSorterHooks.insertHook(this)) {
				return true;
			}
			return false;

			/*
			System.err.println("Stage 2");
			IInventory iinventoryFront = this.getInventoryForHopperTransferFront();
			IInventory iinventoryLeft = this.getInventoryForHopperTransferLeft();
			IInventory iinventoryRight = this.getInventoryForHopperTransferRight();
			IInventory iinventoryDown = this.getInventoryForHopperTransferDown();
			boolean result = false;

			if (iinventoryFront != null){
				EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata());
				boolean stackSwapped = false;
				if (!(this.isInventoryFull(iinventoryFront, enumfacing))) {
					for (int i = 0; i < this.getSizeInventory() && !stackSwapped; ++i)
					{
						if (!this.getStackInSlot(i).isEmpty()) {
							if (this.getStackInSlot(i).hasTagCompound()) {
								if (this.getStackInSlot(i).getTagCompound().hasKey("PFMob")) {

									ItemStack itemstack = this.getStackInSlot(i).copy();
									ItemStack itemstack1 = putStackInInventoryAllSlots(this, iinventoryFront, this.decrStackSize(i, 1), enumfacing);
									//itemstack.shrink(1);

									if (itemstack1.isEmpty()) {
										iinventoryFront.markDirty();
										result = true;
										stackSwapped = true;
									}

									this.setInventorySlotContents(i, itemstack1);
								}
							}
						}
					}
				}
			}
			if (iinventoryLeft != null){
				EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata()).rotateY();
				boolean stackSwapped = false;
				if (!(this.isInventoryFull(iinventoryLeft, enumfacing))) {
					for (int i = 0; i < this.getSizeInventory() && !stackSwapped; ++i) {
						if (!this.getStackInSlot(i).isEmpty()) {
							if (this.getStackInSlot(i).hasTagCompound()) {
								if (this.getStackInSlot(i).getTagCompound().hasKey("PFPlant")) {

									ItemStack itemstack = this.getStackInSlot(i).copy();
									ItemStack itemstack1 = putStackInInventoryAllSlots(this, iinventoryLeft, this.decrStackSize(i, 1), enumfacing);
									//itemstack.shrink(1);

									if (itemstack1.isEmpty()) {
										iinventoryLeft.markDirty();
										result = true;
										stackSwapped = true;
									}

									this.setInventorySlotContents(i, itemstack1);
								}
							}
						}
					}
				}
			}
			if (iinventoryRight != null){
				EnumFacing enumfacing = BlockHopper.getFacing(this.getBlockMetadata()).rotateY().rotateY().rotateY();
				boolean stackSwapped = false;
				if (!(this.isInventoryFull(iinventoryRight, enumfacing))) {
					for (int i = 0; i < this.getSizeInventory() && !stackSwapped; ++i)
					{
						if (!this.getStackInSlot(i).isEmpty()) {
							if (this.getStackInSlot(i).hasTagCompound()) {
								if (this.getStackInSlot(i).getTagCompound().hasKey("PFStatic")) {

									ItemStack itemstack = this.getStackInSlot(i).copy();
									ItemStack itemstack1 = putStackInInventoryAllSlots(this, iinventoryRight, this.decrStackSize(i, 1), enumfacing);
									//itemstack.shrink(1);

									if (itemstack1.isEmpty()) {
										iinventoryRight.markDirty();
										result = true;
										stackSwapped = true;
									}

									this.setInventorySlotContents(i, itemstack1);
								}
							}
						}
					}
				}
			}
			if (iinventoryDown != null){
				EnumFacing enumfacing = EnumFacing.UP;
				boolean stackSwapped = false;
				if (!(this.isInventoryFull(iinventoryFront, enumfacing))) {
					for (int i = 0; i < this.getSizeInventory() && !stackSwapped; ++i)
					{
						if (!this.getStackInSlot(i).isEmpty()) {
							if (this.getStackInSlot(i).hasTagCompound()) {
								if ((!this.getStackInSlot(i).getTagCompound().hasKey("PFMob"))
										&& (!this.getStackInSlot(i).getTagCompound().hasKey("PFPlant"))
										&& (!this.getStackInSlot(i).getTagCompound().hasKey("PFStatic"))) {

									ItemStack itemstack = this.getStackInSlot(i).copy();
									ItemStack itemstack1 = putStackInInventoryAllSlots(this, iinventoryDown, this.decrStackSize(i, 1), enumfacing);
									//itemstack.shrink(1);

									if (itemstack1.isEmpty()) {
										iinventoryDown.markDirty();
										result = true;
										stackSwapped = true;
									}

									this.setInventorySlotContents(i, itemstack1);
								}
							}
							else {
								ItemStack itemstack = this.getStackInSlot(i).copy();
								ItemStack itemstack1 = putStackInInventoryAllSlots(this, iinventoryDown, this.decrStackSize(i, 1), enumfacing);
								//itemstack.shrink(1);

								if (itemstack1.isEmpty()) {
									iinventoryDown.markDirty();
									result = true;
									stackSwapped = true;
								}

								this.setInventorySlotContents(i, itemstack1);
							}
						}
					}
				}
			}
			return result;

			*/

		}


		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			return true;
		}
	}
}