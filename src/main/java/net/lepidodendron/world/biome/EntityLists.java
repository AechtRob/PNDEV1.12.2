package net.lepidodendron.world.biome;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.world.biome.Biome;
import org.apache.commons.lang3.ArrayUtils;

public class EntityLists {
    
    public static String[] mobStringInDimension(int dimid) {
        String[] MobString = new String[0];
        switch (dimid) {
            default:
                return MobString;

            case 0:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimCryogenianMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimTonianMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranSparseSeaMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranTrenchMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranExtremeHillsMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranStromatolitePavementMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranFrondoseMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranShallowSeaMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranShallowReefMobsPF);
                return MobString;

            case 1:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsSiltyShorePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsLagoonsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanOesiaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanSiphusauctumPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanAbyssPF);
                return MobString;

            case 2:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogPF);
                return MobString;

            case 3:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepRockPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepSandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekLandPF);
                return MobString;

            case 4:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanAlgaePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanPolarPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsLagoonPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBarrierReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsColdGladesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsCoralReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDunesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsStrudPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanRockyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsRedLakePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalinePF);
                return MobString;

            case 5:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanCliffPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIcePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsWoodlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSteppePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterPF);
                return MobString;

            case 6:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridKettlesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsCathayWetlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsBrakePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubDensePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertEdgePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsEarthbanksPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsCirquePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineWoodlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineWoodlandLakePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsSaltmarshPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanSpongeReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisCopsePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateWaterMeadowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubPF);
                return MobString;

            case 7:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinleDryPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinleWetPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinaIslandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinaIslandSaltLakesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDeltaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPleuromeiaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsHorsetailsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsEstuaryPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsAntarcticForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPoljePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSandyHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsShatteredIslandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMadagascarPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSantaMariaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsAustraliaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooWetPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIschigualastoPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooDryPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChanaresPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIndiaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSphenopterisPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWarmLakelandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWarmSwampyValleyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWoodlandPF);
                return MobString;

            case 8:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarriguePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPasturePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMirePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopsePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandBeachPF);
                return MobString;

            case 9:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanPacificPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysCoralPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysRudistPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanAtlanticShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanAtlanticDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanSouthernPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanCragsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanEromangaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaLushBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaSandbarsPF );
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaCliffsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPodocarpPF );
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPodocarpWinterPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPaddockPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPaddockWinterPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaRainforestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaAlpineLakePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaBeachSandyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaBeachMuddyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaMountainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaMountainValleyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSavannaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSavannaWateringHolePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSwampWoodlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaRiftPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaAridPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaAridSpikesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaCoastalFlatsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaRiparianWetlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaDesertSpikesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaWetForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaXericPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaMountainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaFoothillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaGravelsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaMuddyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaShrublandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaShrublandCopsePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaLagoonPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaCovePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyWoodlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampLakePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeMacquisPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeMacquisBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBogPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBogSaltMarshBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMarshPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMarshKnollsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMaritimePF );
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMaritimeBeachPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaDustyHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaHinterlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBandedPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaShrublandPF );
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaOasisPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianFoothillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianHighlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianMountainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesConiferPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesGinkgoPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesBurnedPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianBeachPF);
                MobString = ArrayUtils.addAll(MobString,
                    new String[]{"lepidodendron:prehistoric_flora_acrocanthosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_aeger:0:0:0",
                            "lepidodendron:prehistoric_flora_albalophosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_albanerpeton:0:0:0",
                            "lepidodendron:prehistoric_flora_anaethalion:0:0:0",
                            "lepidodendron:prehistoric_flora_anatosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_anchura:0:0:0",
                            "lepidodendron:prehistoric_flora_anhanguera:0:0:0",
                            "lepidodendron:prehistoric_flora_ankylosphenodon:0:0:0",
                            "lepidodendron:prehistoric_flora_aquilops:0:0:0",
                            "lepidodendron:prehistoric_flora_araripesuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_archaeoniscus:0:0:0",
                            "lepidodendron:prehistoric_flora_arratiaelops:0:0:0",
                            "lepidodendron:prehistoric_flora_aspidorhynchus:0:0:0",
                            "lepidodendron:prehistoric_flora_asteracanthus:0:0:0",
                            "lepidodendron:prehistoric_flora_ausktribosphenos:0:0:0",
                            "lepidodendron:prehistoric_flora_australiceras:0:0:0",
                            "lepidodendron:prehistoric_flora_bannykus:0:0:0",
                            "lepidodendron:prehistoric_flora_belonostomuscretaceous:0:0:0",
                            "lepidodendron:prehistoric_flora_belonostomusjurassic:0:0:0",
                            "lepidodendron:prehistoric_flora_berthasaura:0:0:0",
                            "lepidodendron:prehistoric_flora_brannerion:0:0:0",
                            "lepidodendron:prehistoric_flora_calamopleurus:0:0:0",
                            "lepidodendron:prehistoric_flora_caririsuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_celtedens:0:0:0",
                            "lepidodendron:prehistoric_flora_ceratodus:0:0:0",
                            "lepidodendron:prehistoric_flora_cidaroida:0:0:0",
                            "lepidodendron:prehistoric_flora_cladocyclus:0:0:0",
                            "lepidodendron:prehistoric_flora_cooyoo:0:0:0",
                            "lepidodendron:prehistoric_flora_cratoamia:0:0:0",
                            "lepidodendron:prehistoric_flora_cretoxyrhina:0:0:0",
                            "lepidodendron:prehistoric_flora_cricosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_dastilbe:0:0:0",
                            "lepidodendron:prehistoric_flora_deinonychus:0:0:0",
                            "lepidodendron:prehistoric_flora_dimitobelus:0:0:0",
                            "lepidodendron:prehistoric_flora_dragonfly{PNType:\"dragonfly_random\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_dugaldia:0:0:0",
                            "lepidodendron:prehistoric_flora_edentosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_egertonodus:0:0:0",
                            "lepidodendron:prehistoric_flora_elasmodectes:0:0:0",
                            "lepidodendron:prehistoric_flora_enchodus:0:0:0",
                            "lepidodendron:prehistoric_flora_eocarcharia:0:0:0",
                            "lepidodendron:prehistoric_flora_eryma:0:0:0",
                            "lepidodendron:prehistoric_flora_euspira:0:0:0",
                            "lepidodendron:prehistoric_flora_ezkutuberezi:0:0:0",
                            "lepidodendron:prehistoric_flora_falcarius:0:0:0",
                            "lepidodendron:prehistoric_flora_geosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_gobiconodon:0:0:0",
                            "lepidodendron:prehistoric_flora_gueragama:0:0:0",
                            "lepidodendron:prehistoric_flora_gyrodus:0:0:0",
                            "lepidodendron:prehistoric_flora_haliskia:0:0:0",
                            "lepidodendron:prehistoric_flora_hamulina:0:0:0",
                            "lepidodendron:prehistoric_flora_harpagodes:0:0:0",
                            "lepidodendron:prehistoric_flora_harvestman:0:0:0",
                            "lepidodendron:prehistoric_flora_hemiaster:0:0:0",
                            "lepidodendron:prehistoric_flora_hispanamia:0:0:0",
                            "lepidodendron:prehistoric_flora_homoeosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_hoyasotes:0:0:0",
                            "lepidodendron:prehistoric_flora_hyphalosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_hypophylloceras:0:0:0",
                            "lepidodendron:prehistoric_flora_hypsilophodon:0:0:0",
                            "lepidodendron:prehistoric_flora_ichthyemidion:0:0:0",
                            "lepidodendron:prehistoric_flora_ichthyotringa:0:0:0",
                            "lepidodendron:prehistoric_flora_iemanja:0:0:0",
                            "lepidodendron:prehistoric_flora_ikechaoamia:0:0:0",
                            "lepidodendron:prehistoric_flora_ikechosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_isanichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_ischyodus{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_iyuku:0:0:0",
                            "lepidodendron:prehistoric_flora_jellyfish1:0:0:0",
                            "lepidodendron:prehistoric_flora_jinyunpelta:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"abrigramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"ithigramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"kalligramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"makarkinia\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"oregramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kalligrammatid{PNType:\"sophogramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_khoratamia:0:0:0",
                            "lepidodendron:prehistoric_flora_koolasuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_koonwarria:0:0:0",
                            "lepidodendron:prehistoric_flora_lacewing{PNType:\"aetheogramma\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_lacewing{PNType:\"cretapsychops\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_landsnail:0:0:0",
                            "lepidodendron:prehistoric_flora_lanxangichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_lepidohyas:0:0:0",
                            "lepidodendron:prehistoric_flora_leptocleidus:0:0:0",
                            "lepidodendron:prehistoric_flora_leviathania:0:0:0",
                            "lepidodendron:prehistoric_flora_liaoceratops:0:0:0",
                            "lepidodendron:prehistoric_flora_limulid:0:0:0",
                            "lepidodendron:prehistoric_flora_lonchidion:0:0:0",
                            "lepidodendron:prehistoric_flora_luskhan:0:0:0",
                            "lepidodendron:prehistoric_flora_machimosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_macromesodon:0:0:0",
                            "lepidodendron:prehistoric_flora_maiaspondylus:0:0:0",
                            "lepidodendron:prehistoric_flora_mawsonia:0:0:0",
                            "lepidodendron:prehistoric_flora_mecochirus:0:0:0",
                            "lepidodendron:prehistoric_flora_mesomyzon:0:0:0",
                            "lepidodendron:prehistoric_flora_moutoniceras:0:0:0",
                            "lepidodendron:prehistoric_flora_murex:0:0:0",
                            "lepidodendron:prehistoric_flora_muttaburrasaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_mythunga:0:0:0",
                            "lepidodendron:prehistoric_flora_neoceratodus:0:0:0",
                            "lepidodendron:prehistoric_flora_nerinea:0:0:0",
                            "lepidodendron:prehistoric_flora_nigersaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_notopala:0:0:0",
                            "lepidodendron:prehistoric_flora_notostracan{PNType:\"triops_random\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_onchopristis:0:0:0",
                            "lepidodendron:prehistoric_flora_pachyamia:0:0:0",
                            "lepidodendron:prehistoric_flora_palaeocambarus:0:0:0",
                            "lepidodendron:prehistoric_flora_palaeontinid:0:0:0",
                            "lepidodendron:prehistoric_flora_paracestracion:0:0:0",
                            "lepidodendron:prehistoric_flora_paraclupea:0:0:0",
                            "lepidodendron:prehistoric_flora_phylloceras:0:0:0",
                            "lepidodendron:prehistoric_flora_pietraroiasuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_pliodetes:0:0:0",
                            "lepidodendron:prehistoric_flora_protopsephurus:0:0:0",
                            "lepidodendron:prehistoric_flora_protospinax:0:0:0",
                            "lepidodendron:prehistoric_flora_pseudorhina{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_psilichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_psittacosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_psittacosaurus_sibiricus:0:0:0",
                            "lepidodendron:prehistoric_flora_psittacosaurus_sinensis:0:0:0",
                            "lepidodendron:prehistoric_flora_ptychodus:0:0:0",
                            "lepidodendron:prehistoric_flora_repenomamus:0:0:0",
                            "lepidodendron:prehistoric_flora_rhacolepis:0:0:0",
                            "lepidodendron:prehistoric_flora_roachoidaridinsect:0:0:0",
                            "lepidodendron:prehistoric_flora_roachoidforestinsect:0:0:0",
                            "lepidodendron:prehistoric_flora_roachoidswampinsect:0:0:0",
                            "lepidodendron:prehistoric_flora_saccocoma:0:0:0",
                            "lepidodendron:prehistoric_flora_scheenstia:0:0:0",
                            "lepidodendron:prehistoric_flora_shantungosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_sinamia:0:0:0",
                            "lepidodendron:prehistoric_flora_squalicorax:0:0:0",
                            "lepidodendron:prehistoric_flora_stenamara:0:0:0",
                            "lepidodendron:prehistoric_flora_strombus:0:0:0",
                            "lepidodendron:prehistoric_flora_tapejara:0:0:0",
                            "lepidodendron:prehistoric_flora_tessarolax:0:0:0",
                            "lepidodendron:prehistoric_flora_tetrapodophis:0:0:0",
                            "lepidodendron:prehistoric_flora_thaiodus:0:0:0",
                            "lepidodendron:prehistoric_flora_tietasaura:0:0:0",
                            "lepidodendron:prehistoric_flora_tomognathus:0:0:0",
                            "lepidodendron:prehistoric_flora_toxolophosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_tribodus:0:0:0",
                            "lepidodendron:prehistoric_flora_tropaeum:0:0:0",
                            "lepidodendron:prehistoric_flora_tyrannotitan:0:0:0",
                            "lepidodendron:prehistoric_flora_uighuroniscus:0:0:0",
                            "lepidodendron:prehistoric_flora_vidalamia:0:0:0",
                            "lepidodendron:prehistoric_flora_vinctifer:0:0:0",
                            "lepidodendron:prehistoric_flora_viviparus:0:0:0",
                            "lepidodendron:prehistoric_flora_wenzichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_xeneichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_yanosteus:0:0:0",
                            "lepidodendron:prehistoric_flora_foreyclupea:0:0:0",
                            "lepidodendron:prehistoric_flora_chalawan:0:0:0",
                            "lepidodendron:prehistoric_flora_dentilepisosteus:0:0:0",
                            "lepidodendron:prehistoric_flora_eoconfuciusornis{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kururubatrachus:0:0:0",
                            "lepidodendron:prehistoric_flora_victalimulus:0:0:0",
                            "lepidodendron:prehistoric_flora_araripemys:0:0:0",
                            "lepidodendron:prehistoric_flora_ptyktoptychion{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_genibatrachus:0:0:0",
                            "lepidodendron:prehistoric_flora_leptostyrax:0:0:0",
                            "lepidodendron:prehistoric_flora_scapanorhynchus:0:0:0",
                            "lepidodendron:prehistoric_flora_taquetochelys:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_scorpionfly{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_lacewing{PNType:\"krika\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_lacewing{PNType:\"karenina\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_lacewing{PNType:\"nuddsia\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_confuciusornis{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_microvenato{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_fortiholcorpa{PNType:\"gendered\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_kronosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_utahraptor:0:0:0",
                            "lepidodendron:prehistoric_flora_sume:0:0:0",
                            "lepidodendron:prehistoric_flora_pseudomonocentris:0:0:0",
                            "lepidodendron:prehistoric_flora_turbomesodon:0:0:0",
                            "lepidodendron:prehistoric_flora_cretalamna:0:0:0",
                            "lepidodendron:prehistoric_flora_tenontosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_europejara:0:0:0",
                            "lepidodendron:prehistoric_flora_valdosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_palaeoechinastacus:0:0:0",
                            "lepidodendron:prehistoric_flora_polzia:0:0:0",
                            "lepidodendron:prehistoric_flora_lycoptera:0:0:0",
                            "lepidodendron:prehistoric_flora_teoichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_gegepterus:0:0:0",
                            "lepidodendron:prehistoric_flora_pterodaustro:0:0:0",
                            "lepidodendron:prehistoric_flora_kunbarrasaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_rhinobatos:0:0:0",
                            "lepidodendron:prehistoric_flora_tlalocbatos:0:0:0",
                            "lepidodendron:prehistoric_flora_patagotitan:0:0:0",
                            "lepidodendron:prehistoric_flora_galleonosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_caiuajara:0:0:0",
                            "lepidodendron:prehistoric_flora_cratopipa:0:0:0",
                            "lepidodendron:prehistoric_flora_malawisaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_uktenadactylus:0:0:0",
                            "lepidodendron:prehistoric_flora_archaeoceratops:0:0:0",
                            "lepidodendron:prehistoric_flora_anoualerpeton:0:0:0",
                            "lepidodendron:prehistoric_flora_candidodon:0:0:0",
                            "lepidodendron:prehistoric_flora_malawisuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_stolokrosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_notelops:0:0:0",
                            "lepidodendron:prehistoric_flora_euroka:0:0:0",
                            "lepidodendron:prehistoric_flora_heckelichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_chanopsis:0:0:0",
                            "lepidodendron:prehistoric_flora_siamamia:0:0:0",
                            "lepidodendron:prehistoric_flora_hoyasemys:0:0:0",
                            "lepidodendron:prehistoric_flora_gastonia:0:0:0",
                            "lepidodendron:prehistoric_flora_eichstaettisaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_paulchoffatia:0:0:0",
                            "lepidodendron:prehistoric_flora_yuanyanglong:0:0:0",
                            "lepidodendron:prehistoric_flora_caudipteryx:0:0:0",
                            "lepidodendron:prehistoric_flora_incisivosaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_mei:0:0:0",
                            "lepidodendron:prehistoric_flora_leaellynasaura:0:0:0",
                            "lepidodendron:prehistoric_flora_iguanodon:0:0:0",
                            "lepidodendron:prehistoric_flora_borealopelta:0:0:0",
                            "lepidodendron:prehistoric_flora_naomichelys:0:0:0",
                            "lepidodendron:prehistoric_flora_brodiechelys:0:0:0",
                            "lepidodendron:prehistoric_flora_ordosemys:0:0:0",
                            "lepidodendron:prehistoric_flora_goniopholis:0:0:0",
                            "lepidodendron:prehistoric_flora_sauroposeidon:0:0:0",
                            "lepidodendron:prehistoric_flora_araripelepidotes:0:0:0",
                            "lepidodendron:prehistoric_flora_liaoningogriphus:0:0:0",
                            "lepidodendron:prehistoric_flora_valdotriton:0:0:0",
                            "lepidodendron:prehistoric_flora_austropotamobius:0:0:0",
                            "lepidodendron:prehistoric_flora_pelecanimimus:0:0:0",
                            "lepidodendron:prehistoric_flora_spectrovenator:0:0:0",
                            "lepidodendron:prehistoric_flora_sarcosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_chaoyangopterus:0:0:0",
                            "lepidodendron:prehistoric_flora_dissimilites:0:0:0",
                            "lepidodendron:prehistoric_flora_prehistoric_flora_anurognathid{PNType:\"vesperopterylus\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_mortoniceras:0:0:0",
                            "lepidodendron:prehistoric_flora_ptychoceras:0:0:0",
                            "lepidodendron:prehistoric_flora_mariella:0:0:0",
                            "lepidodendron:prehistoric_flora_bathrotomaria:0:0:0",
                            "lepidodendron:prehistoric_flora_lytoceras:0:0:0",
                            "lepidodendron:prehistoric_flora_santanmantis:0:0:0",
                            "lepidodendron:prehistoric_flora_protechiurus:0:0:0",
                            "lepidodendron:prehistoric_flora_myriapod{PNType:\"velocipede\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_myriapod{PNType:\"fulmenocursor\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_myriapod{PNType:\"juliform\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_myriapod{PNType:\"polydesmid\"}:0:0:0",
                            "lepidodendron:prehistoric_flora_stonefly:0:0:0",
                            "lepidodendron:prehistoric_flora_mayfly:0:0:0",
                            "lepidodendron:prehistoric_flora_hangingfly:0:0:0",
                            "lepidodendron:prehistoric_flora_damselfly:0:0:0",
                            "lepidodendron:prehistoric_flora_sasayamagnomus:0:0:0",
                            "lepidodendron:prehistoric_flora_shokawa:0:0:0",
                            "lepidodendron:prehistoric_flora_chuhsiungichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_jinjuichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_kokuraichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_nipponamia:0:0:0",
                            "lepidodendron:prehistoric_flora_paraleptolepis:0:0:0",
                            "lepidodendron:prehistoric_flora_wakinoichthys:0:0:0",
                            "lepidodendron:prehistoric_flora_sasayamamylos:0:0:0",
                            "lepidodendron:prehistoric_flora_hakusanobaatar:0:0:0",
                            "lepidodendron:prehistoric_flora_hyogobatrachus:0:0:0",
                            "lepidodendron:prehistoric_flora_shirerpeton:0:0:0",
                            "lepidodendron:prehistoric_flora_fukuipteryx:0:0:0",
                            "lepidodendron:prehistoric_flora_kuwajimalla:0:0:0",
                            "lepidodendron:prehistoric_flora_fukuisaurus:0:0:0",
                            "lepidodendron:prehistoric_flora_fukuititan:0:0:0",
                            "lepidodendron:prehistoric_flora_tambatitanis:0:0:0",
                            "lepidodendron:prehistoric_flora_fukuiraptor:0:0:0",
                            "lepidodendron:prehistoric_flora_fukuivenator:0:0:0",
                            "lepidodendron:prehistoric_flora_hypnovenator:0:0:0",
                            "lepidodendron:prehistoric_flora_tyrannomimus:0:0:0",
                            "lepidodendron:prehistoric_flora_sinemys:0:0:0",
                            "lepidodendron:prehistoric_flora_cretosaja:0:0:0",
                            "lepidodendron:prehistoric_flora_adocus:0:0:0",
                            "lepidodendron:prehistoric_flora_monjurosuchus:0:0:0",
                            "lepidodendron:prehistoric_flora_kaganaias:0:0:0",
                            "lepidodendron:prehistoric_flora_sapeornis:0:0:0",
                            "lepidodendron:prehistoric_flora_noripterus:0:0:0",
                            "lepidodendron:prehistoric_flora_macropenaeus:0:0:0",
                            "lepidodendron:prehistoric_flora_armigatus:0:0:0"
                    });
                return MobString;

            case 10: //Late K
                return new String[]{"lepidodendron:prehistoric_flora_hexanchus:0:0:0",
                        "lepidodendron:prehistoric_flora_ammonite_parapuzosia:0:0:0",
                        "lepidodendron:prehistoric_flora_ammonite_pachydiscus:0:0:0",
                        "lepidodendron:prehistoric_flora_ammonite_pachydesmoceras:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish7:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish3:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish1:0:0:0",
                        "lepidodendron:prehistoric_flora_harvestman:0:0:0",
                        "lepidodendron:prehistoric_flora_snail_land:0:0:0",
                        "lepidodendron:prehistoric_flora_roachoid_arid:0:0:0",
                        "lepidodendron:prehistoric_flora_roachoid_swamp:0:0:0",
                        "lepidodendron:prehistoric_flora_roachoid_forest:0:0:0",
                        "lepidodendron:prehistoric_flora_cidaroida:0:0:0",
                        "lepidodendron:prehistoric_flora_notostracan{PNType:\"triops1\"}@{PNType:\"triops2\"}@{PNType:\"triops3\"}:0:0:0",
                        "lepidodendron:prehistoric_flora_lonchidion:0:0:0",
                        "lepidodendron:prehistoric_flora_aeger:0:0:0",
                        "lepidodendron:prehistoric_flora_ceratodus:0:0:0",
                        "lepidodendron:prehistoric_flora_limulid:0:0:0",
                        "lepidodendron:prehistoric_flora_euspira:0:0:0",
                        "lepidodendron:prehistoric_flora_belonostomus_jurassic:0:0:0",
                        "lepidodendron:prehistoric_flora_phylloceras:0:0:0",
                        "lepidodendron:prehistoric_flora_mecochirus:0:0:0",
                        "lepidodendron:prehistoric_flora_elasmodectes:0:0:0",
                        "lepidodendron:prehistoric_flora_harpagodes:0:0:0",
                        "lepidodendron:prehistoric_flora_nerinea:0:0:0",
                        "lepidodendron:prehistoric_flora_eryma:0:0:0",
                        "lepidodendron:prehistoric_flora_ischyodus:0:0:0",
                        "lepidodendron:prehistoric_flora_dragonfly:0:0:0",
                        "lepidodendron:prehistoric_flora_viviparus:0:0:0",
                        "lepidodendron:prehistoric_flora_ichthyotringa:0:0:0",
                        "lepidodendron:prehistoric_flora_mawsonia:0:0:0",
                        "lepidodendron:prehistoric_flora_jinyunpelta:0:0:0",
                        "lepidodendron:prehistoric_flora_cladocyclus:0:0:0",
                        "lepidodendron:prehistoric_flora_calamopleurus:0:0:0",
                        "lepidodendron:prehistoric_flora_tribodus:0:0:0",
                        "lepidodendron:prehistoric_flora_anhanguera:0:0:0",
                        "lepidodendron:prehistoric_flora_araripesuchus:0:0:0",
                        "lepidodendron:prehistoric_flora_onchopristis:0:0:0",
                        "lepidodendron:prehistoric_flora_ptychodus:0:0:0",
                        "lepidodendron:prehistoric_flora_squalicorax:0:0:0",
                        "lepidodendron:prehistoric_flora_cretoxyrhina:0:0:0",
                        "lepidodendron:prehistoric_flora_tomognathus:0:0:0",
                        "lepidodendron:prehistoric_flora_hypophylloceras:0:0:0",
                        "lepidodendron:prehistoric_flora_dimitobelus:0:0:0",
                        "lepidodendron:prehistoric_flora_hemiaster:0:0:0",
                        "lepidodendron:prehistoric_flora_anchura:0:0:0",
                        "lepidodendron:prehistoric_flora_enchodus:0:0:0",
                        "lepidodendron:prehistoric_flora_tessarolax:0:0:0",
                        "lepidodendron:prehistoric_flora_notopala:0:0:0",
                        "lepidodendron:prehistoric_flora_neoceratodus:0:0:0",
                        "lepidodendron:prehistoric_flora_albanerpeton:0:0:0",
                        "lepidodendron:prehistoric_flora_prenocephale:0:0:0",
                        "lepidodendron:prehistoric_flora_diplomoceras:0:0:0",
                        "lepidodendron:prehistoric_flora_harranahynchus:0:0:0",
                        "lepidodendron:prehistoric_flora_parenchodus:0:0:0",
                        "lepidodendron:prehistoric_flora_hyphantoceras:0:0:0",
                        "lepidodendron:prehistoric_flora_baculites:0:0:0",
                        "lepidodendron:prehistoric_flora_pravitoceras:0:0:0",
                        "lepidodendron:prehistoric_flora_scaphites:0:0:0",
                        "lepidodendron:prehistoric_flora_megapterygius:0:0:0",
                        "lepidodendron:prehistoric_flora_futabasaurus:0:0:0",
                        "lepidodendron:prehistoric_flora_phosphorosaurus:0:0:0",
                        "lepidodendron:prehistoric_flora_bathrotomaria:0:0:0",
                        "lepidodendron:prehistoric_flora_nipponites:0:0:0",
                        "lepidodendron:prehistoric_flora_kamuysaurus:0:0:0",
                        "lepidodendron:prehistoric_flora_amakusaichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_anomalochelys:0:0:0",
                        "lepidodendron:prehistoric_flora_yezoceras:0:0:0",
                        "lepidodendron:prehistoric_flora_mesodermochelys:0:0:0",
                        "lepidodendron:prehistoric_flora_kujiberotha:0:0:0",
                        "lepidodendron:prehistoric_flora_hayenchelys:0:0:0",
                        "lepidodendron:prehistoric_flora_macropenaeus:0:0:0",
                        "lepidodendron:prehistoric_flora_armigatus:0:0:0",
                        "lepidodendron:prehistoric_flora_acrognathus:0:0:0",
                        "lepidodendron:prehistoric_flora_prionolepis:0:0:0",
                        "lepidodendron:prehistoric_flora_anguillavus:0:0:0",
                        "lepidodendron:prehistoric_flora_maraldichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_gladiopycnodus:0:0:0",
                        "lepidodendron:prehistoric_flora_stenoprotome:0:0:0",
                        "lepidodendron:prehistoric_flora_hayolperichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_tricerichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_rostropycnodus:0:0:0",
                        "lepidodendron:prehistoric_flora_sigmapycnodus:0:0:0",
                        "lepidodendron:prehistoric_flora_plectocretacicus:0:0:0",
                        "lepidodendron:prehistoric_flora_rhamphoichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_pankowskichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_hensodon:0:0:0",
                        "lepidodendron:prehistoric_flora_eusebichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_heterothrissa:0:0:0",
                        "lepidodendron:prehistoric_flora_lissoberyx:0:0:0",
                        "lepidodendron:prehistoric_flora_flagellipinna:0:0:0",
                        "lepidodendron:prehistoric_flora_paracoccodus:0:0:0",
                        "lepidodendron:prehistoric_flora_corusichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_cretapantodon:0:0:0",
                        "lepidodendron:prehistoric_flora_ichthyoceros:0:0:0",
                        "lepidodendron:prehistoric_flora_gebrayelichthys:0:0:0",
                        "lepidodendron:prehistoric_flora_exocoetoides:0:0:0",
                        "lepidodendron:prehistoric_flora_eupodophis:0:0:0",
                        "lepidodendron:prehistoric_flora_cyclobatis:0:0:0",
                        "lepidodendron:prehistoric_flora_eubiodectes:0:0:0",
                        "lepidodendron:prehistoric_flora_mesiteia:0:0:0",
                        "lepidodendron:prehistoric_flora_haimirichia:0:0:0",
                        "lepidodendron:prehistoric_flora_hakelia:0:0:0",
                        "lepidodendron:prehistoric_flora_haqelpycnodus:0:0:0",
                        "lepidodendron:prehistoric_flora_koleken:0:0:0",
                        "lepidodendron:prehistoric_flora_leptostyrax:0:0:0",
                        "lepidodendron:prehistoric_flora_scapanorhynchus:0:0:0",
                        "lepidodendron:prehistoric_flora_adocus:0:0:0",
                        "lepidodendron:prehistoric_flora_myriapod{PNType:\"juliform\"}@{PNType:\"polydesmid\"}:0:0:0"};


            case 11: //Paleogene
                return new String[]{
                        "lepidodendron:prehistoric_flora_jellyfish7:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish3:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish1:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish4:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish2:0:0:0",
                        "lepidodendron:prehistoric_flora_hexanchus:0:0:0",
                        "lepidodendron:prehistoric_flora_harvestman:0:0:0",
                        "lepidodendron:prehistoric_flora_snail_land:0:0:0",
                        "lepidodendron:prehistoric_flora_notostracan{PNType:\"triops1\"}@{PNType:\"triops2\"}@{PNType:\"triops3\"}:0:0:0",
                        "lepidodendron:prehistoric_flora_cidaroida:0:0:0",
                        "lepidodendron:prehistoric_flora_ceratodus:0:0:0",
                        "lepidodendron:prehistoric_flora_limulid:0:0:0",
                        "lepidodendron:prehistoric_flora_euspira:0:0:0",
                        "lepidodendron:prehistoric_flora_tessarolax:0:0:0",
                        "lepidodendron:prehistoric_flora_anchura:0:0:0",
                        "lepidodendron:prehistoric_flora_albanerpeton:0:0:0",
                        "lepidodendron:prehistoric_flora_hemiaster:0:0:0",
                        "lepidodendron:prehistoric_flora_ischyodus:0:0:0",
                        "lepidodendron:prehistoric_flora_viviparus:0:0:0",
                        "lepidodendron:prehistoric_flora_dragonfly:0:0:0"
                };

            case 12: //Neogene
                return new String[]{
                        "lepidodendron:prehistoric_flora_jellyfish7:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish3:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish1:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish4:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish2:0:0:0",
                        "lepidodendron:prehistoric_flora_hexanchus:0:0:0",
                        "lepidodendron:prehistoric_flora_harvestman:0:0:0",
                        "lepidodendron:prehistoric_flora_snail_land:0:0:0",
                        "lepidodendron:prehistoric_flora_notostracan{PNType:\"triops1\"}@{PNType:\"triops2\"}@{PNType:\"triops3\"}:0:0:0",
                        "lepidodendron:prehistoric_flora_cidaroida:0:0:0",
                        "lepidodendron:prehistoric_flora_limulid:0:0:0",
                        "lepidodendron:prehistoric_flora_euspira:0:0:0",
                        "lepidodendron:prehistoric_flora_dragonfly:0:0:0",
                        "lepidodendron:prehistoric_flora_viviparus:0:0:0",
                        "lepidodendron:prehistoric_flora_notopala:0:0:0",
                        "lepidodendron:prehistoric_flora_neoceratodus:0:0:0",
                        "lepidodendron:prehistoric_flora_albanerpeton:0:0:0",
                        "lepidodendron:prehistoric_flora_hemiaster:0:0:0",
                        "lepidodendron:prehistoric_flora_ischyodus:0:0:0"
                };

            case 13: //Pleistocene
                return new String[]{
                        "lepidodendron:prehistoric_flora_jellyfish1:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish2:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish3:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish4:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish5:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish6:0:0:0",
                        "lepidodendron:prehistoric_flora_jellyfish7:0:0:0",
                        "lepidodendron:prehistoric_flora_hexanchus:0:0:0",
                        "lepidodendron:prehistoric_flora_harvestman:0:0:0",
                        "lepidodendron:prehistoric_flora_snail_land:0:0:0",
                        "lepidodendron:prehistoric_flora_notostracan{PNType:\"triops1\"}@{PNType:\"triops2\"}@{PNType:\"triops3\"}:0:0:0",
                        "lepidodendron:prehistoric_flora_cidaroida:0:0:0",
                        "lepidodendron:prehistoric_flora_limulid:0:0:0",
                        "lepidodendron:prehistoric_flora_euspira:0:0:0",
                        "lepidodendron:prehistoric_flora_dragonfly:0:0:0",
                        "lepidodendron:prehistoric_flora_viviparus:0:0:0",
                        "lepidodendron:prehistoric_flora_notopala:0:0:0",
                        "lepidodendron:prehistoric_flora_neoceratodus:0:0:0"
                };

            case 14:
                return MobString;

        }

    }

    public static String[] mobString(Biome biome) {

        String[] MobString = new String[0];

        //PRECAMBRIAN:
        if (biome instanceof BiomePrecambrian) {
            if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanMobsPF);
                }
            } else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanMobsPF);
                }
            } else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicMobsPF);
                }
            } else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicMobsPF);
                }
            } else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Neoproterozoic) {
                if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimCryogenianMobsPF);
                    }
                }
                else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:tonian_sea")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimTonianMobsPF);
                    }
                }
                else {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicMobsPF);
                    }
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranShallowSeaMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_shallow_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranShallowReefMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_stromatolite_pavement")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranStromatolitePavementMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_sparse_sea")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranSparseSeaMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranTrenchMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranExtremeHillsMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranFrondoseMobsPF);
                }
            }
        }

        //CAMBRIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsReefPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsLagoonsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanOesiaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_abyssal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanAbyssPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_foreshore")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_foreshore_dry")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsSiltyShorePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_siphusauctum")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsDeepOceanSiphusauctumPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
//            }
        }

        //ORDOVICIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogReborn);
//            }
        }

        //SILURIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepRockPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepSandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_cooksonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_sands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_silty_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekLandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampReborn);
//            }
        }

        //DEVONIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_algae")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanAlgaePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanAlgaeFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanAlgaeReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lagoon")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsLagoonPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsLagoonFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsLagoonReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBarrierReefPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBarrierReefFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBarrierReefReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_brackish")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lycopsid_spinney")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_lycopsid_spinney")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsColdGladesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsColdGladesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsColdGladesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef2")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsCoralReefPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsCoralReefFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsCoralReefReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDunesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDunesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_aztec")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_aztec")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_aztec_shallow")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills_pools")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsStrudPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsStrudFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsStrudReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains_early")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_spikes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanRockyPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanRockyFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanRockyReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa_lake")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsRedLakePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsRedLakeFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsRedLakeReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_vale")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_gilboa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalinePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalineFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalineReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_conulariid")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_conulariid_land")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanPolarPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalineFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsHypersalineReborn);
//            }
        }

        //CARBONIFEROUS:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_cliff")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanCliffPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanFA);
//                    }
//                    if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanReborn);
//                    }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_estuary")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_fen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_fen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIcePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_flat")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_river_border")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_woodland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_cold_woodland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsWoodlandPF);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_savanna")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_cold_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSteppePF);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_bay")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_ash")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater_water")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterReborn);
//            }
        }

        //PERMIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris_foggy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridHillsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands_lush")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid_lands_lush")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridKettlesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridHillsFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridHillsReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsCathayWetlandsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands_floodplain_brake")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain_brake")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsBrakePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest_dense")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubDensePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertEdgePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded_earthbanks")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsEarthbanksPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands_fern_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsCirquePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertEdgeFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertEdgeReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_hummocks")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain_lake")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands_floodplain")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodplainPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsCirqueFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsCirqueReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wooded_atoll_rim")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineWoodlandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wooded_atoll")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineWoodlandLakePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_cliff")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodplainFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodplainReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubDenseFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubDenseReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_shore")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach_saltmarsh")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsSaltmarshPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_sponge_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanSpongeReefPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsCathayWetlandsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsCathayWetlandsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsEarthbanksFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsEarthbanksReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisCopsePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsSaltmarshFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsSaltmarshReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_craggy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateForestPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineForestReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_temperate_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateWaterMeadowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineForestFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMarineForestReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWoodedScrubPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksReborn);
//                }
            }

            //TRIASSIC:
            else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinleDryPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_chinle_flats")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_chinle_flats")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinleWetPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_china_trees")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_china_swamp")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinaIslandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_china_lakes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChinaIslandSaltLakesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach_white")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_delta_flats")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_delta_flats")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_delta_flats_mound")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDeltaPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_sandy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_rocky")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_pleuromeia_beds")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPleuromeiaPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_horsetails")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_horsetails")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsHorsetailsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_estuary")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_estuary")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsEstuaryPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_crags")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsAntarcticForestPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPoljePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanReefPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_lossiemouth")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_lossiemouth")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSandyHillsPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_shore")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach_black")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_volcanic_islands")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsShatteredIslandPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_madagascar_flats")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMadagascarPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest_dense")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSantaMariaPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_clearing_lake")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_clearing")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsAustraliaPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_karoo_swamp_open")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_karoo_swamp_copse")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_karoo_swamp")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_karoo_swamp")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooWetPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain_flat")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_plain")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIschigualastoPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_karoo_plains")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooDryPF);
                }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_dry_bayou")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsChanaresPF);
                }
//                        if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_karoo_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_karoo_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsKarooForestPF);
                }
//                            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland_lakes")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIndiaPF);
                }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_field")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland_field")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSphenopterisPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_lakeland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_volcanic_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWarmLakelandPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_volcanic_hills_valley")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_volcanic_hills_valley")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_volcanic_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWarmSwampyValleyPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWoodlandPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
//                }
            }

            //JURASSIC:
            else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coastal_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_glass_sponge_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_coral")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_riverbank")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_helper")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_garrigue")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarriguePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue_copse")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_boulders")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_cycad_thickets")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_fern_pasture")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_fern_pasture")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPasturePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_floodplain")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_parkland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_woodland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_ginkgo_woodland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMirePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_flat")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_copse")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopsePF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopseFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopseReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_hills")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_mountains")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_coniferous_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_rough_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_basalt")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_black")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_roost")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_field")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_helper")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_desert_side")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek_fog")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_forested")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandReborn);
//                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_forested_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandBeachPF);
                }
//                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandFA);
//                }
//                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandReborn);
//                }
            }


        //JURASSIC:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_pacific")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanPacificPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysCoralPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys_rudist")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanTethysRudistPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_atlantic")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanAtlanticShallowPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_atlantic_deep")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanAtlanticDeepPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_southern")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanSouthernPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_crags")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanCragsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_inland_sea_australia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyOceanEromangaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica_inland_sea")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_australia_antarctica_inland_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaLushBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_coastal")
         || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_coastal_dunes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_austro_antarctic_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_austro_antarctic_coastal_cliffs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaSandbarsPF );
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_coastal_cliffs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaCliffsPF );
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_creek")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_lakes_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPodocarpPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_winter")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPodocarpWinterPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_paddock")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_australia_antarctica_paddock")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPaddockPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_australia_antarctica_paddock_winter")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaPaddockWinterPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_rainforest")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_austro_antarctic_rainforest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaRainforestPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes_rim_inner")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaAlpineLakePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_australia_antarctica")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaBeachSandyPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_australia_antarctica_muddy")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_australia_antarctica_muddy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEGondwanaBeachMuddyPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaMountainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_valley")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaMountainValleyPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSavannaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_savanna_hole_centre")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSavannaWateringHolePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_afroamerica_red")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_afroamerica_red")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_africa_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp_open")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAfricaSwampWoodlandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_centre")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_rift")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaRiftPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_arid")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_arid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaAridPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_arid_spikes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaAridSpikesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_flats")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_flats")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_flats_stream")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaCoastalFlatsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaRiparianWetlandsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_sandy_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_sandy_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaDesertPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_sandy_desert_spikes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaDesertSpikesPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_patagonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_patagonia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaWetForestPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_desert_low")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaXericPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_africa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyWGondwanaAmericaBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaMountainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_foothills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaFoothillsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaGravelsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_north_america_braided")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaFloodplainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_north_america_braided")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaMuddyPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_namerica_shrubland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaShrublandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_shrubland_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_namerica_shrubland_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaShrublandCopsePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_lagoons")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaLagoonPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_namerica_cove")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyNAmericaCovePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_field")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_europe_field")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyFloodplainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_field_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_europe_field_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyWoodlandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_europe_ferny")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_europe_ferny")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeFernyBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_swamp_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_swamp_lakes_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampLakePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_ocean_shore_tethys_europe")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_europe_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_europe_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeSwampBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_europe_maquis")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_europe_maquis")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeMacquisPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_europe_dry")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_europe_dry")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyEuropeMacquisBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_boggy_glades")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBogPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_asia_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_asia_marsh")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBogSaltMarshBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_drooping_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_asia_drooping_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMarshPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_drooping_swamp_mound")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMarshKnollsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_phyrgana")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_phyrgana_lake")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_asia_phyrgana")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMaritimePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_asia_craggy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_beach_asia_craggy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaMaritimeBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_barren_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaDustyHillsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_refugium")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_refugium")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaHinterlandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaBandedPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_shrubland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_shrubland_dunes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_shrubland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaShrublandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_shrubland_oasis")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaOasisPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_yixian_foothills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianFoothillsPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_highland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianHighlandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianMountainPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_a")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesConiferPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_b")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesGinkgoPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianLakesBurnedPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_beach_asia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.CretaceousEarlyAsiaYixianBeachPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCretaceousEarly.dimJurassicMobsOceanDeepReborn);
//            }
        }


        return MobString;
    }
}
