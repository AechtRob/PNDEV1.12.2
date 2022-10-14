
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUICoalTarProcessor;
import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
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
import net.minecraft.tileentity.TileEntityFurnace;
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
			super(Material.ROCK);
			setTranslationKey("pf_coal_tar_processor");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 0);
			setHardness(2.5F);
			setResistance(3.5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return state.withProperty(RF, LepidodendronConfig.machinesRF);
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			super.onBlockAdded(worldIn, pos, state);
			worldIn.setBlockState(pos.up(), BlockCoalTarProcessorTop.block.getDefaultState());
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
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
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

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockCoalTarProcessorTop.block) {
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
							world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + 0.5, (double) pos.getY() + 1.8, (double) pos.getZ() + 0.5, 0, 0.075D, 0);
						}
					}
				}
			}
		}
	}

	public static class TileEntityCoalTarProcessor extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime; //Depends on what we are doing it to
		public int GUIFlameHeight;

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
				return TileEntityFurnace.getItemBurnTime(stack);
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
				this.processTickTime = TileEntityFurnace.getItemBurnTime(this.getStackInSlot(0));
				this.processTick = 0;
				this.isProcessing = true;
			}

			if (this.isProcessing) {
				this.processTick ++;
				this.GUIFlameHeight = Math.min(60, this.GUIFlameHeight + 1);
				if (this.getWorld().rand.nextInt(10) == 0) {
					world.playSound(null, pos, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 0.5F, 0.8F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
				}
			}

			if (!this.isProcessing) {
				this.GUIFlameHeight = Math.max(0, this.GUIFlameHeight - 1);
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
				}
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
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
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
			return super.getCapability(capability, facing);
		}

	}
}