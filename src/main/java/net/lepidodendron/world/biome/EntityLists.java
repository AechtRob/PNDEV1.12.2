package net.lepidodendron.world.biome;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Loader;
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
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsPF);
                return MobString;

            case 2:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepPF);
                ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowPF);
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
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
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
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateWaterMeadowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsWoodedPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksPF);
                return MobString;

            case 7:
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanReefPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericScrublandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestClearingPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPleuromeiaPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSphenopterisPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWoodlandPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPoljePF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsPF);
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
                return MobString;

            case 10:
                return MobString;

            case 11:
                return MobString;

            case 12:
                return MobString;

            case 13:
                return MobString;

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
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
            }
        }

        //ORDOVICIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogReborn);
            }
        }

        //SILURIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepRockPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepSandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekBeachPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_cooksonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_sands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_silty_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCreekLandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampReborn);
            }
        }

        //DEVONIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_brackish")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lycopsid_spinney")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_gilboa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_vale")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsReborn);
            }
        }

        //CARBONIFEROUS:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowReborn);
            }
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_estuary")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_fen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_fen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIcePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_flat")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_river_border")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_cold_woodland")) {
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_ash")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater_water")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterReborn);
            }
        }

        //PERMIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands_lush")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_cliff")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_sponge_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris_foggy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_craggy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_temperate_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateWaterMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltReborn);

            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsReborn);
                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsWoodedPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsReborn);
            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_hummocks")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksReborn);
                }
            }

            //TRIASSIC:
            else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_shore")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_coastal_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsReborn);
                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowReborn);
            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericScrublandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_lakeland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_volcanic_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest_dense")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_crags")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_hills")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestReborn);
                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_dry_bayou")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsBayouReborn);
            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_clearing")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestClearingPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain_flat")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_plain")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_rocky")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_sandy")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_pleuromeia_beds")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPleuromeiaPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_field")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSphenopterisPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWoodlandPF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPoljePF);
                }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_volcanic_islands")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach_black")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_mountains")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
                }
            }

            //JURASSIC:
            else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanDeepReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coastal_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanShallowReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_glass_sponge_reef")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_coral")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_riverbank")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_helper")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_garrigue")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarriguePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue_copse")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_boulders")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_cycad_thickets")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_fern_pasture")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_fern_pasture")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPasturePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_floodplain")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_parkland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_woodland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_ginkgo_woodland")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMirePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_flat")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsReborn);
                }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopsePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopseFA);
            }
            if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsCopseReborn);
            }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_hills")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_mountains")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_coniferous_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_rough_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_basalt")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_black")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_roost")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_field")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_helper")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_desert_side")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek_fog")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_forested")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_forested_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandBeachPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology && Loader.isModLoaded("fossil")) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandFA);
                }
                if ((LepidodendronConfig.doSpawnsReborn && Loader.isModLoaded("rebornmod"))) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandReborn);
                }
            }


        return MobString;
    }
}
