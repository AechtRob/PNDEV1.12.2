package net.lepidodendron.world.gen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenNullTree extends WorldGenAbstractTree
{

    public WorldGenNullTree(boolean notify)
    {
        super(notify);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        return true;
    }
}
