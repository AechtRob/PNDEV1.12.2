package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.minecraft.block.material.Material;
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
        Vec3d vec3 = this.findTarget();

        if (vec3 != null && (this.entity.isSwimmingInWater() || this.entity.isInLava())) {
//            double Xoffset = this.entity.posX - this.entity.getPosition().getX();
//            double Zoffset = this.entity.posZ - this.entity.getPosition().getZ();

            this.entity.getNavigator().tryMoveToXYZ(vec3.x, vec3.y, vec3.z, this.speed);
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

    public Vec3d findTarget() {
        Vec3d blockpos1;
        if (this.entity.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = RandomPositionGenerator.getLandPos(this.entity, 10, 7);
                vec3d = new Vec3d(vec3d.x, Math.floor(vec3d.y), vec3d.z);
                if (vec3d != null) {
                    //blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                    if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                        return vec3d;
                    }
                }
            }
            Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
            if (vec3d != null) {
                //blockpos1 = new Blo(vec3d.x, vec3d.y, vec3d.z);
                //Get the top layer if this is water:
                if (this.entity.world.getBlockState(new BlockPos(vec3d)).getMaterial() == Material.WATER) {
//                    blockpos1 = new BlockPos(new BlockPos(blockpos1).getX(), this.entity.getPosition().getY(), new BlockPos(blockpos1).getZ());
//                }
                    if (!(vec3d.y < 1 || vec3d.y >= 254)) {
                        return vec3d;
                    }
                }
            }
        }
        return null;
    }
}
