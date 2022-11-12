
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIOligopoolMachine;
import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.lepidodendron.item.ItemOligoPool;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockOligopoolMachine extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:oligopool_machine")
	public static final Block block = null;
	public BlockOligopoolMachine(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.oligopool_machine);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("oligopool_machine"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockOligopoolMachine.TileEntityOligopoolMachine.class, "lepidodendron:tileentityoligopool_machine");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:oligopool_machine", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool RF = PropertyBool.create("rf");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_oligopool_machine");
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
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			super.onBlockAdded(worldIn, pos, state);
			worldIn.setBlockState(pos.up(), BlockOligopoolMachineTop.block.getDefaultState().withProperty(BlockOligopoolMachineTop.BlockCustom.FACING, state.getValue(FACING)));
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			return super.canPlaceBlockAt(worldIn, pos) && isReplaceable(worldIn, pos.up());
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockOligopoolMachine.TileEntityOligopoolMachine();
		}

		public BlockOligopoolMachine.TileEntityOligopoolMachine createNewTileEntity(World worldIn, int meta) {
			return new BlockOligopoolMachine.TileEntityOligopoolMachine();
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
				if (tileentity instanceof BlockOligopoolMachine.TileEntityOligopoolMachine) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockOligopoolMachine.TileEntityOligopoolMachine) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIOligopoolMachine.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
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

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockOligopoolMachineTop.block) {
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
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

	}

	public static class TileEntityOligopoolMachine extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 200; //10 seconds

		public boolean canStartProcess() {

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

			//System.err.println("Tick: " + this.processTick);
			//System.err.println("TickTotal: " + this.processTickTime);

			if (this.canStartProcess()) {
				this.processTick = 0;
				this.isProcessing = true;
			}

			if (this.isProcessing) {
				this.processTick ++;
				//if (this.getWorld().rand.nextInt(10) == 0) {
				//	world.playSound(null, pos, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F, 0.8F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
				//}
			}

			if (!this.isRoomForOutputStack()) {
				this.processTick = 0;
				this.isProcessing = false;
			}

			if (this.isProcessing && ((this.isRoomForOutputStack() && this.processTick > this.processTickTime) || !(isValidItemForProcess(this.getStackInSlot(0)) > 0))) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.isProcessing = false;
				//move to output:
				if (isValidItemForProcess(this.getStackInSlot(0)) > 0) {
					ItemStack stackProcessing = this.getStackInSlot(0);
					stackProcessing.shrink(1);
					this.setInventorySlotContents(1, new ItemStack(ItemOligoPool.block, 1 + this.getStackInSlot(1).getCount()));
				}
			}

			markDirty();

		}

		public boolean isRoomForOutputStack() {
			if ((!this.getStackInSlot(1).isEmpty()) && this.getStackInSlot(1).getItem() != ItemOligoPool.block) {
				return false;
			}
			if ((this.getStackInSlot(1).getCount() + 1) <= 64) {
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
			return "container.oligopool_machine";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_oligopool_machine";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIOligopoolMachine.GUILepidodendronOligopoolMachine(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
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
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
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
				return stack.getItem() == ItemBottleOfDNASolvent.block;
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
			return super.getCapability(capability, facing);
		}

	}
}