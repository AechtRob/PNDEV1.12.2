
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockZamitesLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:zamites_log")
	public static final Block block = null;
	public BlockZamitesLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.zamites_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("zamites_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:zamites_log", "inventory"));

	}
	public static class BlockCustom extends Block {

	public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool DOWN = PropertyBool.create("down");
    public static final PropertyBool LEAVES = PropertyBool.create("leaves");

    	public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_zamites_log");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			
        	this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(UP, Boolean.valueOf(false)).withProperty(DOWN, Boolean.valueOf(false)).withProperty(LEAVES, Boolean.valueOf(false)));
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
	        
			Boolean leavesattached = false;
			Boolean leavesblock = false;
			Boolean leavesblock1 = false;
			Boolean leavesblock2 = false;
			Boolean leavesblock3 = false;
			Boolean leavesblock4 = false;
			Boolean leavesblock5 = false;

			if ((block == BlockZamitesLeaves.block) || (block == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.down()) == EnumFacing.DOWN) {
						leavesattached = true;
						leavesblock = true;
				}
			}

			if ((block1 == BlockZamitesShoot.block) || (block1 == BlockZamitesShootPlaceable.block)) {
				leavesattached = true;
				leavesblock1 = true;
	    	}
			
			if ((block1 == BlockZamitesLeaves.block) || (block1 == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.up()) == EnumFacing.UP) {
						leavesattached = true;
						leavesblock1 = true;
				}
			}

			if ((block2 == BlockZamitesLeaves.block) || (block2 == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.north()) == EnumFacing.NORTH) {
						leavesattached = true;
						leavesblock2 = true;
				}
			}

			if ((block3 == BlockZamitesLeaves.block) || (block3 == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.east()) == EnumFacing.EAST) {
						leavesattached = true;
						leavesblock3 = true;
				}
			}

			if ((block4 == BlockZamitesLeaves.block) || (block4 == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.south()) == EnumFacing.SOUTH) {
						leavesattached = true;
						leavesblock4 = true;
				}
			}

			if ((block5 == BlockZamitesLeaves.block) || (block5 == BlockZamitesLeavesPlaceable.block)) {
				if (new Object() {
					public EnumFacing getEnumFacing(BlockPos pos1) {
						try {
							IBlockState _bs = worldIn.getBlockState(pos1);
							for (IProperty<?> prop : _bs.getProperties().keySet()) {
								if (prop.getName().equals("facing"))
									return _bs.getValue((PropertyDirection) prop);
							}
							return EnumFacing.NORTH;
						} catch (Exception e) {
							return EnumFacing.NORTH;
						}
					}
				}.getEnumFacing(pos.west()) == EnumFacing.WEST) {
						leavesattached = true;
						leavesblock5 = true;
				}
			}
			
	        return state.withProperty(DOWN, Boolean.valueOf(block == this || leavesblock || block != Blocks.AIR)).withProperty(UP, Boolean.valueOf(block1 == this || leavesblock1)).withProperty(NORTH, Boolean.valueOf(block2 == this || leavesblock2)).withProperty(EAST, Boolean.valueOf(block3 == this || leavesblock3)).withProperty(SOUTH, Boolean.valueOf(block4 == this || leavesblock4)).withProperty(WEST, Boolean.valueOf(block5 == this || leavesblock5)).withProperty(LEAVES, leavesattached);
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
	        return new BlockStateContainer(this, new IProperty[] {NORTH, EAST, SOUTH, WEST, UP, DOWN, LEAVES});
	    }

		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ 
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
