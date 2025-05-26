package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEocarcharia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEocarcharia extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer HipsDinoKing;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
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
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Tail1DinoKing;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Tail2DinoKing;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer Tail3DinoKing;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer Tail4DinoKing;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer Tail5DinoKing;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer Tail6DinoKing;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer BodyDinoKing;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer ChestDinoKing;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Neck2DinoKing;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Neck3DinoKing;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Neck4DinoKing;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer HeadDinoKing;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer eye;

    private ModelAnimator animator;

    public ModelEocarcharia() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -12.0F, 0.2F);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 35, -6.0F, -2.36F, -4.0038F, 12, 17, 16, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 66, 0, -3.0F, -4.86F, -4.0038F, 6, 3, 16, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(9.0F, -4.86F, 6.9962F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 127, -12.0F, 0.0F, 0.0F, 6, 4, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(9.0F, -4.86F, 2.9962F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 114, 116, -12.0F, 0.0F, -7.0F, 6, 2, 7, -0.01F, false));

        this.HipsDinoKing = new AdvancedModelRenderer(this);
        this.HipsDinoKing.setRotationPoint(9.0F, -4.86F, 6.9962F);
        this.hips.addChild(HipsDinoKing);
        this.HipsDinoKing.cubeList.add(new ModelBox(HipsDinoKing, 44, 134, -9.0F, -2.0F, -4.0F, 0, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HipsDinoKing.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 130, 137, -9.0F, -2.0F, 0.0F, 0, 2, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.HipsDinoKing.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 131, -9.0F, -2.0F, -4.0F, 0, 2, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(6.0F, 2.64F, 4.2462F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 68, -3.0F, -4.0F, -4.0F, 6, 19, 10, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 14.0F, -0.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6109F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 106, 80, -2.5F, -1.5F, -3.0F, 5, 15, 6, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 130, 37, -2.0F, -1.5F, -2.0F, 4, 8, 4, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.25F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3491F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 132, 67, -2.5F, -0.5F, -3.0F, 5, 2, 5, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 124, 53, -3.0F, -1.0F, -4.75F, 6, 2, 5, 0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-6.0F, 2.64F, 4.2462F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 68, -3.0F, -4.0F, -4.0F, 6, 19, 10, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 14.0F, -0.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6109F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 106, 80, -2.5F, -1.5F, -3.0F, 5, 15, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 130, 37, -2.0F, -1.5F, -2.0F, 4, 8, 4, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.25F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3491F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 132, 67, -2.5F, -0.5F, -3.0F, 5, 2, 5, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 124, 53, -3.0F, -1.0F, -4.75F, 6, 2, 5, 0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.64F, 11.2462F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 70, 85, -4.0F, -3.75F, 0.0F, 8, 12, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -7.3486F, 3.9848F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 90, 127, -2.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.tail1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 107, -2.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.Tail1DinoKing = new AdvancedModelRenderer(this);
        this.Tail1DinoKing.setRotationPoint(0.0F, -7.3486F, 3.9848F);
        this.tail1.addChild(Tail1DinoKing);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail1DinoKing.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 138, 0.0F, -2.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3486F, -3.9848F);
        this.Tail1DinoKing.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 138, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 56, 61, -2.5F, -3.5F, -1.0F, 5, 9, 15, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -5.75F, 0.0F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1833F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 102, 19, -1.0F, -0.25F, -1.0F, 3, 3, 15, 0.0F, false));

        this.Tail2DinoKing = new AdvancedModelRenderer(this);
        this.Tail2DinoKing.setRotationPoint(-0.5F, -5.75F, 0.0F);
        this.tail2.addChild(Tail2DinoKing);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail2DinoKing.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1833F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 114, 125, 0.5F, -2.25F, 2.0F, 0, 2, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 14.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 85, -2.0F, -3.5F, -1.0F, 4, 6, 15, 0.0F, false));

        this.Tail3DinoKing = new AdvancedModelRenderer(this);
        this.Tail3DinoKing.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.tail3.addChild(Tail3DinoKing);
        this.Tail3DinoKing.cubeList.add(new ModelBox(Tail3DinoKing, 102, 37, 0.0F, -7.0F, -1.0F, 0, 2, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.5F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 96, 61, -1.5F, -1.75F, -1.0F, 3, 4, 15, 0.0F, false));

        this.Tail4DinoKing = new AdvancedModelRenderer(this);
        this.Tail4DinoKing.setRotationPoint(-0.5F, 3.25F, 0.0F);
        this.tail4.addChild(Tail4DinoKing);
        this.Tail4DinoKing.cubeList.add(new ModelBox(Tail4DinoKing, 140, 119, 0.5F, -7.0F, 1.0F, 0, 2, 2, 0.0F, false));
        this.Tail4DinoKing.cubeList.add(new ModelBox(Tail4DinoKing, 134, 140, 0.5F, -6.75F, 5.0F, 0, 2, 2, 0.0F, false));
        this.Tail4DinoKing.cubeList.add(new ModelBox(Tail4DinoKing, 138, 140, 0.5F, -6.5F, 8.5F, 0, 2, 2, 0.0F, false));
        this.Tail4DinoKing.cubeList.add(new ModelBox(Tail4DinoKing, 30, 141, 0.5F, -6.25F, 12.0F, 0, 2, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 32, 106, -1.0F, -1.25F, -1.0F, 2, 3, 12, 0.0F, false));

        this.Tail5DinoKing = new AdvancedModelRenderer(this);
        this.Tail5DinoKing.setRotationPoint(1.0F, 3.75F, 0.0F);
        this.tail5.addChild(Tail5DinoKing);
        this.Tail5DinoKing.cubeList.add(new ModelBox(Tail5DinoKing, 0, 132, -1.0F, -6.0F, 1.0F, 0, 1, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 110, -0.5F, -0.75F, -1.0F, 1, 2, 11, 0.0F, false));

        this.Tail6DinoKing = new AdvancedModelRenderer(this);
        this.Tail6DinoKing.setRotationPoint(0.5F, 4.25F, 0.0F);
        this.tail6.addChild(Tail6DinoKing);
        this.Tail6DinoKing.cubeList.add(new ModelBox(Tail6DinoKing, 110, 135, -0.5F, -6.0F, -0.25F, 0, 1, 1, 0.0F, false));
        this.Tail6DinoKing.cubeList.add(new ModelBox(Tail6DinoKing, 46, 138, -0.5F, -5.75F, 1.75F, 0, 1, 3, 0.0F, false));
        this.Tail6DinoKing.cubeList.add(new ModelBox(Tail6DinoKing, 52, 138, -0.5F, -5.5F, 5.75F, 0, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.64F, -2.7538F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -4.25F, -16.25F, 16, 18, 17, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 60, 107, -4.0F, -7.5344F, -6.2842F, 8, 4, 7, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(9.0F, -6.75F, -15.25F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 19, -13.0F, 0.0F, 0.0F, 8, 4, 9, 0.0F, false));

        this.BodyDinoKing = new AdvancedModelRenderer(this);
        this.BodyDinoKing.setRotationPoint(9.0F, -7.5344F, -6.2842F);
        this.body.addChild(BodyDinoKing);
        this.BodyDinoKing.cubeList.add(new ModelBox(BodyDinoKing, 118, 137, -9.0F, -2.0F, 1.0F, 0, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.7844F, -8.9658F);
        this.BodyDinoKing.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 106, 137, -9.0F, -2.0F, 2.0F, 0, 2, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -15.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 56, 35, -6.0F, -3.0F, -10.25F, 12, 15, 11, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(9.0F, -4.5F, -7.25F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 97, -12.0F, 0.0F, -1.0F, 6, 3, 10, 0.0F, false));

        this.ChestDinoKing = new AdvancedModelRenderer(this);
        this.ChestDinoKing.setRotationPoint(9.0F, -4.5F, -7.25F);
        this.chest.addChild(ChestDinoKing);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestDinoKing.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 130, -9.0F, -1.75F, 6.0F, 0, 2, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 110, 127, -9.0F, -1.5F, 2.5F, 0, 2, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 140, 115, -9.0F, -1.25F, -1.0F, 0, 2, 2, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(6.0F, 9.0F, -7.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 1.1781F, 0.3054F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 134, 0, -1.5F, -1.25F, -1.75F, 3, 8, 4, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4399F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 82, 137, -1.5F, -1.0F, -1.5F, 3, 6, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.0F, 5.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.2618F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 48, 121, -2.0F, 0.0F, -2.0F, 2, 2, 4, 0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 94, 137, -2.0F, 2.0F, -2.0F, 2, 4, 4, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-6.0F, 9.0F, -7.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 1.1781F, -0.3054F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 134, 0, -1.5F, -1.25F, -1.75F, 3, 8, 4, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.4399F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 82, 137, -1.5F, -1.0F, -1.5F, 3, 6, 3, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.0F, 5.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.2618F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 48, 121, 0.0F, 0.0F, -2.0F, 2, 2, 4, 0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 94, 137, 0.0F, 2.0F, -2.0F, 2, 4, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -8.25F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3927F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 106, 101, -4.0F, -3.0F, -4.0F, 8, 10, 5, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 132, 108, -2.0F, -4.25F, -4.0F, 4, 2, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 32, 68, -3.0F, -3.25F, -4.0F, 6, 9, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(9.0F, -4.25F, -4.0F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 134, 133, -10.5F, -0.6F, 0.0F, 3, 2, 5, 0.02F, false));

        this.Neck2DinoKing = new AdvancedModelRenderer(this);
        this.Neck2DinoKing.setRotationPoint(9.0F, -4.25F, -4.0F);
        this.neck2.addChild(Neck2DinoKing);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck2DinoKing.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 138, -9.0F, -1.6F, 1.0F, 0, 2, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.25F, -3.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 110, 0, -2.5F, -2.75F, -5.25F, 5, 6, 7, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(9.0F, -1.75F, -12.25F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 132, 100, -10.5F, -3.25F, 7.0F, 3, 2, 6, 0.01F, false));

        this.Neck3DinoKing = new AdvancedModelRenderer(this);
        this.Neck3DinoKing.setRotationPoint(9.0F, -1.75F, -12.25F);
        this.neck3.addChild(Neck3DinoKing);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck3DinoKing.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 124, 13, -9.0F, -4.25F, 7.0F, 0, 1, 5, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.5F, -4.75F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5236F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 128, 90, -2.0F, -3.0F, -3.75F, 4, 5, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(8.5F, -5.2F, -1.45F);
        this.neck4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1658F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 68, 136, -10.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.Neck4DinoKing = new AdvancedModelRenderer(this);
        this.Neck4DinoKing.setRotationPoint(8.5F, -5.2F, -1.45F);
        this.neck4.addChild(Neck4DinoKing);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Neck4DinoKing.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1658F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 100, 33, -8.5F, -0.75F, 2.0F, 0, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 100, 31, -8.5F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 48, 127, -2.5F, -2.75F, -4.25F, 5, 6, 5, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(8.5F, -2.3617F, -5.7881F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.3875F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 138, 19, -10.0F, -2.0F, 0.0F, 3, 2, 2, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0F, 3.9167F, -13.1676F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 83, -3.0F, -0.5F, -0.75F, 2, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.2955F, -12.0648F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.1781F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 118, -1.0F, -7.0F, 0.0F, 2, 7, 1, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(9.0F, 1.7342F, -13.4541F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.7679F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 138, 34, -10.0F, -2.0F, 0.0F, 2, 2, 1, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(9.0F, 3.9167F, -12.9676F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2443F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 138, -10.0F, -2.0F, -1.0F, 2, 2, 1, 0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.2355F, -2.8852F, -2.8752F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.6516F, -0.0566F, -0.2148F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 141, -0.35F, -2.0F, -0.2F, 1, 2, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5F, 0.2833F, -11.981F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.9205F, -0.0513F, -0.0839F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 18, 132, 0.0F, -8.4047F, -5.8982F, 1, 3, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5F, 0.2833F, -11.981F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.0915F, -0.0513F, -0.0839F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 110, 0.0F, -8.0F, 0.0F, 1, 8, 3, 0.01F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, 0.2833F, -11.981F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.9205F, 0.0513F, 0.0839F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 18, 132, -1.0F, -8.4047F, -5.8982F, 1, 3, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.2355F, -2.8852F, -2.8752F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.6516F, 0.0566F, 0.2148F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 141, -0.65F, -2.0F, -0.2F, 1, 2, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5F, 0.2833F, -11.981F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.0915F, 0.0513F, 0.0839F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 110, -1.0F, -8.0F, 0.0F, 1, 8, 3, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(9.0F, 1.9216F, -12.9781F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5585F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 130, 49, -10.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(2.0F, 4.0562F, -11.1725F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0698F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 138, 27, -3.5F, -0.5F, -1.95F, 3, 1, 2, 0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(9.0F, 3.5226F, -11.8364F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4102F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 83, -10.5F, 0.75F, 3.5F, 3, 1, 1, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(9.0F, 3.5226F, -11.8364F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2356F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 32, 83, -10.5F, 0.5F, 1.75F, 3, 1, 1, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(9.0F, 3.5226F, -11.5864F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1047F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 140, 49, -10.0F, 0.25F, -0.25F, 2, 1, 1, 0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(9.0F, 4.0562F, -11.1225F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0698F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 52, 83, -9.5F, -0.5F, -2.5F, 1, 1, 1, 0.01F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 138, 23, -10.5F, -2.0F, -2.0F, 3, 2, 2, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.5F, 3.0407F, -7.0427F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2356F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 132, 60, -3.5F, -0.5F, -4.35F, 4, 1, 6, -0.01F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 90, 116, -3.5F, -3.0F, -4.35F, 4, 3, 8, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(8.5F, 3.25F, -4.05F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0698F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 110, 13, -10.5F, -3.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(8.0F, -4.5558F, 1.1385F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.5236F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 138, 30, -9.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(8.0F, -4.1642F, -1.8358F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1309F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 132, 74, -9.0F, 0.0F, 0.0F, 2, 2, 3, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(8.0F, -2.75F, -3.25F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.7854F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 96, 80, -9.0F, 0.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.HeadDinoKing = new AdvancedModelRenderer(this);
        this.HeadDinoKing.setRotationPoint(1.5902F, -2.9488F, -5.7524F);
        this.head.addChild(HeadDinoKing);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-3.1804F, 0.0F, 0.0F);
        this.HeadDinoKing.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.5679F, -0.0513F, -0.0839F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 100, 28, 0.0F, 3.5F, -2.75F, 0, 2, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 100, 25, 0.0F, 1.75F, -1.75F, 0, 2, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 100, 22, 0.0F, 0.0F, -1.0F, 0, 2, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 100, 19, 0.0F, -1.75F, 0.0F, 0, 2, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadDinoKing.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.5679F, 0.0513F, 0.0839F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 100, 19, 0.0F, -1.75F, 0.0F, 0, 2, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 100, 22, 0.0F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 100, 25, 0.0F, 1.75F, -1.75F, 0, 2, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 100, 28, 0.0F, 3.5F, -2.75F, 0, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0131F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 130, -2.5F, 0.25F, -5.0F, 5, 3, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 90, 32, -1.5F, 2.5056F, -13.7149F, 3, 1, 2, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(9.0F, 3.5056F, -11.5649F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1134F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 24, 121, -11.0F, -1.5F, -0.15F, 4, 1, 8, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(9.0F, 3.5056F, -11.5649F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0436F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 102, 53, -11.0F, -1.0F, -0.1951F, 4, 1, 7, -0.02F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(9.0F, 3.2891F, -14.5912F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.2182F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 140, 123, -10.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(16.0F, 3.0277F, -11.6027F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0873F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 46, 83, -17.0F, -1.5F, -3.0F, 2, 1, 1, -0.01F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 140, 51, -17.0F, -1.0F, -3.0F, 2, 1, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(15.5F, 3.0277F, -11.8027F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0873F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 30, 138, -17.0F, -1.5F, -1.95F, 3, 1, 2, -0.01F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 80, 32, -17.0F, -1.0F, -1.95F, 3, 1, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(8.5F, 3.0277F, -11.8027F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1745F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 83, -10.0F, -1.5F, 4.3F, 3, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 83, -10.0F, -1.6F, 2.3F, 3, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 83, -10.0F, -1.75F, 0.3F, 3, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 140, 49, -9.5F, -1.6F, -1.7F, 2, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(16.0F, 2.0876F, -11.9081F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1745F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 123, -18.0F, -0.55F, 0.0F, 4, 1, 8, -0.03F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(9.0F, 0.25F, -5.05F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.2618F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 60, 118, -11.0F, 0.0F, -6.95F, 4, 1, 8, -0.02F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(8.5F, 0.25F, -5.0F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.2618F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 134, 12, -11.0F, -3.0F, 0.0F, 5, 3, 4, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 3.25F, -6.0F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, -0.1833F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 134, 125, -1.5F, -3.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -3.0F, 4.5F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, -0.1745F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 128, 80, -2.0F, -1.0F, -0.5F, 4, 4, 6, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -1.0F, -3.25F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 66, 32, -2.5F, -0.5F, -1.0F, 5, 1, 2, 0.02F, false));

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
        this.hips.offsetY = 0.20F;
        this.hips.offsetX = 0.4F;
        this.hips.offsetZ = 1.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(12);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.55F;
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

        EntityPrehistoricFloraEocarcharia EntityEocarcharia = (EntityPrehistoricFloraEocarcharia) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityEocarcharia.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityEocarcharia.getAnimation() == EntityEocarcharia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityEocarcharia.isReallyInWater()) {

                if (f3 == 0.0F || !EntityEocarcharia.getIsMoving()) {
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

                if (EntityEocarcharia.getIsFast()) { //Running


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
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 5) / 8) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(2.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 13) / 7) * (0-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 5) / 8) * (3.25-(-3.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 13) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 5) / 8) * (18.26334-(-4.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.40991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (3.72756-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.26334 + (((tickAnim - 13) / 7) * (0-(18.26334)));
            yy = 0.40991 + (((tickAnim - 13) / 7) * (0-(0.40991)));
            zz = 3.72756 + (((tickAnim - 13) / 7) * (0-(3.72756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 5) / 8) * (10.5013-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0.08547-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.74791-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.5013 + (((tickAnim - 13) / 7) * (0-(10.5013)));
            yy = 0.08547 + (((tickAnim - 13) / 7) * (0-(0.08547)));
            zz = 1.74791 + (((tickAnim - 13) / 7) * (0-(1.74791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.75 + (((tickAnim - 5) / 8) * (-12.25077-(0.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.11991-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0.74035-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12.25077 + (((tickAnim - 13) / 7) * (0-(-12.25077)));
            yy = -0.11991 + (((tickAnim - 13) / 7) * (0-(-0.11991)));
            zz = 0.74035 + (((tickAnim - 13) / 7) * (0-(0.74035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 8.75 + (((tickAnim - 5) / 8) * (-21.00462-(8.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (-0.30715-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (1.72284-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -21.00462 + (((tickAnim - 13) / 7) * (0-(-21.00462)));
            yy = -0.30715 + (((tickAnim - 13) / 7) * (0-(-0.30715)));
            zz = 1.72284 + (((tickAnim - 13) / 7) * (0-(1.72284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 2.75 + (((tickAnim - 5) / 4) * (0.84-(2.75)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.84 + (((tickAnim - 9) / 4) * (-13.5-(0.84)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -13.5 + (((tickAnim - 13) / 7) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.5 + (((tickAnim - 5) / 4) * (36.14-(3.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 36.14 + (((tickAnim - 9) / 4) * (0-(36.14)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 9) / 4) * (16.75-(-11.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 13) / 7) * (0-(16.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.025-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (3.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.025 + (((tickAnim - 13) / 1) * (0.145-(0.025)));
            zz = 3.225 + (((tickAnim - 13) / 1) * (2.51-(3.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.145 + (((tickAnim - 14) / 6) * (0-(0.145)));
            zz = 2.51 + (((tickAnim - 14) / 6) * (0-(2.51)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = -11.75 + (((tickAnim - 0) / 23) * (11.5-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 23) / 27) * (-11.75-(11.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -8.75 + (((tickAnim - 0) / 23) * (23.5-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 23.5 + (((tickAnim - 23) / 27) * (-8.75-(23.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -1.375 + (((tickAnim - 0) / 23) * (0-(-1.375)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (-1.375-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 0) / 23) * (8.5-(3.75)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 8.5 + (((tickAnim - 23) / 10) * (-55.24-(8.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -55.24 + (((tickAnim - 33) / 10) * (-55.24-(-55.24)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -55.24 + (((tickAnim - 43) / 7) * (3.75-(-55.24)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.2-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0.2 + (((tickAnim - 23) / 27) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 0) / 23) * (54-(17)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 54 + (((tickAnim - 23) / 10) * (78.77-(54)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 78.77 + (((tickAnim - 33) / 10) * (78.77-(78.77)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 78.77 + (((tickAnim - 43) / 7) * (17-(78.77)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.475-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 2.475 + (((tickAnim - 10) / 13) * (1.8-(2.475)));
            zz = 0 + (((tickAnim - 10) / 13) * (-0.45-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (-0.05-(0)));
            yy = 1.8 + (((tickAnim - 23) / 5) * (3.365-(1.8)));
            zz = -0.45 + (((tickAnim - 23) / 5) * (-0.72-(-0.45)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.05 + (((tickAnim - 28) / 5) * (-0.1-(-0.05)));
            yy = 3.365 + (((tickAnim - 28) / 5) * (2.05-(3.365)));
            zz = -0.72 + (((tickAnim - 28) / 5) * (-0.95-(-0.72)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -0.1 + (((tickAnim - 33) / 10) * (-0.1-(-0.1)));
            yy = 2.05 + (((tickAnim - 33) / 10) * (2.05-(2.05)));
            zz = -0.95 + (((tickAnim - 33) / 10) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.1 + (((tickAnim - 43) / 7) * (0-(-0.1)));
            yy = 2.05 + (((tickAnim - 43) / 7) * (0-(2.05)));
            zz = -0.95 + (((tickAnim - 43) / 7) * (0-(-0.95)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-40.43-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -40.43 + (((tickAnim - 10) / 7) * (-39.21-(-40.43)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -39.21 + (((tickAnim - 17) / 6) * (41-(-39.21)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 41 + (((tickAnim - 23) / 5) * (9.95-(41)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 9.95 + (((tickAnim - 28) / 22) * (0-(9.95)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.95-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0.95 + (((tickAnim - 28) / 22) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+190))*-4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.25249), body.rotateAngleY + (float) Math.toRadians(-3.48645), body.rotateAngleZ + (float) Math.toRadians(3.9993+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(-9), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(12.70541), neck1.rotateAngleY + (float) Math.toRadians(-8.22683), neck1.rotateAngleZ + (float) Math.toRadians(0.62+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-30))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.25568), neck2.rotateAngleY + (float) Math.toRadians(-6.24914), neck2.rotateAngleZ + (float) Math.toRadians(-0.104+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-60))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.64448), neck3.rotateAngleY + (float) Math.toRadians(-7.70912), neck3.rotateAngleZ + (float) Math.toRadians(-2.1441+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-90))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(-10.25), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-8), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0), throat1.rotateAngleY + (float) Math.toRadians(2.25), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(16), throat2.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -4 + (((tickAnim - 18) / 15) * (-4-(-4)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 33) / 17) * (0-(-4)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (-6.85-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -6.85 + (((tickAnim - 18) / 15) * (-6.85-(-6.85)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -6.85 + (((tickAnim - 33) / 17) * (0-(-6.85)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 37.25 + (((tickAnim - 18) / 15) * (37.25-(37.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 37.25 + (((tickAnim - 33) / 17) * (0-(37.25)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.9-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.4 + (((tickAnim - 18) / 15) * (1.4-(1.4)));
            zz = -0.9 + (((tickAnim - 18) / 15) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 33) / 17) * (0-(1.4)));
            zz = -0.9 + (((tickAnim - 33) / 17) * (0-(-0.9)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 18) / 15) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 33) / 17) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.825-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.975 + (((tickAnim - 18) / 15) * (0.975-(0.975)));
            zz = -0.825 + (((tickAnim - 18) / 15) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.975 + (((tickAnim - 33) / 17) * (0-(0.975)));
            zz = -0.825 + (((tickAnim - 33) / 17) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 18) / 15) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 33) / 17) * (0-(14)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 37.25 + (((tickAnim - 18) / 15) * (37.25-(37.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 37.25 + (((tickAnim - 33) / 17) * (0-(37.25)));
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
            yy = 0 + (((tickAnim - 0) / 18) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.9-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.4 + (((tickAnim - 18) / 15) * (1.4-(1.4)));
            zz = -0.9 + (((tickAnim - 18) / 15) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 33) / 17) * (0-(1.4)));
            zz = -0.9 + (((tickAnim - 33) / 17) * (0-(-0.9)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -40.75 + (((tickAnim - 18) / 15) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -40.75 + (((tickAnim - 33) / 17) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.825-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.975 + (((tickAnim - 18) / 15) * (0.975-(0.975)));
            zz = -0.825 + (((tickAnim - 18) / 15) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.975 + (((tickAnim - 33) / 17) * (0-(0.975)));
            zz = -0.825 + (((tickAnim - 33) / 17) * (0-(-0.825)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 18) / 15) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 33) / 17) * (0-(14)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -7 + (((tickAnim - 18) / 15) * (-7-(-7)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 33) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-9.67-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -9.67 + (((tickAnim - 9) / 9) * (-8.75-(-9.67)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -8.75 + (((tickAnim - 18) / 15) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 33) / 17) * (0-(-8.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.61-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -1.61 + (((tickAnim - 9) / 9) * (4.5-(-1.61)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 33) / 17) * (0-(4.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (1.83-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 1.83 + (((tickAnim - 9) / 9) * (28-(1.83)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 28 + (((tickAnim - 18) / 15) * (28-(28)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 28 + (((tickAnim - 33) / 4) * (7.83-(28)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 7.83 + (((tickAnim - 37) / 5) * (-5.61-(7.83)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -5.61 + (((tickAnim - 42) / 8) * (0-(-5.61)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.69898-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.95475-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.90924-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.69898 + (((tickAnim - 7) / 2) * (29.60205-(-1.69898)));
            yy = -2.95475 + (((tickAnim - 7) / 2) * (-5.90951-(-2.95475)));
            zz = 0.90924 + (((tickAnim - 7) / 2) * (1.81849-(0.90924)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 29.60205 + (((tickAnim - 9) / 9) * (29.0893-(29.60205)));
            yy = -5.90951 + (((tickAnim - 9) / 9) * (-12.40997-(-5.90951)));
            zz = 1.81849 + (((tickAnim - 9) / 9) * (3.81882-(1.81849)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 29.0893 + (((tickAnim - 18) / 15) * (29.0893-(29.0893)));
            yy = -12.40997 + (((tickAnim - 18) / 15) * (-12.40997-(-12.40997)));
            zz = 3.81882 + (((tickAnim - 18) / 15) * (3.81882-(3.81882)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 29.0893 + (((tickAnim - 33) / 4) * (24.75-(29.0893)));
            yy = -12.40997 + (((tickAnim - 33) / 4) * (0-(-12.40997)));
            zz = 3.81882 + (((tickAnim - 33) / 4) * (0-(3.81882)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 24.75 + (((tickAnim - 37) / 5) * (-2.14795-(24.75)));
            yy = 0 + (((tickAnim - 37) / 5) * (-5.90951-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (1.81849-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -2.14795 + (((tickAnim - 42) / 4) * (-10.82398-(-2.14795)));
            yy = -5.90951 + (((tickAnim - 42) / 4) * (-2.95475-(-5.90951)));
            zz = 1.81849 + (((tickAnim - 42) / 4) * (0.90924-(1.81849)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -10.82398 + (((tickAnim - 46) / 4) * (0-(-10.82398)));
            yy = -2.95475 + (((tickAnim - 46) / 4) * (0-(-2.95475)));
            zz = 0.90924 + (((tickAnim - 46) / 4) * (0-(0.90924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3.75 + (((tickAnim - 18) / 15) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 33) / 17) * (0-(3.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4 + (((tickAnim - 18) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 33) / 17) * (0-(4)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.75 + (((tickAnim - 18) / 15) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 33) / 17) * (0-(11.75)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.25 + (((tickAnim - 18) / 15) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1.25 + (((tickAnim - 33) / 17) * (0-(-1.25)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.5 + (((tickAnim - 18) / 15) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -13.5 + (((tickAnim - 33) / 17) * (0-(-13.5)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 13) / 12) * (0-(6.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 11.25 + (((tickAnim - 13) / 12) * (0-(11.25)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
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
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 22.25 + (((tickAnim - 13) / 12) * (0-(22.25)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 14.75 + (((tickAnim - 13) / 12) * (0-(14.75)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.5 + (((tickAnim - 13) / 3) * (15.93-(11.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 15.93 + (((tickAnim - 16) / 9) * (0-(15.93)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (21.07-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 21.07 + (((tickAnim - 7) / 6) * (-9.25-(21.07)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.25 + (((tickAnim - 13) / 3) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (8.75-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 8.75 + (((tickAnim - 19) / 6) * (0-(8.75)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (18.75-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 18.75 + (((tickAnim - 13) / 3) * (0-(18.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 10.75 + (((tickAnim - 13) / 12) * (0-(10.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-35.85-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -35.85 + (((tickAnim - 7) / 6) * (-10.5-(-35.85)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10.5 + (((tickAnim - 13) / 12) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 245;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = -8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-2 + (((tickAnim - 48) / 0) * (-8.7-(-8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-2)));
            yy = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 0) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 97) {
            xx = -8.7 + (((tickAnim - 48) / 49) * (-8.7-(-8.7)));
            yy = 0 + (((tickAnim - 48) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 49) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = -8.7 + (((tickAnim - 97) / 35) * (-4.7-(-8.7)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -4.7 + (((tickAnim - 132) / 113) * (0-(-4.7)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = 1.95 + (((tickAnim - 10) / 16) * (5.25-(1.95)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 48) {
            xx = 5.25 + (((tickAnim - 26) / 22) * (7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2-(5.25)));
            yy = 0 + (((tickAnim - 26) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 22) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2 + (((tickAnim - 48) / 0) * (8.725-(7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2)));
            yy = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 0) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 97) {
            xx = 8.725 + (((tickAnim - 48) / 49) * (8.725-(8.725)));
            yy = 0 + (((tickAnim - 48) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 49) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = 8.725 + (((tickAnim - 97) / 35) * (4.97-(8.725)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 4.97 + (((tickAnim - 132) / 113) * (0-(4.97)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 48) / 197) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 197) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 197) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = 1.95 + (((tickAnim - 10) / 16) * (5.25-(1.95)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 48) {
            xx = 5.25 + (((tickAnim - 26) / 22) * (7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2-(5.25)));
            yy = 0 + (((tickAnim - 26) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 22) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2 + (((tickAnim - 48) / 0) * (8.725-(7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*2)));
            yy = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 0) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 97) {
            xx = 8.725 + (((tickAnim - 48) / 49) * (8.725-(8.725)));
            yy = 0 + (((tickAnim - 48) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 49) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = 8.725 + (((tickAnim - 97) / 35) * (4.97-(8.725)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 4.97 + (((tickAnim - 132) / 113) * (0-(4.97)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (-7.2-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 97) {
            xx = -7.2 + (((tickAnim - 83) / 14) * (-7.95-(-7.2)));
            yy = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 14) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = -7.95 + (((tickAnim - 97) / 35) * (-4.25-(-7.95)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -4.25 + (((tickAnim - 132) / 113) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 97) {
            xx = -7.75 + (((tickAnim - 83) / 14) * (-8-(-7.75)));
            yy = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 14) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = -8 + (((tickAnim - 97) / 35) * (0-(-8)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 97) {
            xx = 6.25 + (((tickAnim - 83) / 14) * (5.75-(6.25)));
            yy = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 14) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = 5.75 + (((tickAnim - 97) / 35) * (0.25-(5.75)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 0.25 + (((tickAnim - 132) / 113) * (0-(0.25)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 0) / 97) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 97) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 5.5 + (((tickAnim - 97) / 6) * (-0.67-(5.5)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 132) {
            xx = -0.67 + (((tickAnim - 103) / 29) * (-4.5-(-0.67)));
            yy = 0 + (((tickAnim - 103) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 29) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -4.5 + (((tickAnim - 132) / 113) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 0) / 97) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 97) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 97) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 5 + (((tickAnim - 97) / 6) * (2.71-(5)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 132) {
            xx = 2.71 + (((tickAnim - 103) / 29) * (-10.25-(2.71)));
            yy = 0 + (((tickAnim - 103) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 29) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -10.25 + (((tickAnim - 132) / 113) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 0) / 83) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 83) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 97) {
            xx = 4.5 + (((tickAnim - 83) / 14) * (13-(4.5)));
            yy = 0 + (((tickAnim - 83) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 14) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 103) {
            xx = 13 + (((tickAnim - 97) / 6) * (24.42-(13)));
            yy = 0 + (((tickAnim - 97) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 6) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 119) {
            xx = 24.42 + (((tickAnim - 103) / 16) * (-2.06-(24.42)));
            yy = 0 + (((tickAnim - 103) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 16) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 132) {
            xx = -2.06 + (((tickAnim - 119) / 13) * (-12-(-2.06)));
            yy = 0 + (((tickAnim - 119) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 13) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -12 + (((tickAnim - 132) / 113) * (0-(-12)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 103) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 29) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 103) / 29) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 71) {
            xx = -1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*-1 + (((tickAnim - 47) / 24) * (-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1-(-1.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-150))*-1)));
            yy = 0 + (((tickAnim - 47) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 24) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 97) {
            xx = -2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1 + (((tickAnim - 71) / 26) * (-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1-(-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1)));
            yy = 0 + (((tickAnim - 71) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 26) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = -2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1 + (((tickAnim - 97) / 35) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1-(-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 35) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1 + (((tickAnim - 132) / 113) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*1)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 218) {
            xx = -0.25 + (((tickAnim - 71) / 147) * (0.61244-(-0.25)));
            yy = 0 + (((tickAnim - 71) / 147) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 147) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 236) {
            xx = 0.61244 + (((tickAnim - 218) / 18) * (0.21024-(0.61244)));
            yy = 0 + (((tickAnim - 218) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-250))*0.5-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 245) {
            xx = 0.21024 + (((tickAnim - 236) / 9) * (0-(0.21024)));
            yy = 0 + (((tickAnim - 236) / 9) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-250))*0.5 + (((tickAnim - 236) / 9) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-250))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 132) {
            xx = 4.25 + (((tickAnim - 71) / 61) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 71) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 61) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 4.25 + (((tickAnim - 132) / 113) * (0-(4.25)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 132) {
            xx = -16.25 + (((tickAnim - 71) / 61) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 71) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 61) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -16.25 + (((tickAnim - 132) / 113) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 132) {
            xx = 3.5 + (((tickAnim - 71) / 61) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 71) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 61) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 3.5 + (((tickAnim - 132) / 113) * (0-(3.5)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 132) {
            xx = -14.75 + (((tickAnim - 71) / 61) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 71) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 61) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = -14.75 + (((tickAnim - 132) / 113) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 71) {
            xx = -1.5 + (((tickAnim - 47) / 24) * (-5.75-(-1.5)));
            yy = 0 + (((tickAnim - 47) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 24) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 96) {
            xx = -5.75 + (((tickAnim - 71) / 25) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 25) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 97) {
            xx = -5.75 + (((tickAnim - 96) / 1) * (-4.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))-(-5.75)));
            yy = 0 + (((tickAnim - 96) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 1) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 141) {
            xx = -4.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60)) + (((tickAnim - 97) / 44) * (-0.20552-(-4.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60)))));
            yy = 0 + (((tickAnim - 97) / 44) * (-1.83512-(0)));
            zz = 0 + (((tickAnim - 97) / 44) * (0.79531-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 218) {
            xx = -0.20552 + (((tickAnim - 141) / 77) * (-0.05261-(-0.20552)));
            yy = -1.83512 + (((tickAnim - 141) / 77) * (-0.46979-(-1.83512)));
            zz = 0.79531 + (((tickAnim - 141) / 77) * (0.2036-(0.79531)));
        }
        else if (tickAnim >= 218 && tickAnim < 234) {
            xx = -0.05261 + (((tickAnim - 218) / 16) * (-0.02137-(-0.05261)));
            yy = -0.46979 + (((tickAnim - 218) / 16) * (-0.19085-(-0.46979)));
            zz = 0.2036 + (((tickAnim - 218) / 16) * (0.0827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-200))*1-(0.2036)));
        }
        else if (tickAnim >= 234 && tickAnim < 245) {
            xx = -0.02137 + (((tickAnim - 234) / 11) * (0-(-0.02137)));
            yy = -0.19085 + (((tickAnim - 234) / 11) * (0-(-0.19085)));
            zz = 0.0827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-200))*1 + (((tickAnim - 234) / 11) * (0-(0.0827+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/2-200))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0.425-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 71) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 70) * (0-(0)));
            zz = 0.425 + (((tickAnim - 71) / 70) * (0-(0.425)));
        }
        else if (tickAnim >= 141 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 141) / 104) * (0-(0)));
            yy = 0 + (((tickAnim - 141) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 104) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 97) {
            xx = -2 + (((tickAnim - 71) / 26) * (-2-(-2)));
            yy = 0 + (((tickAnim - 71) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 26) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 141) {
            xx = -2 + (((tickAnim - 97) / 44) * (0.23951-(-2)));
            yy = 0 + (((tickAnim - 97) / 44) * (-2.20654-(0)));
            zz = 0 + (((tickAnim - 97) / 44) * (-0.3617-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 159) {
            xx = 0.23951 + (((tickAnim - 141) / 18) * (0.23951-(0.23951)));
            yy = -2.20654 + (((tickAnim - 141) / 18) * (-2.20654-(-2.20654)));
            zz = -0.3617 + (((tickAnim - 141) / 18) * (-0.3617-(-0.3617)));
        }
        else if (tickAnim >= 159 && tickAnim < 201) {
            xx = 0.23951 + (((tickAnim - 159) / 42) * (0.17471-(0.23951)));
            yy = -2.20654 + (((tickAnim - 159) / 42) * (-2.93827-(-2.20654)));
            zz = -0.3617 + (((tickAnim - 159) / 42) * (-0.71506-(-0.3617)));
        }
        else if (tickAnim >= 201 && tickAnim < 218) {
            xx = 0.17471 + (((tickAnim - 201) / 17) * (0.17471-(0.17471)));
            yy = -2.93827 + (((tickAnim - 201) / 17) * (-2.93827-(-2.93827)));
            zz = -0.71506 + (((tickAnim - 201) / 17) * (-0.71506-(-0.71506)));
        }
        else if (tickAnim >= 218 && tickAnim < 233) {
            xx = 0.17471 + (((tickAnim - 218) / 15) * (0.0819-(0.17471)));
            yy = -2.93827 + (((tickAnim - 218) / 15) * (-1.37731-(-2.93827)));
            zz = -0.71506 + (((tickAnim - 218) / 15) * (-0.3352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-150))*2-(-0.71506)));
        }
        else if (tickAnim >= 233 && tickAnim < 245) {
            xx = 0.0819 + (((tickAnim - 233) / 12) * (0-(0.0819)));
            yy = -1.37731 + (((tickAnim - 233) / 12) * (0-(-1.37731)));
            zz = -0.3352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-150))*2 + (((tickAnim - 233) / 12) * (0-(-0.3352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-150))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 71) {
            xx = -10.25 + (((tickAnim - 38) / 33) * (-15.25-(-10.25)));
            yy = 0 + (((tickAnim - 38) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 33) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 97) {
            xx = -15.25 + (((tickAnim - 71) / 26) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 71) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 26) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 141) {
            xx = -15.25 + (((tickAnim - 97) / 44) * (-6.39904-(-15.25)));
            yy = 0 + (((tickAnim - 97) / 44) * (-4.06914-(0)));
            zz = 0 + (((tickAnim - 97) / 44) * (-0.06065-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 159) {
            xx = -6.39904 + (((tickAnim - 141) / 18) * (-3.024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-6.39904)));
            yy = -4.06914 + (((tickAnim - 141) / 18) * (-4.06914-(-4.06914)));
            zz = -0.06065 + (((tickAnim - 141) / 18) * (-0.06065-(-0.06065)));
        }
        else if (tickAnim >= 159 && tickAnim < 201) {
            xx = -3.024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 159) / 42) * (-16.2378-(-3.024+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = -4.06914 + (((tickAnim - 159) / 42) * (-5.15456-(-4.06914)));
            zz = -0.06065 + (((tickAnim - 159) / 42) * (-1.09306-(-0.06065)));
        }
        else if (tickAnim >= 201 && tickAnim < 218) {
            xx = -16.2378 + (((tickAnim - 201) / 17) * (-18.2378-(-16.2378)));
            yy = -5.15456 + (((tickAnim - 201) / 17) * (-5.15456-(-5.15456)));
            zz = -1.09306 + (((tickAnim - 201) / 17) * (-1.09306-(-1.09306)));
        }
        else if (tickAnim >= 218 && tickAnim < 232) {
            xx = -18.2378 + (((tickAnim - 218) / 14) * (-9.1189-(-18.2378)));
            yy = -5.15456 + (((tickAnim - 218) / 14) * (-2.57728-(-5.15456)));
            zz = -1.09306 + (((tickAnim - 218) / 14) * (-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-100))*3-(-1.09306)));
        }
        else if (tickAnim >= 232 && tickAnim < 245) {
            xx = -9.1189 + (((tickAnim - 232) / 13) * (0-(-9.1189)));
            yy = -2.57728 + (((tickAnim - 232) / 13) * (0-(-2.57728)));
            zz = -0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-100))*3 + (((tickAnim - 232) / 13) * (0-(-0.5465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 97) {
            xx = -8.25 + (((tickAnim - 38) / 59) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 38) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 59) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 141) {
            xx = -8.25 + (((tickAnim - 97) / 44) * (-1.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*7-(-8.25)));
            yy = 0 + (((tickAnim - 97) / 44) * (-0.41933-(0)));
            zz = 0 + (((tickAnim - 97) / 44) * (-0.27232-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 218) {
            xx = -1.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*7 + (((tickAnim - 141) / 77) * (6.97223-(-1.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*7)));
            yy = -0.41933 + (((tickAnim - 141) / 77) * (-0.41933-(-0.41933)));
            zz = -0.27232 + (((tickAnim - 141) / 77) * (-0.27232-(-0.27232)));
        }
        else if (tickAnim >= 218 && tickAnim < 228) {
            xx = 6.97223 + (((tickAnim - 218) / 10) * (4.07223-(6.97223)));
            yy = -0.41933 + (((tickAnim - 218) / 10) * (-0.24433-(-0.41933)));
            zz = -0.27232 + (((tickAnim - 218) / 10) * (-0.2723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-50))*4-(-0.27232)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 4.07223 + (((tickAnim - 228) / 17) * (0-(4.07223)));
            yy = -0.24433 + (((tickAnim - 228) / 17) * (0-(-0.24433)));
            zz = -0.2723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-50))*4 + (((tickAnim - 228) / 17) * (0-(-0.2723+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.8-50))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 0) / 218) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 218) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 218) * (0.25-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 218) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 27) * (0-(0)));
            zz = 0.25 + (((tickAnim - 218) / 27) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 38) / 33) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 38) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 33) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = -8.5 + (((tickAnim - 71) / 6) * (-7-(-8.5)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = -7 + (((tickAnim - 77) / 6) * (-8.5-(-7)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = -8.5 + (((tickAnim - 83) / 6) * (-7-(-8.5)));
            yy = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 6) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 97) {
            xx = -7 + (((tickAnim - 89) / 8) * (-5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*5-(-7)));
            yy = 0 + (((tickAnim - 89) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 8) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 141) {
            xx = -5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*5 + (((tickAnim - 97) / 44) * (0.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(-5.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*5)));
            yy = 0 + (((tickAnim - 97) / 44) * (-2.49962-(0)));
            zz = 0 + (((tickAnim - 97) / 44) * (0.04366-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 228) {
            xx = 0.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 141) / 87) * (2.349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3-(0.949+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = -2.49962 + (((tickAnim - 141) / 87) * (-0.49962-(-2.49962)));
            zz = 0.04366 + (((tickAnim - 141) / 87) * (0-(0.04366)));
        }
        else if (tickAnim >= 228 && tickAnim < 237) {
            xx = 2.349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3 + (((tickAnim - 228) / 9) * (2.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3-(2.349+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3)));
            yy = -0.49962 + (((tickAnim - 228) / 9) * (-0.27462-(-0.49962)));
            zz = 0 + (((tickAnim - 228) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.5))*5-(0)));
        }
        else if (tickAnim >= 237 && tickAnim < 245) {
            xx = 2.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3 + (((tickAnim - 237) / 8) * (0-(2.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*3)));
            yy = -0.27462 + (((tickAnim - 237) / 8) * (0-(-0.27462)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.5))*5 + (((tickAnim - 237) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/1.5))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 97 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 97) / 8) * (4.5-(0)));
            yy = 0 + (((tickAnim - 97) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 8) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 4.5 + (((tickAnim - 105) / 13) * (0-(4.5)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 118) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 37) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 155) / 46) * (25.5-(0)));
            yy = 0 + (((tickAnim - 155) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 46) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 218) {
            xx = 25.5 + (((tickAnim - 201) / 17) * (33.25-(25.5)));
            yy = 0 + (((tickAnim - 201) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 17) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 228) {
            xx = 33.25 + (((tickAnim - 218) / 10) * (0-(33.25)));
            yy = 0 + (((tickAnim - 218) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 10) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 59) {
            xx = 3 + (((tickAnim - 38) / 21) * (7.25-(3)));
            yy = 0 + (((tickAnim - 38) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 21) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 71) {
            xx = 7.25 + (((tickAnim - 59) / 12) * (8.25-(7.25)));
            yy = 0 + (((tickAnim - 59) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 12) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 77) {
            xx = 8.25 + (((tickAnim - 71) / 6) * (5.75-(8.25)));
            yy = 0 + (((tickAnim - 71) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 6) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 83) {
            xx = 5.75 + (((tickAnim - 77) / 6) * (8.25-(5.75)));
            yy = 0 + (((tickAnim - 77) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 6) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 8.25 + (((tickAnim - 83) / 6) * (5.75-(8.25)));
            yy = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 6) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 96) {
            xx = 5.75 + (((tickAnim - 89) / 7) * (8.25-(5.75)));
            yy = 0 + (((tickAnim - 89) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 7) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 132) {
            xx = 8.25 + (((tickAnim - 96) / 36) * (6.5-(8.25)));
            yy = 0 + (((tickAnim - 96) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 36) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 159) {
            xx = 6.5 + (((tickAnim - 132) / 27) * (0-(6.5)));
            yy = 0 + (((tickAnim - 132) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 27) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 159) / 42) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 159) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 42) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 218) {
            xx = -14.5 + (((tickAnim - 201) / 17) * (-22.23-(-14.5)));
            yy = 0 + (((tickAnim - 201) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 17) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 228) {
            xx = -22.23 + (((tickAnim - 218) / 10) * (0-(-22.23)));
            yy = 0 + (((tickAnim - 218) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 10) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (1.65-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 59) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 38) * (0-(0)));
            zz = 1.65 + (((tickAnim - 59) / 38) * (1.65-(1.65)));
        }
        else if (tickAnim >= 97 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 97) / 35) * (0-(0)));
            zz = 1.65 + (((tickAnim - 97) / 35) * (0-(1.65)));
        }
        else if (tickAnim >= 132 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            yy = 0 + (((tickAnim - 132) / 113) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 113) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);




        if (tickAnim >= 47 && tickAnim < 59) {
            xx = 1 + (((tickAnim - 47) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 47) / 12) * (0-(1)));
            zz = 1 + (((tickAnim - 47) / 12) * (1-(1)));
        }
        else if (tickAnim >= 59 && tickAnim < 71) {
            xx = 1 + (((tickAnim - 59) / 12) * (1-(1)));
            yy = 0 + (((tickAnim - 59) / 12) * (1-(0)));
            zz = 1 + (((tickAnim - 59) / 12) * (1-(1)));
        }
        else if (tickAnim >= 71 && tickAnim < 148) {
            xx = 1 + (((tickAnim - 71) / 77) * (1-(1)));
            yy = 1 + (((tickAnim - 71) / 77) * (1-(1)));
            zz = 1 + (((tickAnim - 71) / 77) * (1-(1)));
        }
        else if (tickAnim >= 148 && tickAnim < 201) {
            xx = 1 + (((tickAnim - 148) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 148) / 53) * (0.06-(1)));
            zz = 1 + (((tickAnim - 148) / 53) * (1-(1)));
        }
        else if (tickAnim >= 201 && tickAnim < 245) {
            xx = 1 + (((tickAnim - 201) / 44) * (1-(1)));
            yy = 0.06 + (((tickAnim - 201) / 44) * (1-(0.06)));
            zz = 1 + (((tickAnim - 201) / 44) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 38) / 12) * (6.5-(6.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 6.5 + (((tickAnim - 50) / 25) * (-5.75-(6.5)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 75) / 10) * (-8.6105-(-5.75)));
            yy = 0 + (((tickAnim - 75) / 10) * (0.48596-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (-0.11766-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -8.6105 + (((tickAnim - 85) / 15) * (-8.6105-(-8.6105)));
            yy = 0.48596 + (((tickAnim - 85) / 15) * (0.48596-(0.48596)));
            zz = -0.11766 + (((tickAnim - 85) / 15) * (-0.11766-(-0.11766)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = -8.6105 + (((tickAnim - 100) / 21) * (-2.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-8.6105)));
            yy = 0.48596 + (((tickAnim - 100) / 21) * (0-(0.48596)));
            zz = -0.11766 + (((tickAnim - 100) / 21) * (0-(-0.11766)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = -2.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 121) / 19) * (0-(-2.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0.8-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.9 + (((tickAnim - 38) / 12) * (-0.9-(-0.9)));
            zz = 0.8 + (((tickAnim - 38) / 12) * (0.8-(0.8)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = -0.9 + (((tickAnim - 50) / 25) * (0-(-0.9)));
            zz = 0.8 + (((tickAnim - 50) / 25) * (-21.425-(0.8)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = -21.425 + (((tickAnim - 75) / 10) * (-21.625-(-21.425)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = -21.625 + (((tickAnim - 85) / 15) * (-21.625-(-21.625)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = -21.625 + (((tickAnim - 100) / 40) * (0-(-21.625)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (-12.12-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.12 + (((tickAnim - 13) / 12) * (11-(-12.12)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 11 + (((tickAnim - 25) / 13) * (8.75-(11)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 38) / 12) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 8.75 + (((tickAnim - 50) / 25) * (-2.5-(8.75)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -2.5 + (((tickAnim - 75) / 25) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = -2.5 + (((tickAnim - 100) / 12) * (-8.2-(-2.5)));
            yy = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 127) {
            xx = -8.2 + (((tickAnim - 112) / 15) * (8.14-(-8.2)));
            yy = 0 + (((tickAnim - 112) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 15) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 8.14 + (((tickAnim - 127) / 13) * (0-(8.14)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 36.75 + (((tickAnim - 13) / 12) * (0-(36.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (26.64-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 26.64 + (((tickAnim - 63) / 12) * (-12.25-(26.64)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -12.25 + (((tickAnim - 75) / 10) * (-4.83-(-12.25)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -4.83 + (((tickAnim - 85) / 15) * (-4.83-(-4.83)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = -4.83 + (((tickAnim - 100) / 12) * (-14.06-(-4.83)));
            yy = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 127) {
            xx = -14.06 + (((tickAnim - 112) / 15) * (40.63-(-14.06)));
            yy = 0 + (((tickAnim - 112) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 15) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 40.63 + (((tickAnim - 127) / 13) * (0-(40.63)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.05-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 1.4 + (((tickAnim - 13) / 12) * (0-(1.4)));
            zz = -1.05 + (((tickAnim - 13) / 12) * (0-(-1.05)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (-0.65-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            yy = 1 + (((tickAnim - 63) / 12) * (0-(1)));
            zz = -0.65 + (((tickAnim - 63) / 12) * (0-(-0.65)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 12) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 112) / 15) * (0-(0)));
            yy = -1.425 + (((tickAnim - 112) / 15) * (1.38-(-1.425)));
            zz = 0 + (((tickAnim - 112) / 15) * (-1.025-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            yy = 1.38 + (((tickAnim - 127) / 13) * (0-(1.38)));
            zz = -1.025 + (((tickAnim - 127) / 13) * (0-(-1.025)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -36.5 + (((tickAnim - 13) / 12) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (0.74-(0)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 0.74 + (((tickAnim - 56) / 7) * (-37.52-(0.74)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -37.52 + (((tickAnim - 63) / 7) * (-42.36-(-37.52)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -42.36 + (((tickAnim - 70) / 5) * (16.5-(-42.36)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 16.5 + (((tickAnim - 75) / 10) * (9.25-(16.5)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 9.25 + (((tickAnim - 85) / 15) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = 9.25 + (((tickAnim - 100) / 12) * (2.68-(9.25)));
            yy = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 118) {
            xx = 2.68 + (((tickAnim - 112) / 6) * (-37.78-(2.68)));
            yy = 0 + (((tickAnim - 112) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 6) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 127) {
            xx = -37.78 + (((tickAnim - 118) / 9) * (-33.24-(-37.78)));
            yy = 0 + (((tickAnim - 118) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 9) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = -33.24 + (((tickAnim - 127) / 13) * (0-(-33.24)));
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
            yy = 0 + (((tickAnim - 0) / 13) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.85-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 12) * (0-(0.875)));
            zz = 0.85 + (((tickAnim - 13) / 12) * (0-(0.85)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (1-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0.975-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            yy = 1 + (((tickAnim - 63) / 12) * (0-(1)));
            zz = 0.975 + (((tickAnim - 63) / 12) * (0-(0.975)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 85) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 100) / 12) * (-0.275-(-0.175)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 112) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 112) / 6) * (0.95-(-0.275)));
            zz = 0 + (((tickAnim - 112) / 6) * (1.01-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 127) {
            xx = 0 + (((tickAnim - 118) / 9) * (0-(0)));
            yy = 0.95 + (((tickAnim - 118) / 9) * (0.915-(0.95)));
            zz = 1.01 + (((tickAnim - 118) / 9) * (0.8-(1.01)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            yy = 0.915 + (((tickAnim - 127) / 13) * (0-(0.915)));
            zz = 0.8 + (((tickAnim - 127) / 13) * (0-(0.8)));
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
            xx = 0 + (((tickAnim - 0) / 13) * (59.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 59.5 + (((tickAnim - 13) / 12) * (-11.5-(59.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 25) / 25) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -11.5 + (((tickAnim - 50) / 6) * (53.39-(-11.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 53.39 + (((tickAnim - 56) / 7) * (73.98-(53.39)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 73.98 + (((tickAnim - 63) / 7) * (70.23364-(73.98)));
            yy = 0 + (((tickAnim - 63) / 7) * (-7.64624-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (2.46835-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 70.23364 + (((tickAnim - 70) / 5) * (3.5-(70.23364)));
            yy = -7.64624 + (((tickAnim - 70) / 5) * (0-(-7.64624)));
            zz = 2.46835 + (((tickAnim - 70) / 5) * (0-(2.46835)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 3.5 + (((tickAnim - 75) / 10) * (6-(3.5)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 6 + (((tickAnim - 85) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = 6 + (((tickAnim - 100) / 12) * (22.12-(6)));
            yy = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 116) {
            xx = 22.12 + (((tickAnim - 112) / 4) * (73.57-(22.12)));
            yy = 0 + (((tickAnim - 112) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 4) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 127) {
            xx = 73.57 + (((tickAnim - 116) / 11) * (73.41-(73.57)));
            yy = 0 + (((tickAnim - 116) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 11) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 73.41 + (((tickAnim - 127) / 6) * (70.95-(73.41)));
            yy = 0 + (((tickAnim - 127) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 6) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = 70.95 + (((tickAnim - 133) / 7) * (0-(70.95)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.725 + (((tickAnim - 13) / 12) * (-0.37-(0.725)));
            zz = -0.275 + (((tickAnim - 13) / 12) * (-0.28-(-0.275)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = -0.37 + (((tickAnim - 25) / 25) * (-0.37-(-0.37)));
            zz = -0.28 + (((tickAnim - 25) / 25) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            yy = -0.37 + (((tickAnim - 50) / 6) * (-0.37-(-0.37)));
            zz = -0.28 + (((tickAnim - 50) / 6) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 56) / 7) * (-0.175-(0)));
            yy = -0.37 + (((tickAnim - 56) / 7) * (1.93-(-0.37)));
            zz = -0.28 + (((tickAnim - 56) / 7) * (-0.28-(-0.28)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -0.175 + (((tickAnim - 63) / 7) * (-0.07-(-0.175)));
            yy = 1.93 + (((tickAnim - 63) / 7) * (0.77-(1.93)));
            zz = -0.28 + (((tickAnim - 63) / 7) * (-0.71-(-0.28)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -0.07 + (((tickAnim - 70) / 5) * (0-(-0.07)));
            yy = 0.77 + (((tickAnim - 70) / 5) * (0-(0.77)));
            zz = -0.71 + (((tickAnim - 70) / 5) * (0-(-0.71)));
        }
        else if (tickAnim >= 75 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 75) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 37) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 112) / 9) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 112) / 9) * (1.135-(0)));
            zz = 0 + (((tickAnim - 112) / 9) * (-0.29-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = -0.325 + (((tickAnim - 121) / 6) * (0-(-0.325)));
            yy = 1.135 + (((tickAnim - 121) / 6) * (0.5-(1.135)));
            zz = -0.29 + (((tickAnim - 121) / 6) * (-0.475-(-0.29)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            yy = 0.5 + (((tickAnim - 127) / 13) * (0-(0.5)));
            zz = -0.475 + (((tickAnim - 127) / 13) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 13) / 12) * (0-(30)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 50) / 6) * (-74.45-(0)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -74.45 + (((tickAnim - 56) / 7) * (24.75-(-74.45)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 24.75 + (((tickAnim - 63) / 12) * (0-(24.75)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 75) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 37) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 112) / 4) * (-33.4-(0)));
            yy = 0 + (((tickAnim - 112) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 4) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 121) {
            xx = -33.4 + (((tickAnim - 116) / 5) * (24.84-(-33.4)));
            yy = 0 + (((tickAnim - 116) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 5) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 127) {
            xx = 24.84 + (((tickAnim - 121) / 6) * (20.75-(24.84)));
            yy = 0 + (((tickAnim - 121) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 6) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 20.75 + (((tickAnim - 127) / 3) * (22.25-(20.75)));
            yy = 0 + (((tickAnim - 127) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 3) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = 22.25 + (((tickAnim - 130) / 3) * (-38.5-(22.25)));
            yy = 0 + (((tickAnim - 130) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 3) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -38.5 + (((tickAnim - 133) / 7) * (0-(-38.5)));
            yy = 0 + (((tickAnim - 133) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -4.75 + (((tickAnim - 25) / 13) * (-7.25-(-4.75)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 38) / 12) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -7.25 + (((tickAnim - 50) / 25) * (23.5-(-7.25)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 23.5 + (((tickAnim - 75) / 25) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 23.5 + (((tickAnim - 100) / 25) * (11-(23.5)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 11 + (((tickAnim - 125) / 15) * (0-(11)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (3.75228-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (1.99572-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.13086-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 3.75228 + (((tickAnim - 50) / 25) * (0-(3.75228)));
            yy = 1.99572 + (((tickAnim - 50) / 25) * (-10.5-(1.99572)));
            zz = 0.13086 + (((tickAnim - 50) / 25) * (0-(0.13086)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -10.5 + (((tickAnim - 75) / 25) * (-2-(-10.5)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = -2 + (((tickAnim - 100) / 21) * (4.79-(-2)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 4.79 + (((tickAnim - 121) / 19) * (0-(4.79)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0.44516-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (10.0224-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (2.5291-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.44516 + (((tickAnim - 44) / 6) * (0.45824-(0.44516)));
            yy = 10.0224 + (((tickAnim - 44) / 6) * (10.76901-(10.0224)));
            zz = 2.5291 + (((tickAnim - 44) / 6) * (2.60154-(2.5291)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0.45824 + (((tickAnim - 50) / 25) * (0-(0.45824)));
            yy = 10.76901 + (((tickAnim - 50) / 25) * (-6.75-(10.76901)));
            zz = 2.60154 + (((tickAnim - 50) / 25) * (0-(2.60154)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -6.75 + (((tickAnim - 75) / 25) * (-1.75-(-6.75)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = -1.75 + (((tickAnim - 100) / 21) * (10.66-(-1.75)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 10.66 + (((tickAnim - 121) / 19) * (0-(10.66)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0.86407-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (14.18081-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (3.57922-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.86407 + (((tickAnim - 44) / 6) * (0.84918-(0.86407)));
            yy = 14.18081 + (((tickAnim - 44) / 6) * (14.67745-(14.18081)));
            zz = 3.57922 + (((tickAnim - 44) / 6) * (3.5195-(3.57922)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0.84918 + (((tickAnim - 50) / 25) * (0-(0.84918)));
            yy = 14.67745 + (((tickAnim - 50) / 25) * (-12.75-(14.67745)));
            zz = 3.5195 + (((tickAnim - 50) / 25) * (0-(3.5195)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -12.75 + (((tickAnim - 75) / 25) * (-0.75-(-12.75)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = -0.75 + (((tickAnim - 100) / 21) * (11.39-(-0.75)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 11.39 + (((tickAnim - 121) / 19) * (0-(11.39)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.63078-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.23378-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.52946-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 0.63078 + (((tickAnim - 20) / 24) * (1.16934-(0.63078)));
            yy = -4.23378 + (((tickAnim - 20) / 24) * (13.38519-(-4.23378)));
            zz = 3.52946 + (((tickAnim - 20) / 24) * (5.12037-(3.52946)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 1.16934 + (((tickAnim - 44) / 6) * (1.12548-(1.16934)));
            yy = 13.38519 + (((tickAnim - 44) / 6) * (15.87954-(13.38519)));
            zz = 5.12037 + (((tickAnim - 44) / 6) * (4.94678-(5.12037)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 1.12548 + (((tickAnim - 50) / 25) * (0-(1.12548)));
            yy = 15.87954 + (((tickAnim - 50) / 25) * (-12.25-(15.87954)));
            zz = 4.94678 + (((tickAnim - 50) / 25) * (0-(4.94678)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -12.25 + (((tickAnim - 75) / 25) * (-7.5-(-12.25)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = -7.5 + (((tickAnim - 100) / 21) * (11.16-(-7.5)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 11.16 + (((tickAnim - 121) / 19) * (0-(11.16)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.78699-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.2498-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.87712-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1.78699 + (((tickAnim - 20) / 8) * (2.3942-(1.78699)));
            yy = -4.2498 + (((tickAnim - 20) / 8) * (-4.48556-(-4.2498)));
            zz = 5.87712 + (((tickAnim - 20) / 8) * (7.89416-(5.87712)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 2.3942 + (((tickAnim - 28) / 16) * (2.8078-(2.3942)));
            yy = -4.48556 + (((tickAnim - 28) / 16) * (31.21058-(-4.48556)));
            zz = 7.89416 + (((tickAnim - 28) / 16) * (5.47149-(7.89416)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 2.8078 + (((tickAnim - 44) / 6) * (2.30371-(2.8078)));
            yy = 31.21058 + (((tickAnim - 44) / 6) * (36.91226-(31.21058)));
            zz = 5.47149 + (((tickAnim - 44) / 6) * (4.5726-(5.47149)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 2.30371 + (((tickAnim - 50) / 25) * (0-(2.30371)));
            yy = 36.91226 + (((tickAnim - 50) / 25) * (-15.25-(36.91226)));
            zz = 4.5726 + (((tickAnim - 50) / 25) * (0-(4.5726)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -15.25 + (((tickAnim - 75) / 25) * (-13.75-(-15.25)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            yy = -13.75 + (((tickAnim - 100) / 21) * (9.16-(-13.75)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 9.16 + (((tickAnim - 121) / 19) * (0-(9.16)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.14-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -4.14 + (((tickAnim - 20) / 8) * (-19.76-(-4.14)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            yy = -19.76 + (((tickAnim - 28) / 16) * (16.5-(-19.76)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 16.5 + (((tickAnim - 44) / 6) * (34-(16.5)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 50) / 14) * (0-(0)));
            yy = 34 + (((tickAnim - 50) / 14) * (39.06-(34)));
            zz = 0 + (((tickAnim - 50) / 14) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 64) / 11) * (0-(0)));
            yy = 39.06 + (((tickAnim - 64) / 11) * (-21.25-(39.06)));
            zz = 0 + (((tickAnim - 64) / 11) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -21.25 + (((tickAnim - 75) / 25) * (-28.5-(-21.25)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 100) / 12) * (0-(0)));
            yy = -28.5 + (((tickAnim - 100) / 12) * (-27.45-(-28.5)));
            zz = 0 + (((tickAnim - 100) / 12) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 112) / 9) * (0-(0)));
            yy = -27.45 + (((tickAnim - 112) / 9) * (19.59-(-27.45)));
            zz = 0 + (((tickAnim - 112) / 9) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 121) / 11) * (0-(0)));
            yy = 19.59 + (((tickAnim - 121) / 11) * (19.27-(19.59)));
            zz = 0 + (((tickAnim - 121) / 11) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 132) / 8) * (0-(0)));
            yy = 19.27 + (((tickAnim - 132) / 8) * (0-(19.27)));
            zz = 0 + (((tickAnim - 132) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 6.75 + (((tickAnim - 50) / 25) * (-2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(6.75)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 75) / 25) * (-8.1-(-2.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = -8.1 + (((tickAnim - 100) / 21) * (-11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-120))*-15-(-8.1)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = -11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-120))*-15 + (((tickAnim - 121) / 19) * (0-(-11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-120))*-15)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 6.25 + (((tickAnim - 50) / 25) * (6.75-(6.25)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 6.75 + (((tickAnim - 75) / 25) * (11.75-(6.75)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 11.75 + (((tickAnim - 100) / 21) * (3.75-(11.75)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 3.75 + (((tickAnim - 121) / 19) * (0-(3.75)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = -0.3 + (((tickAnim - 100) / 40) * (0-(-0.3)));
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




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-9.27089-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (6.64559-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-33.7695-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -9.27089 + (((tickAnim - 50) / 14) * (0-(-9.27089)));
            yy = 6.64559 + (((tickAnim - 50) / 14) * (0-(6.64559)));
            zz = -33.7695 + (((tickAnim - 50) / 14) * (0-(-33.7695)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 64) / 11) * (-9.27089-(0)));
            yy = 0 + (((tickAnim - 64) / 11) * (6.64559-(0)));
            zz = 0 + (((tickAnim - 64) / 11) * (-33.7695-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -9.27089 + (((tickAnim - 75) / 25) * (-14.58513-(-9.27089)));
            yy = 6.64559 + (((tickAnim - 75) / 25) * (6.50019-(6.64559)));
            zz = -33.7695 + (((tickAnim - 75) / 25) * (-45.60393-(-33.7695)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = -14.58513 + (((tickAnim - 100) / 40) * (0-(-14.58513)));
            yy = 6.50019 + (((tickAnim - 100) / 40) * (0-(6.50019)));
            zz = -45.60393 + (((tickAnim - 100) / 40) * (0-(-45.60393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-13.95431-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.77204-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (26.33886-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -13.95431 + (((tickAnim - 50) / 14) * (0-(-13.95431)));
            yy = 0.77204 + (((tickAnim - 50) / 14) * (0-(0.77204)));
            zz = 26.33886 + (((tickAnim - 50) / 14) * (0-(26.33886)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 64) / 11) * (-13.95431-(0)));
            yy = 0 + (((tickAnim - 64) / 11) * (0.77204-(0)));
            zz = 0 + (((tickAnim - 64) / 11) * (26.33886-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 140) {
            xx = -13.95431 + (((tickAnim - 75) / 65) * (0-(-13.95431)));
            yy = 0.77204 + (((tickAnim - 75) / 65) * (0-(0.77204)));
            zz = 26.33886 + (((tickAnim - 75) / 65) * (0-(26.33886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-11.38565-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (2.35261-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (30.90978-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -11.38565 + (((tickAnim - 50) / 14) * (14-(-11.38565)));
            yy = 2.35261 + (((tickAnim - 50) / 14) * (0-(2.35261)));
            zz = 30.90978 + (((tickAnim - 50) / 14) * (0-(30.90978)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = 14 + (((tickAnim - 64) / 11) * (-11.38565-(14)));
            yy = 0 + (((tickAnim - 64) / 11) * (2.35261-(0)));
            zz = 0 + (((tickAnim - 64) / 11) * (30.90978-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -11.38565 + (((tickAnim - 75) / 25) * (-16.18422-(-11.38565)));
            yy = 2.35261 + (((tickAnim - 75) / 25) * (5.48152-(2.35261)));
            zz = 30.90978 + (((tickAnim - 75) / 25) * (47.36555-(30.90978)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = -16.18422 + (((tickAnim - 100) / 40) * (0-(-16.18422)));
            yy = 5.48152 + (((tickAnim - 100) / 40) * (0-(5.48152)));
            zz = 47.36555 + (((tickAnim - 100) / 40) * (0-(47.36555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-16.70678-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-4.47682-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-16.71001-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 64) {
            xx = -16.70678 + (((tickAnim - 50) / 14) * (-26.75-(-16.70678)));
            yy = -4.47682 + (((tickAnim - 50) / 14) * (0-(-4.47682)));
            zz = -16.71001 + (((tickAnim - 50) / 14) * (0-(-16.71001)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = -26.75 + (((tickAnim - 64) / 11) * (-16.70678-(-26.75)));
            yy = 0 + (((tickAnim - 64) / 11) * (-4.47682-(0)));
            zz = 0 + (((tickAnim - 64) / 11) * (-16.71001-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 140) {
            xx = -16.70678 + (((tickAnim - 75) / 65) * (0-(-16.70678)));
            yy = -4.47682 + (((tickAnim - 75) / 65) * (0-(-4.47682)));
            zz = -16.71001 + (((tickAnim - 75) / 65) * (0-(-16.71001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 38) / 12) * (4.5-(0.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 4.5 + (((tickAnim - 50) / 13) * (10.35-(4.5)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 10.35 + (((tickAnim - 63) / 12) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10-(10.35)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10 + (((tickAnim - 75) / 25) * (1.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*10)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = 1.25 + (((tickAnim - 100) / 21) * (0-(1.25)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (-1.275-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 57) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 18) * (0-(0)));
            zz = -1.275 + (((tickAnim - 57) / 18) * (0-(-1.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 38) / 12) * (-2-(-2)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = -2 + (((tickAnim - 50) / 13) * (23.32-(-2)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 23.32 + (((tickAnim - 63) / 12) * (0-(23.32)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = -1.25 + (((tickAnim - 100) / 21) * (-0.25-(-1.25)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = -0.25 + (((tickAnim - 121) / 19) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (-0.425-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = -0.425 + (((tickAnim - 63) / 12) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -3.75 + (((tickAnim - 50) / 7) * (2.67-(-3.75)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 2.67 + (((tickAnim - 57) / 6) * (2.83-(2.67)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 2.83 + (((tickAnim - 63) / 12) * (0-(2.83)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = -17.75 + (((tickAnim - 100) / 21) * (-21.25-(-17.75)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = -21.25 + (((tickAnim - 121) / 19) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (-0.875-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = -0.875 + (((tickAnim - 63) / 12) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -16.25 + (((tickAnim - 50) / 7) * (-30.44-(-16.25)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = -30.44 + (((tickAnim - 57) / 6) * (-31.38-(-30.44)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = -31.38 + (((tickAnim - 63) / 12) * (0-(-31.38)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 121) {
            xx = -0.75 + (((tickAnim - 100) / 21) * (-11.5-(-0.75)));
            yy = 0 + (((tickAnim - 100) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 21) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = -11.5 + (((tickAnim - 121) / 19) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -13.75 + (((tickAnim - 50) / 7) * (-8-(-13.75)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = -8 + (((tickAnim - 57) / 6) * (-0.75-(-8)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 69) {
            xx = -0.75 + (((tickAnim - 63) / 6) * (3.38-(-0.75)));
            yy = 0 + (((tickAnim - 63) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 6) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 75) {
            xx = 3.38 + (((tickAnim - 69) / 6) * (0-(3.38)));
            yy = 0 + (((tickAnim - 69) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 6) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (22.8271-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (-1.96042-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (-2.59238-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 131) {
            xx = 22.8271 + (((tickAnim - 100) / 31) * (15.25-(22.8271)));
            yy = -1.96042 + (((tickAnim - 100) / 31) * (0-(-1.96042)));
            zz = -2.59238 + (((tickAnim - 100) / 31) * (0-(-2.59238)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = 15.25 + (((tickAnim - 131) / 9) * (0-(15.25)));
            yy = 0 + (((tickAnim - 131) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 57) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 64) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 121) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 24.5 + (((tickAnim - 50) / 7) * (0-(24.5)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (17.25-(0)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 17.25 + (((tickAnim - 75) / 25) * (20.5-(17.25)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 20.5 + (((tickAnim - 100) / 10) * (0-(20.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 110) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 25) / 25) * (-0.75-(-5.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = -0.75 + (((tickAnim - 50) / 7) * (13.13-(-0.75)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 7) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 13.13 + (((tickAnim - 57) / 6) * (11.5-(13.13)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 11.5 + (((tickAnim - 63) / 12) * (-3.25-(11.5)));
            yy = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 12) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -3.25 + (((tickAnim - 75) / 25) * (-45.75-(-3.25)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -45.75 + (((tickAnim - 100) / 10) * (-12.31-(-45.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 121) {
            xx = -12.31 + (((tickAnim - 110) / 11) * (-7.75-(-12.31)));
            yy = 0 + (((tickAnim - 110) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 11) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 131) {
            xx = -7.75 + (((tickAnim - 121) / 10) * (-2.25-(-7.75)));
            yy = 0 + (((tickAnim - 121) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 10) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = -2.25 + (((tickAnim - 131) / 9) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 131) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.35-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0.525-(0)));
            zz = 0.35 + (((tickAnim - 25) / 25) * (1.75-(0.35)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 50) / 7) * (0.25-(0.525)));
            zz = 1.75 + (((tickAnim - 50) / 7) * (3.6-(1.75)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 57) / 6) * (0-(0.25)));
            zz = 3.6 + (((tickAnim - 57) / 6) * (2.1-(3.6)));
        }
        else if (tickAnim >= 63 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 63) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 37) * (0-(0)));
            zz = 2.1 + (((tickAnim - 63) / 37) * (1.5-(2.1)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0.975-(0)));
            zz = 1.5 + (((tickAnim - 100) / 10) * (0.95-(1.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 110) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 110) / 11) * (0-(0.975)));
            zz = 0.95 + (((tickAnim - 110) / 11) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 0) / 50) * (0.9925-(1)));
            yy = 1 + (((tickAnim - 0) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 50) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0.9925 + (((tickAnim - 50) / 7) * (0.9925-(0.9925)));
            yy = 1 + (((tickAnim - 50) / 7) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (23.5-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 23.5 + (((tickAnim - 75) / 10) * (27.75-(23.5)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 27.75 + (((tickAnim - 85) / 15) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 27.75 + (((tickAnim - 100) / 25) * (0-(27.75)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = -0.7 + (((tickAnim - 75) / 10) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 75) / 10) * (0.525-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = -0.7 + (((tickAnim - 85) / 15) * (-0.7-(-0.7)));
            zz = 0.525 + (((tickAnim - 85) / 15) * (0.525-(0.525)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            yy = -0.7 + (((tickAnim - 100) / 25) * (0-(-0.7)));
            zz = 0.525 + (((tickAnim - 100) / 25) * (0-(0.525)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (5.25-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 5.25 + (((tickAnim - 75) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 5.25 + (((tickAnim - 85) / 15) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 5.25 + (((tickAnim - 100) / 25) * (0-(5.25)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (-0.825-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = -0.6 + (((tickAnim - 75) / 25) * (-0.6-(-0.6)));
            zz = -0.825 + (((tickAnim - 75) / 25) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            yy = -0.6 + (((tickAnim - 100) / 25) * (-0.59-(-0.6)));
            zz = -0.825 + (((tickAnim - 100) / 25) * (-0.19-(-0.825)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -0.59 + (((tickAnim - 125) / 15) * (0-(-0.59)));
            zz = -0.19 + (((tickAnim - 125) / 15) * (0-(-0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (60.75-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 60.75 + (((tickAnim - 75) / 10) * (60.75-(60.75)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 60.75 + (((tickAnim - 85) / 15) * (60.75-(60.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 60.75 + (((tickAnim - 100) / 25) * (-13.5-(60.75)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -13.5 + (((tickAnim - 125) / 15) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
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
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 13) * (0.975-(0)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 63) / 12) * (0-(0)));
            yy = 0.975 + (((tickAnim - 63) / 12) * (-1.05-(0.975)));
            zz = 0 + (((tickAnim - 63) / 12) * (-0.9-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = -1.05 + (((tickAnim - 75) / 10) * (-1.05-(-1.05)));
            zz = -0.9 + (((tickAnim - 75) / 10) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = -1.05 + (((tickAnim - 85) / 15) * (-1.05-(-1.05)));
            zz = -0.9 + (((tickAnim - 85) / 15) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 100 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 100) / 16) * (0-(0)));
            yy = -1.05 + (((tickAnim - 100) / 16) * (0.6-(-1.05)));
            zz = -0.9 + (((tickAnim - 100) / 16) * (0-(-0.9)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 116) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 116) / 9) * (-0.15-(0.6)));
            zz = 0 + (((tickAnim - 116) / 9) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -0.15 + (((tickAnim - 125) / 15) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (-107.25-(0)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -107.25 + (((tickAnim - 75) / 10) * (-107.25-(-107.25)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -107.25 + (((tickAnim - 85) / 15) * (-107.25-(-107.25)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = -107.25 + (((tickAnim - 100) / 25) * (0-(-107.25)));
            yy = 0 + (((tickAnim - 100) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 25) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (-0.425-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = -0.425 + (((tickAnim - 75) / 10) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = -0.425 + (((tickAnim - 85) / 15) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = -0.425 + (((tickAnim - 100) / 40) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 50 && tickAnim < 57) {
            xx = 1 + (((tickAnim - 50) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 7) * (0-(1)));
            zz = 1 + (((tickAnim - 50) / 7) * (1-(1)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 57) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 57) / 6) * (0.345-(0)));
            zz = 1 + (((tickAnim - 57) / 6) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 63) / 12) * (1-(1)));
            yy = 0.345 + (((tickAnim - 63) / 12) * (1-(0.345)));
            zz = 1 + (((tickAnim - 63) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 49;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5-(10.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5 + (((tickAnim - 35) / 14) * (0-(3.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5-(-1.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5 + (((tickAnim - 35) / 14) * (0-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-70))*0.5)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5 + (((tickAnim - 15) / 20) * (16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1-(-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.19517-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.8278-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1 + (((tickAnim - 35) / 14) * (0-(16.9575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-120))*-1)));
            yy = -0.19517 + (((tickAnim - 35) / 14) * (0-(-0.19517)));
            zz = -2.8278 + (((tickAnim - 35) / 14) * (0-(-2.8278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 15) / 20) * (3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0.21049-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-3.49367-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 35) / 14) * (0-(3.0186+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            yy = 0.21049 + (((tickAnim - 35) / 14) * (0-(0.21049)));
            zz = -3.49367 + (((tickAnim - 35) / 14) * (0-(-3.49367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 15) / 20) * (-14.91744-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (-0.29001-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-2.98596-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -14.91744 + (((tickAnim - 35) / 14) * (0-(-14.91744)));
            yy = -0.29001 + (((tickAnim - 35) / 14) * (0-(-0.29001)));
            zz = -2.98596 + (((tickAnim - 35) / 14) * (0-(-2.98596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5 + (((tickAnim - 15) / 20) * (-8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-3.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0.16071-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (-1.99353-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 35) / 14) * (0-(-8.7028+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0.16071 + (((tickAnim - 35) / 14) * (0-(0.16071)));
            zz = -1.99353 + (((tickAnim - 35) / 14) * (0-(-1.99353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 15) / 20) * (-12.675-(-10.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -12.675 + (((tickAnim - 35) / 14) * (0-(-12.675)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 15) / 8) * (-0.175-(3.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -0.175 + (((tickAnim - 23) / 12) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = -0.175 + (((tickAnim - 35) / 14) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 4 + (((tickAnim - 15) / 8) * (9.75-(4)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 9.75 + (((tickAnim - 23) / 5) * (12.68-(9.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 12.68 + (((tickAnim - 28) / 21) * (0-(12.68)));
            yy = 0 + (((tickAnim - 28) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.2-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 1.2 + (((tickAnim - 23) / 12) * (1.875-(1.2)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 14) * (0-(0)));
            zz = 1.875 + (((tickAnim - 35) / 14) * (0-(1.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(xx);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(yy);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 15) / 4) * (0.7567-(1)));
            yy = 1 + (((tickAnim - 15) / 4) * (1.3175-(1)));
            zz = 1 + (((tickAnim - 15) / 4) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.7567 + (((tickAnim - 19) / 4) * (1-(0.7567)));
            yy = 1.3175 + (((tickAnim - 19) / 4) * (1-(1.3175)));
            zz = 1 + (((tickAnim - 19) / 4) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 23) / 5) * (0.7567-(1)));
            yy = 1 + (((tickAnim - 23) / 5) * (1.3175-(1)));
            zz = 1 + (((tickAnim - 23) / 5) * (1-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0.7567 + (((tickAnim - 28) / 4) * (1-(0.7567)));
            yy = 1.3175 + (((tickAnim - 28) / 4) * (1-(1.3175)));
            zz = 1 + (((tickAnim - 28) / 4) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (0.86-(1)));
            yy = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 0.86 + (((tickAnim - 35) / 14) * (1-(0.86)));
            yy = 1 + (((tickAnim - 35) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 35) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.04124 + (((tickAnim - 0) / 4) * (-1.61106-(21.04124)));
            yy = -1.72037 + (((tickAnim - 0) / 4) * (-3.2977-(-1.72037)));
            zz = 5.06844 + (((tickAnim - 0) / 4) * (11.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*12-(5.06844)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -1.61106 + (((tickAnim - 4) / 5) * (-16.98992-(-1.61106)));
            yy = -3.2977 + (((tickAnim - 4) / 5) * (-0.72562-(-3.2977)));
            zz = 11.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*12 + (((tickAnim - 4) / 5) * (1.5925-(11.3356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-120))*12)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -16.98992 + (((tickAnim - 9) / 11) * (21.04124-(-16.98992)));
            yy = -0.72562 + (((tickAnim - 9) / 11) * (-1.72037-(-0.72562)));
            zz = 1.5925 + (((tickAnim - 9) / 11) * (5.06844-(1.5925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 11) / 2) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 23.70632 + (((tickAnim - 0) / 1) * (43.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15-(23.70632)));
            yy = -1.67462 + (((tickAnim - 0) / 1) * (0-(-1.67462)));
            zz = -3.05777 + (((tickAnim - 0) / 1) * (0-(-3.05777)));
        }
        else if (tickAnim >= 1 && tickAnim < 9) {
            xx = 43.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15 + (((tickAnim - 1) / 8) * (-15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*8-(43.18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*15)));
            yy = 0 + (((tickAnim - 1) / 8) * (1.03646-(0)));
            zz = 0 + (((tickAnim - 1) / 8) * (2.2752-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*8 + (((tickAnim - 9) / 11) * (23.70632-(-15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*8)));
            yy = 1.03646 + (((tickAnim - 9) / 11) * (-1.67462-(1.03646)));
            zz = 2.2752 + (((tickAnim - 9) / 11) * (-3.05777-(2.2752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 1) * (0.915-(0.75)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.675-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.915 + (((tickAnim - 1) / 2) * (1.445-(0.915)));
            zz = -0.675 + (((tickAnim - 1) / 2) * (-0.47-(-0.675)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1.445 + (((tickAnim - 3) / 6) * (-1.225-(1.445)));
            zz = -0.47 + (((tickAnim - 3) / 6) * (0-(-0.47)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1.225 + (((tickAnim - 9) / 11) * (0.75-(-1.225)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.25 + (((tickAnim - 0) / 5) * (-43.5-(4.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -43.5 + (((tickAnim - 5) / 4) * (8.48202-(-43.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.51735-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (-0.11049-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 8.48202 + (((tickAnim - 9) / 11) * (4.25-(8.48202)));
            yy = 0.51735 + (((tickAnim - 9) / 11) * (0-(0.51735)));
            zz = -0.11049 + (((tickAnim - 9) / 11) * (0-(-0.11049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.095-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 5) / 4) * (-0.9-(1.095)));
            zz = 0.8 + (((tickAnim - 5) / 4) * (0-(0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -0.9 + (((tickAnim - 9) / 7) * (-0.825-(-0.9)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -0.825 + (((tickAnim - 16) / 4) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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
            xx = 41 + (((tickAnim - 0) / 3) * (61.27-(41)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 61.27 + (((tickAnim - 3) / 0) * (69.53-(61.27)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5 + (((tickAnim - 3) / 0) * (0-(-6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 69.53 + (((tickAnim - 3) / 2) * (66.79-(69.53)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 66.79 + (((tickAnim - 5) / 4) * (23.96155-(66.79)));
            yy = 0 + (((tickAnim - 5) / 4) * (0.30403-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (-8.2282-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 23.96155 + (((tickAnim - 9) / 3) * (3.7212-(23.96155)));
            yy = 0.30403 + (((tickAnim - 9) / 3) * (0.9066-(0.30403)));
            zz = -8.2282 + (((tickAnim - 9) / 3) * (-3.63891-(-8.2282)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 3.7212 + (((tickAnim - 12) / 4) * (-20.5-(3.7212)));
            yy = 0.9066 + (((tickAnim - 12) / 4) * (0-(0.9066)));
            zz = -3.63891 + (((tickAnim - 12) / 4) * (0-(-3.63891)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -20.5 + (((tickAnim - 16) / 4) * (41-(-20.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.075-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (1.475-(0.3)));
            zz = -0.55 + (((tickAnim - 0) / 3) * (-0.63-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.075 + (((tickAnim - 3) / 2) * (0-(0.075)));
            yy = 1.475 + (((tickAnim - 3) / 2) * (0.3-(1.475)));
            zz = -0.63 + (((tickAnim - 3) / 2) * (-0.74-(-0.63)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 4) * (1.425-(0.3)));
            zz = -0.74 + (((tickAnim - 5) / 4) * (0.425-(-0.74)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.425 + (((tickAnim - 9) / 3) * (0.625-(1.425)));
            zz = 0.425 + (((tickAnim - 9) / 3) * (0-(0.425)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 12) / 1) * (-0.335-(0.625)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.335 + (((tickAnim - 13) / 3) * (-0.5-(-0.335)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 16) / 2) * (-0.125-(-0.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.27-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.125 + (((tickAnim - 18) / 2) * (0.3-(-0.125)));
            zz = -0.27 + (((tickAnim - 18) / 2) * (-0.55-(-0.27)));
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
            xx = 18.25 + (((tickAnim - 0) / 3) * (16.3-(18.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.3 + (((tickAnim - 3) / 2) * (30.25-(16.3)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 30.25 + (((tickAnim - 5) / 4) * (0-(30.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-34.62-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -34.62 + (((tickAnim - 18) / 2) * (18.25-(-34.62)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0.075 + (((tickAnim - 5) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -16.98992 + (((tickAnim - 0) / 11) * (20.95555-(-16.98992)));
            yy = -0.72562 + (((tickAnim - 0) / 11) * (2.77477-(-0.72562)));
            zz = -1.59252 + (((tickAnim - 0) / 11) * (-5.44431-(-1.59252)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 20.95555 + (((tickAnim - 11) / 4) * (-1.64596-(20.95555)));
            yy = 2.77477 + (((tickAnim - 11) / 4) * (4.20153-(2.77477)));
            zz = -5.44431 + (((tickAnim - 11) / 4) * (-9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8-(-5.44431)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.64596 + (((tickAnim - 15) / 5) * (-16.98992-(-1.64596)));
            yy = 4.20153 + (((tickAnim - 15) / 5) * (-0.72562-(4.20153)));
            zz = -9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8 + (((tickAnim - 15) / 5) * (-1.59252-(-9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 3) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 0) / 2) * (-12.35294-(-15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            yy = 1.03646 + (((tickAnim - 0) / 2) * (1.47441-(1.03646)));
            zz = -2.2752 + (((tickAnim - 0) / 2) * (-0.80783-(-2.2752)));
        }
        else if (tickAnim >= 2 && tickAnim < 11) {
            xx = -12.35294 + (((tickAnim - 2) / 9) * (23.70632-(-12.35294)));
            yy = 1.47441 + (((tickAnim - 2) / 9) * (-1.67462-(1.47441)));
            zz = -0.80783 + (((tickAnim - 2) / 9) * (3.0578-(-0.80783)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 23.70632 + (((tickAnim - 11) / 2) * (22.58+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-25-(23.70632)));
            yy = -1.67462 + (((tickAnim - 11) / 2) * (0-(-1.67462)));
            zz = 3.0578 + (((tickAnim - 11) / 2) * (0-(3.0578)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.58+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-25 + (((tickAnim - 13) / 7) * (-15.7706+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+60))*8-(22.58+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-25)));
            yy = 0 + (((tickAnim - 13) / 7) * (1.03646-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-2.2752-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 11) * (0.55-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 11) / 2) * (0.915-(0.55)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.675-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.915 + (((tickAnim - 13) / 2) * (1.445-(0.915)));
            zz = -0.675 + (((tickAnim - 13) / 2) * (-0.47-(-0.675)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.445 + (((tickAnim - 15) / 5) * (-1.225-(1.445)));
            zz = -0.47 + (((tickAnim - 15) / 5) * (0-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.48202 + (((tickAnim - 0) / 2) * (14.88562-(8.48202)));
            yy = 0.51735 + (((tickAnim - 0) / 2) * (0.41388-(0.51735)));
            zz = -0.11049 + (((tickAnim - 0) / 2) * (-0.08839-(-0.11049)));
        }
        else if (tickAnim >= 2 && tickAnim < 11) {
            xx = 14.88562 + (((tickAnim - 2) / 9) * (5.75-(14.88562)));
            yy = 0.41388 + (((tickAnim - 2) / 9) * (0-(0.41388)));
            zz = -0.08839 + (((tickAnim - 2) / 9) * (0-(-0.08839)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 5.75 + (((tickAnim - 11) / 1) * (8.05-(5.75)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 8.05 + (((tickAnim - 12) / 4) * (-43.5-(8.05)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -43.5 + (((tickAnim - 16) / 4) * (8.48202-(-43.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.51735-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.11049-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 11) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (1.095-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0.8-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 16) / 4) * (-0.9-(1.095)));
            zz = 0.8 + (((tickAnim - 16) / 4) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 21.88234 + (((tickAnim - 0) / 2) * (5.68195-(21.88234)));
            yy = -2.87053 + (((tickAnim - 0) / 2) * (-1.79799-(-2.87053)));
            zz = 4.69345 + (((tickAnim - 0) / 2) * (3.80225-(4.69345)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 5.68195 + (((tickAnim - 2) / 1) * (-2.51843-(5.68195)));
            yy = -1.79799 + (((tickAnim - 2) / 1) * (-0.72545-(-1.79799)));
            zz = 3.80225 + (((tickAnim - 2) / 1) * (2.91104-(3.80225)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.51843 + (((tickAnim - 3) / 4) * (-20.5-(-2.51843)));
            yy = -0.72545 + (((tickAnim - 3) / 4) * (0-(-0.72545)));
            zz = 2.91104 + (((tickAnim - 3) / 4) * (0-(2.91104)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -20.5 + (((tickAnim - 7) / 4) * (56.25-(-20.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 56.25 + (((tickAnim - 11) / 1) * (61.27-(56.25)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 61.27 + (((tickAnim - 12) / 1) * (69.53-(61.27)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 69.53 + (((tickAnim - 13) / 3) * (66.79-(69.53)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 66.79 + (((tickAnim - 16) / 4) * (21.88234-(66.79)));
            yy = 0 + (((tickAnim - 16) / 4) * (-2.87053-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (4.69345-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (-0.325-(0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 3) / 4) * (0.475-(-0.325)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 1) * (0.45-(0.475)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.27-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 3) * (0.3-(0.45)));
            zz = -0.27 + (((tickAnim - 8) / 3) * (-0.55-(-0.27)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0.075-(0)));
            yy = 0.3 + (((tickAnim - 11) / 2) * (2.45-(0.3)));
            zz = -0.55 + (((tickAnim - 11) / 2) * (-0.63-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.075 + (((tickAnim - 13) / 3) * (0-(0.075)));
            yy = 2.45 + (((tickAnim - 13) / 3) * (1.325-(2.45)));
            zz = -0.63 + (((tickAnim - 13) / 3) * (-0.74-(-0.63)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 16) / 4) * (0.2-(1.325)));
            zz = -0.74 + (((tickAnim - 16) / 4) * (0-(-0.74)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-41.62-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -41.62 + (((tickAnim - 8) / 3) * (20.25-(-41.62)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 20.25 + (((tickAnim - 11) / 1) * (16.3-(20.25)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 16.3 + (((tickAnim - 12) / 4) * (25.47129-(16.3)));
            yy = 0 + (((tickAnim - 12) / 4) * (0.63417-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0.00889-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25.47129 + (((tickAnim - 16) / 4) * (0-(25.47129)));
            yy = 0.63417 + (((tickAnim - 16) / 4) * (0-(0.63417)));
            zz = 0.00889 + (((tickAnim - 16) / 4) * (0-(0.00889)));
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
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+70))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*-0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-30))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*1.8);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+140))*-4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+180))*-5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*6), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*-2.4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(-0.7003+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), leftArm1.rotateAngleY + (float) Math.toRadians(4.32796), leftArm1.rotateAngleZ + (float) Math.toRadians(-2.0794+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(-0.7003+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), rightArm1.rotateAngleY + (float) Math.toRadians(4.32796), rightArm1.rotateAngleZ + (float) Math.toRadians(2.0794+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-230))*3.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-8.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-390))*1.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(7.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-4), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(0);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(0);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(0.225);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEocarcharia entity = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;
        int animCycle = 36;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.11068 + (((tickAnim - 0) / 8) * (-1.61106-(15.11068)));
            yy = -6.92852 + (((tickAnim - 0) / 8) * (-3.2977-(-6.92852)));
            zz = 1.02723 + (((tickAnim - 0) / 8) * (-3.7644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8-(1.02723)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.61106 + (((tickAnim - 8) / 10) * (-14.48333-(-1.61106)));
            yy = -3.2977 + (((tickAnim - 8) / 10) * (0.93288-(-3.2977)));
            zz = -3.7644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8 + (((tickAnim - 8) / 10) * (2.04755-(-3.7644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = -14.48333 + (((tickAnim - 18) / 19) * (15.11068-(-14.48333)));
            yy = 0.93288 + (((tickAnim - 18) / 19) * (-6.92852-(0.93288)));
            zz = 2.04755 + (((tickAnim - 18) / 19) * (1.02723-(2.04755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 21) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.675 + (((tickAnim - 0) / 5) * (28.005-(18.675)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 28.005 + (((tickAnim - 5) / 13) * (-10.52058-(28.005)));
            yy = 0 + (((tickAnim - 5) / 13) * (-1.0365-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (2.2752-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = -10.52058 + (((tickAnim - 18) / 19) * (18.675-(-10.52058)));
            yy = -1.0365 + (((tickAnim - 18) / 19) * (0-(-1.0365)));
            zz = 2.2752 + (((tickAnim - 18) / 19) * (0-(2.2752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 6) * (0.915-(0.375)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            yy = 0.915 + (((tickAnim - 6) / 12) * (-1.225-(0.915)));
            zz = -0.675 + (((tickAnim - 6) / 12) * (0-(-0.675)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            yy = -1.225 + (((tickAnim - 18) / 19) * (0.375-(-1.225)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
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
            xx = 13.25 + (((tickAnim - 0) / 3) * (8.05-(13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 8.05 + (((tickAnim - 3) / 7) * (-43.5-(8.05)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -43.5 + (((tickAnim - 10) / 3) * (-25.28-(-43.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -25.28 + (((tickAnim - 13) / 5) * (13.25-(-25.28)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 13.25 + (((tickAnim - 18) / 19) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.095-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.8-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 1.095 + (((tickAnim - 10) / 8) * (-0.9-(1.095)));
            zz = 0.8 + (((tickAnim - 10) / 8) * (0-(0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            yy = -0.9 + (((tickAnim - 18) / 19) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
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
            xx = 39.25 + (((tickAnim - 0) / 3) * (61.27-(39.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 61.27 + (((tickAnim - 3) / 4) * (69.53-(61.27)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5 + (((tickAnim - 3) / 4) * (0-(-6.1644+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 69.53 + (((tickAnim - 7) / 3) * (66.79-(69.53)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 66.79 + (((tickAnim - 10) / 8) * (11.38234-(66.79)));
            yy = 0 + (((tickAnim - 10) / 8) * (2.8705-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-4.6935-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 11.38234 + (((tickAnim - 18) / 5) * (-6-(11.38234)));
            yy = 2.8705 + (((tickAnim - 18) / 5) * (0-(2.8705)));
            zz = -4.6935 + (((tickAnim - 18) / 5) * (0-(-4.6935)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 23) / 7) * (-25.25-(-6)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -25.25 + (((tickAnim - 30) / 7) * (39.25-(-25.25)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.075-(0)));
            yy = 0.3 + (((tickAnim - 0) / 7) * (1.475-(0.3)));
            zz = -0.55 + (((tickAnim - 0) / 7) * (-0.63-(-0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.075 + (((tickAnim - 7) / 3) * (0-(0.075)));
            yy = 1.475 + (((tickAnim - 7) / 3) * (0.3-(1.475)));
            zz = -0.63 + (((tickAnim - 7) / 3) * (-0.74-(-0.63)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 8) * (0.3-(0.3)));
            zz = -0.74 + (((tickAnim - 10) / 8) * (0-(-0.74)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 5) * (0.875-(0.3)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.17-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 23) / 7) * (-0.2-(0.875)));
            zz = -0.17 + (((tickAnim - 23) / 7) * (0-(-0.17)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 30) / 3) * (-0.125-(-0.2)));
            zz = 0 + (((tickAnim - 30) / 3) * (-0.27-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.125 + (((tickAnim - 33) / 4) * (0.3-(-0.125)));
            zz = -0.27 + (((tickAnim - 33) / 4) * (-0.55-(-0.27)));
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
            xx = -42.25 + (((tickAnim - 0) / 3) * (16.3-(-42.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 16.3 + (((tickAnim - 3) / 7) * (18.5-(16.3)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 18.5 + (((tickAnim - 10) / 8) * (0-(18.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-41.62-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -41.62 + (((tickAnim - 33) / 4) * (-42.25-(-41.62)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 18) * (0-(-0.125)));
            zz = 0.225 + (((tickAnim - 0) / 18) * (0-(0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 19) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 18) / 19) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -14.48992 + (((tickAnim - 0) / 19) * (15.2941-(-14.48992)));
            yy = -0.72562 + (((tickAnim - 0) / 19) * (10.05195-(-0.72562)));
            zz = -1.59252 + (((tickAnim - 0) / 19) * (-2.83762-(-1.59252)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 15.2941 + (((tickAnim - 19) / 10) * (-1.64596-(15.2941)));
            yy = 10.05195 + (((tickAnim - 19) / 10) * (5.50153-(10.05195)));
            zz = -2.83762 + (((tickAnim - 19) / 10) * (-9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8-(-2.83762)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -1.64596 + (((tickAnim - 29) / 8) * (-14.48992-(-1.64596)));
            yy = 5.50153 + (((tickAnim - 29) / 8) * (-0.72562-(5.50153)));
            zz = -9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8 + (((tickAnim - 29) / 8) * (-1.59252-(-9.6443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05 + (((tickAnim - 4) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.55))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -10.52058 + (((tickAnim - 0) / 19) * (19.3-(-10.52058)));
            yy = 1.03646 + (((tickAnim - 0) / 19) * (0-(1.03646)));
            zz = -2.27515 + (((tickAnim - 0) / 19) * (0-(-2.27515)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 19.3 + (((tickAnim - 19) / 6) * (28.68-(19.3)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 28.68 + (((tickAnim - 25) / 12) * (-10.52058-(28.68)));
            yy = 0 + (((tickAnim - 25) / 12) * (1.03646-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (-2.27515-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 19) * (0.375-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 19) / 6) * (0.915-(0.375)));
            zz = 0 + (((tickAnim - 19) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0.915 + (((tickAnim - 25) / 12) * (-1.225-(0.915)));
            zz = -0.675 + (((tickAnim - 25) / 12) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 13.25 + (((tickAnim - 0) / 19) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 13.25 + (((tickAnim - 19) / 3) * (8.05-(13.25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 8.05 + (((tickAnim - 22) / 7) * (-43.5-(8.05)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -43.5 + (((tickAnim - 29) / 4) * (-25.28-(-43.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -25.28 + (((tickAnim - 33) / 4) * (13.25-(-25.28)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 19) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (1.095-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0.8-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = 1.095 + (((tickAnim - 29) / 8) * (-0.9-(1.095)));
            zz = 0.8 + (((tickAnim - 29) / 8) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.38234 + (((tickAnim - 0) / 6) * (-6-(11.38234)));
            yy = -2.87053 + (((tickAnim - 0) / 6) * (0-(-2.87053)));
            zz = 4.69345 + (((tickAnim - 0) / 6) * (0-(4.69345)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 6) / 7) * (-25.25-(-6)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -25.25 + (((tickAnim - 13) / 6) * (39.25-(-25.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 39.25 + (((tickAnim - 19) / 4) * (61.27-(39.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 61.27 + (((tickAnim - 23) / 3) * (69.53-(61.27)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 69.53 + (((tickAnim - 26) / 3) * (66.79-(69.53)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 66.79 + (((tickAnim - 29) / 8) * (11.38234-(66.79)));
            yy = 0 + (((tickAnim - 29) / 8) * (-2.87053-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (4.69345-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 6) * (0.875-(0.3)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.17-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 7) * (-0.2-(0.875)));
            zz = -0.17 + (((tickAnim - 6) / 7) * (0-(-0.17)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 3) * (-0.125-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.27-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 16) / 3) * (0.3-(-0.125)));
            zz = -0.27 + (((tickAnim - 16) / 3) * (-0.55-(-0.27)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0.075-(0)));
            yy = 0.3 + (((tickAnim - 19) / 7) * (1.475-(0.3)));
            zz = -0.55 + (((tickAnim - 19) / 7) * (-0.63-(-0.55)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0.075 + (((tickAnim - 26) / 3) * (0-(0.075)));
            yy = 1.475 + (((tickAnim - 26) / 3) * (0.3-(1.475)));
            zz = -0.63 + (((tickAnim - 26) / 3) * (-0.74-(-0.63)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 29) / 8) * (0.3-(0.3)));
            zz = -0.74 + (((tickAnim - 29) / 8) * (0-(-0.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+70))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196+10))*-0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-20))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5))*-1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-41.62-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -41.62 + (((tickAnim - 16) / 3) * (-42.25-(-41.62)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -42.25 + (((tickAnim - 19) / 4) * (16.3-(-42.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 16.3 + (((tickAnim - 23) / 6) * (18.5-(16.3)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 18.5 + (((tickAnim - 29) / 8) * (0-(18.5)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.225-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            yy = -0.125 + (((tickAnim - 19) / 18) * (0-(-0.125)));
            zz = 0.225 + (((tickAnim - 19) / 18) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+50))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-30))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+50))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-60))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+80))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-90))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+140))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-120))*2.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+180))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-150))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+250))*3), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196-180))*3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-50))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5+120))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*100/0.509-30))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-100))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-100))*2.5), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-150))*-2.5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-100))*2.5), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-180))*-2.5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-180))*-2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-280))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-250))*-1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-390))*-1.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-480))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*196/0.5-250))*-1), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraEocarcharia ee = (EntityPrehistoricFloraEocarcharia) entitylivingbaseIn;

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
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEocarcharia e = (EntityPrehistoricFloraEocarcharia) entity;
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
