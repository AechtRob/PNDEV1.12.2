
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemAnthracite;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAnthraciteOre extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:anthracite_ore")
	public static final Block block = null;
	public BlockAnthraciteOre(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.anthracite_ore);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("anthracite_ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:anthracite_ore", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0
			|| dimID == LepidodendronConfig.dimCambrian
			|| dimID == LepidodendronConfig.dimOrdovician
			|| dimID == LepidodendronConfig.dimSilurian
			|| dimID == LepidodendronConfig.dimDevonian
			|| dimID == LepidodendronConfig.dimCarboniferous
			|| dimID == LepidodendronConfig.dimPermian
			|| dimID == LepidodendronConfig.dimTriassic
			|| dimID == LepidodendronConfig.dimJurassic
			|| dimID == LepidodendronConfig.dimCretaceous)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		for (int i = 0; i < 10; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(255) + 0;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 5, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
						blockCriteria = true;
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_anthracite_ore");
			setSoundType(SoundType.GROUND);
			setHardness(3F);
			setResistance(5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
			Random rand = world instanceof World ? ((World) world).rand : new Random();
			if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
				int i = MathHelper.getInt(rand, 1, 4);
				return i;
			}
			return 0;
		}

		@Override
		@Nullable
		public String getHarvestTool(IBlockState state)
		{
			return null;
		}

		@Override
		public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player) {
			return true;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(ItemAnthracite.block, 1).getItem();
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
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

	}
}
