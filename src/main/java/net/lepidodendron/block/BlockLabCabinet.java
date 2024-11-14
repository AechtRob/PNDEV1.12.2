
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUILabCabinet;
import net.lepidodendron.util.BlockSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLabCabinet extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lab_cabinet")
	public static final Block block = null;

	public BlockLabCabinet(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lab_cabinet);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lab_cabinet"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityLabCabinet.class, "lepidodendron:tileentitylab_cabinet");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lab_cabinet", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool OPEN = PropertyBool.create("open");
		public static final PropertyBool LEFT = PropertyBool.create("left");
		public static final PropertyBool RIGHT = PropertyBool.create("right");
		public static final PropertyInteger POSITION = PropertyInteger.create("position", 0, 3);
		// 0 = standalone, 1 = top, 2 = middle, 3 = bottom

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_lab_cabinet");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(POSITION, 0).withProperty(OPEN, Boolean.valueOf(false)));
		}

		public int getPositionValue(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.up()).getBlock() == BlockLabCabinet.block
				&& worldIn.getBlockState(pos.down()).getBlock() == BlockLabCabinet.block) {
				return 2; //middle
			}
			else if (worldIn.getBlockState(pos.down()).getBlock() == BlockLabCabinet.block) {
				return 1; //top
			}
			else if (worldIn.getBlockState(pos.up()).getBlock() == BlockLabCabinet.block) {
				return 3; //bottom
			}
			return 0; //standalone
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean left = false;
			boolean right = false;
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabCabinetFlipped.block) {
					left = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabCabinetFlipped.block) {
					right = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabCabinetFlipped.block) {
					right = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabCabinetFlipped.block) {
					left = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.WEST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabCabinetFlipped.block) {
					left = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabCabinetFlipped.block) {
					right = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.EAST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabCabinetFlipped.block) {
					right = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabCabinetFlipped.block) {
					left = true;
				}
			}

			return state.withProperty(RIGHT, right).withProperty(LEFT, left).withProperty(POSITION, getPositionValue(state, worldIn, pos));
		}

		@Override
		public boolean isTopSolid(IBlockState state)
		{
			return true;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockLabCabinet.TileEntityLabCabinet();
		}

		public BlockLabCabinet.TileEntityLabCabinet createNewTileEntity(World worldIn, int meta) {
			return new BlockLabCabinet.TileEntityLabCabinet();
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
				if (tileentity instanceof BlockLabCabinet.TileEntityLabCabinet) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockLabCabinet.TileEntityLabCabinet) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);

			TileEntity te = world.getTileEntity(pos);
			int users = 0;
			if (te instanceof BlockLabCabinet.TileEntityLabCabinet) {
				users = ((TileEntityLabCabinet)te).numPlayersUsing;
			}

			if (users < 1) {
				state = state.cycleProperty(OPEN);
				world.setBlockState(pos, state, 10);
				world.markBlockRangeForRenderUpdate(pos, pos);
				if (state.getValue(OPEN)) {
					world.playSound(null, pos, BlockSounds.OPEN_CABINET, SoundCategory.BLOCKS, 1.0F, 1.0F);
				}
				else {
					world.playSound(null, pos, BlockSounds.CLOSE_CABINET, SoundCategory.BLOCKS, 1.0F, 1.0F);
				}
				if (((Boolean) state.getValue(OPEN)).booleanValue()) {
					entity.openGui(LepidodendronMod.instance, GUILabCabinet.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
				}
				return true;
			}
			else if (state.getValue(OPEN)){
				if (((Boolean) state.getValue(OPEN)).booleanValue()) {
					entity.openGui(LepidodendronMod.instance, GUILabCabinet.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
				}
				return true;
			}

			return false;

		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.WOOD;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(this, 1).getItem());
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
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, OPEN, LEFT, RIGHT, POSITION});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return mirrorIn == Mirror.NONE ? state : state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta & 3).rotateYCCW()).withProperty(OPEN, Boolean.valueOf((meta & 4) > 0));
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP
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
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public int getMetaFromState(IBlockState state) {

			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				state = state.withProperty(FACING, EnumFacing.NORTH);
			}

			int i = 0;
			
			i = i | ((EnumFacing)state.getValue(FACING)).rotateY().getHorizontalIndex();

			if (((Boolean)state.getValue(OPEN)).booleanValue())
			{
				i |= 4;
			}

			return i;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}

	public static class TileEntityLabCabinet extends TileEntityLockableLoot {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(54, ItemStack.EMPTY);
		public int numPlayersUsing;


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
			if (!player.isSpectator())
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
			if (!player.isSpectator() &&
				(this.getBlockType() == BlockLabCabinet.block || this.getBlockType() == BlockLabCabinetFlipped.block)
			) {
				--this.numPlayersUsing;
				this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
				this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);
			}
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
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 54;
		}

		@Override
		public String getName() {
			return "container.lab_cabinet";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_lab_cabinet";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUILabCabinet.GUILepidodendronLabCabinet(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			this.forgeContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
			if (!this.checkLootAndRead(compound)) {
				ItemStackHelper.loadAllItems(compound, this.forgeContents);
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
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

		net.minecraftforge.items.IItemHandler handler = new net.minecraftforge.items.wrapper.InvWrapper(this);

		@Nullable
		@Override
		public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
			if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
				return (T) handler;
			}
			return super.getCapability(capability, facing);
		}

	}
}