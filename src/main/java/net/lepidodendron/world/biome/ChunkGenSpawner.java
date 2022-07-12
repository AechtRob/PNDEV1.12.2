package net.lepidodendron.world.biome;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.EntityPrehistoricFloraDiictodon;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.util.EnumBiomeTypeOrdovician;
import net.lepidodendron.util.EnumBiomeTypeSilurian;
import net.lepidodendron.world.biome.cambrian.BiomeCambrianBiome;
import net.lepidodendron.world.biome.cambrian.BiomeCambrianEstuary;
import net.lepidodendron.world.biome.cambrian.BiomeCambrianSea;
import net.lepidodendron.world.biome.carboniferous.*;
import net.lepidodendron.world.biome.devonian.*;
import net.lepidodendron.world.biome.ordovician.*;
import net.lepidodendron.world.biome.permian.*;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrianSea;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.lepidodendron.world.biome.silurian.BiomeSilurianLushPatch;
import net.lepidodendron.world.biome.silurian.BiomeSilurianSea;
import net.lepidodendron.world.biome.silurian.BiomeSilurianSeaGarden;
import net.lepidodendron.world.biome.triassic.*;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
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

    public static void executeProcedure(boolean onlyWater, World world, BlockPos pos, Random rand, @Nullable String[] mobList) {
        executeProcedure(onlyWater, world, pos, rand, mobList, false);
    }

    public static void executeProcedure(boolean onlyWater, World world, BlockPos pos, Random rand, @Nullable String[] mobList, boolean doLightening) {

        String[] MobString = new String[0];
        if (mobList == null) {
            Biome biome = world.getBiome(pos);
            if (biome == BiomePrecambrianSea.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPrecambrianMobsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPrecambrianMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPrecambrianMobsReborn);
                }
            } else if (biome == BiomeCambrianSea.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianMobsReborn);
                }
            } else if (biome == BiomeCambrianBiome.biome || biome == BiomeCambrianEstuary.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCambrianEstuaryMobsReborn);
                }
            } else if (biome == BiomeOrdovicianSea.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsReborn);
                }
            } else if (biome == BiomeOrdovicianSpongeForest.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanSpongePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsSpongeReborn);
                }
            } else if (biome == BiomeOrdovicianSeaIce.biome || biome == BiomeOrdovicianSeaIcebergs.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsOceanIcePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimOrdovicianMobsReborn);
                }
            } else if (biome == BiomeSilurianSea.biome || biome == BiomeSilurianSeaGarden.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsOceanPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsReborn);
                }
            } else if (biome == BiomeSilurianLushPatch.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimSilurianMobsLandPF);
                }
            } else if (biome == BiomeDevonianFloodplain.biome || biome == BiomeDevonianSprings.biome || biome == BiomeDevonianHills.biome || biome == BiomeDevonianGilboa.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsForestReborn);
                }
            } else if (biome == BiomeDevonianSwamp.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampReborn);
                }
            } else if (biome == BiomeDevonianSwamp.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSwampReborn);
                }
            } else if (biome == BiomeDevonianHypersalineSinkhole.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsSinkholeReborn);
                }
            } else if (biome == BiomeDevonianOcean.biome || biome == BiomeDevonianForest.biome || biome == BiomeDevonianOceanDeep.biome || biome == BiomeDevonianSandyBeach.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsOceanReborn);
                }
            } else if (biome == BiomeDevonianOceanDeadReef.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimDevonianMobsDeadReefReborn);
                }
            } else if (biome == BiomeCarboniferousBeach.biome || biome == BiomeCarboniferousOcean.biome || biome == BiomeCarboniferousOceanShore.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanReborn);
                }
            } else if (biome == BiomeCarboniferousOceanCliff.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanCliffPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsOceanReborn);
                }
            } else if (biome == BiomeCarboniferousHills.biome || biome == BiomeCarboniferousHillsEdge.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsHillsReborn);
                }
            } else if (biome == BiomeCarboniferousMarsh.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsMarshReborn);
                }
            } else if (biome == BiomeCarboniferousIce.biome || biome == BiomeCarboniferousIceLakes.biome || biome == BiomeCarboniferousIceLakes.biome || biome == BiomeCarboniferousIceEdge.biome || biome == BiomeCarboniferousIceSpikes.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIcePF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIceFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsIceReborn);
                }
            } else if (biome == BiomeCarboniferousSwamp.biome || biome == BiomeCarboniferousSwampHills.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsSwampReborn);
                }
            } else if (biome == BiomeCarboniferousSwampBurnt.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimCarboniferousMobsBurntSwampReborn);
                }
            } else if (biome == BiomePermianAridHills.biome || biome == BiomePermianAridLands.biome || biome == BiomePermianAridLandsLush.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsAridLandsReborn);
                }
            } else if (biome == BiomePermianBeach.biome || biome == BiomePermianColdGlossopterisBeach.biome || biome == BiomePermianOceanShore.biome || biome == BiomePermianOcean.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanReborn);
                }
            } else if (biome == BiomePermianOceanCliff.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsOceanCliffPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisReborn);
                //}
            } else if (biome == BiomePermianColdGlossopterisForest.biome || biome == BiomePermianColdGlossopterisForestLight.biome || biome == BiomePermianColdGlossopterisForestOcean.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsGlossopterisReborn);
                }
            } else if (biome == BiomePermianDesert.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsDesertReborn);
                }
            } else if (biome == BiomePermianFloodbasalt.biome || biome == BiomePermianFloodbasaltEdge.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsFloodbasaltReborn);
                }
            } else if (biome == BiomePermianHighlands.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsHighlandsReborn);
                }
            } else if (biome == BiomePermianLowlandFloodplain.biome || biome == BiomePermianLowlands.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandsReborn);
                }
            } else if (biome == BiomePermianLowlandsForest.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsLowlandForestReborn);
                }
            } else if (biome == BiomePermianMountains.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsMountainsReborn);
                }
            } else if (biome == BiomePermianRiver.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsRiverReborn);
                }
            } else if (biome == BiomePermianWetlands.biome || biome == BiomePermianWetlandsUnwooded.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsPF);
                }
                if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                }
                if (LepidodendronConfig.doSpawnsReborn) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                }
            } else if (biome == BiomeTriassicOceanShore.biome || biome == BiomeTriassicOcean.biome || biome == BiomeTriassicBeach.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicOceanClamBeds.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsOceanClamBedsPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicRiver.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsRiverPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicXericForest.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericForestPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicXericScrubland.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsXericShrublandPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicWarmLakeland.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsLakelandPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicWarmVolcanicHills.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsVolcanicHillsPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicFloodedForest.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsFloodedForestPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicGondwananForest.biome || biome == BiomeTriassicGondwananForestCrags.biome || biome == BiomeTriassicGondwananForestHills.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCoolForestPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicGondwananPlain.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMossMeadowPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicDesertRocky.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDesertPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicDesertSandy.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsDunesPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicDesertPlateau.biome || biome == BiomeTriassicDesertPlateauBroken.biome || biome == BiomeTriassicDesertPlateauCanyons.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsPlateauPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicCreek.biome || biome == BiomeTriassicRiverbank.biome || biome == BiomeTriassicRiverbankForest.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsCanyonsPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicVolcanicIslands.biome || biome == BiomeTriassicBlackBeach.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsIslandsPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            } else if (biome == BiomeTriassicMountains.biome) {
                if (LepidodendronConfig.doSpawnsPrehistoricFloraDefault) {
                    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimTriassicMobsMountainsPF);
                }
                //if (LepidodendronConfig.doSpawnsFossilsArcheology) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsFA);
                //}
                //if (LepidodendronConfig.doSpawnsReborn) {
                //    MobString = ArrayUtils.addAll(MobString, LepidodendronConfig.dimPermianMobsWetlandsReborn);
                //}
            }
        }
        else {
            MobString = mobList;
        }

        if (MobString != null) {
            if (!(MobString.length >= 1)) {
                return;
            }
        }
        else {
            return;
        }

        //System.err.println("Running");

        String mobToSpawn;
        String nbtStr = "";
        int locationID = 1;
        if (onlyWater) {locationID = 4;}
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

        //System.err.println("spawnerlen " + var3);
        int trySpawn = 0;
        for(int var4 = 0; var4 < var3; ++var4) { //run over every mob to spawn with max of five tries per chunk
            if (trySpawn >= Math.min(Math.max(1, Math.round((double)var3/5D)), 5)) {
                return;
            }
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
                for(int i=checkEntity.length(); i > 0; i--){
                    if(checkEntity.charAt(i - 1) == ':'){
                        strPos2 = i;
                        break;
                    }
                }

                if (strPos2 <= strPos1) {
                    //The position means that something is missing
                    errFound = true;
                }
                else {
                    String locationStr = checkEntity.substring(checkEntity.length()-1, checkEntity.length());
                    if (!(locationStr.equals((String) "1") || locationStr.equals((String) "2") || locationStr.equals((String) "3") || locationStr.equals((String) "4") || locationStr.equals((String) "5") || locationStr.equals((String) "6") || locationStr.equals((String) "7"))) {
                        errFound = true;
                    }
                    else {
                        locationID =  (int) Integer.parseInt(locationStr);

                        //Get the next last bit:
                        strPos3 = 0;
                        String tmpStr = checkEntity.substring(0,checkEntity.length()-2);
                        for(int i=tmpStr.length(); i > 0; i--){
                            if(tmpStr.charAt(i - 1) == ':'){
                                strPos3 = i;
                                break;
                            }
                        }
                        if (strPos3 <= strPos1) {
                            //The position means that something is missing
                            errFound = true;
                        }
                        else {
                            tmpStr = tmpStr.substring(strPos3, tmpStr.length());
                            if (!isNumeric(tmpStr)) {
                                errFound = true;
                            }
                            else {
                                int weight = (int) Integer.parseInt(tmpStr);
                                if (weight < 0 || weight > 100) {
                                    errFound = true;
                                }
                                else {

                                    //Get the next last bit:
                                    strPos5 = 0;
                                    tmpStr = checkEntity.substring(0, strPos3 - 1);
                                    for(int i=tmpStr.length(); i > 0; i--){
                                        if(tmpStr.charAt(i - 1) == ':'){
                                            strPos5 = i;
                                            break;
                                        }
                                    }
                                    if (strPos5 <= strPos1) {
                                        //The position means that something is missing
                                        errFound = true;
                                    }
                                    else {
                                        tmpStr = tmpStr.substring(strPos5, tmpStr.length());
                                        if (!isNumeric(tmpStr)) {
                                            errFound = true;
                                        } else {
                                            int maxSpawn = (int) Integer.parseInt(tmpStr);
                                            if (maxSpawn < 1 || maxSpawn > 20) {
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

                                                    int k7 = rand.nextInt(16) + 8;
                                                    int j11 = rand.nextInt(16) + 8;
                                                    int l14 = world.getHeight(pos.add(k7, 0, j11)).getY() * 2;
                                                    int i2;

                                                    if (l14 > 0) {
                                                        int i18 = rand.nextInt(l14);

                                                        //System.err.println(locationID);
                                                        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                        EntityLiving entity = (EntityLiving) ee.newInstance(world);

                                                        switch (locationID) {

                                                            case 1: //Land
                                                            default:
                                                                //System.err.println("Case: 1");
                                                                //We'll check a block is the biome topblock and that there are at least 4 blocks of non-solid blocks above it:
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;
                                                                    i18 = 0;

                                                                    while (i18 < 4 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        //BlockPos pos1 = world.getTopSolidOrLiquidBlock(new BlockPos(pos.getX() + k7, 0, pos.getZ() + j11));
                                                                        BlockPos pos1 = world.getTopSolidOrLiquidBlock(new BlockPos(pos.getX() + k7, 0, pos.getZ() + j11));
                                                                        if (
                                                                            //(world.getBlockState(pos1.down()).getBlock() == topBlock.getBlock())
                                                                                world.getBlockState(pos1.down()).getBlock().isSideSolid(world.getBlockState(pos1.down()), world, pos1.down(), EnumFacing.UP)
                                                                                        && (world.getBlockState(pos1.down()).getMaterial() != Material.WOOD)
                                                                                        && ((world.isAirBlock(pos1)) || (world.getBlockState(pos1).getMaterial() == Material.PLANTS))
                                                                                        && ((world.isAirBlock(pos1.up())) || (world.getBlockState(pos1.up()).getMaterial() == Material.PLANTS))
                                                                                        && ((world.isAirBlock(pos1.up(2))) || (world.getBlockState(pos1.up(2)).getMaterial() == Material.PLANTS))
                                                                                        && ((world.isAirBlock(pos1.up(3))) || (world.getBlockState(pos1.up(3)).getMaterial() == Material.PLANTS))
                                                                        ) {
                                                                            posCheck = true;
                                                                            //System.err.println("Spawnable " + checkEntity);
                                                                            k7 = pos1.getX() - pos.getX();
                                                                            i18 = pos1.getY() - pos.getY();
                                                                            j11 = pos1.getZ() - pos.getZ();
                                                                        }
                                                                    }
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;

                                                            case 2: //Deep water
                                                                //System.err.println("Case: 2");
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;

                                                                    i18 = 1;
                                                                    while (i18 < 255 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = new BlockPos(pos.getX() + k7, i18, pos.getZ() + j11);
                                                                        //System.err.println("y: " + i18);
                                                                        //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                        //System.err.println("topblock: " + topBlock.getBlock());

                                                                        //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                        Biome biome = world.getBiome(pos1);
                                                                        if (biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                            if (biome == BiomeDevonianOceanDeep.biome || biome == BiomeCarboniferousOcean.biome || biome == BiomePermianOcean.biome || biome == BiomeTriassicOcean.biome) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 40)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
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
                                                                    }
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;

                                                            case 3: //Shallow water
                                                                //System.err.println("Case: 3");
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;

                                                                    i18 = 1;
                                                                    while (i18 < 255 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = new BlockPos(pos.getX() + k7, i18, pos.getZ() + j11);
                                                                        //System.err.println("y: " + i18);
                                                                        //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                        //System.err.println("topblock: " + topBlock.getBlock());
                                                                        //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                        Biome biome = world.getBiome(pos1);
                                                                        if (biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                            if (biome != BiomeDevonianOceanDeep.biome && biome != BiomeCarboniferousOcean.biome && biome != BiomePermianOcean.biome && biome != BiomeTriassicOcean.biome) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 12)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                }
                                                                            } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                    && (world.isAirBlock(pos1.up()) || world.getBlockState(pos1.up()).getMaterial() == Material.ICE)
                                                                                    && (pos1.up(2).getY() >= world.getSeaLevel())
                                                                                    && (world.getBlockState(pos1.down(4)).getMaterial() != Material.WATER)
                                                                            ) {
                                                                                posCheck = true;
                                                                            }
                                                                        }
                                                                        else if (biome instanceof BiomeOrdovician) {
                                                                            BiomeOrdovician biomeOR = (BiomeOrdovician) biome;
                                                                            if (biomeOR.getBiomeType() == EnumBiomeTypeOrdovician.Ocean) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 25)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                    && (world.isAirBlock(pos1.up()) || world.getBlockState(pos1.up()).getMaterial() == Material.ICE)
                                                                                    && (pos1.up(2).getY() >= world.getSeaLevel())
                                                                                    && (world.getBlockState(pos1.down(4)).getMaterial() != Material.WATER)
                                                                            ) {
                                                                                posCheck = true;
                                                                            }
                                                                        }
                                                                        else if (biome instanceof BiomeSilurian) {
                                                                            BiomeSilurian biomeOS = (BiomeSilurian) biome;
                                                                            if (biome == BiomeSilurianLushPatch.biome) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 5)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                }
                                                                            } else if (biomeOS.getBiomeType() == EnumBiomeTypeSilurian.Ocean) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 25)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
                                                                                }
                                                                            } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                    && (world.isAirBlock(pos1.up()) || world.getBlockState(pos1.up()).getMaterial() == Material.ICE)
                                                                                    && (pos1.up(2).getY() >= world.getSeaLevel())
                                                                                    && (world.getBlockState(pos1.down(4)).getMaterial() != Material.WATER)
                                                                            ) {
                                                                                posCheck = true;
                                                                            }
                                                                        }
                                                                        else if (biome == BiomeCambrianSea.biome || biome == BiomeCambrianBiome.biome) {
                                                                            if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                    && (pos1.getY() > world.getSeaLevel() - 50)) {
                                                                                //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                if (entity.height < 0.9) {
                                                                                    posCheck = true;
                                                                                } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                    posCheck = true;
                                                                                }
                                                                            }
                                                                        } else if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                && (world.isAirBlock(pos1.up()) || world.getBlockState(pos1.up()).getMaterial() == Material.ICE)
                                                                                && (pos1.up(2).getY() >= world.getSeaLevel())
                                                                                && (world.getBlockState(pos1.down(4)).getMaterial() != Material.WATER)
                                                                        ) {
                                                                            posCheck = true;
                                                                        }

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
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;

                                                            case 4: //In a 5x5 block of water anywhere under sea-level
                                                                //System.err.println("Case: 4");
                                                                posCheck = false;

                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;

                                                                    i18 = 1;
                                                                    while (i18 < 255 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = new BlockPos(pos.getX() + k7, i18, pos.getZ() + j11);
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
                                                                    }
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;

                                                            case 5: //On leaves
                                                                //System.err.println("Case: 5");
                                                                //We'll check a block is the biome topblock and that there are at least 4 blocks of non-solid blocks above it:
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;
                                                                    i18 = 0;

                                                                    while (i18 < 4 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = getTopSolidOrLiquidBlockIncludingLeaves(new BlockPos(pos.getX() + k7, 0, pos.getZ() + j11), world);
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
                                                                            k7 = pos1.getX() - pos.getX();
                                                                            i18 = pos1.getY() - pos.getY();
                                                                            j11 = pos1.getZ() - pos.getZ();
                                                                        }
                                                                    }

                                                                    i2 = i2 + 1;
                                                                }
                                                                break;

                                                            case 6: //Deep water in the upper parts
                                                                //System.err.println("Case: 6");
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;

                                                                    i18 = 1;
                                                                    while (i18 < 255 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = new BlockPos(pos.getX() + k7, i18, pos.getZ() + j11);
                                                                        //System.err.println("y: " + i18);
                                                                        //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                        //System.err.println("topblock: " + topBlock.getBlock());

                                                                        //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                        Biome biome = world.getBiome(pos1);
                                                                        if (biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                            if (biome == BiomeDevonianOceanDeep.biome || biome == BiomeCarboniferousOcean.biome || biome == BiomePermianOcean.biome || biome == BiomeTriassicOcean.biome) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 40)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
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
                                                                    }
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;



                                                            case 7: //Deep water in the lower parts
                                                                //System.err.println("Case: 7");
                                                                posCheck = false;
                                                                i2 = 0;
                                                                while (i2 < 14 && !posCheck) {
                                                                    k7 = rand.nextInt(16) + 8;
                                                                    j11 = rand.nextInt(16) + 8;

                                                                    i18 = 1;
                                                                    while (i18 < 255 && !posCheck) {
                                                                        i18 = i18 + 1;
                                                                        BlockPos pos1 = new BlockPos(pos.getX() + k7, i18, pos.getZ() + j11);
                                                                        //System.err.println("y: " + i18);
                                                                        //System.err.println("block: " + (worldIn.getBlockState(pos1).getBlock()));
                                                                        //System.err.println("topblock: " + topBlock.getBlock());

                                                                        //First check if we are in an ocean biome with distinct shallow and deep parts:
                                                                        Biome biome = world.getBiome(pos1);
                                                                        if (biome instanceof BiomeDevonian || biome instanceof BiomeCarboniferous || biome instanceof BiomePermian || biome instanceof BiomeTriassic) {
                                                                            if (biome == BiomeDevonianOceanDeep.biome || biome == BiomeCarboniferousOcean.biome || biome == BiomePermianOcean.biome || biome == BiomeTriassicOcean.biome) {
                                                                                if ((world.getBlockState(pos1).getMaterial() == Material.WATER)
                                                                                        && (pos1.getY() > world.getSeaLevel() - 40)) {
                                                                                    //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                                    //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                                    if (entity.height < 0.9) {
                                                                                        posCheck = true;
                                                                                    } else if (world.getBlockState(pos1.up()).getMaterial() == Material.WATER) {
                                                                                        posCheck = true;
                                                                                    }
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

                                                                        if (pos1.getY() > world.getSeaLevel() - 16) {
                                                                            posCheck = false; //If this is too near sea level, deny it: again, simples
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
                                                                    }
                                                                    i2 = i2 + 1;
                                                                }
                                                                break;
                                                        }

                                                        //System.err.println("Poscheck: " + posCheck);
                                                        //System.err.println("errFound: " + errFound);
                                                        if (posCheck && !errFound) {
                                                            //System.err.println("Spawning " + mobToSpawn + " with locationID " + locationID + " at: " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());
                                                            //System.err.println("maxSpawn: " + maxSpawn);
                                                            //System.err.println("weight: " + weight);
                                                            double weighter = 500D;
                                                            if (locationID == 2 || locationID == 6 || locationID == 7) {
                                                                weighter = 800D;
                                                            }
                                                            if (locationID == 1) {
                                                                weighter = 100D;
                                                            }
                                                            trySpawn += 1;
                                                            if ((Math.random() * weighter) <= (double)weight) {
                                                                //System.err.println("Trying......");
                                                                int spawnQty = rand.nextInt(maxSpawn) + 1;
                                                                pos = pos.add(k7, i18, j11);
                                                                //System.err.println("spawnQty: " + spawnQty);
                                                                //Check if an associated block or structure is required:
                                                                //EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(mobToSpawn));
                                                                //EntityLiving entity = (EntityLiving) ee.newInstance(world);
                                                                if (entity instanceof EntityPrehistoricFloraDiictodon) {
                                                                    EntityPrehistoricFloraLandBase EntityLandBase = (EntityPrehistoricFloraLandBase) entity;
                                                                    if (EntityLandBase.hasNest() && (EntityLandBase.homesToNest()) ) {
                                                                        //Spawn a nest and burrow for it:
                                                                        //Buildburrow:
                                                                        pos = EntityPrehistoricFloraDiictodon.buildBurrow(world, pos, ((EntityPrehistoricFloraDiictodon) entity).hasLargeBurrow());
                                                                        world.setBlockState(pos, BlockNest.block.getDefaultState());
                                                                        TileEntity te = world.getTileEntity(pos);
                                                                        if (te != null) {
                                                                            if (te instanceof BlockNest.TileEntityCustom) {
                                                                                te.getTileData().setString("creature", EntityRegistry.getEntry(entity.getClass()).getRegistryName().toString());
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (entity instanceof EntityPrehistoricFloraLandBase) {
                                                                    if (Math.random() > 0.8) { // 1:5 chance of  nest coming too
                                                                        EntityPrehistoricFloraLandBase EntityLandBase = (EntityPrehistoricFloraLandBase) entity;
                                                                        if (EntityLandBase.hasNest()) {
                                                                            //Spawn a nest under the mob:
                                                                           world.setBlockState(pos, BlockNest.block.getDefaultState());
                                                                            TileEntity te = world.getTileEntity(pos);
                                                                            if (te != null) {
                                                                                if (te instanceof BlockNest.TileEntityCustom) {
                                                                                    te.getTileData().setString("creature", EntityRegistry.getEntry(entity.getClass()).getRegistryName().toString());
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (nbtStr == "") {
                                                                    if (entity instanceof EntityPrehistoricFloraAgeableBase && rand.nextInt(20) == 0) {
                                                                        EntityPrehistoricFloraAgeableBase ageableBase = (EntityPrehistoricFloraAgeableBase) entity;
                                                                        int adultAge = ageableBase.getAdultAge();
                                                                        if (adultAge > 0) {
                                                                            int spawnAge = rand.nextInt(adultAge) + 1;
                                                                            nbtStr = "{AgeTicks:" + spawnAge + "}";
                                                                        }
                                                                    }
                                                                    else if (entity instanceof EntityPrehistoricFloraAgeableFishBase && rand.nextInt(20) == 0) {
                                                                        EntityPrehistoricFloraAgeableFishBase ageableBase = (EntityPrehistoricFloraAgeableFishBase) entity;
                                                                        int adultAge = ageableBase.getAdultAge();
                                                                        if (adultAge > 0) {
                                                                            int spawnAge = rand.nextInt(adultAge) + 1;
                                                                            nbtStr = "{AgeTicks:" + spawnAge + "}";
                                                                        }
                                                                    }
                                                                }
                                                                for (int i = 0; i < spawnQty; ++i) {
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

                                                                        }, "pf_summon " + mobToSpawn + " " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " " + nbtStr);
                                                                    }
                                                                    if (doLightening) {
                                                                        world.addWeatherEffect(new EntityLightningBolt(world, (int) pos.getX(), (int) pos.getY(), (int) pos.getZ(), true));
                                                                    }
                                                                    //System.err.println("Spawned at " + pos.add(k7, i18, j11).getX() + " " + pos.add(k7, i18, j11).getY() + " " + pos.add(k7, i18, j11).getZ());

                                                                }
                                                                return; //Stop as we have spawned our group in this chunk now
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
                    }
                }
            }
            if (errFound) {
                System.err.println("Syntax error in mob spawn config: '" + checkEntity + "'!");
            }
        }
    }

    private static Class<? extends Entity> findEntity(String entity) {
        Class<? extends Entity> entityClass;
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
        entityClass = ee == null ? null : ee.getEntityClass();
        if (entityClass == null) {
            System.err.println("Unknown mob requested for spawn: '" + entity + "'!");
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

}
