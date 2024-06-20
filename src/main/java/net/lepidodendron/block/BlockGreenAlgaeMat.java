
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronConfigPlants;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.gen.AlgaeGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
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
public class BlockGreenAlgaeMat extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:green_algae_mat")
	public static final Block block = null;
	public BlockGreenAlgaeMat(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.green_algae_mat);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("green_algae_mat"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("itemAlgae", BlockGreenAlgaeMat.block);
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:green_algae_mat", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockGreenAlgaeMat.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {		
			
		int weight = LepidodendronConfigPlants.weightGreenAlgaeMat;
		if (weight > 100) {weight = 100;}
		if (weight < 0) {weight = 0;}
		if (Math.random() < ((double) (100 - (double) weight)/100)) {
			return;
		}

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genGreenAlgaeMatBlacklistBiomes)) {
			biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genGreenAlgaeMatOverrideBiomes))
			biomeCriteria = true;
		if ((dimID == LepidodendronConfig.dimCambrian)
			|| (dimID == LepidodendronConfig.dimPrecambrian)
			|| (dimID == LepidodendronConfig.dimOrdovician || dimID == LepidodendronConfig.dimSilurian)
			|| (dimID == LepidodendronConfig.dimDevonian)
			|| (dimID == LepidodendronConfig.dimCarboniferous)
			|| (dimID == LepidodendronConfig.dimPermian)
			|| (dimID == LepidodendronConfig.dimTriassic)
			|| (dimID == LepidodendronConfig.dimJurassic)
			|| (dimID == LepidodendronConfig.dimCretaceousEarly)
		) {
			biomeCriteria = true;
		}

		if (biome instanceof BiomePrecambrian) {
			BiomePrecambrian biomePrecambrian = (BiomePrecambrian) biome;
			if (biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Hadean
				|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic
				|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Archean
				|| biomePrecambrian.getBiomeType() == EnumBiomeTypePrecambrian.Proterozoic_Land
			) {
				biomeCriteria = false;
			}
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
			biomeCriteria = false;
		}

		if (!biomeCriteria)
			return;

		int multiplier = 1;
		if ((dimID == LepidodendronConfig.dimDevonian)
				|| (dimID == LepidodendronConfig.dimSilurian)
				|| (dimID == LepidodendronConfig.dimPermian)
				|| (dimID == LepidodendronConfig.dimJurassic)
				|| (dimID == LepidodendronConfig.dimCretaceousEarly)
		) {
			multiplier = 2;
		}
		if ((dimID == LepidodendronConfig.dimCambrian)
			|| (dimID == LepidodendronConfig.dimPrecambrian)
			|| (dimID == LepidodendronConfig.dimTriassic))
		{
			multiplier = 3;
		}

		if (dimID == LepidodendronConfig.dimOrdovician)
		{
			multiplier = 4;
		}
		if (dimID == LepidodendronConfig.dimCarboniferous)
		{
			multiplier = 5;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")
		)
			multiplier = 24;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")
		)
			multiplier = 48;


		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")
		)
			multiplier = 12;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")
		)
			multiplier = 24;

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest"))
		{
			multiplier = 5;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
			|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore"))
		{
			multiplier = 8;
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
			|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
		)
			multiplier = 36;

		for (int i = 0; i < (int) 10 * multiplier; i++) {
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

	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool NORTH = PropertyBool.create("north");
   		public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool UP = PropertyBool.create("up");
	    public static final PropertyBool DOWN = PropertyBool.create("down");
	   // public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_green_algae_mat");
			setSoundType(SoundType.PLANT);
			setHardness(0.0F);
			setResistance(0.0F);
			setLightLevel(0F);
			setLightOpacity(3);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(LEVEL, 0).withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ALGAE;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
			
	    	Block block = worldIn.getBlockState(pos.down()).getBlock();
	        Block block1 = worldIn.getBlockState(pos.up()).getBlock();
	        Block block2 = worldIn.getBlockState(pos.north()).getBlock();
	        Block block3 = worldIn.getBlockState(pos.east()).getBlock();
	        Block block4 = worldIn.getBlockState(pos.south()).getBlock();
	        Block block5 = worldIn.getBlockState(pos.west()).getBlock();
	        
			Boolean attachmentblock = false;
			Boolean attachmentblock1 = false;
			Boolean attachmentblock2 = false;
			Boolean attachmentblock3 = false;
			Boolean attachmentblock4 = false;
			Boolean attachmentblock5 = false;

			IBlockState blockState = worldIn.getBlockState(pos.down());
			IBlockState blockState1 = worldIn.getBlockState(pos.up());
			IBlockState blockState2 = worldIn.getBlockState(pos.north());
			IBlockState blockState3 = worldIn.getBlockState(pos.east());
			IBlockState blockState4 = worldIn.getBlockState(pos.south());
			IBlockState blockState5 = worldIn.getBlockState(pos.west());
			
            if (blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock5 = true;
					}
				}
				else
				{
					attachmentblock5 = true;
				}
            }

	        return state.withProperty(DOWN, attachmentblock).withProperty(UP, attachmentblock1).withProperty(NORTH, attachmentblock2).withProperty(EAST, attachmentblock3).withProperty(SOUTH, attachmentblock4).withProperty(WEST, attachmentblock5);
	    }
			
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
		
		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
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
			
			Block block = source.getBlockState(pos.down()).getBlock();
	        Block block1 = source.getBlockState(pos.up()).getBlock();
	        Block block2 = source.getBlockState(pos.north()).getBlock();
	        Block block3 = source.getBlockState(pos.east()).getBlock();
	        Block block4 = source.getBlockState(pos.south()).getBlock();
	        Block block5 = source.getBlockState(pos.west()).getBlock();
	        
			Boolean attachmentblock = false;
			Boolean attachmentblock1 = false;
			Boolean attachmentblock2 = false;
			Boolean attachmentblock3 = false;
			Boolean attachmentblock4 = false;
			Boolean attachmentblock5 = false;

			IBlockState blockState = source.getBlockState(pos.down());
			IBlockState blockState1 = source.getBlockState(pos.up());
			IBlockState blockState2 = source.getBlockState(pos.north());
			IBlockState blockState3 = source.getBlockState(pos.east());
			IBlockState blockState4 = source.getBlockState(pos.south());
			IBlockState blockState5 = source.getBlockState(pos.west());
			
            if (blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID) 
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID) 
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID) 
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID) 
						) {
						attachmentblock5 = true;
					}
				}
				else
				{
					attachmentblock5 = true;
				}
            }


			switch ((EnumFacing) state.getValue(BlockDirectional.FACING)) {
				case SOUTH :
				default :
					if (attachmentblock1 || attachmentblock  || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1D);
					}
				case NORTH :
				if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.9D, 1.0D, 1.0D, 1.0D);
					}
				case WEST :if (attachmentblock1 || attachmentblock2 || attachmentblock || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.9D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
				case EAST :if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1D, 1.0D, 1.0D);
					}
				case UP :if (attachmentblock1 || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 0D, 0.0D, 1.0D, 0.1D, 1.0D);
					}
				case DOWN :if (attachmentblock || attachmentblock2 || attachmentblock3 || attachmentblock4 || attachmentblock5) {
						return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
					}
					else {
						return new AxisAlignedBB(0.0D, 1D, 0.0D, 1.0D, 0.9D, 1.0D);
					}
			}
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{LEVEL, FACING, NORTH, SOUTH, EAST, WEST, UP, DOWN});
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
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
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
				worldIn.destroyBlock(pos, false);
			}
			else {
				if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light

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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
							worldIn.destroyBlock(pos, false);
							
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
			if (world.getBlockState(pos).getMaterial() == Material.WATER
					|| world.getBlockState(pos).getMaterial() == Material.PACKED_ICE
			) {
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
				tooltip.add("Type: Freshwater or Marine Algae");
	        	tooltip.add("Periods: [Paleoproterozoic (Rhyacian (?) - Orosirian (?) - Statherian (?)) - Mesoproterozoic (Calymmian (?) - Ectasian (?) - Stenian (?)) - ] Neoproterozoic (Tonian - Cryogenian - Ediacaran) - Cambrian - Ordovician - Silurian - Devonian - Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene - present");
	        	tooltip.add("Propagation: water");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }


	}
}
