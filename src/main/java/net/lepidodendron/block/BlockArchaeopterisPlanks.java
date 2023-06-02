
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockPlanksPF;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockArchaeopterisPlanks extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archaeopteris_planks")
	public static final Block block = null;
	public BlockArchaeopterisPlanks(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archaeopteris_planks);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("archaeopteris_planks"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:archaeopteris_planks", "inventory"));
	}
	public static class BlockCustom extends BlockPlanksPF {
		public BlockCustom() {
			setTranslationKey("pf_archaeopteris_planks");
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				if (!Loader.isModLoaded("pndevonian")) {
					tooltip.add("NOTE: Used to build the portal to the Devonian dimension but you do not have that dimension mod installed");
				}
				else {
					tooltip.add("NOTE: Used to build the portal to the Devonian dimension");
				}
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}
