package net.lepidodendron.entity.util;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.base.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class ShoalingHelper {

    private static Random rand = new Random();

    public static void updateShoalFishBase(EntityPrehistoricFloraFishBase fishBase) {
        if ((!LepidodendronConfig.doShoalingFlocking) || fishBase.getShoalSize() < 1) {
            return;
        }
        World world = fishBase.world;
        boolean isLeader = false;
        EntityPrehistoricFloraFishBase shoalLeader = fishBase.getShoalLeader();
        if (shoalLeader != null) {
            isLeader = shoalLeader == fishBase;
        }
        BlockPos pos = fishBase.getPosition();
        int shoalDist = fishBase.getShoalDist();
        if (isLeader) { //I am a leader:
            //Do I have a shoal?
            boolean hasShoal = false;
            int myshoal = 0;
            List<EntityPrehistoricFloraFishBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraFishBase.class, new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == fishBase) {
                    hasShoal = true;
                    if (myshoal <= fishBase.getShoalSize()) {
                        myshoal++;
                    }
                    if (myshoal > currentEntity.getShoalSize()) {
                        myshoal--;
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed for it
                    }
                }
            }
            if (!hasShoal) {
                fishBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraFishBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
                    if (isInList(currentEntity, fishBase.canShoalWith())) {
                        //What are the requirements for setting a new fish as my leader?
                        //It must be a leader of itself
                        if (currentEntity.getShoalLeader() == currentEntity) {
                            //What is its shoal size?
                            int shoal = 0;
                            BlockPos leaderPos = currentEntity.getPosition();
                            List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraFishBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                            for (EntityPrehistoricFloraFishBase currentShoalEntity : ShoalEntities) {
                                if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                    shoal++;
                                }
                            }
                            if (shoal + myshoal <= fishBase.getShoalSize()) {
                                //Set that entity as the leader of this one:
                                fishBase.setShoalLeader(currentEntity);
                                return;
                            }
                        }
                    }
                }
                return;
            }
        }
        //So I am not be a leader, but am I in a shoal?
        if (shoalLeader != null) {
            //I am following someone, but are they dead or impossible to reach?
            if (shoalLeader.isDead) {
                fishBase.setShoalLeader(null);
            }
            else if (shoalLeader.getShoalLeader() != shoalLeader && rand.nextInt(fishBase.getShoalSize() * 2) == 0) { //Am I following someone who is a follower?
                if (rand.nextInt(fishBase.getShoalSize()) == 0) {
                    fishBase.setShoalLeader(null);
                }
                shoalLeader.setShoalLeader(shoalLeader);
            }
            if (shoalLeader != null) {
                if (!(world.getBlockState(shoalLeader.getPosition()).getMaterial() == Material.WATER && fishBase.isDirectPathBetweenPoints(fishBase.getPositionVector(), new Vec3d(shoalLeader.getPosition().getX() + 0.5, shoalLeader.getPosition().getY() + 0.5, shoalLeader.getPosition().getZ() + 0.5)))) {
                    fishBase.setShoalLeader(null);
                }
            }
        }
        if (shoalLeader != null) {
            //I am in a shoal, but is my leader too far away?
            if (fishBase.getDistance(shoalLeader) > fishBase.getShoalDist() + fishBase.getEntityBoundingBox().getAverageEdgeLength()) {
                fishBase.setShoalLeader(null);
            }
            else {
                return;
            }
        }
        //Find me a shoal:
        List<EntityPrehistoricFloraFishBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraFishBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
            if (isInList(currentEntity, fishBase.canShoalWith())) {
                //What are the requirements for setting a new fish as my leader?
                //It must either be a leader of itself, or else not have a leader at all
                if (currentEntity.getShoalLeader() == currentEntity) {
                    //What is its shoal size?
                    int shoal = 0;
                    BlockPos leaderPos = currentEntity.getPosition();
                    List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraFishBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                    for (EntityPrehistoricFloraFishBase currentShoalEntity : ShoalEntities) {
                        if (currentShoalEntity.getShoalLeader() == currentEntity) {
                            shoal++;
                        }
                    }
                    if (shoal <= fishBase.getShoalSize()) {
                        //Set that entity as the leader of this one:
                        fishBase.setShoalLeader(currentEntity);
                        return;
                    }
                }
                if (currentEntity.getShoalLeader() == null) {
                    //Set that entity as the leader of this one:
                    fishBase.setShoalLeader(currentEntity);
                    return;
                }
            }
        }
    }

    public static void updateShoalAgeableBase(EntityPrehistoricFloraAgeableBase ageableBase) {
        if ((!LepidodendronConfig.doShoalingFlocking) || ageableBase.getShoalSize() < 1) {
            return;
        }
        World world = ageableBase.world;
        boolean isLeader = false;
        EntityPrehistoricFloraAgeableBase shoalLeader = ageableBase.getShoalLeader();
        if (shoalLeader != null) {
            isLeader = shoalLeader == ageableBase;
        }
        BlockPos pos = ageableBase.getPosition();
        int shoalDist = ageableBase.getShoalDist();
        if (isLeader) { //I am a leader:
            //Do I have a shoal?
            boolean hasShoal = false;
            int myshoal = 0;
            List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraAgeableBase.class, new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == ageableBase) {
                    hasShoal = true;
                    if (myshoal <= ageableBase.getShoalSize()) {
                        myshoal++;
                    }
                    if (myshoal > currentEntity.getShoalSize()) {
                        myshoal--;
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed for it
                    }
                }
            }
            if (!hasShoal) {
                ageableBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraAgeableBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
                    if (isInList(currentEntity, ageableBase.canShoalWith())) {
                        //What are the requirements for setting a new ageable as my leader?
                        //It must be a leader of itself
                        if (currentEntity.getShoalLeader() == currentEntity) {
                            //What is its shoal size?
                            int shoal = 0;
                            BlockPos leaderPos = currentEntity.getPosition();
                            List<EntityPrehistoricFloraAgeableBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraAgeableBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                            for (EntityPrehistoricFloraAgeableBase currentShoalEntity : ShoalEntities) {
                                if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                    shoal++;
                                }
                            }
                            if (shoal + myshoal <= ageableBase.getShoalSize()) {
                                //Set that entity as the leader of this one:
                                ageableBase.setShoalLeader(currentEntity);
                                return;
                            }
                        }
                    }
                }
                return;
            }
        }
        //So I am not be a leader, but am I in a shoal?
        if (shoalLeader != null) {
            //I am following someone, but are they dead or impossible to reach?
            if (shoalLeader.isDead) {
                ageableBase.setShoalLeader(null);
            }
            else if (shoalLeader.getShoalLeader() != shoalLeader && rand.nextInt(ageableBase.getShoalSize() * 2) == 0) { //Am I following someone who is a follower?
                if (rand.nextInt(ageableBase.getShoalSize()) == 0) {
                    ageableBase.setShoalLeader(null);
                }
                shoalLeader.setShoalLeader(shoalLeader);
            }
            if (shoalLeader != null) {
                if (!(world.getBlockState(shoalLeader.getPosition()).getMaterial() == Material.WATER && isDirectPathBetweenPoints(world, ageableBase.getPositionVector(), new Vec3d(shoalLeader.getPosition().getX() + 0.5, shoalLeader.getPosition().getY() + 0.5, shoalLeader.getPosition().getZ() + 0.5)))) {
                    ageableBase.setShoalLeader(null);
                }
            }
        }
        if (shoalLeader != null) {
            //I am in a shoal, but is my leader too far away?
            if (ageableBase.getDistance(shoalLeader) > ageableBase.getShoalDist() + ageableBase.getEntityBoundingBox().getAverageEdgeLength()) {
                ageableBase.setShoalLeader(null);
            }
            else {
                return;
            }
        }
        //Find me a shoal:
        List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraAgeableBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
            if (isInList(currentEntity, ageableBase.canShoalWith())) {
                //What are the requirements for setting a new ageable as my leader?
                //It must either be a leader of itself, or else not have a leader at all
                if (currentEntity.getShoalLeader() == currentEntity) {
                    //What is its shoal size?
                    int shoal = 0;
                    BlockPos leaderPos = currentEntity.getPosition();
                    List<EntityPrehistoricFloraAgeableBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraAgeableBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                    for (EntityPrehistoricFloraAgeableBase currentShoalEntity : ShoalEntities) {
                        if (currentShoalEntity.getShoalLeader() == currentEntity) {
                            shoal++;
                        }
                    }
                    if (shoal <= ageableBase.getShoalSize()) {
                        //Set that entity as the leader of this one:
                        ageableBase.setShoalLeader(currentEntity);
                        return;
                    }
                }
                if (currentEntity.getShoalLeader() == null) {
                    //Set that entity as the leader of this one:
                    ageableBase.setShoalLeader(currentEntity);
                    return;
                }
            }
        }
    }

    public static void updateShoalTrilobiteBottomBase(EntityPrehistoricFloraTrilobiteBottomBase trilobiteBottomBase) {
        if ((!LepidodendronConfig.doShoalingFlocking) || trilobiteBottomBase.getShoalSize() < 1) {
            return;
        }
        World world = trilobiteBottomBase.world;
        boolean isLeader = false;
        EntityPrehistoricFloraTrilobiteBottomBase shoalLeader = trilobiteBottomBase.getShoalLeader();
        if (shoalLeader != null) {
            isLeader = shoalLeader == trilobiteBottomBase;
        }
        BlockPos pos = trilobiteBottomBase.getPosition();
        int shoalDist = trilobiteBottomBase.getShoalDist();
        if (isLeader) { //I am a leader:
            //Do I have a shoal?
            boolean hasShoal = false;
            int myshoal = 0;
            List<EntityPrehistoricFloraTrilobiteBottomBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraTrilobiteBottomBase.class, new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == trilobiteBottomBase) {
                    hasShoal = true;
                    if (myshoal <= trilobiteBottomBase.getShoalSize()) {
                        myshoal++;
                    }
                    if (myshoal > currentEntity.getShoalSize()) {
                        myshoal--;
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed for it
                    }
                }
            }
            if (!hasShoal) {
                trilobiteBottomBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraTrilobiteBottomBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
                    if (isInList(currentEntity, trilobiteBottomBase.canShoalWith())) {
                        //What are the requirements for setting a new trilobiteBottom as my leader?
                        //It must be a leader of itself
                        if (currentEntity.getShoalLeader() == currentEntity) {
                            //What is its shoal size?
                            int shoal = 0;
                            BlockPos leaderPos = currentEntity.getPosition();
                            List<EntityPrehistoricFloraTrilobiteBottomBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraTrilobiteBottomBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                            for (EntityPrehistoricFloraTrilobiteBottomBase currentShoalEntity : ShoalEntities) {
                                if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                    shoal++;
                                }
                            }
                            if (shoal + myshoal <= trilobiteBottomBase.getShoalSize()) {
                                //Set that entity as the leader of this one:
                                trilobiteBottomBase.setShoalLeader(currentEntity);
                                return;
                            }
                        }
                    }
                }
                return;
            }
        }
        //So I am not be a leader, but am I in a shoal?
        if (shoalLeader != null) {
            //I am following someone, but are they dead or impossible to reach?
            if (shoalLeader.isDead) {
                trilobiteBottomBase.setShoalLeader(null);
            }
            else if (shoalLeader.getShoalLeader() != shoalLeader && rand.nextInt(trilobiteBottomBase.getShoalSize() * 2) == 0) { //Am I following someone who is a follower?
                if (rand.nextInt(trilobiteBottomBase.getShoalSize()) == 0) {
                    trilobiteBottomBase.setShoalLeader(null);
                }
                shoalLeader.setShoalLeader(shoalLeader);
            }
            if (shoalLeader != null) {
                if (!(world.getBlockState(shoalLeader.getPosition()).getMaterial() == Material.WATER && trilobiteBottomBase.isDirectPathBetweenPoints(trilobiteBottomBase.getPositionVector(), new Vec3d(shoalLeader.getPosition().getX() + 0.5, shoalLeader.getPosition().getY() + 0.5, shoalLeader.getPosition().getZ() + 0.5)))) {
                    trilobiteBottomBase.setShoalLeader(null);
                }
            }
        }
        if (shoalLeader != null) {
            //I am in a shoal, but is my leader too far away?
            if (trilobiteBottomBase.getDistance(shoalLeader) > trilobiteBottomBase.getShoalDist() + trilobiteBottomBase.getEntityBoundingBox().getAverageEdgeLength()) {
                trilobiteBottomBase.setShoalLeader(null);
            }
            else {
                return;
            }
        }
        //Find me a shoal:
        List<EntityPrehistoricFloraTrilobiteBottomBase> Entities = world.getEntitiesWithinAABB(EntityPrehistoricFloraTrilobiteBottomBase.class, new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
            if (isInList(currentEntity, trilobiteBottomBase.canShoalWith())) {
                //What are the requirements for setting a new trilobiteBottom as my leader?
                //It must either be a leader of itself, or else not have a leader at all
                if (currentEntity.getShoalLeader() == currentEntity) {
                    //What is its shoal size?
                    int shoal = 0;
                    BlockPos leaderPos = currentEntity.getPosition();
                    List<EntityPrehistoricFloraTrilobiteBottomBase> ShoalEntities = world.getEntitiesWithinAABB(EntityPrehistoricFloraTrilobiteBottomBase.class, new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                    for (EntityPrehistoricFloraTrilobiteBottomBase currentShoalEntity : ShoalEntities) {
                        if (currentShoalEntity.getShoalLeader() == currentEntity) {
                            shoal++;
                        }
                    }
                    if (shoal <= trilobiteBottomBase.getShoalSize()) {
                        //Set that entity as the leader of this one:
                        trilobiteBottomBase.setShoalLeader(currentEntity);
                        return;
                    }
                }
                if (currentEntity.getShoalLeader() == null) {
                    //Set that entity as the leader of this one:
                    trilobiteBottomBase.setShoalLeader(currentEntity);
                    return;
                }
            }
        }
    }

    public static boolean isDirectPathBetweenPoints(World world, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public static boolean isInList(EntityLivingBase entity, EntityLivingBase[] list) {
        EntityLivingBase[] var2 = list;
        int var3 = list.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            EntityLivingBase entityCheck = var2[var4];
            if (entityCheck.getClass() == entity.getClass()) {
                return true;
            }
        }
        return false;
    }
}
