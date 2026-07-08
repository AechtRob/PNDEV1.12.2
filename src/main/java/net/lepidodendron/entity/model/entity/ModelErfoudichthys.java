package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelErfoudichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontLeftfin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontRightfin;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backLeftfin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backRightfin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelErfoudichthys() {
        this.textureWidth = 47;
        this.textureHeight = 47;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 19.525F, 0.15F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -2.475F, -3.15F, 3, 6, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 22, -1.0F, -1.475F, 3.475F, 2, 4, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 30, 20, -1.0F, 3.275F, -3.175F, 2, 1, 4, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 12, 26, -1.5F, -1.675F, -6.15F, 3, 5, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 25, -1.0F, -0.675F, -8.175F, 2, 3, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.075F, -8.425F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9774F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 39, -1.0F, 0.5056F, -2.3874F, 2, 1, 1, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.075F, -8.425F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6283F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -1.0F, -0.0592F, -1.8954F, 2, 1, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.225F, -3.15F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2051F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -1.0F, -1.975F, -6.0F, 2, 2, 6, -0.02F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.7F, 0.375F, -7.55F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3447F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 41, -0.575F, -0.7F, -0.5F, 1, 1, 1, 0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 22, -0.5F, -1.2F, -1.0F, 1, 2, 2, 0.01F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 41, 0.975F, -0.7F, -0.5F, 1, 1, 1, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 22, 0.9F, -1.2F, -1.0F, 1, 2, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1554F, -9.6407F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 38, -1.0F, -0.0156F, -0.9908F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.9F, -6.175F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4625F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 8, -1.0F, -0.0007F, -3.9208F, 2, 2, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.475F, -3.15F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1876F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 8, -1.0F, 0.0F, -3.0F, 2, 2, 3, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.475F, 2.85F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1134F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 30, -0.2F, -2.725F, -0.25F, 0, 3, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 33, -1.0F, 0.0F, 0.75F, 2, 1, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.725F, 7.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -1.0F, -1.975F, -6.975F, 2, 2, 7, -0.01F, false));

        this.frontLeftfin = new AdvancedModelRenderer(this);
        this.frontLeftfin.setRotationPoint(1.45F, 2.45F, -3.05F);
        this.main.addChild(frontLeftfin);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftfin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0553F, 0.5117F, -0.4239F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 31, -0.125F, -0.025F, 0.0F, 0, 2, 4, 0.0F, false));

        this.frontRightfin = new AdvancedModelRenderer(this);
        this.frontRightfin.setRotationPoint(-1.45F, 2.45F, -3.05F);
        this.main.addChild(frontRightfin);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightfin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0553F, -0.5117F, 0.4239F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 31, 0.125F, -0.025F, 0.0F, 0, 2, 4, 0.0F, true));

        this.backLeftfin = new AdvancedModelRenderer(this);
        this.backLeftfin.setRotationPoint(1.0F, 3.1109F, 5.3177F);
        this.main.addChild(backLeftfin);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.125F, 0.0891F, -0.1427F);
        this.backLeftfin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3144F, 0.0598F, -0.0138F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 37, -0.075F, -0.925F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backRightfin = new AdvancedModelRenderer(this);
        this.backRightfin.setRotationPoint(-1.0F, 3.1109F, 5.3177F);
        this.main.addChild(backRightfin);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.125F, 0.0891F, -0.1427F);
        this.backRightfin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3144F, -0.0598F, 0.0138F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 37, 0.075F, -0.925F, 0.0F, 0, 1, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.4914F, -8.6446F);
        this.main.addChild(jaw);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.153F, -0.6712F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6589F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 30, 0.0F, -0.0924F, -0.9923F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.5336F, -0.3554F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6589F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 38, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.3914F, 0.1946F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9774F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 39, -1.0F, 0.6056F, -2.2624F, 2, 1, 1, -0.025F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.475F, 7.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 26, -1.0F, -1.1F, -0.225F, 2, 3, 4, -0.015F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 2.125F, 1.75F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.7592F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 41, -1.0F, 0.1816F, -0.0512F, 0, 2, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.875F, 3.725F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3316F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 14, -1.0F, -1.95F, -3.95F, 2, 2, 4, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.1F, 3.775F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.096F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 34, -1.0F, 0.0F, -4.0F, 2, 1, 4, -0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.775F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 0, -0.5F, -1.1F, -0.125F, 1, 3, 4, -0.02F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 13, 0.0F, -3.1F, -0.125F, 0, 7, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.5F;
        this.main.offsetX = 0.258F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.95F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.14F;
        this.main.offsetY = -0.19F;
        this.main.offsetZ = 0.06F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = -0.6F;
            this.main.offsetZ = 0.1F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

