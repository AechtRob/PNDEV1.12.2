package net.lepidodendron.world.gen;

import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenIcebergs extends WorldGenerator {
    //private final Block block;
    private final int startRadius;

    public WorldGenIcebergs() {
        super(false);
        //this.block = blockIn;
        this.startRadius = (int) Math.round(Math.random() * 2);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, false);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, boolean onLand) {

        if (rand.nextInt(64) != 0 ) {
            return false;
        }

        int count = rand.nextInt(1) + 1;
        int i2 = position.getX();
        int k2 = position.getZ();
        for (int a = 0; a < count; a++) {
            int ii = i2 + rand.nextInt(16) + 8;
            int kk = k2 + rand.nextInt(16) + 8;
            int height = Functions.getAdjustedSeaLevel(worldIn, position) + 1;
            while (height >= Functions.getAdjustedSeaLevel(worldIn, position) - 1) {
                if (
                        (!worldIn.isAirBlock(new BlockPos(ii, height, kk)))
                )
                    break;
                height--;
            }

            int jj = height;

            if (worldIn.isRemote ||
                    (worldIn.getBlockState(new BlockPos(ii, jj, kk)).getMaterial() != Material.WATER
                        && worldIn.getBlockState(new BlockPos(ii, jj, kk)).getMaterial() != Material.ICE && !onLand))
                return false;

            BlockPos startpos = new BlockPos(ii, jj, kk);

            int i1 = 3 + rand.nextInt(10);

            for (int i = 0; i1 >= 0 && i < 3; ++i) {
                int j = i1 + rand.nextInt(2);
                int k = i1 + rand.nextInt(2);
                int l = i1 + rand.nextInt(2);
                float f = (float) (j + k + l) * 0.333F + 0.5F;

                for (BlockPos blockpos : BlockPos.getAllInBox(startpos.add(-j, -k, -l), startpos.add(j, k, l))) {
                    if (blockpos.distanceSq(startpos) <= (double) (f * f)) {
                        Block blockIn = Blocks.SNOW;
                        if (Math.random() > 0.65) {
                            blockIn = Blocks.PACKED_ICE;
                        }
                        if (Math.random() > 0.85) {
                            blockIn = Blocks.SNOW;
                        }
                        if (Math.random() > 0.85) {
                            blockIn = Blocks.PACKED_ICE;
                        }
                        if (blockpos.getY() <= Functions.getAdjustedSeaLevel(worldIn, blockpos)) {
                            blockIn = Blocks.PACKED_ICE;
                        }
                        Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, blockIn.getDefaultState(), 2);
                    }
                }

                startpos = startpos.add(-(i1 + 1) + rand.nextInt(2 + i1 * 2), 0 - rand.nextInt(2), -(i1 + 1) + rand.nextInt(2 + i1 * 2));
            }
            return true;
        }
        return false;
    }
}