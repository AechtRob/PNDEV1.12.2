
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemFossilDevonian;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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
public class BlockFossilDevonian extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:fossil_devonian")
	public static final Block block = null;

	public BlockFossilDevonian(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.fossil_devonian);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("fossil_devonian"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:fossil_devonian", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if ((dimID == 0
				|| dimID == LepidodendronConfig.dimPleistocene
				|| dimID == LepidodendronConfig.dimNeogene
				|| dimID == LepidodendronConfig.dimPaleogene
				|| dimID == LepidodendronConfig.dimCretaceous
				|| dimID == LepidodendronConfig.dimJurassic
				|| dimID == LepidodendronConfig.dimTriassic
				|| dimID == LepidodendronConfig.dimPermian
				|| dimID == LepidodendronConfig.dimCarboniferous
		) && LepidodendronConfig.genFossil)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;

		int blockCount = 8;

		int dimDepth = 40;
		if (dimID == LepidodendronConfig.dimCarboniferous) {
			dimDepth = dimDepth - 32;
			blockCount = 5;
		}
		if (dimID == LepidodendronConfig.dimPermian) {
			dimDepth = dimDepth - 28;
			blockCount = 5;
		}
		if (dimID == LepidodendronConfig.dimTriassic) {
			dimDepth = dimDepth - 24;
			blockCount = 6;
		}
		if (dimID == LepidodendronConfig.dimJurassic) {
			dimDepth = dimDepth - 20;
			blockCount = 6;
		}
		if (dimID == LepidodendronConfig.dimCretaceous) {
			dimDepth = dimDepth - 16;
			blockCount = 7;
		}
		if (dimID == LepidodendronConfig.dimPaleogene) {
			dimDepth = dimDepth - 12;
			blockCount = 7;
		}
		if (dimID == LepidodendronConfig.dimNeogene) {
			dimDepth = dimDepth - 8;
		}
		if (dimID == LepidodendronConfig.dimPleistocene) {
			dimDepth = dimDepth - 4;
		}
		int yy = Math.max(world.getSeaLevel() - dimDepth, 1);

		for (int i = 0; i < 32; i++) {
			int x = chunkX + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
			int y = yy; //Anywhere in the layer which is 4 thick (0-3) //NO th evanilal generator already does this!
			int z = chunkZ + random.nextInt(16);// ffs they built in the offset to the vanilla WorldGenMineable! + 8;
			if (random.nextInt(dimDepth) == 0) {
				(new WorldGenMinable(block.getDefaultState(), blockCount, new com.google.common.base.Predicate<IBlockState>() {
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

	public static class BlockCustom extends BlockFossil {
		public BlockCustom() {
			setTranslationKey("pf_fossil_devonian");
		}

		@Override
		public ItemStack getFossilDrop() {
			return new ItemStack(ItemFossilDevonian.block, 1);
		}
	}
}
