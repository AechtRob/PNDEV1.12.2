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
import net.minecraft.item.Item;
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
			for (Object block : Block.REGISTRY) {
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if (true) {
					;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

					for (int var4 = 0; var4 < var3; ++var4) {
						String checkBlock = var2[var4];
						//Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkBlock.indexOf(":", checkBlock.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkBlock.substring(strPos + 1));
							checkBlock = checkBlock.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						} else {
							meta = -1;
						}

						if (checkBlock.equalsIgnoreCase(Block.REGISTRY.getNameForObject((Block) block).toString())) {
							if (meta == -1) {
								OreDictionary.registerOre("logResin", new ItemStack((Block) block, (int) (1)));
							} else {
								OreDictionary.registerOre("logResin", new ItemStack((Block) block, (int) (1), meta));
							}
						}

					}
				}
			}
		} catch (Exception e) {
		}

		var2 = LepidodendronConfig.genLogLatex;
		var3 = var2.length;

		try {
			for (Object block : Block.REGISTRY) {
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if (true) {
					;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

					for (int var4 = 0; var4 < var3; ++var4) {
						String checkBlock = var2[var4];
						//Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkBlock.indexOf(":", checkBlock.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkBlock.substring(strPos + 1));
							checkBlock = checkBlock.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						} else {
							meta = -1;
						}

						if (checkBlock.equalsIgnoreCase(Block.REGISTRY.getNameForObject((Block) block).toString())) {
							if (meta == -1) {
								OreDictionary.registerOre("logLatex", new ItemStack((Block) block, (int) (1)));
							} else {
								OreDictionary.registerOre("logLatex", new ItemStack((Block) block, (int) (1), meta));
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
			for (Object block : Block.REGISTRY) {
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if (true) {
					;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

					for (int var4 = 0; var4 < var3; ++var4) {
						String checkBlock = var2[var4];
						//Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkBlock.indexOf(":", checkBlock.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkBlock.substring(strPos + 1));
							checkBlock = checkBlock.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						} else {
							meta = -1;
						}

						if (checkBlock.equalsIgnoreCase(Block.REGISTRY.getNameForObject((Block) block).toString())) {
							if (meta == -1) {
								OreDictionary.registerOre("plantPrehistoric", new ItemStack((Block) block, (int) (1)));
								OreDictionary.registerOre("plant", new ItemStack((Block) block, (int) (1)));
							} else {
								OreDictionary.registerOre("plantPrehistoric", new ItemStack((Block) block, (int) (1), meta));
								OreDictionary.registerOre("plant", new ItemStack((Block) block, (int) (1), meta));
							}
						}

					}
				}
			}
		} catch (Exception e) {
		}

		var2 = LepidodendronConfig.submarineInventory;
		var3 = var2.length;

		try {
			for (Object item : Item.REGISTRY) {
				//String name = Block.REGISTRY.getNameForObject((Block)block).toString();
				if (true) {
					;
					//outstream.write(name);
					//outstream.newLine();
					//System.err.println("BLOCK FOUND: " + name);

					for (int var4 = 0; var4 < var3; ++var4) {
						String checkItem = var2[var4];
						//Is there a metadata tag? If so, keep it and strip it out of the string:
						int strPos = checkItem.indexOf(":", checkItem.indexOf(":") + 1);
						//System.err.println("ORGBLOCK: " + checkBlock);
						//System.err.println("SECOND COLON: " + strPos);
						if (strPos > 0) {
							meta = (int) Integer.parseInt(checkItem.substring(strPos + 1));
							checkItem = checkItem.substring(0, strPos);
							//System.err.println("REVBLOCK: " + checkBlock + " meta: " + meta);
						} else {
							meta = -1;
						}

						if (checkItem.equalsIgnoreCase(Item.REGISTRY.getNameForObject((Item) item).toString())) {
							if (meta == -1) {
								OreDictionary.registerOre("inventorySubmarine", new ItemStack((Item) item, (int) (1)));
							} else {
								OreDictionary.registerOre("inventorySubmarine", new ItemStack((Item) item, (int) (1), meta));

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

		//Coal/Anthracite:
		OreDictionary.registerOre("blockCoal", BlockAnthracite.block);
		OreDictionary.registerOre("itemCoal", ItemAnthracite.block);
		OreDictionary.registerOre("itemCoal", new ItemStack(Items.COAL, 1, 0));
		OreDictionary.registerOre("itemCoal", new ItemStack(Items.COAL,1, 1));
		OreDictionary.registerOre("blockAnthracite", BlockAnthracite.block);
		OreDictionary.registerOre("itemAnthracite", ItemAnthracite.block);

		//Wood:
		OreDictionary.registerOre("plankWood", BlockStickBundle.block);
		OreDictionary.registerOre("plateWood", new ItemStack(Blocks.WOODEN_PRESSURE_PLATE, 1));

		//Iron:
		OreDictionary.registerOre("plateIron", new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 1));

		//Cabinets
		OreDictionary.registerOre("archiveCabinet", BlockLabCabinet.block);
		OreDictionary.registerOre("archiveCabinet", BlockLabCabinetFlipped.block);

		//Mud:
		OreDictionary.registerOre("blockMud", BlockCarboniferousMud.block);

		//Ropes:
		OreDictionary.registerOre("itemRope", BlockHoldfast.block);

		//Gigantopterids:
		OreDictionary.registerOre("itemGigantopteridStem", BlockGigantopteridLog.block);
		OreDictionary.registerOre("itemGigantopteridStem", BlockGigantopteridClimbingStem.block);

		//Autumn saplings:
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Items.SNOWBALL, 1));
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Blocks.PACKED_ICE, 1));
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Blocks.SNOW, 1));
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Blocks.SNOW_LAYER, 1));
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Blocks.ICE, 1));
		OreDictionary.registerOre("saplingAutumnifier", new ItemStack(Blocks.FROSTED_ICE, 1));

		//Fungi:
		OreDictionary.registerOre("itemFungus", new ItemStack(Blocks.BROWN_MUSHROOM, 1));
		OreDictionary.registerOre("itemFungus", new ItemStack(Blocks.RED_MUSHROOM, 1));
		OreDictionary.registerOre("itemFungus", new ItemStack(Items.MUSHROOM_STEW, 1, 0));

		//Vanilla ferns - for the fern organic ground block recipe:
		OreDictionary.registerOre("plantFern", new ItemStack(Blocks.TALLGRASS, 1, 2));
		OreDictionary.registerOre("plantdnaPNminecraft:small_fern", new ItemStack(Blocks.TALLGRASS, 1, 2));
		OreDictionary.registerOre("plantFern", new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
		OreDictionary.registerOre("plantdnaPNminecraft:large_fern", new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
		OreDictionary.registerOre("plantdnaPNminecraft:rose", new ItemStack(Blocks.DOUBLE_PLANT, 1, 4));
		OreDictionary.registerOre("plantdnaPNminecraft:lilac", new ItemStack(Blocks.DOUBLE_PLANT, 1, 1));
		OreDictionary.registerOre("plantdnaPNminecraft:peony", new ItemStack(Blocks.DOUBLE_PLANT, 1, 5));
		OreDictionary.registerOre("plantdnaPNminecraft:sunflower", new ItemStack(Blocks.DOUBLE_PLANT, 1, 0));

		//Moss:
		OreDictionary.registerOre("itemMossForStone", new ItemStack(Blocks.VINE, 1, 0));

		//Meat + fish:
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 0));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 1));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 2));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, (int) (1), 3));

		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.COOKED_FISH, 1));
		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.COOKED_FISH, (int) (1), 1));

		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.BEEF, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_BEEF, 1));

		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.PORKCHOP, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_PORKCHOP, 1));

		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.MUTTON, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_MUTTON, 1));

		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.CHICKEN, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_CHICKEN, 1));

		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.RABBIT, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_RABBIT, 1));

		OreDictionary.registerOre("dirt", new ItemStack(Blocks.DIRT, 1, 0));
		OreDictionary.registerOre("dirt", new ItemStack(Blocks.DIRT, 1, 1));

		OreDictionary.registerOre("peat", BlockPeat.block);
		OreDictionary.registerOre("blockPeat", BlockPeat.block);

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

		OreDictionary.registerOre("blockSodium", BlockSodium.block);
		OreDictionary.registerOre("ingotSodium", ItemSodiumIngot.block);
		OreDictionary.registerOre("nuggetSodium", ItemSodiumNugget.block);

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

		OreDictionary.registerOre("sandstone", new ItemStack(Blocks.SANDSTONE, 1));
		OreDictionary.registerOre("sandstone", new ItemStack(Blocks.RED_SANDSTONE, 1));

		OreDictionary.registerOre("sand", new ItemStack(Blocks.SAND, 1, 0));
		OreDictionary.registerOre("sand", new ItemStack(Blocks.SAND, 1, 1));
		OreDictionary.registerOre("blockSand", new ItemStack(Blocks.SAND, 1, 0));
		OreDictionary.registerOre("blockSand", new ItemStack(Blocks.SAND, 1, 1));

		OreDictionary.registerOre("blockClay", new ItemStack(Blocks.CLAY, 1));
		OreDictionary.registerOre("itemClay", new ItemStack(Items.CLAY_BALL, 1));


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

		OreDictionary.registerOre("blockGlass",  new ItemStack(Blocks.GLASS, 1));
		OreDictionary.registerOre("paneGlass",  new ItemStack(Blocks.GLASS_PANE, 1));

		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.TALLGRASS, 1, 1));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Items.WHEAT, 1));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 0));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 1));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 2));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 3));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 4));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 5));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 6));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 7));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 8));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 9));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 10));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 11));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 12));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 13));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 14));
		OreDictionary.registerOre("itemFluffy", new ItemStack(Blocks.WOOL, 1, 15));

		//OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.REEDS, 1));
		OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.TALLGRASS, 1, 1));
		OreDictionary.registerOre("leavesHay", new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
		OreDictionary.registerOre("leavesHay", new ItemStack(Items.WHEAT, 1));

		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 1));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 2));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG, 1, 3));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, 1, 0));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.LOG2, 1, 1));

		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.OAK_FENCE, 1, 1));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.ACACIA_FENCE, 1, 1));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.BIRCH_FENCE, 1, 1));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.SPRUCE_FENCE, 1, 1));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.DARK_OAK_FENCE, 1, 1));
		OreDictionary.registerOre("fenceWood", new ItemStack(Blocks.JUNGLE_FENCE, 1, 1));

		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.OAK_FENCE_GATE, 1, 1));
		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.ACACIA_FENCE_GATE, 1, 1));
		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.BIRCH_FENCE_GATE, 1, 1));
		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.SPRUCE_FENCE_GATE, 1, 1));
		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.DARK_OAK_FENCE_GATE, 1, 1));
		OreDictionary.registerOre("fenceGateWood", new ItemStack(Blocks.JUNGLE_FENCE_GATE, 1, 1));

		OreDictionary.registerOre("doorWood", new ItemStack(Items.OAK_DOOR, 1, 1));
		OreDictionary.registerOre("doorWood", new ItemStack(Items.ACACIA_DOOR, 1, 1));
		OreDictionary.registerOre("doorWood", new ItemStack(Items.BIRCH_DOOR, 1, 1));
		OreDictionary.registerOre("doorWood", new ItemStack(Items.SPRUCE_DOOR, 1, 1));
		OreDictionary.registerOre("doorWood", new ItemStack(Items.DARK_OAK_DOOR, 1, 1));
		OreDictionary.registerOre("doorWood", new ItemStack(Items.JUNGLE_DOOR, 1, 1));

		//Compat for Calamites:
		OreDictionary.registerOre("listAllfiber", BlockCalamitesSlab.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesPlanks.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesStairs.block);
		OreDictionary.registerOre("listAllfiber", ItemCalamitesDoorItem.block);
		OreDictionary.registerOre("listAllfiber", ItemCalamitesBoatItem.block);
		OreDictionary.registerOre("listAllfiber", BlockCalamitesTrapdoor.block);

		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 0));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 2));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(Blocks.PLANKS, 1, 5));

		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.OAK_STAIRS, 1));
		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.ACACIA_STAIRS, 1));
		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.BIRCH_STAIRS, 1));
		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.SPRUCE_STAIRS, 1));
		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.DARK_OAK_STAIRS, 1));
		OreDictionary.registerOre("stairWood", new ItemStack(Blocks.JUNGLE_STAIRS, 1));

		OreDictionary.registerOre("trapdoorWood", new ItemStack(Blocks.TRAPDOOR, 1));

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

		//Vanilla:
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 4));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.SAPLING, 1, 5));

		OreDictionary.registerOre("boat", new ItemStack(Items.BOAT, 1));
		OreDictionary.registerOre("boat", new ItemStack(Items.BIRCH_BOAT, 1));
		OreDictionary.registerOre("boat", new ItemStack(Items.ACACIA_BOAT, 1));
		OreDictionary.registerOre("boat", new ItemStack(Items.JUNGLE_BOAT, 1));
		OreDictionary.registerOre("boat", new ItemStack(Items.SPRUCE_BOAT, 1));
		OreDictionary.registerOre("boat", new ItemStack(Items.DARK_OAK_BOAT, 1));

		OreDictionary.registerOre("plantdnaPNminecraft:oak_sapling", new ItemStack(Blocks.SAPLING, 1, 0));
		OreDictionary.registerOre("plantdnaPNminecraft:spruce_sapling", new ItemStack(Blocks.SAPLING, 1, 1));
		OreDictionary.registerOre("plantdnaPNminecraft:birch_sapling", new ItemStack(Blocks.SAPLING, 1, 2));
		OreDictionary.registerOre("plantdnaPNminecraft:jungle_sapling", new ItemStack(Blocks.SAPLING, 1, 3));
		OreDictionary.registerOre("plantdnaPNminecraft:acacia_sapling", new ItemStack(Blocks.SAPLING, 1, 4));
		OreDictionary.registerOre("plantdnaPNminecraft:dark_oak_sapling", new ItemStack(Blocks.SAPLING, 1, 5));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 1));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 2));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES, 1, 3));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES2, 1, 0));
		OreDictionary.registerOre("plant", new ItemStack(Blocks.LEAVES2, 1, 1));
		OreDictionary.registerOre("plantdnaPNminecraft:oak_sapling", new ItemStack(Blocks.LEAVES, 1, 0));
		OreDictionary.registerOre("plantdnaPNminecraft:spruce_sapling", new ItemStack(Blocks.LEAVES, 1, 1));
		OreDictionary.registerOre("plantdnaPNminecraft:birch_sapling", new ItemStack(Blocks.LEAVES, 1, 2));
		OreDictionary.registerOre("plantdnaPNminecraft:jungle_sapling", new ItemStack(Blocks.LEAVES, 1, 3));
		OreDictionary.registerOre("plantdnaPNminecraft:acacia_sapling", new ItemStack(Blocks.LEAVES2, 1, 0));
		OreDictionary.registerOre("plantdnaPNminecraft:dark_oak_sapling", new ItemStack(Blocks.LEAVES2, 1, 1));


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

		OreDictionary.registerOre("mobdnaPNminecraft:cow", new ItemStack(Items.BEEF, 1));
		OreDictionary.registerOre("mobdnaPNminecraft:pig", new ItemStack(Items.PORKCHOP, 1));
		OreDictionary.registerOre("mobdnaPNminecraft:sheep", new ItemStack(Items.MUTTON, 1));
		OreDictionary.registerOre("mobdnaPNminecraft:chicken", new ItemStack(Items.CHICKEN, 1));
		OreDictionary.registerOre("mobdnaPNminecraft:rabbit", new ItemStack(Items.RABBIT, 1));
		OreDictionary.registerOre("mobdnaPNminecraft:zombie", new ItemStack(Items.ROTTEN_FLESH, 1));

		OreDictionary.registerOre("pndietRotten", new ItemStack(Items.ROTTEN_FLESH, 1));

		OreDictionary.registerOre("pndietBone", new ItemStack(Items.BONE, 1));

		OreDictionary.registerOre("pndietSugar", new ItemStack(Items.SUGAR, 1));

		OreDictionary.registerOre("pndietBug", new ItemStack(Items.SPIDER_EYE, 1));

		OreDictionary.registerOre("pndietFish", new ItemStack(Items.FISH, 1, 0));
		OreDictionary.registerOre("pndietFish", new ItemStack(Items.COOKED_FISH, 1, 0));
		OreDictionary.registerOre("pndietFish", new ItemStack(Items.FISH, 1, 1));
		OreDictionary.registerOre("pndietFish", new ItemStack(Items.COOKED_FISH, 1, 1));
		OreDictionary.registerOre("pndietFish", new ItemStack(Items.FISH, 1, 2));
		OreDictionary.registerOre("pndietFish", new ItemStack(Items.FISH, 1, 3));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, 1, 0));
		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.COOKED_FISH, 1, 0));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, 1, 1));
		OreDictionary.registerOre("listAllfishcooked", new ItemStack(Items.COOKED_FISH, 1, 1));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, 1, 2));
		OreDictionary.registerOre("listAllfishraw", new ItemStack(Items.FISH, 1, 3));

		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.BEEF, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.COOKED_BEEF, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.PORKCHOP, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.COOKED_PORKCHOP, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.CHICKEN, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.COOKED_CHICKEN, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.MUTTON, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.COOKED_MUTTON, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.RABBIT, 1));
		OreDictionary.registerOre("pndietMeat", new ItemStack(Items.COOKED_RABBIT, 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.BEEF, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_BEEF, 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.PORKCHOP, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_PORKCHOP, 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.CHICKEN, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_CHICKEN, 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.MUTTON, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_MUTTON, 1));
		OreDictionary.registerOre("listAllmeatraw", new ItemStack(Items.RABBIT, 1));
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(Items.COOKED_RABBIT, 1));

		OreDictionary.registerOre("pndietFruit", new ItemStack(Items.APPLE, 1));
		OreDictionary.registerOre("pndietFruit", new ItemStack(Items.MELON, 1));
		OreDictionary.registerOre("pndietFruit", new ItemStack(Blocks.MELON_BLOCK, 1));
		OreDictionary.registerOre("pndietFruit", new ItemStack(Blocks.PUMPKIN, 1));
		OreDictionary.registerOre("listAllfruit", new ItemStack(Items.APPLE, 1));
		OreDictionary.registerOre("listAllfruit", new ItemStack(Items.MELON, 1));
		OreDictionary.registerOre("listAllfruit", new ItemStack(Blocks.MELON_BLOCK, 1));
		OreDictionary.registerOre("listAllfruit", new ItemStack(Blocks.PUMPKIN, 1));

		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.BEETROOT_SEEDS, 1));
		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.MELON_SEEDS, 1));
		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.PUMPKIN_SEEDS, 1));
		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.WHEAT_SEEDS, 1));
		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.BREAD, 1));
		OreDictionary.registerOre("listAllseed", new ItemStack(Items.BEETROOT_SEEDS, 1));
		OreDictionary.registerOre("listAllseed", new ItemStack(Items.MELON_SEEDS, 1));
		OreDictionary.registerOre("listAllseed", new ItemStack(Items.PUMPKIN_SEEDS, 1));
		OreDictionary.registerOre("listAllgrain", new ItemStack(Items.WHEAT_SEEDS, 1));

		OreDictionary.registerOre("pndietTuber", new ItemStack(Items.BEETROOT, 1));
		OreDictionary.registerOre("pndietTuber", new ItemStack(Items.CARROT, 1));
		OreDictionary.registerOre("pndietTuber", new ItemStack(Items.POTATO, 1));
		OreDictionary.registerOre("pndietTuber", new ItemStack(Items.BAKED_POTATO, 1));
		OreDictionary.registerOre("listAllrootveggie", new ItemStack(Items.BEETROOT, 1));
		OreDictionary.registerOre("listAllrootveggie", new ItemStack(Items.CARROT, 1));
		OreDictionary.registerOre("listAllrootveggie", new ItemStack(Items.POTATO, 1));
		OreDictionary.registerOre("listAllrootveggie", new ItemStack(Items.BAKED_POTATO, 1));

		OreDictionary.registerOre("pndietFungus", new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK, 1));
		OreDictionary.registerOre("pndietFungus", new ItemStack(Blocks.RED_MUSHROOM_BLOCK, 1));
		OreDictionary.registerOre("pndietFungus", new ItemStack(Blocks.BROWN_MUSHROOM, 1));
		OreDictionary.registerOre("pndietFungus", new ItemStack(Blocks.RED_MUSHROOM, 1));
		OreDictionary.registerOre("listAllmushroom", new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK, 1));
		OreDictionary.registerOre("listAllmushroom", new ItemStack(Blocks.RED_MUSHROOM_BLOCK, 1));
		OreDictionary.registerOre("listAllmushroom", new ItemStack(Blocks.BROWN_MUSHROOM, 1));
		OreDictionary.registerOre("listAllmushroom", new ItemStack(Blocks.RED_MUSHROOM, 1));

		OreDictionary.registerOre("pndietSponge", new ItemStack(Blocks.SPONGE, 1, 0));
		OreDictionary.registerOre("pndietSponge", new ItemStack(Blocks.SPONGE, 1, 1));
		OreDictionary.registerOre("itemSponge", new ItemStack(Blocks.SPONGE, 1, 0));
		OreDictionary.registerOre("itemSponge", new ItemStack(Blocks.SPONGE, 1, 1));

		OreDictionary.registerOre("pndietSeed", new ItemStack(Items.BREAD, 1, 0));

	}
}
