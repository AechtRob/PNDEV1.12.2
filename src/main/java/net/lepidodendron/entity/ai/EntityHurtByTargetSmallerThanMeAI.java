package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class EntityHurtByTargetSmallerThanMeAI extends EntityAITarget
{
    private final boolean entityCallsForHelp;
    private int revengeTimerOld;
    private final Class<?>[] excludedReinforcementTypes;

    public EntityHurtByTargetSmallerThanMeAI(EntityCreature creatureIn, boolean entityCallsForHelpIn, Class<?>... excludedReinforcementTypes)
    {
        super(creatureIn, true);
        this.entityCallsForHelp = entityCallsForHelpIn;
        this.excludedReinforcementTypes = excludedReinforcementTypes;
        this.setMutexBits(1);
    }

    public boolean shouldExecute()
    {

        if (this.taskOwner instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase ee = (EntityPrehistoricFloraLandBase) this.taskOwner;
            if (ee.isSwimmingInWater()) {
                return false;
            }
        }

        int i = this.taskOwner.getRevengeTimer();
        EntityLivingBase entitylivingbase = this.taskOwner.getRevengeTarget();

        if (entitylivingbase != null) { //Eurypterids and fish don't attack players on land:
            if (this.taskOwner instanceof EntityPrehistoricFloraEurypteridBase || this.taskOwner instanceof EntityPrehistoricFloraAgeableFishBase) {
                if (!isInWaterforHunting(entitylivingbase)) {
                    return false;
                }
            }
        }

        if (entitylivingbase != null) {
            if (this.taskOwner.getEntityBoundingBox().getAverageEdgeLength() * 1.25 <= entitylivingbase.getEntityBoundingBox().getAverageEdgeLength()
                && (!(entitylivingbase instanceof EntityPlayer)))
                {
                return false; //mob is physically too big
            }
            if (this.taskOwner.getMaxHealth() * 1.25 <= entitylivingbase.getMaxHealth()
                    && (!(entitylivingbase instanceof EntityPlayer)))
            {
                return false; //mob is conceptually too big
            }
        }

        return i != this.revengeTimerOld && entitylivingbase != null && this.isSuitableTarget(entitylivingbase, false);
    }

    public boolean isInWaterforHunting(Entity entity) {
        BlockPos pos = entity.getPosition();
        if (entity.world.getBlockState(pos).getMaterial() == Material.WATER
                && this.isDirectPathBetweenPoints(this.taskOwner.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5))) {
            return true;
        }
        if (this.taskOwner instanceof EntityPrehistoricFloraAgeableBase) {
            if (entity.isRiding() && ((EntityPrehistoricFloraAgeableBase)this.taskOwner).breaksBoat()) {
                Entity boat = entity.getRidingEntity();
                if (boat instanceof EntityBoat) {
                    pos = boat.getPosition();
                    if (entity.world.getBlockState(pos.down()).getMaterial() == Material.WATER
                            && this.isDirectPathBetweenPoints(this.taskOwner.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() - 0.5, pos.getZ() + 0.5))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.taskOwner.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.taskOwner.getRevengeTarget());
        this.target = this.taskOwner.getAttackTarget();
        this.revengeTimerOld = this.taskOwner.getRevengeTimer();
        this.unseenMemoryTicks = 300;

        if (this.entityCallsForHelp)
        {
            this.alertOthers();
        }

        super.startExecuting();
    }

    protected void alertOthers()
    {
        double d0 = this.getTargetDistance();

        for (EntityCreature entitycreature : this.taskOwner.world.getEntitiesWithinAABB(this.taskOwner.getClass(), (new AxisAlignedBB(this.taskOwner.posX, this.taskOwner.posY, this.taskOwner.posZ, this.taskOwner.posX + 1.0D, this.taskOwner.posY + 1.0D, this.taskOwner.posZ + 1.0D)).grow(d0, 10.0D, d0)))
        {
            if (this.taskOwner != entitycreature && entitycreature.getAttackTarget() == null && (!(this.taskOwner instanceof EntityTameable) || ((EntityTameable)this.taskOwner).getOwner() == ((EntityTameable)entitycreature).getOwner()) && !entitycreature.isOnSameTeam(this.taskOwner.getRevengeTarget()))
            {
                boolean flag = false;

                for (Class<?> oclass : this.excludedReinforcementTypes)
                {
                    if (entitycreature.getClass() == oclass)
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                {
                    this.setEntityAttackTarget(entitycreature, this.taskOwner.getRevengeTarget());
                }
            }
        }
    }

    protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
    {
        creatureIn.setAttackTarget(entityLivingBaseIn);
    }
}
