
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockWoodenSlabPF;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAlpiaSlab extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:alpia_slab")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("lepidodendron:alpia_slab_double")
	public static final Block block_slab_double = null;
	public BlockAlpiaSlab(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.alpia_slab);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("alpia_slab"));
		elements.blocks.add(() -> new BlockCustom.Double().setRegistryName("alpia_slab_double"));
		elements.items.add(() -> new ItemSlab(block, (BlockSlab) block, (BlockSlab) block_slab_double).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:alpia_slab", "inventory"));
	}
	public static class BlockCustom extends BlockWoodenSlabPF {
		public BlockCustom() {
			setTranslationKey("pf_alpia_slab");
		}
	}
}
