
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.*;
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
public class BlockCalamitesBranch extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:calamites_branch")
	public static final Block block = null;
	public BlockCalamitesBranch(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.calamites_branch);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("calamites_branch"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:calamites_branch", "inventory"));
	}
	public static class BlockCustom extends Block {

		public static final PropertyBool NORTH = PropertyBool.create("north");
	    public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool UP = PropertyBool.create("up");
	    public static final PropertyBool DOWN = PropertyBool.create("down");
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		
		public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_calamites_branch");
			setSoundType(SoundType.PLANT);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, false).withProperty(EAST, false).withProperty(SOUTH, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(FACING, EnumFacing.DOWN));
			//setTickRandomly(true);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
			
	    	Block block = worldIn.getBlockState(pos.down()).getBlock();
	        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();
	        
			Boolean Tjoin = false;
			Boolean Tjoin1 = false;
			Boolean Tjoin2 = false;
			Boolean Tjoin3 = false;
			Boolean Tjoin4 = false;
			Boolean Tjoin5 = false;

			//If we are facing UD then we can join *to* NSEW blocks:
			if (((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP)
				|| ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN))
			{
				if (block2 == this)
				{
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
						Tjoin2 = true;
					}
				}
				
				if (block3 == this)
				{
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
						Tjoin3 = true;
					}
				}
				
				if (block4 == this)
				{
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
						Tjoin4 = true;
					}
				}
				
				if (block5 == this)
				{
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
						Tjoin5 = true;
					}
				}
			}
			
			//If we are facing EW then we can join *to* NSUD blocks:
			if (((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST)
				|| ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST))
			{
				if (block2 == this)
				{
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
						Tjoin2 = true;
					}
				}
				
				if (block == this)
				{
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
						Tjoin = true;
					}
				}
				
				if (block4 == this)
				{
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
						Tjoin4 = true;
					}
				}
				
				if (block1 == this)
				{
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
						Tjoin1 = true;
					}
				}
			}

			
			//If we are facing NS then we can join *to* UDEW blocks:
			if (((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH)
				|| ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH))
			{
				if (block == this)
				{
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
						Tjoin = true;
					}
				}
				
				if (block3 == this)
				{
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
						Tjoin3 = true;
					}
				}
				
				if (block1 == this)
				{
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
						Tjoin1 = true;
					}
				}
				
				if (block5 == this)
				{
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
						Tjoin5 = true;
					}
				}
			}
			
	        return state.withProperty(DOWN, Tjoin).withProperty(UP, Tjoin1).withProperty(NORTH, Tjoin2).withProperty(EAST, Tjoin3).withProperty(SOUTH, Tjoin4).withProperty(WEST, Tjoin5);
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
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (source instanceof World)
	        {
	            state = state.getActualState(source, pos);
	        }
	        switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					return new AxisAlignedBB(0.25D, 0.25D, 0D, 0.75D, 0.75D, 1D);
				case NORTH :
					return new AxisAlignedBB(0.25D, 0.25D, 1D, 0.75D, 0.75D, 0D);
				case WEST :
					return new AxisAlignedBB(1D, 0.25D, 0.25D, 0D, 0.75D, 0.75D);
				case EAST :
					return new AxisAlignedBB(0D, 0.25D, 0.25D, 1D, 0.75D, 0.75D);
				case UP :
					return new AxisAlignedBB(0.25D, 0D, 0.75D, 0.75D, 1D, 0.25D);
				case DOWN :
					return new AxisAlignedBB(0.25D, 1D, 0.75D, 0.75D, 0D, 0.25D);
			}
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState)
		{	

	            state = state.getActualState(worldIn, pos);
	        
				switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.25D, 0.25D, 0D, 0.75D, 0.75D, 1D));
				case NORTH :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.25D, 0.25D, 1D, 0.75D, 0.75D, 0D));
				case WEST :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(1D, 0.25D, 0.25D, 0D, 0.75D, 0.75D));
				case EAST :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0D, 0.25D, 0.25D, 1D, 0.75D, 0.75D));
				case UP :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.25D, 0D, 0.75D, 0.75D, 1.5D, 0.25D));
				case DOWN :
					addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.25D, 1.5D, 0.75D, 0.75D, 0D, 0.25D));
			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{NORTH, EAST, SOUTH, WEST, UP, DOWN, FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
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
			return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
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

			//Propagate the destruction if we have actually broken it (rather than a world-gen type replace event):
			if (worldIn.isAirBlock(pos)) {
				Block block = worldIn.getBlockState(pos.down()).getBlock();
				Block block1 = worldIn.getBlockState(pos.up()).getBlock();
				Block block2 = worldIn.getBlockState(pos.north()).getBlock();
				Block block3 = worldIn.getBlockState(pos.east()).getBlock();
				Block block4 = worldIn.getBlockState(pos.south()).getBlock();
				Block block5 = worldIn.getBlockState(pos.west()).getBlock();

				if (block == this) {
					worldIn.destroyBlock(pos.down(), true);
				}
				if (block1 == this) {
					worldIn.destroyBlock(pos.up(), true);
				}
				if (block2 == this) {
					worldIn.destroyBlock(pos.north(), true);
				}
				if (block3 == this) {
					worldIn.destroyBlock(pos.east(), true);
				}
				if (block4 == this) {
					worldIn.destroyBlock(pos.south(), true);
				}
				if (block5 == this) {
					worldIn.destroyBlock(pos.west(), true);
				}
			}

	    }
	    
 		//@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			//System.err.println("Neighbour changed!");
			
			if ((world.isAirBlock(pos.down())) && (fromPos.getY() == pos.getY()-1)
				&& (
					(((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP)
					//|| (EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN)
					)
				))
				world.destroyBlock(pos, true);

			if ((world.isAirBlock(pos.up())) && (fromPos.getY() == pos.getY()+1)
				&& (
					(((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN)
					//|| (EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN)
					)
				))
				world.destroyBlock(pos, true);

			if ((world.isAirBlock(pos.north())) && (fromPos.getZ() == pos.getZ()-1)
				&& ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH)
				)
				world.destroyBlock(pos, true);

			if ((world.isAirBlock(pos.south())) && (fromPos.getZ() == pos.getZ()+1)
				&& ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH)
				)
				world.destroyBlock(pos, true);

			if ((world.isAirBlock(pos.east())) && (fromPos.getX() == pos.getX()+1)
				&& ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST)
				)
				world.destroyBlock(pos, true);

			if ((world.isAirBlock(pos.west())) && (fromPos.getX() == pos.getX()-1)
				&& ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST)
				)
				world.destroyBlock(pos, true);
				
		}
		    
		@Override
		public boolean canSustainLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Override public boolean isWood(net.minecraft.world.IBlockAccess world, BlockPos pos){ 
				return true;
			}
			
	}
}
