
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronStatic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNamacalathus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:namacalathus")
	public static final Block block = null;
	public BlockNamacalathus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.namacalathus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("namacalathus"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:namacalathus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockNamacalathus.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		int weight = LepidodendronConfig.weightEdiacaran;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		int minWaterDepth;
		int maxWaterDepth;
		int startHeight;

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimEdiacaran))
			dimensionCriteria = true;
		if (dimID == LepidodendronConfig.dimPrecambrian) {
			dimensionCriteria = false; //We have a different method in this dim
		}
		if ((dimID == LepidodendronConfig.dimCambrian)
				||(dimID == LepidodendronConfig.dimDevonian)
				|| (dimID == LepidodendronConfig.dimCarboniferous)
				|| (dimID == LepidodendronConfig.dimPermian)
				) {
			dimensionCriteria = false; //Not here!
		}
		if (!dimensionCriteria)
			return;

		minWaterDepth = 2;
		maxWaterDepth = 15;
		startHeight = world.getSeaLevel() - maxWaterDepth;

		for (int i = 0; i < 8; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(world.getSeaLevel() - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 12; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.getBlockState(blockpos1).getBlock() == Blocks.WATER) {
							boolean waterDepthCheckMax = false;
							boolean waterDepthCheckMin = true;
							//find air within the right depth
							int yy = 1;
							while (yy <= maxWaterDepth + 1 && !waterDepthCheckMax) {
								if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.AIR)
										&& ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.WATER))) {
									yy = maxWaterDepth + 1;
								} else if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() == Material.AIR)
										&& (i11 + yy >= world.getSeaLevel())) {
									waterDepthCheckMax = true;
								}
								yy += 1;
							}
							//Check that at least enough water is over the position:
							yy = 1;
							while (yy <= minWaterDepth && waterDepthCheckMin) {
								if (world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.WATER) {
									waterDepthCheckMin = false;
								}
								yy += 1;
							}

							//figure out a position and facing to place this at!
							//First try regular uprights and then the rotations:
							EnumFacing enumfacing = EnumFacing.UP;
							BlockPos pos1 = blockpos1.down();
							if (waterDepthCheckMin & waterDepthCheckMax) {
								if (((world.getBlockState(pos1).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos1).getMaterial() == Material.ROCK)
										|| (world.getBlockState(pos1).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos1).getMaterial() == Material.CORAL)
										|| (world.getBlockState(pos1).getMaterial() == Material.CLAY))
										&& (world.getBlockState(pos1).getBlockFaceShape(world, pos1, EnumFacing.UP) == BlockFaceShape.SOLID)) {
									world.setBlockState(blockpos1, block.getDefaultState().withProperty(BlockArkarua.BlockCustom.FACING, enumfacing), 2);
									return true;
								} else {
									for (EnumFacing enumfacing1 : BlockArkarua.BlockCustom.FACING.getAllowedValues()) {
										pos1 = blockpos1;

										if (enumfacing1 == EnumFacing.NORTH) {
											pos1 = blockpos1.add(0, 0, 1);
										}
										if (enumfacing1 == EnumFacing.SOUTH) {
											pos1 = blockpos1.add(0, 0, -1);
										}
										if (enumfacing1 == EnumFacing.EAST) {
											pos1 = blockpos1.add(-1, 0, 0);
										}
										if (enumfacing1 == EnumFacing.WEST) {
											pos1 = blockpos1.add(1, 0, 0);
										}
										if (enumfacing1 != EnumFacing.UP && enumfacing1 != EnumFacing.DOWN &&
												((world.getBlockState(pos1).getMaterial() == Material.SAND)
														|| (world.getBlockState(pos1).getMaterial() == Material.ROCK)
														|| (world.getBlockState(pos1).getMaterial() == Material.GROUND)
														|| (world.getBlockState(pos1).getMaterial() == Material.CLAY)
														|| (world.getBlockState(pos1).getMaterial() == Material.GLASS)
														|| (world.getBlockState(pos1).getMaterial() == Material.CORAL)
														|| (world.getBlockState(pos1).getMaterial() == Material.IRON)
														|| (world.getBlockState(pos1).getMaterial() == Material.WOOD))
												&& (world.getBlockState(pos1).getBlockFaceShape(world, pos1, enumfacing1) == BlockFaceShape.SOLID)) {
											world.setBlockState(blockpos1, block.getDefaultState().withProperty(BlockArkarua.BlockCustom.FACING, enumfacing1), 2);
											return true;
										}
									}
								}
							}
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
		}
	}

	public static boolean matchBiome(Biome biome, String[] biomesList) {

		//String regName = biome.getRegistryName().toString();

		String[] var2 = biomesList;
		int var3 = biomesList.length;

		for(int var4 = 0; var4 < var3; ++var4) {
			String checkBiome = var2[var4];
			if (!checkBiome.contains(":")) {
				//System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
				if (checkBiome.equalsIgnoreCase(
						biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
				)) {
					return true;
				}
			}
			if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
				return true;
			}
		}

		return false;
	}

	public boolean shouldGenerateInDimension(int id, int[] dims) {
		int[] var2 = dims;
		int var3 = dims.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			int dim = var2[var4];
			if (dim == id) {
				return true;
			}
		}
		return false;
	}
	
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable  {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_namacalathus");
			setSoundType(SoundType.PLANT);
			setHardness(0.0F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(0);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronStatic.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(FACING, EnumFacing.UP));
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
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{LEVEL, FACING});
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
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			if (!canPlaceBlockAt(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
			else {
				//Test the orientation of this block and then check if it is still connected:
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
					IBlockState iblockstate = worldIn.getBlockState(pos.south());
					if (worldIn.isAirBlock(pos.south()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.south()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
						}
					}
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
					IBlockState iblockstate = worldIn.getBlockState(pos.north());
					if (worldIn.isAirBlock(pos.north()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.north()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
						}
					}
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
					IBlockState iblockstate = worldIn.getBlockState(pos.west());
					if (worldIn.isAirBlock(pos.west()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.west()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
						}
					}
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
					IBlockState iblockstate = worldIn.getBlockState(pos.east());
					if (worldIn.isAirBlock(pos.east()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.east()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
						}
					}
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
					IBlockState iblockstate = worldIn.getBlockState(pos.down());
					if (worldIn.isAirBlock(pos.down()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
						}
					}
				if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
					IBlockState iblockstate = worldIn.getBlockState(pos.up());
					if (worldIn.isAirBlock(pos.up()) || 
						(
							(iblockstate.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID)
							&& (!iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.up()))
						)	
					)
						{
							worldIn.setBlockToAir(pos);
							
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

	    //@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{

			//System.err.println("Can place");
			
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))) {
				return super.canPlaceBlockAt(worldIn, pos); 
			}
			//if (((world.getBlockState(pos.down()).getMaterial() != Material.SAND)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.ROCK)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
			//	&& (world.getBlockState(pos.down()).getMaterial() != Material.CLAY))) {
			//	return false;
			//}
			return false; 
		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	    {
	    	boolean blockface  = true;
			if (side == EnumFacing.NORTH) {
	        	if (worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.SOUTH) {
	        	if (worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.EAST) {
	        	if (worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.WEST) {
	        	if (worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.UP) {
	        	if (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}
			if (side == EnumFacing.DOWN) {
	        	if (worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID)
	        		blockface = false;
			}

			
			return (blockface && canPlaceBlockAt(worldIn, pos));
			
	    }
		
		@Override
	    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
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
	    
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Reef Organism");
				tooltip.add("Periods: Ediacaran");
			}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
