
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNypaShoot02Side extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nypa_shoot_02_side")
	public static final Block block = null;
	public BlockNypaShoot02Side(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nypa_shoot);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("nypa_shoot_02_side"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	//			new ModelResourceLocation("lepidodendron:nypa_shoot_02_side", "inventory"));
	//}

	public static final PropertyBool VAR = PropertyBool.create("var");

	public static class BlockCustom extends BlockLeaves {

		public static final PropertyDirection FACING = BlockHorizontal.FACING;

		public BlockCustom() {
			setTranslationKey("pf_nypa_shoot_02_side");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(VAR, false).withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			if (state.getValue(BlockHorizontal.FACING) == EnumFacing.NORTH) {
				pos = pos.south();
			}
			if (state.getValue(BlockHorizontal.FACING) == EnumFacing.SOUTH) {
				pos = pos.north();
			}
			if (state.getValue(BlockHorizontal.FACING) == EnumFacing.EAST) {
				pos = pos.west();
			}
			if (state.getValue(BlockHorizontal.FACING) == EnumFacing.WEST) {
				pos = pos.east();
			}
			boolean boolVar = false;
			if ((double) (pos.getX() + pos.getZ())/3 == (int) (pos.getX() + pos.getZ())/3) {
				boolVar = true;
			}
			return state.withProperty(VAR, boolVar);
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VAR, FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.0D, 0D, 0D, 0.0D, 0D, 0.0D);
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
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
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
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

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockNypaShootPlaceable.block, (int) (1));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();

		}

		public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        	return false;
    	}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

	    @Override
        public ItemStack getSilkTouchDrop(IBlockState state)  {
            return new ItemStack(BlockNypaShootPlaceable.block, (int) (1));
        }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			//North
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.NORTH) 
				&& (world.getBlockState(pos.south()).getBlock() != BlockNypaShoot02.block)
				&& (world.getBlockState(pos.south()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//South
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.SOUTH) 
				&& (world.getBlockState(pos.north()).getBlock() != BlockNypaShoot02.block)
				&& (world.getBlockState(pos.north()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//East
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.EAST) 
				&& (world.getBlockState(pos.west()).getBlock() != BlockNypaShoot02.block)
				&& (world.getBlockState(pos.west()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//West
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.WEST) 
				&& (world.getBlockState(pos.east()).getBlock() != BlockNypaShoot02.block)
				&& (world.getBlockState(pos.east()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				world.destroyBlock(pos, false);
				return;
			}

		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			//North
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.NORTH) 
				&& (worldIn.getBlockState(pos.south()).getBlock() != BlockNypaShoot02.block)
				&& (worldIn.getBlockState(pos.south()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//South
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.SOUTH) 
				&& (worldIn.getBlockState(pos.north()).getBlock() != BlockNypaShoot02.block)
				&& (worldIn.getBlockState(pos.south()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//East
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.EAST) 
				&& (worldIn.getBlockState(pos.west()).getBlock() != BlockNypaShoot02.block)
				&& (worldIn.getBlockState(pos.south()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//West
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.WEST) 
				&& (worldIn.getBlockState(pos.east()).getBlock() != BlockNypaShoot02.block)
				&& (worldIn.getBlockState(pos.south()).getBlock() != BlockNypaShoot02Fruiting.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
		}

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockNypaShootPlaceable.block, (int) (1)));
		}
	}
}
