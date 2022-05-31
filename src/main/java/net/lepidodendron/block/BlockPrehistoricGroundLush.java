
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;



@ElementsLepidodendronMod.ModElement.Tag
public class BlockPrehistoricGroundLush extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lush_prehistoric_ground_cover")
	public static final Block block = null;
	public BlockPrehistoricGroundLush(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lush_prehistoric_ground_cover);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lush_prehistoric_ground_cover"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lush_prehistoric_ground_cover", "inventory"));
	}

	public static final PropertyBool SNOWY = PropertyBool.create("snowy");
	
	public static class BlockCustom extends Block implements IGrowable, ISustainsPlantType {
		public BlockCustom() {
			super(Material.GROUND);
			setTranslationKey("pf_dirt_lush_prehistoric_ground_cover");
			setSoundType(SoundType.PLANT);
        	setDefaultState(this.blockState.getBaseState().withProperty(SNOWY, Boolean.valueOf(false)));
        	setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
			setHarvestLevel("shovel", 0);
			setHardness(0.5F);
			setResistance(0.5F);
        	//useNeighborBrightness = true;
		}

		@Override    
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.up()).getBlock();
	        return state.withProperty(SNOWY, Boolean.valueOf(block == Blocks.SNOW || block == Blocks.SNOW_LAYER));
	    }

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
			if (plantable == Blocks.MELON_STEM || plantable == Blocks.PUMPKIN_STEM)
			{
				return true;
			}
			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
			if (canSustainPlantType(world, pos, plantType)) {
				return true;
			}
			return super.canSustainPlant(state, world, pos, direction, plantable);
		}

		public boolean canSustainPlantType(IBlockAccess world, BlockPos pos, EnumPlantType plantType)
		{

			// Note: EnumPlantType will be changed at runtime by other mods using a Forge functionality.
			//       switch() does NOT work with enums in that case, but will crash when encountering
			//       a value not known beforehand.

			// support plains and cave plants
			if (plantType == EnumPlantType.Plains || plantType == EnumPlantType.Cave)
			{
				return true;
			}
			// support beach plants if there's water alongside
			if (plantType == EnumPlantType.Beach)
			{
				return (
						world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.south()).getMaterial() == Material.WATER
				);
			}
			// don't support nether plants, water plants, or crops (require farmland), or anything else by default
			return false;
		}


	    @Override
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (!worldIn.isAreaLoaded(pos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
	            if (((worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2))
	            	)
	            {
	                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
	            }
	            else
	            {
	                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
	                {
	                    for (int i = 0; i < 4; ++i)
	                    {
	                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(3) - 1, rand.nextInt(3) - 1);
	
	                        if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
	                        {
	                            return;
	                        }
	
	                        IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
	                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos);
	
	                        if (
								(
								(iblockstate1.getBlock() == Blocks.DIRT && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT)
								|| (iblockstate1.getBlock() == BlockSandyDirt.block)
								|| (iblockstate1.getBlock() == BlockSandyDirtPangaean.block)
								|| (iblockstate1.getBlock() == BlockSandyDirtRed.block)
								|| (iblockstate1.getBlock() == BlockSiltyDirt.block)
								)
								&& (worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2)
								)
	                        {
	                            worldIn.setBlockState(blockpos, BlockPrehistoricGroundLush.block.getDefaultState());
	                        }
	                    }
	                }
	            }
	        }
	    }

	    @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getRenderLayer()
	   	{
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }
	
	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

		@Override
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {SNOWY});
	    }

		@Override
		public boolean isOpaqueCube(IBlockState state)
	    {
	        return true;
	    }

	    @Override
		public boolean isFullBlock(IBlockState state)
	    {
	        return true;
	    }
	    
	    @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.DIRT, (int) (1), 0));
			if (Math.random() > 0.05) {
			drops.add(new ItemStack(BlockPrehistoricGroundCoverPlantsLush.block, (int) (1), 0));
	        }
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }
	    
	    @Override
	    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
	    {
	        return true;
	    }

		@Override
	    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	        return true;
	    }
	    
		@Override
	    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
	    {
	        BlockPos blockpos = pos.up();
	
	        for (int i = 0; i < 128; ++i)
	        {
	            BlockPos blockpos1 = blockpos;
	            int j = 0;
	
	            while (true)
	            {
	                if (j >= i / 16)
	                {
	                    if (worldIn.isAirBlock(blockpos1))
	                    {

                            IBlockState iblockstate1 = BlockPrehistoricGroundCoverPlantsLush.block.getDefaultState();

                            if (worldIn.getBlockState(blockpos1.down()).getBlock() == this)
                            {
                                worldIn.setBlockState(blockpos1, iblockstate1, 3);
                            }

	                    }
	
	                    break;
	                }
	
	                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
	
	                if (worldIn.getBlockState(blockpos1.down()).getBlock() != this || worldIn.getBlockState(blockpos1).isNormalCube())
	                {
	                    break;
	                }
	
	                ++j;
	            }
	        }
	    }
	    
	}
}
