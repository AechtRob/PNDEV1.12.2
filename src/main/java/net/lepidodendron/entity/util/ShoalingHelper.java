package net.lepidodendron.entity.util;

import net.lepidodendron.entity.base.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class ShoalingHelper {

    public static void updateShoalFishBase(EntityPrehistoricFloraFishBase fishBase) {
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
            List<EntityPrehistoricFloraFishBase> Entities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == fishBase) {
                    hasShoal = true;
                    if (myshoal <= fishBase.getShoalSize()) {
                        myshoal++;
                    }
                    else {
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed
                    }
                }
            }
            if (!hasShoal) {
                fishBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
                    //What are the requirements for setting a new fish as my leader?
                    //It must be a leader of itself
                    if (currentEntity.getShoalLeader() == currentEntity) {
                        //What is its shoal size?
                        int shoal = 0;
                        BlockPos leaderPos = currentEntity.getPosition();
                        List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                        for (EntityPrehistoricFloraFishBase currentShoalEntity : ShoalEntities) {
                            if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                shoal ++;
                            }
                        }
                        if (shoal + myshoal <= fishBase.getShoalSize()) {
                            //Set that entity as the leader of this one:
                            fishBase.setShoalLeader(currentEntity);
                            return;
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
        List<EntityPrehistoricFloraFishBase> Entities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
            //What are the requirements for setting a new fish as my leader?
            //It must either be a leader of itself, or else not have a leader at all
            if (currentEntity.getShoalLeader() == currentEntity) {
                //What is its shoal size?
                int shoal = 0;
                BlockPos leaderPos = currentEntity.getPosition();
                List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                for (EntityPrehistoricFloraFishBase currentShoalEntity : ShoalEntities) {
                    if (currentShoalEntity.getShoalLeader() == currentEntity) {
                        shoal ++;
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

    public static void updateShoalAgeableBase(EntityPrehistoricFloraAgeableBase ageableBase) {
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
            List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(ageableBase.getClass(), new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == ageableBase) {
                    hasShoal = true;
                    if (myshoal <= ageableBase.getShoalSize()) {
                        myshoal++;
                    }
                    else {
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed
                    }
                    myshoal ++;
                }
            }
            if (!hasShoal) {
                ageableBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(ageableBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
                    //What are the requirements for setting a new fish as my leader?
                    //It must be a leader of itself
                    if (currentEntity.getShoalLeader() == currentEntity) {
                        //What is its shoal size?
                        int shoal = 0;
                        BlockPos leaderPos = currentEntity.getPosition();
                        List<EntityPrehistoricFloraAgeableBase> ShoalEntities = world.getEntitiesWithinAABB(ageableBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                        for (EntityPrehistoricFloraAgeableBase currentShoalEntity : ShoalEntities) {
                            if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                shoal ++;
                            }
                        }
                        if (shoal + myshoal <= ageableBase.getShoalSize()) {
                            //Set that entity as the leader of this one:
                            ageableBase.setShoalLeader(currentEntity);
                            return;
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
            if (shoalLeader != null) {
                if ((!(world.getBlockState(shoalLeader.getPosition()).getMaterial() == Material.WATER && isDirectPathBetweenPoints(world, ageableBase.getPositionVector(), new Vec3d(shoalLeader.getPosition().getX() + 0.5, shoalLeader.getPosition().getY() + 0.5, shoalLeader.getPosition().getZ() + 0.5)))) &&
                        (ageableBase instanceof EntityPrehistoricFloraAgeableFishBase
                        || ageableBase instanceof EntityPrehistoricFloraNautiloidBase
                        || ageableBase instanceof EntityPrehistoricFloraEurypteridBase
                    )
                ) {
                    ageableBase.setShoalLeader(null);
                }
                if (!(ageableBase instanceof EntityPrehistoricFloraAgeableFishBase
                        || ageableBase instanceof EntityPrehistoricFloraNautiloidBase
                        || ageableBase instanceof EntityPrehistoricFloraEurypteridBase
                    )) {
                    if (ageableBase.getNavigator().getPath() == null) {
                        ageableBase.setShoalLeader(null);
                    }
                    else if (ageableBase.getNavigator().noPath()) {
                        ageableBase.setShoalLeader(null);
                    }
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
        List<EntityPrehistoricFloraAgeableBase> Entities = world.getEntitiesWithinAABB(ageableBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraAgeableBase currentEntity : Entities) {
            //What are the requirements for setting a new fish as my leader?
            //It must either be a leader of itself, or else not have a leader at all
            if (currentEntity.getShoalLeader() == currentEntity) {
                //What is its shoal size?
                int shoal = 0;
                BlockPos leaderPos = currentEntity.getPosition();
                List<EntityPrehistoricFloraAgeableBase> ShoalEntities = world.getEntitiesWithinAABB(ageableBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                for (EntityPrehistoricFloraAgeableBase currentShoalEntity : ShoalEntities) {
                    if (currentShoalEntity.getShoalLeader() == currentEntity) {
                        shoal ++;
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

    public static void updateShoalTrilobiteBottomBase(EntityPrehistoricFloraTrilobiteBottomBase trilobiteBase) {
        World world = trilobiteBase.world;
        boolean isLeader = false;
        EntityPrehistoricFloraTrilobiteBottomBase shoalLeader = trilobiteBase.getShoalLeader();
        if (shoalLeader != null) {
            isLeader = shoalLeader == trilobiteBase;
        }
        BlockPos pos = trilobiteBase.getPosition();
        int shoalDist = trilobiteBase.getShoalDist();
        if (isLeader) { //I am a leader:
            //Do I have a shoal?
            boolean hasShoal = false;
            int myshoal = 0;
            List<EntityPrehistoricFloraTrilobiteBottomBase> Entities = world.getEntitiesWithinAABB(trilobiteBase.getClass(), new AxisAlignedBB(pos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), pos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
            for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == trilobiteBase) {
                    hasShoal = true;
                    if (myshoal <= trilobiteBase.getShoalSize()) {
                        myshoal++;
                    }
                    else {
                        currentEntity.setShoalLeader(null); //This follower exceeds the shoal size allowed
                    }
                }
            }
            if (!hasShoal) {
                trilobiteBase.setShoalLeader(null);
            }
            else {
                //I'm the leader - am I near a shoal I can join?
                //Find me a shoal:
                Entities = world.getEntitiesWithinAABB(trilobiteBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
                for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
                    //What are the requirements for setting a new fish as my leader?
                    //It must be a leader of itself
                    if (currentEntity.getShoalLeader() == currentEntity) {
                        //What is its shoal size?
                        int shoal = 0;
                        BlockPos leaderPos = currentEntity.getPosition();
                        List<EntityPrehistoricFloraTrilobiteBottomBase> ShoalEntities = world.getEntitiesWithinAABB(trilobiteBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                        for (EntityPrehistoricFloraTrilobiteBottomBase currentShoalEntity : ShoalEntities) {
                            if (currentShoalEntity.getShoalLeader() == currentEntity) {
                                shoal ++;
                            }
                        }
                        if (shoal + myshoal <= trilobiteBase.getShoalSize()) {
                            //Set that entity as the leader of this one:
                            trilobiteBase.setShoalLeader(currentEntity);
                            return;
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
                trilobiteBase.setShoalLeader(null);
            }
            if (shoalLeader != null) {
                if (!(world.getBlockState(shoalLeader.getPosition()).getMaterial() == Material.WATER && trilobiteBase.isDirectPathBetweenPoints(trilobiteBase.getPositionVector(), new Vec3d(shoalLeader.getPosition().getX() + 0.5, shoalLeader.getPosition().getY() + 0.5, shoalLeader.getPosition().getZ() + 0.5)))) {
                    trilobiteBase.setShoalLeader(null);
                }
            }
        }
        if (shoalLeader != null) {
            //I am in a shoal, but is my leader too far away?
            if (trilobiteBase.getDistance(shoalLeader) > trilobiteBase.getShoalDist() + trilobiteBase.getEntityBoundingBox().getAverageEdgeLength()) {
                trilobiteBase.setShoalLeader(null);
            }
            else {
                return;
            }
        }
        //Find me a shoal:
        List<EntityPrehistoricFloraTrilobiteBottomBase> Entities = world.getEntitiesWithinAABB(trilobiteBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
        for (EntityPrehistoricFloraTrilobiteBottomBase currentEntity : Entities) {
            //What are the requirements for setting a new fish as my leader?
            //It must either be a leader of itself, or else not have a leader at all
            if (currentEntity.getShoalLeader() == currentEntity) {
                //What is its shoal size?
                int shoal = 0;
                BlockPos leaderPos = currentEntity.getPosition();
                List<EntityPrehistoricFloraTrilobiteBottomBase> ShoalEntities = world.getEntitiesWithinAABB(trilobiteBase.getClass(), new AxisAlignedBB(leaderPos.add(-(shoalDist + 1), -(shoalDist + 1), -(shoalDist + 1)), leaderPos.add((shoalDist + 1), (shoalDist + 1), (shoalDist + 1))));
                for (EntityPrehistoricFloraTrilobiteBottomBase currentShoalEntity : ShoalEntities) {
                    if (currentShoalEntity.getShoalLeader() == currentEntity) {
                        shoal ++;
                    }
                }
                if (shoal <= trilobiteBase.getShoalSize()) {
                    //Set that entity as the leader of this one:
                    trilobiteBase.setShoalLeader(currentEntity);
                    return;
                }
            }
            if (currentEntity.getShoalLeader() == null) {
                //Set that entity as the leader of this one:
                trilobiteBase.setShoalLeader(currentEntity);
                return;
            }
        }
    }

    public static boolean isDirectPathBetweenPoints(World world, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }
}
