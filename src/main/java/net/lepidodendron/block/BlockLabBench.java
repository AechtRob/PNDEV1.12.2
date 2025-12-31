
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronRecipeFossils;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUILabBench;
import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.lepidodendron.item.ItemFossilClean;
import net.lepidodendron.item.ItemPhial;
import net.lepidodendron.item.ItemPhialDNA;
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
public class BlockLabBench extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lab_bench")
	public static final Block block = null;

	public BlockLabBench(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lab_bench);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lab_bench"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityLabBench.class, "lepidodendron:tileentitylab_bench");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lab_bench", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool LEFT = PropertyBool.create("left");
		public static final PropertyBool RIGHT = PropertyBool.create("right");

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_lab_bench");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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
			return new BlockLabBench.TileEntityLabBench();
		}

		public BlockLabBench.TileEntityLabBench createNewTileEntity(World worldIn, int meta) {
			return new BlockLabBench.TileEntityLabBench();
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
				if (tileentity instanceof BlockLabBench.TileEntityLabBench) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockLabBench.TileEntityLabBench) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUILabBench.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean left = false;
			boolean right = false;
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBenchHopper.block) {
					left = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBenchHopper.block) {
					right = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBenchHopper.block) {
					right = true;
				}
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBenchHopper.block) {
					left = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.WEST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBenchHopper.block) {
					left = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBenchHopper.block) {
					right = true;
				}
			} else if (state.getValue(FACING) == EnumFacing.EAST) {
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBenchHopper.block) {
					right = true;
				}
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBenchHopper.block) {
					left = true;
				}
			}

			return state.withProperty(RIGHT, right).withProperty(LEFT, left);
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
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, LEFT, RIGHT});
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

	public static class TileEntityLabBench extends TileEntityLockableLoot implements ITickable, ISidedInventory {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);

		protected boolean isProcessing;
		public int processTick;
		private int processTickTime = 20;

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
				if (isItemValidForSlot(0, this.getStackInSlot(0))) {
					ItemStack stackProcessing1 = this.getStackInSlot(0);
					ItemStack stackProcessing2 = this.getStackInSlot(2);
					ItemStack stackProcessing3 = this.getStackInSlot(3);
					ResourceLocation resourcelocation = null;
					String blockname;
					String mobtype = "";
					int period = BlockArchiveSorterTop.TileEntityArchiveSorterTop.periodTag(stackProcessing1);
					if (ItemFossilClean.ItemCustom.isEntityFromItemStack(stackProcessing1)) {
						NBTTagCompound entityNBT = (NBTTagCompound) stackProcessing1.getTagCompound().getTag("PFMob");
						try {
							resourcelocation = new ResourceLocation(entityNBT.getString("id"));
							//id_dna = resourcelocation.toString().replace(LepidodendronMod.MODID + ":", "");
							id_dna = resourcelocation.toString();
							if (stackProcessing1.getTagCompound().hasKey("mobtype")) {
								mobtype = stackProcessing1.getTagCompound().getString("mobtype");
							}
							else {
								String id_dna_raw = id_dna;
								if (id_dna.indexOf("@") > 0) {
									id_dna_raw = id_dna.substring(0, id_dna.indexOf("@"));
								}
								boolean isArthropod = LepidodendronRecipeFossils.isArthropod(world, id_dna_raw);
								if (isArthropod) {
									mobtype = "invertebrate";
								} else {
									mobtype = "vertebrate";
								}
							}
						}
						catch (RuntimeException e) {
						}
						tag = "PFMob";
					}
					else if (ItemFossilClean.ItemCustom.isPlantFromItemStack(stackProcessing1)) {
						NBTTagCompound blockNBT = (NBTTagCompound) stackProcessing1.getTagCompound().getTag("PFPlant");
						try {
							resourcelocation = new ResourceLocation(blockNBT.getString("id"));
							//blockname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":", "");
							id_dna = resourcelocation.toString();
						}
						catch (RuntimeException e) {
						}
						tag = "PFPlant";
					}
					else if (ItemFossilClean.ItemCustom.isBlockFromItemStack(stackProcessing1)) {
						NBTTagCompound blockNBT = (NBTTagCompound) stackProcessing1.getTagCompound().getTag("PFStatic");
						try {
							resourcelocation = new ResourceLocation(blockNBT.getString("id"));
							//blockname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":", "");
							id_dna = resourcelocation.toString();
						}
						catch (RuntimeException e) {
						}
						tag = "PFStatic";
					}

					//Get the correct IDs from the oredict:
					if (id_dna.equals("")) {
						int[] oreDicts = OreDictionary.getOreIDs(this.getStackInSlot(0));
						int var = oreDicts.length;

						for (int var2 = 0; var2 < var; ++var2) {
							int oreDictID = oreDicts[var2];
							String oreName = OreDictionary.getOreName(oreDictID);
							oreName = oreName.replace("@male", "@gendered");
							oreName = oreName.replace("@female", "@gendered");
							if (oreName.startsWith("plantdnaPN")) {
								id_dna = oreName.substring(10);
								tag = "PFPlant";
							}
							else if (oreName.startsWith("mobdnaPN")) {
								id_dna = oreName.substring(8);
								tag = "PFMob";
							}
							else if (oreName.startsWith("staticdnaPN")) {
								id_dna = oreName.substring(11);
								tag = "PFStatic";
							}
						}
					}
					stackProcessing1.shrink(1);
					stackProcessing2.shrink(1);
					stackProcessing3.shrink(1);
					world.playSound(null, pos, SoundEvents.BLOCK_BREWING_STAND_BREW, SoundCategory.BLOCKS, 0.2F, 1.0F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.4F);
					ItemStack outputStack = new ItemStack(ItemPhialDNA.block, 1);

					NBTTagCompound plantNBT = new NBTTagCompound();
					plantNBT.setString("id", id_dna);
					NBTTagCompound stackNBT = new NBTTagCompound();
					stackNBT.setTag(tag, plantNBT);
					outputStack.setTagCompound(stackNBT);
					if (!mobtype.equalsIgnoreCase("")) {
						outputStack.getTagCompound().setString("mobtype", mobtype);
					}
					if (period != 0) {
						outputStack.getTagCompound().setInteger("period", period);
					}

					this.setInventorySlotContents(1, outputStack);
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
			return "container.lab_bench";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_lab_bench";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUILabBench.GUILepidodendronLabBench(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
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
			if (index == 0) { //Fossil
				return isItemValidForSlot(index, itemStackIn);
			}
			if (index == 2) { //Phials
				return isItemValidForSlot(index, itemStackIn);
			}
			if (index == 3) { //Benzo-Solvent
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
				if (!stack.isEmpty()) {
					int[] oreDicts = OreDictionary.getOreIDs(stack);
					int var = oreDicts.length;

					for (int var2 = 0; var2 < var; ++var2) {
						int oreDictID = oreDicts[var2];
						String oreName = OreDictionary.getOreName(oreDictID);
						if (oreName.startsWith("plantdnaPN")
							|| oreName.startsWith("mobdnaPN")
							|| oreName.startsWith("staticdnaPN")) {
							flag = true;
						}
					}

					if (stack.getItem() == ItemFossilClean.block) {
						flag = true;
					}

//					if (Block.getBlockFromItem(stack.getItem()) instanceof BlockPNTaxidermyItem) {
//						flag = false; //Do not allow blocks like shells to be used here
//					}
				}
				return flag;
			}
			if (index == 1)
				return false;

			if (index == 2) {
				return stack.getItem() == ItemPhial.block; //Empty phials
			}

			if (index == 3) {
				return stack.getItem() == ItemBottleOfDNASolvent.block; //Solvent
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