
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
public class ItemEggsAnurognathidCascocauda extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_anurognathid_cascocauda")
	public static final Item block = null;
	public ItemEggsAnurognathidCascocauda(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_anurognathid_cascocauda);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_anurognathid_cascocauda", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("egg", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAnurognathidCascocauda.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAnurognathidCascocauda.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_anurognathid_cascocauda");
			setRegistryName("eggs_anurognathid_cascocauda");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_anurognathid@cascocauda";
		}

	}

}
