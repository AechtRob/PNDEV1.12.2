
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNypaShootPlaceable extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nypa_shoot")
	public static final Block block = null;
	public BlockNypaShootPlaceable(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nypa_shoot);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("nypa_shoot"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:nypa_shoot", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}


	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:nypa_sapling", BlockNypaShootPlaceable.block);
		OreDictionary.registerOre("plantPrehistoric", BlockNypaShootPlaceable.block);
		OreDictionary.registerOre("plant", BlockNypaShootPlaceable.block);
		OreDictionary.registerOre("treeLeaves", BlockNypaShootPlaceable.block);
		OreDictionary.registerOre("leavesPalm", BlockNypaShootPlaceable.block);
	}

	public static final PropertyBool VAR = PropertyBool.create("var");

	public static class BlockCustom extends BlockLeaves implements IAdvancementGranter {
		
		public static final PropertyDirection FACING = BlockHorizontal.FACING;
		
		public BlockCustom() {
			super();
			setTranslationKey("pf_nypa_shoot");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(VAR, false).withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_NYPA;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			boolean boolVar = false;
			if ((double) (pos.getX() + pos.getZ())/3 == (int) (pos.getX() + pos.getZ())/3) {
				boolVar = true;
			}
			return state.withProperty(VAR, boolVar);
		}

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockNypaShootPlaceable.block, (int) (1)));
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VAR,CHECK_DECAY, DECAYABLE});
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
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockNypaShootPlaceable.block, (int) (1));
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
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Drop air and use the spores method instead:
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockNypaSapling.block);
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
        public ItemStack getSilkTouchDrop(IBlockState state)  {
            return new ItemStack(BlockNypaShootPlaceable.block, (int) (1));
        }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			Block block = world.getBlockState(pos.up()).getBlock();
			if (block != BlockNypaShoot02.block
				&& block != BlockNypaShoot02Fruiting.block) {
				world.setBlockToAir(pos);
				
				//Small chance of an additional sapling:
				if ((Math.random() > 0.8) && (!LepidodendronConfig.doPropagation)) {
					//Spawn another sapling:
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockNypaSapling.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
		}

		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			
			boolean TreeCheck = true;
			//Check there is space:
			int xx = 0;
			int zz = 0;
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!worldIn.isAirBlock(pos.add(xx, 0, zz)) && (!(xx == 0 && zz == 0))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!worldIn.isAirBlock(pos.add(xx, 1, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!worldIn.isAirBlock(pos.add(xx, 2, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!worldIn.isAirBlock(pos.add(xx, 3, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
			xx = -1;
			while (xx <= 1) {
				zz = -1;
				while (zz <= 1) {
					if (!worldIn.isAirBlock(pos.add(xx, 4, zz))) {
						TreeCheck = false;
					}
					zz ++;
				}
				xx ++;
			}
	        return super.canPlaceBlockAt(worldIn, pos) && TreeCheck;
	    }

	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
			world.setBlockState(pos.up(), BlockNypaShoot02.block.getDefaultState(), 3);
			world.setBlockState(pos.up(2), BlockNypaShoot03.block.getDefaultState(), 3);
			world.setBlockState(pos.up(3), BlockNypaShoot04.block.getDefaultState(), 3);
			world.setBlockState(pos.up(4), BlockNypaShoot05.block.getDefaultState(), 3);

			//perpendiulars:
			world.setBlockState((pos).north(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west(), BlockNypaShootSide.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north(), BlockNypaShootSideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(), BlockNypaShoot02Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(), BlockNypaShoot02SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(2), BlockNypaShoot03Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(2), BlockNypaShoot03SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(3), BlockNypaShoot04Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(3), BlockNypaShoot04SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);

			//perpendiulars:
			world.setBlockState((pos).north().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().up(4), BlockNypaShoot05Side.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);
			//diagonals:
			world.setBlockState((pos).north().east().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.NORTH), 3);
			world.setBlockState((pos).south().west().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.SOUTH), 3);
			world.setBlockState((pos).east().south().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.EAST), 3);
			world.setBlockState((pos).west().north().up(4), BlockNypaShoot05SideCorner.block.getDefaultState().withProperty(FACING, EnumFacing.WEST), 3);



			super.onBlockAdded(world, pos, state);
			
	    }

	   	@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
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
