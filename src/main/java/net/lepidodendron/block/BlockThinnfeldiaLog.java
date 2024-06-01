
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockThinnfeldiaLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:thinnfeldia_log")
	public static final Block block = null;
	public BlockThinnfeldiaLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.thinnfeldia_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("thinnfeldia_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:thinnfeldia_log", "inventory"));

	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:thinnfeldia_sapling", BlockThinnfeldiaLog.block);
		OreDictionary.registerOre("logWood", BlockThinnfeldiaLog.block);
	}

	public static class BlockCustom extends Block implements IAdvancementGranter {

	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool DOWN = PropertyBool.create("down");
	public static final PropertyBool LEAVESDOWN = PropertyBool.create("leavesdown");
    public static final PropertyBool LEAVESUP = PropertyBool.create("leavesup");
	public static final PropertyBool LEAVESNORTH = PropertyBool.create("leavesnorth");
	public static final PropertyBool LEAVESEAST = PropertyBool.create("leaveseast");
	public static final PropertyBool LEAVESSOUTH = PropertyBool.create("leavessouth");
	public static final PropertyBool LEAVESWEST = PropertyBool.create("leaveswest");

    	public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_thinnfeldia_log");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			
        	this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(UP, Boolean.valueOf(false)).withProperty(DOWN, Boolean.valueOf(false)).withProperty(LEAVESDOWN, Boolean.valueOf(false)).withProperty(LEAVESUP, Boolean.valueOf(false)).withProperty(LEAVESNORTH, Boolean.valueOf(false)).withProperty(LEAVESEAST, Boolean.valueOf(false)).withProperty(LEAVESSOUTH, Boolean.valueOf(false)).withProperty(LEAVESWEST, Boolean.valueOf(false)));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_THINNFELDIA;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 5;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.down()).getBlock();
	        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();

			Boolean leavesblock = false;
			Boolean leavesblock1 = false;
			Boolean leavesblock2 = false;
			Boolean leavesblock3 = false;
			Boolean leavesblock4 = false;
			Boolean leavesblock5 = false;
			Boolean leavesattacheddown = false;
			Boolean leavesattachedup = false;
			Boolean leavesattachednorth = false;
			Boolean leavesattachedeast = false;
			Boolean leavesattachedsouth = false;
			Boolean leavesattachedwest = false;

			if (block == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.down()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.DOWN) {
					leavesattacheddown = true;
					leavesblock = true;
				}
			}
			if (block == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.down()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.DOWN) {
					leavesattacheddown = true;
					leavesblock = true;
				}
			}

			if (block1 == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.up()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.UP) {
					leavesattachedup = true;
					leavesblock1 = true;
				}
			}
			if (block1 == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.up()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.UP) {
					leavesattachedup = true;
					leavesblock1 = true;
				}
			}

			if (block2 == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.north()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.NORTH) {
					leavesattachednorth = true;
					leavesblock2 = true;
				}
			}
			if (block2 == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.north()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.NORTH) {
					leavesattachednorth = true;
					leavesblock2 = true;
				}
			}

			if (block3 == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.east()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.EAST) {
					leavesattachedeast = true;
					leavesblock3 = true;
				}
			}
			if (block3 == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.east()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.EAST) {
					leavesattachedeast = true;
					leavesblock3 = true;
				}
			}

			if (block4 == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.south()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.SOUTH) {
					leavesattachedsouth = true;
					leavesblock4 = true;
				}
			}
			if (block4 == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.south()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.SOUTH) {
					leavesattachedsouth = true;
					leavesblock4 = true;
				}
			}

			if (block5 == BlockThinnfeldiaShoot.block) {
				if (worldIn.getBlockState(pos.west()).getValue(BlockThinnfeldiaShoot.BlockCustom.FACING) == EnumFacing.WEST) {
					leavesattachedwest = true;
					leavesblock5 = true;
				}
			}
			if (block5 == BlockThinnfeldiaShootPlaceable.block) {
				if (worldIn.getBlockState(pos.west()).getValue(BlockThinnfeldiaShootPlaceable.BlockCustom.FACING) == EnumFacing.WEST) {
					leavesattachedwest = true;
					leavesblock5 = true;
				}
			}

	        return state.withProperty(DOWN, Boolean.valueOf(block == this || (block != Blocks.AIR && worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID || leavesblock))).withProperty(UP, Boolean.valueOf(block1 == this || leavesblock1)).withProperty(NORTH, Boolean.valueOf(block2 == this || leavesblock2)).withProperty(EAST, Boolean.valueOf(block3 == this || leavesblock3)).withProperty(SOUTH, Boolean.valueOf(block4 == this || leavesblock4)).withProperty(WEST, Boolean.valueOf(block5 == this || leavesblock5))
					.withProperty(LEAVESDOWN, leavesattacheddown).withProperty(LEAVESUP, leavesattachedup).withProperty(LEAVESNORTH, leavesattachednorth).withProperty(LEAVESEAST, leavesattachedeast).withProperty(LEAVESSOUTH, leavesattachedsouth).withProperty(LEAVESWEST, leavesattachedwest);
	    }

	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        state = state.getActualState(source, pos);
	        float f = 0.1875F;
	        float f1 = ((Boolean)state.getValue(WEST)).booleanValue() ? 0.0F : 0.1875F;
	        float f2 = ((Boolean)state.getValue(DOWN)).booleanValue() ? 0.0F : 0.1875F;
	        float f3 = ((Boolean)state.getValue(NORTH)).booleanValue() ? 0.0F : 0.1875F;
	        float f4 = ((Boolean)state.getValue(EAST)).booleanValue() ? 1.0F : 0.8125F;
	        float f5 = ((Boolean)state.getValue(UP)).booleanValue() ? 1.0F : 0.8125F;
	        float f6 = ((Boolean)state.getValue(SOUTH)).booleanValue() ? 1.0F : 0.8125F;
	        return new AxisAlignedBB((double)f1, (double)f2, (double)f3, (double)f4, (double)f5, (double)f6);
	    }
	
	    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
	    {
	        if (!isActualState)
	        {
	            state = state.getActualState(worldIn, pos);
	        }
	
	        float f = 0.1875F;
	        float f1 = 0.8125F;
	        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.8125D, 0.8125D));
	
	        if (((Boolean)state.getValue(WEST)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0D, 0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.8125D));
	        }
	
	        if (((Boolean)state.getValue(EAST)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.8125D, 0.1875D, 0.1875D, 1.0D, 0.8125D, 0.8125D));
	        }
	
	        if (((Boolean)state.getValue(UP)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875D, 0.8125D, 0.1875D, 0.8125D, 1.0D, 0.8125D));
	        }
	
	        if (((Boolean)state.getValue(DOWN)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.1875D, 0.8125D));
	        }
	
	        if (((Boolean)state.getValue(NORTH)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875D, 0.1875D, 0.0D, 0.8125D, 0.8125D, 0.1875D));
	        }
	
	        if (((Boolean)state.getValue(SOUTH)).booleanValue())
	        {
	            addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.1875D, 0.1875D, 0.8125D, 0.8125D, 0.8125D, 1.0D));
	        }
	    }
	
	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
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
	
	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, SOUTH, WEST, UP, DOWN, LEAVESDOWN, LEAVESUP, LEAVESNORTH, LEAVESEAST, LEAVESSOUTH, LEAVESWEST});
	    }

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override public boolean isWood(IBlockAccess world, BlockPos pos){
				return true;
			}

		//@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
	    {
	        int i = 4;
	        int j = 5;
	
	        if (worldIn.isAreaLoaded(pos.add(-5, -5, -5), pos.add(5, 5, 5)))
	        {
	            for (BlockPos blockpos : BlockPos.getAllInBox(pos.add(-4, -4, -4), pos.add(4, 4, 4)))
	            {
	                IBlockState iblockstate = worldIn.getBlockState(blockpos);
	
	                if (iblockstate.getBlock().isLeaves(iblockstate, worldIn, blockpos))
	                {
	                    iblockstate.getBlock().beginLeavesDecay(iblockstate, worldIn, blockpos);
	                }
	            }
	        }
	    }

	    @Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
        
    }

}
