package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerCentrifugePhial extends AdvancedModelBase {
    public final AdvancedModelRenderer phial1centre;
    public final AdvancedModelRenderer phial1pivot;
    private final AdvancedModelRenderer phial1b_r1;
    private final AdvancedModelRenderer phial1a_r1;

    public ModelDNARecombinerCentrifugePhial() {
        this.textureWidth = 8;
        this.textureHeight = 8;

        this.phial1centre = new AdvancedModelRenderer(this);
        this.phial1centre.setRotationPoint(0.0F, 14.5F, 0.0F);


        this.phial1pivot = new AdvancedModelRenderer(this);
        this.phial1pivot.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.phial1centre.addChild(phial1pivot);


        this.phial1b_r1 = new AdvancedModelRenderer(this);
        this.phial1b_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.phial1pivot.addChild(phial1b_r1);
        this.setRotateAngle(phial1b_r1, 0.0F, 0.7854F, 0.0F);
        this.phial1b_r1.cubeList.add(new ModelBox(phial1b_r1, 0, -4, 0.0F, -4.0F, -2.0F, 0, 8, 4, 0.0F, false));

        this.phial1a_r1 = new AdvancedModelRenderer(this);
        this.phial1a_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.phial1pivot.addChild(phial1a_r1);
        this.setRotateAngle(phial1a_r1, 0.0F, -0.7854F, 0.0F);
        this.phial1a_r1.cubeList.add(new ModelBox(phial1a_r1, 0, -4, 0.0F, -4.0F, -2.0F, 0, 8, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        phial1centre.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
