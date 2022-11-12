
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
import net.minecraft.init.Items;
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

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAppleLeaves extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:apple_leaves")
	public static final Block block = null;
	public BlockAppleLeaves(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.apple_leaves);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("apple_leaves"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:apple_leaves", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNapple_sapling", BlockAppleLeaves.block);
		OreDictionary.registerOre("plantPrehistoric", BlockAppleLeaves.block);
		OreDictionary.registerOre("plant", BlockAppleLeaves.block);
		OreDictionary.registerOre("treeLeaves", BlockAppleLeaves.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			setTranslationKey("pf_apple_leaves");
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			if (LepidodendronConfig.doPropagation) {
				return 5;
			}
			else {
				return 20;
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				return new ItemStack(Items.APPLE, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockAppleSapling.block);
			}
		}

		@Override
		protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
		{
			if (worldIn.rand.nextInt(chance) == 0)
			{
				spawnAsEntity(worldIn, pos, new ItemStack(Items.APPLE));
			}
		}

	}
}
