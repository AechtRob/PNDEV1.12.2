package net.lepidodendron.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class AvoidWaterWanderAI extends EntityAIWander
{
    protected final float probability;

    public AvoidWaterWanderAI(EntityCreature EntityCreature, double chance)
    {
        this(EntityCreature, chance, 0.001F);
    }

    public AvoidWaterWanderAI(EntityCreature EntityCreature, double chance, float probability)
    {
        super(EntityCreature, chance);
        this.probability = probability;
    }

    protected Vec3d getPosition()
    {
        Vec3d vecRnd = RandomPositionGenerator.findRandomTarget(this.entity, 10, 7);
        if (this.entity.isInWater())
        {
            Vec3d vec3d = RandomPositionGenerator.getLandPos(this.entity, 15, 7);
            return vec3d == null ? vecRnd : vec3d;
        }
        else
        {
            return this.entity.getRNG().nextFloat() >= 0.001 ? RandomPositionGenerator.getLandPos(this.entity, 10, 7) : vecRnd;
        }
    }

    @Override
    public boolean shouldExecute() {

        if (!this.mustUpdate) {
            if (this.entity.getIdleTime() >= 100) {
                //System.err.println("Idle time");
                return false;
            }

            if (this.entity.getRNG().nextInt(this.executionChance) != 0) {
                //System.err.println("Chance");
                return false;
            }
        }

        Vec3d vec3d = getPosition();

        if (vec3d == null) {
            //System.err.println("Null target");
            return false;
        } else {
            if (this.entity.getNavigator().noPath()) {
                this.x = vec3d.x;
                this.y = vec3d.y;
                this.z = vec3d.z;
                this.mustUpdate = false;
                //System.err.println("target: " + this.x + " " + this.y + " " + this.z);
                return true;
            }
        }
        return false;
    }

}
