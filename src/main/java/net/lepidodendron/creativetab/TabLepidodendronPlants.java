
package net.lepidodendron.creativetab;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAntarcticycas;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class TabLepidodendronPlants extends ElementsLepidodendronMod.ModElement {
	public TabLepidodendronPlants(ElementsLepidodendronMod instance) {
		super(instance, 173);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tablepidodendronplants") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlockAntarcticycas.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		};
	}
	public static CreativeTabs tab;
}
