
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIDNACentrifuge;
import net.lepidodendron.item.ItemDNARecombiner;
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
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDNARecombinerCentrifuge extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_centrifuge")
	public static final Block block = null;
	public BlockDNARecombinerCentrifuge(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner_centrifuge);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dna_recombiner_centrifuge"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge.class, "lepidodendron:tileentitydna_recombiner_centrifuge");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:dna_recombiner_centrifuge", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.ROCK, MapColor.ADOBE);
			setTranslationKey("pf_dna_recombiner_centrifuge");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.5F);
			setResistance(2F);
			setLightLevel(0);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemDNARecombiner.block, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(ItemDNARecombiner.block, 1).getItem());
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
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIDNACentrifuge.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge();
		}

		public BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge createNewTileEntity(World worldIn, int meta) {
			return new BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge();
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
				if (tileentity instanceof BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockDNARecombinerCentrifuge.TileEntityDNARecombinerCentrifuge) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
				return;
			}

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY()));
			if (endState.getBlock() != BlockDNARecombinerForge.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING)) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY().rotateY().rotateY()).up()).getBlock() != BlockDNARecombinerRail.block) {
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

	public static class TileEntityDNARecombinerCentrifuge extends TileEntityLockableLoot implements ITickable {

		private NonNullList<ItemStack> centrifugeContents = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);

		protected boolean isLocked;
		protected boolean isProcessing;
		protected int processTick;

		public float lidAngle;
		public float prevLidAngle;
		public int numPlayersUsing;
		private int ticksSinceSync;


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

		public boolean isLocked() {
			return this.isLocked;
		}

		public boolean isEmpty()
		{
			for (ItemStack itemstack : this.centrifugeContents)
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

			int i = this.pos.getX();
			int j = this.pos.getY();
			int k = this.pos.getZ();
			++this.ticksSinceSync;
			if (!this.isLocked) {
				if (!this.world.isRemote && this.numPlayersUsing != 0 && (this.ticksSinceSync + i + j + k) % 200 == 0) {
					this.numPlayersUsing = 0;
					float f = 5.0F;

					for (EntityPlayer entityplayer : this.world.getEntitiesWithinAABB(EntityPlayer.class, new AxisAlignedBB((double) ((float) i - 5.0F), (double) ((float) j - 5.0F), (double) ((float) k - 5.0F), (double) ((float) (i + 1) + 5.0F), (double) ((float) (j + 1) + 5.0F), (double) ((float) (k + 1) + 5.0F)))) {
						if (entityplayer.openContainer instanceof GUIDNACentrifuge.GUILepidodendronDNACentrifuge) {
							IInventory iinventory = ((GUIDNACentrifuge.GUILepidodendronDNACentrifuge) entityplayer.openContainer).getLowerChestInventory();

							if (iinventory == this) {
								++this.numPlayersUsing;
							}
						}
					}

				}

				this.prevLidAngle = this.lidAngle;
				float f1 = 0.1F;

				if (this.numPlayersUsing > 0 && this.lidAngle == 0.0F) {
					double d1 = (double) i + 0.5D;
					double d2 = (double) k + 0.5D;

					this.world.playSound((EntityPlayer) null, d1, (double) j + 0.5D, d2, SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
				}

				if (this.numPlayersUsing == 0 && this.lidAngle > 0.0F || this.numPlayersUsing > 0 && this.lidAngle < 1.0F) {
					float f2 = this.lidAngle;

					if (this.numPlayersUsing > 0) {
						this.lidAngle += 0.1F;
					} else {
						this.lidAngle -= 0.1F;
					}

					if (this.lidAngle > 1.0F) {
						this.lidAngle = 1.0F;
					}

					float f3 = 0.5F;

					if (this.lidAngle < 0.5F && f2 >= 0.5F) {
						double d3 = (double) i + 0.5D;
						double d0 = (double) k + 0.5D;

						this.world.playSound((EntityPlayer) null, d3, (double) j + 0.5D, d0, SoundEvents.BLOCK_CHEST_CLOSE, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
					}

					if (this.lidAngle < 0.0F) {
						this.lidAngle = 0.0F;
					}
				}
			}


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
			return 4;
		}

		@Override
		public String getName() {
			return "container.centrifuge";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_dna_centrifuge";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIDNACentrifuge.GUILepidodendronDNACentrifuge(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("lidAngle")) {
				this.lidAngle = compound.getFloat("lidAngle");
			}
			if (compound.hasKey("prevLidAngle")) {
				this.prevLidAngle = compound.getFloat("prevLidAngle");
			}
			if (compound.hasKey("numPlayersUsing")) {
				this.numPlayersUsing = compound.getInteger("numPlayersUsing");
			}
			if (compound.hasKey("ticksSinceSync")) {
				this.ticksSinceSync = compound.getInteger("ticksSinceSync");
			}
			if (compound.hasKey("processTick")) {
				this.processTick = compound.getInteger("processTick");
			}
			if (compound.hasKey("isLocked")) {
				this.isLocked = compound.getBoolean("isLocked");
			}
			if (compound.hasKey("isProcessing")) {
				this.isProcessing = compound.getBoolean("isProcessing");
			}
			this.centrifugeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.centrifugeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			compound.setFloat("lidAngle", this.lidAngle);
			compound.setFloat("prevLidAngle", this.prevLidAngle);
			compound.setInteger("numPlayersUsing", this.numPlayersUsing);
			compound.setInteger("ticksSinceSync", this.ticksSinceSync);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setBoolean("isLocked", this.isLocked);
			compound.setInteger("processTick", this.processTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.centrifugeContents);
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
		public boolean receiveClientEvent(int id, int type)
		{
			if (id == 1)
			{
				this.numPlayersUsing = type;
				return true;
			}
			else
			{
				return super.receiveClientEvent(id, type);
			}
		}

		@Override
		public void openInventory(EntityPlayer player)
		{
			//System.err.println("openInventory");
			if ((!player.isSpectator()) && (!this.isLocked))
			{
				if (this.numPlayersUsing < 0)
				{
					this.numPlayersUsing = 0;
				}

				++this.numPlayersUsing;
				this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
				this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);

			}
		}

		@Override
		public void closeInventory(EntityPlayer player)
		{
			//System.err.println("closeInventory");
			if ((!player.isSpectator()) && (!this.isLocked) && this.getBlockType() instanceof BlockDNARecombinerCentrifuge.BlockCustom)
			{
				--this.numPlayersUsing;
				this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
				this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);
			}
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
			return this.centrifugeContents;
		}

	}
}