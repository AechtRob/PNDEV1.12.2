package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelFacivermis extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bodybase;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer tube;

    public float scaler;

    public ModelFacivermis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 38.0F, 0.0F);


        this.bodybase = new AdvancedModelRenderer(this);
        this.bodybase.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.bone.addChild(bodybase);
        this.bodybase.cubeList.add(new ModelBox(bodybase, 0, 12, -1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.bodybase.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 26, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 26, -0.99F, -4.01F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 26, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 26, -0.99F, -4.01F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 12, 12, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 12, 12, -0.99F, -4.01F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 12, 12, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 12, 12, -0.99F, -4.01F, -1.0F, 2, 4, 2, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 12, 12, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -2.5F, 0.0F);
        this.body9.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.3491F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.body9.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.2618F, 0.5236F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 0, 0.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -2.5F, 0.0F);
        this.body9.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.3491F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 6, -12.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.body9.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, -0.2618F, -0.5236F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 6, -12.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 12, 12, -0.99F, -4.01F, -1.0F, 2, 4, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -3.0F, 0.0F);
        this.body10.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.6109F, -0.6981F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 0, 0.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.body10.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.5236F, -0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 0, 0.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body10.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.4363F, -0.0873F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 0, 0.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.0F, -3.0F, 0.0F);
        this.body10.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.6109F, 0.6981F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 6, -12.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -1.5F, 0.0F);
        this.body10.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.5236F, 0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 6, -12.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body10.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.4363F, 0.0873F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 6, -12.0F, -6.0F, 0.0F, 12, 6, 0, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body10.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 10, 18, -1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 12, -1.25F, -2.0F, 0.05F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 18, -0.5F, -3.25F, -0.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 12, 0.25F, -2.0F, 0.05F, 1, 1, 1, 0.0F, false));

        this.tube = new AdvancedModelRenderer(this);
        this.tube.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(tube);
        this.tube.cubeList.add(new ModelBox(tube, 20, 17, 1.5F, -26.0F, -1.5F, 0, 12, 3, 0.0F, false));
        this.tube.cubeList.add(new ModelBox(tube, 20, 17, -1.5F, -26.0F, -1.5F, 0, 12, 3, 0.0F, false));
        this.tube.cubeList.add(new ModelBox(tube, 20, 20, -1.5F, -26.0F, -1.5F, 3, 12, 0, 0.0F, false));
        this.tube.cubeList.add(new ModelBox(tube, 21, 20, -1.5F, -26.0F, 1.5F, 3, 12, 0, 0.0F, false));
        this.tube.cubeList.add(new ModelBox(tube, 20, 20, -1.5F, -14.0F, -1.5F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        //System.err.println(hidden);

        this.bone.offsetY = 1.95F;

        AdvancedModelRenderer[] bodyFull = {this.body6, this.body7, this.body8, this.body9, this.body10, this.head};
        float speed = 0.091F;
        if (this.scaler > 0.1F) {
            this.chainWave(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);
            this.chainFlap(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);
            float floatSwing = 0.5F;
            float floatFlap = 0.1F;
            this.swing(legL5, 0.08F, floatSwing, false, 0, 0, f, 1F);
            this.flap(legL5, 0.08F, floatFlap, false, 0, 0, f, 1F);
            this.swing(legL4, 0.08F, floatSwing, false, 0.5F, 0, f, 1F);
            this.flap(legL4, 0.08F, floatFlap, false, 0.5F, 0, f, 1F);
            this.swing(legL3, 0.08F, floatSwing, false, 1F, 0, f, 1F);
            this.flap(legL3, 0.08F, floatFlap, false, 1F, 0, f, 1F);
            this.swing(legL2, 0.08F, floatSwing, false, 1.5F, 0, f, 1F);
            this.flap(legL2, 0.08F, floatFlap, false, 1.5F, 0, f, 1F);
            this.swing(legL, 0.08F, floatSwing, false, 2F, 0, f, 1F);
            this.flap(legL, 0.08F, floatFlap, false, 2F, 0, f, 1F);

            this.swing(legR5, 0.08F, -floatSwing, false, 0, 0, f, 1F);
            this.flap(legR5, 0.08F, floatFlap, false, 0, 0, f, 1F);
            this.swing(legR4, 0.08F, -floatSwing, false, 0.5F, 0, f, 1F);
            this.flap(legR4, 0.08F, floatFlap, false, 0.5F, 0, f, 1F);
            this.swing(legR3, 0.08F, -floatSwing, false, 1F, 0, f, 1F);
            this.flap(legR3, 0.08F, floatFlap, false, 1F, 0, f, 1F);
            this.swing(legR2, 0.08F, -floatSwing, false, 1.5F, 0, f, 1F);
            this.flap(legR2, 0.08F, floatFlap, false, 1.5F, 0, f, 1F);
            this.swing(legR, 0.08F, -floatSwing, false, 2F, 0, f, 1F);
            this.flap(legR, 0.08F, floatFlap, false, 2F, 0, f, 1F);

        }
        this.bone.render(0.019f);

    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
