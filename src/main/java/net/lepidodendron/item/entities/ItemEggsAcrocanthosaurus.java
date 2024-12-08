
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
public class ItemEggsAcrocanthosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_acrocanthosaurus")
	public static final Item block = null;
	public ItemEggsAcrocanthosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_acrocanthosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_acrocanthosaurus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("egg", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAcrocanthosaurus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAcrocanthosaurus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_acrocanthosaurus");
			setRegistryName("eggs_acrocanthosaurus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_acrocanthosaurus";
		}
	}

}

