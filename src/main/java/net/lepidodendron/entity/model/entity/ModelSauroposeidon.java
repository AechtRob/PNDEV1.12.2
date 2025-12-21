package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSauroposeidon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSauroposeidon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;

    private ModelAnimator animator;

    public ModelSauroposeidon() {
        this.textureWidth = 416;
        this.textureHeight = 416;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -33.5F, 33.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 25.6F, -17.4F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5498F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 280, 154, -15.0F, -45.0F, -19.0F, 30, 21, 29, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 25.5F, -16.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 148, 87, -18.0F, -26.0F, -7.0F, 36, 27, 40, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(11.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.3491F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 216, 302, -3.0F, -8.0F, -7.5F, 15, 40, 16, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 33.0F, 1.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4363F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 334, 341, -1.0F, -4.0F, -6.0F, 12, 26, 12, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0873F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 346, 316, -2.0F, 0.0F, -7.0F, 14, 6, 14, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(5.0F, 0.0F, -7.0F);
        this.leftFoot.addChild(leftToes);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.leftToes.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 373, -5.0F, 0.0F, -3.0F, 10, 6, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-11.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3491F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 216, 302, -12.0F, -8.0F, -7.5F, 15, 40, 16, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 33.0F, 1.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4363F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 334, 341, -11.0F, -4.0F, -6.0F, 12, 26, 12, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0873F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 346, 316, -12.0F, 0.0F, -7.0F, 14, 6, 14, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-5.0F, 0.0F, -7.0F);
        this.rightFoot.addChild(rightToes);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.rightToes.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 373, -5.0F, 0.0F, -3.0F, 10, 6, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.5F, 12.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 300, 108, -9.5F, -8.0F, -5.0F, 19, 21, 24, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 18.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 278, 302, -6.0F, -7.0F, -1.0F, 12, 17, 22, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.5F, 20.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 94, 339, -3.5F, -5.25F, -1.0F, 7, 12, 22, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.75F, 20.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 152, 339, -2.5F, -3.0F, -1.0F, 5, 8, 23, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 21.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 278, 341, -2.0F, -3.0F, -1.5F, 4, 6, 24, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.5F, 22.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 346, 287, -1.5F, -2.25F, -1.5F, 3, 4, 25, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -1.25F, 23.5F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1309F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 351, -1.0F, -0.75F, -1.0F, 2, 2, 24, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.5F, -11.25F);
        this.hips.addChild(body);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 17.0F, -32.75F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 160, -20.0F, -45.0F, -19.0F, 40, 28, 32, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 34.0F, -21.75F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -25.0F, -44.0F, -26.0F, 50, 46, 41, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -17.0F, -35.0F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 12.0F, -32.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 285, -15.0F, -46.0F, 1.0F, 30, 30, 24, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 23.0F, -35.15F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6581F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 108, 236, -17.0F, -23.0F, -26.0F, 34, 23, 26, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 43.2F, -11.65F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 87, -18.0F, -35.0F, -31.0F, 37, 36, 37, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(16.5F, 24.0F, -20.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.0436F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 330, 204, -6.5F, -4.0F, -5.0F, 13, 36, 13, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 31.5F, 2.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1745F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 208, 358, -5.5F, -4.0F, -6.0F, 11, 22, 11, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 18.0F, -1.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 280, 204, -6.5F, -4.0F, -3.5F, 13, 15, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-6.5F, 7.0F, -0.5F);
        this.leftHand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7418F, -0.4363F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 94, 310, -5.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-16.5F, 24.0F, -20.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0436F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 330, 204, -6.5F, -4.0F, -5.0F, 13, 36, 13, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 31.5F, 2.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1745F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 208, 358, -5.5F, -4.0F, -6.0F, 11, 22, 11, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 18.0F, -1.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 280, 204, -6.5F, -4.0F, -3.5F, 13, 15, 8, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(6.5F, 7.0F, -0.5F);
        this.rightHand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.7418F, 0.4363F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 310, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -9.0F, -13.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.7854F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 148, 154, -11.0F, -16.0F, -36.0F, 22, 38, 44, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 4.5F, -34.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 182, 0, -9.5F, -20.0F, -37.0F, 19, 35, 39, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5F, -36.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 220, -8.0F, -20.0F, -35.0F, 16, 32, 38, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -2.0F, -34.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1745F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 228, 236, -7.0F, -17.5F, -34.0F, 14, 29, 37, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -3.0F, -33.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, -0.0436F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 0, 290, -6.0F, -14.0F, -32.0F, 12, 26, 35, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -4.0F, -31.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.0436F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 298, 0, -5.5F, -9.5F, -32.0F, 11, 22, 34, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -2.0F, -31.0F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.2007F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 300, 56, -5.0F, -7.0F, -31.0F, 10, 19, 33, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, 1.0F, -30.0F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.6109F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 330, 253, -4.5F, -6.5F, -18.25F, 9, 11, 23, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.0F, -16.0F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -4.5282F, -9.9093F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 94, 304, -1.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -2.5999F, -12.2075F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 94, 290, -1.0F, 0.0F, 0.0F, 4, 5, 3, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.3887F, -12.4689F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.4835F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 298, -1.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 3.0498F, -13.8542F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.0908F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 312, 227, -1.0F, 0.0F, 0.0F, 4, 3, 5, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 3.0498F, -13.8542F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5323F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 284, 371, -2.5F, 0.0F, -0.05F, 7, 3, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 5.2616F, -15.8809F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.829F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 366, 336, -2.5F, 0.0F, 0.0F, 7, 2, 3, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 6.8529F, -12.6456F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 108, 234, -2.5F, -0.1F, -0.8F, 7, 1, 1, -0.02F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 377, -2.5F, -0.1F, -3.0F, 7, 1, 3, -0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 346, 336, -2.5F, -2.0F, -3.0F, 7, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 7.1792F, -15.1242F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 377, -2.5F, -0.5F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 6.8529F, -12.6456F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3142F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 116, 373, -3.5F, -0.05F, 0.0F, 9, 1, 6, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 7.7627F, -12.1611F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3316F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 254, 83, -3.5F, -1.55F, 0.15F, 8, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 6.8529F, -12.6456F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2443F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 220, 74, -3.5F, -4.0F, 0.0F, 9, 4, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(5.0F, -4.5F, -7.25F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.2217F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 252, 358, -8.5F, 0.0F, -5.0F, 7, 4, 5, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0F, -2.5F, 5.75F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 351, -4.5F, -2.7F, -13.0F, 11, 10, 8, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -1.25F, -4.2F);
        this.head.addChild(eyes);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -1.25F, 9.95F);
        this.eyes.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 108, 231, -4.5F, 0.3F, -11.0F, 11, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.5F, -0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0785F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-18.0F, 3.3326F, -11.4621F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3927F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 280, 227, 13.5F, -0.95F, 0.15F, 9, 1, 7, -0.03F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-26.0F, 3.6568F, -14.4855F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4625F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 124, 234, 22.5F, 0.1F, 2.15F, 7, 1, 1, -0.03F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 252, 367, 22.5F, 0.1F, -0.05F, 7, 1, 3, -0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.989F, -8.6026F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 276, 83, -3.0F, 0.0F, -3.0F, 8, 1, 3, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 182, 378, -2.0F, 0.0F, -6.0F, 6, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 5.5F, -9.5801F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.48F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 312, 371, -2.5F, -2.85F, -3.55F, 7, 3, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, 0.8857F, -6.9563F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4276F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 182, 370, -3.5F, -4.65F, -0.95F, 9, 5, 3, -0.04F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 5.6471F, -9.5211F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4887F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 108, 220, -3.5F, -3.0F, -0.45F, 9, 3, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0F, 3.0F, -5.25F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6545F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 252, 371, -3.5F, -3.5F, -4.95F, 9, 3, 7, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, -1.1597F, -6.1201F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4363F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 254, 74, -4.5F, -2.95F, 0.0F, 11, 3, 6, -0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0F, 0.75F, -2.5F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 182, 74, -4.5F, -1.7F, -3.7F, 11, 4, 8, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 5.35F, -9.0F);
        this.jaw.addChild(throat1);
        this.throat1.cubeList.add(new ModelBox(throat1, 152, 370, -3.0F, -3.95F, 0.0F, 6, 4, 9, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -3.95F, 7.5F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.3491F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 52, 369, -3.0F, -2.0F, -1.5F, 6, 6, 12, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
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
        this.hips.offsetY = 3.0F;
        this.hips.offsetX = -0.25F;
        this.hips.rotateAngleY = (float)Math.toRadians(230);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.3F;
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
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSauroposeidon camara = (EntityPrehistoricFloraSauroposeidon) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = camara.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck3.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck3.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.01F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.04F * 2, -0.01F, 0.5F, f2, 0.8F);
                        this.walk(jaw, (float) ( 0.04), 0.1F, true, 0, 0, f2, 1);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
                }
            } else {
                this.chainFlap(Neck, 0.05F, 0.01F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.04F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.walk(jaw, (float) ( 0.04), 0.1F, true, -0.5f, -0.1f, f2, 1);
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSauroposeidon ee = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 305;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 40) / 15) * (1.5-(1)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 93) {
            xx = 1.5 + (((tickAnim - 55) / 38) * (-3.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-120))*10-(1.5)));
            yy = 0 + (((tickAnim - 55) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 38) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -3.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-120))*10 + (((tickAnim - 93) / 22) * (4.8-(-3.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-120))*10)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 4.8 + (((tickAnim - 115) / 45) * (1-(4.8)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 1 + (((tickAnim - 160) / 15) * (1.5-(1)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 213) {
            xx = 1.5 + (((tickAnim - 175) / 38) * (8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65-(1.5)));
            yy = 0 + (((tickAnim - 175) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 38) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = 8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65 + (((tickAnim - 213) / 22) * (3.5-(8.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 3.5 + (((tickAnim - 235) / 45) * (1-(3.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = 1 + (((tickAnim - 280) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -1 + (((tickAnim - 40) / 15) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 93) {
            xx = -1.75 + (((tickAnim - 55) / 38) * (1-(-1.75)));
            yy = 0 + (((tickAnim - 55) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 38) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 93) / 22) * (-0.25-(1)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = -0.25 + (((tickAnim - 115) / 45) * (-1-(-0.25)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -1 + (((tickAnim - 160) / 15) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 213) {
            xx = -1.75 + (((tickAnim - 175) / 38) * (1-(-1.75)));
            yy = 0 + (((tickAnim - 175) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 38) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = 1 + (((tickAnim - 213) / 22) * (-0.25-(1)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -0.25 + (((tickAnim - 235) / 45) * (-1-(-0.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = -1 + (((tickAnim - 280) / 25) * (0-(-1)));
            yy = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -1.25 + (((tickAnim - 40) / 15) * (-2-(-1.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 93) {
            xx = -2 + (((tickAnim - 55) / 38) * (2.5-(-2)));
            yy = 0 + (((tickAnim - 55) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 38) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = 2.5 + (((tickAnim - 93) / 22) * (6.5-(2.5)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 6.5 + (((tickAnim - 115) / 45) * (-1.25-(6.5)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -1.25 + (((tickAnim - 160) / 15) * (-2-(-1.25)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 213) {
            xx = -2 + (((tickAnim - 175) / 38) * (2.5-(-2)));
            yy = 0 + (((tickAnim - 175) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 38) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = 2.5 + (((tickAnim - 213) / 22) * (6.5-(2.5)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 6.5 + (((tickAnim - 235) / 45) * (-1.25-(6.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = -1.25 + (((tickAnim - 280) / 25) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -2.5 + (((tickAnim - 40) / 15) * (-4-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 93) {
            xx = -4 + (((tickAnim - 55) / 38) * (-6.5-(-4)));
            yy = 0 + (((tickAnim - 55) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 38) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -6.5 + (((tickAnim - 93) / 22) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 115) / 45) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -2.5 + (((tickAnim - 160) / 15) * (-4-(-2.5)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 213) {
            xx = -4 + (((tickAnim - 175) / 38) * (-6.5-(-4)));
            yy = 0 + (((tickAnim - 175) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 38) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = -6.5 + (((tickAnim - 213) / 22) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 305) {
            xx = -2.5 + (((tickAnim - 280) / 25) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 280) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -1 + (((tickAnim - 40) / 15) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -1.75 + (((tickAnim - 55) / 17) * (-11.83-(-1.75)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = -11.83 + (((tickAnim - 72) / 21) * (-4.25-(-11.83)));
            yy = 0 + (((tickAnim - 72) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 21) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -4.25 + (((tickAnim - 93) / 22) * (1.5-(-4.25)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 1.5 + (((tickAnim - 115) / 45) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -1 + (((tickAnim - 160) / 15) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 192) {
            xx = -1.75 + (((tickAnim - 175) / 17) * (-10.58-(-1.75)));
            yy = 0 + (((tickAnim - 175) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 17) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 213) {
            xx = -10.58 + (((tickAnim - 192) / 21) * (-4.25-(-10.58)));
            yy = 0 + (((tickAnim - 192) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 21) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = -4.25 + (((tickAnim - 213) / 22) * (1.5-(-4.25)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 1.5 + (((tickAnim - 235) / 45) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = -1 + (((tickAnim - 280) / 8) * (-2.42-(-1)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = -2.42 + (((tickAnim - 288) / 17) * (0-(-2.42)));
            yy = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -2 + (((tickAnim - 40) / 15) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = -3.25 + (((tickAnim - 55) / 17) * (-1.99-(-3.25)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = -1.99 + (((tickAnim - 72) / 6) * (-11.37-(-1.99)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -11.37 + (((tickAnim - 78) / 15) * (-10-(-11.37)));
            yy = 0 + (((tickAnim - 78) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 15) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 115) {
            xx = -10 + (((tickAnim - 93) / 22) * (1.25-(-10)));
            yy = 0 + (((tickAnim - 93) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 22) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 1.25 + (((tickAnim - 115) / 45) * (-2-(1.25)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = -2 + (((tickAnim - 160) / 15) * (-3.25-(-2)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 192) {
            xx = -3.25 + (((tickAnim - 175) / 17) * (-7.99-(-3.25)));
            yy = 0 + (((tickAnim - 175) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 17) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = -7.99 + (((tickAnim - 192) / 7) * (-2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65-(-7.99)));
            yy = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 7) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 213) {
            xx = -2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65 + (((tickAnim - 199) / 14) * (-10-(-2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-6.65)));
            yy = 0 + (((tickAnim - 199) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 14) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 235) {
            xx = -10 + (((tickAnim - 213) / 22) * (1.25-(-10)));
            yy = 0 + (((tickAnim - 213) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 22) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 1.25 + (((tickAnim - 235) / 45) * (-2-(1.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = -2 + (((tickAnim - 280) / 8) * (-3.6-(-2)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = -3.6 + (((tickAnim - 288) / 17) * (0-(-3.6)));
            yy = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 9.5 + (((tickAnim - 40) / 15) * (20.75-(9.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 20.75 + (((tickAnim - 55) / 17) * (11.96-(20.75)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 78) {
            xx = 11.96 + (((tickAnim - 72) / 6) * (-1.61-(11.96)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -1.61 + (((tickAnim - 78) / 15) * (-5.5-(-1.61)));
            yy = 0 + (((tickAnim - 78) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 15) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 103) {
            xx = -5.5 + (((tickAnim - 93) / 10) * (-10.85-(-5.5)));
            yy = 0 + (((tickAnim - 93) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 10) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = -10.85 + (((tickAnim - 103) / 12) * (13.5-(-10.85)));
            yy = 0 + (((tickAnim - 103) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 12) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 160) {
            xx = 13.5 + (((tickAnim - 115) / 45) * (9.5-(13.5)));
            yy = 0 + (((tickAnim - 115) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 45) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 175) {
            xx = 9.5 + (((tickAnim - 160) / 15) * (20.75-(9.5)));
            yy = 0 + (((tickAnim - 160) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 15) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 191) {
            xx = 20.75 + (((tickAnim - 175) / 16) * (8.96-(20.75)));
            yy = 0 + (((tickAnim - 175) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 16) * (0-(0)));
        }
        else if (tickAnim >= 191 && tickAnim < 199) {
            xx = 8.96 + (((tickAnim - 191) / 8) * (-5.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(8.96)));
            yy = 0 + (((tickAnim - 191) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 191) / 8) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 223) {
            xx = -5.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 199) / 24) * (-10.85-(-5.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 199) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 24) * (0-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 235) {
            xx = -10.85 + (((tickAnim - 223) / 12) * (13.5-(-10.85)));
            yy = 0 + (((tickAnim - 223) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 223) / 12) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 13.5 + (((tickAnim - 235) / 45) * (9.5-(13.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = 9.5 + (((tickAnim - 280) / 8) * (0.66-(9.5)));
            yy = 0 + (((tickAnim - 280) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 8) * (0-(0)));
        }
        else if (tickAnim >= 288 && tickAnim < 305) {
            xx = 0.66 + (((tickAnim - 288) / 17) * (0-(0.66)));
            yy = 0 + (((tickAnim - 288) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 288) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = -0.5 + (((tickAnim - 40) / 238) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 303) {
            xx = -0.5 + (((tickAnim - 278) / 25) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = -0.75 + (((tickAnim - 40) / 238) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 303) {
            xx = -0.75 + (((tickAnim - 278) / 25) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = -11.75 + (((tickAnim - 40) / 238) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = -11.75 + (((tickAnim - 278) / 12) * (-6.555-(-11.75)));
            yy = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 12) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = -6.555 + (((tickAnim - 290) / 13) * (0-(-6.555)));
            yy = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-31.09-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -31.09 + (((tickAnim - 19) / 21) * (-9-(-31.09)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = -9 + (((tickAnim - 40) / 238) * (-9-(-9)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = -9 + (((tickAnim - 278) / 12) * (-35.41-(-9)));
            yy = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 12) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = -35.41 + (((tickAnim - 290) / 13) * (0-(-35.41)));
            yy = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.45-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = -0.275 + (((tickAnim - 19) / 21) * (-3.025-(-0.275)));
            zz = -0.45 + (((tickAnim - 19) / 21) * (-0.6-(-0.45)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            yy = -3.025 + (((tickAnim - 40) / 238) * (-3.025-(-3.025)));
            zz = -0.6 + (((tickAnim - 40) / 238) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            yy = -3.025 + (((tickAnim - 278) / 12) * (0.54-(-3.025)));
            zz = -0.6 + (((tickAnim - 278) / 12) * (-0.31-(-0.6)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            yy = 0.54 + (((tickAnim - 290) / 13) * (0-(0.54)));
            zz = -0.31 + (((tickAnim - 290) / 13) * (0-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (44.46-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 44.46 + (((tickAnim - 19) / 21) * (12.25-(44.46)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = 12.25 + (((tickAnim - 40) / 238) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = 12.25 + (((tickAnim - 278) / 12) * (53.09-(12.25)));
            yy = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 12) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = 53.09 + (((tickAnim - 290) / 13) * (0-(53.09)));
            yy = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.84-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.32-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 0.84 + (((tickAnim - 19) / 21) * (-2.725-(0.84)));
            zz = 0.32 + (((tickAnim - 19) / 21) * (0.675-(0.32)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            yy = -2.725 + (((tickAnim - 40) / 238) * (-2.725-(-2.725)));
            zz = 0.675 + (((tickAnim - 40) / 238) * (0.675-(0.675)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            yy = -2.725 + (((tickAnim - 278) / 12) * (1.34-(-2.725)));
            zz = 0.675 + (((tickAnim - 278) / 12) * (0.35-(0.675)));
        }
        else if (tickAnim >= 290 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 290) / 13) * (0-(0)));
            yy = 1.34 + (((tickAnim - 290) / 13) * (0-(1.34)));
            zz = 0.35 + (((tickAnim - 290) / 13) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = 1.75 + (((tickAnim - 40) / 238) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 303) {
            xx = 1.75 + (((tickAnim - 278) / 25) * (0-(1.75)));
            yy = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 40) / 238) * (0-(0)));
            yy = -0.8 + (((tickAnim - 40) / 238) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 40) / 238) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            yy = -0.8 + (((tickAnim - 278) / 25) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 278) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-2 + (((tickAnim - 40) / 15) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+20))*-2)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 128) {
            xx = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 55) / 73) * (-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*2-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 55) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 73) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 186) {
            xx = -1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*2 + (((tickAnim - 128) / 58) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-2-(-1.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+120))*2)));
            yy = 0 + (((tickAnim - 128) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 58) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 208) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-2 + (((tickAnim - 186) / 22) * (-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-2)));
            yy = 0 + (((tickAnim - 186) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 22) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 277) {
            xx = -0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 208) / 69) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*2-(-0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 208) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 69) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 305) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*2 + (((tickAnim - 277) / 28) * (0-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+60))*2)));
            yy = 0 + (((tickAnim - 277) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.125-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            yy = 0.55 + (((tickAnim - 40) / 146) * (0.55-(0.55)));
            zz = -1.125 + (((tickAnim - 40) / 146) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 186 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            yy = 0.55 + (((tickAnim - 186) / 91) * (0.55-(0.55)));
            zz = -1.125 + (((tickAnim - 186) / 91) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            yy = 0.55 + (((tickAnim - 277) / 26) * (0-(0.55)));
            zz = -1.125 + (((tickAnim - 277) / 26) * (0-(-1.125)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 4.5 + (((tickAnim - 40) / 15) * (5.25-(4.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 122) {
            xx = 5.25 + (((tickAnim - 55) / 67) * (1.5-(5.25)));
            yy = 0 + (((tickAnim - 55) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 67) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 1.5 + (((tickAnim - 122) / 6) * (1.75-(1.5)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 186) {
            xx = 1.75 + (((tickAnim - 128) / 58) * (5.25-(1.75)));
            yy = 0 + (((tickAnim - 128) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 58) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 208) {
            xx = 5.25 + (((tickAnim - 186) / 22) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 186) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 22) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 270) {
            xx = 5.25 + (((tickAnim - 208) / 62) * (1.5-(5.25)));
            yy = 0 + (((tickAnim - 208) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 62) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 277) {
            xx = 1.5 + (((tickAnim - 270) / 7) * (1.75-(1.5)));
            yy = 0 + (((tickAnim - 270) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 7) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 1.75 + (((tickAnim - 277) / 26) * (0-(1.75)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            zz = -0.8 + (((tickAnim - 40) / 146) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 186 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            zz = -0.8 + (((tickAnim - 186) / 91) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = -0.8 + (((tickAnim - 277) / 26) * (0-(-0.8)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 1.75 + (((tickAnim - 40) / 15) * (3.25-(1.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 122) {
            xx = 3.25 + (((tickAnim - 55) / 67) * (-7.25-(3.25)));
            yy = 0 + (((tickAnim - 55) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 67) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = -7.25 + (((tickAnim - 122) / 6) * (-8.25-(-7.25)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 186) {
            xx = -8.25 + (((tickAnim - 128) / 58) * (1.75-(-8.25)));
            yy = 0 + (((tickAnim - 128) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 58) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 208) {
            xx = 1.75 + (((tickAnim - 186) / 22) * (3.25-(1.75)));
            yy = 0 + (((tickAnim - 186) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 22) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 270) {
            xx = 3.25 + (((tickAnim - 208) / 62) * (-7.25-(3.25)));
            yy = 0 + (((tickAnim - 208) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 62) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 277) {
            xx = -7.25 + (((tickAnim - 270) / 7) * (-8.25-(-7.25)));
            yy = 0 + (((tickAnim - 270) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 7) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = -8.25 + (((tickAnim - 277) / 26) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.325-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            zz = -0.325 + (((tickAnim - 40) / 146) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 186 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            zz = -0.325 + (((tickAnim - 186) / 91) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = -0.325 + (((tickAnim - 277) / 26) * (0-(-0.325)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 2.25 + (((tickAnim - 40) / 15) * (3.75-(2.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 122) {
            xx = 3.75 + (((tickAnim - 55) / 67) * (-2.25-(3.75)));
            yy = 0 + (((tickAnim - 55) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 67) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = -2.25 + (((tickAnim - 122) / 6) * (-1.5-(-2.25)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 186) {
            xx = -1.5 + (((tickAnim - 128) / 58) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 128) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 58) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 208) {
            xx = 2.25 + (((tickAnim - 186) / 22) * (3.75-(2.25)));
            yy = 0 + (((tickAnim - 186) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 22) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 270) {
            xx = 3.75 + (((tickAnim - 208) / 62) * (-2.25-(3.75)));
            yy = 0 + (((tickAnim - 208) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 62) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 277) {
            xx = -2.25 + (((tickAnim - 270) / 7) * (-1.5-(-2.25)));
            yy = 0 + (((tickAnim - 270) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 7) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = -1.5 + (((tickAnim - 277) / 26) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 26) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            zz = -0.225 + (((tickAnim - 40) / 146) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 186 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            zz = -0.225 + (((tickAnim - 186) / 91) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = -0.225 + (((tickAnim - 277) / 26) * (0-(-0.225)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -0.5 + (((tickAnim - 40) / 15) * (1.75-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 122) {
            xx = 1.75 + (((tickAnim - 55) / 67) * (14-(1.75)));
            yy = 0 + (((tickAnim - 55) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 67) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 14 + (((tickAnim - 122) / 6) * (13-(14)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 186) {
            xx = 13 + (((tickAnim - 128) / 58) * (-0.5-(13)));
            yy = 0 + (((tickAnim - 128) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 58) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 208) {
            xx = -0.5 + (((tickAnim - 186) / 22) * (1.75-(-0.5)));
            yy = 0 + (((tickAnim - 186) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 22) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 270) {
            xx = 1.75 + (((tickAnim - 208) / 62) * (14-(1.75)));
            yy = 0 + (((tickAnim - 208) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 62) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 277) {
            xx = 14 + (((tickAnim - 270) / 7) * (13-(14)));
            yy = 0 + (((tickAnim - 270) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 7) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 13 + (((tickAnim - 277) / 26) * (0-(13)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.325-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 146) * (0-(0)));
            zz = -0.325 + (((tickAnim - 40) / 146) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 186 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 186) / 91) * (0-(0)));
            zz = -0.325 + (((tickAnim - 186) / 91) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 277 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 277) / 26) * (0-(0)));
            zz = -0.325 + (((tickAnim - 277) / 26) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 4 + (((tickAnim - 40) / 15) * (-0.5-(4)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = -0.5 + (((tickAnim - 55) / 9) * (8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5-(-0.5)));
            yy = 0 + (((tickAnim - 55) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 9) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 101) {
            xx = 8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5 + (((tickAnim - 64) / 37) * (6.9-(8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5)));
            yy = 0 + (((tickAnim - 64) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 37) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 6.9 + (((tickAnim - 101) / 21) * (9.75-(6.9)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 9.75 + (((tickAnim - 122) / 6) * (10.75-(9.75)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 188) {
            xx = 10.75 + (((tickAnim - 128) / 60) * (4-(10.75)));
            yy = 0 + (((tickAnim - 128) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 60) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 208) {
            xx = 4 + (((tickAnim - 188) / 20) * (-0.5-(4)));
            yy = 0 + (((tickAnim - 188) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 20) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 215) {
            xx = -0.5 + (((tickAnim - 208) / 7) * (8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5-(-0.5)));
            yy = 0 + (((tickAnim - 208) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 7) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 252) {
            xx = 8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5 + (((tickAnim - 215) / 37) * (6.9-(8.365+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-200))*5)));
            yy = 0 + (((tickAnim - 215) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 37) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 273) {
            xx = 6.9 + (((tickAnim - 252) / 21) * (9.75-(6.9)));
            yy = 0 + (((tickAnim - 252) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 21) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 279) {
            xx = 9.75 + (((tickAnim - 273) / 6) * (10.75-(9.75)));
            yy = 0 + (((tickAnim - 273) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 6) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 305) {
            xx = 10.75 + (((tickAnim - 279) / 26) * (0-(10.75)));
            yy = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.35-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 40) / 148) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 148) * (0-(0)));
            zz = -0.35 + (((tickAnim - 40) / 148) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 188 && tickAnim < 279) {
            xx = 0 + (((tickAnim - 188) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 91) * (0-(0)));
            zz = -0.35 + (((tickAnim - 188) / 91) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 279 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            zz = -0.35 + (((tickAnim - 279) / 26) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.525-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -2.525 + (((tickAnim - 40) / 15) * (-3.47-(-2.525)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = -3.47 + (((tickAnim - 55) / 9) * (-2.06+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2-(-3.47)));
            yy = 0 + (((tickAnim - 55) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 9) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 101) {
            xx = -2.06+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2 + (((tickAnim - 64) / 37) * (1.82-(-2.06+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2)));
            yy = 0 + (((tickAnim - 64) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 37) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = 1.82 + (((tickAnim - 101) / 21) * (4.25-(1.82)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 4.25 + (((tickAnim - 122) / 6) * (5-(4.25)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 188) {
            xx = 5 + (((tickAnim - 128) / 60) * (-1.5-(5)));
            yy = 0 + (((tickAnim - 128) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 60) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 208) {
            xx = -1.5 + (((tickAnim - 188) / 20) * (-3.47-(-1.5)));
            yy = 0 + (((tickAnim - 188) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 20) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 215) {
            xx = -3.47 + (((tickAnim - 208) / 7) * (-2.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2-(-3.47)));
            yy = 0 + (((tickAnim - 208) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 7) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 252) {
            xx = -2.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2 + (((tickAnim - 215) / 37) * (1.82-(-2.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-2)));
            yy = 0 + (((tickAnim - 215) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 37) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 273) {
            xx = 1.82 + (((tickAnim - 252) / 21) * (4.25-(1.82)));
            yy = 0 + (((tickAnim - 252) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 21) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 279) {
            xx = 4.25 + (((tickAnim - 273) / 6) * (5-(4.25)));
            yy = 0 + (((tickAnim - 273) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 6) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 305) {
            xx = 5 + (((tickAnim - 279) / 26) * (0-(5)));
            yy = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.125-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 40) / 148) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 148) * (0-(0)));
            zz = -0.125 + (((tickAnim - 40) / 148) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 188 && tickAnim < 279) {
            xx = 0 + (((tickAnim - 188) / 91) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 91) * (0-(0)));
            zz = -0.125 + (((tickAnim - 188) / 91) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 279 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            zz = -0.125 + (((tickAnim - 279) / 26) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck7.rotationPointX = this.neck7.rotationPointX + (float)(xx);
        this.neck7.rotationPointY = this.neck7.rotationPointY - (float)(yy);
        this.neck7.rotationPointZ = this.neck7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -17.75 + (((tickAnim - 40) / 15) * (-24.25-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = -24.25 + (((tickAnim - 55) / 9) * (-30.75-(-24.25)));
            yy = 0 + (((tickAnim - 55) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 9) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 82) {
            xx = -30.75 + (((tickAnim - 64) / 18) * (-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20-(-30.75)));
            yy = 0 + (((tickAnim - 64) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 18) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 101) {
            xx = -6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20 + (((tickAnim - 82) / 19) * (-15.6-(-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20)));
            yy = 0 + (((tickAnim - 82) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 19) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 122) {
            xx = -15.6 + (((tickAnim - 101) / 21) * (-15-(-15.6)));
            yy = 0 + (((tickAnim - 101) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 21) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = -15 + (((tickAnim - 122) / 6) * (-15.5-(-15)));
            yy = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 6) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 188) {
            xx = -15.5 + (((tickAnim - 128) / 60) * (-17.75-(-15.5)));
            yy = 0 + (((tickAnim - 128) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 60) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 208) {
            xx = -17.75 + (((tickAnim - 188) / 20) * (-24.25-(-17.75)));
            yy = 0 + (((tickAnim - 188) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 20) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 215) {
            xx = -24.25 + (((tickAnim - 208) / 7) * (-30.75-(-24.25)));
            yy = 0 + (((tickAnim - 208) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 7) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 233) {
            xx = -30.75 + (((tickAnim - 215) / 18) * (7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20-(-30.75)));
            yy = 0 + (((tickAnim - 215) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 18) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 252) {
            xx = 7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20 + (((tickAnim - 233) / 19) * (-15.6-(7.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-20)));
            yy = 0 + (((tickAnim - 233) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 19) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 273) {
            xx = -15.6 + (((tickAnim - 252) / 21) * (-15-(-15.6)));
            yy = 0 + (((tickAnim - 252) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 21) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 279) {
            xx = -15 + (((tickAnim - 273) / 6) * (-15.5-(-15)));
            yy = 0 + (((tickAnim - 273) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 6) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 305) {
            xx = -15.5 + (((tickAnim - 279) / 26) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 279) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-24-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 98) {
            xx = -24 + (((tickAnim - 40) / 58) * (2.08-(-24)));
            yy = 0 + (((tickAnim - 40) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 58) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 119) {
            xx = 2.08 + (((tickAnim - 98) / 21) * (1.75-(2.08)));
            yy = 0 + (((tickAnim - 98) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 21) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 186) {
            xx = 1.75 + (((tickAnim - 119) / 67) * (-24-(1.75)));
            yy = 0 + (((tickAnim - 119) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 67) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 249) {
            xx = -24 + (((tickAnim - 186) / 63) * (2.08-(-24)));
            yy = 0 + (((tickAnim - 186) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 63) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 270) {
            xx = 2.08 + (((tickAnim - 249) / 21) * (1.75-(2.08)));
            yy = 0 + (((tickAnim - 249) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 21) * (0-(0)));
        }
        else if (tickAnim >= 270 && tickAnim < 303) {
            xx = 1.75 + (((tickAnim - 270) / 33) * (0-(1.75)));
            yy = 0 + (((tickAnim - 270) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 270) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 74 && tickAnim < 82) {
            xx = 1 + (((tickAnim - 74) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 74) / 8) * (0-(1)));
            zz = 1 + (((tickAnim - 74) / 8) * (1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 82) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 82) / 8) * (1-(0)));
            zz = 1 + (((tickAnim - 82) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 22 + (((tickAnim - 40) / 11) * (0-(22)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 51) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 77) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 128) / 55) * (22-(0)));
            yy = 0 + (((tickAnim - 128) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 55) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 193) {
            xx = 22 + (((tickAnim - 183) / 10) * (0-(22)));
            yy = 0 + (((tickAnim - 183) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 10) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 193) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 85) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 278) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.32-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = -9.32 + (((tickAnim - 40) / 11) * (5.75-(-9.32)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 117) {
            xx = 5.75 + (((tickAnim - 51) / 66) * (-7.75-(5.75)));
            yy = 0 + (((tickAnim - 51) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 66) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 182) {
            xx = -7.75 + (((tickAnim - 117) / 65) * (-8.25-(-7.75)));
            yy = 0 + (((tickAnim - 117) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 65) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 193) {
            xx = -8.25 + (((tickAnim - 182) / 11) * (7.25-(-8.25)));
            yy = 0 + (((tickAnim - 182) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 182) / 11) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 268) {
            xx = 7.25 + (((tickAnim - 193) / 75) * (-7.75-(7.25)));
            yy = 0 + (((tickAnim - 193) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 75) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 303) {
            xx = -7.75 + (((tickAnim - 268) / 35) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 268) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 0) / 51) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 51) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 51) * (1.37-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 117) {
            xx = 1 + (((tickAnim - 51) / 66) * (1-(1)));
            yy = 1 + (((tickAnim - 51) / 66) * (1-(1)));
            zz = 1.37 + (((tickAnim - 51) / 66) * (1-(1.37)));
        }
        else if (tickAnim >= 117 && tickAnim < 188) {
            xx = 1 + (((tickAnim - 117) / 71) * (1-(1)));
            yy = 1 + (((tickAnim - 117) / 71) * (1-(1)));
            zz = 1 + (((tickAnim - 117) / 71) * (1.37-(1)));
        }
        else if (tickAnim >= 188 && tickAnim < 268) {
            xx = 1 + (((tickAnim - 188) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 188) / 80) * (1-(1)));
            zz = 1.37 + (((tickAnim - 188) / 80) * (1-(1.37)));
        }
        else if (tickAnim >= 268 && tickAnim < 303) {
            xx = 1 + (((tickAnim - 268) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 268) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 268) / 35) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 12.5 + (((tickAnim - 40) / 5) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 45) / 35) * (0-(12.5)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -12.75 + (((tickAnim - 39) / 6) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -12.75 + (((tickAnim - 45) / 35) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -12.75 + (((tickAnim - 39) / 6) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -12.75 + (((tickAnim - 45) / 35) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -5 + (((tickAnim - 39) / 19) * (1.5-(-5)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 58) / 22) * (0-(1.5)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -7 + (((tickAnim - 39) / 19) * (-1.25-(-7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -1.25 + (((tickAnim - 58) / 22) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -7 + (((tickAnim - 39) / 19) * (-3.75-(-7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -3.75 + (((tickAnim - 58) / 22) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -3.25 + (((tickAnim - 39) / 19) * (-4-(-3.25)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 58) / 22) * (0-(-4)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 3.75 + (((tickAnim - 39) / 19) * (-9-(3.75)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -9 + (((tickAnim - 58) / 22) * (0-(-9)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 7 + (((tickAnim - 39) / 19) * (-10.25-(7)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -10.25 + (((tickAnim - 58) / 22) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 11.5 + (((tickAnim - 39) / 19) * (-2.75-(11.5)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -2.75 + (((tickAnim - 58) / 22) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8 + (((tickAnim - 40) / 5) * (-8-(-8)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8 + (((tickAnim - 45) / 35) * (0-(-8)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 11 + (((tickAnim - 40) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 11 + (((tickAnim - 45) / 35) * (0-(11)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-31.77762-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-13.47137-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-24.77944-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -31.77762 + (((tickAnim - 40) / 5) * (-31.77762-(-31.77762)));
            yy = -13.47137 + (((tickAnim - 40) / 5) * (-13.47137-(-13.47137)));
            zz = -24.77944 + (((tickAnim - 40) / 5) * (-24.77944-(-24.77944)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -31.77762 + (((tickAnim - 45) / 35) * (0-(-31.77762)));
            yy = -13.47137 + (((tickAnim - 45) / 35) * (0-(-13.47137)));
            zz = -24.77944 + (((tickAnim - 45) / 35) * (0-(-24.77944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.11122-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.04369-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (28.91748-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8.11122 + (((tickAnim - 40) / 5) * (-8.11122-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 40) / 5) * (-3.04369-(-3.04369)));
            zz = 28.91748 + (((tickAnim - 40) / 5) * (28.91748-(28.91748)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8.11122 + (((tickAnim - 45) / 35) * (0-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 45) / 35) * (0-(-3.04369)));
            zz = 28.91748 + (((tickAnim - 45) / 35) * (0-(28.91748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 29 + (((tickAnim - 40) / 5) * (29-(29)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 29 + (((tickAnim - 45) / 35) * (0-(29)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 40) / 5) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-31.77762-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (13.4714-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (24.7794-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -31.77762 + (((tickAnim - 40) / 5) * (-31.77762-(-31.77762)));
            yy = 13.4714 + (((tickAnim - 40) / 5) * (13.4714-(13.4714)));
            zz = 24.7794 + (((tickAnim - 40) / 5) * (24.7794-(24.7794)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -31.77762 + (((tickAnim - 45) / 35) * (0-(-31.77762)));
            yy = 13.4714 + (((tickAnim - 45) / 35) * (0-(13.4714)));
            zz = 24.7794 + (((tickAnim - 45) / 35) * (0-(24.7794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.11122-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.04369-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-28.9175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8.11122 + (((tickAnim - 40) / 5) * (-8.11122-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 40) / 5) * (-3.04369-(-3.04369)));
            zz = -28.9175 + (((tickAnim - 40) / 5) * (-28.9175-(-28.9175)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -8.11122 + (((tickAnim - 45) / 35) * (0-(-8.11122)));
            yy = -3.04369 + (((tickAnim - 45) / 35) * (0-(-3.04369)));
            zz = -28.9175 + (((tickAnim - 45) / 35) * (0-(-28.9175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 29 + (((tickAnim - 40) / 5) * (29-(29)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 29 + (((tickAnim - 45) / 35) * (0-(29)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 40) / 5) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18.25 + (((tickAnim - 40) / 5) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 18.25 + (((tickAnim - 45) / 35) * (0-(18.25)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5.375-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-5.975-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 5.375 + (((tickAnim - 40) / 5) * (5.375-(5.375)));
            zz = -5.975 + (((tickAnim - 40) / 5) * (-5.975-(-5.975)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            yy = 5.375 + (((tickAnim - 45) / 35) * (0-(5.375)));
            zz = -5.975 + (((tickAnim - 45) / 35) * (0-(-5.975)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (23.81902-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.1421-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.33513-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 23.81902 + (((tickAnim - 40) / 5) * (23.81902-(23.81902)));
            yy = -0.1421 + (((tickAnim - 40) / 5) * (-0.1421-(-0.1421)));
            zz = -0.33513 + (((tickAnim - 40) / 5) * (-0.33513-(-0.33513)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 23.81902 + (((tickAnim - 45) / 35) * (0-(23.81902)));
            yy = -0.1421 + (((tickAnim - 45) / 35) * (0-(-0.1421)));
            zz = -0.33513 + (((tickAnim - 45) / 35) * (0-(-0.33513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 24.5 + (((tickAnim - 40) / 5) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 24.5 + (((tickAnim - 45) / 35) * (0-(24.5)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 13.75 + (((tickAnim - 40) / 5) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 13.75 + (((tickAnim - 45) / 35) * (0-(13.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 15.25 + (((tickAnim - 40) / 5) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 15.25 + (((tickAnim - 45) / 35) * (0-(15.25)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4 + (((tickAnim - 40) / 5) * (4-(4)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 4 + (((tickAnim - 45) / 35) * (0-(4)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.44-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0.44 + (((tickAnim - 40) / 5) * (2.75-(0.44)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 2.75 + (((tickAnim - 45) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.31-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.31 + (((tickAnim - 40) / 5) * (-4-(-5.31)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 45) / 35) * (0-(-4)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (1.325-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 1.325 + (((tickAnim - 45) / 35) * (0-(1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck8.rotationPointX = this.neck8.rotationPointX + (float)(xx);
        this.neck8.rotationPointY = this.neck8.rotationPointY - (float)(yy);
        this.neck8.rotationPointZ = this.neck8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -13 + (((tickAnim - 40) / 5) * (-13-(-13)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 80) {
            xx = -13 + (((tickAnim - 45) / 35) * (0-(-13)));
            yy = 0 + (((tickAnim - 45) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18.75 + (((tickAnim - 40) / 5) * (0-(18.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.37888-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 27.50565 + (((tickAnim - 15) / 12) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 15) / 12) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 15) / 12) * (0-(-0.37888)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (-0.37888-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.50565 + (((tickAnim - 40) / 10) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 40) / 10) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 40) / 10) * (0-(-0.37888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 15) / 8) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.55 + (((tickAnim - 23) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (8.25-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 8.25 + (((tickAnim - 40) / 6) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -19.55 + (((tickAnim - 46) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (5.475-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 23) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (5.475-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 46) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 15) / 8) * (19.75-(27)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 19.75 + (((tickAnim - 23) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 27 + (((tickAnim - 40) / 6) * (19.75-(27)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 46) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-61-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -61 + (((tickAnim - 15) / 8) * (0-(-61)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (-61-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -61 + (((tickAnim - 40) / 6) * (0-(-61)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 8) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 15) / 8) * (0-(1.725)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (1.725-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 40) / 6) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 40) / 6) * (0-(1.725)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -17 + (((tickAnim - 15) / 20) * (-17-(-17)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 35) / 15) * (0-(-17)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.35 + (((tickAnim - 15) / 20) * (-7.35-(-7.35)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.35 + (((tickAnim - 35) / 15) * (0-(-7.35)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 15) / 20) * (-3-(-3)));
            yy = -11.5 + (((tickAnim - 15) / 20) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 35) / 15) * (0-(-3)));
            yy = -11.5 + (((tickAnim - 35) / 15) * (0-(-11.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43.75 + (((tickAnim - 15) / 20) * (43.75-(43.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43.75 + (((tickAnim - 35) / 15) * (0-(43.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 6.425 + (((tickAnim - 15) / 20) * (6.425-(6.425)));
            zz = -2.575 + (((tickAnim - 15) / 20) * (-2.575-(-2.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 6.425 + (((tickAnim - 35) / 15) * (0-(6.425)));
            zz = -2.575 + (((tickAnim - 35) / 15) * (0-(-2.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.5 + (((tickAnim - 15) / 20) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 35) / 15) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.51058-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (12.46713-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.35675-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.51058 + (((tickAnim - 15) / 20) * (-2.51058-(-2.51058)));
            yy = 12.46713 + (((tickAnim - 15) / 20) * (12.46713-(12.46713)));
            zz = 2.35675 + (((tickAnim - 15) / 20) * (2.35675-(2.35675)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.51058 + (((tickAnim - 35) / 15) * (0-(-2.51058)));
            yy = 12.46713 + (((tickAnim - 35) / 15) * (0-(12.46713)));
            zz = 2.35675 + (((tickAnim - 35) / 15) * (0-(2.35675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43.75 + (((tickAnim - 15) / 20) * (43.75-(43.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 43.75 + (((tickAnim - 35) / 15) * (0-(43.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 6.425 + (((tickAnim - 15) / 20) * (6.425-(6.425)));
            zz = -2.575 + (((tickAnim - 15) / 20) * (-2.575-(-2.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 6.425 + (((tickAnim - 35) / 15) * (0-(6.425)));
            zz = -2.575 + (((tickAnim - 35) / 15) * (0-(-2.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21.5 + (((tickAnim - 15) / 20) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 35) / 15) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.25 + (((tickAnim - 15) / 20) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.25 + (((tickAnim - 35) / 15) * (0-(-1.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 15) / 20) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 35) / 15) * (0-(-7.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 15) / 20) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 9.75 + (((tickAnim - 35) / 4) * (-2.46-(9.75)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -2.46 + (((tickAnim - 39) / 11) * (0-(-2.46)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.25 + (((tickAnim - 15) / 20) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 15.25 + (((tickAnim - 35) / 4) * (10.91-(15.25)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 10.91 + (((tickAnim - 39) / 4) * (-1.12-(10.91)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1.12 + (((tickAnim - 43) / 2) * (-4-(-1.12)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 45) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (1.75-(0)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 1.75 + (((tickAnim - 39) / 4) * (-0.79-(1.75)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -0.79 + (((tickAnim - 43) / 2) * (-8.53-(-0.79)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -8.53 + (((tickAnim - 45) / 2) * (-9.44-(-8.53)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -9.44 + (((tickAnim - 47) / 3) * (0-(-9.44)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (16.25-(0)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 16.25 + (((tickAnim - 39) / 4) * (22.5-(16.25)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 22.5 + (((tickAnim - 43) / 2) * (15.54-(22.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 15.54 + (((tickAnim - 45) / 2) * (-5.25-(15.54)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 47) / 3) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 15) / 20) * (8-(8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 35) / 15) * (0-(8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 15) / 20) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 35) / 15) * (0-(-3.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 15) / 20) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 35) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 35) / 15) * (0-(1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-120))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-140))*1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-180))*1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-200))*1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-200))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10 + (((tickAnim - 12) / 18) * (0-(8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -14.75 + (((tickAnim - 10) / 8) * (-0.92-(-14.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -0.92 + (((tickAnim - 18) / 12) * (0-(-0.92)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-120))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-140))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-180))*-1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-200))*1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 20) / 10) * (20.75-(15.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 30) / 20) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75))*0.6);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75))*-0.3);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 1.75 + (((tickAnim - 0) / 16) * (24-(1.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 24 + (((tickAnim - 16) / 8) * (-9.75-(24)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 24) / 9) * (1.75-(-9.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 8.75 + (((tickAnim - 16) / 2) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.97 + (((tickAnim - 18) / 3) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -18.19 + (((tickAnim - 21) / 3) * (-0.25-(-18.19)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = 0.45 + (((tickAnim - 7) / 9) * (1.2-(0.45)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 16) / 5) * (3.865-(1.2)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 21) / 3) * (-1.375-(3.865)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 24) / 4) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 28) / 3) * (0-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -9 + (((tickAnim - 7) / 9) * (19.5-(-9)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 19.5 + (((tickAnim - 16) / 5) * (24.5-(19.5)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 24.5 + (((tickAnim - 21) / 2) * (2.9-(24.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 2.9 + (((tickAnim - 23) / 1) * (9.75-(2.9)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 9.75 + (((tickAnim - 24) / 9) * (0-(9.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.495-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            yy = -0.495 + (((tickAnim - 7) / 9) * (-0.275-(-0.495)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 16) / 5) * (1.775-(-0.275)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 1.775 + (((tickAnim - 21) / 2) * (-1.005-(1.775)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -1.005 + (((tickAnim - 23) / 1) * (-1.375-(-1.005)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 24) / 4) * (-1.46-(-1.375)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -1.46 + (((tickAnim - 28) / 5) * (0-(-1.46)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (-32.93563-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (10.6293-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (-12.6936-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -32.93563 + (((tickAnim - 17) / 4) * (15-(-32.93563)));
            yy = 10.6293 + (((tickAnim - 17) / 4) * (0-(10.6293)));
            zz = -12.6936 + (((tickAnim - 17) / 4) * (0-(-12.6936)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 21) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 7) * (0-(0.05)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (0.1-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0.85-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 17) / 4) * (0-(0.1)));
            zz = 0.85 + (((tickAnim - 17) / 4) * (0-(0.85)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0.025-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 0.025 + (((tickAnim - 23) / 1) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0.025 + (((tickAnim - 24) / 9) * (0.05-(0.025)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
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
            xx = 24 + (((tickAnim - 0) / 8) * (-9.75-(24)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -9.75 + (((tickAnim - 8) / 9) * (1.75-(-9.75)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 1.75 + (((tickAnim - 17) / 16) * (24-(1.75)));
            yy = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.75 + (((tickAnim - 0) / 3) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.97 + (((tickAnim - 3) / 2) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.19 + (((tickAnim - 5) / 3) * (-0.25-(-18.19)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 33) {
            xx = -0.25 + (((tickAnim - 8) / 25) * (8.75-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 5) * (3.865-(1.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 3.865 + (((tickAnim - 5) / 3) * (-1.375-(3.865)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -1.375 + (((tickAnim - 8) / 4) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 12) / 3) * (0-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 18) * (1.2-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
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
            xx = 19.5 + (((tickAnim - 0) / 5) * (24.5-(19.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 24.5 + (((tickAnim - 5) / 2) * (2.9-(24.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 2.9 + (((tickAnim - 7) / 1) * (9.75-(2.9)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 9.75 + (((tickAnim - 8) / 11) * (0-(9.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 5) * (1.775-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.775 + (((tickAnim - 5) / 2) * (-1.005-(1.775)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -1.005 + (((tickAnim - 7) / 1) * (-1.375-(-1.005)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = -1.375 + (((tickAnim - 8) / 11) * (-0.01-(-1.375)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = -0.01 + (((tickAnim - 19) / 7) * (1.56-(-0.01)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 1.56 + (((tickAnim - 26) / 7) * (-0.275-(1.56)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -32.30618 + (((tickAnim - 0) / 4) * (15-(-32.30618)));
            yy = -0.96804 + (((tickAnim - 0) / 4) * (0-(-0.96804)));
            zz = -5.26749 + (((tickAnim - 0) / 4) * (0-(-5.26749)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 4) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (-32.30618-(0)));
            yy = 0 + (((tickAnim - 19) / 14) * (-0.96804-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (-5.26749-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0-(0.1)));
            zz = 0.85 + (((tickAnim - 0) / 4) * (0-(0.85)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.025-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 6) / 2) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0.025 + (((tickAnim - 8) / 11) * (0-(0.025)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 14) * (0.1-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-50))*-1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-50))*-0.8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-100))*-2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-100))*1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-150))*-3.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.75-150))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-180))*-4.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-200))*2.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-200))*-5.5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-250))*3.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-250))*-6.5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-300))*4.5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-280))*-7.5), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-50))*-0.8), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-50))*-1.8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-50))*-0.8), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-50))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-80))*1.6));



        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -15.5 + (((tickAnim - 0) / 24) * (16.25-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 16.25 + (((tickAnim - 24) / 5) * (-6.04189-(16.25)));
            yy = 0 + (((tickAnim - 24) / 5) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (-1.7439-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -6.04189 + (((tickAnim - 29) / 4) * (-15.5-(-6.04189)));
            yy = 0.14623 + (((tickAnim - 29) / 4) * (0-(0.14623)));
            zz = -1.7439 + (((tickAnim - 29) / 4) * (0-(-1.7439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 3.5 + (((tickAnim - 0) / 15) * (4.25-(3.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 4.25 + (((tickAnim - 15) / 9) * (3.50044-(4.25)));
            yy = 0 + (((tickAnim - 15) / 9) * (-0.03145-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (-0.02314-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 3.50044 + (((tickAnim - 24) / 5) * (-21.30953-(3.50044)));
            yy = -0.03145 + (((tickAnim - 24) / 5) * (1.51722-(-0.03145)));
            zz = -0.02314 + (((tickAnim - 24) / 5) * (0.74111-(-0.02314)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -21.30953 + (((tickAnim - 29) / 4) * (3.5-(-21.30953)));
            yy = 1.51722 + (((tickAnim - 29) / 4) * (0-(1.51722)));
            zz = 0.74111 + (((tickAnim - 29) / 4) * (0-(0.74111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -2.925 + (((tickAnim - 0) / 3) * (-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-2.925)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 3) / 5) * (-2.475-(-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 8) / 16) * (0-(0)));
            yy = -2.475 + (((tickAnim - 8) / 16) * (-0.85-(-2.475)));
            zz = 0 + (((tickAnim - 8) / 16) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 24) / 5) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 24) / 5) * (-0.725-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.56 + (((tickAnim - 29) / 4) * (-2.925-(0.56)));
            zz = -0.725 + (((tickAnim - 29) / 4) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 13.25 + (((tickAnim - 0) / 15) * (-8.25-(13.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -8.25 + (((tickAnim - 15) / 9) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (22.47-(0)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 22.47 + (((tickAnim - 26) / 3) * (26.04-(22.47)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 26.04 + (((tickAnim - 29) / 2) * (8.75-(26.04)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 31) / 2) * (13.25-(8.75)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 1.9 + (((tickAnim - 15) / 9) * (-0.925-(1.9)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = -0.925 + (((tickAnim - 24) / 2) * (0.18-(-0.925)));
            zz = 0 + (((tickAnim - 24) / 2) * (0.67-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0.18 + (((tickAnim - 26) / 1) * (0.73-(0.18)));
            zz = 0.67 + (((tickAnim - 26) / 1) * (0.18-(0.67)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 27) / 2) * (0.225-(0.73)));
            zz = 0.18 + (((tickAnim - 27) / 2) * (0.4-(0.18)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 29) / 2) * (-1.4-(0.225)));
            zz = 0.4 + (((tickAnim - 29) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = -1.4 + (((tickAnim - 31) / 2) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 0) / 8) * (16.25-(8)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16.25 + (((tickAnim - 8) / 5) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (1.74388-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.79189 + (((tickAnim - 13) / 3) * (-15.5-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 13) / 3) * (0-(0.14623)));
            zz = 1.74388 + (((tickAnim - 13) / 3) * (0-(1.74388)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = -15.5 + (((tickAnim - 16) / 17) * (8-(-15.5)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.75 + (((tickAnim - 5) / 3) * (5.25-(3.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5.25 + (((tickAnim - 8) / 5) * (-8.00423-(5.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (-1.01528-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-3.26784-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -8.00423 + (((tickAnim - 13) / 3) * (3.5-(-8.00423)));
            yy = -1.01528 + (((tickAnim - 13) / 3) * (0-(-1.01528)));
            zz = -3.26784 + (((tickAnim - 13) / 3) * (0-(-3.26784)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 3.5 + (((tickAnim - 16) / 17) * (0-(3.5)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 8) / 5) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.56 + (((tickAnim - 13) / 3) * (-2-(0.56)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 16) / 3) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-2)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 19) / 4) * (-0.775-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = -0.775 + (((tickAnim - 23) / 10) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.5 + (((tickAnim - 0) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (22.47-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.47 + (((tickAnim - 8) / 5) * (26.04-(22.47)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 26.04 + (((tickAnim - 13) / 1) * (6.25-(26.04)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 6.25 + (((tickAnim - 14) / 2) * (13.25-(6.25)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 13.25 + (((tickAnim - 16) / 17) * (-3.5-(13.25)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 8) * (-0.925-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.925 + (((tickAnim - 8) / 0) * (0.18-(-0.925)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.67-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.18 + (((tickAnim - 8) / 3) * (1.065-(0.18)));
            zz = 0.67 + (((tickAnim - 8) / 3) * (0.2-(0.67)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.065 + (((tickAnim - 11) / 2) * (0.225-(1.065)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (0.4-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 1) * (-1.715-(0.225)));
            zz = 0.4 + (((tickAnim - 13) / 1) * (0-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -1.715 + (((tickAnim - 14) / 2) * (-0.8-(-1.715)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 16) / 3) * (-0.5-(-0.8)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 19) / 4) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-150))*0.25), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-80))*0.1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-140))*1));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75+50))*-0.55), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-120))*0.1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-180))*1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-140))*-1.2), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-140))*0.1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-230))*-1));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-200))*-0.45), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-160))*0.1), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-260))*1));
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-250))*-0.65), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-190))*0.1), neck5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/1.5-290))*1));
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-260))*-0.55), neck6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/1.5-230))*0.1), neck6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/1.5-320))*1));
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.75-300))*-0.75), neck7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-250))*-0.1), neck7.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-350))*-1));
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-320))*-0.75), neck8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/1.5-280))*0.1), neck8.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-380))*-1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.75-350))*-0.75), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-320))*0.1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/1.5-420))*1));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSauroposeidon entity = (EntityPrehistoricFloraSauroposeidon) entitylivingbaseIn;
        int animCycle = 53;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*-0.6), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*-0.2);



        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 1.75 + (((tickAnim - 0) / 26) * (24-(1.75)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 39) {
            xx = 24 + (((tickAnim - 26) / 13) * (-9.75-(24)));
            yy = 0 + (((tickAnim - 26) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 13) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = -9.75 + (((tickAnim - 39) / 14) * (1.75-(-9.75)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 26) / 4) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -10.97 + (((tickAnim - 30) / 4) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -18.19 + (((tickAnim - 34) / 5) * (-0.25-(-18.19)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            yy = 0.45 + (((tickAnim - 11) / 15) * (1.2-(0.45)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 1.2 + (((tickAnim - 26) / 8) * (3.865-(1.2)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            yy = 3.865 + (((tickAnim - 34) / 5) * (-1.375-(3.865)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 39) / 6) * (0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = 0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 45) / 6) * (0-(0.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = -9 + (((tickAnim - 11) / 15) * (19.5-(-9)));
            yy = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 19.5 + (((tickAnim - 26) / 8) * (24.5-(19.5)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 24.5 + (((tickAnim - 34) / 3) * (2.9-(24.5)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 2.9 + (((tickAnim - 37) / 2) * (9.75-(2.9)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 9.75 + (((tickAnim - 39) / 14) * (0-(9.75)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.495-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 11) / 15) * (0-(0)));
            yy = -0.495 + (((tickAnim - 11) / 15) * (-0.275-(-0.495)));
            zz = 0 + (((tickAnim - 11) / 15) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -0.275 + (((tickAnim - 26) / 8) * (1.775-(-0.275)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 1.775 + (((tickAnim - 34) / 3) * (-1.005-(1.775)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = -1.005 + (((tickAnim - 37) / 2) * (-1.375-(-1.005)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 39) / 6) * (-1.46-(-1.375)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = -1.46 + (((tickAnim - 45) / 8) * (0-(-1.46)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (-32.93563-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (10.6293-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (-12.6936-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -32.93563 + (((tickAnim - 27) / 7) * (15-(-32.93563)));
            yy = 10.6293 + (((tickAnim - 27) / 7) * (0-(10.6293)));
            zz = -12.6936 + (((tickAnim - 27) / 7) * (0-(-12.6936)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 15 + (((tickAnim - 34) / 3) * (0-(15)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 11) * (0-(0.05)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (0.85-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 7) * (0-(0.1)));
            zz = 0.85 + (((tickAnim - 27) / 7) * (0-(0.85)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0.025-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 37) / 2) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 39) / 14) * (0-(0)));
            yy = 0.025 + (((tickAnim - 39) / 14) * (0.05-(0.025)));
            zz = 0 + (((tickAnim - 39) / 14) * (0-(0)));
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
            xx = 24 + (((tickAnim - 0) / 13) * (-9.75-(24)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -9.75 + (((tickAnim - 13) / 15) * (1.75-(-9.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 1.75 + (((tickAnim - 28) / 25) * (24-(1.75)));
            yy = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8.75 + (((tickAnim - 0) / 4) * (-10.97-(8.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.97 + (((tickAnim - 4) / 4) * (-18.19-(-10.97)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -18.19 + (((tickAnim - 8) / 5) * (-0.25-(-18.19)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 53) {
            xx = -0.25 + (((tickAnim - 13) / 40) * (8.75-(-0.25)));
            yy = 0 + (((tickAnim - 13) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 8) * (3.865-(1.2)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 3.865 + (((tickAnim - 8) / 5) * (-1.375-(3.865)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -1.375 + (((tickAnim - 13) / 6) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.375)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 19) / 6) * (0-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 25) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 28) * (1.2-(0)));
            zz = 0 + (((tickAnim - 25) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 0) / 8) * (24.5-(19.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 24.5 + (((tickAnim - 8) / 3) * (2.9-(24.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 2.9 + (((tickAnim - 11) / 2) * (9.75-(2.9)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 9.75 + (((tickAnim - 13) / 18) * (0-(9.75)));
            yy = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (19.5-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 8) * (1.775-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.775 + (((tickAnim - 8) / 3) * (-1.005-(1.775)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -1.005 + (((tickAnim - 11) / 2) * (-1.375-(-1.005)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.375 + (((tickAnim - 13) / 18) * (-0.01-(-1.375)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            yy = -0.01 + (((tickAnim - 31) / 12) * (1.56-(-0.01)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 1.56 + (((tickAnim - 43) / 10) * (-0.275-(1.56)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
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
            xx = -32.30618 + (((tickAnim - 0) / 8) * (15-(-32.30618)));
            yy = -0.96804 + (((tickAnim - 0) / 8) * (0-(-0.96804)));
            zz = -5.26749 + (((tickAnim - 0) / 8) * (0-(-5.26749)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 8) / 2) * (0-(15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (-32.30618-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (-0.96804-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (-5.26749-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 8) * (0-(0.1)));
            zz = 0.85 + (((tickAnim - 0) / 8) * (0-(0.85)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.025-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 3) * (0.025-(0.025)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = 0.025 + (((tickAnim - 13) / 18) * (0-(0.025)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 31) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 22) * (0.1-(0)));
            zz = 0 + (((tickAnim - 31) / 22) * (0.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75))*0.7), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-50))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*-0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-100))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-100))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-150))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-150))*1.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-180))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-200))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-200))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-250))*3), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-250))*-6), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-300))*4), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-280))*-7), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*-0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5))*0.6), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-50))*-1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-50))*-0.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-50))*-0.6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-80))*1.5));



        if (tickAnim >= 0 && tickAnim < 39) {
            xx = -15.5 + (((tickAnim - 0) / 39) * (16.25-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 16.25 + (((tickAnim - 39) / 9) * (-6.04189-(16.25)));
            yy = 0 + (((tickAnim - 39) / 9) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (-1.7439-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -6.04189 + (((tickAnim - 48) / 5) * (-15.5-(-6.04189)));
            yy = 0.14623 + (((tickAnim - 48) / 5) * (0-(0.14623)));
            zz = -1.7439 + (((tickAnim - 48) / 5) * (0-(-1.7439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 3.5 + (((tickAnim - 0) / 24) * (4.25-(3.5)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 4.25 + (((tickAnim - 24) / 15) * (3.50044-(4.25)));
            yy = 0 + (((tickAnim - 24) / 15) * (-0.03145-(0)));
            zz = 0 + (((tickAnim - 24) / 15) * (-0.02314-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 3.50044 + (((tickAnim - 39) / 9) * (-21.30953-(3.50044)));
            yy = -0.03145 + (((tickAnim - 39) / 9) * (1.51722-(-0.03145)));
            zz = -0.02314 + (((tickAnim - 39) / 9) * (0.74111-(-0.02314)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -21.30953 + (((tickAnim - 48) / 5) * (3.5-(-21.30953)));
            yy = 1.51722 + (((tickAnim - 48) / 5) * (0-(1.51722)));
            zz = 0.74111 + (((tickAnim - 48) / 5) * (0-(0.74111)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -2.925 + (((tickAnim - 0) / 6) * (-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-2.925)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = -2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 6) / 6) * (-2.475-(-2.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 12) / 27) * (0-(0)));
            yy = -2.475 + (((tickAnim - 12) / 27) * (-0.85-(-2.475)));
            zz = 0 + (((tickAnim - 12) / 27) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            yy = -0.85 + (((tickAnim - 39) / 9) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 39) / 9) * (-0.725-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0.56 + (((tickAnim - 48) / 5) * (-2.925-(0.56)));
            zz = -0.725 + (((tickAnim - 48) / 5) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 13.25 + (((tickAnim - 0) / 24) * (-8.25-(13.25)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = -8.25 + (((tickAnim - 24) / 15) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 15) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (22.47-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 22.47 + (((tickAnim - 43) / 5) * (26.04-(22.47)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 26.04 + (((tickAnim - 48) / 3) * (8.75-(26.04)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 8.75 + (((tickAnim - 51) / 2) * (13.25-(8.75)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            yy = 1.9 + (((tickAnim - 24) / 15) * (-0.925-(1.9)));
            zz = 0 + (((tickAnim - 24) / 15) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            yy = -0.925 + (((tickAnim - 39) / 4) * (0.18-(-0.925)));
            zz = 0 + (((tickAnim - 39) / 4) * (0.67-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0.18 + (((tickAnim - 43) / 1) * (0.73-(0.18)));
            zz = 0.67 + (((tickAnim - 43) / 1) * (0.18-(0.67)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.73 + (((tickAnim - 44) / 4) * (0.225-(0.73)));
            zz = 0.18 + (((tickAnim - 44) / 4) * (0.4-(0.18)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 48) / 3) * (-1.4-(0.225)));
            zz = 0.4 + (((tickAnim - 48) / 3) * (0-(0.4)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            yy = -1.4 + (((tickAnim - 51) / 2) * (0-(-1.4)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 0) / 12) * (16.25-(8)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 16.25 + (((tickAnim - 12) / 9) * (-9.79189-(16.25)));
            yy = 0 + (((tickAnim - 12) / 9) * (0.14623-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (1.74388-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -9.79189 + (((tickAnim - 21) / 5) * (-15.5-(-9.79189)));
            yy = 0.14623 + (((tickAnim - 21) / 5) * (0-(0.14623)));
            zz = 1.74388 + (((tickAnim - 21) / 5) * (0-(1.74388)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = -15.5 + (((tickAnim - 26) / 27) * (8-(-15.5)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 3.75 + (((tickAnim - 8) / 4) * (5.25-(3.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 5.25 + (((tickAnim - 12) / 9) * (-8.00423-(5.25)));
            yy = 0 + (((tickAnim - 12) / 9) * (-1.01528-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (-3.26784-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -8.00423 + (((tickAnim - 21) / 5) * (3.5-(-8.00423)));
            yy = -1.01528 + (((tickAnim - 21) / 5) * (0-(-1.01528)));
            zz = -3.26784 + (((tickAnim - 21) / 5) * (0-(-3.26784)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 3.5 + (((tickAnim - 26) / 27) * (0-(3.5)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = -0.85 + (((tickAnim - 12) / 9) * (0.56-(-0.85)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.56 + (((tickAnim - 21) / 5) * (-2-(0.56)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -2 + (((tickAnim - 26) / 6) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-2)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 32) / 6) * (-0.775-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = -0.775 + (((tickAnim - 38) / 15) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -3.5 + (((tickAnim - 0) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (22.47-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 22.47 + (((tickAnim - 14) / 7) * (26.04-(22.47)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 26.04 + (((tickAnim - 21) / 2) * (6.25-(26.04)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 6.25 + (((tickAnim - 23) / 3) * (13.25-(6.25)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 53) {
            xx = 13.25 + (((tickAnim - 26) / 27) * (-3.5-(13.25)));
            yy = 0 + (((tickAnim - 26) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 12) * (-0.925-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.925 + (((tickAnim - 12) / 2) * (0.18-(-0.925)));
            zz = 0 + (((tickAnim - 12) / 2) * (0.67-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.18 + (((tickAnim - 14) / 4) * (1.065-(0.18)));
            zz = 0.67 + (((tickAnim - 14) / 4) * (0.2-(0.67)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.065 + (((tickAnim - 18) / 3) * (0.225-(1.065)));
            zz = 0.2 + (((tickAnim - 18) / 3) * (0.4-(0.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 21) / 2) * (-1.715-(0.225)));
            zz = 0.4 + (((tickAnim - 21) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = -1.715 + (((tickAnim - 23) / 3) * (-0.8-(-1.715)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -0.8 + (((tickAnim - 26) / 6) * (-0.5-(-0.8)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 32) / 6) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 15) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-150))*0.2), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-80))*0.1), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-140))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75+50))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-120))*0.1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-180))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-140))*-0.4), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-140))*0.1), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-230))*-1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-200))*-0.4), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-160))*0.1), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-260))*1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-250))*-0.6), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-190))*0.1), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-290))*1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-260))*-0.5), neck6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-230))*0.1), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-320))*1));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-300))*-0.7), neck7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-250))*-0.1), neck7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-350))*-1));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-320))*-0.7), neck8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-280))*0.1), neck8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-380))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/0.75-350))*-0.7), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-320))*0.1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*202/1.5-420))*1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSauroposeidon e = (EntityPrehistoricFloraSauroposeidon) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
