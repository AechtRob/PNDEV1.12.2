package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLiaoningotitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLiaoningotitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelLiaoningotitan() {
        this.textureWidth = 168;
        this.textureHeight = 162;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.hips.cubeList.add(new ModelBox(hips, 58, 69, -7.0F, -5.5F, -6.0F, 14, 17, 15, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.5F, 9.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 102, -6.0F, 0.0F, -15.0F, 12, 5, 15, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0436F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 106, 126, -3.0F, -2.0F, -3.0F, 6, 17, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.2618F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 130, 20, -2.5F, -1.0F, -2.5F, 5, 13, 6, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 10.25F, 1.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2182F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 22, 147, -3.0F, 0.0F, -3.5F, 6, 3, 6, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.leftFoot.addChild(leftToes);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 106, 26, -2.5F, 0.0F, -2.0F, 5, 3, 3, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0436F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 106, 126, -3.0F, -2.0F, -3.0F, 6, 17, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 14.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.2618F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 130, 20, -2.5F, -1.0F, -2.5F, 5, 13, 6, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 10.25F, 1.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.2182F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 22, 147, -3.0F, 0.0F, -3.5F, 6, 3, 6, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.rightFoot.addChild(rightToes);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 106, 26, -2.5F, 0.0F, -2.0F, 5, 3, 3, -0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 8.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 116, 77, -5.0F, -3.5F, -1.0F, 10, 12, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 8.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 129, -3.0F, -3.4F, 0.0F, 6, 8, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 72, 54, -1.5F, -2.4F, -1.0F, 3, 5, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 80, 151, 0.0F, -4.4F, 2.0F, 0, 2, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 8.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 130, 39, -1.0F, -1.4F, -0.5F, 2, 3, 10, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 64, 151, 0.0F, -4.4F, 1.75F, 0, 3, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.35F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 134, 126, -0.5F, -1.05F, -0.5F, 1, 2, 11, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 46, 147, 0.0F, -4.05F, 1.75F, 0, 3, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.55F, 10.25F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 134, 139, -0.5F, -0.5F, -0.25F, 1, 1, 11, -0.01F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 150, 99, 0.0F, -2.5F, 1.5F, 0, 2, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.75F, -2.5F);
        this.hips.addChild(body);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, 2.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 34, -9.0F, 0.0F, -14.0F, 18, 9, 11, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.0F, -9.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 34, -11.0F, -5.0F, -6.0F, 22, 21, 14, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.0F, -12.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.1309F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -4.7F, 1.75F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 0, -7.0F, 0.25F, -10.0F, 13, 14, 12, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 15.1841F, -14.3082F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.1345F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 116, 54, -8.0F, 0.0F, 0.0F, 15, 15, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 6.0F, -13.5F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -9.0F, -5.0F, -2.0F, 17, 14, 20, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(7.5F, 14.0F, -7.75F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.1745F, 0.0F, 0.0873F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 72, 129, -3.0F, -2.0F, -3.0F, 6, 16, 6, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 13.5F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2618F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 98, 54, -2.0F, -1.5F, -2.5F, 4, 8, 5, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, -0.0873F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 150, 110, -2.5F, -0.5F, -2.0F, 5, 5, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, 2.5F, -0.5F);
        this.leftHand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, -0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 124, 24, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.5F, 14.0F, -7.75F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1745F, 0.0F, -0.0873F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 72, 129, -3.0F, -2.0F, -3.0F, 6, 16, 6, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 13.5F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2618F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 98, 54, -2.0F, -1.5F, -2.5F, 4, 8, 5, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0873F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 150, 110, -2.5F, -0.5F, -2.0F, 5, 5, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, 2.5F, -0.5F);
        this.rightHand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 124, 24, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.7854F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 69, -5.0F, -7.0F, -14.0F, 10, 14, 19, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 58, 101, -4.0F, -9.0F, -15.0F, 8, 12, 16, 0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.0F, -14.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 106, 101, -3.5F, -7.0F, -14.0F, 7, 10, 15, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.0F, -13.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 122, -3.0F, -6.0F, -13.0F, 6, 8, 14, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2182F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 124, 0, -2.5F, -5.0F, -12.0F, 5, 7, 13, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -2.0F, -11.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.48F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 0, 144, -2.0F, -3.0F, -6.5F, 4, 5, 7, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.neck6.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 90, 26, -1.5F, -1.25F, -3.0F, 3, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -5.5F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 74, 26, -2.5F, -2.25F, -2.5F, 5, 4, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -2.5239F, -3.0841F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.7104F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 132, -1.5F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -2.316F, -4.0622F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.3614F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 122, 31, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.1215F, -3.6331F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2705F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 110, 66, -1.5F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.1339F, -5.0473F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7941F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 22, -1.5F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0735F, -5.5022F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.1432F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 122, 26, -1.5F, -4.0F, 0.0F, 3, 4, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.9025F, -6.0614F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.5934F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 124, 99, -1.5F, -1.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.2558F, -4.9469F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 129, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.7359F, -5.1524F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 124, 20, -1.0F, -0.5F, -0.75F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.9859F, -5.1524F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 116, 99, -1.5F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.75F, -2.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 150, 119, -2.0F, -1.0F, -2.75F, 4, 2, 3, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -1.0F, -1.75F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 106, 32, -2.5F, -0.5F, -0.5F, 5, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 122, -2.5F, 0.1F, -2.3F, 5, 2, 3, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.8588F, -4.4156F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5236F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 48, 127, -1.5F, -0.25F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.8892F, -4.4432F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 130, 52, -1.0F, -1.25F, -0.75F, 2, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 127, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 2.0F, -2.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 94, 151, -1.5F, -1.0F, -2.65F, 4, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.6011F, -2.9729F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.1868F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 98, 66, -1.5F, -0.25F, -0.55F, 4, 1, 2, -0.03F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.0F, -2.5F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.7069F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 108, 151, -1.5F, 0.15F, -2.8F, 4, 1, 3, -0.02F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);

        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.04F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.hips.offsetY = -0.155F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.2F;
        this.hips.offsetX = 0.2F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
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

        EntityPrehistoricFloraLiaoningotitan Liaoningotitan = (EntityPrehistoricFloraLiaoningotitan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Liaoningotitan.getJuvenile();

        if (isBaby) {
            this.neck5.scaleChildren = true;
            this.neck6.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.neck6.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1F, 1, 1F);
            this.neck6.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Liaoningotitan.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Liaoningotitan.getTravelSpeed()/2;

        if (!Liaoningotitan.isInWater()) {

            if (f3 == 0.0F || !Liaoningotitan.getIsMoving()) {
                if (Liaoningotitan.getAnimation() != Liaoningotitan.EAT_ANIMATION
                        && Liaoningotitan.getAnimation() != Liaoningotitan.DRINK_ANIMATION
                        && Liaoningotitan.getAnimation() != Liaoningotitan.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Liaoningotitan.getAnimation() != Liaoningotitan.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Liaoningotitan.getAnimation() != Liaoningotitan.EAT_ANIMATION
                    && Liaoningotitan.getAnimation() != Liaoningotitan.DRINK_ANIMATION
                    && Liaoningotitan.getAnimation() != Liaoningotitan.ATTACK_ANIMATION
                    && Liaoningotitan.getAnimation() != Liaoningotitan.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Liaoningotitan.getIsFast()) { //Running
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
        EntityPrehistoricFloraLiaoningotitan ee = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.75 + (((tickAnim - 40) / 111) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.75 + (((tickAnim - 151) / 29) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = -1.75 + (((tickAnim - 40) / 111) * (-1.75-(-1.75)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = -1.75 + (((tickAnim - 151) / 29) * (0-(-1.75)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 6.75 + (((tickAnim - 40) / 111) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 151) / 29) * (0-(6.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.5 + (((tickAnim - 40) / 111) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 151) / 29) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 111) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -0.5 + (((tickAnim - 151) / 29) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -2.75 + (((tickAnim - 40) / 111) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -2.75 + (((tickAnim - 151) / 29) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 6.75 + (((tickAnim - 40) / 111) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 151) / 29) * (0-(6.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(0);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(0);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -1.5 + (((tickAnim - 40) / 111) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -1.5 + (((tickAnim - 151) / 29) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 111) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -0.5 + (((tickAnim - 151) / 29) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -2.75 + (((tickAnim - 40) / 111) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -2.75 + (((tickAnim - 151) / 29) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(0);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(0);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-50))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*1)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-200))*2)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3 + (((tickAnim - 40) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3 + (((tickAnim - 140) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-250))*3)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -11 + (((tickAnim - 40) / 111) * (-11-(-11)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = -11 + (((tickAnim - 151) / 14) * (20.09-(-11)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 20.09 + (((tickAnim - 165) / 15) * (0-(20.09)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 20) / 20) * (0-(2.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 151) / 14) * (-50-(0)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = -50 + (((tickAnim - 165) / 15) * (0-(-50)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.565-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.565 + (((tickAnim - 20) / 20) * (-1.325-(0.565)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -1.325 + (((tickAnim - 40) / 111) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            yy = -1.325 + (((tickAnim - 151) / 14) * (1.045-(-1.325)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 1.045 + (((tickAnim - 165) / 15) * (0-(1.045)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (53.13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 53.13 + (((tickAnim - 20) / 20) * (12.75-(53.13)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 12.75 + (((tickAnim - 40) / 111) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 12.75 + (((tickAnim - 151) / 14) * (53.81-(12.75)));
            yy = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 14) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 53.81 + (((tickAnim - 165) / 15) * (0-(53.81)));
            yy = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.93-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.93 + (((tickAnim - 20) / 20) * (-0.15-(0.93)));
            zz = -0.975 + (((tickAnim - 20) / 20) * (0-(-0.975)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 111) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 151) / 14) * (0-(0)));
            yy = -0.15 + (((tickAnim - 151) / 14) * (0.87-(-0.15)));
            zz = 0 + (((tickAnim - 151) / 14) * (-0.975-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 165) / 15) * (0-(0)));
            yy = 0.87 + (((tickAnim - 165) / 15) * (0-(0.87)));
            zz = -0.975 + (((tickAnim - 165) / 15) * (0-(-0.975)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 9.5 + (((tickAnim - 40) / 111) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 9.5 + (((tickAnim - 151) / 29) * (0-(9.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = -5.5 + (((tickAnim - 40) / 111) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = -5.5 + (((tickAnim - 151) / 29) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 40) / 111) * (0-(0)));
            yy = -1.15 + (((tickAnim - 40) / 111) * (-1.15-(-1.15)));
            zz = 0 + (((tickAnim - 40) / 111) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = -1.15 + (((tickAnim - 151) / 29) * (0-(-1.15)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 180) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 8.75 + (((tickAnim - 40) / 5) * (-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(8.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = -0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 45) / 36) * (9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10-(-0.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10 + (((tickAnim - 81) / 29) * (8.75-(9.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*10)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 8.75 + (((tickAnim - 110) / 5) * (-1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(8.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = -1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 115) / 65) * (0-(-1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.225-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 1.225 + (((tickAnim - 40) / 70) * (1.225-(1.225)));
            zz = -1 + (((tickAnim - 40) / 70) * (-1-(-1)));
        }
        else if (tickAnim >= 110 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 110) / 70) * (0-(0)));
            yy = 1.225 + (((tickAnim - 110) / 70) * (0-(1.225)));
            zz = -1 + (((tickAnim - 110) / 70) * (0-(-1)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 40) / 5) * (4.75-(5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = 4.75 + (((tickAnim - 45) / 36) * (0-(4.75)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (5.5-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 5.5 + (((tickAnim - 110) / 5) * (4.75-(5.5)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = 4.75 + (((tickAnim - 115) / 65) * (0-(4.75)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -2 + (((tickAnim - 40) / 5) * (-0.5-(-2)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = -0.5 + (((tickAnim - 45) / 36) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (-2-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -2 + (((tickAnim - 110) / 5) * (-0.5-(-2)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 180) {
            xx = -0.5 + (((tickAnim - 115) / 65) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 115) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 65) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 81) {
            xx = 1.75 + (((tickAnim - 45) / 36) * (0-(1.75)));
            yy = 0 + (((tickAnim - 45) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 36) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 110) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 151) {
            xx = 1.75 + (((tickAnim - 115) / 36) * (0-(1.75)));
            yy = 0 + (((tickAnim - 115) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 36) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 0) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 81) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 81) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 99) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15.75 + (((tickAnim - 40) / 5) * (-15.62-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -15.62 + (((tickAnim - 45) / 10) * (12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(-15.62)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = 12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 55) / 26) * (5.95-(12.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 26) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 5.95 + (((tickAnim - 81) / 29) * (-15.75-(5.95)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -15.75 + (((tickAnim - 110) / 5) * (-15.62-(-15.75)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -15.62 + (((tickAnim - 115) / 10) * (-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(-15.62)));
            yy = 0 + (((tickAnim - 115) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 180) {
            xx = -1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 125) / 55) * (0-(-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = 0 + (((tickAnim - 125) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -20.25 + (((tickAnim - 40) / 5) * (-14.69-(-20.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -14.69 + (((tickAnim - 45) / 10) * (0-(-14.69)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 26) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 81) / 29) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 81) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 29) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -20.25 + (((tickAnim - 110) / 5) * (-14.69-(-20.25)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 151) {
            xx = -14.69 + (((tickAnim - 115) / 36) * (0-(-14.69)));
            yy = 0 + (((tickAnim - 115) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 36) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 151) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 19.25 + (((tickAnim - 40) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 45) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 50) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 19.25 + (((tickAnim - 110) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
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
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 18) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 18) / 15) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 33) / 17) * (0-(0.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 29 + (((tickAnim - 18) / 15) * (29-(29)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 33) / 17) * (0-(29)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0.75 + (((tickAnim - 18) / 15) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 33) / 17) * (0-(0.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 29 + (((tickAnim - 18) / 15) * (29-(29)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 33) / 17) * (0-(29)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 9.75 + (((tickAnim - 18) / 15) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 33) / 17) * (0-(9.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 10) * (0-(0.625)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -47.75 + (((tickAnim - 10) / 10) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.5 + (((tickAnim - 10) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0.425);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 10) / 10) * (0-(27.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 10) / 10) * (0-(0.675)));
            zz = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-47.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -47.75 + (((tickAnim - 10) / 10) * (0-(-47.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.5 + (((tickAnim - 10) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 10) / 10) * (0-(0.425)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 10) / 10) * (0-(27.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 10) / 10) * (0-(0.675)));
            zz = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.25 + (((tickAnim - 10) / 10) * (0-(29.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 13.5 + (((tickAnim - 10) / 2) * (19.5-(13.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 19.5 + (((tickAnim - 12) / 8) * (0-(19.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11.75 + (((tickAnim - 10) / 2) * (14.79-(11.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 14.79 + (((tickAnim - 12) / 8) * (0-(14.79)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 22 + (((tickAnim - 10) / 2) * (22.83-(22)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 22.83 + (((tickAnim - 12) / 8) * (0-(22.83)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.77-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1.77 + (((tickAnim - 6) / 4) * (-43.25-(1.77)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -43.25 + (((tickAnim - 10) / 10) * (0-(-43.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (23-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23 + (((tickAnim - 10) / 2) * (0-(23)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1.55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(1.725+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*-5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(5.575+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-6), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(0);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(0);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(0.35);


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 15) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 17) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(1)));
            zz = 1 + (((tickAnim - 15) / 17) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 32) / 18) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 32) / 18) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = 1 + (((tickAnim - 32) / 18) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-300))*6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (16.75-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 16.75 + (((tickAnim - 32) / 18) * (0-(16.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17 + (((tickAnim - 0) / 8) * (-23.53-(17)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -23.53 + (((tickAnim - 8) / 4) * (-18.25-(-23.53)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -18.25 + (((tickAnim - 12) / 11) * (17-(-18.25)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.25 + (((tickAnim - 0) / 3) * (25.97-(6.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 25.97 + (((tickAnim - 3) / 5) * (50.6908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(25.97)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.85141-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-2.78252-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 50.6908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 8) / 4) * (6-(50.6908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0.85141 + (((tickAnim - 8) / 4) * (0-(0.85141)));
            zz = -2.78252 + (((tickAnim - 8) / 4) * (0-(-2.78252)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 12) / 11) * (6.25-(6)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.04-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.04 + (((tickAnim - 3) / 5) * (2.58-(1.04)));
            zz = -0.09 + (((tickAnim - 3) / 5) * (-0.225-(-0.09)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 2.58 + (((tickAnim - 8) / 4) * (-0.875-(2.58)));
            zz = -0.225 + (((tickAnim - 8) / 4) * (0-(-0.225)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.875 + (((tickAnim - 12) / 1) * (-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28-(-0.875)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28 + (((tickAnim - 13) / 3) * (-0.425-(-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 16) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
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
            xx = 17.75 + (((tickAnim - 0) / 3) * (32.31-(17.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 32.31 + (((tickAnim - 3) / 7) * (24-(32.31)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 10) / 2) * (12-(24)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 12 + (((tickAnim - 12) / 5) * (-2.79-(12)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -2.79 + (((tickAnim - 17) / 6) * (17.75-(-2.79)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -18.25 + (((tickAnim - 0) / 11) * (17-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 17 + (((tickAnim - 11) / 7) * (-23.53-(17)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -23.53 + (((tickAnim - 18) / 5) * (-18.25-(-23.53)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 6 + (((tickAnim - 0) / 11) * (6.25-(6)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 11) / 2) * (25.97-(6.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25.97 + (((tickAnim - 13) / 5) * (73.9408+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(25.97)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.85141-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-2.78252-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 73.9408+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 18) / 5) * (6-(73.9408+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0.85141 + (((tickAnim - 18) / 5) * (0-(0.85141)));
            zz = -2.78252 + (((tickAnim - 18) / 5) * (0-(-2.78252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 2) * (-0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28-(-0.875)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28 + (((tickAnim - 2) / 2) * (-0.425-(-0.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.28)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 4) / 7) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.04-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.09-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.04 + (((tickAnim - 13) / 5) * (2.58-(1.04)));
            zz = -0.09 + (((tickAnim - 13) / 5) * (-0.225-(-0.09)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 2.58 + (((tickAnim - 18) / 5) * (-0.875-(2.58)));
            zz = -0.225 + (((tickAnim - 18) / 5) * (0-(-0.225)));
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
            xx = 12 + (((tickAnim - 0) / 5) * (-5.87-(12)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -5.87 + (((tickAnim - 5) / 6) * (17.75-(-5.87)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 17.75 + (((tickAnim - 11) / 2) * (32.31-(17.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 32.31 + (((tickAnim - 13) / 7) * (24-(32.31)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 24 + (((tickAnim - 20) / 3) * (12-(24)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 6) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -21.75 + (((tickAnim - 0) / 12) * (17.25-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 17.25 + (((tickAnim - 12) / 5) * (93.9411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130-(17.25)));
            yy = 0 + (((tickAnim - 12) / 5) * (-0.78551-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (14.4631+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 93.9411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130 + (((tickAnim - 17) / 6) * (-21.75-(93.9411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-130)));
            yy = -0.78551 + (((tickAnim - 17) / 6) * (0-(-0.78551)));
            zz = 14.4631+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 17) / 6) * (0-(14.4631+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 5.75 + (((tickAnim - 0) / 12) * (10.75-(5.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 10.75 + (((tickAnim - 12) / 5) * (122.0841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230-(10.75)));
            yy = 0 + (((tickAnim - 12) / 5) * (-3.21949-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (-1.92387-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 122.0841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230 + (((tickAnim - 17) / 6) * (5.75-(122.0841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-230)));
            yy = -3.21949 + (((tickAnim - 17) / 6) * (0-(-3.21949)));
            zz = -1.92387 + (((tickAnim - 17) / 6) * (0-(-1.92387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.9 + (((tickAnim - 0) / 2) * (-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.2-(-1.9)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.2 + (((tickAnim - 2) / 1) * (-1.3-(-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = -1.3 + (((tickAnim - 3) / 9) * (-1.075-(-1.3)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -1.075 + (((tickAnim - 12) / 5) * (0.95-(-1.075)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.95 + (((tickAnim - 17) / 6) * (-1.9-(0.95)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
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
            xx = 15 + (((tickAnim - 0) / 5) * (-4.23-(15)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -4.23 + (((tickAnim - 5) / 7) * (18.25-(-4.23)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 18.25 + (((tickAnim - 12) / 5) * (64.52-(18.25)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 64.52 + (((tickAnim - 17) / 6) * (15-(64.52)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 5) * (1.355-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 1.355 + (((tickAnim - 5) / 7) * (0.1-(1.355)));
            zz = -0.19 + (((tickAnim - 5) / 7) * (-0.4-(-0.19)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 12) / 5) * (1.03-(0.1)));
            zz = -0.4 + (((tickAnim - 12) / 5) * (-1.415-(-0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 1.03 + (((tickAnim - 17) / 6) * (-0.15-(1.03)));
            zz = -1.415 + (((tickAnim - 17) / 6) * (0-(-1.415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.25 + (((tickAnim - 0) / 5) * (21.8161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(17.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.78551-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.5869+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 21.8161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 5) / 7) * (-21.75-(21.8161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = -0.78551 + (((tickAnim - 5) / 7) * (0-(-0.78551)));
            zz = -3.5869+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 5) / 7) * (0-(-3.5869+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -21.75 + (((tickAnim - 12) / 11) * (17.25-(-21.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.75 + (((tickAnim - 0) / 5) * (10.8341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(10.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.21949-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.92387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 10.8341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 5) / 7) * (5.75-(10.8341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = -3.21949 + (((tickAnim - 5) / 7) * (0-(-3.21949)));
            zz = -1.92387 + (((tickAnim - 5) / 7) * (0-(-1.92387)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5.75 + (((tickAnim - 12) / 11) * (10.75-(5.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.075 + (((tickAnim - 0) / 5) * (0.95-(-1.075)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.95 + (((tickAnim - 5) / 7) * (-1.775-(0.95)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1.775 + (((tickAnim - 12) / 1) * (-1.825-(-1.775)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -1.825 + (((tickAnim - 13) / 1) * (-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.5-(-1.825)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.5 + (((tickAnim - 14) / 2) * (-1.125-(-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2))*0.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -1.125 + (((tickAnim - 16) / 7) * (-1.075-(-1.125)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.25 + (((tickAnim - 0) / 5) * (64.52-(18.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 64.52 + (((tickAnim - 5) / 7) * (15-(64.52)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 15 + (((tickAnim - 12) / 5) * (-5.25-(15)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -5.25 + (((tickAnim - 17) / 6) * (18.25-(-5.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 5) * (1.03-(0.1)));
            zz = -0.4 + (((tickAnim - 0) / 5) * (-1.415-(-0.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 1.03 + (((tickAnim - 5) / 7) * (0.15-(1.03)));
            zz = -1.415 + (((tickAnim - 5) / 7) * (0-(-1.415)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 12) / 5) * (0.68-(0.15)));
            zz = 0 + (((tickAnim - 12) / 5) * (-0.19-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.68 + (((tickAnim - 17) / 6) * (0.1-(0.68)));
            zz = -0.19 + (((tickAnim - 17) / 6) * (-0.4-(-0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-30))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*-2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*-2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5 + (((tickAnim - 0) / 2) * (0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5-(0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59 + (((tickAnim - 2) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5 + (((tickAnim - 3) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59 + (((tickAnim - 3) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5 + (((tickAnim - 13) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59 + (((tickAnim - 13) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2 + (((tickAnim - 14) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-80))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-80))*-0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59 + (((tickAnim - 14) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.5-150))*0.59)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*-5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*16), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-400))*-7), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*20), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-80))*-0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-80))*-0.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5+20))*-2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*-2), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*-1));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1 + (((tickAnim - 2) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1 + (((tickAnim - 13) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-50))*0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-100))*-2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-260))*-5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*-4), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-550))*-3), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLiaoningotitan entity = (EntityPrehistoricFloraLiaoningotitan) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*1), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4 + (((tickAnim - 7) / 1) * (0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.4-150))*-0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 7) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.4-150))*-0.01 + (((tickAnim - 8) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4-(0.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.4-150))*-0.01)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 8) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 12 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 12) / 19) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4 + (((tickAnim - 12) / 19) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 12) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4 + (((tickAnim - 31) / 1) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.6-100))*-0.01-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 31) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.6-100))*-0.01 + (((tickAnim - 32) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.3-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.6-100))*-0.01)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 32) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.3 + (((tickAnim - 36) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-150))*-0.3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39 + (((tickAnim - 36) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320-50))*-0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -3 + (((tickAnim - 0) / 11) * (6.25-(-3)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 24) {
            xx = 6.25 + (((tickAnim - 11) / 13) * (-16.75-(6.25)));
            yy = 0 + (((tickAnim - 11) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 13) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -16.75 + (((tickAnim - 24) / 7) * (-19.25-(-16.75)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -19.25 + (((tickAnim - 31) / 14) * (-3-(-19.25)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 6 + (((tickAnim - 0) / 18) * (-73.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100-(6)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -73.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100 + (((tickAnim - 18) / 6) * (15-(-73.485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*100)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 15 + (((tickAnim - 24) / 7) * (5-(15)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 31) / 14) * (6-(5)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 11) * (-0.27-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.22-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -0.27 + (((tickAnim - 11) / 7) * (0.88-(-0.27)));
            zz = -0.22 + (((tickAnim - 11) / 7) * (-0.46-(-0.22)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.88 + (((tickAnim - 18) / 6) * (1.45-(0.88)));
            zz = -0.46 + (((tickAnim - 18) / 6) * (-0.8-(-0.46)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 1.45 + (((tickAnim - 24) / 7) * (-0.275-(1.45)));
            zz = -0.8 + (((tickAnim - 24) / 7) * (0-(-0.8)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            yy = -0.275 + (((tickAnim - 31) / 14) * (-0.3-(-0.275)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
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
            xx = -1 + (((tickAnim - 0) / 11) * (2.5-(-1)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 2.5 + (((tickAnim - 11) / 7) * (25.7-(2.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 25.7 + (((tickAnim - 18) / 6) * (15.25-(25.7)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 15.25 + (((tickAnim - 24) / 7) * (14.26-(15.25)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 14.26 + (((tickAnim - 31) / 14) * (-1-(14.26)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 11) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 6) * (0-(0.475)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 7) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = -0.6 + (((tickAnim - 31) / 6) * (0.08-(-0.6)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            yy = 0.08 + (((tickAnim - 37) / 8) * (-0.625-(0.08)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
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
            xx = -16.75 + (((tickAnim - 0) / 6) * (-19.25-(-16.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 33) {
            xx = -19.25 + (((tickAnim - 6) / 27) * (6.25-(-19.25)));
            yy = 0 + (((tickAnim - 6) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 27) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 33) / 12) * (-16.75-(6.25)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.25 + (((tickAnim - 0) / 6) * (5-(10.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 6) / 27) * (21.5-(5)));
            yy = 0 + (((tickAnim - 6) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 27) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 21.5 + (((tickAnim - 33) / 4) * (173.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(21.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 173.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 37) / 8) * (10.25-(173.14+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.45 + (((tickAnim - 0) / 6) * (-0.87-(1.45)));
            zz = -0.8 + (((tickAnim - 0) / 6) * (-0.225-(-0.8)));
        }
        else if (tickAnim >= 6 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 6) / 27) * (0-(0)));
            yy = -0.87 + (((tickAnim - 6) / 27) * (-0.27-(-0.87)));
            zz = -0.225 + (((tickAnim - 6) / 27) * (-0.22-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.27 + (((tickAnim - 33) / 4) * (0.88-(-0.27)));
            zz = -0.22 + (((tickAnim - 33) / 4) * (-0.46-(-0.22)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 37) / 8) * (0-(0)));
            yy = 0.88 + (((tickAnim - 37) / 8) * (1.45-(0.88)));
            zz = -0.46 + (((tickAnim - 37) / 8) * (-0.8-(-0.46)));
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
            xx = 15.25 + (((tickAnim - 0) / 6) * (14.26-(15.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 14.26 + (((tickAnim - 6) / 14) * (-9.66-(14.26)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.66 + (((tickAnim - 20) / 10) * (12.39-(-9.66)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 12.39 + (((tickAnim - 30) / 15) * (15.25-(12.39)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
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
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -0.55 + (((tickAnim - 20) / 25) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*1.2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-60))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-350))*4), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-20))*-1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-130))*-1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*-1.59));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -5.925 + (((tickAnim - 0) / 20) * (18.75-(-5.925)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 18.75 + (((tickAnim - 20) / 13) * (18.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40-(18.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 18.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40 + (((tickAnim - 33) / 7) * (-10-(18.08+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-40)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 40) / 5) * (-5.925-(-10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3 + (((tickAnim - 0) / 10) * (3.57-(3)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.57 + (((tickAnim - 10) / 10) * (14.15-(3.57)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.15 + (((tickAnim - 20) / 10) * (81.755+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150-(14.15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 81.755+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150 + (((tickAnim - 30) / 10) * (4-(81.755+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-150)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4 + (((tickAnim - 40) / 5) * (3-(4)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 10) * (-0.185-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.185 + (((tickAnim - 10) / 10) * (-1.8-(-0.185)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.8 + (((tickAnim - 20) / 10) * (0.975-(-1.8)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.975 + (((tickAnim - 30) / 10) * (-0.85-(0.975)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = -0.85 + (((tickAnim - 40) / 3) * (-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.05-(-0.85)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = -0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.05 + (((tickAnim - 43) / 2) * (-0.525-(-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.05)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.75 + (((tickAnim - 0) / 10) * (-8-(2.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -8 + (((tickAnim - 10) / 5) * (-10.65337-(-8)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.1992-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.79753-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.65337 + (((tickAnim - 15) / 5) * (11.69327-(-10.65337)));
            yy = -0.1992 + (((tickAnim - 15) / 5) * (-0.39839-(-0.1992)));
            zz = 1.79753 + (((tickAnim - 15) / 5) * (3.59506-(1.79753)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 11.69327 + (((tickAnim - 20) / 10) * (64.88564-(11.69327)));
            yy = -0.39839 + (((tickAnim - 20) / 10) * (-3.18888-(-0.39839)));
            zz = 3.59506 + (((tickAnim - 20) / 10) * (6.27383-(3.59506)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 64.88564 + (((tickAnim - 30) / 6) * (26.15275-(64.88564)));
            yy = -3.18888 + (((tickAnim - 30) / 6) * (-1.4495-(-3.18888)));
            zz = 6.27383 + (((tickAnim - 30) / 6) * (2.85176-(6.27383)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 26.15275 + (((tickAnim - 36) / 4) * (9-(26.15275)));
            yy = -1.4495 + (((tickAnim - 36) / 4) * (0-(-1.4495)));
            zz = 2.85176 + (((tickAnim - 36) / 4) * (0-(2.85176)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 9 + (((tickAnim - 40) / 5) * (2.75-(9)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 10) * (0.4-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (1.215-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-1.2-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 1.215 + (((tickAnim - 31) / 9) * (-0.325-(1.215)));
            zz = -1.2 + (((tickAnim - 31) / 9) * (0-(-1.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 40) / 5) * (-0.375-(-0.325)));
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




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 19.25 + (((tickAnim - 0) / 16) * (21.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40-(19.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 21.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40 + (((tickAnim - 16) / 5) * (-10-(21.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 21) / 24) * (19.25-(-10)));
            yy = 0 + (((tickAnim - 21) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7 + (((tickAnim - 0) / 10) * (42.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(7)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 42.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 10) / 11) * (1.25-(42.205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 21) / 24) * (7-(1.25)));
            yy = 0 + (((tickAnim - 21) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -1.7 + (((tickAnim - 0) / 10) * (0.53-(-1.7)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0.53 + (((tickAnim - 10) / 11) * (-0.725-(0.53)));
            zz = 0.125 + (((tickAnim - 10) / 11) * (0-(0.125)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.725 + (((tickAnim - 21) / 2) * (-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.2-(-0.725)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.2 + (((tickAnim - 23) / 2) * (-0.7-(-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320/0.2-150))*-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = -0.7 + (((tickAnim - 25) / 20) * (-1.7-(-0.7)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11.69327 + (((tickAnim - 0) / 10) * (51.63564-(11.69327)));
            yy = -0.39839 + (((tickAnim - 0) / 10) * (3.18888-(-0.39839)));
            zz = 3.59506 + (((tickAnim - 0) / 10) * (-6.27383-(3.59506)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 51.63564 + (((tickAnim - 10) / 11) * (9-(51.63564)));
            yy = 3.18888 + (((tickAnim - 10) / 11) * (0-(3.18888)));
            zz = -6.27383 + (((tickAnim - 10) / 11) * (0-(-6.27383)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 9 + (((tickAnim - 21) / 13) * (-4.25-(9)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 34) / 6) * (-8.41512-(-4.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (-0.21452-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (1.93581-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -8.41512 + (((tickAnim - 40) / 5) * (11.69327-(-8.41512)));
            yy = -0.21452 + (((tickAnim - 40) / 5) * (-0.39839-(-0.21452)));
            zz = 1.93581 + (((tickAnim - 40) / 5) * (3.59506-(1.93581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.94-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.85-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0.94 + (((tickAnim - 10) / 11) * (-0.325-(0.94)));
            zz = -0.85 + (((tickAnim - 10) / 11) * (0-(-0.85)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 21) / 8) * (0.805-(-0.325)));
            zz = 0 + (((tickAnim - 21) / 8) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 0.805 + (((tickAnim - 29) / 5) * (0.625-(0.805)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 0.625 + (((tickAnim - 34) / 11) * (0-(0.625)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*1.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*-1.59));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*-1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-300))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-450))*-1.5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-550))*-1.5), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLiaoningotitan e = (EntityPrehistoricFloraLiaoningotitan) entity;
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
