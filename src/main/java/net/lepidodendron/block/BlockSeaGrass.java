
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
import net.lepidodendron.world.gen.AlgaeGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
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
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSeaGrass extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sea_grass")
	public static final Block block = null;
	public BlockSeaGrass(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sea_grass);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sea_grass"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sea_grass", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockSeaGrass.LEVEL).ignore(BlockSeaGrass.SPREADABLE).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:sea_grass", BlockSeaGrass.block);
		OreDictionary.registerOre("plantPrehistoric", BlockSeaGrass.block);
		OreDictionary.registerOre("plant", BlockSeaGrass.block);
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	public static final PropertyBool SPREADABLE = PropertyBool.create("spreadable");

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		int weight = LepidodendronConfigPlants.weightSeagrass;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genSeagrassBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genSeagrassOverrideBiomes))
			biomeCriteria = true;

		if (dimID == LepidodendronConfig.dimPrecambrian
				|| dimID == LepidodendronConfig.dimCambrian
				|| dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly
		) {
			biomeCriteria = false;
		}

		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if (dimID == LepidodendronConfig.dimCretaceousLate
		) {
			multiplier = 32;
		}

		for (int i = 0; i < (int) 20 * multiplier; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new AlgaeGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends SeedSporeBlockBase implements IShearable, IAdvancementGranter {
	    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_sea_grass");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(TabLepidodendronPlants.tab);
			setTickRandomly(true);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(SPREADABLE, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_SEAGRASS;
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);

			if (!world.isRemote)
			{
				if (!world.isAreaLoaded(pos, 3)) return;

				if (!canPlaceBlockAt(world, pos))
				{
					world.destroyBlock(pos, false);
				}
				else {
					Random rand = new Random();
					if ((Boolean) state.getValue(SPREADABLE)) {
						//System.err.println("Ticked a spreadable block");
						int spreadradius = (int) LepidodendronConfigPlants.radiusSeagrass;
						if (spreadradius < 0) {
							spreadradius = 0;
						}
						if (spreadradius > 8) {
							spreadradius = 8;
						}
						int xx = rand.nextInt((spreadradius * 2) + 1) - spreadradius;
						int yy = rand.nextInt((spreadradius * 2) + 1) - spreadradius;
						int zz = rand.nextInt((spreadradius * 2) + 1) - spreadradius;
						//Try to spread:
						BlockPos targetBlock = pos.add(xx, yy, zz);
						double spread = (double) LepidodendronConfig.spreadPlants;
						if (spread < 1) {
							spread = 1;
						}
						if (spread > 100) {
							spread = 100;
						}
						if (Math.random() > (1 - (spread / 100)) && (targetBlock != pos)
								&& (world.getBlockState(targetBlock).getBlock() instanceof BlockFluidBase || world.getBlockState(targetBlock).getBlock() instanceof BlockLiquid)
								&& world.getBlockState(targetBlock).getMaterial() == Material.WATER
								&& (canPlaceBlockAt(world, targetBlock))) {
							world.setBlockState(targetBlock, BlockSeaGrass.block.getDefaultState().withProperty(SPREADABLE, false), 3);
						}
					}
				}
			}
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
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
				drops.add(new ItemStack(BlockSeaGrass.block, (int) (1)));
			}
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
			return this.getDefaultState().withProperty(SPREADABLE, meta > 0);
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
			int i = 0;
			if (((Boolean)state.getValue(SPREADABLE)).booleanValue())
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
	        return new BlockStateContainer(this, new IProperty[] {LEVEL, SPREADABLE});
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
			return new AxisAlignedBB(0.05D, 0D, 0.05D, 0.95D, 1D, 0.95D);
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

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
												EntityLivingBase placer) {
			return this.getDefaultState();
		}

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
			if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
					&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND))
					)
			) {
				int i = 1;
				while (worldIn.getBlockState(pos.up(i)).getMaterial() == Material.WATER) {
					i ++;
				}
				return i <= 10;
			}
	        return false;
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
				tooltip.add("Type: Marine flowering plant");
				tooltip.add("Periods: early Cretaceous - Paleogene  - Neogene - Pleistocene [- present]");
				tooltip.add("Note: planted up to 10 blocks under water on sand. Spreads to adjacent blocks");
				tooltip.add("Propagation: seeds");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public Block planted() {
			return BlockSeaGrass.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}

		@Override
		public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
			return true;
		}

		@Nonnull
		@Override
		public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
		}
	}
}
