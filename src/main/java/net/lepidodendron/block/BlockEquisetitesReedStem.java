
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemEquisetitesReedItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
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
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockEquisetitesReedStem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:equisetites_reed_stem")
	public static final Block block = null;
	public BlockEquisetitesReedStem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.equisetites_reed_stem);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("equisetites_reed_stem"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:equisetites_reed_stem", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockPachypteris.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
	public static class BlockCustom extends Block {
	    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_equisetites_reed_stem");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
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
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemEquisetitesReedItem.block, (int) (1));
		}

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        //return this.getDefaultState();
	        return this.getDefaultState();
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

		@Override
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

	    @Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL});
	    }
	    
		@Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    @SideOnly(Side.CLIENT)
	    @Override
	    public BlockRenderLayer getRenderLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    @Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing facing)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	
		    	
			super.onBlockAdded(world, pos, state);
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

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Remove the upper block(s) and propagate full destruction:
			worldIn.scheduleUpdate(pos.up(2), BlockEquisetitesReed.block, 1);
			if (worldIn.getBlockState(pos.down()).getBlock() == this) {
				worldIn.destroyBlock(pos.down(), true);
			}
			if (worldIn.getBlockState(pos.up()).getBlock() == this) {
				worldIn.destroyBlock(pos.up(), true);
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
			int colWater = 1;
			boolean isAir = false;
	    	while (colWater < 5 && isWaterBlock(worldIn, pos.up(colWater))) {
	    		//Check the water column:
	    		if (worldIn.isAirBlock(pos.up(colWater + 1))
	    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockEquisetitesReed.block)
	    		{
	    			isAir = true;
	    		}
	    		colWater = colWater + 1;
	    	}
	    	if (!isAir) {return false;}

	        if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
	        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
					|| (worldIn.getBlockState(pos.down()).getBlock() == this))
				) {
	        		return true;
	        	}
	        return false;
	    }

	    @Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
			if (!this.canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, true);
			}
		}

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

	}
}
