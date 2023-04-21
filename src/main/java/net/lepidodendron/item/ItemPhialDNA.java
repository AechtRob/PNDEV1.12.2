
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
public class ItemPhialDNA extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial_dna")
	public static final Item block = null;
	public ItemPhialDNA(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phial_dna);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/phial_dna", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_phial_dna");
			setRegistryName("phial_dna");
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
					String resourcelocation = (blockNBT.getString("id"));
					if (!(I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("tile.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else if (!(I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("item.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else {
						return super.getItemStackDisplayName(stack);
					}
				}

				else if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
							+ ": "
							+ I18n.translateToLocal("entity." + getDNAStr(resourcelocation) + ".name").trim();
				}

				else if (stack.getTagCompound().hasKey("PFStatic")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
					String resourcelocation = (blockNBT.getString("id"));
					if (!(I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("tile.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else if (!(I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("item.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else {
						return super.getItemStackDisplayName(stack);
					}
				}

			}

			return super.getItemStackDisplayName(stack);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.phial_dna_" + getDNAStr(resourcelocation);
				}
				else if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.phial_dna_" + getDNAStr(resourcelocation);
				}
				else if (stack.getTagCompound().hasKey("PFStatic")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.phial_dna_" + getDNAStr(resourcelocation);
				}
			}
			return super.getTranslationKey(stack);
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

		public static boolean isBlockFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| ((!stack.getTagCompound().hasKey("PFPlant"))
					&& (!stack.getTagCompound().hasKey("PFMob"))
					&& (!stack.getTagCompound().hasKey("PFStatic")))
			) {
				return false;
			}
			return true;
		}

		public static String getDNAStr(String string) {
			string = string.replace("lepidodendron:", "");
			string = string.replace("minecraft:", "");
			return string;
		}

	}

}
