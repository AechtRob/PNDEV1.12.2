package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelDNARecombinerClaw extends AdvancedModelBase {
    private final AdvancedModelRenderer claw;
    public final AdvancedModelRenderer finger1;
    public final AdvancedModelRenderer finger1_b;
    public final AdvancedModelRenderer finger2;
    public final AdvancedModelRenderer finger1_b2;
    public final AdvancedModelRenderer finger3;
    public final AdvancedModelRenderer finger1_b3;
    public final AdvancedModelRenderer wire;

    public ModelDNARecombinerClaw() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.claw = new AdvancedModelRenderer(this);
        this.claw.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.claw.cubeList.add(new ModelBox(claw, 4, 7, -1.0F, -12.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.finger1 = new AdvancedModelRenderer(this);
        this.finger1.setRotationPoint(1.16F, -10.0F, 0.0F);
        this.claw.addChild(finger1);
        this.setRotateAngle(finger1, -0.3927F, -1.5708F, 0.0F);
        this.finger1.cubeList.add(new ModelBox(finger1, 6, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.finger1_b = new AdvancedModelRenderer(this);
        this.finger1_b.setRotationPoint(-0.66F, 4.0F, 0.0F);
        this.finger1.addChild(finger1_b);
        this.setRotateAngle(finger1_b, 0.6981F, 0.0F, 0.0F);
        this.finger1_b.cubeList.add(new ModelBox(finger1_b, 5, 7, 0.16F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.finger2 = new AdvancedModelRenderer(this);
        this.finger2.setRotationPoint(-0.84F, -10.0F, 1.0F);
        this.claw.addChild(finger2);
        this.setRotateAngle(finger2, -0.3927F, 2.618F, 0.0F);
        this.finger2.cubeList.add(new ModelBox(finger2, 6, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.finger1_b2 = new AdvancedModelRenderer(this);
        this.finger1_b2.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.finger2.addChild(finger1_b2);
        this.setRotateAngle(finger1_b2, 0.6981F, 0.0F, 0.0F);
        this.finger1_b2.cubeList.add(new ModelBox(finger1_b2, 6, 6, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.finger3 = new AdvancedModelRenderer(this);
        this.finger3.setRotationPoint(-0.84F, -10.0F, -1.0F);
        this.claw.addChild(finger3);
        this.setRotateAngle(finger3, -0.3927F, 0.5236F, 0.0F);
        this.finger3.cubeList.add(new ModelBox(finger3, 5, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

        this.finger1_b3 = new AdvancedModelRenderer(this);
        this.finger1_b3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.finger3.addChild(finger1_b3);
        this.setRotateAngle(finger1_b3, 0.6981F, 0.0F, 0.0F);
        this.finger1_b3.cubeList.add(new ModelBox(finger1_b3, 5, 7, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.wire = new AdvancedModelRenderer(this);
        this.wire.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.claw.addChild(wire);
        this.wire.cubeList.add(new ModelBox(wire, 6, 5, -0.5F, -14.0F, -0.5F, 1, 3, 1, -0.2F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        claw.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
