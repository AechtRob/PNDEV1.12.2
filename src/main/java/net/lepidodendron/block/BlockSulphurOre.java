
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemSulphur;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSulphurOre extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sulphur_ore")
	public static final Block block = null;
	public BlockSulphurOre(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sulphur_ore);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sulphur_ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sulphur_ore", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == LepidodendronConfig.dimPermian)
			dimensionCriteria = true;

		Biome biome = world.getBiome(new BlockPos(chunkX, world.getSeaLevel(), chunkZ));
		if (biome instanceof BiomePermian) {
			BiomePermian BiomeP = (BiomePermian) biome;
			if (BiomeP.getBiomeType() != EnumBiomeTypePermian.Floodbasalt) {
				dimensionCriteria = false;
			}
		}
		if (!dimensionCriteria)
			return;

		if (random.nextInt(6) != 0)
			return;

		int x = chunkX + random.nextInt(16);
		int y = random.nextInt(40) + 1;
		int z = chunkZ + random.nextInt(16);
		(new WorldGenMinable(block.getDefaultState(), 8, new com.google.common.base.Predicate<IBlockState>() {
			public boolean apply(IBlockState blockAt) {
				boolean blockCriteria = false;
				IBlockState require;
				if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}
		})).generate(world, random, new BlockPos(x, y, z));
	}

	public static class BlockCustom extends BlockOre {
		public BlockCustom() {
			setHardness(1.25F);
			setResistance(5.0F);
			setSoundType(SoundType.STONE);
			setTranslationKey("pf_sulphur_ore");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return ItemSulphur.block;
		}

		@Override
		public int quantityDropped(Random random)
		{
			return 1;
		}

		@Override
		public int quantityDroppedWithBonus(int fortune, Random random)
		{
			if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
			{
				int i = random.nextInt(fortune + 2) - 1;

				if (i < 0)
				{
					i = 0;
				}

				return this.quantityDropped(random) * (i + 1);
			}
			else
			{
				return this.quantityDropped(random);
			}
		}

		@Override
		public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
		{
			super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
		}

		@Override
		public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
		{
			return 0;
		}

		@Override
		public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
		{
			return new ItemStack(this);
		}

		@Override
		public int damageDropped(IBlockState state)
		{
			return 0;
		}

	}
}
