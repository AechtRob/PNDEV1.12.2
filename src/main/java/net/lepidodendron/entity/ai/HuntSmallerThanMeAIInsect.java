package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuropsis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

public class HuntSmallerThanMeAIInsect<T extends EntityLivingBase> extends EntityAINearestAttackableTarget {
    private final EntityPrehistoricFloraInsectFlyingBase entity;

    public HuntSmallerThanMeAIInsect(EntityPrehistoricFloraInsectFlyingBase entity, Class<T> classTarget, boolean checkSight, Predicate<? super T> targetSelector) {
        super(entity, classTarget, 0, checkSight, true, targetSelector);
        this.entity = entity;
    }

    @Override
    public boolean shouldExecute() {
        //System.err.println("Testing AI");
        boolean preliminaryTarget = super.shouldExecute();
        if (this.entity instanceof EntityPrehistoricFloraMeganeuropsis) {
            EntityPrehistoricFloraMeganeuropsis meganeuropsis = (EntityPrehistoricFloraMeganeuropsis) this.entity;
            if (!(meganeuropsis.getWillHunt())) {
                return false;
            }
        }
        if (this.targetEntity != null) {
           if (this.entity.getEntityBoundingBox().getAverageEdgeLength() <= this.targetEntity.getEntityBoundingBox().getAverageEdgeLength()) {
               return false;
            }
        }
        return preliminaryTarget;
    }

}