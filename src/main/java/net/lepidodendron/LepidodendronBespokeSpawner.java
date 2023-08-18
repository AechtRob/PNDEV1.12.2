package net.lepidodendron;

import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class LepidodendronBespokeSpawner {

	@SubscribeEvent
	public void onMobSpawn(PopulateChunkEvent.Populate event) {
        int i = event.getChunkX() * 16;
        int j = event.getChunkZ() * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        World world =  event.getWorld();
        Biome biome = world.getBiome(blockpos.add(16, 0, 16));
		if (event.getType() == PopulateChunkEvent.Populate.EventType.ANIMALS) {
            //System.err.println("Biome: " + biome);
			if (LepidodendronConfig.mobSpawnBespoke.length >= 1) {
                //get bespoke spawns:
                //Assemble the biome string for this biome
                boolean spawn = false;
                String[] bStr;
                int bstrCt = 0;
                String biomeName = biome.getRegistryName().toString();
                //System.err.println("SpawnbiomeName: " + biomeName);
                for (int a = 0; a < LepidodendronConfig.mobSpawnBespoke.length; a++) {
                    String aStr = LepidodendronConfig.mobSpawnBespoke[a].trim();
                    //System.err.println("aStr: " + aStr);
                    //System.err.println("aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName): " + aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName));
                    if (aStr.length() > 0) {
                        if (aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName)) {
                            spawn = true;
                            bstrCt += 1;
                        }
                    }
                }
                if (bstrCt > 0) {
                    //System.err.println("bstrCt: " + bstrCt);
                    bStr = new String[bstrCt];
                    bstrCt = 0;
                    for (int a = 0; a < LepidodendronConfig.mobSpawnBespoke.length; a++) {
                        String aStr = LepidodendronConfig.mobSpawnBespoke[a];
                        if (aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName)) {
                            //System.err.println("aStr.substring(biomeName.length() + 1): " + aStr.substring(biomeName.length() + 1));
                            bstrCt += 1;
                            bStr[bstrCt - 1] = aStr.substring(biomeName.length() + 1);
                            //System.err.println("array: " + bStr[bstrCt - 1]);
                        }
                    }
                    if (spawn) {
                        ChunkGenSpawner.executeProcedure((world.provider.getDimension() == LepidodendronConfig.dimPrecambrian), world, blockpos, event.getRand(), bStr, true);
                    }
                }
            }
		}
	}

    public static void onMobRespawn(World world, BlockPos blockpos) {
        Biome biome = world.getBiome(blockpos.add(16, 0, 16));
        //if (event.getType() == PopulateChunkEvent.Populate.EventType.ANIMALS) {
            //System.err.println("Biome: " + biome);
            if (LepidodendronConfig.mobSpawnBespoke.length >= 1) {
                //get bespoke spawns:
                //Assemble the biome string for this biome
                boolean spawn = false;
                String[] bStr;
                int bstrCt = 0;
                String biomeName = biome.getRegistryName().toString();
                //System.err.println("SpawnbiomeName: " + biomeName);
                for (int a = 0; a < LepidodendronConfig.mobSpawnBespoke.length; a++) {
                    String aStr = LepidodendronConfig.mobSpawnBespoke[a];
                    //System.err.println("aStr: " + aStr);
                    //System.err.println("aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName): " + aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName));
                    if (aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName)) {
                        spawn = true;
                        bstrCt += 1;
                    }
                }
                if (bstrCt > 0) {
                    //System.err.println("bstrCt: " + bstrCt);
                    bStr = new String[bstrCt];
                    bstrCt = 0;
                    for (int a = 0; a < LepidodendronConfig.mobSpawnBespoke.length; a++) {
                        String aStr = LepidodendronConfig.mobSpawnBespoke[a];
                        if (aStr.substring(0, biomeName.length()).equalsIgnoreCase(biomeName)) {
                            //System.err.println("aStr.substring(biomeName.length() + 1): " + aStr.substring(biomeName.length() + 1));
                            bstrCt += 1;
                            bStr[bstrCt - 1] = aStr.substring(biomeName.length() + 1);
                            //System.err.println("array: " + bStr[bstrCt - 1]);
                        }
                    }
                    if (spawn) {
                        ChunkGenSpawner.executeProcedure((world.provider.getDimension() == LepidodendronConfig.dimPrecambrian), world, blockpos, new Random(), bStr, false);
                    }
                }
            }
        //}
    }

}
