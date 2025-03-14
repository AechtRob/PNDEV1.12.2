
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.item.ItemGlassCaseDisplayItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemScorpionPulmonoscorpiusRaw extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:scorpion_pulmonoscorpius_raw")
	public static final Item block = null;
	public ItemScorpionPulmonoscorpiusRaw(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.scorpion_pulmonoscorpius_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("mobdnaPNlepidodendron:prehistoric_flora_scorpion_pulmonoscorpius", ItemScorpionPulmonoscorpiusRaw.block);
		OreDictionary.registerOre("pnfurnaceBug", ItemScorpionPulmonoscorpiusRaw.block);
		OreDictionary.registerOre("pndietBug", ItemScorpionPulmonoscorpiusRaw.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/scorpion_pulmonoscorpius_raw", "inventory"));
	}
	public static class ItemFoodCustom extends ItemGlassCaseDisplayItem {
		public ItemFoodCustom() {
			super(1, 0.05f, false);
			setTranslationKey("pf_scorpion_pulmonoscorpius_raw");
			setRegistryName("scorpion_pulmonoscorpius_raw");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(64);
		}

		@Nullable
		@Override
		public String getMobStr() {
			return "lepidodendron:prehistoric_flora_scorpion_pulmonoscorpius";
		}

		@Nullable
		@Override
		public String getVariantStr() {
			return null;
		}
	}
}
