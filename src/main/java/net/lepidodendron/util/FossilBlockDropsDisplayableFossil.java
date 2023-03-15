package net.lepidodendron.util;

import net.lepidodendron.block.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Random;

public class FossilBlockDropsDisplayableFossil {

    @Nullable
    public static ItemStack fossilDropDisplayable(int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getPrecambrianDisplayableFossilDrops().length);
                    return getPrecambrianDisplayableFossilDrops()[ii];
                }
                return null;

            case 2: //Cambrian
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getCambrianDisplayableFossilDrops().length);
                    return getCambrianDisplayableFossilDrops()[ii];
                }
                return null;

            case 3: //Ordovician
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getOrdovicianDisplayableFossilDrops().length);
                    return getOrdovicianDisplayableFossilDrops()[ii];
                }
                return null;

            case 4: //Silurian
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getSilurianDisplayableFossilDrops().length);
                    return getSilurianDisplayableFossilDrops()[ii];
                }
                return null;

            case 5: //Devonian
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getDevonianDisplayableFossilDrops().length);
                    return getDevonianDisplayableFossilDrops()[ii];
                }
                return null;

            case 6: //Carboniferous
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getCarboniferousDisplayableFossilDrops().length);
                    return getCarboniferousDisplayableFossilDrops()[ii];
                }
                return null;

            case 7: //Permian
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getPermianDisplayableFossilDrops().length);
                    return getPermianDisplayableFossilDrops()[ii];
                }
                return null;

            case 8: //Triassic
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getTriassicDisplayableFossilDrops().length);
                    return getTriassicDisplayableFossilDrops()[ii];
                }
                return null;

            case 9: //Jurassic
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getJurassicDisplayableFossilDrops().length);
                    return getJurassicDisplayableFossilDrops()[ii];
                }
                return null;

            case 10: //Cretaceous
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getCretaceousDisplayableFossilDrops().length);
                    return getCretaceousDisplayableFossilDrops()[ii];
                }
                return null;

            case 11: //Paleogene
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getPaleogeneDisplayableFossilDrops().length);
                    return getPaleogeneDisplayableFossilDrops()[ii];
                }
                return null;

            case 12: //Neogene
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getNeogeneDisplayableFossilDrops().length);
                    return getNeogeneDisplayableFossilDrops()[ii];
                }
                return null;

            case 13: //Pleistocene
                if (new Random().nextInt(16) == 0) {
                    int ii = (new Random()).nextInt(getPleistoceneDisplayableFossilDrops().length);
                    return getPleistoceneDisplayableFossilDrops()[ii];
                }
                return null;
        }
    }

    public static ItemStack[] getPrecambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(Items.AIR, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCambrianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonAnomalocaris.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getOrdovicianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonMixopterus.block, 1),
                new ItemStack(BlockSkeletonAsaphus.block, 1),

        };
        return itemStack;
    }

    public static ItemStack[] getSilurianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonAmpyx.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getDevonianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonBungartius.block, 1),
                new ItemStack(BlockSkeletonDunkleosteus.block, 1),
                new ItemStack(BlockSkeletonSchinderhannes.block, 1),
                new ItemStack(BlockSkeletonWalliserops.block, 1),
                new ItemStack(BlockSkeletonTiktaalik.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCarboniferousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonOphiacodon.block, 1),
                new ItemStack(BlockSkeletonArthropleura.block, 1),
                new ItemStack(BlockSkeletonMegarachne.block, 1),
                new ItemStack(BlockSkeletonPulmonoscorpius.block, 1),
                new ItemStack(BlockSkeletonMeganeura.block, 1),
                new ItemStack(BlockSkeletonTullimonstrum.block, 1),
                new ItemStack(BlockSkeletonSharkEmbryo.block, 1),
                new ItemStack(BlockSkeletonAkmonistion.block, 1),
                new ItemStack(BlockSkeletonFalcatus.block, 1),
                new ItemStack(BlockSkeletonDiplocaulus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPermianDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonOphiacodon.block, 1),
                new ItemStack(BlockSkeletonRubidgea.block, 1),
                new ItemStack(BlockSkeletonEstemmenosuchus.block, 1),
                new ItemStack(BlockSkeletonPrionosuchus.block, 1),
                new ItemStack(BlockSkeletonLystrosaurus.block, 1),
                new ItemStack(BlockSkeletonMoschops.block, 1),
                new ItemStack(BlockSkeletonSuminia.block, 1),
                new ItemStack(BlockSkeletonPlatyhystrix.block, 1),
                new ItemStack(BlockSkeletonTiarajudens.block, 1),
                new ItemStack(BlockSkeletonScutosaurus.block, 1),
                new ItemStack(BlockSkeletonDiplocaulus.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getTriassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonArizonasaurus.block, 1),
                new ItemStack(BlockSkeletonHenodus.block, 1),
                new ItemStack(BlockSkeletonLiliensternus.block, 1),
                new ItemStack(BlockSkeletonShringasaurus.block, 1),
                new ItemStack(BlockSkeletonCaviramus.block, 1),
                new ItemStack(BlockSkeletonCyamodus.block, 1),
                new ItemStack(BlockSkeletonLystrosaurus.block, 1),
                new ItemStack(BlockSkeletonErythrosuchus.block, 1),
                new ItemStack(BlockSkeletonSilesaurus.block, 1),
                new ItemStack(BlockSkeletonLotosaurus.block, 1),
                new ItemStack(BlockSkeletonKeichousaurus.block, 1),
                new ItemStack(BlockSkeletonCymbospondylus.block, 1),
                new ItemStack(BlockSkeletonEffigia.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getJurassicDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(BlockSkeletonYinlong.block, 1),
                new ItemStack(BlockSkeletonKentrosaurus.block, 1),
                new ItemStack(BlockSkeletonMegalosaurus.block, 1),
                new ItemStack(BlockSkeletonLimulid.block, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getCretaceousDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(Items.AIR, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPaleogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(Items.AIR, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getNeogeneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(Items.AIR, 1)
        };
        return itemStack;
    }

    public static ItemStack[] getPleistoceneDisplayableFossilDrops() {
        ItemStack[] itemStack = {
                new ItemStack(Items.AIR, 1)
        };
        return itemStack;
    }

}
