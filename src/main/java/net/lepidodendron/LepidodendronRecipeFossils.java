package net.lepidodendron;

import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.item.ItemBottleOfDNASolvent;
import net.lepidodendron.item.ItemFossilClean;
import net.lepidodendron.item.ItemPhial;
import net.lepidodendron.item.ItemPhialDNA;
import net.lepidodendron.util.AcidBathOutputMobs;
import net.lepidodendron.util.AcidBathOutputPlants;
import net.lepidodendron.util.AcidBathOutputStatics;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.crafting.IngredientNBT;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import javax.annotation.Nullable;
import java.lang.reflect.Constructor;

public class LepidodendronRecipeFossils {
	
	public static boolean isArthropod(@Nullable World worldIn, String resourcelocation) {
		boolean isArthropod = false;
		EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(resourcelocation));
		if (ee != null) {
			EntityLiving entity = (EntityLiving) ee.newInstance(worldIn);
			if (entity == null) {
				System.err.println("Error constructing mob for recipes: " + resourcelocation);
				return false;
			}
			isArthropod = entity.getCreatureAttribute() == EnumCreatureAttribute.ARTHROPOD;
			if (entity instanceof EntityPrehistoricFloraAgeableBase) {
				isArthropod = ((EntityPrehistoricFloraAgeableBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
				isArthropod = ((EntityPrehistoricFloraCrawlingFlyingInsectBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraFishBase) {
				isArthropod = ((EntityPrehistoricFloraFishBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraInsectFlyingBase) {
				isArthropod = ((EntityPrehistoricFloraInsectFlyingBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraJellyfishBase) {
				isArthropod = ((EntityPrehistoricFloraJellyfishBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraSlitheringWaterBase) {
				isArthropod = ((EntityPrehistoricFloraSlitheringWaterBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
				isArthropod = ((EntityPrehistoricFloraTrilobiteBottomBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			} else if (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
				isArthropod = ((EntityPrehistoricFloraTrilobiteSwimBase) entity).getPNCreatureAttribute() == EnumCreatureAttributePN.INVERTEBRATE;
			}
			if (entity != null) {
				entity.setDead();
			}
		}
		return isArthropod;
	}

	public static void registerFossilRecipes(RegistryEvent.Register<IRecipe> event) {

		for (int n = 1; n <= 13; n++) {
			switch (n) {
				case 1:
				default: //Precambrian
					if ((AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 2: //Cambrian
					if ((AcidBathOutputMobs.getCambrianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCambrianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getCambrianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getCambrianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCambrianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getCambrianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCambrianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCambrianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCambrianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getCambrianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCambrianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 3: //Ordovician
					if ((AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 4: //Silurian
					if ((AcidBathOutputMobs.getSilurianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getSilurianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getSilurianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getSilurianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getSilurianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getSilurianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getSilurianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getSilurianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getSilurianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getSilurianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getSilurianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 5: //Devonian
					if ((AcidBathOutputMobs.getDevonianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getDevonianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getDevonianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getDevonianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getDevonianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getDevonianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getDevonianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getDevonianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getDevonianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getDevonianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getDevonianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 6: //Carboniferous
					if ((AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 7: //Permian
					if ((AcidBathOutputMobs.getPermianCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPermianCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getPermianCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getPermianCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPermianCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getPermianCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPermianCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPermianCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPermianCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getPermianCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPermianCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 8: //Triassic
					if ((AcidBathOutputMobs.getTriassicCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getTriassicCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getTriassicCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getTriassicCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getTriassicCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getTriassicCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getTriassicCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getTriassicCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getTriassicCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getTriassicCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getTriassicCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 9: //Jurassic
					if ((AcidBathOutputMobs.getJurassicCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getJurassicCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getJurassicCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getJurassicCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getJurassicCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getJurassicCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getJurassicCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getJurassicCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getJurassicCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getJurassicCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getJurassicCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 10: //Cretaceous
					if ((AcidBathOutputMobs.getCretaceousCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getCretaceousCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getCretaceousCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getCretaceousCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getCretaceousCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getCretaceousCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 11: //Paleogene
					if ((AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 12: //Neogene
					if ((AcidBathOutputMobs.getNeogeneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getNeogeneCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getNeogeneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getNeogeneCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getNeogeneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getNeogeneCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFStatic", AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()[i - 1]);
						}
					}
					break;

				case 13: //Pleistocene
					if ((AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs().length; i++) {
							if (!AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFMob", AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1]);
							//New recipes v.62 using the actual creature type tag as well:
							String resourcelocation = AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1];
							if (resourcelocation.indexOf("@") > 0) {
								resourcelocation = resourcelocation.substring(0, resourcelocation.indexOf("@"));
							}
							boolean isArthropod = isArthropod(null, resourcelocation);
							if (isArthropod) {
								addRecipeFossil(event, n, "PFMob_invertebrate", AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1]);
							}
							else {
								addRecipeFossil(event, n, "PFMob_vertebrate", AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()[i - 1]);
							}
						}
					}
					if ((AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants().length; i++) {
							if (!AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
							addRecipeFossil(event, n, "PFPlant", AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()[i - 1]);
						}
					}
					if ((AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics().length >= 1)) {
						for (int i = 1; i <= AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics().length; i++) {
							if (!AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics()[i - 1].startsWith("lepidodendron:")) {
								continue;
							}
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

		try { //Uggggh, reflection :(
			Constructor constructor = ObfuscationReflectionHelper.findConstructor(IngredientNBT.class, ItemStack.class);
			constructor.setAccessible(true);

			if ((!(typeStr.equalsIgnoreCase("PFMob_vertebrate")))
					&& (!(typeStr.equalsIgnoreCase("PFMob_invertebrate")))) {
				//v.61 and back, before we tagged with the mob type properly:
				ItemStack stackFossil = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound fossilNBT = new NBTTagCompound();
				fossilNBT.setString("id", lifeStr);
				NBTTagCompound stackFossilNBT = new NBTTagCompound();
				stackFossilNBT.setTag(typeStr, fossilNBT);
				stackFossil.setTagCompound(stackFossilNBT);
				stackFossil.getTagCompound().setInteger("period", period);

				ItemStack stackPhial = new ItemStack(ItemPhialDNA.block, 1);
				NBTTagCompound phialNBT = new NBTTagCompound();
				phialNBT.setString("id", lifeStr);
				NBTTagCompound stackPhialNBT = new NBTTagCompound();
				stackPhialNBT.setTag(typeStr, phialNBT);
				stackPhial.setTagCompound(stackPhialNBT);
				stackPhial.getTagCompound().setInteger("period", period);
				if (typeStr.equalsIgnoreCase("PFMob")) {
					boolean isArthropod = isArthropod(null, lifeStr);
					if (isArthropod) {
						stackPhialNBT.setString("mobtype", "invertebrate");
					} else {
						stackPhialNBT.setString("mobtype", "invertebrate");
					}
				}
				stackPhial.setTagCompound(stackPhialNBT);

				IngredientNBT nbtFossil = (IngredientNBT) constructor.newInstance(stackFossil);;

				if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr))) {
					event.getRegistry().register(
							new ShapelessOreRecipe(
									new ResourceLocation("lepidodendron_fossils"),
									NonNullList.from(null,
											Ingredient.fromStacks(stackSolvent),
											nbtFossil,
											Ingredient.fromStacks(stackPhialEmpty)
									),
									stackPhial
							).setRegistryName(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr)
					);
				}
			}
			else {
				ItemStack stackFossil = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound fossilNBT = new NBTTagCompound();
				fossilNBT.setString("id", lifeStr);
				NBTTagCompound stackFossilNBT = new NBTTagCompound();
				stackFossilNBT.setTag("PFMob", fossilNBT);
				if (typeStr.equalsIgnoreCase("PFMob_vertebrate")) {
					stackFossilNBT.setString("mobtype", "vertebrate");
				}
				if (typeStr.equalsIgnoreCase("PFMob_invertebrate")) {
					stackFossilNBT.setString("mobtype", "invertebrate");
				}
				//stackFossilNBT.setTag(typeStr, fossilNBT);
				stackFossil.setTagCompound(stackFossilNBT);
				stackFossil.getTagCompound().setInteger("period", period);

				ItemStack stackPhial = new ItemStack(ItemPhialDNA.block, 1);
				NBTTagCompound phialNBT = new NBTTagCompound();
				phialNBT.setString("id", lifeStr);
				NBTTagCompound stackPhialNBT = new NBTTagCompound();
				stackPhialNBT.setTag("PFMob", phialNBT);
				if (typeStr.equalsIgnoreCase("PFMob_vertebrate")) {
					stackPhialNBT.setString("mobtype", "vertebrate");
				}
				if (typeStr.equalsIgnoreCase("PFMob_invertebrate")) {
					stackPhialNBT.setString("mobtype", "invertebrate");
				}
				stackPhial.setTagCompound(stackPhialNBT);
				stackPhial.getTagCompound().setInteger("period", period);

				IngredientNBT nbtFossil = (IngredientNBT) constructor.newInstance(stackFossil);;

				if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr + typeStr))) {
					event.getRegistry().register(
							new ShapelessOreRecipe(
								new ResourceLocation("lepidodendron_fossils"),
									NonNullList.from(null,
											Ingredient.fromStacks(stackSolvent),
											nbtFossil,
											Ingredient.fromStacks(stackPhialEmpty)
									),
									stackPhial
							).setRegistryName(LepidodendronMod.MODID, period + "_phial_dna_" + lifeStr + typeStr)
					);
				}
			}


			//Legacy for untagged fossils:
			if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, "0_phial_dna_" + lifeStr))) {
				ItemStack stackFossil = new ItemStack(ItemFossilClean.block, 1);
				NBTTagCompound fossilNBT = new NBTTagCompound();
				fossilNBT.setString("id", lifeStr);
				NBTTagCompound stackFossilNBT = new NBTTagCompound();
				stackFossilNBT.setTag(typeStr, fossilNBT);
				stackFossil.setTagCompound(stackFossilNBT);
				stackFossil.getTagCompound().setInteger("period", period);

				ItemStack stackPhial = new ItemStack(ItemPhialDNA.block, 1);
				NBTTagCompound phialNBT = new NBTTagCompound();
				phialNBT.setString("id", lifeStr);
				NBTTagCompound stackPhialNBT = new NBTTagCompound();
				stackPhialNBT.setTag(typeStr, phialNBT);
				stackPhial.setTagCompound(stackPhialNBT);
				stackPhial.getTagCompound().setInteger("period", period);

				if (typeStr.equalsIgnoreCase("PFMob")) {
					boolean isArthropod = isArthropod(null, lifeStr);
					if (isArthropod) {
						stackPhialNBT.setString("mobtype", "invertebrate");
					} else {
						stackPhialNBT.setString("mobtype", "invertebrate");
					}
				}
				stackPhial.setTagCompound(stackPhialNBT);

				IngredientNBT nbtFossil = (IngredientNBT) constructor.newInstance(stackFossil);;

				event.getRegistry().register(
						new ShapelessOreRecipe(
								new ResourceLocation("lepidodendron_fossils"),
								NonNullList.from(null,
										Ingredient.fromStacks(stackSolvent),
										nbtFossil,
										Ingredient.fromStacks(stackPhialEmpty)
								),
								stackPhial
						).setRegistryName(LepidodendronMod.MODID, "0_phial_dna_" + lifeStr)
				);
			}
		} catch (Exception e) {
			//Don't do anytning - recipes are not working with NBT!
		}

		if (lifeStr.contains("@gendered")) {
			registerOredict(event, typeStr, lifeStr.replace("@gendered", "@male"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@gendered", "@female"), stackSolvent, stackPhialEmpty);
		}
		if (lifeStr.contains("@triops_random")) {
			registerOredict(event, typeStr, lifeStr.replace("@triops_random", "@triops1"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@triops_random", "@triops2"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@triops_random", "@triops3"), stackSolvent, stackPhialEmpty);
		}
		if (lifeStr.contains("@dragonfly_random")) {
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly1"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly2"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly3"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly4"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly5"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly6"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly7"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly8"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly9"), stackSolvent, stackPhialEmpty);
			registerOredict(event, typeStr, lifeStr.replace("@dragonfly_random", "@dragonfly10"), stackSolvent, stackPhialEmpty);
		}

		registerOredict(event, typeStr, lifeStr, stackSolvent, stackPhialEmpty);
	}


	public static void registerOredict(RegistryEvent.Register<IRecipe> event, String typeStr, String lifeStr, ItemStack stackSolvent, ItemStack stackPhialEmpty) {
		if (!event.getRegistry().containsKey(new ResourceLocation(LepidodendronMod.MODID, "oredict_phial_dna_" + lifeStr))) {
			NBTTagCompound phialNBT = new NBTTagCompound();
			phialNBT.setString("id", lifeStr);
			NBTTagCompound stackPhialNBT = new NBTTagCompound();
			if (typeStr.equalsIgnoreCase("PFMob_vertebrate")) {
				stackPhialNBT.setTag("PFMob", phialNBT);
				stackPhialNBT.setString("mobtype", "vertebrate");
			}
			else if (typeStr.equalsIgnoreCase("PFMob_invertebrate")) {
				stackPhialNBT.setTag("PFMob", phialNBT);
				stackPhialNBT.setString("mobtype", "invertebrate");
			}
			else {
				stackPhialNBT.setTag(typeStr, phialNBT);
			}

			ItemStack stackPhial = new ItemStack(ItemPhialDNA.block, 1);
			stackPhial.setTagCompound(stackPhialNBT);

			OreIngredient oreFossil = null;

			if (typeStr.equalsIgnoreCase("PFMob")
					|| typeStr.equalsIgnoreCase("PFMob_vertebrate")
					|| typeStr.equalsIgnoreCase("PFMob_invertebrate")) {
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
						new ShapelessOreRecipe(
								new ResourceLocation("lepidodendron_fossils"),
								NonNullList.from(null,
										Ingredient.fromStacks(stackSolvent),
										oreFossil,
										Ingredient.fromStacks(stackPhialEmpty)
								),
								stackPhial
						).setRegistryName(LepidodendronMod.MODID, "oredict_phial_dna_" + lifeStr)
				);
			}
		}
	}
}