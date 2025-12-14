
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemGuano;
import net.lepidodendron.item.ItemGuanoBall;
import net.lepidodendron.item.armor.ArmorInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGuano extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:guano")
	public static final Block block = null;
	public BlockGuano(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.guano);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("guano"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

//	@SideOnly(Side.CLIENT)
//	@Override
//	public void registerModels(ModelRegistryEvent event) {
////		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
////				new ModelResourceLocation("lepidodendron:guano", "inventory"));
//	}

	public static final PropertyBool NORTH = PropertyBool.create("north");
	public static final PropertyBool EAST = PropertyBool.create("east");
	public static final PropertyBool SOUTH = PropertyBool.create("south");
	public static final PropertyBool WEST = PropertyBool.create("west");
	public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");

	public static class BlockCustom extends BlockSnow {
		public BlockCustom() {
			super();
			setTranslationKey("pf_guano");
			setSoundType(SoundType.SLIME);
			setHarvestLevel("shovel", 0);
			setCreativeTab(null);
			setDefaultSlipperiness(0.8f);
			setHardness(0.1F);
			setLightOpacity(0);
			this.setTickRandomly(true);
			this.setDefaultState(this.blockState.getBaseState().withProperty(DECAYABLE, false).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false).withProperty(LAYERS, Integer.valueOf(1)));
		}

		@Override
		@Nullable
		protected RayTraceResult rayTrace(BlockPos pos, Vec3d start, Vec3d end, AxisAlignedBB boundingBox)
		{
			return null;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
		{
			return SNOW_AABB[((Integer)state.getValue(LAYERS)).intValue()];
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
		{
			return ((Integer)worldIn.getBlockState(pos).getValue(LAYERS)).intValue() < 5;
		}

		@Override
		public boolean isTopSolid(IBlockState state)
		{
			return ((Integer)state.getValue(LAYERS)).intValue() == 8;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return face == EnumFacing.DOWN ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state)
		{
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state)
		{
			return false;
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			//return this.getDefaultState().withProperty(LAYERS, Integer.valueOf((meta & 7) + 1));

			return this.getDefaultState().withProperty(LAYERS, Integer.valueOf((meta & 7) + 1)).withProperty(DECAYABLE, Boolean.valueOf((meta & 8) > 0));

		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			//return ((Integer)state.getValue(LAYERS)).intValue() - 1;

			int i = 0;
			i = i | ((Integer)state.getValue(LAYERS) - 1);

			if (!((Boolean)state.getValue(DECAYABLE)).booleanValue())
			{
				i |= 8;
			}

			return i;

		}

//		@Override
//		public void setHarvestLevel(String toolClass, int level, IBlockState state)
//		{
//			int idx = this.getMetaFromState(state);
//			this.harvestTool[idx] = toolClass;
//			this.harvestLevel[idx] = level;
//		}

		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{NORTH, EAST, SOUTH, WEST, LAYERS, DECAYABLE});
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(ItemGuanoBall.block, state.getValue(LAYERS)));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.down()).getBlock() == BlockGuanoBlock.block || worldIn.getBlockState(pos.down()).getBlock() == BlockGuano.block) {
				return super.getActualState(state, worldIn, pos).withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false);
			}
			boolean north = false;
			boolean east = false;
			boolean south = false;
			boolean west = false;
			if (worldIn.getBlockState(pos.down()).getBlock() != null) {
				if (!worldIn.isAirBlock(pos.down())) {
					try {
						north = renderGuanoSide(worldIn, pos.down(), EnumFacing.NORTH);
						east = renderGuanoSide(worldIn, pos.down(), EnumFacing.EAST);
						south = renderGuanoSide(worldIn, pos.down(), EnumFacing.SOUTH);
						west = renderGuanoSide(worldIn, pos.down(), EnumFacing.WEST);
					} catch (Throwable e) {
						//System.err.println("Error in state: " + worldIn.getBlockState(pos.down()));
						//System.err.println("Pos: " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " ");
						//Do nothing:
					}
				}
			}

			return super.getActualState(state, worldIn, pos).withProperty(NORTH, north).withProperty(EAST, east).withProperty(SOUTH, south).withProperty(WEST, west);
		}

		public boolean renderGuanoSide(IBlockAccess world, BlockPos pos, EnumFacing facing) {
			try {
				return (!world.getBlockState(pos.offset(facing)).doesSideBlockRendering(world, pos.offset(facing), facing.getOpposite()))
						&& (world.getBlockState(pos.offset(facing)).getBlockFaceShape(world, pos.offset(facing), facing.getOpposite()) != BlockFaceShape.SOLID);
			}
			catch (Throwable e) {
				return true;
			}

		}

		@Override
		public float getSlipperiness(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable Entity entity) {
			if (entity != null) {
				if (entity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer) entity;
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != ItemStack.EMPTY) {
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorInit.RUBBER_BOOTS) {
							return 0.6F;
						}
					}
				}
			}
			return super.getSlipperiness(state, world, pos, entity);
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		protected ItemStack getSilkTouchDrop(IBlockState state) {
			if (state.getValue(LAYERS) == 8) {
				return new ItemStack(BlockGuanoBlock.block, 1);
			}
			return new ItemStack(ItemGuano.block, state.getValue(LAYERS));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			if (state.getValue(LAYERS) == 8) {
				return new ItemStack(BlockGuanoBlock.block, 1);
			}
			return new ItemStack(ItemGuano.block, 1);
		}

		@Override
		public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
			super.onBlockAdded(worldIn, pos, state);
			//This is theoretically impossible, but just in case:
			if (worldIn.getBlockState(pos).getValue(LAYERS) == 8) {
				worldIn.setBlockState(pos, BlockGuanoBlock.block.getDefaultState());
			}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!state.getValue(DECAYABLE)) {
				return;
			}
			if (state.getValue(LAYERS) > 1) {
				worldIn.setBlockState(pos, state.withProperty(LAYERS, state.getValue(LAYERS) - 1));
			}
			else {
				worldIn.setBlockToAir(pos);
			}
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Has a bonemeal-effect: shift-click to place as normal");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}
