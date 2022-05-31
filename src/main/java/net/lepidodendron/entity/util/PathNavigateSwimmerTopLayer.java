package net.lepidodendron.entity.util;

import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

public class PathNavigateSwimmerTopLayer extends PathNavigate
{
    public PathNavigateSwimmerTopLayer(EntityLiving entitylivingIn, World worldIn)
    {
        super(entitylivingIn, worldIn);
    }

    @Override
    public boolean tryMoveToXYZ(double x, double y, double z, double speedIn)
    {
        //System.err.println("getPathToXYZ is null " + (this.getPathToXYZ(x, y, z) == null));
        return this.setPath(this.getPathToXYZ(x, y, z), speedIn);
    }

    protected PathFinder getPathFinder()
    {
        return new PathFinder(new WalkNodeProcessorNoWater_TEST());
        //return new PathFinder(new SwimNodeProcessorTopLayer());
    }

    protected boolean canNavigate()
    {
        if (this.entity instanceof EntityPrehistoricFloraLandBase) {
            EntityPrehistoricFloraLandBase e = (EntityPrehistoricFloraLandBase) this.entity;
            if (e.isReallyInWater()) {
                //System.err.println("Can navigate");
                return true;
            }
        }
        return this.isInLiquid();
    }

    protected Vec3d getEntityPosition()
    {
        return new Vec3d(this.entity.posX, this.entity.posY + (double)this.entity.height * 0.5D, this.entity.posZ);
    }

    protected void pathFollow()
    {
        Vec3d vec3d = this.getEntityPosition();
        float f = this.entity.width * this.entity.width;
        int i = 6;

        if (vec3d.squareDistanceTo(this.currentPath.getVectorFromIndex(this.entity, this.currentPath.getCurrentPathIndex())) < (double)f)
        {
            this.currentPath.incrementPathIndex();
        }

        for (int j = Math.min(this.currentPath.getCurrentPathIndex() + 6, this.currentPath.getCurrentPathLength() - 1); j > this.currentPath.getCurrentPathIndex(); --j)
        {
            Vec3d vec3d1 = this.currentPath.getVectorFromIndex(this.entity, j);

            //System.err.println("Pathdirect:" + this.isDirectPathBetweenPoints(vec3d, vec3d1, 0, 0, 0));

            if (vec3d1.squareDistanceTo(vec3d) <= 36.0D && this.isDirectPathBetweenPoints(vec3d, vec3d1, 0, 0, 0))
            {
                this.currentPath.setCurrentPathIndex(j);
                break;
            }
        }

        this.checkForStuck(vec3d);
    }

    protected boolean isDirectPathBetweenPoints(Vec3d posVec31, Vec3d posVec32, int sizeX, int sizeY, int sizeZ)
    {
        RayTraceResult raytraceresult = this.world.rayTraceBlocks(posVec31, new Vec3d(posVec32.x, posVec32.y + (double)this.entity.height * 0.5D, posVec32.z), false, true, false);
        return raytraceresult == null || raytraceresult.typeOfHit == RayTraceResult.Type.MISS;
    }

    public boolean canEntityStandOnPos(BlockPos pos)
    {
        //System.err.println("canEntityStandOnPos: " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " " + this.world.getBlockState(pos).isFullBlock());
        //return !this.world.getBlockState(pos).isFullBlock();
        return true;
    }

    @Override
    public void onUpdateNavigation()
    {
        ++this.totalTicks;

        if (this.tryUpdatePath)
        {
            this.updatePath();
        }

        if (!this.noPath())
        {
            if (this.canNavigate())
            {
                this.pathFollow();
            }
            else if (this.currentPath != null && this.currentPath.getCurrentPathIndex() < this.currentPath.getCurrentPathLength())
            {
                Vec3d vec3d = this.getEntityPosition();
                Vec3d vec3d1 = this.currentPath.getVectorFromIndex(this.entity, this.currentPath.getCurrentPathIndex());

                if (vec3d.y > vec3d1.y && !this.entity.onGround && MathHelper.floor(vec3d.x) == MathHelper.floor(vec3d1.x) && MathHelper.floor(vec3d.z) == MathHelper.floor(vec3d1.z))
                {
                    this.currentPath.setCurrentPathIndex(this.currentPath.getCurrentPathIndex() + 1);
                }
            }

            this.debugPathFinding();

            if (!this.noPath())
            {
                Vec3d vec3d2 = this.currentPath.getPosition(this.entity);
                BlockPos blockpos = (new BlockPos(vec3d2)).down();
                AxisAlignedBB axisalignedbb = this.world.getBlockState(blockpos).getBoundingBox(this.world, blockpos);
                vec3d2 = vec3d2.subtract(0.0D, 1.0D - axisalignedbb.maxY, 0.0D);
                this.entity.getMoveHelper().setMoveTo(vec3d2.x, vec3d2.y, vec3d2.z, this.speed);
            }
        }
    }



}
