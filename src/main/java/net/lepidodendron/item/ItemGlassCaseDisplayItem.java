
package net.lepidodendron.item;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

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

	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.NONE;
	}

	@Nullable
	public abstract String getMobStr();

	@Nullable
	public abstract String getVariantStr();

}