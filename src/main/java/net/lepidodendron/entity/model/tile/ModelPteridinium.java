package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPteridinium extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer spine1;
    private final AdvancedModelRenderer Frond_r1;
    private final AdvancedModelRenderer Frond_r2;
    private final AdvancedModelRenderer Frond_r3;
    private final AdvancedModelRenderer spine5;
    private final AdvancedModelRenderer spine6;
    private final AdvancedModelRenderer Frond_r4;
    private final AdvancedModelRenderer Frond_r5;
    private final AdvancedModelRenderer Frond_r6;
    private final AdvancedModelRenderer spine7;
    private final AdvancedModelRenderer Frond_r7;
    private final AdvancedModelRenderer Frond_r8;
    private final AdvancedModelRenderer Frond_r9;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer spine3;
    private final AdvancedModelRenderer Frond_r10;
    private final AdvancedModelRenderer Frond_r11;
    private final AdvancedModelRenderer Frond_r12;
    private final AdvancedModelRenderer spine4;
    private final AdvancedModelRenderer Frond_r13;
    private final AdvancedModelRenderer Frond_r14;
    private final AdvancedModelRenderer Frond_r15;

    public ModelPteridinium() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, -10.0F);
        this.setRotateAngle(bone, -1.5708F, 0.0F, 0.0F);


        this.spine1 = new AdvancedModelRenderer(this);
        this.spine1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.bone.addChild(spine1);


        this.Frond_r1 = new AdvancedModelRenderer(this);
        this.Frond_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine1.addChild(Frond_r1);
        this.setRotateAngle(Frond_r1, 0.0F, -2.618F, 0.0F);
        this.Frond_r1.cubeList.add(new ModelBox(Frond_r1, 0, 1, -2.0F, -5.0F, -0.5F, 2, 4, 1, 0.0F, false));

        this.Frond_r2 = new AdvancedModelRenderer(this);
        this.Frond_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine1.addChild(Frond_r2);
        this.setRotateAngle(Frond_r2, 0.0F, -0.5236F, 0.0F);
        this.Frond_r2.cubeList.add(new ModelBox(Frond_r2, 0, 1, -2.0F, -5.0F, -0.5F, 2, 4, 1, 0.0F, false));

        this.Frond_r3 = new AdvancedModelRenderer(this);
        this.Frond_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine1.addChild(Frond_r3);
        this.setRotateAngle(Frond_r3, 0.0F, -1.5708F, 0.0F);
        this.Frond_r3.cubeList.add(new ModelBox(Frond_r3, 0, 1, -2.0F, -5.0F, -0.5F, 2, 4, 1, 0.0F, false));

        this.spine5 = new AdvancedModelRenderer(this);
        this.spine5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine1.addChild(spine5);
        this.setRotateAngle(spine5, 0.0654F, 0.0F, -3.1416F);


        this.spine6 = new AdvancedModelRenderer(this);
        this.spine6.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.spine5.addChild(spine6);
        this.spine6.cubeList.add(new ModelBox(spine6, 0, 12, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Frond_r4 = new AdvancedModelRenderer(this);
        this.Frond_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine6.addChild(Frond_r4);
        this.setRotateAngle(Frond_r4, 0.0F, -2.618F, 0.0F);
        this.Frond_r4.cubeList.add(new ModelBox(Frond_r4, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.Frond_r5 = new AdvancedModelRenderer(this);
        this.Frond_r5.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine6.addChild(Frond_r5);
        this.setRotateAngle(Frond_r5, 0.0F, -0.5236F, 0.0F);
        this.Frond_r5.cubeList.add(new ModelBox(Frond_r5, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.Frond_r6 = new AdvancedModelRenderer(this);
        this.Frond_r6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine6.addChild(Frond_r6);
        this.setRotateAngle(Frond_r6, 0.0F, -1.5708F, 0.0F);
        this.Frond_r6.cubeList.add(new ModelBox(Frond_r6, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.spine7 = new AdvancedModelRenderer(this);
        this.spine7.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.spine6.addChild(spine7);
        this.spine7.cubeList.add(new ModelBox(spine7, 0, 10, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.Frond_r7 = new AdvancedModelRenderer(this);
        this.Frond_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine7.addChild(Frond_r7);
        this.setRotateAngle(Frond_r7, 0.0F, -2.618F, 0.0F);
        this.Frond_r7.cubeList.add(new ModelBox(Frond_r7, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.Frond_r8 = new AdvancedModelRenderer(this);
        this.Frond_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine7.addChild(Frond_r8);
        this.setRotateAngle(Frond_r8, 0.0F, -0.5236F, 0.0F);
        this.Frond_r8.cubeList.add(new ModelBox(Frond_r8, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.Frond_r9 = new AdvancedModelRenderer(this);
        this.Frond_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine7.addChild(Frond_r9);
        this.setRotateAngle(Frond_r9, 0.0F, -1.5708F, 0.0F);
        this.Frond_r9.cubeList.add(new ModelBox(Frond_r9, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.spine1.addChild(spine2);
        this.setRotateAngle(spine2, 0.0654F, 0.0F, 0.0F);
        this.spine2.cubeList.add(new ModelBox(spine2, 0, 12, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.spine3 = new AdvancedModelRenderer(this);
        this.spine3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine2.addChild(spine3);
        this.spine3.cubeList.add(new ModelBox(spine3, 0, 12, -0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.Frond_r10 = new AdvancedModelRenderer(this);
        this.Frond_r10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine3.addChild(Frond_r10);
        this.setRotateAngle(Frond_r10, 0.0F, -2.618F, 0.0F);
        this.Frond_r10.cubeList.add(new ModelBox(Frond_r10, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.Frond_r11 = new AdvancedModelRenderer(this);
        this.Frond_r11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine3.addChild(Frond_r11);
        this.setRotateAngle(Frond_r11, 0.0F, -0.5236F, 0.0F);
        this.Frond_r11.cubeList.add(new ModelBox(Frond_r11, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.Frond_r12 = new AdvancedModelRenderer(this);
        this.Frond_r12.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.spine3.addChild(Frond_r12);
        this.setRotateAngle(Frond_r12, 0.0F, -1.5708F, 0.0F);
        this.Frond_r12.cubeList.add(new ModelBox(Frond_r12, 11, 4, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        this.spine4 = new AdvancedModelRenderer(this);
        this.spine4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.spine3.addChild(spine4);
        this.spine4.cubeList.add(new ModelBox(spine4, 0, 10, -0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F, false));

        this.Frond_r13 = new AdvancedModelRenderer(this);
        this.Frond_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine4.addChild(Frond_r13);
        this.setRotateAngle(Frond_r13, 0.0F, -2.618F, 0.0F);
        this.Frond_r13.cubeList.add(new ModelBox(Frond_r13, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.Frond_r14 = new AdvancedModelRenderer(this);
        this.Frond_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine4.addChild(Frond_r14);
        this.setRotateAngle(Frond_r14, 0.0F, -0.5236F, 0.0F);
        this.Frond_r14.cubeList.add(new ModelBox(Frond_r14, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        this.Frond_r15 = new AdvancedModelRenderer(this);
        this.Frond_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine4.addChild(Frond_r15);
        this.setRotateAngle(Frond_r15, 0.0F, -1.5708F, 0.0F);
        this.Frond_r15.cubeList.add(new ModelBox(Frond_r15, 8, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        AdvancedModelRenderer[] SideA = {this.spine3,this.spine4};
        AdvancedModelRenderer[] SideB = {this.spine6,this.spine7};
        float speed = 0.05F;
        this.chainWave(SideA, speed, 0.1F, 0.5F, f, 0.4F);
        this.chainWave(SideB, speed, 0.1F, 0.5F, f, 0.4F);
        this.chainFlap(SideA, speed, 0.12F, 0.5F, f, 0.45F);
        this.chainFlap(SideB, speed, 0.12F, 0.5F, f, 0.45F);
        this.bone.render(0.1f);
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
