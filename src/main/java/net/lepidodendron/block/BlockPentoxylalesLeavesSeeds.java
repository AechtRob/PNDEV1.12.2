
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLeavesPF;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemPentoxylalesSeeds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockPentoxylalesLeavesSeeds extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:pentoxylales_leaves_seeds")
	public static final Block block = null;
	public BlockPentoxylalesLeavesSeeds(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.pentoxylales_leaves_seeds);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("pentoxylales_leaves_seeds"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:pentoxylales_leaves_seeds", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:pentoxylales_sapling", BlockPentoxylalesLeavesSeeds.block);
		OreDictionary.registerOre("plantPrehistoric", BlockPentoxylalesLeavesSeeds.block);
		OreDictionary.registerOre("plant", BlockPentoxylalesLeavesSeeds.block);
		OreDictionary.registerOre("treeLeaves", BlockPentoxylalesLeavesSeeds.block);
	}

	public static class BlockCustom extends BlockLeavesPF {
		public BlockCustom() {
			super();
			setTranslationKey("pf_pentoxylales_leaves_seeds");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, true).withProperty(DECAYABLE, true));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_PENTOXYLALES;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			if (LepidodendronConfig.doPropagation) {
				return 1;
			}
			else {
				return 20;
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Use the seeds method instead:
				return new ItemStack(ItemPentoxylalesSeeds.block, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockPentoxylalesSapling.block);
			}
		}

	}
}