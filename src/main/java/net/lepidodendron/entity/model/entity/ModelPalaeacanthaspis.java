package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPalaeacanthaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private ModelAnimator animator;


    public ModelPalaeacanthaspis() {
        animator = ModelAnimator.create();

        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 15, 7, -1.5F, -4.425F, -3.95F, 3, 3, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.3959F, -0.6035F, -3.0271F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.051F, -0.5273F, -0.0403F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 30, 0.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9962F, -1.5826F, -2.7352F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0074F, -0.2207F, 0.083F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 31, 0.025F, -1.925F, -1.3F, 2, 2, 1, -0.003F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5941F, -1.5258F, -3.8532F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3134F, -0.0977F, 0.0812F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 25, -0.075F, -1.0F, -3.0F, 1, 2, 3, -0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.9962F, -1.5826F, -2.7352F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0074F, 0.2207F, -0.083F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 31, -2.025F, -1.925F, -1.3F, 2, 2, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5941F, -1.5258F, -3.8532F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3134F, 0.0977F, -0.0812F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 25, -0.925F, -1.0F, -3.0F, 1, 2, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.7651F, -0.4926F, -4.2012F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0292F, -0.5273F, -0.0403F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 34, 0.05F, -1.175F, 1.325F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.7651F, -0.4926F, -4.2012F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0292F, 0.5273F, 0.0403F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 34, -1.05F, -1.175F, 1.325F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.3959F, -0.6035F, -3.0271F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.051F, 0.5273F, 0.0403F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 30, -2.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4889F, -4.2866F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 14, -1.5F, -0.975F, 0.0F, 3, 1, 3, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.1045F, -5.978F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 11, -0.5F, -1.0F, -0.2F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.5137F, -7.7142F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6545F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 19, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.5374F, -7.9306F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 7, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.5374F, -7.9306F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5323F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 34, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.8165F, -2.9208F, -6.9321F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1674F, -0.3812F, 0.2613F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 33, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.8165F, -2.9208F, -6.9321F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1674F, 0.3812F, -0.2613F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 33, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.5229F, -6.8111F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 25, -0.5F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -4.425F, -3.95F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 17, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.006F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 3, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -5.0264F, -2.0426F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 33, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -5.0264F, -2.0426F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 29, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.3735F, -1.4792F, -2.8524F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1364F, -0.6444F, 0.3632F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 0, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.3735F, -1.4792F, -2.8524F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1364F, 0.6444F, -0.3632F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 0, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.3885F, -4.4013F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.7885F, -0.1987F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 29, -0.8F, -0.975F, -3.4F, 1, 1, 2, -0.01F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 29, -0.2F, -0.975F, -3.4F, 1, 1, 2, -0.006F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.8996F, 0.1147F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.192F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 15, -0.5F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.6447F, -1.3358F);
        this.main.addChild(body);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 0.7191F, 3.6125F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1484F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 0, -0.5F, -0.275F, -4.0F, 3, 2, 4, -0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.6989F, 0.5302F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2007F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 31, -0.5F, -1.0F, -0.05F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -0.2724F, 4.0041F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 10, -0.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4796F, 3.4836F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 11, 19, -1.0F, -0.76F, -0.1479F, 2, 2, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 1.24F, 3.8521F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 25, -0.5F, -1.0F, -3.975F, 2, 1, 3, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.9F, 1.49F, 0.6521F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.1311F, -0.3169F, 0.7909F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 33, 22, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.9F, 1.49F, 0.6521F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.1311F, 0.3169F, -0.7909F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 33, 22, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0485F, 2.5229F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.2967F, -0.0931F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.5F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.1461F, 2.7766F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4494F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 23, -0.5F, 0.2F, -3.4F, 1, 1, 4, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.5865F, -0.1708F);
        this.tail2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1876F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 19, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
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
        //this.main.offsetZ = -0.5F;

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
