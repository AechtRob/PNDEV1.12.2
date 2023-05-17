
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockPNTaxidermyItem;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITaxidermyTable;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.lepidodendron.item.ItemTaxidermyDisplayItem;
import net.lepidodendron.item.ItemTaxidermyScalpel;
import net.lepidodendron.item.entities.ItemPNTaxidermyItem;
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
public class BlockTaxidermyTable extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:taxidermy_table")
	public static final Block block = null;

	public BlockTaxidermyTable(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.taxidermy_table);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("taxidermy_table"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockTaxidermyTable.TileEntityTaxidermyTable.class, "lepidodendron:tileentitytaxidermy_table");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:taxidermy_table", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool SCALPEL = PropertyBool.create("scalpel");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_taxidermy_table");
			setSoundType(SoundType.METAL);
			setHardness(1.5F);
			setResistance(2.5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean scalpel = false;
			TileEntity tileEntity = worldIn.getTileEntity(pos);
			if (tileEntity instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
				BlockTaxidermyTable.TileEntityTaxidermyTable te = (BlockTaxidermyTable.TileEntityTaxidermyTable) tileEntity;
				if (!(te.getStackInSlot(2).isEmpty())) {
					scalpel = (te.getStackInSlot(2).getItem() == ItemTaxidermyScalpel.block);
				}
			}
			return state.withProperty(SCALPEL, scalpel);
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
			return new BlockTaxidermyTable.TileEntityTaxidermyTable();
		}

		public BlockTaxidermyTable.TileEntityTaxidermyTable createNewTileEntity(World worldIn, int meta) {
			return new BlockTaxidermyTable.TileEntityTaxidermyTable();
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
				if (tileentity instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTaxidermyTable.TileEntityTaxidermyTable) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITaxidermyTable.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.IRON;
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
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, SCALPEL});
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP || face == EnumFacing.DOWN) {
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
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}

	public static class TileEntityTaxidermyTable extends TileEntityLockableLoot implements ITickable, ISidedInventory {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 600;
		private float taxidermyAngle = 0F;

		public boolean canStartProcess() {

			if (this.isProcessing) {
				return false;
			}
			if (isItemValidForSlot(0, this.getStackInSlot(0))
				&& isItemValidForSlot(2, this.getStackInSlot(2))
				&& isItemValidForSlot(3, this.getStackInSlot(3))
				&& this.getStackInSlot(1).isEmpty()) {
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

			boolean updated = false;

			if (this.canStartProcess()) {
				this.processTick = 0;
				this.isProcessing = true;
				updated = true;
			}

			if (this.isProcessing) {
				this.processTick ++;
				updated = true;
			}

			if (this.isProcessing && this.processTick > this.processTickTime) {
				//System.err.println("Ending process");
				this.processTick = 0;
				this.isProcessing = false;
				//move to output:
				String id_dna = "";
				String tag = "";
				String PNVariant = null;
				if (isItemValidForSlot(0, this.getStackInSlot(0))) {
					ItemStack stackProcessing1 = this.getStackInSlot(0);
					ItemStack stackProcessing2 = this.getStackInSlot(2);
					ItemStack stackProcessing3 = this.getStackInSlot(3);

					if (id_dna.equals("")) {
						int[] oreDicts = OreDictionary.getOreIDs(stackProcessing1);
						int var = oreDicts.length;

						for (int var2 = 0; var2 < var; ++var2) {
							int oreDictID = oreDicts[var2];
							String oreName = OreDictionary.getOreName(oreDictID);
							if (oreName.startsWith("mobdnaPN")) {
								id_dna = oreName.substring(8);
								tag = "PFMob";
							}
						}
						if (stackProcessing1.getItem() instanceof ItemGlassCaseDisplayItem) {
							PNVariant = ((ItemGlassCaseDisplayItem)stackProcessing1.getItem()).getVariantStr();
						}
					}

					stackProcessing1.shrink(1);
					stackProcessing2.attemptDamageItem(5, new Random(), null);
					if (stackProcessing2.getItemDamage() >= stackProcessing2.getMaxDamage()) {
						world.playSound(null, pos, SoundEvents.ENTITY_ITEM_BREAK, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
						stackProcessing2.shrink(1);
					}
					stackProcessing3.shrink(1);
					world.playSound(null, pos, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
					ItemStack outputStack = new ItemStack(ItemTaxidermyDisplayItem.block, 1);

					NBTTagCompound parentNBT = new NBTTagCompound();
					parentNBT.setString("id", id_dna);
					NBTTagCompound stackNBT = new NBTTagCompound();
					stackNBT.setTag(tag, parentNBT);
					if (PNVariant != null) {
						stackNBT.setString("PNVariant", PNVariant);
					}
					outputStack.setTagCompound(stackNBT);

					this.setInventorySlotContents(1, outputStack);
					this.taxidermyAngle = ((float)this.world.rand.nextInt(46)) - 22.5F;
				}
				updated = true;
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		public boolean getProcessing() {
			return this.isProcessing;
		}

		public float getTaxidermyAngle() {
			return this.taxidermyAngle;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		@Override
		public int getSizeInventory() {
			return 4;
		}

		@Override
		public String getName() {
			return "container.taxidermy_table";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_taxidermy_table";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUITaxidermyTable.GUILepidodendronTaxidermyTable(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("taxidermyAngle")) {
				this.taxidermyAngle = compound.getFloat("taxidermyAngle");
			}
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
			compound.setFloat("taxidermyAngle", this.taxidermyAngle);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.forgeContents);
			}
			return compound;
		}

		public void notifyBlockUpdate() {
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

		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[]{0,1,2,3};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (index == 0) { //Meat
				return isItemValidForSlot(index, itemStackIn);
			}
			if (index == 2) { //Scalpel
				return isItemValidForSlot(index, itemStackIn);
			}
			if (index == 3) { //Stuffing
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
				if (!(stack.getItem() instanceof ItemPNTaxidermyItem)
					&& !(Block.getBlockFromItem(stack.getItem()) instanceof BlockPNTaxidermyItem)
					&& !(stack.getItem() instanceof ItemGlassCaseDisplayItem)) {
					return false;
				}
				boolean flag = false;
				if (!stack.isEmpty()) {
					int[] oreDicts = OreDictionary.getOreIDs(stack);
					int var = oreDicts.length;

					for (int var2 = 0; var2 < var; ++var2) {
						int oreDictID = oreDicts[var2];
						String oreName = OreDictionary.getOreName(oreDictID);
						if (oreName.startsWith("mobdnaPN")) {
							flag = true;
						}
					}
				}
				return flag;
			}
			if (index == 1) { //Outputs
				return false;
			}

			if (index == 2) { //Scalpel
				return stack.getItem() == ItemTaxidermyScalpel.block;
			}

			if (index == 3) { //Stuffing
				boolean flag = false;
				if (!stack.isEmpty()) {
					int[] oreDicts = OreDictionary.getOreIDs(stack);
					int var = oreDicts.length;

					for (int var2 = 0; var2 < var; ++var2) {
						int oreDictID = oreDicts[var2];
						String oreName = OreDictionary.getOreName(oreDictID);
						if (oreName.equalsIgnoreCase("itemFluffy")) {
							flag = true;
						}
					}
					//System.err.println(stack + " flag " + flag);
				}
				return flag;
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