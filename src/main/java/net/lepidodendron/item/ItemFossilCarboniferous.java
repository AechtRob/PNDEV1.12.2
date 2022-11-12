
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemFossilCarboniferous extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:fossil_drop_carboniferous")
	public static final Item block = null;

	public ItemFossilCarboniferous(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.fossil_carboniferous);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:fossils/fossil_drop_carboniferous", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_fossil_drop_carboniferous");
			setRegistryName("fossil_drop_carboniferous");
			maxStackSize = 64;
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					return super.getTranslationKey(stack) + "_plant";
				}
				else if (stack.getTagCompound().hasKey("PFMob")) {
					return super.getTranslationKey(stack) + "_mob";
				}
				else if (stack.getTagCompound().hasKey("PFStatic")) {
					return super.getTranslationKey(stack) + "_static";
				}
			}
			return super.getTranslationKey(stack);
		}

	}
}
