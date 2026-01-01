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
                if (new Random().nextInt(70) == 0) {
                    int ii = (new Random()).nextInt(getPrecambrianJunkBonus().length);
                    return getPrecambrianJunkBonus()[ii];
                }
                int ii = (new Random()).nextInt(getJunkPalaeozoic().length);
                ItemStack stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 2: //Cambrian
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getCambrianJunkBonus().length);
                    return getCambrianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunkPalaeozoic()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 3: //Ordovician
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getOrdovicianJunkBonus().length);
                    return getOrdovicianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunkPalaeozoic()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 4: //Silurian
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getSilurianJunkBonus().length);
                    return getSilurianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunkPalaeozoic()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 5: //Devonian
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getDevonianJunkBonus().length);
                    return getDevonianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunkPalaeozoic()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 6: //Carboniferous
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getCarboniferousJunkBonus().length);
                    return getCarboniferousJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 7: //Permian
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getPermianJunkBonus().length);
                    return getPermianJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 8: //Triassic
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getTriassicJunkBonus().length);
                    return getTriassicJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 9: //Jurassic
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getJurassicJunkBonus().length);
                    return getJurassicJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 10: //Cretaceous
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getCretaceousJunkBonus().length);
                    return getCretaceousJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 11: //Paleogene
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getPaleogeneJunkBonus().length);
                    return getPaleogeneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 12: //Neogene
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getNeogeneJunkBonus().length);
                    return getNeogeneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;

            case 13: //Pleistocene
                if (new Random().nextInt(70) == 0) {
                    ii = (new Random()).nextInt(getPleistoceneJunkBonus().length);
                    return getPleistoceneJunkBonus()[ii];
                }
                ii = (new Random()).nextInt(getJunk().length);
                stackOut = getJunk()[ii];
                if (stackOut.getMaxStackSize() <= 16) {
                    stackOut.setCount((new Random()).nextInt(16) + 1);
                }
                return stackOut;
        }
    }

    public static ItemStack[] getJunkPalaeozoic() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSandyDirt.block, 1),
                new ItemStack(BlockSandyDirtPangaean.block, 1),
                new ItemStack(BlockSandyDirtRed.block, 1),
                new ItemStack(BlockSiltyDirt.block, 1),
                new ItemStack(BlockSandyDirtBlack.block, 1),
                new ItemStack(BlockSandyDirtWhite.block, 1),
                new ItemStack(BlockSandyDirtGrey.block, 1),
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(Blocks.DIRT, 1, 1),
                //new ItemStack(Blocks.DIRT, 1, 2), //Removal of Podzol
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Blocks.OBSIDIAN, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.SAND, 1, 1),
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 2),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(BlockSandBlack.block, 1),
                new ItemStack(BlockSandPangaean.block, 1),
                //new ItemStack(BlockSandPaleoproterozoic.block, 1), //Removal of Ferric sand
                new ItemStack(BlockSandWhite.block, 1),
                new ItemStack(BlockSandGrey.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(ItemClayBallBrown.block, 1),
                new ItemStack(ItemClayBallRed.block, 1),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.COAL, 1, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.QUARTZ, 1),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemSalt.block, 1),
                new ItemStack(ItemSulphur.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJunk() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSandyDirt.block, 1),
                new ItemStack(BlockSandyDirtPangaean.block, 1),
                new ItemStack(BlockSandyDirtRed.block, 1),
                new ItemStack(BlockSiltyDirt.block, 1),
                new ItemStack(BlockSandyDirtBlack.block, 1),
                new ItemStack(BlockSandyDirtWhite.block, 1),
                new ItemStack(BlockSandyDirtGrey.block, 1),
                new ItemStack(BlockLavaRock.block, 1),
                new ItemStack(Blocks.DIRT, 1, 1),
                new ItemStack(Blocks.DIRT, 1, 2),
                new ItemStack(Blocks.GRAVEL, 1),
                new ItemStack(Blocks.OBSIDIAN, 1),
                new ItemStack(Blocks.SAND, 1, 0),
                new ItemStack(Blocks.SAND, 1, 1),
                new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE, 1, 1),
                new ItemStack(Blocks.STONE, 1, 2),
                new ItemStack(Blocks.STONE, 1, 3),
                new ItemStack(BlockSandBlack.block, 1),
                new ItemStack(BlockSandPangaean.block, 1),
                //new ItemStack(BlockSandPaleoproterozoic.block, 1), //Removal of Ferric sand
                new ItemStack(BlockSandWhite.block, 1),
                new ItemStack(BlockSandGrey.block, 1),
                new ItemStack(BlockStonePeridotite.block, 1),
                new ItemStack(BlockStonePorphyry.block, 1),
                new ItemStack(BlockStoneScoria.block, 1),
                new ItemStack(ItemAnthracite.block, 1),
                new ItemStack(ItemClayBallBrown.block, 1),
                new ItemStack(ItemClayBallRed.block, 1),
                new ItemStack(Items.CLAY_BALL, 1),
                new ItemStack(Items.COAL, 1, 0),
                new ItemStack(Items.COAL, 1, 1),
                new ItemStack(Items.DYE, 1, 4),
                new ItemStack(Items.FLINT, 1),
                new ItemStack(Items.GOLD_NUGGET, 1),
                new ItemStack(Items.IRON_NUGGET, 1),
                new ItemStack(Items.QUARTZ, 1),
                new ItemStack(Items.REDSTONE, 1),
                new ItemStack(ItemSalt.block, 1),
                new ItemStack(ItemSulphur.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPrecambrianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(BlockMeteorite.block, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(BlockSandPaleoproterozoic.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(BlockTrackwayArthropodStraight.block, 1),
                new ItemStack(BlockTrackwayArthropodBent.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(BlockTrackwayArthropodStraight.block, 1),
                new ItemStack(BlockTrackwayArthropodBent.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getSilurianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(BlockTrackwayArthropodStraight.block, 1),
                new ItemStack(BlockTrackwayArthropodBent.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(BlockTrackwayArthropodStraight.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(ItemBalticAmberChunk.block, 1),
                new ItemStack(ItemDominicanAmberChunk.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1),
                new ItemStack(ItemDominicanAmberChunk.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneJunkBonus() {
        ItemStack[] itemStack = {
                new ItemStack(ItemZircon.block, 1),
                new ItemStack(Items.DIAMOND, 1),
                new ItemStack(Items.EMERALD, 1)
        };
        return itemStack;
    }

}
