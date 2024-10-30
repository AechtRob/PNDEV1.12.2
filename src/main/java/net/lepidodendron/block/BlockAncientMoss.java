
package net.lepidodendron.block;

import net.lepidodendron.*;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.entity.util.ILayableMoss;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.gen.MossWoodGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
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
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAncientMoss extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:ancient_moss")
	public static final Block block = null;
	public BlockAncientMoss(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.ancient_moss);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("ancient_moss"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockAncientMoss.TileEntityCustom.class, "lepidodendron:tileentityancient_moss");

		OreDictionary.registerOre("plantdnaPNlepidodendron:ancient_moss", BlockAncientMoss.block);
		OreDictionary.registerOre("plantPrehistoric", BlockAncientMoss.block);
		OreDictionary.registerOre("plant", BlockAncientMoss.block);
		OreDictionary.registerOre("itemMoss", BlockAncientMoss.block);
		OreDictionary.registerOre("itemMossForStone", BlockAncientMoss.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:ancient_moss", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX + 16, 0, chunkZ + 16));
		if (!matchBiome(biome, LepidodendronConfigPlants.genMossWoodBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.FOREST))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MUSHROOM))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.VOID))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfigPlants.genMossWoodOverrideBiomes))
			biomeCriteria = true;
		if (!LepidodendronConfigPlants.genFernEpiphyte && !LepidodendronConfig.genAllPlants)
			biomeCriteria = false;
		if (
				(dimID == LepidodendronConfig.dimCarboniferous)
				&& !(biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt"))
		)
		{
			biomeCriteria = true;
		}

		if (biome instanceof BiomePermian)
		{
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Forest) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeTriassic)
		{
			BiomeTriassic biomeTriassic = (BiomeTriassic) biome;
			if (biomeTriassic.getBiomeType() == EnumBiomeTypeTriassic.Cool) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (biome instanceof BiomeJurassic)
		{
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Floodplain
					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Forest
					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Ginkgo
					|| biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Coniferous) {
				biomeCriteria = true;
			}
			else {
				biomeCriteria = false;
			}
		}
		if (!biomeCriteria)
			return;

		int GenChance = 64;
		double GenMultiplier = LepidodendronConfigPlants.multiplierMossWood;
		if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(256, (int) Math.round((double) GenChance * GenMultiplier));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfigPlants.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = Math.min(GenChance * 10, 256);
		}

		for (int i = 0; i < (int) GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new MossWoodGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable, IAdvancementGranter, ILayableMoss {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool NORTH = PropertyBool.create("north");
   		public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool UP = PropertyBool.create("up");
	    public static final PropertyBool DOWN = PropertyBool.create("down");
    
		public BlockCustom() {
			super(Material.VINE);
			setTranslationKey("pf_ancient_moss");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_MOSS;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockAncientMoss.TileEntityCustom();
		}

		public BlockAncientMoss.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockAncientMoss.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
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
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
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
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, NORTH, SOUTH, EAST, WEST, UP, DOWN});
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
			return 20;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
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
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);

						SpawnEggs(worldIn, pos);
						//Clear nbt:
						TileEntity te = worldIn.getTileEntity(pos);
						if (te != null) {
							te.getTileData().removeTag("creature");
						}
						worldIn.notifyBlockUpdate(pos, state, state, 3);
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
			
			return blockface;
			
	    }
		
		@Override
	    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	    {
	        return true;
	    }

		public void SpawnEggs(World world, BlockPos pos) {
			String eggRenderType = new Object() {
				public String getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(new BlockPos(pos), "egg");

			EntityItem entityToSpawn = null;
			if (!eggRenderType.equals("")) {
				entityToSpawn = BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, world, pos);
			}
			//Spawn the eggs:
			if (!world.isRemote && entityToSpawn != null) {
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
				//System.err.println("Spawned " + entityToSpawn);
			}
		}

	}

	public static class TileEntityCustom extends TileEntity {

		private String egg;

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			NBTTagCompound tag = new NBTTagCompound();
			this.writeToNBT(tag);
			return new SPacketUpdateTileEntity(pos, 1, tag);
		}

		@Override
		public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
			readFromNBT(packet.getNbtCompound());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public void readFromNBT(NBTTagCompound compound)
		{
			super.readFromNBT(compound);
			if (compound.hasKey("creature")) {
				this.egg = compound.getString("creature");
			}
		}

		@Override
		public NBTTagCompound writeToNBT(NBTTagCompound compound)
		{
			super.writeToNBT(compound);
			if (this.hasEgg())
			{
				compound.setString("creature", this.egg);
			}
			return compound;
		}

		public boolean hasEgg()
		{
			return this.egg != null;
		}

	}
}
