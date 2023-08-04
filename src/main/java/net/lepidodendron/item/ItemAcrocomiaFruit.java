
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockAcrocomiaFruitBunch;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemAcrocomiaFruit extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acrocomia_fruit")
	public static final Item block = null;
	public ItemAcrocomiaFruit(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acrocomia_fruit);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("itemFruit", ItemAcrocomiaFruit.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:acrocomia_fruit", "inventory"));
	}

	public static class ItemCustom extends ItemFood {
		public ItemCustom() {
			super(2, 0.3f, false);
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_acrocomia_fruit");
			setRegistryName("acrocomia_fruit");
			setCreativeTab(TabLepidodendronPlants.tab);
		}

		@Override
		public int getMaxItemUseDuration(ItemStack stack) {
			return 60;
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
