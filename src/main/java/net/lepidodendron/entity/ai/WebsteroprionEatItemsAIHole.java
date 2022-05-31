package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprionHole;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Comparator;
import java.util.List;

public class WebsteroprionEatItemsAIHole extends EntityAIBase {
    private final EntityPrehistoricFloraWebsteroprionHole entity;
    private final ItemsSorter targetSorter;
    private EntityItem targetItem;

    public WebsteroprionEatItemsAIHole(EntityPrehistoricFloraWebsteroprionHole entity) {
        super();
        this.entity = entity;
        this.targetSorter = new ItemsSorter(entity);
        this.setMutexBits(1);
    }

    @Override
    public boolean shouldExecute() {
        //System.err.println("test run eat!");
        this.targetItem = this.getNearestItem(4);
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
        //System.err.println("running eat!");
        double distance = Math.sqrt(Math.pow(this.entity.posX - this.targetItem.posX, 2.0D) + Math.pow(this.entity.posZ - this.targetItem.posZ, 2.0D));
        //this.entity.getNavigator().tryMoveToXYZ(this.targetItem.posX, this.targetItem.posY, this.targetItem.posZ, 2D);
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
        //System.err.println("Testing: getNearestItem");
        List<EntityItem> Items = this.entity.world.getEntitiesWithinAABB(EntityItem.class, this.entity.getEntityBoundingBox().grow(range, range, range));
        Items.sort(this.targetSorter);
        for (EntityItem currentItem : Items) {
            //System.err.println("Testing: testingItems");
            if (!currentItem.getItem().isEmpty()) {
                //System.err.println("Testing: testingOreDicts");
                if (((OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishraw"), currentItem.getItem()))
                    || (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllfishcooked"), currentItem.getItem()))
                    || (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatraw"), currentItem.getItem()))
                    || (OreDictionary.containsMatch(false, OreDictionary.getOres("listAllmeatcooked"), currentItem.getItem()))
                )
                    //&& !cantReachItem(currentItem)
                ) {
                    return currentItem;
                }
            }
        }
        return null;
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