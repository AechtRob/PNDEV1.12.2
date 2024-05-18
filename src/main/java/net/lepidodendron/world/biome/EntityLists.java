package net.lepidodendron.world.biome;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.world.biome.Biome;
import org.apache.commons.lang3.ArrayUtils;

public class EntityLists {

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
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimNeoproterozoicMobsPF);
                }
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_beach")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPrecambrian.dimEdiacaranMobsPF);
                }
            }
        }

        //CAMBRIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_shore")
        ) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianEstuaryMobsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCambrian.dimCambrianReefMobsReborn);
            }
        }

        //ORDOVICIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_icebergs")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_coastal_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_shore_frozen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_beach_frozen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsOceanIceShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianOceanIceMobsShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsAlgalReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBryozoanReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsSpongeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_creek_bog")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsOrdovician.dimOrdovicianMobsBogReborn);
            }
        }

        //SILURIAN:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_shore_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianOceanMobsShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon_helper")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsLagoonReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCoralReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsCrinoidReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_cooksonia")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_silty_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_creek_cooksonia")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsSilurian.dimSilurianMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef_transition")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSinkholeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsDeadReefReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_brackish")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsBrackishReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_forest")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_lycopsid_spinney")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsForestReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_floodplain")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsFloodplainReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_swamp")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_gilboa")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsWattiezaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_creek_meadow")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMeadowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSpringsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsSavannaReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValePF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsValeReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsDevonian.dimDevonianMobsMountainsReborn);
            }
        }

        //CARBONIFEROUS:
        else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanShallowReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_cliff")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanCliffPF);
            }
//                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
//                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanFA);
//                    }
//                    if (LepidodendronConfig.doSpawnsReborn) {
//                        MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsOceanReborn);
//                    }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills_edge")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_hills")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsHillsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_estuary_helper")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_estuary")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsEstuaryReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_marsh")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_marsh")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsMarshReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_fen")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_creek_fen")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsFenFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsIceFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsSwampReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_swamp_burnt")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBurntSwampFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
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
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsBayReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_ash")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns_crater_water")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsCarboniferous.dimCarboniferousMobsTarnsWaterFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
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
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanDeepReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_beach")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean_shore")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_coastal")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsOceanShallowReborn);
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
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")
            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris_foggy")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFrozenPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisLakesReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_craggy")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateForestPF);
            }
            if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisFA);
            }
            if (LepidodendronConfig.doSpawnsReborn) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisReborn);
            }
        } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_temperate_glossopteris")) {
            if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsGlossopterisTemperateWaterMeadowPF);
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_wetlands_hummocks")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsPermian.dimPermianMobsHummocksReborn);
                }
            }

            //TRIASSIC:
            else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanDeepReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_shore")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_beach")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_coastal_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsTriassic.dimTriassicMobsOceanShallowReborn);
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_gondwanan_plain_flat")) {
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_woodland")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_woodland")) {
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
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_creek_coastal_black")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean_reef")) {
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
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_flat")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_mudflats_estuary_helper")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsMudflatsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_forest")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_hills")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_coniferous_mountains")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_coniferous_forest")) {
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_hills")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsAtollsHillsReborn);
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_southern_taiga_forest")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsTaigaForestReborn);
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
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_sandy_white_edge")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsWindsweptReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_roost")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaRimRoostReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_field")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_scrub")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaLandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_creek_desert")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertGulleyReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_helper")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_rim_desert_side")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertRimReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_desert_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsDesertIslandReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek_fog")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsCalderaSwampReborn);
                }
            } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_forested")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_beach_forested_island")) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, SpawnerConfigsJurassic.dimJurassicMobsForestIslandReborn);
                }
            }

        return MobString;
    }
}
