
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockVolcanicAsh extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:volcanic_ash")
	public static final Block block = null;
	public BlockVolcanicAsh(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.volcanic_ash);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("volcanic_ash"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:volcanic_ash", "inventory"));
	}
	
	public static class BlockCustom extends BlockFalling {
		public BlockCustom() {
			super(Material.SAND);
			this.setSoundType(SoundType.SAND);
			setTranslationKey("pf_volcanic_ash");
			setHardness(0.2F);
			setResistance(0.2F);
			setHarvestLevel("shovel", 0);
			setCreativeTab(TabLepidodendronMisc.tab);
		}
	    
	}
}
