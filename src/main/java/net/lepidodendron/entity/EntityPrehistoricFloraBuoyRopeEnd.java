
package net.lepidodendron.entity;

import net.lepidodendron.block.BlockTrapWater;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraBuoyRopeEnd extends EntityLeashKnot {

    public EntityPrehistoricFloraBuoyRopeEnd(World worldIn)
    {
        super(worldIn);
    }

    public EntityPrehistoricFloraBuoyRopeEnd(World world, BlockPos pos) {
        super(world, pos);
        this.setPosition((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D);
        float f = 0.125F;
        float f1 = 0.1875F;
        float f2 = 0.25F;
        this.setEntityBoundingBox(new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX, this.posY, this.posZ));
        this.forceSpawn = true;
    }

    public static EntityPrehistoricFloraBuoyRopeEnd createKnot(World worldIn, BlockPos pos)
    {
        EntityPrehistoricFloraBuoyRopeEnd entityleashknot = new EntityPrehistoricFloraBuoyRopeEnd(worldIn, pos);
        worldIn.spawnEntity(entityleashknot);
        entityleashknot.playPlaceSound();
        return entityleashknot;
    }

    @Override
    public boolean onValidSurface()
    {
        return this.world.getBlockState(this.hangingPosition).getBlock() == BlockTrapWater.block;
    }

    @Nullable
    public static EntityPrehistoricFloraBuoyRopeEnd getKnotForPosition(World worldIn, BlockPos pos)
    {
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();

        for (EntityPrehistoricFloraBuoyRopeEnd entityleashknot : worldIn.getEntitiesWithinAABB(EntityPrehistoricFloraBuoyRopeEnd.class, new AxisAlignedBB((double)i - 1.0D, (double)j - 1.0D, (double)k - 1.0D, (double)i + 1.0D, (double)j + 1.0D, (double)k + 1.0D)))
        {
            if (entityleashknot.getHangingPosition().equals(pos))
            {
                return entityleashknot;
            }
        }

        return null;
    }
}
