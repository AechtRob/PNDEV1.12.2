
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPachypteris extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:pachypteris")
	public static final Block block = null;
	public BlockPachypteris(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.pachypteris);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("pachypteris"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:pachypteris", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockPachypteris.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	public static final PropertyBool DEEP = PropertyBool.create("deep");
	
	public static class BlockCustom extends SeedSporeBlockBase {
	    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_weichselia");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(DEEP,false));
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
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
	    public IBlockState getStateFromMeta(int meta)
	    {
	        //return this.getDefaultState();
	        return this.getDefaultState().withProperty(DEEP, meta==1);
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
			int i = 0;
	        if (((Boolean)state.getValue(DEEP)).booleanValue())
	        {
	            i = 1;
	        }
	        return i;
	    }

	    @Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL,DEEP});
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
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.0D, 0D, 0D, 1D, 2D, 1D);
		}

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	if (isWaterBlock(world, pos.up()) && isWaterBlock(world, pos) && isWaterBlock(world, pos.up(2))
	        	&& (world.isAirBlock(pos.up(3)))
	        	&& (((world.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (world.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (world.getBlockState(pos.down()).getMaterial() == Material.CLAY)))
				) { //Vary the heights:
					//System.err.println("Large");
					if (Math.random() > 0.66) {
	        			world.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
					}
					else {
						if ((Math.random() > 0.5) && (world.isAirBlock(pos.up(4)))) {
							world.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
							world.setBlockState(pos.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
						}
						else {
							if ((world.isAirBlock(pos.up(5))) && (world.isAirBlock(pos.up(4)))) {
								world.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(pos.up(4), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(pos.up(5), BlockPachypterisTop.block.getDefaultState(), 3);
							}
							else {
								world.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
							}
						}
					}
	        	}
	        	
		    if (isWaterBlock(world, pos.up()) && isWaterBlock(world, pos)
	        	&& (world.isAirBlock(pos.up(2)))
	        	&& (((world.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (world.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (world.getBlockState(pos.down()).getMaterial() == Material.CLAY)))
				) { //Vary the heights:
					if (Math.random() > 0.66) {
	        			world.setBlockState(pos.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
					}
					else {
						if ((Math.random() > 0.5) && (world.isAirBlock(pos.up(3)))) {
							world.setBlockState(pos.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
							world.setBlockState(pos.up(3), BlockPachypterisTop.block.getDefaultState(), 3);
						}
						else {
							if ((world.isAirBlock(pos.up(4))) && (world.isAirBlock(pos.up(3)))) {
								world.setBlockState(pos.up(2), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(pos.up(3), BlockPachypterisStem.block.getDefaultState(), 3);
								world.setBlockState(pos.up(4), BlockPachypterisTop.block.getDefaultState(), 3);
							}
							else {
								world.setBlockState(pos.up(2), BlockPachypterisTop.block.getDefaultState(), 3);
							}
						}
					}
	        	}
		    	
			super.onBlockAdded(world, pos, state);
	    }

	    @Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {

			if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos) && isWaterBlock(worldIn, pos.up(2))
        	&& (worldIn.isAirBlock(pos.up(3)))
        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
				|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
				|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY)))
			) {
        		return this.getDefaultState().withProperty(DEEP, true);
        	}

			return this.getDefaultState().withProperty(DEEP, false);
			
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
			//Remove the upper block(s):
			if ((!state.getValue(DEEP)) && 
				((worldIn.getBlockState(pos.up(2)).getBlock() == BlockPachypterisTop.block)
				|| (worldIn.getBlockState(pos.up(2)).getBlock() == BlockPachypterisStem.block))
				) {
				worldIn.destroyBlock(pos.up(2), false);
			}
			if ((state.getValue(DEEP)) && 
				((worldIn.getBlockState(pos.up(3)).getBlock() == BlockPachypterisTop.block)
				|| (worldIn.getBlockState(pos.up(3)).getBlock() == BlockPachypterisStem.block))
				) {
				worldIn.destroyBlock(pos.up(3), false);
			}
			//Chance of a second drop:
			if (Math.random() >= 0.7 && !LepidodendronConfig.doPropagation) {
				if (!worldIn.isRemote) {
					EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					worldIn.spawnEntity(entityToSpawn);
				}
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	    	//System.err.println("Can place");
	    	
	        if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos) && isWaterBlock(worldIn, pos.up(2))
	        	&& (worldIn.isAirBlock(pos.up(3)) || (worldIn.getBlockState(pos.up(3)).getBlock() == BlockPachypterisTop.block) || (worldIn.getBlockState(pos.up(3)).getBlock() == BlockPachypterisStem.block))
	        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
					|| (
						((worldIn.getBlockState(pos.down(2)).getMaterial() == Material.SAND)
						|| (worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GROUND)
						|| (worldIn.getBlockState(pos.down(2)).getMaterial() == Material.CLAY))
						&& isWaterBlock(worldIn, pos.down())
						)
					)
				) {
	        		return true;
	        	}
	        if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
	        	&& (worldIn.isAirBlock(pos.up(2)) || (worldIn.getBlockState(pos.up(2)).getBlock() == BlockPachypterisTop.block) || (worldIn.getBlockState(pos.up(2)).getBlock() == BlockPachypterisStem.block))
	        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
					|| (
						((worldIn.getBlockState(pos.down(2)).getMaterial() == Material.SAND)
						|| (worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GROUND)
						|| (worldIn.getBlockState(pos.down(2)).getMaterial() == Material.CLAY))
						&& isWaterBlock(worldIn, pos.down())
						)
					)
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


		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Water Tree-Fern");
	        	tooltip.add("Periods: Jurassic - Cretaceous");
	        	tooltip.add("Note: planted under water");
	        	tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public Block planted() {
			return BlockPachypteris.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}
