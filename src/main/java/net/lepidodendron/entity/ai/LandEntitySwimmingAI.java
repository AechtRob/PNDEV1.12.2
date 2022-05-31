package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class LandEntitySwimmingAI extends EntityAIBase
{
    private final EntityPrehistoricFloraLandBase entity;
    protected boolean mustUpdate;
    protected double speed;
    protected boolean jumpsInWater;

    public LandEntitySwimmingAI(EntityPrehistoricFloraLandBase entityIn, double speedIn, boolean jumpsInWater)
    {
        this.entity = entityIn;
        this.speed = speedIn;
        this.jumpsInWater = jumpsInWater;
        this.setMutexBits(4);

        if (entityIn.getNavigator() instanceof PathNavigateGroundNoWater)
        {
            if (entityIn.getNavigator() instanceof PathNavigateGround) {
                ((PathNavigateGround) entityIn.getNavigator()).setCanSwim(true);
            }
            if (entityIn.getNavigator() instanceof PathNavigateClimber) {
                ((PathNavigateClimber) entityIn.getNavigator()).setCanSwim(true);
            }
        }
    }

    public boolean shouldExecute()
    {
        BlockPos vec3 = this.findTarget();

        if (vec3 != null && (this.entity.isSwimmingInWater() || this.entity.isInLava())) {
            this.entity.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY()) + 0.5D, vec3.getZ() + 0.5D, this.speed);
            this.mustUpdate = false;
            return true;
        }

        return false;
    }

    public void updateTask()
    {
        if (this.jumpsInWater) {
            if (this.entity.getRNG().nextFloat() < 0.8F) {
                if (this.entity.isReallyInWater()) {
                    this.entity.getJumpHelper().setJumping();
                }
            }
        }
    }

    public BlockPos findTarget() {
        BlockPos blockpos1;
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = RandomPositionGenerator.getLandPos(this.entity, 10, 7);
                if (vec3d != null) {
                    blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                    if (!(blockpos1.getY() < 1 || blockpos1.getY() >= 254)) {
                        return blockpos1;
                    }
                }
            }
            Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
            if (vec3d != null) {
                blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                if (!(blockpos1.getY() < 1 || blockpos1.getY() >= 254)) {
                    return blockpos1;
                }
            }
        }
        return null;
    }
}
