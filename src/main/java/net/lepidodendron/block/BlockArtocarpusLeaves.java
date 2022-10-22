
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockArtocarpusLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:artocarpus_leaves")
	public static final Block block = null;
	public BlockArtocarpusLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.artocarpus_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("artocarpus_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:artocarpus_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("dnaPNArtocarpus", BlockArtocarpusLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockArtocarpusLeaves.block);
		OreDictionary.registerOre("plant", BlockArtocarpusLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockArtocarpusLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_artocarpus_leaves");
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 20;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Drop air and use the seeds method instead:
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockArtocarpusSapling.block);
			}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			super.updateTick(worldIn, pos, state, rand);

			//Generate a fruit perhaps:
			if (rand.nextInt(10) == 0 && state.getValue(CHECK_DECAY) && state.getValue(DECAYABLE) && worldIn.isAirBlock(pos.down())) { //The leaves are natural, not player-placed
				//Make sure that there isn't already fruit nearby:
				boolean fruit = false;
				int x = -3;
				while (x <= 3 && !fruit) {
					int y = -3;
					while (y <= 3 && !fruit) {
						int z = -3;
						while (z <= 3 && !fruit) {
							if (worldIn.getBlockState(pos.add(x, y, z)).getBlock() == BlockArtocarpusFruitBlock.block) {
								fruit = true;
							}
							z ++;
						}
						y ++;
					}
					x ++;
				}
				if (!fruit) {
					worldIn.setBlockState(pos.down(), BlockArtocarpusFruitBlock.block.getDefaultState());
				}
			}
		}


	}
}
