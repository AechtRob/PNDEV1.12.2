package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBajadasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBajadasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck1BoneLeft1;
    private final AdvancedModelRenderer neck1BoneRight1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck2BoneLeft1;
    private final AdvancedModelRenderer neck2BoneRight1;
    private final AdvancedModelRenderer neck2BoneLeft2;
    private final AdvancedModelRenderer neck2BoneRight2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck3BoneLeft1;
    private final AdvancedModelRenderer neck3BoneRight1;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck4Bone;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;

    private ModelAnimator animator;

    public ModelBajadasaurus() {
        this.textureWidth = 160;
        this.textureHeight = 159;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -2.0F, 7.0F);
        this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 35, -7.0F, -7.0F, -7.0F, 14, 18, 15, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -12.0F, 8.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 68, -2.5F, 0.0F, -18.0F, 5, 6, 18, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.2618F, 0.0F, -0.1745F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 92, -6.0F, -3.0F, -4.0F, 8, 17, 9, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.25F, 13.0F, -2.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1745F, 0.0F, 0.1745F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 88, 130, -4.75F, 0.0F, -1.75F, 6, 12, 5, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 11.5F, 1.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1745F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 68, 22, -5.25F, -1.0F, -3.5F, 7, 3, 6, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(-2.25F, -1.0F, -3.0F);
        this.leftFoot.addChild(leftToes);
        this.setRotateAngle(leftToes, 0.0F, -0.3054F, 0.0F);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 106, 84, -2.5F, 0.0F, -2.5F, 6, 3, 3, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.2618F, 0.0F, 0.1745F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 92, -2.0F, -3.0F, -4.0F, 8, 17, 9, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.25F, 13.0F, -2.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1745F, 0.0F, -0.1745F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 88, 130, -1.25F, 0.0F, -1.75F, 6, 12, 5, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 11.5F, 1.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1745F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 68, 22, -1.75F, -1.0F, -3.5F, 7, 3, 6, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(2.25F, -1.0F, -3.0F);
        this.rightFoot.addChild(rightToes);
        this.setRotateAngle(rightToes, 0.0F, 0.3054F, 0.0F);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 106, 84, -3.5F, 0.0F, -2.5F, 6, 3, 3, -0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 7.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 58, 65, -5.0F, -5.0F, -1.0F, 10, 11, 14, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.0F, 13.0F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 0, -2.0F, 0.0F, -17.0F, 4, 5, 17, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.0F, 12.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 90, -3.5F, -3.0F, -1.0F, 7, 7, 14, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -3.0F, 13.0F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 112, 19, -2.0F, 0.0F, -14.0F, 3, 3, 14, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 12.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 106, 65, -2.5F, -2.5F, -1.0F, 5, 5, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 12.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 111, -1.5F, -1.5F, -1.0F, 3, 4, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 12.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 118, -1.0F, -1.0F, -0.5F, 2, 3, 14, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1745F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 124, 110, -1.0F, -1.0F, -0.5F, 2, 2, 14, -0.01F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.5F, 13.25F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.1745F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 124, 126, -0.5F, -0.5F, -0.25F, 1, 1, 14, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 0.0F, 13.5F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.3491F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 32, 129, -0.5F, -0.5F, -0.25F, 1, 1, 14, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -6.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -9.5F, -5.0F, -14.0F, 19, 20, 15, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -11.0F, 1.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 90, -3.5F, 0.0F, -15.0F, 7, 6, 14, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -13.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 58, 35, -7.5F, -3.75F, -11.0F, 15, 18, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.75F, -11.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 110, 0, -2.5F, -4.0F, 0.0F, 5, 5, 14, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(7.5F, 11.25F, -6.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0436F, 0.0F, -0.0873F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 68, 111, -3.0F, -2.0F, -3.0F, 5, 12, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 9.0F, -0.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3927F, 0.0F, 0.0873F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 144, 64, -2.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 144, 46, -2.5F, -1.0F, -1.5F, 5, 5, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, 0.5F, -0.5F);
        this.leftHand.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.6109F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 31, 0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.5F, 11.25F, -6.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0436F, 0.0F, 0.0873F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 68, 111, -2.0F, -2.0F, -3.0F, 5, 12, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 9.0F, -0.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3927F, 0.0F, -0.0873F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 144, 64, -2.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 144, 46, -2.5F, -1.0F, -1.5F, 5, 5, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.5F, 0.5F, -0.5F);
        this.rightHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, -0.6109F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 31, -1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.75F, -9.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2618F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 88, 110, -3.5F, -3.0F, -9.5F, 7, 9, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.2F, -3.0F, -4.5F);
        this.neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0341F, 0.1439F, -0.2646F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 144, -0.5F, -4.0F, -3.0F, 2, 5, 9, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.2F, -3.0F, -4.5F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0341F, -0.1439F, 0.2646F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 144, -1.5F, -4.0F, -3.0F, 2, 5, 9, 0.0F, false));

        this.neck1BoneLeft1 = new AdvancedModelRenderer(this);
        this.neck1BoneLeft1.setRotationPoint(0.8655F, -7.0202F, 1.498F);
        this.neck1.addChild(neck1BoneLeft1);
        this.setRotateAngle(neck1BoneLeft1, -0.2523F, -0.1439F, 0.2646F);
        this.neck1BoneLeft1.cubeList.add(new ModelBox(neck1BoneLeft1, 112, 54, -1.0F, 0.0F, -9.0F, 2, 2, 9, -0.01F, false));

        this.neck1BoneRight1 = new AdvancedModelRenderer(this);
        this.neck1BoneRight1.setRotationPoint(-0.8655F, -7.0202F, 1.498F);
        this.neck1.addChild(neck1BoneRight1);
        this.setRotateAngle(neck1BoneRight1, -0.2523F, 0.1439F, -0.2646F);
        this.neck1BoneRight1.cubeList.add(new ModelBox(neck1BoneRight1, 112, 54, -1.0F, 0.0F, -9.0F, 2, 2, 9, -0.01F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -8.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 112, 36, -3.0F, -3.0F, -9.0F, 6, 8, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, -3.0F, 0.0F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 129, 0.0F, -6.0F, -10.0F, 2, 7, 11, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, -3.0F, 0.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3054F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 129, -2.0F, -6.0F, -10.0F, 2, 7, 11, 0.0F, false));

        this.neck2BoneLeft1 = new AdvancedModelRenderer(this);
        this.neck2BoneLeft1.setRotationPoint(1.0979F, -0.1389F, -2.0F);
        this.neck2.addChild(neck2BoneLeft1);
        this.setRotateAngle(neck2BoneLeft1, 0.0F, 0.0F, 0.3054F);
        this.neck2BoneLeft1.cubeList.add(new ModelBox(neck2BoneLeft1, 46, 144, -2.0F, -9.0F, -3.0F, 2, 6, 6, -0.01F, false));

        this.neck2BoneRight1 = new AdvancedModelRenderer(this);
        this.neck2BoneRight1.setRotationPoint(-1.0979F, -0.1389F, -2.0F);
        this.neck2.addChild(neck2BoneRight1);
        this.setRotateAngle(neck2BoneRight1, 0.0F, 0.0F, -0.3054F);
        this.neck2BoneRight1.cubeList.add(new ModelBox(neck2BoneRight1, 46, 144, 0.0F, -9.0F, -3.0F, 2, 6, 6, -0.01F, true));

        this.neck2BoneLeft2 = new AdvancedModelRenderer(this);
        this.neck2BoneLeft2.setRotationPoint(2.8505F, -9.023F, 1.0F);
        this.neck2.addChild(neck2BoneLeft2);
        this.setRotateAngle(neck2BoneLeft2, -0.3491F, 0.0F, 0.3054F);
        this.neck2BoneLeft2.cubeList.add(new ModelBox(neck2BoneLeft2, 130, 84, -1.0F, 0.0F, -11.0F, 2, 4, 11, -0.01F, false));

        this.neck2BoneRight2 = new AdvancedModelRenderer(this);
        this.neck2BoneRight2.setRotationPoint(-2.8505F, -9.023F, 1.0F);
        this.neck2.addChild(neck2BoneRight2);
        this.setRotateAngle(neck2BoneRight2, -0.3491F, 0.0F, -0.3054F);
        this.neck2BoneRight2.cubeList.add(new ModelBox(neck2BoneRight2, 130, 84, -1.0F, 0.0F, -11.0F, 2, 4, 11, -0.01F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5F, -8.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 135, -2.5F, -2.5F, -6.5F, 5, 7, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.0792F, -12.0372F, 0.1011F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3506F, -0.0429F, -0.3381F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 96, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.1655F, -12.0372F, -6.839F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.825F, -0.1248F, -0.3079F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 77, 0.0F, 0.0F, -3.0F, 2, 3, 3, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.0F, -2.5F, -0.25F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0396F, -0.1248F, -0.3079F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 110, 141, 0.0F, -10.0F, -6.25F, 2, 11, 7, 0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.2562F, -10.014F, -8.8589F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.5231F, -0.1248F, -0.3079F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 130, 99, 0.0F, 0.0F, -8.0F, 2, 3, 8, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.2562F, -10.014F, -8.8589F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.5231F, 0.1248F, 0.3079F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 130, 99, -2.0F, 0.0F, -8.0F, 2, 3, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.1655F, -12.0372F, -6.839F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.825F, 0.1248F, 0.3079F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 77, -2.0F, 0.0F, -3.0F, 2, 3, 3, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(5.0792F, -12.0372F, 0.1011F);
        this.neck3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3506F, 0.0429F, 0.3381F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 96, -2.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, -2.5F, -0.25F);
        this.neck3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0396F, 0.1248F, 0.3079F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 110, 141, -2.0F, -10.0F, -6.25F, 2, 11, 7, 0.01F, false));

        this.neck3BoneLeft1 = new AdvancedModelRenderer(this);
        this.neck3BoneLeft1.setRotationPoint(0.714F, 0.3611F, -3.1066F);
        this.neck3.addChild(neck3BoneLeft1);
        this.setRotateAngle(neck3BoneLeft1, 0.0396F, 0.1248F, 0.3079F);
        this.neck3BoneLeft1.cubeList.add(new ModelBox(neck3BoneLeft1, 128, 141, -2.0F, -13.0F, -3.25F, 2, 11, 7, 0.0F, false));

        this.neck3BoneRight1 = new AdvancedModelRenderer(this);
        this.neck3BoneRight1.setRotationPoint(-0.714F, 0.3611F, -3.1066F);
        this.neck3.addChild(neck3BoneRight1);
        this.setRotateAngle(neck3BoneRight1, 0.0396F, -0.1248F, -0.3079F);
        this.neck3BoneRight1.cubeList.add(new ModelBox(neck3BoneRight1, 128, 141, 0.0F, -13.0F, -3.25F, 2, 11, 7, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.0F, -6.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.3054F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 134, 54, -2.0F, -1.5F, -5.5F, 4, 4, 6, -0.01F, false));

        this.neck4Bone = new AdvancedModelRenderer(this);
        this.neck4Bone.setRotationPoint(0.0F, -1.5F, -5.5F);
        this.neck4.addChild(neck4Bone);
        this.setRotateAngle(neck4Bone, 0.7854F, 0.0F, 0.0F);
        this.neck4Bone.cubeList.add(new ModelBox(neck4Bone, 94, 22, -1.0F, 0.0F, 0.0F, 2, 4, 7, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-1.0F, 2.5F, -3.5F);
        this.neck4.addChild(throat);
        this.setRotateAngle(throat, -0.1309F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 144, 36, 0.0F, -1.5F, -3.0F, 2, 3, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.25F, -5.5F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 110, 130, -2.0F, -1.25F, -2.75F, 4, 3, 3, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.6449F, -2.4329F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 68, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.2597F, -5.094F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.48F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 83, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.7671F, -7.3058F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.7418F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 31, -1.0F, 0.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.2507F, -5.6328F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 77, -0.5F, -0.75F, -1.5F, 1, 1, 0, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 101, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 3.1039F, -7.1464F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2706F, -0.2527F, 0.0692F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 96, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 3.1039F, -7.1464F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2706F, 0.2527F, -0.0692F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 96, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.733F, -7.5646F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0785F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 107, -1.0F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.75F, -2.75F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4363F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 146, 24, -1.5F, -0.5F, -3.25F, 3, 1, 4, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.75F, -2.75F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.48F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 144, 76, -1.5F, -2.0F, -3.25F, 3, 2, 5, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 4.75F, -7.75F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 46, 88, -2.0F, -5.5F, 5.6F, 4, 1, 1, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -0.75F);
        this.head.addChild(jaw);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 2.2506F, -6.341F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.4013F, -0.2013F, -0.0846F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 42, 99, 0.0F, -0.25F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 2.2506F, -6.341F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4013F, 0.2013F, 0.0846F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 42, 99, 0.0F, -0.25F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.8875F, -5.2654F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3927F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 78, -0.5F, -1.25F, -0.75F, 1, 1, 0, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 146, 29, -1.5F, -1.4F, 0.9F, 3, 1, 4, -0.02F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 135, -1.0F, -1.4F, -1.0F, 2, 1, 2, -0.02F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 34, 104, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.8156F, -2.8765F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 34, 92, -1.5F, -2.0F, 0.0F, 3, 2, 2, -0.03F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.4329F, -1.9526F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3927F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 146, 19, -1.5F, 0.0F, -3.1F, 3, 1, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.3855F, -1.5197F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0611F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 68, 31, -1.5F, -1.0F, -2.9F, 3, 1, 3, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.4329F, -1.9526F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2618F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 46, 73, -2.0F, -2.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 110, 136, -2.0F, 0.0F, -2.0F, 4, 2, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.6F;
        this.hips.offsetX = 0.F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.48F;
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

        EntityPrehistoricFloraBajadasaurus Bajadasaurus = (EntityPrehistoricFloraBajadasaurus) e;

        boolean isBaby = Bajadasaurus.getJuvenile();

        if (isBaby) {
            this.neck3.scaleChildren = true;
            this.neck4.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck3.setScale(1.025F, 1.025F, 1.025F);
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck3.scaleChildren = true;
            this.neck4.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck3.setScale(1F, 1, 1F);
            this.neck4.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Bajadasaurus.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Bajadasaurus.getTravelSpeed()/2;

        if (!Bajadasaurus.isInWater()) {

            if (f3 == 0.0F || !Bajadasaurus.getIsMoving()) {
                if (Bajadasaurus.getAnimation() != Bajadasaurus.EAT_ANIMATION
                        && Bajadasaurus.getAnimation() != Bajadasaurus.DRINK_ANIMATION
                        && Bajadasaurus.getAnimation() != Bajadasaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Bajadasaurus.getAnimation() != Bajadasaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Bajadasaurus.getAnimation() != Bajadasaurus.EAT_ANIMATION
                    && Bajadasaurus.getAnimation() != Bajadasaurus.DRINK_ANIMATION
                    && Bajadasaurus.getAnimation() != Bajadasaurus.ATTACK_ANIMATION
                    && Bajadasaurus.getAnimation() != Bajadasaurus.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Bajadasaurus.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBajadasaurus ee = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
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
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 324;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = -0.5 + (((tickAnim - 71) / 228) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = -0.5 + (((tickAnim - 299) / 25) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 1.25 + (((tickAnim - 71) / 228) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 1.25 + (((tickAnim - 299) / 25) * (0-(1.25)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 1.25 + (((tickAnim - 71) / 228) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 1.25 + (((tickAnim - 299) / 25) * (0-(1.25)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125))), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-50))), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-100))), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-150))), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-200))*2), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-250))*2), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-300))*3), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*50/1.125-350))*3), tail8.rotateAngleY + (float) Math.toRadians(0), tail8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = -0.5 + (((tickAnim - 71) / 228) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = -0.5 + (((tickAnim - 299) / 25) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = -1.75 + (((tickAnim - 71) / 228) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = -1.75 + (((tickAnim - 299) / 25) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = -26.25 + (((tickAnim - 71) / 228) * (-26.25-(-26.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = -26.25 + (((tickAnim - 299) / 14) * (14.25-(-26.25)));
            yy = 0 + (((tickAnim - 299) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 14) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 324) {
            xx = 14.25 + (((tickAnim - 313) / 11) * (0-(14.25)));
            yy = 0 + (((tickAnim - 313) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-37.64-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = -37.64 + (((tickAnim - 27) / 44) * (12.25-(-37.64)));
            yy = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 12.25 + (((tickAnim - 71) / 228) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 12.25 + (((tickAnim - 299) / 14) * (-39.78-(12.25)));
            yy = 0 + (((tickAnim - 299) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 14) * (0-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 324) {
            xx = -39.78 + (((tickAnim - 313) / 11) * (0-(-39.78)));
            yy = 0 + (((tickAnim - 313) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 313) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (1.76-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.9-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            yy = 1.76 + (((tickAnim - 27) / 44) * (-0.625-(1.76)));
            zz = 0.9 + (((tickAnim - 27) / 44) * (0-(0.9)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            yy = -0.625 + (((tickAnim - 71) / 228) * (-0.625-(-0.625)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 299) / 14) * (0-(0)));
            yy = -0.625 + (((tickAnim - 299) / 14) * (2.01-(-0.625)));
            zz = 0 + (((tickAnim - 299) / 14) * (0.85-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 313) / 11) * (0-(0)));
            yy = 2.01 + (((tickAnim - 313) / 11) * (0-(2.01)));
            zz = 0.85 + (((tickAnim - 313) / 11) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (30.93-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 30.93 + (((tickAnim - 27) / 44) * (15.75-(30.93)));
            yy = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 15.75 + (((tickAnim - 71) / 228) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 15.75 + (((tickAnim - 299) / 14) * (54.68563-(15.75)));
            yy = 0 + (((tickAnim - 299) / 14) * (-0.37231-(0)));
            zz = 0 + (((tickAnim - 299) / 14) * (-8.35431-(0)));
        }
        else if (tickAnim >= 313 && tickAnim < 324) {
            xx = 54.68563 + (((tickAnim - 313) / 11) * (0-(54.68563)));
            yy = -0.37231 + (((tickAnim - 313) / 11) * (0-(-0.37231)));
            zz = -8.35431 + (((tickAnim - 313) / 11) * (0-(-8.35431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.15-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            yy = -0.925 + (((tickAnim - 71) / 228) * (-0.925-(-0.925)));
            zz = 0.15 + (((tickAnim - 71) / 228) * (0.15-(0.15)));
        }
        else if (tickAnim >= 299 && tickAnim < 313) {
            xx = 0 + (((tickAnim - 299) / 14) * (0-(0)));
            yy = -0.925 + (((tickAnim - 299) / 14) * (-0.055-(-0.925)));
            zz = 0.15 + (((tickAnim - 299) / 14) * (-0.405-(0.15)));
        }
        else if (tickAnim >= 313 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 313) / 11) * (0-(0)));
            yy = -0.055 + (((tickAnim - 313) / 11) * (0-(-0.055)));
            zz = -0.405 + (((tickAnim - 313) / 11) * (0-(-0.405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 3.5 + (((tickAnim - 71) / 228) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 3.5 + (((tickAnim - 299) / 25) * (0-(3.5)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 5.25 + (((tickAnim - 71) / 228) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 5.25 + (((tickAnim - 299) / 25) * (0-(5.25)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            yy = -0.55 + (((tickAnim - 71) / 228) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            yy = -0.55 + (((tickAnim - 299) / 25) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = -3.25 + (((tickAnim - 71) / 228) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 228) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = -3.25 + (((tickAnim - 299) / 25) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 299) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.15-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 299) {
            xx = 0 + (((tickAnim - 71) / 228) * (0-(0)));
            yy = -0.625 + (((tickAnim - 71) / 228) * (-0.625-(-0.625)));
            zz = 0.15 + (((tickAnim - 71) / 228) * (0.15-(0.15)));
        }
        else if (tickAnim >= 299 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 299) / 25) * (0-(0)));
            yy = -0.625 + (((tickAnim - 299) / 25) * (0-(-0.625)));
            zz = 0.15 + (((tickAnim - 299) / 25) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 0) / 94) * (-5.47123-(0)));
            yy = 0 + (((tickAnim - 0) / 94) * (-1.97578-(0)));
            zz = 0 + (((tickAnim - 0) / 94) * (0.46647-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -5.47123 + (((tickAnim - 94) / 9) * (-3.67123-(-5.47123)));
            yy = -1.97578 + (((tickAnim - 94) / 9) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 94) / 9) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = -3.67123 + (((tickAnim - 103) / 26) * (-10.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-3.67123)));
            yy = -1.97578 + (((tickAnim - 103) / 26) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 103) / 26) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = -10.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 129) / 29) * (-5.47123-(-10.0212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = -1.97578 + (((tickAnim - 129) / 29) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 129) / 29) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = -5.47123 + (((tickAnim - 158) / 10) * (-3.67123-(-5.47123)));
            yy = -1.97578 + (((tickAnim - 158) / 10) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 158) / 10) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = -3.67123 + (((tickAnim - 168) / 20) * (-3.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-3.67123)));
            yy = -1.97578 + (((tickAnim - 168) / 20) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 168) / 20) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = -3.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 188) / 27) * (-5.47123-(-3.7462+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = -1.97578 + (((tickAnim - 188) / 27) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 188) / 27) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = -5.47123 + (((tickAnim - 215) / 9) * (-3.67123-(-5.47123)));
            yy = -1.97578 + (((tickAnim - 215) / 9) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 215) / 9) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = -3.67123 + (((tickAnim - 224) / 21) * (-4.8962+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-3.67123)));
            yy = -1.97578 + (((tickAnim - 224) / 21) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 224) / 21) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = -4.8962+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 245) / 29) * (-5.47123-(-4.8962+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = -1.97578 + (((tickAnim - 245) / 29) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 245) / 29) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = -5.47123 + (((tickAnim - 274) / 9) * (-6.8212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(-5.47123)));
            yy = -1.97578 + (((tickAnim - 274) / 9) * (-1.97578-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 274) / 9) * (0.46647-(0.46647)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = -6.8212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 283) / 41) * (0-(-6.8212+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            yy = -1.97578 + (((tickAnim - 283) / 41) * (0-(-1.97578)));
            zz = 0.46647 + (((tickAnim - 283) / 41) * (0-(0.46647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = -1.25 + (((tickAnim - 67) / 27) * (9.5-(-1.25)));
            yy = 0 + (((tickAnim - 67) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = 9.5 + (((tickAnim - 94) / 35) * (0.75-(9.5)));
            yy = 0 + (((tickAnim - 94) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 35) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0.75 + (((tickAnim - 129) / 29) * (9.5-(0.75)));
            yy = 0 + (((tickAnim - 129) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = 9.5 + (((tickAnim - 158) / 30) * (-1.25-(9.5)));
            yy = 0 + (((tickAnim - 158) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 30) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = -1.25 + (((tickAnim - 188) / 27) * (9.5-(-1.25)));
            yy = 0 + (((tickAnim - 188) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = 9.5 + (((tickAnim - 215) / 30) * (0.75-(9.5)));
            yy = 0 + (((tickAnim - 215) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 30) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0.75 + (((tickAnim - 245) / 29) * (9.5-(0.75)));
            yy = 0 + (((tickAnim - 245) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = 9.5 + (((tickAnim - 274) / 50) * (0-(9.5)));
            yy = 0 + (((tickAnim - 274) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 67) / 27) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 67) / 27) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0.11551-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = -19.53196 + (((tickAnim - 94) / 35) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 94) / 35) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 94) / 35) * (0-(0.11551)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0.11551-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = -19.53196 + (((tickAnim - 158) / 30) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 158) / 30) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 158) / 30) * (0-(0.11551)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0.11551-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = -19.53196 + (((tickAnim - 215) / 30) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 215) / 30) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 215) / 30) * (0-(0.11551)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0.11551-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = -19.53196 + (((tickAnim - 274) / 50) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 274) / 50) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 274) / 50) * (0-(0.11551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2BoneLeft1, neck2BoneLeft1.rotateAngleX + (float) Math.toRadians(xx), neck2BoneLeft1.rotateAngleY + (float) Math.toRadians(yy), neck2BoneLeft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 67) / 27) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 67) / 27) * (0.275-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0.775-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = -0.125 + (((tickAnim - 94) / 35) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 94) / 35) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 94) / 35) * (0-(0.775)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (0.275-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0.775-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = -0.125 + (((tickAnim - 158) / 30) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 158) / 30) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 158) / 30) * (0-(0.775)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (0.275-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0.775-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = -0.125 + (((tickAnim - 215) / 30) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 215) / 30) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 215) / 30) * (0-(0.775)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (0.275-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0.775-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = -0.125 + (((tickAnim - 274) / 50) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 274) / 50) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 274) / 50) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2BoneLeft1.rotationPointX = this.neck2BoneLeft1.rotationPointX + (float)(xx);
        this.neck2BoneLeft1.rotationPointY = this.neck2BoneLeft1.rotationPointY - (float)(yy);
        this.neck2BoneLeft1.rotationPointZ = this.neck2BoneLeft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 67) / 27) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 67) / 27) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0.11551-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = -19.53196 + (((tickAnim - 94) / 35) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 94) / 35) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 94) / 35) * (0-(0.11551)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0.11551-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = -19.53196 + (((tickAnim - 158) / 30) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 158) / 30) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 158) / 30) * (0-(0.11551)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0.11551-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = -19.53196 + (((tickAnim - 215) / 30) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 215) / 30) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 215) / 30) * (0-(0.11551)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (-19.53196-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (3.40793-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0.11551-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = -19.53196 + (((tickAnim - 274) / 50) * (0-(-19.53196)));
            yy = 3.40793 + (((tickAnim - 274) / 50) * (0-(3.40793)));
            zz = 0.11551 + (((tickAnim - 274) / 50) * (0-(0.11551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2BoneRight1, neck2BoneRight1.rotateAngleX + (float) Math.toRadians(xx), neck2BoneRight1.rotateAngleY + (float) Math.toRadians(yy), neck2BoneRight1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 67) / 27) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 67) / 27) * (0.275-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0.775-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = -0.125 + (((tickAnim - 94) / 35) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 94) / 35) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 94) / 35) * (0-(0.775)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (0.275-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0.775-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = -0.125 + (((tickAnim - 158) / 30) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 158) / 30) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 158) / 30) * (0-(0.775)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (0.275-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0.775-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = -0.125 + (((tickAnim - 215) / 30) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 215) / 30) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 215) / 30) * (0-(0.775)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (0.275-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0.775-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = -0.125 + (((tickAnim - 274) / 50) * (0-(-0.125)));
            yy = 0.275 + (((tickAnim - 274) / 50) * (0-(0.275)));
            zz = 0.775 + (((tickAnim - 274) / 50) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2BoneRight1.rotationPointX = this.neck2BoneRight1.rotationPointX + (float)(xx);
        this.neck2BoneRight1.rotationPointY = this.neck2BoneRight1.rotationPointY - (float)(yy);
        this.neck2BoneRight1.rotationPointZ = this.neck2BoneRight1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = -1.75 + (((tickAnim - 67) / 27) * (-7-(-1.75)));
            yy = 0 + (((tickAnim - 67) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 129) {
            xx = -7 + (((tickAnim - 94) / 35) * (-2.5-(-7)));
            yy = 0 + (((tickAnim - 94) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 35) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = -2.5 + (((tickAnim - 129) / 29) * (-7-(-2.5)));
            yy = 0 + (((tickAnim - 129) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 188) {
            xx = -7 + (((tickAnim - 158) / 30) * (-1.75-(-7)));
            yy = 0 + (((tickAnim - 158) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 30) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = -1.75 + (((tickAnim - 188) / 27) * (-7-(-1.75)));
            yy = 0 + (((tickAnim - 188) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 245) {
            xx = -7 + (((tickAnim - 215) / 30) * (-2.5-(-7)));
            yy = 0 + (((tickAnim - 215) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 30) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = -2.5 + (((tickAnim - 245) / 29) * (-7-(-2.5)));
            yy = 0 + (((tickAnim - 245) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 324) {
            xx = -7 + (((tickAnim - 274) / 50) * (0-(-7)));
            yy = 0 + (((tickAnim - 274) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 67) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 27) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (-0.65-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 94) / 9) * (-0.43-(-0.525)));
            zz = -0.65 + (((tickAnim - 94) / 9) * (-0.395-(-0.65)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            yy = -0.43 + (((tickAnim - 103) / 26) * (-0.275-(-0.43)));
            zz = -0.395 + (((tickAnim - 103) / 26) * (-0.575-(-0.395)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (0-(0)));
            yy = -0.275 + (((tickAnim - 129) / 29) * (-0.525-(-0.275)));
            zz = -0.575 + (((tickAnim - 129) / 29) * (-0.65-(-0.575)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 158) / 10) * (-0.43-(-0.525)));
            zz = -0.65 + (((tickAnim - 158) / 10) * (-0.395-(-0.65)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            yy = -0.43 + (((tickAnim - 168) / 20) * (0-(-0.43)));
            zz = -0.395 + (((tickAnim - 168) / 20) * (0-(-0.395)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (-0.65-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 215) / 9) * (-0.43-(-0.525)));
            zz = -0.65 + (((tickAnim - 215) / 9) * (-0.395-(-0.65)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            yy = -0.43 + (((tickAnim - 224) / 21) * (-0.275-(-0.43)));
            zz = -0.395 + (((tickAnim - 224) / 21) * (-0.575-(-0.395)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (0-(0)));
            yy = -0.275 + (((tickAnim - 245) / 29) * (-0.525-(-0.275)));
            zz = -0.575 + (((tickAnim - 245) / 29) * (-0.65-(-0.575)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 274) / 9) * (-0.43-(-0.525)));
            zz = -0.65 + (((tickAnim - 274) / 9) * (-0.395-(-0.65)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            yy = -0.43 + (((tickAnim - 283) / 41) * (0-(-0.43)));
            zz = -0.395 + (((tickAnim - 283) / 41) * (0-(-0.395)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 94) {
            xx = -3.75 + (((tickAnim - 67) / 27) * (-13-(-3.75)));
            yy = 0 + (((tickAnim - 67) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 27) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -13 + (((tickAnim - 94) / 9) * (-13-(-13)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = -13 + (((tickAnim - 103) / 26) * (0-(-13)));
            yy = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 26) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (-13-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = -13 + (((tickAnim - 158) / 10) * (-13-(-13)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = -13 + (((tickAnim - 168) / 20) * (-3.75-(-13)));
            yy = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 20) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = -3.75 + (((tickAnim - 188) / 27) * (-13-(-3.75)));
            yy = 0 + (((tickAnim - 188) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = -13 + (((tickAnim - 215) / 9) * (-13-(-13)));
            yy = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 9) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = -13 + (((tickAnim - 224) / 21) * (0-(-13)));
            yy = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 21) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (-13-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = -13 + (((tickAnim - 274) / 9) * (-13-(-13)));
            yy = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 9) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = -13 + (((tickAnim - 283) / 41) * (0-(-13)));
            yy = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 0) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 94) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 94) * (-0.9-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 94) / 9) * (-0.15-(-0.15)));
            zz = -0.9 + (((tickAnim - 94) / 9) * (-0.725-(-0.9)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            yy = -0.15 + (((tickAnim - 103) / 26) * (0-(-0.15)));
            zz = -0.725 + (((tickAnim - 103) / 26) * (0-(-0.725)));
        }
        else if (tickAnim >= 129 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 129) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 129) / 29) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 129) / 29) * (-0.9-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            yy = -0.15 + (((tickAnim - 158) / 10) * (-0.15-(-0.15)));
            zz = -0.9 + (((tickAnim - 158) / 10) * (-0.725-(-0.9)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            yy = -0.15 + (((tickAnim - 168) / 20) * (0-(-0.15)));
            zz = -0.725 + (((tickAnim - 168) / 20) * (0-(-0.725)));
        }
        else if (tickAnim >= 188 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 188) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 27) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 188) / 27) * (-0.9-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 215) / 9) * (-0.15-(-0.15)));
            zz = -0.9 + (((tickAnim - 215) / 9) * (-0.725-(-0.9)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            yy = -0.15 + (((tickAnim - 224) / 21) * (0-(-0.15)));
            zz = -0.725 + (((tickAnim - 224) / 21) * (0-(-0.725)));
        }
        else if (tickAnim >= 245 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 245) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 29) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 245) / 29) * (-0.9-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 274) / 9) * (-0.15-(-0.15)));
            zz = -0.9 + (((tickAnim - 274) / 9) * (-0.725-(-0.9)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            yy = -0.15 + (((tickAnim - 283) / 41) * (0-(-0.15)));
            zz = -0.725 + (((tickAnim - 283) / 41) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = -6 + (((tickAnim - 67) / 16) * (-10.5-(-6)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = -10.5 + (((tickAnim - 83) / 11) * (-6-(-10.5)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -6 + (((tickAnim - 94) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = -6 + (((tickAnim - 103) / 26) * (-10.5-(-6)));
            yy = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 26) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 138) {
            xx = -10.5 + (((tickAnim - 129) / 9) * (-8.44-(-10.5)));
            yy = 0 + (((tickAnim - 129) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 9) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 147) {
            xx = -8.44 + (((tickAnim - 138) / 9) * (-10.5-(-8.44)));
            yy = 0 + (((tickAnim - 138) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 9) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = -10.5 + (((tickAnim - 147) / 5) * (-14.44-(-10.5)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 158) {
            xx = -14.44 + (((tickAnim - 152) / 6) * (-10.5-(-14.44)));
            yy = 0 + (((tickAnim - 152) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 6) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = -10.5 + (((tickAnim - 158) / 10) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = -10.5 + (((tickAnim - 168) / 20) * (-11.5-(-10.5)));
            yy = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 20) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 203) {
            xx = -11.5 + (((tickAnim - 188) / 15) * (-10.5-(-11.5)));
            yy = 0 + (((tickAnim - 188) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 15) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 215) {
            xx = -10.5 + (((tickAnim - 203) / 12) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 203) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 12) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = -10.5 + (((tickAnim - 215) / 9) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 9) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = -10.5 + (((tickAnim - 224) / 21) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 21) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -10.5 + (((tickAnim - 245) / 8) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 253) / 10) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 253) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 10) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = -10.5 + (((tickAnim - 263) / 11) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = -10.5 + (((tickAnim - 274) / 9) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 9) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = -10.5 + (((tickAnim - 283) / 41) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0.8-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            yy = -0.175 + (((tickAnim - 67) / 16) * (-0.02-(-0.175)));
            zz = 0.8 + (((tickAnim - 67) / 16) * (0.49-(0.8)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            yy = -0.02 + (((tickAnim - 83) / 11) * (-0.175-(-0.02)));
            zz = 0.49 + (((tickAnim - 83) / 11) * (0.8-(0.49)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            yy = -0.175 + (((tickAnim - 94) / 9) * (-0.175-(-0.175)));
            zz = 0.8 + (((tickAnim - 94) / 9) * (0.8-(0.8)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            yy = -0.175 + (((tickAnim - 103) / 26) * (-0.02-(-0.175)));
            zz = 0.8 + (((tickAnim - 103) / 26) * (0.49-(0.8)));
        }
        else if (tickAnim >= 129 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 129) / 18) * (0-(0)));
            yy = -0.02 + (((tickAnim - 129) / 18) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 129) / 18) * (0.49-(0.49)));
        }
        else if (tickAnim >= 147 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 147) / 11) * (0-(0)));
            yy = -0.02 + (((tickAnim - 147) / 11) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 147) / 11) * (0.49-(0.49)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            yy = -0.02 + (((tickAnim - 158) / 10) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 158) / 10) * (0.49-(0.49)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            yy = -0.02 + (((tickAnim - 168) / 20) * (-0.175-(-0.02)));
            zz = 0.49 + (((tickAnim - 168) / 20) * (0.8-(0.49)));
        }
        else if (tickAnim >= 188 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 188) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 188) / 15) * (-0.02-(-0.175)));
            zz = 0.8 + (((tickAnim - 188) / 15) * (0.49-(0.8)));
        }
        else if (tickAnim >= 203 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 203) / 12) * (0-(0)));
            yy = -0.02 + (((tickAnim - 203) / 12) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 203) / 12) * (0.49-(0.49)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            yy = -0.02 + (((tickAnim - 215) / 9) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 215) / 9) * (0.49-(0.49)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            yy = -0.02 + (((tickAnim - 224) / 21) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 224) / 21) * (0.49-(0.49)));
        }
        else if (tickAnim >= 245 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 245) / 18) * (0-(0)));
            yy = -0.02 + (((tickAnim - 245) / 18) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 245) / 18) * (0.49-(0.49)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            yy = -0.02 + (((tickAnim - 263) / 11) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 263) / 11) * (0.49-(0.49)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            yy = -0.02 + (((tickAnim - 274) / 9) * (-0.02-(-0.02)));
            zz = 0.49 + (((tickAnim - 274) / 9) * (0.49-(0.49)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            yy = -0.02 + (((tickAnim - 283) / 41) * (0-(-0.02)));
            zz = 0.49 + (((tickAnim - 283) / 41) * (0-(0.49)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = -8.5 + (((tickAnim - 67) / 16) * (-25-(-8.5)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = -25 + (((tickAnim - 83) / 11) * (-19.5-(-25)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 103) {
            xx = -19.5 + (((tickAnim - 94) / 9) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 94) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 9) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 129) {
            xx = -19.5 + (((tickAnim - 103) / 26) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 103) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 26) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 129) / 18) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 129) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 18) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 158) {
            xx = -16.25 + (((tickAnim - 147) / 11) * (-19.5-(-16.25)));
            yy = 0 + (((tickAnim - 147) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 11) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 168) {
            xx = -19.5 + (((tickAnim - 158) / 10) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 158) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 10) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 188) {
            xx = -19.5 + (((tickAnim - 168) / 20) * (-8.5-(-19.5)));
            yy = 0 + (((tickAnim - 168) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 20) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 203) {
            xx = -8.5 + (((tickAnim - 188) / 15) * (-25-(-8.5)));
            yy = 0 + (((tickAnim - 188) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 15) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 215) {
            xx = -25 + (((tickAnim - 203) / 12) * (-19.5-(-25)));
            yy = 0 + (((tickAnim - 203) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 12) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 224) {
            xx = -19.5 + (((tickAnim - 215) / 9) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 215) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 9) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 245) {
            xx = -19.5 + (((tickAnim - 224) / 21) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 224) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 21) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 245) / 18) * (-25-(0)));
            yy = 0 + (((tickAnim - 245) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 18) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = -25 + (((tickAnim - 263) / 11) * (-19.5-(-25)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 283) {
            xx = -19.5 + (((tickAnim - 274) / 9) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 274) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 9) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 324) {
            xx = -19.5 + (((tickAnim - 283) / 41) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 283) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 283) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 67) / 16) * (15.75-(0)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 15.75 + (((tickAnim - 83) / 11) * (0-(15.75)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 94) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 30) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 124) / 18) * (15.75-(0)));
            yy = 0 + (((tickAnim - 124) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 18) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 158) {
            xx = 15.75 + (((tickAnim - 142) / 16) * (0-(15.75)));
            yy = 0 + (((tickAnim - 142) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 16) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 158) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 158) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 5) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 169) {
            xx = 0 + (((tickAnim - 163) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 163) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 6) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 177) {
            xx = 5 + (((tickAnim - 169) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 169) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 8) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 177) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 177) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 6) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 183) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 183) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 15) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 211) {
            xx = 15.75 + (((tickAnim - 198) / 13) * (0-(15.75)));
            yy = 0 + (((tickAnim - 198) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 13) * (0-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 211) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 211) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 211) / 29) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 240) / 18) * (15.75-(0)));
            yy = 0 + (((tickAnim - 240) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 18) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 269) {
            xx = 15.75 + (((tickAnim - 258) / 11) * (0-(15.75)));
            yy = 0 + (((tickAnim - 258) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 11) * (0-(0)));
        }
        else if (tickAnim >= 269 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 269) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 269) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 269) / 9) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 278) / 7) * (5-(0)));
            yy = 0 + (((tickAnim - 278) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 7) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 293) {
            xx = 5 + (((tickAnim - 285) / 8) * (0-(5)));
            yy = 0 + (((tickAnim - 285) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 33 + (((tickAnim - 10) / 10) * (0-(33)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.5 + (((tickAnim - 10) / 10) * (0-(26.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-25.27548-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.48708-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.1738-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.27548 + (((tickAnim - 10) / 10) * (0-(-25.27548)));
            yy = 2.48708 + (((tickAnim - 10) / 10) * (0-(2.48708)));
            zz = -1.1738 + (((tickAnim - 10) / 10) * (0-(-1.1738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2BoneLeft1, neck2BoneLeft1.rotateAngleX + (float) Math.toRadians(xx), neck2BoneLeft1.rotateAngleY + (float) Math.toRadians(yy), neck2BoneLeft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.175 + (((tickAnim - 10) / 10) * (0-(0.175)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.125 + (((tickAnim - 10) / 10) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2BoneLeft1.rotationPointX = this.neck2BoneLeft1.rotationPointX + (float)(xx);
        this.neck2BoneLeft1.rotationPointY = this.neck2BoneLeft1.rotationPointY - (float)(yy);
        this.neck2BoneLeft1.rotationPointZ = this.neck2BoneLeft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-25.27548-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.48708-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.1738-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.27548 + (((tickAnim - 10) / 10) * (0-(-25.27548)));
            yy = -2.48708 + (((tickAnim - 10) / 10) * (0-(-2.48708)));
            zz = 1.1738 + (((tickAnim - 10) / 10) * (0-(1.1738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2BoneRight1, neck2BoneRight1.rotateAngleX + (float) Math.toRadians(xx), neck2BoneRight1.rotateAngleY + (float) Math.toRadians(yy), neck2BoneRight1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.125 + (((tickAnim - 10) / 10) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2BoneRight1.rotationPointX = this.neck2BoneRight1.rotationPointX + (float)(xx);
        this.neck2BoneRight1.rotationPointY = this.neck2BoneRight1.rotationPointY - (float)(yy);
        this.neck2BoneRight1.rotationPointZ = this.neck2BoneRight1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.38 + (((tickAnim - 5) / 5) * (1-(1.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (0-(1)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.25 + (((tickAnim - 5) / 5) * (-2.5-(-2.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 10) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4.33-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.33 + (((tickAnim - 8) / 2) * (0.5-(-4.33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 10) / 10) * (0-(0.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 5) / 3) * (-4.42-(26.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.42 + (((tickAnim - 8) / 2) * (-0.5-(-4.42)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 10) / 10) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (14.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 14.5 + (((tickAnim - 8) / 2) * (0-(14.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 24.25 + (((tickAnim - 20) / 15) * (-13.75-(24.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (0-(15)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (10.5-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (2.375-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 2.375 + (((tickAnim - 28) / 7) * (-0.825-(2.375)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 35) / 15) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 31 + (((tickAnim - 20) / 15) * (3.5-(31)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 15) * (-0.575-(0.6)));
            zz = -0.4 + (((tickAnim - 20) / 15) * (0-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.575 + (((tickAnim - 35) / 15) * (0-(-0.575)));
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



        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(0), leftToes.rotateAngleY + (float) Math.toRadians(0), leftToes.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 18) / 15) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10.5 + (((tickAnim - 33) / 17) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.05-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.925-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -8.05 + (((tickAnim - 18) / 15) * (-8.05-(-8.05)));
            zz = 1.925 + (((tickAnim - 18) / 15) * (1.925-(1.925)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -8.05 + (((tickAnim - 33) / 17) * (0-(-8.05)));
            zz = 1.925 + (((tickAnim - 33) / 17) * (0-(1.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.57292-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.06041-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.84393-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.57292 + (((tickAnim - 18) / 15) * (-17.57292-(-17.57292)));
            yy = -11.06041 + (((tickAnim - 18) / 15) * (-11.06041-(-11.06041)));
            zz = 0.84393 + (((tickAnim - 18) / 15) * (0.84393-(0.84393)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.57292 + (((tickAnim - 33) / 17) * (0-(-17.57292)));
            yy = -11.06041 + (((tickAnim - 33) / 17) * (0-(-11.06041)));
            zz = 0.84393 + (((tickAnim - 33) / 17) * (0-(0.84393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 15) * (2-(2)));
            zz = -0.525 + (((tickAnim - 18) / 15) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            zz = -0.525 + (((tickAnim - 33) / 17) * (0-(-0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 15) * (0.8-(0.8)));
            zz = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 17) * (0-(0.8)));
            zz = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.57292-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (11.06041-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.84393-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.57292 + (((tickAnim - 18) / 15) * (-17.57292-(-17.57292)));
            yy = 11.06041 + (((tickAnim - 18) / 15) * (11.06041-(11.06041)));
            zz = -0.84393 + (((tickAnim - 18) / 15) * (-0.84393-(-0.84393)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.57292 + (((tickAnim - 33) / 17) * (0-(-17.57292)));
            yy = 11.06041 + (((tickAnim - 33) / 17) * (0-(11.06041)));
            zz = -0.84393 + (((tickAnim - 33) / 17) * (0-(-0.84393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 53.25 + (((tickAnim - 18) / 15) * (53.25-(53.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 33) / 17) * (0-(53.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 15) * (2-(2)));
            zz = -0.525 + (((tickAnim - 18) / 15) * (-0.525-(-0.525)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            zz = -0.525 + (((tickAnim - 33) / 17) * (0-(-0.525)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.5 + (((tickAnim - 18) / 15) * (-23.5-(-23.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.5 + (((tickAnim - 33) / 17) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 15) * (0.8-(0.8)));
            zz = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 17) * (0-(0.8)));
            zz = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.25 + (((tickAnim - 18) / 15) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 33) / 17) * (0-(11.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.75 + (((tickAnim - 18) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.75 + (((tickAnim - 18) / 15) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 33) / 17) * (0-(5.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7.75 + (((tickAnim - 18) / 15) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 33) / 17) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.75 + (((tickAnim - 18) / 15) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.75 + (((tickAnim - 33) / 17) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 33) / 2) * (-13.39-(-9)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.39 + (((tickAnim - 35) / 15) * (0-(-13.39)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 10.5 + (((tickAnim - 18) / 3) * (5.75-(10.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 5.75 + (((tickAnim - 21) / 12) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 33) / 2) * (8.11-(5.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 8.11 + (((tickAnim - 35) / 3) * (0.34-(8.11)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.34 + (((tickAnim - 38) / 12) * (0-(0.34)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 15.25 + (((tickAnim - 18) / 3) * (17.25-(15.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 17.25 + (((tickAnim - 21) / 2) * (18.75-(17.25)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 18.75 + (((tickAnim - 23) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 33) / 2) * (19.68-(18.75)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 19.68 + (((tickAnim - 35) / 3) * (17.71-(19.68)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.71 + (((tickAnim - 38) / 4) * (-4.51-(17.71)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -4.51 + (((tickAnim - 42) / 4) * (-8.26-(-4.51)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -8.26 + (((tickAnim - 46) / 4) * (0-(-8.26)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.25 + (((tickAnim - 18) / 15) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 33) / 17) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 18) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 33) / 17) * (0-(7.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 18) / 15) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 33) / 17) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 18) / 15) * (1.1-(1.1)));
            zz = 0.3 + (((tickAnim - 18) / 15) * (0.3-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 17) * (0-(1.1)));
            zz = 0.3 + (((tickAnim - 33) / 17) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 18) / 15) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 33) / 17) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -23.75 + (((tickAnim - 18) / 15) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 33) / 17) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 18) / 15) * (1.1-(1.1)));
            zz = 0.3 + (((tickAnim - 18) / 15) * (0.3-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.1 + (((tickAnim - 33) / 17) * (0-(1.1)));
            zz = 0.3 + (((tickAnim - 33) / 17) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 33) / 17) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.75 + (((tickAnim - 18) / 15) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 33) / 17) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 15.75 + (((tickAnim - 18) / 15) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 33) / 17) * (0-(15.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 18) / 15) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 33) / 17) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2-(0)));
            yy = -3.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5-(-3.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.39852-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2 + (((tickAnim - 15) / 15) * (0-(-1.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*2)));
            yy = -2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5 + (((tickAnim - 15) / 15) * (0-(-2.8122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*0.5)));
            zz = -0.39852 + (((tickAnim - 15) / 15) * (0-(-0.39852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5 + (((tickAnim - 15) / 15) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5)));
            yy = -2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 15) / 15) * (0-(-2.0122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-4.24728-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2 + (((tickAnim - 15) / 15) * (0-(0.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+120))*2)));
            yy = -0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 15) / 15) * (0-(-0.4122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            zz = -4.24728 + (((tickAnim - 15) / 15) * (0-(-4.24728)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7-(0)));
            yy = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.4586-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7 + (((tickAnim - 15) / 15) * (0-(5.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+160))*7)));
            yy = -0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2 + (((tickAnim - 15) / 15) * (0-(-0.7372+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*2)));
            zz = -2.4586 + (((tickAnim - 15) / 15) * (0-(-2.4586)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-11.45-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.45 + (((tickAnim - 15) / 5) * (-22.9-(-11.45)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -22.9 + (((tickAnim - 20) / 10) * (0-(-22.9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5-(0)));
            yy = -3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075 + (((tickAnim - 0) / 15) * (-9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-3.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-4.075)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5 + (((tickAnim - 15) / 15) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*5)));
            yy = -9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 15) / 15) * (0-(-9.9622+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (16.9-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 16.9 + (((tickAnim - 15) / 5) * (29.77-(16.9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.77 + (((tickAnim - 20) / 10) * (0-(29.77)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*-0.5);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -4.5 + (((tickAnim - 0) / 11) * (27.75-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 27.75 + (((tickAnim - 11) / 7) * (-12.75-(27.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -12.75 + (((tickAnim - 18) / 5) * (-4.5-(-12.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.25 + (((tickAnim - 0) / 11) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (2.04-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 2.04 + (((tickAnim - 14) / 3) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -1.9 + (((tickAnim - 17) / 1) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 18) / 5) * (3.25-(7)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (2.72-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 2.72 + (((tickAnim - 14) / 4) * (-1.45-(2.72)));
            zz = -0.25 + (((tickAnim - 14) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.45 + (((tickAnim - 18) / 5) * (0-(-1.45)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.5 + (((tickAnim - 0) / 6) * (6.75-(0.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 6.75 + (((tickAnim - 6) / 5) * (19.75-(6.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 19.75 + (((tickAnim - 11) / 3) * (12-(19.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 12 + (((tickAnim - 14) / 3) * (0-(12)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (6.5-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 6.5 + (((tickAnim - 18) / 5) * (0.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 11) * (0-(0.1)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 17) / 1) * (-0.275-(0.2)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 5) * (0.1-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -22.75 + (((tickAnim - 11) / 3) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
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
            xx = 27.75 + (((tickAnim - 0) / 7) * (-12.75-(27.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = -12.75 + (((tickAnim - 7) / 16) * (27.75-(-12.75)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2.04-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.04 + (((tickAnim - 3) / 3) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.9 + (((tickAnim - 6) / 1) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 7 + (((tickAnim - 7) / 16) * (0-(7)));
            yy = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.72-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 2.72 + (((tickAnim - 3) / 4) * (-1.05-(2.72)));
            zz = -0.25 + (((tickAnim - 3) / 4) * (0.5-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            yy = -1.05 + (((tickAnim - 7) / 16) * (0-(-1.05)));
            zz = 0.5 + (((tickAnim - 7) / 16) * (0-(0.5)));
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
            xx = 19.75 + (((tickAnim - 0) / 3) * (12-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 3) / 3) * (0-(12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (8.5-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 8.5 + (((tickAnim - 7) / 7) * (0.80467-(8.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0.72753-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (1.68323-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0.80467 + (((tickAnim - 14) / 9) * (19.75-(0.80467)));
            yy = 0.72753 + (((tickAnim - 14) / 9) * (0-(0.72753)));
            zz = 1.68323 + (((tickAnim - 14) / 9) * (0-(1.68323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.45 + (((tickAnim - 6) / 1) * (-0.7-(-0.45)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 7) / 3) * (0.935-(-0.7)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.935 + (((tickAnim - 10) / 4) * (-0.27-(0.935)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = -0.27 + (((tickAnim - 14) / 9) * (0-(-0.27)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
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
            xx = -22.75 + (((tickAnim - 0) / 3) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+50))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+100))*-0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*0.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+150))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+200))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+250))*-4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+350))*-5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*15), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*8));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+420))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-400))*18), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+50))*1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.49907 + (((tickAnim - 0) / 3) * (-24.5-(-9.49907)));
            yy = -0.06106 + (((tickAnim - 0) / 3) * (0-(-0.06106)));
            zz = -1.74893 + (((tickAnim - 0) / 3) * (0-(-1.74893)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = -24.5 + (((tickAnim - 3) / 15) * (29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-24.5)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 18) / 5) * (-9.49907-(29+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-1.74893-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 0) / 3) * (8.25-(-23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 1.32509 + (((tickAnim - 0) / 3) * (0-(1.32509)));
            zz = 1.49818 + (((tickAnim - 0) / 3) * (0-(1.49818)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 8.25 + (((tickAnim - 3) / 8) * (9.66-(8.25)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 9.66 + (((tickAnim - 11) / 7) * (0-(9.66)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (1.0923+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (1.49818-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 3) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 0) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 15) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 3) / 15) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.2-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.75 + (((tickAnim - 0) / 3) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 9.75 + (((tickAnim - 3) / 8) * (-4.87-(9.75)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -4.87 + (((tickAnim - 11) / 7) * (23-(-4.87)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 18) / 5) * (41.75-(23)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (-0.975-(0.8)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.975 + (((tickAnim - 3) / 4) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.615-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -0.615 + (((tickAnim - 11) / 3) * (-1.61-(-0.615)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -1.61 + (((tickAnim - 14) / 4) * (0-(-1.61)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.8-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 7) / 4) * (-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (1.74893-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 11) / 2) * (-24.5-(-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.06106 + (((tickAnim - 11) / 2) * (0-(-0.06106)));
            zz = 1.74893 + (((tickAnim - 11) / 2) * (0-(1.74893)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -24.5 + (((tickAnim - 13) / 10) * (6.75-(-24.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 0) / 7) * (0-(2.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-1.49818-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55 + (((tickAnim - 11) / 2) * (8.25-(40.5173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55)));
            yy = 1.32509 + (((tickAnim - 11) / 2) * (0-(1.32509)));
            zz = -1.49818 + (((tickAnim - 11) / 2) * (0-(-1.49818)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.25 + (((tickAnim - 13) / 5) * (1-(8.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (2.5-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (1.2-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.075-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.2 + (((tickAnim - 11) / 2) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 11) / 2) * (0-(0.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 10) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 23 + (((tickAnim - 7) / 4) * (41.75-(23)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 41.75 + (((tickAnim - 11) / 2) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 9.75 + (((tickAnim - 13) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 7) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.8-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 11) / 2) * (-0.825-(0.8)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 13) / 10) * (-0.85-(-0.825)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*3), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*1), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-300))*2), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*0.5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*1), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBajadasaurus entity = (EntityPrehistoricFloraBajadasaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-0.2);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 0) / 20) * (25.25-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 25.25 + (((tickAnim - 20) / 14) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -12.75 + (((tickAnim - 34) / 6) * (-4.5-(-12.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 0) / 20) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (2.04-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 2.04 + (((tickAnim - 26) / 6) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -1.9 + (((tickAnim - 32) / 2) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 34) / 6) * (3.25-(7)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (2.72-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 2.72 + (((tickAnim - 26) / 8) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 26) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 34) / 6) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 0) / 10) * (-10-(0.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 10) / 10) * (19.75-(-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 19.75 + (((tickAnim - 20) / 6) * (12-(19.75)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 12 + (((tickAnim - 26) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (6.5-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 34) / 6) * (0.5-(6.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 20) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 32) / 8) * (-0.525-(-0.45)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -42.75 + (((tickAnim - 20) / 7) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0.975 + (((tickAnim - 20) / 7) * (0-(0.975)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 25.25 + (((tickAnim - 0) / 14) * (-12.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = -12.75 + (((tickAnim - 14) / 26) * (25.25-(-12.75)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.04-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 2.04 + (((tickAnim - 6) / 6) * (-1.9-(2.04)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.9 + (((tickAnim - 12) / 2) * (7-(-1.9)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 14) / 26) * (0-(7)));
            yy = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.72-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 2.72 + (((tickAnim - 6) / 8) * (-0.675-(2.72)));
            zz = -0.25 + (((tickAnim - 6) / 8) * (0-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 14) / 26) * (0-(0)));
            yy = -0.675 + (((tickAnim - 14) / 26) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 14) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.75 + (((tickAnim - 0) / 6) * (12-(19.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 12 + (((tickAnim - 6) / 6) * (0-(12)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (6.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 6.5 + (((tickAnim - 14) / 12) * (-7.25-(6.5)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = -7.25 + (((tickAnim - 26) / 14) * (19.75-(-7.25)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 12) / 14) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 14) * (0.055-(-0.45)));
            zz = 0 + (((tickAnim - 12) / 14) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0.055 + (((tickAnim - 26) / 14) * (0-(0.055)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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
            xx = -42.75 + (((tickAnim - 0) / 7) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (-42.75-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
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
            zz = 0.975 + (((tickAnim - 0) / 7) * (0-(0.975)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 12) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0.975-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+50))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+100))*-0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*0.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+150))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+200))*2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+250))*-4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*5));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+350))*-5), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*15), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*8));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+420))*10), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*18), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.49907 + (((tickAnim - 0) / 5) * (-19.5-(-9.49907)));
            yy = -0.06106 + (((tickAnim - 0) / 5) * (0-(-0.06106)));
            zz = -1.74893 + (((tickAnim - 0) / 5) * (0-(-1.74893)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = -19.5 + (((tickAnim - 5) / 28) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-19.5)));
            yy = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 33) / 7) * (-9.49907-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 33) / 7) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (-1.74893-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 0) / 5) * (8.25-(-23.982673927+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 1.32509 + (((tickAnim - 0) / 5) * (0-(1.32509)));
            zz = 1.49818 + (((tickAnim - 0) / 5) * (0-(1.49818)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 5) / 28) * (0-(8.25)));
            yy = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-54.5327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (1.49818-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 0) / 5) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 0) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 5) / 28) * (0-(0)));
            yy = -0.425 + (((tickAnim - 5) / 28) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 5) / 28) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (1.2-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 41.75 + (((tickAnim - 0) / 5) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 19) {
            xx = 9.75 + (((tickAnim - 5) / 14) * (-4.87-(9.75)));
            yy = 0 + (((tickAnim - 5) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 14) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = -4.87 + (((tickAnim - 19) / 14) * (23-(-4.87)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 23 + (((tickAnim - 33) / 7) * (41.75-(23)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 5) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.375 + (((tickAnim - 5) / 7) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0.185-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = 0.185 + (((tickAnim - 19) / 7) * (-0.335-(0.185)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.335 + (((tickAnim - 26) / 7) * (0-(-0.335)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
            xx = 2.25 + (((tickAnim - 0) / 12) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(2.25)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 12) / 7) * (-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 12) / 7) * (-0.06106-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (1.74893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 19) / 5) * (-23.25-(-34.2491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -0.06106 + (((tickAnim - 19) / 5) * (0-(-0.06106)));
            zz = 1.74893 + (((tickAnim - 19) / 5) * (0-(1.74893)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -23.25 + (((tickAnim - 24) / 16) * (2.25-(-23.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (1.32509-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (-1.49818-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55 + (((tickAnim - 19) / 5) * (8.25-(21.3423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+10))*-55)));
            yy = 1.32509 + (((tickAnim - 19) / 5) * (0-(1.32509)));
            zz = -1.49818 + (((tickAnim - 19) / 5) * (0-(-1.49818)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 24) / 16) * (0-(8.25)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (1.2-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0.075-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 19) / 5) * (-0.425-(1.2)));
            zz = 0.075 + (((tickAnim - 19) / 5) * (0-(0.075)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.425 + (((tickAnim - 24) / 16) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 12) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 23 + (((tickAnim - 12) / 7) * (41.75-(23)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 41.75 + (((tickAnim - 19) / 5) * (9.75-(41.75)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 9.75 + (((tickAnim - 24) / 16) * (0-(9.75)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 12) * (-0.65-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = -0.65 + (((tickAnim - 12) / 7) * (0.8-(-0.65)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 19) / 5) * (-0.375-(0.8)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            yy = -0.375 + (((tickAnim - 24) / 16) * (-0.55-(-0.375)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*-1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*1), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*0.5), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-0.5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), head.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBajadasaurus e = (EntityPrehistoricFloraBajadasaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
//        animator.startKeyframe(8);
//        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaws, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(12);
//        animator.resetKeyframe(10);

    }
}
