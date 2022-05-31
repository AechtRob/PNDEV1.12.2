package net.lepidodendron.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class WaterLeapAtTargetAI extends EntityAIBase
{
    EntityLiving leaper;
    EntityLivingBase leapTarget;
    float leapMotionY;

    public WaterLeapAtTargetAI(EntityLiving leapingEntity, float leapMotionYIn)
    {
        this.leaper = leapingEntity;
        this.leapMotionY = leapMotionYIn;
        this.setMutexBits(5);
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public boolean shouldExecute()
    {
        this.leapTarget = this.leaper.getAttackTarget();

        if (this.leapTarget == null)
        {
            return false;
        }
        else {
            if (!this.leapTarget.isInWater()) {
                return false;
            }
            else {
                if (!isDirectPathBetweenPoints(this.leaper, this.leaper.getPositionVector(), this.leapTarget.getPositionVector())) {
                    return false;
                } else {
                    double d0 = this.leaper.getDistanceSq(this.leapTarget);

                    if (d0 >= 4.0D && d0 <= 16.0D) {
                        if (!this.leaper.isInWater()) {
                            return false;
                        } else {
                            return this.leaper.getRNG().nextInt(5) == 0;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
    }

    public boolean shouldContinueExecuting()
    {
        return !this.leaper.isInWater();
    }

    public void startExecuting()
    {
        double d0 = this.leapTarget.posX - this.leaper.posX;
        double d1 = this.leapTarget.posZ - this.leaper.posZ;
        float f = MathHelper.sqrt(d0 * d0 + d1 * d1);

        if ((double)f >= 1.0E-4D)
        {
            this.leaper.motionX += d0 / (double)f * 0.5D * 0.800000011920929D + this.leaper.motionX * 0.20000000298023224D;
            this.leaper.motionZ += d1 / (double)f * 0.5D * 0.800000011920929D + this.leaper.motionZ * 0.20000000298023224D;
        }

        this.leaper.motionY = (double)this.leapMotionY;
    }
}
