
package net.lepidodendron.item.entities;

import net.minecraft.item.ItemFood;

import javax.annotation.Nullable;

public abstract class ItemPNTaxidermyItem extends ItemFood {

	public ItemPNTaxidermyItem(int i, float f, boolean bool) {
		super(i, f, bool);
		setMaxStackSize(64);
	}

	@Nullable
	public String getVariantStr() {
		return null;
	}

}
