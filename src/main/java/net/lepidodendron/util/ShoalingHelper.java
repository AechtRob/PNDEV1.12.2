package net.lepidodendron.util;

import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
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
            List<EntityPrehistoricFloraFishBase> Entities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(pos.add(-shoalDist, -shoalDist, -shoalDist), pos.add(shoalDist, shoalDist, shoalDist)));
            for (EntityPrehistoricFloraFishBase currentEntity : Entities) {
                if (currentEntity.getShoalLeader() == fishBase) {
                    hasShoal = true;
                    myshoal ++;
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
                        List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(leaderPos.add(-shoalDist, -shoalDist, -shoalDist), leaderPos.add(shoalDist, shoalDist, shoalDist)));
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
            //I am in a shoal, so that's all I care about right now
            return;
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
                List<EntityPrehistoricFloraFishBase> ShoalEntities = world.getEntitiesWithinAABB(fishBase.getClass(), new AxisAlignedBB(leaderPos.add(-shoalDist, -shoalDist, -shoalDist), leaderPos.add(shoalDist, shoalDist, shoalDist)));
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
}
