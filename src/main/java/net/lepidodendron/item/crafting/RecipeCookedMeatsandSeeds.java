
package net.lepidodendron.item.crafting;

import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.lepidodendron.item.entities.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

//@ElementsLepidodendronMod.ModElement.Tag
public class RecipeCookedMeatsandSeeds  {
//	public RecipeCookedMeatsandSeeds(ElementsLepidodendronMod instance) {
//		super(instance, 1092);
//	}

	//@Override
	public static void registerSmelting() {

		GameRegistry.addSmelting(new ItemStack(BlockArtocarpusFruitBlock.block, (int) (1)), new ItemStack(ItemCookedBreadfruit.block, (int) (1)), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemPrototaxitesChunk.block, (int) (1)), new ItemStack(ItemCookedPrototaxites.block, (int) (1)), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemYamTuber.block, (int) (1)), new ItemStack(ItemYamTuberBaked.block, (int) (1)), 0.5F);

		for (ItemStack stack : OreDictionary.getOres("pnfurnaceCalamari")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoCalamari.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceSnail")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoEscargots.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceMeat")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoSteak.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceBug")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoInsectTreat.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceScampi")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoScampi.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceCrustacean")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoThermidor.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnacePterosaur")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoPteroKebab.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceAmphibian")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoFillet.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceSeafood")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoSeafood.block, 1), 0.35F);
		}
		for (ItemStack stack : OreDictionary.getOres("pnfurnaceFish")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemPalaeoFishcake.block, 1), 0.35F);
		}

		GameRegistry.addSmelting(new ItemStack(BlockHoldfast.block, (int) (1)), new ItemStack(Items.STICK, (int) (1)), 0.1F);

		GameRegistry.addSmelting(new ItemStack(ItemChestnut.block, (int) (1)), new ItemStack(ItemChestnutRoasted.block, (int) (1)), 0.15F);

<<<<<<< HEAD
		for (ItemStack stack : OreDictionary.getOres("foodPinenuts")) {
			GameRegistry.addSmelting(stack, new ItemStack(ItemRoastedPineNuts.block, 1), 0.15F);
		}

		for (ItemStack stack : OreDictionary.getOres("logWood")) {
			if (stack.getItem() != new ItemStack(BlockAraucarioxylonLog.block, 1).getItem()
					&& stack.getItem() !=  new ItemStack(BlockSciadopitysLog.block, 1).getItem()
					&& stack.getItem() !=  new ItemStack(BlockHymenaeaLog.block, 1).getItem()) {
				GameRegistry.addSmelting(stack, new ItemStack(Items.COAL, 1), 0.15F);
			}
		}

		GameRegistry.addSmelting(new ItemStack(BlockAraucarioxylonLog.block, (int) (1)), new ItemStack(BlockAraucarioxylonLogPetrified.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockSciadopitysLog.block, (int) (1)), new ItemStack(ItemBalticAmberChunk.block, (int) (1)), 1F);
		GameRegistry.addSmelting(new ItemStack(BlockHymenaeaLog.block, (int) (1)), new ItemStack(ItemDominicanAmberChunk.block, (int) (1)), 1F);


		for (ItemStack stack : OreDictionary.getOres("itemSponge")) {
			GameRegistry.addSmelting(stack, new ItemStack(Blocks.SPONGE, 1), 0.15F);
		}

		for (ItemStack stack : OreDictionary.getOres("itemMoss")) {
			GameRegistry.addSmelting(stack, new ItemStack(BlockPeat.block, 1), 0.15F);
		}


=======
		//All our conifers:
		GameRegistry.addSmelting(new ItemStack(ItemAethophyllumNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAgathisNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAlpiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAraucarioxylonNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAraucaritesNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBrachyphyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBristleconeSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBunyaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBuriadiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBushyAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemColumnarisNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemCordaitesSeeds.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemCypressSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemDawnRedwoodNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemDicranophyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemFrenelopsisSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemFurcifoliumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemMonkeyPuzzleAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemOrtiseiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemPseudovoltziaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemQuadrocladusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemRedwoodNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemRufloriaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemSciadopitysNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemSpruceSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTallAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTaxodiumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTelemachusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemThucydiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemUtrechtiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWachtlerinaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWalchiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWollemiSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemHoopNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemScrubbyPineNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemElatocladusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemPagiophyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
>>>>>>> parent of 988043d66 (Merge branch 'AechtRob:master' into master)
	}
}
