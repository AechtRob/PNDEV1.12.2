
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
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
public class BlockLavaRockDiamondOre extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lava_rock_diamond_ore")
	public static final Block block = null;
	public BlockLavaRockDiamondOre(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lava_rock_diamond_ore);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lava_rock_diamond_ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lava_rock_diamond_ore", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == LepidodendronConfig.dimPrecambrian)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;

		if (random.nextInt(2) != 0)
			return;

		int x = chunkX + random.nextInt(16);
		int y = random.nextInt(15) + 1;
		int z = chunkZ + random.nextInt(16);
		(new WorldGenMinable(block.getDefaultState(), 4, new com.google.common.base.Predicate<IBlockState>() {
			public boolean apply(IBlockState blockAt) {
				boolean blockCriteria = false;
				IBlockState require;
				if (blockAt.getBlock() == BlockLavaRock.block.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}
		})).generate(world, random, new BlockPos(x, y, z));
	}

	public static class BlockCustom extends BlockOre {
		public BlockCustom() {
			super(MapColor.BLACK);
			setHardness(3.0F);
			setResistance(5.0F);
			setSoundType(SoundType.STONE);
			setTranslationKey("pf_lava_rock_diamond_ore");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune)
		{
			return Items.DIAMOND;
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
			Random rand = world instanceof World ? ((World)world).rand : new Random();
			if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
			{
				return MathHelper.getInt(rand, 3, 7);
			}
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
