
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLogPF;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSatpuraphyllumLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:satpuraphyllum_log")
	public static final Block block = null;
	public BlockSatpuraphyllumLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.satpuraphyllum_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("satpuraphyllum_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:satpuraphyllum_log", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//OreDictionary.registerOre("plantdnaPNlepidodendron:satpuraphyllum_sapling", BlockDicroidiumFLog.block);
		OreDictionary.registerOre("logWood", BlockSatpuraphyllumLog.block);
	}

	public static class BlockCustom extends BlockLogPF {

		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public BlockCustom() {
			setTranslationKey("pf_satpuraphyllum_log");
		}

	}
}
