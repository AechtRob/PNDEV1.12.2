
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemFossilJurassic extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:fossil_drop_jurassic")
	public static final Item block = null;

	public ItemFossilJurassic(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.fossil_jurassic);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:fossils/fossil_drop_jurassic", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_fossil_drop_jurassic");
			setRegistryName("fossil_drop_jurassic");
			maxStackSize = 64;
			setCreativeTab(null);
		}

	}
}
