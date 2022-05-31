
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.world.biome.jurassic.BiomeJurassicSandbanks;
import net.lepidodendron.world.biome.jurassic.BiomeJurassicSandbanksRaised;
import net.lepidodendron.world.gen.ShellyReefGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
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

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockShelly extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:shelly_reef")
	public static final Block block = null;
	public BlockShelly(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.shelly_reef);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("shelly_reef"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:shelly_reef", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		Biome biome = world.getBiome(new BlockPos(chunkX, world.getSeaLevel(), chunkZ));
		boolean dimensionCriteria = false;
		if (shouldGenerateInDimension(dimID, LepidodendronConfig.dimShellyReef))
			dimensionCriteria = true;
		if (biome == BiomeJurassicSandbanks.biome
				|| biome == BiomeJurassicSandbanksRaised.biome) {
			dimensionCriteria = true;
		}
		if (!dimensionCriteria)
			return;

		boolean biomeCriteria = false;

		if (!matchBiome(biome, LepidodendronConfig.genShellyReefBlacklistBiomes)) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
				biomeCriteria = true;
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.DEAD))
				biomeCriteria = false;
		}
		if (matchBiome(biome, LepidodendronConfig.genShellyReefOverrideBiomes))
			biomeCriteria = true;

		if (biome == BiomeJurassicSandbanks.biome
				|| biome == BiomeJurassicSandbanksRaised.biome) {
			biomeCriteria = true;
		}

		if (!biomeCriteria)
			return;

		int multiplier = 1;

		if (biome == BiomeJurassicSandbanks.biome
				|| biome == BiomeJurassicSandbanksRaised.biome) {
			multiplier = 5;
		}

		for (int i = 0; i < (int) 10 * multiplier; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128);
			int l14 = chunkZ + random.nextInt(16) + 8;
			(new ShellyReefGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14));
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

	public static class BlockCustom extends BlockFalling {

		public BlockCustom() {
			super(Material.CORAL);
			setTranslationKey("pf_shelly_reef");
			setSoundType(SoundType.STONE);
			setHardness(2.0F);
			setResistance(2.0F);
			setLightLevel(0.5F);
			setLightOpacity(0);
			//this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Deprecated
		@SideOnly(Side.CLIENT)
		public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos)
		{
			int i = source.getCombinedLight(pos, state.getLightValue(source, pos));

			if (i == 0)
			{
				pos = pos.down();
				state = source.getBlockState(pos);
				return source.getCombinedLight(pos, state.getLightValue(source, pos));
			}
			else
			{
				return i;
			}
		}

		//@Override
		//public boolean isOpaqueCube(IBlockState state)
		//{
			//return false;
		//}

		//@Override
		//public boolean isFullCube(IBlockState state)
		//{
		//	return false;
		//}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
			//System.err.println("Placed by: " + placer);
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			EnumFacing enumfacing = EnumFacing.byIndex(meta);

			if (enumfacing.getAxis() == EnumFacing.Axis.Y)
			{
				enumfacing = EnumFacing.NORTH;
			}

			return this.getDefaultState().withProperty(FACING, enumfacing);
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return ((EnumFacing)state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
		}

		@SuppressWarnings("deprecation")
		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
		}

		@Override
		protected BlockStateContainer createBlockState() {
			return new BlockStateContainer(this, new IProperty[]{FACING});
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
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.CLAY;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.GRAVEL, (int) (1)).getItem();
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.SOLID;
		}

	}
}
