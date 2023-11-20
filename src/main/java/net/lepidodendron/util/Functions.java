package net.lepidodendron.util;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fluids.BlockFluidBase;

import javax.annotation.Nullable;
import java.util.List;

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

    /** A function which doesn't use an iterator, to avoid concurrent modification bugs:
     *
     * @param worldIn
     * @param clazz
     * @param aabb
     * @param filter
     * @return
     * @param <T>
     */
    public static <T extends Entity> List<T> getEntitiesWithinAABBPN(World worldIn, Class <? extends T > clazz, AxisAlignedBB aabb, @Nullable Predicate<? super T > filter)
    {
        int j2 = MathHelper.floor((aabb.minX - World.MAX_ENTITY_RADIUS) / 16.0D);
        int k2 = MathHelper.ceil((aabb.maxX + World.MAX_ENTITY_RADIUS) / 16.0D);
        int l2 = MathHelper.floor((aabb.minZ - World.MAX_ENTITY_RADIUS) / 16.0D);
        int i3 = MathHelper.ceil((aabb.maxZ + World.MAX_ENTITY_RADIUS) / 16.0D);
        List<T> list = Lists.<T>newArrayList();

        for (int j3 = j2; j3 < k2; ++j3)
        {
            for (int k3 = l2; k3 < i3; ++k3)
            {
                if (worldIn.isBlockLoaded(new BlockPos(j3*16, 0, k3*16), true))
                {
                    getEntitiesOfTypeWithinAABBPN(worldIn.getChunk(j3, k3), clazz, aabb, list, filter);
                }
            }
        }

        return list;
    }

    public static <T extends Entity> void getEntitiesOfTypeWithinAABBPN(Chunk chunk, Class <? extends T > entityClass, AxisAlignedBB aabb, List<T> listToFill, Predicate <? super T > filter)
    {
        int i = MathHelper.floor((aabb.minY - World.MAX_ENTITY_RADIUS) / 16.0D);
        int j = MathHelper.floor((aabb.maxY + World.MAX_ENTITY_RADIUS) / 16.0D);
        i = MathHelper.clamp(i, 0, chunk.getEntityLists().length - 1);
        j = MathHelper.clamp(j, 0, chunk.getEntityLists().length - 1);

        for (int k = i; k <= j; ++k) {
            if (chunk.getEntityLists()[k].getByClass(entityClass) != null) {
                List<T> listEntity = ImmutableList.copyOf(chunk.getEntityLists()[k].getByClass(entityClass));
                for (int ii = 0; ii < listEntity.size(); ii++) {
                    T t = listEntity.get(ii);
                    if (t.getEntityBoundingBox().intersects(aabb) && (filter == null || filter.apply(t))) {
                        listToFill.add(t);
                    }
                }
            }
        }
    }

    public static void setBlockStateAndCheckForDoublePlant(World worldIn, BlockPos pos, IBlockState state, int flags) {
        if (worldIn.getBlockState(pos).getBlock() instanceof BlockDoublePlant) {
            if (worldIn.getBlockState(pos.up()).getBlock() instanceof BlockDoublePlant) {
                if (worldIn.getBlockState(pos).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.LOWER
                        && worldIn.getBlockState(pos.up()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER) {
                    worldIn.setBlockToAir(pos.up());
                }
            }
            if (worldIn.getBlockState(pos.down()).getBlock() instanceof BlockDoublePlant) {
                if (worldIn.getBlockState(pos).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
                        && worldIn.getBlockState(pos.down()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.LOWER) {
                    worldIn.setBlockToAir(pos.down());
                }
            }
        }
        worldIn.setBlockState(pos, state, flags);
    }

    public static void setBlockStateAndCheckForDoublePlant(World worldIn, BlockPos pos, IBlockState state) {
        setBlockStateAndCheckForDoublePlant(worldIn, pos, state, 3);
    }

    public static boolean decoLoaded() {
        return true;
    }


}
