
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.util.BlockSounds;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemMusicDiscBrontosaurus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:music_disc_brontosaurus")
	public static final Item block = null;
	public ItemMusicDiscBrontosaurus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.music_disc_brontosaurus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:music_disc_brontosaurus", "inventory"));
	}
	
	public static class ItemCustom extends ItemRecord {
		public ItemCustom() {
            super("brontosaurus", BlockSounds.MUSIC_DISC_BRONTOSAURUS);
			setTranslationKey("pf_music_disc_brontosaurus");
			setRegistryName("music_disc_brontosaurus");
			setCreativeTab(TabLepidodendronMisc.tab);
		}


	}
}
