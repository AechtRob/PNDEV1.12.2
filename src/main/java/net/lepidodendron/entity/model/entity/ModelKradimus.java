package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKradimus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelKradimus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.9747F, -1.2967F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 12, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.9222F, -4.1789F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2007F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, -1.75F, 0.0F, 0.0F, 2, 3, 3, 0.003F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, -1.25F, 0.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -6.899F, 0.8149F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.5F, -4.075F, -4.1F, 0, 6, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -5.2714F, 2.7125F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0654F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 13, -0.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(head);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -3.9476F, -8.2718F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9294F, -0.0268F, 0.015F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 32, 0.0F, 0.1F, 0.025F, 1, 3, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.15F, -4.1079F, -6.168F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 0, -0.925F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 0, -0.775F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -3.9476F, -8.2718F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9294F, 0.0268F, -0.015F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 32, -1.0F, 0.1F, 0.025F, 1, 3, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -4.9222F, -4.1039F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 26, -0.5F, 1.4F, 0.45F, 2, 2, 3, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.7668F, -7.6982F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0472F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 21, -0.5F, 0.0F, -1.0F, 2, 3, 1, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.4957F, -4.2511F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 7, -0.5F, -2.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.9F, -3.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 12, -0.5F, -0.05F, -2.2F, 2, 2, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 17, -0.5F, -0.05F, -4.2F, 2, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.0F, -1.9222F, -3.6039F);
        this.head.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.6981F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 26, 0.0F, 0.0F, 0.0F, 0, 9, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.0F, -1.9222F, -3.6039F);
        this.head.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 0.6981F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 26, 0.0F, 0.0F, 0.0F, 0, 9, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.5108F, -6.0398F);
        this.head.addChild(jaw);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, 0.3211F, -0.0797F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.2654F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 30, -0.5F, -2.4405F, -0.0025F, 1, 3, 1, -0.003F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 30, 0.3F, -2.4405F, -0.0025F, 1, 3, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.045F, -3.8402F, 2.2583F);
        this.main.addChild(tail);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.545F, 1.2876F, 3.9147F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3054F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 21, -0.5F, -1.875F, -3.9F, 2, 2, 4, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.545F, -0.9603F, 4.0129F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, 1.475F, -2.925F, -4.0F, 0, 3, 4, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 19, 0.5F, 0.075F, -4.0F, 2, 2, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.705F, 1.8181F, 2.2411F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.5208F, 0.3352F, -0.5208F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.backLeftFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 32, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.795F, 1.8181F, 2.2411F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.5208F, -0.3352F, 0.5208F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.backRightFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 32, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.17F, 0.3128F, 3.4088F);
        this.tail.addChild(tail2);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.375F, 0.9996F, 0.3196F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0036F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 28, 0.5F, 0.125F, 0.025F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.125F, -0.1476F, 1.9579F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6109F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 26, -0.5F, -0.875F, -1.975F, 1, 1, 2, -0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.875F, -1.2476F, -0.0421F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0611F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 7, 0.5F, 0.05F, 0.1F, 1, 1, 2, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.125F, -0.5656F, 1.9049F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 33, 3, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 0, 0.0F, -3.5F, 0.5F, 0, 7, 4, 0.0F, false));

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
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


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

