
package net.lepidodendron.item.entities;

import net.minecraft.item.ItemFood;

public abstract class ItemPNTaxidermyItem extends ItemFood {

	public ItemPNTaxidermyItem(int i, float f, boolean bool) {
		super(i, f, bool);
		setMaxStackSize(64);
	}

}
