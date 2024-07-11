package net.lepidodendron.entity.ai;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSwimmingAmphibianBase;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class NightFindNestAquaticAI extends AnimationAINoAnimation<EntityPrehistoricFloraSwimmingAmphibianBase> {

    protected EntityPrehistoricFloraSwimmingAmphibianBase EntityPrehistoricFloraSwimmingAmphibianBase;
    protected boolean isNocturnal;

    public NightFindNestAquaticAI(EntityPrehistoricFloraSwimmingAmphibianBase creatureIn)
    {
        this(creatureIn, false);
    }

    public NightFindNestAquaticAI(EntityPrehistoricFloraSwimmingAmphibianBase EntityPrehistoricFloraSwimmingAmphibianBase, boolean nocturnal)
    {
        super(EntityPrehistoricFloraSwimmingAmphibianBase);
        setMutexBits(1);
        this.EntityPrehistoricFloraSwimmingAmphibianBase = EntityPrehistoricFloraSwimmingAmphibianBase;
        this.isNocturnal = nocturnal;
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

        if (this.EntityPrehistoricFloraSwimmingAmphibianBase.world.isDaytime() && !isNocturnal) {
            return false;
        }
        if (!this.EntityPrehistoricFloraSwimmingAmphibianBase.world.isDaytime() && isNocturnal) {
            return false;
        }

        if (this.EntityPrehistoricFloraSwimmingAmphibianBase.isReallyInWater()) {
            return false;
        }

        int xx;
        int yy;
        int zz;
        BlockPos vec3 = null;

        Path path = this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().getPath();
        if ((!this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().noPath()) && path != null) {
            xx = this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().getPath().getFinalPathPoint().x;
            yy = this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().getPath().getFinalPathPoint().y;
            zz = this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().getPath().getFinalPathPoint().z;
            BlockPos pos = new BlockPos(xx, yy, zz);
            World world = this.EntityPrehistoricFloraSwimmingAmphibianBase.world;
            if (this.EntityPrehistoricFloraSwimmingAmphibianBase.isHomeableNest(world, pos)) {
                vec3 = pos;
            } else {
                vec3 = this.findBlockTarget(32);
            }
        }
        else {
            vec3 = this.findRandomBlockTarget(32);
        }

        if (vec3 != null) {

            this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().tryMoveToXYZ(vec3.getX() + 0.5D, Math.floor(vec3.getY()) + 0.5D  , vec3.getZ() + 0.5D, 1.0);
            if (((this.EntityPrehistoricFloraSwimmingAmphibianBase.getNavigator().noPath()) || path == null)) {
                BlockPos pos = new BlockPos(vec3.getX() + 0.5D, Math.floor(vec3.getY()) + 0.5, vec3.getZ() + 0.5D);
                if (this.EntityPrehistoricFloraSwimmingAmphibianBase.getNestLocation() == pos && this.EntityPrehistoricFloraSwimmingAmphibianBase.getPosition() != pos) {
                    this.EntityPrehistoricFloraSwimmingAmphibianBase.setNestLocation(null);
                }
            }

            return true;
        }

        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        return false;
    }

    public boolean isDirectPathBetweenPoints(Entity entity, Vec3d vec1, Vec3d vec2) {
        RayTraceResult movingobjectposition = entity.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y + (double) entity.height * 0.5D, vec2.z), false, true, false);
        return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
    }

    public BlockPos findBlockTarget(int dist) {
        if (this.EntityPrehistoricFloraSwimmingAmphibianBase.getNestLocation() != null) {
            return this.EntityPrehistoricFloraSwimmingAmphibianBase.getNestLocation();
        }
        return this.EntityPrehistoricFloraSwimmingAmphibianBase.findNest(this.EntityPrehistoricFloraSwimmingAmphibianBase, dist, false);
    }

    public BlockPos findRandomBlockTarget(int dist) {
        Random rand = this.EntityPrehistoricFloraSwimmingAmphibianBase.getRNG();
        if (this.EntityPrehistoricFloraSwimmingAmphibianBase.getAttackTarget() == null) {
            for (int i = 0; i < 64; i++) {
                BlockPos randPos = this.EntityPrehistoricFloraSwimmingAmphibianBase.getPosition().add(rand.nextInt(dist+1) - (int) (dist/2), rand.nextInt((int) (dist/2)+1) - (int) (dist/4), rand.nextInt(dist+1) - (int) (dist/2));
                World world = this.EntityPrehistoricFloraSwimmingAmphibianBase.world;
                if (this.EntityPrehistoricFloraSwimmingAmphibianBase.isHomeableNest(world, randPos)) {
                    if (!(randPos.getY() < 1 || randPos.getY() >= 254)) {
                        return randPos;
                    }
                }
            }
        }
        return null;
    }

}