
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockFenceSpecialPF;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockZirconGlassPane extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:zircon_glass_pane")
	public static final Block block = null;
	public BlockZirconGlassPane(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.zircon_glass_pane);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("paneGlass", BlockZirconGlassPane.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomPF().setRegistryName("zircon_glass_pane"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:zircon_glass_pane", "inventory"));
	}

	public static class BlockCustomPF extends BlockFenceSpecialPF {
		public BlockCustomPF() {
			super();
			setSoundType(SoundType.GLASS);
			setTranslationKey("pf_zircon_glass_pane");
			setHardness(0.3F);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public int quantityDropped(Random random) {
			return 0;
		}

		@Override
		protected boolean canSilkHarvest() {
			return true;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

	}
}
