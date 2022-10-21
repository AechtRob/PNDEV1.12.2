
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockProtolepidodendropsis extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:protolepidodendropsis")
	public static final Block block = null;
	public BlockProtolepidodendropsis(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.protolepidodendropsis);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("protolepidodendropsis"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("lepidodendron:protolepidodendropsis", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).build());

	}

	public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimProtolepidodendropsis))
			dimensionCriteria = true;
		if (!LepidodendronConfigPlants.genProtolepidodendropsis && !LepidodendronConfig.genAllPlants)
			dimensionCriteria = false;
		if (LepidodendronConfig.dimDevonian == dimID)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 128, chunkZ + 16));
		if ((!matchBiome(biome, LepidodendronConfig.genGlobalBlacklist)) && (!matchBiome(biome, LepidodendronConfigPlants.genProtolepidodendropsisBlacklistBiomes))) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SWAMP))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.RIVER))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genProtolepidodendropsisOverrideBiomes))
			biomeCriteria = true;
		if (LepidodendronConfig.dimDevonian == dimID) {
			if (biome instanceof BiomeDevonian) {
				BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
				if (biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Springs) {
					biomeCriteria = false;
				}
				else {
					biomeCriteria = true;
				}
			}
		}
		if (!biomeCriteria)
			return;

		int GenChance = 3;
		double GenMultiplier = LepidodendronConfigPlants.multiplierProtolepidodendropsis;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(15, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = 15;
		}

		if (LepidodendronConfig.dimDevonian == dimID) {
			GenChance = 64;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")) {
			GenChance = 128;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")) {
			GenChance = 256;
		}

		int maxheight = LepidodendronConfigPlants.maxheightProtolepidodendropsis;
		int minheight = LepidodendronConfigPlants.minheightProtolepidodendropsis;
		if (maxheight < 0) {maxheight = 0;}
		if (maxheight > 250) {maxheight = 250;}
		if (minheight < 1) {minheight = 1;}
		if (minheight > 250) {minheight = 250;}
		final int maxH = maxheight;
		final int minH = minheight;

		for (int i = 0; i < GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 10; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (world.isAirBlock(blockpos1) && world.isAirBlock(blockpos1.up()) && world.isAirBlock(blockpos1.up(2)) && blockpos1.getY() >= minH && (blockpos1.getY() <= maxH || maxH == 0)  && !(world.getBiome(blockpos1).getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs"))) {
							if (BlockSapling.block.canPlaceBlockAt(world, blockpos1)) {
								//Place plant(s)
								world.setBlockState(blockpos1, block.getDefaultState(), 2);
								if (Math.random() > 0.3) {
									world.setBlockState(blockpos1.up(), block.getDefaultState(), 2);
									if (Math.random() > 0.3) {
										world.setBlockState(blockpos1.up(2), block.getDefaultState(), 2);
										if (Math.random() > 0.4) { //Shorter:
											if (Math.random() > 0.5) {
												world.setBlockState(blockpos1.up(2), BlockProtolepidodendropsisShoot.block.getDefaultState().withProperty(STAGE, 0), 2);
											} else {
												world.setBlockState(blockpos1.up(2), BlockProtolepidodendropsisShoot.block.getDefaultState().withProperty(STAGE, 1), 2);
											}
										} else { //One more high:
											if (Math.random() > 0.4) {
												if (Math.random() > 0.5) {
													world.setBlockState(blockpos1.up(3), BlockProtolepidodendropsisShoot.block.getDefaultState().withProperty(STAGE, 0), 2);
												} else {
													world.setBlockState(blockpos1.up(3), BlockProtolepidodendropsisShoot.block.getDefaultState().withProperty(STAGE, 1), 2);
												}
											}
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
	
	public static class BlockCustom extends Block {

	public static final PropertyInteger SECTION = PropertyInteger.create("section", 0, 4);

    	public BlockCustom() {
			super(Material.PLANTS);
			setTranslationKey("pf_protolepidodendropsis");
			setSoundType(SoundType.PLANT);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(null);
			setTickRandomly(true);
        	this.setDefaultState(this.blockState.getBaseState().withProperty(SECTION, 0));
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
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return 0;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	    	int section = 0;
			//Figure out the plant:
			int yUp = 0;
			while (worldIn.getBlockState(pos.add(0, yUp, 0)).getBlock() == this) {
				yUp += 1;
			}
			yUp -= 1;

			int yDown = 0;
			while ((yDown >=-2) && (worldIn.getBlockState(pos.add(0, yDown, 0)).getBlock() == this)) {
				yDown -= 1;
			}
			yDown += 1;

			if ((yDown == 0) && (yUp == 0)) {
				section = 0; //Single sapling-style shoot
			}
			else {
				if (yDown == 0) {
					section = 1; //Base
				}
				else {
					if ((yUp == 0) && (yDown <= -2) && (worldIn.getBlockState(pos.up()).getBlock() != BlockProtolepidodendropsisShoot.block)) {
						section = 4; //Top type
					}
					else {
						if ((yUp == 0) && (yDown <= -1) && (worldIn.getBlockState(pos.up()).getBlock() != BlockProtolepidodendropsisShoot.block)) {
							section = 3; //Second-from-top type
						}
						else {
							section = 2; //Stem
						}
					}
				}
			}

			return state.withProperty(SECTION, section);
	    }

	    @Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			//return null;
    		return new ItemStack(BlockProtolepidodendropsisSapling.block, (int) (1));
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

        @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			//No drop except at the shoot
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(0.35D, 0D, 0.35D, 0.65D, 1D, 0.65D);
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
	        return new BlockStateContainer(this, new IProperty[] {SECTION});
	    }

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
			}
	    	world.notifyBlockUpdate(pos, state, state, 3);
	    	int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while ((world.getBlockState(pos.up(check)).getBlock() == this)
				|| (world.getBlockState(pos.up(check)).getBlock() == BlockProtolepidodendropsisShoot.block)) {
	    		world.notifyBlockUpdate(pos.up(check), state, state, 3);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.notifyBlockUpdate(pos.down(check), state, state, 3);
	    		check = check + 1;
	    	}
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
			boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
			int check;
	    	//Propagate state checks up and down:
	    	check = 1;
	    	while ((world.getBlockState(pos.up(check)).getBlock() == this)
				|| (world.getBlockState(pos.up(check)).getBlock() == BlockProtolepidodendropsisShoot.block)) {
	    		world.destroyBlock(pos.up(check), true);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.destroyBlock(pos.down(check), true);
	    		check = check + 1;
	    	}

			return retval;
		}

		@Override
		public void onBlockExploded(World world, BlockPos pos, Explosion e) {
			super.onBlockExploded(world, pos, e);
			int check;
	    	//Propagate state checks up and down:
	    	check = 1;
			while ((world.getBlockState(pos.up(check)).getBlock() == this)
				|| (world.getBlockState(pos.up(check)).getBlock() == BlockProtolepidodendropsisShoot.block)) {
	    		world.destroyBlock(pos.up(check), false);
	    		check = check + 1;
	    	}
	    	check = 1;
	    	while (world.getBlockState(pos.down(check)).getBlock() == this) {
	    		world.destroyBlock(pos.down(check), false);
	    		check = check + 1;
	    	}
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			super.updateTick(world, pos, state, random);
			//Grow
			if (getActualState(state, world, pos).getValue(SECTION) == 4) {
				if (Math.random() > 0.5  && (world.isAirBlock(pos.up()))) {
					world.setBlockState(pos.up(), BlockProtolepidodendropsisShoot.block.getDefaultState(), 3);
				}
				else {
					world.setBlockState(pos, BlockProtolepidodendropsisShoot.block.getDefaultState(), 3);
				}
			}
			else {
				if (world.isAirBlock(pos.up())) {
					world.setBlockState(pos.up(), this.getDefaultState(), 3);
				}
			}
		}

	    @Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}
		
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

}

