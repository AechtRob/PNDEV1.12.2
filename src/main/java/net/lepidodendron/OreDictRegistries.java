/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class ElementsLepidodendronMod.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.lepidodendron;

import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class OreDictRegistries extends ElementsLepidodendronMod.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public OreDictRegistries(ElementsLepidodendronMod instance) {
		super(instance, 66);
	}

	@Override
	public void init(FMLInitializationEvent event) {

        String[] var2 = LepidodendronConfig.genLogResin;
        int var3 = var2.length;
        int meta;

		try {			
			for(Object block : Block.REGISTRY){ 
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if(true) {;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

			        for(int var4 = 0; var4 < var3; ++var4) {
			            String checkBlock = var2[var4];
			            //Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkBlock.indexOf(":", checkBlock.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkBlock.substring(strPos + 1));
							checkBlock = checkBlock.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						}
						else {
							meta = -1;
						}

			            if (checkBlock.equalsIgnoreCase(Block.REGISTRY.getNameForObject((Block)block).toString())) {
			            	if(meta == -1) {
			            		OreDictionary.registerOre("logResin", new ItemStack((Block)block, (int) (1)));
			            	}
			            	else {
			            		OreDictionary.registerOre("logResin", new ItemStack((Block)block, (int) (1), meta));
			            	}
			            }
	
					}
				}
			}
		} catch (Exception e) {
		}		

		var2 = LepidodendronConfig.genPlantPrehistoric;
        var3 = var2.length;

		try {			
			for(Object block : Block.REGISTRY){ 
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if(true) {;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

			        for(int var4 = 0; var4 < var3; ++var4) {
			            String checkBlock = var2[var4];
			            //Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkBlock.indexOf(":", checkBlock.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkBlock.substring(strPos + 1));
							checkBlock = checkBlock.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						}
						else {
							meta = -1;
						}

			            if (checkBlock.equalsIgnoreCase(Block.REGISTRY.getNameForObject((Block)block).toString())) {
			            	if (meta == -1) {
			            		OreDictionary.registerOre("plantPrehistoric", new ItemStack((Block)block, (int) (1)));
			            	}
			            	else {
			            		OreDictionary.registerOre("plantPrehistoric", new ItemStack((Block)block, (int) (1), meta));
			            	}
			            }

					}
				}
			}
		} catch (Exception e) {
		}

		//Fossils
		OreDictionary.registerOre("blockFossil", BlockFossilPrecambrian.block);
		OreDictionary.registerOre("blockFossil", BlockFossilCambrian.block);
		OreDictionary.registerOre("blockFossil", BlockFossilOrdovician.block);
		OreDictionary.registerOre("blockFossil", BlockFossilSilurian.block);
		OreDictionary.registerOre("blockFossil", BlockFossilDevonian.block);
		OreDictionary.registerOre("blockFossil", BlockFossilCarboniferous.block);
		OreDictionary.registerOre("blockFossil", BlockFossilPermian.block);
		OreDictionary.registerOre("blockFossil", BlockFossilTriassic.block);
		OreDictionary.registerOre("blockFossil", BlockFossilJurassic.block);
		OreDictionary.registerOre("blockFossil", BlockFossilCretaceous.block);
		OreDictionary.registerOre("blockFossil", BlockFossilPaleogene.block);
		OreDictionary.registerOre("blockFossil", BlockFossilNeogene.block);
		OreDictionary.registerOre("blockFossil", BlockFossilPleistocene.block);
		OreDictionary.registerOre("oreFossil", BlockFossilPrecambrian.block);
		OreDictionary.registerOre("oreFossil", BlockFossilCambrian.block);
		OreDictionary.registerOre("oreFossil", BlockFossilOrdovician.block);
		OreDictionary.registerOre("oreFossil", BlockFossilSilurian.block);
		OreDictionary.registerOre("oreFossil", BlockFossilDevonian.block);
		OreDictionary.registerOre("oreFossil", BlockFossilCarboniferous.block);
		OreDictionary.registerOre("oreFossil", BlockFossilPermian.block);
		OreDictionary.registerOre("oreFossil", BlockFossilTriassic.block);
		OreDictionary.registerOre("oreFossil", BlockFossilJurassic.block);
		OreDictionary.registerOre("oreFossil", BlockFossilCretaceous.block);
		OreDictionary.registerOre("oreFossil", BlockFossilPaleogene.block);
		OreDictionary.registerOre("oreFossil", BlockFossilNeogene.block);
		OreDictionary.registerOre("oreFossil", BlockFossilPleistocene.block);
		OreDictionary.registerOre("blockStone", BlockFossilPrecambrian.block);
		OreDictionary.registerOre("blockStone", BlockFossilCambrian.block);
		OreDictionary.registerOre("blockStone", BlockFossilOrdovician.block);
		OreDictionary.registerOre("blockStone", BlockFossilSilurian.block);
		OreDictionary.registerOre("blockStone", BlockFossilDevonian.block);
		OreDictionary.registerOre("blockStone", BlockFossilCarboniferous.block);
		OreDictionary.registerOre("blockStone", BlockFossilPermian.block);
		OreDictionary.registerOre("blockStone", BlockFossilTriassic.block);
		OreDictionary.registerOre("blockStone", BlockFossilJurassic.block);
		OreDictionary.registerOre("blockStone", BlockFossilCretaceous.block);
		OreDictionary.registerOre("blockStone", BlockFossilPaleogene.block);
		OreDictionary.registerOre("blockStone", BlockFossilNeogene.block);
		OreDictionary.registerOre("blockStone", BlockFossilPleistocene.block);

		OreDictionary.registerOre("itemFossil", ItemFossilClean.block);
		OreDictionary.registerOre("itemFossil", ItemFossilPrecambrian.block);
		OreDictionary.registerOre("itemFossil", ItemFossilCambrian.block);
		OreDictionary.registerOre("itemFossil", ItemFossilOrdovician.block);
		OreDictionary.registerOre("itemFossil", ItemFossilSilurian.block);
		OreDictionary.registerOre("itemFossil", ItemFossilDevonian.block);
		OreDictionary.registerOre("itemFossil", ItemFossilCarboniferous.block);
		OreDictionary.registerOre("itemFossil", ItemFossilPermian.block);
		OreDictionary.registerOre("itemFossil", ItemFossilTriassic.block);
		OreDictionary.registerOre("itemFossil", ItemFossilJurassic.block);
		OreDictionary.registerOre("itemFossil", ItemFossilCretaceous.block);
		OreDictionary.registerOre("itemFossil", ItemFossilPaleogene.block);
		OreDictionary.registerOre("itemFossil", ItemFossilNeogene.block);
		OreDictionary.registerOre("itemFossil", ItemFossilPleistocene.block);
		OreDictionary.registerOre("itemFossil", ItemFossilPleistocene.block);

		//Coal:
		OreDictionary.registerOre("blockCoal", BlockAnthracite.block);
		OreDictionary.registerOre("itemCoal", ItemAnthracite.block);
		OreDictionary.registerOre("itemCoal", Items.COAL);

		//Wood:
		OreDictionary.registerOre("plankWood", BlockStickBundle.block);

		//Mud:
		OreDictionary.registerOre("blockMud", BlockCarboniferousMud.block);


		//Ropes:
		OreDictionary.registerOre("itemRope", BlockHoldfast.block);

		//Fungi:
		OreDictionary.registerOre("itemFungus", new ItemStack(Blocks.BROWN_MUSHROOM, 1));
		OreDictionary.registerOre("itemFungus", new ItemStack(Blocks.RED_MUSHROOM, 1));
        OreDictionary.registerOre("itemFungus", new ItemStack(Items.MUSHROOM_STEW, 1, 0));

		//Vanilla ferns - for the fern organic ground block recipe:
		OreDictionary.registerOre("plantFern", new ItemStack(Blocks.TALLGRASS, 1, 2));
		OreDictionary.registerOre("plantFern", new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));

		//Moss:
        OreDictionary.registerOre("itemMossForStone", new ItemStack(Blocks.VINE, 1, 0));

		//Algae:
		OreDictionary.registerOre("itemAlgae", BlockBrownAlgae.block);
		OreDictionary.registerOre("itemAlgae", ItemGreenFilamentousAlgaeItem.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenCharaAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenCodiumAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenCrustedAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenLeafyAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockPiledAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenSproutingAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockRedLeafyAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenStemmedAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockRedTuftedAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockStalkedAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockStalkyBrownAlgae.block);
		OreDictionary.registerOre("itemAlgae", BlockGreenAlgaeMat.block);
		OreDictionary.registerOre("itemAlgae", BlockRedAlgaeMat.block);
        OreDictionary.registerOre("itemAlgae", ItemCorallineAlgaeItem.block);
        OreDictionary.registerOre("itemAlgae", ItemSlimyAlgaeItem.block);

		//Seeds:
		OreDictionary.registerOre("listAllseed", ItemAethophyllumNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemAethophyllumNuts.block);
		OreDictionary.registerOre("seed", ItemAethophyllumNuts.block);
		OreDictionary.registerOre("seeds", ItemAethophyllumNuts.block);
		OreDictionary.registerOre("listAllseed", ItemAgathisNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemAgathisNuts.block);
		OreDictionary.registerOre("seed", ItemAgathisNuts.block);
		OreDictionary.registerOre("seeds", ItemAgathisNuts.block);
		OreDictionary.registerOre("listAllseed", ItemAlpiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemAlpiaSeed.block);
		OreDictionary.registerOre("seed", ItemAlpiaSeed.block);
		OreDictionary.registerOre("seeds", ItemAlpiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemAntarcticycasSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemAntarcticycasSeed.block);
		OreDictionary.registerOre("seed", ItemAntarcticycasSeed.block);
		OreDictionary.registerOre("seeds", ItemAntarcticycasSeed.block);
		OreDictionary.registerOre("listAllseed", ItemAraucarioxylonNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemAraucarioxylonNuts.block);
		OreDictionary.registerOre("seed", ItemAraucarioxylonNuts.block);
		OreDictionary.registerOre("seeds", ItemAraucarioxylonNuts.block);
		OreDictionary.registerOre("listAllseed", ItemArchaefructusSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemArchaefructusSeeds.block);
		OreDictionary.registerOre("seed", ItemArchaefructusSeeds.block);
		OreDictionary.registerOre("seeds", ItemArchaefructusSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemArtocarpusSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemArtocarpusSeeds.block);
		OreDictionary.registerOre("seed", ItemArtocarpusSeeds.block);
		OreDictionary.registerOre("seeds", ItemArtocarpusSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemBaieraSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemBaieraSeed.block);
		OreDictionary.registerOre("seed", ItemBaieraSeed.block);
		OreDictionary.registerOre("seeds", ItemBaieraSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBanksia1Seeds.block);
		OreDictionary.registerOre("listAllSeed", ItemBanksia1Seeds.block);
		OreDictionary.registerOre("seed", ItemBanksia1Seeds.block);
		OreDictionary.registerOre("seeds", ItemBanksia1Seeds.block);
		OreDictionary.registerOre("listAllseed", ItemBanksia2Seeds.block);
		OreDictionary.registerOre("listAllSeed", ItemBanksia2Seeds.block);
		OreDictionary.registerOre("seed", ItemBanksia2Seeds.block);
		OreDictionary.registerOre("seeds", ItemBanksia2Seeds.block);
		OreDictionary.registerOre("listAllseed", ItemBjuviaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemBjuviaSeed.block);
		OreDictionary.registerOre("seed", ItemBjuviaSeed.block);
		OreDictionary.registerOre("seeds", ItemBjuviaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBrachyphyllumSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemBrachyphyllumSeed.block);
		OreDictionary.registerOre("seed", ItemBrachyphyllumSeed.block);
		OreDictionary.registerOre("seeds", ItemBrachyphyllumSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBristleconeSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemBristleconeSeed.block);
		OreDictionary.registerOre("seed", ItemBristleconeSeed.block);
		OreDictionary.registerOre("seeds", ItemBristleconeSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBunyaNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemBunyaNuts.block);
		OreDictionary.registerOre("seed", ItemBunyaNuts.block);
		OreDictionary.registerOre("seeds", ItemBunyaNuts.block);
		OreDictionary.registerOre("listAllseed", ItemCobbaniaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemCobbaniaSeeds.block);
		OreDictionary.registerOre("seed", ItemCobbaniaSeeds.block);
		OreDictionary.registerOre("seeds", ItemCobbaniaSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemColumnarisNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemColumnarisNuts.block);
		OreDictionary.registerOre("seed", ItemColumnarisNuts.block);
		OreDictionary.registerOre("seeds", ItemColumnarisNuts.block);
		OreDictionary.registerOre("listAllseed", ItemCordaitesSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemCordaitesSeeds.block);
		OreDictionary.registerOre("seed", ItemCordaitesSeeds.block);
		OreDictionary.registerOre("seeds", ItemCordaitesSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemCtenisSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemCtenisSeed.block);
		OreDictionary.registerOre("seed", ItemCtenisSeed.block);
		OreDictionary.registerOre("seeds", ItemCtenisSeed.block);
		OreDictionary.registerOre("listAllseed", ItemCycasSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemCycasSeed.block);
		OreDictionary.registerOre("seed", ItemCycasSeed.block);
		OreDictionary.registerOre("seeds", ItemCycasSeed.block);
		OreDictionary.registerOre("listAllseed", ItemDawnRedwoodNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemDawnRedwoodNuts.block);
		OreDictionary.registerOre("seed", ItemDawnRedwoodNuts.block);
		OreDictionary.registerOre("seeds", ItemDawnRedwoodNuts.block);
		OreDictionary.registerOre("listAllseed", ItemDioonSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemDioonSeed.block);
		OreDictionary.registerOre("seed", ItemDioonSeed.block);
		OreDictionary.registerOre("seeds", ItemDioonSeed.block);
		OreDictionary.registerOre("listAllseed", ItemEncblueSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemEncblueSeed.block);
		OreDictionary.registerOre("seed", ItemEncblueSeed.block);
		OreDictionary.registerOre("seeds", ItemEncblueSeed.block);
		OreDictionary.registerOre("listAllseed", ItemEphedraSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemEphedraSeed.block);
		OreDictionary.registerOre("seed", ItemEphedraSeed.block);
		OreDictionary.registerOre("seeds", ItemEphedraSeed.block);
		OreDictionary.registerOre("listAllseed", ItemGinkgoSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemGinkgoSeed.block);
		OreDictionary.registerOre("seed", ItemGinkgoSeed.block);
		OreDictionary.registerOre("seeds", ItemGinkgoSeed.block);
		OreDictionary.registerOre("listAllseed", ItemSphenobaieraSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemSphenobaieraSeed.block);
		OreDictionary.registerOre("seed", ItemSphenobaieraSeed.block);
		OreDictionary.registerOre("seeds", ItemSphenobaieraSeed.block);
		OreDictionary.registerOre("listAllseed", ItemHironoiaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemHironoiaSeeds.block);
		OreDictionary.registerOre("seed", ItemHironoiaSeeds.block);
		OreDictionary.registerOre("seeds", ItemHironoiaSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemHymenaeaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemHymenaeaSeeds.block);
		OreDictionary.registerOre("seed", ItemHymenaeaSeeds.block);
		OreDictionary.registerOre("seeds", ItemHymenaeaSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemLadiniaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemLadiniaSeed.block);
		OreDictionary.registerOre("seed", ItemLadiniaSeed.block);
		OreDictionary.registerOre("seeds", ItemLadiniaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemLeptocycasSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemLeptocycasSeed.block);
		OreDictionary.registerOre("seed", ItemLeptocycasSeed.block);
		OreDictionary.registerOre("seeds", ItemLeptocycasSeed.block);
		OreDictionary.registerOre("listAllseed", ItemLiriodendronSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemLiriodendronSeeds.block);
		OreDictionary.registerOre("seed", ItemLiriodendronSeeds.block);
		OreDictionary.registerOre("seeds", ItemLiriodendronSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemMagnoliaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemMagnoliaSeeds.block);
		OreDictionary.registerOre("seed", ItemMagnoliaSeeds.block);
		OreDictionary.registerOre("seeds", ItemMagnoliaSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemMapleSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemMapleSeeds.block);
		OreDictionary.registerOre("seed", ItemMapleSeeds.block);
		OreDictionary.registerOre("seeds", ItemMapleSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemTallAraucariaNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemTallAraucariaNuts.block);
		OreDictionary.registerOre("seed", ItemTallAraucariaNuts.block);
		OreDictionary.registerOre("seeds", ItemTallAraucariaNuts.block);
		OreDictionary.registerOre("listAllseed", ItemBushyAraucariaNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemBushyAraucariaNuts.block);
		OreDictionary.registerOre("seed", ItemBushyAraucariaNuts.block);
		OreDictionary.registerOre("seeds", ItemBushyAraucariaNuts.block);
		OreDictionary.registerOre("listAllseed", ItemNelumboSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemNelumboSeeds.block);
		OreDictionary.registerOre("seed", ItemNelumboSeeds.block);
		OreDictionary.registerOre("seeds", ItemNelumboSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemNilssoniaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemNilssoniaSeed.block);
		OreDictionary.registerOre("seed", ItemNilssoniaSeed.block);
		OreDictionary.registerOre("seeds", ItemNilssoniaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemNilssoniocladusSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemNilssoniocladusSeed.block);
		OreDictionary.registerOre("seed", ItemNilssoniocladusSeed.block);
		OreDictionary.registerOre("seeds", ItemNilssoniocladusSeed.block);
		OreDictionary.registerOre("listAllseed", ItemNothofagusSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemNothofagusSeeds.block);
		OreDictionary.registerOre("seed", ItemNothofagusSeeds.block);
		OreDictionary.registerOre("seeds", ItemNothofagusSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemNystroemiaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemNystroemiaSeeds.block);
		OreDictionary.registerOre("seed", ItemNystroemiaSeeds.block);
		OreDictionary.registerOre("seeds", ItemNystroemiaSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemPalaeognetaleanaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemPalaeognetaleanaSeed.block);
		OreDictionary.registerOre("seed", ItemPalaeognetaleanaSeed.block);
		OreDictionary.registerOre("seeds", ItemPalaeognetaleanaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemPodozamitesSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemPodozamitesSeed.block);
		OreDictionary.registerOre("seed", ItemPodozamitesSeed.block);
		OreDictionary.registerOre("seeds", ItemPodozamitesSeed.block);
		OreDictionary.registerOre("listAllseed", ItemPolyspermophyllumSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemPolyspermophyllumSeeds.block);
		OreDictionary.registerOre("seed", ItemPolyspermophyllumSeeds.block);
		OreDictionary.registerOre("seeds", ItemPolyspermophyllumSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemPrimaevalGrassSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemPrimaevalGrassSeeds.block);
		OreDictionary.registerOre("seed", ItemPrimaevalGrassSeeds.block);
		OreDictionary.registerOre("seeds", ItemPrimaevalGrassSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemProtea1Seeds.block);
		OreDictionary.registerOre("listAllSeed", ItemProtea1Seeds.block);
		OreDictionary.registerOre("seed", ItemProtea1Seeds.block);
		OreDictionary.registerOre("seeds", ItemProtea1Seeds.block);
		OreDictionary.registerOre("listAllseed", ItemProtea2Seeds.block);
		OreDictionary.registerOre("listAllSeed", ItemProtea2Seeds.block);
		OreDictionary.registerOre("seed", ItemProtea2Seeds.block);
		OreDictionary.registerOre("seeds", ItemProtea2Seeds.block);
		OreDictionary.registerOre("listAllseed", ItemRedwoodNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemRedwoodNuts.block);
		OreDictionary.registerOre("seed", ItemRedwoodNuts.block);
		OreDictionary.registerOre("seeds", ItemRedwoodNuts.block);
		OreDictionary.registerOre("listAllseed", ItemRufloriaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemRufloriaSeed.block);
		OreDictionary.registerOre("seed", ItemRufloriaSeed.block);
		OreDictionary.registerOre("seeds", ItemRufloriaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemSciadopitysNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemSciadopitysNuts.block);
		OreDictionary.registerOre("seed", ItemSciadopitysNuts.block);
		OreDictionary.registerOre("seeds", ItemSciadopitysNuts.block);
		OreDictionary.registerOre("listAllseed", ItemSpinyCycadSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemSpinyCycadSeed.block);
		OreDictionary.registerOre("seed", ItemSpinyCycadSeed.block);
		OreDictionary.registerOre("seeds", ItemSpinyCycadSeed.block);
		OreDictionary.registerOre("listAllseed", ItemStiffCycadSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemStiffCycadSeed.block);
		OreDictionary.registerOre("seed", ItemStiffCycadSeed.block);
		OreDictionary.registerOre("seeds", ItemStiffCycadSeed.block);
		OreDictionary.registerOre("listAllseed", ItemTaxodiumSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemTaxodiumSeed.block);
		OreDictionary.registerOre("seed", ItemTaxodiumSeed.block);
		OreDictionary.registerOre("seeds", ItemTaxodiumSeed.block);
		OreDictionary.registerOre("listAllseed", ItemTrichopitysSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemTrichopitysSeeds.block);
		OreDictionary.registerOre("seed", ItemTrichopitysSeeds.block);
		OreDictionary.registerOre("seeds", ItemTrichopitysSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemUmaltolepisSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemUmaltolepisSeed.block);
		OreDictionary.registerOre("seed", ItemUmaltolepisSeed.block);
		OreDictionary.registerOre("seeds", ItemUmaltolepisSeed.block);
		OreDictionary.registerOre("listAllseed", ItemUtrechtiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemUtrechtiaSeed.block);
		OreDictionary.registerOre("seed", ItemUtrechtiaSeed.block);
		OreDictionary.registerOre("seeds", ItemUtrechtiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemWalchiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemWalchiaSeed.block);
		OreDictionary.registerOre("seed", ItemWalchiaSeed.block);
		OreDictionary.registerOre("seeds", ItemWalchiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemTelemachusSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemTelemachusSeed.block);
		OreDictionary.registerOre("seed", ItemTelemachusSeed.block);
		OreDictionary.registerOre("seeds", ItemTelemachusSeed.block);
		OreDictionary.registerOre("listAllseed", ItemWollemiSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemWollemiSeed.block);
		OreDictionary.registerOre("seed", ItemWollemiSeed.block);
		OreDictionary.registerOre("seeds", ItemWollemiSeed.block);
		OreDictionary.registerOre("listAllseed", ItemCzekanowskiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemCzekanowskiaSeed.block);
		OreDictionary.registerOre("seed", ItemCzekanowskiaSeed.block);
		OreDictionary.registerOre("seeds", ItemCzekanowskiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBuriadiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemBuriadiaSeed.block);
		OreDictionary.registerOre("seed", ItemBuriadiaSeed.block);
		OreDictionary.registerOre("seeds", ItemBuriadiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemPseudovoltziaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemPseudovoltziaSeed.block);
		OreDictionary.registerOre("seed", ItemPseudovoltziaSeed.block);
		OreDictionary.registerOre("seeds", ItemPseudovoltziaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemQuadrocladusSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemQuadrocladusSeed.block);
		OreDictionary.registerOre("seed", ItemQuadrocladusSeed.block);
		OreDictionary.registerOre("seeds", ItemQuadrocladusSeed.block);
		OreDictionary.registerOre("listAllseed", ItemDicranophyllumSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemDicranophyllumSeed.block);
		OreDictionary.registerOre("seed", ItemDicranophyllumSeed.block);
		OreDictionary.registerOre("seeds", ItemDicranophyllumSeed.block);
		OreDictionary.registerOre("listAllseed", ItemPhasmatocycasSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemPhasmatocycasSeed.block);
		OreDictionary.registerOre("seed", ItemPhasmatocycasSeed.block);
		OreDictionary.registerOre("seeds", ItemPhasmatocycasSeed.block);
		OreDictionary.registerOre("listAllseed", ItemLesleyaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemLesleyaSeed.block);
		OreDictionary.registerOre("seed", ItemLesleyaSeed.block);
		OreDictionary.registerOre("seeds", ItemLesleyaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemWachtlerinaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemWachtlerinaSeed.block);
		OreDictionary.registerOre("seed", ItemWachtlerinaSeed.block);
		OreDictionary.registerOre("seeds", ItemWachtlerinaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemThucydiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemThucydiaSeed.block);
		OreDictionary.registerOre("seed", ItemThucydiaSeed.block);
		OreDictionary.registerOre("seeds", ItemThucydiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemOrtiseiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemOrtiseiaSeed.block);
		OreDictionary.registerOre("seed", ItemOrtiseiaSeed.block);
		OreDictionary.registerOre("seeds", ItemOrtiseiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBeechSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemBeechSeeds.block);
		OreDictionary.registerOre("seed", ItemBeechSeeds.block);
		OreDictionary.registerOre("seeds", ItemBeechSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemPlaneSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemPlaneSeeds.block);
		OreDictionary.registerOre("seed", ItemPlaneSeeds.block);
		OreDictionary.registerOre("seeds", ItemPlaneSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemSycamoreSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemSycamoreSeeds.block);
		OreDictionary.registerOre("seed", ItemSycamoreSeeds.block);
		OreDictionary.registerOre("seeds", ItemSycamoreSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemFurculaSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemFurculaSeeds.block);
		OreDictionary.registerOre("seed", ItemFurculaSeeds.block);
		OreDictionary.registerOre("seeds", ItemFurculaSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemMacrotaeniopteirsSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemMacrotaeniopteirsSeeds.block);
        OreDictionary.registerOre("seed", ItemMacrotaeniopteirsSeeds.block);
        OreDictionary.registerOre("seeds", ItemMacrotaeniopteirsSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemTelemachusSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemTelemachusSeed.block);
        OreDictionary.registerOre("seed", ItemTelemachusSeed.block);
        OreDictionary.registerOre("seeds", ItemTelemachusSeed.block);
        OreDictionary.registerOre("listAllseed", ItemSphenobaieraSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemSphenobaieraSeed.block);
        OreDictionary.registerOre("seed", ItemSphenobaieraSeed.block);
        OreDictionary.registerOre("seeds", ItemSphenobaieraSeed.block);
        OreDictionary.registerOre("listAllseed", ItemBeechSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemBeechSeeds.block);
        OreDictionary.registerOre("seed", ItemBeechSeeds.block);
        OreDictionary.registerOre("seeds", ItemBeechSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemPlaneSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemPlaneSeeds.block);
        OreDictionary.registerOre("seed", ItemPlaneSeeds.block);
        OreDictionary.registerOre("seeds", ItemPlaneSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemSycamoreSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemSycamoreSeeds.block);
        OreDictionary.registerOre("seed", ItemSycamoreSeeds.block);
        OreDictionary.registerOre("seeds", ItemSycamoreSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemStiffCycadSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemStiffCycadSeed.block);
        OreDictionary.registerOre("seed", ItemStiffCycadSeed.block);
        OreDictionary.registerOre("seeds", ItemStiffCycadSeed.block);
        OreDictionary.registerOre("listAllseed", ItemGlossophyllumSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemGlossophyllumSeeds.block);
        OreDictionary.registerOre("seed", ItemGlossophyllumSeeds.block);
        OreDictionary.registerOre("seeds", ItemGlossophyllumSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemMonkeyPuzzleAraucariaNuts.block);
        OreDictionary.registerOre("listAllSeed", ItemMonkeyPuzzleAraucariaNuts.block);
        OreDictionary.registerOre("seed", ItemMonkeyPuzzleAraucariaNuts.block);
        OreDictionary.registerOre("seeds", ItemMonkeyPuzzleAraucariaNuts.block);
        OreDictionary.registerOre("listAllseed", ItemAraucaritesNuts.block);
        OreDictionary.registerOre("listAllSeed", ItemAraucaritesNuts.block);
        OreDictionary.registerOre("seed", ItemAraucaritesNuts.block);
        OreDictionary.registerOre("seeds", ItemAraucaritesNuts.block);
        OreDictionary.registerOre("listAllseed", ItemPentoxylalesSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemPentoxylalesSeeds.block);
        OreDictionary.registerOre("seed", ItemPentoxylalesSeeds.block);
        OreDictionary.registerOre("seeds", ItemPentoxylalesSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemFurcifoliumSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemFurcifoliumSeed.block);
        OreDictionary.registerOre("seed", ItemFurcifoliumSeed.block);
        OreDictionary.registerOre("seeds", ItemFurcifoliumSeed.block);
        OreDictionary.registerOre("listAllseed", ItemCypressSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemCypressSeed.block);
        OreDictionary.registerOre("seed", ItemCypressSeed.block);
        OreDictionary.registerOre("seeds", ItemCypressSeed.block);
        OreDictionary.registerOre("listAllseed", ItemPhoenicopsisSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemPhoenicopsisSeed.block);
        OreDictionary.registerOre("seed", ItemPhoenicopsisSeed.block);
        OreDictionary.registerOre("seeds", ItemPhoenicopsisSeed.block);
        OreDictionary.registerOre("listAllseed", ItemGinkgoitesSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemGinkgoitesSeed.block);
        OreDictionary.registerOre("seed", ItemGinkgoitesSeed.block);
        OreDictionary.registerOre("seeds", ItemGinkgoitesSeed.block);
        OreDictionary.registerOre("listAllseed", ItemArchaeanthusSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemArchaeanthusSeeds.block);
        OreDictionary.registerOre("seed", ItemArchaeanthusSeeds.block);
        OreDictionary.registerOre("seeds", ItemArchaeanthusSeeds.block);
        OreDictionary.registerOre("listAllseed", ItemFrenelopsisSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemFrenelopsisSeed.block);
        OreDictionary.registerOre("seed", ItemFrenelopsisSeed.block);
        OreDictionary.registerOre("seeds", ItemFrenelopsisSeed.block);
        OreDictionary.registerOre("listAllseed", ItemHermanophytonSeed.block);
        OreDictionary.registerOre("listAllSeed", ItemHermanophytonSeed.block);
        OreDictionary.registerOre("seed", ItemHermanophytonSeed.block);
        OreDictionary.registerOre("seeds", ItemHermanophytonSeed.block);
        OreDictionary.registerOre("listAllseed", ItemAppleSeeds.block);
        OreDictionary.registerOre("listAllSeed", ItemAppleSeeds.block);
        OreDictionary.registerOre("seed", ItemAppleSeeds.block);
        OreDictionary.registerOre("seeds", ItemAppleSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemAcaciaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemAcaciaSeed.block);
		OreDictionary.registerOre("seed", ItemAcaciaSeed.block);
		OreDictionary.registerOre("seeds", ItemAcaciaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemBirchSeeds.block);
		OreDictionary.registerOre("listAllSeed", ItemBirchSeeds.block);
		OreDictionary.registerOre("seed", ItemBirchSeeds.block);
		OreDictionary.registerOre("seeds", ItemBirchSeeds.block);
		OreDictionary.registerOre("listAllseed", ItemJungleSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemJungleSeed.block);
		OreDictionary.registerOre("seed", ItemJungleSeed.block);
		OreDictionary.registerOre("seeds", ItemJungleSeed.block);
		OreDictionary.registerOre("listAllseed", ItemPodocarpSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemPodocarpSeed.block);
		OreDictionary.registerOre("seed", ItemPodocarpSeed.block);
		OreDictionary.registerOre("seeds", ItemPodocarpSeed.block);
		OreDictionary.registerOre("listAllseed", ItemSpruceSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemSpruceSeed.block);
		OreDictionary.registerOre("seed", ItemSpruceSeed.block);
		OreDictionary.registerOre("seeds", ItemSpruceSeed.block);
		OreDictionary.registerOre("listAllseed", ItemYewSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemYewSeed.block);
		OreDictionary.registerOre("seed", ItemYewSeed.block);
		OreDictionary.registerOre("seeds", ItemYewSeed.block);
		OreDictionary.registerOre("listAllseed", ItemCephalotaxusSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemCephalotaxusSeed.block);
		OreDictionary.registerOre("seed", ItemCephalotaxusSeed.block);
		OreDictionary.registerOre("seeds", ItemCephalotaxusSeed.block);
		OreDictionary.registerOre("listAllseed", ItemCunninghamiaSeed.block);
		OreDictionary.registerOre("listAllSeed", ItemCunninghamiaSeed.block);
		OreDictionary.registerOre("seed", ItemCunninghamiaSeed.block);
		OreDictionary.registerOre("seeds", ItemCunninghamiaSeed.block);
		OreDictionary.registerOre("listAllseed", ItemHoopNuts.block);
		OreDictionary.registerOre("listAllSeed", ItemHoopNuts.block);
		OreDictionary.registerOre("seed", ItemHoopNuts.block);
		OreDictionary.registerOre("seeds", ItemHoopNuts.block);

		//Meat + fish:

		OreDictionary.registerOre("listAllfishraw", Items.FISH);
		OreDictionary.registerOre("listAllmeatraw", Items.FISH);
		OreDictionary.registerOre("foodMeat", Items.FISH);
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.FISH, (int) (1), 1));
		OreDictionary.registerOre("foodMeat", new ItemStack(Items.FISH, (int) (1), 1));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 2));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.FISH, (int) (1), 2));
		OreDictionary.registerOre("foodMeat", new ItemStack(Items.FISH, (int) (1), 2));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 3));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.FISH, (int) (1), 3));
		OreDictionary.registerOre("foodMeat", new ItemStack(Items.FISH, (int) (1), 3));

		OreDictionary.registerOre("listAllfishcooked", Items.COOKED_FISH);
		OreDictionary.registerOre("foodCooked", Items.COOKED_FISH);
		OreDictionary.registerOre("foodMeat", Items.COOKED_FISH);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_FISH);
		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.COOKED_FISH, (int) (1), 1));
		OreDictionary.registerOre("foodCooked", new ItemStack(Items.COOKED_FISH, (int) (1), 1));
		OreDictionary.registerOre("foodMeat", new ItemStack(Items.COOKED_FISH, (int) (1), 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_FISH, (int) (1), 1));

		OreDictionary.registerOre("listAllmeatraw", Items.BEEF);
		OreDictionary.registerOre("foodMeat", Items.BEEF);
		OreDictionary.registerOre("foodCooked", Items.COOKED_BEEF);
		OreDictionary.registerOre("foodMeat", Items.COOKED_BEEF);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_BEEF);

		OreDictionary.registerOre("listAllmeatraw", Items.PORKCHOP);
		OreDictionary.registerOre("foodMeat", Items.PORKCHOP);
		OreDictionary.registerOre("foodCooked", Items.COOKED_PORKCHOP);
		OreDictionary.registerOre("foodMeat", Items.COOKED_PORKCHOP);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_PORKCHOP);

		OreDictionary.registerOre("listAllmeatraw", Items.MUTTON);
		OreDictionary.registerOre("foodMeat", Items.MUTTON);
		OreDictionary.registerOre("foodCooked", Items.COOKED_MUTTON);
		OreDictionary.registerOre("foodMeat", Items.COOKED_MUTTON);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_MUTTON);

		OreDictionary.registerOre("listAllmeatraw", Items.CHICKEN);
		OreDictionary.registerOre("foodMeat", Items.CHICKEN);
		OreDictionary.registerOre("foodCooked", Items.COOKED_CHICKEN);
		OreDictionary.registerOre("foodMeat", Items.COOKED_CHICKEN);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_CHICKEN);

		OreDictionary.registerOre("listAllmeatraw", Items.RABBIT);
		OreDictionary.registerOre("foodMeat", Items.RABBIT);
		OreDictionary.registerOre("foodCooked", Items.COOKED_RABBIT);
		OreDictionary.registerOre("foodMeat", Items.COOKED_RABBIT);
		OreDictionary.registerOre("listAllmeatcooked", Items.COOKED_RABBIT);


		//========================================
		//Plants and blocks:
		//========================================


		OreDictionary.registerOre("dirt", BlockPrehistoricGroundLush.block);
		OreDictionary.registerOre("dirt", BlockPrehistoricGroundBasic.block);
        OreDictionary.registerOre("dirt", BlockPrehistoricGroundFern.block);
        OreDictionary.registerOre("dirt", BlockPrehistoricGroundMossy.block);
		OreDictionary.registerOre("dirt", BlockSandyDirt.block);
        OreDictionary.registerOre("dirt", BlockSandyDirtBlack.block);
        OreDictionary.registerOre("dirt", BlockSandyDirtPangaean.block);
        OreDictionary.registerOre("dirt", BlockSandyDirtRed.block);
        OreDictionary.registerOre("dirt", BlockSandyDirtWhite.block);
		OreDictionary.registerOre("dirt", BlockCoarseSandyDirt.block);
        OreDictionary.registerOre("dirt", BlockCoarseSandyDirtBlack.block);
		OreDictionary.registerOre("dirt", BlockCoarseSandyDirtPangaean.block);
		OreDictionary.registerOre("dirt", BlockCoarseSandyDirtRed.block);
        OreDictionary.registerOre("dirt", BlockCoarseSandyDirtWhite.block);
		OreDictionary.registerOre("dirt", BlockCoarseSiltyDirt.block);
		OreDictionary.registerOre("dirt", BlockSiltyDirt.block);
		OreDictionary.registerOre("dirt", new ItemStack(Blocks.DIRT, 1, 0));
		OreDictionary.registerOre("dirt", new ItemStack(Blocks.DIRT, 1, 1));

		OreDictionary.registerOre("blockSulphur", BlockSulphur.block);
		OreDictionary.registerOre("blockSulfur", BlockSulphur.block);
		OreDictionary.registerOre("oreSulphur", BlockSulphurOre.block);
		OreDictionary.registerOre("oreSulfur", BlockSulphurOre.block);
		OreDictionary.registerOre("oreSulphur", BlockSulphurOreNetherrack.block);
		OreDictionary.registerOre("oreSulfur", BlockSulphurOreNetherrack.block);
		OreDictionary.registerOre("itemSulphur", ItemSulphur.block);
		OreDictionary.registerOre("itemSulfur", ItemSulphur.block);
		OreDictionary.registerOre("dustSulphur", ItemSulphur.block);
		OreDictionary.registerOre("dustSulfur", ItemSulphur.block);

		OreDictionary.registerOre("stone", BlockLavaRock.block);
		OreDictionary.registerOre("stone", BlockLavaRockPolished.block);
		OreDictionary.registerOre("stone", BlockFossilPrecambrian.block);
		OreDictionary.registerOre("stone", BlockFossilCambrian.block);
		OreDictionary.registerOre("stone", BlockFossilOrdovician.block);
		OreDictionary.registerOre("stone", BlockFossilSilurian.block);
		OreDictionary.registerOre("stone", BlockFossilDevonian.block);
		OreDictionary.registerOre("stone", BlockFossilCarboniferous.block);
		OreDictionary.registerOre("stone", BlockFossilPermian.block);
		OreDictionary.registerOre("stone", BlockFossilTriassic.block);
		OreDictionary.registerOre("stone", BlockFossilJurassic.block);
		OreDictionary.registerOre("stone", BlockFossilCretaceous.block);
		OreDictionary.registerOre("stone", BlockFossilPaleogene.block);
		OreDictionary.registerOre("stone", BlockFossilNeogene.block);
		OreDictionary.registerOre("stone", BlockFossilPleistocene.block);

		OreDictionary.registerOre("sandstone", BlockSandstonePangaean.block);
		OreDictionary.registerOre("sandstone", BlockSandstonePangaeanCarved.block);
		OreDictionary.registerOre("sandstone", BlockSandstonePangaeanSmooth.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneBlack.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneBlackCarved.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneBlackSmooth.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneWhite.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneWhiteCarved.block);
        OreDictionary.registerOre("sandstone", BlockSandstoneWhiteSmooth.block);
		OreDictionary.registerOre("sandstone", Blocks.SANDSTONE);
		OreDictionary.registerOre("sandstone", Blocks.RED_SANDSTONE);

		OreDictionary.registerOre("sand", BlockPrehistoricGroundSand.block);
		OreDictionary.registerOre("sand", BlockPrehistoricGroundSandPangaean.block);
		OreDictionary.registerOre("sand", BlockPrehistoricGroundSandRed.block);
		OreDictionary.registerOre("sand", BlockPrehistoricGroundSandBlack.block);
        OreDictionary.registerOre("sand", BlockPrehistoricGroundSandWhite.block);
		OreDictionary.registerOre("sand", BlockSandPangaean.block);
		OreDictionary.registerOre("sand", BlockSandPangaeanSticky.block);
		OreDictionary.registerOre("sand", BlockSandPangaeanWavy.block);
		OreDictionary.registerOre("sand", BlockSandPangaeanWavySticky.block);
		OreDictionary.registerOre("sand", new ItemStack(Blocks.SAND, 1, 0));
		OreDictionary.registerOre("sand", new ItemStack(Blocks.SAND, 1, 1));
		OreDictionary.registerOre("sand", BlockSandWavy.block);
		OreDictionary.registerOre("sand", BlockSandWavySticky.block);
		OreDictionary.registerOre("sand", BlockSandSticky.block);
		OreDictionary.registerOre("sand", BlockSandRedWavy.block);
		OreDictionary.registerOre("sand", BlockSandRedWavySticky.block);
		OreDictionary.registerOre("sand", BlockSandRedSticky.block);
		OreDictionary.registerOre("sand", BlockSandBlack.block);
		OreDictionary.registerOre("sand", BlockSandBlackSticky.block);
		OreDictionary.registerOre("sand", BlockSandBlackWavy.block);
		OreDictionary.registerOre("sand", BlockSandBlackWavySticky.block);
        OreDictionary.registerOre("sand", BlockSandWhite.block);
        OreDictionary.registerOre("sand", BlockSandWhiteSticky.block);
        OreDictionary.registerOre("sand", BlockSandWhiteWavy.block);
        OreDictionary.registerOre("sand", BlockSandWhiteWavySticky.block);

		OreDictionary.registerOre("blockSand", BlockPrehistoricGroundSand.block);
		OreDictionary.registerOre("blockSand", BlockPrehistoricGroundSandPangaean.block);
		OreDictionary.registerOre("blockSand", BlockPrehistoricGroundSandRed.block);
		OreDictionary.registerOre("blockSand", BlockPrehistoricGroundSandBlack.block);
		OreDictionary.registerOre("blockSand", BlockSandPangaean.block);
		OreDictionary.registerOre("blockSand", BlockSandPangaeanSticky.block);
		OreDictionary.registerOre("blockSand", BlockSandPangaeanWavy.block);
		OreDictionary.registerOre("blockSand", BlockSandPangaeanWavySticky.block);
		OreDictionary.registerOre("blockSand", new ItemStack(Blocks.SAND, 1, 0));
		OreDictionary.registerOre("blockSand", new ItemStack(Blocks.SAND, 1, 1));
		OreDictionary.registerOre("blockSand", BlockSandWavy.block);
		OreDictionary.registerOre("blockSand", BlockSandWavySticky.block);
		OreDictionary.registerOre("blockSand", BlockSandSticky.block);
		OreDictionary.registerOre("blockSand", BlockSandRedWavy.block);
		OreDictionary.registerOre("blockSand", BlockSandRedWavySticky.block);
		OreDictionary.registerOre("blockSand", BlockSandRedSticky.block);
		OreDictionary.registerOre("blockSand", BlockSandBlack.block);
		OreDictionary.registerOre("blockSand", BlockSandBlackSticky.block);
		OreDictionary.registerOre("blockSand", BlockSandBlackWavy.block);
		OreDictionary.registerOre("blockSand", BlockSandBlackWavySticky.block);

		OreDictionary.registerOre("blockClay", BlockRedClay.block);
		OreDictionary.registerOre("blockClay", Blocks.CLAY);
		OreDictionary.registerOre("itemClay", ItemRedClayBall.block);
		OreDictionary.registerOre("itemClay", Items.CLAY_BALL);


		//Probably some compats in here:
		OreDictionary.registerOre("stone", BlockAraucarioxylonLogPetrified.block);
		OreDictionary.registerOre("stone", BlockAraucarioxylonPlanksPetrified.block);
		OreDictionary.registerOre("slabStone", BlockAraucarioxylonSlabPetrified.block);
		OreDictionary.registerOre("stairStone", BlockAraucarioxylonStairsPetrified.block);
		OreDictionary.registerOre("wallStone", BlockAraucarioxylonWall.block);
		OreDictionary.registerOre("stone", BlockAraucarioxylonPlanksPetrifiedBricks.block);
		OreDictionary.registerOre("slabStone", BlockAraucarioxylonSlabPetrifiedBricks.block);
		OreDictionary.registerOre("stairStone", BlockAraucarioxylonStairsPetrifiedBricks.block);
		OreDictionary.registerOre("wallStone", BlockAraucarioxylonWallPetrifiedBricks.block);
		OreDictionary.registerOre("oreAmber", BlockBalticAmberOre.block);
		OreDictionary.registerOre("oreAmber", BlockDominicanAmberOre.block);
		OreDictionary.registerOre("gemAmber", ItemBalticAmberChunk.block);
		OreDictionary.registerOre("gemAmber", ItemDominicanAmberChunk.block);
		OreDictionary.registerOre("blockAmber", BlockBalticAmberBlock.block);
		OreDictionary.registerOre("blockAmber", BlockDominicanAmberBlock.block);
		OreDictionary.registerOre("stairAmber", BlockBalticAmberStairs.block);
		OreDictionary.registerOre("stairAmber", BlockDominicanAmberStairs.block);
		OreDictionary.registerOre("slabAmber", BlockBalticAmberSlab.block);
		OreDictionary.registerOre("slabAmber", BlockDominicanAmberSlab.block);
		OreDictionary.registerOre("wallAmber", BlockBalticAmberWall.block);
		OreDictionary.registerOre("wallAmber", BlockDominicanAmberWall.block);
		OreDictionary.registerOre("blockAmber", BlockBalticAmberBricks.block);
		OreDictionary.registerOre("blockAmber", BlockDominicanAmberBricks.block);
		OreDictionary.registerOre("stairAmber", BlockBalticAmberBrickStairs.block);
		OreDictionary.registerOre("stairAmber", BlockDominicanAmberBrickStairs.block);
		OreDictionary.registerOre("slabAmber", BlockBalticAmberBrickSlab.block);
		OreDictionary.registerOre("slabAmber", BlockDominicanAmberBrickSlab.block);
		OreDictionary.registerOre("wallAmber", BlockBalticAmberBrickWall.block);
		OreDictionary.registerOre("wallAmber", BlockDominicanAmberBrickWall.block);
		OreDictionary.registerOre("oreSalt", BlockSaltOre.block);
		OreDictionary.registerOre("itemSalt", ItemSalt.block);
		OreDictionary.registerOre("dustSalt", ItemSalt.block);
		OreDictionary.registerOre("foodSalt", ItemSalt.block);
		OreDictionary.registerOre("blockSalt", BlockSaltBlock.block);

		OreDictionary.registerOre("oreZircon", BlockLavaRockZirconOre.block);
		OreDictionary.registerOre("gemZircon", ItemZircon.block);
		OreDictionary.registerOre("blockZircon", BlockZircon.block);
		OreDictionary.registerOre("blockGlass", BlockZirconGlass.block);
		OreDictionary.registerOre("blockGlass", Blocks.GLASS);
		OreDictionary.registerOre("paneGlass", BlockZirconGlassPane.block);
		OreDictionary.registerOre("paneGlass", Blocks.GLASS_PANE);

		//OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.REEDS, 1));
		OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.TALLGRASS, 1, 1));
		OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));

		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 1));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 2));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 3));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, 1, 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, 1, 1));

		OreDictionary.registerOre("slabWood", BlockWoodenSlab.block);
		OreDictionary.registerOre("slabWood", BlockAlpiaSlab.block);
		OreDictionary.registerOre("slabWood", BlockGlossopterisSlab.block);
		OreDictionary.registerOre("slabWood", BlockGangamopterisSlab.block);
		OreDictionary.registerOre("slabWood", BlockLiriodendronSlab.block);
		OreDictionary.registerOre("slabWood", BlockMagnoliaSlab.block);
		OreDictionary.registerOre("slabWood", BlockRedwoodSlab.block);
		OreDictionary.registerOre("slabWood", BlockWollemiSlab.block);
		OreDictionary.registerOre("slabWood", BlockBothrodendronSlab.block);
		OreDictionary.registerOre("slabWood", BlockDiaphorodendronSlab.block);
		OreDictionary.registerOre("slabWood", BlockGinkgoSlab.block);
		OreDictionary.registerOre("slabWood", BlockSphenobaieraSlab.block);
		OreDictionary.registerOre("slabWood", BlockAgathisSlab.block);
		OreDictionary.registerOre("slabWood", BlockAraucariaSlab.block);
		OreDictionary.registerOre("slabWood", BlockSigillariaSlab.block);
		OreDictionary.registerOre("slabWood", BlockAraucarioxylonSlab.block);
		OreDictionary.registerOre("slabWood", BlockSciadopitysSlab.block);
		OreDictionary.registerOre("slabWood", BlockCordaitesSlab.block);
		OreDictionary.registerOre("slabWood", BlockPodozamitesSlab.block);
		OreDictionary.registerOre("slabWood", BlockWalchiaSlab.block);
		OreDictionary.registerOre("slabWood", BlockTelemachusSlab.block);
		OreDictionary.registerOre("slabWood", BlockHymenaeaSlab.block);
		OreDictionary.registerOre("slabWood", BlockDicroidiumOSlab.block);
		OreDictionary.registerOre("slabWood", BlockBristleconeSlab.block);
		OreDictionary.registerOre("slabWood", BlockHironoiaSlab.block);
		OreDictionary.registerOre("slabWood", BlockArchaeopterisSlab.block);
		OreDictionary.registerOre("slabWood", BlockDawnRedwoodSlab.block);
		OreDictionary.registerOre("slabWood", BlockMapleSlab.block);
		OreDictionary.registerOre("slabWood", BlockArtocarpusSlab.block);
		OreDictionary.registerOre("slabWood", BlockNothofagusSlab.block);
		OreDictionary.registerOre("slabWood", BlockYewSlab.block);
		OreDictionary.registerOre("slabWood", BlockBrachyphyllumSlab.block);
		OreDictionary.registerOre("slabWood", BlockTaxodiumSlab.block);
		OreDictionary.registerOre("slabWood", BlockPodocarpSlab.block);
		OreDictionary.registerOre("slabWood", BlockPitysSlab.block);
		OreDictionary.registerOre("slabWood", BlockCzekanowskiaSlab.block);
		OreDictionary.registerOre("slabWood", BlockMacroneuropterisSlab.block);
		OreDictionary.registerOre("slabWood", BlockDeadSlab.block);
		OreDictionary.registerOre("slabWood", BlockArthropitysSlab.block);
		OreDictionary.registerOre("slabWood", BlockDicroidiumFSlab.block);
		OreDictionary.registerOre("slabWood", BlockBeechSlab.block);
		OreDictionary.registerOre("slabWood", BlockPlaneSlab.block);
		OreDictionary.registerOre("slabWood", BlockSycamoreSlab.block);
		OreDictionary.registerOre("slabWood", BlockFurculaSlab.block);
		OreDictionary.registerOre("slabWood", BlockAraucaritesSlab.block);
		OreDictionary.registerOre("slabWood", BlockPentoxylalesSlab.block);
		OreDictionary.registerOre("slabWood", BlockCypressSlab.block);
		OreDictionary.registerOre("slabWood", BlockPhoenicopsisSlab.block);
		OreDictionary.registerOre("slabWood", BlockGinkgoitesSlab.block);
		OreDictionary.registerOre("slabWood", BlockArchaeanthusSlab.block);
		OreDictionary.registerOre("slabWood", BlockAppleSlab.block);
		OreDictionary.registerOre("slabWood", BlockCephalotaxusSlab.block);
		OreDictionary.registerOre("slabWood", BlockCunninghamiaSlab.block);

		OreDictionary.registerOre("fenceWood", BlockWoodenFence.block);
		OreDictionary.registerOre("fenceWood", BlockAlpiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockGlossopterisFence.block);
		OreDictionary.registerOre("fenceWood", BlockGangamopterisFence.block);
		OreDictionary.registerOre("fenceWood", BlockLiriodendronFence.block);
		OreDictionary.registerOre("fenceWood", BlockMagnoliaFence.block);
		OreDictionary.registerOre("fenceWood", BlockRedwoodFence.block);
		OreDictionary.registerOre("fenceWood", BlockWollemiFence.block);
		OreDictionary.registerOre("fenceWood", BlockBothrodendronFence.block);
		OreDictionary.registerOre("fenceWood", BlockDiaphorodendronFence.block);
		OreDictionary.registerOre("fenceWood", BlockGinkgoFence.block);
		OreDictionary.registerOre("fenceWood", BlockSphenobaieraFence.block);
		OreDictionary.registerOre("fenceWood", BlockAgathisFence.block);
		OreDictionary.registerOre("fenceWood", BlockAraucariaFence.block);
		OreDictionary.registerOre("fenceWood", BlockSigillariaFence.block);
		OreDictionary.registerOre("fenceWood", BlockAraucarioxylonFence.block);
		OreDictionary.registerOre("fenceWood", BlockSciadopitysFence.block);
		OreDictionary.registerOre("fenceWood", BlockCordaitesFence.block);
		OreDictionary.registerOre("fenceWood", BlockPodozamitesFence.block);
		OreDictionary.registerOre("fenceWood", BlockWalchiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockTelemachusFence.block);
		OreDictionary.registerOre("fenceWood", BlockHymenaeaFence.block);
		OreDictionary.registerOre("fenceWood", BlockDicroidiumOFence.block);
		OreDictionary.registerOre("fenceWood", BlockBristleconeFence.block);
		OreDictionary.registerOre("fenceWood", BlockHironoiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockArchaeopterisFence.block);
		OreDictionary.registerOre("fenceWood", BlockDawnRedwoodFence.block);
		OreDictionary.registerOre("fenceWood", BlockMapleFence.block);
		OreDictionary.registerOre("fenceWood", BlockArtocarpusFence.block);
		OreDictionary.registerOre("fenceWood", BlockNothofagusFence.block);
		OreDictionary.registerOre("fenceWood", BlockYewFence.block);
		OreDictionary.registerOre("fenceWood", BlockBrachyphyllumFence.block);
		OreDictionary.registerOre("fenceWood", BlockTaxodiumFence.block);
		OreDictionary.registerOre("fenceWood", BlockPodocarpFence.block);
		OreDictionary.registerOre("fenceWood", BlockPitysFence.block);
		OreDictionary.registerOre("fenceWood", BlockCzekanowskiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockMacroneuropterisFence.block);
		OreDictionary.registerOre("fenceWood", BlockDeadFence.block);
		OreDictionary.registerOre("fenceWood", BlockArthropitysFence.block);
		OreDictionary.registerOre("fenceWood", BlockDicroidiumFFence.block);
		OreDictionary.registerOre("fenceWood", BlockBeechFence.block);
		OreDictionary.registerOre("fenceWood", BlockPlaneFence.block);
		OreDictionary.registerOre("fenceWood", BlockSycamoreFence.block);
		OreDictionary.registerOre("fenceWood", BlockFurculaFence.block);
		OreDictionary.registerOre("fenceWood", BlockAraucaritesFence.block);
		OreDictionary.registerOre("fenceWood", BlockPentoxylalesFence.block);
		OreDictionary.registerOre("fenceWood", BlockCypressFence.block);
		OreDictionary.registerOre("fenceWood", BlockPhoenicopsisFence.block);
		OreDictionary.registerOre("fenceWood", BlockGinkgoitesFence.block);
		OreDictionary.registerOre("fenceWood", BlockArchaeanthusFence.block);
		OreDictionary.registerOre("fenceWood", BlockAppleFence.block);
		OreDictionary.registerOre("fenceWood", BlockCephalotaxusFence.block);
		OreDictionary.registerOre("fenceWood", BlockCunninghamiaFence.block);

		//Thin fences:
		OreDictionary.registerOre("fenceWood", BlockSigillariaThinFence.block);
		OreDictionary.registerOre("fenceWood", BlockArchaeopterisFenceThin.block);
		OreDictionary.registerOre("fenceWood", BlockPsaroniusFence.block);
		OreDictionary.registerOre("fenceWood", BlockTieteaFence.block);
		OreDictionary.registerOre("fenceWood", BlockEmplectopterisFence.block);
		OreDictionary.registerOre("fenceWood", BlockGigantopteridFence.block);
		OreDictionary.registerOre("fenceWood", BlockLeptocycasFence.block);
		OreDictionary.registerOre("fenceWood", BlockDicroidiumFence.block);
		OreDictionary.registerOre("fenceWood", BlockMedullosalesFence.block);
		OreDictionary.registerOre("fenceWood", BlockPleuromeiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockUtrechtiaFence.block);
		OreDictionary.registerOre("fenceWood", BlockPterophyllumFence.block);
		OreDictionary.registerOre("fenceWood", BlockCalamophytonFence.block);
		OreDictionary.registerOre("fenceWood", BlockRufloriaFence.block);
		OreDictionary.registerOre("fenceWood", BlockAneurophytonFence.block);
		OreDictionary.registerOre("fenceWood", BlockPhasmatocycasFence.block);

		OreDictionary.registerOre("fenceGateWood", BlockWoodenFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAlpiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockGlossopterisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockGangamopterisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockLiriodendronFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockMagnoliaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockRedwoodFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockWollemiFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockBothrodendronFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDiaphorodendronFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockGinkgoFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockSphenobaieraFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAgathisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAraucariaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockSigillariaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAraucarioxylonFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockSciadopitysFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCordaitesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPodozamitesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockWalchiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockTelemachusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockHymenaeaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDicroidiumOFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockBristleconeFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockHironoiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockArchaeopterisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDawnRedwoodFence.block);
		OreDictionary.registerOre("fenceGateWood", BlockMapleFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockArtocarpusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockNothofagusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockYewFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockBrachyphyllumFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockTaxodiumFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPodocarpFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPitysFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCzekanowskiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockMacroneuropterisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDeadFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockArthropitysFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDicroidiumFFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockBeechFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPlaneFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockSycamoreFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockFurculaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAraucaritesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPentoxylalesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCypressFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPhoenicopsisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockGinkgoitesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockArchaeanthusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAppleFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDawnRedwoodFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCephalotaxusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCunninghamiaFenceGate.block);

		//Thin fences:
		OreDictionary.registerOre("fenceGateWood", BlockSigillariaThinFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockArchaeopterisFenceGateThin.block);
		OreDictionary.registerOre("fenceGateWood", BlockPsaroniusFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockTieteaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockEmplectopterisFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockGigantopteridFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockLeptocycasFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockDicroidiumFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockMedullosalesFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPleuromeiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockUtrechtiaFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPterophyllumFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockCalamophytonFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockAneurophytonFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockPhasmatocycasFenceGate.block);
		OreDictionary.registerOre("fenceGateWood", BlockRufloriaFenceGate.block);

		OreDictionary.registerOre("doorWood", ItemLepidodendronDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemGlossopterisDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemGangamopterisDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemDicroidiumODoorItem.block);
		OreDictionary.registerOre("doorWood", ItemDiaphorodendronDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemYewDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAgathisDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAlpiaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAraucariaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAraucarioxylonDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemCordaitesDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemDawnRedwoodDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPodozamitesDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemRedwoodDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemSciadopitysDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemWalchiaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemTelemachusDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemWollemiDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemBristleconeDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemGinkgoDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemSphenobaieraDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemBrachyphyllumDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemMagnoliaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemBothrodendronDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemArtocarpusDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemHironoiaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemLepidodendronDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemMapleDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemNothofagusDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemTaxodiumDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPodocarpDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPitysDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemCzekanowskiaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemMacroneuropterisDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemDeadDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemArthropitysDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemDicroidiumFDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemBeechDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPlaneDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemSycamoreDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemFurculaDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAraucaritesDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPentoxylalesDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemCypressDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemPhoenicopsisDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemGinkgoitesDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemArchaeanthusDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemAppleDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemCephalotaxusDoorItem.block);
		OreDictionary.registerOre("doorWood", ItemCunninghamiaDoorItem.block);

		//Compat for Calamites:
		OreDictionary.registerOre("listAllfiber", ItemCalamitesDoorItem.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesSlab.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesPlanks.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesStairs.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesTrapdoor.block);

		OreDictionary.registerOre("plankWood", BlockWoodenPlanks.block);
		OreDictionary.registerOre("plankWood", BlockAlpiaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockGlossopterisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockGangamopterisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockLiriodendronPlanks.block);
		OreDictionary.registerOre("plankWood", BlockMagnoliaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockRedwoodPlanks.block);
		OreDictionary.registerOre("plankWood", BlockWollemiPlanks.block);
		OreDictionary.registerOre("plankWood", BlockBothrodendronPlanks.block);
		OreDictionary.registerOre("plankWood", BlockDiaphorodendronPlanks.block);
		OreDictionary.registerOre("plankWood", BlockGinkgoPlanks.block);
		OreDictionary.registerOre("plankWood", BlockSphenobaieraPlanks.block);
		OreDictionary.registerOre("plankWood", BlockAgathisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockAraucariaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockSigillariaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockAraucarioxylonPlanks.block);
		OreDictionary.registerOre("plankWood", BlockSciadopitysPlanks.block);
		OreDictionary.registerOre("plankWood", BlockCordaitesPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPodozamitesPlanks.block);
		OreDictionary.registerOre("plankWood", BlockWalchiaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockTelemachusPlanks.block);
		OreDictionary.registerOre("plankWood", BlockHymenaeaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockDicroidiumOPlanks.block);
		OreDictionary.registerOre("plankWood", BlockBristleconePlanks.block);
		OreDictionary.registerOre("plankWood", BlockHironoiaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockArchaeopterisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockDawnRedwoodPlanks.block);
		OreDictionary.registerOre("plankWood", BlockMaplePlanks.block);
		OreDictionary.registerOre("plankWood", BlockArtocarpusPlanks.block);
		OreDictionary.registerOre("plankWood", BlockNothofagusPlanks.block);
		OreDictionary.registerOre("plankWood", BlockYewPlanks.block);
		OreDictionary.registerOre("plankWood", BlockBrachyphyllumPlanks.block);
		OreDictionary.registerOre("plankWood", BlockTaxodiumPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPodocarpPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPitysPlanks.block);
		OreDictionary.registerOre("plankWood", BlockCzekanowskiaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockMacroneuropterisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockDeadPlanks.block);
		OreDictionary.registerOre("plankWood", BlockArthropitysPlanks.block);
		OreDictionary.registerOre("plankWood", BlockDicroidiumFPlanks.block);
		OreDictionary.registerOre("plankWood", BlockBeechPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPlanePlanks.block);
		OreDictionary.registerOre("plankWood", BlockSycamorePlanks.block);
		OreDictionary.registerOre("plankWood", BlockFurculaPlanks.block);
		OreDictionary.registerOre("plankWood", BlockAraucaritesPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPentoxylalesPlanks.block);
		OreDictionary.registerOre("plankWood", BlockCypressPlanks.block);
		OreDictionary.registerOre("plankWood", BlockPhoenicopsisPlanks.block);
		OreDictionary.registerOre("plankWood", BlockGinkgoitesPlanks.block);
		OreDictionary.registerOre("plankWood", BlockArchaeanthusPlanks.block);
		OreDictionary.registerOre("plankWood", BlockApplePlanks.block);
		OreDictionary.registerOre("plankWood", BlockCephalotaxusPlanks.block);
		OreDictionary.registerOre("plankWood", BlockCunninghamiaPlanks.block);

		OreDictionary.registerOre("stairWood", BlockWoodenStairs.block);
		OreDictionary.registerOre("stairWood", BlockAlpiaStairs.block);
		OreDictionary.registerOre("stairWood", BlockGlossopterisStairs.block);
		OreDictionary.registerOre("stairWood", BlockGangamopterisStairs.block);
		OreDictionary.registerOre("stairWood", BlockLiriodendronStairs.block);
		OreDictionary.registerOre("stairWood", BlockMagnoliaStairs.block);
		OreDictionary.registerOre("stairWood", BlockRedwoodStairs.block);
		OreDictionary.registerOre("stairWood", BlockWollemiStairs.block);
		OreDictionary.registerOre("stairWood", BlockBothrodendronStairs.block);
		OreDictionary.registerOre("stairWood", BlockDiaphorodendronStairs.block);
		OreDictionary.registerOre("stairWood", BlockGinkgoStairs.block);
		OreDictionary.registerOre("stairWood", BlockSphenobaieraStairs.block);
		OreDictionary.registerOre("stairWood", BlockAgathisStairs.block);
		OreDictionary.registerOre("stairWood", BlockAraucariaStairs.block);
		OreDictionary.registerOre("stairWood", BlockSigillariaStairs.block);
		OreDictionary.registerOre("stairWood", BlockAraucarioxylonStairs.block);
		OreDictionary.registerOre("stairWood", BlockSciadopitysStairs.block);
		OreDictionary.registerOre("stairWood", BlockCordaitesStairs.block);
		OreDictionary.registerOre("stairWood", BlockPodozamitesStairs.block);
		OreDictionary.registerOre("stairWood", BlockWalchiaStairs.block);
		OreDictionary.registerOre("stairWood", BlockTelemachusStairs.block);
		OreDictionary.registerOre("stairWood", BlockHymenaeaStairs.block);
		OreDictionary.registerOre("stairWood", BlockDicroidiumOStairs.block);
		OreDictionary.registerOre("stairWood", BlockBristleconeStairs.block);
		OreDictionary.registerOre("stairWood", BlockHironoiaStairs.block);
		OreDictionary.registerOre("stairWood", BlockArchaeopterisStairs.block);
		OreDictionary.registerOre("stairWood", BlockDawnRedwoodStairs.block);
		OreDictionary.registerOre("stairWood", BlockMapleStairs.block);
		OreDictionary.registerOre("stairWood", BlockArtocarpusStairs.block);
		OreDictionary.registerOre("stairWood", BlockNothofagusStairs.block);
		OreDictionary.registerOre("stairWood", BlockYewStairs.block);
		OreDictionary.registerOre("stairWood", BlockBrachyphyllumStairs.block);
		OreDictionary.registerOre("stairWood", BlockTaxodiumStairs.block);
		OreDictionary.registerOre("stairWood", BlockPodocarpStairs.block);
		OreDictionary.registerOre("stairWood", BlockPitysStairs.block);
		OreDictionary.registerOre("stairWood", BlockCzekanowskiaStairs.block);
		OreDictionary.registerOre("stairWood", BlockMacroneuropterisStairs.block);
		OreDictionary.registerOre("stairWood", BlockDeadStairs.block);
		OreDictionary.registerOre("stairWood", BlockArthropitysStairs.block);
		OreDictionary.registerOre("stairWood", BlockDicroidiumFStairs.block);
		OreDictionary.registerOre("stairWood", BlockBeechStairs.block);
		OreDictionary.registerOre("stairWood", BlockPlaneStairs.block);
		OreDictionary.registerOre("stairWood", BlockSycamoreStairs.block);
		OreDictionary.registerOre("stairWood", BlockFurculaStairs.block);
		OreDictionary.registerOre("stairWood", BlockAraucaritesStairs.block);
		OreDictionary.registerOre("stairWood", BlockPentoxylalesStairs.block);
		OreDictionary.registerOre("stairWood", BlockCypressStairs.block);
		OreDictionary.registerOre("stairWood", BlockPhoenicopsisStairs.block);
		OreDictionary.registerOre("stairWood", BlockGinkgoitesStairs.block);
		OreDictionary.registerOre("stairWood", BlockArchaeanthusStairs.block);
		OreDictionary.registerOre("stairWood", BlockAppleStairs.block);
		OreDictionary.registerOre("stairWood", BlockCephalotaxusStairs.block);
		OreDictionary.registerOre("stairWood", BlockCunninghamiaStairs.block);

		OreDictionary.registerOre("trapdoorWood", BlockWoodenTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAlpiaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockGlossopterisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockGangamopterisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockLiriodendronTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockMagnoliaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockRedwoodTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockWollemiTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockBothrodendronTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDiaphorodendronTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockGinkgoTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockSphenobaieraTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAgathisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAraucariaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockSigillariaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAraucarioxylonTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockSciadopitysTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockCordaitesTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPodozamitesTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockWalchiaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockTelemachusTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockHymenaeaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDicroidiumOTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockBristleconeTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockHironoiaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockArchaeopterisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDawnRedwoodTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockMapleTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockArtocarpusTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockNothofagusTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockYewTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockBrachyphyllumTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockTaxodiumTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPodocarpTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPitysTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockCzekanowskiaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockMacroneuropterisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDeadTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockArthropitysTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDicroidiumFTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockBeechTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPlaneTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockSycamoreTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockFurculaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAraucaritesTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPentoxylalesTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockCypressTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockPhoenicopsisTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockGinkgoitesTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockArchaeanthusTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAppleTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockAcaciaTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockJungleTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockDarkOakTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockBirchTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockSpruceTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockOakTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockCephalotaxusTrapdoor.block);
		OreDictionary.registerOre("trapdoorWood", BlockCunninghamiaTrapdoor.block);


		OreDictionary.registerOre("plant", BlockPrehistoricGroundCoverPlants.block);
		OreDictionary.registerOre("plant", BlockPrehistoricGroundCoverPlantsLush.block);
		OreDictionary.registerOre("plant", BlockPrehistoricGroundCoverPlantsSandy.block);
		OreDictionary.registerOre("plant", BlockPrehistoricGroundCoverPlantsPangaean.block);

		//Vanilla plants:
		OreDictionary.registerOre("plant", new ItemStack(Blocks.TALLGRASS, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.TALLGRASS, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.TALLGRASS, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 4));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.DOUBLE_PLANT, 1, 5));

		//Vanilla trees:
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 4));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 5));
		OreDictionary.registerOre("dnaPNOak", new ItemStack(Blocks.SAPLING, 1, 0));
		OreDictionary.registerOre("dnaPNSpruce", new ItemStack(Blocks.SAPLING, 1, 1));
		OreDictionary.registerOre("dnaPNBirch", new ItemStack(Blocks.SAPLING, 1, 2));
		OreDictionary.registerOre("dnaPNJungle", new ItemStack(Blocks.SAPLING, 1, 3));
		OreDictionary.registerOre("plantdnaPNacacia_sapling", new ItemStack(Blocks.SAPLING, 1, 4));
		OreDictionary.registerOre("dnaPNDarkOak", new ItemStack(Blocks.SAPLING, 1, 5));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES2, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES2, 1, 1));
		OreDictionary.registerOre("dnaPNOak", new ItemStack(Blocks.LEAVES, 1, 0));
		OreDictionary.registerOre("dnaPNSpruce", new ItemStack(Blocks.LEAVES, 1, 1));
		OreDictionary.registerOre("dnaPNBirch", new ItemStack(Blocks.LEAVES, 1, 2));
		OreDictionary.registerOre("dnaPNJungle", new ItemStack(Blocks.LEAVES, 1, 3));
		OreDictionary.registerOre("plantdnaPNacacia_sapling", new ItemStack(Blocks.LEAVES2, 1, 0));
		OreDictionary.registerOre("dnaPNDarkOak", new ItemStack(Blocks.LEAVES2, 1, 1));
		OreDictionary.registerOre("dnaPNOak", new ItemStack(Blocks.LOG, 1, 0));
		OreDictionary.registerOre("dnaPNSpruce", new ItemStack(Blocks.LOG, 1, 1));
		OreDictionary.registerOre("dnaPNBirch", new ItemStack(Blocks.LOG, 1, 2));
		OreDictionary.registerOre("dnaPNJungle", new ItemStack(Blocks.LOG, 1, 3));
		OreDictionary.registerOre("plantdnaPNacacia_sapling", new ItemStack(Blocks.LOG2, 1, 0));
		OreDictionary.registerOre("dnaPNDarkOak", new ItemStack(Blocks.LOG2, 1, 1));


		OreDictionary.registerOre("plant", new ItemStack(Blocks.VINE, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.WATERLILY, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.YELLOW_FLOWER, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 4));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 5));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 6));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 7));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.RED_FLOWER, 1, 8));

	}



}
