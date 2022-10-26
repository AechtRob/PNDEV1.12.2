
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemEggsAulacephalodon extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_aulacephalodon")
	public static final Item block = null;
	public ItemEggsAulacephalodon(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_aulacephalodon);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_aulacephalodon", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("egg", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAulacephalodon.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAulacephalodon.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_aulacephalodon");
			setRegistryName("eggs_aulacephalodon");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_aulacephalodon";
		}
	}

}
