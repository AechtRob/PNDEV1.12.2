
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.gen.MobSpawnGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockEggsXenacanthus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_xenacanthus_worldgen")
	public static final Block block = null;
	public BlockEggsXenacanthus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_xenacanthus_worldgen);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("eggs_xenacanthus_worldgen"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				//new ModelResourceLocation("lepidodendron:insect_eggs_eoarthropleura_worldgen", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockEggsXenacanthus.BlockCustom.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (
			(dimID != LepidodendronConfig.dimDevonian)
			&& (dimID != LepidodendronConfig.dimCarboniferous)
			
		)
		{
			return;
		}
		int minWaterDepth = 1;
		int waterDepthCheckMax = 10;
		int startHeight = world.getSeaLevel() - waterDepthCheckMax;
		for (int i = 0; i < (int) 3; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128 - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, i11, l14));
			if (biome instanceof BiomeCarboniferous) {
				BiomeCarboniferous biomeC = (BiomeCarboniferous) biome;
				if (biomeC.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp) {
					(new MobSpawnGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax);
				}
			}
			if (biome instanceof BiomeDevonian) {
				BiomeDevonian biomeD = (BiomeDevonian) biome;
				if (biomeD.getBiomeType() != EnumBiomeTypeDevonian.Ocean) {
					(new MobSpawnGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax);
				}
			}
		}
	}

	public static class BlockCustom extends BlockMobSpawn {
		public BlockCustom() {
			setTranslationKey("pf_eggs_xenacanthus_worldgen");
			//this.setTickRandomly(true);
			setCreativeTab(null);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockEggsXenacanthusPlaceable.block, (int) (1));
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);
			//Small chance of decaying:
			if (!(worldIn.isRemote) && rand.nextInt(45) == 0) {
				worldIn.destroyBlock(pos, false);
			}
		}

	}
}
