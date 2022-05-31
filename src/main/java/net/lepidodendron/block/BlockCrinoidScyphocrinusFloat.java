
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemCrinoidScyphocrinusItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCrinoidScyphocrinusFloat extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:crinoid_scyphocrinus_float")
	public static final Block block = null;
	public BlockCrinoidScyphocrinusFloat(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.crinoid_scyphocrinus_float);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				//new ModelResourceLocation("lepidodendron:crinoid_scyphocrinus_float", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).build());
	}

	public static class BlockCustom extends Block  {

		public BlockCustom() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(null);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_crinoid_scyphocrinus_float");
			setRegistryName("crinoid_scyphocrinus_float");
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemCrinoidScyphocrinusItem.block, (int) (1));
		}

	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, -0.2D, 0.0, 1D, 0.2D, 1D);
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
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			//Must have a water block below this space and a Crinoid under that:
			if (isWaterBlock(world, pos.down()) && world.getBlockState(pos.down(2)).getBlock() == BlockCrinoidScyphocrinus.block) {
				return true;
			}
	        return false;
	        		
		}

		public boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return this.canPlaceBlockAt(worldIn, pos);
	    }

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
		}

		@Override //Grows downwards
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Check for a float above:
			if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockCrinoidScyphocrinus.block) {
				worldIn.destroyBlock(pos.down(2), true);
			}
			super.breakBlock(worldIn, pos, state);
		}

		public boolean isWaterBlock(World world, BlockPos pos) { //Different logic this time! We do need actual water blocks, not merely material
			if ((world.getBlockState(pos).getBlock() == Blocks.WATER)
				|| (world.getBlockState(pos).getBlock() == Blocks.FLOWING_WATER)) {
					return true;
			}
	    	return false;
	    }

	}
}
