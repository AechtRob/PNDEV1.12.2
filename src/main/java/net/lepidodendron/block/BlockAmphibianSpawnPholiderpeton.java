
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.gen.MobSpawnGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
public class BlockAmphibianSpawnPholiderpeton extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:amphibian_spawn_pholiderpeton_worldgen")
	public static final Block block = null;
	public BlockAmphibianSpawnPholiderpeton(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.amphibian_spawn_pholiderpeton);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("amphibian_spawn_pholiderpeton_worldgen"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				//new ModelResourceLocation("lepidodendron:mobspawn_carboniferous", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockAmphibianSpawnPholiderpeton.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (dimID != LepidodendronConfig.dimPermian) {
			return;
		}

		int minWaterDepth = 1;
		int waterDepthCheckMax = 10;
		int startHeight = world.getSeaLevel() - waterDepthCheckMax;
		for (int i = 0; i < (int) 1; i++) {
			int l6 = chunkX + random.nextInt(16) + 8;
			int i11 = random.nextInt(128 - startHeight) + startHeight;
			int l14 = chunkZ + random.nextInt(16) + 8;
			Biome biome = world.getBiome(new BlockPos(l6, i11, l14));
			if (biome instanceof BiomePermian) {
				BiomePermian biomeP = (BiomePermian) biome;
				if (biomeP.getBiomeType() == EnumBiomeTypePermian.Wetlands) {
					(new MobSpawnGenerator((Block) block)).generate(world, random, new BlockPos(l6, i11, l14), minWaterDepth, waterDepthCheckMax);
				}
			}
		}
	}
	
	public static class BlockCustom extends BlockMobSpawn  {
		public BlockCustom() {
			setTranslationKey("pf_amphibian_spawn_pholiderpeton_worldgen");
			//this.setTickRandomly(true);
			setCreativeTab(null);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Items.SLIME_BALL, (int) (1)).getItem();
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockAmphibianSpawnPholiderpetonPlaceable.block, (int) (1));
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
