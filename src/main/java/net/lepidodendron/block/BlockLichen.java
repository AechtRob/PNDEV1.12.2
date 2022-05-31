
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronDecorationHandler;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.gen.LichenGenerator;
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
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLichen extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lichen")
	public static final Block block = null;
	public BlockLichen(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lichen);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lichen"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}


	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lichen", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX, world.getSeaLevel(), chunkZ));
		if (biome instanceof BiomeCarboniferous) {
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Ice) {
				biomeCriteria = true;
			}
		}

		else if (dimID == 0) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.COLD))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.SNOWY))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
		}
		else {
			biomeCriteria = false;
		}
		if (!biomeCriteria)
			return;

		int GenChance = 20;
		//double GenMultiplier = LepidodendronConfig.multiplierTmesipteris;
		if (dimID == LepidodendronConfig.dimCarboniferous) {
			GenChance = 38;
		}
		//if (GenMultiplier < 0) {GenMultiplier = 0;}
		GenChance = Math.min(100, (int) Math.round((double) GenChance));
		//Is this a transformed biome?
		if (LepidodendronDecorationHandler.matchBiome(biome, LepidodendronConfig.genTransformBiomes)) {
			//if (biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":")).equalsIgnoreCase("minecraft"))
			GenChance = Math.min(GenChance * 10, 100);
		}

		for (int i = 0; i < (int) GenChance; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new LichenGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable  {
		
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool NORTH = PropertyBool.create("north");
   		public static final PropertyBool EAST = PropertyBool.create("east");
	    public static final PropertyBool SOUTH = PropertyBool.create("south");
	    public static final PropertyBool WEST = PropertyBool.create("west");
	    public static final PropertyBool UP = PropertyBool.create("up");
	    public static final PropertyBool DOWN = PropertyBool.create("down");
	    public static final PropertyBool SPREADABLE = PropertyBool.create("spreadable");
    
		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_lichen");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(0);
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, true));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){
	        
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
			
            if (blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
					&& blockState.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
					&& blockState1.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
					&& blockState2.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
					&& blockState3.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
					&& blockState4.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
					&& blockState5.getMaterial() == Material.ROCK)
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState2.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
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
			
            if (blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
					&& blockState.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.DOWN)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock = true;
					}
				}
				else
				{
					attachmentblock = true;
				}
            }

            if (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
					&& blockState1.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.UP)
	            {
					if ((blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock1 = true;
					}
				}
				else
				{
					attachmentblock1 = true;
				}
            }

            if (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
					&& blockState2.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.NORTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock2 = true;
					}
				}
				else
				{
					attachmentblock2 = true;
				}
            }

            if (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
					&& blockState3.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.EAST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
						) {
						attachmentblock3 = true;
					}
				}
				else
				{
					attachmentblock3 = true;
				}
            }

            if (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
					&& blockState4.getMaterial() == Material.ROCK)
            {
            	if (state.getValue(FACING) == EnumFacing.SOUTH)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState3.getBlockFaceShape(source, pos.east(), EnumFacing.WEST) == BlockFaceShape.SOLID
							&& blockState3.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
							&& blockState5.getMaterial() == Material.ROCK)
						) {
						attachmentblock4 = true;
					}
				}
				else
				{
					attachmentblock4 = true;
				}
            }

            if (blockState5.getBlockFaceShape(source, pos.west(), EnumFacing.EAST) == BlockFaceShape.SOLID
					&& blockState5.getMaterial() == Material.ROCK)
           	{
            	if (state.getValue(FACING) == EnumFacing.WEST)
	            {
					if ((blockState.getBlockFaceShape(source, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID
							&& blockState.getMaterial() == Material.ROCK)
						|| (blockState2.getBlockFaceShape(source, pos.north(), EnumFacing.SOUTH) == BlockFaceShape.SOLID
							&& blockState2.getMaterial() == Material.ROCK)
						|| (blockState1.getBlockFaceShape(source, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID
							&& blockState1.getMaterial() == Material.ROCK)
						|| (blockState4.getBlockFaceShape(source, pos.south(), EnumFacing.NORTH) == BlockFaceShape.SOLID
							&& blockState4.getMaterial() == Material.ROCK)
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
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, NORTH, SOUTH, EAST, WEST, UP, DOWN, SPREADABLE});
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
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta & 7)).withProperty(SPREADABLE, Boolean.valueOf((meta & 8) > 0));
			//return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			int i = 0;
	        i = i | ((EnumFacing) state.getValue(FACING)).getIndex();
	
	        if (((Boolean)state.getValue(SPREADABLE)).booleanValue())
	        {
	            i |= 8;
	        }
	
	        return i;
			
			//return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
				return this.getDefaultState().withProperty(FACING, facing);
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 00;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 00;
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
			
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = world.getBlockState(pos.south());
				if (world.isAirBlock(pos.south()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID
							|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = world.getBlockState(pos.north());
				if (world.isAirBlock(pos.north()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = world.getBlockState(pos.west());
				if (world.isAirBlock(pos.west()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = world.getBlockState(pos.east());
				if (world.isAirBlock(pos.east()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = world.getBlockState(pos.down());
				if (world.isAirBlock(pos.down()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = world.getBlockState(pos.up());
				if (world.isAirBlock(pos.up()) || 
					(
						(iblockstate.getBlockFaceShape(world, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						world.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) 
		{
			//Test the orientation of this block and then check if it is still connected:
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.NORTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.south());
				if (worldIn.isAirBlock(pos.south()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.south(), EnumFacing.NORTH) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.SOUTH) {
				IBlockState iblockstate = worldIn.getBlockState(pos.north());
				if (worldIn.isAirBlock(pos.north()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.north(), EnumFacing.SOUTH) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.EAST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.west());
				if (worldIn.isAirBlock(pos.west()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.west(), EnumFacing.EAST) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.WEST) {
				IBlockState iblockstate = worldIn.getBlockState(pos.east());
				if (worldIn.isAirBlock(pos.east()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.east(), EnumFacing.WEST) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.UP) {
				IBlockState iblockstate = worldIn.getBlockState(pos.down());
				if (worldIn.isAirBlock(pos.down()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}
			if ((EnumFacing) state.getValue(BlockDirectional.FACING) == EnumFacing.DOWN) {
				IBlockState iblockstate = worldIn.getBlockState(pos.up());
				if (worldIn.isAirBlock(pos.up()) || 
					(
						(iblockstate.getBlockFaceShape(worldIn, pos.up(), EnumFacing.DOWN) != BlockFaceShape.SOLID
								|| iblockstate.getMaterial() != Material.ROCK)
					)	
				)
					{
						worldIn.setBlockToAir(pos);
						EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						worldIn.spawnEntity(entityToSpawn);
					}
				}

			//So if the block is still here, can it spread?
			if ((worldIn.getBlockState(pos).getBlock() == this) & (Math.random() > 0.99)) {
				if ((Boolean) state.getValue(SPREADABLE)) {
					//System.err.println("Ticked a spreadable block");
					int spreadradius = (int) LepidodendronConfig.radiusLichen;
					if (spreadradius < 0) {spreadradius = 0;}
					if (spreadradius > 8) {spreadradius = 8;}

					//Pick a random block and a random face within the radius (including the block we are on):
					//Is there air at the face?
					
					//If this is the block we are on, can we pick a random face to place more on?
					//If it's full up, check a new block
					
					//If this is a different block, run the rules about what face can spread to what:

					int yct = Math.max(-spreadradius, -pos.getY());
					boolean gen = false;
					while (yct <= spreadradius && !gen) {
						int xct = -spreadradius;
						while (xct <= spreadradius && !gen) {
							int zct = -spreadradius;
							while (zct <= spreadradius && !gen) {
								if (Math.pow((int) Math.abs(xct), 2) + Math.pow((int) Math.abs(zct), 2) <= Math.pow((int) spreadradius, 2)) {
									//Within radius:
									BlockPos pos1 = pos.add(xct, yct, zct);
									IBlockState iblockstate = worldIn.getBlockState(pos1);
									if (!worldIn.isAreaLoaded(pos1, pos1)) {return;}
									//Get a random face of this chosen block:
									Random rnd = new Random();
									int bf = rnd.nextInt(6);
									switch (bf) {
										case 0 : //North
											//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.north())) 
												&& canPlaceBlockOnSide (worldIn, pos1.north(), EnumFacing.NORTH) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().north()), worldIn, pos1.up().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().north()), worldIn, pos1.up().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().north()), worldIn, pos1.down().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().north()), worldIn, pos1.down().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().north()), worldIn, pos1.east().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().north()), worldIn, pos1.east().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().north()), worldIn, pos1.west().north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().north()), worldIn, pos1.west().north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.north(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 1 : //South
										//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.south())) 
												&& canPlaceBlockOnSide (worldIn, pos1.south(), EnumFacing.SOUTH) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().south()), worldIn, pos1.up().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().south()), worldIn, pos1.up().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().south()), worldIn, pos1.down().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().south()), worldIn, pos1.down().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().south()), worldIn, pos1.east().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().south()), worldIn, pos1.east().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().south()), worldIn, pos1.west().south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().south()), worldIn, pos1.west().south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.south(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 2 : //East
											if ((worldIn.isAirBlock(pos1.east())) 
												&& canPlaceBlockOnSide (worldIn, pos1.east(), EnumFacing.EAST) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().east()), worldIn, pos1.up().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().east()), worldIn, pos1.up().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().east()), worldIn, pos1.down().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().east()), worldIn, pos1.down().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().east()), worldIn, pos1.north().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().east()), worldIn, pos1.north().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().east()), worldIn, pos1.south().east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().east()), worldIn, pos1.south().east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.east(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.EAST).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 3 : //West
											if ((worldIn.isAirBlock(pos1.west())) 
												&& canPlaceBlockOnSide (worldIn, pos1.west(), EnumFacing.WEST) ){
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.up().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up().west()), worldIn, pos1.up().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up().west()), worldIn, pos1.up().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down().west()), worldIn, pos1.down().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down().west()), worldIn, pos1.down().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().west()), worldIn, pos1.north().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().west()), worldIn, pos1.north().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().west()), worldIn, pos1.south().west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().west()), worldIn, pos1.south().west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}
												
											
												if (worldIn.getBlockState(pos1.up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.up()), worldIn, pos1.up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.down()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(UP) == true)
													|| (getActualState(worldIn.getBlockState(pos1.down()), worldIn, pos1.down()).getValue(FACING) == EnumFacing.DOWN))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.west(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.WEST).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 4 : //Up
											//Is there air here and is this face flat?
											if ((worldIn.isAirBlock(pos1.up())) 
												&& (canPlaceBlockOnSide (worldIn, pos1.up(), EnumFacing.UP))
												) {
												//Is there moss suitably placed to spread here?
												if (worldIn.getBlockState(pos1.north().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north().up()), worldIn, pos1.north().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north().up()), worldIn, pos1.north().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south().up()), worldIn, pos1.south().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south().up()), worldIn, pos1.south().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east().up()), worldIn, pos1.east().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east().up()), worldIn, pos1.east().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west().up()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west().up()), worldIn, pos1.west().up()).getValue(DOWN) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west().up()), worldIn, pos1.west().up()).getValue(FACING) == EnumFacing.UP))
													{
														gen = true;
													}
												}
												

												if (worldIn.getBlockState(pos1.north()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.south()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
													|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.east()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
													{
														gen = true;
													}
												}
												if (worldIn.getBlockState(pos1.west()).getBlock() == this)
												{
													if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
													|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
													{
														gen = true;
													}
												}

												
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.up(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}

										case 5 : //Down
										//Is there air here and is this face flat?
										if ((worldIn.isAirBlock(pos1.down())) 
											&& canPlaceBlockOnSide (worldIn, pos1.down(), EnumFacing.DOWN) ){
											//Is there moss suitably placed to spread here?
											if (worldIn.getBlockState(pos1.north().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.north().down()), worldIn, pos1.north().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.north().down()), worldIn, pos1.north().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.south().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.south().down()), worldIn, pos1.south().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.south().down()), worldIn, pos1.south().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.east().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.east().down()), worldIn, pos1.east().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.east().down()), worldIn, pos1.east().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.west().down()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.west().down()), worldIn, pos1.west().down()).getValue(UP) == true)
												|| (getActualState(worldIn.getBlockState(pos1.west().down()), worldIn, pos1.west().down()).getValue(FACING) == EnumFacing.DOWN))
												{
													gen = true;
												}
											}
											
										
											if (worldIn.getBlockState(pos1.north()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(SOUTH) == true)
												|| (getActualState(worldIn.getBlockState(pos1.north()), worldIn, pos1.north()).getValue(FACING) == EnumFacing.NORTH))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.south()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(NORTH) == true)
												|| (getActualState(worldIn.getBlockState(pos1.south()), worldIn, pos1.south()).getValue(FACING) == EnumFacing.SOUTH))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.east()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(WEST) == true)
												|| (getActualState(worldIn.getBlockState(pos1.east()), worldIn, pos1.east()).getValue(FACING) == EnumFacing.EAST))
												{
													gen = true;
												}
											}
											if (worldIn.getBlockState(pos1.west()).getBlock() == this)
											{
												if ((getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(EAST) == true)
												|| (getActualState(worldIn.getBlockState(pos1.west()), worldIn, pos1.west()).getValue(FACING) == EnumFacing.WEST))
												{
													gen = true;
												}
											}
												if (gen) {
													//Place the moss:
													worldIn.setBlockState(pos1.down(), this.blockState.getBaseState().withProperty(FACING, EnumFacing.DOWN).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST, false).withProperty(WEST, false).withProperty(UP, false).withProperty(DOWN, false).withProperty(SPREADABLE, false), 3);
												}
											}
										
									}
								}
								zct = zct + 1;
							}
							xct = xct + 1;
						}	
						yct = yct + 1;
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

		public static boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing)
		{
			BlockPos blockpos = pos.offset(facing.getOpposite());
			IBlockState iblockstate = worldIn.getBlockState(blockpos);
			Block block = iblockstate.getBlock();
			BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, blockpos, facing);
			boolean blockface  = true;
			if (facing == EnumFacing.NORTH) {
				if ((worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.south()).getMaterial() != Material.ROCK))
					blockface = false;
			}
			if (facing == EnumFacing.SOUTH) {
				if ((worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.north()).getMaterial() != Material.ROCK))
					blockface = false;
			}
			if (facing == EnumFacing.EAST) {
				if ((worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.west()).getMaterial() != Material.ROCK))
					blockface = false;
			}
			if (facing == EnumFacing.WEST) {
				if ((worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.east()).getMaterial() != Material.ROCK))
					blockface = false;
			}
			if (facing == EnumFacing.UP) {
				if ((worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.down()).getMaterial() != Material.ROCK))
					blockface = false;
			}
			if (facing == EnumFacing.DOWN) {
				if ((worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), facing) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.up()).getMaterial() != Material.ROCK))
					blockface = false;
			}

			return !isExceptBlockForAttachWithPiston(block) && blockface;

		}

		@Override
		public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
	    {
	    	boolean blockface  = true;
			if (side == EnumFacing.NORTH) {
	        	if ((worldIn.getBlockState(pos.south()).getBlockFaceShape(worldIn, pos.south(), side) != BlockFaceShape.SOLID)
	        		|| (worldIn.getBlockState(pos.south()).getMaterial() != Material.ROCK))
	        		blockface = false;
			}
			if (side == EnumFacing.SOUTH) {
	        	if ((worldIn.getBlockState(pos.north()).getBlockFaceShape(worldIn, pos.north(), side) != BlockFaceShape.SOLID)
	        		|| (worldIn.getBlockState(pos.north()).getMaterial() != Material.ROCK))
	        		blockface = false;
			}
			if (side == EnumFacing.EAST) {
	        	if ((worldIn.getBlockState(pos.west()).getBlockFaceShape(worldIn, pos.west(), side) != BlockFaceShape.SOLID)
	        		|| (worldIn.getBlockState(pos.west()).getMaterial() != Material.ROCK))
	        		blockface = false;
			}
			if (side == EnumFacing.WEST) {
	        	if ((worldIn.getBlockState(pos.east()).getBlockFaceShape(worldIn, pos.east(), side) != BlockFaceShape.SOLID)
						|| (worldIn.getBlockState(pos.east()).getMaterial() != Material.ROCK))
	        		blockface = false;
			}
			if (side == EnumFacing.UP) {
	        	if ((worldIn.getBlockState(pos.down()).getBlockFaceShape(worldIn, pos.down(), side) != BlockFaceShape.SOLID)
	        		|| (worldIn.getBlockState(pos.down()).getMaterial() != Material.ROCK))
	        		blockface = false;
			}
			if (side == EnumFacing.DOWN) {
	        	if ((worldIn.getBlockState(pos.up()).getBlockFaceShape(worldIn, pos.up(), side) != BlockFaceShape.SOLID)
					|| (worldIn.getBlockState(pos.up()).getMaterial() != Material.ROCK))
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
	        tooltip.add("Note: spreads to surrounding block faces.");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
