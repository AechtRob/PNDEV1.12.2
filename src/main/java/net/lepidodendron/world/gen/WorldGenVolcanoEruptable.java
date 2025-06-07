package net.lepidodendron.world.gen;

import net.lepidodendron.entity.EntityVolcano;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenVolcanoEruptable extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;
        int offset = 8;

        BlockPos blockpos = position.add(rand.nextInt(offset) - rand.nextInt(offset), 0, rand.nextInt(offset) - rand.nextInt(offset));
        blockpos = getTopNonAirBlock(blockpos, worldIn);

        if (worldIn.getBlockState(blockpos).getMaterial() == Material.LAVA
            && (!worldIn.provider.isNether() || blockpos.getY() < 254)
            && rand.nextInt(240) == 0)
        {
            EntityVolcano volcanoEntity = new EntityVolcano(worldIn, blockpos);
            worldIn.spawnEntity(volcanoEntity);
            flag = true;
        }
        return flag;
    }

    public static BlockPos getTopNonAirBlock(BlockPos pos, World world)
    {
        Chunk chunk = world.getChunk(pos);
        BlockPos blockpos;
        BlockPos blockpos1;

        for (blockpos = new BlockPos(pos.getX(), chunk.getTopFilledSegment() + 16, pos.getZ()); blockpos.getY() >= 0; blockpos = blockpos1)
        {
            blockpos1 = blockpos.down();

            if (!world.isAirBlock(blockpos1))
            {
                break;
            }
        }

        return blockpos.down();
    }
}
