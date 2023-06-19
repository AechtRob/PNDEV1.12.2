package net.lepidodendron.world.biome;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.EnumBiomeTypePrecambrian;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.world.biome.Biome;
import org.apache.commons.lang3.ArrayUtils;

public class EntityLists {

    public static String[] mobString(Biome biome, int genType) {

        //0 = WorldGen
        //1 = Air Trap
        //2 = Ground Trap
        //3 = Water Trap

        String[] MobString = new String[0];

        //PRECAMBRIAN:
        if (biome instanceof BiomePrecambrian) {
            if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimHadeanMobsPF);
                        }
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimHadeanTrapAirPF);
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimHadeanTrapGroundPF);
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimHadeanTrapWaterPF);
                }
            }

            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimArcheanMobsPF);
                        }
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimArcheanTrapAirPF);
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimArcheanTrapGroundPF);
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimArcheanTrapWaterPF);
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPaleoproterozoicMobsPF);
                        }
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPaleoproterozoicTrapAirPF);
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPaleoproterozoicTrapGroundPF);
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPaleoproterozoicTrapWaterPF);
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimMesoproterozoicMobsPF);
                        }
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimMesoproterozoicTrapAirPF);
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimMesoproterozoicTrapGroundPF);
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimMesoproterozoicTrapWaterPF);
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Neoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimNeoproterozoicMobsPF);
                        }
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimNeoproterozoicTrapAirPF);
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimNeoproterozoicTrapGroundPF);
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimNeoproterozoicTrapWaterPF);
                }
            }
        }
        if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimEdiacaranMobsPF);
                    }
                case 1:
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimEdiacaranTrapAirPF);
                case 2:
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimEdiacaranTrapGroundPF);
                case 3:
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimEdiacaranTrapWaterPF);
            }
        }

        //CAMBRIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianReefMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianReefMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianReefMobsReborn);
            }
        }

        //ORDOVICIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanIcePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianOceanIceMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianOceanIceMobsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsLagoonFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBogPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBogFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBogReborn);
            }
        }

        //SILURIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianOceanMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianOceanMobsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsLagoonFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_cooksonia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsSwampReborn);
            }
        }

        //DEVONIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_brackish")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsBrackishPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsBrackishFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsBrackishReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lycopsid_spinney")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsFloodplainPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsFloodplainFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsFloodplainReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_gilboa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsWattiezaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsWattiezaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsWattiezaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMeadowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMeadowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsMountainsReborn);
            }
        }

        //CARBONIFEROUS:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_cliff")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanCliffPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsEstuaryPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsEstuaryFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsEstuaryReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIcePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIceFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIceReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_river_border")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampReborn);
            }
        }

        //PERMIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsStonyPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsStonyFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsStonyReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands_lush")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsLushPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsLushFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsLushReborn);
            }

        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_cliff")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_sponge_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanCliffPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanCliffFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanCliffReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisTemperatePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
            }
        }

        //TRIASSIC:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_coastal_creek")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanClamBedsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanClamBedsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanClamBedsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericScrublandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericShrublandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericShrublandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_lakeland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsLakelandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsLakelandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsLakelandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_volcanic_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsVolcanicHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsVolcanicHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsVolcanicHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest_dense")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsFloodedForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsFloodedForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsFloodedForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_crags")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_clearing")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCoolForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCoolForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCoolForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMossMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMossMeadowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMossMeadowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_rocky")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_sandy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_pleuromeia_beds")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDunesPF);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDunesFA);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDunesReborn);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsPlateauPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsPlateauFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsPlateauReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCanyonsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCanyonsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCanyonsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_volcanic_islands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach_black")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsIslandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsIslandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsIslandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMountainsReborn);
            }
        }

        //JURASSIC:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coastal_creek")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_glass_sponge_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanGlassSpongePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanGlassSpongeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanGlassSpongeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanCoralPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanCoralFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanCoralReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanRaftPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanRaftFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOceanRaftReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_riverbank")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_garrigue")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarriguePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueTreesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueTreesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueTreesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_boulders")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueBouldersPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueBouldersFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueBouldersReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_cycad_thickets")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueCycadsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueCycadsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGarrigueCycadsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_fern_pasture")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_fern_pasture")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFernPasturePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFernPastureFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFernPastureReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainForestedPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainForestedFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsFloodplainForestedReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_parkland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoParklandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoParklandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoParklandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_woodland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_ginkgo_woodland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoLakesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoLakesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsGinkgoLakesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMirePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMireFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMireReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsPF);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsFA);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsReborn);
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsMudflatsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsRocksPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsRocksFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsRocksReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_mountains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_redwood_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsConiferousPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsConiferousFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsConiferousReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_rough_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRoughHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRoughHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsRoughHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks_raised")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks_solid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsRaisedPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsRaisedFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsIslandsRaisedReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_basalt")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_black")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaBeachPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaBeachFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsTaigaBeachReborn);
            }
        }
        return MobString;
    }
}
