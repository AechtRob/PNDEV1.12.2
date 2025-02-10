package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDeinonychus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDeinonychus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Deinonychus;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftUpperPropatagium;
    private final AdvancedModelRenderer leftPropatagiumExtention;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftLowerPropatagium;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightUpperPropatagium;
    private final AdvancedModelRenderer rightPropatagiumExtention;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightLowerPropatagium;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer headFeathers1;
    private final AdvancedModelRenderer headFeathers2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftSickleClaw;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightSickleClaw;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer rightToes;

    private ModelAnimator animator;

    public ModelDeinonychus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Deinonychus = new AdvancedModelRenderer(this);
        this.Deinonychus.setRotationPoint(0.0F, 7.0F, -0.25F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.725F, 0.0F);
        this.Deinonychus.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 64, 30, -3.0F, -3.0F, -1.75F, 6, 11, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, -1.75F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 0, -3.5F, 0.0F, -1.75F, 7, 8, 9, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 8.0F, -1.75F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 81, -3.0F, -3.0F, -0.5F, 6, 3, 7, 0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 5.25F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 63, 9, -2.0F, -1.0F, -2.0F, 4, 5, 10, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 72, 83, -2.5F, -1.5F, -2.0F, 5, 6, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 72, 71, -1.5F, 4.0F, -2.0F, 3, 1, 10, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 54, -0.5F, 5.0F, -2.0F, 1, 1, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 54, -1.5F, -1.0F, -1.0F, 3, 3, 12, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 70, -0.5F, 2.0F, -1.0F, 1, 1, 12, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 70, 49, 0.0F, 3.0F, -1.0F, 0, 1, 12, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 0.25F, 1.0F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.6981F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 40, -3.0F, 0.0F, 0.0F, 3, 0, 10, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.25F, 1.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.6981F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 40, 0.0F, 0.0F, 0.0F, 3, 0, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 37, -1.0F, -1.0F, -1.0F, 2, 2, 14, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 54, 0.0F, 0.0F, -1.0F, 0, 2, 14, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 40, -4.0F, 0.0F, 0.0F, 4, 0, 13, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 40, 0.0F, 0.0F, 0.0F, 4, 0, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 13.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 22, -1.0F, -0.5F, -0.5F, 2, 2, 15, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.4363F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -5.0F, 0.0F, 0.0F, 5, 0, 18, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, 0.0F, 0.0F, 5, 0, 18, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0595F, 14.6252F);
        this.tail4.addChild(tail5);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0595F, -0.6252F);
        this.tail5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 53, 0, -5.5F, 0.0F, 0.0F, 11, 0, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -1.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 40, 18, -3.5F, -2.3F, -7.5F, 7, 10, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.25F, -7.5F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1833F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 84, 0, -3.5F, -0.05F, 0.0F, 7, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.25F, -7.5F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 19, -4.0F, -0.05F, -1.0F, 8, 8, 9, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 7.75F, -7.5F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 54, -3.5F, -3.05F, -0.5F, 7, 3, 9, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.05F, -7.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.3491F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 27, 71, -3.0F, -2.25F, -5.5F, 6, 8, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.25F, -5.5F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 91, 44, -3.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.25F, -5.5F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 67, -3.5F, 0.0F, -0.7F, 7, 6, 7, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 5.75F, -5.5F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5672F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 82, 9, -3.0F, -3.0F, -1.25F, 6, 3, 6, 0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.25F, 2.5752F, -3.2616F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.122F, 0.246F, -0.0856F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 19, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 54, 0.65F, -1.0F, -1.0F, 0, 7, 4, 0.0F, false));

        this.leftUpperPropatagium = new AdvancedModelRenderer(this);
        this.leftUpperPropatagium.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.leftArm1.addChild(leftUpperPropatagium);
        this.setRotateAngle(leftUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.leftUpperPropatagium.cubeList.add(new ModelBox(leftUpperPropatagium, 40, 19, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, false));

        this.leftPropatagiumExtention = new AdvancedModelRenderer(this);
        this.leftPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.leftUpperPropatagium.addChild(leftPropatagiumExtention);
        this.setRotateAngle(leftPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.leftPropatagiumExtention.cubeList.add(new ModelBox(leftPropatagiumExtention, 63, 14, -0.5F, -0.3F, -1.0F, 1, 2, 2, -0.03F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.9199F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 26, 19, -0.25F, -0.25F, -1.0F, 1, 5, 2, 0.01F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, 0.6F, -1.25F, -1.0F, 0, 6, 8, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -0.75F, -0.25F, -1.0F, 1, 5, 2, 0.0F, false));

        this.leftLowerPropatagium = new AdvancedModelRenderer(this);
        this.leftLowerPropatagium.setRotationPoint(1.0F, 4.75F, -1.0F);
        this.leftArm2.addChild(leftLowerPropatagium);
        this.setRotateAngle(leftLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.leftLowerPropatagium.cubeList.add(new ModelBox(leftLowerPropatagium, 19, 40, -1.5F, -4.0F, 0.0F, 1, 4, 2, -0.02F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.5F, 4.5F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.9163F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 19, 59, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 46, 54, -1.0F, 1.7F, -0.5F, 1, 5, 1, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 37, -1.0F, 1.7F, 0.5F, 1, 3, 1, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 37, 0.05F, -0.3F, -0.5F, 0, 7, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.leftHand.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 37, 0.0F, 1.0F, -0.5F, 0, 6, 4, 0.0F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 36, 40, -2.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.25F, 2.5752F, -3.2616F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.122F, -0.246F, 0.0856F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 19, -1.0F, -1.0F, -1.0F, 2, 6, 2, 0.01F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 54, -0.65F, -1.0F, -1.0F, 0, 7, 4, 0.0F, true));

        this.rightUpperPropatagium = new AdvancedModelRenderer(this);
        this.rightUpperPropatagium.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.rightArm1.addChild(rightUpperPropatagium);
        this.setRotateAngle(rightUpperPropatagium, -0.4625F, 0.0F, 0.0F);
        this.rightUpperPropatagium.cubeList.add(new ModelBox(rightUpperPropatagium, 40, 19, -0.5F, 0.0F, 0.0F, 1, 4, 2, -0.01F, true));

        this.rightPropatagiumExtention = new AdvancedModelRenderer(this);
        this.rightPropatagiumExtention.setRotationPoint(0.0F, 3.7709F, 0.9998F);
        this.rightUpperPropatagium.addChild(rightPropatagiumExtention);
        this.setRotateAngle(rightPropatagiumExtention, 1.2654F, 0.0F, 0.0F);
        this.rightPropatagiumExtention.cubeList.add(new ModelBox(rightPropatagiumExtention, 63, 14, -0.5F, -0.3F, -1.0F, 1, 2, 2, -0.03F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.9199F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 26, 19, -0.75F, -0.25F, -1.0F, 1, 5, 2, 0.01F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -0.6F, -1.25F, -1.0F, 0, 6, 8, 0.0F, true));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -0.25F, -0.25F, -1.0F, 1, 5, 2, 0.0F, true));

        this.rightLowerPropatagium = new AdvancedModelRenderer(this);
        this.rightLowerPropatagium.setRotationPoint(-1.0F, 4.75F, -1.0F);
        this.rightArm2.addChild(rightLowerPropatagium);
        this.setRotateAngle(rightLowerPropatagium, 0.6894F, 0.0F, 0.0F);
        this.rightLowerPropatagium.cubeList.add(new ModelBox(rightLowerPropatagium, 19, 40, 0.5F, -4.0F, 0.0F, 1, 4, 2, -0.02F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.5F, 4.5F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.9163F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 19, 59, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 46, 54, 0.0F, 1.7F, -0.5F, 1, 5, 1, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 37, 0.0F, 1.7F, 0.5F, 1, 3, 1, -0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 37, -0.05F, -0.3F, -0.5F, 0, 7, 6, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.rightHand.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 37, 0.0F, 1.0F, -0.5F, 0, 6, 4, 0.0F, true));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4716F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 36, 40, 0.0F, 0.0F, -0.5F, 2, 4, 1, -0.02F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.35F, -3.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.7854F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 19, 86, -2.0F, -1.75F, -4.0F, 4, 5, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.25F, -4.0F);
        this.neck1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 83, 49, -2.0F, -3.0F, -0.25F, 4, 3, 6, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 89, 69, -1.5F, -1.75F, -4.5F, 3, 5, 5, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.75F, -4.5F);
        this.neck2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 71, 25, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.75F, -4.5F);
        this.neck2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 90, 91, -1.5F, 0.0F, 0.0F, 3, 2, 5, 0.03F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.25F, -4.5F);
        this.neck2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 89, 59, -1.5F, -3.0F, -0.5F, 3, 3, 6, 0.02F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2F, -4.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6109F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 95, 80, -1.5F, -1.5F, -3.5F, 3, 4, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.5F, -3.5F);
        this.neck3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 97, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3206F, -2.751F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 49, 92, -2.0F, -2.0F, -3.65F, 4, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 46, -1.0F, 0.1887F, -8.3507F, 2, 1, 2, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.0657F, -4.0039F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.8639F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 48, -1.5F, -2.0F, -0.6F, 3, 2, 2, -0.03F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.1887F, -6.3507F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 76, 96, -1.5F, -2.0F, -0.15F, 3, 2, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.6404F, -5.3775F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.4129F, -0.5775F, 0.0118F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 60, 0.1F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, -1.6404F, -5.3775F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.4129F, 0.5775F, -0.0118F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 60, -1.1F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.5668F, -5.3623F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.3265F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 5, 54, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.036F, -9.0578F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.1781F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 53, 0, -1.0F, -4.0F, 0.0F, 2, 4, 1, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.1887F, -8.3507F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 19, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.9693F, 1.5678F, -6.2039F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0431F, -0.1569F, 0.0069F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 15, 0.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 1.4385F, -9.1642F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0442F, -0.1569F, 0.0069F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 48, 58, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.9693F, 1.5678F, -6.2039F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0431F, 0.1569F, -0.0069F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 14, 15, 0.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 1.4385F, -9.1642F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0442F, 0.1569F, -0.0069F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 48, 58, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.0F, -8.25F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0349F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 19, 47, -1.0F, -1.5F, 1.0F, 2, 1, 1, -0.02F, false));

        this.headFeathers1 = new AdvancedModelRenderer(this);
        this.headFeathers1.setRotationPoint(0.5F, -2.0F, -3.65F);
        this.head.addChild(headFeathers1);
        this.setRotateAngle(headFeathers1, 0.0044F, 0.0F, 0.0F);
        this.headFeathers1.cubeList.add(new ModelBox(headFeathers1, 98, 19, -2.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.headFeathers2 = new AdvancedModelRenderer(this);
        this.headFeathers2.setRotationPoint(0.0F, -2.0F, -3.65F);
        this.head.addChild(headFeathers2);
        this.setRotateAngle(headFeathers2, 0.0087F, 0.0F, 0.0F);
        this.headFeathers2.cubeList.add(new ModelBox(headFeathers2, 91, 36, -2.0F, 0.0F, 0.0F, 4, 2, 5, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, -0.35F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.2587F, -2.9977F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0873F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 91, 99, -2.0F, -1.9836F, 0.1F, 4, 2, 3, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 3.1285F, -0.484F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.5149F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 15, 70, -2.0F, -2.8834F, -1.3F, 4, 2, 4, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 1.8354F, -3.1888F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.4573F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 68, 49, -1.0F, 0.0F, 0.0F, 3, 1, 3, -0.02F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 3.6186F, -4.9411F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.7941F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 75, 65, -1.0F, 0.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 3.6186F, -4.9411F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.5498F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 98, 49, -1.5F, 0.0F, -0.0293F, 3, 1, 4, -0.02F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 4.5722F, -7.3928F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.5711F, -0.1103F, -0.0706F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 19, 54, 0.0F, 0.0F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 4.5722F, -7.3928F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.5711F, 0.1103F, 0.0706F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 19, 54, 0.0F, 0.0F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 4.5722F, -7.3928F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.5672F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 5, 0, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 4.782F, -7.1562F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.5236F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 9, -1.0F, 0.0831F, -0.35F, 2, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.5943F, -0.5407F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.3054F, 0.0F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.8667F, 0.1206F);
        this.throat.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.2531F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 61, 95, -0.5F, -3.0F, -2.0293F, 2, 3, 5, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.1542F, -2.8656F);
        this.throat.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.096F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 32, 54, -0.5F, -1.0F, -0.0293F, 2, 1, 4, 0.01F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.525F, -2.675F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 96, 0, 0.025F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 96, 0, -2.025F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 84, -1.5F, -2.0F, -2.0F, 3, 9, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.5F, -1.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9163F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 38, 92, -1.0F, 0.0F, -0.5F, 2, 10, 3, 0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 9.0F, 2.5F);
        this.leftLeg2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3054F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 15, -1.5F, 0.0F, -1.0F, 2, 1, 1, 0.03F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 10.0F, 2.5F);
        this.leftLeg2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.3491F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 7, 15, -1.5F, 0.0F, -1.0F, 2, 1, 1, 0.02F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.0F, 1.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 9, 0, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3491F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 0, 70, -0.5F, -0.5F, -2.5F, 2, 1, 3, 0.0F, false));

        this.leftSickleClaw = new AdvancedModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.leftFoot.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.5672F, 0.3054F, 0.0F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 29, 0, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.leftSickleClaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.7418F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 7, 37, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 29, 5, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 84, -1.5F, -2.0F, -2.0F, 3, 9, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.5F, -1.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9163F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 38, 92, -1.0F, 0.0F, -0.5F, 2, 10, 3, 0.01F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 9.0F, 2.5F);
        this.rightLeg2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3054F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 15, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.03F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 10.0F, 2.5F);
        this.rightLeg2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.3491F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 7, 15, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.02F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.0F, 1.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 9, 0, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 0, 70, -1.5F, -0.5F, -2.5F, 2, 1, 3, 0.0F, true));

        this.rightSickleClaw = new AdvancedModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.rightFoot.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.5672F, -0.3054F, 0.0F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 29, 0, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.rightSickleClaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.7418F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 7, 37, 0.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 29, 5, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Deinonychus.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Deinonychus.offsetY = -0.20F;
        this.Deinonychus.offsetX = 0.0F;
        this.Deinonychus.rotateAngleY = (float)Math.toRadians(220);
        this.Deinonychus.rotateAngleX = (float)Math.toRadians(12);
        this.Deinonychus.rotateAngleZ = (float)Math.toRadians(-2);
        this.Deinonychus.scaleChildren = true;
        float scaler = 0.6F;
        this.Deinonychus.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.Deinonychus.render(f);
        //Reset rotations, positions and sizing:
        this.Deinonychus.setScale(1.0F, 1.0F, 1.0F);
        this.Deinonychus.scaleChildren = false;
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

        EntityPrehistoricFloraDeinonychus EntityDeinonychus = (EntityPrehistoricFloraDeinonychus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityDeinonychus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityDeinonychus.getAnimation() == EntityDeinonychus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityDeinonychus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityDeinonychus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityDeinonychus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.25 + (((tickAnim - 3) / 5) * (33.25-(-3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.25 + (((tickAnim - 8) / 2) * (25.13-(33.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 25.13 + (((tickAnim - 10) / 2) * (0-(25.13)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.925 + (((tickAnim - 3) / 5) * (0.225-(-0.925)));
            zz = 0.275 + (((tickAnim - 3) / 5) * (-2.325-(0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 4) * (0-(0.225)));
            zz = -2.325 + (((tickAnim - 8) / 4) * (0-(-2.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -22.25 + (((tickAnim - 3) / 5) * (10.5-(-22.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.5 + (((tickAnim - 8) / 2) * (2-(10.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 10) / 2) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 5) * (0-(-0.425)));
            zz = 1.25 + (((tickAnim - 3) / 5) * (-0.675-(1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.675 + (((tickAnim - 8) / 4) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 17 + (((tickAnim - 3) / 5) * (-32-(17)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32 + (((tickAnim - 8) / 2) * (-27-(-32)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -27 + (((tickAnim - 10) / 2) * (0-(-27)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.9-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = -0.9 + (((tickAnim - 8) / 4) * (0-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.75 + (((tickAnim - 3) / 5) * (-36.75-(3.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -36.75 + (((tickAnim - 8) / 2) * (15.12-(-36.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 15.12 + (((tickAnim - 10) / 2) * (0-(15.12)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (89.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 89.25 + (((tickAnim - 3) / 3) * (0-(89.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers1, headFeathers1.rotateAngleX + (float) Math.toRadians(xx), headFeathers1.rotateAngleY + (float) Math.toRadians(yy), headFeathers1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (64-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 64 + (((tickAnim - 3) / 3) * (0-(64)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (47-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 47 + (((tickAnim - 8) / 2) * (0-(47)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 8) / 5) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 8) / 5) * (0-(0.275)));
            zz = 0.575 + (((tickAnim - 8) / 5) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


   }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 17 + (((tickAnim - 20) / 15) * (17-(17)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 35) / 15) * (0-(17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (12.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 12.1 + (((tickAnim - 20) / 15) * (12.1-(12.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 12.1 + (((tickAnim - 35) / 15) * (0-(12.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 1.5 + (((tickAnim - 20) / 7) * (-2.03-(1.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -2.03 + (((tickAnim - 27) / 8) * (-5.75-(-2.03)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5.75 + (((tickAnim - 35) / 8) * (-9.12-(-5.75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -9.12 + (((tickAnim - 43) / 7) * (0-(-9.12)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 6.25 + (((tickAnim - 20) / 7) * (-2.81-(6.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -2.81 + (((tickAnim - 27) / 8) * (-12.75-(-2.81)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -12.75 + (((tickAnim - 35) / 8) * (-11.12-(-12.75)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -11.12 + (((tickAnim - 43) / 7) * (0-(-11.12)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -12.75 + (((tickAnim - 20) / 4) * (2.83-(-12.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 2.83 + (((tickAnim - 24) / 7) * (7.76-(2.83)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 7.76 + (((tickAnim - 31) / 4) * (7-(7.76)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7 + (((tickAnim - 35) / 8) * (-8.5-(7)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 43) / 7) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -10.25 + (((tickAnim - 20) / 8) * (26.94-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 26.94 + (((tickAnim - 28) / 3) * (18.19-(26.94)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 18.19 + (((tickAnim - 31) / 4) * (18.75-(18.19)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 20) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 35) / 15) * (0-(6)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 20) / 15) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 35) / 15) * (0-(6.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 30.5 + (((tickAnim - 20) / 4) * (52-(30.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 52 + (((tickAnim - 24) / 4) * (30.5-(52)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 30.5 + (((tickAnim - 28) / 4) * (52-(30.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 52 + (((tickAnim - 32) / 3) * (30.5-(52)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 30.5 + (((tickAnim - 35) / 15) * (0-(30.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 6.5 + (((tickAnim - 20) / 4) * (19.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 19.5 + (((tickAnim - 24) / 4) * (6.5-(19.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 6.5 + (((tickAnim - 28) / 4) * (19.5-(6.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 32) / 3) * (6.5-(19.5)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 20) / 4) * (-35.75316-(1)));
            yy = 0 + (((tickAnim - 20) / 4) * (-5.24955-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0.06891-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -35.75316 + (((tickAnim - 24) / 4) * (1-(-35.75316)));
            yy = -5.24955 + (((tickAnim - 24) / 4) * (0-(-5.24955)));
            zz = 0.06891 + (((tickAnim - 24) / 4) * (0-(0.06891)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 28) / 4) * (-35.33835-(1)));
            yy = 0 + (((tickAnim - 28) / 4) * (3.80918-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (6.2142-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -35.33835 + (((tickAnim - 32) / 3) * (1-(-35.33835)));
            yy = 3.80918 + (((tickAnim - 32) / 3) * (0-(3.80918)));
            zz = 6.2142 + (((tickAnim - 32) / 3) * (0-(6.2142)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 35) / 15) * (0-(1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 14.25 + (((tickAnim - 20) / 4) * (-38.47547-(14.25)));
            yy = 0 + (((tickAnim - 20) / 4) * (-3.29583-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-4.09505-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -38.47547 + (((tickAnim - 24) / 4) * (14.25-(-38.47547)));
            yy = -3.29583 + (((tickAnim - 24) / 4) * (0-(-3.29583)));
            zz = -4.09505 + (((tickAnim - 24) / 4) * (0-(-4.09505)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 14.25 + (((tickAnim - 28) / 4) * (-38.28881-(14.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (6.22931-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (1.34252-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -38.28881 + (((tickAnim - 32) / 3) * (14.25-(-38.28881)));
            yy = 6.22931 + (((tickAnim - 32) / 3) * (0-(6.22931)));
            zz = 1.34252 + (((tickAnim - 32) / 3) * (0-(1.34252)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 35) / 15) * (0-(14.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.625-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.74-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 26.74 + (((tickAnim - 3) / 6) * (15.16-(26.74)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 15.16 + (((tickAnim - 9) / 11) * (-16.75-(15.16)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 20) / 15) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -16.75 + (((tickAnim - 35) / 5) * (9.83-(-16.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.83 + (((tickAnim - 40) / 10) * (0-(9.83)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 5.25 + (((tickAnim - 3) / 6) * (0.25-(5.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 9) / 11) * (0-(0.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (-23-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -23 + (((tickAnim - 46) / 4) * (0-(-23)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 31.25 + (((tickAnim - 3) / 17) * (0-(31.25)));
            yy = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (35-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 35 + (((tickAnim - 40) / 3) * (-49.17-(35)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -49.17 + (((tickAnim - 43) / 3) * (-26.23-(-49.17)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -26.23 + (((tickAnim - 46) / 4) * (0-(-26.23)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (36-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 36 + (((tickAnim - 3) / 17) * (0-(36)));
            yy = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (26.25-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 26.25 + (((tickAnim - 40) / 3) * (43.5-(26.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 43.5 + (((tickAnim - 43) / 3) * (39.44-(43.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 39.44 + (((tickAnim - 46) / 4) * (0-(39.44)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 26 + (((tickAnim - 3) / 5) * (-73.05-(26)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -73.05 + (((tickAnim - 8) / 12) * (0-(-73.05)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-82.25-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -82.25 + (((tickAnim - 40) / 3) * (0-(-82.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.55 + (((tickAnim - 8) / 6) * (0.025-(-0.55)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = 0.025 + (((tickAnim - 14) / 21) * (0-(0.025)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0.155-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.65-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.155 + (((tickAnim - 38) / 2) * (0-(0.155)));
            zz = 0.65 + (((tickAnim - 38) / 2) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-19.98-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -19.98 + (((tickAnim - 8) / 6) * (6.14-(-19.98)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.14 + (((tickAnim - 14) / 6) * (-16.75-(6.14)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 20) / 15) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -16.75 + (((tickAnim - 35) / 5) * (-30.92-(-16.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30.92 + (((tickAnim - 40) / 10) * (0-(-30.92)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-32-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -32 + (((tickAnim - 8) / 6) * (7.5-(-32)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 14) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 40) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16.75 + (((tickAnim - 8) / 4) * (-57.64-(16.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -57.64 + (((tickAnim - 12) / 2) * (-4.5-(-57.64)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 14) / 6) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 8.75 + (((tickAnim - 40) / 3) * (12.81-(8.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.81 + (((tickAnim - 43) / 7) * (0-(12.81)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30 + (((tickAnim - 8) / 4) * (58.57-(30)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 58.57 + (((tickAnim - 12) / 2) * (46.75-(58.57)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 46.75 + (((tickAnim - 14) / 6) * (0-(46.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (50.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 50.75 + (((tickAnim - 40) / 3) * (19-(50.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 43) / 7) * (0-(19)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-60.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -60.75 + (((tickAnim - 14) / 6) * (0-(-60.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 24) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 3) * (0.0375-(1)));
            zz = 1 + (((tickAnim - 24) / 3) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 27) / 2) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 27) / 2) * (1-(0.0375)));
            zz = 1 + (((tickAnim - 27) / 2) * (1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 29) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 29) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 29) / 4) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 33) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 2) * (0.0375-(1)));
            zz = 1 + (((tickAnim - 33) / 2) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 35) / 3) * (1-(1)));
            yy = 0.0375 + (((tickAnim - 35) / 3) * (1-(0.0375)));
            zz = 1 + (((tickAnim - 35) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 13) / 22) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 35) / 15) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-7.75-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = -7.75 + (((tickAnim - 13) / 22) * (-7.75-(-7.75)));
            zz = 3.575 + (((tickAnim - 13) / 22) * (3.575-(3.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.75 + (((tickAnim - 35) / 15) * (0-(-7.75)));
            zz = 3.575 + (((tickAnim - 35) / 15) * (0-(3.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -22.4 + (((tickAnim - 5) / 4) * (-20.26-(-22.4)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.26 + (((tickAnim - 9) / 4) * (-12.25-(-20.26)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -12.25 + (((tickAnim - 13) / 22) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.25 + (((tickAnim - 35) / 15) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.02327-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.89526-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.21705-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 8.02327 + (((tickAnim - 5) / 4) * (-12.17956-(8.02327)));
            yy = 4.89526 + (((tickAnim - 5) / 4) * (8.97465-(4.89526)));
            zz = 0.21705 + (((tickAnim - 5) / 4) * (0.39792-(0.21705)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -12.17956 + (((tickAnim - 9) / 4) * (-4.94183-(-12.17956)));
            yy = 8.97465 + (((tickAnim - 9) / 4) * (12.23816-(8.97465)));
            zz = 0.39792 + (((tickAnim - 9) / 4) * (0.54261-(0.39792)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -4.94183 + (((tickAnim - 13) / 22) * (-4.94183-(-4.94183)));
            yy = 12.23816 + (((tickAnim - 13) / 22) * (12.23816-(12.23816)));
            zz = 0.54261 + (((tickAnim - 13) / 22) * (0.54261-(0.54261)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -4.94183 + (((tickAnim - 35) / 3) * (-16.38056-(-4.94183)));
            yy = 12.23816 + (((tickAnim - 35) / 3) * (7.2392-(12.23816)));
            zz = 0.54261 + (((tickAnim - 35) / 3) * (0.32097-(0.54261)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -16.38056 + (((tickAnim - 38) / 5) * (-10.22091-(-16.38056)));
            yy = 7.2392 + (((tickAnim - 38) / 5) * (6.11908-(7.2392)));
            zz = 0.32097 + (((tickAnim - 38) / 5) * (0.27131-(0.32097)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.22091 + (((tickAnim - 43) / 7) * (0-(-10.22091)));
            yy = 6.11908 + (((tickAnim - 43) / 7) * (0-(6.11908)));
            zz = 0.27131 + (((tickAnim - 43) / 7) * (0-(0.27131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.56616-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (5.31537-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.42598-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 27.56616 + (((tickAnim - 5) / 4) * (35.56574-(27.56616)));
            yy = 5.31537 + (((tickAnim - 5) / 4) * (9.74485-(5.31537)));
            zz = 1.42598 + (((tickAnim - 5) / 4) * (2.6143-(1.42598)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 35.56574 + (((tickAnim - 9) / 4) * (17.6654-(35.56574)));
            yy = 9.74485 + (((tickAnim - 9) / 4) * (13.28843-(9.74485)));
            zz = 2.6143 + (((tickAnim - 9) / 4) * (3.56496-(2.6143)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 17.6654 + (((tickAnim - 13) / 22) * (17.6654-(17.6654)));
            yy = 13.28843 + (((tickAnim - 13) / 22) * (13.28843-(13.28843)));
            zz = 3.56496 + (((tickAnim - 13) / 22) * (3.56496-(3.56496)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 17.6654 + (((tickAnim - 35) / 3) * (15.00937-(17.6654)));
            yy = 13.28843 + (((tickAnim - 35) / 3) * (9.66075-(13.28843)));
            zz = 3.56496 + (((tickAnim - 35) / 3) * (2.59174-(3.56496)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 15.00937 + (((tickAnim - 38) / 5) * (4.0827-(15.00937)));
            yy = 9.66075 + (((tickAnim - 38) / 5) * (6.64421-(9.66075)));
            zz = 2.59174 + (((tickAnim - 38) / 5) * (1.78248-(2.59174)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.0827 + (((tickAnim - 43) / 7) * (0-(4.0827)));
            yy = 6.64421 + (((tickAnim - 43) / 7) * (0-(6.64421)));
            zz = 1.78248 + (((tickAnim - 43) / 7) * (0-(1.78248)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.59815-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.19966-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.03851-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 29.59815 + (((tickAnim - 5) / 4) * (30.04105-(29.59815)));
            yy = 2.19966 + (((tickAnim - 5) / 4) * (4.03272-(2.19966)));
            zz = -0.03851 + (((tickAnim - 5) / 4) * (-0.07061-(-0.03851)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 30.04105 + (((tickAnim - 9) / 4) * (11.49538-(30.04105)));
            yy = 4.03272 + (((tickAnim - 9) / 4) * (5.49916-(4.03272)));
            zz = -0.07061 + (((tickAnim - 9) / 4) * (-0.09628-(-0.07061)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 11.49538 + (((tickAnim - 13) / 22) * (11.49538-(11.49538)));
            yy = 5.49916 + (((tickAnim - 13) / 22) * (5.49916-(5.49916)));
            zz = -0.09628 + (((tickAnim - 13) / 22) * (-0.09628-(-0.09628)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 11.49538 + (((tickAnim - 35) / 3) * (23.19085-(11.49538)));
            yy = 5.49916 + (((tickAnim - 35) / 3) * (4.27712-(5.49916)));
            zz = -0.09628 + (((tickAnim - 35) / 3) * (-0.07489-(-0.09628)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 23.19085 + (((tickAnim - 38) / 5) * (4.9084-(23.19085)));
            yy = 4.27712 + (((tickAnim - 38) / 5) * (2.74958-(4.27712)));
            zz = -0.07489 + (((tickAnim - 38) / 5) * (-0.04814-(-0.07489)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.9084 + (((tickAnim - 43) / 7) * (0-(4.9084)));
            yy = 2.74958 + (((tickAnim - 43) / 7) * (0-(2.74958)));
            zz = -0.04814 + (((tickAnim - 43) / 7) * (0-(-0.04814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 11 + (((tickAnim - 13) / 22) * (11-(11)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11 + (((tickAnim - 35) / 15) * (0-(11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 13) / 22) * (10-(10)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.06244-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-31.61162-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-45.46219-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -29.06244 + (((tickAnim - 13) / 22) * (-29.06244-(-29.06244)));
            yy = -31.61162 + (((tickAnim - 13) / 22) * (-31.61162-(-31.61162)));
            zz = -45.46219 + (((tickAnim - 13) / 22) * (-45.46219-(-45.46219)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29.06244 + (((tickAnim - 35) / 15) * (0-(-29.06244)));
            yy = -31.61162 + (((tickAnim - 35) / 15) * (0-(-31.61162)));
            zz = -45.46219 + (((tickAnim - 35) / 15) * (0-(-45.46219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 13) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 35) / 15) * (0-(3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-35.1452-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.78339-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-11.92238-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -35.1452 + (((tickAnim - 13) / 22) * (-35.1452-(-35.1452)));
            yy = 3.78339 + (((tickAnim - 13) / 22) * (3.78339-(3.78339)));
            zz = -11.92238 + (((tickAnim - 13) / 22) * (-11.92238-(-11.92238)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -35.1452 + (((tickAnim - 35) / 15) * (0-(-35.1452)));
            yy = 3.78339 + (((tickAnim - 35) / 15) * (0-(3.78339)));
            zz = -11.92238 + (((tickAnim - 35) / 15) * (0-(-11.92238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.0624-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (31.6116-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (45.4622-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -29.0624 + (((tickAnim - 13) / 22) * (-29.0624-(-29.0624)));
            yy = 31.6116 + (((tickAnim - 13) / 22) * (31.6116-(31.6116)));
            zz = 45.4622 + (((tickAnim - 13) / 22) * (45.4622-(45.4622)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29.0624 + (((tickAnim - 35) / 15) * (0-(-29.0624)));
            yy = 31.6116 + (((tickAnim - 35) / 15) * (0-(31.6116)));
            zz = 45.4622 + (((tickAnim - 35) / 15) * (0-(45.4622)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 13) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 35) / 15) * (0-(3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-35.1452-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.78339-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (11.9224-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -35.1452 + (((tickAnim - 13) / 22) * (-35.1452-(-35.1452)));
            yy = 3.78339 + (((tickAnim - 13) / 22) * (3.78339-(3.78339)));
            zz = 11.9224 + (((tickAnim - 13) / 22) * (11.9224-(11.9224)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -35.1452 + (((tickAnim - 35) / 15) * (0-(-35.1452)));
            yy = 3.78339 + (((tickAnim - 35) / 15) * (0-(3.78339)));
            zz = 11.9224 + (((tickAnim - 35) / 15) * (0-(11.9224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 22 + (((tickAnim - 13) / 22) * (22-(22)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 35) / 15) * (0-(22)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = -1.575 + (((tickAnim - 13) / 22) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -1.575 + (((tickAnim - 35) / 15) * (0-(-1.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -18.25 + (((tickAnim - 13) / 22) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.25 + (((tickAnim - 35) / 15) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0.575 + (((tickAnim - 13) / 22) * (0.575-(0.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -27.5 + (((tickAnim - 13) / 22) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 35) / 15) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 13) / 22) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-42.03547-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-15.4647-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.15513-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -42.03547 + (((tickAnim - 13) / 22) * (-42.03547-(-42.03547)));
            yy = -15.4647 + (((tickAnim - 13) / 22) * (-15.4647-(-15.4647)));
            zz = -4.15513 + (((tickAnim - 13) / 22) * (-4.15513-(-4.15513)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -42.03547 + (((tickAnim - 35) / 15) * (0-(-42.03547)));
            yy = -15.4647 + (((tickAnim - 35) / 15) * (0-(-15.4647)));
            zz = -4.15513 + (((tickAnim - 35) / 15) * (0-(-4.15513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (57-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 57 + (((tickAnim - 13) / 22) * (57-(57)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 57 + (((tickAnim - 35) / 15) * (0-(57)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -53.25 + (((tickAnim - 13) / 22) * (-53.25-(-53.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -53.25 + (((tickAnim - 35) / 15) * (0-(-53.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (51.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 51.25 + (((tickAnim - 13) / 22) * (51.25-(51.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 51.25 + (((tickAnim - 35) / 15) * (0-(51.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-42.03547-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (15.4647-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4.1551-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -42.03547 + (((tickAnim - 13) / 22) * (-42.03547-(-42.03547)));
            yy = 15.4647 + (((tickAnim - 13) / 22) * (15.4647-(15.4647)));
            zz = 4.1551 + (((tickAnim - 13) / 22) * (4.1551-(4.1551)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -42.03547 + (((tickAnim - 35) / 15) * (0-(-42.03547)));
            yy = 15.4647 + (((tickAnim - 35) / 15) * (0-(15.4647)));
            zz = 4.1551 + (((tickAnim - 35) / 15) * (0-(4.1551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (57-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 57 + (((tickAnim - 13) / 22) * (57-(57)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 57 + (((tickAnim - 35) / 15) * (0-(57)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -53.25 + (((tickAnim - 13) / 22) * (-53.25-(-53.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -53.25 + (((tickAnim - 35) / 15) * (0-(-53.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (51.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 51.25 + (((tickAnim - 13) / 22) * (51.25-(51.25)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 51.25 + (((tickAnim - 35) / 15) * (0-(51.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 5) / 5) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -11.75 + (((tickAnim - 8) / 10) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -11.75 + (((tickAnim - 18) / 7) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.6-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.6 + (((tickAnim - 8) / 10) * (0.6-(0.6)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0.6 + (((tickAnim - 18) / 7) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -4.5 + (((tickAnim - 15) / 3) * (-3.5-(-4.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 18) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.5 + (((tickAnim - 8) / 10) * (-3.25-(4.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 18) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 11 + (((tickAnim - 8) / 10) * (7-(11)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 7 + (((tickAnim - 18) / 8) * (9.79-(7)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 9.79 + (((tickAnim - 26) / 7) * (0-(9.79)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.25 + (((tickAnim - 18) / 4) * (-20.5-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -20.5 + (((tickAnim - 22) / 6) * (16.25-(-20.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 16.25 + (((tickAnim - 28) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 5.75 + (((tickAnim - 8) / 17) * (0-(5.75)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 8) / 10) * (12.38274-(7.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0.30198-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-2.03516-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12.38274 + (((tickAnim - 18) / 7) * (0-(12.38274)));
            yy = 0.30198 + (((tickAnim - 18) / 7) * (0-(0.30198)));
            zz = -2.03516 + (((tickAnim - 18) / 7) * (0-(-2.03516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.5 + (((tickAnim - 8) / 10) * (16.75-(9.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 16.75 + (((tickAnim - 18) / 7) * (0-(16.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -20.75 + (((tickAnim - 8) / 10) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -20.75 + (((tickAnim - 18) / 7) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.5 + (((tickAnim - 8) / 10) * (16.75-(9.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 16.75 + (((tickAnim - 18) / 7) * (0-(16.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 38 + (((tickAnim - 8) / 7) * (60-(38)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 60 + (((tickAnim - 15) / 3) * (72.25-(60)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 72.25 + (((tickAnim - 18) / 10) * (6.25-(72.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 6.25 + (((tickAnim - 28) / 1) * (0-(6.25)));
            yy = 0 + (((tickAnim - 28) / 1) * (3.5-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 3.5 + (((tickAnim - 29) / 4) * (0-(3.5)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.775-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = -2.775 + (((tickAnim - 8) / 10) * (-2.775-(-2.775)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -2.775 + (((tickAnim - 18) / 10) * (0-(-2.775)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.75 + (((tickAnim - 8) / 7) * (36.25-(23.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 36.25 + (((tickAnim - 15) / 3) * (50-(36.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 50 + (((tickAnim - 18) / 7) * (0-(50)));
            yy = 0 + (((tickAnim - 18) / 7) * (2.75-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-16.08147-(0)));
            yy = 2.75 + (((tickAnim - 25) / 3) * (3.75131-(2.75)));
            zz = 0 + (((tickAnim - 25) / 3) * (-2.48727-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -16.08147 + (((tickAnim - 28) / 1) * (0-(-16.08147)));
            yy = 3.75131 + (((tickAnim - 28) / 1) * (3.75-(3.75131)));
            zz = -2.48727 + (((tickAnim - 28) / 1) * (0-(-2.48727)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 3.75 + (((tickAnim - 29) / 4) * (0-(3.75)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 8) / 7) * (7-(20)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 7 + (((tickAnim - 15) / 6) * (13.89-(7)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 13.89 + (((tickAnim - 21) / 4) * (0-(13.89)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-8.75949-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (5.62158-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (3.26836-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -8.75949 + (((tickAnim - 28) / 1) * (-25.7305-(-8.75949)));
            yy = 5.62158 + (((tickAnim - 28) / 1) * (3.70117-(5.62158)));
            zz = 3.26836 + (((tickAnim - 28) / 1) * (0.60362-(3.26836)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -25.7305 + (((tickAnim - 29) / 4) * (0-(-25.7305)));
            yy = 3.70117 + (((tickAnim - 29) / 4) * (0-(3.70117)));
            zz = 0.60362 + (((tickAnim - 29) / 4) * (0-(0.60362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 17) * (0-(0.175)));
            zz = 0.475 + (((tickAnim - 8) / 17) * (0-(0.475)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 8 + (((tickAnim - 8) / 7) * (-5.5-(8)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.5 + (((tickAnim - 15) / 3) * (-38.75-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -38.75 + (((tickAnim - 18) / 3) * (8.77-(-38.75)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.77 + (((tickAnim - 21) / 2) * (35.19-(8.77)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 35.19 + (((tickAnim - 23) / 5) * (-9.9-(35.19)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -9.9 + (((tickAnim - 28) / 1) * (0-(-9.9)));
            yy = 0 + (((tickAnim - 28) / 1) * (1.5-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 1.5 + (((tickAnim - 29) / 4) * (0-(1.5)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.7-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 23) / 10) * (0-(0.525)));
            zz = 0.7 + (((tickAnim - 23) / 10) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 30.5 + (((tickAnim - 8) / 17) * (74.75-(30.5)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 74.75 + (((tickAnim - 25) / 4) * (0-(74.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers1, headFeathers1.rotateAngleX + (float) Math.toRadians(xx), headFeathers1.rotateAngleY + (float) Math.toRadians(yy), headFeathers1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 20.75 + (((tickAnim - 8) / 17) * (47.5-(20.75)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 47.5 + (((tickAnim - 25) / 4) * (0-(47.5)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (27-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 27 + (((tickAnim - 17) / 1) * (0-(27)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (24-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 24 + (((tickAnim - 27) / 2) * (0-(24)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (16.75-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 16.75 + (((tickAnim - 18) / 15) * (0-(16.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (1.025-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.025 + (((tickAnim - 18) / 15) * (0-(1.025)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -14.5 + (((tickAnim - 8) / 10) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -14.5 + (((tickAnim - 18) / 7) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-22.76-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -22.76 + (((tickAnim - 3) / 5) * (-27.5-(-22.76)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -27.5 + (((tickAnim - 8) / 10) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -27.5 + (((tickAnim - 18) / 4) * (22.5-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 22) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 3) / 5) * (0-(0.95)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-29.55-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -29.55 + (((tickAnim - 3) / 5) * (46.5-(-29.55)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 46.5 + (((tickAnim - 8) / 10) * (46.5-(46.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 46.5 + (((tickAnim - 18) / 4) * (-42-(46.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -42 + (((tickAnim - 22) / 3) * (0-(-42)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.775 + (((tickAnim - 8) / 10) * (-0.775-(-0.775)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.775 + (((tickAnim - 18) / 7) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (72.97-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 72.97 + (((tickAnim - 3) / 5) * (-12.5-(72.97)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 8) / 10) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -12.5 + (((tickAnim - 18) / 4) * (73.25-(-12.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 73.25 + (((tickAnim - 22) / 3) * (0-(73.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 10) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 18) / 4) * (1.2-(0.6)));
            zz = 0 + (((tickAnim - 18) / 4) * (-0.35-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.2 + (((tickAnim - 22) / 3) * (0-(1.2)));
            zz = -0.35 + (((tickAnim - 22) / 3) * (0-(-0.35)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-18.34-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.34 + (((tickAnim - 3) / 5) * (71.75-(-18.34)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 71.75 + (((tickAnim - 8) / 10) * (71.75-(71.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 71.75 + (((tickAnim - 18) / 7) * (0-(71.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 32.5 + (((tickAnim - 8) / 10) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 32.5 + (((tickAnim - 18) / 7) * (0-(32.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.325-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 10) * (0.125-(0.125)));
            zz = 0.325 + (((tickAnim - 8) / 10) * (0.325-(0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0.125 + (((tickAnim - 18) / 7) * (0-(0.125)));
            zz = 0.325 + (((tickAnim - 18) / 7) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.25 + (((tickAnim - 8) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12.25 + (((tickAnim - 18) / 7) * (0-(12.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = 8.5 + (((tickAnim - 25) / 38) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = 8.5 + (((tickAnim - 63) / 18) * (5.47554-(8.5)));
            yy = 0 + (((tickAnim - 63) / 18) * (-0.01549-(0)));
            zz = 0 + (((tickAnim - 63) / 18) * (-0.00553-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = 5.47554 + (((tickAnim - 81) / 15) * (2.25054-(5.47554)));
            yy = -0.01549 + (((tickAnim - 81) / 15) * (-0.01549-(-0.01549)));
            zz = -0.00553 + (((tickAnim - 81) / 15) * (-0.00553-(-0.00553)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 2.25054 + (((tickAnim - 96) / 14) * (1.75054-(2.25054)));
            yy = -0.01549 + (((tickAnim - 96) / 14) * (-0.01549-(-0.01549)));
            zz = -0.00553 + (((tickAnim - 96) / 14) * (-0.00553-(-0.00553)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 1.75054 + (((tickAnim - 110) / 30) * (0-(1.75054)));
            yy = -0.01549 + (((tickAnim - 110) / 30) * (0-(-0.01549)));
            zz = -0.00553 + (((tickAnim - 110) / 30) * (0-(-0.00553)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 63) {
            xx = 2.25 + (((tickAnim - 41) / 22) * (3.4-(2.25)));
            yy = 0 + (((tickAnim - 41) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 22) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 109) {
            xx = 3.4 + (((tickAnim - 63) / 46) * (-2.55-(3.4)));
            yy = 0 + (((tickAnim - 63) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 46) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = -2.55 + (((tickAnim - 109) / 31) * (0-(-2.55)));
            yy = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 63) {
            xx = -5.25 + (((tickAnim - 41) / 22) * (-5.5-(-5.25)));
            yy = 0 + (((tickAnim - 41) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 22) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = -5.5 + (((tickAnim - 63) / 18) * (-4.5-(-5.5)));
            yy = 0 + (((tickAnim - 63) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 18) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = -4.5 + (((tickAnim - 81) / 15) * (-5.5-(-4.5)));
            yy = 0 + (((tickAnim - 81) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 15) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 124) {
            xx = -5.5 + (((tickAnim - 96) / 28) * (-6.5-(-5.5)));
            yy = 0 + (((tickAnim - 96) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 28) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 140) {
            xx = -6.5 + (((tickAnim - 124) / 16) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 124) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (-0.03506-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (-0.03279-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0.55857-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 63) {
            xx = -0.03506 + (((tickAnim - 41) / 22) * (0.96494-(-0.03506)));
            yy = -0.03279 + (((tickAnim - 41) / 22) * (-0.03279-(-0.03279)));
            zz = 0.55857 + (((tickAnim - 41) / 22) * (0.55857-(0.55857)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = 0.96494 + (((tickAnim - 63) / 18) * (1.96494-(0.96494)));
            yy = -0.03279 + (((tickAnim - 63) / 18) * (-0.03279-(-0.03279)));
            zz = 0.55857 + (((tickAnim - 63) / 18) * (0.55857-(0.55857)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = 1.96494 + (((tickAnim - 81) / 15) * (5.71494-(1.96494)));
            yy = -0.03279 + (((tickAnim - 81) / 15) * (-0.03279-(-0.03279)));
            zz = 0.55857 + (((tickAnim - 81) / 15) * (0.55857-(0.55857)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 5.71494 + (((tickAnim - 96) / 44) * (0-(5.71494)));
            yy = -0.03279 + (((tickAnim - 96) / 44) * (0-(-0.03279)));
            zz = 0.55857 + (((tickAnim - 96) / 44) * (0-(0.55857)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 63) {
            xx = 4 + (((tickAnim - 41) / 22) * (-1.45789-(4)));
            yy = 0 + (((tickAnim - 41) / 22) * (0.52164-(0)));
            zz = 0 + (((tickAnim - 41) / 22) * (-0.02439-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = -1.45789 + (((tickAnim - 63) / 18) * (-0.95789-(-1.45789)));
            yy = 0.52164 + (((tickAnim - 63) / 18) * (0.52164-(0.52164)));
            zz = -0.02439 + (((tickAnim - 63) / 18) * (-0.02439-(-0.02439)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = -0.95789 + (((tickAnim - 81) / 15) * (0.04211-(-0.95789)));
            yy = 0.52164 + (((tickAnim - 81) / 15) * (0.52164-(0.52164)));
            zz = -0.02439 + (((tickAnim - 81) / 15) * (-0.02439-(-0.02439)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 0.04211 + (((tickAnim - 96) / 44) * (0-(0.04211)));
            yy = 0.52164 + (((tickAnim - 96) / 44) * (0-(0.52164)));
            zz = -0.02439 + (((tickAnim - 96) / 44) * (0-(-0.02439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 63) {
            xx = 5 + (((tickAnim - 40) / 23) * (5-(5)));
            yy = 0 + (((tickAnim - 40) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 23) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = 5 + (((tickAnim - 63) / 77) * (0-(5)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 40) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -7.25 + (((tickAnim - 50) / 3) * (-7.45-(-7.25)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -7.45 + (((tickAnim - 53) / 4) * (-7.25-(-7.45)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -7.25 + (((tickAnim - 57) / 3) * (-7.45-(-7.25)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -7.45 + (((tickAnim - 60) / 3) * (-7.25-(-7.45)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = -7.25 + (((tickAnim - 63) / 77) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 96) {
            xx = 14.5 + (((tickAnim - 25) / 71) * (16-(14.5)));
            yy = 0 + (((tickAnim - 25) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 71) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 16 + (((tickAnim - 96) / 44) * (0-(16)));
            yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 96) {
            xx = -31.25 + (((tickAnim - 25) / 71) * (-35.25-(-31.25)));
            yy = 0 + (((tickAnim - 25) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 71) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = -35.25 + (((tickAnim - 96) / 44) * (0-(-35.25)));
            yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 65 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 65) / 16) * (9.5-(0)));
            yy = 0 + (((tickAnim - 65) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 16) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = 9.5 + (((tickAnim - 81) / 15) * (18.5-(9.5)));
            yy = 0 + (((tickAnim - 81) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 15) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 18.5 + (((tickAnim - 96) / 44) * (0-(18.5)));
            yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = 17.5 + (((tickAnim - 25) / 38) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = 17.5 + (((tickAnim - 63) / 77) * (0-(17.5)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = -50.5 + (((tickAnim - 25) / 38) * (-50.5-(-50.5)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = -50.5 + (((tickAnim - 63) / 77) * (0-(-50.5)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = 22.25 + (((tickAnim - 25) / 38) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = 22.25 + (((tickAnim - 63) / 77) * (0-(22.25)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 23.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-30 + (((tickAnim - 0) / 41) * (34.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(23.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-30)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 34.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 41) / 9) * (39.5-(34.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 39.5 + (((tickAnim - 50) / 3) * (40-(39.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 40 + (((tickAnim - 53) / 4) * (39.5-(40)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 39.5 + (((tickAnim - 57) / 3) * (40-(39.5)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 40 + (((tickAnim - 60) / 3) * (39.5-(40)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 85) {
            xx = 39.5 + (((tickAnim - 63) / 22) * (32.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(39.5)));
            yy = 0 + (((tickAnim - 63) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 22) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 32.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 85) / 55) * (0-(32.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 41) / 9) * (15.25-(9.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 15.25 + (((tickAnim - 50) / 13) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 85) {
            xx = 15.25 + (((tickAnim - 63) / 22) * (5-(15.25)));
            yy = 0 + (((tickAnim - 63) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 22) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 96) {
            xx = 5 + (((tickAnim - 85) / 11) * (4.25-(5)));
            yy = 0 + (((tickAnim - 85) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 11) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 4.25 + (((tickAnim - 96) / 44) * (0-(4.25)));
            yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 41) / 9) * (-12-(-7.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -12 + (((tickAnim - 50) / 3) * (-10.75-(-12)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -10.75 + (((tickAnim - 53) / 4) * (-12-(-10.75)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -12 + (((tickAnim - 57) / 3) * (-10.75-(-12)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -10.75 + (((tickAnim - 60) / 3) * (-12-(-10.75)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 85) {
            xx = -12 + (((tickAnim - 63) / 22) * (13.75-(-12)));
            yy = 0 + (((tickAnim - 63) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 22) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 13.75 + (((tickAnim - 85) / 55) * (0-(13.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (11.57-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 41) {
            xx = 11.57 + (((tickAnim - 12) / 29) * (-8-(11.57)));
            yy = 0 + (((tickAnim - 12) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 29) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 41) / 9) * (-11.5-(-8)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -11.5 + (((tickAnim - 50) / 3) * (-15.25-(-11.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -15.25 + (((tickAnim - 53) / 4) * (-11.5-(-15.25)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -11.5 + (((tickAnim - 57) / 3) * (-15.25-(-11.5)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = -15.25 + (((tickAnim - 60) / 4) * (-11.5-(-15.25)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = -11.5 + (((tickAnim - 64) / 9) * (-7.25-(-11.5)));
            yy = 0 + (((tickAnim - 64) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 85) {
            xx = -7.25 + (((tickAnim - 73) / 12) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 73) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 12) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 85) / 11) * (6.75-(0)));
            yy = 0 + (((tickAnim - 85) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 11) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 140) {
            xx = 6.75 + (((tickAnim - 96) / 44) * (0-(6.75)));
            yy = 0 + (((tickAnim - 96) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 64 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 64) / 15) * (37.75-(0)));
            yy = 0 + (((tickAnim - 64) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 15) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 95) {
            xx = 37.75 + (((tickAnim - 79) / 16) * (0-(37.75)));
            yy = 0 + (((tickAnim - 79) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers1, headFeathers1.rotateAngleX + (float) Math.toRadians(xx), headFeathers1.rotateAngleY + (float) Math.toRadians(yy), headFeathers1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 64) / 15) * (18-(0)));
            yy = 0 + (((tickAnim - 64) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 15) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 95) {
            xx = 18 + (((tickAnim - 79) / 16) * (0-(18)));
            yy = 0 + (((tickAnim - 79) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 63 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 63) / 9) * (1.75-(0)));
            yy = 0 + (((tickAnim - 63) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 9) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 1.75 + (((tickAnim - 72) / 6) * (0-(1.75)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 25) / 25) * (7.75-(5.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 7.75 + (((tickAnim - 50) / 3) * (8.25-(7.75)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 8.25 + (((tickAnim - 53) / 4) * (7.75-(8.25)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 7.75 + (((tickAnim - 57) / 3) * (8.25-(7.75)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 8.25 + (((tickAnim - 60) / 3) * (7.75-(8.25)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = 7.75 + (((tickAnim - 63) / 77) * (0-(7.75)));
            yy = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0.4 + (((tickAnim - 25) / 25) * (0.55-(0.4)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 50) / 3) * (0.7-(0.55)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            yy = 0.7 + (((tickAnim - 53) / 4) * (0.55-(0.7)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 57) / 3) * (0.7-(0.55)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 60) / 3) * (0.55-(0.7)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 63) / 77) * (0-(0)));
            yy = 0.55 + (((tickAnim - 63) / 77) * (0-(0.55)));
            zz = 0 + (((tickAnim - 63) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 7 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 7) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 7) / 4) * (0.02-(1)));
            zz = 1 + (((tickAnim - 7) / 4) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 11) / 1) * (1-(1)));
            yy = 0.02 + (((tickAnim - 11) / 1) * (0.02-(0.02)));
            zz = 1 + (((tickAnim - 11) / 1) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (1-(1)));
            yy = 0.02 + (((tickAnim - 12) / 3) * (1-(0.02)));
            zz = 1 + (((tickAnim - 12) / 3) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 41) {
            xx = 1 + (((tickAnim - 15) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 26) * (1-(1)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 41) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 5) * (0.025-(1)));
            zz = 1 + (((tickAnim - 41) / 5) * (1-(1)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 46) / 1) * (1-(1)));
            yy = 0.025 + (((tickAnim - 46) / 1) * (0.025-(0.025)));
            zz = 1 + (((tickAnim - 46) / 1) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 47) / 3) * (1-(1)));
            yy = 0.025 + (((tickAnim - 47) / 3) * (1-(0.025)));
            zz = 1 + (((tickAnim - 47) / 3) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 85) {
            xx = 1 + (((tickAnim - 50) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 35) * (1-(1)));
        }
        else if (tickAnim >= 85 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 85) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 85) / 5) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 85) / 5) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 91) {
            xx = 1 + (((tickAnim - 90) / 1) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 90) / 1) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 90) / 1) * (1-(1)));
        }
        else if (tickAnim >= 91 && tickAnim < 96) {
            xx = 1 + (((tickAnim - 91) / 5) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 91) / 5) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 91) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = -14.25 + (((tickAnim - 25) / 38) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = -14.25 + (((tickAnim - 63) / 18) * (-11-(-14.25)));
            yy = 0 + (((tickAnim - 63) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 18) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = -11 + (((tickAnim - 81) / 15) * (-7.75-(-11)));
            yy = 0 + (((tickAnim - 81) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 15) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = -7.75 + (((tickAnim - 96) / 14) * (-7.5-(-7.75)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -7.5 + (((tickAnim - 110) / 30) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.87-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5.87 + (((tickAnim - 13) / 12) * (-7.25-(-5.87)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 110) {
            xx = -7.25 + (((tickAnim - 25) / 85) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 85) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 127) {
            xx = -7.25 + (((tickAnim - 110) / 17) * (30.53-(-7.25)));
            yy = 0 + (((tickAnim - 110) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 17) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 30.53 + (((tickAnim - 127) / 13) * (0-(30.53)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-39.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -39.5 + (((tickAnim - 13) / 12) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 85) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 110) / 17) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 110) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 17) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = -36.5 + (((tickAnim - 127) / 13) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 12) * (0-(0.675)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (71.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 71.5 + (((tickAnim - 13) / 12) * (13-(71.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 110) {
            xx = 13 + (((tickAnim - 25) / 85) * (13-(13)));
            yy = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 85) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 127) {
            xx = 13 + (((tickAnim - 110) / 17) * (76.03-(13)));
            yy = 0 + (((tickAnim - 110) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 17) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 76.03 + (((tickAnim - 127) / 13) * (0-(76.03)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(0);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(0);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (44-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 44 + (((tickAnim - 13) / 12) * (0-(44)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 85) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 110) / 17) * (35.75-(0)));
            yy = 0 + (((tickAnim - 110) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 17) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 35.75 + (((tickAnim - 127) / 13) * (0-(35.75)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 21 + (((tickAnim - 13) / 12) * (0-(21)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 85) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (-16-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 127) {
            xx = -16 + (((tickAnim - 118) / 9) * (34-(-16)));
            yy = 0 + (((tickAnim - 118) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 9) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 34 + (((tickAnim - 127) / 13) * (0-(34)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.175-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 13) / 97) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 97) * (0-(0)));
            zz = 0.175 + (((tickAnim - 13) / 97) * (0-(0.175)));
        }
        else if (tickAnim >= 110 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 110) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 17) * (0.1-(0)));
            zz = 0 + (((tickAnim - 110) / 17) * (0.28-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 127) / 13) * (0-(0.1)));
            zz = 0.28 + (((tickAnim - 127) / 13) * (0-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = -0.75 + (((tickAnim - 25) / 38) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 81) {
            xx = -0.75 + (((tickAnim - 63) / 18) * (2.5-(-0.75)));
            yy = 0 + (((tickAnim - 63) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 18) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 96) {
            xx = 2.5 + (((tickAnim - 81) / 15) * (6-(2.5)));
            yy = 0 + (((tickAnim - 81) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 15) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 6 + (((tickAnim - 96) / 14) * (6.75-(6)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 6.75 + (((tickAnim - 110) / 30) * (0-(6.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = -7.5 + (((tickAnim - 25) / 38) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 96) {
            xx = -7.5 + (((tickAnim - 63) / 33) * (-8.5-(-7.5)));
            yy = 0 + (((tickAnim - 63) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 33) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = -8.5 + (((tickAnim - 96) / 14) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -8.5 + (((tickAnim - 110) / 30) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = -13 + (((tickAnim - 25) / 38) * (-13-(-13)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 96) {
            xx = -13 + (((tickAnim - 63) / 33) * (-13-(-13)));
            yy = 0 + (((tickAnim - 63) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 33) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = -13 + (((tickAnim - 96) / 14) * (-13-(-13)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -13 + (((tickAnim - 110) / 30) * (0-(-13)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 63) {
            xx = 13.75 + (((tickAnim - 25) / 38) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 25) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 38) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 96) {
            xx = 13.75 + (((tickAnim - 63) / 33) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 63) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 33) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 110) {
            xx = 13.75 + (((tickAnim - 96) / 14) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 96) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 14) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 13.75 + (((tickAnim - 110) / 30) * (0-(13.75)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*10 + (((tickAnim - 13) / 20) * (0-(-1.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.5))*10)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-18-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-18 + (((tickAnim - 13) / 5) * (19.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(12.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-18)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 19.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 18) / 15) * (0-(19.135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.5 + (((tickAnim - 13) / 5) * (7.11-(8.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.11 + (((tickAnim - 18) / 15) * (0-(7.11)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 18) / 15) * (0-(8.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 50.5 + (((tickAnim - 14) / 7) * (31.425-(50.5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 31.425 + (((tickAnim - 21) / 7) * (50.5-(31.425)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 50.5 + (((tickAnim - 28) / 5) * (0-(50.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers1, headFeathers1.rotateAngleX + (float) Math.toRadians(xx), headFeathers1.rotateAngleY + (float) Math.toRadians(yy), headFeathers1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 22 + (((tickAnim - 14) / 7) * (13.575-(22)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 13.575 + (((tickAnim - 21) / 7) * (22-(13.575)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 22 + (((tickAnim - 28) / 5) * (0-(22)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 5) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -13.75 + (((tickAnim - 13) / 20) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 4) * (-0.36-(-0.175)));
            zz = 0.525 + (((tickAnim - 13) / 4) * (0.34-(0.525)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            yy = -0.36 + (((tickAnim - 17) / 16) * (0-(-0.36)));
            zz = 0.34 + (((tickAnim - 17) / 16) * (0-(0.34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 0) / 13) * (1.1725-(1)));
            yy = 1 + (((tickAnim - 0) / 13) * (-1.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(1)));
            zz = 1 + (((tickAnim - 0) / 13) * (1.365-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 1.1725 + (((tickAnim - 13) / 20) * (1-(1.1725)));
            yy = -1.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 13) / 20) * (1-(-1.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 1.365 + (((tickAnim - 13) / 20) * (1-(1.365)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 24) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 24) / 4) * (-0.005-(1)));
            zz = 1 + (((tickAnim - 24) / 4) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 28) / 5) * (1-(1)));
            yy = -0.005 + (((tickAnim - 28) / 5) * (1-(-0.005)));
            zz = 1 + (((tickAnim - 28) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 5) / 10) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 5) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -3 + (((tickAnim - 5) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 5) / 10) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 5) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 425;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -26.25 + (((tickAnim - 25) / 44) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -26.25 + (((tickAnim - 69) / 317) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -26.25 + (((tickAnim - 386) / 14) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -26.25 + (((tickAnim - 400) / 13) * (7-(-26.25)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 7 + (((tickAnim - 413) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-5.175-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (5.575-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            yy = -5.175 + (((tickAnim - 25) / 44) * (-5.175-(-5.175)));
            zz = 5.575 + (((tickAnim - 25) / 44) * (5.575-(5.575)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            yy = -5.175 + (((tickAnim - 69) / 317) * (-5.175-(-5.175)));
            zz = 5.575 + (((tickAnim - 69) / 317) * (5.575-(5.575)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = -5.175 + (((tickAnim - 386) / 14) * (-5.175-(-5.175)));
            zz = 5.575 + (((tickAnim - 386) / 14) * (5.575-(5.575)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = -5.175 + (((tickAnim - 400) / 25) * (0-(-5.175)));
            zz = 5.575 + (((tickAnim - 400) / 25) * (0-(5.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 13) / 12) * (-4.75-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -4.75 + (((tickAnim - 25) / 44) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -4.75 + (((tickAnim - 69) / 317) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -4.75 + (((tickAnim - 386) / 14) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -4.75 + (((tickAnim - 400) / 13) * (-2.75-(-4.75)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -2.75 + (((tickAnim - 413) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -6.5 + (((tickAnim - 13) / 12) * (1.75-(-6.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 1.75 + (((tickAnim - 25) / 44) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 1.75 + (((tickAnim - 69) / 317) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 1.75 + (((tickAnim - 386) / 14) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 407) {
            xx = 1.75 + (((tickAnim - 400) / 7) * (-9.63-(1.75)));
            yy = 0 + (((tickAnim - 400) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 7) * (0-(0)));
        }
        else if (tickAnim >= 407 && tickAnim < 413) {
            xx = -9.63 + (((tickAnim - 407) / 6) * (-11.68-(-9.63)));
            yy = 0 + (((tickAnim - 407) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 407) / 6) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -11.68 + (((tickAnim - 413) / 12) * (0-(-11.68)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 8 + (((tickAnim - 13) / 12) * (22.5-(8)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 22.5 + (((tickAnim - 25) / 44) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 22.5 + (((tickAnim - 69) / 317) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 22.5 + (((tickAnim - 386) / 14) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 407) {
            xx = 22.5 + (((tickAnim - 400) / 7) * (0.12-(22.5)));
            yy = 0 + (((tickAnim - 400) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 7) * (0-(0)));
        }
        else if (tickAnim >= 407 && tickAnim < 413) {
            xx = 0.12 + (((tickAnim - 407) / 6) * (-3-(0.12)));
            yy = 0 + (((tickAnim - 407) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 407) / 6) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -3 + (((tickAnim - 413) / 12) * (0-(-3)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.775-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = -0.775 + (((tickAnim - 25) / 44) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = -0.775 + (((tickAnim - 69) / 317) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = -0.775 + (((tickAnim - 386) / 14) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = -0.775 + (((tickAnim - 400) / 25) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10.58-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -10.58 + (((tickAnim - 7) / 6) * (31.25-(-10.58)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 31.25 + (((tickAnim - 13) / 12) * (15.5-(31.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 15.5 + (((tickAnim - 25) / 44) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 15.5 + (((tickAnim - 69) / 317) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 15.5 + (((tickAnim - 386) / 14) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 407) {
            xx = 15.5 + (((tickAnim - 400) / 7) * (12.26-(15.5)));
            yy = 0 + (((tickAnim - 400) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 7) * (0-(0)));
        }
        else if (tickAnim >= 407 && tickAnim < 413) {
            xx = 12.26 + (((tickAnim - 407) / 6) * (-4.77-(12.26)));
            yy = 0 + (((tickAnim - 407) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 407) / 6) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -4.77 + (((tickAnim - 413) / 12) * (0-(-4.77)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 13) / 387) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 387) * (0-(0)));
            zz = -1.125 + (((tickAnim - 13) / 387) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = -1.125 + (((tickAnim - 400) / 25) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 29.25 + (((tickAnim - 25) / 9) * (29.5-(29.25)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 29.5 + (((tickAnim - 34) / 12) * (30.25-(29.5)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 69) {
            xx = 30.25 + (((tickAnim - 46) / 23) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 46) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 23) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = 30.25 + (((tickAnim - 69) / 306) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 69) / 306) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 306) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 30.25 + (((tickAnim - 375) / 11) * (20.5-(30.25)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 20.5 + (((tickAnim - 386) / 14) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 20.5 + (((tickAnim - 400) / 25) * (0-(20.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 13.25 + (((tickAnim - 25) / 9) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 13.25 + (((tickAnim - 34) / 12) * (13.75-(13.25)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 69) {
            xx = 13.75 + (((tickAnim - 46) / 23) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 46) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 23) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = 13.75 + (((tickAnim - 69) / 306) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 69) / 306) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 306) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 13.75 + (((tickAnim - 375) / 11) * (0.25-(13.75)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0.25 + (((tickAnim - 386) / 14) * (-1.75-(0.25)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -1.75 + (((tickAnim - 400) / 25) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.05645-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (10.28403-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-12.24665-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -3.05645 + (((tickAnim - 25) / 44) * (-3.05645-(-3.05645)));
            yy = 10.28403 + (((tickAnim - 25) / 44) * (10.28403-(10.28403)));
            zz = -12.24665 + (((tickAnim - 25) / 44) * (-12.24665-(-12.24665)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = -3.05645 + (((tickAnim - 69) / 306) * (-3.05645-(-3.05645)));
            yy = 10.28403 + (((tickAnim - 69) / 306) * (10.28403-(10.28403)));
            zz = -12.24665 + (((tickAnim - 69) / 306) * (-12.24665-(-12.24665)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = -3.05645 + (((tickAnim - 375) / 11) * (5.69355-(-3.05645)));
            yy = 10.28403 + (((tickAnim - 375) / 11) * (10.28403-(10.28403)));
            zz = -12.24665 + (((tickAnim - 375) / 11) * (-12.24665-(-12.24665)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 5.69355 + (((tickAnim - 386) / 14) * (5.69355-(5.69355)));
            yy = 10.28403 + (((tickAnim - 386) / 14) * (10.28403-(10.28403)));
            zz = -12.24665 + (((tickAnim - 386) / 14) * (-12.24665-(-12.24665)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 5.69355 + (((tickAnim - 400) / 25) * (0-(5.69355)));
            yy = 10.28403 + (((tickAnim - 400) / 25) * (0-(10.28403)));
            zz = -12.24665 + (((tickAnim - 400) / 25) * (0-(-12.24665)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -34.75 + (((tickAnim - 25) / 44) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = -34.75 + (((tickAnim - 69) / 306) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 69) / 306) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 306) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = -34.75 + (((tickAnim - 375) / 11) * (-18.75-(-34.75)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -18.75 + (((tickAnim - 386) / 14) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -18.75 + (((tickAnim - 400) / 25) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 18.75 + (((tickAnim - 25) / 44) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = 18.75 + (((tickAnim - 69) / 306) * (26-(18.75)));
            yy = 0 + (((tickAnim - 69) / 306) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 306) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 26 + (((tickAnim - 375) / 11) * (17.5-(26)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 17.5 + (((tickAnim - 386) / 14) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 17.5 + (((tickAnim - 400) / 25) * (0-(17.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.05645-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-10.284-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (12.2467-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -3.05645 + (((tickAnim - 25) / 44) * (-3.05645-(-3.05645)));
            yy = -10.284 + (((tickAnim - 25) / 44) * (-10.284-(-10.284)));
            zz = 12.2467 + (((tickAnim - 25) / 44) * (12.2467-(12.2467)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = -3.05645 + (((tickAnim - 69) / 306) * (-3.05645-(-3.05645)));
            yy = -10.284 + (((tickAnim - 69) / 306) * (-10.284-(-10.284)));
            zz = 12.2467 + (((tickAnim - 69) / 306) * (12.2467-(12.2467)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = -3.05645 + (((tickAnim - 375) / 11) * (6.69355-(-3.05645)));
            yy = -10.284 + (((tickAnim - 375) / 11) * (-10.284-(-10.284)));
            zz = 12.2467 + (((tickAnim - 375) / 11) * (12.2467-(12.2467)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 6.69355 + (((tickAnim - 386) / 14) * (6.69355-(6.69355)));
            yy = -10.284 + (((tickAnim - 386) / 14) * (-10.284-(-10.284)));
            zz = 12.2467 + (((tickAnim - 386) / 14) * (12.2467-(12.2467)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 6.69355 + (((tickAnim - 400) / 25) * (0-(6.69355)));
            yy = -10.284 + (((tickAnim - 400) / 25) * (0-(-10.284)));
            zz = 12.2467 + (((tickAnim - 400) / 25) * (0-(12.2467)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -34.75 + (((tickAnim - 25) / 44) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 375) {
            xx = -34.75 + (((tickAnim - 69) / 306) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 69) / 306) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 306) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = -34.75 + (((tickAnim - 375) / 11) * (-1.5-(-34.75)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -1.5 + (((tickAnim - 386) / 14) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -1.5 + (((tickAnim - 400) / 25) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 77) {
            xx = 18.75 + (((tickAnim - 25) / 52) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 25) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 52) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 375) {
            xx = 18.75 + (((tickAnim - 77) / 298) * (29.5-(18.75)));
            yy = 0 + (((tickAnim - 77) / 298) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 298) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 29.5 + (((tickAnim - 375) / 11) * (17-(29.5)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 17 + (((tickAnim - 386) / 14) * (17-(17)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 17 + (((tickAnim - 400) / 25) * (0-(17)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 9.75 + (((tickAnim - 25) / 9) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 77) {
            xx = 9.75 + (((tickAnim - 34) / 43) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 34) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 43) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 373) {
            xx = 9.75 + (((tickAnim - 77) / 296) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 77) / 296) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 296) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 375) {
            xx = 9.75 + (((tickAnim - 373) / 2) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 373) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 2) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 9.75 + (((tickAnim - 375) / 11) * (11.47165-(9.75)));
            yy = 0 + (((tickAnim - 375) / 11) * (11.58593-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (-5.35775-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 11.47165 + (((tickAnim - 386) / 14) * (11.47165-(11.47165)));
            yy = 11.58593 + (((tickAnim - 386) / 14) * (11.58593-(11.58593)));
            zz = -5.35775 + (((tickAnim - 386) / 14) * (-5.35775-(-5.35775)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 11.47165 + (((tickAnim - 400) / 13) * (26.25-(11.47165)));
            yy = 11.58593 + (((tickAnim - 400) / 13) * (0-(11.58593)));
            zz = -5.35775 + (((tickAnim - 400) / 13) * (0-(-5.35775)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 26.25 + (((tickAnim - 413) / 12) * (0-(26.25)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 0) / 386) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 386) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 386) * (0.6-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0.475 + (((tickAnim - 386) / 14) * (0.475-(0.475)));
            yy = -0.625 + (((tickAnim - 386) / 14) * (-0.625-(-0.625)));
            zz = 0.6 + (((tickAnim - 386) / 14) * (0.6-(0.6)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0.475 + (((tickAnim - 400) / 25) * (0-(0.475)));
            yy = -0.625 + (((tickAnim - 400) / 25) * (0-(-0.625)));
            zz = 0.6 + (((tickAnim - 400) / 25) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-44.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -44.75 + (((tickAnim - 25) / 9) * (-44.75-(-44.75)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = -44.75 + (((tickAnim - 34) / 12) * (-48.5-(-44.75)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 77) {
            xx = -48.5 + (((tickAnim - 46) / 31) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 46) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 31) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 373) {
            xx = -48.5 + (((tickAnim - 77) / 296) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 77) / 296) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 296) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 375) {
            xx = -48.5 + (((tickAnim - 373) / 2) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 373) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 2) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = -48.5 + (((tickAnim - 375) / 11) * (-30.75-(-48.5)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -30.75 + (((tickAnim - 386) / 14) * (-23.75-(-30.75)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -23.75 + (((tickAnim - 400) / 13) * (-32.25-(-23.75)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -32.25 + (((tickAnim - 413) / 12) * (0-(-32.25)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = -0.475 + (((tickAnim - 25) / 9) * (-0.475-(-0.475)));
            zz = 2 + (((tickAnim - 25) / 9) * (2-(2)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 34) / 12) * (-0.705-(-0.475)));
            zz = 2 + (((tickAnim - 34) / 12) * (2-(2)));
        }
        else if (tickAnim >= 46 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 46) / 31) * (0-(0)));
            yy = -0.705 + (((tickAnim - 46) / 31) * (-0.705-(-0.705)));
            zz = 2 + (((tickAnim - 46) / 31) * (2-(2)));
        }
        else if (tickAnim >= 77 && tickAnim < 373) {
            xx = 0 + (((tickAnim - 77) / 296) * (0-(0)));
            yy = -0.705 + (((tickAnim - 77) / 296) * (-0.705-(-0.705)));
            zz = 2 + (((tickAnim - 77) / 296) * (2-(2)));
        }
        else if (tickAnim >= 373 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 373) / 2) * (0-(0)));
            yy = -0.705 + (((tickAnim - 373) / 2) * (-0.705-(-0.705)));
            zz = 2 + (((tickAnim - 373) / 2) * (2-(2)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            yy = -0.705 + (((tickAnim - 375) / 11) * (0-(-0.705)));
            zz = 2 + (((tickAnim - 375) / 11) * (1.1-(2)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (-0.275-(0)));
            zz = 1.1 + (((tickAnim - 386) / 14) * (1.35-(1.1)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 400) / 13) * (-0.355-(-0.275)));
            zz = 1.35 + (((tickAnim - 400) / 13) * (1.005-(1.35)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            yy = -0.355 + (((tickAnim - 413) / 12) * (0-(-0.355)));
            zz = 1.005 + (((tickAnim - 413) / 12) * (0-(1.005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 21.5 + (((tickAnim - 25) / 9) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 21.5 + (((tickAnim - 34) / 12) * (13.5-(21.5)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 77) {
            xx = 13.5 + (((tickAnim - 46) / 31) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 46) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 31) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 373) {
            xx = 13.5 + (((tickAnim - 77) / 296) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 77) / 296) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 296) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 375) {
            xx = 13.5 + (((tickAnim - 373) / 2) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 373) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 2) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 13.5 + (((tickAnim - 375) / 11) * (-8-(13.5)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -8 + (((tickAnim - 386) / 14) * (-16.75-(-8)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -16.75 + (((tickAnim - 400) / 13) * (-16.5-(-16.75)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -16.5 + (((tickAnim - 413) / 12) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.475-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -0.025 + (((tickAnim - 25) / 9) * (-0.025-(-0.025)));
            yy = 0.25 + (((tickAnim - 25) / 9) * (0.25-(0.25)));
            zz = 0.475 + (((tickAnim - 25) / 9) * (0.475-(0.475)));
        }
        else if (tickAnim >= 34 && tickAnim < 386) {
            xx = -0.025 + (((tickAnim - 34) / 352) * (0-(-0.025)));
            yy = 0.25 + (((tickAnim - 34) / 352) * (0-(0.25)));
            zz = 0.475 + (((tickAnim - 34) / 352) * (0-(0.475)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (-4-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -4 + (((tickAnim - 46) / 9) * (0-(-4)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 55) / 6) * (2-(0)));
            yy = 0 + (((tickAnim - 55) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 6) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 66) {
            xx = 2 + (((tickAnim - 61) / 5) * (1.5-(2)));
            yy = 0 + (((tickAnim - 61) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 5) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 93) {
            xx = 1.5 + (((tickAnim - 66) / 27) * (4.75-(1.5)));
            yy = 0 + (((tickAnim - 66) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 27) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 353) {
            xx = 4.75 + (((tickAnim - 93) / 260) * (8.76-(4.75)));
            yy = 0 + (((tickAnim - 93) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 260) * (0-(0)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = 8.76 + (((tickAnim - 353) / 5) * (8.01-(8.76)));
            yy = 0 + (((tickAnim - 353) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 353) / 5) * (0-(0)));
        }
        else if (tickAnim >= 358 && tickAnim < 368) {
            xx = 8.01 + (((tickAnim - 358) / 10) * (7.51-(8.01)));
            yy = 0 + (((tickAnim - 358) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 358) / 10) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 373) {
            xx = 7.51 + (((tickAnim - 368) / 5) * (8.76-(7.51)));
            yy = 0 + (((tickAnim - 368) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 5) * (0-(0)));
        }
        else if (tickAnim >= 373 && tickAnim < 375) {
            xx = 8.76 + (((tickAnim - 373) / 2) * (8.76-(8.76)));
            yy = 0 + (((tickAnim - 373) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 373) / 2) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 380) {
            xx = 8.76 + (((tickAnim - 375) / 5) * (18.8992-(8.76)));
            yy = 0 + (((tickAnim - 375) / 5) * (12.49182-(0)));
            zz = 0 + (((tickAnim - 375) / 5) * (9.04008-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 386) {
            xx = 18.8992 + (((tickAnim - 380) / 6) * (29.41061-(18.8992)));
            yy = 12.49182 + (((tickAnim - 380) / 6) * (10.86332-(12.49182)));
            zz = 9.04008 + (((tickAnim - 380) / 6) * (14.75388-(9.04008)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 29.41061 + (((tickAnim - 386) / 14) * (35.91061-(29.41061)));
            yy = 10.86332 + (((tickAnim - 386) / 14) * (10.86332-(10.86332)));
            zz = 14.75388 + (((tickAnim - 386) / 14) * (14.75388-(14.75388)));
        }
        else if (tickAnim >= 400 && tickAnim < 406) {
            xx = 35.91061 + (((tickAnim - 400) / 6) * (-10.4253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(35.91061)));
            yy = 10.86332 + (((tickAnim - 400) / 6) * (6.11061-(10.86332)));
            zz = 14.75388 + (((tickAnim - 400) / 6) * (8.29906-(14.75388)));
        }
        else if (tickAnim >= 406 && tickAnim < 413) {
            xx = -10.4253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 406) / 7) * (0-(-10.4253+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 6.11061 + (((tickAnim - 406) / 7) * (0-(6.11061)));
            zz = 8.29906 + (((tickAnim - 406) / 7) * (0-(8.29906)));
        }
        else if (tickAnim >= 413 && tickAnim < 419) {
            xx = 0 + (((tickAnim - 413) / 6) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 413) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 6) * (0-(0)));
        }
        else if (tickAnim >= 419 && tickAnim < 425) {
            xx = -13.5 + (((tickAnim - 419) / 6) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 419) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 419) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 34 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 34) / 352) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 352) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 352) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (34.56866-(0)));
            yy = 0 + (((tickAnim - 34) / 12) * (0.18501-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (1.44242-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 34.56866 + (((tickAnim - 46) / 2) * (35.5-(34.56866)));
            yy = 0.18501 + (((tickAnim - 46) / 2) * (0-(0.18501)));
            zz = 1.44242 + (((tickAnim - 46) / 2) * (0-(1.44242)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 35.5 + (((tickAnim - 48) / 7) * (0-(35.5)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 55) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 14) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 20) / 5) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 25) / 1) * (1-(1)));
            yy = 0.02 + (((tickAnim - 25) / 1) * (0.02-(0.02)));
            zz = 1 + (((tickAnim - 25) / 1) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 26) / 6) * (1-(1)));
            yy = 0.02 + (((tickAnim - 26) / 6) * (1-(0.02)));
            zz = 1 + (((tickAnim - 26) / 6) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 32) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 32) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 32) / 2) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 34) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 9) * (0.05-(1)));
            zz = 1 + (((tickAnim - 34) / 9) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 43) / 3) * (1-(1)));
            yy = 0.05 + (((tickAnim - 43) / 3) * (0-(0.05)));
            zz = 1 + (((tickAnim - 43) / 3) * (1-(1)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 46) / 9) * (1-(1)));
            yy = 0 + (((tickAnim - 46) / 9) * (0.3575-(0)));
            zz = 1 + (((tickAnim - 46) / 9) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 61) {
            xx = 1 + (((tickAnim - 55) / 6) * (1-(1)));
            yy = 0.3575 + (((tickAnim - 55) / 6) * (0.0325-(0.3575)));
            zz = 1 + (((tickAnim - 55) / 6) * (1-(1)));
        }
        else if (tickAnim >= 61 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 61) / 1) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 61) / 1) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 61) / 1) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = 1 + (((tickAnim - 62) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 62) / 4) * (0.3575-(0.0325)));
            zz = 1 + (((tickAnim - 62) / 4) * (1-(1)));
        }
        else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 1 + (((tickAnim - 66) / 3) * (1-(1)));
            yy = 0.3575 + (((tickAnim - 66) / 3) * (0-(0.3575)));
            zz = 1 + (((tickAnim - 66) / 3) * (1-(1)));
        }
        else if (tickAnim >= 69 && tickAnim < 353) {
            xx = 1 + (((tickAnim - 69) / 284) * (1-(1)));
            yy = 0 + (((tickAnim - 69) / 284) * (0-(0)));
            zz = 1 + (((tickAnim - 69) / 284) * (1-(1)));
        }
        else if (tickAnim >= 353 && tickAnim < 358) {
            xx = 1 + (((tickAnim - 353) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 353) / 5) * (0.11-(0)));
            zz = 1 + (((tickAnim - 353) / 5) * (1-(1)));
        }
        else if (tickAnim >= 358 && tickAnim < 367) {
            xx = 1 + (((tickAnim - 358) / 9) * (1-(1)));
            yy = 0.11 + (((tickAnim - 358) / 9) * (0.11-(0.11)));
            zz = 1 + (((tickAnim - 358) / 9) * (1-(1)));
        }
        else if (tickAnim >= 367 && tickAnim < 371) {
            xx = 1 + (((tickAnim - 367) / 4) * (1-(1)));
            yy = 0.11 + (((tickAnim - 367) / 4) * (0-(0.11)));
            zz = 1 + (((tickAnim - 367) / 4) * (1-(1)));
        }
        else if (tickAnim >= 371 && tickAnim < 375) {
            xx = 1 + (((tickAnim - 371) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 371) / 4) * (0-(0)));
            zz = 1 + (((tickAnim - 371) / 4) * (1-(1)));
        }
        else if (tickAnim >= 375 && tickAnim < 380) {
            xx = 1 + (((tickAnim - 375) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 375) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 375) / 5) * (1-(1)));
        }
        else if (tickAnim >= 380 && tickAnim < 386) {
            xx = 1 + (((tickAnim - 380) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 380) / 6) * (1-(1)));
            zz = 1 + (((tickAnim - 380) / 6) * (1-(1)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 1 + (((tickAnim - 386) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 386) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 386) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -9.5 + (((tickAnim - 25) / 44) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -9.5 + (((tickAnim - 69) / 317) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -9.5 + (((tickAnim - 386) / 14) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -9.5 + (((tickAnim - 400) / 25) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 22 + (((tickAnim - 25) / 44) * (22-(22)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 22 + (((tickAnim - 69) / 317) * (22-(22)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 22 + (((tickAnim - 386) / 14) * (22-(22)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 22 + (((tickAnim - 400) / 13) * (-10.5-(22)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -10.5 + (((tickAnim - 413) / 12) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-56-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -56 + (((tickAnim - 25) / 44) * (-56-(-56)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -56 + (((tickAnim - 69) / 317) * (-56-(-56)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -56 + (((tickAnim - 386) / 14) * (-56-(-56)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -56 + (((tickAnim - 400) / 13) * (-44.38-(-56)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -44.38 + (((tickAnim - 413) / 12) * (0-(-44.38)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 25) / 361) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 361) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 361) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 13) * (0.775-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            yy = 0.775 + (((tickAnim - 413) / 12) * (0-(0.775)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (71.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 71.5 + (((tickAnim - 25) / 44) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 71.5 + (((tickAnim - 69) / 317) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 71.5 + (((tickAnim - 386) / 14) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 71.5 + (((tickAnim - 400) / 13) * (51.37-(71.5)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 51.37 + (((tickAnim - 413) / 12) * (0-(51.37)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.225 + (((tickAnim - 11) / 14) * (0-(0.225)));
            zz = -0.21 + (((tickAnim - 11) / 14) * (0.55-(-0.21)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0.55 + (((tickAnim - 25) / 44) * (0.55-(0.55)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0.55 + (((tickAnim - 69) / 317) * (0.55-(0.55)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0.55 + (((tickAnim - 386) / 14) * (0.55-(0.55)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0.55 + (((tickAnim - 400) / 25) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 30.5 + (((tickAnim - 25) / 44) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 30.5 + (((tickAnim - 69) / 317) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 30.5 + (((tickAnim - 386) / 14) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 30.5 + (((tickAnim - 400) / 25) * (0-(30.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -9.5 + (((tickAnim - 25) / 44) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -9.5 + (((tickAnim - 69) / 317) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -9.5 + (((tickAnim - 386) / 14) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -9.5 + (((tickAnim - 400) / 25) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 22 + (((tickAnim - 25) / 44) * (22-(22)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 22 + (((tickAnim - 69) / 317) * (22-(22)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 22 + (((tickAnim - 386) / 14) * (22-(22)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 22 + (((tickAnim - 400) / 13) * (-10.25-(22)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -10.25 + (((tickAnim - 413) / 12) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-56-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = -56 + (((tickAnim - 25) / 44) * (-56-(-56)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = -56 + (((tickAnim - 69) / 317) * (-56-(-56)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = -56 + (((tickAnim - 386) / 14) * (-56-(-56)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = -56 + (((tickAnim - 400) / 13) * (-44.38-(-56)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = -44.38 + (((tickAnim - 413) / 12) * (0-(-44.38)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 25) / 375) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 375) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 375) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 13) * (0.775-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            yy = 0.775 + (((tickAnim - 413) / 12) * (0-(0.775)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (71.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 71.5 + (((tickAnim - 25) / 44) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 71.5 + (((tickAnim - 69) / 317) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 71.5 + (((tickAnim - 386) / 14) * (71.5-(71.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 71.5 + (((tickAnim - 400) / 13) * (51.37-(71.5)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 51.37 + (((tickAnim - 413) / 12) * (0-(51.37)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.21-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0.225 + (((tickAnim - 11) / 14) * (0-(0.225)));
            zz = -0.21 + (((tickAnim - 11) / 14) * (0.55-(-0.21)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0.55 + (((tickAnim - 25) / 44) * (0.55-(0.55)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0.55 + (((tickAnim - 69) / 317) * (0.55-(0.55)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0.55 + (((tickAnim - 386) / 14) * (0.55-(0.55)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0.55 + (((tickAnim - 400) / 25) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 69) {
            xx = 33 + (((tickAnim - 25) / 44) * (33-(33)));
            yy = 0 + (((tickAnim - 25) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 44) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 386) {
            xx = 33 + (((tickAnim - 69) / 317) * (33-(33)));
            yy = 0 + (((tickAnim - 69) / 317) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 317) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 33 + (((tickAnim - 386) / 14) * (33-(33)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 33 + (((tickAnim - 400) / 25) * (0-(33)));
            yy = 0 + (((tickAnim - 400) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 374) {
            xx = 0 + (((tickAnim - 0) / 374) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 374) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 374) * (0-(0)));
        }
        else if (tickAnim >= 374 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 374) / 12) * (56.5-(0)));
            yy = 0 + (((tickAnim - 374) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 374) / 12) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 56.5 + (((tickAnim - 386) / 14) * (83.25-(56.5)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 83.25 + (((tickAnim - 400) / 13) * (0-(83.25)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers1, headFeathers1.rotateAngleX + (float) Math.toRadians(xx), headFeathers1.rotateAngleY + (float) Math.toRadians(yy), headFeathers1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 374) {
            xx = 0 + (((tickAnim - 0) / 374) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 374) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 374) * (0-(0)));
        }
        else if (tickAnim >= 374 && tickAnim < 386) {
            xx = 0 + (((tickAnim - 374) / 12) * (29.25-(0)));
            yy = 0 + (((tickAnim - 374) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 374) / 12) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 400) {
            xx = 29.25 + (((tickAnim - 386) / 14) * (49.5-(29.25)));
            yy = 0 + (((tickAnim - 386) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 14) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 49.5 + (((tickAnim - 400) / 13) * (0-(49.5)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headFeathers2, headFeathers2.rotateAngleX + (float) Math.toRadians(xx), headFeathers2.rotateAngleY + (float) Math.toRadians(yy), headFeathers2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 400) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 400) / 13) * (2.25-(0)));
            yy = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 419) {
            xx = 2.25 + (((tickAnim - 413) / 6) * (6.25-(2.25)));
            yy = 0 + (((tickAnim - 413) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 6) * (0-(0)));
        }
        else if (tickAnim >= 419 && tickAnim < 425) {
            xx = 6.25 + (((tickAnim - 419) / 6) * (0-(6.25)));
            yy = 0 + (((tickAnim - 419) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 419) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 400) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 400) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 413) {
            xx = 0 + (((tickAnim - 400) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 13) * (0.175-(0)));
            zz = 0 + (((tickAnim - 400) / 13) * (0-(0)));
        }
        else if (tickAnim >= 413 && tickAnim < 419) {
            xx = 0 + (((tickAnim - 413) / 6) * (0-(0)));
            yy = 0.175 + (((tickAnim - 413) / 6) * (0.605-(0.175)));
            zz = 0 + (((tickAnim - 413) / 6) * (0-(0)));
        }
        else if (tickAnim >= 419 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 419) / 6) * (0-(0)));
            yy = 0.605 + (((tickAnim - 419) / 6) * (0-(0.605)));
            zz = 0 + (((tickAnim - 419) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (-1-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 51) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 24) * (0-(0)));
            zz = -1 + (((tickAnim - 51) / 24) * (-1-(-1)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            zz = -1 + (((tickAnim - 75) / 24) * (-1-(-1)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            zz = -1 + (((tickAnim - 99) / 10) * (-1-(-1)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            zz = -1 + (((tickAnim - 109) / 31) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 51) / 24) * (0-(0)));
            yy = -4 + (((tickAnim - 51) / 24) * (-4-(-4)));
            zz = 0 + (((tickAnim - 51) / 24) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            yy = -4 + (((tickAnim - 75) / 24) * (-4-(-4)));
            zz = 0 + (((tickAnim - 75) / 24) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            yy = -4 + (((tickAnim - 99) / 10) * (-4-(-4)));
            zz = 0 + (((tickAnim - 99) / 10) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            yy = -4 + (((tickAnim - 109) / 31) * (0-(-4)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (-58.29529-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (-12.21277-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (-68.50663-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -58.29529 + (((tickAnim - 51) / 10) * (-51.2984-(-58.29529)));
            yy = -12.21277 + (((tickAnim - 51) / 10) * (-13.70458-(-12.21277)));
            zz = -68.50663 + (((tickAnim - 51) / 10) * (-68.66317-(-68.50663)));
        }
        else if (tickAnim >= 61 && tickAnim < 75) {
            xx = -51.2984 + (((tickAnim - 61) / 14) * (-58.29529-(-51.2984)));
            yy = -13.70458 + (((tickAnim - 61) / 14) * (-12.21277-(-13.70458)));
            zz = -68.66317 + (((tickAnim - 61) / 14) * (-68.50663-(-68.66317)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -58.29529 + (((tickAnim - 75) / 10) * (-51.2984-(-58.29529)));
            yy = -12.21277 + (((tickAnim - 75) / 10) * (-13.70458-(-12.21277)));
            zz = -68.50663 + (((tickAnim - 75) / 10) * (-68.66317-(-68.50663)));
        }
        else if (tickAnim >= 85 && tickAnim < 99) {
            xx = -51.2984 + (((tickAnim - 85) / 14) * (-58.29529-(-51.2984)));
            yy = -13.70458 + (((tickAnim - 85) / 14) * (-12.21277-(-13.70458)));
            zz = -68.66317 + (((tickAnim - 85) / 14) * (-68.50663-(-68.66317)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = -58.29529 + (((tickAnim - 99) / 10) * (-51.2984-(-58.29529)));
            yy = -12.21277 + (((tickAnim - 99) / 10) * (-13.70458-(-12.21277)));
            zz = -68.50663 + (((tickAnim - 99) / 10) * (-68.66317-(-68.50663)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = -51.2984 + (((tickAnim - 109) / 31) * (0-(-51.2984)));
            yy = -13.70458 + (((tickAnim - 109) / 31) * (0-(-13.70458)));
            zz = -68.66317 + (((tickAnim - 109) / 31) * (0-(-68.66317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.52786-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-9.95294-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.32761-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 4.52786 + (((tickAnim - 30) / 21) * (4.52786-(4.52786)));
            yy = -9.95294 + (((tickAnim - 30) / 21) * (-9.95294-(-9.95294)));
            zz = -0.32761 + (((tickAnim - 30) / 21) * (-0.32761-(-0.32761)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 4.52786 + (((tickAnim - 51) / 10) * (5.82657-(4.52786)));
            yy = -9.95294 + (((tickAnim - 51) / 10) * (-18.29435-(-9.95294)));
            zz = -0.32761 + (((tickAnim - 51) / 10) * (-7.63884-(-0.32761)));
        }
        else if (tickAnim >= 61 && tickAnim < 75) {
            xx = 5.82657 + (((tickAnim - 61) / 14) * (4.52786-(5.82657)));
            yy = -18.29435 + (((tickAnim - 61) / 14) * (-9.95294-(-18.29435)));
            zz = -7.63884 + (((tickAnim - 61) / 14) * (-0.32761-(-7.63884)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 4.52786 + (((tickAnim - 75) / 10) * (5.82657-(4.52786)));
            yy = -9.95294 + (((tickAnim - 75) / 10) * (-18.29435-(-9.95294)));
            zz = -0.32761 + (((tickAnim - 75) / 10) * (-7.63884-(-0.32761)));
        }
        else if (tickAnim >= 85 && tickAnim < 99) {
            xx = 5.82657 + (((tickAnim - 85) / 14) * (4.52786-(5.82657)));
            yy = -18.29435 + (((tickAnim - 85) / 14) * (-9.95294-(-18.29435)));
            zz = -7.63884 + (((tickAnim - 85) / 14) * (-0.32761-(-7.63884)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 4.52786 + (((tickAnim - 99) / 10) * (5.82657-(4.52786)));
            yy = -9.95294 + (((tickAnim - 99) / 10) * (-18.29435-(-9.95294)));
            zz = -0.32761 + (((tickAnim - 99) / 10) * (-7.63884-(-0.32761)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 5.82657 + (((tickAnim - 109) / 31) * (0-(5.82657)));
            yy = -18.29435 + (((tickAnim - 109) / 31) * (0-(-18.29435)));
            zz = -7.63884 + (((tickAnim - 109) / 31) * (0-(-7.63884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 4 + (((tickAnim - 30) / 21) * (4-(4)));
            yy = 0 + (((tickAnim - 30) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 21) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 4 + (((tickAnim - 51) / 10) * (-11.64458-(4)));
            yy = 0 + (((tickAnim - 51) / 10) * (-0.25423-(0)));
            zz = 0 + (((tickAnim - 51) / 10) * (-8.48536-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 75) {
            xx = -11.64458 + (((tickAnim - 61) / 14) * (4-(-11.64458)));
            yy = -0.25423 + (((tickAnim - 61) / 14) * (0-(-0.25423)));
            zz = -8.48536 + (((tickAnim - 61) / 14) * (0-(-8.48536)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 4 + (((tickAnim - 75) / 10) * (-11.64458-(4)));
            yy = 0 + (((tickAnim - 75) / 10) * (-0.25423-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (-8.48536-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 99) {
            xx = -11.64458 + (((tickAnim - 85) / 14) * (4-(-11.64458)));
            yy = -0.25423 + (((tickAnim - 85) / 14) * (0-(-0.25423)));
            zz = -8.48536 + (((tickAnim - 85) / 14) * (0-(-8.48536)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 4 + (((tickAnim - 99) / 10) * (-11.64458-(4)));
            yy = 0 + (((tickAnim - 99) / 10) * (-0.25423-(0)));
            zz = 0 + (((tickAnim - 99) / 10) * (-8.48536-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = -11.64458 + (((tickAnim - 109) / 31) * (0-(-11.64458)));
            yy = -0.25423 + (((tickAnim - 109) / 31) * (0-(-0.25423)));
            zz = -8.48536 + (((tickAnim - 109) / 31) * (0-(-8.48536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.47423-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.6811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.3568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -2.47423 + (((tickAnim - 13) / 17) * (16.1457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-20-(-2.47423)));
            yy = 1.6811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 13) / 17) * (-2.10755-(1.6811+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 1.3568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15 + (((tickAnim - 13) / 17) * (-13.9431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(1.3568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-15)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 16.1457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-20 + (((tickAnim - 30) / 21) * (24.12875-(16.1457+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*-20)));
            yy = -2.10755 + (((tickAnim - 30) / 21) * (-15.12459-(-2.10755)));
            zz = -13.9431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 30) / 21) * (6.10477-(-13.9431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 24.12875 + (((tickAnim - 51) / 10) * (23.94991-(24.12875)));
            yy = -15.12459 + (((tickAnim - 51) / 10) * (-19.7838-(-15.12459)));
            zz = 6.10477 + (((tickAnim - 51) / 10) * (6.75581-(6.10477)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 23.94991 + (((tickAnim - 61) / 7) * (24.53827-(23.94991)));
            yy = -19.7838 + (((tickAnim - 61) / 7) * (-48.3056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*35-(-19.7838)));
            zz = 6.75581 + (((tickAnim - 61) / 7) * (4.23374-(6.75581)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 24.53827 + (((tickAnim - 68) / 7) * (24.12875-(24.53827)));
            yy = -48.3056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*35 + (((tickAnim - 68) / 7) * (-15.12459-(-48.3056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*35)));
            zz = 4.23374 + (((tickAnim - 68) / 7) * (6.10477-(4.23374)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 24.12875 + (((tickAnim - 75) / 10) * (23.94991-(24.12875)));
            yy = -15.12459 + (((tickAnim - 75) / 10) * (-19.7838-(-15.12459)));
            zz = 6.10477 + (((tickAnim - 75) / 10) * (6.75581-(6.10477)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 23.94991 + (((tickAnim - 85) / 8) * (24.53827-(23.94991)));
            yy = -19.7838 + (((tickAnim - 85) / 8) * (-20.0056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*-15-(-19.7838)));
            zz = 6.75581 + (((tickAnim - 85) / 8) * (4.23374-(6.75581)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 24.53827 + (((tickAnim - 93) / 6) * (24.12875-(24.53827)));
            yy = -20.0056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*-15 + (((tickAnim - 93) / 6) * (-15.12459-(-20.0056+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+130))*-15)));
            zz = 4.23374 + (((tickAnim - 93) / 6) * (6.10477-(4.23374)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 24.12875 + (((tickAnim - 99) / 10) * (23.94991-(24.12875)));
            yy = -15.12459 + (((tickAnim - 99) / 10) * (-16.7588-(-15.12459)));
            zz = 6.10477 + (((tickAnim - 99) / 10) * (6.75581-(6.10477)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 23.94991 + (((tickAnim - 109) / 31) * (0-(23.94991)));
            yy = -16.7588 + (((tickAnim - 109) / 31) * (0-(-16.7588)));
            zz = 6.75581 + (((tickAnim - 109) / 31) * (0-(6.75581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.34157-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-12.8814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.76143-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -10.34157 + (((tickAnim - 13) / 17) * (13.29397-(-10.34157)));
            yy = -12.8814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10 + (((tickAnim - 13) / 17) * (-20.9956-(-12.8814+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-10)));
            zz = -2.76143 + (((tickAnim - 13) / 17) * (-6.21322-(-2.76143)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 13.29397 + (((tickAnim - 30) / 21) * (25.29397-(13.29397)));
            yy = -20.9956 + (((tickAnim - 30) / 21) * (-20.9956-(-20.9956)));
            zz = -6.21322 + (((tickAnim - 30) / 21) * (-6.21322-(-6.21322)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 25.29397 + (((tickAnim - 51) / 10) * (25.23125-(25.29397)));
            yy = -20.9956 + (((tickAnim - 51) / 10) * (-19.75706-(-20.9956)));
            zz = -6.21322 + (((tickAnim - 51) / 10) * (-6.03312-(-6.21322)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 25.23125 + (((tickAnim - 61) / 7) * (65.8242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*50-(25.23125)));
            yy = -19.75706 + (((tickAnim - 61) / 7) * (-35.9501+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20-(-19.75706)));
            zz = -6.03312 + (((tickAnim - 61) / 7) * (-5.21607-(-6.03312)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 65.8242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*50 + (((tickAnim - 68) / 7) * (25.29397-(65.8242+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-30))*50)));
            yy = -35.9501+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20 + (((tickAnim - 68) / 7) * (-20.9956-(-35.9501+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20)));
            zz = -5.21607 + (((tickAnim - 68) / 7) * (-6.21322-(-5.21607)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 25.29397 + (((tickAnim - 75) / 10) * (25.23125-(25.29397)));
            yy = -20.9956 + (((tickAnim - 75) / 10) * (-19.75706-(-20.9956)));
            zz = -6.21322 + (((tickAnim - 75) / 10) * (-6.03312-(-6.21322)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 25.23125 + (((tickAnim - 85) / 8) * (13.5383-(25.23125)));
            yy = -19.75706 + (((tickAnim - 85) / 8) * (-2.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20-(-19.75706)));
            zz = -6.03312 + (((tickAnim - 85) / 8) * (-5.21607-(-6.03312)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 13.5383 + (((tickAnim - 93) / 6) * (25.29397-(13.5383)));
            yy = -2.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20 + (((tickAnim - 93) / 6) * (-20.9956-(-2.3251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20)));
            zz = -5.21607 + (((tickAnim - 93) / 6) * (-6.21322-(-5.21607)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 25.29397 + (((tickAnim - 99) / 10) * (25.23125-(25.29397)));
            yy = -20.9956 + (((tickAnim - 99) / 10) * (-19.75706-(-20.9956)));
            zz = -6.21322 + (((tickAnim - 99) / 10) * (-6.03312-(-6.21322)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 25.23125 + (((tickAnim - 109) / 16) * (12.4247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*15-(25.23125)));
            yy = -19.75706 + (((tickAnim - 109) / 16) * (-9.61154-(-19.75706)));
            zz = -6.03312 + (((tickAnim - 109) / 16) * (-2.93503-(-6.03312)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 12.4247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*15 + (((tickAnim - 125) / 15) * (0-(12.4247+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*15)));
            yy = -9.61154 + (((tickAnim - 125) / 15) * (0-(-9.61154)));
            zz = -2.93503 + (((tickAnim - 125) / 15) * (0-(-2.93503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26.96267-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-5.35829-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.64233-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 26.96267 + (((tickAnim - 13) / 17) * (12.85351-(26.96267)));
            yy = -5.35829 + (((tickAnim - 13) / 17) * (-12.05616-(-5.35829)));
            zz = -4.64233 + (((tickAnim - 13) / 17) * (-10.44524-(-4.64233)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 12.85351 + (((tickAnim - 30) / 21) * (-8.0839-(12.85351)));
            yy = -12.05616 + (((tickAnim - 30) / 21) * (-18.098-(-12.05616)));
            zz = -10.44524 + (((tickAnim - 30) / 21) * (-13.5641-(-10.44524)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -8.0839 + (((tickAnim - 51) / 10) * (-13.83796-(-8.0839)));
            yy = -18.098 + (((tickAnim - 51) / 10) * (-10.65487-(-18.098)));
            zz = -13.5641 + (((tickAnim - 51) / 10) * (-10.53418-(-13.5641)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = -13.83796 + (((tickAnim - 61) / 7) * (-21.40749-(-13.83796)));
            yy = -10.65487 + (((tickAnim - 61) / 7) * (-6.44872-(-10.65487)));
            zz = -10.53418 + (((tickAnim - 61) / 7) * (0.67546-(-10.53418)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -21.40749 + (((tickAnim - 68) / 7) * (-8.0839-(-21.40749)));
            yy = -6.44872 + (((tickAnim - 68) / 7) * (-18.098-(-6.44872)));
            zz = 0.67546 + (((tickAnim - 68) / 7) * (-13.5641-(0.67546)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -8.0839 + (((tickAnim - 75) / 10) * (-13.83796-(-8.0839)));
            yy = -18.098 + (((tickAnim - 75) / 10) * (-10.65487-(-18.098)));
            zz = -13.5641 + (((tickAnim - 75) / 10) * (-10.53418-(-13.5641)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -13.83796 + (((tickAnim - 85) / 8) * (-21.40749-(-13.83796)));
            yy = -10.65487 + (((tickAnim - 85) / 8) * (-6.44872-(-10.65487)));
            zz = -10.53418 + (((tickAnim - 85) / 8) * (0.67546-(-10.53418)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = -21.40749 + (((tickAnim - 93) / 6) * (-8.0839-(-21.40749)));
            yy = -6.44872 + (((tickAnim - 93) / 6) * (-18.098-(-6.44872)));
            zz = 0.67546 + (((tickAnim - 93) / 6) * (-13.5641-(0.67546)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = -8.0839 + (((tickAnim - 99) / 10) * (-13.83796-(-8.0839)));
            yy = -18.098 + (((tickAnim - 99) / 10) * (-10.65487-(-18.098)));
            zz = -13.5641 + (((tickAnim - 99) / 10) * (-10.53418-(-13.5641)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = -13.83796 + (((tickAnim - 109) / 16) * (-12.982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-40-(-13.83796)));
            yy = -10.65487 + (((tickAnim - 109) / 16) * (-5.18345-(-10.65487)));
            zz = -10.53418 + (((tickAnim - 109) / 16) * (-5.12474-(-10.53418)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -12.982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-40 + (((tickAnim - 125) / 15) * (0-(-12.982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-40)));
            yy = -5.18345 + (((tickAnim - 125) / 15) * (0-(-5.18345)));
            zz = -5.12474 + (((tickAnim - 125) / 15) * (0-(-5.12474)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-27-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 13.25 + (((tickAnim - 30) / 13) * (2.82368-(13.25)));
            yy = -27 + (((tickAnim - 30) / 13) * (-27-(-27)));
            zz = 0 + (((tickAnim - 30) / 13) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 2.82368 + (((tickAnim - 43) / 4) * (-4.35-(2.82368)));
            yy = -27 + (((tickAnim - 43) / 4) * (-27-(-27)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -4.35 + (((tickAnim - 47) / 4) * (-6-(-4.35)));
            yy = -27 + (((tickAnim - 47) / 4) * (-27-(-27)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = -6 + (((tickAnim - 51) / 10) * (-24.5-(-6)));
            yy = -27 + (((tickAnim - 51) / 10) * (-27-(-27)));
            zz = 0 + (((tickAnim - 51) / 10) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = -24.5 + (((tickAnim - 61) / 7) * (9.20546-(-24.5)));
            yy = -27 + (((tickAnim - 61) / 7) * (-35.2655-(-27)));
            zz = 0 + (((tickAnim - 61) / 7) * (-4.16814-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 9.20546 + (((tickAnim - 68) / 7) * (-6-(9.20546)));
            yy = -35.2655 + (((tickAnim - 68) / 7) * (-27-(-35.2655)));
            zz = -4.16814 + (((tickAnim - 68) / 7) * (0-(-4.16814)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -6 + (((tickAnim - 75) / 10) * (-24.5-(-6)));
            yy = -27 + (((tickAnim - 75) / 10) * (-27-(-27)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = -24.5 + (((tickAnim - 85) / 8) * (9.20546-(-24.5)));
            yy = -27 + (((tickAnim - 85) / 8) * (-35.2655-(-27)));
            zz = 0 + (((tickAnim - 85) / 8) * (-4.16814-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 9.20546 + (((tickAnim - 93) / 6) * (-6-(9.20546)));
            yy = -35.2655 + (((tickAnim - 93) / 6) * (-27-(-35.2655)));
            zz = -4.16814 + (((tickAnim - 93) / 6) * (0-(-4.16814)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = -6 + (((tickAnim - 99) / 10) * (-29.75-(-6)));
            yy = -27 + (((tickAnim - 99) / 10) * (-27-(-27)));
            zz = 0 + (((tickAnim - 99) / 10) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = -29.75 + (((tickAnim - 109) / 31) * (0-(-29.75)));
            yy = -27 + (((tickAnim - 109) / 31) * (0-(-27)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (3-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 33) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (3-(0)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 38) / 3) * (0-(3)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (12-(0)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 12 + (((tickAnim - 47) / 4) * (0-(12)));
            yy = 0 + (((tickAnim - 47) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 51) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 10) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 61) / 7) * (5-(0)));
            yy = 0 + (((tickAnim - 61) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 7) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 5 + (((tickAnim - 68) / 4) * (8.75-(5)));
            yy = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 8.75 + (((tickAnim - 72) / 3) * (0-(8.75)));
            yy = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 85) / 8) * (5-(0)));
            yy = 0 + (((tickAnim - 85) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 8) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 96) {
            xx = 5 + (((tickAnim - 93) / 3) * (8.75-(5)));
            yy = 0 + (((tickAnim - 93) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 3) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 99) {
            xx = 8.75 + (((tickAnim - 96) / 3) * (0-(8.75)));
            yy = 0 + (((tickAnim - 96) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 3) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 10) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 109) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 109) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 19) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 128) / 6) * (4.25-(0)));
            yy = 0 + (((tickAnim - 128) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 6) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = 4.25 + (((tickAnim - 134) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-20.17806-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (16.35897-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (9.02519-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = -20.17806 + (((tickAnim - 30) / 21) * (15.72885-(-20.17806)));
            yy = 16.35897 + (((tickAnim - 30) / 21) * (3.06993-(16.35897)));
            zz = 9.02519 + (((tickAnim - 30) / 21) * (6.38668-(9.02519)));
        }
        else if (tickAnim >= 51 && tickAnim < 68) {
            xx = 15.72885 + (((tickAnim - 51) / 17) * (4.00775-(15.72885)));
            yy = 3.06993 + (((tickAnim - 51) / 17) * (16.54559-(3.06993)));
            zz = 6.38668 + (((tickAnim - 51) / 17) * (5.25841-(6.38668)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 4.00775 + (((tickAnim - 68) / 7) * (15.72885-(4.00775)));
            yy = 16.54559 + (((tickAnim - 68) / 7) * (3.06993-(16.54559)));
            zz = 5.25841 + (((tickAnim - 68) / 7) * (6.38668-(5.25841)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 15.72885 + (((tickAnim - 75) / 18) * (4.00775-(15.72885)));
            yy = 3.06993 + (((tickAnim - 75) / 18) * (16.54559-(3.06993)));
            zz = 6.38668 + (((tickAnim - 75) / 18) * (5.25841-(6.38668)));
        }
        else if (tickAnim >= 93 && tickAnim < 109) {
            xx = 4.00775 + (((tickAnim - 93) / 16) * (12.92122-(4.00775)));
            yy = 16.54559 + (((tickAnim - 93) / 16) * (8.38593-(16.54559)));
            zz = 5.25841 + (((tickAnim - 93) / 16) * (3.186-(5.25841)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 12.92122 + (((tickAnim - 109) / 31) * (0-(12.92122)));
            yy = 8.38593 + (((tickAnim - 109) / 31) * (0-(8.38593)));
            zz = 3.186 + (((tickAnim - 109) / 31) * (0-(3.186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.45-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 0.45 + (((tickAnim - 30) / 21) * (0.475-(0.45)));
            yy = 0 + (((tickAnim - 30) / 21) * (1.5-(0)));
            zz = 0 + (((tickAnim - 30) / 21) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 75) {
            xx = 0.475 + (((tickAnim - 51) / 24) * (0.475-(0.475)));
            yy = 1.5 + (((tickAnim - 51) / 24) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 51) / 24) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 109) {
            xx = 0.475 + (((tickAnim - 75) / 34) * (0.475-(0.475)));
            yy = 1.5 + (((tickAnim - 75) / 34) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 75) / 34) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 0.475 + (((tickAnim - 109) / 31) * (0-(0.475)));
            yy = 1.5 + (((tickAnim - 109) / 31) * (0-(1.5)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 20) / 1) * (1-(1)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 20) / 1) * (1-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 21) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 21) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 21) / 4) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 128) {
            xx = 1 + (((tickAnim - 25) / 103) * (1-(1)));
            yy = 1 + (((tickAnim - 25) / 103) * (1-(1)));
            zz = 1 + (((tickAnim - 25) / 103) * (1-(1)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = 1 + (((tickAnim - 128) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 128) / 6) * (0.0175-(1)));
            zz = 1 + (((tickAnim - 128) / 6) * (1-(1)));
        }
        else if (tickAnim >= 134 && tickAnim < 135) {
            xx = 1 + (((tickAnim - 134) / 1) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 134) / 1) * (0.0175-(0.0175)));
            zz = 1 + (((tickAnim - 134) / 1) * (1-(1)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 1 + (((tickAnim - 135) / 5) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 135) / 5) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 135) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+150))*-3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+40))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354-20))*1.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+150))*-4), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505))*1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+40))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+190))*7), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505-80))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+40))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+290))*-7), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505-130))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+40))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+320))*-6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505-170))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+40))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+95))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+180))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+250))*7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+180))*3));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(6.80246), leftArm1.rotateAngleY + (float) Math.toRadians(6.9361), leftArm1.rotateAngleZ + (float) Math.toRadians(-9.99802));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-21.17321), leftArm2.rotateAngleY + (float) Math.toRadians(-0.10731), leftArm2.rotateAngleZ + (float) Math.toRadians(7.76207));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(24.5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(6.80246), rightArm1.rotateAngleY + (float) Math.toRadians(-6.9361), rightArm1.rotateAngleZ + (float) Math.toRadians(9.998));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-21.17321), rightArm2.rotateAngleY + (float) Math.toRadians(0.1073), rightArm2.rotateAngleZ + (float) Math.toRadians(-7.7621));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(24.5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(21.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+300))*-1.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+220))*5));
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(-0.975);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+320))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+300))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+390))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+300))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.354+390))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+300))*3));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(9.75), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0.525);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25.24897 + (((tickAnim - 0) / 3) * (-3.79169-(-25.24897)));
            yy = 0.28857 + (((tickAnim - 0) / 3) * (1.19362-(0.28857)));
            zz = 0.40832 + (((tickAnim - 0) / 3) * (2.34512-(0.40832)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -3.79169 + (((tickAnim - 3) / 4) * (22.04528-(-3.79169)));
            yy = 1.19362 + (((tickAnim - 3) / 4) * (-4.5406-(1.19362)));
            zz = 2.34512 + (((tickAnim - 3) / 4) * (-3.8665-(2.34512)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 22.04528 + (((tickAnim - 7) / 4) * (-7.11131-(22.04528)));
            yy = -4.5406 + (((tickAnim - 7) / 4) * (-6.99126-(-4.5406)));
            zz = -3.8665 + (((tickAnim - 7) / 4) * (-2.93094-(-3.8665)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -7.11131 + (((tickAnim - 11) / 3) * (-25.24897-(-7.11131)));
            yy = -6.99126 + (((tickAnim - 11) / 3) * (0.28857-(-6.99126)));
            zz = -2.93094 + (((tickAnim - 11) / 3) * (0.40832-(-2.93094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -25.15118 + (((tickAnim - 0) / 7) * (29.75-(-25.15118)));
            yy = -2.82056 + (((tickAnim - 0) / 7) * (0-(-2.82056)));
            zz = 6.13493 + (((tickAnim - 0) / 7) * (0-(6.13493)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 29.75 + (((tickAnim - 7) / 2) * (24.76998-(29.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (-2.38849-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (3.51423-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 24.76998 + (((tickAnim - 9) / 2) * (-4.88336-(24.76998)));
            yy = -2.38849 + (((tickAnim - 9) / 2) * (-3.98082-(-2.38849)));
            zz = 3.51423 + (((tickAnim - 9) / 2) * (5.85705-(3.51423)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -4.88336 + (((tickAnim - 11) / 3) * (-25.15118-(-4.88336)));
            yy = -3.98082 + (((tickAnim - 11) / 3) * (-2.82056-(-3.98082)));
            zz = 5.85705 + (((tickAnim - 11) / 3) * (6.13493-(5.85705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 39.0051 + (((tickAnim - 0) / 7) * (40.5-(39.0051)));
            yy = 0.29556 + (((tickAnim - 0) / 7) * (0-(0.29556)));
            zz = 1.97805 + (((tickAnim - 0) / 7) * (0-(1.97805)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 40.5 + (((tickAnim - 7) / 2) * (-37-(40.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -37 + (((tickAnim - 9) / 3) * (-46.5-(-37)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -46.5 + (((tickAnim - 12) / 2) * (39.0051-(-46.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0.29556-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (1.97805-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.05 + (((tickAnim - 0) / 3) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.45-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 9) / 3) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 2) * (-1.05-(0.45)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
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
            xx = 13.3795 + (((tickAnim - 0) / 2) * (-17.59038-(13.3795)));
            yy = 0.46997 + (((tickAnim - 0) / 2) * (0.35247-(0.46997)));
            zz = -9.28422 + (((tickAnim - 0) / 2) * (-6.96316-(-9.28422)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -17.59038 + (((tickAnim - 2) / 1) * (-27.32531-(-17.59038)));
            yy = 0.35247 + (((tickAnim - 2) / 1) * (0.29373-(0.35247)));
            zz = -6.96316 + (((tickAnim - 2) / 1) * (-5.80264-(-6.96316)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.32531 + (((tickAnim - 3) / 1) * (20.35481-(-27.32531)));
            yy = 0.29373 + (((tickAnim - 3) / 1) * (0.17624-(0.29373)));
            zz = -5.80264 + (((tickAnim - 3) / 1) * (-3.48158-(-5.80264)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 20.35481 + (((tickAnim - 4) / 3) * (55.5-(20.35481)));
            yy = 0.17624 + (((tickAnim - 4) / 3) * (0-(0.17624)));
            zz = -3.48158 + (((tickAnim - 4) / 3) * (0-(-3.48158)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 55.5 + (((tickAnim - 7) / 2) * (71.25-(55.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 71.25 + (((tickAnim - 9) / 3) * (88.25-(71.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 88.25 + (((tickAnim - 12) / 2) * (13.3795-(88.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0.46997-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-9.28422-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (2.145-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 2.145 + (((tickAnim - 1) / 1) * (2.65-(2.145)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.65 + (((tickAnim - 2) / 1) * (1.825-(2.65)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.825 + (((tickAnim - 3) / 1) * (1.05-(1.825)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 4) / 3) * (0-(1.05)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (1.9-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.9 + (((tickAnim - 9) / 3) * (0-(1.9)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (56-(0)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 56 + (((tickAnim - 7) / 2) * (71.75-(56)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 71.75 + (((tickAnim - 9) / 3) * (41.95-(71.75)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 41.95 + (((tickAnim - 12) / 1) * (0-(41.95)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-72.45-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -72.45 + (((tickAnim - 4) / 3) * (34.5-(-72.45)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 34.5 + (((tickAnim - 7) / 6) * (0-(34.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.135-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0.39-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.135 + (((tickAnim - 3) / 1) * (-0.525-(-0.135)));
            zz = 0.39 + (((tickAnim - 3) / 1) * (-0.125-(0.39)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.525 + (((tickAnim - 4) / 3) * (0.05-(-0.525)));
            zz = -0.125 + (((tickAnim - 4) / 3) * (0.275-(-0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 6) * (0-(0.05)));
            zz = 0.275 + (((tickAnim - 7) / 6) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.54528 + (((tickAnim - 0) / 4) * (-7.11131-(22.54528)));
            yy = 4.54059 + (((tickAnim - 0) / 4) * (6.9913-(4.54059)));
            zz = 3.86653 + (((tickAnim - 0) / 4) * (2.9309-(3.86653)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -7.11131 + (((tickAnim - 4) / 4) * (-25.24897-(-7.11131)));
            yy = 6.9913 + (((tickAnim - 4) / 4) * (-0.2886-(6.9913)));
            zz = 2.9309 + (((tickAnim - 4) / 4) * (-0.4083-(2.9309)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -25.24897 + (((tickAnim - 8) / 3) * (-3.79169-(-25.24897)));
            yy = -0.2886 + (((tickAnim - 8) / 3) * (-1.1936-(-0.2886)));
            zz = -0.4083 + (((tickAnim - 8) / 3) * (-2.3451-(-0.4083)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -3.79169 + (((tickAnim - 11) / 3) * (22.54528-(-3.79169)));
            yy = -1.1936 + (((tickAnim - 11) / 3) * (4.54059-(-1.1936)));
            zz = -2.3451 + (((tickAnim - 11) / 3) * (3.86653-(-2.3451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.75 + (((tickAnim - 0) / 3) * (20.8217-(27.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.2536-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.72662-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.8217 + (((tickAnim - 3) / 5) * (-26.15118-(20.8217)));
            yy = 1.2536 + (((tickAnim - 3) / 5) * (2.8206-(1.2536)));
            zz = -2.72662 + (((tickAnim - 3) / 5) * (-6.1349-(-2.72662)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -26.15118 + (((tickAnim - 8) / 6) * (27.75-(-26.15118)));
            yy = 2.8206 + (((tickAnim - 8) / 6) * (0-(2.8206)));
            zz = -6.1349 + (((tickAnim - 8) / 6) * (0-(-6.1349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.25 + (((tickAnim - 0) / 3) * (-51.04932-(23.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.60884-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.40316-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -51.04932 + (((tickAnim - 3) / 3) * (-32.11508-(-51.04932)));
            yy = -0.60884 + (((tickAnim - 3) / 3) * (-1.42062-(-0.60884)));
            zz = 0.40316 + (((tickAnim - 3) / 3) * (0.94071-(0.40316)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -32.11508 + (((tickAnim - 6) / 2) * (37.5051-(-32.11508)));
            yy = -1.42062 + (((tickAnim - 6) / 2) * (-0.2956-(-1.42062)));
            zz = 0.94071 + (((tickAnim - 6) / 2) * (-1.978-(0.94071)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 37.5051 + (((tickAnim - 8) / 6) * (23.25-(37.5051)));
            yy = -0.2956 + (((tickAnim - 8) / 6) * (0-(-0.2956)));
            zz = -1.978 + (((tickAnim - 8) / 6) * (0-(-1.978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 3) / 3) * (0.35-(0.525)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 2) * (-1.05-(0.35)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.05 + (((tickAnim - 8) / 2) * (0.2-(-1.05)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 10) / 4) * (0-(0.2)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
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
            xx = 55.5 + (((tickAnim - 0) / 3) * (82.89-(55.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 82.89 + (((tickAnim - 3) / 3) * (85-(82.89)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 85 + (((tickAnim - 6) / 2) * (13.3795-(85)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.46997-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (9.2842-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.3795 + (((tickAnim - 8) / 2) * (-18.32531-(13.3795)));
            yy = 0.46997 + (((tickAnim - 8) / 2) * (0.29373-(0.46997)));
            zz = 9.2842 + (((tickAnim - 8) / 2) * (5.80263-(9.2842)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -18.32531 + (((tickAnim - 10) / 4) * (55.5-(-18.32531)));
            yy = 0.29373 + (((tickAnim - 10) / 4) * (0-(0.29373)));
            zz = 5.80263 + (((tickAnim - 10) / 4) * (0-(5.80263)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 0) * (2.38-(0.425)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.38 + (((tickAnim - 8) / 1) * (2.395-(2.38)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 2.395 + (((tickAnim - 9) / 1) * (1.375-(2.395)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 10) / 2) * (-0.3-(1.375)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 12) / 2) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 56 + (((tickAnim - 0) / 8) * (0-(56)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (56-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 34.5 + (((tickAnim - 0) / 6) * (0-(34.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-53.45-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -53.45 + (((tickAnim - 12) / 2) * (34.5-(-53.45)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 6) * (0.02-(0.05)));
            zz = 0.275 + (((tickAnim - 0) / 6) * (0.51-(0.275)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.02 + (((tickAnim - 6) / 4) * (0-(0.02)));
            zz = 0.51 + (((tickAnim - 6) / 4) * (0-(0.51)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.26-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 2) * (0.05-(-0.28)));
            zz = 0.26 + (((tickAnim - 12) / 2) * (0.275-(0.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.3545+250))*-10), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505-220))*7), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*505+70))*1));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDeinonychus entity = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.24795 + (((tickAnim - 0) / 5) * (-0.77684-(-18.24795)));
            yy = 0.35498 + (((tickAnim - 0) / 5) * (-0.85569-(0.35498)));
            zz = 0.66068 + (((tickAnim - 0) / 5) * (2.6491-(0.66068)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.77684 + (((tickAnim - 5) / 6) * (19.63422-(-0.77684)));
            yy = -0.85569 + (((tickAnim - 5) / 6) * (-3.08706-(-0.85569)));
            zz = 2.6491 + (((tickAnim - 5) / 6) * (2.06927-(2.6491)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 19.63422 + (((tickAnim - 11) / 2) * (13.58663-(19.63422)));
            yy = -3.08706 + (((tickAnim - 11) / 2) * (-3.44348-(-3.08706)));
            zz = 2.06927 + (((tickAnim - 11) / 2) * (0.74437-(2.06927)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 13.58663 + (((tickAnim - 13) / 5) * (-6.55614-(13.58663)));
            yy = -3.44348 + (((tickAnim - 13) / 5) * (-4.51272-(-3.44348)));
            zz = 0.74437 + (((tickAnim - 13) / 5) * (-3.23033-(0.74437)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.55614 + (((tickAnim - 18) / 4) * (-18.24795-(-6.55614)));
            yy = -4.51272 + (((tickAnim - 18) / 4) * (0.35498-(-4.51272)));
            zz = -3.23033 + (((tickAnim - 18) / 4) * (0.66068-(-3.23033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -27.89413 + (((tickAnim - 0) / 11) * (23.24362-(-27.89413)));
            yy = -3.13578 + (((tickAnim - 0) / 11) * (-1.69614-(-3.13578)));
            zz = 4.78887 + (((tickAnim - 0) / 11) * (0.43089-(4.78887)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 23.24362 + (((tickAnim - 11) / 5) * (21.88812-(23.24362)));
            yy = -1.69614 + (((tickAnim - 11) / 5) * (-1.80535-(-1.69614)));
            zz = 0.43089 + (((tickAnim - 11) / 5) * (0.85636-(0.43089)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 21.88812 + (((tickAnim - 16) / 6) * (-27.89413-(21.88812)));
            yy = -1.80535 + (((tickAnim - 16) / 6) * (-3.13578-(-1.80535)));
            zz = 0.85636 + (((tickAnim - 16) / 6) * (4.78887-(0.85636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 30.53188 + (((tickAnim - 0) / 11) * (34.5-(30.53188)));
            yy = 1.67369 + (((tickAnim - 0) / 11) * (0-(1.67369)));
            zz = 2.18234 + (((tickAnim - 0) / 11) * (0-(2.18234)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 34.5 + (((tickAnim - 11) / 6) * (-44.69-(34.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -44.69 + (((tickAnim - 17) / 2) * (-45.85639-(-44.69)));
            yy = 0 + (((tickAnim - 17) / 2) * (-0.37239-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0.30904-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -45.85639 + (((tickAnim - 19) / 3) * (30.53188-(-45.85639)));
            yy = -0.37239 + (((tickAnim - 19) / 3) * (1.67369-(-0.37239)));
            zz = 0.30904 + (((tickAnim - 19) / 3) * (2.18234-(0.30904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.075 + (((tickAnim - 0) / 11) * (0-(-0.075)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.74-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.74 + (((tickAnim - 15) / 4) * (0.575-(0.74)));
            zz = 0.125 + (((tickAnim - 15) / 4) * (0-(0.125)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (-0.075-(0)));
            yy = 0.575 + (((tickAnim - 19) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
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
            xx = 16.74584 + (((tickAnim - 0) / 3) * (-8.47333-(16.74584)));
            yy = 2.06526 + (((tickAnim - 0) / 3) * (0.78708-(2.06526)));
            zz = -9.38744 + (((tickAnim - 0) / 3) * (-9.06188-(-9.38744)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.47333 + (((tickAnim - 3) / 2) * (-23.19249-(-8.47333)));
            yy = 0.78708 + (((tickAnim - 3) / 2) * (-0.4911-(0.78708)));
            zz = -9.06188 + (((tickAnim - 3) / 2) * (-8.73631-(-9.06188)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -23.19249 + (((tickAnim - 5) / 6) * (49.25-(-23.19249)));
            yy = -0.4911 + (((tickAnim - 5) / 6) * (0-(-0.4911)));
            zz = -8.73631 + (((tickAnim - 5) / 6) * (0-(-8.73631)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 49.25 + (((tickAnim - 11) / 4) * (74.19-(49.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 74.19 + (((tickAnim - 15) / 4) * (81.09887-(74.19)));
            yy = 0 + (((tickAnim - 15) / 4) * (-0.53702-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (3.45595-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 81.09887 + (((tickAnim - 19) / 3) * (16.74584-(81.09887)));
            yy = -0.53702 + (((tickAnim - 19) / 3) * (2.06526-(-0.53702)));
            zz = 3.45595 + (((tickAnim - 19) / 3) * (-9.38744-(3.45595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.925-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.925 + (((tickAnim - 3) / 2) * (0.7-(1.925)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 5) / 6) * (0-(0.7)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (1.875-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 1.875 + (((tickAnim - 15) / 7) * (0-(1.875)));
            zz = -0.325 + (((tickAnim - 15) / 7) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 7) / 4) * (65.75-(27.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 65.75 + (((tickAnim - 11) / 7) * (47-(65.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 47 + (((tickAnim - 18) / 4) * (0-(47)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-33.61-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -33.61 + (((tickAnim - 7) / 4) * (42.5-(-33.61)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 42.5 + (((tickAnim - 11) / 2) * (25.5-(42.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25.5 + (((tickAnim - 13) / 2) * (0-(25.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.3-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0.3 + (((tickAnim - 11) / 4) * (0.4-(0.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0.4 + (((tickAnim - 15) / 7) * (0-(0.4)));
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
            xx = 13.58663 + (((tickAnim - 0) / 7) * (-13.13114-(13.58663)));
            yy = 3.4435 + (((tickAnim - 0) / 7) * (4.5127-(3.4435)));
            zz = -0.7444 + (((tickAnim - 0) / 7) * (3.2303-(-0.7444)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -13.13114 + (((tickAnim - 7) / 4) * (-18.24636-(-13.13114)));
            yy = 4.5127 + (((tickAnim - 7) / 4) * (0.4733-(4.5127)));
            zz = 3.2303 + (((tickAnim - 7) / 4) * (-1.76189-(3.2303)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -18.24636 + (((tickAnim - 11) / 5) * (-3.85914-(-18.24636)));
            yy = 0.4733 + (((tickAnim - 11) / 5) * (1.31451-(0.4733)));
            zz = -1.76189 + (((tickAnim - 11) / 5) * (-3.03943-(-1.76189)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -3.85914 + (((tickAnim - 16) / 6) * (13.58663-(-3.85914)));
            yy = 1.31451 + (((tickAnim - 16) / 6) * (3.4435-(1.31451)));
            zz = -3.03943 + (((tickAnim - 16) / 6) * (-0.7444-(-3.03943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 34.38812 + (((tickAnim - 0) / 4) * (26.3689-(34.38812)));
            yy = -1.80535 + (((tickAnim - 0) / 4) * (-1.718-(-1.80535)));
            zz = 0.85636 + (((tickAnim - 0) / 4) * (-0.38532-(0.85636)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 26.3689 + (((tickAnim - 4) / 7) * (-27.74246-(26.3689)));
            yy = -1.718 + (((tickAnim - 4) / 7) * (-1.36041-(-1.718)));
            zz = -0.38532 + (((tickAnim - 4) / 7) * (-5.4685-(-0.38532)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -27.74246 + (((tickAnim - 11) / 5) * (5.26198-(-27.74246)));
            yy = -1.36041 + (((tickAnim - 11) / 5) * (0.34123-(-1.36041)));
            zz = -5.4685 + (((tickAnim - 11) / 5) * (-3.12932-(-5.4685)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 5.26198 + (((tickAnim - 16) / 3) * (27.24362-(5.26198)));
            yy = 0.34123 + (((tickAnim - 16) / 3) * (-1.69614-(0.34123)));
            zz = -3.12932 + (((tickAnim - 16) / 3) * (0.43089-(-3.12932)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 27.24362 + (((tickAnim - 19) / 3) * (34.38812-(27.24362)));
            yy = -1.69614 + (((tickAnim - 19) / 3) * (-1.80535-(-1.69614)));
            zz = 0.43089 + (((tickAnim - 19) / 3) * (0.85636-(0.43089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.87 + (((tickAnim - 0) / 3) * (-32.15584-(19.87)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.81659-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.60613-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -32.15584 + (((tickAnim - 3) / 5) * (-48.93815-(-32.15584)));
            yy = -0.81659 + (((tickAnim - 3) / 5) * (-1.83733-(-0.81659)));
            zz = 0.60613 + (((tickAnim - 3) / 5) * (1.36379-(0.60613)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -48.93815 + (((tickAnim - 8) / 3) * (30.53188-(-48.93815)));
            yy = -1.83733 + (((tickAnim - 8) / 3) * (1.67369-(-1.83733)));
            zz = 1.36379 + (((tickAnim - 8) / 3) * (-2.1823-(1.36379)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 30.53188 + (((tickAnim - 11) / 11) * (19.87-(30.53188)));
            yy = 1.67369 + (((tickAnim - 11) / 11) * (0-(1.67369)));
            zz = -2.1823 + (((tickAnim - 11) / 11) * (0-(-2.1823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.005-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.005 + (((tickAnim - 3) / 5) * (0.025-(0.005)));
            yy = 0.475 + (((tickAnim - 3) / 5) * (0.16-(0.475)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.025 + (((tickAnim - 8) / 3) * (0.075-(0.025)));
            yy = 0.16 + (((tickAnim - 8) / 3) * (0-(0.16)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0.075 + (((tickAnim - 11) / 11) * (0-(0.075)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
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
            xx = 60.48 + (((tickAnim - 0) / 3) * (72.27333-(60.48)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.63547-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.88844-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 72.27333 + (((tickAnim - 3) / 5) * (84.17472-(72.27333)));
            yy = 0.63547 + (((tickAnim - 3) / 5) * (1.4298-(0.63547)));
            zz = -2.88844 + (((tickAnim - 3) / 5) * (-6.499-(-2.88844)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 84.17472 + (((tickAnim - 8) / 3) * (16.71369-(84.17472)));
            yy = 1.4298 + (((tickAnim - 8) / 3) * (-2.54998-(1.4298)));
            zz = -6.499 + (((tickAnim - 8) / 3) * (3.35871-(-6.499)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 16.71369 + (((tickAnim - 11) / 2) * (-6.67774-(16.71369)));
            yy = -2.54998 + (((tickAnim - 11) / 2) * (-1.83104-(-2.54998)));
            zz = 3.35871 + (((tickAnim - 11) / 2) * (4.20675-(3.35871)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.67774 + (((tickAnim - 13) / 3) * (-16.06917-(-6.67774)));
            yy = -1.83104 + (((tickAnim - 13) / 3) * (-1.1121-(-1.83104)));
            zz = 4.20675 + (((tickAnim - 13) / 3) * (5.0548-(4.20675)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -16.06917 + (((tickAnim - 16) / 6) * (60.48-(-16.06917)));
            yy = -1.1121 + (((tickAnim - 16) / 6) * (0-(-1.1121)));
            zz = 5.0548 + (((tickAnim - 16) / 6) * (0-(5.0548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (-0.15-(0)));
            yy = 1.45 + (((tickAnim - 3) / 8) * (0-(1.45)));
            zz = -0.25 + (((tickAnim - 3) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -0.15 + (((tickAnim - 11) / 1) * (-0.1-(-0.15)));
            yy = 0 + (((tickAnim - 11) / 1) * (1.195-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.1 + (((tickAnim - 12) / 1) * (0-(-0.1)));
            yy = 1.195 + (((tickAnim - 12) / 1) * (1.865-(1.195)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.865 + (((tickAnim - 13) / 1) * (1.595-(1.865)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 1.595 + (((tickAnim - 14) / 2) * (0-(1.595)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 25.5 + (((tickAnim - 0) / 11) * (0-(25.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -14.5 + (((tickAnim - 16) / 1) * (-29.79-(-14.5)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -29.79 + (((tickAnim - 17) / 2) * (22.36-(-29.79)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 22.36 + (((tickAnim - 19) / 3) * (25.5-(22.36)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0.3 + (((tickAnim - 0) / 11) * (0-(0.3)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542+150))*-1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+30))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.075+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*-0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*1);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-120))*2.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-20))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-150))*-0.3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-120))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-190))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+40))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-280))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542+59))*-3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+80))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542+75))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+150))*1));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-12.037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542+30))*2), leftArm1.rotateAngleY + (float) Math.toRadians(-0.33917), leftArm1.rotateAngleZ + (float) Math.toRadians(-4.84553));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-10.9981+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542-80))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-12.037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542+30))*2), rightArm1.rotateAngleY + (float) Math.toRadians(0.3392), rightArm1.rotateAngleZ + (float) Math.toRadians(4.8455));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-10.9981+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542-80))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+120))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+130))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+190))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+220))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+320))*7), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+240))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+240))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 6) * (0.445-(-0.275)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.445 + (((tickAnim - 9) / 6) * (0-(0.445)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0.445-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.445 + (((tickAnim - 19) / 3) * (0-(0.445)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

        this.throat.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.542))*-0.2),(float)1);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 61.58 + (((tickAnim - 0) / 11) * (0-(61.58)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (61.58-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDeinonychus ee = (EntityPrehistoricFloraDeinonychus) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) { //
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) { //
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim (bellow)
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) {
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDeinonychus e = (EntityPrehistoricFloraDeinonychus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Neck4, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
