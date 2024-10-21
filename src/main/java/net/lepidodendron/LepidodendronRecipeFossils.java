package net.lepidodendron;

import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.lepidodendron.item.ItemFossilClean;
import net.lepidodendron.item.ItemPhial;
import net.lepidodendron.item.ItemPhialDNA;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.oredict.OreIngredient;

public class LepidodendronRecipeFossils {

	public static void registerFossilRecipes(RegistryEvent.Register<IRecipe> event) {

		for (int n = 1; n <= 13; n++) {
			switch (n) {
				case 1:
				default: //Precambrian
					if ((AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 2: //Cambrian
					if ((AcidBathOutputMobs.getCambrianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCambrianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getCambrianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCambrianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCambrianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCambrianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCambrianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCambrianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 3: //Ordovician
					if ((AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 4: //Silurian
					if ((AcidBathOutputMobs.getSilurianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getSilurianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getSilurianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getSilurianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getSilurianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getSilurianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getSilurianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getSilurianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 5: //Devonian
					if ((AcidBathOutputMobs.getDevonianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getDevonianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getDevonianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getDevonianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getDevonianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getDevonianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getDevonianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getDevonianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 6: //Carboniferous
					if ((AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 7: //Permian
					if ((AcidBathOutputMobs.getPermianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPermianCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getPermianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPermianCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPermianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPermianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPermianCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPermianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 8: //Triassic
					if ((AcidBathOutputMobs.getTriassicCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getTriassicCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getTriassicCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getTriassicCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getTriassicCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getTriassicCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getTriassicCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getTriassicCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 9: //Jurassic
					if ((AcidBathOutputMobs.getJurassicCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getJurassicCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getJurassicCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getJurassicCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getJurassicCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getJurassicCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getJurassicCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getJurassicCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 10: //Cretaceous
					if ((AcidBathOutputMobs.getCretaceousCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCretaceousCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getCretaceousCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCretaceousCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCretaceousCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCretaceousCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 11: //Paleogene
					if ((AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 12: //Neogene
					if ((AcidBathOutputMobs.getNeogeneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getNeogeneCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getNeogeneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getNeogeneCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getNeogeneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getNeogeneCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 13: //Pleistocene
					if ((AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs().length; i++) {
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1]);
						}
					}
					if ((AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants().length; i++) {
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics().length; i++) {
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics()[i - 1]);
						}
					}
					break;
			}
		}

	}


	public static void addRecipeFossil (RegistryEvent.Register<IRecipe> event, int period, String typeStr, String lifeStr) {

		ItemStack stackSolvent = new ItemStack(ItemBottleOfDNASolvent.block, 1);
		ItemStack stackPhialEmpty = new ItemStack(ItemPhial.block, 1);

		ItemStack stackFossil = new ItemStack(ItemFossilClean.block, 1);
		NBTTagCompound fossilNBT = new NBTTagCompound();
		fossilNBT.setString("id", lifeStr);
		NBTTagCompound stackFossilNBT = new NBTTagCompound();
		stackFossilNBT.setTag(typeStr, fossilNBT);
		stackFossil.setTagCompound(stackFossilNBT);
		stackFossil.getTagCompound().setInteger("period", period);

		ItemStack stackPhial = new ItemStack(ItemPhialDNA.block, 1);
		stackPhial.setTagCompound(stackFossilNBT);

		if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr))) {
			event.getRegistry().register(
					new ShapelessRecipes(
							"lepidodendron_fossils",
							stackPhial,
							NonNullList.from(null,
									Ingredient.fromStacks(stackSolvent),
									Ingredient.fromStacks(stackFossil),
									Ingredient.fromStacks(stackPhialEmpty)
							)
					).setRegistryName(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr)
			);
		}

		if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, "0_phial_dna_" + lifeStr))) {
			stackFossil = new ItemStack(ItemFossilClean.block, 1);
			fossilNBT = new NBTTagCompound();
			fossilNBT.setString("id", lifeStr);
			stackFossilNBT = new NBTTagCompound();
			stackFossilNBT.setTag(typeStr, fossilNBT);
			stackFossil.setTagCompound(stackFossilNBT);

			event.getRegistry().register(
					new ShapelessRecipes(
							"lepidodendron_fossils",
							stackPhial,
							NonNullList.from(null,
									Ingredient.fromStacks(stackSolvent),
									Ingredient.fromStacks(stackFossil),
									Ingredient.fromStacks(stackPhialEmpty)
							)
					).setRegistryName(LepidodendronMod.MODID, "0_phial_dna_" + lifeStr)
			);
		}

		if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, "oredict_phial_dna_" + lifeStr))) {
			OreIngredient oreFossil = null;

			if (typeStr.equalsIgnoreCase("PFMob")) {
				oreFossil = new OreIngredient("mobdnaPN" + lifeStr);
			}
			else if (typeStr.equalsIgnoreCase("PFPlant")) {
				oreFossil = new OreIngredient("plantdnaPN" + lifeStr);
			}
			else if (typeStr.equalsIgnoreCase("PFStatic")) {
				oreFossil = new OreIngredient("staticdnaPN" + lifeStr);
			}

			if (oreFossil != null) {
				event.getRegistry().register(
						new ShapelessRecipes(
								"lepidodendron_fossils",
								stackPhial,
								NonNullList.from(null,
										Ingredient.fromStacks(stackSolvent),
										oreFossil,
										Ingredient.fromStacks(stackPhialEmpty)
								)
						).setRegistryName(LepidodendronMod.MODID, "oredict_phial_dna_" + lifeStr)
				);
			}
		}
	}
}