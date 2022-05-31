
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLilyPad;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
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
public class BlockNelumboBud extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nelumbo_bud")
	public static final Block block = null;
	public BlockNelumboBud(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nelumbo_bud);
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
	//			new ModelResourceLocation("lepidodendron:nelumbo_bud", "inventory"));
	//}

	public static class BlockCustom extends BlockLilyPad {
		public BlockCustom() {
			//super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTickRandomly(true);
			setTranslationKey("pf_nelumbo_bud");
			setRegistryName("nelumbo_bud");
			this.setDefaultState(this.blockState.getBaseState());
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
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0D, 0.5D, 0D, 1D, 1.5D, 1D);
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess blockAccess, BlockPos pos) {
			return true;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockNelumbo.block, (int) (1));
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.AIR, (int) (1)));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			{
		        if (!this.canBlockStay(world, pos, state))
		        {
		            world.scheduleUpdate(pos, this, 1);
		        }
		    }
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
	    	
	        if (!world.isRemote)
	        {
	            if (!world.isAreaLoaded(pos, 3)) return;
	            
				if (!this.canBlockStay(world, pos, state))
		        {
		            world.destroyBlock(pos, false);
		        }
		        
			}

			//Move onto a full flower:
		    if (Math.random() > 0.6 && Math.random() > 0.6 && world.isAirBlock(pos.up()) && world.canSeeSky(pos)) {
		    	world.setBlockState(pos, BlockNelumboFlower.block.getDefaultState(), 3);
				if (!world.isRemote) {
					TileEntity _tileEntity = world.getTileEntity(pos);
					IBlockState _bs = world.getBlockState(pos);
					if (_tileEntity != null)
						_tileEntity.getTileData().setBoolean("decayable", (true));
					world.notifyBlockUpdate(pos, _bs, _bs, 3);
					}
		    }
		    
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
		
	    
		@Override
		public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (pos.getY() >= 0 && pos.getY() < 256)
	        {
	            return canSurviveAt(worldIn, pos);
	        }
	        else
	        {
	            return false;
	        }
	    }	

		//@Override
		public boolean canSurviveAt(World worldIn, BlockPos pos) {
			if (!isWaterBlock(worldIn, pos.down()))
	    	{
	    		return false;
	    	}
	    	if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockNelumboStem.block) {
				return true;
			}
	    	if ((worldIn.getBlockState(pos.down(2)).getBlock() == BlockNelumbo.block))
	    	{
	    		return true;
	    	}
	    	if (!worldIn.isAirBlock(pos) || !worldIn.isAirBlock(pos.up())
	    		|| !worldIn.canSeeSky(pos))
	    	{
	    		return false;
	    	}

	    	return true;
	    	 
	    }
		
		@Override
	    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	    {
	        return net.minecraftforge.common.EnumPlantType.Water;
	    }

	    @Override
	    protected boolean canSustainBush(IBlockState state)
	    {
	        return state.getBlock() == Blocks.WATER || state.getMaterial() == Material.ICE;
	    }

	    public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				//}
			}
	    	return false;
	    }

	}
}
