
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeBlockBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
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
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLiverwort extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:liverwort")
	public static final Block block = null;
	public BlockLiverwort(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.liverwort);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("liverwort"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:liverwort", "inventory"));
		}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:liverwort", BlockLiverwort.block);
		OreDictionary.registerOre("plantPrehistoric", BlockLiverwort.block);
		OreDictionary.registerOre("plant", BlockLiverwort.block);
	}

	public static class BlockCustom extends SeedSporeBlockBase implements net.minecraftforge.common.IShearable, IAdvancementGranter {

		public static final PropertyBool NORTH = PropertyBool.create("north");
   		public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool SPREADABLE = PropertyBool.create("spreadable");
    
		public BlockCustom() {
			super(Material.VINE);
			setTranslationKey("pf_liverwort");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(SPREADABLE, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_LIVERWORT;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();

	        return state.withProperty(NORTH, block2 == this).withProperty(EAST, block3 == this).withProperty(SOUTH, block4 == this).withProperty(WEST, block5 == this);
	    }

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
												EntityLivingBase placer) {
			return this.getDefaultState();
		}
			
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
		}
	
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
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
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{NORTH, SOUTH, EAST, WEST, SPREADABLE});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			if (meta == 1) {
				return this.getDefaultState().withProperty(SPREADABLE, true);
			}
			return this.getDefaultState().withProperty(SPREADABLE, false);
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			if (state.getValue(SPREADABLE)) {
				return 1;
			}
			return 0;
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
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			if (!world.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light

			IBlockState iblockstate = world.getBlockState(pos.down());
			if (world.isAirBlock(pos.down()) ||
				(
					(iblockstate.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID
							&& iblockstate.getMaterial() != Material.WOOD
							&& iblockstate.getMaterial() != Material.SAND
							&& iblockstate.getMaterial() != Material.CLAY
							&& iblockstate.getMaterial() != Material.GRASS
							&& iblockstate.getMaterial() != Material.GROUND
							&& iblockstate.getMaterial() != Material.ROCK)
					&& (!iblockstate.getBlock().isLeaves(iblockstate, world, pos.down()))
					&& (iblockstate.getMaterial() != Material.WATER)
				)
			)
				{
					world.setBlockToAir(pos);
					EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}

		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light

			//Check if it is still connected:
			IBlockState iblockstate = worldIn.getBlockState(pos.down());
			if (worldIn.isAirBlock(pos.down()) ||
				(
					(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID
							&& iblockstate.getMaterial() != Material.WOOD
							&& iblockstate.getMaterial() != Material.SAND
							&& iblockstate.getMaterial() != Material.CLAY
							&& iblockstate.getMaterial() != Material.GRASS
							&& iblockstate.getMaterial() != Material.GROUND
							&& iblockstate.getMaterial() != Material.ROCK)
					&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()))
					&& (iblockstate.getMaterial() != Material.WATER)
				)
			) {
				worldIn.setBlockToAir(pos);
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}

			//So if the block is still here, can it spread?
			if ((worldIn.getBlockState(pos).getBlock() == this && Math.random() > 0.8)) {
				if ((Boolean) state.getValue(SPREADABLE)) {
					//System.err.println("Ticked a spreadable block");
					int spreadradius = (int) LepidodendronConfigPlants.radiusNematophyta;
					if (spreadradius < 0) {spreadradius = 0;}
					if (spreadradius > 8) {spreadradius = 8;}

					boolean gen = false;
					int xct = -spreadradius;
					while (xct <= spreadradius && !gen) {
						int zct = -spreadradius;
						while (zct <= spreadradius && !gen) {
							if (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) spreadradius, 2)) {
								//Within radius:
								BlockPos pos1 = pos.add(xct, -1, zct);
								if (!worldIn.isAreaLoaded(pos1, pos1)) {
									return;
								}
								//Is there air here and is this face flat?
								if ((worldIn.isAirBlock(pos1.up()))
									&& (canPlaceBlockOnSide (worldIn, pos1.up(), EnumFacing.UP))
									) {
									//Is there moss suitably placed to spread here?
									if (worldIn.getBlockState(pos1.north().up()).getBlock() == this)
									{
										gen = true;
									}
									if (worldIn.getBlockState(pos1.south().up()).getBlock() == this)
									{
										gen = true;
									}
									if (worldIn.getBlockState(pos1.east().up()).getBlock() == this)
									{
										gen = true;
									}
									if (worldIn.getBlockState(pos1.west().up()).getBlock() == this)
									{
										gen = true;
									}

									if (gen) {
										//Place the moss:
										worldIn.setBlockState(pos1.up(), this.blockState.getBaseState().withProperty(SPREADABLE, false), 3);
									}
								}
							}
							zct = zct + 1;
						}
						xct = xct + 1;
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
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			if (!world.isAirBlock(pos)) {
				return false;
			}
			return super.canPlaceBlockAt(world, pos); 
		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	    {
	    	boolean blockface  = true;
			if (side == EnumFacing.NORTH) {
	        	//if (worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.SOUTH) {
	        	//if (worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.EAST) {
	        	//if (worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.WEST) {
	        	//if (worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.UP) {
	        	if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID) {
					blockface = false;
				}
				if (worldIn.getBlockState(pos.down()).getMaterial() != Material.WOOD
					&& worldIn.getBlockState(pos.down()).getMaterial() != Material.SAND
					&& worldIn.getBlockState(pos.down()).getMaterial() != Material.CLAY
					&& worldIn.getBlockState(pos.down()).getMaterial() != Material.GRASS
					&& worldIn.getBlockState(pos.down()).getMaterial() != Material.GROUND
					&& worldIn.getBlockState(pos.down()).getMaterial() != Material.ROCK) {
					blockface = false;
				}
			}
			if (side == EnumFacing.DOWN) {
	        	//if (worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			
			return blockface;
			
	    }
		
		@Override
	    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
	    }

	   	@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Liverwort");
				tooltip.add("Periods: Ordovician - Silurian - Devonian - Carboniferous - Permian - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene [- present]");
				tooltip.add("Note: spreads to surrounding blocks.");
				tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public Block planted() {
			return BlockLiverwort.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}
