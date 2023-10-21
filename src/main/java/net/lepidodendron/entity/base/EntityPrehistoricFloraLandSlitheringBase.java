package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public abstract class EntityPrehistoricFloraLandSlitheringBase extends EntityPrehistoricFloraLandBase {

    private int slitherStage;
    private boolean slitherState;
    private int rotationStage;
    private int slitherTickCycle;

    public EntityPrehistoricFloraLandSlitheringBase(World world) {
        super(world);
        if (world != null) {
            if (this.isSwimmingInWater() && this.canSwim()) {
                this.moveHelper = new EntityPrehistoricFloraLandSlitheringBase.SwimmingMoveHelper();
                this.navigator = new PathNavigateSwimmerTopLayer(this, world);
            } else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
                this.moveHelper = new EntityPrehistoricFloraLandSlitheringBase.WanderMoveHelper();
                this.navigator = new PathNavigateGroundNoWater(this, world);
            }
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        EAT_ANIMATION = Animation.create(this.getEatLength());
        DRINK_ANIMATION = Animation.create(this.getDrinkLength());

        this.slitherTickCycle = 20;
    }

    public EntityPrehistoricFloraLandSlitheringBase(World world, int slitherTickCycle) {
        super(world);
        if (this.isSwimmingInWater() && this.canSwim()) {
            this.moveHelper = new EntityPrehistoricFloraLandSlitheringBase.SwimmingMoveHelper();
            this.navigator = new PathNavigateSwimmerTopLayer(this, world);
        }
        else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
            this.moveHelper = new EntityPrehistoricFloraLandSlitheringBase.WanderMoveHelper();
            this.navigator = new PathNavigateGroundNoWater(this, world);
        }
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        EAT_ANIMATION = Animation.create(this.getEatLength());
        DRINK_ANIMATION = Animation.create(this.getDrinkLength());

        this.slitherTickCycle = slitherTickCycle;
    }

    public int getSlitherStage() {
        int slitherstage = this.slitherStage;

        return slitherstage;
    }

    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();

        if (!(rotationStage > 0)) {rotationStage = 0;}
        if (rotationStage > 180) {
            rotationStage = 1;
        } else {
            rotationStage = rotationStage + rand.nextInt(2);
        }

        if (!(slitherStage > 0)) {slitherStage = 0;}

        if (slitherState) {
            if (slitherStage > this.slitherTickCycle) {
                slitherState = false;
            } else {
                slitherStage = slitherStage + rand.nextInt(2);
            }
        }

        if (!slitherState) {
            if (slitherStage < 1) {
                slitherState = true;
            } else {
                slitherStage = slitherStage - rand.nextInt(2);
            }
        }

    }

}