
package net.lepidodendron.creativetab;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.item.ItemFossilHammer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class TabLepidodendronMisc extends ElementsLepidodendronMod.ModElement {
	public TabLepidodendronMisc(ElementsLepidodendronMod instance) {
		super(instance, 173);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tablepidodendronmisc") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ItemFossilHammer.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		};
	}
	public static CreativeTabs tab;
}
