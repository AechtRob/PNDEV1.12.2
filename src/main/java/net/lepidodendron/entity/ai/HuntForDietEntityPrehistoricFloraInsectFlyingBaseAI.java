package net.lepidodendron.entity.ai;

import com.google.common.base.Predicate;
import net.lepidodendron.entity.EntityPrehistoricFloraMeganeuropsis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.passive.EntityVillager;
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


        List<T> list = this.taskOwner.world.<T>getEntitiesWithinAABB(this.targetClass, this.getTargetableArea(this.getTargetDistance()), this.targetEntitySelector);

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
                }


                if ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL) || entityChooser instanceof EntityVillager) {
                    this.targetEntity = entityChooser;
                    break;
                }

                if (targetOK) {
                    //Next figure out if this entity drops loot I can eat:
                    ResourceLocation resourcelocation = null;
                    try {
                        Method method = entityChooser.getClass().getDeclaredMethod("getLootTable", null);
                        method.setAccessible(true); //Uggggh, reflection :(
                        resourcelocation = (ResourceLocation) method.invoke(entityChooser, new Object[]{null});
                    } catch (Exception e) {
                    }
                    if (resourcelocation != null) {
                        LootTable loottable = this.entity.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
                        LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) this.entity.world)).withLootedEntity(entityChooser).withLuck(Float.MAX_VALUE);

                        for (ItemStack itemstack : loottable.generateLootForPools(this.entity.world.rand, lootcontext$builder.build())) {
                            //Loop over the itemstack to see what it is:
                            Method method2 = RenderDisplayWallMount.testAndGetMethod(this.entity.getClass(), "getFoodOreDicts", null);
                            String[] oreDictList = new String[]{};
                            String result = "";
                            if (method2 != null) {
                                try {
                                    oreDictList = (String[]) method2.invoke(this.entity, new Object[]{null});
                                    for (String oreDict : oreDictList) {
                                        if (OreDictionary.containsMatch(false, OreDictionary.getOres(oreDict), itemstack)) {
                                            dietOK = true;
                                            break;
                                        }
                                    }
                                } catch (Exception e) {
                                }
                            } else {
                            }
                            if (dietOK) {
                                break;
                            }
                        }
                    }
                }

                if ((targetOK && dietOK) || ((entityChooser instanceof EntityPlayer && entityChooser.world.getDifficulty() != EnumDifficulty.PEACEFUL) || entityChooser instanceof EntityVillager)) {
                    this.targetEntity = entityChooser;
                    break;
                }
            }
        }

        return this.targetEntity != null;
    }

    public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = this.entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

}