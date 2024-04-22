
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
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
public class BlockStonePorphyry extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:porphyry")
	public static final Block block = null;
	public BlockStonePorphyry(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.porphyry);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("porphyry"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:porphyry", "inventory"));
	}


	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if ((dimID == 0 && LepidodendronConfig.genStone)
				|| dimID == LepidodendronConfig.dimPrecambrian
				|| dimID == LepidodendronConfig.dimCambrian
				|| dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceousEarly
				|| dimID == LepidodendronConfig.dimPaleogene
				|| dimID == LepidodendronConfig.dimNeogene
				|| dimID == LepidodendronConfig.dimPleistocene) {
			int height = 80;
			if (dimID == LepidodendronConfig.dimPrecambrian) {
				height = 170;
			}
			for (int l1 = 0; l1 < 2; ++l1) {
				int x = chunkX + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
				int z = chunkZ + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
				if (world.getBiome(new BlockPos(x, 0, z)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa")
						|| world.getBiome(new BlockPos(x, 0, z)).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_desert_spikes")) {
					height = Functions.getAdjustedSeaLevel(world, new BlockPos(x, 0, z)) - 6;
				}
				int y = random.nextInt(height) + 1; //Level y
				(new WorldGenMinable(block.getDefaultState(), 13, new com.google.common.base.Predicate<IBlockState>() {
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
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK, MapColor.RED);
			setTranslationKey("pf_porphyry");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 0);
			setHardness(2.0F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}
	}
}
