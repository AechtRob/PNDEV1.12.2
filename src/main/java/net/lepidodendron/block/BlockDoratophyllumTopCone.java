
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemDoratophyllumCone;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
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
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDoratophyllumTopCone extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:doratophyllum_top_cone")
	public static final Block block = null;
	public BlockDoratophyllumTopCone(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.doratophyllum_top_cone);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("doratophyllum_top_cone"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:doratophyllum_top_cone", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

//	@Override
//	public void init(FMLInitializationEvent event) {
//		super.init(event);
//		OreDictionary.registerOre("plantdnaPNlepidodendron:doratophyllum_top_cone", BlockDoratophyllumTop.block);
//		OreDictionary.registerOre("plantPrehistoric", BlockDoratophyllumTop.block);
//		OreDictionary.registerOre("plant", BlockDoratophyllumTop.block);
//	}


	public static final PropertyBool VAR = PropertyBool.create("var");
	
	public static class BlockCustom extends BlockLeaves implements IAdvancementGranter {
		public BlockCustom() {
			super();
			setTranslationKey("pf_doratophyllum_top_cone");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(VAR, false).withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_DORATOPHYLLUM;
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
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockDoratophyllum.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0,0,0,1,1.5,1);
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
			return NonNullList.withSize(1, new ItemStack(BlockDoratophyllum.block, (int) (1)));
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{VAR, CHECK_DECAY, DECAYABLE});
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
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}
		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockDoratophyllum.block, (int) (1));
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
			if (!LepidodendronConfig.doPropagation) {
				return Item.getItemFromBlock(BlockDoratophyllum.block);
			}
			return Items.AIR;
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
            return new ItemStack(BlockDoratophyllum.block, (int) (1));
        }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			
			Block block = world.getBlockState(pos.down()).getBlock();
			if (block != BlockDoratophyllum.block) {
				world.setBlockToAir(pos);
				
				if (Math.random() > 0.66) {
					if (!world.isRemote) {
						EntityItem entityToSpawn;
						if (!LepidodendronConfig.doPropagation) {
							entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockDoratophyllumTopCone.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}
			}
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

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			//super.updateTick(worldIn, pos, state, rand);
			if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue() && ((Boolean)state.getValue(DECAYABLE)).booleanValue())
			{
				Block block = worldIn.getBlockState(pos.down()).getBlock();
				if (block != BlockDoratophyllum.block) {
					worldIn.setBlockToAir(pos);
					if (!worldIn.isRemote) {
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockDoratophyllum.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
				else if (Math.random()>0.8 && Math.random()>0.8) {
					worldIn.setBlockState(pos, BlockDoratophyllumTop.block.getDefaultState(), 3);
				}
			}

		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if ((!player.capabilities.allowEdit) || (!player.getHeldItemMainhand().isEmpty()) || !LepidodendronConfig.doPropagation)
			{
				return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
			}
			else {
				if (!((hand != player.getActiveHand()) && (hand == EnumHand.MAIN_HAND))) {
					ItemStack stackSeed = new ItemStack(ItemDoratophyllumCone.block, (int) (1));
					stackSeed.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(player, stackSeed);
					if (Math.random() > 0.95) {
						world.destroyBlock(pos, false);
					}
					else {
						world.setBlockState(pos, BlockDoratophyllumTop.block.getDefaultState());
					}
					return true;
				}
				return true;
			}
		}
		
	}
}
