package net.lepidodendron.util;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.*;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

public class PlantBreakMobsWater {

    public static String resLocMobs (int dim) {

        switch (dim) {
            case 1:
            default: //Precambrian
                if (!(getPrecambrianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                int ii = (new Random()).nextInt(getPrecambrianPlantBreakMobs().length);
                return getPrecambrianPlantBreakMobs()[ii];

            case 2: //Cambrian
                if (!(getCambrianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCambrianPlantBreakMobs().length);
                return getCambrianPlantBreakMobs()[ii];

            case 3: //Ordovician
                if (!(getOrdovicianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getOrdovicianPlantBreakMobs().length);
                return getOrdovicianPlantBreakMobs()[ii];

            case 4: //Silurian
                if (!(getSilurianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getSilurianPlantBreakMobs().length);
                return getSilurianPlantBreakMobs()[ii];

            case 5: //Devonian
                if (!(getDevonianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getDevonianPlantBreakMobs().length);
                return getDevonianPlantBreakMobs()[ii];

            case 6: //Carboniferous
                if (!(getCarboniferousPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCarboniferousPlantBreakMobs().length);
                return getCarboniferousPlantBreakMobs()[ii];

            case 7: //Permian
                if (!(getPermianPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPermianPlantBreakMobs().length);
                return getPermianPlantBreakMobs()[ii];

            case 8: //Triassic
                if (!(getTriassicPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getTriassicPlantBreakMobs().length);
                return getTriassicPlantBreakMobs()[ii];

            case 9: //Jurassic
                if (!(getJurassicPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getJurassicPlantBreakMobs().length);
                return getJurassicPlantBreakMobs()[ii];

            case 10: //Cretaceous
                if (!(getCretaceousPlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getCretaceousPlantBreakMobs().length);
                return getCretaceousPlantBreakMobs()[ii];

            case 11: //Paleogene
                if (!(getPaleogenePlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPaleogenePlantBreakMobs().length);
                return getPaleogenePlantBreakMobs()[ii];

            case 12: //Neogene
                if (!(getNeogenePlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getNeogenePlantBreakMobs().length);
                return getNeogenePlantBreakMobs()[ii];

            case 13: //Pleistocene
                if (!(getPleistocenePlantBreakMobs().length >= 1)) {
                    return "";
                }
                ii = (new Random()).nextInt(getPleistocenePlantBreakMobs().length);
                return getPleistocenePlantBreakMobs()[ii];
        }
    }



    public static String[] getPrecambrianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDickinsonia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEoandromeda.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKimberella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParvancorina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish_Precambrian.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYilingia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYorgia.class)).getRegistryName().toString()
        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsPrecambrian);
        return resLoc;
    }

    public static String[] getCambrianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcadoaradoxides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAlacaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAnomalocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBanffia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCambroraster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCanadaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCanadia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEllipsocephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraElrathia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHallucigenia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHelmetia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKerygmachela.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKodymirus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLochmanolenellus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMarrella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMetaspriggina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNectocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOdaraia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOdontogriphus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOpabinia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOrthrozanclus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOttoia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish_Palaeo4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish_Palaeo2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish_Palaeo3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParadoxides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhantaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPikaia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProfallotaspis .class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSiberion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSidneyia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTegopelte.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTokummia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWiwaxia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraXenusion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYawunik.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYohoia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmplectobelua.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBatofasciculus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBushizheia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEoredlichia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGemmactena.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHaikouichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJianshanopodia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLaminacaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLyrarapax.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMicrodictyon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOmnidens.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish_Palaeo1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParapeytoia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPaucipodia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPomatrum.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRetifacies.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSynophalos.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVetulicola.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYunnanozoon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBalhuticaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSkeemella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCordaticaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSanctacaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTamisiocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHurdia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCaryosyntrips.class)).getRegistryName().toString(),


        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsCambrian);
        return resLoc;
    }

    public static String[] getOrdovicianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAegirocassis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmpyx.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAphetoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArandaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAsaphus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAstraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCalvapilosa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCheirurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCyclonema.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCyrtoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDalmanites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDidymograptus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEnoploura.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGonioceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraIsotelus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLituites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLunataspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMaclurina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegalograptus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSelenopeltis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTemperoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTetragraptus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCameroceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDeiroceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEndoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHungioides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOrthoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanderodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPromissum.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSacabambaspis.class)).getRegistryName().toString(),


//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPentecopterus.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatypeltoides.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraChasmataspis.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAngelina.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegistaspis.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHoplitaspis.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTribrachiodemas.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraIowacystis.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDendrocystites.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSyringocrinus.class)).getRegistryName().toString(),

                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFurca.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTomlinsonus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVillebrunaster.class)).getRegistryName().toString(),

        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsOrdovician);
        return resLoc;
    }

    public static String[] getSilurianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcutiramus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAiniktozoon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmpyx.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAteleaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBirkenia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBoothiaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCarcinosoma.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCheirurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCrotalocephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCyrtoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDalmanites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEurypterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFurcaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHemicyclaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKokomopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMixopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMonograptus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOrthoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanderodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPharyngolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhragmoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatycaraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatylomaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPoleumita.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPoraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPterygotus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraQilinyu.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTemperoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThelodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrimerus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEoarthropleura.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKalbarria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSphooceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDunyu.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLasanius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWarneticaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCeratiocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNerepisacanthus.class)).getRegistryName().toString(),

                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSclerodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAthenaegis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGuiyu.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhlebolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPolybranchiaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThanahita.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegamastax.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJamoytius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPezopallichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLepidaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRutgersella.class)).getRegistryName().toString()
                //(net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCiurcopterus.class)).getRegistryName().toString(),

        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsSilurian);
        return resLoc;
    }

    public static String[] getDevonianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcanthodes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcutiramus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Goniatites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Manticoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArchaeocidaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBasiloceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBothriolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBrochoadmones.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCampbellodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCarolowilhelmina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCephalaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCheirurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCladoselache.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClydagnathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCoccosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCrotalocephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCyrtoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDalmanites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDeiroceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDoryaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDrotops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDunkleosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFurcacauda.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGantarostrataspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGroenlandaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGyracanthides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHeliopeltis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHemicyclaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHolonema.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJaekelopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLanceaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLungmenshanaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMcnamaraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMonograptus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMontecaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOnychodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeoisopus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParexus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhanerotinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPoraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPsarolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPteraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPterygotus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSpiniplatyceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTartuosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTemperoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTerataspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTitanichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWalliserops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWillwerathia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAntineosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCheloniellon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDrepanaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFurcaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGemuendina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHelianthaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLunaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMimetaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanderodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSchinderhannes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraStensioella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEglonaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGabreyaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHibernaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPelurgaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcanthostega.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAdelophthalmus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAttercopus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEoarthropleura.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEricixerxes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEusthenopteron.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarvestman.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHeterosteus  .class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHyneria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraIchthyostega.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLaccognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOsteolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPagea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPneumodesmus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScaumenacia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScorpion_Gondwanascorpio.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTiktaalik.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTurrisaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWingertshellicus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWeinbergina.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlectodiscus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraChotecops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHibbertopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanderichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBundenbachiellus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEugaleaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEastmanosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraIvoites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNeeyambaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPituriaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMiguashaia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCometicercus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOxyosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTegeolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGooloogongia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSchugurocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCeratiocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiplacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClimatius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGriphognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraConcavicaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGogonasus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFallacosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRolfosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCamuropiscis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCtenurella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRhamphodopsis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGoodradigbeeon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDraconichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMaterpiscis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMicrobrachius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBrindabellaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWuttagoonaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKujdanowiaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhyllolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCowralepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGymnotrachelus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBungartius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRhadinacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSilurolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEntelognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVachonisia.class)).getRegistryName().toString(),

                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParameteoraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTauraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhialaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraZenaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDicranurus.class)).getRegistryName().toString(),
                //(net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPriscomyzon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAngustidontus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPsychopyge.class)).getRegistryName().toString(),


        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsDevonian);
        return resLoc;
    }

    public static String[] getCarboniferousPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcanthodes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcrolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAkmonistion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAllenypterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Goniatites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArchaeocidaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArthropleura.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBandringa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBelantsea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClydagnathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDeltoptychius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDracopristis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEdestus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFalcatus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGyracanthides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraIniopteryx.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJanassa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraListracanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMooreoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOrodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParatarrasius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPhanerotinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatysomus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRayonnoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaivodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSquatinactis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSyllipsimopodi.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTraquairius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTullimonstrum.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTyrannophontes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVestinautilus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCobelodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAdelophthalmus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmphibamus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAnthracomedusa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArchoblattinaInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBalanerpeton.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCasineria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCrassigyrinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiplocaulus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGerarusInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarvestman.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHibbertopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHylonomus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLimnoscelis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegalocephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMeganeura.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegarachne.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOphiacodon.class)).getRegistryName().toString(),

                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.DELITZSCHALA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.HOMALONEURA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.HOMOIOPTERA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.LITHOMANTIS.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.LYCOCERCUS.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.SINODUNBARIA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.STENODICTYA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.MAZOTHAIROS.getName(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPederpes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPholiderpeton.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProterogyrinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProtozygoptera.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRemigiomontanus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRhizodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidSwampInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScorpion_Gigantoscorpio.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScorpion_Opsieobuthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScorpion_Pulmonoscorpius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSpathicephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSphenacodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Cryptomartus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Eophrynus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Kreischeria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraXenacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDatheosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBranchiosaur.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidForestInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThrinacodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAntarcticarcinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraStethacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGreererpeton.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMyriacantherpestes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParamblypterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRainerichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPapilionichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPromexyele.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMarmolatella.class)).getRegistryName().toString()



        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsCarboniferous);
        return resLoc;
    }

    public static String[] getPermianPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcanthodes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcanthostomatops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAcrolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAdelophthalmus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Cylolobus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Goniatites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAntarcticarcinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAnteosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArchaeocidaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArchosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAscendonanus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAulacephalodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBarbclabornia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBlourugia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBobasatrania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBranchiosaur.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBunostegos.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCacops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCaptorhinus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClaudiosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCobelodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCoelacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCoelurosauravus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCooperoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCotylorhynchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCtenospondylus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDasyceps.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiadectes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiictodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDimetrodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiplocaulus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDiploceraspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDorypterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDvinia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDvinosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEbenaqua.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEdaphosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraElginia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEndothiodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEosimops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEryops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEstemmenosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEuchambersia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGlaurung.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGnathorhiza.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGorgonops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarvestman.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHelicoprion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraInostrancevia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJanassa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJonkeria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKaibabvenator.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLabidosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLebachacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraListracanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLystrosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegactenopetalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMeganeuropsis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegarachne.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMelosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMenaspis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMesosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMooreoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMoschops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNipponomaria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOphiacodon.class)).getRegistryName().toString(),
//                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeodictyopteraNymph.class)).getRegistryName().toString() + "@" + EntityPrehistoricFloraPalaeodictyopteraNymph.Type.DUNBARIA.getName(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeoniscum.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeontinid.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPantylus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParanaichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatyhystrix.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlatysomus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPrionosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPristerognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProburnetia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProcynosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProsictodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProtozygoptera.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPurlovia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPygopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRautiania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidAridInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidForestInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidSwampInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRobertia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSauroctonus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScorpion_Opsieobuthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScutosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSphenacodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSuminia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTapinocephalus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTetraceratops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTiarajudens.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTrigonotarbid_Permotarbus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraUranocentrodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraUrosthenes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVarialepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVivaxosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraWeigeltisaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraXenacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraStethacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParamblypterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHovasaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMarmolatella.class)).getRegistryName().toString()


        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsPermian);
        return resLoc;
    }

    public static String[] getTriassicPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAeger.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAlbertonia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Asteroceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Ceratites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Goniatites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArizonasaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAtopodentatus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAulacoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAustriadactylus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAustrolimulus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBatrachotomus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBeishanichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBirgeria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBobasatrania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBrembodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCaelestiventus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCartorhynchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCaviramus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCeratodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraChinlea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCidaroida .class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClaudiosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClevosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCoelophysis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCyamodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCymbospondylus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCynognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDaedalichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDapedium.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDesmatosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEffigia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEoraptor.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEorhynchochelys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEosaurichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraErythrosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEudimorphodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEuparkeria.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraFeroxichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraForeyia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarvestman.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHenodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHerrerasaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHyperodapedon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHypsognathus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraItalophlebia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKeichousaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLessemsaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLiliensternus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLimulid.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLisowicia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraListracanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLonchidion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLotosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLuoxiongichthys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLystrosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMastodonsaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegazostrodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMorganucodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMussaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNothosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOpolanka.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeontinid.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanzhousaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraParhybodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlacerias.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlacodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPlateosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPoposaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPostosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPseudotherium.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPygopterus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRebellatrix.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidAridInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidForestInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidSwampInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaurichthysFreshwater.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaurichthysMarine.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaurosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSclerocormus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraScleromochlus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSemionotus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraShonisaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraShringasaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSillosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSmilosuchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSmok.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSphenotitan.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraStagonolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTanystropheus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTeleocrater.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThecodontosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThrinaxodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTitanopteraClatrotitan.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTitanopteraGigatitan.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTitanopteraMesotitan.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVancleavea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraXenacanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYunguisaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSilesaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGerrothorax.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProganochelys.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHovasaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMarmolatella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraStahleckeria.class)).getRegistryName().toString()



        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsTriassic);
        return resLoc;
    }

    public static String[] getJurassicPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAeger.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Asteroceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Dactylioceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Titanites.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCaturus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCeratodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraClevosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarvestman.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHybodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish1.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish2.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish3.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish4.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish5.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish6.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraJellyfish7.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLimulid.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLonchidion.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMegalosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMorganucodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPalaeontinid.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidAridInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidForestInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRoachoidSwampInsect.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSemionotus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAspidorhynchus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraArduafrons.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAphnelepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAetheolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraOphthalmosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMacromesodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraEryon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNotidanoides.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraYinlong.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaltriovenator.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraKentrosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraThrissops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMuensterella.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAsteracanthus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraTurboscinetes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraRedfieldius.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLeptolepis.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLepidotes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDollocaris.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPiranhamesodon.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDryosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDysalotosaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraChaoyangsaurus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraXuanhuaceratops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraPanguraptor.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHualianceratops.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGyrosteus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSqualoraja.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBelonostomusJurassic.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraGyrodus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraDecacuminaster.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraVampyronassa.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraProteroctopus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraSaccocoma.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraCancrinos.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLeviathania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarpagodes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNerinea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMetopacanthus.class)).getRegistryName().toString(),





        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsJurassic);
        return resLoc;
    }

    public static String[] getCretaceousPlantBreakMobs() {
        String[] resLoc = {
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Parapuzosia.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Pachydesmoceras.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraAmmonite_Pachydiscus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraBelonostomusCretaceous.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraViviparus.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLeviathania.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraHarpagodes.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraNerinea.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraMurex.class)).getRegistryName().toString(),
                (net.minecraftforge.fml.common.registry.EntityRegistry.getEntry(EntityPrehistoricFloraLimulid.class)).getRegistryName().toString(),





        };
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsCretaceous);
        return resLoc;
    }

    public static String[] getPaleogenePlantBreakMobs() {
        String[] resLoc = LepidodendronConfig.revMobsPaleogene;
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsPaleogene);
        return resLoc;
    }

    public static String[] getNeogenePlantBreakMobs() {
        String[] resLoc = LepidodendronConfig.revMobsNeogene;
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsNeogene);
        return resLoc;
    }

    public static String[] getPleistocenePlantBreakMobs() {
        String[] resLoc = LepidodendronConfig.revMobsPleistocene;
        resLoc = ArrayUtils.addAll(resLoc, LepidodendronConfig.revMobsPleistocene);
        return resLoc;
    }

}
