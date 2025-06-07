package net.lepidodendron.world.gen;

import net.lepidodendron.entity.EntityVolcano;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenVolcanoEruptableNether extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;
        int offset = 8;

        BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), 0, rand.nextInt(offset) - rand.nextInt(offset));

        if (worldIn.getBlockState(blockpos).getMaterial() == Material.LAVA
            && blocksAround(worldIn, position)
            && rand.nextInt(240) == 0)
        {
            EntityVolcano volcanoEntity = new EntityVolcano(worldIn, blockpos);
            worldIn.spawnEntity(volcanoEntity);
            flag = true;
        }
        return flag;
    }

    public static boolean blocksAround(World world, BlockPos pos) {
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                if (world.getBlockState(pos.add(x, 0, z)).getMaterial() != Material.LAVA) {
                    return false;
                }
            }
        }
        return world.isAirBlock(pos.up());
    }

}
