package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIrritator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIrritator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
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
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftFingers;
    private final AdvancedModelRenderer leftThumb;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightFingers;
    private final AdvancedModelRenderer rightThumb;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftJaw1;
    private final AdvancedModelRenderer leftJaw2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer rightJaw1;
    private final AdvancedModelRenderer rightJaw2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;

    private ModelAnimator animator;

    public ModelIrritator() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 27, -4.0F, -4.25F, -6.0F, 8, 11, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.2292F, 3.6487F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 107, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.5956F, -3.3418F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4712F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 121, -1.5F, 0.0F, -3.0F, 3, 4, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.2293F, 3.6487F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 106, 36, -1.5F, 0.0F, -7.0F, 3, 5, 7, 0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.25F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0436F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 76, 49, -3.0F, -3.0F, -4.0F, 5, 12, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.5F, -2.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.48F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 96, 102, -1.5F, -0.5F, -1.5F, 3, 12, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 36, 121, -1.0F, -1.5F, -1.0F, 2, 6, 3, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.25F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4363F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 114, 7, -1.5F, -0.5F, -3.0F, 3, 2, 5, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 48, 21, -2.5F, -1.0F, -3.75F, 5, 2, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.25F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0436F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 76, 49, -2.0F, -3.0F, -4.0F, 5, 12, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.5F, -2.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.48F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 96, 102, -1.5F, -0.5F, -1.5F, 3, 12, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 36, 121, -1.0F, -1.5F, -1.0F, 2, 6, 3, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.25F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 114, 7, -1.5F, -0.5F, -3.0F, 3, 2, 5, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 48, 21, -2.5F, -1.0F, -3.75F, 5, 2, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 27, -3.0F, -3.75F, -1.0F, 6, 9, 13, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.25F, 0.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0262F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 21, -1.0F, 0.0F, -1.0F, 2, 2, 13, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 49, -2.0F, -3.5F, -1.0F, 4, 7, 13, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.75F, 1.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 85, -1.0F, -0.2F, -1.0F, 2, 3, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 51, -1.5F, -2.5F, -1.0F, 3, 4, 13, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -5.25F, 1.0F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 84, 85, 0.0F, 0.0F, -1.0F, 1, 5, 12, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 3.5F, 0.0F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 0, 0.0F, -2.0F, -1.0F, 1, 2, 13, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 69, -1.0F, -1.5F, -1.0F, 2, 3, 13, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -6.3476F, 7.962F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 115, -0.5F, 0.0F, 0.0F, 1, 6, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.5221F, 3.9658F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 115, -0.5F, 0.0F, 0.0F, 1, 6, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 51, -0.5F, 0.0F, 0.0F, 1, 6, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.25F, 1.0F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 86, 69, -0.5F, -3.0F, -1.0F, 1, 3, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 11.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 85, -0.5F, -1.0F, -0.5F, 1, 2, 13, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -5.0F, -0.5F);
        this.tail5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 69, 0.0F, -0.25F, -0.5F, 0, 8, 13, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.25F, 12.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3054F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 80, 36, -0.5F, -0.5F, -0.5F, 1, 1, 12, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5F, 5.5F);
        this.tail6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 90, -0.01F, -3.25F, -6.0F, 0, 5, 12, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -2.5F, -13.0F, 10, 13, 14, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -6.8783F, -1.2555F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.9076F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 110, 24, -2.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -6.2502F, -13.2391F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 68, -2.0F, 0.0F, 0.0F, 3, 5, 12, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 48, 0, -4.5F, -2.25F, -9.0F, 9, 11, 10, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.25F, -9.0F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4276F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 100, -1.0F, 0.0F, 0.0F, 2, 5, 10, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.5F, 6.25F, -5.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.5236F, 0.2618F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 110, 15, -1.5F, -1.5F, -1.0F, 3, 3, 6, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0908F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 112, 117, -1.0F, -1.0F, -0.5F, 2, 3, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.leftArm2.addChild(leftHand);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 32, 61, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.01F, false));

        this.leftFingers = new AdvancedModelRenderer(this);
        this.leftFingers.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.leftHand.addChild(leftFingers);
        this.setRotateAngle(leftFingers, 0.0F, -0.3054F, 0.0F);
        this.leftFingers.cubeList.add(new ModelBox(leftFingers, 94, 119, -2.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F, false));

        this.leftThumb = new AdvancedModelRenderer(this);
        this.leftThumb.setRotationPoint(0.0F, 1.5F, 1.5F);
        this.leftHand.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.48F, -0.2182F, 0.0F);
        this.leftThumb.cubeList.add(new ModelBox(leftThumb, 124, 85, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.leftThumb.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 70, 122, -2.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.5F, 6.25F, -5.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.5236F, -0.2618F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 110, 15, -1.5F, -1.5F, -1.0F, 3, 3, 6, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0908F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 112, 117, -1.0F, -1.0F, -0.5F, 2, 3, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.rightArm2.addChild(rightHand);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 32, 61, -0.5F, -1.5F, 0.0F, 1, 3, 4, 0.01F, true));

        this.rightFingers = new AdvancedModelRenderer(this);
        this.rightFingers.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.rightHand.addChild(rightFingers);
        this.setRotateAngle(rightFingers, 0.0F, 0.3054F, 0.0F);
        this.rightFingers.cubeList.add(new ModelBox(rightFingers, 94, 119, 0.0F, -1.5F, 0.0F, 2, 3, 4, 0.0F, true));

        this.rightThumb = new AdvancedModelRenderer(this);
        this.rightThumb.setRotationPoint(0.0F, 1.5F, 1.5F);
        this.rightHand.addChild(rightThumb);
        this.setRotateAngle(rightThumb, -0.48F, 0.2182F, 0.0F);
        this.rightThumb.cubeList.add(new ModelBox(rightThumb, 124, 85, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.rightThumb.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 70, 122, 0.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3054F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 52, 100, -3.0F, -3.25F, -4.0F, 6, 8, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 102, 49, -2.5F, -2.25F, -5.5F, 5, 7, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3927F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 76, 102, -2.0F, -2.25F, -5.0F, 4, 7, 6, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.48F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 110, 84, -1.5F, -2.25F, -3.5F, 3, 7, 4, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.5672F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 112, 63, -1.0F, -2.25F, -4.5F, 2, 6, 5, 0.0F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 3.5F, -6.5F);
        this.neck5.addChild(throat1);
        this.setRotateAngle(throat1, -0.3054F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 70, 115, -1.0F, -1.75F, -1.25F, 2, 2, 5, -0.02F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -2.0F, 3.25F);
        this.throat1.addChild(throat2);
        this.throat2.cubeList.add(new ModelBox(throat2, 98, 15, -1.0F, 0.25F, -0.5F, 2, 2, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.neck5.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 112, 74, -1.5F, -0.95F, -5.0F, 3, 3, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -1.8906F, -2.4158F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 124, 82, -1.5F, 0.0F, -0.25F, 2, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.95F, -5.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 112, 103, -2.0F, 0.0F, -0.25F, 3, 2, 5, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 3.6508F, -11.7776F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6021F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 120, 33, -2.0F, 0.0F, -0.05F, 2, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 112, 95, -2.0F, 0.0F, 1.95F, 2, 2, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 4.4942F, -12.3149F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6109F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 122, -2.0F, 0.15F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 3.6508F, -11.7776F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.1956F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 76, 100, -2.0F, -0.05F, -1.05F, 2, 1, 1, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 4.0933F, -7.8465F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4276F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 121, -2.0F, -1.0F, -4.05F, 2, 1, 4, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 1.05F, -5.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4625F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 96, 0.25F, 0.5F, -2.0F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 85, 0.25F, 0.5F, -4.0F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 54, 96, 1.75F, 0.5F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 85, 1.75F, 0.5F, -4.0F, 0, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 66, 21, 0.0F, 0.0F, -5.0F, 2, 1, 5, 0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0F, 1.05F, -4.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4538F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 102, 63, 0.0F, 0.0F, -4.9F, 0, 1, 5, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 102, 63, 2.0F, 0.0F, -4.9F, 0, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 4.1759F, -9.0285F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1571F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 87, 0.25F, -0.65F, -0.75F, 0, 1, 1, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 87, 1.75F, -0.65F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.75F, 5.0682F, -10.2343F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6847F, -0.3466F, -0.2706F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 96, 0.0F, -1.15F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.0F, 4.1759F, -9.0285F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 112, 82, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.75F, 5.0682F, -10.2343F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6847F, 0.3466F, 0.2706F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 52, 96, 0.0F, -1.15F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 2.2219F, -8.8864F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4625F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 116, -0.5F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.646F, -4.7906F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.7767F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 106, 119, -0.5F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, -2.7763F, -2.6199F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 42, 107, -0.51F, -0.5F, -8.0F, 0, 1, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -0.95F, -5.0F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6545F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 123, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.5F, -0.95F, -5.0F);
        this.head.addChild(eyes);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3491F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 110, 33, -2.0F, 0.35F, 1.4F, 3, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.55F, -0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 112, 110, -1.5F, -0.25F, -4.25F, 3, 2, 5, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.75F, -4.25F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1309F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 114, 0, -1.0F, 0.0F, -5.9F, 2, 1, 6, -0.04F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -0.25F, -4.25F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4363F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 115, -2.0F, -3.0F, 0.0F, 3, 3, 4, -0.02F, false));

        this.leftJaw1 = new AdvancedModelRenderer(this);
        this.leftJaw1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.jaw.addChild(leftJaw1);
        this.setRotateAngle(leftJaw1, 0.0F, 0.0F, -0.0175F);
        this.leftJaw1.cubeList.add(new ModelBox(leftJaw1, 42, 114, -1.5F, 0.0F, -4.25F, 2, 2, 5, -0.02F, false));

        this.leftJaw2 = new AdvancedModelRenderer(this);
        this.leftJaw2.setRotationPoint(-0.05F, 0.7418F, -4.2288F);
        this.leftJaw1.addChild(leftJaw2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.6239F, -5.3769F);
        this.leftJaw2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 94, -1.0F, 0.0F, -1.9F, 1, 1, 1, 0.0F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 92, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, 1.7073F, -4.4679F);
        this.leftJaw2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0873F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 52, 90, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.leftJaw2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1047F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 56, 114, -1.0F, 0.0F, -6.0F, 1, 1, 6, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.3471F, -5.3691F);
        this.leftJaw2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4014F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 106, 123, -1.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.9407F, 0.4398F);
        this.leftJaw2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.2182F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 24, 116, -0.01F, 0.0F, -6.0F, 0, 1, 6, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.leftJaw2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3054F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 54, 98, -0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 52, 98, -0.25F, -0.4F, -3.75F, 0, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 86, 15, -1.0F, 0.0F, -5.0F, 1, 1, 5, 0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.2877F, 0.6534F, -5.9222F);
        this.leftJaw2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6053F, 0.3351F, 0.2182F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 26, 100, 0.0F, -0.45F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.leftJaw2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0872F, 0.0067F, -0.0013F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 24, 100, -0.25F, 1.4F, -5.25F, 0, 1, 1, 0.0F, false));

        this.rightJaw1 = new AdvancedModelRenderer(this);
        this.rightJaw1.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.jaw.addChild(rightJaw1);
        this.setRotateAngle(rightJaw1, 0.0F, 0.0F, 0.0175F);
        this.rightJaw1.cubeList.add(new ModelBox(rightJaw1, 42, 114, -0.5F, 0.0F, -4.25F, 2, 2, 5, -0.02F, true));

        this.rightJaw2 = new AdvancedModelRenderer(this);
        this.rightJaw2.setRotationPoint(0.05F, 0.7418F, -4.2288F);
        this.rightJaw1.addChild(rightJaw2);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.6239F, -5.3769F);
        this.rightJaw2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.3491F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 94, 0.0F, 0.0F, -1.9F, 1, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 52, 92, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.01F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, 1.7073F, -4.4679F);
        this.rightJaw2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 52, 90, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.rightJaw2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1047F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 56, 114, 0.0F, 0.0F, -6.0F, 1, 1, 6, -0.01F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.3471F, -5.3691F);
        this.rightJaw2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4014F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 106, 123, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.9407F, 0.4398F);
        this.rightJaw2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.2182F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 116, 0.01F, 0.0F, -6.0F, 0, 1, 6, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.rightJaw2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3054F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 54, 98, 0.25F, -0.25F, -2.0F, 0, 1, 1, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 52, 98, 0.25F, -0.4F, -3.75F, 0, 1, 1, 0.0F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 86, 15, 0.0F, 0.0F, -5.0F, 1, 1, 5, 0.01F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.2877F, 0.6534F, -5.9222F);
        this.rightJaw2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.6053F, -0.3351F, -0.2182F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 26, 100, 0.0F, -0.45F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.rightJaw2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0872F, -0.0067F, 0.0013F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 24, 100, 0.25F, 1.4F, -5.25F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck1.offsetZ = 0.05F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1757F, 0.116F, 0.0205F);
        this.setRotateAngle(chest, 0.186F, 0.0949F, -0.0087F);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.4276F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.6021F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 1.1956F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.4276F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.4625F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.6847F, -0.3466F, -0.2706F);
        this.setRotateAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.6847F, 0.3466F, 0.2706F);
        this.setRotateAngle(cube_r31, 0.4625F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r32, 0.7767F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, 0.6053F, 0.3351F, 0.2182F);
        this.setRotateAngle(cube_r45, -0.0872F, 0.0067F, -0.0013F);
        this.setRotateAngle(cube_r46, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r51, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r52, 0.6053F, -0.3351F, -0.2182F);
        this.setRotateAngle(cube_r53, -0.0872F, -0.0067F, 0.0013F);
        this.setRotateAngle(cube_r6, 0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.0218F, 0.0174F, -0.0004F);
        this.setRotateAngle(jaw, 0.2662F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm1, -0.3156F, 0.4869F, -0.0751F);
        this.setRotateAngle(leftArm2, -1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(leftFingers, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(leftFoot, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(leftJaw1, 0.0F, 0.0F, -0.0175F);
        this.setRotateAngle(leftLeg1, -0.5923F, -0.031F, -0.0722F);
        this.setRotateAngle(leftLeg2, 0.6441F, -0.0499F, 0.0663F);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(leftThumb, -0.48F, -0.2182F, 0.0F);
        this.setRotateAngle(neck1, -0.1265F, -0.0393F, 0.0007F);
        this.setRotateAngle(neck2, -0.385F, -0.1605F, -0.0237F);
        this.setRotateAngle(neck3, -0.432F, 0.0F, 0.0F);
        this.setRotateAngle(neck4, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(neck5, 0.4145F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm1, -0.4141F, -0.3101F, 0.219F);
        this.setRotateAngle(rightArm2, -1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(rightFingers, 0.0F, 0.7156F, 0.0F);
        this.setRotateAngle(rightFoot, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(rightHand, 0.0F, 0.4407F, 0.0F);
        this.setRotateAngle(rightJaw1, 0.0F, 0.0F, 0.0175F);
        this.setRotateAngle(rightLeg1, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.6807F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.8334F, 0.0F, 0.0F);
        this.setRotateAngle(rightThumb, -0.5935F, 0.6334F, -0.2677F);
        this.setRotateAngle(rightToes, -0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.057F, -0.0511F, 0.0116F);
        this.setRotateAngle(tail2, -0.0044F, -0.0785F, 0.0003F);
        this.setRotateAngle(tail3, 0.0702F, -0.0429F, -0.0089F);
        this.setRotateAngle(tail4, -0.0446F, 0.2049F, -0.0091F);
        this.setRotateAngle(tail5, -0.1763F, 0.1418F, -0.0252F);
        this.setRotateAngle(tail6, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(throat1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(throat2, 0.1614F, 0.0F, 0.0F);
        this.hips.offsetY = -0.13F;
        this.hips.render(0.01F);

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = 1.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(-150);
        this.hips.rotateAngleX = (float)Math.toRadians(6);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.7F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraIrritator EntityIrritator = (EntityPrehistoricFloraIrritator) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, neck5);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityIrritator.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityIrritator.getAnimation() == EntityIrritator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityIrritator.isReallyInWater()) {

                if (f3 == 0.0F || !EntityIrritator.getIsMoving()) { //Is moving at all
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

                if (EntityIrritator.getIsFast()) { //Running


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
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 5) / 3) * (-5.25-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5.25 + (((tickAnim - 8) / 4) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -9.75 + (((tickAnim - 7) / 5) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 7) / 1) * (-6.5-(-7)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -6.5 + (((tickAnim - 8) / 4) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.42584-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-18.82751-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-33.30254-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.42584 + (((tickAnim - 3) / 2) * (-42.20351-(-20.42584)));
            yy = -18.82751 + (((tickAnim - 3) / 2) * (-32.20994-(-18.82751)));
            zz = -33.30254 + (((tickAnim - 3) / 2) * (-56.28461-(-33.30254)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -42.20351 + (((tickAnim - 5) / 3) * (-70.56864-(-42.20351)));
            yy = -32.20994 + (((tickAnim - 5) / 3) * (13.32746-(-32.20994)));
            zz = -56.28461 + (((tickAnim - 5) / 3) * (-11.19279-(-56.28461)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -70.56864 + (((tickAnim - 8) / 4) * (0-(-70.56864)));
            yy = 13.32746 + (((tickAnim - 8) / 4) * (0-(13.32746)));
            zz = -11.19279 + (((tickAnim - 8) / 4) * (0-(-11.19279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.96916-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.03776-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-13.11014-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14.96916 + (((tickAnim - 3) / 2) * (14.21-(14.96916)));
            yy = -7.03776 + (((tickAnim - 3) / 2) * (-11.53068-(-7.03776)));
            zz = -13.11014 + (((tickAnim - 3) / 2) * (-30.59044-(-13.11014)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.21 + (((tickAnim - 5) / 3) * (11.15623-(14.21)));
            yy = -11.53068 + (((tickAnim - 5) / 3) * (-3.89634-(-11.53068)));
            zz = -30.59044 + (((tickAnim - 5) / 3) * (7.59575-(-30.59044)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 11.15623 + (((tickAnim - 8) / 4) * (0-(11.15623)));
            yy = -3.89634 + (((tickAnim - 8) / 4) * (0-(-3.89634)));
            zz = 7.59575 + (((tickAnim - 8) / 4) * (0-(7.59575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-21-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -21 + (((tickAnim - 3) / 2) * (12.7-(-21)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 12.7 + (((tickAnim - 5) / 2) * (14.58-(12.7)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 14.58 + (((tickAnim - 7) / 1) * (-29.25-(14.58)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -29.25 + (((tickAnim - 8) / 4) * (0-(-29.25)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (30.85-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 30.85 + (((tickAnim - 5) / 2) * (43.31-(30.85)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 43.31 + (((tickAnim - 7) / 1) * (-36.5-(43.31)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -36.5 + (((tickAnim - 8) / 4) * (0-(-36.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(xx), leftFingers.rotateAngleY + (float) Math.toRadians(yy), leftFingers.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (7.514-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (51.65877-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-24.66906-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.514 + (((tickAnim - 5) / 2) * (4.21381-(7.514)));
            yy = 51.65877 + (((tickAnim - 5) / 2) * (59.32188-(51.65877)));
            zz = -24.66906 + (((tickAnim - 5) / 2) * (-29.28144-(-24.66906)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.21381 + (((tickAnim - 7) / 1) * (13.75-(4.21381)));
            yy = 59.32188 + (((tickAnim - 7) / 1) * (-40-(59.32188)));
            zz = -29.28144 + (((tickAnim - 7) / 1) * (0-(-29.28144)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13.75 + (((tickAnim - 8) / 4) * (0-(13.75)));
            yy = -40 + (((tickAnim - 8) / 4) * (0-(-40)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(xx), leftThumb.rotateAngleY + (float) Math.toRadians(yy), leftThumb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.75 + (((tickAnim - 5) / 3) * (5-(-2.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 8) / 2) * (9.75-(5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 10) / 2) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.25 + (((tickAnim - 4) / 3) * (-1.75-(-5.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.75 + (((tickAnim - 7) / 2) * (7.5-(-1.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 9) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.35-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0.35 + (((tickAnim - 7) / 5) * (0-(0.35)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 3) / 5) * (-19.75-(-6.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -19.75 + (((tickAnim - 8) / 1) * (8.62-(-19.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 8.62 + (((tickAnim - 9) / 3) * (0-(8.62)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.75 + (((tickAnim - 3) / 5) * (10.63-(5.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10.63 + (((tickAnim - 8) / 1) * (17.82-(10.63)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 17.82 + (((tickAnim - 9) / 3) * (0-(17.82)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 3) / 5) * (12.75-(8.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12.75 + (((tickAnim - 8) / 1) * (-13.37-(12.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -13.37 + (((tickAnim - 9) / 3) * (0-(-13.37)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 4) * (0-(0.2)));
            zz = 0.25 + (((tickAnim - 8) / 4) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 3) / 5) * (20.5-(4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20.5 + (((tickAnim - 8) / 1) * (-17-(20.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 9) / 3) * (0-(-17)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (23.75-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23.75 + (((tickAnim - 9) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 10) / 10) * (0-(5.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.725 + (((tickAnim - 10) / 10) * (0-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.75 + (((tickAnim - 10) / 10) * (0-(25.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 10) / 10) * (0-(21)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 5) / 5) * (0-(10.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 5) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 5) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.475 + (((tickAnim - 5) / 5) * (0-(0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.83-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.83 + (((tickAnim - 8) / 2) * (0-(4.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.25 + (((tickAnim - 5) / 3) * (-7.83-(15.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.83 + (((tickAnim - 8) / 2) * (0-(-7.83)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (15-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 15 + (((tickAnim - 14) / 6) * (0-(15)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 14) / 6) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 14) / 6) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 5) / 3) * (20.08-(10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20.08 + (((tickAnim - 8) / 2) * (0-(20.08)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 3) * (-6.92-(-2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -6.92 + (((tickAnim - 8) / 2) * (0-(-6.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 4.25 + (((tickAnim - 5) / 3) * (10.92-(4.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 10.92 + (((tickAnim - 8) / 2) * (0-(10.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 5) / 3) * (6.92-(2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 6.92 + (((tickAnim - 8) / 2) * (0-(6.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -3.5 + (((tickAnim - 5) / 3) * (-10.92-(-3.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -10.92 + (((tickAnim - 8) / 2) * (0-(-10.92)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 29 + (((tickAnim - 13) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16.2 + (((tickAnim - 23) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (29-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 29 + (((tickAnim - 38) / 10) * (-16.2-(29)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -16.2 + (((tickAnim - 48) / 2) * (0-(-16.2)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.75 + (((tickAnim - 13) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 26.93434 + (((tickAnim - 16) / 7) * (32.75198-(26.93434)));
            yy = 1.41877 + (((tickAnim - 16) / 7) * (0.38694-(1.41877)));
            zz = -1.96448 + (((tickAnim - 16) / 7) * (-0.53577-(-1.96448)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 32.75198 + (((tickAnim - 23) / 2) * (0-(32.75198)));
            yy = 0.38694 + (((tickAnim - 23) / 2) * (0-(0.38694)));
            zz = -0.53577 + (((tickAnim - 23) / 2) * (0-(-0.53577)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 11.75 + (((tickAnim - 38) / 3) * (26.93434-(11.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (1.41877-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-1.96448-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 26.93434 + (((tickAnim - 41) / 4) * (26.93434-(26.93434)));
            yy = 1.41877 + (((tickAnim - 41) / 4) * (1.41877-(1.41877)));
            zz = -1.96448 + (((tickAnim - 41) / 4) * (-1.96448-(-1.96448)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.93434 + (((tickAnim - 45) / 5) * (0-(26.93434)));
            yy = 1.41877 + (((tickAnim - 45) / 5) * (0-(1.41877)));
            zz = -1.96448 + (((tickAnim - 45) / 5) * (0-(-1.96448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.355-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.78-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.355 + (((tickAnim - 20) / 5) * (0-(1.355)));
            zz = -0.78 + (((tickAnim - 20) / 5) * (0-(-0.78)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0.675-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (-0.85-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 45) / 5) * (0-(0.675)));
            zz = -0.85 + (((tickAnim - 45) / 5) * (0-(-0.85)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 17 + (((tickAnim - 13) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -11.28 + (((tickAnim - 16) / 4) * (-31.78-(-11.28)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -31.78 + (((tickAnim - 20) / 5) * (0-(-31.78)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (17-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 17 + (((tickAnim - 38) / 3) * (-11.28-(17)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -11.28 + (((tickAnim - 41) / 4) * (-37.03-(-11.28)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -37.03 + (((tickAnim - 45) / 5) * (0-(-37.03)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (1.3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 1.3 + (((tickAnim - 16) / 4) * (1.3-(1.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 1.3 + (((tickAnim - 20) / 5) * (0-(1.3)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (1.3-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 1.3 + (((tickAnim - 41) / 4) * (1.3-(1.3)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 1.3 + (((tickAnim - 45) / 5) * (0-(1.3)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 13) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 42.13 + (((tickAnim - 16) / 4) * (72.76-(42.13)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 72.76 + (((tickAnim - 20) / 5) * (0-(72.76)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (25.75-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 25.75 + (((tickAnim - 38) / 3) * (42.13-(25.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 42.13 + (((tickAnim - 41) / 4) * (83.13-(42.13)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 83.13 + (((tickAnim - 45) / 5) * (0-(83.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.265-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.21-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.265 + (((tickAnim - 6) / 7) * (0-(-0.265)));
            zz = -0.21 + (((tickAnim - 6) / 7) * (0-(-0.21)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0.25-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 16) / 9) * (0-(0.25)));
            yy = 0.15 + (((tickAnim - 16) / 9) * (0-(0.15)));
            zz = -0.15 + (((tickAnim - 16) / 9) * (0-(-0.15)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0.225-(0)));
            yy = 0.15 + (((tickAnim - 41) / 4) * (1.525-(0.15)));
            zz = -0.575 + (((tickAnim - 41) / 4) * (0-(-0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.225 + (((tickAnim - 45) / 5) * (0-(0.225)));
            yy = 1.525 + (((tickAnim - 45) / 5) * (0-(1.525)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-40.52-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -40.52 + (((tickAnim - 6) / 7) * (0-(-40.52)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (26.75-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 16) / 9) * (0-(26.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (-40.52-(0)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -40.52 + (((tickAnim - 31) / 7) * (-25.75-(-40.52)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -25.75 + (((tickAnim - 38) / 3) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (26.75-(0)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 45) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.775-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.775 + (((tickAnim - 20) / 10) * (-6.775-(-6.775)));
            zz = 2.175 + (((tickAnim - 20) / 10) * (2.175-(2.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.775 + (((tickAnim - 30) / 20) * (0-(-6.775)));
            zz = 2.175 + (((tickAnim - 30) / 20) * (0-(2.175)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-15.03415-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.69926-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.41606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.03415 + (((tickAnim - 20) / 10) * (-15.03415-(-15.03415)));
            yy = 3.69926 + (((tickAnim - 20) / 10) * (3.69926-(3.69926)));
            zz = -1.41606 + (((tickAnim - 20) / 10) * (-1.41606-(-1.41606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.03415 + (((tickAnim - 30) / 20) * (0-(-15.03415)));
            yy = 3.69926 + (((tickAnim - 30) / 20) * (0-(3.69926)));
            zz = -1.41606 + (((tickAnim - 30) / 20) * (0-(-1.41606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 40.5 + (((tickAnim - 20) / 10) * (40.5-(40.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 40.5 + (((tickAnim - 30) / 20) * (0-(40.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -1.4 + (((tickAnim - 20) / 10) * (-1.4-(-1.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -1.4 + (((tickAnim - 30) / 20) * (0-(-1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.75 + (((tickAnim - 20) / 10) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 30) / 20) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (-0.3-(-0.3)));
            zz = 1.225 + (((tickAnim - 20) / 10) * (1.225-(1.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 20) * (0-(-0.3)));
            zz = 1.225 + (((tickAnim - 30) / 20) * (0-(1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 23.75 + (((tickAnim - 20) / 10) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 30) / 20) * (0-(23.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 20) / 10) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 30) / 20) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 20) / 10) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 20) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 20) / 10) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 30) / 20) * (0-(10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-27.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -27.75 + (((tickAnim - 20) / 10) * (-27.75-(-27.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -27.75 + (((tickAnim - 30) / 20) * (0-(-27.75)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 20) / 10) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 30) / 20) * (0-(6.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.03415-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.69926-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.41606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.03415 + (((tickAnim - 20) / 10) * (-15.03415-(-15.03415)));
            yy = 3.69926 + (((tickAnim - 20) / 10) * (3.69926-(3.69926)));
            zz = -1.41606 + (((tickAnim - 20) / 10) * (-1.41606-(-1.41606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.03415 + (((tickAnim - 30) / 20) * (0-(-15.03415)));
            yy = 3.69926 + (((tickAnim - 30) / 20) * (0-(3.69926)));
            zz = -1.41606 + (((tickAnim - 30) / 20) * (0-(-1.41606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 40.5 + (((tickAnim - 20) / 10) * (40.5-(40.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 40.5 + (((tickAnim - 30) / 20) * (0-(40.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = -1.4 + (((tickAnim - 20) / 10) * (-1.4-(-1.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = -1.4 + (((tickAnim - 30) / 20) * (0-(-1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.75 + (((tickAnim - 20) / 10) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 30) / 20) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (-0.3-(-0.3)));
            zz = 1.225 + (((tickAnim - 20) / 10) * (1.225-(1.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 20) * (0-(-0.3)));
            zz = 1.225 + (((tickAnim - 30) / 20) * (0-(1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 23.75 + (((tickAnim - 20) / 10) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 23.75 + (((tickAnim - 30) / 20) * (0-(23.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.25 + (((tickAnim - 20) / 10) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 30) / 20) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.50833-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.17238-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.40074-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.50833 + (((tickAnim - 10) / 10) * (-10.51665-(-11.50833)));
            yy = -3.17238 + (((tickAnim - 10) / 10) * (-6.34477-(-3.17238)));
            zz = 3.40074 + (((tickAnim - 10) / 10) * (6.80149-(3.40074)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.51665 + (((tickAnim - 20) / 10) * (-10.51665-(-10.51665)));
            yy = -6.34477 + (((tickAnim - 20) / 10) * (-6.34477-(-6.34477)));
            zz = 6.80149 + (((tickAnim - 20) / 10) * (6.80149-(6.80149)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.51665 + (((tickAnim - 30) / 20) * (0-(-10.51665)));
            yy = -6.34477 + (((tickAnim - 30) / 20) * (0-(-6.34477)));
            zz = 6.80149 + (((tickAnim - 30) / 20) * (0-(6.80149)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.125 + (((tickAnim - 20) / 10) * (-0.125-(-0.125)));
            yy = -0.275 + (((tickAnim - 20) / 10) * (-0.275-(-0.275)));
            zz = -0.325 + (((tickAnim - 20) / 10) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.125 + (((tickAnim - 30) / 20) * (0-(-0.125)));
            yy = -0.275 + (((tickAnim - 30) / 20) * (0-(-0.275)));
            zz = -0.325 + (((tickAnim - 30) / 20) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (12.2583-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (-12.80164-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (1.421-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.2583 + (((tickAnim - 20) / 10) * (12.2583-(12.2583)));
            yy = -12.80164 + (((tickAnim - 20) / 10) * (-12.80164-(-12.80164)));
            zz = 1.421 + (((tickAnim - 20) / 10) * (1.421-(1.421)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 12.2583 + (((tickAnim - 30) / 7) * (4.46627-(12.2583)));
            yy = -12.80164 + (((tickAnim - 30) / 7) * (-16.54009-(-12.80164)));
            zz = 1.421 + (((tickAnim - 30) / 7) * (1.00413-(1.421)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 4.46627 + (((tickAnim - 37) / 13) * (0-(4.46627)));
            yy = -16.54009 + (((tickAnim - 37) / 13) * (0-(-16.54009)));
            zz = 1.00413 + (((tickAnim - 37) / 13) * (0-(1.00413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.3 + (((tickAnim - 20) / 10) * (-0.3-(-0.3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 20) / 10) * (0.25-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.3 + (((tickAnim - 30) / 20) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.25 + (((tickAnim - 30) / 20) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (7-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 10) / 5) * (5.11361-(7)));
            yy = -1.25 + (((tickAnim - 10) / 5) * (-18.23314-(-1.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (17.05172-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.11361 + (((tickAnim - 15) / 5) * (4.61429-(5.11361)));
            yy = -18.23314 + (((tickAnim - 15) / 5) * (-23.45368-(-18.23314)));
            zz = 17.05172 + (((tickAnim - 15) / 5) * (8.95928-(17.05172)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.61429 + (((tickAnim - 20) / 10) * (4.61429-(4.61429)));
            yy = -23.45368 + (((tickAnim - 20) / 10) * (-23.45368-(-23.45368)));
            zz = 8.95928 + (((tickAnim - 20) / 10) * (8.95928-(8.95928)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 4.61429 + (((tickAnim - 30) / 7) * (0-(4.61429)));
            yy = -23.45368 + (((tickAnim - 30) / 7) * (0-(-23.45368)));
            zz = 8.95928 + (((tickAnim - 30) / 7) * (0-(8.95928)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
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
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.525 + (((tickAnim - 20) / 10) * (-0.525-(-0.525)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.525 + (((tickAnim - 30) / 20) * (0-(-0.525)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15 + (((tickAnim - 20) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (0-(15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 20) / 10) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 30) / 20) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (36.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 36.5 + (((tickAnim - 20) / 10) * (36.5-(36.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 36.5 + (((tickAnim - 30) / 20) * (0-(36.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 739;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10 + (((tickAnim - 40) / 1) * (-12.75-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-10)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = -12.75 + (((tickAnim - 41) / 244) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 244) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -12.75 + (((tickAnim - 285) / 29) * (-11.59228-(-12.75)));
            yy = 0 + (((tickAnim - 285) / 29) * (0.36397-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0.93142-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 320) {
            xx = -11.59228 + (((tickAnim - 314) / 6) * (-14.75-(-11.59228)));
            yy = 0.36397 + (((tickAnim - 314) / 6) * (0-(0.36397)));
            zz = 0.93142 + (((tickAnim - 314) / 6) * (0-(0.93142)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -14.75 + (((tickAnim - 320) / 355) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -14.75 + (((tickAnim - 675) / 10) * (7-(-14.75)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 7 + (((tickAnim - 685) / 30) * (3.12511-(7)));
            yy = 0 + (((tickAnim - 685) / 30) * (-0.13353-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (-1.7449-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 3.12511 + (((tickAnim - 715) / 24) * (0-(3.12511)));
            yy = -0.13353 + (((tickAnim - 715) / 24) * (0-(-0.13353)));
            zz = -1.7449 + (((tickAnim - 715) / 24) * (0-(-1.7449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (-0.325-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = -0.325 + (((tickAnim - 41) / 244) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = -0.325 + (((tickAnim - 285) / 35) * (-7.245-(-0.325)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = -7.245 + (((tickAnim - 320) / 355) * (-7.245-(-7.245)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = -7.245 + (((tickAnim - 675) / 10) * (-8.865-(-7.245)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = -8.865 + (((tickAnim - 685) / 54) * (0-(-8.865)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-21.90588-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.04683-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.17966-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -21.90588 + (((tickAnim - 27) / 13) * (-9.20784-(-21.90588)));
            yy = 0.04683 + (((tickAnim - 27) / 13) * (0.06244-(0.04683)));
            zz = 0.17966 + (((tickAnim - 27) / 13) * (0.23955-(0.17966)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -9.20784 + (((tickAnim - 40) / 245) * (-9.20784-(-9.20784)));
            yy = 0.06244 + (((tickAnim - 40) / 245) * (0.06244-(0.06244)));
            zz = 0.23955 + (((tickAnim - 40) / 245) * (0.23955-(0.23955)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = -9.20784 + (((tickAnim - 285) / 19) * (7.19592-(-9.20784)));
            yy = 0.06244 + (((tickAnim - 285) / 19) * (0.1306-(0.06244)));
            zz = 0.23955 + (((tickAnim - 285) / 19) * (-1.13744-(0.23955)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 7.19592 + (((tickAnim - 304) / 16) * (20.75-(7.19592)));
            yy = 0.1306 + (((tickAnim - 304) / 16) * (0-(0.1306)));
            zz = -1.13744 + (((tickAnim - 304) / 16) * (0-(-1.13744)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 20.75 + (((tickAnim - 320) / 355) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 20.75 + (((tickAnim - 675) / 1) * (19.75-(20.75)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 683) {
            xx = 19.75 + (((tickAnim - 676) / 7) * (-28.71-(19.75)));
            yy = 0 + (((tickAnim - 676) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 7) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = -28.71 + (((tickAnim - 683) / 2) * (-20-(-28.71)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = -20 + (((tickAnim - 685) / 30) * (-27.5-(-20)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = -27.5 + (((tickAnim - 715) / 12) * (1.6-(-27.5)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 1.6 + (((tickAnim - 727) / 12) * (0-(1.6)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 20.25 + (((tickAnim - 27) / 13) * (0-(20.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (5.5-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 5.5 + (((tickAnim - 320) / 355) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 5.5 + (((tickAnim - 675) / 1) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 679) {
            xx = 5.5 + (((tickAnim - 676) / 3) * (37.25-(5.5)));
            yy = 0 + (((tickAnim - 676) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 3) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 37.25 + (((tickAnim - 679) / 6) * (0-(37.25)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = -1.75 + (((tickAnim - 715) / 12) * (49.95-(-1.75)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 49.95 + (((tickAnim - 727) / 12) * (0-(49.95)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.775 + (((tickAnim - 27) / 13) * (0-(0.775)));
            zz = -0.85 + (((tickAnim - 27) / 13) * (0-(-0.85)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 390) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 390) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 676) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 676) / 3) * (0.9-(0)));
            zz = 0 + (((tickAnim - 676) / 3) * (-1.475-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 679) / 6) * (0-(0.9)));
            zz = -1.475 + (((tickAnim - 679) / 6) * (0-(-1.475)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = -0.775 + (((tickAnim - 715) / 12) * (0.69-(-0.775)));
            zz = 0 + (((tickAnim - 715) / 12) * (-1.35-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = 0.69 + (((tickAnim - 727) / 12) * (0-(0.69)));
            zz = -1.35 + (((tickAnim - 727) / 12) * (0-(-1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 27) / 13) * (23-(-3.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 23 + (((tickAnim - 40) / 245) * (23-(23)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = 23 + (((tickAnim - 285) / 19) * (10.5-(23)));
            yy = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 675) {
            xx = 10.5 + (((tickAnim - 304) / 371) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 304) / 371) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 371) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 10.5 + (((tickAnim - 675) / 1) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 10.5 + (((tickAnim - 676) / 4) * (-41.5-(10.5)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = -41.5 + (((tickAnim - 680) / 5) * (17.5-(-41.5)));
            yy = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 17.5 + (((tickAnim - 685) / 30) * (18.75-(17.5)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 18.75 + (((tickAnim - 715) / 12) * (-34.49-(18.75)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = -34.49 + (((tickAnim - 727) / 12) * (0-(-34.49)));
            yy = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-1.65-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = -1.65 + (((tickAnim - 40) / 245) * (-1.65-(-1.65)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = -1.65 + (((tickAnim - 285) / 35) * (-0.88-(-1.65)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -0.88 + (((tickAnim - 320) / 355) * (-0.825-(-0.88)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = -0.825 + (((tickAnim - 675) / 1) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            yy = -0.825 + (((tickAnim - 676) / 4) * (-0.345-(-0.825)));
            zz = 0 + (((tickAnim - 676) / 4) * (0.975-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 680) / 5) * (0-(0)));
            yy = -0.345 + (((tickAnim - 680) / 5) * (-0.45-(-0.345)));
            zz = 0.975 + (((tickAnim - 680) / 5) * (0-(0.975)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.45 + (((tickAnim - 685) / 30) * (-1.5-(-0.45)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            yy = -1.5 + (((tickAnim - 715) / 12) * (-0.31-(-1.5)));
            zz = 0 + (((tickAnim - 715) / 12) * (1.275-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 727) / 12) * (0-(0)));
            yy = -0.31 + (((tickAnim - 727) / 12) * (0-(-0.31)));
            zz = 1.275 + (((tickAnim - 727) / 12) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 31 + (((tickAnim - 27) / 13) * (0-(31)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 285) / 19) * (-9.17-(0)));
            yy = 0 + (((tickAnim - 285) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 19) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = -9.17 + (((tickAnim - 304) / 16) * (-22-(-9.17)));
            yy = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -22 + (((tickAnim - 320) / 355) * (-22-(-22)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = -22 + (((tickAnim - 675) / 1) * (-22-(-22)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = -22 + (((tickAnim - 676) / 4) * (75-(-22)));
            yy = 0 + (((tickAnim - 676) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 75 + (((tickAnim - 680) / 3) * (63-(75)));
            yy = 0 + (((tickAnim - 680) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 3) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 63 + (((tickAnim - 683) / 2) * (-4-(63)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = -4 + (((tickAnim - 685) / 30) * (6.5-(-4)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 6.5 + (((tickAnim - 715) / 12) * (60.65-(6.5)));
            yy = 0 + (((tickAnim - 715) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 12) * (0-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 733) {
            xx = 60.65 + (((tickAnim - 727) / 6) * (71.58-(60.65)));
            yy = 0 + (((tickAnim - 727) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 6) * (0-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 71.58 + (((tickAnim - 733) / 6) * (0-(71.58)));
            yy = 0 + (((tickAnim - 733) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 733) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.85 + (((tickAnim - 27) / 13) * (0-(0.85)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 285) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 10) * (0.81-(0)));
            zz = 0 + (((tickAnim - 285) / 10) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 295) / 9) * (0-(0)));
            yy = 0.81 + (((tickAnim - 295) / 9) * (0.875-(0.81)));
            zz = 0 + (((tickAnim - 295) / 9) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 304) / 16) * (0-(0)));
            yy = 0.875 + (((tickAnim - 304) / 16) * (0.55-(0.875)));
            zz = 0 + (((tickAnim - 304) / 16) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0.55 + (((tickAnim - 320) / 355) * (0-(0.55)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 676) {
            xx = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 1) * (0-(0)));
        }
        else if (tickAnim >= 676 && tickAnim < 680) {
            xx = 0 + (((tickAnim - 676) / 4) * (0.45-(0)));
            yy = 0 + (((tickAnim - 676) / 4) * (0.715-(0)));
            zz = 0 + (((tickAnim - 676) / 4) * (-0.025-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 0.45 + (((tickAnim - 680) / 3) * (0.45-(0.45)));
            yy = 0.715 + (((tickAnim - 680) / 3) * (2.29-(0.715)));
            zz = -0.025 + (((tickAnim - 680) / 3) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0.45 + (((tickAnim - 683) / 2) * (0-(0.45)));
            yy = 2.29 + (((tickAnim - 683) / 2) * (-0.2-(2.29)));
            zz = -0.025 + (((tickAnim - 683) / 2) * (0-(-0.025)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.2 + (((tickAnim - 685) / 30) * (-0.3-(-0.2)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 727) {
            xx = 0 + (((tickAnim - 715) / 12) * (0.4-(0)));
            yy = -0.3 + (((tickAnim - 715) / 12) * (1.445-(-0.3)));
            zz = 0 + (((tickAnim - 715) / 12) * (-0.165-(0)));
        }
        else if (tickAnim >= 727 && tickAnim < 733) {
            xx = 0.4 + (((tickAnim - 727) / 6) * (0.22-(0.4)));
            yy = 1.445 + (((tickAnim - 727) / 6) * (0.79-(1.445)));
            zz = -0.165 + (((tickAnim - 727) / 6) * (-0.075-(-0.165)));
        }
        else if (tickAnim >= 733 && tickAnim < 739) {
            xx = 0.22 + (((tickAnim - 733) / 6) * (0-(0.22)));
            yy = 0.79 + (((tickAnim - 733) / 6) * (0-(0.79)));
            zz = -0.075 + (((tickAnim - 733) / 6) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 29.75 + (((tickAnim - 27) / 13) * (0-(29.75)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 40) / 675) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 675) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 675) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 719) {
            xx = 0 + (((tickAnim - 715) / 4) * (-24.93743-(0)));
            yy = 0 + (((tickAnim - 715) / 4) * (0.83584-(0)));
            zz = 0 + (((tickAnim - 715) / 4) * (-0.36976-(0)));
        }
        else if (tickAnim >= 719 && tickAnim < 727) {
            xx = -24.93743 + (((tickAnim - 719) / 8) * (14-(-24.93743)));
            yy = 0.83584 + (((tickAnim - 719) / 8) * (0-(0.83584)));
            zz = -0.36976 + (((tickAnim - 719) / 8) * (0-(-0.36976)));
        }
        else if (tickAnim >= 727 && tickAnim < 731) {
            xx = 14 + (((tickAnim - 727) / 4) * (0-(14)));
            yy = 0 + (((tickAnim - 727) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 727) / 4) * (0-(0)));
        }
        else if (tickAnim >= 731 && tickAnim < 733) {
            xx = 0 + (((tickAnim - 731) / 2) * (-26.36-(0)));
            yy = 0 + (((tickAnim - 731) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 731) / 2) * (0-(0)));
        }
        else if (tickAnim >= 733 && tickAnim < 736) {
            xx = -26.36 + (((tickAnim - 733) / 3) * (-32.43-(-26.36)));
            yy = 0 + (((tickAnim - 733) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 733) / 3) * (0-(0)));
        }
        else if (tickAnim >= 736 && tickAnim < 738) {
            xx = -32.43 + (((tickAnim - 736) / 2) * (-20.71-(-32.43)));
            yy = 0 + (((tickAnim - 736) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 736) / 2) * (0-(0)));
        }
        else if (tickAnim >= 738 && tickAnim < 739) {
            xx = -20.71 + (((tickAnim - 738) / 1) * (0-(-20.71)));
            yy = 0 + (((tickAnim - 738) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 738) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 3 + (((tickAnim - 40) / 98) * (5.5-(3)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 5.5 + (((tickAnim - 138) / 145) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1-(5.5)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 320) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1 + (((tickAnim - 283) / 37) * (14.85-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*1)));
            yy = 0 + (((tickAnim - 283) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 37) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 651) {
            xx = 14.85 + (((tickAnim - 320) / 331) * (15.5-(14.85)));
            yy = 0 + (((tickAnim - 320) / 331) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 331) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 15.5 + (((tickAnim - 651) / 24) * (13.75-(15.5)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 13.75 + (((tickAnim - 675) / 5) * (4.87-(13.75)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 4.87 + (((tickAnim - 680) / 3) * (0-(4.87)));
            yy = 0 + (((tickAnim - 680) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 3) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.61723-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.0952-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 40) / 69) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 40) / 69) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 40) / 69) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 109) / 150) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 109) / 150) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 109) / 150) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 259) / 26) * (1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 259) / 26) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 259) / 26) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 285) / 35) * (7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(1.9005125532+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 285) / 35) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 285) / 35) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 320) / 20) * (5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(7.6505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 320) / 20) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 320) / 20) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 340 && tickAnim < 580) {
            xx = 5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 340) / 240) * (5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(5.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 340) / 240) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 340) / 240) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 580 && tickAnim < 675) {
            xx = 5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 580) / 95) * (8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5-(5.9005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 580) / 95) * (-0.61723-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 580) / 95) * (-0.0952-(-0.0952)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5 + (((tickAnim - 675) / 4) * (11.87277-(8.4005+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*0.5)));
            yy = -0.61723 + (((tickAnim - 675) / 4) * (-0.36005-(-0.61723)));
            zz = -0.0952 + (((tickAnim - 675) / 4) * (-0.05553-(-0.0952)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 11.87277 + (((tickAnim - 679) / 6) * (0-(11.87277)));
            yy = -0.36005 + (((tickAnim - 679) / 6) * (0-(-0.36005)));
            zz = -0.05553 + (((tickAnim - 679) / 6) * (0-(-0.05553)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 40) / 69) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 109) / 150) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 259) / 26) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 285) / 35) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1 + (((tickAnim - 320) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*1)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 580) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2 + (((tickAnim - 340) / 240) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.2)));
            yy = 0 + (((tickAnim - 340) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 240) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 675) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 580) / 95) * (5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 580) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 580) / 95) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5 + (((tickAnim - 675) / 4) * (-4.96-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-0.5)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.96 + (((tickAnim - 679) / 6) * (0-(-4.96)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.65-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 699) * (0-(0)));
            zz = 0.65 + (((tickAnim - 40) / 699) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (21.28087-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.45599-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.23477-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 21.28087 + (((tickAnim - 40) / 245) * (21.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 40) / 245) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 40) / 245) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 21.28087 + (((tickAnim - 285) / 29) * (34.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 285) / 29) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 285) / 29) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 34.28087 + (((tickAnim - 314) / 26) * (21.28087-(34.28087)));
            yy = 7.45599 + (((tickAnim - 314) / 26) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 314) / 26) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 21.28087 + (((tickAnim - 340) / 335) * (21.28087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 340) / 335) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 340) / 335) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 21.28087 + (((tickAnim - 675) / 5) * (41.03087-(21.28087)));
            yy = 7.45599 + (((tickAnim - 675) / 5) * (7.45599-(7.45599)));
            zz = -2.23477 + (((tickAnim - 675) / 5) * (-2.23477-(-2.23477)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 41.03087 + (((tickAnim - 680) / 5) * (0-(41.03087)));
            yy = 7.45599 + (((tickAnim - 680) / 5) * (0-(7.45599)));
            zz = -2.23477 + (((tickAnim - 680) / 5) * (0-(-2.23477)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -29.25 + (((tickAnim - 40) / 245) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 340) {
            xx = -29.25 + (((tickAnim - 285) / 55) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 285) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 55) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = -29.25 + (((tickAnim - 340) / 335) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -29.25 + (((tickAnim - 675) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = -29.25 + (((tickAnim - 685) / 54) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 285) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 55) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 40) / 69) * (-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 109) / 150) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 259) / 26) * (-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = -7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 285) / 29) * (-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 314) / 26) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(-11+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 340) / 1) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1 + (((tickAnim - 341) / 34) * (-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5 + (((tickAnim - 375) / 185) * (5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(-1.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*0.5)));
            yy = 0 + (((tickAnim - 375) / 185) * (0.6224-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (-1.21684-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 560) / 93) * (2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(5.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 560) / 93) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 560) / 93) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 653) / 22) * (2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5-(2.6155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 653) / 22) * (0.6224-(0.6224)));
            zz = -1.21684 + (((tickAnim - 653) / 22) * (-1.21684-(-1.21684)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5 + (((tickAnim - 675) / 4) * (-4.76971-(2.8655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*0.5)));
            yy = 0.6224 + (((tickAnim - 675) / 4) * (0.36307-(0.6224)));
            zz = -1.21684 + (((tickAnim - 675) / 4) * (-0.70982-(-1.21684)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -4.76971 + (((tickAnim - 679) / 6) * (34.75-(-4.76971)));
            yy = 0.36307 + (((tickAnim - 679) / 6) * (0-(0.36307)));
            zz = -0.70982 + (((tickAnim - 679) / 6) * (0-(-0.70982)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 34.75 + (((tickAnim - 685) / 14) * (18.61083-(34.75)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0.63128-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 18.61083 + (((tickAnim - 699) / 8) * (9.57417-(18.61083)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0.63128 + (((tickAnim - 699) / 8) * (-3.83952-(0.63128)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = 9.57417 + (((tickAnim - 707) / 1) * (7.94-(9.57417)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -3.83952 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(-3.83952)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 7.94 + (((tickAnim - 708) / 7) * (0-(7.94)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 314) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 314) * (0.275-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            yy = 0 + (((tickAnim - 314) / 361) * (0-(0)));
            zz = 0.275 + (((tickAnim - 314) / 361) * (0-(0.275)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 40) / 69) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 109) / 150) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 259) / 26) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 285) / 29) * (-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = -14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1 + (((tickAnim - 314) / 26) * (16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20-(-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 341) {
            xx = 16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20 + (((tickAnim - 340) / 1) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(16.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-20)));
            yy = 0 + (((tickAnim - 340) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 1) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 375) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 341) / 34) * (10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 341) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 34) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1 + (((tickAnim - 375) / 185) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(10.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 560) / 93) * (6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 653) / 22) * (-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 675) / 4) * (-7.88-(-6.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = -7.88 + (((tickAnim - 679) / 6) * (25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1-(-7.88)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1 + (((tickAnim - 685) / 14) * (0-(25.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+250))*-1)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (-0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.05 + (((tickAnim - 707) / 1) * (0.25-(-0.05)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = -0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2-(-0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0.25 + (((tickAnim - 708) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*2)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 245) * (0-(-0.5)));
            zz = 0.6 + (((tickAnim - 40) / 245) * (0-(0.6)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 29) * (-1.24-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (1.29-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            yy = -1.24 + (((tickAnim - 314) / 26) * (0-(-1.24)));
            zz = 1.29 + (((tickAnim - 314) / 26) * (0-(1.29)));
        }
        else if (tickAnim >= 340 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 340) / 313) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 313) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 313) * (0.45-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 653) / 22) * (-0.425-(0)));
            zz = 0.45 + (((tickAnim - 653) / 22) * (0.245-(0.45)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 675) / 4) * (0-(-0.425)));
            zz = 0.245 + (((tickAnim - 675) / 4) * (0-(0.245)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 679) / 6) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (1.2-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.475 + (((tickAnim - 685) / 30) * (0-(-0.475)));
            zz = 1.2 + (((tickAnim - 685) / 30) * (0-(1.2)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 109) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 40) / 69) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 40) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 69) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 259) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 109) / 150) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 109) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 150) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 259) / 26) * (5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 285) / 29) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(5.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 314) / 26) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 340) / 35) * (11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = 11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1 + (((tickAnim - 375) / 185) * (27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(11.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+300))*1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 560) / 93) * (25.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(27.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 25.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 653) / 22) * (38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1-(25.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1 + (((tickAnim - 675) / 4) * (14.5-(38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+300))*1)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 14.5 + (((tickAnim - 679) / 6) * (0-(14.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.04619-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -0.6 + (((tickAnim - 707) / 1) * (-0.75-(-0.6)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.04619 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3-(0.04619)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -0.75 + (((tickAnim - 708) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-170))*3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 560) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 560) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            yy = -0.175 + (((tickAnim - 560) / 93) * (-0.17-(-0.175)));
            zz = 0 + (((tickAnim - 560) / 93) * (0.3-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            yy = -0.17 + (((tickAnim - 653) / 22) * (-0.17-(-0.17)));
            zz = 0.3 + (((tickAnim - 653) / 22) * (0.3-(0.3)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.17 + (((tickAnim - 675) / 10) * (-0.02-(-0.17)));
            zz = 0.3 + (((tickAnim - 675) / 10) * (0.3-(0.3)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = -0.02 + (((tickAnim - 685) / 30) * (0-(-0.02)));
            zz = 0.3 + (((tickAnim - 685) / 30) * (0-(0.3)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 259) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 40) / 219) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 219) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 285) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 259) / 26) * (7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 285) / 29) * (27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2-(7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 328) {
            xx = 27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2 + (((tickAnim - 314) / 14) * (-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28-(27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-2)));
            yy = 0 + (((tickAnim - 314) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 14) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 340) {
            xx = -18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28 + (((tickAnim - 328) / 12) * (-4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1-(-18.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+380))*28)));
            yy = 0 + (((tickAnim - 328) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 12) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1 + (((tickAnim - 340) / 35) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1-(-4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+350))*-1)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1 + (((tickAnim - 375) / 185) * (-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-1)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 653) {
            xx = -16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1 + (((tickAnim - 560) / 93) * (-8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5-(-16.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+350))*1)));
            yy = 0 + (((tickAnim - 560) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 93) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 675) {
            xx = -8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5 + (((tickAnim - 653) / 22) * (-6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5-(-8.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5)));
            yy = 0 + (((tickAnim - 653) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 653) / 22) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = -6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5 + (((tickAnim - 675) / 4) * (5.5-(-6.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+200))*5)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 5.5 + (((tickAnim - 679) / 6) * (0-(5.5)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 707) {
            xx = 0 + (((tickAnim - 699) / 8) * (-14.1-(0)));
            yy = 0 + (((tickAnim - 699) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 8) * (0.17448-(0)));
        }
        else if (tickAnim >= 707 && tickAnim < 708) {
            xx = -14.1 + (((tickAnim - 707) / 1) * (-17.25-(-14.1)));
            yy = 0 + (((tickAnim - 707) / 1) * (0-(0)));
            zz = 0.17448 + (((tickAnim - 707) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4-(0.17448)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -17.25 + (((tickAnim - 708) / 7) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-260))*4)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.45-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 219) * (0-(0)));
            zz = 0.45 + (((tickAnim - 40) / 219) * (0.5-(0.45)));
        }
        else if (tickAnim >= 259 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 259) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 259) / 55) * (0.425-(0)));
            zz = 0.5 + (((tickAnim - 259) / 55) * (1.2-(0.5)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 314) / 26) * (0-(0)));
            yy = 0.425 + (((tickAnim - 314) / 26) * (0-(0.425)));
            zz = 1.2 + (((tickAnim - 314) / 26) * (0-(1.2)));
        }
        else if (tickAnim >= 340 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 340) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 220) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 560) / 125) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 125) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 125) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 259 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 0 + (((tickAnim - 285) / 29) * (5.11-(0)));
            yy = 0 + (((tickAnim - 285) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 29) * (0-(0)));
        }
        else if (tickAnim >= 314 && tickAnim < 328) {
            xx = 5.11 + (((tickAnim - 314) / 14) * (-10.985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(5.11)));
            yy = 0 + (((tickAnim - 314) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 314) / 14) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 340) {
            xx = -10.985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 328) / 12) * (-6.5-(-10.985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 328) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 328) / 12) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -6.5 + (((tickAnim - 340) / 35) * (-6.25-(-6.5)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 560) {
            xx = -6.25 + (((tickAnim - 375) / 185) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 375) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 185) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 560) / 115) * (6-(0)));
            yy = 0 + (((tickAnim - 560) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 115) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 679) {
            xx = 6 + (((tickAnim - 675) / 4) * (18-(6)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 18 + (((tickAnim - 679) / 6) * (-20.25-(18)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 704) {
            xx = -20.25 + (((tickAnim - 685) / 19) * (-19.59-(-20.25)));
            yy = 0 + (((tickAnim - 685) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 19) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = -19.59 + (((tickAnim - 704) / 4) * (-12.56-(-19.59)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-350))*5-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -12.56 + (((tickAnim - 708) / 7) * (0-(-12.56)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-350))*5 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-350))*5)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = 0 + (((tickAnim - 715) / 10) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 733) {
            xx = -12.75 + (((tickAnim - 725) / 8) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 725) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 560) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 560) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 119) * (0.225-(0)));
            zz = 0 + (((tickAnim - 560) / 119) * (0.35-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 679) / 6) * (0-(0.225)));
            zz = 0.35 + (((tickAnim - 679) / 6) * (0-(0.35)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 259 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 259) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 26) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 394) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 394) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 679) / 6) * (-8-(0)));
            yy = 0 + (((tickAnim - 679) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 6) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 693) {
            xx = -8 + (((tickAnim - 685) / 8) * (3.5-(-8)));
            yy = 0 + (((tickAnim - 685) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 8) * (0-(0)));
        }
        else if (tickAnim >= 693 && tickAnim < 699) {
            xx = 3.5 + (((tickAnim - 693) / 6) * (21.75-(3.5)));
            yy = 0 + (((tickAnim - 693) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 693) / 6) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 21.75 + (((tickAnim - 699) / 5) * (-5.42-(21.75)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = -5.42 + (((tickAnim - 704) / 4) * (-13.75-(-5.42)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -13.75 + (((tickAnim - 708) / 7) * (-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9-(-13.75)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6 + (((tickAnim - 708) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-440))*6)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = -4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9 + (((tickAnim - 715) / 10) * (-10.75-(-4.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-9)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 733) {
            xx = -10.75 + (((tickAnim - 725) / 8) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 725) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10 + (((tickAnim - 40) / 1) * (12-(4.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*10)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 285) {
            xx = 12 + (((tickAnim - 41) / 244) * (12-(12)));
            yy = 0 + (((tickAnim - 41) / 244) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 244) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 309) {
            xx = 12 + (((tickAnim - 285) / 24) * (-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10-(12)));
            yy = 0 + (((tickAnim - 285) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 24) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = -6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10 + (((tickAnim - 309) / 11) * (-5.75-(-6.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+200))*-10)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -5.75 + (((tickAnim - 320) / 355) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -5.75 + (((tickAnim - 675) / 10) * (-21-(-5.75)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = -21 + (((tickAnim - 685) / 30) * (19.25-(-21)));
            yy = 0 + (((tickAnim - 685) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 30) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 19.25 + (((tickAnim - 715) / 24) * (0-(19.25)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 296) {
            xx = 0 + (((tickAnim - 285) / 11) * (31.79-(0)));
            yy = 0 + (((tickAnim - 285) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 11) * (0-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 307) {
            xx = 31.79 + (((tickAnim - 296) / 11) * (12.39-(31.79)));
            yy = 0 + (((tickAnim - 296) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 296) / 11) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 320) {
            xx = 12.39 + (((tickAnim - 307) / 13) * (4.25-(12.39)));
            yy = 0 + (((tickAnim - 307) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 13) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 4.25 + (((tickAnim - 320) / 355) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 4.25 + (((tickAnim - 675) / 10) * (12-(4.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 12 + (((tickAnim - 685) / 14) * (52.88-(12)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 52.88 + (((tickAnim - 699) / 16) * (0-(52.88)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 296) {
            xx = 0 + (((tickAnim - 285) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 11) * (0.825-(0)));
            zz = 0 + (((tickAnim - 285) / 11) * (-1.01-(0)));
        }
        else if (tickAnim >= 296 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 296) / 11) * (0-(0)));
            yy = 0.825 + (((tickAnim - 296) / 11) * (0.725-(0.825)));
            zz = -1.01 + (((tickAnim - 296) / 11) * (-0.9-(-1.01)));
        }
        else if (tickAnim >= 307 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 307) / 13) * (0-(0)));
            yy = 0.725 + (((tickAnim - 307) / 13) * (-0.55-(0.725)));
            zz = -0.9 + (((tickAnim - 307) / 13) * (0-(-0.9)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -0.55 + (((tickAnim - 320) / 355) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 675) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0.85-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (-1.625-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = 0.85 + (((tickAnim - 699) / 16) * (0-(0.85)));
            zz = -1.625 + (((tickAnim - 699) / 16) * (0-(-1.625)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 285) / 22) * (-43.64-(0)));
            yy = 0 + (((tickAnim - 285) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 22) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 313) {
            xx = -43.64 + (((tickAnim - 307) / 6) * (-52.39-(-43.64)));
            yy = 0 + (((tickAnim - 307) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 6) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 320) {
            xx = -52.39 + (((tickAnim - 313) / 7) * (27.25-(-52.39)));
            yy = 0 + (((tickAnim - 313) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 7) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 27.25 + (((tickAnim - 320) / 355) * (27.25-(27.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 27.25 + (((tickAnim - 675) / 10) * (22.75-(27.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 22.75 + (((tickAnim - 685) / 14) * (-28.44-(22.75)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = -28.44 + (((tickAnim - 699) / 16) * (14.75-(-28.44)));
            yy = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 16) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 14.75 + (((tickAnim - 715) / 24) * (0-(14.75)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 285) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 22) * (-0.24-(0)));
            zz = 0 + (((tickAnim - 285) / 22) * (1.25-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 307) / 6) * (0-(0)));
            yy = -0.24 + (((tickAnim - 307) / 6) * (-0.24-(-0.24)));
            zz = 1.25 + (((tickAnim - 307) / 6) * (1.25-(1.25)));
        }
        else if (tickAnim >= 313 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 313) / 7) * (0-(0)));
            yy = -0.24 + (((tickAnim - 313) / 7) * (-0.6-(-0.24)));
            zz = 1.25 + (((tickAnim - 313) / 7) * (0-(1.25)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -0.6 + (((tickAnim - 320) / 355) * (-0.6-(-0.6)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.6 + (((tickAnim - 675) / 10) * (-1-(-0.6)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -1 + (((tickAnim - 685) / 14) * (-0.145-(-1)));
            zz = 0 + (((tickAnim - 685) / 14) * (1.51-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 699) / 16) * (0-(0)));
            yy = -0.145 + (((tickAnim - 699) / 16) * (-0.825-(-0.145)));
            zz = 1.51 + (((tickAnim - 699) / 16) * (-0.525-(1.51)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = -0.825 + (((tickAnim - 715) / 24) * (0-(-0.825)));
            zz = -0.525 + (((tickAnim - 715) / 24) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 291) {
            xx = 0 + (((tickAnim - 285) / 6) * (47.17-(0)));
            yy = 0 + (((tickAnim - 285) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 6) * (0-(0)));
        }
        else if (tickAnim >= 291 && tickAnim < 307) {
            xx = 47.17 + (((tickAnim - 291) / 16) * (77.36-(47.17)));
            yy = 0 + (((tickAnim - 291) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 291) / 16) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 313) {
            xx = 77.36 + (((tickAnim - 307) / 6) * (77.36-(77.36)));
            yy = 0 + (((tickAnim - 307) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 6) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 320) {
            xx = 77.36 + (((tickAnim - 313) / 7) * (-9.75-(77.36)));
            yy = 0 + (((tickAnim - 313) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 7) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = -9.75 + (((tickAnim - 320) / 355) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -9.75 + (((tickAnim - 675) / 10) * (-19.25-(-9.75)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = -19.25 + (((tickAnim - 685) / 14) * (48.56-(-19.25)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 48.56 + (((tickAnim - 699) / 9) * (61.58-(48.56)));
            yy = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 9) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 61.58 + (((tickAnim - 708) / 7) * (-36.25-(61.58)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = -36.25 + (((tickAnim - 715) / 24) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 285) / 13) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 285) / 13) * (2.025-(0)));
            zz = 0 + (((tickAnim - 285) / 13) * (0.05-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 307) {
            xx = -0.1 + (((tickAnim - 298) / 9) * (0-(-0.1)));
            yy = 2.025 + (((tickAnim - 298) / 9) * (0-(2.025)));
            zz = 0.05 + (((tickAnim - 298) / 9) * (0-(0.05)));
        }
        else if (tickAnim >= 307 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 307) / 6) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 307) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 6) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 320) {
            xx = -0.1 + (((tickAnim - 313) / 7) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 313) / 7) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 313) / 7) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = -0.1 + (((tickAnim - 320) / 355) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 675) / 10) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 699) / 9) * (-0.07-(0)));
            yy = 0 + (((tickAnim - 699) / 9) * (0.51-(0)));
            zz = 0 + (((tickAnim - 699) / 9) * (-0.08-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = -0.07 + (((tickAnim - 708) / 7) * (0-(-0.07)));
            yy = 0.51 + (((tickAnim - 708) / 7) * (-0.425-(0.51)));
            zz = -0.08 + (((tickAnim - 708) / 7) * (0-(-0.08)));
        }
        else if (tickAnim >= 715 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 715) / 24) * (0-(0)));
            yy = -0.425 + (((tickAnim - 715) / 24) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 715) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 291) {
            xx = 0 + (((tickAnim - 285) / 6) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 285) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 6) * (0-(0)));
        }
        else if (tickAnim >= 291 && tickAnim < 298) {
            xx = -27.75 + (((tickAnim - 291) / 7) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 291) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 291) / 7) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 298) / 9) * (18.75-(0)));
            yy = 0 + (((tickAnim - 298) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 9) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 320) {
            xx = 18.75 + (((tickAnim - 307) / 13) * (0-(18.75)));
            yy = 0 + (((tickAnim - 307) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 13) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (24.75-(0)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 705) {
            xx = 24.75 + (((tickAnim - 699) / 6) * (0-(24.75)));
            yy = 0 + (((tickAnim - 699) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 6) * (0-(0)));
        }
        else if (tickAnim >= 705 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 705) / 3) * (-54.75-(0)));
            yy = 0 + (((tickAnim - 705) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 705) / 3) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 712) {
            xx = -54.75 + (((tickAnim - 708) / 4) * (-41.27-(-54.75)));
            yy = 0 + (((tickAnim - 708) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 4) * (0-(0)));
        }
        else if (tickAnim >= 712 && tickAnim < 715) {
            xx = -41.27 + (((tickAnim - 712) / 3) * (0-(-41.27)));
            yy = 0 + (((tickAnim - 712) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 712) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 5.75 + (((tickAnim - 40) / 98) * (10.5-(5.75)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 10.5 + (((tickAnim - 138) / 145) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1-(10.5)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1 + (((tickAnim - 283) / 58) * (13.75-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-20))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 13.75 + (((tickAnim - 341) / 310) * (11.75-(13.75)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 11.75 + (((tickAnim - 651) / 24) * (9.25-(11.75)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 9.25 + (((tickAnim - 675) / 3) * (11.55-(9.25)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 11.55 + (((tickAnim - 678) / 5) * (0-(11.55)));
            yy = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 5) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 7 + (((tickAnim - 40) / 98) * (4.75-(7)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 4.75 + (((tickAnim - 138) / 145) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1-(4.75)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1 + (((tickAnim - 283) / 58) * (0-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-40))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 0 + (((tickAnim - 341) / 310) * (-3-(0)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = -3 + (((tickAnim - 651) / 24) * (-1.75-(-3)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = -1.75 + (((tickAnim - 675) / 5) * (8.65-(-1.75)));
            yy = 0 + (((tickAnim - 675) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 5) * (0-(0)));
        }
        else if (tickAnim >= 680 && tickAnim < 683) {
            xx = 8.65 + (((tickAnim - 680) / 3) * (0-(8.65)));
            yy = 0 + (((tickAnim - 680) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 680) / 3) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 10.25 + (((tickAnim - 40) / 98) * (-1.25-(10.25)));
            yy = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = -1.25 + (((tickAnim - 138) / 145) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1-(-1.25)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1 + (((tickAnim - 283) / 58) * (-7.75-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-60))*1)));
            yy = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = -7.75 + (((tickAnim - 341) / 310) * (-0.5-(-7.75)));
            yy = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = -0.5 + (((tickAnim - 651) / 24) * (1.75-(-0.5)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 1.75 + (((tickAnim - 675) / 3) * (-7.79-(1.75)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = -7.79 + (((tickAnim - 678) / 5) * (10.85-(-7.79)));
            yy = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 5) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 10.85 + (((tickAnim - 683) / 2) * (0-(10.85)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 40) / 98) * (0-(0)));
            yy = 0.225 + (((tickAnim - 40) / 98) * (0-(0.225)));
            zz = 0 + (((tickAnim - 40) / 98) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 138) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 145) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 341) {
            xx = 0 + (((tickAnim - 283) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 283) / 58) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 283) / 58) * (0-(0)));
        }
        else if (tickAnim >= 341 && tickAnim < 651) {
            xx = 0 + (((tickAnim - 341) / 310) * (0-(0)));
            yy = -0.1 + (((tickAnim - 341) / 310) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 341) / 310) * (0-(0)));
        }
        else if (tickAnim >= 651 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 3) * (-0.03-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            yy = -0.03 + (((tickAnim - 678) / 5) * (0.125-(-0.03)));
            zz = 0 + (((tickAnim - 678) / 5) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 683) / 56) * (0-(0)));
            yy = 0.125 + (((tickAnim - 683) / 56) * (0-(0.125)));
            zz = 0 + (((tickAnim - 683) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 651 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 651) / 24) * (9.25-(0)));
            yy = 0 + (((tickAnim - 651) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 651) / 24) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 9.25 + (((tickAnim - 675) / 3) * (-3.04-(9.25)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (0-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 683) {
            xx = -3.04 + (((tickAnim - 678) / 5) * (17.05-(-3.04)));
            yy = 0 + (((tickAnim - 678) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 678) / 5) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 17.05 + (((tickAnim - 683) / 2) * (0-(17.05)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 675) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 678) {
            xx = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 3) * (-0.35-(0)));
        }
        else if (tickAnim >= 678 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 678) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 678) / 61) * (0-(0)));
            zz = -0.35 + (((tickAnim - 678) / 61) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.82569-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.67838-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (8.59917-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = 18.82569 + (((tickAnim - 40) / 245) * (18.82569-(18.82569)));
            yy = -1.67838 + (((tickAnim - 40) / 245) * (-1.67838-(-1.67838)));
            zz = 8.59917 + (((tickAnim - 40) / 245) * (8.59917-(8.59917)));
        }
        else if (tickAnim >= 285 && tickAnim < 314) {
            xx = 18.82569 + (((tickAnim - 285) / 29) * (36.25-(18.82569)));
            yy = -1.67838 + (((tickAnim - 285) / 29) * (0-(-1.67838)));
            zz = 8.59917 + (((tickAnim - 285) / 29) * (0-(8.59917)));
        }
        else if (tickAnim >= 314 && tickAnim < 340) {
            xx = 36.25 + (((tickAnim - 314) / 26) * (18.82569-(36.25)));
            yy = 0 + (((tickAnim - 314) / 26) * (-1.67838-(0)));
            zz = 0 + (((tickAnim - 314) / 26) * (8.59917-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = 18.82569 + (((tickAnim - 340) / 335) * (18.82569-(18.82569)));
            yy = -1.67838 + (((tickAnim - 340) / 335) * (-1.67838-(-1.67838)));
            zz = 8.59917 + (((tickAnim - 340) / 335) * (8.59917-(8.59917)));
        }
        else if (tickAnim >= 675 && tickAnim < 680) {
            xx = 18.82569 + (((tickAnim - 675) / 5) * (34.25-(18.82569)));
            yy = -1.67838 + (((tickAnim - 675) / 5) * (0-(-1.67838)));
            zz = 8.59917 + (((tickAnim - 675) / 5) * (0-(8.59917)));
        }
        else if (tickAnim >= 680 && tickAnim < 685) {
            xx = 34.25 + (((tickAnim - 680) / 5) * (18.82569-(34.25)));
            yy = 0 + (((tickAnim - 680) / 5) * (-1.67838-(0)));
            zz = 0 + (((tickAnim - 680) / 5) * (8.59917-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = 18.82569 + (((tickAnim - 685) / 54) * (0-(18.82569)));
            yy = -1.67838 + (((tickAnim - 685) / 54) * (0-(-1.67838)));
            zz = 8.59917 + (((tickAnim - 685) / 54) * (0-(8.59917)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 285) {
            xx = -29.25 + (((tickAnim - 40) / 245) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 40) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 245) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 340) {
            xx = -29.25 + (((tickAnim - 285) / 55) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 285) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 55) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 675) {
            xx = -29.25 + (((tickAnim - 340) / 335) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 340) / 335) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 335) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 685) {
            xx = -29.25 + (((tickAnim - 675) / 10) * (-29.25-(-29.25)));
            yy = 0 + (((tickAnim - 675) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 10) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 739) {
            xx = -29.25 + (((tickAnim - 685) / 54) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 685) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (5.25-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 5.25 + (((tickAnim - 320) / 355) * (0-(5.25)));
            yy = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (-7.69-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = -7.69 + (((tickAnim - 683) / 2) * (-8-(-7.69)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = -8 + (((tickAnim - 685) / 14) * (0-(-8)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 9) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 285) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 35) * (0.775-(0)));
            zz = 0 + (((tickAnim - 285) / 35) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 320) / 355) * (0-(0)));
            yy = 0.775 + (((tickAnim - 320) / 355) * (0-(0.775)));
            zz = 0 + (((tickAnim - 320) / 355) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (-1.27-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0.925-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -1.27 + (((tickAnim - 685) / 14) * (0-(-1.27)));
            zz = 0.925 + (((tickAnim - 685) / 14) * (0-(0.925)));
        }
        else if (tickAnim >= 699 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 9) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 683) {
            xx = 1 + (((tickAnim - 0) / 683) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 683) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 683) * (1-(1)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 1 + (((tickAnim - 683) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 683) / 2) * (1.5425-(1)));
            zz = 1 + (((tickAnim - 683) / 2) * (1-(1)));
        }
        else if (tickAnim >= 685 && tickAnim < 715) {
            xx = 1 + (((tickAnim - 685) / 30) * (1-(1)));
            yy = 1.5425 + (((tickAnim - 685) / 30) * (1-(1.5425)));
            zz = 1 + (((tickAnim - 685) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 0) / 683) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 683) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 683) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 19.5 + (((tickAnim - 685) / 14) * (10-(19.5)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 10 + (((tickAnim - 699) / 5) * (15.75-(10)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 15.75 + (((tickAnim - 704) / 4) * (21.25-(15.75)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 21.25 + (((tickAnim - 708) / 7) * (0-(21.25)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 723) {
            xx = 0 + (((tickAnim - 715) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 8) * (0-(0)));
        }
        else if (tickAnim >= 723 && tickAnim < 728) {
            xx = 0 + (((tickAnim - 723) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 723) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 723) / 5) * (0-(0)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 17.25 + (((tickAnim - 728) / 11) * (0-(17.25)));
            yy = 0 + (((tickAnim - 728) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 728) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 683) / 2) * (0.6-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 0.6 + (((tickAnim - 685) / 14) * (0-(0.6)));
            zz = 0.225 + (((tickAnim - 685) / 14) * (0-(0.225)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 699) / 5) * (0.06-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0.415-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            yy = 0.06 + (((tickAnim - 704) / 4) * (0.375-(0.06)));
            zz = 0.415 + (((tickAnim - 704) / 4) * (0.35-(0.415)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 708) / 7) * (0-(0.375)));
            zz = 0.35 + (((tickAnim - 708) / 7) * (0-(0.35)));
        }
        else if (tickAnim >= 715 && tickAnim < 723) {
            xx = 0 + (((tickAnim - 715) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 715) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 8) * (0-(0)));
        }
        else if (tickAnim >= 723 && tickAnim < 728) {
            xx = 0 + (((tickAnim - 723) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 723) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 723) / 5) * (0-(0)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 0 + (((tickAnim - 728) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 728) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 728) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 683) {
            xx = 1 + (((tickAnim - 0) / 683) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 683) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 683) * (1-(1)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 1 + (((tickAnim - 683) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 683) / 2) * (1.3-(1)));
            zz = 1 + (((tickAnim - 683) / 2) * (1.3-(1)));
        }
        else if (tickAnim >= 685 && tickAnim < 704) {
            xx = 1 + (((tickAnim - 685) / 19) * (1-(1)));
            yy = 1.3 + (((tickAnim - 685) / 19) * (1-(1.3)));
            zz = 1.3 + (((tickAnim - 685) / 19) * (1.4-(1.3)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 1 + (((tickAnim - 704) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 704) / 4) * (1.075-(1)));
            zz = 1.4 + (((tickAnim - 704) / 4) * (1.575-(1.4)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 1 + (((tickAnim - 708) / 7) * (1-(1)));
            yy = 1.075 + (((tickAnim - 708) / 7) * (1-(1.075)));
            zz = 1.575 + (((tickAnim - 708) / 7) * (1-(1.575)));
        }
        else if (tickAnim >= 715 && tickAnim < 728) {
            xx = 1 + (((tickAnim - 715) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 715) / 13) * (1-(1)));
            zz = 1 + (((tickAnim - 715) / 13) * (1.1-(1)));
        }
        else if (tickAnim >= 728 && tickAnim < 739) {
            xx = 1 + (((tickAnim - 728) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 728) / 11) * (1-(1)));
            zz = 1.1 + (((tickAnim - 728) / 11) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 675 && tickAnim < 679) {
            xx = 0 + (((tickAnim - 675) / 4) * (9.25-(0)));
            yy = 0 + (((tickAnim - 675) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 675) / 4) * (0-(0)));
        }
        else if (tickAnim >= 679 && tickAnim < 683) {
            xx = 9.25 + (((tickAnim - 679) / 4) * (31.46-(9.25)));
            yy = 0 + (((tickAnim - 679) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 679) / 4) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 31.46 + (((tickAnim - 683) / 2) * (8.5-(31.46)));
            yy = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 8.5 + (((tickAnim - 685) / 14) * (6.25-(8.5)));
            yy = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 6.25 + (((tickAnim - 699) / 5) * (29.5-(6.25)));
            yy = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else if (tickAnim >= 704 && tickAnim < 708) {
            xx = 29.5 + (((tickAnim - 704) / 4) * (0-(29.5)));
            yy = 0 + (((tickAnim - 704) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 704) / 4) * (0-(0)));
        }
        else if (tickAnim >= 708 && tickAnim < 715) {
            xx = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 708) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 708) / 7) * (0-(0)));
        }
        else if (tickAnim >= 715 && tickAnim < 725) {
            xx = 0 + (((tickAnim - 715) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 715) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 715) / 10) * (0-(0)));
        }
        else if (tickAnim >= 725 && tickAnim < 728) {
            xx = 12.75 + (((tickAnim - 725) / 3) * (0-(12.75)));
            yy = 0 + (((tickAnim - 725) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 675) {
            xx = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 675) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 675) * (0-(0)));
        }
        else if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = -6.25 + (((tickAnim - 683) / 2) * (-2.5-(-6.25)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -2.5 + (((tickAnim - 685) / 14) * (-1.65-(-2.5)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = -1.65 + (((tickAnim - 699) / 5) * (0-(-1.65)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (11-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 11 + (((tickAnim - 683) / 2) * (4.25-(11)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 4.25 + (((tickAnim - 685) / 14) * (3-(4.25)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 3 + (((tickAnim - 699) / 5) * (0-(3)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (6.25-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = 6.25 + (((tickAnim - 683) / 2) * (2.5-(6.25)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = 2.5 + (((tickAnim - 685) / 14) * (1.65-(2.5)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = 1.65 + (((tickAnim - 699) / 5) * (0-(1.65)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 675 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 675) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 675) / 8) * (-11-(0)));
            zz = 0 + (((tickAnim - 675) / 8) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 685) {
            xx = 0 + (((tickAnim - 683) / 2) * (0-(0)));
            yy = -11 + (((tickAnim - 683) / 2) * (-4.75-(-11)));
            zz = 0 + (((tickAnim - 683) / 2) * (0-(0)));
        }
        else if (tickAnim >= 685 && tickAnim < 699) {
            xx = 0 + (((tickAnim - 685) / 14) * (0-(0)));
            yy = -4.75 + (((tickAnim - 685) / 14) * (-3-(-4.75)));
            zz = 0 + (((tickAnim - 685) / 14) * (0-(0)));
        }
        else if (tickAnim >= 699 && tickAnim < 704) {
            xx = 0 + (((tickAnim - 699) / 5) * (0-(0)));
            yy = -3 + (((tickAnim - 699) / 5) * (0-(-3)));
            zz = 0 + (((tickAnim - 699) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 51;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 18) / 6) * (1.5-(1)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 1.5 + (((tickAnim - 24) / 8) * (2-(1.5)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 2 + (((tickAnim - 32) / 9) * (1-(2)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 1 + (((tickAnim - 41) / 11) * (0-(1)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1.5 + (((tickAnim - 18) / 6) * (0-(1.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 1.5 + (((tickAnim - 32) / 9) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 1.5 + (((tickAnim - 41) / 11) * (0-(1.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0.15 + (((tickAnim - 18) / 23) * (0.15-(0.15)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0.15 + (((tickAnim - 41) / 11) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 5.5 + (((tickAnim - 18) / 6) * (6.75-(5.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 6.75 + (((tickAnim - 24) / 8) * (9.75-(6.75)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 9.75 + (((tickAnim - 32) / 9) * (5.5-(9.75)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 5.5 + (((tickAnim - 41) / 11) * (0-(5.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 7.5 + (((tickAnim - 18) / 14) * (0.5-(7.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0.5 + (((tickAnim - 32) / 9) * (7.5-(0.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 7.5 + (((tickAnim - 41) / 11) * (0-(7.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -6.5 + (((tickAnim - 18) / 6) * (-7.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 24) / 8) * (-16.5-(-7.5)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -16.5 + (((tickAnim - 32) / 9) * (-6.5-(-16.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -6.5 + (((tickAnim - 41) / 11) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.55-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = -0.05 + (((tickAnim - 24) / 8) * (-0.44-(-0.05)));
            zz = 0.55 + (((tickAnim - 24) / 8) * (1.25-(0.55)));
        }
        else if (tickAnim >= 32 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 32) / 20) * (0-(0)));
            yy = -0.44 + (((tickAnim - 32) / 20) * (0-(-0.44)));
            zz = 1.25 + (((tickAnim - 32) / 20) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -13.75 + (((tickAnim - 18) / 14) * (-5.5-(-13.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -5.5 + (((tickAnim - 32) / 9) * (-13.75-(-5.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -13.75 + (((tickAnim - 41) / 11) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -5.25 + (((tickAnim - 16) / 8) * (-11.75-(-5.25)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -11.75 + (((tickAnim - 24) / 8) * (-8.25-(-11.75)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -8.25 + (((tickAnim - 32) / 6) * (-5.25-(-8.25)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 52) {
            xx = -5.25 + (((tickAnim - 38) / 14) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 38) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 9) / 9) * (-12.5-(7.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 18) / 6) * (-15.5-(-12.5)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -15.5 + (((tickAnim - 24) / 8) * (-5.25-(-15.5)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -5.25 + (((tickAnim - 32) / 9) * (-12.5-(-5.25)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = -12.5 + (((tickAnim - 41) / 11) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.25 + (((tickAnim - 24) / 8) * (5-(-0.25)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 5 + (((tickAnim - 32) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0.175-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 6) * (-0.225-(0.175)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.925-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 24) / 8) * (0.55-(-0.225)));
            zz = 0.925 + (((tickAnim - 24) / 8) * (0.5-(0.925)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            yy = 0.55 + (((tickAnim - 32) / 9) * (0-(0.55)));
            zz = 0.5 + (((tickAnim - 32) / 9) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 52) {
            xx = 4.5 + (((tickAnim - 24) / 28) * (0-(4.5)));
            yy = 0 + (((tickAnim - 24) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (18.25-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 18.25 + (((tickAnim - 18) / 6) * (0-(18.25)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 24) / 17) * (18.25-(0)));
            yy = 0 + (((tickAnim - 24) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 17) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 52) {
            xx = 18.25 + (((tickAnim - 41) / 11) * (0-(18.25)));
            yy = 0 + (((tickAnim - 41) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 95;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-19.20357-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (11.58153-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.77637-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -19.20357 + (((tickAnim - 40) / 20) * (-12.70357-(-19.20357)));
            yy = 11.58153 + (((tickAnim - 40) / 20) * (11.58153-(11.58153)));
            zz = -1.77637 + (((tickAnim - 40) / 20) * (-1.77637-(-1.77637)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -12.70357 + (((tickAnim - 60) / 35) * (0-(-12.70357)));
            yy = 11.58153 + (((tickAnim - 60) / 35) * (0-(11.58153)));
            zz = -1.77637 + (((tickAnim - 60) / 35) * (0-(-1.77637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (6.3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -1.8 + (((tickAnim - 40) / 20) * (-1.8-(-1.8)));
            zz = 6.3 + (((tickAnim - 40) / 20) * (6.3-(6.3)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -1.8 + (((tickAnim - 60) / 35) * (0-(-1.8)));
            zz = 6.3 + (((tickAnim - 60) / 35) * (0-(6.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.85737-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-11.76524-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.32832-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -10.85737 + (((tickAnim - 40) / 20) * (-12.09824-(-10.85737)));
            yy = -11.76524 + (((tickAnim - 40) / 20) * (-11.14541-(-11.76524)));
            zz = -1.32832 + (((tickAnim - 40) / 20) * (1.14287-(-1.32832)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -12.09824 + (((tickAnim - 60) / 35) * (0-(-12.09824)));
            yy = -11.14541 + (((tickAnim - 60) / 35) * (0-(-11.14541)));
            zz = 1.14287 + (((tickAnim - 60) / 35) * (0-(1.14287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 8.5 + (((tickAnim - 40) / 20) * (6-(8.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 60) / 35) * (0-(6)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0.025 + (((tickAnim - 40) / 20) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0.025 + (((tickAnim - 60) / 35) * (0-(0.025)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 25 + (((tickAnim - 40) / 20) * (3.25-(25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 3.25 + (((tickAnim - 60) / 35) * (0-(3.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.45 + (((tickAnim - 40) / 20) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -0.45 + (((tickAnim - 60) / 35) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.28576-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.22179-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.49046-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -4.28576 + (((tickAnim - 40) / 20) * (15.96424-(-4.28576)));
            yy = 0.22179 + (((tickAnim - 40) / 20) * (0.22179-(0.22179)));
            zz = -2.49046 + (((tickAnim - 40) / 20) * (-2.49046-(-2.49046)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 15.96424 + (((tickAnim - 60) / 35) * (0-(15.96424)));
            yy = 0.22179 + (((tickAnim - 60) / 35) * (0-(0.22179)));
            zz = -2.49046 + (((tickAnim - 60) / 35) * (0-(-2.49046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 40) / 20) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -0.325 + (((tickAnim - 60) / 35) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (12.25-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5.5 + (((tickAnim - 40) / 20) * (-3.17435-(5.5)));
            yy = 12.25 + (((tickAnim - 40) / 20) * (8.02108-(12.25)));
            zz = 0 + (((tickAnim - 40) / 20) * (0.42962-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -3.17435 + (((tickAnim - 60) / 35) * (0-(-3.17435)));
            yy = 8.02108 + (((tickAnim - 60) / 35) * (0-(8.02108)));
            zz = 0.42962 + (((tickAnim - 60) / 35) * (0-(0.42962)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.65-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -0.65 + (((tickAnim - 60) / 35) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -6.25 + (((tickAnim - 40) / 20) * (-4.5-(-6.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -4.5 + (((tickAnim - 60) / 35) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-32.53638-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-8.76777-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-71.58246-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -32.53638 + (((tickAnim - 40) / 20) * (-32.49641-(-32.53638)));
            yy = -8.76777 + (((tickAnim - 40) / 20) * (-22.16783-(-8.76777)));
            zz = -71.58246 + (((tickAnim - 40) / 20) * (-76.4415-(-71.58246)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -32.49641 + (((tickAnim - 60) / 35) * (0-(-32.49641)));
            yy = -22.16783 + (((tickAnim - 60) / 35) * (0-(-22.16783)));
            zz = -76.4415 + (((tickAnim - 60) / 35) * (0-(-76.4415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7 + (((tickAnim - 40) / 20) * (-7-(-7)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -7 + (((tickAnim - 60) / 8) * (23.75-(-7)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 23.75 + (((tickAnim - 68) / 12) * (32.2-(23.75)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 32.2 + (((tickAnim - 80) / 15) * (0-(32.2)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.13395-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-2.80892-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-4.73053-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -8.13395 + (((tickAnim - 40) / 20) * (-12.88395-(-8.13395)));
            yy = -2.80892 + (((tickAnim - 40) / 20) * (-2.80892-(-2.80892)));
            zz = -4.73053 + (((tickAnim - 40) / 20) * (-4.73053-(-4.73053)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -12.88395 + (((tickAnim - 60) / 8) * (13.11605-(-12.88395)));
            yy = -2.80892 + (((tickAnim - 60) / 8) * (-2.80892-(-2.80892)));
            zz = -4.73053 + (((tickAnim - 60) / 8) * (-4.73053-(-4.73053)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 13.11605 + (((tickAnim - 68) / 12) * (-10.09579-(13.11605)));
            yy = -2.80892 + (((tickAnim - 68) / 12) * (-1.53214-(-2.80892)));
            zz = -4.73053 + (((tickAnim - 68) / 12) * (-2.58029-(-4.73053)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -10.09579 + (((tickAnim - 80) / 15) * (0-(-10.09579)));
            yy = -1.53214 + (((tickAnim - 80) / 15) * (0-(-1.53214)));
            zz = -2.58029 + (((tickAnim - 80) / 15) * (0-(-2.58029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.525-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.55 + (((tickAnim - 40) / 20) * (-1.05-(-0.55)));
            zz = 0.525 + (((tickAnim - 40) / 20) * (0.95-(0.525)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = -1.05 + (((tickAnim - 60) / 8) * (-0.35-(-1.05)));
            zz = 0.95 + (((tickAnim - 60) / 8) * (0-(0.95)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = -0.35 + (((tickAnim - 68) / 12) * (-0.475-(-0.35)));
            zz = 0 + (((tickAnim - 68) / 12) * (0.8-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = -0.475 + (((tickAnim - 80) / 15) * (0-(-0.475)));
            zz = 0.8 + (((tickAnim - 80) / 15) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.42976-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.21914-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.62553-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 31.42976 + (((tickAnim - 40) / 20) * (25.42976-(31.42976)));
            yy = 2.21914 + (((tickAnim - 40) / 20) * (2.21914-(2.21914)));
            zz = -3.62553 + (((tickAnim - 40) / 20) * (-3.62553-(-3.62553)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 25.42976 + (((tickAnim - 60) / 8) * (0-(25.42976)));
            yy = 2.21914 + (((tickAnim - 60) / 8) * (0-(2.21914)));
            zz = -3.62553 + (((tickAnim - 60) / 8) * (0-(-3.62553)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -19.5 + (((tickAnim - 80) / 15) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 40) / 28) * (0-(0)));
            yy = -0.175 + (((tickAnim - 40) / 28) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 40) / 28) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 68) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 27) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 17.25 + (((tickAnim - 40) / 20) * (6.5-(17.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 6.5 + (((tickAnim - 60) / 8) * (0-(6.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (13.25-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 13.25 + (((tickAnim - 80) / 15) * (0-(13.25)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.425-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0.425 + (((tickAnim - 40) / 55) * (0-(0.425)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 95) {
            xx = -15.25 + (((tickAnim - 68) / 27) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 68) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 22.75 + (((tickAnim - 40) / 20) * (19-(22.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 19 + (((tickAnim - 60) / 15) * (-20.94-(19)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -20.94 + (((tickAnim - 75) / 5) * (-10-(-20.94)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -10 + (((tickAnim - 80) / 15) * (0-(-10)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (38.52-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 38.52 + (((tickAnim - 18) / 22) * (23.5-(38.52)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 23.5 + (((tickAnim - 40) / 20) * (21.5-(23.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 21.5 + (((tickAnim - 60) / 15) * (19.5-(21.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 19.5 + (((tickAnim - 75) / 5) * (-8.5-(19.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -8.5 + (((tickAnim - 80) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.99-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.48-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.99 + (((tickAnim - 18) / 22) * (0.75-(0.99)));
            zz = -1.48 + (((tickAnim - 18) / 22) * (-0.4-(-1.48)));
        }
        else if (tickAnim >= 40 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 40) / 35) * (0-(0)));
            yy = 0.75 + (((tickAnim - 40) / 35) * (0.75-(0.75)));
            zz = -0.4 + (((tickAnim - 40) / 35) * (-1.125-(-0.4)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 75) / 5) * (0.085-(0.75)));
            zz = -1.125 + (((tickAnim - 75) / 5) * (-0.84-(-1.125)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = 0.085 + (((tickAnim - 80) / 15) * (0-(0.085)));
            zz = -0.84 + (((tickAnim - 80) / 15) * (0-(-0.84)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21.96232-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.13716-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.45457-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -21.96232 + (((tickAnim - 18) / 22) * (7.17311-(-21.96232)));
            yy = 0.13716 + (((tickAnim - 18) / 22) * (0.29926-(0.13716)));
            zz = -0.45457 + (((tickAnim - 18) / 22) * (-0.99179-(-0.45457)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.17311 + (((tickAnim - 40) / 20) * (7.17311-(7.17311)));
            yy = 0.29926 + (((tickAnim - 40) / 20) * (0.29926-(0.29926)));
            zz = -0.99179 + (((tickAnim - 40) / 20) * (-0.99179-(-0.99179)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 7.17311 + (((tickAnim - 60) / 15) * (-32.14422-(7.17311)));
            yy = 0.29926 + (((tickAnim - 60) / 15) * (0.07481-(0.29926)));
            zz = -0.99179 + (((tickAnim - 60) / 15) * (-0.24795-(-0.99179)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -32.14422 + (((tickAnim - 75) / 5) * (17.75-(-32.14422)));
            yy = 0.07481 + (((tickAnim - 75) / 5) * (0-(0.07481)));
            zz = -0.24795 + (((tickAnim - 75) / 5) * (0-(-0.24795)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 17.75 + (((tickAnim - 80) / 15) * (0-(17.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.8-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (-0.875-(0)));
            zz = 0.8 + (((tickAnim - 18) / 22) * (0-(0.8)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.875 + (((tickAnim - 40) / 20) * (-0.875-(-0.875)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.875 + (((tickAnim - 60) / 15) * (-0.215-(-0.875)));
            zz = 0 + (((tickAnim - 60) / 15) * (1.225-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = -0.215 + (((tickAnim - 75) / 5) * (-0.9-(-0.215)));
            zz = 1.225 + (((tickAnim - 75) / 5) * (0-(1.225)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = -0.9 + (((tickAnim - 80) / 15) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (58.24-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 58.24 + (((tickAnim - 18) / 22) * (-32.75-(58.24)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -32.75 + (((tickAnim - 40) / 20) * (-36.25-(-32.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -36.25 + (((tickAnim - 60) / 15) * (60.63-(-36.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 60.63 + (((tickAnim - 75) / 5) * (6.25-(60.63)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 6.25 + (((tickAnim - 80) / 15) * (0-(6.25)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.31-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.075-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 1.31 + (((tickAnim - 18) / 22) * (-0.525-(1.31)));
            zz = 0.075 + (((tickAnim - 18) / 22) * (0-(0.075)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 20) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.525 + (((tickAnim - 60) / 15) * (1.32-(-0.525)));
            zz = 0 + (((tickAnim - 60) / 15) * (-0.175-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 1.32 + (((tickAnim - 75) / 5) * (0-(1.32)));
            zz = -0.175 + (((tickAnim - 75) / 5) * (0-(-0.175)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-19.31-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -19.31 + (((tickAnim - 8) / 10) * (26.75-(-19.31)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 26.75 + (((tickAnim - 18) / 12) * (-13.74-(26.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -13.74 + (((tickAnim - 30) / 6) * (-12.72-(-13.74)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -12.72 + (((tickAnim - 36) / 4) * (0-(-12.72)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (31.5-(0)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 31.5 + (((tickAnim - 75) / 5) * (0-(31.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (17.25-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 7.25 + (((tickAnim - 40) / 20) * (0.91214-(7.25)));
            yy = 17.25 + (((tickAnim - 40) / 20) * (14.26619-(17.25)));
            zz = 0 + (((tickAnim - 40) / 20) * (-0.32342-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0.91214 + (((tickAnim - 60) / 35) * (0-(0.91214)));
            yy = 14.26619 + (((tickAnim - 60) / 35) * (0-(14.26619)));
            zz = -0.32342 + (((tickAnim - 60) / 35) * (0-(-0.32342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (16-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.75 + (((tickAnim - 40) / 20) * (7.75-(2.75)));
            yy = 16 + (((tickAnim - 40) / 20) * (16-(16)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 7.75 + (((tickAnim - 60) / 35) * (0-(7.75)));
            yy = 16 + (((tickAnim - 60) / 35) * (0-(16)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (3.7009-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-2.27758-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.6118-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 3.7009 + (((tickAnim - 17) / 23) * (5.75-(3.7009)));
            yy = -2.27758 + (((tickAnim - 17) / 23) * (25.5-(-2.27758)));
            zz = 0.6118 + (((tickAnim - 17) / 23) * (0-(0.6118)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5.75 + (((tickAnim - 40) / 20) * (14.28625-(5.75)));
            yy = 25.5 + (((tickAnim - 40) / 20) * (28.95557-(25.5)));
            zz = 0 + (((tickAnim - 40) / 20) * (0.62536-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 14.28625 + (((tickAnim - 60) / 35) * (0-(14.28625)));
            yy = 28.95557 + (((tickAnim - 60) / 35) * (0-(28.95557)));
            zz = 0.62536 + (((tickAnim - 60) / 35) * (0-(0.62536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 0.175 + (((tickAnim - 40) / 55) * (0-(0.175)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-24.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 7) / 33) * (0-(0)));
            yy = -24.75 + (((tickAnim - 7) / 33) * (0-(-24.75)));
            zz = 0 + (((tickAnim - 7) / 33) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (14.81387-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (13.4894-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0.54002-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 14.81387 + (((tickAnim - 60) / 35) * (0-(14.81387)));
            yy = 13.4894 + (((tickAnim - 60) / 35) * (0-(13.4894)));
            zz = 0.54002 + (((tickAnim - 60) / 35) * (0-(0.54002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(0);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(0);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-32.53638-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.76777-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (71.58246-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -32.53638 + (((tickAnim - 40) / 20) * (-32.49641-(-32.53638)));
            yy = 8.76777 + (((tickAnim - 40) / 20) * (22.16783-(8.76777)));
            zz = 71.58246 + (((tickAnim - 40) / 20) * (76.4415-(71.58246)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -32.49641 + (((tickAnim - 60) / 35) * (0-(-32.49641)));
            yy = 22.16783 + (((tickAnim - 60) / 35) * (0-(22.16783)));
            zz = 76.4415 + (((tickAnim - 60) / 35) * (0-(76.4415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 95) {
            xx = 32.5 + (((tickAnim - 40) / 55) * (0-(32.5)));
            yy = 0 + (((tickAnim - 40) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (10.25-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 95) {
            xx = 10.25 + (((tickAnim - 73) / 22) * (0-(10.25)));
            yy = 0 + (((tickAnim - 73) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0.475-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 73) / 22) * (0-(0)));
            yy = -0.375 + (((tickAnim - 73) / 22) * (0-(-0.375)));
            zz = 0.475 + (((tickAnim - 73) / 22) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 20.5 + (((tickAnim - 40) / 20) * (33.5-(20.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 33.5 + (((tickAnim - 60) / 8) * (0-(33.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (35.5-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 35.5 + (((tickAnim - 80) / 15) * (0-(35.5)));
            yy = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-100))*0.4);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -20.84477 + (((tickAnim - 0) / 16) * (24-(-20.84477)));
            yy = -4.73578 + (((tickAnim - 0) / 16) * (0-(-4.73578)));
            zz = -1.43358 + (((tickAnim - 0) / 16) * (0-(-1.43358)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 16) / 12) * (-27.21916-(24)));
            yy = 0 + (((tickAnim - 16) / 12) * (-3.94565-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (-2.9859-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -27.21916 + (((tickAnim - 28) / 5) * (-20.84477-(-27.21916)));
            yy = -3.94565 + (((tickAnim - 28) / 5) * (-4.73578-(-3.94565)));
            zz = -2.9859 + (((tickAnim - 28) / 5) * (-1.43358-(-2.9859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -4.75 + (((tickAnim - 0) / 16) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (20.5-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 20.5 + (((tickAnim - 18) / 3) * (37.23-(20.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 37.23 + (((tickAnim - 21) / 12) * (-4.75-(37.23)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 16) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.725-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 18) / 3) * (0.84-(0.575)));
            zz = -0.725 + (((tickAnim - 18) / 3) * (-1.17-(-0.725)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            yy = 0.84 + (((tickAnim - 21) / 12) * (-0.5-(0.84)));
            zz = -1.17 + (((tickAnim - 21) / 12) * (0-(-1.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 17.75 + (((tickAnim - 0) / 16) * (6.5-(17.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 6.5 + (((tickAnim - 16) / 3) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 4.25 + (((tickAnim - 19) / 4) * (-40.87-(4.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -40.87 + (((tickAnim - 23) / 2) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -40.87 + (((tickAnim - 25) / 3) * (-39-(-40.87)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -39 + (((tickAnim - 28) / 5) * (17.75-(-39)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 16) * (-0.65-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.65 + (((tickAnim - 16) / 7) * (-1.065-(-0.65)));
            zz = 0 + (((tickAnim - 16) / 7) * (0.475-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -1.065 + (((tickAnim - 23) / 2) * (-1.065-(-1.065)));
            zz = 0.475 + (((tickAnim - 23) / 2) * (0.475-(0.475)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = -1.065 + (((tickAnim - 25) / 8) * (-1.225-(-1.065)));
            zz = 0.475 + (((tickAnim - 25) / 8) * (0-(0.475)));
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
            xx = 8.25 + (((tickAnim - 0) / 3) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.75 + (((tickAnim - 3) / 5) * (-9.75-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -9.75 + (((tickAnim - 8) / 8) * (20-(-9.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 16) / 3) * (65.99-(20)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 65.99 + (((tickAnim - 19) / 3) * (79.25-(65.99)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 79.25 + (((tickAnim - 22) / 1) * (74-(79.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 74 + (((tickAnim - 23) / 2) * (74-(74)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 74 + (((tickAnim - 25) / 3) * (70.82-(74)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 70.82 + (((tickAnim - 28) / 5) * (8.25-(70.82)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (1.045-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.23-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.045 + (((tickAnim - 3) / 5) * (1-(1.045)));
            zz = -0.23 + (((tickAnim - 3) / 5) * (0-(-0.23)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 4) * (1.605-(1)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.605 + (((tickAnim - 12) / 4) * (1.25-(1.605)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 16) / 3) * (0.73-(1.25)));
            zz = 0 + (((tickAnim - 16) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0.175-(0)));
            yy = 0.73 + (((tickAnim - 19) / 4) * (0.49-(0.73)));
            zz = 0.1 + (((tickAnim - 19) / 4) * (-0.01-(0.1)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.175 + (((tickAnim - 23) / 2) * (0.175-(0.175)));
            yy = 0.49 + (((tickAnim - 23) / 2) * (0.49-(0.49)));
            zz = -0.01 + (((tickAnim - 23) / 2) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.175 + (((tickAnim - 25) / 3) * (0.175-(0.175)));
            yy = 0.49 + (((tickAnim - 25) / 3) * (0.49-(0.49)));
            zz = -0.01 + (((tickAnim - 25) / 3) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.175 + (((tickAnim - 28) / 5) * (0-(0.175)));
            yy = 0.49 + (((tickAnim - 28) / 5) * (0.25-(0.49)));
            zz = -0.01 + (((tickAnim - 28) / 5) * (0-(-0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (-51.25-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -51.25 + (((tickAnim - 16) / 3) * (0-(-51.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (10.05-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 10.05 + (((tickAnim - 22) / 2) * (26.75-(10.05)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 26.75 + (((tickAnim - 24) / 2) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 26.75 + (((tickAnim - 26) / 7) * (0-(26.75)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (1-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 1 + (((tickAnim - 22) / 11) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-50))*1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-90))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+150))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+150))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.175);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-170))*3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+150))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-300))*5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*5), leftFingers.rotateAngleY + (float) Math.toRadians(0), leftFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftThumb, leftThumb.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*5), leftThumb.rotateAngleY + (float) Math.toRadians(0), leftThumb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-200))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+150))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-300))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-400))*2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-520))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 24 + (((tickAnim - 0) / 11) * (-20.9055-(24)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.49762-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (4.33287-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -20.9055 + (((tickAnim - 11) / 5) * (-20.84477-(-20.9055)));
            yy = 2.49762 + (((tickAnim - 11) / 5) * (4.73578-(2.49762)));
            zz = 4.33287 + (((tickAnim - 11) / 5) * (1.43358-(4.33287)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = -20.84477 + (((tickAnim - 16) / 17) * (24-(-20.84477)));
            yy = 4.73578 + (((tickAnim - 16) / 17) * (0-(4.73578)));
            zz = 1.43358 + (((tickAnim - 16) / 17) * (0-(1.43358)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 20.5 + (((tickAnim - 3) / 3) * (37.23-(20.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 37.23 + (((tickAnim - 6) / 10) * (-4.75-(37.23)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = -4.75 + (((tickAnim - 16) / 17) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.725-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 3) * (0.84-(0.575)));
            zz = -0.725 + (((tickAnim - 3) / 3) * (-1.17-(-0.725)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 0.84 + (((tickAnim - 6) / 10) * (-0.5-(0.84)));
            zz = -1.17 + (((tickAnim - 6) / 10) * (0-(-1.17)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -0.5 + (((tickAnim - 16) / 17) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
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
            xx = 6.5 + (((tickAnim - 0) / 3) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.25 + (((tickAnim - 3) / 5) * (-40.87-(4.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -40.87 + (((tickAnim - 8) / 1) * (-40.87-(-40.87)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -40.87 + (((tickAnim - 9) / 3) * (-39-(-40.87)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -39 + (((tickAnim - 12) / 4) * (17.75-(-39)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 17.75 + (((tickAnim - 16) / 17) * (6.5-(17.75)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.65 + (((tickAnim - 0) / 8) * (-0.24-(-0.65)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.375-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.24 + (((tickAnim - 8) / 1) * (-0.24-(-0.24)));
            zz = 1.375 + (((tickAnim - 8) / 1) * (1.375-(1.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.24 + (((tickAnim - 9) / 3) * (0.185-(-0.24)));
            zz = 1.375 + (((tickAnim - 9) / 3) * (1.375-(1.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.185 + (((tickAnim - 12) / 4) * (-1.225-(0.185)));
            zz = 1.375 + (((tickAnim - 12) / 4) * (0-(1.375)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = -1.225 + (((tickAnim - 16) / 17) * (-0.65-(-1.225)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
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
            xx = 20 + (((tickAnim - 0) / 3) * (65.99-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 65.99 + (((tickAnim - 3) / 2) * (79.25-(65.99)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 79.25 + (((tickAnim - 5) / 3) * (74-(79.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 74 + (((tickAnim - 8) / 1) * (74-(74)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 74 + (((tickAnim - 9) / 3) * (70.82-(74)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 70.82 + (((tickAnim - 12) / 4) * (8.25-(70.82)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 8.25 + (((tickAnim - 16) / 3) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -1.75 + (((tickAnim - 19) / 4) * (-9.75-(-1.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 23) / 10) * (20-(-9.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (0.73-(0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 3) / 2) * (0.61-(0.73)));
            zz = 0.2 + (((tickAnim - 3) / 2) * (0.58-(0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-0.2-(0)));
            yy = 0.61 + (((tickAnim - 5) / 3) * (0.49-(0.61)));
            zz = 0.58 + (((tickAnim - 5) / 3) * (0.465-(0.58)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.2 + (((tickAnim - 8) / 1) * (-0.2-(-0.2)));
            yy = 0.49 + (((tickAnim - 8) / 1) * (0.49-(0.49)));
            zz = 0.465 + (((tickAnim - 8) / 1) * (0.465-(0.465)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.2 + (((tickAnim - 9) / 3) * (-0.2-(-0.2)));
            yy = 0.49 + (((tickAnim - 9) / 3) * (0.49-(0.49)));
            zz = 0.465 + (((tickAnim - 9) / 3) * (-0.035-(0.465)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -0.2 + (((tickAnim - 12) / 4) * (0-(-0.2)));
            yy = 0.49 + (((tickAnim - 12) / 4) * (-0.3-(0.49)));
            zz = -0.035 + (((tickAnim - 12) / 4) * (-0.425-(-0.035)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 16) / 4) * (0.82-(-0.3)));
            zz = -0.425 + (((tickAnim - 16) / 4) * (-0.23-(-0.425)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.82 + (((tickAnim - 20) / 3) * (1-(0.82)));
            zz = -0.23 + (((tickAnim - 20) / 3) * (0-(-0.23)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 5) * (1.605-(1)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 1.605 + (((tickAnim - 28) / 3) * (1.645-(1.605)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 1.645 + (((tickAnim - 31) / 2) * (0.55-(1.645)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -51.25 + (((tickAnim - 0) / 3) * (-69.15-(-51.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -69.15 + (((tickAnim - 3) / 2) * (10.05-(-69.15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.05 + (((tickAnim - 5) / 3) * (26.75-(10.05)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 26.75 + (((tickAnim - 8) / 2) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 26.75 + (((tickAnim - 10) / 6) * (0-(26.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (-51.25-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 1 + (((tickAnim - 5) / 11) * (0-(1)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-200))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-200))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+90))*1.5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-170))*3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+150))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-300))*5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*5), rightFingers.rotateAngleY + (float) Math.toRadians(0), rightFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightThumb, rightThumb.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-350))*5), rightThumb.rotateAngleY + (float) Math.toRadians(0), rightThumb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5-250))*1), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(0);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(0.075);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(0);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIrritator entity = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*6), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*2);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -21.25 + (((tickAnim - 0) / 10) * (28.5-(-21.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 28.5 + (((tickAnim - 10) / 8) * (-30.7459-(28.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (-2.19543-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-3.34448-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30.7459 + (((tickAnim - 18) / 2) * (-21.25-(-30.7459)));
            yy = -2.19543 + (((tickAnim - 18) / 2) * (0-(-2.19543)));
            zz = -3.34448 + (((tickAnim - 18) / 2) * (0-(-3.34448)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.03471 + (((tickAnim - 0) / 10) * (28.5-(-6.03471)));
            yy = 0.55251 + (((tickAnim - 0) / 10) * (0-(0.55251)));
            zz = -0.42889 + (((tickAnim - 0) / 10) * (0-(-0.42889)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 10) / 3) * (39-(28.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 39 + (((tickAnim - 13) / 3) * (26.75-(39)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 26.75 + (((tickAnim - 16) / 4) * (-6.03471-(26.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.55251-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.42889-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 10) * (0.7-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.625-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 10) / 6) * (0.73-(0.7)));
            zz = -0.625 + (((tickAnim - 10) / 6) * (-1.11-(-0.625)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.73 + (((tickAnim - 16) / 4) * (-0.725-(0.73)));
            zz = -1.11 + (((tickAnim - 16) / 4) * (0-(-1.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.5 + (((tickAnim - 0) / 2) * (19.08-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 19.08 + (((tickAnim - 2) / 8) * (0-(19.08)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-35.31-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -35.31 + (((tickAnim - 15) / 3) * (-35.31-(-35.31)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -35.31 + (((tickAnim - 18) / 2) * (-0.5-(-35.31)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.05 + (((tickAnim - 0) / 2) * (-1.48-(-1.05)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.48 + (((tickAnim - 2) / 1) * (-0.6-(-1.48)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 7) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.525-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 15) / 3) * (-0.05-(-0.05)));
            zz = 1.525 + (((tickAnim - 15) / 3) * (1.525-(1.525)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 18) / 2) * (-1.05-(-0.05)));
            zz = 1.525 + (((tickAnim - 18) / 2) * (0-(1.525)));
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
            xx = 50.25 + (((tickAnim - 0) / 2) * (-7.4032-(50.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.05683-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (3.59821-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -7.4032 + (((tickAnim - 2) / 1) * (-21.75-(-7.4032)));
            yy = -1.05683 + (((tickAnim - 2) / 1) * (0-(-1.05683)));
            zz = 3.59821 + (((tickAnim - 2) / 1) * (0-(3.59821)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -21.75 + (((tickAnim - 3) / 3) * (23.41-(-21.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 23.41 + (((tickAnim - 6) / 4) * (55.25-(23.41)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 55.25 + (((tickAnim - 10) / 5) * (75.38-(55.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 75.38 + (((tickAnim - 15) / 3) * (75.38-(75.38)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 75.38 + (((tickAnim - 18) / 2) * (50.25-(75.38)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.075 + (((tickAnim - 0) / 2) * (0-(0.075)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.275-(0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.275 + (((tickAnim - 2) / 4) * (0.825-(0.275)));
            zz = 0 + (((tickAnim - 2) / 4) * (-0.28-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 6) / 2) * (1.865-(0.825)));
            zz = -0.28 + (((tickAnim - 6) / 2) * (-0.17-(-0.28)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.865 + (((tickAnim - 8) / 2) * (1-(1.865)));
            zz = -0.17 + (((tickAnim - 8) / 2) * (0-(-0.17)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0.075-(0)));
            yy = 1 + (((tickAnim - 10) / 5) * (0.35-(1)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.075 + (((tickAnim - 15) / 3) * (0.075-(0.075)));
            yy = 0.35 + (((tickAnim - 15) / 3) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0.075 + (((tickAnim - 18) / 2) * (0.075-(0.075)));
            yy = 0.35 + (((tickAnim - 18) / 2) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 9.5 + (((tickAnim - 0) / 3) * (0-(9.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-56.28-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -56.28 + (((tickAnim - 6) / 4) * (31.25-(-56.28)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 31.25 + (((tickAnim - 10) / 5) * (32.13-(31.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 32.13 + (((tickAnim - 15) / 5) * (9.5-(32.13)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 6) / 4) * (0-(-0.25)));
            zz = 0.45 + (((tickAnim - 6) / 4) * (0-(0.45)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*6), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(0);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(0);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(-0.525);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-6));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-140))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.425);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-280))*6), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-420))*4), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.62422 + (((tickAnim - 0) / 8) * (-30.79398-(28.62422)));
            yy = 5.39086 + (((tickAnim - 0) / 8) * (1.09818-(5.39086)));
            zz = 2.63802 + (((tickAnim - 0) / 8) * (1.67163-(2.63802)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30.79398 + (((tickAnim - 8) / 2) * (-21.25-(-30.79398)));
            yy = 1.09818 + (((tickAnim - 8) / 2) * (0-(1.09818)));
            zz = 1.67163 + (((tickAnim - 8) / 2) * (0-(1.67163)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.25 + (((tickAnim - 10) / 10) * (28.62422-(-21.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (5.39086-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (2.63802-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.5 + (((tickAnim - 0) / 3) * (48-(28.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 48 + (((tickAnim - 3) / 3) * (26.75-(48)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 26.75 + (((tickAnim - 6) / 4) * (-6.03471-(26.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.55251-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.42889-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.03471 + (((tickAnim - 10) / 10) * (28.5-(-6.03471)));
            yy = 0.55251 + (((tickAnim - 10) / 10) * (0-(0.55251)));
            zz = -0.42889 + (((tickAnim - 10) / 10) * (0-(-0.42889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 6) * (0.73-(0.7)));
            zz = -0.625 + (((tickAnim - 0) / 6) * (-1.11-(-0.625)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.73 + (((tickAnim - 6) / 4) * (-0.725-(0.73)));
            zz = -1.11 + (((tickAnim - 6) / 4) * (0-(-1.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 10) / 10) * (0.7-(-0.725)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.625-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-51.56-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.56 + (((tickAnim - 5) / 3) * (-35.31-(-51.56)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35.31 + (((tickAnim - 8) / 2) * (-0.5-(-35.31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.5 + (((tickAnim - 10) / 2) * (13.08-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 13.08 + (((tickAnim - 12) / 8) * (0-(13.08)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.525-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 5) / 3) * (-0.05-(0.7)));
            zz = 1.525 + (((tickAnim - 5) / 3) * (1.525-(1.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 2) * (-1.05-(-0.05)));
            zz = 1.525 + (((tickAnim - 8) / 2) * (0-(1.525)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -1.05 + (((tickAnim - 10) / 3) * (-0.9-(-1.05)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.9 + (((tickAnim - 13) / 7) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            xx = 55.25 + (((tickAnim - 0) / 5) * (75.38-(55.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 75.38 + (((tickAnim - 5) / 3) * (75.38-(75.38)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 75.38 + (((tickAnim - 8) / 2) * (44.25-(75.38)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 44.25 + (((tickAnim - 10) / 2) * (-1.91433-(44.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.47218-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-3.44932-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -1.91433 + (((tickAnim - 12) / 1) * (-17.83238-(-1.91433)));
            yy = 1.47218 + (((tickAnim - 12) / 1) * (0.18304-(1.47218)));
            zz = -3.44932 + (((tickAnim - 12) / 1) * (-2.09717-(-3.44932)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -17.83238 + (((tickAnim - 13) / 3) * (36.41-(-17.83238)));
            yy = 0.18304 + (((tickAnim - 13) / 3) * (0-(0.18304)));
            zz = -2.09717 + (((tickAnim - 13) / 3) * (0-(-2.09717)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 36.41 + (((tickAnim - 16) / 4) * (55.25-(36.41)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            yy = 0.35 + (((tickAnim - 0) / 5) * (0.575-(0.35)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.075-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.225 + (((tickAnim - 5) / 3) * (-0.225-(-0.225)));
            yy = 0.575 + (((tickAnim - 5) / 3) * (0.575-(0.575)));
            zz = -0.075 + (((tickAnim - 5) / 3) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.225 + (((tickAnim - 8) / 2) * (-0.225-(-0.225)));
            yy = 0.575 + (((tickAnim - 8) / 2) * (0.575-(0.575)));
            zz = -0.075 + (((tickAnim - 8) / 2) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.225 + (((tickAnim - 10) / 2) * (0-(-0.225)));
            yy = 0.575 + (((tickAnim - 10) / 2) * (-0.475-(0.575)));
            zz = -0.075 + (((tickAnim - 10) / 2) * (0-(-0.075)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 12) / 4) * (1.65-(-0.475)));
            zz = 0 + (((tickAnim - 12) / 4) * (-0.28-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.65 + (((tickAnim - 16) / 4) * (0.35-(1.65)));
            zz = -0.28 + (((tickAnim - 16) / 4) * (0-(-0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 31.25 + (((tickAnim - 0) / 5) * (32.13-(31.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 32.13 + (((tickAnim - 5) / 8) * (0-(32.13)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-56.28-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -56.28 + (((tickAnim - 16) / 4) * (31.25-(-56.28)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*9), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-280))*6), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*4));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(16.25), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(-0.5);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraIrritator ee = (EntityPrehistoricFloraIrritator) entitylivingbaseIn;

//        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Ambient
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animFishing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIrritator e = (EntityPrehistoricFloraIrritator) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
