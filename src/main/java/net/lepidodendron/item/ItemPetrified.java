
package net.lepidodendron.item;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemPetrified extends Item {

	private Block plantBlock;

	public ItemPetrified(@Nullable Block plantBlock) {
		setMaxDamage(0);
		maxStackSize = 64;
		this.plantBlock = plantBlock;
		setCreativeTab(null);
	}

	public ItemStack getPlantStack() {
		return new ItemStack(this.plantBlock, 1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		if (this.plantBlock != null) {
			this.plantBlock.addInformation(stack, player, tooltip, advanced);
		}
		super.addInformation(stack, player, tooltip, advanced);
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

}
