
package net.lepidodendron.item;

import net.minecraft.item.ItemFood;

import javax.annotation.Nullable;

public abstract class ItemGlassCaseDisplayItem extends ItemFood {
	public ItemGlassCaseDisplayItem(int i, float f, boolean bool) {
		super(i, f, bool);
		setMaxStackSize(64);
	}

	public ItemGlassCaseDisplayItem() {
		super(0, 0, false);
		setMaxStackSize(64);
	}

	@Nullable
	public abstract String getMobStr();

	@Nullable
	public abstract String getVariantStr();

}