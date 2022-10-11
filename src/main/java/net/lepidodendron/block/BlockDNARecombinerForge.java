
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIDNAForge;
import net.lepidodendron.item.ItemDNARecombiner;
import net.lepidodendron.item.ItemOligoPool;
import net.lepidodendron.item.ItemPhialDNA;
import net.lepidodendron.item.ItemPlaceableLiving;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.*;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerForge extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_forge")
	public static final Block block = null;
	public BlockDNARecombinerForge(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_forge);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_forge"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDNARecombinerForge.TileEntityDNARecombinerForge.class, "lepidodendron:tileentitydna_recombiner_forge");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:dna_recombiner_forge", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.ROCK, MapColor.ADOBE);
			setTranslationKey("pf_dna_recombiner_forge");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.5F);
			setResistance(2F);
			setLightLevel(0);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockDNARecombinerForge.TileEntityDNARecombinerForge();
		}

		public BlockDNARecombinerForge.TileEntityDNARecombinerForge createNewTileEntity(World worldIn, int meta) {
			return new BlockDNARecombinerForge.TileEntityDNARecombinerForge();
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
				if (tileentity instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockDNARecombinerForge.TileEntityDNARecombinerForge) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIDNAForge.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemDNARecombiner.block, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
				return;
			}

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY()));
			if (endState.getBlock() != BlockDNARecombinerCentrifuge.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING)) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockDNARecombinerRail.block) {
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

	public static class TileEntityDNARecombinerForge extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(7, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		public boolean hatchShut;
		private int processTickTime = 600; //30 seconds to process

		public double oligoExtend;
		public double oligoAngle;
		public double fogDensity;

		public boolean canStartProcess() {
			if (!this.isProcessing
					&& this.getStackInSlot(2).getItem() == ItemOligoPool.block
					&& this.getStackInSlot(0).getItem() == ItemPhialDNA.block
					&& this.hatchShut
					&& (this.getStackInSlot(3) == ItemStack.EMPTY
						|| this.getStackInSlot(4) == ItemStack.EMPTY
						|| this.getStackInSlot(5) == ItemStack.EMPTY
						|| this.getStackInSlot(6) == ItemStack.EMPTY
					)
			) {
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

		public void setHatchShut(boolean shut) {
			this.hatchShut = shut;
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

			if (!this.isProcessing
					&& this.getStackInSlot(2) == ItemStack.EMPTY
					&& this.getStackInSlot(1).getItem() == ItemOligoPool.block
			) {
				ItemStack stack = this.getStackInSlot(1);
				this.setInventorySlotContents(2, new ItemStack(ItemOligoPool.block, 1));
				stack.shrink(1);
			}

			if (this.canStartProcess()) {
				this.isProcessing = true;
				this.processTick = 0;
			}

			if (this.isProcessing) {
				this.processTick ++;
			}

			if (this.processTick < 20) {
				this.oligoExtend = 5.5D * ((double)this.processTick / 20.0D);
			}

			if (this.processTick == 20) {
				this.oligoExtend = 5.5D;
			}

			if (this.processTick >= 20 && this.processTick < 60) {
				this.oligoAngle = 180.0D * (((double)this.processTick - 20.0D) / 40D);
			}

			if (this.processTick == 60) {
				this.oligoAngle = 180.0;
			}

			if (this.processTick >= 100 && this.processTick < 140) {
				this.oligoAngle = 180.0D * ((140.0D - (double)this.processTick) / 40D);
			}

			if (this.processTick == 140) {
				this.oligoAngle = 0.0;
			}

			if (this.processTick >= 140 && this.processTick < 160) {
				this.oligoExtend = 5.5D * ((160.0D - (double)this.processTick) / 20D);
			}

			if (this.processTick == 160) {
				this.oligoExtend = 0.0;
			}

			if (this.processTick >= 140 && this.processTick < 180) {
				this.fogDensity = (((double)this.processTick - 140.0D) / 40D);
			}

			if (this.processTick >= 180 && this.processTick < (this.processTickTime - 40)) {
				this.fogDensity = 1;
			}

			if (this.processTick >= (this.processTickTime - 40) && this.processTick < processTickTime) {
				this.fogDensity = (processTickTime - (double)this.processTick) / 40D;
			}

			if (this.processTick == this.processTickTime) {
				this.fogDensity = 0;
			}

			if (this.processTick == this.processTickTime - 40) {
				//Break the phial and replace now
				world.playSound(null, pos, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 0.5F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
				ItemStack stack = this.getStackInSlot(0);
				ItemStack stackOutput = new ItemStack(ItemPlaceableLiving.block, 1);
				if (stack.getItem() == ItemPhialDNA.block) {
					String resourcelocation = stack.getTagCompound().getString("id_dna");
					if (resourcelocation != null) {
						if (!resourcelocation.equalsIgnoreCase("")) {
							NBTTagCompound stackOutputNBT = new NBTTagCompound();
							stackOutputNBT.setString("id_dna", resourcelocation);
							stackOutput.setTagCompound(stackOutputNBT);
							if (this.getStackInSlot(3) == ItemStack.EMPTY) {
								this.setInventorySlotContents(3, stackOutput);
							}
							else if (this.getStackInSlot(4) == ItemStack.EMPTY) {
								this.setInventorySlotContents(4, stackOutput);
							}
							else if (this.getStackInSlot(5) == ItemStack.EMPTY) {
								this.setInventorySlotContents(5, stackOutput);
							}
							else if (this.getStackInSlot(6) == ItemStack.EMPTY) {
								this.setInventorySlotContents(6, stackOutput);
							}
						}
					}
				}
				this.setInventorySlotContents(0, ItemStack.EMPTY);
				this.setInventorySlotContents(2, ItemStack.EMPTY);
			}

			if (this.processTick >= this.processTickTime) {
				this.isProcessing = false;
				this.processTick = 0;
			}
			
			markDirty();

		}

		public double getOligoExtend() {
			return this.oligoExtend;
		}

		public double getOligoAngle() {
			return this.oligoAngle;
		}

		public double getFogDensity() {
			return this.fogDensity;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 7;
		}

		@Override
		public String getName() {
			return "container.forge";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_dna_forge";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIDNAForge.GUILepidodendronDNAForge(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
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
			if (compound.hasKey("hatchShut")) {
				this.hatchShut = compound.getBoolean("hatchShut");
			}
			if (compound.hasKey("oligoAngle")) {
				this.oligoAngle = compound.getDouble("oligoAngle");
			}
			if (compound.hasKey("oligoExtend")) {
				this.oligoExtend = compound.getDouble("oligoExtend");
			}
			if (compound.hasKey("fogDensity")) {
				this.fogDensity = compound.getDouble("fogDensity");
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
			compound.setBoolean("hatchShut", this.hatchShut);
			compound.setDouble("oligoAngle", this.oligoAngle);
			compound.setDouble("oligoExtend", this.oligoExtend);
			compound.setDouble("fogDensity", this.fogDensity);
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

		//Slot 0 = phial: cannot add or remove
		//Slot 1 = oligopool inventory: fully interactable by hand but hoppers only insert
		//Slot 2 = oligopool: in use and cannot add or remove
		//Slot 3,4,5,6 = outputs: can only remove by any means

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[]{1,3,4,5,6};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (index == 1) {
				return !this.isLocked() && isItemValidForSlot(index, itemStackIn);
			}
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if (index == 3 || index == 4 || index == 5 || index == 6) {
				return !this.isLocked();
			}
			return false;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0)
				return false;
			if (index == 1)
				return stack.getItem() == ItemOligoPool.block;
			if (index == 2)
				return false;
			if (index == 3)
				return false;
			if (index == 4)
				return false;
			if (index == 5)
				return false;
			if (index == 6)
				return false;
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