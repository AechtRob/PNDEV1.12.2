
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerRail extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_rail")
	public static final Block block = null;
	public BlockDNARecombinerRail(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_rail);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_rail"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:dna_recombiner_rail", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDNARecombinerRail.TileEntityDNARecombinerRail.class, "lepidodendron:tileentitydna_recombiner_rail");
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_dna_recombiner_rail");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockDNARecombinerRail.TileEntityDNARecombinerRail();
		}

		public BlockDNARecombinerRail.TileEntityDNARecombinerRail createNewTileEntity(World worldIn, int meta) {
			return new BlockDNARecombinerRail.TileEntityDNARecombinerRail();
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
				if (tileentity instanceof BlockDNARecombinerRail.TileEntityDNARecombinerRail) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockDNARecombinerRail.TileEntityDNARecombinerRail) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
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
			return false;
		}
	}

	public static class TileEntityDNARecombinerRail extends TileEntityLockableLoot implements ITickable {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(1, ItemStack.EMPTY);
		protected int clawVert;
		protected int clawHoriz;
		protected boolean isProcessing;
		protected int processTick;


		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return INFINITE_EXTENT_AABB;
		}

		/*
		public boolean canStartProcess() {

			if ((!isProcessing)
					&& (!isTankPaused())
					&& getStackInSlot(1).isEmpty()
					&& getStackInSlot(2).isEmpty()
					&& getStackInSlot(3).isEmpty()
					&& getStackInSlot(4).isEmpty()
					&& getStackInSlot(5).isEmpty()
					&& getStackInSlot(6).isEmpty()
					&& getStackInSlot(7).isEmpty()
					&& getStackInSlot(8).isEmpty()
					&& !getStackInSlot(0).isEmpty()
			) {
				TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
				if (tileEntity != null) {
					if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
						BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
						if (te.getFluidAmount() > 0) {
							return true;
						}
					}
				}
				return false;
			}
			return false;
		}

		public boolean canFizz() {
			return this.isProcessing
					&& (this.processTick < (this.processTickTime - this.trayLiftTickTime))
					&& (this.processTick > this.trayLiftTickTime);
		}

		*/

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			//Do stuff

			markDirty();

		}

		@Override
		public int getInventoryStackLimit() {
			return 1;
		}

		//public int getHeight() {
		//	return this.trayheight;
		//}

		//public void setHeight(int height) {
		//	this.trayheight = height;
		//}

		@Override
		public int getSizeInventory() {
			return 1;
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
			return true;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "";
		}

		@Override
		public String getGuiID() {
			return null;
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return null;
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("clawVert")) {
				this.clawVert = compound.getInteger("clawVert");
			}
			if (compound.hasKey("clawHoriz")) {
				this.clawHoriz = compound.getInteger("clawHoriz");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			this.stacks = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.stacks);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setInteger("clawVert", this.clawVert);
			compound.setInteger("clawHoriz", this.clawHoriz);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
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

	}
}