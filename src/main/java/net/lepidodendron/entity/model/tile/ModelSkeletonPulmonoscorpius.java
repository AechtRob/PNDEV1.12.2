package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPulmonoscorpius extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer abdomen2;
    private final AdvancedModelRenderer abdomen3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL2_r1;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR2_r1;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer legsR;
    private final AdvancedModelRenderer leg1R;
    private final AdvancedModelRenderer leg2R;
    private final AdvancedModelRenderer leg3R;
    private final AdvancedModelRenderer leg4R;
    private final AdvancedModelRenderer legsL;
    private final AdvancedModelRenderer leg1L;
    private final AdvancedModelRenderer leg2L;
    private final AdvancedModelRenderer leg3L;
    private final AdvancedModelRenderer leg4L;

    public ModelSkeletonPulmonoscorpius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 14, 51, -5.0F, -1.0F, -9.0F, 12, 1, 12, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 14, 51, -12.0F, -1.0F, -8.0F, 12, 1, 12, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 14, 51, -11.0F, -1.0F, 1.0F, 12, 1, 12, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 14, 51, -4.0F, -1.0F, -1.0F, 12, 1, 12, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.725F, 0.0F);
        this.bone.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 18, -3.0F, -2.0F, -7.0F, 6, 1, 5, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -2.0F, -2.1F);
        this.body.addChild(abdomen);
        this.setRotateAngle(abdomen, 0.0F, -0.0436F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -2.99F, 0.0F, 0.0F, 6, 1, 8, 0.0F, false));

        this.abdomen2 = new AdvancedModelRenderer(this);
        this.abdomen2.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.abdomen.addChild(abdomen2);
        this.setRotateAngle(abdomen2, 0.0F, -0.0873F, 0.0F);
        this.abdomen2.cubeList.add(new ModelBox(abdomen2, 18, 22, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.abdomen3 = new AdvancedModelRenderer(this);
        this.abdomen3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.abdomen2.addChild(abdomen3);
        this.abdomen3.cubeList.add(new ModelBox(abdomen3, 32, 9, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.abdomen3.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, -0.0873F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 39, 26, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 39, -0.999F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.1309F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 19, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.1745F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 17, 37, -0.999F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.2182F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 38, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 1.4835F, 0.0F, 1.5708F);
        this.tail6.cubeList.add(new ModelBox(tail6, 7, 36, 0.001F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 0, 0.0F, -2.5F, 2.5F, 0, 3, 3, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(2.25F, -1.65F, -10.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.0F, 0.7854F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 31, 31, 0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, -0.5672F, 0.0F);


        this.armL2_r1 = new AdvancedModelRenderer(this);
        this.armL2_r1.setRotationPoint(-6.0F, 2.0F, 8.0F);
        this.armL2.addChild(armL2_r1);
        this.setRotateAngle(armL2_r1, 0.0F, -0.0873F, 0.0F);
        this.armL2_r1.cubeList.add(new ModelBox(armL2_r1, 34, 40, 5.0F, -2.1F, -11.0F, 2, 1, 3, 0.0F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -1.3963F, 0.0F, -1.5708F);
        this.armL3.cubeList.add(new ModelBox(armL3, 33, 35, -1.0F, -0.5F, -3.0F, 1, 2, 3, 0.0F, false));
        this.armL3.cubeList.add(new ModelBox(armL3, 26, 33, -1.0F, -0.45F, -7.0F, 1, 1, 4, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.armL3.addChild(clawL);
        this.setRotateAngle(clawL, 0.2182F, 0.0F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 32, 24, -1.25F, -0.4F, -4.0F, 1, 1, 4, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-1.0F, -1.9F, -8.0F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.0F, 0.5672F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 28, 7, -6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.armR.addChild(armR2);


        this.armR2_r1 = new AdvancedModelRenderer(this);
        this.armR2_r1.setRotationPoint(6.0F, 2.0F, 8.0F);
        this.armR2.addChild(armR2_r1);
        this.setRotateAngle(armR2_r1, 0.0F, 0.0873F, 0.0F);
        this.armR2_r1.cubeList.add(new ModelBox(armR2_r1, 38, 13, -7.0F, -2.1F, -11.0F, 2, 1, 3, 0.0F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(0.0F, 0.15F, -4.0F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, -0.6981F, 0.0F, 1.5708F);
        this.armR3.cubeList.add(new ModelBox(armR3, 32, 13, 0.0F, -0.45F, -7.0F, 1, 1, 4, 0.0F, false));
        this.armR3.cubeList.add(new ModelBox(armR3, 0, 33, 0.0F, -0.5F, -3.0F, 1, 2, 3, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.armR3.addChild(clawR);
        this.setRotateAngle(clawR, 0.1745F, 0.0F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 20, 32, 0.25F, -0.4F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraL);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 0, 0, 0.125F, 0.1F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.body.addChild(cheliceraR);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 34, 4, -2.125F, 0.099F, -2.0F, 2, 1, 2, 0.0F, false));

        this.legsR = new AdvancedModelRenderer(this);
        this.legsR.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsR);


        this.leg1R = new AdvancedModelRenderer(this);
        this.leg1R.setRotationPoint(-2.0F, -2.0F, -6.0F);
        this.legsR.addChild(leg1R);
        this.setRotateAngle(leg1R, -1.5708F, 0.2182F, 0.0F);
        this.leg1R.cubeList.add(new ModelBox(leg1R, 12, 32, -6.0F, -2.0F, -0.75F, 6, 4, 0, 0.0F, true));

        this.leg2R = new AdvancedModelRenderer(this);
        this.leg2R.setRotationPoint(-2.0F, -2.0F, -5.0F);
        this.legsR.addChild(leg2R);
        this.setRotateAngle(leg2R, -1.5708F, 0.3491F, 0.0F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 16, 28, -7.8307F, -2.0F, -0.3675F, 8, 4, 0, 0.0F, true));

        this.leg3R = new AdvancedModelRenderer(this);
        this.leg3R.setRotationPoint(-2.0F, -2.0F, -3.7F);
        this.legsR.addChild(leg3R);
        this.setRotateAngle(leg3R, -1.5708F, 0.8727F, 0.0F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, 20, 0, -12.0391F, -2.0F, -0.7002F, 12, 4, 0, 0.0F, true));

        this.leg4R = new AdvancedModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, -2.0F, -3.0F);
        this.legsR.addChild(leg4R);
        this.setRotateAngle(leg4R, -1.5708F, 1.2217F, 0.0F);
        this.leg4R.cubeList.add(new ModelBox(leg4R, 0, 14, -15.8533F, -2.0F, -0.7469F, 16, 4, 0, 0.0F, true));

        this.legsL = new AdvancedModelRenderer(this);
        this.legsL.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(legsL);


        this.leg1L = new AdvancedModelRenderer(this);
        this.leg1L.setRotationPoint(2.0F, -2.0F, -6.0F);
        this.legsL.addChild(leg1L);
        this.setRotateAngle(leg1L, -1.5708F, 0.0F, 0.0F);
        this.leg1L.cubeList.add(new ModelBox(leg1L, 0, 44, 0.0F, -2.0F, -0.75F, 6, 4, 0, 0.0F, false));

        this.leg2L = new AdvancedModelRenderer(this);
        this.leg2L.setRotationPoint(2.0F, -2.0F, -5.0F);
        this.legsL.addChild(leg2L);
        this.setRotateAngle(leg2L, -1.5708F, -0.3491F, 0.0F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 0, 44, -0.1693F, -2.0F, -0.3675F, 8, 4, 0, 0.0F, false));

        this.leg3L = new AdvancedModelRenderer(this);
        this.leg3L.setRotationPoint(2.0F, -2.0F, -3.7F);
        this.legsL.addChild(leg3L);
        this.setRotateAngle(leg3L, -1.5708F, -0.5236F, 0.0F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, 0, 44, 0.0391F, -2.0F, -0.7002F, 12, 4, 0, 0.0F, false));

        this.leg4L = new AdvancedModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, -2.0F, -3.0F);
        this.legsL.addChild(leg4L);
        this.setRotateAngle(leg4L, -1.5708F, -1.3526F, 0.0F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, 0, 52, -0.1467F, -2.0F, -0.7469F, 12, 4, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
