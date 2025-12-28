package net.lepidodendron.util;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.item.ItemCrinoidScyphocrinusItem;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

public class AcidBathOutputStatics {

    public static String resLocStatics (int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (!(getPrecambrianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                int ii = (new Random()).nextInt(getPrecambrianCleanedFossilsStatics().length);
                return getPrecambrianCleanedFossilsStatics()[ii];

            case 2: //Cambrian
                if (!(getCambrianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCambrianCleanedFossilsStatics().length);
                return getCambrianCleanedFossilsStatics()[ii];

            case 3: //Ordovician
                if (!(getOrdovicianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getOrdovicianCleanedFossilsStatics().length);
                return getOrdovicianCleanedFossilsStatics()[ii];

            case 4: //Silurian
                if (!(getSilurianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getSilurianCleanedFossilsStatics().length);
                return getSilurianCleanedFossilsStatics()[ii];

            case 5: //Devonian
                if (!(getDevonianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getDevonianCleanedFossilsStatics().length);
                return getDevonianCleanedFossilsStatics()[ii];

            case 6: //Carboniferous
                if (!(getCarboniferousCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCarboniferousCleanedFossilsStatics().length);
                return getCarboniferousCleanedFossilsStatics()[ii];

            case 7: //Permian
                if (!(getPermianCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPermianCleanedFossilsStatics().length);
                return getPermianCleanedFossilsStatics()[ii];

            case 8: //Triassic
                if (!(getTriassicCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getTriassicCleanedFossilsStatics().length);
                return getTriassicCleanedFossilsStatics()[ii];

            case 9: //Jurassic
                if (!(getJurassicCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getJurassicCleanedFossilsStatics().length);
                return getJurassicCleanedFossilsStatics()[ii];

            case 10: //Cretaceous
                if (!(getCretaceousCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCretaceousCleanedFossilsStatics().length);
                return getCretaceousCleanedFossilsStatics()[ii];

            case 11: //Paleogene
                if (!(getPaleogeneCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPaleogeneCleanedFossilsStatics().length);
                return getPaleogeneCleanedFossilsStatics()[ii];

            case 12: //Neogene
                if (!(getNeogeneCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getNeogeneCleanedFossilsStatics().length);
                return getNeogeneCleanedFossilsStatics()[ii];

            case 13: //Pleistocene
                if (!(getPleistoceneCleanedFossilsStatics().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPleistoceneCleanedFossilsStatics().length);
                return getPleistoceneCleanedFossilsStatics()[ii];

            //Specials for just certain circumstances:
            case 14: //Early K ONLY
                if (getCretaceousCleanedFossilsStaticsEarly().length < 1) {
                    return "";
                }
                ii = (new Random()).nextInt(getCretaceousCleanedFossilsStaticsEarly().length);
                return getCretaceousCleanedFossilsStaticsEarly()[ii];

            case 15: //Early K ONLY
                if (getCretaceousCleanedFossilsStaticsLate().length < 1) {
                    return "";
                }
                ii = (new Random()).nextInt(getCretaceousCleanedFossilsStaticsLate().length);
                return getCretaceousCleanedFossilsStaticsLate()[ii];
        }
    }

    public static String[] getPrecambrianCleanedFossilsStatics() {
        String[] resLoc = {
                ForgeRegistries.BLOCKS.getKey(BlockArkarua.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockArborea.block).toString(),
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
                ForgeRegistries.BLOCKS.getKey(BlockThectardis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTribrachidium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockVentogyrus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockNamapoikia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAusia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConomedusites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHuainanMat.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockOtavia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockLantianella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPiyuania.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockQianchuania.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockEocyathispongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFractofusus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockVendoconularia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFedomia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYarnemia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCalyptrina.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAuroralumina.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockObamus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockNilpenia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFinkoella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHelicolocellus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRangea.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockKuibisia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockErnietta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPalaeopascichnid.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockFrondophyllas.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGigarimaneta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHylaecullulus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPalaeophragmodictya.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockParacharnia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSomatohelix.block).toString()

        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsPrecambrian);
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
                ForgeRegistries.BLOCKS.getKey(BlockSphenoecium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrumillospongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockChoia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockPalaeodiphasia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiopodMicromitra.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShankouclava.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGangtoucunia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockMackenzia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockHalichondrites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCapsospongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockVetulocystis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThylacocercus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockMegasiphon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockChancelloria.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockEukaryoticMat.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTawuia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockArchaeocyatha.block).toString()

        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsCambrian);
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
                ForgeRegistries.BLOCKS.getKey(BlockCornulitida.block).toString(),
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
                ForgeRegistries.BLOCKS.getKey(BlockPirania.block).toString(),
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
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockThamnobeatriceaSapling.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockArchaeoconularia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBrachiospongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockChoia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBryozoanReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatoporoideaReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsOrdovician);
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
                ForgeRegistries.ITEMS.getKey(ItemCrinoidScyphocrinusItem.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPetalocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_4.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block1.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTabulata_Block3.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPisocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEucalyptocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidSiphonocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCystoidPseudocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockChoia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCarduispongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidHapalocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidMarsupiocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCrotalocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBryozoanReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatoporoideaReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsSilurian);
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
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCallicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEucalyptocrinites.block).toString(),
                ForgeRegistries.ITEMS.getKey(ItemCrinoidScyphocrinusItem.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidAncyrocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCupressocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidVadarocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidMonstrocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidMonstrocrinus2.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidRhenocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidSenariocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidHapalocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidGennaeocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidBoliviacrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidAcanthocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockDictyonema.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockStromatoporoideaReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsDevonian);
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
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
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
                ForgeRegistries.BLOCKS.getKey(BlockFenestellaGiantYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockEssexella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockArborispongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTitusvillia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAmblysiphonella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidGennaeocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsCarboniferous);
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
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCyathocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEncrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidJimbacrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGigantospongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveShikamaia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockAmblysiphonella.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidCalceolispongia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsPermian);
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
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidBrown.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockConulariidMagenta.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRetiophyllia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsTriassic);
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockTentaculita.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveMegalodon.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidSeirocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidBalanocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPentacrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidApiocrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidEugeniacrinites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidPhyllocrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveLithiotis.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidHemicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsJurassic);
        return resLoc;
    }

    public static String[] getCretaceousCleanedFossilsStatics() {
        String[] resLoc = ArrayUtils.addAll(getCretaceousCleanedFossilsStaticsEarly(), getCretaceousCleanedFossilsStaticsLate());
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsCretaceous);
        return resLoc;
    }

    public static String[] getCretaceousCleanedFossilsStaticsEarly() {
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveActinoceramus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveChama.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonySparseBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBoneWorm.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidHemicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidNielsenicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveRequienia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveToucasia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoeloptychium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        return resLoc;
    }

    public static String[] getCretaceousCleanedFossilsStaticsLate() {
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonySparseBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBoneWorm.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTitanosarcolites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveIchthyosarcolites.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveInoceramusGigantocapulus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveRequienia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveToucasia.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoeloptychium.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidNielsenicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRudistReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonySparseBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBoneWorm.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCrinoidNielsenicrinus.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsPaleogene);
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
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
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonySparseBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBoneWorm.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsNeogene);
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
                ForgeRegistries.BLOCKS.getKey(BlockGlassSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockRedSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockWhiteSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockYellowSponge.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveCream.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGrey.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveTall.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveDark.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveGreen.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveUpright.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBivalveWhite.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyTubular.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralTanStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBrain.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueStaghorn.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralRedTree.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBamboo.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralBlueCrust.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralCarnation.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralSoftFan.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyBlooming.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyFractalBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyLumpy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPipeStack.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyPuffy.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonyRoughBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoralStonySparseBranching.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenPink.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSeaPenYellow.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockBoneWorm.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockCoral.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockGlassSpongeReef.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockShelly.block).toString(),
                ForgeRegistries.BLOCKS.getKey(BlockSpongeReef.block).toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revStaticsPleistocene);
        return resLoc;
    }

}
