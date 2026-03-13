package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTarbosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTarbosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
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
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
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
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer HeadDinoKing;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;

    private ModelAnimator animator;

    public ModelTarbosaurus() {
        this.textureWidth = 195;
        this.textureHeight = 195;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.0F, 3.5F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -6.0F, -6.2F, -11.0F, 12, 24, 23, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.3684F, -1.5649F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 94, 128, -4.0F, 0.0F, 0.0F, 8, 4, 14, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.75F, -6.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 138, 40, -4.0F, -4.0F, -6.0F, 8, 4, 11, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0873F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 88, -5.0F, -6.0F, -7.0F, 8, 24, 13, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.0F, 16.5F, -2.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5672F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 39, 134, -3.0F, -1.5F, -4.5F, 6, 18, 9, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 17.0F, -1.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7854F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 101, 164, -2.0F, -3.5F, -2.0F, 4, 13, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3491F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 165, 56, -3.0F, -0.5F, -3.0F, 6, 3, 6, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.5F, -2.5F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 31, 162, -4.0F, -2.0F, -6.5F, 8, 3, 7, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0873F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 88, -3.0F, -6.0F, -7.0F, 8, 24, 13, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.0F, 16.5F, -2.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5672F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 39, 134, -3.0F, -1.5F, -4.5F, 6, 18, 9, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 17.0F, -1.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7854F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 101, 164, -2.0F, -3.5F, -2.0F, 4, 13, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 165, 56, -3.0F, -0.5F, -3.0F, 6, 3, 6, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.5F, -2.5F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 31, 162, -4.0F, -2.0F, -6.5F, 8, 3, 7, -0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 71, 0, -5.5F, -4.0F, -1.0F, 11, 17, 19, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -5.75F, 0.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 96, 107, -4.0F, 0.0F, -1.0F, 7, 2, 18, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.25F, 17.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0785F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 73, 58, -4.0F, -5.0F, 0.0F, 8, 13, 17, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -6.0F, 0.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 151, -2.0F, 0.0F, 0.0F, 5, 1, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 16.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 124, 58, -2.0F, -4.0F, 0.0F, 4, 9, 16, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 16.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1222F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 139, 128, -1.5F, -3.0F, -1.0F, 3, 6, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.75F, 13.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1396F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 147, 107, -1.0F, -2.0F, -1.0F, 2, 4, 13, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1222F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 151, 84, -1.0F, -2.0F, 0.0F, 2, 3, 11, -0.01F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2094F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 161, 162, -0.5F, -2.0F, -1.0F, 1, 2, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -10.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 48, -9.5F, -4.5F, -16.0F, 19, 22, 17, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.25F, -11.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 89, -6.0F, -2.75F, -4.0F, 12, 2, 15, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 17.5F, -16.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 73, 37, -8.0F, -4.0F, 0.0F, 16, 4, 16, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.0F, -15.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 43, 89, -7.5F, -5.0F, -10.0F, 15, 15, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -4.25F, -8.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 138, 25, -5.0F, -1.5F, -2.0F, 9, 2, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 10.0F, -10.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5934F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 116, -7.0F, -5.0F, 0.0F, 13, 5, 12, -0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(7.0F, 10.75F, -5.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.5672F, 0.3927F, 0.2182F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 31, 151, -0.25F, -1.0F, -1.0F, 1, 5, 2, 0.0F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 181, 25, -0.75F, -1.0F, -1.0F, 1, 5, 2, -0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7854F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 181, 33, -0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, -0.1745F, 0.0436F, 0.5236F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 76, 177, -1.0F, 0.0F, -1.5F, 1, 5, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.0F, 10.75F, -5.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.5672F, -0.3927F, -0.2182F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 31, 151, -0.75F, -1.0F, -1.0F, 1, 5, 2, 0.0F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 181, 25, -0.25F, -1.0F, -1.0F, 1, 5, 2, -0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7854F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 181, 33, -0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.1745F, -0.0436F, -0.5236F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 76, 177, 0.0F, 0.0F, -1.5F, 1, 5, 3, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.5F, 0.5F, -9.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.48F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 126, -5.5F, -6.25F, -5.0F, 10, 15, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 132, 0, -5.0F, -6.25F, -7.0F, 9, 14, 10, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.48F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 70, 147, -4.5F, -6.45F, -5.9F, 8, 12, 7, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 101, 147, -5.5F, -3.7F, -4.9F, 10, 10, 6, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 174, 134, -3.0F, 5.4919F, -19.381F, 5, 1, 5, -0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 173, -2.0F, 4.4617F, -21.7152F, 3, 2, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 178, 107, -2.5F, 4.4617F, -20.9652F, 4, 2, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.9672F, -16.7357F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.3963F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 137, 175, -2.5F, -5.0F, 0.0F, 4, 5, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.5328F, -21.0659F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.0472F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 85, 175, -2.5F, -5.0F, 0.0F, 3, 5, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 4.624F, -20.983F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 178, 117, -2.5F, -3.0F, -0.75F, 3, 3, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 5.8415F, -19.3963F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 63, 177, -3.0F, -3.0F, -2.0F, 4, 3, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 6.0596F, -14.401F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 173, -3.0F, -4.0F, -5.0F, 5, 4, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.75F, 4.3F, -17.9F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, -0.5236F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 126, -1.0F, -1.0F, -3.25F, 0, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 4.3F, -17.65F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, -0.2618F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 130, -1.5F, 0.25F, -1.75F, 0, 2, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 4.3F, -17.9F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 182, -2.0F, 1.25F, 0.25F, 0, 2, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 132, 29, -2.0F, 1.0F, 4.25F, 0, 2, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 132, 29, 2.0F, 1.0F, 4.25F, 0, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 182, 2.0F, 1.25F, 0.25F, 0, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 5.4919F, -14.381F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 25, -1.99F, 0.0F, -0.25F, 0, 1, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 25, 2.99F, 0.0F, -0.25F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.7242F, 5.9158F, -12.5316F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2047F, -0.3216F, 0.0292F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 178, 84, -0.1958F, -1.8F, 0.05F, 0, 2, 5, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, 4.3F, -17.15F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, -0.2618F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 132, 33, -2.0F, 0.25F, 6.25F, 0, 2, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.7771F, -10.8772F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 174, 125, -3.0F, -4.0F, -3.75F, 5, 4, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.7242F, 5.9158F, -12.5316F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2047F, 0.3216F, -0.0292F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 178, 84, 0.1958F, -1.8F, 0.05F, 0, 2, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.5F, -2.1471F, -10.6955F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4084F, -0.3837F, -0.2061F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 154, 176, 0.0F, 0.0F, -2.0F, 2, 3, 6, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.9176F, -2.4655F, -9.8445F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5431F, -0.5224F, -0.2279F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 139, 84, 0.0F, 0.0F, -0.5F, 1, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-5.5914F, -3.6478F, -4.961F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0769F, 0.3465F, 0.4269F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 7, 182, 0.3F, -0.5F, -1.3F, 2, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.3549F, -3.8003F, -6.5428F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2025F, -0.5121F, -0.2344F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 178, 92, -2.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-5.0F, -3.7F, -4.9F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2199F, -0.5102F, 0.0018F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 171, 7, 0.0F, 0.0F, -6.0F, 3, 5, 6, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-5.25F, 5.3F, -4.9F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0571F, -0.3216F, 0.0292F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 134, 162, -0.2F, -4.0F, -7.9F, 5, 4, 8, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(4.25F, 5.3F, -4.9F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0571F, 0.3216F, -0.0292F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 134, 162, -4.8F, -4.0F, -7.9F, 5, 4, 8, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.0F, -3.7F, -4.9F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2199F, 0.5102F, -0.0018F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 171, 7, -3.0F, 0.0F, -6.0F, 3, 5, 6, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(4.5914F, -3.6478F, -4.961F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0769F, -0.3465F, -0.4269F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 7, 182, -2.3F, -0.5F, -1.3F, 2, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.3549F, -3.8003F, -6.5428F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2025F, 0.5121F, 0.2344F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 178, 92, 0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.9176F, -2.4655F, -9.8445F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.5431F, 0.5224F, 0.2279F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 139, 84, -1.0F, 0.0F, -0.5F, 1, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.5F, -2.1471F, -10.6955F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.4084F, 0.3837F, 0.2061F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 154, 176, -2.0F, 0.0F, -2.0F, 2, 3, 6, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -3.7F, -4.9F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2618F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 177, -3.5F, 0.0F, -2.0F, 6, 5, 2, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 165, 66, -2.5F, 0.0F, -8.0F, 4, 5, 6, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.0F, 4.3F, -17.15F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1745F, 0.2618F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 132, 33, 2.0F, 0.25F, 6.25F, 0, 2, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 4.3F, -17.65F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1745F, 0.2618F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 39, 130, 1.5F, 0.25F, -1.75F, 0, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.75F, 4.3F, -17.9F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1745F, 0.5236F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 39, 126, 1.0F, -1.0F, -3.25F, 0, 2, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -5.0853F, -2.239F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0436F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 165, 78, -4.0F, 0.0F, 0.0F, 7, 2, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -3.7F, -4.9F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.48F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 177, 47, -3.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.HeadDinoKing = new AdvancedModelRenderer(this);
        this.HeadDinoKing.setRotationPoint(3.5914F, -3.3978F, -5.961F);
        this.head.addChild(HeadDinoKing);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-8.1827F, 0.0F, 0.0F);
        this.HeadDinoKing.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3919F, 0.505F, 0.6812F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 171, 19, -0.7F, -0.5F, -2.3F, 5, 1, 4, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadDinoKing.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3919F, -0.505F, -0.6812F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 171, 19, -4.3F, -0.5F, -2.3F, 5, 1, 4, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(3.3465F, -1.055F, -6.0801F);
        this.head.addChild(eyes);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-7.693F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0419F, -0.5102F, 0.0018F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 55, 173, -0.0135F, 0.2F, -1.3F, 1, 1, 2, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0419F, 0.5102F, -0.0018F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 55, 173, -0.9865F, 0.2F, -1.3F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 5.3F, 0.15F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 134, 149, -5.0F, -1.25F, -5.0F, 10, 6, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 151, 99, -4.0F, 4.75F, -5.0F, 8, 1, 6, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -1.2451F, -20.268F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -2.0595F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 25, 163, -1.97F, -2.0F, 0.0F, 0, 2, 1, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 25, 163, 1.97F, -2.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.5841F, -15.5986F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.096F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 180, 99, -2.0F, -2.0F, 0.15F, 0, 2, 4, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 180, 99, 3.0F, -2.0F, 0.15F, 0, 2, 4, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-2.418F, -0.8739F, -12.0537F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0349F, -0.3491F, -0.0349F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 62, 162, 0.018F, 0.0399F, 0.3015F, 0, 1, 3, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, -1.0F, -17.8F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.4363F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 147, 125, -1.5F, -1.75F, 5.1F, 0, 1, 1, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 148, 84, -1.5F, -0.75F, 3.1F, 0, 2, 1, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 135, 33, -1.25F, -0.25F, 1.1F, 0, 2, 1, 0.0F, true));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 147, 125, 2.5F, -1.75F, 5.1F, 0, 1, 1, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 148, 84, 2.5F, -0.75F, 3.1F, 0, 2, 1, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 135, 33, 2.25F, -0.25F, 1.1F, 0, 2, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.25F, -1.0F, -17.8F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.4363F, -0.3491F, 0.1745F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 135, 29, -1.5F, 0.25F, -0.4F, 0, 2, 1, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.25F, -1.0F, -17.8F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.4363F, 0.3491F, -0.1745F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 135, 29, 1.5F, 0.25F, -0.4F, 0, 2, 1, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 1.8995F, -19.9339F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.1432F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 84, -2.0F, -1.0F, -3.0F, 4, 1, 3, -0.02F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 4.9956F, -8.5981F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.1833F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 171, 176, -3.0F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 3.2915F, -14.351F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.288F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 118, 175, -2.0F, -2.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.0F, 3.117F, -18.3472F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0436F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 163, -3.0F, -2.0F, 0.0F, 4, 2, 8, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(1.0F, 1.8995F, -19.9339F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.6545F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 178, 112, -3.0F, -2.0F, 0.0F, 4, 2, 2, -0.01F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, -0.7853F, -19.3387F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.096F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 177, 40, -3.0F, 0.0F, -0.05F, 5, 2, 4, -0.01F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.5F, 0.7369F, -15.9375F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.2182F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 174, 141, -3.0F, 0.0F, -3.65F, 5, 2, 4, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 0.4536F, -12.6999F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0873F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 174, -3.0F, 0.0F, -3.5F, 5, 2, 5, 0.01F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(2.418F, -0.8739F, -12.0537F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0349F, 0.3491F, 0.0349F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 62, 162, -0.018F, 0.0399F, 0.3015F, 0, 1, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-4.5F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.5173F, -0.2749F, 0.2257F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 118, 164, 0.0F, -4.25F, -3.0F, 4, 6, 3, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-5.0F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0873F, -0.3491F, -0.0349F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 167, 149, 0.0F, 0.0F, -5.0F, 5, 5, 5, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-5.0F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.4363F, -0.3491F, -0.0349F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 85, 167, 0.0F, -1.7101F, -7.6985F, 4, 4, 3, -0.01F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(5.0F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.4363F, 0.3491F, 0.0349F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 85, 167, -4.0F, -1.7101F, -7.6985F, 4, 4, 3, -0.01F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(5.0F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0873F, 0.3491F, 0.0349F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 167, 149, -5.0F, 0.0F, -5.0F, 5, 5, 5, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(4.5F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.5173F, 0.2749F, -0.2257F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 164, -4.0F, -4.25F, -3.0F, 4, 6, 3, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, -1.25F, -5.0F);
        this.jaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.48F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 171, 0, -5.0F, -3.0F, 0.0F, 9, 3, 3, 0.0F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 5.75F, -5.0F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, -0.1833F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 70, 134, -2.5F, -4.0F, 0.0F, 5, 4, 6, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -3.0F, 5.5F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.1222F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 62, 167, -3.0F, -1.0F, -0.5F, 6, 4, 5, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.offsetZ = 0.05F;
        this.chest.offsetY = -0.025F;
        this.chest.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.16F;
        this.hips.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.60F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
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

        EntityPrehistoricFloraTarbosaurus EntityTarbosaurus = (EntityPrehistoricFloraTarbosaurus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightArm1, this.rightArm2, this.rightHand};
        AdvancedModelRenderer[] ArmR = {this.leftArm1, this.leftArm2, this.leftHand};

        EntityTarbosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityTarbosaurus.getAnimation() == EntityTarbosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityTarbosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityTarbosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.leftArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityTarbosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 9) * (49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 9) * (4.62302-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.16569-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 15) / 8) * (0-(49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 4.62302 + (((tickAnim - 15) / 8) * (0-(4.62302)));
            zz = -1.16569 + (((tickAnim - 15) / 8) * (0-(-1.16569)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 6) / 9) * (-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 6) / 9) * (-1.64091-(0)));
            zz = 1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 6) / 9) * (-6.03157-(1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 15) / 8) * (0-(-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -1.64091 + (((tickAnim - 15) / 8) * (0-(-1.64091)));
            zz = -6.03157 + (((tickAnim - 15) / 8) * (0-(-6.03157)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.13-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.565-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.13 + (((tickAnim - 3) / 3) * (0.3-(0.13)));
            zz = 0.565 + (((tickAnim - 3) / 3) * (0.325-(0.565)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 9) * (-0.975-(0.3)));
            zz = 0.325 + (((tickAnim - 6) / 9) * (0-(0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.975 + (((tickAnim - 15) / 8) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 6) / 6) * (-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 6) / 6) * (1.04783-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-3.00475-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 12) / 3) * (-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 1.04783 + (((tickAnim - 12) / 3) * (1.64659-(1.04783)));
            zz = -3.00475 + (((tickAnim - 12) / 3) * (-4.72175-(-3.00475)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 15) / 8) * (0-(-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.64659 + (((tickAnim - 15) / 8) * (0-(1.64659)));
            zz = -4.72175 + (((tickAnim - 15) / 8) * (0-(-4.72175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (-0.475-(0)));
            zz = 0.5 + (((tickAnim - 6) / 6) * (-1.705-(0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.475 + (((tickAnim - 12) / 1) * (-0.475-(-0.475)));
            zz = -1.705 + (((tickAnim - 12) / 1) * (-1.705-(-1.705)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 2) * (-0.475-(-0.475)));
            zz = -1.705 + (((tickAnim - 13) / 2) * (-1.705-(-1.705)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.475 + (((tickAnim - 15) / 3) * (0.05-(-0.475)));
            zz = -1.705 + (((tickAnim - 15) / 3) * (0.15-(-1.705)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 5) * (0-(0.05)));
            zz = 0.15 + (((tickAnim - 18) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 6) / 9) * (-14.73386-(-8.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (-4.48108-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.4126-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -14.73386 + (((tickAnim - 15) / 8) * (0-(-14.73386)));
            yy = -4.48108 + (((tickAnim - 15) / 8) * (0-(-4.48108)));
            zz = -0.4126 + (((tickAnim - 15) / 8) * (0-(-0.4126)));
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



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (27.5-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 12) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 6) / 4) * (-4.27249-(6.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.6953-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (1.68017-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.27249 + (((tickAnim - 10) / 2) * (-7.93916-(-4.27249)));
            yy = -0.6953 + (((tickAnim - 10) / 2) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 10) / 2) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -7.93916 + (((tickAnim - 12) / 1) * (0.97751-(-7.93916)));
            yy = -0.6953 + (((tickAnim - 12) / 1) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 12) / 1) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0.97751 + (((tickAnim - 13) / 0) * (8.29553-(0.97751)));
            yy = -0.6953 + (((tickAnim - 13) / 0) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 13) / 0) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.29553 + (((tickAnim - 13) / 2) * (19.95064-(8.29553)));
            yy = -0.6953 + (((tickAnim - 13) / 2) * (-1.52967-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 13) / 2) * (3.6964-(1.68017)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 19.95064 + (((tickAnim - 15) / 8) * (0-(19.95064)));
            yy = -1.52967 + (((tickAnim - 15) / 8) * (0-(-1.52967)));
            zz = 3.6964 + (((tickAnim - 15) / 8) * (0-(3.6964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.525-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.85 + (((tickAnim - 15) / 8) * (0-(0.85)));
            zz = 5.525 + (((tickAnim - 15) / 8) * (0-(5.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9.75 + (((tickAnim - 6) / 6) * (8.24512-(9.75)));
            yy = 0 + (((tickAnim - 6) / 6) * (2.74243-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-0.20395-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.24512 + (((tickAnim - 12) / 3) * (5.70513-(8.24512)));
            yy = 2.74243 + (((tickAnim - 12) / 3) * (2.48246-(2.74243)));
            zz = -0.20395 + (((tickAnim - 12) / 3) * (-0.2957-(-0.20395)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 5.70513 + (((tickAnim - 15) / 8) * (0-(5.70513)));
            yy = 2.48246 + (((tickAnim - 15) / 8) * (0-(2.48246)));
            zz = -0.2957 + (((tickAnim - 15) / 8) * (0-(-0.2957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
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
            yy = 0 + (((tickAnim - 0) / 20) * (-11.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -11.525 + (((tickAnim - 20) / 10) * (-11.525-(-11.525)));
            zz = 5.025 + (((tickAnim - 20) / 10) * (5.025-(5.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -11.525 + (((tickAnim - 30) / 20) * (0-(-11.525)));
            zz = 5.025 + (((tickAnim - 30) / 20) * (0-(5.025)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 20) / 10) * (-36-(-36)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -36 + (((tickAnim - 30) / 20) * (0-(-36)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (63-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 63 + (((tickAnim - 20) / 10) * (63-(63)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 63 + (((tickAnim - 30) / 20) * (0-(63)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.58-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.58 + (((tickAnim - 10) / 10) * (0.75-(1.58)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 10) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 30) / 10) * (1.63-(0.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.63 + (((tickAnim - 40) / 10) * (0-(1.63)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 20) / 10) * (-36-(-36)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -36 + (((tickAnim - 30) / 20) * (0-(-36)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (63-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 63 + (((tickAnim - 20) / 10) * (63-(63)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 63 + (((tickAnim - 30) / 20) * (0-(63)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.58-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1.58 + (((tickAnim - 10) / 10) * (0.75-(1.58)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 20) / 10) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.75 + (((tickAnim - 30) / 10) * (1.63-(0.75)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 1.63 + (((tickAnim - 40) / 10) * (0-(1.63)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 30) / 20) * (0-(-6.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.75 + (((tickAnim - 20) / 10) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 30) / 20) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 20) / 10) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 30) / 20) * (0-(6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.75 + (((tickAnim - 20) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 30) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 20) / 10) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 30) / 20) * (0-(7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.25 + (((tickAnim - 20) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 30) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.75 + (((tickAnim - 20) / 10) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 30) / 20) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 26.25 + (((tickAnim - 15) / 35) * (0-(26.25)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (26-(0)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 26 + (((tickAnim - 24) / 14) * (-15.21-(26)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -15.21 + (((tickAnim - 38) / 12) * (0-(-15.21)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (-44.75-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -44.75 + (((tickAnim - 30) / 8) * (-44.75-(-44.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -44.75 + (((tickAnim - 38) / 12) * (0-(-44.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (1.95-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (1.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 1.95 + (((tickAnim - 30) / 8) * (1.95-(1.95)));
            zz = 1.6 + (((tickAnim - 30) / 8) * (1.6-(1.6)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.95 + (((tickAnim - 38) / 12) * (0-(1.95)));
            zz = 1.6 + (((tickAnim - 38) / 12) * (0-(1.6)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 63.25 + (((tickAnim - 15) / 15) * (71.38-(63.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 71.38 + (((tickAnim - 30) / 8) * (71.38-(71.38)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 71.38 + (((tickAnim - 38) / 12) * (0-(71.38)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (-32.87-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -32.87 + (((tickAnim - 6) / 9) * (-65.25-(-32.87)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -65.25 + (((tickAnim - 15) / 3) * (0-(-65.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (19-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 19 + (((tickAnim - 30) / 8) * (19-(19)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 38) / 12) * (0-(19)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 10) / 10) * (0-(12)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 10) / 10) * (0-(12.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.5 + (((tickAnim - 10) / 10) * (0-(-25.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.5 + (((tickAnim - 10) / 10) * (0-(-25.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 10) / 10) * (0-(17)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 10) / 10) * (0-(17.5)));
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
            yy = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 10) * (0-(-0.425)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-0.12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.12 + (((tickAnim - 5) / 5) * (-1.75-(-0.12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 10) / 10) * (0-(-1.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.5 + (((tickAnim - 5) / 5) * (7-(16.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7 + (((tickAnim - 10) / 10) * (0-(7)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.85-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.85 + (((tickAnim - 5) / 5) * (0-(0.85)));
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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (18.5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 18.5 + (((tickAnim - 8) / 2) * (0-(18.5)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = -6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 10) / 17) * (49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 10) / 17) * (4.62302-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (-1.16569-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 27) / 13) * (0-(49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 4.62302 + (((tickAnim - 27) / 13) * (0-(4.62302)));
            zz = -1.16569 + (((tickAnim - 27) / 13) * (0-(-1.16569)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (3.75-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 3.75 + (((tickAnim - 53) / 47) * (0-(3.75)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = -12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 10) / 17) * (-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 10) / 17) * (-1.64091-(0)));
            zz = 1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 10) / 17) * (-6.03157-(1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 27) / 13) * (0-(-13.7135+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -1.64091 + (((tickAnim - 27) / 13) * (0-(-1.64091)));
            zz = -6.03157 + (((tickAnim - 27) / 13) * (0-(-6.03157)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (4.25-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 4.25 + (((tickAnim - 53) / 47) * (0-(4.25)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.13-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.565-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0.13 + (((tickAnim - 4) / 6) * (0.3-(0.13)));
            zz = 0.565 + (((tickAnim - 4) / 6) * (0.325-(0.565)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 10) / 17) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 17) * (-0.975-(0.3)));
            zz = 0.325 + (((tickAnim - 10) / 17) * (0-(0.325)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = -0.975 + (((tickAnim - 27) / 13) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 10) / 11) * (-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 10) / 11) * (1.04783-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (-3.00475-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 21) / 6) * (-155.3679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 1.04783 + (((tickAnim - 21) / 6) * (1.64659-(1.04783)));
            zz = -3.00475 + (((tickAnim - 21) / 6) * (-4.72175-(-3.00475)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -155.3679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 27) / 13) * (0-(-155.3679+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.64659 + (((tickAnim - 27) / 13) * (0-(1.64659)));
            zz = -4.72175 + (((tickAnim - 27) / 13) * (0-(-4.72175)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (-0.475-(0)));
            zz = 0.5 + (((tickAnim - 10) / 11) * (-1.705-(0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -0.475 + (((tickAnim - 21) / 2) * (-0.475-(-0.475)));
            zz = -1.705 + (((tickAnim - 21) / 2) * (-1.705-(-1.705)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.475 + (((tickAnim - 23) / 4) * (-0.475-(-0.475)));
            zz = -1.705 + (((tickAnim - 23) / 4) * (-1.705-(-1.705)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = -0.475 + (((tickAnim - 27) / 6) * (0.05-(-0.475)));
            zz = -1.705 + (((tickAnim - 27) / 6) * (0.15-(-1.705)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 33) / 7) * (0-(0.05)));
            zz = 0.15 + (((tickAnim - 33) / 7) * (0-(0.15)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 27) {
            xx = -8.25 + (((tickAnim - 10) / 17) * (-14.73386-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 17) * (-4.48108-(0)));
            zz = 0 + (((tickAnim - 10) / 17) * (-0.4126-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -14.73386 + (((tickAnim - 27) / 13) * (0-(-14.73386)));
            yy = -4.48108 + (((tickAnim - 27) / 13) * (0-(-4.48108)));
            zz = -0.4126 + (((tickAnim - 27) / 13) * (0-(-0.4126)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -8.75 + (((tickAnim - 53) / 47) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (27.5-(0)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 27.5 + (((tickAnim - 21) / 6) * (0-(27.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (19.5-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 19.5 + (((tickAnim - 53) / 12) * (0-(19.5)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 65) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 6.25 + (((tickAnim - 10) / 8) * (-4.27249-(6.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.6953-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (1.68017-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -4.27249 + (((tickAnim - 18) / 3) * (-7.93916-(-4.27249)));
            yy = -0.6953 + (((tickAnim - 18) / 3) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 18) / 3) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -7.93916 + (((tickAnim - 21) / 1) * (0.97751-(-7.93916)));
            yy = -0.6953 + (((tickAnim - 21) / 1) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 21) / 1) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0.97751 + (((tickAnim - 22) / 1) * (8.29553-(0.97751)));
            yy = -0.6953 + (((tickAnim - 22) / 1) * (-0.6953-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 22) / 1) * (1.68017-(1.68017)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 8.29553 + (((tickAnim - 23) / 4) * (19.95064-(8.29553)));
            yy = -0.6953 + (((tickAnim - 23) / 4) * (-1.52967-(-0.6953)));
            zz = 1.68017 + (((tickAnim - 23) / 4) * (3.6964-(1.68017)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 19.95064 + (((tickAnim - 27) / 13) * (0-(19.95064)));
            yy = -1.52967 + (((tickAnim - 27) / 13) * (0-(-1.52967)));
            zz = 3.6964 + (((tickAnim - 27) / 13) * (0-(3.6964)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (5.525-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0.85 + (((tickAnim - 27) / 13) * (0-(0.85)));
            zz = 5.525 + (((tickAnim - 27) / 13) * (0-(5.525)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 9.75 + (((tickAnim - 10) / 11) * (8.24512-(9.75)));
            yy = 0 + (((tickAnim - 10) / 11) * (2.74243-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (-0.20395-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 8.24512 + (((tickAnim - 21) / 6) * (5.70513-(8.24512)));
            yy = 2.74243 + (((tickAnim - 21) / 6) * (2.48246-(2.74243)));
            zz = -0.20395 + (((tickAnim - 21) / 6) * (-0.2957-(-0.20395)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 5.70513 + (((tickAnim - 27) / 13) * (0-(5.70513)));
            yy = 2.48246 + (((tickAnim - 27) / 13) * (0-(2.48246)));
            zz = -0.2957 + (((tickAnim - 27) / 13) * (0-(-0.2957)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (19-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (4.81504-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.11117-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-2.74775-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 4.81504 + (((tickAnim - 21) / 19) * (-6.4898-(4.81504)));
            yy = 0.11117 + (((tickAnim - 21) / 19) * (0.43003-(0.11117)));
            zz = -2.74775 + (((tickAnim - 21) / 19) * (2.71619-(-2.74775)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -6.4898 + (((tickAnim - 40) / 5) * (-6.4898-(-6.4898)));
            yy = 0.43003 + (((tickAnim - 40) / 5) * (0.43003-(0.43003)));
            zz = 2.71619 + (((tickAnim - 40) / 5) * (2.71619-(2.71619)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -6.4898 + (((tickAnim - 45) / 8) * (-6.4898-(-6.4898)));
            yy = 0.43003 + (((tickAnim - 45) / 8) * (0.43003-(0.43003)));
            zz = 2.71619 + (((tickAnim - 45) / 8) * (2.71619-(2.71619)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = -6.4898 + (((tickAnim - 53) / 47) * (0-(-6.4898)));
            yy = 0.43003 + (((tickAnim - 53) / 47) * (0-(0.43003)));
            zz = 2.71619 + (((tickAnim - 53) / 47) * (0-(2.71619)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (-24.125-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -24.125 + (((tickAnim - 40) / 5) * (-24.445-(-24.125)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = -24.445 + (((tickAnim - 45) / 8) * (-24.445-(-24.445)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = -24.445 + (((tickAnim - 53) / 47) * (0-(-24.445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -22.25 + (((tickAnim - 21) / 19) * (8.25-(-22.25)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 8.25 + (((tickAnim - 40) / 5) * (9.25-(8.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 9.25 + (((tickAnim - 45) / 8) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 9.25 + (((tickAnim - 53) / 19) * (23.37-(9.25)));
            yy = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 19) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 100) {
            xx = 23.37 + (((tickAnim - 72) / 28) * (0-(23.37)));
            yy = 0 + (((tickAnim - 72) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(0);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(0);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.04-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 40 + (((tickAnim - 7) / 14) * (0-(40)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 1.04 + (((tickAnim - 7) / 14) * (3.25-(1.04)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 3.25 + (((tickAnim - 21) / 19) * (0-(3.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (25.3-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 25.3 + (((tickAnim - 62) / 3) * (25.3-(25.3)));
            yy = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 25.3 + (((tickAnim - 65) / 7) * (9.5-(25.3)));
            yy = 0 + (((tickAnim - 65) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 7) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 83) {
            xx = 9.5 + (((tickAnim - 72) / 11) * (1.15-(9.5)));
            yy = 0 + (((tickAnim - 72) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 11) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 1.15 + (((tickAnim - 83) / 17) * (0-(1.15)));
            yy = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (1.7-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (-1.1-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            yy = 1.7 + (((tickAnim - 62) / 3) * (1.7-(1.7)));
            zz = -1.1 + (((tickAnim - 62) / 3) * (-1.1-(-1.1)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 65) / 35) * (0-(0)));
            yy = 1.7 + (((tickAnim - 65) / 35) * (0-(1.7)));
            zz = -1.1 + (((tickAnim - 65) / 35) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-38.67-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -38.67 + (((tickAnim - 12) / 4) * (-38.67-(-38.67)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -38.67 + (((tickAnim - 16) / 5) * (11.75-(-38.67)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 21) / 19) * (0-(11.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (-31.65-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = -31.65 + (((tickAnim - 62) / 4) * (-31.65-(-31.65)));
            yy = 0 + (((tickAnim - 62) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 4) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = -31.65 + (((tickAnim - 66) / 6) * (17.75-(-31.65)));
            yy = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 6) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 100) {
            xx = 17.75 + (((tickAnim - 72) / 28) * (0-(17.75)));
            yy = 0 + (((tickAnim - 72) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.855-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (1.65-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.855 + (((tickAnim - 12) / 4) * (1.855-(1.855)));
            zz = 1.65 + (((tickAnim - 12) / 4) * (1.65-(1.65)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 1.855 + (((tickAnim - 16) / 5) * (-1.025-(1.855)));
            zz = 1.65 + (((tickAnim - 16) / 5) * (0-(1.65)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -1.025 + (((tickAnim - 21) / 19) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (1.45-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (1.3-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 62) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 62) / 4) * (1.45-(1.45)));
            zz = 1.3 + (((tickAnim - 62) / 4) * (1.3-(1.3)));
        }
        else if (tickAnim >= 66 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 66) / 6) * (0-(0)));
            yy = 1.45 + (((tickAnim - 66) / 6) * (-1.75-(1.45)));
            zz = 1.3 + (((tickAnim - 66) / 6) * (0-(1.3)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 72) / 4) * (0-(0)));
            yy = -1.75 + (((tickAnim - 72) / 4) * (-1.665-(-1.75)));
            zz = 0 + (((tickAnim - 72) / 4) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 76) / 24) * (0-(0)));
            yy = -1.665 + (((tickAnim - 76) / 24) * (0-(-1.665)));
            zz = 0 + (((tickAnim - 76) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (81.14-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 81.14 + (((tickAnim - 12) / 4) * (81.14-(81.14)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 81.14 + (((tickAnim - 16) / 5) * (6.5-(81.14)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 21) / 19) * (-1.50804-(6.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (-0.55521-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (-4.09038-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -1.50804 + (((tickAnim - 40) / 13) * (-1.50804-(-1.50804)));
            yy = -0.55521 + (((tickAnim - 40) / 13) * (-0.55521-(-0.55521)));
            zz = -4.09038 + (((tickAnim - 40) / 13) * (-4.09038-(-4.09038)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = -1.50804 + (((tickAnim - 53) / 9) * (81.61125-(-1.50804)));
            yy = -0.55521 + (((tickAnim - 53) / 9) * (-0.45606-(-0.55521)));
            zz = -4.09038 + (((tickAnim - 53) / 9) * (-3.35996-(-4.09038)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 81.61125 + (((tickAnim - 62) / 6) * (81.61125-(81.61125)));
            yy = -0.45606 + (((tickAnim - 62) / 6) * (-0.45606-(-0.45606)));
            zz = -3.35996 + (((tickAnim - 62) / 6) * (-3.35996-(-3.35996)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 81.61125 + (((tickAnim - 68) / 4) * (20.66519-(81.61125)));
            yy = -0.45606 + (((tickAnim - 68) / 4) * (-0.30735-(-0.45606)));
            zz = -3.35996 + (((tickAnim - 68) / 4) * (-2.26432-(-3.35996)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 20.66519 + (((tickAnim - 72) / 4) * (0-(20.66519)));
            yy = -0.30735 + (((tickAnim - 72) / 4) * (0-(-0.30735)));
            zz = -2.26432 + (((tickAnim - 72) / 4) * (0-(-2.26432)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 76) / 7) * (-22-(0)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = -22 + (((tickAnim - 83) / 17) * (0-(-22)));
            yy = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -0.525 + (((tickAnim - 21) / 19) * (-0.2-(-0.525)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 40) / 13) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 53) / 19) * (0-(0)));
            yy = -0.2 + (((tickAnim - 53) / 19) * (-1.21-(-0.2)));
            zz = 0 + (((tickAnim - 53) / 19) * (-1.225-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 72) / 4) * (0-(0)));
            yy = -1.21 + (((tickAnim - 72) / 4) * (-1.305-(-1.21)));
            zz = -1.225 + (((tickAnim - 72) / 4) * (-0.93-(-1.225)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            yy = -1.305 + (((tickAnim - 76) / 7) * (-0.87-(-1.305)));
            zz = -0.93 + (((tickAnim - 76) / 7) * (-0.47-(-0.93)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            yy = -0.87 + (((tickAnim - 83) / 17) * (0-(-0.87)));
            zz = -0.47 + (((tickAnim - 83) / 17) * (0-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 10) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 66) / 2) * (14.62-(0)));
            yy = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 2) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 14.62 + (((tickAnim - 68) / 4) * (-27.5-(14.62)));
            yy = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = -27.5 + (((tickAnim - 72) / 4) * (-39.75-(-27.5)));
            yy = 0 + (((tickAnim - 72) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 4) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = -39.75 + (((tickAnim - 76) / 7) * (0-(-39.75)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 72) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 4) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 72) / 4) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            yy = -0.475 + (((tickAnim - 76) / 7) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 21.5 + (((tickAnim - 21) / 13) * (-5.4-(21.5)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -5.4 + (((tickAnim - 34) / 6) * (3.5-(-5.4)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 3.5 + (((tickAnim - 40) / 5) * (3.75-(3.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 3.75 + (((tickAnim - 45) / 8) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 3.75 + (((tickAnim - 53) / 21) * (-13.17-(3.75)));
            yy = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 21) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -13.17 + (((tickAnim - 74) / 14) * (10.88-(-13.17)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 10.88 + (((tickAnim - 88) / 12) * (0-(10.88)));
            yy = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = -15.25 + (((tickAnim - 21) / 8) * (29.5-(-15.25)));
            yy = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (1.04-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 29.5 + (((tickAnim - 29) / 11) * (0-(29.5)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 1.04 + (((tickAnim - 29) / 11) * (0-(1.04)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 53) / 21) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 21) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = -5.5 + (((tickAnim - 74) / 9) * (44.56-(-5.5)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 44.56 + (((tickAnim - 83) / 17) * (0-(44.56)));
            yy = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 21) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 8) * (2.25-(0)));
            zz = 0 + (((tickAnim - 21) / 8) * (-1.275-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            yy = 2.25 + (((tickAnim - 29) / 11) * (0-(2.25)));
            zz = -1.275 + (((tickAnim - 29) / 11) * (0-(-1.275)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 21) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 9) * (1.725-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 83) / 17) * (0-(0)));
            yy = 1.725 + (((tickAnim - 83) / 17) * (0-(1.725)));
            zz = 0 + (((tickAnim - 83) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 21) / 10) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -35.5 + (((tickAnim - 31) / 3) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -35.5 + (((tickAnim - 34) / 6) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 53) / 21) * (10-(0)));
            yy = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 21) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 10 + (((tickAnim - 74) / 11) * (-18.94-(10)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -18.94 + (((tickAnim - 85) / 15) * (0-(-18.94)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            yy = -0.675 + (((tickAnim - 21) / 10) * (1.88-(-0.675)));
            zz = 0 + (((tickAnim - 21) / 10) * (1.475-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            yy = 1.88 + (((tickAnim - 31) / 3) * (1.88-(1.88)));
            zz = 1.475 + (((tickAnim - 31) / 3) * (1.475-(1.475)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.88 + (((tickAnim - 34) / 6) * (0-(1.88)));
            zz = 1.475 + (((tickAnim - 34) / 6) * (0-(1.475)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 53) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 21) * (-1.2-(0)));
            zz = 0 + (((tickAnim - 53) / 21) * (-0.45-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            yy = -1.2 + (((tickAnim - 74) / 11) * (0.875-(-1.2)));
            zz = -0.45 + (((tickAnim - 74) / 11) * (1.24-(-0.45)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0.875 + (((tickAnim - 85) / 15) * (0-(0.875)));
            zz = 1.24 + (((tickAnim - 85) / 15) * (0-(1.24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-12.75324-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.57796-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (2.18614-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -12.75324 + (((tickAnim - 21) / 10) * (75.25111-(-12.75324)));
            yy = -0.57796 + (((tickAnim - 21) / 10) * (1.10761-(-0.57796)));
            zz = 2.18614 + (((tickAnim - 21) / 10) * (0.02641-(2.18614)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 75.25111 + (((tickAnim - 31) / 3) * (75.25111-(75.25111)));
            yy = 1.10761 + (((tickAnim - 31) / 3) * (1.10761-(1.10761)));
            zz = 0.02641 + (((tickAnim - 31) / 3) * (0.02641-(0.02641)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 75.25111 + (((tickAnim - 34) / 6) * (2.42287-(75.25111)));
            yy = 1.10761 + (((tickAnim - 34) / 6) * (1.91134-(1.10761)));
            zz = 0.02641 + (((tickAnim - 34) / 6) * (-4.62111-(0.02641)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 2.42287 + (((tickAnim - 40) / 13) * (2.42287-(2.42287)));
            yy = 1.91134 + (((tickAnim - 40) / 13) * (1.91134-(1.91134)));
            zz = -4.62111 + (((tickAnim - 40) / 13) * (-4.62111-(-4.62111)));
        }
        else if (tickAnim >= 53 && tickAnim < 74) {
            xx = 2.42287 + (((tickAnim - 53) / 21) * (12.09123-(2.42287)));
            yy = 1.91134 + (((tickAnim - 53) / 21) * (1.05807-(1.91134)));
            zz = -4.62111 + (((tickAnim - 53) / 21) * (-2.55812-(-4.62111)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 12.09123 + (((tickAnim - 74) / 11) * (71.27072-(12.09123)));
            yy = 1.05807 + (((tickAnim - 74) / 11) * (0.61436-(1.05807)));
            zz = -2.55812 + (((tickAnim - 74) / 11) * (-1.48536-(-2.55812)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 71.27072 + (((tickAnim - 85) / 15) * (0-(71.27072)));
            yy = 0.61436 + (((tickAnim - 85) / 15) * (0-(0.61436)));
            zz = -1.48536 + (((tickAnim - 85) / 15) * (0-(-1.48536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 21) / 53) * (0-(0)));
            yy = -0.6 + (((tickAnim - 21) / 53) * (-0.65-(-0.6)));
            zz = 0 + (((tickAnim - 21) / 53) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            yy = -0.65 + (((tickAnim - 74) / 11) * (2.045-(-0.65)));
            zz = 0 + (((tickAnim - 74) / 11) * (-0.775-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 2.045 + (((tickAnim - 85) / 15) * (0-(2.045)));
            zz = -0.775 + (((tickAnim - 85) / 15) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 21) / 19) * (2-(-1.5)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 2 + (((tickAnim - 40) / 13) * (2-(2)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 2 + (((tickAnim - 53) / 47) * (0-(2)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 21) / 19) * (1.5-(-4)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 1.5 + (((tickAnim - 40) / 13) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 1.5 + (((tickAnim - 53) / 47) * (0-(1.5)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 21) / 19) * (3.75-(-1.25)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 3.75 + (((tickAnim - 40) / 13) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 3.75 + (((tickAnim - 53) / 47) * (0-(3.75)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -2.75 + (((tickAnim - 21) / 19) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 100) {
            xx = -3.25 + (((tickAnim - 21) / 79) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 21) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 79) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (4.48658-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0.57155-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (-2.69-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 4.48658 + (((tickAnim - 40) / 13) * (5.48658-(4.48658)));
            yy = 0.57155 + (((tickAnim - 40) / 13) * (0.57155-(0.57155)));
            zz = -2.69 + (((tickAnim - 40) / 13) * (-2.69-(-2.69)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 5.48658 + (((tickAnim - 53) / 47) * (0-(5.48658)));
            yy = 0.57155 + (((tickAnim - 53) / 47) * (0-(0.57155)));
            zz = -2.69 + (((tickAnim - 53) / 47) * (0-(-2.69)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (11.16-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 11.16 + (((tickAnim - 30) / 10) * (9.75-(11.16)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 9.75 + (((tickAnim - 40) / 13) * (8-(9.75)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 8 + (((tickAnim - 53) / 47) * (0-(8)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 47) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-190))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*2.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-290))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-370))*1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(8.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-80))*8), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2 + (((tickAnim - 0) / 24) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2 + (((tickAnim - 24) / 26) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*2)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            zz = 0.425 + (((tickAnim - 12) / 12) * (0-(0.425)));
        }
        else if (tickAnim >= 24 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 15) * (0.425-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0.425 + (((tickAnim - 39) / 11) * (0-(0.425)));
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


    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 280;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -7.25 + (((tickAnim - 60) / 20) * (-9-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = -9 + (((tickAnim - 80) / 140) * (-9-(-9)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -9 + (((tickAnim - 220) / 60) * (0-(-9)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-8.35-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = -8.35 + (((tickAnim - 60) / 160) * (-8.35-(-8.35)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = -8.35 + (((tickAnim - 220) / 60) * (0-(-8.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 21.25 + (((tickAnim - 60) / 20) * (23-(21.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 23 + (((tickAnim - 80) / 140) * (23-(23)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 23 + (((tickAnim - 220) / 60) * (0-(23)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 0.25 + (((tickAnim - 80) / 140) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0.25 + (((tickAnim - 220) / 60) * (0-(0.25)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 12.5 + (((tickAnim - 60) / 160) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 12.5 + (((tickAnim - 220) / 60) * (0-(12.5)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = -1.325 + (((tickAnim - 60) / 160) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            yy = -1.325 + (((tickAnim - 220) / 60) * (0-(-1.325)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = -27 + (((tickAnim - 60) / 160) * (-27-(-27)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -27 + (((tickAnim - 220) / 60) * (0-(-27)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = -0.175 + (((tickAnim - 60) / 160) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            yy = -0.175 + (((tickAnim - 220) / 60) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-13.97-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -13.97 + (((tickAnim - 28) / 32) * (-5.75-(-13.97)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5.75 + (((tickAnim - 60) / 20) * (-4-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = -4 + (((tickAnim - 80) / 140) * (-4-(-4)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -4 + (((tickAnim - 220) / 60) * (0-(-4)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30 + (((tickAnim - 20) / 40) * (-8.25-(8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-30)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = -8.25 + (((tickAnim - 60) / 160) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 249) {
            xx = -8.25 + (((tickAnim - 220) / 29) * (37.26-(-8.25)));
            yy = 0 + (((tickAnim - 220) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 29) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 280) {
            xx = 37.26 + (((tickAnim - 249) / 31) * (0-(37.26)));
            yy = 0 + (((tickAnim - 249) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            yy = 1.65 + (((tickAnim - 20) / 40) * (0-(1.65)));
            zz = -0.9 + (((tickAnim - 20) / 40) * (0-(-0.9)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 220) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 29) * (2-(0)));
            zz = 0 + (((tickAnim - 220) / 29) * (-1.475-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 249) / 31) * (0-(0)));
            yy = 2 + (((tickAnim - 249) / 31) * (0-(2)));
            zz = -1.475 + (((tickAnim - 249) / 31) * (0-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-35.66-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = -35.66 + (((tickAnim - 28) / 16) * (-35.66-(-35.66)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -35.66 + (((tickAnim - 44) / 16) * (19.25-(-35.66)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 19.25 + (((tickAnim - 60) / 20) * (18.75-(19.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 18.75 + (((tickAnim - 80) / 140) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 249) {
            xx = 18.75 + (((tickAnim - 220) / 29) * (-34.36-(18.75)));
            yy = 0 + (((tickAnim - 220) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 29) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 280) {
            xx = -34.36 + (((tickAnim - 249) / 31) * (0-(-34.36)));
            yy = 0 + (((tickAnim - 249) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.645-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.85-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            yy = 1.645 + (((tickAnim - 28) / 16) * (1.645-(1.645)));
            zz = 0.85 + (((tickAnim - 28) / 16) * (0.85-(0.85)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 1.645 + (((tickAnim - 44) / 16) * (-0.375-(1.645)));
            zz = 0.85 + (((tickAnim - 44) / 16) * (0-(0.85)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = -0.375 + (((tickAnim - 60) / 160) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 220) / 29) * (0-(0)));
            yy = -0.375 + (((tickAnim - 220) / 29) * (1.635-(-0.375)));
            zz = 0 + (((tickAnim - 220) / 29) * (1.275-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 249) / 31) * (0-(0)));
            yy = 1.635 + (((tickAnim - 249) / 31) * (0-(1.635)));
            zz = 1.275 + (((tickAnim - 249) / 31) * (0-(1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38.92-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 38.92 + (((tickAnim - 10) / 18) * (75.56-(38.92)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 75.56 + (((tickAnim - 28) / 16) * (75.56-(75.56)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 75.56 + (((tickAnim - 44) / 16) * (2.25-(75.56)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 2.25 + (((tickAnim - 60) / 160) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 249) {
            xx = 2.25 + (((tickAnim - 220) / 29) * (83.66-(2.25)));
            yy = 0 + (((tickAnim - 220) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 29) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 280) {
            xx = 83.66 + (((tickAnim - 249) / 31) * (0-(83.66)));
            yy = 0 + (((tickAnim - 249) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 16) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            yy = -0.225 + (((tickAnim - 60) / 160) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            yy = -0.225 + (((tickAnim - 220) / 60) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (2-(1)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 2 + (((tickAnim - 80) / 140) * (2-(2)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 2 + (((tickAnim - 220) / 60) * (0-(2)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1.5 + (((tickAnim - 60) / 20) * (3-(1.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 3 + (((tickAnim - 80) / 140) * (3-(3)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 3 + (((tickAnim - 220) / 60) * (0-(3)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 3.25 + (((tickAnim - 60) / 20) * (3.75-(3.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 3.75 + (((tickAnim - 80) / 140) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 3.75 + (((tickAnim - 220) / 60) * (0-(3.75)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 280) {
            xx = 2.25 + (((tickAnim - 60) / 220) * (0-(2.25)));
            yy = 0 + (((tickAnim - 60) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 280) {
            xx = -2.5 + (((tickAnim - 60) / 220) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 220) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)) + (((tickAnim - 60) / 20) * (-6.125-(-5.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)))));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = -6.125 + (((tickAnim - 80) / 140) * (-6.125-(-6.125)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -6.125 + (((tickAnim - 220) / 60) * (0-(-6.125)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-1 + (((tickAnim - 0) / 80) * (1.5-(0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-1)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 220) {
            xx = 1.5 + (((tickAnim - 80) / 140) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 80) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 140) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 1.5 + (((tickAnim - 220) / 60) * (0-(1.5)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 160) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2 + (((tickAnim - 80) / 80) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2)));
            yy = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 80) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 220) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2 + (((tickAnim - 160) / 60) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*0.2-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140))*0.2)));
            yy = 0 + (((tickAnim - 160) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 60) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*0.2 + (((tickAnim - 220) / 60) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380))*0.2)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -4 + (((tickAnim - 60) / 20) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4-(-4)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 160) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4 + (((tickAnim - 80) / 80) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4)));
            yy = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 80) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 220) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4 + (((tickAnim - 160) / 60) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-50))*0.4-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-50))*0.4)));
            yy = 0 + (((tickAnim - 160) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 60) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-50))*0.4 + (((tickAnim - 220) / 60) * (0-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-50))*0.4)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -1.5 + (((tickAnim - 60) / 20) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6-(-1.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 160) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6 + (((tickAnim - 80) / 80) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6)));
            yy = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 80) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 220) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6 + (((tickAnim - 160) / 60) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-100))*0.6-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-100))*0.6)));
            yy = 0 + (((tickAnim - 160) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 60) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-100))*0.6 + (((tickAnim - 220) / 60) * (0-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-100))*0.6)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 6.25 + (((tickAnim - 60) / 20) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7-(6.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 160) {
            xx = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7 + (((tickAnim - 80) / 80) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7)));
            yy = 0 + (((tickAnim - 80) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 80) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 220) {
            xx = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7 + (((tickAnim - 160) / 60) * (6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*0.7-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-150))*0.7)));
            yy = 0 + (((tickAnim - 160) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 60) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = 6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*0.7 + (((tickAnim - 220) / 60) * (0-(6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*0.7)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 135) / 15) * (0-(0)));
            yy = -0.625 + (((tickAnim - 135) / 15) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 135) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyes.rotationPointX = this.eyes.rotationPointX + (float)(xx);
        this.eyes.rotationPointY = this.eyes.rotationPointY - (float)(yy);
        this.eyes.rotationPointZ = this.eyes.rotationPointZ + (float)(zz);


        if (tickAnim >= 120 && tickAnim < 135) {
            xx = 1 + (((tickAnim - 120) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 15) * (0.0725-(1)));
            zz = 1 + (((tickAnim - 120) / 15) * (1-(1)));
        }
        else if (tickAnim >= 135 && tickAnim < 150) {
            xx = 1 + (((tickAnim - 135) / 15) * (1-(1)));
            yy = 0.0725 + (((tickAnim - 135) / 15) * (1-(0.0725)));
            zz = 1 + (((tickAnim - 135) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 220) {
            xx = -4 + (((tickAnim - 60) / 160) * (-4-(-4)));
            yy = 0 + (((tickAnim - 60) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 160) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 280) {
            xx = -4 + (((tickAnim - 220) / 60) * (0-(-4)));
            yy = 0 + (((tickAnim - 220) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -22.75 + (((tickAnim - 0) / 33) * (25.25-(-22.75)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 25.25 + (((tickAnim - 33) / 27) * (-22.75-(25.25)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 20.75 + (((tickAnim - 0) / 33) * (7-(20.75)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 7 + (((tickAnim - 33) / 14) * (46.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(7)));
            yy = 0 + (((tickAnim - 33) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 14) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 46.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 47) / 6) * (-23.92-(46.505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -23.92 + (((tickAnim - 53) / 7) * (20.75-(-23.92)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 0) / 2) * (-1.325-(-1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 2) / 31) * (0-(0)));
            yy = -1.325 + (((tickAnim - 2) / 31) * (-1.275-(-1.325)));
            zz = 0 + (((tickAnim - 2) / 31) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 33) / 14) * (0-(0)));
            yy = -1.275 + (((tickAnim - 33) / 14) * (1.735-(-1.275)));
            zz = 0 + (((tickAnim - 33) / 14) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 1.735 + (((tickAnim - 47) / 6) * (1.735-(1.735)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 1.735 + (((tickAnim - 53) / 5) * (-1.4-(1.735)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = -1.4 + (((tickAnim - 58) / 2) * (-0.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(-1.4)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.75 + (((tickAnim - 0) / 10) * (-10.79-(1.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.79 + (((tickAnim - 10) / 5) * (-17.79-(-10.79)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -17.79 + (((tickAnim - 15) / 18) * (42.25-(-17.79)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 42.25 + (((tickAnim - 33) / 5) * (74.32-(42.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 74.32 + (((tickAnim - 38) / 15) * (74.32-(74.32)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 74.32 + (((tickAnim - 53) / 7) * (1.75-(74.32)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 10) * (1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 10) / 5) * (3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 15) / 1) * (0.71-(3.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.25 + (((tickAnim - 15) / 1) * (-0.33-(-0.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.71 + (((tickAnim - 16) / 7) * (0.535-(0.71)));
            zz = -0.33 + (((tickAnim - 16) / 7) * (-0.5-(-0.33)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0.535 + (((tickAnim - 23) / 10) * (0-(0.535)));
            zz = -0.5 + (((tickAnim - 23) / 10) * (-0.825-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 27) * (-0.725-(0)));
            zz = -0.825 + (((tickAnim - 33) / 27) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 25.25 + (((tickAnim - 0) / 28) * (-22.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -22.75 + (((tickAnim - 28) / 32) * (25.25-(-22.75)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.75 + (((tickAnim - 0) / 10) * (49.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100-(7.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 49.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100 + (((tickAnim - 10) / 18) * (0-(49.105+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100)));
            yy = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 18) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (7.75-(0)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 10) / 18) * (0-(0)));
            yy = 2 + (((tickAnim - 10) / 18) * (0-(2)));
            zz = -1.15 + (((tickAnim - 10) / 18) * (0-(-1.15)));
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
            xx = 42.25 + (((tickAnim - 0) / 6) * (74.32-(42.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 21) {
            xx = 74.32 + (((tickAnim - 6) / 15) * (74.32-(74.32)));
            yy = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 15) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 74.32 + (((tickAnim - 21) / 7) * (1.75-(74.32)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 1.75 + (((tickAnim - 28) / 10) * (-10.79-(1.75)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -10.79 + (((tickAnim - 38) / 5) * (-17.79-(-10.79)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -17.79 + (((tickAnim - 43) / 17) * (42.25-(-17.79)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = -0.825 + (((tickAnim - 0) / 28) * (0-(-0.825)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (-4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (-0.25-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 38) / 5) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = -0.25 + (((tickAnim - 38) / 5) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 43) / 0) * (0-(0)));
            yy = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 43) / 0) * (0.785-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.25 + (((tickAnim - 43) / 0) * (-0.33-(-0.25)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.785 + (((tickAnim - 43) / 7) * (0.785-(0.785)));
            zz = -0.33 + (((tickAnim - 43) / 7) * (-0.5-(-0.33)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0.785 + (((tickAnim - 50) / 10) * (0-(0.785)));
            zz = -0.5 + (((tickAnim - 50) / 10) * (-0.825-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28 + (((tickAnim - 0) / 6) * (0-(-28)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 6) / 15) * (17.75-(0)));
            yy = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 15) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 21) / 7) * (0-(17.75)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (-34-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -34 + (((tickAnim - 50) / 10) * (-28-(-34)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 7.75 + (((tickAnim - 33) / 10) * (-41.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*120-(7.75)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -41.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*120 + (((tickAnim - 43) / 17) * (0-(-41.82+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*120)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (-1.15-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 2 + (((tickAnim - 43) / 17) * (0-(2)));
            zz = -1.15 + (((tickAnim - 43) / 17) * (0-(-1.15)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-34-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -34 + (((tickAnim - 23) / 10) * (-28-(-34)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -28 + (((tickAnim - 33) / 5) * (0-(-28)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (17.75-(0)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 17.75 + (((tickAnim - 53) / 7) * (0-(17.75)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 27) * (0-(0)));
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
            xx = 7 + (((tickAnim - 0) / 14) * (-69.995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(7)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -69.995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 14) / 7) * (-29.67-(-69.995+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -29.67 + (((tickAnim - 21) / 7) * (20.75-(-29.67)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 20.75 + (((tickAnim - 28) / 32) * (7-(20.75)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -1.275 + (((tickAnim - 0) / 14) * (1.735-(-1.275)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 1.735 + (((tickAnim - 14) / 7) * (1.735-(1.735)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 1.735 + (((tickAnim - 21) / 7) * (-1.4-(1.735)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = -1.4 + (((tickAnim - 28) / 32) * (-1.275-(-1.4)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-1), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-190))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*-0.55);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-1), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*-1.2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*-1.4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-300))*-1.6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*-1.8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-400))*-2), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-450))*-2.2), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-150))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-200))*-1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*-1.5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-300))*-2), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*-1.5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-300))*-2), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-250))*-1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-300))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-350))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-450))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-500))*-1), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-550))*1), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

   }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTarbosaurus entity = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.75 + (((tickAnim - 0) / 19) * (25.25-(-22.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 19) / 16) * (-22.75-(25.25)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02 + (((tickAnim - 0) / 19) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02-(0)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 20.75 + (((tickAnim - 0) / 19) * (7-(20.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 7 + (((tickAnim - 19) / 8) * (58.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(7)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 58.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 27) / 4) * (-38.42-(58.605+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -38.42 + (((tickAnim - 31) / 4) * (20.75-(-38.42)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 0) / 19) * (-1.275-(-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            yy = -1.275 + (((tickAnim - 19) / 8) * (1.785-(-1.275)));
            zz = 0 + (((tickAnim - 19) / 8) * (1.1-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 1.785 + (((tickAnim - 27) / 4) * (1.735-(1.785)));
            zz = 1.1 + (((tickAnim - 27) / 4) * (0-(1.1)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            yy = 1.735 + (((tickAnim - 31) / 3) * (-1.4-(1.735)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = -1.4 + (((tickAnim - 34) / 1) * (-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(-1.4)));
            zz = 0 + (((tickAnim - 34) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1.75 + (((tickAnim - 0) / 6) * (-10.79-(1.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -10.79 + (((tickAnim - 6) / 3) * (-17.79-(-10.79)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -17.79 + (((tickAnim - 9) / 10) * (42.25-(-17.79)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 42.25 + (((tickAnim - 19) / 4) * (74.32-(42.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 74.32 + (((tickAnim - 23) / 8) * (74.32-(74.32)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 74.32 + (((tickAnim - 31) / 4) * (1.75-(74.32)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 6) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3-(0.425)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3 + (((tickAnim - 6) / 3) * (3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-3)));
            zz = -0.25 + (((tickAnim - 6) / 3) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 9) / 4) * (1.135-(3.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.25 + (((tickAnim - 9) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 1.135 + (((tickAnim - 13) / 6) * (0-(1.135)));
            zz = -0.5 + (((tickAnim - 13) / 6) * (-0.825-(-0.5)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0.425-(0)));
            zz = -0.825 + (((tickAnim - 19) / 16) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 25.25 + (((tickAnim - 0) / 16) * (-22.75-(25.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = -22.75 + (((tickAnim - 16) / 19) * (25.25-(-22.75)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02 + (((tickAnim - 16) / 19) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.02)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.75 + (((tickAnim - 0) / 6) * (32.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100-(7.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 32.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100 + (((tickAnim - 6) / 10) * (0-(32.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-100)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (7.75-(0)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-1.15-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            yy = 2 + (((tickAnim - 6) / 10) * (0-(2)));
            zz = -1.15 + (((tickAnim - 6) / 10) * (0-(-1.15)));
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
            xx = 42.25 + (((tickAnim - 0) / 3) * (74.32-(42.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 74.32 + (((tickAnim - 3) / 9) * (76.32-(74.32)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 76.32 + (((tickAnim - 12) / 4) * (1.75-(76.32)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 1.75 + (((tickAnim - 16) / 7) * (-12.54-(1.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.54 + (((tickAnim - 23) / 2) * (-17.79-(-12.54)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.79 + (((tickAnim - 25) / 10) * (42.25-(-17.79)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.025-(0)));
            zz = -0.825 + (((tickAnim - 0) / 16) * (0-(-0.825)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.025 + (((tickAnim - 16) / 7) * (4.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0.025)));
            zz = 0 + (((tickAnim - 16) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 4.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 23) / 2) * (4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(4.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.25 + (((tickAnim - 23) / 2) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 25) / 4) * (0.935-(4.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = -0.25 + (((tickAnim - 25) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.935 + (((tickAnim - 29) / 6) * (0-(0.935)));
            zz = -0.5 + (((tickAnim - 29) / 6) * (-0.825-(-0.5)));
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
            xx = -28 + (((tickAnim - 0) / 3) * (0-(-28)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (17.75-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 17.75 + (((tickAnim - 12) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (-34-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -34 + (((tickAnim - 29) / 6) * (-28-(-34)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 7.75 + (((tickAnim - 19) / 6) * (-60.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*120-(7.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -60.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*120 + (((tickAnim - 25) / 10) * (0-(-60.87+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+70))*120)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (2-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-1.15-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 2 + (((tickAnim - 25) / 10) * (0-(2)));
            zz = -1.15 + (((tickAnim - 25) / 10) * (0-(-1.15)));
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
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (-34-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -34 + (((tickAnim - 13) / 6) * (-28-(-34)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -28 + (((tickAnim - 19) / 4) * (0-(-28)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (17.75-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 17.75 + (((tickAnim - 31) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
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
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0-(0)));
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
            xx = 7 + (((tickAnim - 0) / 8) * (-62.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -62.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 8) / 4) * (-29.67-(-62.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -29.67 + (((tickAnim - 12) / 4) * (20.75-(-29.67)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 20.75 + (((tickAnim - 16) / 19) * (7-(20.75)));
            yy = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.275 + (((tickAnim - 0) / 8) * (1.735-(-1.275)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.735 + (((tickAnim - 8) / 4) * (1.735-(1.735)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.735 + (((tickAnim - 12) / 4) * (-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1-(1.735)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = -1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1 + (((tickAnim - 16) / 19) * (-1.275-(-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*-0.1)));
            zz = 0 + (((tickAnim - 16) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-50))*-1.8), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-190))*-0.85);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-50))*-0.85);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*-2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-200))*-2.2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*-2.4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-300))*-2.6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-350))*-2.8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-400))*-3), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-450))*-3.2), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-100))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-200))*-1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*-2.5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-300))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-1));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*-2.5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-300))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*-1));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*-2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-250))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-300))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-350))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-500))*-1), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(5.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-550))*1), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTarbosaurus ee = (EntityPrehistoricFloraTarbosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTarbosaurus e = (EntityPrehistoricFloraTarbosaurus) entity;
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
