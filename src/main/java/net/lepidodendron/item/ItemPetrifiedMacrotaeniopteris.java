
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPetrifiedMacrotaeniopteris extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:petrified_macrotaeniopteris")
	public static final Item block = null;
	public ItemPetrifiedMacrotaeniopteris(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.petrified_macrotaeniopteris);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:petrified_macrotaeniopteris", "inventory"));
	}
	public static class ItemCustom extends ItemPetrified {
		public ItemCustom() {
			super(null);
			setTranslationKey("pf_petrified_macrotaeniopteris");
			setRegistryName("petrified_macrotaeniopteris");

		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Cycadale water plant");
				tooltip.add("Periods: Triassic");
				tooltip.add("Note: placed at water surface of one-block deep water, over dirt, clay or sand.");
				tooltip.add("Propagation: fruit/cone");}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Override
		public ItemStack getPlantStack() {
			return new ItemStack(ItemMacrotaeniopterisItem.block, 1);
		}

	}
}
