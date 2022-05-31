
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemFrenelopsisFruit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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

@ElementsLepidodendronMod.ModElement.Tag
public class BlockFrenelopsis extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:frenelopsis")
	public static final Block block = null;
	public BlockFrenelopsis(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.frenelopsis);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("frenelopsis"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:frenelopsis", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}
	public static class BlockCustom extends BlockLeaves {

		public BlockCustom() {
			super();
			setTranslationKey("pf_frenelopsis");
			setSoundType(SoundType.PLANT);
			setHardness(0.3F);
			setResistance(0.3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false));
		}

		@Override
		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
			return NULL_AABB;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockFrenelopsis.block, (int) (1)));
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{CHECK_DECAY, DECAYABLE});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(DECAYABLE, (meta & 1) != 0).withProperty(CHECK_DECAY, (meta & 2) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(DECAYABLE))
				i |= 1;
			if ((Boolean) state.getValue(CHECK_DECAY))
				i |= 2;
			return i;
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
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 1;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(ItemFrenelopsisFruit.block, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockFrenelopsis.block);
			}
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
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
				if (Math.random() > 0.66) {
					if (!LepidodendronConfig.doPropagation) {
						//Spawn another sapling:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockFrenelopsis.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					} else {
						//Spawn another cone:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemFrenelopsisFruit.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
			else {
				Block block = world.getBlockState(pos.up()).getBlock();
				if (block != BlockFrenelopsis2.block) {
					world.setBlockToAir(pos);
					if (Math.random() > 0.66) {
						if (!LepidodendronConfig.doPropagation) {
							//Spawn another sapling:
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockFrenelopsis.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						} else {
							//Spawn another cone:
							if (!world.isRemote) {
								EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemFrenelopsisFruit.block, (int) (1)));
								entityToSpawn.setPickupDelay(10);
								world.spawnEntity(entityToSpawn);
							}
						}
					}
				}

			}
			
		}
		
		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
	        return super.canPlaceBlockAt(worldIn, pos)
				&& worldIn.isAirBlock(pos.up())
				&& worldIn.isAirBlock(pos.up(2))
				&& worldIn.isAirBlock(pos.up(3))
				&& worldIn.isAirBlock(pos.north())
				&& worldIn.isAirBlock(pos.north().up())
				&& worldIn.isAirBlock(pos.north().up(2))
				&& worldIn.isAirBlock(pos.north().up(3))
				&& worldIn.isAirBlock(pos.north().east())
				&& worldIn.isAirBlock(pos.north().east().up())
				&& worldIn.isAirBlock(pos.north().east().up(2))
				&& worldIn.isAirBlock(pos.north().east().up(3))
				&& worldIn.isAirBlock(pos.north().west())
				&& worldIn.isAirBlock(pos.north().west().up())
				&& worldIn.isAirBlock(pos.north().west().up(2))
				&& worldIn.isAirBlock(pos.north().west().up(3))
				&& worldIn.isAirBlock(pos.south())
				&& worldIn.isAirBlock(pos.south().up())
				&& worldIn.isAirBlock(pos.south().up(2))
				&& worldIn.isAirBlock(pos.south().up(3))
				&& worldIn.isAirBlock(pos.south().east())
				&& worldIn.isAirBlock(pos.south().east().up())
				&& worldIn.isAirBlock(pos.south().east().up(2))
				&& worldIn.isAirBlock(pos.south().east().up(3))
				&& worldIn.isAirBlock(pos.south().west())
				&& worldIn.isAirBlock(pos.south().west().up())
				&& worldIn.isAirBlock(pos.south().west().up(2))
				&& worldIn.isAirBlock(pos.south().west().up(3))
				&& worldIn.isAirBlock(pos.east())
				&& worldIn.isAirBlock(pos.east().up())
				&& worldIn.isAirBlock(pos.east().up(2))
				&& worldIn.isAirBlock(pos.east().up(3))
				&& worldIn.isAirBlock(pos.west())
				&& worldIn.isAirBlock(pos.west().up())
				&& worldIn.isAirBlock(pos.west().up(2))
				&& worldIn.isAirBlock(pos.west().up(3));
	    }

	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			world.setBlockState(pos.up(), BlockFrenelopsis2.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2), BlockFrenelopsis3.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3), BlockFrenelopsis4.block.getDefaultState(), 3);

			world.setBlockState(pos.north(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.south(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.west(), BlockFrenelopsisSide1.block.getDefaultState(),3);

			world.setBlockState(pos.north().east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.north().west(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.south().east(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			world.setBlockState(pos.south().west(), BlockFrenelopsisSide1.block.getDefaultState(), 3);
			
			world.setBlockState((pos.up()).north(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState((pos.up()).south(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState((pos.up()).east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState((pos.up()).west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);

			world.setBlockState(pos.up().north().east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState(pos.up().north().west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState(pos.up().south().east(), BlockFrenelopsisSide2.block.getDefaultState(), 3);
			world.setBlockState(pos.up().south().west(), BlockFrenelopsisSide2.block.getDefaultState(), 3);

			world.setBlockState((pos.up(2)).north(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState((pos.up(2)).south(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState((pos.up(2)).east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState((pos.up(2)).west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);

			world.setBlockState(pos.up(2).north().east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2).north().west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2).south().east(), BlockFrenelopsisSide3.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2).south().west(), BlockFrenelopsisSide3.block.getDefaultState(), 3);

			world.setBlockState((pos.up(3)).north(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState((pos.up(3)).south(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState((pos.up(3)).east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState((pos.up(3)).west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);

			world.setBlockState(pos.up(3).north().east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3).north().west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3).south().east(), BlockFrenelopsisSide4.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3).south().west(), BlockFrenelopsisSide4.block.getDefaultState(), 3);

			super.onBlockAdded(world, pos, state);
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Conifer");
	        	tooltip.add("Periods: Jurassic - Cretaceous");
	        	tooltip.add("Propagation: fruit/cone");}
	        super.addInformation(stack, player, tooltip, advanced);
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
	    
	}
}