package net.lepidodendron.util;

import net.lepidodendron.block.*;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Random;

public class AcidBathOutputStatics {

    public static String resLocStatics (int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                int ii = (new Random()).nextInt(getPrecambrianCleanedFossilsStatics().length);
                return getPrecambrianCleanedFossilsStatics()[ii];

            case 2: //Cambrian
                ii = (new Random()).nextInt(getCambrianCleanedFossilsStatics().length);
                return getCambrianCleanedFossilsStatics()[ii];

            case 3: //Ordovician
                ii = (new Random()).nextInt(getOrdovicianCleanedFossilsStatics().length);
                return getOrdovicianCleanedFossilsStatics()[ii];

            case 4: //Silurian
                ii = (new Random()).nextInt(getSilurianCleanedFossilsStatics().length);
                return getSilurianCleanedFossilsStatics()[ii];

            case 5: //Devonian
                ii = (new Random()).nextInt(getDevonianCleanedFossilsStatics().length);
                return getDevonianCleanedFossilsStatics()[ii];

            case 6: //Carboniferous
                ii = (new Random()).nextInt(getCarboniferousCleanedFossilsStatics().length);
                return getCarboniferousCleanedFossilsStatics()[ii];

            case 7: //Permian
                ii = (new Random()).nextInt(getPermianCleanedFossilsStatics().length);
                return getPermianCleanedFossilsStatics()[ii];

            case 8: //Triassic
                ii = (new Random()).nextInt(getTriassicCleanedFossilsStatics().length);
                return getTriassicCleanedFossilsStatics()[ii];

            case 9: //Jurassic
                ii = (new Random()).nextInt(getJurassicCleanedFossilsStatics().length);
                return getJurassicCleanedFossilsStatics()[ii];

            case 10: //Cretaceous
                ii = (new Random()).nextInt(getCretaceousCleanedFossilsStatics().length);
                return getCretaceousCleanedFossilsStatics()[ii];

            case 11: //Paleogene
                ii = (new Random()).nextInt(getPaleogeneCleanedFossilsStatics().length);
                return getPaleogeneCleanedFossilsStatics()[ii];

            case 12: //Neogene
                ii = (new Random()).nextInt(getNeogeneCleanedFossilsStatics().length);
                return getNeogeneCleanedFossilsStatics()[ii];

            case 13: //Pleistocene
                ii = (new Random()).nextInt(getPleistoceneCleanedFossilsStatics().length);
                return getPleistoceneCleanedFossilsStatics()[ii];
        }
    }

    public static String[] getPrecambrianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockArkarua.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBomakellia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBradgatia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBurykhia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCharnia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCharniodiscus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCloudina.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoronacollina.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCorumbella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFunisia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHaootia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHapsidophyllas.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockInaria.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockNamacalathus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPambikalbae.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockParviscopa.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPrimocandelabrum1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPrimocandelabrum2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPteridinium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSwartpuntia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTawuia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThectardis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTribrachidium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockVentogyrus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatolite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThrombolite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockNamapoikia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAusia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConomedusites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGrypania.block).toString()
        };
        return resLoc;
    }

    public static String[] getCambrianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAllonnia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCastericystis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockChaunograptus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDinomischus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockEchmatocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFacivermis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGogia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHelicocystis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHerpetogaster.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockLepidocystis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockLyracystis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOesia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPirania.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSiphusauctum.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatocystites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatoveris.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThaumaptilon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockXianguangia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatolite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThrombolite.block).toString()
        };
        return resLoc;
    }

    public static String[] getOrdovicianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAulaceraSapling.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodSpiriferid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAulaceraSapling.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCornulitida.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCallicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCaryocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCystoidAristocystites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCystoidBolboporites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCystoidEchinosphaerites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDendrograptus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThamnobeatriceaSapling.block).toString()
        };
        return resLoc;
    }

    public static String[] getSilurianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodSpiriferid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCornulitida.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCallicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCaryocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEucalyptocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidSiphonocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCystoidPseudocrinites.block).toString()
        };
        return resLoc;
    }

    public static String[] getDevonianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodSpiriferid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCornulitida.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEucalyptocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPetalocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPisocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidScyphocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidAncyrocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCupressocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidVadarocrinus.block).toString()
        };
        return resLoc;
    }

    public static String[] getCarboniferousCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodGigantoproductus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodSpiriferid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCornulitida.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidScyphocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidDizygocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidMacrocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockEscumasia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantBlue.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantOrange.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantRed.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantYellow.block).toString()
        };
        return resLoc;
    }

    public static String[] getPermianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlastoid3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodOrthid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodSpiriferid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRugosa5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidJimbacrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGigantospongia.block).toString()
        };
        return resLoc;
    }

    public static String[] getTriassicCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFenestella5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDicerocardium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidHolocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidTraumatocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidVostocovacrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString()
        };
        return resLoc;
    }

    public static String[] getJurassicCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramus.block).toString()
        };
        return resLoc;
    }

    public static String[] getCretaceousCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramus.block).toString()
        };
        return resLoc;
    }

    public static String[] getPaleogeneCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString()
        };
        return resLoc;
    }

    public static String[] getNeogeneCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString()
        };
        return resLoc;
    }

    public static String[] getPleistoceneCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockAnemone1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone5.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone6.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone7.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone8.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAnemone9.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBlueSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBranchedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrownSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDarkPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOrangeSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPinkSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString()
        };
        return resLoc;
    }

}
