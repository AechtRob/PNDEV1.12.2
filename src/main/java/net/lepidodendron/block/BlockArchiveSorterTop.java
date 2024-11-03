
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUIArchiveSorterTop;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
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
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityArchiveSorterTop.class, "lepidodendron:tileentityarchive_sorter_top");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:archive_sorter_top", "inventory"));
	}

	public static class BlockCustom extends BlockHopper {

		public BlockCustom() {
			super();
			setTranslationKey("pf_archive_sorter_top");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(ENABLED, Boolean.valueOf(true)));
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

	}

	public static class TileEntityArchiveSorterTop extends TileEntityLockableLoot implements ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(13, ItemStack.EMPTY);
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

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 13;
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
			return 0;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 1 && stackPrecambrian)
				return periodTag(stack) == 1;
			if (index == 2 && stackCambrian)
				return periodTag(stack) == 2;
			if (index == 3 && stackOrdovician)
				return periodTag(stack) == 3;
			if (index == 4 && stackSilurian)
				return periodTag(stack) == 4;
			if (index == 5 && stackDevonian)
				return periodTag(stack) == 5;
			if (index == 6 && stackCarboniferous)
				return periodTag(stack) == 6;
			if (index == 7 && stackPermian)
				return periodTag(stack) == 7;
			if (index == 8 && stackTriassic)
				return periodTag(stack) == 8;
			if (index == 9 && stackJurassic)
				return periodTag(stack) == 9;
			if (index == 10 && stackCretaceous)
				return periodTag(stack) == 10;
			if (index == 11 && stackPaleogene)
				return periodTag(stack) == 11;
			if (index == 12 && stackNeogene)
				return periodTag(stack) == 12;
			if (index == 13 && stackPleistocene)
				return periodTag(stack) == 13;
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
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound) {
			super.writeToNBT(compound);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
			}
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
					0,1,2,3,4,5,6,7,8,9,10,11,12
			};
			}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return true;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return true;
		}
	}
}