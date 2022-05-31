package net.lepidodendron.block;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

    public interface ISustainsPlantType
    {
        boolean canSustainPlantType(IBlockAccess world, BlockPos pos, EnumPlantType plantType);
    }

