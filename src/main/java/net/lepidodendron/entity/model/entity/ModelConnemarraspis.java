package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConnemarraspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private ModelAnimator animator;


    public ModelConnemarraspis() {
        animator = ModelAnimator.create();

        this.textureWidth = 36;
        this.textureHeight = 36;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.7068F, -4.4233F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.288F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 28, -1.5F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.6283F, -1.4243F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 7, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -5.0264F, -2.0426F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 24, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.952F, -6.6175F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.1563F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 24, -0.5F, 0.0F, 0.0F, 2, 2, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.352F, -6.3643F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4276F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 28, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.952F, -6.6175F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6065F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 29, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.625F, -2.9605F, -6.0369F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3921F, -0.1382F, 0.3216F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 31, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.625F, -2.9605F, -6.0369F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3921F, 0.1382F, -0.3216F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 31, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.425F, -3.95F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4145F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 12, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.004F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -5.0264F, -2.0426F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.425F, -3.95F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 3, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0526F, -1.193F, -2.7487F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1923F, -0.2001F, 0.0452F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 32, -1.325F, -1.0F, -0.225F, 1, 1, 1, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0079F, -1.785F, -5.8548F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2265F, -0.5845F, 0.1331F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 28, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5706F, -1.6337F, -5.0421F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2024F, -0.3713F, 0.0809F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 7, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0526F, -1.193F, -2.7487F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1923F, 0.2001F, -0.0452F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 32, 0.325F, -1.0F, -0.225F, 1, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5706F, -1.6337F, -5.0421F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2024F, 0.3713F, -0.0809F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 7, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0079F, -1.785F, -5.8548F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2265F, 0.5845F, -0.1331F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 14, 28, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.925F, -2.35F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.048F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 10, -1.5F, -1.5F, -1.6F, 3, 3, 3, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.45F, -5.1F);
        this.main.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.6F, 0.0F, 0.25F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 31, -1.1F, -0.375F, -2.075F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 31, -1.5F, -0.375F, -1.075F, 1, 1, 1, -0.003F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 31, -0.7F, -0.375F, -1.075F, 1, 1, 1, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.3247F, -1.4802F, -2.7373F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0213F, -0.3981F, 0.1558F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 24, 0, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.3247F, -1.4802F, -2.7373F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0213F, 0.3981F, -0.1558F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 24, 0, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.6447F, -1.3358F);
        this.main.addChild(body);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.7191F, 3.6125F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 13, 12, -0.5F, -0.275F, -4.0F, 2, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.6989F, 0.5302F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2007F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 24, -0.5F, -1.0F, -0.05F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -0.8244F, 0.0446F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1265F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 0, -2.25F, 0.0F, 0.125F, 2, 3, 3, 0.003F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 0, -1.75F, 0.0F, 0.125F, 2, 3, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.2424F, 2.2426F, 2.2616F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.1693F, -0.2063F, 0.3515F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 24, 16, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.2424F, 2.2426F, 2.2616F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.1693F, 0.2063F, -0.3515F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 24, 16, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4796F, 2.4836F);
        this.body.addChild(tail);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.4137F, 2.8673F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2443F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 23, -0.5F, -1.0F, -2.975F, 2, 1, 3, -0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.24F, 2.8521F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0654F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, -1.0F, -2.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0485F, 2.5229F);
        this.tail.addChild(tail2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -0.2967F, -0.0931F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.5F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.1461F, 2.7766F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4494F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 18, -0.5F, 0.2F, -3.4F, 1, 1, 4, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.5865F, -0.1708F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1876F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 18, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
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

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};

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
