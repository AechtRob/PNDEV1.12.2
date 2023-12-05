package net.lepidodendron.world.gen;

import net.lepidodendron.block.*;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenFungiSimple extends WorldGenerator
{
	
	public static final PropertyDirection FACING = BlockDirectional.FACING;

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        boolean flag = false;
        Block fungus = BlockFungus1.block;

        int ii = rand.nextInt(13);
        switch (ii) {
            case 0 : default:
                fungus = BlockFungus1.block;
                break;
            case 1 :
                fungus = BlockFungus2.block;
                break;
            case 2 :
                fungus = BlockFungus3.block;
                break;
            case 3 :
                fungus = BlockFungus4.block;
                break;
            case 4 :
                fungus = BlockFungus5.block;
                break;
            case 5 :
                fungus = BlockFungus6.block;
                break;
            case 6 :
                fungus = BlockFungus7.block;
                break;
            case 7 :
                fungus = BlockFungus8.block;
                break;
            case 8 :
                fungus = BlockFungus9.block;
                break;
            case 9 :
                fungus = BlockFungus10.block;
                break;
            case 10 :
                fungus = BlockFungus11.block;
                break;
            case 11 :
                fungus = BlockFungus12.block;
                break;
            case 12 :
                fungus = BlockFungus13.block;
                break;
        }

        for (int i = 0; i < 18; ++i)
        {
            BlockPos blockpos = position.add(rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3), rand.nextInt(3) - rand.nextInt(3));

            if (worldIn.isAirBlock(blockpos) && ((worldIn.getLight(blockpos) > 3) || (worldIn.canSeeSky(blockpos)))
            && (!worldIn.provider.isNether() || blockpos.getY() < 254) && fungus.canPlaceBlockAt(worldIn, blockpos))
			{
				if (fungus.canPlaceBlockOnSide(worldIn, blockpos, EnumFacing.UP)) {
					Functions.setBlockStateAndCheckForDoublePlant(worldIn,blockpos, fungus.getDefaultState().withProperty(FACING, EnumFacing.UP), 2);
					flag = true;
				}
            }
        }

        return flag;
    }
}
