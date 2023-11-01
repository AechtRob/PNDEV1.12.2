package net.lepidodendron.entity.ai;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.ArrayList;
import java.util.List;

public class LandClimbingFlyingWalkingBaseWanderFlightHighAI extends EntityAIBase {
    BlockPos target;
    boolean isGoingToAttach = false;
    protected final boolean avoidsSea;
    protected final EntityPrehistoricFloraLandClimbingFlyingWalkingBase entity;

    public LandClimbingFlyingWalkingBaseWanderFlightHighAI(EntityPrehistoricFloraLandClimbingFlyingWalkingBase creatureIn, boolean avoidsSea) {
        this.entity = creatureIn;
        this.avoidsSea = avoidsSea;
        this.setMutexBits(1);
    }

    public boolean shouldExecute() {
        if (this.entity.getEatTarget() != null) {
            return false;
        }

        if (this.entity.getRevengeTarget() != null) {
            return false;
        }

        if (this.entity.getLaying()) {
            return false;
        }

        if (this.entity.getAttachmentPos() != null) {
            return false;
        }

        int i = 0;
        boolean overWater = false;
        while (i <= 40) {
            overWater = false;
            if (this.entity.world.rand.nextInt(20) == 0) {
                target = getLogTarget();
            }
            else {
                target = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.getPositionRelativetoGround(this.entity, this.entity.world, this.entity.posX + this.entity.getRNG().nextInt(17) - 8, this.entity.posZ + this.entity.getRNG().nextInt(17) - 8, this.entity.getRNG());
            }
            Biome biome = this.entity.world.getBiome(target);
            if (this.avoidsSea && (BiomeDictionary.hasType(biome, BiomeDictionary.Type.BEACH)
                || BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN))) {
                overWater = true;
            }
            if (!overWater) {
                break;
            }
            i++;
        }
        if (target != null) {
            if (!this.entity.world.isBlockLoaded(target)) {
                return false;
            }
        }
        Material material = this.entity.world.getBlockState(new BlockPos(target)).getMaterial();
        Material material1 = this.entity.world.getBlockState(new BlockPos(target).up()).getMaterial();
        return (material1 != Material.LAVA) && (material1 != Material.WATER) && (material != Material.LAVA) && (material != Material.WATER) &&  this.entity.getAttachmentPos() == null;
    }

    public boolean shouldContinueExecuting() {
        return false;
    }

    public void updateTask() {

        if (!this.entity.isDirectPathBetweenPoints(new Vec3d(target))) {
            target = EntityPrehistoricFloraLandClimbingFlyingWalkingBase.getPositionRelativetoGround(this.entity, this.entity.world, this.entity.posX + this.entity.world.rand.nextInt(15) - 7, this.entity.posZ + this.entity.world.rand.nextInt(15) - 7, this.entity.world.rand);
        }
        if (this.entity.world.isAirBlock(target) || isGoingToAttach) {
            if (!this.entity.isFlying()) {
                this.entity.selectNavigator();
            }
            this.entity.getMoveHelper().setMoveTo((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 1D);
            if (this.entity.getAttackTarget() == null) {
                this.entity.getLookHelper().setLookPosition((double) target.getX() + 0.5D, (double) target.getY() + 0.5D, (double) target.getZ() + 0.5D, 180.0F, 20.0F);

            }
        }
    }

    public BlockPos getLogTarget() {
        List<BlockPos> blockList = new ArrayList<>();
        int xPos = -16;
        while (xPos <= 16) {
            int yPos = -4;
            while (yPos <= 4) {
                int zPos = -16;
                while (zPos <= 16) {
                    if (this.entity.world.isBlockLoaded(this.entity.getPosition().add(xPos, yPos, zPos))) {
                        if (this.entity.world.getBlockState(this.entity.getPosition().add(xPos, yPos, zPos)).getBlock().isWood(entity.world, this.entity.getPosition().add(xPos, yPos, zPos))) {
                            blockList.add(new BlockPos(this.entity.getPosition().getX() + xPos + this.entity.getRNG().nextInt(17) - 8, this.entity.getPosition().getY() + yPos + this.entity.getRNG().nextInt(17) - 8, this.entity.getPosition().getZ() + zPos + this.entity.getRNG().nextInt(17) - 8));
                        }
                    }
                    zPos ++;
                }
                yPos++;
            }
            xPos++;
        }
        if (!blockList.isEmpty()) {
            return (blockList.get(this.entity.world.rand.nextInt(blockList.size())));
        }
        return EntityPrehistoricFloraLandClimbingFlyingWalkingBase.getPositionRelativetoGround(this.entity, this.entity.world, this.entity.posX + this.entity.getRNG().nextInt(17) - 8, this.entity.posZ + this.entity.getRNG().nextInt(17) - 8, this.entity.getRNG());
    }
}