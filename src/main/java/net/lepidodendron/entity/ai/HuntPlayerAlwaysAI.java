package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraEurypteridBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class HuntPlayerAlwaysAI<T extends EntityLivingBase> extends EntityAINearestAttackableTarget {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final int targetChance;


    public HuntPlayerAlwaysAI(EntityPrehistoricFloraAgeableBase entity, Class<T> classTarget, boolean checkSight, Predicate<? super T> targetSelector)
    {
        this(entity, 10, classTarget, checkSight, targetSelector);
    }

    public HuntPlayerAlwaysAI(EntityPrehistoricFloraAgeableBase entity, int chance, Class<T> classTarget, boolean checkSight, Predicate<? super T> targetSelector) {
        super(entity, classTarget, 10, checkSight, true, targetSelector);
        this.entity = entity;
        this.targetChance = chance;
    }

    @Override
    public boolean shouldExecute() {
        if (this.targetChance > 0 && this.taskOwner.getRNG().nextInt(this.targetChance) != 0)
        {
            return false;
        }

        if (!LepidodendronConfig.attackPlayerAlways) {
            //System.err.println(this.entity.getWillAttack());
            return false;
        }
        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase ee = (EntityPrehistoricFloraLandBase) this.entity;
            if (ee.isSwimmingInWater()) {
                return false;
            }
        }

        boolean preliminaryTarget =  super.shouldExecute();

        if (preliminaryTarget && this.targetEntity != null) { //Eurypterids and fish dont attack players on land:
            if (this.entity instanceof EntityPrehistoricFloraEurypteridBase || this.entity instanceof EntityPrehistoricFloraAgeableFishBase) {
                if (!isInWaterforHunting(this.targetEntity)) {
                    return false;
                }
            }
        }

        if (preliminaryTarget) {
            this.entity.setIsFast(true);
        }
        return preliminaryTarget;
    }

    public boolean isInWaterforHunting(Entity entity) {
        BlockPos pos = entity.getPosition();
        if (entity.world.getBlockState(pos).getMaterial() == Material.WATER
                && this.isDirectPathBetweenPoints(this.entity.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5))) {
            return true;
        }
        if (entity.isRiding() && this.entity.breaksBoat()) {
            Entity boat = entity.getRidingEntity();
            if (boat instanceof EntityBoat) {
                pos = boat.getPosition();
                if (entity.world.getBlockState(pos.down()).getMaterial() == Material.WATER
                        && this.isDirectPathBetweenPoints(this.entity.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() - 0.5, pos.getZ() + 0.5))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    @Override
    public void updateTask() {
        if (!this.entity.world.isRemote) {this.entity.selectNavigator();}
        super.updateTask();
        }

}