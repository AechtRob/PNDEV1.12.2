
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
public class ItemEggsJinyunpelta extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_jinyunpelta")
	public static final Item block = null;
	public ItemEggsJinyunpelta(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_jinyunpelta);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_jinyunpelta", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("egg", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("eggCookable", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("listAllegg", ItemEggsJinyunpelta.block);
		OreDictionary.registerOre("objectEgg", ItemEggsJinyunpelta.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_jinyunpelta");
			setRegistryName("eggs_jinyunpelta");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_jinyunpelta";
		}
	}

}
