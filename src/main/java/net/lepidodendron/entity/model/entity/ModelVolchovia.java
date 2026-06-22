package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVolchovia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontLeftArm;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer frontRightArm;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer middleLeftArm;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer middleRightArm;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backArm;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    public ModelVolchovia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(8.0F, 24.2F, -7.6578F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -11.5F, -1.2F, 5.1578F, 7, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 5, 16, -10.5F, -1.2F, 10.1578F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 5, 13, -10.5F, -1.2F, 4.1578F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 7, -10.0F, -2.2F, 5.6578F, 4, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 2, -8.5F, -2.175F, 5.6328F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 7, -9.0F, -2.95F, 6.6578F, 2, 1, 2, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(-5.8F, -0.59F, 5.0186F);
        this.main.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 2.4347F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5149F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 15, -1.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5149F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 11, -2.0F, 0.02F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-10.2F, -0.59F, 5.0186F);
        this.main.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, -2.4347F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5149F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 11, -2.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5149F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 15, -1.0F, 0.03F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-6.6F, -0.6F, 11.5F);
        this.main.addChild(bone);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.7F, 0.0F, 0.2F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5149F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 15, -1.0F, 0.02F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1F, 0.0F, 0.2F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5149F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 11, -2.0F, 0.03F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-11.3F, -0.59F, 8.9186F);
        this.main.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, -1.2654F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.5149F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 11, -2.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.5149F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 15, -1.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-4.7F, -0.59F, 8.9186F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 1.2654F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.3F, -0.01F, 0.6814F);
        this.bone2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5149F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 15, -1.0F, 0.01F, -2.0F, 3, 0, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.3F, -0.01F, 0.6814F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5149F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 11, -2.0F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));

        this.frontLeftArm = new AdvancedModelRenderer(this);
        this.frontLeftArm.setRotationPoint(-5.8F, -0.225F, 5.15F);
        this.main.addChild(frontLeftArm);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3886F, 0.0F, -0.3147F);
        this.frontLeftArm.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.4014F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, -3, 7, -1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.3886F, 0.0F, 0.3147F);
        this.frontLeftArm.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.9425F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, -3, 7, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftArm.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.6807F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, -4, 13, -0.5F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.frontRightArm = new AdvancedModelRenderer(this);
        this.frontRightArm.setRotationPoint(-10.2F, -0.225F, 5.15F);
        this.main.addChild(frontRightArm);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.3886F, 0.0F, 0.3147F);
        this.frontRightArm.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.9774F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, -3, 7, -1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.3886F, 0.0F, -0.3147F);
        this.frontRightArm.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3665F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, -3, 7, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightArm.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.6807F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, -4, 13, -0.5F, 0.0F, -4.0F, 1, 0, 4, 0.0F, false));

        this.middleLeftArm = new AdvancedModelRenderer(this);
        this.middleLeftArm.setRotationPoint(-4.75F, -0.225F, 8.75F);
        this.main.addChild(middleLeftArm);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.171F, 0.0F, -0.4699F);
        this.middleLeftArm.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.501F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 7, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleLeftArm.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.2217F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, -2, 13, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.171F, 0.0F, 0.4698F);
        this.middleLeftArm.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.9425F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 7, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.middleRightArm = new AdvancedModelRenderer(this);
        this.middleRightArm.setRotationPoint(-11.25F, -0.225F, 8.75F);
        this.main.addChild(middleRightArm);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.171F, 0.0F, 0.4698F);
        this.middleRightArm.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.9076F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 7, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.171F, 0.0F, -0.4699F);
        this.middleRightArm.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.5184F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 7, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleRightArm.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -1.2217F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, -2, 13, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.backArm = new AdvancedModelRenderer(this);
        this.backArm.setRotationPoint(-8.0F, -0.225F, 10.9F);
        this.main.addChild(backArm);
        this.backArm.cubeList.add(new ModelBox(backArm, -2, 13, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0F, 0.0F, 0.0F);
        this.backArm.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2618F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, -2, 13, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.backArm.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2618F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r23, 10, 7, 0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.backArm.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2618F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 7, -1.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.60F;
        this.main.offsetX = 0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(202);
        this.main.rotateAngleX = (float)Math.toRadians(22);
        this.main.rotateAngleZ = (float)Math.toRadians(-12);
        this.main.scaleChildren = true;
        float scaler = 4.80F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.root.offsetY = 1.29F;
        AdvancedModelRenderer[] frontLeftArm = {this.cube_r11, this.cube_r12, this.cube_r13};
        AdvancedModelRenderer[] frontRightArm = {this.cube_r14, this.cube_r15, this.cube_r16};
        AdvancedModelRenderer[] middleLeftArm = {this.cube_r17, this.cube_r18, this.cube_r19};
        AdvancedModelRenderer[] middleRightArm = {this.cube_r20, this.cube_r21, this.cube_r22};
        AdvancedModelRenderer[] backArm = {this.cube_r23, this.cube_r24, this.cube_r25};


        float speed = 0.135F;
        float modifier = 1f;
        if (f3 == 0) {
            modifier = 0.5F;
        }
        this.chainSwing(frontLeftArm, speed * modifier, 0.2F * modifier, -4, f2, 0.7F);
        this.chainSwing(frontRightArm, speed * modifier, 0.2F * modifier, -4, f2, 0.7F);
        this.chainSwing(middleLeftArm, speed * modifier, 0.2F * modifier, -4, f2, 0.7F);
        this.chainSwing(middleRightArm, speed * modifier, 0.2F * modifier, -4, f2, 0.7F);
        this.chainSwing(backArm, speed * modifier, 0.2F * modifier, -4, f2, 0.7F);


    }
}
