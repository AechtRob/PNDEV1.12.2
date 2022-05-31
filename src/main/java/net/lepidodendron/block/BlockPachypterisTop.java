
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPachypterisTop extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:pachypteris_top")
	public static final Block block = null;
	public BlockPachypterisTop(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.pachypteris_top);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	//			new ModelResourceLocation("lepidodendron:isoetes", "inventory"));
	//}

	public static class BlockCustom extends Block {

		protected static final AxisAlignedBB PACHYPTERIS_TOP_AABB = new AxisAlignedBB(0D, -1D, 0D, 1D, 1D, 1D);
		
		public BlockCustom() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTranslationKey("pf_weichselia_top");
			setRegistryName("pachypteris_top");
		}

		@SideOnly(Side.CLIENT)
		@Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

		@Override
		@javax.annotation.Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return PACHYPTERIS_TOP_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return false;
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
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {
	    	addCollisionBoxToList(pos, entityBox, collidingBoxes, PACHYPTERIS_TOP_AABB);
	    }

	    @Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return PACHYPTERIS_TOP_AABB;
		}
	
	    @Override
	    public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	    {
	    }

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return false;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockPachypteris.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(Blocks.AIR, (int) (1)));
			}
			else {
				drops.add(new ItemStack(BlockPachypteris.block, (int) (1)));
			}
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
	    	
	        if (!world.isRemote)
	        {
	            if (!world.isAreaLoaded(pos, 3)) return;
	            
				if (!this.canSurviveAt(world, pos))
		        {
		            world.destroyBlock(pos, false);
		        }
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {
	    	if ((worldIn.getBlockState(pos.down(3)).getBlock() == BlockPachypteris.block)
	    		|| (worldIn.getBlockState(pos.down(2)).getBlock() == BlockPachypteris.block)
	    		|| (worldIn.getBlockState(pos.down()).getBlock() == BlockPachypterisStem.block))
	    	{
	    		return true;
	    	}
	    	return false;
	    }

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Remove the base block(s):
			if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockPachypteris.block) {
				worldIn.destroyBlock(pos.down(2), false);
			}
			if (worldIn.getBlockState(pos.down(3)).getBlock() == BlockPachypteris.block) {
				worldIn.destroyBlock(pos.down(3), false);
			}
			if (worldIn.getBlockState(pos.down()).getBlock() == BlockPachypterisStem.block) {
				worldIn.destroyBlock(pos.down(), false);
			}
			//Chance of a second drop:
			if (Math.random() >= 0.7 && !LepidodendronConfig.doPropagation) {
				if (!worldIn.isRemote) {
					EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockPachypteris.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					worldIn.spawnEntity(entityToSpawn);
				}
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

	}
}
