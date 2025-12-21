package net.lepidodendron.entity.ai.helpers;

import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.util.PathNavigateGroundNoDeepWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Method;
import java.util.List;

public class TestPrey {

    public static Entity result(Entity entityThem, Entity entityMe) {

        boolean hasOverride = false;
        if (entityThem instanceof EntityPrehistoricFloraAgeableBase) {
            hasOverride = ((EntityPrehistoricFloraAgeableBase) entityThem).ignoreSizeForAvoidance();
        }

        if (entityThem instanceof EntityPrehistoricFloraAgeableBase
            || entityThem instanceof EntityPrehistoricFloraInsectFlyingBase) {

            if (entityMe instanceof EntityPrehistoricFloraAgeableBase) {
                if (((EntityPrehistoricFloraAgeableBase)entityMe).getAttackTarget() == entityThem) {
                    return entityMe;
                }
            }
            if (entityMe instanceof EntityPrehistoricFloraAgeableBase) {
                if (((EntityPrehistoricFloraAgeableBase)entityMe).getRevengeTarget() == entityThem) {
                    return entityMe;
                }
            }
            if (entityMe instanceof EntityPrehistoricFloraInsectFlyingBase) {
                if (((EntityPrehistoricFloraInsectFlyingBase)entityMe).getAttackTarget() == entityThem) {
                    return entityMe;
                }
            }
            if (entityMe instanceof EntityPrehistoricFloraInsectFlyingBase) {
                if (((EntityPrehistoricFloraInsectFlyingBase)entityMe).getRevengeTarget() == entityThem) {
                    return entityMe;
                }
            }
            if (entityMe.getClass() == entityThem.getClass()) {
               return entityMe;
            }

            boolean targetOK = true;
            boolean dietOK = false;

            if (entityMe != null) {
                if (entityThem instanceof EntityPrehistoricFloraEurypteridBase || entityThem instanceof EntityPrehistoricFloraAgeableFishBase) {
                    if (!isInWaterforHunting(entityMe, entityThem)) {
                        targetOK = false; //Eurypterids and fish don't attack players on land:
                    }
                }
                if (entityThem instanceof EntityPrehistoricFloraLandWadingBase) {
                    if (isTooDeepforWading(entityMe, entityThem)) {
                        targetOK = false;
                    }
                }
                if ((entityMe.getEntityBoundingBox().getAverageEdgeLength() <= entityThem.getEntityBoundingBox().getAverageEdgeLength() * 0.1F) //hard coded - not accurate for all AI
                ) {
                    //entityThem.setIsFast(false);
                    targetOK = false;
                }
                if ((entityMe.getEntityBoundingBox().getAverageEdgeLength() >= entityThem.getEntityBoundingBox().getAverageEdgeLength() * 1.2F) //hard coded - not accurate for all AI
                    & !hasOverride) {
                    //entityThem.setIsFast(false);
                    targetOK = false;
                }
                if (entityMe instanceof EntityPrehistoricFloraAgeableBase) {
                    if (((EntityPrehistoricFloraAgeableBase)entityMe).getAnimation() != null && ((EntityPrehistoricFloraAgeableBase)entityMe).getAnimation() == EntityPrehistoricFloraAgeableBase.HIDE_ANIMATION) {
                        targetOK = false;
                    }
                }
                if ((entityMe.getClass().toString().equalsIgnoreCase(entityThem.getClass().toString()))
                ) { //Disallow cannibalism!
                    //entityThem.setIsFast(false);
                    targetOK = false;
                }

                if (entityMe.isInvisible()) {
                    targetOK = false;
                }
            }

            if (targetOK && entityMe instanceof EntityLiving) {
                //Next figure out if this entity drops loot I can eat:
                ResourceLocation resourcelocation = null;
                try { //Uggggh, reflection :(
                    Method method = entityMe.getClass().getDeclaredMethod("func_184647_J"); //"getLootTable"
                    method.setAccessible(true);
                    resourcelocation = (ResourceLocation) method.invoke(entityMe);
                } catch (Exception e) {
                    try { //Uggggh, reflection :(
                        Method method = entityMe.getClass().getDeclaredMethod("getLootTable");
                        method.setAccessible(true);
                        resourcelocation = (ResourceLocation) method.invoke(entityMe);
                    } catch (Exception ee) {
                    }
                }
                if (resourcelocation != null) {
                    LootTable loottable = entityThem.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
                    LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) entityThem.world)).withLootedEntity(entityMe).withLuck(Float.MAX_VALUE).withDamageSource(DamageSource.GENERIC).withPlayer(null);
                    List<ItemStack> itemstackpool = loottable.generateLootForPools(entityThem.world.rand, lootcontext$builder.build());
                    if (!itemstackpool.isEmpty()) {
                        for (ItemStack itemstack : itemstackpool) {
                            //Loop over the itemstacks to see what the drops are:
                            String[] oreDictList = (entityThem instanceof EntityPrehistoricFloraInsectFlyingBase) ? ((EntityPrehistoricFloraInsectFlyingBase)entityThem).getFoodOreDicts() : ((EntityPrehistoricFloraAgeableBase)entityThem).getFoodOreDicts();
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

            if ((targetOK && dietOK)) {
                return entityThem;
            }
        }
        return entityMe;
    }

    public static boolean isTooDeepforWading(Entity entityMe, Entity entityThem) {
        if (entityMe instanceof EntityPrehistoricFloraLandBase) {
            if (!((EntityPrehistoricFloraLandBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraAgeableFishBase) {
            if (!((EntityPrehistoricFloraAgeableFishBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraEurypteridBase) {
            if (!((EntityPrehistoricFloraEurypteridBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraFishBase) {
            if (!((EntityPrehistoricFloraFishBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraSwimmingAmphibianBase) {
            if (!((EntityPrehistoricFloraSwimmingAmphibianBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraSwimmingBottomWalkingWaterBase) {
            if (!((EntityPrehistoricFloraSwimmingBottomWalkingWaterBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraNautiloidBase) {
            if (!((EntityPrehistoricFloraNautiloidBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
            if (!((EntityPrehistoricFloraTrilobiteSwimBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (entityMe instanceof EntityPrehistoricFloraWalkingAmphibianBase) {
            if (!((EntityPrehistoricFloraWalkingAmphibianBase)entityMe).isReallyInWater()) {
                return false;
            }
        }
        else if (!entityMe.isInWater()) {
            return false;
        }
        return (PathNavigateGroundNoDeepWater.isTooDeep(entityThem.world, entityMe.getPosition()));
    }

    public static boolean isInWaterforHunting(Entity entityMe, Entity entityThem) {
        BlockPos pos = entityMe.getPosition();
        if (entityMe.world.getBlockState(pos).getMaterial() == Material.WATER
                && isDirectPathBetweenPoints(entityThem.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5), entityThem)) {
            return true;
        }
        if (entityMe.isRiding() && (entityThem instanceof EntityPrehistoricFloraAgeableBase) ? ((EntityPrehistoricFloraAgeableBase)entityThem).breaksBoat() : false) {
            Entity boat = entityMe.getRidingEntity();
            if (boat instanceof EntityBoat) {
                pos = boat.getPosition();
                if (entityMe.world.getBlockState(pos.down()).getMaterial() == Material.WATER
                        && isDirectPathBetweenPoints(entityThem.getPositionVector(), new Vec3d(pos.getX() + 0.5, pos.getY() - 0.5, pos.getZ() + 0.5), entityThem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2, Entity entityThem) {
        RayTraceResult movingobjectposition = entityThem.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }


}
