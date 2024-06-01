package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.util.PathNavigateGroundNoDeepWater;
import net.lepidodendron.util.Functions;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HuntForDietEntityPrehistoricFloraAgeableBaseAI<T extends EntityLivingBase> extends EntityAINearestAttackableTarget {
    private final EntityPrehistoricFloraAgeableBase entity;
    private final double minSize;
    private final double maxSize;
    private final boolean cannibal;

    public HuntForDietEntityPrehistoricFloraAgeableBaseAI(EntityPrehistoricFloraAgeableBase entity, Class<T> classTarget, boolean checkSight, Predicate<? super T> targetSelector, double minSizeFraction, double maxSizeFraction, boolean cannibal) {
        super(entity, classTarget, 0, checkSight, true, targetSelector);
        this.entity = entity;
        this.minSize = minSizeFraction;
        this.maxSize = maxSizeFraction;
        this.cannibal  = cannibal;
        this.setMutexBits(1);
    }

    @Override
    public boolean shouldExecute() {

        boolean playerChosen = false;
        boolean villagerChosen = false;

        if (!this.entity.getWillHunt()) {
            //this.entity.setIsFast(false);
            return false;
        }

        if (this.targetEntity != null) {
            if (this.targetEntity.isDead) {
                this.targetEntity = null;
            }
        }

        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase ee = (EntityPrehistoricFloraLandBase) this.entity;
            if (ee.isSwimmingInWater()) {
                return false;
            }
        }

        //List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);
        List<T> list = Functions.getEntitiesWithinAABBPN(this.taskOwner.world, this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);

        if (list.isEmpty())
        {
            return false;
        }
        else
        {
            Collections.sort(list, this.sorter);
            for (EntityLivingBase entityChooser : list) {
                boolean targetOK = true;
                boolean dietOK = false;

                if (entityChooser != null) {
                    if (this.entity instanceof EntityPrehistoricFloraEurypteridBase || this.entity instanceof EntityPrehistoricFloraAgeableFishBase) {
                        if (!isInWaterforHunting(entityChooser)) {
                            targetOK = false; //Eurypterids and fish don't attack players on land:
                        }
                    }
                    if (this.entity instanceof EntityPrehistoricFloraLandWadingBase) {
                        if (isTooDeepforWading(entityChooser)) {
                            targetOK = false;
                        }
                    }
                    if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() <= this.entity.getEntityBoundingBox().getAverageEdgeLength() * this.minSize)
                    ) {
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                    if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() >= this.entity.getEntityBoundingBox().getAverageEdgeLength() * this.maxSize)
                    ) {
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                    if (entityChooser instanceof EntityPrehistoricFloraAgeableBase) {
                        if (((EntityPrehistoricFloraAgeableBase)entityChooser).getAnimation() != null && ((EntityPrehistoricFloraAgeableBase)entityChooser).getAnimation() == EntityPrehistoricFloraAgeableBase.HIDE_ANIMATION) {
                            targetOK = false;
                        }
                    }
                    if ((!this.cannibal) && (entityChooser.getClass().toString().equalsIgnoreCase(this.entity.getClass().toString()))
                    ) { //Disallow cannibalism!
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                }


                if ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL) || entityChooser instanceof EntityVillager) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietMeat")) {
                        this.targetEntity = entityChooser;
                        if (entityChooser instanceof EntityPlayer) {
                            playerChosen = true;
                        }
                        if (entityChooser instanceof EntityVillager) {
                            villagerChosen = true;
                        }
                        break;
                    }
                }

                if (targetOK) {
                    //Next figure out if this entity drops loot I can eat:
                    ResourceLocation resourcelocation = null;
                    try { //Uggggh, reflection :(
                        Method method = entityChooser.getClass().getDeclaredMethod("func_184647_J"); //"getLootTable"
                        method.setAccessible(true);
                        resourcelocation = (ResourceLocation) method.invoke(entityChooser);
                    } catch (Exception e) {
                        try { //Uggggh, reflection :(
                            Method method = entityChooser.getClass().getDeclaredMethod("getLootTable");
                            method.setAccessible(true);
                            resourcelocation = (ResourceLocation) method.invoke(entityChooser);
                        } catch (Exception ee) {
                        }
                    }
                    if (resourcelocation != null) {
                        LootTable loottable = this.entity.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
                        LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) this.entity.world)).withLootedEntity(entityChooser).withLuck(Float.MAX_VALUE).withDamageSource(DamageSource.GENERIC).withPlayer(null);
                        List<ItemStack> itemstackpool = loottable.generateLootForPools(this.entity.world.rand, lootcontext$builder.build());
                        if (!itemstackpool.isEmpty()) {
                            for (ItemStack itemstack : itemstackpool) {
                                //Loop over the itemstacks to see what the drops are:
                                String[] oreDictList = this.entity.getFoodOreDicts();
                                for (String oreDict : oreDictList) {
                                    if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), itemstack)) {
                                        dietOK = true;
                                        break;
                                    }
                                }
                                if (dietOK) {
                                    break;
                                }
                            }
                        }
                    }
                }

                if ((targetOK && dietOK) || ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL && playerChosen) || (entityChooser instanceof EntityVillager && villagerChosen))) {
                    this.targetEntity = entityChooser;
                    break;
                }
            }
        }

        if (this.targetEntity != null) {
            this.entity.setIsFast(true);
        }
        else {
            //this.entity.setIsFast(false);
        }

        return this.targetEntity != null;
    }
    
    @Override
    public boolean shouldContinueExecuting() {
        //Is there a nearer target it would be better to take, by looking at half my normal hunt distance?
//        if (this.entity.getAttackTarget() != null && (!this.entity.getOneHit()) && this.entity.getRevengeTarget() == null) {
//            List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance() * 0.5D), this.targetEntitySelector);
//
//            if (list.isEmpty()) {
//                return false;
//            } else {
//                Collections.sort(list, this.sorter);
//                for (EntityLivingBase entityChooser : list) {
//                    boolean targetOK = true;
//                    boolean dietOK = false;
//
//                    if (entityChooser != null) {
//                        if (this.entity instanceof EntityPrehistoricFloraEurypteridBase || this.entity instanceof EntityPrehistoricFloraAgeableFishBase) {
//                            if (!isInWaterforHunting(entityChooser)) {
//                                targetOK = false; //Eurypterids and fish don't attack players on land:
//                            }
//                        }
//                        if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() <= this.minSize)
//                        ) {
//                            //this.entity.setIsFast(false);
//                            targetOK = false;
//                        }
//                        if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() >= this.maxSize)
//                        ) {
//                            //this.entity.setIsFast(false);
//                            targetOK = false;
//                        }
//                        if ((!this.cannibal) && (entityChooser.getClass().toString().equalsIgnoreCase(this.entity.getClass().toString()))
//                        ) { //Disallow cannibalism!
//                            //this.entity.setIsFast(false);
//                            targetOK = false;
//                        }
//                    }
//
//
//                    if ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL) || entityChooser instanceof EntityVillager) {
//                        if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietMeat")) {
//                            this.targetEntity = entityChooser;
//                            break;
//                        }
//                    }
//
//                    if (targetOK) {
//                        //Next figure out if this entity drops loot I can eat and is it closer than what I am currently hunting:
//                        ResourceLocation resourcelocation = null;
//                        try { //Uggggh, reflection :(
//                            Method method = entityChooser.getClass().getDeclaredMethod("func_184647_J"); //"getLootTable"
//                            method.setAccessible(true);
//                            resourcelocation = (ResourceLocation) method.invoke(entityChooser);
//                        } catch (Exception e) {
//                            try { //Uggggh, reflection :(
//                                Method method = entityChooser.getClass().getDeclaredMethod("getLootTable");
//                                method.setAccessible(true);
//                                resourcelocation = (ResourceLocation) method.invoke(entityChooser);
//                            } catch (Exception ee) {
//                            }
//                        }
//                        if (resourcelocation != null) {
//                            LootTable loottable = this.entity.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
//                            LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) this.entity.world)).withLootedEntity(entityChooser).withLuck(Float.MAX_VALUE);
//
//                            for (ItemStack itemstack : loottable.generateLootForPools(this.entity.world.rand, lootcontext$builder.build())) {
//                                //Loop over the itemstack to see what it is:
//                                String[] oreDictList = this.entity.getFoodOreDicts();
//                                for (String oreDict : oreDictList) {
//                                    if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), itemstack)) {
//                                        dietOK = true;
//                                        break;
//                                    }
//                                }
//                                if (dietOK) {
//                                    break;
//                                }
//                            }
//                        }
//                    }
//
//                    if ((targetOK && dietOK) || ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL) || entityChooser instanceof EntityVillager)) {
//                        if (this.entity.getDistance(entityChooser) < this.entity.getDistance(this.entity.getAttackTarget())) {
//                            this.targetEntity = entityChooser;
//                            this.entity.setAttackTarget(this.targetEntity);
//                            break;
//                        }
//                    }
//                }
//            }
//        }

        return super.shouldContinueExecuting();
    }

    public boolean isTooDeepforWading(Entity entity) {
        if (entity instanceof EntityPrehistoricFloraLandBase) {
            if (!((EntityPrehistoricFloraLandBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraAgeableFishBase) {
            if (!((EntityPrehistoricFloraAgeableFishBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraEurypteridBase) {
            if (!((EntityPrehistoricFloraEurypteridBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraFishBase) {
            if (!((EntityPrehistoricFloraFishBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraSwimmingAmphibianBase) {
            if (!((EntityPrehistoricFloraSwimmingAmphibianBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) {
            if (!((EntityPrehistoricFloraSwimmingBottomWalkingWaterBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraNautiloidBase) {
            if (!((EntityPrehistoricFloraNautiloidBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            if (!((EntityPrehistoricFloraTrilobiteSwimBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (entity instanceof EntityPrehistoricFloraWalkingAmphibianBase) {
            if (!((EntityPrehistoricFloraWalkingAmphibianBase)entity).isReallyInWater()) {
                return false;
            }
        }
        else if (!entity.isInWater()) {
            return false;
        }
        return (PathNavigateGroundNoDeepWater.isTooDeep(this.entity.world, entity.getPosition()));
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