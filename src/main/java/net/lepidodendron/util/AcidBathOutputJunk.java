package net.lepidodendron.util;

import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class AcidBathOutputJunk {

    public static ItemStack fossilAcidJunk (int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (new Random().nextInt(100) == 0) {
                    int ii = (new Random()).nextInt(getPrecambrianJunkBonus().length);
                    return getPrecambrianJunkBonus()[ii];
                }
                int ii = (new Random()).nextInt(getPrecambrianJunk().length);
                return getPrecambrianJunk()[ii];

            case 2: //Cambrian
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getCambrianJunkBonus().length);
                    return getCambrianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getCambrianJunk().length);
                return getCambrianJunk()[ii];

            case 3: //Ordovician
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getOrdovicianJunkBonus().length);
                    return getOrdovicianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getOrdovicianJunk().length);
                return getOrdovicianJunk()[ii];

            case 4: //Silurian
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getSilurianJunkBonus().length);
                    return getSilurianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getSilurianJunk().length);
                return getSilurianJunk()[ii];

            case 5: //Devonian
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getDevonianJunkBonus().length);
                    return getDevonianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getDevonianJunk().length);
                return getDevonianJunk()[ii];

            case 6: //Carboniferous
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getCarboniferousJunkBonus().length);
                    return getCarboniferousJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getCarboniferousJunk().length);
                return getCarboniferousJunk()[ii];

            case 7: //Permian
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getPermianJunkBonus().length);
                    return getPermianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getPermianJunk().length);
                return getPermianJunk()[ii];

            case 8: //Triassic
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getTriassicJunkBonus().length);
                    return getTriassicJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getTriassicJunk().length);
                return getTriassicJunk()[ii];

            case 9: //Jurassic
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getJurassicJunkBonus().length);
                    return getJurassicJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJurassicJunk().length);
                return getJurassicJunk()[ii];

            case 10: //Cretaceous
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getCretaceousJunkBonus().length);
                    return getCretaceousJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getCretaceousJunk().length);
                return getCretaceousJunk()[ii];

            case 11: //Paleogene
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getPaleogeneJunkBonus().length);
                    return getPaleogeneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getPaleogeneJunk().length);
                return getPaleogeneJunk()[ii];

            case 12: //Neogene
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getNeogeneJunkBonus().length);
                    return getNeogeneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getNeogeneJunk().length);
                return getNeogeneJunk()[ii];

            case 13: //Pleistocene
                if (new Random().nextInt(100) == 0) {
                    ii = (new Random()).nextInt(getPleistoceneJunkBonus().length);
                    return getPleistoceneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getPleistoceneJunk().length);
                return getPleistoceneJunk()[ii];
        }
    }



    public static ItemStack[] getPrecambrianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(Blocks.OBSIDIAN, 1),
                //new ItemStack(Items.GOLD_NUGGET, 1),
                //new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(BlockMeteorite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPrecambrianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(ItemSulphur.block, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockSkeletonMixopterus.block, 1)
       };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockSkeletonMixopterus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getSilurianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(BlockCoarseSiltyDirt.block, 1, 0),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
         };
        return itemStack;
    }

    public static ItemStack[] getSilurianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.SAND, 1, 1),
                new ItemStack(ItemRedClayBall.block, 1),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(BlockCoarseSandyDirt.block, 1),
                new ItemStack(BlockCoarseSandyDirtRed.block, 1),
                new ItemStack(BlockCoarseSiltyDirt.block, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(ItemSalt.block, 1),
                new ItemStack(BlockSandWhite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockSkeletonBungartius.block, 1),
                new ItemStack(BlockSkeletonDunkleosteus.block, 1)
       };
        return itemStack;
    }

    public static ItemStack[] getDevonianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockSkeletonBungartius.block, 1),
                new ItemStack(BlockSkeletonDunkleosteus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.COAL, 1, 1),
                new ItemStack(Items.COAL, 1, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(BlockCoarseSandyDirt.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(BlockCoarseSandyDirt.block, 1),
                new ItemStack(BlockCoarseSandyDirtRed.block, 1),
                new ItemStack(BlockCoarseSandyDirtPangaean.block, 1),
                new ItemStack(BlockSandPangaean.block, 1),
                new ItemStack(BlockDriedMud.block, 1),
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(BlockScorchedEarth.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockSkeletonOphiacodon.block, 1),
                new ItemStack(BlockSkeletonScutosaurus.block, 1)
               };
        return itemStack;
    }

    public static ItemStack[] getPermianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockSkeletonOphiacodon.block, 1),
                new ItemStack(BlockSkeletonScutosaurus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.SAND, 1, 1),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(BlockCoarseSandyDirt.block, 1),
                new ItemStack(BlockCoarseSandyDirtRed.block, 1),
                new ItemStack(BlockCoarseSandyDirtPangaean.block, 1),
                new ItemStack(BlockSandPangaean.block, 1),
                new ItemStack(ItemSulphur.block, 1),
                new ItemStack(ItemRedClayBall.block, 1),
                new ItemStack(BlockCoarseSiltyDirt.block, 1),
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(BlockDriedMud.block, 1),
                new ItemStack(BlockScorchedEarth.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockSkeletonHenodus.block, 1),
                new ItemStack(BlockSkeletonLiliensternus.block, 1),
                new ItemStack(BlockSkeletonSilesaurus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockSkeletonHenodus.block, 1),
                new ItemStack(BlockSkeletonLiliensternus.block, 1),
                new ItemStack(BlockSkeletonSilesaurus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.SAND, 1, 1),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(BlockHoldfast.block, 1),
                new ItemStack(BlockCoarseSandyDirt.block, 1),
                new ItemStack(BlockCoarseSandyDirtRed.block, 1),
                new ItemStack(BlockCoarseSandyDirtPangaean.block, 1),
                new ItemStack(BlockSandPangaean.block, 1),
                new ItemStack(BlockCoarseSiltyDirt.block, 1),
                new ItemStack(BlockBrownstone.block, 1),
                new ItemStack(BlockSandBlack.block, 1),
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(ItemSulphur.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockSkeletonYinlong.block, 1),
                new ItemStack(BlockSkeletonKentrosaurus.block, 1),
                new ItemStack(BlockSkeletonMegalosaurus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockSkeletonYinlong.block, 1),
                new ItemStack(BlockSkeletonKentrosaurus.block, 1),
                new ItemStack(BlockSkeletonMegalosaurus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneJunk() {
        ItemStack[] itemStack = {
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(Items.DIAMOND, 1)
        };
        return itemStack;
    }

}
