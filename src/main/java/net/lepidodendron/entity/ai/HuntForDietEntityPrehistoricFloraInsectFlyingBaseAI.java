package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuropsis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.util.Functions;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
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

public class HuntForDietEntityPrehistoricFloraInsectFlyingBaseAI<T extends EntityLivingBase> extends EntityAINearestAttackableTarget {
    private final EntityPrehistoricFloraInsectFlyingBase entity;
    private final double minSize;
    private final double maxSize;
    private final boolean cannibal;

    public HuntForDietEntityPrehistoricFloraInsectFlyingBaseAI(EntityPrehistoricFloraInsectFlyingBase entity, Class<T> classTarget, boolean checkSight, Predicate<? super T> targetSelector, double minSize, double maxSize, boolean cannibal) {
        super(entity, classTarget, 0, checkSight, true, targetSelector);
        this.entity = entity;
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.cannibal  = cannibal;
    }

    @Override
    public boolean shouldExecute() {

        boolean playerChosen = false;
        boolean villagerChosen = false;

        if (this.entity instanceof EntityPrehistoricFloraMeganeuropsis) {
            EntityPrehistoricFloraMeganeuropsis meganeuropsis = (EntityPrehistoricFloraMeganeuropsis) this.entity;
            if (!(meganeuropsis.getWillHunt())) {
                return false;
            }
        }

        if (this.targetEntity != null) {
            if (this.targetEntity.isDead) {
                this.targetEntity = null;
            }
        }


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
                    if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() <= this.minSize)
                    ) {
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                    if ((entityChooser.getEntityBoundingBox().getAverageEdgeLength() >= this.maxSize)
                    ) {
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                    if ((!this.cannibal) && (entityChooser.getClass().toString().equalsIgnoreCase(this.entity.getClass().toString()))
                    ) { //Disallow cannibalism!
                        //this.entity.setIsFast(false);
                        targetOK = false;
                    }
                    if (entityChooser instanceof EntityPlayer) {
                        if (((EntityPlayer)entityChooser).capabilities.disableDamage) {
                            targetOK = false;
                        }
                    }
                    if (entityChooser.isInvisible()) {
                        targetOK = false;
                    }
                }

                if ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL)
                        || entityChooser instanceof EntityVillager
                        || entityChooser instanceof AbstractIllager
                        || entityChooser instanceof EntityWitch
                        || entityChooser instanceof EntityLlama
                        || entityChooser instanceof EntityDonkey
                        || entityChooser instanceof EntityHorse) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietMeat")) {
                        this.targetEntity = entityChooser;
                        if (entityChooser instanceof EntityPlayer) {
                            playerChosen = true;
                        }
                        if (entityChooser instanceof EntityVillager
                                || entityChooser instanceof AbstractIllager
                                || entityChooser instanceof EntityWitch
                                || entityChooser instanceof EntityLlama
                                || entityChooser instanceof EntityDonkey
                                || entityChooser instanceof EntityHorse) {
                            villagerChosen = true;
                        }
                        break;
                    }
                }

                if (entityChooser instanceof EntitySilverfish
                        || entityChooser instanceof EntitySpider) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietBug")) {
                        this.targetEntity = entityChooser;
                        villagerChosen = true;
                        break;
                    }
                }

                if (entityChooser instanceof EntitySkeleton
                        || entityChooser instanceof EntitySkeletonHorse
                        || entityChooser instanceof EntityWitherSkeleton) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietBone")) {
                        this.targetEntity = entityChooser;
                        villagerChosen = true;
                        break;
                    }
                }

                if (entityChooser instanceof EntityZombie
                        || entityChooser instanceof EntityZombieHorse) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietRotten")) {
                        this.targetEntity = entityChooser;
                        villagerChosen = true;
                        break;
                    }
                }

                if (entityChooser instanceof EntityGuardian) {
                    if (Arrays.asList(this.entity.getFoodOreDicts()).contains("pndietFish")) {
                        this.targetEntity = entityChooser;
                        villagerChosen = true;
                        break;
                    }
                }

                if (targetOK && entityChooser instanceof EntityLiving) {
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
                        LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) this.entity.world)).withLootedEntity(entityChooser).withLuck(Float.MAX_VALUE);

                        for (ItemStack itemstack : loottable.generateLootForPools(this.entity.world.rand, lootcontext$builder.build())) {
                            //Loop over the itemstack to see what it is:
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

                if ((targetOK && dietOK)
                     || ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL && playerChosen)
                     || (entityChooser instanceof EntityVillager && villagerChosen)
                     || (entityChooser instanceof EntityMob && villagerChosen))) {
                    this.targetEntity = entityChooser;
                    break;
                }
            }
        }

        return this.targetEntity != null;
    }

    @Override
    public boolean shouldContinueExecuting() {
        //Is there a nearer target it would be better to take, by looking at half my normal hunt distance?
        return super.shouldContinueExecuting();
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

}