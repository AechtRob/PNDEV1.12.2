package net.lepidodendron.world.gen;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.Functions;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nullable;
import java.util.Random;

public class WorldGenNestExtra extends WorldGenerator
{

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return generate(worldIn, rand, position, Functions.getAdjustedSeaLevel(worldIn, position) - 1);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight) {
        return generate(worldIn, rand, position, minHeight, null);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position, int minHeight, @Nullable EntityPrehistoricFloraAgeableBase entitiyIn)
    {
        boolean flag = false;

        BlockPos blockpos = position;

        if (blockpos.getY() >= minHeight && worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < 254) && BlockNest.block.canPlaceBlockAt(worldIn, blockpos))
        {
            Functions.setBlockStateAndCheckForDoublePlant(worldIn, blockpos, BlockNest.block.getDefaultState(), 2);
            if (entitiyIn != null && rand.nextInt(3) != 0) {
                //Place some eggs too:
                TileEntity te = worldIn.getTileEntity(blockpos);
                te.getTileData().setString("creature", entitiyIn.getEntityId(entitiyIn));
                te.getTileData().setBoolean("isMound", entitiyIn.isNestMound());
                ItemStack stack = BlockNest.BlockCustom.getEggItemStack(entitiyIn.getEntityId(entitiyIn));
                stack.setCount(1);
                ((BlockNest.TileEntityNest) te).setInventorySlotContents((int) (0), stack);
            }
            flag = true;
        }

        return flag;
    }
}
