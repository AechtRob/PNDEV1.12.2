
package net.lepidodendron.item;

import net.lepidodendron.creativetab.TabLepidodendronPlants;
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
		setCreativeTab(TabLepidodendronPlants.tab);
	}

	public ItemStack getPlantStack() {
		return new ItemStack(this.plantBlock, 1);
	}

	public boolean PrecambrianKnowledge() {
		return false;
	}

	public boolean CambrianKnowledge() {
		return false;
	}

	public boolean OrdovicianSilurianKnowledge() {
		return false;
	}

	public boolean DevonianKnowledge() {
		return false;
	}

	public boolean CarboniferousKnowledge() {
		return false;
	}

	public boolean PermianKnowledge() {
		return false;
	}

	public boolean TriassicKnowledge() {
		return false;
	}

	public boolean JurassicKnowledge() {
		return false;
	}

	public boolean CretaceousKnowledge() {
		return false;
	}

	public boolean PaleogeneKnowledge() {
		return false;
	}

	public boolean NeogeneKnowledge() {
		return false;
	}

	public boolean PleistoceneKnowledge() {
		return false;
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
