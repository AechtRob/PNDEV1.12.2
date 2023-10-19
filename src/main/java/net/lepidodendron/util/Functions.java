package net.lepidodendron.util;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
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

    public static Vec3d getEntityCentre(Entity entity) {
        double entityX = entity.getEntityBoundingBox().minX + ((entity.getEntityBoundingBox().maxX - entity.getEntityBoundingBox().minX)/2.0D);
        double entityZ = entity.getEntityBoundingBox().minZ + ((entity.getEntityBoundingBox().maxZ - entity.getEntityBoundingBox().minZ)/2.0D);
        return new Vec3d(entityX, entity.getEntityBoundingBox().minY, entityZ);
    }

    public static BlockPos getEntityBlockPos(Entity entity) {
        return new BlockPos(getEntityCentre(entity));
    }

    public static boolean decoLoaded() {
        return true;
    }

}
