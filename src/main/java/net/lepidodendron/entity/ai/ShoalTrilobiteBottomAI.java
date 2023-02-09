package net.lepidodendron.entity.ai;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.Path;

import java.util.Random;

public class ShoalTrilobiteBottomAI extends EntityAIBase {
    private final EntityPrehistoricFloraTrilobiteBottomBase entity;
    private final double speed;
    private final boolean memory;
    private Path currentPath;
    private Random rand = new Random();

    public ShoalTrilobiteBottomAI(EntityPrehistoricFloraTrilobiteBottomBase entity, double speed, boolean memory) {
        this.entity = entity;
        this.speed = speed;
        this.memory = memory;
        this.setMutexBits(7);
    }

    @Override
    public boolean shouldExecute() {
        if (!LepidodendronConfig.doShoalingFlocking) {
            return false;
        }
        EntityPrehistoricFloraTrilobiteBottomBase target = this.entity.getShoalLeader();
        if (target == null || !target.isEntityAlive()) {
            return false;
        }
        if (target == this.entity) {
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
            this.entity.getNavigator().tryMoveToEntityLiving(target, this.speed);
        }
    }
}