package net.lepidodendron.world.gen;

import net.lepidodendron.procedure.ProcedureWorldGenOlive;
import net.lepidodendron.procedure.ProcedureWorldGenOliveDead;
import net.lepidodendron.world.biome.BiomeOliveGrove;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenOliveTreeInGrove extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        //position is the chunk coordinate:
        //iterate over all blocks in the chunk:
        boolean flag = false;
        BlockPos positionTree = position;
        for (int xPos = 8; xPos < 24; xPos++) {
            for (int zPos = 8; zPos < 24; zPos++) {
                positionTree = position.add(xPos, 0, zPos);
                if (positionTree.getX() % 15 == 0 && positionTree.getZ() % 15 == 0 && rand.nextInt(94) != 0
                    && worldIn.getBiome(positionTree) == BiomeOliveGrove.biome) {
                    //Gen a tree here:
                    positionTree = ChunkGenSpawner.getTopSolidBlock(positionTree, worldIn).up();
                    BlockPos down = positionTree.down();
                    IBlockState state = worldIn.getBlockState(down);
                    boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling) Blocks.SAPLING);

                    if (positionTree.getY() >= worldIn.getSeaLevel() - 4 && isSoil && positionTree.getY() < worldIn.getHeight() - 1) {
                        java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
                        $_dependencies.put("x", positionTree.getX());
                        $_dependencies.put("y", positionTree.getY());
                        $_dependencies.put("z", positionTree.getZ());
                        $_dependencies.put("world", worldIn);
                        if (rand.nextInt(40) == 0) {
                            ProcedureWorldGenOliveDead.executeProcedure($_dependencies);
                        }
                        else {
                            ProcedureWorldGenOlive.executeProcedure($_dependencies);
                        }
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

}
