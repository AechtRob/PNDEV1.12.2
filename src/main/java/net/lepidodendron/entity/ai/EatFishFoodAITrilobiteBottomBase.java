package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.lepidodendron.item.ItemFishFood;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

import java.util.Comparator;
import java.util.List;

public class EatFishFoodAITrilobiteBottomBase extends EntityAIBase {
    private final EntityPrehistoricFloraTrilobiteBottomBase entity;
    private final ItemsSorter targetSorter;
    private EntityItem targetItem;

    public EatFishFoodAITrilobiteBottomBase(EntityPrehistoricFloraTrilobiteBottomBase entity) {
        super();
        this.entity = entity;
        this.targetSorter = new ItemsSorter(entity);
        this.setMutexBits(1);
    }

    @Override
    public boolean shouldExecute() {
        this.targetItem = this.getNearestItem(16);
        return this.targetItem != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        if (this.targetItem == null || !this.targetItem.isEntityAlive()) {
            return false;
        }
        return true;
    }

    @Override
    public void updateTask() {
        double distance = Math.sqrt(Math.pow(this.entity.posX - this.targetItem.posX, 2.0D) + Math.pow(this.entity.posY - this.targetItem.posY, 2.0D) + Math.pow(this.entity.posZ - this.targetItem.posZ, 2.0D));
        //this.entity.getNavigator().tryMoveToXYZ(this.targetItem.posX, this.targetItem.posY, this.targetItem.posZ, 2D);
        this.entity.getNavigator().tryMoveToXYZ(this.targetItem.posX, this.targetItem.posY, this.targetItem.posZ, 2D);
        if (distance < Math.max(this.entity.getEntityBoundingBox().getAverageEdgeLength(), 1D)) {
            if (this.targetItem != null) {
                this.entity.eatItem(this.targetItem.getItem());
                this.targetItem.getItem().shrink(1);
            }
        }
        if (this.entity.getNavigator().noPath()) {
            resetTask();
        }
    }

    private EntityItem getNearestItem(int range) {
        List<EntityItem> Items = this.entity.world.getEntitiesWithinAABB(EntityItem.class, this.entity.getEntityBoundingBox().grow(range, range, range));
        Items.sort(this.targetSorter);
        for (EntityItem currentItem : Items) {
            if (!currentItem.getItem().isEmpty()) {
                if (currentItem.getItem().isItemEqual(new ItemStack(ItemFishFood.block))
                    && !cantReachItem(currentItem)) {
                    return currentItem;
                }
            }
        }
        return null;
    }

    public boolean cantReachItem(Entity item) {
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