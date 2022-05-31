package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

//public class FishWander extends EntityAIBase {
public class WalkingAmphibianWander extends AnimationAINoAnimation<EntityPrehistoricFloraWalkingAmphibianBase> {

    protected float probability;
    protected Animation animation;
    protected double waterPreference;
    protected int executionChance;
    protected boolean mustUpdate;
    protected EntityPrehistoricFloraWalkingAmphibianBase PrehistoricFloraWalkingAmphibianBase;

    public WalkingAmphibianWander(EntityPrehistoricFloraWalkingAmphibianBase PrehistoricFloraWalkingAmphibianBase, Animation animation, double waterPreference, int executionchance)
    {
        super(PrehistoricFloraWalkingAmphibianBase);
        setMutexBits(1);
        this.PrehistoricFloraWalkingAmphibianBase = PrehistoricFloraWalkingAmphibianBase;
        this.animation = animation;
        this.waterPreference = waterPreference;
        this.executionChance = executionchance;
    }

    @Override
    public Animation getAnimation()
    {
        return animation;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public void startExecuting() {
        super.startExecuting();
    }

    @Override
    public void updateTask() {
        super.updateTask();

    }

    @Override
    public boolean shouldExecute() {
        if (this.PrehistoricFloraWalkingAmphibianBase.getRNG().nextFloat() < 0.5F) {
            Path path = this.PrehistoricFloraWalkingAmphibianBase.getNavigator().getPath();
            if (this.PrehistoricFloraWalkingAmphibianBase.getNavigator().noPath()) {
                //Prefer water targets:
                BlockPos vec3;
                if (!(this.PrehistoricFloraWalkingAmphibianBase.isNearWater(this.entity, this.entity.getPosition()))) {
                    //System.err.println("I'm not in a safe place!");
                    vec3 = this.findWaterTarget(32);
                    if (vec3 == null) {
                        vec3 = this.findLandTarget();
                        if (vec3 == null) {
                            vec3 = this.findAnyTarget();
                        }
                    }
                }
                else {
                    if (Math.random() > this.waterPreference) {

                        if (!this.mustUpdate && !this.PrehistoricFloraWalkingAmphibianBase.isReallyInWater() && this.executionChance > 0)
                        {
                            if (this.PrehistoricFloraWalkingAmphibianBase.getIdleTime() >= 100)
                            {
                                return false;
                            }

                            if (this.PrehistoricFloraWalkingAmphibianBase.getRNG().nextInt(this.executionChance) != 0)
                            {
                                return false;
                            }
                        }

                        vec3 = this.findLandTarget();
                    } else {
                        vec3 = this.findWaterTarget(16);
                    }
                }
                if (vec3 != null) {
                    this.PrehistoricFloraWalkingAmphibianBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY())  , vec3.getZ() + 0.5D, 1.0);
                    this.mustUpdate = false;
                    return true;
                }
            }
        }
        //System.err.println("No path found");
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isAtBottom(BlockPos blockpos) {
        //System.err.println("Testing position");
        if (blockpos.getY() - 1 > 1) {
            BlockPos pos = blockpos.down();
            return (((this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos)).getMaterial() == Material.WATER || (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos)).getMaterial() == Material.CORAL)
                    && ((this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(pos)).getMaterial() != Material.WATER));
        }
        return true;
    }

    public BlockPos findWaterTarget(int dist) {
        //System.err.println("Find Water Target");
        Random rand = this.PrehistoricFloraWalkingAmphibianBase.getRNG();
        if (this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < dist; i++) {
                BlockPos randPos = this.PrehistoricFloraWalkingAmphibianBase.getPosition().add(rand.nextInt(dist) - (int) (dist/2), rand.nextInt(dist) - (int) (dist/2), rand.nextInt(dist) - (int) (dist/2));
                //Use targets which are at the bottom:
                BlockPos randPosVar = randPos;
                if (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(randPos).getMaterial() == Material.WATER && !isAtBottom(randPos)) {
                    int ii = 0;
                    while ((randPos.down(ii).getY() > 1) && this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(randPos.down(ii)).getMaterial() == Material.WATER) {
                        randPosVar = randPos.down(ii);
                        ii = ii + 1;
                    }
                    randPos = randPosVar;
                }

                //System.err.println("Target " + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                if (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(randPos).getMaterial() == Material.WATER) {
                    //System.err.println("Target :" + randPos.getX() + " " + randPos.getY() + " " + randPos.getZ());
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        } else { //allow attacks only under water:
            BlockPos blockpos1;
            blockpos1 = new BlockPos(this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget());
            if (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public BlockPos findLandTarget() {
        //System.err.println("Find Land Target");
        BlockPos blockpos1;
        if (this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                if (vec3d != null) {
                    blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                    if ((this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER)
                            || (isNearWater(this.entity, blockpos1, this.PrehistoricFloraWalkingAmphibianBase.WaterDist()))
                    ) {
                        //System.err.println("Target :" + vec3d.x + " " + vec3d.y + " " + vec3d.z);
                        if (!(blockpos1.getY() < 1 || blockpos1.getY() >= 254)) {
                            return blockpos1;
                        }
                    }
                }
            }
        }
        else { //allow attacks only under water:
            blockpos1 = new BlockPos(this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget());
            if (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public BlockPos findAnyTarget() {
        //System.err.println("Find Any Target");
        BlockPos blockpos1;
        if (this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 10; i++) {
                Vec3d vec3d = this.entity.getRNG().nextFloat() >= this.probability ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
                if (vec3d != null) {
                    blockpos1 = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
                    //System.err.println("Target :" + vec3d.x + " " + vec3d.y + " " + vec3d.z);
                    if (!(blockpos1.getY() < 1 || blockpos1.getY() >= 254)) {
                        return blockpos1;
                    }
                }
            }
        }
        else { //allow attacks only under water:
            blockpos1 = new BlockPos(this.PrehistoricFloraWalkingAmphibianBase.getAttackTarget());
            if (this.PrehistoricFloraWalkingAmphibianBase.world.getBlockState(blockpos1).getMaterial() == Material.WATER) {
                return blockpos1;
            }
        }
        return null;
    }

    public boolean isNearWater(Entity e, BlockPos pos, int WaterDist) {
        int distH = WaterDist;
        if (distH < 1) distH = 1;
        if (distH > 32) distH = 32;
        int distV = 4;
        boolean waterCriteria = false;
        int xct = -distH;
        int yct;
        int zct;
        while ((xct <= distH) && (!waterCriteria)) {
            yct = -distV;
            while ((yct <= distV) && (!waterCriteria)) {
                zct = -distH;
                while ((zct <= distH) && (!waterCriteria)) {
                    if ((Math.pow((int) Math.abs(xct),2) + Math.pow((int) Math.abs(zct),2) <= Math.pow((int) distH,2)) && ((e.world.getBlockState(new BlockPos(pos.getX() + xct, pos.getY() + yct, pos.getZ() + zct))).getMaterial() == Material.WATER)) {
                        waterCriteria = true;
                        //System.err.println("start target: " + (pos.getX()) + " " +  (pos.getY()) + " " + (pos.getZ()));
                        //System.err.println("water at: " + (pos.getX() + xct) + " " +  (pos.getY() + yct) + " " + (pos.getZ() + zct));
                    }
                    zct = zct + 1;
                }
                yct = yct + 1;
            }
            xct = xct + 1;
        }

        if (waterCriteria || (WaterDist == 0)) return true;

        return false;

    }

}