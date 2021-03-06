package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;

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
