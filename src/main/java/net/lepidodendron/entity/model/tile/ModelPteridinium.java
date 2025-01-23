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
    private final AdvancedModelRenderer Frond_r10;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer spine3;
    private final AdvancedModelRenderer Frond_r11;
    private final AdvancedModelRenderer Frond_r12;
    private final AdvancedModelRenderer Frond_r13;
    private final AdvancedModelRenderer spine4;
    private final AdvancedModelRenderer Frond_r14;
    private final AdvancedModelRenderer Frond_r15;
    private final AdvancedModelRenderer Frond_r16;

    public ModelPteridinium() {
        textureWidth = 16;
        textureHeight = 16;

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, -10.0F);
        setRotateAngle(bone, -1.5708F, 0.0F, 0.0F);


        spine1 = new AdvancedModelRenderer(this);
        spine1.setRotationPoint(0.0F, -7.0F, 0.0F);
        bone.addChild(spine1);


        Frond_r1 = new AdvancedModelRenderer(this);
        Frond_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine1.addChild(Frond_r1);
        setRotateAngle(Frond_r1, 0.0F, 2.618F, 0.0F);
        Frond_r1.cubeList.add(new ModelBox(Frond_r1, 0, 0, -0.025F, -6.0F, 0.0F, 3, 6, 0, 0.0F, false));

        Frond_r2 = new AdvancedModelRenderer(this);
        Frond_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine1.addChild(Frond_r2);
        setRotateAngle(Frond_r2, 0.0F, -2.618F, 0.0F);
        Frond_r2.cubeList.add(new ModelBox(Frond_r2, 0, 6, -3.025F, -6.0F, 0.0F, 3, 6, 0, 0.0F, false));

        Frond_r3 = new AdvancedModelRenderer(this);
        Frond_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine1.addChild(Frond_r3);
        setRotateAngle(Frond_r3, 0.0F, -1.5708F, 0.0F);
        Frond_r3.cubeList.add(new ModelBox(Frond_r3, 12, 6, -1.925F, -5.0F, 0.0F, 2, 4, 0, 0.0F, false));

        spine5 = new AdvancedModelRenderer(this);
        spine5.setRotationPoint(0.0F, -0.993F, 0.1402F);
        spine1.addChild(spine5);
        setRotateAngle(spine5, 0.0654F, 0.0F, -3.1416F);


        spine6 = new AdvancedModelRenderer(this);
        spine6.setRotationPoint(0.0F, -0.0049F, -0.0748F);
        spine5.addChild(spine6);


        Frond_r4 = new AdvancedModelRenderer(this);
        Frond_r4.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine6.addChild(Frond_r4);
        setRotateAngle(Frond_r4, 0.0F, -2.618F, 0.0F);
        Frond_r4.cubeList.add(new ModelBox(Frond_r4, 6, 8, -3.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));

        Frond_r5 = new AdvancedModelRenderer(this);
        Frond_r5.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine6.addChild(Frond_r5);
        setRotateAngle(Frond_r5, 0.0F, -0.5236F, 0.0F);
        Frond_r5.cubeList.add(new ModelBox(Frond_r5, 6, 5, -3.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));

        Frond_r6 = new AdvancedModelRenderer(this);
        Frond_r6.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine6.addChild(Frond_r6);
        setRotateAngle(Frond_r6, 0.0F, -1.5708F, 0.0F);
        Frond_r6.cubeList.add(new ModelBox(Frond_r6, 12, 10, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        spine7 = new AdvancedModelRenderer(this);
        spine7.setRotationPoint(0.0F, -3.0F, 0.0F);
        spine6.addChild(spine7);


        Frond_r7 = new AdvancedModelRenderer(this);
        Frond_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        spine7.addChild(Frond_r7);
        setRotateAngle(Frond_r7, 0.0F, -1.5708F, 0.0F);
        Frond_r7.cubeList.add(new ModelBox(Frond_r7, 6, 0, -2.0F, -6.0F, 0.0F, 2, 5, 0, 0.0F, false));

        Frond_r8 = new AdvancedModelRenderer(this);
        Frond_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine7.addChild(Frond_r8);
        setRotateAngle(Frond_r8, 0.0F, -2.618F, 0.0F);
        Frond_r8.cubeList.add(new ModelBox(Frond_r8, 6, 11, -1.0F, -5.0F, 0.0F, 1, 3, 0, 0.0F, false));

        Frond_r9 = new AdvancedModelRenderer(this);
        Frond_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine7.addChild(Frond_r9);
        setRotateAngle(Frond_r9, 0.0F, -2.618F, 0.0F);
        Frond_r9.cubeList.add(new ModelBox(Frond_r9, 8, 14, -2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        Frond_r10 = new AdvancedModelRenderer(this);
        Frond_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine7.addChild(Frond_r10);
        setRotateAngle(Frond_r10, 0.0F, -0.5236F, 0.0F);
        Frond_r10.cubeList.add(new ModelBox(Frond_r10, 4, 14, -2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));
        Frond_r10.cubeList.add(new ModelBox(Frond_r10, 10, 0, -1.0F, -5.0F, 0.0F, 1, 3, 0, 0.0F, false));

        spine2 = new AdvancedModelRenderer(this);
        spine2.setRotationPoint(0.0F, -5.0F, 0.0F);
        spine1.addChild(spine2);
        setRotateAngle(spine2, 0.0654F, 0.0F, 0.0F);


        spine3 = new AdvancedModelRenderer(this);
        spine3.setRotationPoint(0.0F, 0.0F, 0.075F);
        spine2.addChild(spine3);


        Frond_r11 = new AdvancedModelRenderer(this);
        Frond_r11.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine3.addChild(Frond_r11);
        setRotateAngle(Frond_r11, 0.0F, -2.618F, 0.0F);
        Frond_r11.cubeList.add(new ModelBox(Frond_r11, 6, 8, -3.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));

        Frond_r12 = new AdvancedModelRenderer(this);
        Frond_r12.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine3.addChild(Frond_r12);
        setRotateAngle(Frond_r12, 0.0F, -0.5236F, 0.0F);
        Frond_r12.cubeList.add(new ModelBox(Frond_r12, 6, 5, -3.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));

        Frond_r13 = new AdvancedModelRenderer(this);
        Frond_r13.setRotationPoint(0.0F, -2.0F, 0.0F);
        spine3.addChild(Frond_r13);
        setRotateAngle(Frond_r13, 0.0F, -1.5708F, 0.0F);
        Frond_r13.cubeList.add(new ModelBox(Frond_r13, 12, 13, -2.0F, -1.0F, 0.0F, 2, 3, 0, 0.0F, false));

        spine4 = new AdvancedModelRenderer(this);
        spine4.setRotationPoint(0.0F, -3.0F, 0.0F);
        spine3.addChild(spine4);


        Frond_r14 = new AdvancedModelRenderer(this);
        Frond_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine4.addChild(Frond_r14);
        setRotateAngle(Frond_r14, 0.0F, -2.618F, 0.0F);
        Frond_r14.cubeList.add(new ModelBox(Frond_r14, 8, 14, -2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));
        Frond_r14.cubeList.add(new ModelBox(Frond_r14, 6, 11, -1.0F, -5.0F, 0.0F, 1, 3, 0, 0.0F, false));

        Frond_r15 = new AdvancedModelRenderer(this);
        Frond_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine4.addChild(Frond_r15);
        setRotateAngle(Frond_r15, 0.0F, -0.5236F, 0.0F);
        Frond_r15.cubeList.add(new ModelBox(Frond_r15, 4, 14, -2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));
        Frond_r15.cubeList.add(new ModelBox(Frond_r15, 10, 0, -1.0F, -5.0F, 0.0F, 1, 3, 0, 0.0F, false));

        Frond_r16 = new AdvancedModelRenderer(this);
        Frond_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        spine4.addChild(Frond_r16);
        setRotateAngle(Frond_r16, 0.0F, -1.5708F, 0.0F);
        Frond_r16.cubeList.add(new ModelBox(Frond_r16, 12, 0, -2.0F, -5.0F, 0.0F, 2, 5, 0, 0.0F, false));

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
