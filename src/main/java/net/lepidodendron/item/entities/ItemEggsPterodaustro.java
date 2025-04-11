
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
public class ItemEggsPterodaustro extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_pterodaustro")
	public static final Item block = null;
	public ItemEggsPterodaustro(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_pterodaustro);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_pterodaustro", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("egg", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("eggCookable", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("listAllegg", ItemEggsPterodaustro.block);
		OreDictionary.registerOre("objectEgg", ItemEggsPterodaustro.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_pterodaustro");
			setRegistryName("eggs_pterodaustro");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_pterodaustro";
		}
	}

}
