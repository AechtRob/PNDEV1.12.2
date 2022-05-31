
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockBalticAmberOre extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:baltic_amber_ore")
	public static final Block block = null;
	public BlockBalticAmberOre(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.baltic_amber_ore);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("baltic_amber_ore"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:baltic_amber_ore", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		boolean biomeCriteria = false;
		Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
		if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH))
			biomeCriteria = true;		
		if (!biomeCriteria)
			return;
		int SeaLevel = world.getSeaLevel();
		if (SeaLevel < 1) SeaLevel = 1;
		if (SeaLevel > 200) SeaLevel = 200;
		for (int i = 0; i < 8; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(18) + (SeaLevel - 10);
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 4, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					if ((blockAt.getBlock() == Blocks.SAND.getStateFromMeta(0).getBlock()) || (blockAt.getBlock() == Blocks.SANDSTONE.getStateFromMeta(0).getBlock())) 
						blockCriteria = true;
						//System.err.println(world.getBlockState(new BlockPos(x, y, z)).getMaterial());
						//if (blockCriteria) System.err.println("Spawning at " + x + " " + y + " " + z);
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}
	
	public static class BlockCustom extends BlockFalling {
		public BlockCustom() {
			super(Material.SAND);
			setTranslationKey("pf_baltic_amber_ore");
			setSoundType(SoundType.SAND);
			setHarvestLevel("shovel", 1);
			setHardness(0.5F);
			setResistance(0.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.SAND, (int) (1), 0));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }
	}
}
