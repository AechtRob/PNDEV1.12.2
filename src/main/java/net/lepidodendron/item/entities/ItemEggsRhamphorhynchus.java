
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
public class ItemEggsRhamphorhynchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_rhamphorhynchus")
	public static final Item block = null;
	public ItemEggsRhamphorhynchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_rhamphorhynchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_rhamphorhynchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("egg", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsRhamphorhynchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsRhamphorhynchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_rhamphorhynchus");
			setRegistryName("eggs_rhamphorhynchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_rhamphorhynchus";
		}
	}

}
