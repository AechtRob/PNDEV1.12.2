package net.lepidodendron.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;

public class Functions {

    public static boolean isWater(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        return ((block instanceof BlockFluidBase || block instanceof BlockLiquid)
           && state.getMaterial() == Material.WATER
        );
    }
}
