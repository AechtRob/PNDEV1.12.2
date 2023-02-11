package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.EntityPrehistoricFloraDiictodon;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.cambrian.BiomeCambrian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.ordovician.BiomeOrdovician;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ChunkGenSpawner extends ElementsLepidodendronMod.ModElement {
    public ChunkGenSpawner(ElementsLepidodendronMod instance) {
        super(instance, 42);
    }

    public static void executeProcedure(boolean onlyWater, World world, BlockPos pos, Random rand, @Nullable String[] mobList, boolean worldGen) {

        double spawnDensity = LepidodendronConfig.spawnerDensity;
        if (spawnDensity < 0.0) {
            spawnDensity = 0.0;
        }
        if (spawnDensity > 100.0) {
            spawnDensity = 100.0;
        }

        int spawnerCycle = 0;
        int spawnCounter = 0;
        while (spawnerCycle < (int)Math.ceil((10D * spawnDensity))) {
            BlockPos spawnPos = pos.add(16, 0, 16); //move to the centre of the 2x2 of chunks we are populating
            spawnPos = spawnPos.add(rand.nextInt(16) - 8, 0, rand.nextInt(16) - 8); //Pick a random coordinate around

            //Get mob list and pick a mob for this biome:
            boolean TriassicCanyons = false;
            String[] MobString = new String[0];
            if (mobList == null) {
                //Biome biome = world.getBiome(pos.add(16, 0, 16)); //move to the centre of the 2x2 of chunks we are populating so the biome is more "likely" to be right
                Biome biome = world.getBiome(spawnPos);
                //System.err.println("chunkSpawn " + world.getChunk(pos).x + " " + world.getChunk(pos).z + " biome: " + biome.getBiomeName());
                if (biome instanceof BiomePrecambrian) {
                    if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimHadeanMobsPF);
                        }
                    }
                //} else if (biome instanceof BiomePrecambrian) {
                    else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimArcheanMobsPF);
                        }
                    }
                //} else if (biome instanceof BiomePrecambrian) {
                    else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic) {
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPaleoproterozoicMobsPF);
                        }
                    }
                //} else if (biome instanceof BiomePrecambrian) {
                    else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic) {
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimMesoproterozoicMobsPF);
                        }
                    }
                //} else if (biome instanceof BiomePrecambrian) {
                    else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Neoproterozoic) {
                        if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                            MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimNeoproterozoicMobsPF);
                        }
                    }
                }

               if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_sea")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_trench")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_frondose_forest")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_beach")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ediacaran_extreme_hills")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimEdiacaranMobsPF);
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_estuary")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea_reefs")) {
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_lagoon")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_algal_reef")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsAlgalReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bryozoan_reef")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsBryozoanReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sponge_forest")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongePF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_bog")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lagoon")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_coral")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCoralReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_reef")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReefReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_garden")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsCrinoidReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_lush_patch")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_reef")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hypersaline_sinkhole")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholePF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeReborn);
                    }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_dead_reef")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefReborn);
                    }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_brackish")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_hills")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_floodplain")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_swamp")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_gilboa")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_meadow")
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSpringsReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_savanna")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSavannaReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_vale")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValePF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValeFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsValeReborn);
                   }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_mountains")) {
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
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean_cliff")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanCliffPF);
                    }
                    if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanFA);
                    }
                    if (LepidodendronConfig.doSpawnsReborn) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanReborn);
                    }
               }
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_hills")
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
               else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_hills")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_arid_lands_lush")
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
                } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_light")
                       || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris_copse")
                       || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_temperate_glossopteris")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest_ocean")
                        || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris")) {
                    if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                        MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisPF);
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
                    TriassicCanyons = true;
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
               } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_river")
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
               } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_garrigue")
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
               } else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops_edge")
                       || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_outcrops")) {
                   if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsOutcropsReborn);
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
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsAtollsPF);
                   }
                   if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsAtollsFA);
                   }
                   if (LepidodendronConfig.doSpawnsReborn) {
                       MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimJurassicMobsAtollsReborn);
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
            } else {
                MobString = mobList;
            }

            if (MobString != null) {
                if (!(MobString.length >= 1)) {
                    break;
                }
            } else {
                break;
            }

            //System.err.println("Running");

            String mobToSpawn;
            String nbtStr = "";
            int locationID = 1;
            if (onlyWater) {
                locationID = 4;
            }
            boolean errFound;
            boolean posCheck;
            int strPos1;
            int strPos2;
            int strPos3;
            int strPos4;
            int strPos5;

            String[] var2 = MobString;
            //Shuffle the string so we pick a random mob later:
            List<String> list = Arrays.asList(var2);
            Collections.shuffle(list);
            list.toArray(var2);

            int var3 = var2.length;
            if (!(var3 >= 1)) { //No valid mobs here so move onto another blockPos to try
                break;
            }

            int var4 = rand.nextInt(var3); //Pick a mob from the list
            errFound = false;
            String checkEntity = var2[var4].trim();
            if (onlyWater) {
                checkEntity = var2[var4].trim() + ":4";
            }

            strPos1 = 0;
            strPos2 = 0;
            strPos3 = 0;
            strPos4 = 0;
            strPos5 = 0;
            nbtStr = "";

            strPos1 = checkEntity.indexOf(":");
            if (!(strPos1 > 0)) {
                errFound = true;
            }
            else {
                String modid = checkEntity.substring(0, strPos1);

                //Get the last two bits, first the rightmost colon:
                for (int i = checkEntity.length(); i > 0; i--) {
                    if (checkEntity.charAt(i - 1) == ':') {
                        strPos2 = i;
                        break;
                    }
                }

                if (strPos2 <= strPos1) {
                    //The position means that something is missing
                    errFound = true;
                } else {
                    String locationStr = checkEntity.substring(checkEntity.length() - 1, checkEntity.length());
                    if (!(locationStr.equals((String) "1") || locationStr.equals((String) "2") || locationStr.equals((String) "3") || locationStr.equals((String) "4") || locationStr.equals((String) "5") || locationStr.equals((String) "6") || locationStr.equals((String) "7") || locationStr.equals((String) "8"))) {
                        errFound = true;
                    } else {
                        locationID = (int) Integer.parseInt(locationStr);

                        //Get the next last bit:
                        strPos3 = 0;
                        String tmpStr = checkEntity.substring(0, checkEntity.length() - 2);
                        for (int i = tmpStr.length(); i > 0; i--) {
                            if (tmpStr.charAt(i - 1) == ':') {
                                strPos3 = i;
                                break;
                            }
                        }
                        if (strPos3 <= strPos1) {
                            //The position means that something is missing
                            errFound = true;
                        } else {
                            tmpStr = tmpStr.substring(strPos3, tmpStr.length());
                            if (!isNumeric(tmpStr)) {
                                errFound = true;
                            } else {
                                int weight = (int) Integer.parseInt(tmpStr);
                                if (weight < -100 || weight > 100) {
                                    errFound = true;
                                } else {

                                    //Get the next last bit:
                                    strPos5 = 0;
                                    tmpStr = checkEntity.substring(0, strPos3 - 1);
                                    for (int i = tmpStr.length(); i > 0; i--) {
                                        if (tmpStr.charAt(i - 1) == ':') {
                                            strPos5 = i;
                                            break;
                                        }
                                    }
                                    if (strPos5 <= strPos1) {
                                        //The position means that something is missing
                                        errFound = true;
                                    } else {
                                        tmpStr = tmpStr.substring(strPos5, tmpStr.length());
                                        if (!isNumeric(tmpStr)) {
                                            errFound = true;
                                        } else {
                                            int maxSpawn = (int) Integer.parseInt(tmpStr);
                                            if (maxSpawn < 0 || maxSpawn > 20) {
                                                errFound = true;
                                            }

                                            //Everything left is the mod plus nbt (which may be wrong of course!)
                                            else { //Get the mob:

                                                mobToSpawn = checkEntity.substring(0, strPos5 - 1);
                                                //Is there nbt?
                                                strPos4 = 0;
                                                strPos4 = mobToSpawn.indexOf("{");
                                                if (strPos4 > 0) {
                                                    //we have nbt:
                                                    nbtStr = mobToSpawn.substring(strPos4, mobToSpawn.length());
                                                    mobToSpawn = mobToSpawn.substring(0, strPos4);
                                                }

                                                if (findEntity(mobToSpawn) != null) {
                                                    //Spawn routine (finally!)
                                                    int i2;
                                                    int i18 = 0;
                                                    posCheck = false;

                                                    //System.err.println(mobToSpawn + " in ID " + locationID);
                                                    EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                    EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                    int offsetter = 0;

                                                    switch (locationID) {

                                                        case 1: //Land (or land near water)
                                                        case 8:
                                                        default:
                                                            offsetter = 2; //Trying to help avoid spawning into cliffsides :/
                                                            //System.err.println("Case: 1");
                                                            //We'll check a block is the biome topblock and that there are at least 4 blocks of non-solid blocks above it:
                                                            BlockPos pos1 = world.getTopSolidOrLiquidBlock(new BlockPos(spawnPos.getX(), 0, spawnPos.getZ()));
                                                            //pos1 = world.getTopSolidOrLiquidBlock(new BlockPos(pos.getX() + k7, 0, pos.getZ() + j11));
                                                            if (
                                                                    world.getBlockState(pos1.down()).getBlock().isSideSolid(world.getBlockState(pos1.down()), world, pos1.down(), EnumFacing.UP)
                                                                            && (world.getBlockState(pos1.down()).getMaterial() != Material.WOOD)
                                                                            && ((world.isAirBlock(pos1)) || (world.getBlockState(pos1).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up())) || (world.getBlockState(pos1.up()).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up(2))) || (world.getBlockState(pos1.up(2)).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up(3))) || (world.getBlockState(pos1.up(3)).getMaterial() == Material.PLANTS))
                                                            ) {
                                                                if (locationID == 1) {
                                                                    posCheck = true;
                                                                    //System.err.println("Spawnable " + checkEntity);
                                                                    spawnPos = pos1;
                                                                }
                                                                else if (locationID == 8) {
                                                                    //Check for water:
                                                                    boolean waterCriteria = false;
                                                                    int i = pos1.getX();
                                                                    int j = pos1.getY();
                                                                    int k = pos1.getZ();
                                                                    //Is there water nearby?
                                                                    int xct = -3;
                                                                    int yct;
                                                                    int zct;
                                                                    while ((xct < 4) && (!waterCriteria)) {
                                                                        yct = -2;
                                                                        while ((yct <= 0) && (!waterCriteria)) {
                                                                            zct = -3;
                                                                            while ((zct < 4) && (!waterCriteria)) {
                                                                                if ((world.getBlockState(new BlockPos(i + xct, j + yct, k + zct))).getMaterial() == Material.WATER) {
                                                                                    waterCriteria = true;
                                                                                }
                                                                                zct = zct + 1;
                                                                            }
                                                                            yct = yct + 1;
                                                                        }
                                                                        xct = xct + 1;
                                                                    }
                                                                    if (waterCriteria) {
                                                                        posCheck = true;
                                                                        //System.err.println("Spawnable " + checkEntity);
                                                                        spawnPos = pos1;
                                                                    }
                                                                }
                                                            }
                                                            break;

                                                        case 2: //Deep water
                                                            //System.err.println("Case: 2");
                                                            posCheck = false;

                                                            pos1 = getTopSolidBlock(spawnPos, world).up();
                                                            if (world.getBlockState(pos1).getMaterial() == Material.WATER) {
                                                                //System.err.println("y: " + i18);
                                                                //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                //System.err.println("topblock: " + topBlock.getBlock());

                                                                //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                Biome biome = world.getBiome(pos1);
                                                                if (biome instanceof BiomeCambrian || biome instanceof BiomeOrdovician || biome instanceof BiomeSilurian || biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic || biome instanceof BiomeJurassic) {
                                                                    boolean isOcean = false;
                                                                    if (biome instanceof BiomeCambrian) {
                                                                        if (((BiomeCambrian) biome).getBiomeType() == EnumBiomeTypeCambrian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeOrdovician) {
                                                                        if (((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.Ocean
                                                                            || ((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.FrozenOcean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeSilurian) {
                                                                        if (((BiomeSilurian) biome).getBiomeType() == EnumBiomeTypeSilurian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeDevonian) {
                                                                        if (((BiomeDevonian) biome).getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeCarboniferous) {
                                                                        if (((BiomeCarboniferous) biome).getBiomeType() == EnumBiomeTypeCarboniferous.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomePermian) {
                                                                        if (((BiomePermian) biome).getBiomeType() == EnumBiomeTypePermian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeTriassic) {
                                                                        if (((BiomeTriassic) biome).getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeJurassic) {
                                                                        if (((BiomeJurassic) biome).getBiomeType() == EnumBiomeTypeJurassic.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (isOcean) { //Test if we are in a deep ocean biome:
                                                                        if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")) {
                                                                            //if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                            //        && (pos1.getY() > world.getSeaLevel() - 40)) {
                                                                                //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                float entityHeight = entity.height;
                                                                                if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                                    entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                                }
                                                                                if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                                    posCheck = true;
                                                                                } else if (entityHeight < 1.9) {
                                                                                    if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                                    posCheck = true;
                                                                                }
                                                                            //}
                                                                        } else {
                                                                            posCheck = false;
                                                                        }
                                                                    } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up()).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(3)).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(4)).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(5)).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(6)).getMaterial() == Material.WATER)
                                                                    ) {
                                                                        posCheck = true;
                                                                    }
                                                                } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up()).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(3)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(4)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(5)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(6)).getMaterial() == Material.WATER)
                                                                ) {
                                                                    posCheck = true;
                                                                }

                                                                //Set a position in the water column:
                                                                pos1 = pos1.add(0, rand.nextInt(6), 0);

                                                                int xx = -4;
                                                                while (xx <= 4 && posCheck) {
                                                                    int zz = -4;
                                                                    while (zz <= 4 && posCheck) {
                                                                        if (world.getBlockState(pos1.add(xx, 0, zz)).getMaterial() != Material.WATER) {
                                                                            posCheck = false;
                                                                        }
                                                                        zz = zz + 1;
                                                                    }
                                                                    xx = xx + 1;
                                                                }
                                                                spawnPos = pos1;
                                                            }
                                                            break;

                                                        case 3: //Shallow water
                                                            //System.err.println("Case: 3");
                                                            posCheck = false;

                                                            pos1 = getTopSolidBlock(spawnPos, world).up();
                                                            if (world.getBlockState(pos1).getMaterial() == Material.WATER) {
                                                                //System.err.println("y: " + i18);
                                                                //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                //System.err.println("topblock: " + topBlock.getBlock());
                                                                //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                Biome biome = world.getBiome(pos1);
                                                                if (biome instanceof BiomeCambrian || biome instanceof BiomeOrdovician || biome instanceof BiomeSilurian || biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic || biome instanceof BiomeJurassic) {
                                                                    boolean isOcean = false;
                                                                    if (biome instanceof BiomeCambrian) {
                                                                        if (((BiomeCambrian) biome).getBiomeType() == EnumBiomeTypeCambrian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeOrdovician) {
                                                                        if (((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.Ocean
                                                                                || ((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.FrozenOcean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeSilurian) {
                                                                        if (((BiomeSilurian) biome).getBiomeType() == EnumBiomeTypeSilurian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeDevonian) {
                                                                        if (((BiomeDevonian) biome).getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeCarboniferous) {
                                                                        if (((BiomeCarboniferous) biome).getBiomeType() == EnumBiomeTypeCarboniferous.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomePermian) {
                                                                        if (((BiomePermian) biome).getBiomeType() == EnumBiomeTypePermian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeTriassic) {
                                                                        if (((BiomeTriassic) biome).getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (isOcean) {
                                                                        if ((!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean"))
                                                                                && (!biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean"))) {
                                                                            //We are in the shallow ocean biomes:
                                                                            float entityHeight = entity.height;
                                                                            if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                                entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                            }
                                                                            if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                                posCheck = true;
                                                                            } else if (entityHeight < 1.9) {
                                                                                if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                    posCheck = true;
                                                                                }
                                                                            } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                                posCheck = true;
                                                                            }
                                                                            //This is OK to spawn here at the sea floor with enough headroom
                                                                        } else {
                                                                            posCheck = false; //This is deep ocean so we dont spawn here
                                                                        }
                                                                    } else { //Is there a column of water above us no more than 6 blocks deep?
                                                                        if (world.isAirBlock(pos1.up(6))
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.ICE
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.PACKED_ICE
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.VINE
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.LEAVES
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.PLANTS
                                                                                || world.getBlockState(pos1.up(6)).getMaterial() == Material.WEB) {
                                                                            posCheck = true;
                                                                        }

                                                                        //Get a position in the water column:
                                                                        if (posCheck) {
                                                                            posCheck = false; //final checks
                                                                            float entityHeight = entity.height;
                                                                            if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                                entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                            }
                                                                            if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                                posCheck = true; //These are fine in a single block deep
                                                                            } else if (entityHeight < 1.9) {
                                                                                if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                    posCheck = true; //These are fine in a double block deep
                                                                                }
                                                                            } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                                posCheck = true; //Else require triple block deep
                                                                            }
                                                                        }
                                                                    }
                                                                } else { //Is there a column of water above us no more than 6 blocks deep?
                                                                    if (world.isAirBlock(pos1.up(6))
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.ICE
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.PACKED_ICE
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.VINE
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.LEAVES
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.PLANTS
                                                                            || world.getBlockState(pos1.up(6)).getMaterial() == Material.WEB) {
                                                                        posCheck = true;
                                                                    }

                                                                    //Get a position in the water column:
                                                                    if (posCheck) {
                                                                        posCheck = false; //final checks
                                                                        float entityHeight = entity.height;
                                                                        if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                            entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                        }
                                                                        if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                            posCheck = true; //These are fine in a single block deep
                                                                        } else if (entityHeight < 1.9) {
                                                                            if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                posCheck = true; //These are fine in a double block deep
                                                                            }
                                                                        } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                            posCheck = true; //Else require triple block deep
                                                                        }
                                                                    }
                                                                }

                                                                //Finally validate it's not just a tiny puddle:
                                                                int xx = -1;
                                                                while (xx <= 1 && posCheck) {
                                                                    int zz = -1;
                                                                    while (zz <= 1 && posCheck) {
                                                                        if (world.getBlockState(pos1.add(xx, 0, zz)).getMaterial() != Material.WATER) {
                                                                            posCheck = false;
                                                                        }
                                                                        zz = zz + 1;
                                                                    }
                                                                    xx = xx + 1;
                                                                }
                                                            }
                                                            spawnPos = pos1;
                                                            break;

                                                        case 4: //In a 5x5 block of water anywhere under sea-level
                                                            //System.err.println("Case: 4");
                                                            posCheck = false;

                                                            i18 = 0;
                                                            while (i18 < 255 && !posCheck) {
                                                                i18 = i18 + 1;
                                                                pos1 = new BlockPos(spawnPos.getX(), i18, spawnPos.getZ());
                                                                //System.err.println("y: " + i18);
                                                                //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                //System.err.println("topblock: " + topBlock.getBlock());
                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up()).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.down()).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.down(2)).getMaterial() == Material.WATER)
                                                                        && (pos1.getY() < (world.getSeaLevel() - 2))
                                                                ) {
                                                                    posCheck = true;
                                                                }
                                                                int xx = -2;
                                                                while (xx <= 2 && posCheck) {
                                                                    int zz = -2;
                                                                    while (zz <= 2 && posCheck) {
                                                                        if (world.getBlockState(pos1.add(xx, 0, zz)).getMaterial() != Material.WATER) {
                                                                            posCheck = false;
                                                                        }
                                                                        zz = zz + 1;
                                                                    }
                                                                    xx = xx + 1;
                                                                }
                                                                spawnPos = pos1;
                                                            }
                                                            break;

                                                        case 5: //On leaves
                                                            //System.err.println("Case: 5");
                                                            //We'll check a block is the biome topblock and that there are at least 4 blocks of non-solid blocks above it:
                                                            posCheck = false;

                                                            pos1 = getTopSolidOrLiquidBlockIncludingLeaves(new BlockPos(spawnPos.getX(), 0, spawnPos.getZ()), world);
                                                            IBlockState spawnBlock = world.getBlockState(pos1.down());
                                                            if (
                                                                    (
                                                                            (spawnBlock.getBlock() instanceof BlockLeaves
                                                                                    && spawnBlock.getBlock().isFullCube(spawnBlock))
                                                                    )
                                                                            && ((world.isAirBlock(pos1)) || (world.getBlockState(pos1).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up())) || (world.getBlockState(pos1.up()).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up(2))) || (world.getBlockState(pos1.up(2)).getMaterial() == Material.PLANTS))
                                                                            && ((world.isAirBlock(pos1.up(3))) || (world.getBlockState(pos1.up(3)).getMaterial() == Material.PLANTS))
                                                            ) {
                                                                posCheck = true;
                                                                //System.err.println("Spawnable " + checkEntity);
                                                                spawnPos = pos1;
                                                            }
                                                            break;

                                                        case 6: //Deep water in the upper parts
                                                            //System.err.println("Case: 6");
                                                            posCheck = false;

                                                            i18 = 0;
                                                            while (i18 < 255 && !posCheck) {
                                                                i18 = i18 + 1;
                                                                pos1 = new BlockPos(spawnPos.getX(), i18, spawnPos.getZ());
                                                                //System.err.println("pos1: " + pos1);
                                                                //System.err.println("block: " + (world.getBlockState(pos1).getBlock()));

                                                                //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                Biome biome = world.getBiome(pos1);
                                                                if (biome instanceof BiomeCambrian || biome instanceof BiomeOrdovician || biome instanceof BiomeSilurian || biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                    boolean isOcean = false;
                                                                    if (biome instanceof BiomeCambrian) {
                                                                        if (((BiomeCambrian) biome).getBiomeType() == EnumBiomeTypeCambrian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeOrdovician) {
                                                                        if (((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.Ocean
                                                                                || ((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.FrozenOcean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeSilurian) {
                                                                        if (((BiomeSilurian) biome).getBiomeType() == EnumBiomeTypeSilurian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeDevonian) {
                                                                        if (((BiomeDevonian) biome).getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeCarboniferous) {
                                                                        if (((BiomeCarboniferous) biome).getBiomeType() == EnumBiomeTypeCarboniferous.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomePermian) {
                                                                        if (((BiomePermian) biome).getBiomeType() == EnumBiomeTypePermian.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeTriassic) {
                                                                        if (((BiomeTriassic) biome).getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (biome instanceof BiomeJurassic) {
                                                                        if (((BiomeJurassic) biome).getBiomeType() == EnumBiomeTypeJurassic.Ocean) {
                                                                            isOcean = true;
                                                                        }
                                                                    }
                                                                    if (isOcean) { //Test if we are in a deep ocean biome:
                                                                        if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")
                                                                                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")) {
                                                                            if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                    && (pos1.getY() > world.getSeaLevel() - 40)) {
                                                                                //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                float entityHeight = entity.height;
                                                                                if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                                    entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                                }
                                                                                if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                        || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                                    posCheck = true;
                                                                                } else if (entityHeight < 1.9) {
                                                                                    if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                                    posCheck = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            posCheck = false;
                                                                        }
                                                                    } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                            && (world.isAirBlock(pos1.up(3)) || world.getBlockState(pos1.up(3)).getMaterial() == Material.ICE)
                                                                            && (world.getBlockState(pos1.up()).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.down()).getMaterial() == Material.WATER)
                                                                            && (world.getBlockState(pos1.down(2)).getMaterial() == Material.WATER)
                                                                    ) {
                                                                        posCheck = true;
                                                                    }
                                                                } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                        && (world.isAirBlock(pos1.up(3)) || world.getBlockState(pos1.up(3)).getMaterial() == Material.ICE)
                                                                        && (world.getBlockState(pos1.up()).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.down()).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.down(2)).getMaterial() == Material.WATER)
                                                                ) {
                                                                    posCheck = true;
                                                                }

                                                                if (pos1.getY() < world.getSeaLevel() - 8) {
                                                                    posCheck = false; //If this is well below sea level then deny it, simples
                                                                }

                                                                int xx = -4;
                                                                while (xx <= 4 && posCheck) {
                                                                    int zz = -4;
                                                                    while (zz <= 4 && posCheck) {
                                                                        if (world.getBlockState(pos1.add(xx, 0, zz)).getMaterial() != Material.WATER) {
                                                                            posCheck = false;
                                                                        }
                                                                        zz = zz + 1;
                                                                    }
                                                                    xx = xx + 1;
                                                                }

                                                                //System.err.println("posCheck: " + posCheck);
                                                                spawnPos = pos1;
                                                            }
                                                            break;


                                                        case 7: //Deep water in the lower parts
                                                            posCheck = false;
                                                            pos1 = (getTopSolidBlock(spawnPos, world)).up();
                                                            //System.err.println("y: " + i18);
                                                            //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                            //System.err.println("topblock: " + topBlock.getBlock());

                                                            //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                            Biome biome = world.getBiome(pos1);
                                                            if (biome instanceof BiomeCambrian || biome instanceof BiomeOrdovician || biome instanceof BiomeSilurian || biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                boolean isOcean = false;
                                                                if (biome instanceof BiomeCambrian) {
                                                                    if (((BiomeCambrian) biome).getBiomeType() == EnumBiomeTypeCambrian.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeOrdovician) {
                                                                    if (((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.Ocean
                                                                            || ((BiomeOrdovician) biome).getBiomeType() == EnumBiomeTypeOrdovician.FrozenOcean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeSilurian) {
                                                                    if (((BiomeSilurian) biome).getBiomeType() == EnumBiomeTypeSilurian.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeDevonian) {
                                                                    if (((BiomeDevonian) biome).getBiomeType() == EnumBiomeTypeDevonian.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeCarboniferous) {
                                                                    if (((BiomeCarboniferous) biome).getBiomeType() == EnumBiomeTypeCarboniferous.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomePermian) {
                                                                    if (((BiomePermian) biome).getBiomeType() == EnumBiomeTypePermian.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeTriassic) {
                                                                    if (((BiomeTriassic) biome).getBiomeType() == EnumBiomeTypeTriassic.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (biome instanceof BiomeJurassic) {
                                                                    if (((BiomeJurassic) biome).getBiomeType() == EnumBiomeTypeJurassic.Ocean) {
                                                                        isOcean = true;
                                                                    }
                                                                }
                                                                if (isOcean) { //Test if we are in a deep ocean biome:
                                                                    if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cambrian_sea")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:ordovician_sea_ice")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:silurian_sea_sandy")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_ocean_deep_rocky")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_ocean")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_ocean")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:triassic_ocean")
                                                                            || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_ocean")) {
                                                                        if ((world.getBlockState(pos1).getMaterial() == Material.WATER))
                                                                        //&& (pos1.getY() > world.getSeaLevel() - 40))
                                                                        {
                                                                            //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                            //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                            float entityHeight = entity.height;
                                                                            if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                                entityHeight = ((EntityPrehistoricFloraAgeableBase) entity).maxHeight;
                                                                            }
                                                                            if (entityHeight < 0.9 || (entity instanceof EntityPrehistoricFloraAmphibianBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraFishBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraSlitheringWaterBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase)
                                                                                    || (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase)) {
                                                                                posCheck = true;
                                                                            } else if (entityHeight < 1.9) {
                                                                                if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                    posCheck = true;
                                                                                }
                                                                            } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER && world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER) {
                                                                                posCheck = true;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        posCheck = false; //By definition we are not in the deep oceans
                                                                    }
                                                                } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(3)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(4)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(5)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(6)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(7)).getMaterial() == Material.WATER)
                                                                        && (world.getBlockState(pos1.up(8)).getMaterial() == Material.WATER)
                                                                ) {
                                                                    posCheck = true;
                                                                }
                                                            } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(2)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(3)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(4)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(5)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(6)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(7)).getMaterial() == Material.WATER)
                                                                    && (world.getBlockState(pos1.up(8)).getMaterial() == Material.WATER)
                                                            ) {
                                                                posCheck = true;
                                                            }

                                                            int xx = -4;
                                                            while (xx <= 4 && posCheck) {
                                                                int zz = -4;
                                                                while (zz <= 4 && posCheck) {
                                                                    if (world.getBlockState(pos1.add(xx, 0, zz)).getMaterial() != Material.WATER) {
                                                                        posCheck = false;
                                                                    }
                                                                    zz = zz + 1;
                                                                }
                                                                xx = xx + 1;
                                                            }
                                                            spawnPos = pos1;

                                                            break;
                                                    }

                                                    //System.err.println("LocationID: " + locationID);
                                                    //System.err.println("Poscheck: " + posCheck);
                                                    //System.err.println("errFound: " + errFound);
                                                    if (posCheck && !errFound) {
                                                        //System.err.println("Spawning " + mobToSpawn + " with locationID " + locationID + " at: " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());
                                                        //System.err.println("maxSpawn: " + maxSpawn);

                                                        boolean rare = (weight < 0);
                                                        weight = Math.abs(weight);

                                                        //System.err.println("weight: " + weight);
                                                        //System.err.println("rare: " + rare);

                                                        double weighter = 500D;
                                                        if (locationID == 2) { //Sea
                                                            weighter = 800D;
                                                        }
                                                        if (locationID == 1 | locationID == 6 || locationID == 7) { //Land and thin sea layers more common
                                                            weighter = 100D;
                                                        }

                                                        //trySpawn += 1;

                                                        //Deal with rare spawns:
                                                        if (rare) {
                                                            weighter = weighter * 2;
                                                            if (rand.nextInt(2) == 0) {
                                                                break;
                                                            }
                                                        }

                                                        if ((Math.random() * weighter) <= (double) weight) {
                                                            //System.err.println("Trying......");
                                                            int spawnQty = 0;
                                                            if (maxSpawn >= 1) {
                                                                spawnQty = rand.nextInt(maxSpawn) + 1;
                                                            }
                                                            if (entity instanceof EntityPrehistoricFloraAgeableBase) {
                                                                if (((EntityPrehistoricFloraAgeableBase)entity).canShoal() && maxSpawn == 0) {
                                                                    int halfShoal = (int)Math.round((double)(((EntityPrehistoricFloraAgeableBase)entity).getShoalSize())/2D);
                                                                    int remainingShoal = ((EntityPrehistoricFloraAgeableBase)entity).getShoalSize() - halfShoal;
                                                                    spawnQty = Math.max(1, halfShoal + rand.nextInt(remainingShoal + 1));
                                                                }
                                                            }
                                                            if (entity instanceof EntityPrehistoricFloraFishBase) {
                                                                if (((EntityPrehistoricFloraFishBase)entity).canShoal() && maxSpawn == 0) {
                                                                    int halfShoal = (int)Math.round((double)(((EntityPrehistoricFloraFishBase)entity).getShoalSize())/2D);
                                                                    int remainingShoal = ((EntityPrehistoricFloraFishBase)entity).getShoalSize() - halfShoal;
                                                                    spawnQty = Math.max(1, halfShoal + rand.nextInt(remainingShoal + 1));
                                                                }
                                                            }
                                                            if (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
                                                                if (((EntityPrehistoricFloraTrilobiteBottomBase)entity).canShoal() && maxSpawn == 0) {
                                                                    int halfShoal = (int)Math.round((double)(((EntityPrehistoricFloraTrilobiteBottomBase)entity).getShoalSize())/2D);
                                                                    int remainingShoal = ((EntityPrehistoricFloraTrilobiteBottomBase)entity).getShoalSize() - halfShoal;
                                                                    spawnQty = Math.max(1, halfShoal + rand.nextInt(remainingShoal + 1));
                                                                }
                                                            }
                                                            //System.err.println("spawnQty: " + spawnQty);
                                                            //Check if an associated block or structure is required:
                                                            //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                            //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                            if (entity instanceof EntityPrehistoricFloraDiictodon) {
                                                                EntityPrehistoricFloraLandBase EntityLandBase = (EntityPrehistoricFloraLandBase) entity;
                                                                if (EntityLandBase.hasNest() && (EntityLandBase.homesToNest() && worldGen)) {
                                                                    //Spawn a nest and burrow for it:
                                                                    //Buildburrow:
                                                                    BlockPos pos1 = EntityPrehistoricFloraDiictodon.buildBurrow(world, spawnPos, ((EntityPrehistoricFloraDiictodon) entity).hasLargeBurrow());
                                                                    if (rand.nextInt(3) == 0) {
                                                                        spawnPos = pos1; //Spawn sometimes at the nest burrow and sometime inside
                                                                    }
                                                                    world.setBlockState(pos1, BlockNest.block.getDefaultState());
                                                                    TileEntity te = world.getTileEntity(pos1);
                                                                    if (te != null) {
                                                                        if (te instanceof BlockNest.TileEntityNest) {
                                                                            te.getTileData().setString("creature", EntityRegistry.getEntry(entity.getClass()).getRegistryName().toString());
                                                                        }
                                                                    }
                                                                }
                                                            } else if (entity instanceof EntityPrehistoricFloraLandBase && worldGen) {
                                                                if (Math.random() > 0.8) { // 1:5 chance of nest coming too
                                                                    EntityPrehistoricFloraLandBase EntityLandBase = (EntityPrehistoricFloraLandBase) entity;
                                                                    if (EntityLandBase.hasNest()) {
                                                                        if (!EntityLandBase.isNestMound()) {
                                                                            //Spawn a nest under the mob:
                                                                            world.setBlockState(spawnPos, BlockNest.block.getDefaultState());
                                                                            TileEntity te = world.getTileEntity(spawnPos);
                                                                            if (te != null) {
                                                                                if (te instanceof BlockNest.TileEntityNest) {
                                                                                    te.getTileData().setString("creature", EntityRegistry.getEntry(entity.getClass()).getRegistryName().toString());
                                                                                    te.getTileData().setBoolean("isMound", EntityLandBase.isNestMound());
                                                                                    if (Math.random() > 0.75) { // 1:4 chance of nest containing eggs
                                                                                        te.getTileData().setString("egg", EntityLandBase.getEggNBT());
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else { //Mound nests:
                                                                            if (EntityLandBase.nestBlockMatch(world, spawnPos)) {
                                                                                world.setBlockState(spawnPos, BlockNest.block.getDefaultState());
                                                                                TileEntity te = world.getTileEntity(spawnPos);
                                                                                if (te != null) {
                                                                                    if (te instanceof BlockNest.TileEntityNest) {
                                                                                        te.getTileData().setString("creature", EntityRegistry.getEntry(entity.getClass()).getRegistryName().toString());
                                                                                        te.getTileData().setBoolean("isMound", EntityLandBase.isNestMound());
                                                                                        // Mounds always contain eggs:
                                                                                        te.getTileData().setString("egg", EntityLandBase.getEggNBT());
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            boolean doAgeVar = false;
                                                            if (nbtStr == "") {
                                                                doAgeVar = true;
                                                            }

                                                            if (!(TriassicCanyons && spawnPos.getY() > 70)) {
                                                                for (int i = 0; i < spawnQty; ++i) {
                                                                    if (entity instanceof EntityPrehistoricFloraAgeableBase && rand.nextInt(20) == 0 && doAgeVar) {
                                                                        EntityPrehistoricFloraAgeableBase ageableBase = (EntityPrehistoricFloraAgeableBase) entity;
                                                                        int adultAge = ageableBase.getAdultAge();
                                                                        if (adultAge > 0) {
                                                                            int spawnAge = rand.nextInt(adultAge) + 1;
                                                                            nbtStr = "{AgeTicks:" + spawnAge + "}";
                                                                        }
                                                                    }
                                                                    else if (entity instanceof EntityPrehistoricFloraAgeableFishBase && rand.nextInt(20) == 0 && doAgeVar) {
                                                                        EntityPrehistoricFloraAgeableFishBase ageableBase = (EntityPrehistoricFloraAgeableFishBase) entity;
                                                                        int adultAge = ageableBase.getAdultAge();
                                                                        if (adultAge > 0) {
                                                                            int spawnAge = rand.nextInt(adultAge) + 1;
                                                                            nbtStr = "{AgeTicks:" + spawnAge + "}";
                                                                        }
                                                                    }
                                                                    else if (mobToSpawn.startsWith("fossil:")) {
                                                                        nbtStr = "{Gender:" + rand.nextInt(2) + "}";
                                                                    }
                                                                    //Spawn the mob via a command:
                                                                    if (!world.isRemote && world.getMinecraftServer() != null) {
                                                                        //System.err.println("summon " + mobToSpawn + " " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ() + " " + nbtStr);
                                                                        world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
                                                                            @Override
                                                                            public String getName() {
                                                                                return "";
                                                                            }

                                                                            @Override
                                                                            public boolean canUseCommand(int permission, String command) {
                                                                                return true;
                                                                            }

                                                                            @Override
                                                                            public World getEntityWorld() {
                                                                                return world;
                                                                            }

                                                                            @Override
                                                                            public MinecraftServer getServer() {
                                                                                return world.getMinecraftServer();
                                                                            }

                                                                            @Override
                                                                            public boolean sendCommandFeedback() {
                                                                                return false;
                                                                            }

                                                                        }, "pf_summon " + mobToSpawn + " " + spawnPos.getX() + " " + (spawnPos.getY() + offsetter) + " " + spawnPos.getZ() + " " + nbtStr);
                                                                    }

                                                                    //System.err.println("Spawned in " + world.getBiome(spawnPos).getBiomeName() + " at locID " + locationID + " " + mobToSpawn + " at " + spawnPos.getX() + " " + (spawnPos.getY() + 1) + " " + spawnPos.getZ());
                                                                }
                                                                spawnCounter ++;
                                                            }
                                                            if (spawnCounter > (int)Math.ceil((3D * spawnDensity))) {
                                                                //System.err.println("spawnCounter " + spawnCounter);
                                                                return; //Stop as we have spawned (or binned) our group in this chunk now
                                                            }
                                                        }
                                                        //System.err.println("Failed rarity test " + mobToSpawn);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
                if (errFound) {
                    System.err.println("Syntax error in mob spawn config: '" + checkEntity + "'!");
                }
            }
            spawnerCycle += 1;
        }
    }

    private static Class<? extends Entity> findEntity(String entity) {
        Class<? extends Entity> entityClass;
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
        entityClass = ee == null ? null : ee.getEntityClass();
        if (entityClass == null) {
            //System.err.println("Unknown mob requested for spawn: '" + entity + "'!");
            return null;
        }
        return entityClass;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static BlockPos getTopSolidOrLiquidBlockIncludingLeaves(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos;
        BlockPos blockpos1;

        for (blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ()); blockpos.getY() >= 0; blockpos = blockpos1)
        {
            blockpos1 = blockpos.down();
            IBlockState state = chunk.getBlockState(blockpos1);

            if (state.getMaterial().blocksMovement())
            {
                break;
            }
        }

        return blockpos;
    }

    public static BlockPos getTopSolidBlock(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ());
        BlockPos blockpos1 = blockpos;
        int yy = blockpos.getY();
        while (yy > 0)
        {
            blockpos1 = new BlockPos(pos.getX(), yy, pos.getZ());
            IBlockState state = world.getBlockState(blockpos1);

            if (state.getMaterial().blocksMovement()
                    && state.getMaterial() != Material.WATER
                    && state.getMaterial() != Material.LEAVES
                    && state.getMaterial() != Material.VINE
                    && state.getMaterial() != Material.PLANTS)
            {
                break;
            }
            yy --;
        }

        return blockpos1;
    }

}
