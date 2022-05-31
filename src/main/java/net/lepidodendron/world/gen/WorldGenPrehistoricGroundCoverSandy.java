package net.lepidodendron.world.gen;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockPrehistoricGroundCoverPlantsSandy;
import net.lepidodendron.block.BlockPrehistoricGroundSand;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenPrehistoricGroundCoverSandy extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;

        for (int i = 0; i < 100; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (blockpos.getY() >= worldIn.getSeaLevel()-4 && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockPrehistoricGroundCoverPlantsSandy.block.canPlaceBlockAt(worldIn, blockpos))
            {
                //worldIn.setBlockState(blockpos, BlockPrehistoricGroundCoverPlantsSandy.block.getDefaultState(), 2);

                boolean waterCriteria = false;
                int waterDist = LepidodendronConfig.waterSandHorizontal;
                if (waterDist > 16) waterDist = 16;
                if (waterDist < 0) waterDist = 0;

                int waterDown = LepidodendronConfig.waterSandVertical;
                if (waterDown > 6) waterDown = 6;
                if (waterDown < 0) waterDown = 0;

                //Is there water nearby?
                int xct = -waterDist;
                int yct;
                int zct;
                while ((xct <= waterDist) && (!waterCriteria)) {
                    yct = -waterDown;
                    while ((yct <= 1) && (!waterCriteria)) {
                        zct = -waterDist;
                        while ((zct <= waterDist) && (!waterCriteria)) {
                            if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) waterDist,2)) && ((worldIn.getBlockState(new BlockPos(blockpos.getX() + xct, blockpos.getY() + yct, blockpos.getZ() + zct))).getMaterial() == Material.WATER)) {
                                waterCriteria = true;
                            }
                            zct = zct + 1;
                        }
                        yct = yct + 1;
                    }
                    xct = xct + 1;
                }
                if (waterCriteria){
                    worldIn.setBlockState(blockpos, BlockPrehistoricGroundSand.block.getDefaultState(), 2);
                }
                
                flag = true;
            }
        }

        return flag;
    }
}
