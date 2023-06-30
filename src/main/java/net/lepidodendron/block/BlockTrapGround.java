
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITrapGround;
import net.lepidodendron.item.ItemCageSmallItem;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.world.biome.TrapSpawner;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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
import net.minecraft.util.math.AxisAlignedBB;
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
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTrapGround extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:trap_ground")
	public static final Block block = null;

	public BlockTrapGround(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.trap_ground);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("trap_ground"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileEntityTrapGround.class, "lepidodendron:tileentitytrap_ground");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:trap_ground", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_trap_ground");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setTickRandomly(true);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public boolean causesSuffocation(IBlockState state) {
			return false;
		}

		protected static final AxisAlignedBB AABBN1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D - 0.5D, 1.0D, 1.0D, 0.1875D - 0.5D);
		protected static final AxisAlignedBB AABBS1 = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBE1 = new AxisAlignedBB(0.8125D, 0.0D, 0.0D - 0.5D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBW1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D - 0.5D, 0.1875D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBU1 = new AxisAlignedBB(0.0D, 0.9370D, 0.0D - 0.5D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D - 0.5D, 1.0D, 0.0625D, 1.0D);

		protected static final AxisAlignedBB AABBN2 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D + 0.5, 1.0D, 0.1875D);
		protected static final AxisAlignedBB AABBS2 = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D + 0.5, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBE2 = new AxisAlignedBB(0.8125D + 0.5, 0.0D, 0.0D, 1.0D + 0.5, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBW2 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBU2 = new AxisAlignedBB(0.0D, 0.9370D, 0.0D, 1.0D + 0.5, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD2 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D + 0.5, 0.0625D, 1.0D);

		protected static final AxisAlignedBB AABBN3 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
		protected static final AxisAlignedBB AABBS3 = new AxisAlignedBB(0.0D, 0.0D, 0.8125D + 0.5, 1.0D, 1.0D, 1.0D + 0.5);
		protected static final AxisAlignedBB AABBE3 = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D + 0.5);
		protected static final AxisAlignedBB AABBW3 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D + 0.5);
		protected static final AxisAlignedBB AABBU3 = new AxisAlignedBB(0.0D, 0.9370D, 0.0D, 1.0D, 1.0D, 1.0D + 0.5);
		protected static final AxisAlignedBB AABBD3 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D + 0.5);

		protected static final AxisAlignedBB AABBN4 = new AxisAlignedBB(0.0D - 0.5, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
		protected static final AxisAlignedBB AABBS4 = new AxisAlignedBB(0.0D - 0.5, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBE4 = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBW4 = new AxisAlignedBB(0.0D - 0.5, 0.0D, 0.0D, 0.1875D - 0.5, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBU4 = new AxisAlignedBB(0.0D - 0.5, 0.9370D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD4 = new AxisAlignedBB(0.0D - 0.5, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			EnumFacing facing = worldIn.getBlockState(pos).getValue(FACING);
			if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
				facing = EnumFacing.NORTH;
			}
			switch (facing) {
				case NORTH: default:
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU1);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD1);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN1);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS1);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE1);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW1);
					return;

				case EAST:
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU2);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD2);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN2);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS2);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE2);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW2);
					return;

				case SOUTH:
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU3);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD3);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN3);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS3);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE3);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW3);
					return;

				case WEST:
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU4);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD4);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN4);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS4);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE4);
					addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW4);
					return;
			}
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockTrapGround.TileEntityTrapGround();
		}

		public BlockTrapGround.TileEntityTrapGround createNewTileEntity(World worldIn, int meta) {
			return new BlockTrapGround.TileEntityTrapGround();
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
				if (tileentity instanceof BlockTrapGround.TileEntityTrapGround) {
					InventoryHelper.dropInventoryItems(world, pos, (BlockTrapGround.TileEntityTrapGround) tileentity);
				}
				world.removeTileEntity(pos);
			}
			super.breakBlock(world, pos, state);
		}

		public static boolean itemInteractionForEntityCage(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
			//If we are holding an empty cage we can click on an entity:
			if (stack.hasTagCompound()) {
				return false;
			}

			double width = target.getEntityBoundingBox().maxX-target.getEntityBoundingBox().minX;
			double depth = target.getEntityBoundingBox().maxZ-target.getEntityBoundingBox().minZ;
			double height = target.getEntityBoundingBox().maxY-target.getEntityBoundingBox().minY;

			if (height <= 0.9375 && width <= 1.0 && depth <= 1.0) { //catch the mob
				stack.shrink(1);
				//Pick up this entity with the Jar:
				ItemHandlerHelper.giveItemToPlayer(playerIn, BlockCageSmall.BlockCustom.createCageWithEntity(target));
				if ((playerIn instanceof EntityPlayerMP)) {
					ModTriggers.USE_CAGE.trigger((EntityPlayerMP) playerIn);
				}
				return true;
			}
			return false;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {

			if (entity.getHeldItem(hand).getItem() == ItemCageSmallItem.block && this.hasTrapped(world, pos)) {
				if (!entity.getHeldItem(hand).hasTagCompound()) {
					EntityLivingBase entityTrapped = null;
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null) {
						if (tileEntity instanceof BlockTrapGround.TileEntityTrapGround) {
							BlockTrapGround.TileEntityTrapGround te = (BlockTrapGround.TileEntityTrapGround) tileEntity;
							entityTrapped = te.getTrapped(world, pos);
							if (!world.isRemote) {
								this.itemInteractionForEntityCage(entity.getHeldItem(hand), entity, entityTrapped, hand);
							}
							world.markBlockRangeForRenderUpdate(pos, pos);
							world.notifyBlockUpdate(pos, state, state, 3);
							return true;
						}
					}
				}
			}
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITrapGround.GUIID, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}

		public static void releaseTrapped(World world, BlockPos pos) {
			EnumFacing facing = world.getBlockState(pos).getValue(FACING);
			if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
				facing = EnumFacing.NORTH;
			}

			List<EntityLivingBase> list = world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, trappedBB(world, pos));
			if (list.isEmpty()) {
				return;
			}

			EntityLivingBase entityanimal = null;
			for (EntityLivingBase entityanimal1 : list)
			{
				entityanimal = entityanimal1;
			}
			if (entityanimal != null) {
				switch (facing) {
					case NORTH: default:
						entityanimal.setPosition(pos.getX() + 0.5, pos.getY() + 0.25, pos.getZ() - 1.5);
						break;

					case EAST:
						entityanimal.setPosition(pos.getX() + 2.5, pos.getY() + 0.25, pos.getZ() + 0.5);
						break;

					case SOUTH:
						entityanimal.setPosition(pos.getX() + 0.5, pos.getY() + 0.25, pos.getZ() + 2.5);
						break;

					case WEST:
						entityanimal.setPosition(pos.getX() - 1.5, pos.getY() + 0.25, pos.getZ() + 0.5);
						break;
				}
			}
		}

		public static AxisAlignedBB trappedBB(World world, BlockPos pos) {
			EnumFacing facing = world.getBlockState(pos).getValue(FACING);
			if (facing == EnumFacing.UP || facing== EnumFacing.DOWN) {
				facing = EnumFacing.NORTH;
			}
			switch (facing) {
				case NORTH: default:
					return new AxisAlignedBB(pos.getX(), pos.getY(), pos.getZ() - 0.5, pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1);

				case EAST:
					return new AxisAlignedBB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1.5, pos.getY() + 1, pos.getZ() + 1);

				case SOUTH:
					return new AxisAlignedBB(pos.getX(), pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1.5);

				case WEST:
					return new AxisAlignedBB(pos.getX() - 0.5, pos.getY(), pos.getZ(), pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1);

			}
		}

		public static boolean hasTrapped(World world, BlockPos pos) {
			List<EntityLivingBase> list = world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, trappedBB(world, pos));
			if (!list.isEmpty()) {
				return true;
			}
			return false;
		}

		public static void makeTrapped(World world, BlockPos pos) {
			if (hasTrapped(world, pos)) {
				return;
			}
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity instanceof TileEntityTrapGround) {
				TileEntityTrapGround te = (TileEntityTrapGround) tileEntity;
				ItemStack stack = te.getStackInSlot(0);
				if (stack == ItemStack.EMPTY) {
					return;
				}
				TrapSpawner.executeProcedure(world, pos, world.rand, stack, 2);
				world.markBlockRangeForRenderUpdate(pos, pos);
				world.notifyBlockUpdate(pos, world.getBlockState(pos), world.getBlockState(pos), 3);
			}
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

			if (!world.isRemote)
			{
				boolean flag = world.isBlockPowered(pos);

				if (flag || neighborBlock.getDefaultState().canProvidePower())
				{
					this.releaseTrapped(world, pos);
					world.markBlockRangeForRenderUpdate(pos, pos);
					world.notifyBlockUpdate(pos, state, state, 3);
				}
			}

			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
		}

		@Override
		public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
			makeTrapped(worldIn, pos);
			super.randomTick(worldIn, pos, state, random);
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			if (this.hasTrapped(worldIn, pos)) {
				return 15;
			}
			return 0;
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
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face != state.getValue(FACING)) {
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

	public static class TileEntityTrapGround extends TileEntityLockableLoot implements ISidedInventory, ITickable {
		private NonNullList<ItemStack> forgeContents = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);
		private int ticker;

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
			return 1;
		}

		@Override
		public String getName() {
			return "container.trap_ground";
		}

		@Override
		public String getGuiID()
		{
			return "lepidodendron:gui_trap_ground";
		}

		@Override
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new GUITrapGround.GUILepidodendronTrapGround(this.getWorld(), this.getPos().getX(), this.getPos().getY(), this.getPos().getZ(), playerIn);
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
			return new int[]{0};
		}

		@Override
		public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
			if (index == 0) { //Fossil
				return isItemValidForSlot(index, itemStackIn);
			}
			return false;
		}

		@Override
		public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
			return false;
		}

		@Override
		public boolean isItemValidForSlot(int index, ItemStack stack) {
			if (index == 0) { //players can try literally anything as a lure
				return true;
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

		@Nullable
		public EntityLivingBase getTrapped(World world, BlockPos pos) {
			List<EntityLivingBase> list = world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class, BlockTrapGround.BlockCustom.trappedBB(world, pos));
			EntityLivingBase entityanimal = null;
			for (EntityLivingBase entityanimal1 : list)
			{
				entityanimal = entityanimal1;
			}
			return entityanimal;
		}

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos.getX() - 2, pos.getY(), pos.getZ() - 2, pos.getX() + 3, pos.getY() + 2, pos.getZ() + 3);
		}

		@Override
		public void update() {
			if (!this.getWorld().isRemote) {
				--this.ticker;

				if (this.ticker <= 0) {
					this.ticker = 1200;
				}

				if (this.getWorld().rand.nextInt(this.ticker) == 0) {
					BlockTrapGround.BlockCustom.makeTrapped(this.getWorld(), this.getPos());
					this.ticker = 1200;
				}
			}
		}
	}

}
