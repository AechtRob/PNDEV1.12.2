
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprion;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprionHole;
import net.lepidodendron.item.entities.ItemEggsWebsteroprion;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.util.Functions;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
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
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockWebsteroprionBurrow extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:websteroprion_burrow")
	public static final Block block = null;
	public BlockWebsteroprionBurrow(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.websteroprion);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("websteroprion_burrow"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	public static final PropertyInteger TYPE = PropertyInteger.create("type", 0, 11);
	public static final PropertyBool OCCUPIED = PropertyBool.create("occupied");

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:entities/websteroprion", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockWebsteroprionBurrow.LEVEL, BlockWebsteroprionBurrow.OCCUPIED).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (Math.random() <= 0.975) {return;}

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimWebsteroprion))
			dimensionCriteria = true;
		if ((dimID == LepidodendronConfig.dimCambrian)
				|| (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian)
				|| (dimID == LepidodendronConfig.dimCarboniferous)
				|| (dimID == LepidodendronConfig.dimPrecambrian)
				|| (dimID == LepidodendronConfig.dimPermian)
				|| (dimID == LepidodendronConfig.dimTriassic)
				|| (dimID == LepidodendronConfig.dimJurassic)
				|| (dimID == LepidodendronConfig.dimCretaceousEarly)
		) {
			dimensionCriteria = false;
		}
		if ((dimID == LepidodendronConfig.dimDevonian)
		) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		int weight = LepidodendronConfigPlants.weightWebsteroprion;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (dimID == LepidodendronConfig.dimDevonian
		)
			weight = 100; //Full scale populations in these dims

		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genWebsteroprionBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genWebsteroprionOverrideBiomes))
			biomeCriteria = true;

		if (biome instanceof BiomeDevonian)
		{
			BiomeDevonian biomeDev = (BiomeDevonian) biome;
			if (biomeDev.getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if ((dimID == LepidodendronConfig.dimDevonian)
		) {
			multiplier = 2;
		}
		int dimWeight = 1;
		if ((dimID != LepidodendronConfig.dimDevonian)) {
			dimWeight = 2;
		}
		int minWaterDepth = 2 * dimWeight;
		int maxWaterDepth = 25 * dimWeight;
		int startHeight = Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - maxWaterDepth;

		for (int i = 0; i < (56 * multiplier); i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)) - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new WorldGenReed() {
				@Override
				public boolean generate(World world, Random random, BlockPos pos) {
					for (int i = 0; i < 6; ++i) {
						BlockPos blockpos1 = pos.add(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
						if (blockpos1.getY() < Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ))
								&& (Functions.isWater(world, blockpos1))
								&& !world.isAirBlock(blockpos1.north())
								&& !world.isAirBlock(blockpos1.south())
								&& !world.isAirBlock(blockpos1.east())
								&& !world.isAirBlock(blockpos1.west())
						)
						{	boolean waterDepthCheckMax = false;
							boolean waterDepthCheckMin = true;
							//find air within the right depth
							int yy = 1;
							while (yy <= maxWaterDepth + 1 && !waterDepthCheckMax) {
								if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.AIR)
										&& ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() != Material.WATER))) {
									yy = maxWaterDepth + 1;
								} else if ((world.getBlockState(blockpos1.add(0, yy, 0)).getMaterial() == Material.AIR)
										&& (i11 + yy >= Functions.getAdjustedSeaLevel(world, new BlockPos(chunkX, 0, chunkZ)))) {
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
							IBlockState state = BlockWebsteroprionBurrow.block.getDefaultState();
							if (waterDepthCheckMin & waterDepthCheckMax) {
								if (((world.getBlockState(pos1).getMaterial() == Material.SAND)
										|| (world.getBlockState(pos1).getMaterial() == Material.GROUND)
										|| (world.getBlockState(pos1).getMaterial() == Material.CLAY))
										&& (world.getBlockState(pos1).getBlockFaceShape(world, pos1, EnumFacing.UP) == BlockFaceShape.SOLID)) {
									world.setBlockState(blockpos1, state, 2);
									return true;
								}
							}
						}
					}
					return true;
				}
			}).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends Block implements IAdvancementGranter {

		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_websteroprion_burrow");
			setSoundType(SoundType.GROUND);
			setHardness(0.5F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(OCCUPIED, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_WEBSTEROPRION;
		}

		@Override
		public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
			super.onEntityCollision(world, pos, state, entity);
			//attack the collider by spawning an entitiy

			//if (!world.isRemote) {
				//System.err.println("server tick");
				//System.err.println("occupied on server " + state.getValue(OCCUPIED));
				//System.err.println("entity on server " + (entity instanceof EntityLivingBase));
			//}
			//else {
				//System.err.println("client tick");
				//System.err.println("occupied on client " + state.getValue(OCCUPIED));
				//System.err.println("entity on client " + (entity instanceof EntityLivingBase));
			//}

			if (state.getValue(OCCUPIED)) {
				//System.err.println("occupied");
				//System.err.println("entity " + (entity instanceof EntityLivingBase));
				if ((!world.isRemote) && entity instanceof EntityLivingBase) {
				//if (entity instanceof EntityLivingBase) {
					//System.err.println("livingbase");
					if (world.getDifficulty() == EnumDifficulty.PEACEFUL && entity instanceof EntityPlayer) {
						return;
					}
					EntityLiving entitySpawn = new EntityPrehistoricFloraWebsteroprionHole(world);
					entitySpawn.setLocationAndAngles((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
					world.spawnEntity(entitySpawn);
					entitySpawn.playLivingSound();
					EntityPrehistoricFloraWebsteroprionHole websteroprionHole = (EntityPrehistoricFloraWebsteroprionHole) entitySpawn;
					websteroprionHole.setBurrow(pos);
					websteroprionHole.setAttackTick(0);
					//websteroprionHole.setAgeTicks(1);
					websteroprionHole.setAttackTarget((EntityLivingBase) entity);
					world.setBlockState(pos, state.withProperty(OCCUPIED, false));
				}

				if ((!world.isRemote) && entity instanceof EntityItem) {
				//if (entity instanceof EntityItem) {
					if ((OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), ((EntityItem) entity).getItem()))
						|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishcooked"), ((EntityItem) entity).getItem()))
						|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), ((EntityItem) entity).getItem()))
						|| (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatcooked"), ((EntityItem) entity).getItem()))
					) {
						EntityLiving entitySpawn = new EntityPrehistoricFloraWebsteroprionHole(world);
						entitySpawn.setLocationAndAngles((double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
						world.spawnEntity(entitySpawn);
						entitySpawn.playLivingSound();
						EntityPrehistoricFloraWebsteroprionHole websteroprionHole = (EntityPrehistoricFloraWebsteroprionHole) entitySpawn;
						websteroprionHole.setBurrow(pos);
						websteroprionHole.setAttackTick(0);
						//websteroprionHole.setAgeTicks(1);
						world.setBlockState(pos, state.withProperty(OCCUPIED, false));
					}
				}

			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			super.breakBlock(worldIn, pos, state);
			if (!worldIn.isRemote) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemEggsWebsteroprion.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				if (Math.random() > 0.25) {
					worldIn.spawnEntity(entityToSpawn);
				}
				if (Math.random() > 0.25) {
					worldIn.spawnEntity(entityToSpawn);
				}
				if (Math.random() > 0.25) {
					worldIn.spawnEntity(entityToSpawn);
				}
			}
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (state.getValue(OCCUPIED) && !worldIn.isRemote) {
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(worldIn, EntityList.getKey(EntityPrehistoricFloraWebsteroprion.class), (double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D);
				if (MobSpawn != null) {
					EntityPrehistoricFloraWebsteroprion websteroprion = (EntityPrehistoricFloraWebsteroprion) MobSpawn;
					websteroprion.setAgeTicks(1);
					if (!player.capabilities.isCreativeMode) {
						websteroprion.setAttackTarget(player);
					}
					((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), 0.0D, 0.0D, 0.0D);
				}
			}

			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			IBlockState stateDown = worldIn.getBlockState(pos.down());
			int type = 0; //generic
			if (stateDown.getMaterial() == Material.GROUND) {type = 1;} //dirt
			if (stateDown.getMaterial() == Material.SAND) {type = 2;} //gravel
			if (
				stateDown == Blocks.SAND.getStateFromMeta(0)
				|| stateDown.getBlock() == BlockSandSticky.block
				|| stateDown.getBlock() == BlockSandWavy.block
				|| stateDown.getBlock() == BlockSandWavySticky.block

			) {type = 3;} //white sand
			if (
				stateDown == Blocks.SAND.getStateFromMeta(1)
				|| stateDown.getBlock() == BlockSandRedSticky.block
				|| stateDown.getBlock() == BlockSandRedWavy.block
				|| stateDown.getBlock() == BlockSandRedWavySticky.block
			) {type = 4;} //red sand
			if (stateDown.getBlock() == BlockSandPangaean.block
					|| stateDown.getBlock() == BlockSandPangaeanSticky.block
					|| stateDown.getBlock() == BlockSandPangaeanWavy.block
					|| stateDown.getBlock() == BlockSandPangaeanWavySticky.block
			) {type = 5;} //pangaean sand
			if (stateDown.getMaterial() == Material.CLAY) {type = 6;} //clay
			if (stateDown.getBlock() == BlockRedClay.block) {type = 7;} //red clay
			if (stateDown.getBlock() == BlockSiltyDirt.block
				|| stateDown.getBlock() == BlockCoarseSiltyDirt.block
			) {type = 8;} //silty dirt
			if (stateDown.getBlock() == BlockSandBlack.block
					|| stateDown.getBlock() == BlockSandBlackSticky.block
					|| stateDown.getBlock() == BlockSandBlackWavy.block
					|| stateDown.getBlock() == BlockSandBlackWavySticky.block
			) {type = 9;} //black sand
			if (stateDown.getBlock() == BlockSandGrey.block
					|| stateDown.getBlock() == BlockSandGreySticky.block
					|| stateDown.getBlock() == BlockSandGreyWavy.block
					|| stateDown.getBlock() == BlockSandGreyWavySticky.block
			) {type = 11;} //grey sand
			if (stateDown.getBlock() == BlockSandyDirt.block
					|| stateDown.getBlock() == BlockCoarseSandyDirt.block
			) {type = 10;} //sandy dirt
			return state.withProperty(LEVEL, 0).withProperty(TYPE, type);
		}

		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return new AxisAlignedBB(0.00D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState().withProperty(OCCUPIED, (meta & 1) != 0);
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(OCCUPIED))
				i |= 1;
			return i;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{LEVEL, OCCUPIED, TYPE});
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
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
		public boolean isFullCube(IBlockState state) {
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
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!canPlaceBlockAt(worldIn, pos)) {
				if (state.getValue(OCCUPIED)) {
					Entity MobSpawn = ItemMonsterPlacer.spawnCreature(worldIn, EntityList.getKey(EntityPrehistoricFloraWebsteroprion.class), (double) pos.getX() + 0.5D, (double) pos.getY(), (double) pos.getZ() + 0.5D);
					if (MobSpawn != null) {
						EntityPrehistoricFloraWebsteroprion websteroprion = (EntityPrehistoricFloraWebsteroprion) MobSpawn;
						websteroprion.setAgeTicks(1);
						((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_NORMAL,pos.getX(), pos.getY(), pos.getZ(), 0.0D, 0.0D, 0.0D);
					}
				}
				worldIn.setBlockToAir(pos);
			}
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
			return false;
		}

		//@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))
					&& (worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND || worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY || worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					&& (worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID)) {
				return super.canPlaceBlockAt(worldIn, pos);
			}
			return false;
		}

		@Override
		public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				return true;
			}
			return false;
		}

	}
}
