
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.entities.*;
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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockRottenLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:rotten_log")
	public static final Block block = null;
	public BlockRottenLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.rotten_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("rotten_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockRottenLog.TileEntityCustom.class, "lepidodendron:tileentityrotten_log");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:rotten_log", "inventory"));
	}
	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_rotten_log");
			setSoundType(SoundType.WOOD);
			setHarvestLevel("axe", 0);
			setHardness(1.5F);
			setResistance(1.5F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));
		}

		public Item getSecondItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(ItemBugRaw.block, 1).getItem();
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			Random rand = world instanceof World ? ((World)world).rand : RANDOM;
			boolean dropped = false;
			int count = quantityDropped(state, fortune, rand);
			for (int i = 0; i < count; i++)
			{
				Item item = this.getSecondItemDropped(state, rand, fortune);
				if (item != Items.AIR && rand.nextInt(fortune + 2) != 0)
				{
					drops.add(new ItemStack(item, 1, 0));
					drops.add(new ItemStack(Items.STICK, 1, 0));
				}
				else {
					item = this.getItemDropped(state, rand, fortune);
					if (item != Items.AIR && !dropped) {
						drops.add(new ItemStack(item, 1, 0));
						dropped = true;
					}
				}

			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
				if ((EnumFacing) state.getValue(FACING) == EnumFacing.WEST || (EnumFacing) state.getValue(FACING) == EnumFacing.EAST) {
					return state.withProperty(FACING, EnumFacing.UP);
				} else if ((EnumFacing) state.getValue(FACING) == EnumFacing.UP || (EnumFacing) state.getValue(FACING) == EnumFacing.DOWN) {
					return state.withProperty(FACING, EnumFacing.WEST);
				}
			}
			return state;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			if (facing == EnumFacing.WEST || facing == EnumFacing.EAST)
				facing = EnumFacing.UP;
			else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
				facing = EnumFacing.EAST;
			else
				facing = EnumFacing.SOUTH;
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 3;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 3;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.WOOD;
		}

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return false;
		}

		@Override public boolean isWood(IBlockAccess world, BlockPos pos){ return true; }

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
			EnumFacing facing = worldIn.getBlockState(pos).getValue(FACING);
			BlockFaceShape faceshape = worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP);
			if	(!worldIn.isRemote && (
					(facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
							&& faceshape != BlockFaceShape.SOLID
			)) {
				SpawnEggs(worldIn, pos);
				//Clear nbt:
				TileEntity te = worldIn.getTileEntity(pos);
				if (te != null) {
					te.getTileData().removeTag("egg");
				}
				worldIn.notifyBlockUpdate(pos, state, state, 3);
			}
			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			EnumFacing facing = state.getValue(FACING);
			BlockFaceShape faceshape = world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP);
			if	(!world.isRemote && !(
					(facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
							&& faceshape != BlockFaceShape.SOLID
			)) {
				SpawnEggs(world, pos);
			}
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		public void SpawnEggs(World world, BlockPos pos) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(pos), "egg");

			EntityItem entityToSpawn = null;
			if (!eggRenderType.equals("")) {
				if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_casineria")) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsCasineria.block, (int) (1)));
				}
//				else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_drepanosaurus")) {
//					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsDrepanosaurus.block, (int) (1)));
//				}
				else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hylonomus")) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsHylonomus.block, (int) (1)));
				}
				else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_labidosaurus")) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsLabidosaurus.block, (int) (1)));
				}
				else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_weigeltisaurus")) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsWeigeltisaurus.block, (int) (1)));
				}
				else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_celtedens")) {
					entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsCeltedens.block, (int) (1)));
				}
				else {
					Block blockSpawn = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(eggRenderType)).getDefaultState().getBlock();
					//System.err.println("Block " + blockSpawn);
					if (blockSpawn != null) {
						if (!(blockSpawn instanceof BlockInsectEggs)) { //Do not spawn insect eggs - these need collecting
							entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(blockSpawn, (int) (1)));
						}
					}
				}
			}
			//Spawn the eggs:
			if (!world.isRemote && entityToSpawn != null) {
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
				//System.err.println("Spawned " + entityToSpawn);
			}
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockRottenLog.TileEntityCustom();
		}

		public BlockRottenLog.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockRottenLog.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public boolean isSideSolid(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side)
		{
			if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH)
				return side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.EAST || side == EnumFacing.WEST;

			if (state.getValue(FACING) == EnumFacing.EAST || state.getValue(FACING) == EnumFacing.WEST)
				return side == EnumFacing.EAST || side == EnumFacing.WEST || side == EnumFacing.UP || side == EnumFacing.DOWN;

			if (state.getValue(FACING) == EnumFacing.UP || state.getValue(FACING) == EnumFacing.DOWN)
				return side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.UP || side == EnumFacing.DOWN;

			return false;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing side)
		{
			if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH)
				if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.EAST || side == EnumFacing.WEST) {
					return BlockFaceShape.SOLID;
				}

			if (state.getValue(FACING) == EnumFacing.EAST || state.getValue(FACING) == EnumFacing.WEST)
				if (side == EnumFacing.EAST || side == EnumFacing.WEST || side == EnumFacing.UP || side == EnumFacing.DOWN) {
					return BlockFaceShape.SOLID;
				}

			if (state.getValue(FACING) == EnumFacing.UP || state.getValue(FACING) == EnumFacing.DOWN)
				if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.UP || side == EnumFacing.DOWN) {
					return BlockFaceShape.SOLID;
				}

			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH) {
				return false;
			}
			return super.canPlaceTorchOnTop(state, world, pos);
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
		public boolean isFullBlock(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		protected static final AxisAlignedBB AABBN = new AxisAlignedBB(0.0D, 0.0D, 0.00D, 1.0D, 1.0D, 0.05D);
		protected static final AxisAlignedBB AABBS = new AxisAlignedBB(0.0D, 0.0D, 0.95D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBE = new AxisAlignedBB(0.95D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBW = new AxisAlignedBB(0.00D, 0.0D, 0.0D, 0.05D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBU = new AxisAlignedBB(0.0D, 0.95D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.05D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			if (state.getValue(FACING) == EnumFacing.NORTH || state.getValue(FACING) == EnumFacing.SOUTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW);
			}
			if (state.getValue(FACING) == EnumFacing.EAST || state.getValue(FACING) == EnumFacing.WEST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD);
			}
			if (state.getValue(FACING) == EnumFacing.UP || state.getValue(FACING) == EnumFacing.DOWN) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU);
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD);
			}
		}
	}

	public static class TileEntityCustom extends TileEntity {

		private String egg;

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			NBTTagCompound tag = new NBTTagCompound();
			this.writeToNBT(tag);
			return new SPacketUpdateTileEntity(pos, 1, tag);
		}

		@Override
		public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
			readFromNBT(packet.getNbtCompound());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound)
		{
			super.readFromNBT(compound);
			if (compound.hasKey("egg")) {
				this.egg = compound.getString("egg");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound)
		{
			super.writeToNBT(compound);
			if (this.hasEgg())
			{
				compound.setString("egg", this.egg);
			}
			return compound;
		}

		public boolean hasEgg()
		{
			return this.egg != null;
		}

	}
}
