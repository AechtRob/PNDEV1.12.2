package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public abstract class EntityPrehistoricFloraWaterGastropodBase extends EntityPrehistoricFloraTrilobiteBottomBase {

    private int slitherStage;
    private boolean slitherState;
    private int rotationStage;
    private int slitherTickCycle;

    public EntityPrehistoricFloraWaterGastropodBase(World world) {
        super(world);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.chainBuffer = new ChainBuffer();
        }
        this.slitherTickCycle = 20;
    }

    public EntityPrehistoricFloraWaterGastropodBase(World world, int slitherTickCycle) {
        super(world);
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