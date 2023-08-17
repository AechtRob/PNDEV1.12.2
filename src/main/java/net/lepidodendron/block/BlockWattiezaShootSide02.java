
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
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
public class BlockWattiezaShootSide02 extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:wattieza_shoot_side_02")
	public static final Block block = null;
	public BlockWattiezaShootSide02(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.wattieza_shoot_side_02);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("wattieza_shoot_side_02"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	//			new ModelResourceLocation("lepidodendron:wattieza_shoot_side_02", "inventory"));
	//}
	
	public static class BlockCustom extends SeedSporeBlockBase implements IAdvancementGranter {

		public static final PropertyDirection FACING = BlockHorizontal.FACING;

		public BlockCustom() {
			super(Material.LEAVES);
			setTranslationKey("pf_wattieza_shoot_side_02");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_WATTIEZA;
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
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
			return new ItemStack(BlockWattiezaShootPlaceable.block, (int) (1));
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
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
            return new ItemStack(BlockWattiezaShootPlaceable.block, (int) (1));
        }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			//North
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.NORTH) 
				&& (world.getBlockState(pos.south(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//South
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.SOUTH) 
				&& (world.getBlockState(pos.north(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//East
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.EAST) 
				&& (world.getBlockState(pos.west(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				world.destroyBlock(pos, false);
				return;
			}
			//West
			if (((world.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.WEST) 
				&& (world.getBlockState(pos.east(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				world.destroyBlock(pos, false);
				return;
			}

		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			//North
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.NORTH) 
				&& (worldIn.getBlockState(pos.south(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//South
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.SOUTH) 
				&& (worldIn.getBlockState(pos.north(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//East
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.EAST) 
				&& (worldIn.getBlockState(pos.west(2)).getBlock() != BlockWattiezaShoot02.block))
				{
				worldIn.destroyBlock(pos, false);
				return;
			}
			//West
			if (((worldIn.getBlockState(pos)).getValue(BlockHorizontal.FACING) == EnumFacing.WEST) 
				&& (worldIn.getBlockState(pos.east(2)).getBlock() != BlockWattiezaShoot02.block))
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
		public Block planted() {
			return BlockWattiezaSapling.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}
