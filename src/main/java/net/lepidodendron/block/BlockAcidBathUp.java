
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.gui.GUIAcidBath;
import net.lepidodendron.item.*;
import net.lepidodendron.util.AcidBathOutputJunk;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAcidBathUp extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acid_bath_up")
	public static final Block block = null;

	public BlockAcidBathUp(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acid_bath);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("acid_bath_up"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockAcidBathUp.TileEntityAcidBathUp.class, "lepidodendron:tileentityacid_bath_up");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:acid_bath_up", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool PIPE = PropertyBool.create("pipe");

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_acid_bath_up");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean pipe = false;
			TileEntity tileEntity = worldIn.getTileEntity(pos.down().offset(state.getValue(FACING).getOpposite()));
			if (tileEntity != null) {
				if (tileEntity.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, state.getValue(FACING)) != null) {
					pipe = true;
				}
			}

			return state.withProperty(PIPE, pipe);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);

			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBathUp.TileEntityAcidBathUp) {
					BlockAcidBathUp.TileEntityAcidBathUp te = (BlockAcidBathUp.TileEntityAcidBathUp) tileEntity;
					if (te.canFizz() && random.nextInt(10) == 0) {
						for (int l = 0; l < 8; ++l) {
							world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + 0.5, (double) pos.getY() - 0.5, (double) pos.getZ() + 0.5, 0, 0.075D, 0);
						}
					}
					if (te.canFizz() && random.nextInt(10) == 0) {
						for (int l = 0; l < 8; ++l) {
							world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.offset(world.getBlockState(pos).getValue(FACING)).getX() + 0.5, (double) pos.offset(world.getBlockState(pos).getValue(FACING)).getY() - 0.5, (double) pos.offset(world.getBlockState(pos).getValue(FACING)).getZ() + 0.5, 0, 0.075D, 0);
						}
					}
				}
			}
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemAcidBath.block, 1);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockAcidBathUp.TileEntityAcidBathUp();
		}

		public BlockAcidBathUp.TileEntityAcidBathUp createNewTileEntity(World worldIn, int meta) {
			return new BlockAcidBathUp.TileEntityAcidBathUp();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, PIPE});
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
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				if (tileentity instanceof BlockAcidBathUp.TileEntityAcidBathUp) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockAcidBathUp.TileEntityAcidBathUp) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIAcidBath.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Nullable
		@Override
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		//NORTH
		protected static final AxisAlignedBB AABBS = new AxisAlignedBB(0.3125, 0.0D, 0.0D, 0.6875, 0.75, 0.25);

		//SOUTH
		protected static final AxisAlignedBB AABBN = new AxisAlignedBB(0.3125, 0.0D, 0.75D, 0.6875, 0.75, 1.00);

		//EAST
		protected static final AxisAlignedBB AABBW = new AxisAlignedBB(0.75D, 0.0D, 0.3125, 1.00, 0.75, 0.6875);

		//WEST
		protected static final AxisAlignedBB AABBE = new AxisAlignedBB(0.0D, 0.0D, 0.3125, 0.25, 0.75, 0.6875);


		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				return AABBN;
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				return AABBS;
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				return AABBE;
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				return AABBW;
			}
			else {
				return new AxisAlignedBB(0,0,0,1,1,1);
			}
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			IBlockState endState = worldIn.getBlockState(pos.down());
			if (endState.getBlock() != BlockAcidBath.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable EnumFacing side) {
			if (state.getValue(FACING) == EnumFacing.NORTH && side == EnumFacing.SOUTH
					|| state.getValue(FACING) == EnumFacing.SOUTH && side == EnumFacing.NORTH
					|| state.getValue(FACING) == EnumFacing.EAST && side == EnumFacing.WEST
					|| state.getValue(FACING) == EnumFacing.WEST && side == EnumFacing.EAST) {
				return true;
			}
			return false;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (state.getValue(FACING) == EnumFacing.NORTH && face == EnumFacing.SOUTH
					|| state.getValue(FACING) == EnumFacing.SOUTH && face == EnumFacing.NORTH
					|| state.getValue(FACING) == EnumFacing.EAST && face == EnumFacing.WEST
					|| state.getValue(FACING) == EnumFacing.WEST && face == EnumFacing.EAST) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
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
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

	}

	public static class TileEntityAcidBathUp extends TileEntityLockableLoot implements ITickable, ISidedInventory {

		private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);
		protected int trayheight;
		protected boolean isProcessing;
		protected int processTick;
		private int minEnergyNeeded = 100;
		private int trayLiftTickTime = 120; //6 seconds to move the tray
		private int processTickTime = 960; //48 seconds to process the tray fully
		//private int processTickTime = 140; //TEST

		public boolean canStartProcess() {

			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}

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

		public boolean canStartProcessSecondary() {

			if (LepidodendronConfig.machinesRF) {
				if (!this.hasEnergy(minEnergyNeeded)) {
					return false;
				}
			}

			if ((!isProcessing)
					&& (!isTankPaused())
					&& getStackInSlot(1).isEmpty()
					&& getStackInSlot(2).isEmpty()
					&& getStackInSlot(3).isEmpty()
					&& getStackInSlot(4).isEmpty()
					&& (!getStackInSlot(5).isEmpty()
					|| !getStackInSlot(6).isEmpty()
					|| !getStackInSlot(7).isEmpty()
					|| !getStackInSlot(8).isEmpty())
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

		public boolean getIsProcessing() {
			return this.isProcessing;
		}

		@Override
		public void update() {

			if (this.getWorld().isRemote) {
				return;
			}

			boolean updated = false;

			if ((!isProcessing)
					&& (isTankPaused())) {
				ItemStack inputStack = getStackInSlot(0);
				ItemStack processStack = inputStack.copy();
				processStack.setCount(1);
				if ((!inputStack.isEmpty()) && getStackInSlot(5).isEmpty()) {
					setInventorySlotContents(5, processStack);
					inputStack.shrink(1);
				}
				else if ((!inputStack.isEmpty()) && getStackInSlot(6).isEmpty()) {
					setInventorySlotContents(6, processStack);
					inputStack.shrink(1);
				}
				else if ((!inputStack.isEmpty()) && getStackInSlot(7).isEmpty()) {
					setInventorySlotContents(7, processStack);
					inputStack.shrink(1);
				}
				else if ((!inputStack.isEmpty()) && getStackInSlot(8).isEmpty()) {
					setInventorySlotContents(8, processStack);
					inputStack.shrink(1);
				}
				setInventorySlotContents(0, inputStack);
			}

			if (canStartProcess()) {
				ItemStack inputStack = getStackInSlot(0);
				ItemStack processStack = inputStack.copy();
				processStack.setCount(1);
				if (!inputStack.isEmpty()) {
					setInventorySlotContents(5, processStack);
				}
				inputStack.shrink(1);
				setInventorySlotContents(0, inputStack);
				inputStack = getStackInSlot(0);
				if (!inputStack.isEmpty()) {
					setInventorySlotContents(6, processStack);
				}
				inputStack.shrink(1);
				setInventorySlotContents(0, inputStack);
				inputStack = getStackInSlot(0);
				if (!inputStack.isEmpty()) {
					setInventorySlotContents(7, processStack);
				}
				inputStack.shrink(1);
				setInventorySlotContents(0, inputStack);
				inputStack = getStackInSlot(0);
				if (!inputStack.isEmpty()) {
					setInventorySlotContents(8, processStack);
				}
				inputStack.shrink(1);
				setInventorySlotContents(0, inputStack);

				//We have filled our tank up:
				this.isProcessing = true;
				processTick = 0;
				//updated = true;
			}
			else if (canStartProcessSecondary()) {
				//We already have entries here to process:
				this.isProcessing = true;
				processTick = 0;
			}

			if (this.isProcessing && this.processTick < this.processTickTime && (this.hasEnergy(minEnergyNeeded))) {
				this.processTick++;
				//this.drainEnergy(10);
				if (this.processTick <= this.trayLiftTickTime) {
					this.trayheight++;
				} else if (this.processTick >= (this.processTickTime - this.trayLiftTickTime)) {
					this.trayheight--;
				} else {
					if (this.getWorld().rand.nextInt(10) == 0) {
						world.playSound(null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (this.getWorld().rand.nextFloat() - this.getWorld().rand.nextFloat()) * 0.8F);
					}
					//this.getWorld().notifyBlockUpdate(this.getPos(), this.getWorld().getBlockState(this.getPos()), this.getWorld().getBlockState(this.getPos()), 3);
				}
				this.drainEnergy(10);
				updated = true;
			}

			if (this.isProcessing && this.processTick == (this.processTickTime - this.trayLiftTickTime)) {
				//Give the processed block now:
				if (!getStackInSlot(5).isEmpty()) {
					//setInventorySlotContents(5, new ItemStack(Items.REDSTONE, 1));
					ItemStack result = itemChooser(getStackInSlot(5), world);
					if (result == null) {
						setInventorySlotContents(5, ItemStack.EMPTY);
					} else {
						setInventorySlotContents(5, result);
					}
				}
				if (!getStackInSlot(6).isEmpty()) {
					//setInventorySlotContents(6, new ItemStack(Items.REDSTONE, 1));
					ItemStack result = itemChooser(getStackInSlot(6), world);
					if (result == null) {
						setInventorySlotContents(6, ItemStack.EMPTY);
					} else {
						setInventorySlotContents(6, result);
					}
				}
				if (!getStackInSlot(7).isEmpty()) {
					//setInventorySlotContents(7, new ItemStack(Items.REDSTONE, 1));
					ItemStack result = itemChooser(getStackInSlot(7), world);
					if (result == null) {
						setInventorySlotContents(7, ItemStack.EMPTY);
					} else {
						setInventorySlotContents(7, result);
					}
				}
				if (!getStackInSlot(8).isEmpty()) {
					//setInventorySlotContents(8, new ItemStack(Items.REDSTONE, 1));
					ItemStack result = itemChooser(getStackInSlot(8), world);
					if (result == null) {
						setInventorySlotContents(8, ItemStack.EMPTY);
					} else {
						setInventorySlotContents(8, result);
					}
				}
				updated = true;
			}

			if (this.isProcessing && this.processTick >= this.processTickTime) {
				BlockAcidBath.TileEntityAcidBath te = null;
				TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
				if (tileEntity != null) {
					if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
						te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					}
				}
				//Move the results over to the outputs:
				if (!getStackInSlot(5).isEmpty()) {
					ItemStack stack = getStackInSlot(5);
					setInventorySlotContents(1, stack);
					setInventorySlotContents(5, ItemStack.EMPTY);
					if (te != null) { //Also add to the "helper" inventory underneath for hoppers
						te.setInventorySlotContents(0, stack);
					}
				}
				if (!getStackInSlot(6).isEmpty()) {
					ItemStack stack = getStackInSlot(6);
					setInventorySlotContents(2, stack);
					setInventorySlotContents(6, ItemStack.EMPTY);
					if (te != null) { //Also add to the "helper" inventory underneath for hoppers
						te.setInventorySlotContents(1, stack);
					}
				}
				if (!getStackInSlot(7).isEmpty()) {
					ItemStack stack = getStackInSlot(7);
					setInventorySlotContents(3, stack);
					setInventorySlotContents(7, ItemStack.EMPTY);
					if (te != null) { //Also add to the "helper" inventory underneath for hoppers
						te.setInventorySlotContents(2, stack);
					}
				}
				if (!getStackInSlot(8).isEmpty()) {
					ItemStack stack = getStackInSlot(8);
					setInventorySlotContents(4, stack);
					setInventorySlotContents(8, ItemStack.EMPTY);
					if (te != null) { //Also add to the "helper" inventory underneath for hoppers
						te.setInventorySlotContents(3, stack);
					}
				}
				this.processTick = 0;
				this.isProcessing = false;
				this.trayheight = 0;
				useAcid();
				updated = true;
			}

			//Finally match the inventories of the main block and the helper inventory underneath it,
			//so that if a hopper has been used it only takes one item
			BlockAcidBath.TileEntityAcidBath te = null;
			TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
					te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					if (te.getStackInSlot(0).isEmpty() && (!this.getStackInSlot(1).isEmpty())) {
						setInventorySlotContents(1, ItemStack.EMPTY);
						updated = true;
					}
					if (te.getStackInSlot(1).isEmpty() && (!this.getStackInSlot(2).isEmpty())) {
						setInventorySlotContents(2, ItemStack.EMPTY);
						updated = true;
					}
					if (te.getStackInSlot(2).isEmpty() && (!this.getStackInSlot(3).isEmpty())) {
						setInventorySlotContents(3, ItemStack.EMPTY);
						updated = true;
					}
					if (te.getStackInSlot(3).isEmpty() && (!this.getStackInSlot(4).isEmpty())) {
						setInventorySlotContents(4, ItemStack.EMPTY);
						updated = true;
					}

					if (getStackInSlot(1).isEmpty() && (!te.getStackInSlot(0).isEmpty())) {
						te.setInventorySlotContents(0, ItemStack.EMPTY);
						updated = true;
					}
					if (getStackInSlot(2).isEmpty() && (!te.getStackInSlot(1).isEmpty())) {
						te.setInventorySlotContents(1, ItemStack.EMPTY);
						updated = true;
					}
					if (getStackInSlot(3).isEmpty() && (!te.getStackInSlot(2).isEmpty())) {
						te.setInventorySlotContents(2, ItemStack.EMPTY);
						updated = true;
					}
					if (getStackInSlot(4).isEmpty() && (!te.getStackInSlot(3).isEmpty())) {
						te.setInventorySlotContents(3, ItemStack.EMPTY);
						updated = true;
					}
				}
			}

			if (updated) {
				this.notifyBlockUpdate();
			}
			markDirty();

		}

		@Nullable
		private static ItemStack getPlantStack(ItemStack stack) {
			ItemStack finalItem = null;
			String resLoc = "";
			if (stack.getItem() == (new ItemStack(ItemFossilPrecambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(1);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(2);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilOrdovician.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(3);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilSilurian.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(4);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilDevonian.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(5);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCarboniferous.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(6);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPermian.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(7);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilTriassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(8);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilJurassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(9);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCretaceous.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(10);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPaleogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(11);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilNeogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(12);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPleistocene.block, 1)).getItem()) {
				resLoc = AcidBathOutputPlants.resLocPlants(13);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFPlant", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			}
			return null;
		}

		@Nullable
		private static ItemStack getMobStack(ItemStack stack) {
			ItemStack finalItem = null;
			String resLoc = "";
			if (stack.getItem() == (new ItemStack(ItemFossilPrecambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(1);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(2);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilOrdovician.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(3);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilSilurian.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(4);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilDevonian.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(5);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCarboniferous.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(6);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPermian.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(7);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilTriassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(8);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilJurassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(9);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCretaceous.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(10);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPaleogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(11);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilNeogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(12);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPleistocene.block, 1)).getItem()) {
				resLoc = AcidBathOutputMobs.resLocMobs(13);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound entityNBT = new NBTTagCompound();
				entityNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFMob", entityNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			}
			return null;
		}

		@Nullable
		private static ItemStack getStaticsStack(ItemStack stack) {
			ItemStack finalItem = null;
			String resLoc = "";
			if (stack.getItem() == (new ItemStack(ItemFossilPrecambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(1);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCambrian.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(2);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilOrdovician.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(3);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilSilurian.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(4);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilDevonian.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(5);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCarboniferous.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(6);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPermian.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(7);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilTriassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(8);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilJurassic.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(9);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilCretaceous.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(10);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPaleogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(11);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilNeogene.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(12);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			} else if (stack.getItem() == (new ItemStack(ItemFossilPleistocene.block, 1)).getItem()) {
				resLoc = AcidBathOutputStatics.resLocStatics(13);
				if (resLoc == null) {
					return null;
				}
				if (resLoc.equalsIgnoreCase("")) {
					return null;
				}
				finalItem = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound plantNBT = new NBTTagCompound();
				plantNBT.setString("id", resLoc);
				NBTTagCompound stackNBT = new NBTTagCompound();
				stackNBT.setTag("PFStatic", plantNBT);
				finalItem.setTagCompound(stackNBT);
				return finalItem;
			}
			return null;
		}

		@Nullable
		public static ItemStack itemChooser(ItemStack stack, World world) {
			ItemStack finalItem = null;
			String resLoc = "";
			float junk = (float) LepidodendronConfig.junkFossil;
			if (junk < 0F) {
				junk = 0F;
			}
			if (junk > 100F) {
				junk = 100F;
			}
			if ((world.rand.nextFloat() * 100F) < junk || junk >= 100F) {
				return getFailStack(stack);
			}
			//We  have 3 different analysables:
			//First we will check if this one has already been specified:
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					return getPlantStack(stack);
				} else if (stack.getTagCompound().hasKey("PFMob")) {
					return getMobStack(stack);
				} else if (stack.getTagCompound().hasKey("PFStatic")) {
					return getStaticsStack(stack);
				}
			}

			//This hasn't been defined yet so do something random:
			if (Math.random() > 0.55) { //Plants:
				finalItem = getPlantStack(stack);
				if (finalItem != null && !finalItem.isEmpty()) {
					return finalItem;
				} else {
					finalItem = getStaticsStack(stack);
					if (finalItem != null && !finalItem.isEmpty()) {
						return finalItem;
					} else {
						finalItem = getMobStack(stack);
						if (finalItem != null && !finalItem.isEmpty()) {
							return finalItem;
						} else {
							return getFailStack(stack);
						}
					}
				}
			} else if (Math.random() > 0.4) { //Mobs:
				finalItem = getMobStack(stack);
				if (finalItem != null && !finalItem.isEmpty()) {
					return finalItem;
				} else {
					return getFailStack(stack);
				}
			} else { //Static creatures
				finalItem = getStaticsStack(stack);
				if (finalItem != null && !finalItem.isEmpty()) {
					return finalItem;
				} else {
					return getFailStack(stack);
				}
			}
		}

		public static ItemStack getFailStack(ItemStack stack) {
			//if (world.rand.nextInt(5) != 0) {
			ItemStack finalItem = null;
			if (stack.getItem() == (new ItemStack(ItemFossilPrecambrian.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(1);
			} else if (stack.getItem() == (new ItemStack(ItemFossilCambrian.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(2);
			} else if (stack.getItem() == (new ItemStack(ItemFossilOrdovician.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(3);
			} else if (stack.getItem() == (new ItemStack(ItemFossilSilurian.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(4);
			} else if (stack.getItem() == (new ItemStack(ItemFossilDevonian.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(5);
			} else if (stack.getItem() == (new ItemStack(ItemFossilCarboniferous.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(6);
			} else if (stack.getItem() == (new ItemStack(ItemFossilPermian.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(7);
			} else if (stack.getItem() == (new ItemStack(ItemFossilTriassic.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(8);
			} else if (stack.getItem() == (new ItemStack(ItemFossilJurassic.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(9);
			} else if (stack.getItem() == (new ItemStack(ItemFossilCretaceous.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(10);
			} else if (stack.getItem() == (new ItemStack(ItemFossilPaleogene.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(11);
			} else if (stack.getItem() == (new ItemStack(ItemFossilNeogene.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(12);
			} else if (stack.getItem() == (new ItemStack(ItemFossilPleistocene.block, 1)).getItem()) {
				return AcidBathOutputJunk.fossilAcidJunk(13);
			}
			//}
			return stack;
		}

		public void useAcid() {
			//Pause the tank if it is receiving a redstone signal:
			if (!isTankPaused()) {
				TileEntity tileEntity = this.getWorld().getTileEntity(this.getPos().down());
				if (tileEntity != null) {
					if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
						BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
						if (te.fluid != null) {
							te.fluid.amount = Math.max(0, te.fluid.amount - 75);
							te.markDirty();
						}
					}
				}
			}
		}

		public double progressFraction() {
			if (this.isProcessing) {
				return (double) this.processTick / (double) this.processTickTime;
			}
			return 0;
		}

		public boolean isTankPaused() {
			IBlockState state = this.getWorld().getBlockState(this.getPos());
			EnumFacing face = EnumFacing.NORTH;
			if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.NORTH) {
				face = EnumFacing.SOUTH;
			} else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.SOUTH) {
				face = EnumFacing.NORTH;
			} else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.EAST) {
				face = EnumFacing.WEST;
			} else if (state.getValue(BlockAcidBathUp.BlockCustom.FACING) == EnumFacing.WEST) {
				face = EnumFacing.EAST;
			}
			if (this.getWorld().isSidePowered(this.getPos().offset(face), face.getOpposite())
					||
					this.getWorld().isBlockPowered(this.getPos())
			) {
				return true;
			}
			return false;
		}

		@Override
		public int getInventoryStackLimit() {
			return 64;
		}

		public int getHeight() {
			return this.trayheight;
		}

		public void setHeight(int height) {
			this.trayheight = height;
		}

		@Override
		public int getSizeInventory() {
			return 9;
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
			if (index == 7)
				return false;
			if (index == 8)
				return false;
			return true;
		}

		@Override
		public ItemStack getStackInSlot(int slot) {
			return stacks.get(slot);
		}

		@Override
		public String getName() {
			return "container.acidbath";
		}

		@Override
		public String getGuiID() {
			return "lepidodendron:gui_acid_bath";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUIAcidBath.GUILepidodendronAcidBath(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
		}

		@Override
		protected NonNullList<ItemStack> getItems() {
			return this.stacks;
		}

		@Override
		public void readFromNBT(NBTTagCompound compound) {
			super.readFromNBT(compound);
			if (compound.hasKey("trayheight")) {
				this.trayheight = compound.getInteger("trayheight");
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
			compound.setInteger("trayheight", this.trayheight);
			compound.setBoolean("isProcessing", this.isProcessing);
			compound.setInteger("processTick", this.processTick);
			if (!this.checkLootAndWrite(compound)) {
				ItemStackHelper.saveAllItems(compound, this.stacks);
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

		public void drainEnergy(int energy) {
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBathUp.TileEntityAcidBathUp) {
					BlockPos RFStorage = this.getPos().down().offset(world.getBlockState(this.getPos()).getValue(BlockAcidBathUp.BlockCustom.FACING));
					TileEntity tileEntity2 = world.getTileEntity(RFStorage);
					if (tileEntity2 != null) {
						if (tileEntity2 instanceof BlockAcidBathEnd.TileEntityAcidBathEnd) {
							BlockAcidBathEnd.TileEntityAcidBathEnd te = (BlockAcidBathEnd.TileEntityAcidBathEnd) tileEntity2;
							te.extractEnergy(energy,false);
						}
					}
				}
			}
		}

		public boolean hasEnergy(int minEnergy) {
			if (!LepidodendronConfig.machinesRF) {
				return true;
			}
			TileEntity tileEntity = world.getTileEntity(this.getPos());
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBathUp.TileEntityAcidBathUp) {
					BlockPos RFStorage = this.getPos().down().offset(world.getBlockState(this.getPos()).getValue(BlockAcidBathUp.BlockCustom.FACING));
					TileEntity tileEntity2 = world.getTileEntity(RFStorage);
					if (tileEntity2 != null) {
						if (tileEntity2 instanceof BlockAcidBathEnd.TileEntityAcidBathEnd) {
							BlockAcidBathEnd.TileEntityAcidBathEnd te = (BlockAcidBathEnd.TileEntityAcidBathEnd) tileEntity2;
							return te.getEnergyStored() > minEnergy;
						}
					}
				}
			}
			return false;
		}


		@Override
		public int[] getSlotsForFace(EnumFacing side) {
			return new int[] {0,1,2,3,4}; //5-8 are the processing slots
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			return index == 0;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			if ((!isProcessing)
					&& (isTankPaused())) {
				return true;
			}
			return index != 5 & index != 6 & index != 7 & index != 8;
		}
	}
}