package net.lepidodendron.world.biome;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.*;
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
                            MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanMobsPF);
                        }
                        break;
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanTrapAirPF);
                        break;
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanTrapGroundPF);
                        break;
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimHadeanTrapWaterPF);
                        break;
                }
            }

            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanMobsPF);
                        }
                        break;
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanTrapAirPF);
                        break;
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanTrapGroundPF);
                        break;
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimArcheanTrapWaterPF);
                        break;
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicMobsPF);
                        }
                        break;
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicTrapAirPF);
                        break;
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicTrapGroundPF);
                        break;
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimPaleoproterozoicTrapWaterPF);
                        break;
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicMobsPF);
                        }
                        break;
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicTrapAirPF);
                        break;
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicTrapGroundPF);
                        break;
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimMesoproterozoicTrapWaterPF);
                        break;
                }
            }
            else if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Neoproterozoic) {
                switch (genType) {
                    case 0:
                    default:
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicMobsPF);
                        }
                        break;
                    case 1:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicTrapAirPF);
                        break;
                    case 2:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicTrapGroundPF);
                        break;
                    case 3:
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicTrapWaterPF);
                        break;
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
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranMobsPF);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranTrapAirPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranTrapGroundPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranTrapWaterPF);
                    break;
            }
        }

        //CAMBRIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore")
        ) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianTrapAirOceanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianTrapGroundOceanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianTrapWaterOceanPF);
                    break;
            }

        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary_helper")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryTrapAirPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryTrapGroundPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryTrapWaterPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefTrapAirPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefTrapGroundPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefTrapWaterPF);
                    break;
            }
        }

        //ORDOVICIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirOceanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundOceanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterOceanPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIcePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirOceanIcePF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundOceanIcePF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterOceanIcePF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon_helper")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirLagoonPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundLagoonPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterLagoonPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirAlgalPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundAlgalPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterAlgalPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirBryozoanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundBryozoanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterBryozoanPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirSpongePF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundSpongePF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterSpongePF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapAirBogPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapGroundBogPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianTrapWaterBogPF);
                    break;
            }
        }

        //SILURIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_coastal")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirOceanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundOceanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterOceanPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon_helper")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirLagoonPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundLagoonPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterLagoonPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirCoralPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundCoralPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterCoralPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirReefPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundReefPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterReefPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirCrinoidPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundCrinoidPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterCrinoidPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_cooksonia")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapAirSwampPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapGroundSwampPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianTrapWaterSwampPF);
                    break;
            }
        }

        //DEVONIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_coastal")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirOceanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundOceanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterOceanPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirReefPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundReefPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterReefPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirSinkholePF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundSinkholePF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterSinkholePF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirDeadReefPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundDeadReefPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterDeadReefPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_brackish")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirBrackishPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundBrackishPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterBrackishPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lycopsid_spinney")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirForestPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundForestPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterForestPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_floodplain")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirFloodplainPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundFloodplainPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterFloodplainPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_swamp")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirSwampPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundSwampPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterSwampPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_gilboa")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirWattiezaPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundWattiezaPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterWattiezaPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirMeadowPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundMeadowPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterMeadowPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirSpringsPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundSpringsPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterSpringsPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirSavannaPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundSavannaPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterSavannaPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirValePF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundValePF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterValePF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapAirMountainsPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapGroundMountainsPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianTrapWaterMountainsPF);
                    break;
            }
        }

        //CARBONIFEROUS:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirOceanPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundOceanPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterOceanPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_cliff")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanCliffPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirOceanCliffPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundOceanCliffPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterOceanCliffPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirHillsPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundHillsPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterHillsPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary_helper")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirEstuaryPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundEstuaryPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterEstuaryPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirMarshPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundMarshPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterMarshPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_polar_desert_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_polar")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIcePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirIcePF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundIcePF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterIcePF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_river_border")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirSwampPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundSwampPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterSwampPF);
                    break;
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt")) {
            switch (genType) {
                case 0:
                default:
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampReborn);
                    }
                    break;
                case 1:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapAirBurntSwampPF);
                    break;
                case 2:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapGroundBurntSwampPF);
                    break;
                case 3:
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousTrapWaterBurntSwampPF);
                    break;
            }
        }

        //PERMIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_plains_spikes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_stony")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsStonyReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_arid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands_lush")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsAridLandsLushReborn);
            }

        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_cliff")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_sponge_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanCliffReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperatePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_desert")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsFloodbasaltReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHighlandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_lowlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_lowlands_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsLowlandForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsMountainsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_river")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_unwooded")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_fern_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_wetlands")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsWetlandsReborn);
            }
        }

        //TRIASSIC:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_coastal_creek")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_clam_beds")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanClamBedsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_xeric_scrubland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_xeric")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericScrublandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsXericShrublandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_lakeland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_warm_lakeland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsLakelandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_warm_volcanic_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsVolcanicHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_flooded_forest_dense")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_flooded_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsFloodedForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_crags")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_forest_clearing")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_gondwanan_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCoolForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMossMeadowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_rocky")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDesertReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_sandy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_desert")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_pleuromeia_beds")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPleuromeiaPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if (LepidodendronConfig.doSpawnsReborn) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_field")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsSphenopterisPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if (LepidodendronConfig.doSpawnsReborn) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsWoodlandPF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if (LepidodendronConfig.doSpawnsReborn) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland_polje")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPoljePF);
            }
//            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesFA);
//            }
//            if (LepidodendronConfig.doSpawnsReborn) {
//                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsDunesReborn);
//            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_broken")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_desert_plateau_canyons")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsPlateauReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_riverbank_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsCanyonsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_volcanic_islands")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach_black")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsIslandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsMountainsReborn);
            }
        }

        //JURASSIC:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coastal_creek")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_glass_sponge_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanGlassSpongeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanCoralReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean_rafts")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOceanRaftReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_river")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_riverbank")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRiverReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_garrigue")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarriguePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_garrigue_copse")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueTreesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_boulders")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueBouldersReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_cycad_thickets")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGarrigueCycadsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_fern_pasture")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_fern_pasture")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPasturePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFernPastureReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_floodplain_forested")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsFloodplainForestedReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_parkland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoParklandReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ginkgo_woodland")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_ginkgo_woodland")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_lake_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsGinkgoLakesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mire_lakes")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMirePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMireReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsFA);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsReborn);
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops_edge")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsOutcropsRocksReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_redwood_mountains")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_redwood_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsConiferousReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_rough_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsRoughHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks_raised")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_sandbanks_solid")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsRaisedPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsRaisedFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsIslandsRaisedReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_basalt")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_black")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaBeachReborn);
            }
        }
        return MobString;
    }
}
