
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.world.gen.VineGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSchisandra extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:schisandra")
	public static final Block block = null;
	public BlockSchisandra(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.schisandra);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("schisandra"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");
    
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:schisandra", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:schisandra", BlockSchisandra.block);
		OreDictionary.registerOre("plantPrehistoric", BlockSchisandra.block);
		OreDictionary.registerOre("plant", BlockSchisandra.block);
		OreDictionary.registerOre("itemMossForStone", BlockSchisandra.block);
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfigPlants.dimSchisandra))
			dimensionCriteria = true;
//		if (dimID == LepidodendronConfig.dimCarboniferous
//				|| dimID == LepidodendronConfig.dimPermian
//				|| dimID == LepidodendronConfig.dimTriassic
//				|| dimID == LepidodendronConfig.dimJurassic)
//		{
//			dimensionCriteria = true;
//		}
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 15, 0, chunkZ + 15));
		if (!matchBiome(biome, LepidodendronConfigPlants.genSchisandraBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.JUNGLE))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genSchisandraOverrideBiomes))
			biomeCriteria = true;
		if (!LepidodendronConfigPlants.genSchisandra && (!LepidodendronConfig.genAllPlants) && (!LepidodendronConfig.genAllPlantsModern))
			biomeCriteria = false;


//		if (biome instanceof BiomeJurassic)
//		{
//			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
//			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Floodplain
//					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Forest
//					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.IslandRock) {
//				biomeCriteria = true;
//			}
//			else {
//				biomeCriteria = false;
//			}
//		}

		if (!biomeCriteria)
			return;

		int GenChance = 30;
		double GenMultiplier = LepidodendronConfigPlants.multiplierSchisandra;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(100, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = Math.min(GenChance * 10, 100);
		}

		for (int i = 0; i < (int) GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new VineGenerator((BlockVine) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends BlockVine implements IAdvancementGranter {
		public BlockCustom() {
			//super(Material.VINE);
			setSoundType(SoundType.PLANT);
			setTranslationKey("pf_schisandra");
			setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)));
        	setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_SCHISANDRA;
		}


		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 15;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {UP, NORTH, EAST, SOUTH, WEST});
	    }

	    @Override
	   	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
	    { 
	    	return false;
	    	//if (LepidodendronConfig.doPropagation) {
	    	//	return false;
	    	//}
	    	//else {return true; }
	    }

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
	    {
	        if (!LepidodendronConfig.doPropagation && !worldIn.isRemote && stack.getItem() == Items.SHEARS)
	        {
	            player.addStat(StatList.getBlockStats(this));
	            spawnAsEntity(worldIn, pos, new ItemStack(this, 1, 0));
	        }
	        else {
	        	if (!LepidodendronConfig.doPropagation) {
	           		super.harvestBlock(worldIn, player, pos, state, te, stack);
	        	}
	        }
	    }

	    @Override
		protected boolean canSilkHarvest()
	    { 
	    	if (LepidodendronConfig.doPropagation) {
	    		return false;
	    	}
	    	else {return true; }
	    }

	    @Override
	    public boolean canAttachTo(World p_193395_1_, BlockPos p_193395_2_, EnumFacing p_193395_3_)
	    {
	        Block block = p_193395_1_.getBlockState(p_193395_2_.up()).getBlock();
	        return this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.offset(p_193395_3_.getOpposite()), p_193395_3_) && (block == Blocks.AIR || block == this || block == BlockSchisandraFruit.block || this.isAcceptableNeighbor(p_193395_1_, p_193395_2_.up(), EnumFacing.UP));
	    }

	    private boolean isAcceptableNeighbor(World p_193396_1_, BlockPos p_193396_2_, EnumFacing p_193396_3_)
	    {
	        IBlockState iblockstate = p_193396_1_.getBlockState(p_193396_2_);
	        return iblockstate.getBlockFaceShape(p_193396_1_, p_193396_2_, p_193396_3_) == BlockFaceShape.SOLID && !isExceptBlockForAttaching(iblockstate.getBlock());
	    }

	    @Override
	    //Lifted from the vanilla vine class wholesale and amended where needed:
	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (worldIn.rand.nextInt(4) == 0 && worldIn.isAreaLoaded(pos, 4)) // Forge: check area to prevent loading unloaded chunks
	            {
	                int i = 4;
	                int j = 5;
	                boolean flag = false;
	                label181:
	
	                for (int k = -4; k <= 4; ++k)
	                {
	                    for (int l = -4; l <= 4; ++l)
	                    {
	                        for (int i1 = -1; i1 <= 1; ++i1)
	                        {
	                            if (
									(worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == this)
									|| (worldIn.getBlockState(pos.add(k, i1, l)).getBlock() == BlockSchisandraFruit.block)
										)
	                            {
	                                --j;
	
	                                if (j <= 0)
	                                {
	                                    flag = true;
	                                    break label181;
	                                }
	                            }
	                        }
	                    }
	                }
	
	                EnumFacing enumfacing1 = EnumFacing.random(rand);
	                BlockPos blockpos2 = pos.up();
	
	                if (enumfacing1 == EnumFacing.UP && pos.getY() < 255 && worldIn.isAirBlock(blockpos2))
	                {
						IBlockState iblockstate2 = state;
	
	                    for (EnumFacing enumfacing2 : EnumFacing.Plane.HORIZONTAL)
	                    {
	                        if (rand.nextBoolean() && this.canAttachTo(worldIn, blockpos2, enumfacing2.getOpposite()))
	                        {
	                            iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(true));
	                        }
	                        else
	                        {
	                            iblockstate2 = iblockstate2.withProperty(getPropertyFor(enumfacing2), Boolean.valueOf(false));
	                        }
	                    }

						IBlockState state1 = state;
						if (rand.nextInt(3) == 0) {
							state1 = BlockSchisandraFruit.block.getDefaultState()
									.withProperty(UP, state.getValue(UP))
									.withProperty(NORTH, state.getValue(NORTH))
									.withProperty(EAST, state.getValue(EAST))
									.withProperty(SOUTH, state.getValue(SOUTH))
									.withProperty(WEST, state.getValue(WEST));
						}
	                    if (((Boolean)iblockstate2.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate2.getValue(EAST)).booleanValue() || ((Boolean)iblockstate2.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate2.getValue(WEST)).booleanValue())
	                    {
	                        worldIn.setBlockState(blockpos2, state1, 2);
	                    }
	                }
	                else if (enumfacing1.getAxis().isHorizontal() && !((Boolean)state.getValue(getPropertyFor(enumfacing1))).booleanValue())
	                {
	                    if (!flag)
	                    {
	                        BlockPos blockpos4 = pos.offset(enumfacing1);
	                        IBlockState iblockstate3 = worldIn.getBlockState(blockpos4);
	                        Block block1 = iblockstate3.getBlock();
	
	                        if (block1.isAir(iblockstate3, worldIn, blockpos4))
	                        {
	                            EnumFacing enumfacing3 = enumfacing1.rotateY();
	                            EnumFacing enumfacing4 = enumfacing1.rotateYCCW();
	                            boolean flag1 = ((Boolean)state.getValue(getPropertyFor(enumfacing3))).booleanValue();
	                            boolean flag2 = ((Boolean)state.getValue(getPropertyFor(enumfacing4))).booleanValue();
	                            BlockPos blockpos = blockpos4.offset(enumfacing3);
	                            BlockPos blockpos1 = blockpos4.offset(enumfacing4);
	
	                            if (flag1 && this.canAttachTo(worldIn, blockpos.offset(enumfacing3), enumfacing3))
	                            {
	                                //worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing3), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag2 && this.canAttachTo(worldIn, blockpos1.offset(enumfacing4), enumfacing4))
	                            {
	                                //worldIn.setBlockState(blockpos4, this.getDefaultState().withProperty(getPropertyFor(enumfacing4), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag1 && worldIn.isAirBlock(blockpos) && this.canAttachTo(worldIn, blockpos, enumfacing1))
	                            {
	                                //worldIn.setBlockState(blockpos, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
	                            }
	                            else if (flag2 && worldIn.isAirBlock(blockpos1) && this.canAttachTo(worldIn, blockpos1, enumfacing1))
	                            {
	                                //worldIn.setBlockState(blockpos1, this.getDefaultState().withProperty(getPropertyFor(enumfacing1.getOpposite()), Boolean.valueOf(true)), 2);
	                            }
	                        }
	                        else if (iblockstate3.getBlockFaceShape(worldIn, blockpos4, enumfacing1) == BlockFaceShape.SOLID)
	                        {
								IBlockState state2 = state;
								if (rand.nextInt(3) == 0) {
									state2 = BlockSchisandraFruit.block.getDefaultState()
											.withProperty(UP, state.getValue(UP))
											.withProperty(NORTH, state.getValue(NORTH))
											.withProperty(EAST, state.getValue(EAST))
											.withProperty(SOUTH, state.getValue(SOUTH))
											.withProperty(WEST, state.getValue(WEST));
								}
	                            worldIn.setBlockState(pos, state2.withProperty(getPropertyFor(enumfacing1), Boolean.valueOf(true)), 2);
	                        }
	                    }
	                }
	                else
	                {
	                    if (pos.getY() > 1)
	                    {
	                        BlockPos blockpos3 = pos.down();
	                        IBlockState iblockstate = worldIn.getBlockState(blockpos3);
	                        Block block = iblockstate.getBlock();

	                        if ((worldIn.getBlockState(blockpos3)).getMaterial() == Material.AIR)
	                        {
								IBlockState iblockstate1 = state;

	                            for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
	                            {
	                                if (rand.nextBoolean())
	                                {
	                                    iblockstate1 = iblockstate1.withProperty(getPropertyFor(enumfacing), Boolean.valueOf(false));
	                                }
	                            }

								IBlockState state3 = iblockstate1;
								if (rand.nextInt(3) == 0) {
									state3 = BlockSchisandraFruit.block.getDefaultState()
											.withProperty(UP, iblockstate1.getValue(UP))
											.withProperty(NORTH, iblockstate1.getValue(NORTH))
											.withProperty(EAST, iblockstate1.getValue(EAST))
											.withProperty(SOUTH, iblockstate1.getValue(SOUTH))
											.withProperty(WEST, iblockstate1.getValue(WEST));
								}

	                            if (((Boolean)iblockstate1.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate1.getValue(EAST)).booleanValue() || ((Boolean)iblockstate1.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate1.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, state3, 2);
	                            }
	                        }
	                        else if (block == this || block == BlockSchisandraFruit.block)
	                        {
	                            IBlockState iblockstate4 = iblockstate;
	
	                            for (EnumFacing enumfacing5 : EnumFacing.Plane.HORIZONTAL)
	                            {
	                                PropertyBool propertybool = getPropertyFor(enumfacing5);
	
	                                if (rand.nextBoolean() && ((Boolean)state.getValue(propertybool)).booleanValue())
	                                {
	                                    iblockstate4 = iblockstate4.withProperty(propertybool, Boolean.valueOf(true));
	                                }
	                            }

								IBlockState state4 = block.getDefaultState()
											.withProperty(UP, iblockstate4.getValue(UP))
											.withProperty(NORTH, iblockstate4.getValue(NORTH))
											.withProperty(EAST, iblockstate4.getValue(EAST))
											.withProperty(SOUTH, iblockstate4.getValue(SOUTH))
											.withProperty(WEST, iblockstate4.getValue(WEST));


	                            if (((Boolean)iblockstate4.getValue(NORTH)).booleanValue() || ((Boolean)iblockstate4.getValue(EAST)).booleanValue() || ((Boolean)iblockstate4.getValue(SOUTH)).booleanValue() || ((Boolean)iblockstate4.getValue(WEST)).booleanValue())
	                            {
	                                worldIn.setBlockState(blockpos3, state4, 2);
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering-plant vine");
	        	tooltip.add("Periods: Late Cretaceous - Paleogene - Neogene - Pleistocene [ - present]");
	        	tooltip.add("Propagation: Fruit");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
		{
			if (!worldIn.isRemote && !this.recheckGrownSides(worldIn, pos, state))
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
		}

		private boolean recheckGrownSides(World worldIn, BlockPos pos, IBlockState state)
		{
			IBlockState iblockstate = state;

			for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
			{
				PropertyBool propertybool = getPropertyFor(enumfacing);

				if (((Boolean)state.getValue(propertybool)).booleanValue() && !this.canAttachTo(worldIn, pos, enumfacing.getOpposite()))
				{
					IBlockState iblockstate1 = worldIn.getBlockState(pos.up());

					if ((iblockstate1.getBlock() != this && iblockstate1.getBlock() != BlockSchisandraFruit.block)
							|| !((Boolean)iblockstate1.getValue(propertybool)).booleanValue())
					{
						state = state.withProperty(propertybool, Boolean.valueOf(false));
					}
				}
			}

			if (getNumGrownFaces(state) == 0)
			{
				return false;
			}
			else
			{
				if (iblockstate != state)
				{
					worldIn.setBlockState(pos, state, 2);
				}

				return true;
			}
		}
	}
}
