package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMixopterus extends AdvancedModelBase {
    private final AdvancedModelRenderer fossil;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer R1R;
    private final AdvancedModelRenderer R2R;
    private final AdvancedModelRenderer leg2_1R_r1;
    private final AdvancedModelRenderer leg22R;
    private final AdvancedModelRenderer leg2_2R_r1;
    private final AdvancedModelRenderer R3R;
    private final AdvancedModelRenderer R4R;
    private final AdvancedModelRenderer R5R;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer L1L;
    private final AdvancedModelRenderer L2L;
    private final AdvancedModelRenderer leg2_1L_r1;
    private final AdvancedModelRenderer leg22L;
    private final AdvancedModelRenderer leg2_2L_r1;
    private final AdvancedModelRenderer L3L;
    private final AdvancedModelRenderer L4L;
    private final AdvancedModelRenderer L5L;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    public ModelSkeletonMixopterus() {
        this.textureWidth = 64;
        this.textureHeight = 128;

        this.fossil = new AdvancedModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -6.0F, -1.0F, -26.0F, 16, 1, 16, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -3.0F, -1.0F, -10.0F, 16, 1, 16, -0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -2.0F, -1.0F, 6.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -14.0F, -1.0F, 8.0F, 16, 1, 16, -0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -5.0F, -1.0F, 17.0F, 16, 1, 16, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -10.0F, -1.0F, 24.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -13.0F, -1.0F, -23.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 111, -13.0F, -1.0F, -7.0F, 16, 1, 16, 0.0F, false));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, -0.025F, 0.0F);
        this.fossil.addChild(carapace);
        this.setRotateAngle(carapace, 0.0F, 0.0873F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 20, 20, -4.0F, -3.0F, -8.0F, 8, 3, 8, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.carapace.addChild(legsR);


        this.R1R = new AdvancedModelRenderer(this);
        this.R1R.setRotationPoint(-2.0F, -2.0F, -8.0F);
        this.legsR.addChild(R1R);
        this.R1R.cubeList.add(new ModelBox(R1R, 0, 24, -4.5F, 0.9F, -8.0F, 6, 0, 8, 0.0F, false));

        this.R2R = new AdvancedModelRenderer(this);
        this.R2R.setRotationPoint(-3.0F, -2.0F, -7.0F);
        this.legsR.addChild(R2R);
        this.setRotateAngle(R2R, 0.0F, 0.1309F, 0.0F);


        this.leg2_1R_r1 = new AdvancedModelRenderer(this);
        this.leg2_1R_r1.setRotationPoint(3.0F, 2.0F, 7.0F);
        this.R2R.addChild(leg2_1R_r1);
        this.setRotateAngle(leg2_1R_r1, 0.0F, -0.5236F, 0.0F);
        this.leg2_1R_r1.cubeList.add(new ModelBox(leg2_1R_r1, 42, 31, -12.0F, -2.0F, -6.0F, 6, 2, 2, 0.0F, false));

        this.leg22R = new AdvancedModelRenderer(this);
        this.leg22R.setRotationPoint(-4.5F, 0.5F, -3.5F);
        this.R2R.addChild(leg22R);
        this.setRotateAngle(leg22R, 0.0F, 0.0436F, 0.0F);


        this.leg2_2R_r1 = new AdvancedModelRenderer(this);
        this.leg2_2R_r1.setRotationPoint(7.5F, 1.5F, 10.5F);
        this.leg22R.addChild(leg2_2R_r1);
        this.setRotateAngle(leg2_2R_r1, 0.0F, 0.2618F, 0.0F);
        this.leg2_2R_r1.cubeList.add(new ModelBox(leg2_2R_r1, 0, 0, -6.0F, -1.0F, -24.0F, 8, 0, 12, 0.0F, false));

        this.R3R = new AdvancedModelRenderer(this);
        this.R3R.setRotationPoint(-3.0F, -2.0F, -5.0F);
        this.legsR.addChild(R3R);
        this.setRotateAngle(R3R, 0.0F, -0.3054F, 0.0F);
        this.R3R.cubeList.add(new ModelBox(R3R, 44, 24, -6.0F, 0.5F, 0.0F, 6, 1, 1, 0.0F, false));
        this.R3R.cubeList.add(new ModelBox(R3R, 46, 41, -6.0F, 1.0F, 0.5F, 5, 0, 1, 0.0F, false));

        this.R4R = new AdvancedModelRenderer(this);
        this.R4R.setRotationPoint(-3.0F, -2.0F, -3.0F);
        this.legsR.addChild(R4R);
        this.setRotateAngle(R4R, 0.0F, -0.1745F, 0.0F);
        this.R4R.cubeList.add(new ModelBox(R4R, 46, 41, -6.0F, 1.0F, 0.5F, 5, 0, 1, 0.0F, false));
        this.R4R.cubeList.add(new ModelBox(R4R, 44, 26, -6.0F, 0.5F, 0.0F, 6, 1, 1, 0.0F, false));

        this.R5R = new AdvancedModelRenderer(this);
        this.R5R.setRotationPoint(-3.0F, -2.0F, 0.0F);
        this.legsR.addChild(R5R);
        this.setRotateAngle(R5R, 0.0F, 0.829F, 0.0F);
        this.R5R.cubeList.add(new ModelBox(R5R, 0, 32, -10.0F, 0.25F, -1.0F, 6, 1, 3, 0.0F, false));
        this.R5R.cubeList.add(new ModelBox(R5R, 0, 24, -12.0F, 0.25F, -1.0F, 2, 1, 2, 0.0F, false));
        this.R5R.cubeList.add(new ModelBox(R5R, 0, 16, -4.0F, 0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.carapace.addChild(legsL);


        this.L1L = new AdvancedModelRenderer(this);
        this.L1L.setRotationPoint(2.0F, -2.0F, -8.0F);
        this.legsL.addChild(L1L);
        this.L1L.cubeList.add(new ModelBox(L1L, 20, 12, -1.5F, 0.9F, -8.0F, 6, 0, 8, 0.0F, false));

        this.L2L = new AdvancedModelRenderer(this);
        this.L2L.setRotationPoint(3.0F, -2.0F, -7.0F);
        this.legsL.addChild(L2L);


        this.leg2_1L_r1 = new AdvancedModelRenderer(this);
        this.leg2_1L_r1.setRotationPoint(-3.0F, 2.0F, 7.0F);
        this.L2L.addChild(leg2_1L_r1);
        this.setRotateAngle(leg2_1L_r1, 0.0F, 0.5236F, 0.0F);
        this.leg2_1L_r1.cubeList.add(new ModelBox(leg2_1L_r1, 0, 43, 6.0F, -2.0F, -6.0F, 6, 2, 2, 0.0F, false));

        this.leg22L = new AdvancedModelRenderer(this);
        this.leg22L.setRotationPoint(4.5F, 0.5F, -3.5F);
        this.L2L.addChild(leg22L);
        this.setRotateAngle(leg22L, 0.0F, -0.0873F, 0.0F);


        this.leg2_2L_r1 = new AdvancedModelRenderer(this);
        this.leg2_2L_r1.setRotationPoint(-7.5F, 1.5F, 10.5F);
        this.leg22L.addChild(leg2_2L_r1);
        this.setRotateAngle(leg2_2L_r1, 0.0F, -0.2618F, 0.0F);
        this.leg2_2L_r1.cubeList.add(new ModelBox(leg2_2L_r1, 0, 12, -2.0F, -1.0F, -24.0F, 8, 0, 12, 0.0F, false));

        this.L3L = new AdvancedModelRenderer(this);
        this.L3L.setRotationPoint(3.0F, -2.0F, -5.0F);
        this.legsL.addChild(L3L);
        this.setRotateAngle(L3L, 0.0F, 0.2618F, 0.0F);
        this.L3L.cubeList.add(new ModelBox(L3L, 42, 35, 0.0F, 0.5F, 0.0F, 6, 1, 1, 0.0F, false));
        this.L3L.cubeList.add(new ModelBox(L3L, 46, 41, 1.0F, 1.0F, 0.5F, 5, 0, 1, 0.0F, false));

        this.L4L = new AdvancedModelRenderer(this);
        this.L4L.setRotationPoint(3.0F, -2.0F, -3.0F);
        this.legsL.addChild(L4L);
        this.setRotateAngle(L4L, 0.0F, 0.1745F, 0.0F);
        this.L4L.cubeList.add(new ModelBox(L4L, 46, 41, 1.0F, 1.0F, 0.5F, 5, 0, 1, 0.0F, false));
        this.L4L.cubeList.add(new ModelBox(L4L, 0, 36, 0.0F, 0.5F, 0.0F, 6, 1, 1, 0.0F, false));

        this.L5L = new AdvancedModelRenderer(this);
        this.L5L.setRotationPoint(3.0F, -2.0F, 0.0F);
        this.legsL.addChild(L5L);
        this.setRotateAngle(L5L, 0.0F, -0.6981F, 0.0F);
        this.L5L.cubeList.add(new ModelBox(L5L, 20, 24, 10.0F, 0.25F, -1.0F, 2, 1, 2, 0.0F, false));
        this.L5L.cubeList.add(new ModelBox(L5L, 0, 39, 4.0F, 0.25F, -1.0F, 6, 1, 3, 0.0F, false));
        this.L5L.cubeList.add(new ModelBox(L5L, 0, 19, 0.0F, 0.25F, -1.0F, 4, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.carapace.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 26, 45, -2.5F, 1.0F, 0.0F, 5, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 51, -2.99F, 0.99F, 2.0F, 6, 3, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 37, 2.5F, 2.0F, 0.0F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 45, -4.5F, 2.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 34, 3.0F, 1.5F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 33, 5, -3.0F, 0.5F, 0.0F, 6, 3, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 34, -5.0F, 1.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, -0.0436F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 55, -3.0F, 0.5F, 0.0F, 6, 3, 3, -0.001F, false));
        this.body3.cubeList.add(new ModelBox(body3, 32, 51, 3.01F, 1.51F, 0.0F, 2, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 20, 51, -5.01F, 1.51F, 0.0F, 2, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 51, -2.99F, 0.49F, 0.0F, 6, 3, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 11, 2.5F, 1.5F, 0.0F, 2, 1, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 39, -2.5F, 0.5F, 1.0F, 5, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 6, -4.5F, 1.5F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, 0.0F, -0.1309F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 40, 12, -2.0F, 1.5F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.0436F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 39, -1.999F, 1.49F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, -0.0436F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 45, -1.5F, 1.5F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.0873F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 44, 18, -1.499F, 1.49F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.1745F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -1.0F, 1.5F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, 0.7418F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 24, 31, -0.5F, 2.0F, 0.0F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
