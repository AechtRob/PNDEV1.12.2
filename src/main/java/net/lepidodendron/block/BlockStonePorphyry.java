
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
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
		if (dimID == 0
				|| dimID == LepidodendronConfig.dimPrecambrian
				|| dimID == LepidodendronConfig.dimCambrian
				|| dimID == LepidodendronConfig.dimOrdovician
				|| dimID == LepidodendronConfig.dimSilurian
				|| dimID == LepidodendronConfig.dimDevonian
				|| dimID == LepidodendronConfig.dimCarboniferous
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimCretaceous
				|| dimID == LepidodendronConfig.dimPaleogene
				|| dimID == LepidodendronConfig.dimNeogene
				|| dimID == LepidodendronConfig.dimPleistocene) {
			for (int l1 = 0; l1 < 3; ++l1) {
				int x = chunkX + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
				int y = random.nextInt(80) + 1; //Level 1 to 80
				int z = chunkZ + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
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
			super(Material.ROCK);
			setTranslationKey("pf_porphyry");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 0);
			setHardness(1.5F);
			setResistance(6.0F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}
	}
}
