package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.util.PathNavigateGroundNoDeepWater;
import net.lepidodendron.util.Functions;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Comparator;
import java.util.List;

public class EatItemsEntityPrehistoricFloraAgeableBaseAI extends EntityAIBase {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final ItemsSorter targetSorter;
    private EntityItem targetItem;
    private double speed;

    public EatItemsEntityPrehistoricFloraAgeableBaseAI(EntityPrehistoricFloraAgeableBase entity, double speedIn) {
        super();
        this.entity = entity;
        this.speed = speedIn;
        this.targetSorter = new ItemsSorter(entity);
        this.setMutexBits(1);
    }

    @Override
    public void resetTask()
    {
        this.entity.setEatTarget(null);
        this.targetItem = null;
    }

    @Override
    public boolean shouldExecute() {
        if (this.entity.getHealth() <= 0) {
            return false;
        }

        if (entity.isAnimationDirectionLocked(this.entity.getAnimation())) {
            return false;
        }

        this.targetItem = this.getNearestItem(16);
        return this.targetItem != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        if (entity.isAnimationDirectionLocked(entity.getAnimation())) {
            entity.getNavigator().clearPath();
            return false;
        }

        if (this.targetItem == null || !this.targetItem.isEntityAlive()) {
            return false;
        }
        return true;
    }

    @Override
    public void updateTask() {
        double distance = Math.sqrt(Math.pow(this.entity.posX - this.targetItem.posX, 2.0D) + Math.pow((this.entity.posY - this.targetItem.posY)/2D, 2.0D)  + Math.pow(this.entity.posZ - this.targetItem.posZ, 2.0D));
        this.entity.setEatTarget(this.targetItem);
        this.entity.getNavigator().tryMoveToXYZ(this.targetItem.posX, this.targetItem.posY, this.targetItem.posZ, this.speed);
        //if (distance < Math.max(this.entity.getEntityBoundingBox().getAverageEdgeLength(), 1D)) {
        if (distance < Math.max(1.0F, this.entity.getEntityBoundingBox().getAverageEdgeLength())) {
            if (this.targetItem != null && !this.targetItem.cannotPickup()) {
                this.entity.setEatTarget(null);
                this.entity.eatItem(this.targetItem.getItem());
                this.targetItem.getItem().shrink(1);
                this.targetItem.setPickupDelay(10);
            }
        }
        //A helper for things flying above their targets:
//        if (this.entity instanceof EntityPrehistoricFloraAgeableFlyingBase) {
//            if (distance < Math.max(this.entity.maxHeight, this.entity.getEntityBoundingBox().getAverageEdgeLength()) && this.entity.getPosition() == this.targetItem.getPosition().up()) {
//                if (this.targetItem != null && !this.targetItem.cannotPickup()) {
//                    this.entity.setEatTarget(null);
//                    this.entity.eatItem(this.targetItem.getItem());
//                    this.targetItem.getItem().shrink(1);
//                    this.targetItem.setPickupDelay(10);
//                }
//            }
//        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingBase) {
            if (distance < Math.max(this.entity.maxHeight, this.entity.getEntityBoundingBox().getAverageEdgeLength()) && this.entity.getPosition() == this.targetItem.getPosition().up()) {
                if (this.targetItem != null && !this.targetItem.cannotPickup()) {
                    this.entity.setEatTarget(null);
                    this.entity.eatItem(this.targetItem.getItem());
                    this.targetItem.getItem().shrink(1);
                    this.targetItem.setPickupDelay(10);
                }
            }
        }
        if (this.entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
            if (distance < Math.max(this.entity.maxHeight, this.entity.getEntityBoundingBox().getAverageEdgeLength()) && this.entity.getPosition() == this.targetItem.getPosition().up()) {
                if (this.targetItem != null && !this.targetItem.cannotPickup()) {
                    this.entity.setEatTarget(null);
                    this.entity.eatItem(this.targetItem.getItem());
                    this.targetItem.getItem().shrink(1);
                    this.targetItem.setPickupDelay(10);
                }
            }
        }
        if (this.entity.getNavigator().noPath()) {
            resetTask();
        }
    }

    private EntityItem getNearestItem(int range) {
        String[] oreDictList = this.entity.getFoodOreDicts();
        List<EntityItem> Items = Functions.getEntitiesWithinAABBPN(this.entity.world, EntityItem.class, this.entity.getEntityBoundingBox().grow(range, range, range), EntitySelectors.NOT_SPECTATING);
        Items.sort(this.targetSorter);
        for (EntityItem currentItem : Items) {
            if (!currentItem.getItem().isEmpty()) {
                for (String oreDict : oreDictList) {
                    if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), currentItem.getItem())
                        && !cantReachItem(currentItem)) {
                        return currentItem;
                    }
                }
            }
        }
        return null;
    }

    public boolean cantReachItem(Entity item) {
        if (this.entity instanceof EntityPrehistoricFloraLandWadingBase) {
            if (item.isInWater() && (PathNavigateGroundNoDeepWater.isTooDeep(this.entity.world, item.getPosition()))) {
                return true;
            }
        }
        else if (this.entity instanceof EntityPrehistoricFloraLandBase && (!(this.entity instanceof EntityPrehistoricFloraLandWadingBase))) {
            if (item.isInWater()) {
                return true;
            }
        }
        RayTraceResult rayTrace = this.entity.world.rayTraceBlocks(this.entity.getPositionVector().add(0, this.entity.height / 2, 0), item.getPositionVector().add(0, item.height / 2, 0), false);
        if (rayTrace != null && rayTrace.hitVec != null) {
            BlockPos sidePos = rayTrace.getBlockPos();
            BlockPos pos = new BlockPos(rayTrace.hitVec);
            if (!this.entity.world.isAirBlock(pos) || !this.entity.world.isAirBlock(sidePos)) {
                return true;
            } else {
                return rayTrace.typeOfHit != RayTraceResult.Type.MISS;
            }
        }
        return false;
    }

    public class ItemsSorter implements Comparator<Entity> {
        private final Entity e;

        public ItemsSorter(Entity entity) {
            this.e = entity;
        }

        @Override
        public int compare(Entity entity1, Entity entity2) {
            double distance1 = this.e.getDistanceSq(entity1);
            double distance2 = this.e.getDistanceSq(entity2);
            return Double.compare(distance1, distance2);
        }
    }
}