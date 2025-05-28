
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
public class ItemEggsSarcosuchus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_sarcosuchus")
	public static final Item block = null;
	public ItemEggsSarcosuchus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_sarcosuchus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_sarcosuchus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("egg", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsSarcosuchus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsSarcosuchus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_sarcosuchus");
			setRegistryName("eggs_sarcosuchus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_sarcosuchus";
		}
	}

}
