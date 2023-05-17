
package net.lepidodendron.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public abstract class ItemGlassCaseDisplayItem extends Item {
	public ItemGlassCaseDisplayItem() {
		setMaxDamage(0);
		maxStackSize = 64;
	}

	@Override
	public int getItemEnchantability() {
		return 0;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
		return 1F;
	}

	@Nullable
	public abstract String getMobStr();

	@Nullable
	public abstract String getVariantStr();

}