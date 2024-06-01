package net.lepidodendron.entity.ai;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.util.ShoalingHelper;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class ShoalFishAgeableAI extends EntityAIBase {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final double speed;
    private final boolean memory;
    private float followdistance;
    private Path currentPath;
    private Random rand = new Random();


    public ShoalFishAgeableAI(EntityPrehistoricFloraAgeableBase entity, double speed, boolean memory) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.followdistance = 0;
        this.setMutexBits(7);
    }

    public ShoalFishAgeableAI(EntityPrehistoricFloraAgeableBase entity, double speed, boolean memory, float followdistance) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.followdistance = followdistance;
        this.setMutexBits(7);
    }

    @Override
    public boolean shouldExecute() {
        if (!LepidodendronConfig.doShoalingFlocking) {
            return false;
        }
        EntityPrehistoricFloraAgeableBase target = this.entity.getShoalLeader();
        if (target == null || !target.isEntityAlive()) {
            return false;
        }
        if (target == this.entity) {
            return false;
        }
        if (this.entity.getDistance(target) <= this.followdistance ) {
            return false;
        }
        this.currentPath = this.entity.getNavigator().getPathToEntityLiving(target);
        return this.currentPath != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        EntityLivingBase entity = this.entity.getShoalLeader();
        if (rand.nextInt(24) == 0) {
            return false;
        }
        return entity != null && (entity.isEntityAlive() && (!this.memory ? !this.entity.getNavigator().noPath() : this.entity.isWithinHomeDistanceFromPosition(entity.getPosition())));
    }

    @Override
    public void startExecuting() {
        if (this.entity.getControllingPassenger() == null) {
            this.entity.getNavigator().setPath(this.currentPath, this.speed);
        }
    }

    @Override
    public void resetTask() {
        this.entity.getNavigator().clearPath();
    }

    @Override
    public void updateTask() {
        EntityLivingBase target = this.entity.getShoalLeader();
        if (target == null) {
            return;
        }
        if (this.entity.getControllingPassenger() == null) {
            if (rand.nextInt(8) == 0) {
                BlockPos targetPos = getOffsetTarget(this.entity.world, target.getPositionVector());
                if (targetPos != null) {
                    this.entity.getNavigator().tryMoveToXYZ(targetPos.getX() + 0.5, targetPos.getY() + 0.5, targetPos.getZ() + 0.5, this.speed);
                    return;
                }
            }
            this.entity.getNavigator().tryMoveToEntityLiving(target, this.speed);
        }
    }

    @Nullable
    public BlockPos getOffsetTarget(World world, Vec3d vec3d) {
        BlockPos blockpos = new BlockPos(vec3d);
        if (this.entity instanceof EntityPrehistoricFloraAgeableFishBase
            || this.entity instanceof EntityPrehistoricFloraNautiloidBase
            || this.entity instanceof EntityPrehistoricFloraEurypteridBase
        ) {
            blockpos = blockpos.add(rand.nextInt(3) - 1, rand.nextInt(3) - 1, rand.nextInt(3) - 1);
            if (world.isBlockLoaded(blockpos)) {
                if (world.getBlockState(blockpos).getMaterial() == Material.WATER && ShoalingHelper.isDirectPathBetweenPoints(world, this.entity.getPositionVector(), new Vec3d(blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5))) {
                    return blockpos;
                }
            }
        }
        return null;
    }
}