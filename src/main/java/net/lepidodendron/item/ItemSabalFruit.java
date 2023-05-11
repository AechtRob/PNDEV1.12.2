
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSabalFruit extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sabal_fruit")
	public static final Item block = null;
	public ItemSabalFruit(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sabal_fruit);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:sabal_fruit", "inventory"));
	}
	public static class ItemCustom extends ItemFood {
		public ItemCustom() {
			super(2, 0.3f, false);
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_sabal_fruit");
			setRegistryName("sabal_fruit");
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
