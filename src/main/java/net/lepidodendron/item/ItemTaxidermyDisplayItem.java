
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemTaxidermyDisplayItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:taxidermy_display_item")
	public static final Item block = null;
	public ItemTaxidermyDisplayItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.taxidermy_display_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:taxidermy_display_item", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_taxidermy_display_item");
			setRegistryName("taxidermy_display_item");
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (getMobFromStack(stack)) {
				if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					return I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name").trim()
							+ " " + I18n.translateToLocal("wordjoiner.for.name").trim() + " "
							+ I18n.translateToLocal("entity." + getDNAStr(resourcelocation) + ".name").trim();
				}
			}
			return super.getItemStackDisplayName(stack);
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

		public static boolean getMobFromStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| ((!stack.getTagCompound().hasKey("PFMob")))
			) {
				return false;
			}
			return true;
		}

		public static String getDNAStr(String string) {
			string = string.replace("lepidodendron:", "");
			return string;
		}

	}

}
