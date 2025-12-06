package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPelecanimimus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPelecanimimus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neckFluff;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;

    private ModelAnimator animator;

    public ModelPelecanimimus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 4.0F, -1.075F);
        this.setRotateAngle(main, -0.1745F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 32, -3.0F, -3.75F, -3.0F, 6, 8, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 62, -2.0F, 4.25F, -3.0F, 4, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 84, 0, -0.5F, 4.25F, -3.0F, 1, 1, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.75F, 2.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 68, -2.5F, 0.0F, 0.0F, 6, 4, 5, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 16, -3.5F, 0.0F, 0.0F, 7, 8, 6, 0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.5F, 6.0F);
        this.main.addChild(tail1);
        this.setRotateAngle(tail1, 0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 49, -2.0F, -2.0F, -1.0F, 4, 5, 8, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 79, -1.0F, 3.0F, -1.0F, 2, 1, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 10, -1.5F, 0.0F, 0.0F, 4, 2, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 0, -1.5F, 0.0F, -1.0F, 5, 4, 6, 0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 72, 53, -1.5F, -1.5F, -1.0F, 3, 3, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 83, -1.0F, 1.25F, -1.0F, 2, 2, 7, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 16, -2.5F, -0.25F, -1.0F, 5, 4, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 5.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 84, 77, -1.0F, -1.0F, -0.25F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 86, 63, -0.5F, 0.5F, -0.25F, 1, 3, 6, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 78, -2.0F, 0.0F, -0.25F, 4, 4, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 56, -0.5F, -0.75F, -0.25F, 1, 1, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 0, -1.5F, -0.25F, -0.25F, 3, 4, 12, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 30, 0.0F, 0.25F, -0.25F, 0, 3, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.0F, -8.0F, 8, 10, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 56, 44, -3.0F, 8.0F, -8.0F, 6, 1, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 69, -1.5F, 8.0F, -8.0F, 3, 1, 8, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.0F, -8.3F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0524F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -4.0F, 0.0F, 0.0F, 8, 5, 9, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.75F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 30, 44, -3.0F, -1.0F, -6.0F, 6, 5, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 4.0F, -6.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 88, -1.5F, 0.0F, 2.0F, 1, 1, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 84, 9, -3.0F, 0.0F, 2.0F, 4, 1, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 32, -4.0F, -4.0F, 0.0F, 6, 4, 8, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -1.0F, -3.25F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 56, -5.0F, 0.0F, 0.0F, 7, 8, 5, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -1.0F, -6.55F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 71, -4.0F, 0.0F, 0.0F, 6, 3, 5, 0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.0F, 3.0F, -4.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.0036F, -0.1745F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 14, 88, -1.0F, -0.75F, -1.0F, 2, 9, 2, 0.0F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 103, -1.4F, -0.9F, -1.3F, 3, 4, 3, 0.0F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 34, 88, -0.65F, 2.25F, 1.0F, 0, 7, 3, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0F, 2.25F, -1.0F);
        this.rightArm1.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.2182F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 92, 50, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.75F, 7.5F, -0.2F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.3963F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 24, 49, 0.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 80, 27, 0.15F, -3.0F, -1.0F, 0, 9, 6, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 78, 10, 0.5F, 0.0F, -1.0F, 1, 4, 2, -0.01F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(0.75F, 4.0F, -1.0F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.3927F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 28, 94, -0.5F, -4.0F, 0.0F, 1, 4, 2, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.25F, 3.75F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.5672F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 22, 94, 0.0F, 1.75F, -1.0F, 1, 5, 2, 0.0F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 60, 94, 0.0F, -0.25F, -1.0F, 1, 2, 2, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, 4.15F, 0.5F);
        this.rightHand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0698F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 93, 0.05F, -3.5F, -1.0F, 0, 6, 3, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.5F, 0.75F, -1.0F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, -0.2182F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 56, 92, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.01F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.0F, 3.0F, -4.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.0036F, 0.1745F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 14, 88, -1.0F, -0.75F, -1.0F, 2, 9, 2, 0.0F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 103, -1.6F, -0.9F, -1.3F, 3, 4, 3, 0.0F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 34, 88, 0.65F, 2.25F, 1.0F, 0, 7, 3, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(0.0F, 2.25F, -1.0F);
        this.leftArm1.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.2182F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 92, 50, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.75F, 7.5F, -0.2F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.3963F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 24, 49, -1.0F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 80, 27, -0.15F, -3.0F, -1.0F, 0, 9, 6, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 78, 10, -1.5F, 0.0F, -1.0F, 1, 4, 2, -0.01F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(-0.75F, 4.0F, -1.0F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.3927F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 28, 94, -0.5F, -4.0F, 0.0F, 1, 4, 2, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(-0.25F, 3.75F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.5672F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 22, 94, -1.0F, 1.75F, -1.0F, 1, 5, 2, 0.0F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 60, 94, -1.0F, -0.25F, -1.0F, 1, 2, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 4.15F, 0.5F);
        this.leftHand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 93, -0.05F, -3.5F, -1.0F, 0, 6, 3, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(-0.5F, 0.75F, -1.0F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.2182F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 56, 92, -0.5F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3054F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 84, 42, -2.0F, -1.0F, -4.0F, 4, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -1.0F, -2.25F);
        this.neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 16, -2.0F, 0.0F, -1.0F, 5, 3, 4, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -4.45F);
        this.neck1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 63, -2.0F, 0.0F, 0.0F, 4, 2, 3, 0.01F, false));

        this.neckFluff = new AdvancedModelRenderer(this);
        this.neckFluff.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.neck1.addChild(neckFluff);
        this.setRotateAngle(neckFluff, -0.5236F, 0.0F, 0.0F);
        this.neckFluff.cubeList.add(new ModelBox(neckFluff, 64, 77, -2.0F, -4.0F, 0.0F, 4, 4, 6, 0.01F, false));
        this.neckFluff.cubeList.add(new ModelBox(neckFluff, 42, 78, -1.0F, -4.0F, 6.0F, 2, 4, 1, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.neckFluff.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 31, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.neckFluff.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 30, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neckFluff.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 46, 30, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -3.75F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.5672F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 60, 87, -1.5F, -1.0F, -3.0F, 3, 3, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.15F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 22, 88, -1.0F, -0.75F, -3.5F, 2, 2, 4, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 92, 23, -1.0F, -0.25F, -3.5F, 2, 2, 4, -0.02F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -3.5F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.6981F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 84, 23, -1.0F, -0.75F, -1.35F, 2, 2, 2, -0.04F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 92, 57, -1.0F, -1.1F, -1.85F, 2, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 92, 57, -1.0F, -1.1F, -1.975F, 2, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 50, -0.9F, -0.6F, -1.6F, 2, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 84, 50, -1.1F, -0.6F, -1.6F, 2, 1, 1, 0.02F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.0F, -1.85F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6262F, -0.2066F, -0.1473F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 27, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 1.0F, -1.85F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1007F, -0.5214F, 0.0503F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 94, 85, 0.0F, -1.5F, -0.95F, 1, 1, 1, -0.02F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.9F, -1.85F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1007F, -0.5214F, 0.0503F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 70, 94, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 1.0F, -1.85F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1007F, 0.5214F, -0.0503F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 85, -1.0F, -1.5F, -0.95F, 1, 1, 1, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.9F, -1.85F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1007F, 0.5214F, -0.0503F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 94, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.9F, -1.85F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 42, -1.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -1.0F, -1.85F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 94, -1.5F, 0.0F, -5.25F, 1, 1, 1, -0.01F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 92, 29, -1.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -1.0F, -1.85F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6262F, 0.2066F, 0.1473F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 60, 27, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -1.15F, -1.85F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 83, 0.0F, 0.05F, 0.0F, 0, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.35F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 53, -1.5F, 0.55F, -1.6F, 2, 1, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 1.3952F, -3.4126F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5672F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 87, -1.5F, 0.0F, -2.25F, 1, 1, 1, -0.03F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 27, -1.5F, 0.0F, -2.0F, 1, 1, 2, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.55F, -1.6F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.4399F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 92, 61, -2.0F, 0.8F, -0.05F, 2, 1, 1, -0.03F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 92, 39, -2.0F, 0.0F, -0.05F, 2, 1, 1, -0.02F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.55F, -1.6F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4363F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 64, 53, -1.5F, 0.0F, -2.05F, 1, 1, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5F, 0.55F, -1.6F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4939F, -0.4703F, -0.2393F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 94, 89, 0.05F, 0.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.55F, -1.6F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4939F, 0.4703F, 0.2393F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 94, 89, -1.05F, 0.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(-0.5F, 1.95F, -2.35F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, -0.1309F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 72, 27, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -1.0F, 1.75F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.1309F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 48, 92, -0.5F, -1.0F, -0.25F, 1, 2, 3, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 48, 68, -1.5F, -2.0F, -1.0F, 3, 10, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.75F, 0.75F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 84, 85, -0.75F, -1.25F, -1.25F, 2, 10, 3, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 74, 87, -1.25F, -1.25F, -1.25F, 1, 10, 3, -0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 8.0F, 0.75F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.5672F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 40, 92, -1.0F, 0.25F, -1.0F, 2, 5, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.75F, 0.25F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.1309F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 86, 72, -1.5F, -0.25F, -2.75F, 3, 1, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 92, 35, -1.5F, -0.5F, -2.75F, 3, 1, 3, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 48, 68, -1.5F, -2.0F, -1.0F, 3, 10, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.75F, 0.75F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 84, 85, -1.25F, -1.25F, -1.25F, 2, 10, 3, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 74, 87, 0.25F, -1.25F, -1.25F, 1, 10, 3, -0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 8.0F, 0.75F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.5672F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 40, 92, -1.0F, 0.25F, -1.0F, 2, 5, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.75F, 0.25F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1309F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 86, 72, -1.5F, -0.25F, -2.75F, 3, 1, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 92, 35, -1.5F, -0.5F, -2.75F, 3, 1, 3, -0.01F, true));


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
        this.main.offsetY = 0.0F;
        this.main.offsetX = 0.15F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(-10);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPelecanimimus EntityPelecanimimus = (EntityPrehistoricFloraPelecanimimus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityPelecanimimus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityPelecanimimus.getAnimation() == EntityPelecanimimus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityPelecanimimus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityPelecanimimus.getIsMoving()) {
                    if (EntityPelecanimimus.getAnimation() != EntityPelecanimimus.EAT_ANIMATION
                        && EntityPelecanimimus.getAnimation() != EntityPelecanimimus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityPelecanimimus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPelecanimimus ee = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_LEFT_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5 + (((tickAnim - 13) / 12) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 13) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 7.75 + (((tickAnim - 13) / 12) * (0-(7.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFluff, neckFluff.rotateAngleX + (float) Math.toRadians(xx), neckFluff.rotateAngleY + (float) Math.toRadians(yy), neckFluff.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 13) / 12) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 12) * (0-(-0.425)));
            zz = 0.5 + (((tickAnim - 13) / 12) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -24.25 + (((tickAnim - 13) / 12) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 12) * (0-(-0.175)));
            zz = 0.65 + (((tickAnim - 13) / 12) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 19.25 + (((tickAnim - 13) / 12) * (0-(19.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 12) * (0-(0.05)));
            zz = 0.275 + (((tickAnim - 13) / 12) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -16.75 + (((tickAnim - 13) / 12) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 29.5 + (((tickAnim - 13) / 12) * (0-(29.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 13) / 12) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.075-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -0.075 + (((tickAnim - 13) / 12) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.88257-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-2.24331-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.11958-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 8.88257 + (((tickAnim - 60) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 60) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 60) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 8.93179 + (((tickAnim - 70) / 10) * (8.88257-(8.93179)));
            yy = -2.26715 + (((tickAnim - 70) / 10) * (-2.24331-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 70) / 10) * (1.11958-(-0.13116)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 8.88257 + (((tickAnim - 80) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 80) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 80) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.93179 + (((tickAnim - 90) / 10) * (8.88257-(8.93179)));
            yy = -2.26715 + (((tickAnim - 90) / 10) * (-2.24331-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 90) / 10) * (1.11958-(-0.13116)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 8.88257 + (((tickAnim - 100) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 100) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 100) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 8.93179 + (((tickAnim - 110) / 30) * (0-(8.93179)));
            yy = -2.26715 + (((tickAnim - 110) / 30) * (0-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 110) / 30) * (0-(-0.13116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12 + (((tickAnim - 60) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -11.99791 + (((tickAnim - 70) / 10) * (-12-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 70) / 10) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 70) / 10) * (0-(-1.74461)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -12 + (((tickAnim - 80) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -11.99791 + (((tickAnim - 90) / 10) * (-12-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 90) / 10) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 90) / 10) * (0-(-1.74461)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -12 + (((tickAnim - 100) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -11.99791 + (((tickAnim - 110) / 30) * (0-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 110) / 30) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 110) / 30) * (0-(-1.74461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9 + (((tickAnim - 60) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -8.99679 + (((tickAnim - 70) / 10) * (-9-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 70) / 10) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 70) / 10) * (0-(-3.74872)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -9 + (((tickAnim - 80) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -8.99679 + (((tickAnim - 90) / 10) * (-9-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 90) / 10) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 90) / 10) * (0-(-3.74872)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -9 + (((tickAnim - 100) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -8.99679 + (((tickAnim - 110) / 30) * (0-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 110) / 30) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 110) / 30) * (0-(-3.74872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -14 + (((tickAnim - 60) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -13.98787 + (((tickAnim - 70) / 10) * (-14-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 70) / 10) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 70) / 10) * (0-(-2.96313)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -14 + (((tickAnim - 80) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -13.98787 + (((tickAnim - 90) / 10) * (-14-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 90) / 10) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 90) / 10) * (0-(-2.96313)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -14 + (((tickAnim - 100) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -13.98787 + (((tickAnim - 110) / 30) * (0-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 110) / 30) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 110) / 30) * (0-(-2.96313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 70) / 10) * (0-(-3.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 90) / 10) * (0-(-3.75)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -3.75 + (((tickAnim - 110) / 30) * (0-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = -3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-10 + (((tickAnim - 0) / 60) * (16.25-(-3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-10)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 16.25 + (((tickAnim - 60) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 16.20491 + (((tickAnim - 70) / 10) * (16.25-(16.20491)));
            yy = -1.68266 + (((tickAnim - 70) / 10) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 70) / 10) * (0-(3.06943)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 16.25 + (((tickAnim - 80) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 16.20491 + (((tickAnim - 90) / 10) * (16.25-(16.20491)));
            yy = -1.68266 + (((tickAnim - 90) / 10) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 90) / 10) * (0-(3.06943)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 16.25 + (((tickAnim - 100) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 16.20491 + (((tickAnim - 110) / 30) * (0-(16.20491)));
            yy = -1.68266 + (((tickAnim - 110) / 30) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 110) / 30) * (0-(3.06943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 9.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-15 + (((tickAnim - 0) / 60) * (32.25-(9.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-15)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 32.25 + (((tickAnim - 60) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 32.24911 + (((tickAnim - 70) / 10) * (32.25-(32.24911)));
            yy = 0.22893 + (((tickAnim - 70) / 10) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 70) / 10) * (0-(-0.44451)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 32.25 + (((tickAnim - 80) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 32.24911 + (((tickAnim - 90) / 10) * (32.25-(32.24911)));
            yy = 0.22893 + (((tickAnim - 90) / 10) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 90) / 10) * (0-(-0.44451)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 32.25 + (((tickAnim - 100) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 32.24911 + (((tickAnim - 110) / 30) * (0-(32.24911)));
            yy = 0.22893 + (((tickAnim - 110) / 30) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 110) / 30) * (0-(-0.44451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 60) / 20) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 80) / 20) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = -0.525 + (((tickAnim - 100) / 40) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (38-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 38 + (((tickAnim - 60) / 80) * (0-(38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = -16 + (((tickAnim - 60) / 80) * (0-(-16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 8.5 + (((tickAnim - 60) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 8.50076 + (((tickAnim - 70) / 10) * (8.5-(8.50076)));
            yy = -0.11732 + (((tickAnim - 70) / 10) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 70) / 10) * (0-(-0.74077)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 8.5 + (((tickAnim - 80) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.50076 + (((tickAnim - 90) / 10) * (8.5-(8.50076)));
            yy = -0.11732 + (((tickAnim - 90) / 10) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 90) / 10) * (0-(-0.74077)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 8.5 + (((tickAnim - 100) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 8.50076 + (((tickAnim - 110) / 30) * (0-(8.50076)));
            yy = -0.11732 + (((tickAnim - 110) / 30) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 110) / 30) * (0-(-0.74077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -23.25 + (((tickAnim - 60) / 10) * (-16.5-(-23.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -16.5 + (((tickAnim - 70) / 10) * (-23.25-(-16.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -23.25 + (((tickAnim - 80) / 10) * (-16.5-(-23.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -16.5 + (((tickAnim - 90) / 10) * (-23.25-(-16.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -23.25 + (((tickAnim - 100) / 10) * (-16.5-(-23.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -16.5 + (((tickAnim - 110) / 30) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFluff, neckFluff.rotateAngleX + (float) Math.toRadians(xx), neckFluff.rotateAngleY + (float) Math.toRadians(yy), neckFluff.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (31.54654-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (2.73956-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.89499-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 31.54654 + (((tickAnim - 60) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 60) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 60) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 31.43965 + (((tickAnim - 70) / 10) * (31.54654-(31.43965)));
            yy = 2.70002 + (((tickAnim - 70) / 10) * (2.73956-(2.70002)));
            zz = -3.14718 + (((tickAnim - 70) / 10) * (-0.89499-(-3.14718)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 31.54654 + (((tickAnim - 80) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 80) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 80) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 31.43965 + (((tickAnim - 90) / 10) * (31.54654-(31.43965)));
            yy = 2.70002 + (((tickAnim - 90) / 10) * (2.73956-(2.70002)));
            zz = -3.14718 + (((tickAnim - 90) / 10) * (-0.89499-(-3.14718)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 31.54654 + (((tickAnim - 100) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 100) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 100) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 31.43965 + (((tickAnim - 110) / 30) * (0-(31.43965)));
            yy = 2.70002 + (((tickAnim - 110) / 30) * (0-(2.70002)));
            zz = -3.14718 + (((tickAnim - 110) / 30) * (0-(-3.14718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-10.75-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -13.25 + (((tickAnim - 60) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 60) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 60) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.23503 + (((tickAnim - 70) / 10) * (-13.25-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 70) / 10) * (-10.75-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 70) / 10) * (0-(-5.55826)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -13.25 + (((tickAnim - 80) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 80) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 80) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -12.23503 + (((tickAnim - 90) / 10) * (-13.25-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 90) / 10) * (-10.75-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 90) / 10) * (0-(-5.55826)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -13.25 + (((tickAnim - 100) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 100) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 100) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -12.23503 + (((tickAnim - 110) / 30) * (0-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 110) / 30) * (0-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 110) / 30) * (0-(-5.55826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.675-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0.675 + (((tickAnim - 60) / 20) * (0.675-(0.675)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0.675 + (((tickAnim - 80) / 20) * (0.675-(0.675)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0.675 + (((tickAnim - 100) / 40) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -24.75 + (((tickAnim - 60) / 80) * (0-(-24.75)));
            yy = -12.5 + (((tickAnim - 60) / 80) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0.225 + (((tickAnim - 60) / 80) * (0-(0.225)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -5.5 + (((tickAnim - 60) / 80) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 15.5 + (((tickAnim - 60) / 80) * (0-(15.5)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9.5 + (((tickAnim - 60) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -9.49571 + (((tickAnim - 70) / 10) * (-9.5-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 70) / 10) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 70) / 10) * (0-(1.17832)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -9.5 + (((tickAnim - 80) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -9.49571 + (((tickAnim - 90) / 10) * (-9.5-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 90) / 10) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 90) / 10) * (0-(1.17832)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -9.5 + (((tickAnim - 100) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -9.49571 + (((tickAnim - 110) / 30) * (0-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 110) / 30) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 110) / 30) * (0-(1.17832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -47.25 + (((tickAnim - 60) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -53.5 + (((tickAnim - 70) / 10) * (-47.25-(-53.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -47.25 + (((tickAnim - 80) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -53.5 + (((tickAnim - 90) / 10) * (-47.25-(-53.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -47.25 + (((tickAnim - 100) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -53.5 + (((tickAnim - 110) / 30) * (0-(-53.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8.51-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 8.51 + (((tickAnim - 23) / 37) * (-4.25-(8.51)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.25 + (((tickAnim - 60) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -1.25 + (((tickAnim - 70) / 10) * (-4.25-(-1.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -4.25 + (((tickAnim - 80) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -1.25 + (((tickAnim - 90) / 10) * (-4.25-(-1.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -4.25 + (((tickAnim - 100) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -1.25 + (((tickAnim - 110) / 30) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.09-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 17.09 + (((tickAnim - 15) / 45) * (-62.5-(17.09)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -62.5 + (((tickAnim - 60) / 10) * (-39.5-(-62.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -39.5 + (((tickAnim - 70) / 10) * (-62.5-(-39.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -62.5 + (((tickAnim - 80) / 10) * (-39.5-(-62.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -39.5 + (((tickAnim - 90) / 10) * (-62.5-(-39.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -62.5 + (((tickAnim - 100) / 10) * (-39.5-(-62.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -39.5 + (((tickAnim - 110) / 30) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.925-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0.925 + (((tickAnim - 60) / 20) * (0.925-(0.925)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0.925 + (((tickAnim - 80) / 20) * (0.925-(0.925)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0.925 + (((tickAnim - 100) / 40) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -9.17 + (((tickAnim - 15) / 8) * (50.25-(-9.17)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 50.25 + (((tickAnim - 23) / 37) * (93.75-(50.25)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 93.75 + (((tickAnim - 60) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 105 + (((tickAnim - 70) / 10) * (93.75-(105)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 93.75 + (((tickAnim - 80) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 105 + (((tickAnim - 90) / 10) * (93.75-(105)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 93.75 + (((tickAnim - 100) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 105 + (((tickAnim - 110) / 30) * (0-(105)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.275-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0.23-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 1.275 + (((tickAnim - 23) / 13) * (2.165-(1.275)));
            zz = 0.23 + (((tickAnim - 23) / 13) * (0.05-(0.23)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 2.165 + (((tickAnim - 36) / 24) * (0-(2.165)));
            zz = 0.05 + (((tickAnim - 36) / 24) * (-0.575-(0.05)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -0.575 + (((tickAnim - 60) / 20) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = -0.575 + (((tickAnim - 80) / 20) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = -0.575 + (((tickAnim - 100) / 40) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-39-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -39 + (((tickAnim - 23) / 13) * (0-(-39)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (16.52-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 16.52 + (((tickAnim - 50) / 10) * (4.75-(16.52)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 4.75 + (((tickAnim - 60) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -11 + (((tickAnim - 64) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 4.75 + (((tickAnim - 80) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -11 + (((tickAnim - 84) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 84) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 4.75 + (((tickAnim - 100) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = -11 + (((tickAnim - 104) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 16 + (((tickAnim - 40) / 135) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 16 + (((tickAnim - 175) / 25) * (0-(16)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2 + (((tickAnim - 40) / 135) * (1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2-(1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2 + (((tickAnim - 175) / 25) * (0-(1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*13 + (((tickAnim - 0) / 40) * (11.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*13)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 11.75 + (((tickAnim - 40) / 135) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 11.75 + (((tickAnim - 175) / 25) * (0-(11.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15.75 + (((tickAnim - 40) / 20) * (11.5-(15.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 11.5 + (((tickAnim - 60) / 20) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 11.5 + (((tickAnim - 80) / 30) * (13-(11.5)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 13 + (((tickAnim - 110) / 20) * (19-(13)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 175) {
            xx = 19 + (((tickAnim - 130) / 45) * (19-(19)));
            yy = 0 + (((tickAnim - 130) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 45) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 19 + (((tickAnim - 175) / 25) * (0-(19)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.13872-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-4.33705-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (3.0273-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.13872 + (((tickAnim - 40) / 20) * (4.11128-(-2.13872)));
            yy = -4.33705 + (((tickAnim - 40) / 20) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 40) / 20) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 4.11128 + (((tickAnim - 60) / 20) * (4.11128-(4.11128)));
            yy = -4.33705 + (((tickAnim - 60) / 20) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 60) / 20) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 80 && tickAnim < 175) {
            xx = 4.11128 + (((tickAnim - 80) / 95) * (-2.13872-(4.11128)));
            yy = -4.33705 + (((tickAnim - 80) / 95) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 80) / 95) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -2.13872 + (((tickAnim - 175) / 25) * (0-(-2.13872)));
            yy = -4.33705 + (((tickAnim - 175) / 25) * (0-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 175) / 25) * (0-(3.0273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -60 + (((tickAnim - 40) / 135) * (-60-(-60)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -60 + (((tickAnim - 175) / 25) * (0-(-60)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.13872-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.33705-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.0273-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.13872 + (((tickAnim - 40) / 20) * (4.11128-(-2.13872)));
            yy = 4.33705 + (((tickAnim - 40) / 20) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 40) / 20) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 4.11128 + (((tickAnim - 60) / 20) * (4.11128-(4.11128)));
            yy = 4.33705 + (((tickAnim - 60) / 20) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 60) / 20) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 80 && tickAnim < 175) {
            xx = 4.11128 + (((tickAnim - 80) / 95) * (-2.13872-(4.11128)));
            yy = 4.33705 + (((tickAnim - 80) / 95) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 80) / 95) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -2.13872 + (((tickAnim - 175) / 25) * (0-(-2.13872)));
            yy = 4.33705 + (((tickAnim - 175) / 25) * (0-(4.33705)));
            zz = -3.0273 + (((tickAnim - 175) / 25) * (0-(-3.0273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -60 + (((tickAnim - 40) / 135) * (-60-(-60)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -60 + (((tickAnim - 175) / 25) * (0-(-60)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 18.25 + (((tickAnim - 40) / 20) * (32.25-(18.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 32.25 + (((tickAnim - 60) / 7) * (28.5-(32.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 28.5 + (((tickAnim - 67) / 13) * (32.25-(28.5)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 32.25 + (((tickAnim - 80) / 7) * (28.5-(32.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 115) {
            xx = 28.5 + (((tickAnim - 87) / 28) * (12-(28.5)));
            yy = 0 + (((tickAnim - 87) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 28) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 12 + (((tickAnim - 115) / 15) * (5-(12)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 5 + (((tickAnim - 130) / 25) * (23-(5)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 23 + (((tickAnim - 155) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 23 + (((tickAnim - 175) / 25) * (0-(23)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -11.5 + (((tickAnim - 40) / 20) * (-25.75-(-11.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -25.75 + (((tickAnim - 60) / 7) * (-16.75-(-25.75)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -16.75 + (((tickAnim - 67) / 13) * (-25.75-(-16.75)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -25.75 + (((tickAnim - 80) / 7) * (-19.75-(-25.75)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 115) {
            xx = -19.75 + (((tickAnim - 87) / 28) * (-4-(-19.75)));
            yy = 0 + (((tickAnim - 87) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 28) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = -4 + (((tickAnim - 115) / 15) * (-0.25-(-4)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = -0.25 + (((tickAnim - 130) / 25) * (-14.25-(-0.25)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = -14.25 + (((tickAnim - 155) / 20) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -14.25 + (((tickAnim - 175) / 25) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckFluff, neckFluff.rotateAngleX + (float) Math.toRadians(xx), neckFluff.rotateAngleY + (float) Math.toRadians(yy), neckFluff.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 8.25 + (((tickAnim - 40) / 20) * (35.75-(8.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 35.75 + (((tickAnim - 60) / 20) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 115) {
            xx = 35.75 + (((tickAnim - 80) / 35) * (25.98426-(35.75)));
            yy = 0 + (((tickAnim - 80) / 35) * (-3.97425-(0)));
            zz = 0 + (((tickAnim - 80) / 35) * (0.45354-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 25.98426 + (((tickAnim - 115) / 15) * (22.23426-(25.98426)));
            yy = -3.97425 + (((tickAnim - 115) / 15) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 115) / 15) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 22.23426 + (((tickAnim - 130) / 25) * (42.23426-(22.23426)));
            yy = -3.97425 + (((tickAnim - 130) / 25) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 130) / 25) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 42.23426 + (((tickAnim - 155) / 7) * (39.23426-(42.23426)));
            yy = -3.97425 + (((tickAnim - 155) / 7) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 155) / 7) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 162 && tickAnim < 175) {
            xx = 39.23426 + (((tickAnim - 162) / 13) * (42.23426-(39.23426)));
            yy = -3.97425 + (((tickAnim - 162) / 13) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 162) / 13) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 42.23426 + (((tickAnim - 175) / 25) * (0-(42.23426)));
            yy = -3.97425 + (((tickAnim - 175) / 25) * (0-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 175) / 25) * (0-(0.45354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 40) / 20) * (15.25-(-15.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 15.25 + (((tickAnim - 60) / 7) * (10.75-(15.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 10.75 + (((tickAnim - 67) / 13) * (15.25-(10.75)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 15.25 + (((tickAnim - 80) / 7) * (10.75-(15.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 10.75 + (((tickAnim - 87) / 43) * (3.14579-(10.75)));
            yy = 0 + (((tickAnim - 87) / 43) * (-5.9171-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (2.01617-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 3.14579 + (((tickAnim - 130) / 15) * (7.79579-(3.14579)));
            yy = -5.9171 + (((tickAnim - 130) / 15) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 130) / 15) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 7.79579 + (((tickAnim - 145) / 10) * (-11.35421-(7.79579)));
            yy = -5.9171 + (((tickAnim - 145) / 10) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 145) / 10) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = -11.35421 + (((tickAnim - 155) / 7) * (-17.10421-(-11.35421)));
            yy = -5.9171 + (((tickAnim - 155) / 7) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 155) / 7) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -17.10421 + (((tickAnim - 162) / 6) * (-8.85421-(-17.10421)));
            yy = -5.9171 + (((tickAnim - 162) / 6) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 162) / 6) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -8.85421 + (((tickAnim - 168) / 7) * (-11.35421-(-8.85421)));
            yy = -5.9171 + (((tickAnim - 168) / 7) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 168) / 7) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -11.35421 + (((tickAnim - 175) / 25) * (0-(-11.35421)));
            yy = -5.9171 + (((tickAnim - 175) / 25) * (0-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 175) / 25) * (0-(2.01617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 40) / 20) * (0-(-0.2)));
            zz = 0.4 + (((tickAnim - 40) / 20) * (0-(0.4)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 87) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 68) * (0.225-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 155) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0.225 + (((tickAnim - 175) / 25) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6.25 + (((tickAnim - 40) / 20) * (-24.25-(6.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -24.25 + (((tickAnim - 60) / 7) * (-17.25-(-24.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -17.25 + (((tickAnim - 67) / 13) * (-24.25-(-17.25)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -24.25 + (((tickAnim - 80) / 7) * (-17.25-(-24.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 110) {
            xx = -17.25 + (((tickAnim - 87) / 23) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 87) / 23) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 87) / 23) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = -12.75 + (((tickAnim - 110) / 20) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 130) / 25) * (-18.5-(0)));
            yy = -12.75 + (((tickAnim - 130) / 25) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = -18.5 + (((tickAnim - 155) / 7) * (-8.75-(-18.5)));
            yy = -12.75 + (((tickAnim - 155) / 7) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -8.75 + (((tickAnim - 162) / 6) * (2-(-8.75)));
            yy = -12.75 + (((tickAnim - 162) / 6) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = 2 + (((tickAnim - 168) / 7) * (-18.5-(2)));
            yy = -12.75 + (((tickAnim - 168) / 7) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -18.5 + (((tickAnim - 175) / 25) * (0-(-18.5)));
            yy = -12.75 + (((tickAnim - 175) / 25) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 60) / 20) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0.15 + (((tickAnim - 80) / 30) * (0-(0.15)));
            zz = 0 + (((tickAnim - 80) / 30) * (0.15-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0.15 + (((tickAnim - 110) / 20) * (0.15-(0.15)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0.15 + (((tickAnim - 130) / 25) * (0-(0.15)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (-20.94-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -20.94 + (((tickAnim - 55) / 5) * (-14.27237-(-20.94)));
            yy = 0 + (((tickAnim - 55) / 5) * (0.6093-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (-4.20618-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -14.27237 + (((tickAnim - 60) / 7) * (-9.5-(-14.27237)));
            yy = 0.6093 + (((tickAnim - 60) / 7) * (0-(0.6093)));
            zz = -4.20618 + (((tickAnim - 60) / 7) * (0-(-4.20618)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -9.5 + (((tickAnim - 67) / 8) * (-17.68314-(-9.5)));
            yy = 0 + (((tickAnim - 67) / 8) * (0.33643-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (-3.98585-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -17.68314 + (((tickAnim - 75) / 3) * (-20.94654-(-17.68314)));
            yy = 0.33643 + (((tickAnim - 75) / 3) * (0.14273-(0.33643)));
            zz = -3.98585 + (((tickAnim - 75) / 3) * (-5.24807-(-3.98585)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -20.94654 + (((tickAnim - 78) / 5) * (-14.25-(-20.94654)));
            yy = 0.14273 + (((tickAnim - 78) / 5) * (0-(0.14273)));
            zz = -5.24807 + (((tickAnim - 78) / 5) * (0-(-5.24807)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -14.25 + (((tickAnim - 83) / 7) * (-9.5-(-14.25)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = -9.5 + (((tickAnim - 90) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = -18 + (((tickAnim - 145) / 10) * (0.75-(-18)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 0.75 + (((tickAnim - 155) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 162) / 6) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -24.5 + (((tickAnim - 168) / 7) * (0.75-(-24.5)));
            yy = 0 + (((tickAnim - 168) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0.75 + (((tickAnim - 175) / 25) * (0-(0.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (23.5-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 23.5 + (((tickAnim - 55) / 5) * (0-(23.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 67) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 67) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 23.5 + (((tickAnim - 75) / 5) * (0-(23.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 80) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 50) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (27.75-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 27.75 + (((tickAnim - 145) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 162) / 6) * (16.75-(0)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = 16.75 + (((tickAnim - 168) / 7) * (0-(16.75)));
            yy = 0 + (((tickAnim - 168) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 9.75 + (((tickAnim - 60) / 20) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 130) {
            xx = 9.75 + (((tickAnim - 80) / 50) * (0-(9.75)));
            yy = 0 + (((tickAnim - 80) / 50) * (2.75-(0)));
            zz = 0 + (((tickAnim - 80) / 50) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (0.5-(0)));
            yy = 2.75 + (((tickAnim - 130) / 15) * (0-(2.75)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 0.5 + (((tickAnim - 145) / 10) * (8.75-(0.5)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 8.75 + (((tickAnim - 155) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 8.75 + (((tickAnim - 175) / 25) * (0-(8.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 19.5 + (((tickAnim - 60) / 23) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 175) {
            xx = 19.5 + (((tickAnim - 83) / 92) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 83) / 92) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 92) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 19.5 + (((tickAnim - 175) / 25) * (0-(19.5)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -15.75 + (((tickAnim - 40) / 135) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -15.75 + (((tickAnim - 175) / 25) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -19.25 + (((tickAnim - 188) / 12) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -13.5 + (((tickAnim - 40) / 135) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -13.5 + (((tickAnim - 175) / 13) * (12.45-(-13.5)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 12.45 + (((tickAnim - 188) / 12) * (0-(12.45)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -53.25 + (((tickAnim - 188) / 12) * (0-(-53.25)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -2 + (((tickAnim - 40) / 135) * (-2-(-2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -2 + (((tickAnim - 175) / 13) * (78.82-(-2)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 78.82 + (((tickAnim - 188) / 12) * (0-(78.82)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (1.6-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (-0.475-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 1.6 + (((tickAnim - 188) / 12) * (0-(1.6)));
            zz = -0.475 + (((tickAnim - 188) / 12) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (17.75-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 17.75 + (((tickAnim - 188) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.75 + (((tickAnim - 10) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 10) / 10) * (0-(19)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 33.25 + (((tickAnim - 10) / 10) * (0-(33.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.5 + (((tickAnim - 5) / 3) * (-32.92-(15.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.92 + (((tickAnim - 8) / 2) * (-21.5-(-32.92)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -21.5 + (((tickAnim - 10) / 4) * (18.21-(-21.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 18.21 + (((tickAnim - 14) / 6) * (0-(18.21)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 5) / 9) * (0.315-(0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0.315 + (((tickAnim - 14) / 6) * (0-(0.315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 8) / 2) * (0-(35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.87 + (((tickAnim - 5) / 5) * (16.25-(-12.87)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 16.25 + (((tickAnim - 10) / 4) * (-13.52-(16.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -13.52 + (((tickAnim - 14) / 6) * (0-(-13.52)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.35 + (((tickAnim - 15) / 20) * (-7.35-(-7.35)));
            zz = 5.15 + (((tickAnim - 15) / 20) * (5.15-(5.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.35 + (((tickAnim - 35) / 15) * (0-(-7.35)));
            zz = 5.15 + (((tickAnim - 35) / 15) * (0-(5.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 15) / 20) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (0-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 15) / 20) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 35) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 15) / 20) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 35) / 15) * (0-(18.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 15) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.225 + (((tickAnim - 35) / 15) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49 + (((tickAnim - 15) / 20) * (49-(49)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0.4 + (((tickAnim - 15) / 20) * (0.4-(0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0.4 + (((tickAnim - 35) / 15) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.25 + (((tickAnim - 15) / 20) * (73.25-(73.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.25 + (((tickAnim - 35) / 15) * (0-(73.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49 + (((tickAnim - 15) / 20) * (49-(49)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.575 + (((tickAnim - 15) / 20) * (-0.575-(-0.575)));
            zz = 0.4 + (((tickAnim - 15) / 20) * (0.4-(0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
            zz = 0.4 + (((tickAnim - 35) / 15) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.25 + (((tickAnim - 15) / 20) * (73.25-(73.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.25 + (((tickAnim - 35) / 15) * (0-(73.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -82.77 + (((tickAnim - 3) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 8) / 8) * (0-(25.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -82.77 + (((tickAnim - 19) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 25.75 + (((tickAnim - 23) / 9) * (0-(25.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -82.77 + (((tickAnim - 35) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 39) / 11) * (0-(25.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 8) / 8) * (0-(0.225)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 23) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-20))*3), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*8), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-30))*-1.8);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-120))*2.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-50))*3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576))*6), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+130))*8));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+160))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-70))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*-8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+150))*-8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-100))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-1.3709+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*-10), rightArm1.rotateAngleY + (float) Math.toRadians(-7.72277), rightArm1.rotateAngleZ + (float) Math.toRadians(5.7039+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-1.3709+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*-10), leftArm1.rotateAngleY + (float) Math.toRadians(7.72277), leftArm1.rotateAngleZ + (float) Math.toRadians(-5.7039+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*-5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*5), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -20.47232 + (((tickAnim - 0) / 1) * (-19.0946-(-20.47232)));
            yy = 1.3118 + (((tickAnim - 0) / 1) * (1.22434-(1.3118)));
            zz = 2.41717 + (((tickAnim - 0) / 1) * (2.25602-(2.41717)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = -19.0946 + (((tickAnim - 1) / 6) * (-30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 1) / 6) * (0-(1.22434)));
            zz = 2.25602 + (((tickAnim - 1) / 6) * (0-(2.25602)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75 + (((tickAnim - 7) / 6) * (-20.47232-(-30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75)));
            yy = 0 + (((tickAnim - 7) / 6) * (1.3118-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (2.41717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.5 + (((tickAnim - 0) / 7) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 7) / 6) * (-7.5-(25.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 7) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.2-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 6) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 7) / 6) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.50959 + (((tickAnim - 0) / 7) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 0) / 7) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 0) / 7) * (0-(-0.01427)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.25 + (((tickAnim - 7) / 2) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.00571-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -54.79616 + (((tickAnim - 9) / 2) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 9) / 2) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 9) / 2) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -54.79616 + (((tickAnim - 11) / 2) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 11) / 2) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 11) / 2) * (-0.01427-(-0.00571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 7) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.075-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 9) / 2) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 9) / 2) * (1.075-(1.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 11) / 2) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 11) / 2) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.44714 + (((tickAnim - 0) / 2) * (1.76238-(27.44714)));
            yy = -1.17746 + (((tickAnim - 0) / 2) * (-0.39249-(-1.17746)));
            zz = -8.66565 + (((tickAnim - 0) / 2) * (-2.88855-(-8.66565)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.76238 + (((tickAnim - 2) / 1) * (-7.58-(1.76238)));
            yy = -0.39249 + (((tickAnim - 2) / 1) * (0-(-0.39249)));
            zz = -2.88855 + (((tickAnim - 2) / 1) * (0-(-2.88855)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.58 + (((tickAnim - 3) / 1) * (76-(-7.58)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 76 + (((tickAnim - 4) / 3) * (60.25-(76)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 60.25 + (((tickAnim - 7) / 2) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 82.5 + (((tickAnim - 9) / 2) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 82.5 + (((tickAnim - 11) / 2) * (27.44714-(82.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (-1.17746-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-8.66565-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 2) * (1.555-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.555 + (((tickAnim - 2) / 1) * (1.255-(1.555)));
            zz = -0.05 + (((tickAnim - 2) / 1) * (-0.07-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.255 + (((tickAnim - 3) / 0) * (1.495-(1.255)));
            zz = -0.07 + (((tickAnim - 3) / 0) * (-0.14-(-0.07)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.495 + (((tickAnim - 3) / 1) * (0.955-(1.495)));
            zz = -0.14 + (((tickAnim - 3) / 1) * (-0.245-(-0.14)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.955 + (((tickAnim - 4) / 3) * (0.4-(0.955)));
            zz = -0.245 + (((tickAnim - 4) / 3) * (-0.2-(-0.245)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 7) / 2) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 7) / 2) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 9) / 2) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 9) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 11) / 2) * (-0.525-(1.15)));
            zz = -0.55 + (((tickAnim - 11) / 2) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -73.14 + (((tickAnim - 3) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -91.85 + (((tickAnim - 4) / 1) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (36-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 36 + (((tickAnim - 7) / 6) * (0-(36)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.25-(0)));
            zz = 0.425 + (((tickAnim - 3) / 1) * (-0.55-(0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 1) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 4) / 1) * (0-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.75 + (((tickAnim - 0) / 7) * (5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(37.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.45541-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.6236-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 7) / 1) * (-20.06588-(5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = -1.45541 + (((tickAnim - 7) / 1) * (-1.35838-(-1.45541)));
            zz = -2.6236 + (((tickAnim - 7) / 1) * (-2.44869-(-2.6236)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -20.06588 + (((tickAnim - 8) / 5) * (37.75-(-20.06588)));
            yy = -1.35838 + (((tickAnim - 8) / 5) * (0-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 8) / 5) * (0-(-2.44869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 25.75 + (((tickAnim - 0) / 1) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 28.28 + (((tickAnim - 1) / 6) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 6) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 7) / 6) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 7) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 0) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 6) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.25 + (((tickAnim - 0) / 3) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.00571-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -54.79616 + (((tickAnim - 3) / 2) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 3) / 2) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 3) / 2) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -54.79616 + (((tickAnim - 5) / 2) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 5) / 2) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 5) / 2) * (-0.01427-(-0.00571)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10.50959 + (((tickAnim - 7) / 6) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 7) / 6) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 7) / 6) * (0-(-0.01427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 3) / 2) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 3) / 2) * (1.075-(1.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 5) / 2) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 5) / 2) * (0-(1.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 60.25 + (((tickAnim - 0) / 3) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 82.5 + (((tickAnim - 3) / 2) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 82.5 + (((tickAnim - 5) / 2) * (19.54016-(82.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.27309-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (9.41466-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 19.54016 + (((tickAnim - 7) / 1) * (13.6437-(19.54016)));
            yy = 0.27309 + (((tickAnim - 7) / 1) * (1.7304-(0.27309)));
            zz = 9.41466 + (((tickAnim - 7) / 1) * (6.16702-(9.41466)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 13.6437 + (((tickAnim - 8) / 0) * (-1.59685-(13.6437)));
            yy = 1.7304 + (((tickAnim - 8) / 0) * (-0.35152-(1.7304)));
            zz = 6.16702 + (((tickAnim - 8) / 0) * (5.48879-(6.16702)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.59685 + (((tickAnim - 8) / 2) * (67.75-(-1.59685)));
            yy = -0.35152 + (((tickAnim - 8) / 2) * (0-(-0.35152)));
            zz = 5.48879 + (((tickAnim - 8) / 2) * (0-(5.48879)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.75 + (((tickAnim - 10) / 3) * (60.25-(67.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 2) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 3) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 2) * (0.175-(1.15)));
            zz = -0.55 + (((tickAnim - 5) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 7) / 1) * (1.08-(0.175)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.03-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.08 + (((tickAnim - 8) / 0) * (1.505-(1.08)));
            zz = -0.03 + (((tickAnim - 8) / 0) * (-0.07-(-0.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.505 + (((tickAnim - 8) / 1) * (1.215-(1.505)));
            zz = -0.07 + (((tickAnim - 8) / 1) * (-0.18-(-0.07)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.215 + (((tickAnim - 9) / 1) * (0.575-(1.215)));
            zz = -0.18 + (((tickAnim - 9) / 1) * (-0.5-(-0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 3) * (0.4-(0.575)));
            zz = -0.5 + (((tickAnim - 10) / 3) * (-0.2-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 36 + (((tickAnim - 0) / 7) * (0-(36)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-91.85-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -91.85 + (((tickAnim - 10) / 2) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (36-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (-0.25-(0)));
            zz = 0.425 + (((tickAnim - 9) / 1) * (-0.55-(0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 2) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 10) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPelecanimimus entity = (EntityPrehistoricFloraPelecanimimus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*2.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-30))*-1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*1.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+160))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-70))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*3.5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*3), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18.47232 + (((tickAnim - 0) / 1) * (-19.0946-(-18.47232)));
            yy = 1.3118 + (((tickAnim - 0) / 1) * (1.22434-(1.3118)));
            zz = 2.41717 + (((tickAnim - 0) / 1) * (2.25602-(2.41717)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -19.0946 + (((tickAnim - 1) / 1) * (-19.0946-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 1) / 1) * (1.22434-(1.22434)));
            zz = 2.25602 + (((tickAnim - 1) / 1) * (2.25602-(2.25602)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -19.0946 + (((tickAnim - 2) / 11) * (-21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 2) / 11) * (0-(1.22434)));
            zz = 2.25602 + (((tickAnim - 2) / 11) * (0-(2.25602)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55 + (((tickAnim - 13) / 12) * (-18.47232-(-21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55)));
            yy = 0 + (((tickAnim - 13) / 12) * (1.3118-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (2.41717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 0) / 13) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 13) / 0) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 28.28 + (((tickAnim - 13) / 12) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 13) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 13) / 12) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 13) / 12) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10.50959 + (((tickAnim - 0) / 13) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 0) / 13) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 0) / 13) * (0-(-0.01427)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 13) / 5) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.00571-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -54.79616 + (((tickAnim - 18) / 3) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 18) / 3) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 18) / 3) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -54.79616 + (((tickAnim - 21) / 4) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 21) / 4) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 21) / 4) * (-0.01427-(-0.00571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 13) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (1.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 18) / 3) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 18) / 3) * (1.075-(1.075)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 21) / 4) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 21) / 4) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.19714 + (((tickAnim - 0) / 4) * (1.67-(18.19714)));
            yy = -1.17746 + (((tickAnim - 0) / 4) * (0-(-1.17746)));
            zz = -8.66565 + (((tickAnim - 0) / 4) * (0-(-8.66565)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.67 + (((tickAnim - 4) / 4) * (76-(1.67)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 76 + (((tickAnim - 8) / 5) * (60.25-(76)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 60.25 + (((tickAnim - 13) / 5) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 82.5 + (((tickAnim - 18) / 3) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 82.5 + (((tickAnim - 21) / 4) * (18.19714-(82.5)));
            yy = 0 + (((tickAnim - 21) / 4) * (-1.17746-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (-8.66565-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 3) * (1.055-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.055 + (((tickAnim - 3) / 1) * (1.055-(1.055)));
            zz = -0.05 + (((tickAnim - 3) / 1) * (-0.07-(-0.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.055 + (((tickAnim - 4) / 1) * (1.48-(1.055)));
            zz = -0.07 + (((tickAnim - 4) / 1) * (-0.11-(-0.07)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.48 + (((tickAnim - 5) / 1) * (1.495-(1.48)));
            zz = -0.11 + (((tickAnim - 5) / 1) * (-0.14-(-0.11)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.495 + (((tickAnim - 6) / 1) * (1.155-(1.495)));
            zz = -0.14 + (((tickAnim - 6) / 1) * (-0.19-(-0.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.155 + (((tickAnim - 7) / 1) * (0.955-(1.155)));
            zz = -0.19 + (((tickAnim - 7) / 1) * (-0.245-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.955 + (((tickAnim - 8) / 5) * (0.4-(0.955)));
            zz = -0.245 + (((tickAnim - 8) / 5) * (-0.2-(-0.245)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 5) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 13) / 5) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 18) / 3) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 18) / 3) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 21) / 4) * (-0.525-(1.15)));
            zz = -0.55 + (((tickAnim - 21) / 4) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -73.14 + (((tickAnim - 7) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -91.85 + (((tickAnim - 8) / 2) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (36-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 36 + (((tickAnim - 13) / 12) * (0-(36)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (-0.12-(0)));
            zz = 0.425 + (((tickAnim - 6) / 1) * (0.315-(0.425)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 7) / 1) * (-0.25-(-0.12)));
            zz = 0.315 + (((tickAnim - 7) / 1) * (-0.55-(0.315)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 2) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 8) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 0) / 13) * (14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(29.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.45541-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.6236-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 13) / 0) * (-19.56588-(14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = -1.45541 + (((tickAnim - 13) / 0) * (-1.35838-(-1.45541)));
            zz = -2.6236 + (((tickAnim - 13) / 0) * (-2.44869-(-2.6236)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -19.56588 + (((tickAnim - 13) / 1) * (-20.06588-(-19.56588)));
            yy = -1.35838 + (((tickAnim - 13) / 1) * (-1.35838-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 13) / 1) * (-2.44869-(-2.44869)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -20.06588 + (((tickAnim - 14) / 11) * (29.75-(-20.06588)));
            yy = -1.35838 + (((tickAnim - 14) / 11) * (0-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 14) / 11) * (0-(-2.44869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 25.75 + (((tickAnim - 0) / 1) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 13) {
            xx = 28.28 + (((tickAnim - 1) / 12) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 1) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 12) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 13) / 12) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 13) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 0) / 13) * (0-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 13) / 12) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.25 + (((tickAnim - 0) / 5) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.00571-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -54.79616 + (((tickAnim - 5) / 4) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 5) / 4) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 5) / 4) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -54.79616 + (((tickAnim - 9) / 4) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 9) / 4) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 9) / 4) * (-0.01427-(-0.00571)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 10.50959 + (((tickAnim - 13) / 12) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 13) / 12) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 13) / 12) * (0-(-0.01427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.075-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 5) / 4) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 5) / 4) * (1.075-(1.075)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 9) / 4) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 9) / 4) * (0-(1.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 12) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 60.25 + (((tickAnim - 0) / 5) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 82.5 + (((tickAnim - 5) / 4) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 82.5 + (((tickAnim - 9) / 4) * (22.06396-(82.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (2.88403-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (10.27848-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 22.06396 + (((tickAnim - 13) / 0) * (16.13509-(22.06396)));
            yy = 2.88403 + (((tickAnim - 13) / 0) * (2.30722-(2.88403)));
            zz = 10.27848 + (((tickAnim - 13) / 0) * (8.22275-(10.27848)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 16.13509 + (((tickAnim - 13) / 1) * (13.6437-(16.13509)));
            yy = 2.30722 + (((tickAnim - 13) / 1) * (1.7304-(2.30722)));
            zz = 8.22275 + (((tickAnim - 13) / 1) * (6.16702-(8.22275)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 13.6437 + (((tickAnim - 14) / 3) * (-6.59685-(13.6437)));
            yy = 1.7304 + (((tickAnim - 14) / 3) * (-0.35152-(1.7304)));
            zz = 6.16702 + (((tickAnim - 14) / 3) * (5.48879-(6.16702)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -6.59685 + (((tickAnim - 17) / 2) * (54.25-(-6.59685)));
            yy = -0.35152 + (((tickAnim - 17) / 2) * (0-(-0.35152)));
            zz = 5.48879 + (((tickAnim - 17) / 2) * (0-(5.48879)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 54.25 + (((tickAnim - 19) / 1) * (67.75-(54.25)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 67.75 + (((tickAnim - 20) / 5) * (60.25-(67.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 5) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 0) / 5) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 4) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 5) / 4) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 9) / 4) * (-0.6-(1.15)));
            zz = -0.55 + (((tickAnim - 9) / 4) * (0-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 1) * (0.38-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 1) * (-0.03-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.38 + (((tickAnim - 14) / 2) * (1.06-(0.38)));
            zz = -0.03 + (((tickAnim - 14) / 2) * (-0.06-(-0.03)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 1.06 + (((tickAnim - 16) / 1) * (0.855-(1.06)));
            zz = -0.06 + (((tickAnim - 16) / 1) * (-0.07-(-0.06)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.855 + (((tickAnim - 17) / 1) * (1.215-(0.855)));
            zz = -0.07 + (((tickAnim - 17) / 1) * (-0.18-(-0.07)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 18) / 2) * (0.575-(1.215)));
            zz = -0.18 + (((tickAnim - 18) / 2) * (-0.5-(-0.18)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 20) / 5) * (0.4-(0.575)));
            zz = -0.5 + (((tickAnim - 20) / 5) * (-0.2-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 36 + (((tickAnim - 0) / 13) * (0-(36)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -73.14 + (((tickAnim - 19) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -91.85 + (((tickAnim - 20) / 3) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (36-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.12-(0)));
            zz = 0.425 + (((tickAnim - 18) / 1) * (0.315-(0.425)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 19) / 1) * (-0.25-(-0.12)));
            zz = 0.315 + (((tickAnim - 19) / 1) * (-0.55-(0.315)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 3) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 20) / 3) * (0-(-0.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPelecanimimus e = (EntityPrehistoricFloraPelecanimimus) entity;
        animator.update(entity);


    }
}
