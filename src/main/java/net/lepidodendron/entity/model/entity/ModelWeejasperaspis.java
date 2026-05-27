package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWeejasperaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private ModelAnimator animator;


    public ModelWeejasperaspis() {
        animator = ModelAnimator.create();

        this.textureWidth = 50;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 12, -2.0F, -5.85F, -1.8F, 4, 5, 4, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.9617F, -6.5285F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2217F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 0, -1.5F, -1.0F, 0.0F, 3, 3, 2, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.25F, -3.5342F, -6.149F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.8787F, -0.1248F, -0.0396F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 42, -0.4F, -0.5F, -0.675F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, -3.5342F, -6.149F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.8787F, 0.1248F, 0.0396F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 42, -0.6F, -0.5F, -0.675F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.7165F, -7.4065F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7418F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 26, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.4819F, -5.5588F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 38, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -5.85F, -1.8F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 0, -1.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.947F, -1.7628F, -3.6796F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3352F, -0.5367F, 0.4082F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 39, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.975F, -1.2692F, -3.7548F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1239F, -0.6923F, 0.0683F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 38, 0.0F, -0.5F, 0.0F, 3, 1, 2, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.2557F, -1.1091F, -2.2271F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1554F, -0.6052F, 0.1129F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 43, 22, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.2557F, -1.1091F, -2.2271F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1554F, 0.6052F, -0.1129F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 22, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.947F, -1.7628F, -3.6796F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3352F, 0.5367F, -0.4082F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 39, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.975F, -1.2692F, -3.7548F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1239F, 0.6923F, -0.0683F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 38, -3.0F, -0.5F, 0.0F, 3, 1, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.8507F, -4.7137F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2225F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 22, -1.5F, -3.0F, -0.025F, 4, 3, 3, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.55F, 2.2F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 25, -1.5F, -1.0F, -4.025F, 3, 1, 4, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -7.3807F, 1.8955F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 39, -2.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -6.6154F, 0.0478F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 42, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -6.6154F, 0.0478F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6545F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 42, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.5578F, -1.1151F, -1.7534F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1631F, -1.0883F, 0.2597F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 42, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.5578F, -1.1151F, -1.7534F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1631F, 1.0883F, -0.2597F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 42, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.65F, -4.65F);
        this.main.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.0F, 1.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 37, -0.5F, -0.975F, -4.0F, 2, 1, 3, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1667F, -4.7067F, 1.8859F);
        this.main.addChild(body);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.3333F, 3.8087F, 3.8379F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 31, -0.5F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.6667F, -1.0745F, 0.2026F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3011F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 32, -0.5F, -1.425F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.8333F, -0.4487F, 4.1534F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1571F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 8, -0.5F, 0.0F, -4.0F, 3, 4, 4, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.1667F, -0.1604F, 3.4051F);
        this.body.addChild(tail);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 3.0045F, 3.9367F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 25, -0.5F, -1.6F, -3.95F, 2, 2, 4, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -0.2829F, 0.209F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 29, -2.25F, -0.05F, 0.0F, 2, 3, 4, -0.003F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 29, -1.75F, -0.05F, 0.0F, 2, 3, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.7516F, 3.0545F, 0.9857F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.2052F, -0.4549F, 0.723F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 32, 22, -0.25F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.7516F, 3.0545F, 0.9857F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.2052F, 0.4549F, -0.723F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 32, 22, -2.75F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.1667F, 0.6132F, 3.3482F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 8, -0.8333F, -0.5882F, 0.2518F, 2, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.1667F, 1.3868F, 4.2518F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 15, -1.0F, -1.825F, -4.0F, 2, 2, 4, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.1667F, 0.1383F, 3.6933F);
        this.tail2.addChild(tail3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.4258F, 0.346F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4058F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 32, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.6235F, -0.0415F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.5F, -0.4F, 0.0F, 0, 3, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.2264F, -0.0415F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 17, 17, -0.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }
//        this.main.offsetZ = -0.5F;

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
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
