package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class LandWanderNestAI extends AnimationAINoAnimation<EntityPrehistoricFloraAgeableBase> {

    protected EntityPrehistoricFloraAgeableBase PrehistoricFloraAgeableBase;

    public LandWanderNestAI(EntityPrehistoricFloraAgeableBase PrehistoricFloraAgeableBase)
    {
        super(PrehistoricFloraAgeableBase);
        setMutexBits(1);
        this.PrehistoricFloraAgeableBase = PrehistoricFloraAgeableBase;
    }

    @Override
    public Animation getAnimation()
    {
        return null;
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

        if (!(this.PrehistoricFloraAgeableBase.laysEggs() && this.PrehistoricFloraAgeableBase.getLaying())) {
            return false;
        }

        if (this.PrehistoricFloraAgeableBase instanceof EntityPrehistoricFloraLandBase)
        {
            EntityPrehistoricFloraLandBase LandBase = (EntityPrehistoricFloraLandBase) this.PrehistoricFloraAgeableBase;
            if (LandBase.isReallyInWater()) {
                return false;
            }

           if (LandBase.isAnimationDirectionLocked(LandBase.getAnimation())) {
               return false;
           }

            if (!(LandBase.getAISpeedLand() > 0)) {
                return false;
            }

        }
        //System.err.println("Ticks: " + this.PrehistoricFloraAgeableBase.getTicks());

        int xx;
        int yy;
        int zz;
        BlockPos vec3 = null;

        Path path = this.PrehistoricFloraAgeableBase.getNavigator().getPath();

        if ((!this.PrehistoricFloraAgeableBase.getNavigator().noPath()) && path != null) {

            xx = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().x;
            yy = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().y;
            zz = this.PrehistoricFloraAgeableBase.getNavigator().getPath().getFinalPathPoint().z;
            BlockPos pos = new BlockPos(xx, yy, zz);
            World world = this.PrehistoricFloraAgeableBase.world;

            if (!this.PrehistoricFloraAgeableBase.isLayableNest(world,  pos)) {
                //Is one beside this OK?
                if (this.PrehistoricFloraAgeableBase.isLayableNest(world, pos.north())) {
                    pos = pos.north();
                }
                else if (this.PrehistoricFloraAgeableBase.isLayableNest(world, pos.east())) {
                    pos = pos.east();
                }
                else if (this.PrehistoricFloraAgeableBase.isLayableNest(world, pos.south())) {
                    pos = pos.south();
                }
                else if (this.PrehistoricFloraAgeableBase.isLayableNest(world, pos.west())) {
                    pos = pos.west();
                }
                else if (this.PrehistoricFloraAgeableBase.getRNG().nextFloat() < 0.033F) {
                    this.PrehistoricFloraAgeableBase.getNavigator().clearPath();
                }
            }

            if (this.PrehistoricFloraAgeableBase.isLayableNest(world, pos)) {
                this.PrehistoricFloraAgeableBase.setNestLocation(pos);
                vec3 = pos;
            } else {
                vec3 = this.findBlockTarget(32);
            }

        }
        else {
            //Path is null, but am I just a fatty who's on top of it nearly?
            if (this.PrehistoricFloraAgeableBase.isLayableNest(this.PrehistoricFloraAgeableBase.world, this.PrehistoricFloraAgeableBase.getPosition().north())) {
                this.PrehistoricFloraAgeableBase.moveToBlockPosAndAngles(this.PrehistoricFloraAgeableBase.getPosition().north(), this.PrehistoricFloraAgeableBase.rotationYaw, this.PrehistoricFloraAgeableBase.rotationPitch);
            }
            else if (this.PrehistoricFloraAgeableBase.isLayableNest(this.PrehistoricFloraAgeableBase.world, this.PrehistoricFloraAgeableBase.getPosition().east())) {
                this.PrehistoricFloraAgeableBase.moveToBlockPosAndAngles(this.PrehistoricFloraAgeableBase.getPosition().east(), this.PrehistoricFloraAgeableBase.rotationYaw, this.PrehistoricFloraAgeableBase.rotationPitch);
            }
            else if (this.PrehistoricFloraAgeableBase.isLayableNest(this.PrehistoricFloraAgeableBase.world, this.PrehistoricFloraAgeableBase.getPosition().south())) {
                this.PrehistoricFloraAgeableBase.moveToBlockPosAndAngles(this.PrehistoricFloraAgeableBase.getPosition().south(), this.PrehistoricFloraAgeableBase.rotationYaw, this.PrehistoricFloraAgeableBase.rotationPitch);
            }
            else if (this.PrehistoricFloraAgeableBase.isLayableNest(this.PrehistoricFloraAgeableBase.world, this.PrehistoricFloraAgeableBase.getPosition().west())) {
                this.PrehistoricFloraAgeableBase.moveToBlockPosAndAngles(this.PrehistoricFloraAgeableBase.getPosition().west(), this.PrehistoricFloraAgeableBase.rotationYaw, this.PrehistoricFloraAgeableBase.rotationPitch);
            }
            else {
                vec3 = this.findRandomBlockTarget(32);
            }
        }

        if (vec3 != null) {
            this.PrehistoricFloraAgeableBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY()) + 0.5D  , vec3.getZ() + 0.5D, 1.0);
            if (((this.PrehistoricFloraAgeableBase.getNavigator().noPath()) || path == null)) {
                BlockPos pos = new BlockPos(vec3.getX() + 0.5D, Math.floor(vec3.getY()) + 0.5, vec3.getZ() + 0.5D);
                if (this.PrehistoricFloraAgeableBase.getNestLocation() == pos && this.PrehistoricFloraAgeableBase.getPosition() != pos) {
                    this.PrehistoricFloraAgeableBase.setNestLocation(null);
                }
            }
            return true;
        }

        return false;
    }

    public BlockPos findBlockTarget(int dist) {
        if (this.PrehistoricFloraAgeableBase.getNestLocation() != null) {
            if (this.PrehistoricFloraAgeableBase.isLayableNest(this.PrehistoricFloraAgeableBase.world, this.PrehistoricFloraAgeableBase.getNestLocation())) {
                return this.PrehistoricFloraAgeableBase.getNestLocation();
            }
            else {
                this.PrehistoricFloraAgeableBase.setNestLocation(null);
            }
        }
        return this.PrehistoricFloraAgeableBase.findNest(this.PrehistoricFloraAgeableBase, dist, true);
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public BlockPos findRandomBlockTarget(int dist) {
        Random rand = this.PrehistoricFloraAgeableBase.getRNG();
        if (this.PrehistoricFloraAgeableBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                BlockPos randPos = this.PrehistoricFloraAgeableBase.getPosition().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt((int) (dist/2)+1) - (int) (dist/4), rand.nextInt(dist+1) - (int) (dist/2));
                World world = this.PrehistoricFloraAgeableBase.world;
                if (this.PrehistoricFloraAgeableBase.isLayableNest(world, randPos)) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        this.PrehistoricFloraAgeableBase.setNestLocation(randPos);
                        return randPos;
                    }
                }
            }
        }
        dist = dist/2;
        BlockPos randPos = this.PrehistoricFloraAgeableBase.getPosition().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt((int) (dist/2)+1) - (int) (dist/4), rand.nextInt(dist+1) - (int) (dist/2));
        return randPos;
    }


}