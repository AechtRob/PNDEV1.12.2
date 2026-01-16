package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBaryonyx;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBaryonyx extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftClaw;
    private final AdvancedModelRenderer leftFingers;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightClaw;
    private final AdvancedModelRenderer rightFingers;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer leftJaw1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftJaw2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer leftMasseter;
    private final AdvancedModelRenderer rightJaw1;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer rightJaw2;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer rightMasseter;

    private ModelAnimator animator;

    public ModelBaryonyx() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -8.5F, 7.0F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -4.5F, -4.75F, -10.0F, 9, 20, 20, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -7.9472F, -0.0304F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 118, 118, -1.0F, -3.0F, 0.0F, 0, 3, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 94, 104, -3.5F, 0.0F, 0.0F, 5, 4, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -7.25F, -8.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 136, 131, -1.0F, -3.0F, 0.0F, 0, 3, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 104, -3.5F, 0.0F, -2.0F, 5, 4, 10, 0.01F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(4.4F, 0.6F, 0.0F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.1745F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 70, -3.0F, -3.0F, -4.0F, 6, 18, 11, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 14.375F, -0.2F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.8727F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 32, 113, -2.0F, -2.2361F, -2.5992F, 4, 15, 6, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 12.2139F, 0.7008F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.0036F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 20, 130, -1.5F, -1.5604F, -1.209F, 3, 9, 3, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 7.1396F, 0.666F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.3491F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 132, 8, -2.0F, -0.25F, -3.5F, 4, 2, 4, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 128, 53, -2.5F, -1.0F, -5.0F, 5, 2, 5, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-4.4F, 0.6F, 0.0F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.1745F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 70, -3.0F, -3.0F, -4.0F, 6, 18, 11, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 14.375F, -0.2F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.8727F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 32, 113, -2.0F, -2.2361F, -2.5992F, 4, 15, 6, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 12.2139F, 0.7008F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.0036F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 20, 130, -1.5F, -1.5604F, -1.209F, 3, 9, 3, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 7.1396F, 0.666F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.3491F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 132, 8, -2.0F, -0.25F, -3.5F, 4, 2, 4, 0.0F, true));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 128, 53, -2.5F, -1.0F, -5.0F, 5, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 58, 0, -3.5F, -3.75F, -2.0F, 7, 11, 13, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.75F, -2.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 124, 102, 0.0F, -2.0F, 4.5F, 0, 2, 10, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 61, -1.5F, 0.0F, 2.0F, 3, 3, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 11.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 78, 81, -2.5F, -4.0F, -1.0F, 5, 9, 14, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 139, 0.0F, -2.0F, 3.0F, 0, 2, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 118, -1.0F, 0.0F, -2.0F, 2, 2, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 13.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 98, 0, -2.0F, -4.0F, -2.0F, 4, 7, 13, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 130, 0.0F, -6.0F, -1.0F, 0, 2, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 98, 20, -1.5F, -2.25F, 0.0F, 3, 5, 13, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 76, 118, 0.0F, -3.25F, 1.0F, 0, 1, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 13.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 99, -1.0F, -1.75F, -1.0F, 2, 3, 14, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.5F, 13.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3491F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 108, 38, -0.5F, -1.0F, -1.0F, 1, 2, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 40, -6.5F, -4.75F, -14.0F, 13, 15, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 58, 24, -3.5F, -6.5F, -13.0F, 7, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 98, 118, 0.0F, -9.5F, -11.0F, 0, 3, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 10.0F, -14.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4538F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 40, -6.0F, -7.75F, -0.25F, 13, 8, 13, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.5F, -13.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 56, 61, -5.0F, -2.4F, -9.75F, 10, 8, 12, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -4.9F, -10.5F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 139, 1.0F, -1.0F, 5.5F, 0, 2, 6, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 99, -1.5F, 1.0F, 0.5F, 5, 3, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 5.6F, -9.75F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 81, -4.0F, -6.0F, 0.0F, 10, 6, 12, -0.01F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(4.5F, 5.0F, -6.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.6545F, 0.2618F, -0.0873F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 116, 76, -1.5F, -1.5F, -1.0F, 3, 4, 9, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.0F, 6.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0472F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 104, 131, -1.0F, -2.0F, -1.25F, 2, 3, 6, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.5F, -0.5F, 4.75F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, -0.2182F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 132, 140, -1.0F, -1.5F, 0.0F, 1, 3, 3, 0.01F, false));

        this.leftClaw = new AdvancedModelRenderer(this);
        this.leftClaw.setRotationPoint(-0.5F, 1.5F, 0.0F);
        this.leftHand.addChild(leftClaw);
        this.setRotateAngle(leftClaw, -0.2618F, -0.3054F, 0.0F);
        this.leftClaw.cubeList.add(new ModelBox(leftClaw, 124, 114, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.01F, false));
        this.leftClaw.cubeList.add(new ModelBox(leftClaw, 64, 99, -2.5F, -1.0F, 3.0F, 3, 1, 3, 0.01F, false));

        this.leftFingers = new AdvancedModelRenderer(this);
        this.leftFingers.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.leftHand.addChild(leftFingers);
        this.setRotateAngle(leftFingers, 0.0F, -0.4363F, 0.0F);
        this.leftFingers.cubeList.add(new ModelBox(leftFingers, 140, 83, -2.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.5F, 5.0F, -6.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.6545F, -0.2618F, 0.0873F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 116, 76, -1.5F, -1.5F, -1.0F, 3, 4, 9, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.0F, 6.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0472F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 104, 131, -1.0F, -2.0F, -1.25F, 2, 3, 6, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.5F, -0.5F, 4.75F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.2182F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 132, 140, 0.0F, -1.5F, 0.0F, 1, 3, 3, 0.01F, true));

        this.rightClaw = new AdvancedModelRenderer(this);
        this.rightClaw.setRotationPoint(0.5F, 1.5F, 0.0F);
        this.rightHand.addChild(rightClaw);
        this.setRotateAngle(rightClaw, -0.2618F, 0.3054F, 0.0F);
        this.rightClaw.cubeList.add(new ModelBox(rightClaw, 124, 114, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.01F, true));
        this.rightClaw.cubeList.add(new ModelBox(rightClaw, 64, 99, -0.5F, -1.0F, 3.0F, 3, 1, 3, 0.01F, true));

        this.rightFingers = new AdvancedModelRenderer(this);
        this.rightFingers.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rightHand.addChild(rightFingers);
        this.setRotateAngle(rightFingers, 0.0F, 0.4363F, 0.0F);
        this.rightFingers.cubeList.add(new ModelBox(rightFingers, 140, 83, 0.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.25F, -7.75F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5672F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 116, -3.0F, -2.5F, -5.25F, 6, 7, 7, 0.01F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 108, 53, -2.0F, -3.5F, -5.0F, 4, 2, 6, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 8, 142, 0.0F, -4.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.5F, -5.25F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6545F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 116, 89, -2.0F, -2.25F, -5.5F, 4, 5, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, -3.25F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 98, 141, 0.0F, -4.0F, -0.75F, 0, 1, 3, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 130, 30, -1.5F, -3.0F, -1.75F, 3, 2, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.0F, -5.25F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.48F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 88, 131, -1.5F, -2.75F, -3.5F, 3, 5, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.15F, -4.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 104, 140, 1.5F, -6.0F, 0.0F, 0, 1, 5, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 134, 0.5F, -5.0F, 0.0F, 2, 3, 5, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -3.75F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.48F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 130, 20, -1.5F, -2.1F, -4.6F, 3, 4, 6, -0.05F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.0682F, -1.8876F);
        this.neck4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 113, 0.5F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 82, 141, 0.0F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.2425F, 0.1048F);
        this.neck4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 116, 102, 0.5F, -0.75F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 110, 76, 0.0F, 0.0F, -2.0F, 1, 3, 2, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.25F, -2.25F);
        this.neck4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 118, 102, 0.5F, -4.5F, 2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 140, 140, 0.0F, -3.5F, 1.5F, 1, 3, 3, 0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 120, 131, -1.5F, -0.85F, -4.1F, 3, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.64F, -15.5915F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.5446F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 116, -1.5F, -5.0F, 0.0F, 2, 5, 1, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 2.8753F, -15.3304F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 142, -1.5F, -2.0F, -1.0F, 2, 2, 1, 0.03F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 3.3977F, -11.3406F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 132, 14, -1.5F, -2.0F, -4.0F, 2, 2, 4, 0.04F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 2.7484F, -8.4117F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 100, 76, -1.5F, -2.0F, -3.0F, 2, 2, 3, 0.05F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 2.15F, -3.8F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 136, 38, -1.5F, -2.0F, -4.75F, 2, 2, 5, 0.04F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -1.5285F, -4.2225F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0908F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 144, 17, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.9912F, -5.0659F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 132, 114, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -0.0147F, -8.3637F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4141F, -0.0282F, -0.2775F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 120, 139, 0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -1.4458F, -3.3134F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1788F, -0.026F, -0.2388F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 140, 95, 0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -0.0147F, -8.3637F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4141F, 0.0282F, 0.2775F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 120, 139, -1.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.25F, -4.1F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 130, -1.0F, 0.0F, -7.0F, 2, 2, 7, 0.02F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.7469F, 0.0753F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0524F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 116, -0.5F, 0.0F, -0.2F, 1, 1, 1, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.3967F, -0.8614F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4974F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 102, 38, -0.5F, 0.05F, -0.15F, 1, 1, 1, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.7147F, -1.5927F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.7505F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 98, 38, -0.5F, 0.0F, -0.1F, 1, 1, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, -1.4458F, -3.3134F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1788F, 0.026F, 0.2388F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 140, 95, -1.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.3F, -4.1F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1833F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 130, 69, -1.5F, 0.0F, -0.2F, 3, 2, 5, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.25F, 1.2F, -15.85F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 106, 38, -0.5F, 0.4F, 3.4F, 0, 1, 1, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 106, 38, 1.0F, 0.4F, 3.4F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.25F, 3.25F, -14.6F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2618F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 46, 134, -0.5F, 0.4F, 3.4F, 0, 1, 3, 0.0F, true));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 46, 134, 1.0F, 0.4F, 3.4F, 0, 1, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.75F, 3.3F, -14.35F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, -0.3491F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 76, 101, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.75F, 3.3F, -14.35F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.3491F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 76, 101, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.35F, -2.1F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 52, 113, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 132, 0, -1.5F, -0.1F, -4.1F, 3, 3, 5, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 2.3628F, -12.8836F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4102F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 142, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.9F, -4.1F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0611F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 70, -1.0F, -1.0F, -8.8F, 2, 1, 9, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.1F, -4.1F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 136, 45, -1.5F, -3.0F, 0.0F, 3, 3, 4, -0.02F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 2.9F, -4.0F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, -0.2182F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 138, 121, -1.0F, -4.0F, 0.0F, 2, 4, 4, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -4.0F, 3.25F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, 0.3491F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 46, 139, -1.0F, 0.0F, -0.75F, 2, 4, 4, -0.02F, false));

        this.leftJaw1 = new AdvancedModelRenderer(this);
        this.leftJaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(leftJaw1);
        this.setRotateAngle(leftJaw1, 0.0F, 0.0044F, -0.0175F);
        this.leftJaw1.cubeList.add(new ModelBox(leftJaw1, 140, 76, -0.5F, -0.1F, -4.1F, 2, 3, 4, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 2.9F, -4.1F);
        this.leftJaw1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1309F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 142, -0.25F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 14, 142, 0.5F, -2.0F, -2.0F, 1, 2, 2, 0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.1F, -4.0F);
        this.leftJaw1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 38, 142, 0.5F, 0.0F, -2.0F, 1, 1, 2, 0.02F, false));

        this.leftJaw2 = new AdvancedModelRenderer(this);
        this.leftJaw2.setRotationPoint(1.0F, 1.25F, -5.85F);
        this.leftJaw1.addChild(leftJaw2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.5F, -0.4363F, -5.0901F);
        this.leftJaw2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1222F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 142, 0.5F, 0.0F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.5F, -1.35F, 1.85F);
        this.leftJaw2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1309F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 138, 114, 0.5F, 0.0F, -8.0F, 1, 1, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, -1.4828F, -9.4903F);
        this.leftJaw2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -2.0071F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 144, 101, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 0.2857F, -9.8401F);
        this.leftJaw2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -1.1781F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 60, 116, -0.5F, -1.0F, -1.55F, 1, 1, 1, -0.01F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 116, -0.5F, -1.0F, -0.95F, 1, 1, 1, -0.03F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 1.051F, -7.9924F);
        this.leftJaw2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.3927F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 144, 14, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.02F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 1.4F, 0.0F);
        this.leftJaw2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0436F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 90, 141, -0.5F, -1.75F, -3.0F, 1, 1, 3, -0.02F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 130, 60, -1.25F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 70, 130, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.25F, -1.2952F, -7.8133F);
        this.leftJaw2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.3927F, 0.3491F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 76, 99, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.4F, 0.0F);
        this.leftJaw2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 140, 89, 0.25F, -2.5F, -6.25F, 0, 1, 5, 0.0F, false));

        this.leftMasseter = new AdvancedModelRenderer(this);
        this.leftMasseter.setRotationPoint(-0.25F, -1.0F, -0.65F);
        this.leftJaw2.addChild(leftMasseter);
        this.setRotateAngle(leftMasseter, -0.3491F, 0.0F, 0.0F);
        this.leftMasseter.cubeList.add(new ModelBox(leftMasseter, 26, 122, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));
        this.leftMasseter.cubeList.add(new ModelBox(leftMasseter, 114, 140, -0.05F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.rightJaw1 = new AdvancedModelRenderer(this);
        this.rightJaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(rightJaw1);
        this.setRotateAngle(rightJaw1, 0.0F, -0.0044F, 0.0175F);
        this.rightJaw1.cubeList.add(new ModelBox(rightJaw1, 140, 76, -1.5F, -0.1F, -4.1F, 2, 3, 4, -0.02F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 2.9F, -4.1F);
        this.rightJaw1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1309F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 32, 142, -0.75F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 14, 142, -1.5F, -2.0F, -2.0F, 1, 2, 2, 0.01F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.5F, -0.1F, -4.0F);
        this.rightJaw1.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1309F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 38, 142, -1.5F, 0.0F, -2.0F, 1, 1, 2, 0.02F, true));

        this.rightJaw2 = new AdvancedModelRenderer(this);
        this.rightJaw2.setRotationPoint(-1.0F, 1.25F, -5.85F);
        this.rightJaw1.addChild(rightJaw2);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.5F, -0.4363F, -5.0901F);
        this.rightJaw2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1222F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 142, -1.5F, 0.0F, -3.0F, 1, 1, 3, 0.01F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.5F, -1.35F, 1.85F);
        this.rightJaw2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.1309F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 138, 114, -1.5F, 0.0F, -8.0F, 1, 1, 6, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, -1.4828F, -9.4903F);
        this.rightJaw2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -2.0071F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 144, 101, -0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.2857F, -9.8401F);
        this.rightJaw2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -1.1781F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 60, 116, -0.5F, -1.0F, -1.55F, 1, 1, 1, -0.01F, true));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 56, 116, -0.5F, -1.0F, -0.95F, 1, 1, 1, -0.03F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, 1.051F, -7.9924F);
        this.rightJaw2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.3927F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 144, 14, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.02F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 1.4F, 0.0F);
        this.rightJaw2.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0436F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 90, 141, -0.5F, -1.75F, -3.0F, 1, 1, 3, -0.02F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 130, 60, 0.25F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 70, 130, -0.5F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.25F, -1.2952F, -7.8133F);
        this.rightJaw2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.3927F, -0.3491F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 76, 99, 0.0F, 0.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5F, 1.4F, 0.0F);
        this.rightJaw2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0436F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 140, 89, -0.25F, -2.5F, -6.25F, 0, 1, 5, 0.0F, true));

        this.rightMasseter = new AdvancedModelRenderer(this);
        this.rightMasseter.setRotationPoint(0.25F, -1.0F, -0.65F);
        this.rightJaw2.addChild(rightMasseter);
        this.setRotateAngle(rightMasseter, -0.3491F, 0.0F, 0.0F);
        this.rightMasseter.cubeList.add(new ModelBox(rightMasseter, 26, 122, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));
        this.rightMasseter.cubeList.add(new ModelBox(rightMasseter, 114, 140, 0.05F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

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
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -1.5446F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.0908F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.4141F, -0.0282F, -0.2775F);
        this.setRotateAngle(cube_r21, 0.1788F, -0.026F, -0.2388F);
        this.setRotateAngle(cube_r22, 0.4141F, 0.0282F, 0.2775F);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.4974F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.7505F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.1788F, 0.026F, 0.2388F);
        this.setRotateAngle(cube_r28, 0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r30, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.1745F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r32, 0.1745F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r33, -0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r34, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r36, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r38, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r40, -2.0071F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r41, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r44, -0.3927F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r45, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r46, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r47, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r48, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r49, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.4538F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r50, -2.0071F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r51, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r52, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r53, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r54, -0.3927F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r55, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.5367F, 0.0F, 0.0F);
        this.setRotateAngle(hips, -0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm1, -0.5323F, 0.2618F, -0.0873F);
        this.setRotateAngle(leftArm2, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(leftClaw, -0.2618F, -0.3054F, 0.0F);
        this.setRotateAngle(leftFingers, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(leftfoot, 1.5493F, 0.0653F, 0.0F);
        this.setRotateAngle(leftHand, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(leftJaw1, 0.0F, 0.0044F, -0.0175F);
        this.setRotateAngle(leftleg, -0.7551F, -0.2645F, 0.0058F);
        this.setRotateAngle(leftleg2, 1.5926F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -2.1686F, 0.0F, 0.0F);
        this.setRotateAngle(leftMasseter, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.6679F, -0.0368F, -0.0043F);
        this.setRotateAngle(neck2, -0.7234F, -0.0466F, -0.0462F);
        this.setRotateAngle(neck3, 0.5274F, 0.0069F, -0.0465F);
        this.setRotateAngle(neck4, 0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm1, -0.6545F, -0.2618F, 0.0873F);
        this.setRotateAngle(rightArm2, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(rightClaw, -0.2618F, 0.3054F, 0.0F);
        this.setRotateAngle(rightFingers, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(rightfoot, 1.5493F, -0.0653F, 0.0F);
        this.setRotateAngle(rightHand, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(rightJaw1, 0.0F, -0.0044F, 0.0175F);
        this.setRotateAngle(rightleg, -0.7551F, 0.2645F, -0.0058F);
        this.setRotateAngle(rightleg2, 1.5926F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -2.1686F, 0.0F, 0.0F);
        this.setRotateAngle(rightMasseter, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.1399F, 0.0648F, -0.0091F);
        this.setRotateAngle(tail2, -0.0481F, 0.0654F, -0.0031F);
        this.setRotateAngle(tail3, 0.1324F, 0.1514F, 0.0201F);
        this.setRotateAngle(tail4, 0.2071F, 0.0736F, 0.0844F);
        this.setRotateAngle(tail5, -0.0225F, 0.1464F, 0.0831F);
        this.setRotateAngle(tail6, 0.0474F, 0.401F, 0.0185F);
        this.setRotateAngle(throat1, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(throat2, 0.3491F, 0.0F, 0.0F);
        this.hips.offsetY = -0.035F;
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

        EntityPrehistoricFloraBaryonyx EntityBaryonyx = (EntityPrehistoricFloraBaryonyx) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityBaryonyx.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityBaryonyx.getAnimation() == EntityBaryonyx.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityBaryonyx.isReallyInWater()) {

                if (f3 == 0.0F || !EntityBaryonyx.getIsMoving()) { //Is moving at all
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

                if (EntityBaryonyx.getIsFast()) { //Running


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
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
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
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 3) / 9) * (0-(0.15)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
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


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (1.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 1.15 + (((tickAnim - 9) / 3) * (0-(1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 14.25 + (((tickAnim - 3) / 5) * (27.75-(14.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 27.75 + (((tickAnim - 8) / 1) * (-17-(27.75)));
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


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 4) * (0-(0.25)));
            zz = 0.75 + (((tickAnim - 8) / 4) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.25 + (((tickAnim - 8) / 4) * (0-(-31.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
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
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
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
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30.02-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 30.02 + (((tickAnim - 6) / 7) * (25.75-(30.02)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (30.02-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 30.02 + (((tickAnim - 32) / 6) * (25.75-(30.02)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
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
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


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
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 16) / 9) * (0-(0.15)));
            zz = -0.575 + (((tickAnim - 16) / 9) * (0-(-0.575)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (-0.265-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-0.21-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.265 + (((tickAnim - 32) / 6) * (0-(-0.265)));
            zz = -0.21 + (((tickAnim - 32) / 6) * (0-(-0.21)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0.15-(0)));
            yy = 0.15 + (((tickAnim - 41) / 4) * (0.625-(0.15)));
            zz = -0.575 + (((tickAnim - 41) / 4) * (-1.375-(-0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0.15 + (((tickAnim - 45) / 5) * (0-(0.15)));
            yy = 0.625 + (((tickAnim - 45) / 5) * (0-(0.625)));
            zz = -1.375 + (((tickAnim - 45) / 5) * (0-(-1.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
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
            zz = 0 + (((tickAnim - 0) / 20) * (3.85-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -6.775 + (((tickAnim - 20) / 10) * (-6.775-(-6.775)));
            zz = 3.85 + (((tickAnim - 20) / 10) * (3.85-(3.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -6.775 + (((tickAnim - 30) / 20) * (0-(-6.775)));
            zz = 3.85 + (((tickAnim - 30) / 20) * (0-(3.85)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-3.69926-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.41606-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.03415 + (((tickAnim - 20) / 10) * (-15.03415-(-15.03415)));
            yy = -3.69926 + (((tickAnim - 20) / 10) * (-3.69926-(-3.69926)));
            zz = 1.41606 + (((tickAnim - 20) / 10) * (1.41606-(1.41606)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.03415 + (((tickAnim - 30) / 20) * (0-(-15.03415)));
            yy = -3.69926 + (((tickAnim - 30) / 20) * (0-(-3.69926)));
            zz = 1.41606 + (((tickAnim - 30) / 20) * (0-(1.41606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.5 + (((tickAnim - 20) / 10) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.5 + (((tickAnim - 30) / 20) * (0-(30.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28 + (((tickAnim - 20) / 10) * (-28-(-28)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 30) / 20) * (0-(-28)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 20) / 10) * (21-(21)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 30) / 20) * (0-(21)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12 + (((tickAnim - 20) / 10) * (-12-(-12)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 30) / 20) * (0-(-12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.76665-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.34477-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.80149-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.76665 + (((tickAnim - 20) / 10) * (-6.76665-(-6.76665)));
            yy = -6.34477 + (((tickAnim - 20) / 10) * (-6.34477-(-6.34477)));
            zz = 6.80149 + (((tickAnim - 20) / 10) * (6.80149-(6.80149)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.76665 + (((tickAnim - 30) / 20) * (0-(-6.76665)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 8) / 12) * (18.46217-(-2.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (-27.02421-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0.4068-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.46217 + (((tickAnim - 20) / 10) * (18.46217-(18.46217)));
            yy = -27.02421 + (((tickAnim - 20) / 10) * (-27.02421-(-27.02421)));
            zz = 0.4068 + (((tickAnim - 20) / 10) * (0.4068-(0.4068)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 18.46217 + (((tickAnim - 30) / 7) * (-1.4145-(18.46217)));
            yy = -27.02421 + (((tickAnim - 30) / 7) * (-20.1339-(-27.02421)));
            zz = 0.4068 + (((tickAnim - 30) / 7) * (6.46571-(0.4068)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -1.4145 + (((tickAnim - 37) / 13) * (0-(-1.4145)));
            yy = -20.1339 + (((tickAnim - 37) / 13) * (0-(-20.1339)));
            zz = 6.46571 + (((tickAnim - 37) / 13) * (0-(6.46571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.325 + (((tickAnim - 20) / 10) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 20) / 10) * (0.25-(0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.325 + (((tickAnim - 30) / 20) * (0-(0.325)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.75 + (((tickAnim - 8) / 2) * (-10-(-16.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 10) / 5) * (-8.48548-(-10)));
            yy = -1.25 + (((tickAnim - 10) / 5) * (-7.75329-(-1.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (16.38336-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8.48548 + (((tickAnim - 15) / 5) * (0.01756-(-8.48548)));
            yy = -7.75329 + (((tickAnim - 15) / 5) * (-5.49528-(-7.75329)));
            zz = 16.38336 + (((tickAnim - 15) / 5) * (5.61905-(16.38336)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.01756 + (((tickAnim - 20) / 10) * (0.01756-(0.01756)));
            yy = -5.49528 + (((tickAnim - 20) / 10) * (-5.49528-(-5.49528)));
            zz = 5.61905 + (((tickAnim - 20) / 10) * (5.61905-(5.61905)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0.01756 + (((tickAnim - 30) / 7) * (0-(0.01756)));
            yy = -5.49528 + (((tickAnim - 30) / 7) * (0-(-5.49528)));
            zz = 5.61905 + (((tickAnim - 30) / 7) * (0-(5.61905)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 43) / 7) * (0-(-11.5)));
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
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -0.525 + (((tickAnim - 30) / 7) * (0-(-0.525)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 43) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -9.5 + (((tickAnim - 20) / 10) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 30) / 7) * (10.75-(0)));
            yy = -9.5 + (((tickAnim - 30) / 7) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 10.75 + (((tickAnim - 37) / 5) * (-14.5-(10.75)));
            yy = -9.5 + (((tickAnim - 37) / 5) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 42) / 8) * (0-(-14.5)));
            yy = -9.5 + (((tickAnim - 42) / 8) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.5 + (((tickAnim - 20) / 10) * (30.5-(30.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.5 + (((tickAnim - 30) / 20) * (0-(30.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -28 + (((tickAnim - 20) / 10) * (-28-(-28)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 30) / 20) * (0-(-28)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 20) / 10) * (21-(21)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21 + (((tickAnim - 30) / 20) * (0-(21)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
        int animCycle = 650;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 3.5 + (((tickAnim - 60) / 540) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 3.5 + (((tickAnim - 600) / 50) * (0-(3.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 60) * (-3.075-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = -3.075 + (((tickAnim - 60) / 540) * (-3.075-(-3.075)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = -3.075 + (((tickAnim - 600) / 50) * (0-(-3.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20 + (((tickAnim - 30) / 30) * (-24.5-(-19.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -24.5 + (((tickAnim - 60) / 540) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -24.5 + (((tickAnim - 600) / 50) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (32.13-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 32.13 + (((tickAnim - 30) / 30) * (-6.75-(32.13)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -6.75 + (((tickAnim - 60) / 540) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = -6.75 + (((tickAnim - 600) / 24) * (38.76-(-6.75)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 38.76 + (((tickAnim - 624) / 26) * (0-(38.76)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.365-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.975-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0.365 + (((tickAnim - 30) / 30) * (-1.125-(0.365)));
            zz = -0.975 + (((tickAnim - 30) / 30) * (0-(-0.975)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -1.125 + (((tickAnim - 60) / 540) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = -1.125 + (((tickAnim - 600) / 24) * (0.82-(-1.125)));
            zz = 0 + (((tickAnim - 600) / 24) * (-1.25-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 0.82 + (((tickAnim - 624) / 26) * (0-(0.82)));
            zz = -1.25 + (((tickAnim - 624) / 26) * (0-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -46.75 + (((tickAnim - 30) / 30) * (0-(-46.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (-35.75-(0)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = -35.75 + (((tickAnim - 624) / 26) * (0-(-35.75)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.94-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.06-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 1.94 + (((tickAnim - 30) / 30) * (-0.925-(1.94)));
            zz = 0.06 + (((tickAnim - 30) / 30) * (-0.775-(0.06)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -0.925 + (((tickAnim - 60) / 540) * (-0.925-(-0.925)));
            zz = -0.775 + (((tickAnim - 60) / 540) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = -0.925 + (((tickAnim - 600) / 24) * (1.42-(-0.925)));
            zz = -0.775 + (((tickAnim - 600) / 24) * (-0.125-(-0.775)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 1.42 + (((tickAnim - 624) / 26) * (0-(1.42)));
            zz = -0.125 + (((tickAnim - 624) / 26) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (90.63-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 90.63 + (((tickAnim - 30) / 30) * (28.25-(90.63)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 28.25 + (((tickAnim - 60) / 540) * (28.25-(28.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 28.25 + (((tickAnim - 600) / 24) * (85.35-(28.25)));
            yy = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 85.35 + (((tickAnim - 624) / 26) * (0-(85.35)));
            yy = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0.975 + (((tickAnim - 60) / 540) * (0.975-(0.975)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = 0.975 + (((tickAnim - 600) / 50) * (0-(0.975)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 28.75 + (((tickAnim - 30) / 30) * (0-(28.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -0.325 + (((tickAnim - 30) / 30) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 11.25 + (((tickAnim - 60) / 540) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 11.25 + (((tickAnim - 600) / 50) * (0-(11.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -6.25 + (((tickAnim - 60) / 540) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -6.25 + (((tickAnim - 600) / 50) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 650) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 650) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.6-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -0.2 + (((tickAnim - 60) / 540) * (-0.2-(-0.2)));
            zz = -0.6 + (((tickAnim - 60) / 540) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = -0.2 + (((tickAnim - 600) / 50) * (0-(-0.2)));
            zz = -0.6 + (((tickAnim - 600) / 50) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -8.75 + (((tickAnim - 60) / 540) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -8.75 + (((tickAnim - 600) / 50) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = -0.05 + (((tickAnim - 60) / 540) * (-0.05-(-0.05)));
            zz = 0.5 + (((tickAnim - 60) / 540) * (0.5-(0.5)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = -0.05 + (((tickAnim - 600) / 50) * (0-(-0.05)));
            zz = 0.5 + (((tickAnim - 600) / 50) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(0), righttoes.rotateAngleY + (float) Math.toRadians(0), righttoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 4.25 + (((tickAnim - 60) / 540) * (6.5-(4.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 6.5 + (((tickAnim - 600) / 50) * (0-(6.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 1 + (((tickAnim - 600) / 50) * (0-(1)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -7.25 + (((tickAnim - 60) / 540) * (-5.5-(-7.25)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -5.5 + (((tickAnim - 600) / 50) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = -7 + (((tickAnim - 60) / 540) * (-8.25-(-7)));
            yy = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 540) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -8.25 + (((tickAnim - 600) / 50) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -4.75 + (((tickAnim - 600) / 50) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = -2.25 + (((tickAnim - 600) / 50) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 5.25 + (((tickAnim - 60) / 120) * (11-(5.25)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 11 + (((tickAnim - 180) / 420) * (11-(11)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 11 + (((tickAnim - 600) / 50) * (0-(11)));
            yy = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 5.75 + (((tickAnim - 60) / 120) * (4.4559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(5.75)));
            yy = 0 + (((tickAnim - 60) / 120) * (8.46491-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (2.55576-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 181) {
            xx = 4.4559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 180) / 1) * (9.5309-(4.4559+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 8.46491 + (((tickAnim - 180) / 1) * (8.46491-(8.46491)));
            zz = 2.55576 + (((tickAnim - 180) / 1) * (2.55576-(2.55576)));
        }
        else if (tickAnim >= 181 && tickAnim < 600) {
            xx = 9.5309 + (((tickAnim - 181) / 419) * (9.3309-(9.5309)));
            yy = 8.46491 + (((tickAnim - 181) / 419) * (8.46491-(8.46491)));
            zz = 2.55576 + (((tickAnim - 181) / 419) * (2.55576-(2.55576)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 9.3309 + (((tickAnim - 600) / 50) * (0-(9.3309)));
            yy = 8.46491 + (((tickAnim - 600) / 50) * (0-(8.46491)));
            zz = 2.55576 + (((tickAnim - 600) / 50) * (0-(2.55576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            yy = -0.1 + (((tickAnim - 60) / 120) * (-0.325-(-0.1)));
            zz = 0.3 + (((tickAnim - 60) / 120) * (0.625-(0.3)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = -0.325 + (((tickAnim - 180) / 420) * (-0.325-(-0.325)));
            zz = 0.625 + (((tickAnim - 180) / 420) * (0.625-(0.625)));
        }
        else if (tickAnim >= 600 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 600) / 50) * (0-(0)));
            yy = -0.325 + (((tickAnim - 600) / 50) * (0-(-0.325)));
            zz = 0.625 + (((tickAnim - 600) / 50) * (0-(0.625)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 60) / 120) * (25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 181) {
            xx = 25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10 + (((tickAnim - 180) / 1) * (30.2-(25.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*10)));
            yy = 0 + (((tickAnim - 180) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 1) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 600) {
            xx = 30.2 + (((tickAnim - 181) / 419) * (30.2-(30.2)));
            yy = 0 + (((tickAnim - 181) / 419) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 419) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 30.2 + (((tickAnim - 600) / 3) * (32.68-(30.2)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 627) {
            xx = 32.68 + (((tickAnim - 603) / 24) * (6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(32.68)));
            yy = 0 + (((tickAnim - 603) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 24) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 650) {
            xx = 6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 627) / 23) * (0-(6.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 0 + (((tickAnim - 627) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = -4.5 + (((tickAnim - 60) / 120) * (18.75-(-4.5)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 18.75 + (((tickAnim - 180) / 420) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 18.75 + (((tickAnim - 600) / 3) * (23.16-(18.75)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 629) {
            xx = 23.16 + (((tickAnim - 603) / 26) * (-1.59-(23.16)));
            yy = 0 + (((tickAnim - 603) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 26) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -1.59 + (((tickAnim - 629) / 21) * (0-(-1.59)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 7.75 + (((tickAnim - 60) / 120) * (0-(7.75)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 600) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 600) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 5) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 629) {
            xx = 9.5 + (((tickAnim - 605) / 24) * (-15.1-(9.5)));
            yy = 0 + (((tickAnim - 605) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 24) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -15.1 + (((tickAnim - 629) / 21) * (0-(-15.1)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 60) / 590) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 590) * (0-(0)));
            zz = 0.25 + (((tickAnim - 60) / 590) * (0-(0.25)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 12.5 + (((tickAnim - 60) / 120) * (0-(12.5)));
            yy = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 0 + (((tickAnim - 600) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 624) {
            xx = -10 + (((tickAnim - 603) / 21) * (-1.015-(-10)));
            yy = 0 + (((tickAnim - 603) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 21) * (0-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 629) {
            xx = -1.015 + (((tickAnim - 624) / 5) * (-8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(-1.015)));
            yy = 0 + (((tickAnim - 624) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 624) / 5) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 650) {
            xx = -8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 629) / 21) * (0-(-8.37+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 0 + (((tickAnim - 629) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.575-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 60) / 540) * (0-(0)));
            yy = 0.425 + (((tickAnim - 60) / 540) * (0-(0.425)));
            zz = 0.575 + (((tickAnim - 60) / 540) * (0-(0.575)));
        }
        else if (tickAnim >= 600 && tickAnim < 624) {
            xx = 0 + (((tickAnim - 600) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 24) * (0.02-(0)));
            zz = 0 + (((tickAnim - 600) / 24) * (0.27-(0)));
        }
        else if (tickAnim >= 624 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 624) / 26) * (0-(0)));
            yy = 0.02 + (((tickAnim - 624) / 26) * (0-(0.02)));
            zz = 0.27 + (((tickAnim - 624) / 26) * (0-(0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 180) {
            xx = 19 + (((tickAnim - 30) / 150) * (0-(19)));
            yy = 0 + (((tickAnim - 30) / 150) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 150) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 600) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 600) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 5) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 615) {
            xx = 14.75 + (((tickAnim - 605) / 10) * (0-(14.75)));
            yy = 0 + (((tickAnim - 605) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 10) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 615) / 14) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 615) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 14) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 638) {
            xx = -12.75 + (((tickAnim - 629) / 9) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 629) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 30) / 150) * (0-(0)));
            yy = 0.925 + (((tickAnim - 30) / 150) * (0-(0.925)));
            zz = 0 + (((tickAnim - 30) / 150) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 600) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 60) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 32) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 92) / 88) * (9-(0)));
            yy = 0 + (((tickAnim - 92) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 88) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 600) {
            xx = 9 + (((tickAnim - 180) / 420) * (9-(9)));
            yy = 0 + (((tickAnim - 180) / 420) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 420) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 603) {
            xx = 9 + (((tickAnim - 600) / 3) * (23.25-(9)));
            yy = 0 + (((tickAnim - 600) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 3) * (0-(0)));
        }
        else if (tickAnim >= 603 && tickAnim < 605) {
            xx = 23.25 + (((tickAnim - 603) / 2) * (0-(23.25)));
            yy = 0 + (((tickAnim - 603) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 603) / 2) * (0-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 605) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 605) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 605) / 15) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 629) {
            xx = 0 + (((tickAnim - 620) / 9) * (10.75-(0)));
            yy = 0 + (((tickAnim - 620) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 9) * (0-(0)));
        }
        else if (tickAnim >= 629 && tickAnim < 638) {
            xx = 10.75 + (((tickAnim - 629) / 9) * (0-(10.75)));
            yy = 0 + (((tickAnim - 629) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 629) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 0) / 593) * (-11.32508-(0)));
            yy = 0 + (((tickAnim - 0) / 593) * (0.78511-(0)));
            zz = 0 + (((tickAnim - 0) / 593) * (0.3364-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 600) {
            xx = -11.32508 + (((tickAnim - 593) / 7) * (-9.67163-(-11.32508)));
            yy = 0.78511 + (((tickAnim - 593) / 7) * (0.63905-(0.78511)));
            zz = 0.3364 + (((tickAnim - 593) / 7) * (0.27381-(0.3364)));
        }
        else if (tickAnim >= 600 && tickAnim < 627) {
            xx = -9.67163 + (((tickAnim - 600) / 27) * (-1.75-(-9.67163)));
            yy = 0.63905 + (((tickAnim - 600) / 27) * (0-(0.63905)));
            zz = 0.27381 + (((tickAnim - 600) / 27) * (0-(0.27381)));
        }
        else if (tickAnim >= 627 && tickAnim < 650) {
            xx = -1.75 + (((tickAnim - 627) / 23) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 627) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 593) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 593) * (0-(0)));
        }
        else if (tickAnim >= 593 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 593) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 593) / 34) * (0.225-(0)));
            zz = 0 + (((tickAnim - 593) / 34) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 627) / 23) * (0-(0)));
            yy = 0.225 + (((tickAnim - 627) / 23) * (0-(0.225)));
            zz = 0 + (((tickAnim - 627) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -2 + (((tickAnim - 14) / 21) * (0-(-2)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8 + (((tickAnim - 14) / 21) * (0-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-8)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.275-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0.275 + (((tickAnim - 14) / 21) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 14) / 21) * (0-(-5)));
            yy = 0 + (((tickAnim - 14) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5 + (((tickAnim - 14) / 10) * (-13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5 + (((tickAnim - 24) / 11) * (0-(-13.84+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05 + (((tickAnim - 14) / 10) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.05)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01 + (((tickAnim - 24) / 11) * (0-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 3.5 + (((tickAnim - 14) / 10) * (1.25-(3.5)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 24) / 11) * (0-(1.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 14) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01 + (((tickAnim - 14) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.01)));
            zz = 1 + (((tickAnim - 14) / 10) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01 + (((tickAnim - 24) / 11) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.01)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0.25 + (((tickAnim - 14) / 10) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0.25 + (((tickAnim - 24) / 11) * (0-(0.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.05-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            yy = 0.025 + (((tickAnim - 14) / 10) * (0.025-(0.025)));
            zz = -0.05 + (((tickAnim - 14) / 10) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0.025 + (((tickAnim - 24) / 11) * (0-(0.025)));
            zz = -0.05 + (((tickAnim - 24) / 11) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 14) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 14) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01 + (((tickAnim - 14) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01)));
            zz = 1 + (((tickAnim - 14) / 10) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 24) / 11) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01 + (((tickAnim - 24) / 11) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*0.01)));
            zz = 1 + (((tickAnim - 24) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = -2.9 + (((tickAnim - 20) / 25) * (-2.9-(-2.9)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = -2.9 + (((tickAnim - 45) / 20) * (0-(-2.9)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 12.25 + (((tickAnim - 20) / 25) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 12.25 + (((tickAnim - 45) / 20) * (0-(12.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -0.85 + (((tickAnim - 20) / 25) * (-0.85-(-0.85)));
            zz = -0.975 + (((tickAnim - 20) / 25) * (-0.975-(-0.975)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -0.85 + (((tickAnim - 45) / 20) * (0-(-0.85)));
            zz = -0.975 + (((tickAnim - 45) / 20) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -13.5 + (((tickAnim - 20) / 25) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -13.5 + (((tickAnim - 45) / 20) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(0), lefttoes.rotateAngleY + (float) Math.toRadians(0), lefttoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.44-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.44 + (((tickAnim - 15) / 5) * (-22.25-(-22.44)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -22.25 + (((tickAnim - 20) / 25) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -22.25 + (((tickAnim - 45) / 20) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (19.97-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 19.97 + (((tickAnim - 4) / 6) * (4.13-(19.97)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.13 + (((tickAnim - 10) / 10) * (-14.75-(4.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -14.75 + (((tickAnim - 20) / 25) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = -14.75 + (((tickAnim - 45) / 11) * (34.74-(-14.75)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 34.74 + (((tickAnim - 56) / 9) * (0-(34.74)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.87-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -40.87 + (((tickAnim - 10) / 10) * (27.5-(-40.87)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 27.5 + (((tickAnim - 20) / 25) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 27.5 + (((tickAnim - 45) / 11) * (-35.82-(27.5)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = -35.82 + (((tickAnim - 56) / 9) * (0-(-35.82)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-1.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -0.8 + (((tickAnim - 20) / 25) * (-0.8-(-0.8)));
            zz = -1.025 + (((tickAnim - 20) / 25) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = -0.8 + (((tickAnim - 45) / 11) * (0.755-(-0.8)));
            zz = -1.025 + (((tickAnim - 45) / 11) * (-0.02-(-1.025)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            yy = 0.755 + (((tickAnim - 56) / 9) * (0-(0.755)));
            zz = -0.02 + (((tickAnim - 56) / 9) * (0-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (85.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 85.88 + (((tickAnim - 10) / 10) * (9-(85.88)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 9 + (((tickAnim - 20) / 25) * (9-(9)));
            yy = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 9 + (((tickAnim - 45) / 11) * (79.24-(9)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 79.24 + (((tickAnim - 56) / 9) * (0-(79.24)));
            yy = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.57-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.57 + (((tickAnim - 10) / 10) * (1.15-(0.57)));
            zz = -1.2 + (((tickAnim - 10) / 10) * (0-(-1.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = 1.15 + (((tickAnim - 20) / 25) * (1.15-(1.15)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = 1.15 + (((tickAnim - 45) / 11) * (2.48-(1.15)));
            zz = 0 + (((tickAnim - 45) / 11) * (-1-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 56) / 9) * (0-(0)));
            yy = 2.48 + (((tickAnim - 56) / 9) * (0-(2.48)));
            zz = -1 + (((tickAnim - 56) / 9) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0.22353-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-8.7432-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0.34621-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0.22353 + (((tickAnim - 45) / 20) * (0-(0.22353)));
            yy = -8.7432 + (((tickAnim - 45) / 20) * (0-(-8.7432)));
            zz = 0.34621 + (((tickAnim - 45) / 20) * (0-(0.34621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -10.25 + (((tickAnim - 45) / 20) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -12.25 + (((tickAnim - 45) / 20) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -9.75 + (((tickAnim - 45) / 20) * (0-(-9.75)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-11-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -11 + (((tickAnim - 45) / 20) * (0-(-11)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (22.88-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 16) / 29) * (0-(0)));
            yy = 22.88 + (((tickAnim - 16) / 29) * (-15.25-(22.88)));
            zz = 0 + (((tickAnim - 16) / 29) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 45) / 7) * (0-(0)));
            yy = -15.25 + (((tickAnim - 45) / 7) * (-37.67-(-15.25)));
            zz = 0 + (((tickAnim - 45) / 7) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 52) / 13) * (0-(0)));
            yy = -37.67 + (((tickAnim - 52) / 13) * (0-(-37.67)));
            zz = 0 + (((tickAnim - 52) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (-3-(1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -3 + (((tickAnim - 35) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4.25 + (((tickAnim - 20) / 15) * (0.25-(4.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0.25 + (((tickAnim - 35) / 10) * (0-(0.25)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            zz = 0.375 + (((tickAnim - 20) / 45) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 30) / 5) * (13.35479-(19.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (2.25207-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-7.25831-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 13.35479 + (((tickAnim - 35) / 5) * (19.5-(13.35479)));
            yy = 2.25207 + (((tickAnim - 35) / 5) * (0-(2.25207)));
            zz = -7.25831 + (((tickAnim - 35) / 5) * (0-(-7.25831)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 19.5 + (((tickAnim - 40) / 5) * (16-(19.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 16 + (((tickAnim - 45) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 30) / 5) * (24.18495-(6.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (6.9399-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-2.15118-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 24.18495 + (((tickAnim - 35) / 5) * (6.5-(24.18495)));
            yy = 6.9399 + (((tickAnim - 35) / 5) * (0-(6.9399)));
            zz = -2.15118 + (((tickAnim - 35) / 5) * (0-(-2.15118)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 6.5 + (((tickAnim - 40) / 5) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 6.5 + (((tickAnim - 45) / 20) * (0-(6.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 30) / 5) * (1.0594-(4.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (-4.50402-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-1.51031-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.0594 + (((tickAnim - 35) / 5) * (4.75-(1.0594)));
            yy = -4.50402 + (((tickAnim - 35) / 5) * (0-(-4.50402)));
            zz = -1.51031 + (((tickAnim - 35) / 5) * (0-(-1.51031)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 4.75 + (((tickAnim - 40) / 5) * (2-(4.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 45) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.03896-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (10.67898-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.92992-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5.03896 + (((tickAnim - 30) / 5) * (-12.97178-(-5.03896)));
            yy = 10.67898 + (((tickAnim - 30) / 5) * (-8.05161-(10.67898)));
            zz = 4.92992 + (((tickAnim - 30) / 5) * (4.81583-(4.92992)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -12.97178 + (((tickAnim - 35) / 5) * (-5.5-(-12.97178)));
            yy = -8.05161 + (((tickAnim - 35) / 5) * (0-(-8.05161)));
            zz = 4.81583 + (((tickAnim - 35) / 5) * (0-(4.81583)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5.5 + (((tickAnim - 40) / 5) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -5.5 + (((tickAnim - 45) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.55-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.325 + (((tickAnim - 35) / 5) * (0-(-0.325)));
            zz = -0.55 + (((tickAnim - 35) / 5) * (0-(-0.55)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-19.96748-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.58202-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-8.81107-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -19.96748 + (((tickAnim - 30) / 5) * (2.75-(-19.96748)));
            yy = -0.58202 + (((tickAnim - 30) / 5) * (0-(-0.58202)));
            zz = -8.81107 + (((tickAnim - 30) / 5) * (0-(-8.81107)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 35) / 5) * (-19.75-(2.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -19.75 + (((tickAnim - 40) / 5) * (-13.25-(-19.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -13.25 + (((tickAnim - 45) / 20) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 26.75 + (((tickAnim - 30) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.75 + (((tickAnim - 40) / 5) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 26.75 + (((tickAnim - 45) / 20) * (0-(26.75)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-3.74572-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (-6.28981-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (10.37944-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -3.74572 + (((tickAnim - 29) / 1) * (0.5-(-3.74572)));
            yy = -6.28981 + (((tickAnim - 29) / 1) * (0-(-6.28981)));
            zz = 10.37944 + (((tickAnim - 29) / 1) * (0-(10.37944)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.5 + (((tickAnim - 30) / 5) * (-0.47995-(0.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (3.43562-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.66863-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.47995 + (((tickAnim - 35) / 5) * (-1.75-(-0.47995)));
            yy = 3.43562 + (((tickAnim - 35) / 5) * (0-(3.43562)));
            zz = 0.66863 + (((tickAnim - 35) / 5) * (0-(0.66863)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -1.75 + (((tickAnim - 40) / 5) * (-2.25-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = -2.25 + (((tickAnim - 45) / 20) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -0.3 + (((tickAnim - 29) / 11) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.64702-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-4.70334-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-8.27516-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.64702 + (((tickAnim - 30) / 5) * (0-(0.64702)));
            yy = -4.70334 + (((tickAnim - 30) / 5) * (0-(-4.70334)));
            zz = -8.27516 + (((tickAnim - 30) / 5) * (0-(-8.27516)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0.64702-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (-4.70334-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (-8.27516-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0.64702 + (((tickAnim - 45) / 20) * (0-(0.64702)));
            yy = -4.70334 + (((tickAnim - 45) / 20) * (0-(-4.70334)));
            zz = -8.27516 + (((tickAnim - 45) / 20) * (0-(-8.27516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw1, leftJaw1.rotateAngleX + (float) Math.toRadians(xx), leftJaw1.rotateAngleY + (float) Math.toRadians(yy), leftJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 9.5 + (((tickAnim - 30) / 5) * (0-(9.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (9.5-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 9.5 + (((tickAnim - 45) / 20) * (0-(9.5)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftJaw2, leftJaw2.rotateAngleX + (float) Math.toRadians(xx), leftJaw2.rotateAngleY + (float) Math.toRadians(yy), leftJaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.64702-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.70334-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (8.27516-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.64702 + (((tickAnim - 30) / 5) * (0-(0.64702)));
            yy = 4.70334 + (((tickAnim - 30) / 5) * (0-(4.70334)));
            zz = 8.27516 + (((tickAnim - 30) / 5) * (0-(8.27516)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0.64702-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (4.70334-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (8.27516-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0.64702 + (((tickAnim - 45) / 20) * (0-(0.64702)));
            yy = 4.70334 + (((tickAnim - 45) / 20) * (0-(4.70334)));
            zz = 8.27516 + (((tickAnim - 45) / 20) * (0-(8.27516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw1, rightJaw1.rotateAngleX + (float) Math.toRadians(xx), rightJaw1.rotateAngleY + (float) Math.toRadians(yy), rightJaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -9.25 + (((tickAnim - 30) / 5) * (0-(-9.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (-9.25-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = -9.25 + (((tickAnim - 45) / 20) * (0-(-9.25)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightJaw2, rightJaw2.rotateAngleX + (float) Math.toRadians(xx), rightJaw2.rotateAngleY + (float) Math.toRadians(yy), rightJaw2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*0.8);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -21.5 + (((tickAnim - 0) / 19) * (24-(-21.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 36) {
            xx = 24 + (((tickAnim - 19) / 17) * (-27.49052-(24)));
            yy = 0 + (((tickAnim - 19) / 17) * (-0.91308-(0)));
            zz = 0 + (((tickAnim - 19) / 17) * (-1.19013-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -27.49052 + (((tickAnim - 36) / 4) * (-21.5-(-27.49052)));
            yy = -0.91308 + (((tickAnim - 36) / 4) * (0-(-0.91308)));
            zz = -1.19013 + (((tickAnim - 36) / 4) * (0-(-1.19013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -4.75 + (((tickAnim - 0) / 19) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (20.5-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 20.5 + (((tickAnim - 23) / 3) * (37.23-(20.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 37.23 + (((tickAnim - 26) / 14) * (-4.75-(37.23)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 19) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.575-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-0.725-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 23) / 3) * (1.615-(0.575)));
            zz = -0.725 + (((tickAnim - 23) / 3) * (-0.745-(-0.725)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 1.615 + (((tickAnim - 26) / 14) * (-0.5-(1.615)));
            zz = -0.745 + (((tickAnim - 26) / 14) * (0-(-0.745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 17.75 + (((tickAnim - 0) / 19) * (6.5-(17.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 6.5 + (((tickAnim - 19) / 4) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 4.25 + (((tickAnim - 23) / 6) * (-31.87-(4.25)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -31.87 + (((tickAnim - 29) / 3) * (-31.87-(-31.87)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -31.87 + (((tickAnim - 32) / 2) * (-39-(-31.87)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -39 + (((tickAnim - 34) / 6) * (17.75-(-39)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 19) * (-0.125-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.925-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 19) / 10) * (0.935-(-0.125)));
            zz = -0.925 + (((tickAnim - 19) / 10) * (1.025-(-0.925)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0.935 + (((tickAnim - 29) / 3) * (0.935-(0.935)));
            zz = 1.025 + (((tickAnim - 29) / 3) * (1.025-(1.025)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0.935 + (((tickAnim - 32) / 8) * (-0.175-(0.935)));
            zz = 1.025 + (((tickAnim - 32) / 8) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 8.25 + (((tickAnim - 0) / 4) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -1.75 + (((tickAnim - 4) / 5) * (-9.75-(-1.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -9.75 + (((tickAnim - 9) / 10) * (33-(-9.75)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 33 + (((tickAnim - 19) / 4) * (65.99-(33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 65.99 + (((tickAnim - 23) / 2) * (79.25-(65.99)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 79.25 + (((tickAnim - 25) / 4) * (74-(79.25)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 74 + (((tickAnim - 29) / 3) * (77-(74)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 77 + (((tickAnim - 32) / 2) * (70.82-(77)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 70.82 + (((tickAnim - 34) / 6) * (8.25-(70.82)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 0) / 2) * (2.01-(1.375)));
            zz = -0.425 + (((tickAnim - 0) / 2) * (-0.33-(-0.425)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 2.01 + (((tickAnim - 2) / 2) * (1.945-(2.01)));
            zz = -0.33 + (((tickAnim - 2) / 2) * (-0.23-(-0.33)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 1.945 + (((tickAnim - 4) / 5) * (0.375-(1.945)));
            zz = -0.23 + (((tickAnim - 4) / 5) * (0-(-0.23)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 9) / 5) * (1.305-(0.375)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 1.305 + (((tickAnim - 14) / 5) * (0.975-(1.305)));
            zz = 0 + (((tickAnim - 14) / 5) * (-0.6-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 19) / 4) * (0.73-(0.975)));
            zz = -0.6 + (((tickAnim - 19) / 4) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.73 + (((tickAnim - 23) / 6) * (1.89-(0.73)));
            zz = -0.6 + (((tickAnim - 23) / 6) * (-0.66-(-0.6)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 1.89 + (((tickAnim - 29) / 3) * (1.89-(1.89)));
            zz = -0.66 + (((tickAnim - 29) / 3) * (-0.66-(-0.66)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 1.89 + (((tickAnim - 32) / 2) * (0.46-(1.89)));
            zz = -0.66 + (((tickAnim - 32) / 2) * (-1.345-(-0.66)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.46 + (((tickAnim - 34) / 6) * (1.375-(0.46)));
            zz = -1.345 + (((tickAnim - 34) / 6) * (-0.425-(-1.345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (-51.25-(0)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = -51.25 + (((tickAnim - 19) / 7) * (10.05-(-51.25)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 10.05 + (((tickAnim - 26) / 4) * (26.75-(10.05)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 26.75 + (((tickAnim - 30) / 3) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 26.75 + (((tickAnim - 33) / 7) * (0-(26.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 10) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0.7-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = -0.45 + (((tickAnim - 19) / 7) * (0-(-0.45)));
            zz = 0.7 + (((tickAnim - 19) / 7) * (1-(0.7)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 1 + (((tickAnim - 26) / 14) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*8), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*9), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.5));
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(0);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(-0.175);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(0);


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-5.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*8), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*12), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-90))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.175);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-170))*3), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*3), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftFingers, leftFingers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*5), leftFingers.rotateAngleY + (float) Math.toRadians(0), leftFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-170))*3), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*3), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightFingers, rightFingers.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*5), rightFingers.rotateAngleY + (float) Math.toRadians(0), rightFingers.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-300))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-350))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-520))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*1), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));
        this.throat1.rotationPointX = this.throat1.rotationPointX + (float)(0);
        this.throat1.rotationPointY = this.throat1.rotationPointY - (float)(0.075);
        this.throat1.rotationPointZ = this.throat1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 24 + (((tickAnim - 0) / 15) * (-27.49052-(24)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.91308-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.19013-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -27.49052 + (((tickAnim - 15) / 4) * (-21.5-(-27.49052)));
            yy = 0.91308 + (((tickAnim - 15) / 4) * (0-(0.91308)));
            zz = 1.19013 + (((tickAnim - 15) / 4) * (0-(1.19013)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -21.5 + (((tickAnim - 19) / 21) * (24-(-21.5)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.5 + (((tickAnim - 3) / 5) * (37.23-(20.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 37.23 + (((tickAnim - 8) / 11) * (-4.75-(37.23)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -4.75 + (((tickAnim - 19) / 21) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.725-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 3) / 5) * (1.615-(0.575)));
            zz = -0.725 + (((tickAnim - 3) / 5) * (-0.745-(-0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 1.615 + (((tickAnim - 8) / 11) * (-0.5-(1.615)));
            zz = -0.745 + (((tickAnim - 8) / 11) * (0-(-0.745)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = -0.5 + (((tickAnim - 19) / 21) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.5 + (((tickAnim - 0) / 3) * (4.25-(6.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 4.25 + (((tickAnim - 3) / 6) * (-31.87-(4.25)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -31.87 + (((tickAnim - 9) / 3) * (-31.87-(-31.87)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -31.87 + (((tickAnim - 12) / 2) * (-39-(-31.87)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -39 + (((tickAnim - 14) / 5) * (17.75-(-39)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 17.75 + (((tickAnim - 19) / 21) * (6.5-(17.75)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 9) * (0.935-(-0.125)));
            zz = -0.925 + (((tickAnim - 0) / 9) * (1.025-(-0.925)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.935 + (((tickAnim - 9) / 3) * (0.935-(0.935)));
            zz = 1.025 + (((tickAnim - 9) / 3) * (1.025-(1.025)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 0.935 + (((tickAnim - 12) / 7) * (-0.175-(0.935)));
            zz = 1.025 + (((tickAnim - 12) / 7) * (0-(1.025)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = -0.175 + (((tickAnim - 19) / 21) * (-0.125-(-0.175)));
            zz = 0 + (((tickAnim - 19) / 21) * (-0.925-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33 + (((tickAnim - 0) / 3) * (65.99-(33)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 65.99 + (((tickAnim - 3) / 3) * (79.25-(65.99)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 79.25 + (((tickAnim - 6) / 3) * (74-(79.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 74 + (((tickAnim - 9) / 3) * (77-(74)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 77 + (((tickAnim - 12) / 2) * (70.82-(77)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 70.82 + (((tickAnim - 14) / 5) * (8.25-(70.82)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 19) / 4) * (-1.75-(8.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -1.75 + (((tickAnim - 23) / 6) * (-9.75-(-1.75)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -9.75 + (((tickAnim - 29) / 11) * (33-(-9.75)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (0.73-(0.4)));
            zz = -0.6 + (((tickAnim - 0) / 3) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.73 + (((tickAnim - 3) / 6) * (1.89-(0.73)));
            zz = -0.6 + (((tickAnim - 3) / 6) * (-0.66-(-0.6)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.89 + (((tickAnim - 9) / 3) * (1.89-(1.89)));
            zz = -0.66 + (((tickAnim - 9) / 3) * (-0.66-(-0.66)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.89 + (((tickAnim - 12) / 2) * (0.46-(1.89)));
            zz = -0.66 + (((tickAnim - 12) / 2) * (-1.345-(-0.66)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0.46 + (((tickAnim - 14) / 5) * (1.375-(0.46)));
            zz = -1.345 + (((tickAnim - 14) / 5) * (-0.425-(-1.345)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 1.375 + (((tickAnim - 19) / 2) * (2.01-(1.375)));
            zz = -0.425 + (((tickAnim - 19) / 2) * (-0.33-(-0.425)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 2.01 + (((tickAnim - 21) / 2) * (1.945-(2.01)));
            zz = -0.33 + (((tickAnim - 21) / 2) * (-0.23-(-0.33)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 1.945 + (((tickAnim - 23) / 6) * (0.375-(1.945)));
            zz = -0.23 + (((tickAnim - 23) / 6) * (0-(-0.23)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 29) / 5) * (1.305-(0.375)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.305 + (((tickAnim - 34) / 6) * (0.4-(1.305)));
            zz = 0 + (((tickAnim - 34) / 6) * (-0.6-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -51.25 + (((tickAnim - 0) / 6) * (10.05-(-51.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10.05 + (((tickAnim - 6) / 4) * (26.75-(10.05)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.75 + (((tickAnim - 10) / 3) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 26.75 + (((tickAnim - 13) / 6) * (0-(26.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 29) / 11) * (-51.25-(0)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 6) * (0-(-0.45)));
            zz = 0.7 + (((tickAnim - 0) / 6) * (1-(0.7)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 6) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 13) * (0-(0)));
            zz = 1 + (((tickAnim - 6) / 13) * (0-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.325 + (((tickAnim - 34) / 6) * (-0.45-(-0.325)));
            zz = 0.45 + (((tickAnim - 34) / 6) * (0.7-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBaryonyx entity = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-50))*6), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-80))*1.5);



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -21.16265 + (((tickAnim - 0) / 11) * (28.5-(-21.16265)));
            yy = 2.46211 + (((tickAnim - 0) / 11) * (0-(2.46211)));
            zz = 4.06333 + (((tickAnim - 0) / 11) * (0-(4.06333)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 28.5 + (((tickAnim - 11) / 8) * (-30.81-(28.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -30.81 + (((tickAnim - 19) / 4) * (-21.16265-(-30.81)));
            yy = 0 + (((tickAnim - 19) / 4) * (2.46211-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (4.06333-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -14.03471 + (((tickAnim - 0) / 11) * (28.5-(-14.03471)));
            yy = 0.55251 + (((tickAnim - 0) / 11) * (0-(0.55251)));
            zz = -0.42889 + (((tickAnim - 0) / 11) * (0-(-0.42889)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 28.5 + (((tickAnim - 11) / 7) * (26.75-(28.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 26.75 + (((tickAnim - 18) / 5) * (-14.03471-(26.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.55251-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.42889-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.725 + (((tickAnim - 0) / 11) * (0.7-(-0.725)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.625-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 11) / 7) * (0.73-(0.7)));
            zz = -0.625 + (((tickAnim - 11) / 7) * (-1.11-(-0.625)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.73 + (((tickAnim - 18) / 5) * (-0.725-(0.73)));
            zz = -1.11 + (((tickAnim - 18) / 5) * (0-(-1.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.5 + (((tickAnim - 0) / 11) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (-35.31-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -35.31 + (((tickAnim - 17) / 2) * (-35.31-(-35.31)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -35.31 + (((tickAnim - 19) / 4) * (-0.5-(-35.31)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 2) * (-0.475-(0.1)));
            zz = -0.225 + (((tickAnim - 0) / 2) * (-1.06-(-0.225)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.475 + (((tickAnim - 2) / 1) * (-0.6-(-0.475)));
            zz = -1.06 + (((tickAnim - 2) / 1) * (-1.05-(-1.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 8) * (0-(-0.6)));
            zz = -1.05 + (((tickAnim - 3) / 8) * (0-(-1.05)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (1.525-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 17) / 2) * (-0.05-(-0.05)));
            zz = 1.525 + (((tickAnim - 17) / 2) * (1.525-(1.525)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.05 + (((tickAnim - 19) / 4) * (0.1-(-0.05)));
            zz = 1.525 + (((tickAnim - 19) / 4) * (-0.225-(1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 54.5 + (((tickAnim - 0) / 2) * (22.06907-(54.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (-2.02171-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.45219-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.06907 + (((tickAnim - 2) / 1) * (1.71325-(22.06907)));
            yy = -2.02171 + (((tickAnim - 2) / 1) * (-1.02902-(-2.02171)));
            zz = -3.45219 + (((tickAnim - 2) / 1) * (-3.09023-(-3.45219)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.71325 + (((tickAnim - 3) / 2) * (22.56163-(1.71325)));
            yy = -1.02902 + (((tickAnim - 3) / 2) * (-0.51451-(-1.02902)));
            zz = -3.09023 + (((tickAnim - 3) / 2) * (-1.54511-(-3.09023)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 22.56163 + (((tickAnim - 5) / 2) * (46.41-(22.56163)));
            yy = -0.51451 + (((tickAnim - 5) / 2) * (0-(-0.51451)));
            zz = -1.54511 + (((tickAnim - 5) / 2) * (0-(-1.54511)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 46.41 + (((tickAnim - 7) / 4) * (54-(46.41)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 54 + (((tickAnim - 11) / 6) * (75.38-(54)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 75.38 + (((tickAnim - 17) / 2) * (75.38-(75.38)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 75.38 + (((tickAnim - 19) / 4) * (54.5-(75.38)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 2) * (2.225-(1.05)));
            zz = -0.8 + (((tickAnim - 0) / 2) * (-0.55-(-0.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.225 + (((tickAnim - 2) / 1) * (2.05-(2.225)));
            zz = -0.55 + (((tickAnim - 2) / 1) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.05 + (((tickAnim - 3) / 2) * (0.73-(2.05)));
            zz = -0.55 + (((tickAnim - 3) / 2) * (-0.09-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.73 + (((tickAnim - 5) / 1) * (0.82-(0.73)));
            zz = -0.09 + (((tickAnim - 5) / 1) * (-0.18-(-0.09)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.82 + (((tickAnim - 6) / 1) * (1.575-(0.82)));
            zz = -0.18 + (((tickAnim - 6) / 1) * (-0.28-(-0.18)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 1.575 + (((tickAnim - 7) / 4) * (0.8-(1.575)));
            zz = -0.28 + (((tickAnim - 7) / 4) * (-0.675-(-0.28)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0.15-(0)));
            yy = 0.8 + (((tickAnim - 11) / 6) * (1.85-(0.8)));
            zz = -0.675 + (((tickAnim - 11) / 6) * (-0.595-(-0.675)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0.15 + (((tickAnim - 17) / 2) * (0.15-(0.15)));
            yy = 1.85 + (((tickAnim - 17) / 2) * (0.625-(1.85)));
            zz = -0.595 + (((tickAnim - 17) / 2) * (-0.47-(-0.595)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0.15 + (((tickAnim - 19) / 4) * (0-(0.15)));
            yy = 0.625 + (((tickAnim - 19) / 4) * (1.05-(0.625)));
            zz = -0.47 + (((tickAnim - 19) / 4) * (-0.8-(-0.47)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-36.26-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -36.26 + (((tickAnim - 5) / 2) * (-38.5-(-36.26)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -38.5 + (((tickAnim - 7) / 4) * (31.25-(-38.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 31.25 + (((tickAnim - 11) / 6) * (32.13-(31.25)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 32.13 + (((tickAnim - 17) / 6) * (0-(32.13)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.9-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0.9 + (((tickAnim - 11) / 6) * (0.15-(0.9)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0.15 + (((tickAnim - 17) / 6) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-150))*6), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*4), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-200))*6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*9), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-100))*7), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-300))*12), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-150))*9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*15), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(19.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-400))*15), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-250))*12), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*2.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-90))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-120))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-140))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-200))*3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.425);


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-180))*6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-280))*6), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*2), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-180))*6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-280))*6), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*2), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-190))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-250))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-300))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320/0.5-350))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.5 + (((tickAnim - 0) / 8) * (-30.81-(28.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -30.81 + (((tickAnim - 8) / 3) * (-21.16265-(-30.81)));
            yy = 0 + (((tickAnim - 8) / 3) * (-2.46211-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-4.06333-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -21.16265 + (((tickAnim - 11) / 12) * (28.5-(-21.16265)));
            yy = -2.46211 + (((tickAnim - 11) / 12) * (0-(-2.46211)));
            zz = -4.06333 + (((tickAnim - 11) / 12) * (0-(-4.06333)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 28.5 + (((tickAnim - 0) / 7) * (26.75-(28.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 26.75 + (((tickAnim - 7) / 4) * (-14.03471-(26.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0.55251-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.42889-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -14.03471 + (((tickAnim - 11) / 12) * (28.5-(-14.03471)));
            yy = 0.55251 + (((tickAnim - 11) / 12) * (0-(0.55251)));
            zz = -0.42889 + (((tickAnim - 11) / 12) * (0-(-0.42889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 7) * (0.73-(0.7)));
            zz = -0.625 + (((tickAnim - 0) / 7) * (-1.11-(-0.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.73 + (((tickAnim - 7) / 4) * (-0.725-(0.73)));
            zz = -1.11 + (((tickAnim - 7) / 4) * (0-(-1.11)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = -0.725 + (((tickAnim - 11) / 12) * (0.7-(-0.725)));
            zz = 0 + (((tickAnim - 11) / 12) * (-0.625-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-35.31-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -35.31 + (((tickAnim - 6) / 2) * (-35.31-(-35.31)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -35.31 + (((tickAnim - 8) / 3) * (-0.5-(-35.31)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -0.5 + (((tickAnim - 11) / 12) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.525-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 6) / 2) * (-0.05-(-0.05)));
            zz = 1.525 + (((tickAnim - 6) / 2) * (1.525-(1.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 3) * (0.1-(-0.05)));
            zz = 1.525 + (((tickAnim - 8) / 3) * (-0.225-(1.525)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 2) * (-0.475-(0.1)));
            zz = -0.225 + (((tickAnim - 11) / 2) * (-1.06-(-0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 1) * (-0.6-(-0.475)));
            zz = -1.06 + (((tickAnim - 13) / 1) * (-1.05-(-1.06)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = -0.6 + (((tickAnim - 14) / 9) * (0-(-0.6)));
            zz = -1.05 + (((tickAnim - 14) / 9) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 54 + (((tickAnim - 0) / 6) * (75.38-(54)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 75.38 + (((tickAnim - 6) / 2) * (75.38-(75.38)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 75.38 + (((tickAnim - 8) / 3) * (54.5-(75.38)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 54.5 + (((tickAnim - 11) / 2) * (24.31907-(54.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (2.02171-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (3.45219-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 24.31907 + (((tickAnim - 13) / 1) * (3.46325-(24.31907)));
            yy = 2.02171 + (((tickAnim - 13) / 1) * (1.02902-(2.02171)));
            zz = 3.45219 + (((tickAnim - 13) / 1) * (3.09023-(3.45219)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 3.46325 + (((tickAnim - 14) / 2) * (22.56163-(3.46325)));
            yy = 1.02902 + (((tickAnim - 14) / 2) * (-0.51451-(1.02902)));
            zz = 3.09023 + (((tickAnim - 14) / 2) * (-1.54511-(3.09023)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 22.56163 + (((tickAnim - 16) / 2) * (46.41-(22.56163)));
            yy = -0.51451 + (((tickAnim - 16) / 2) * (0-(-0.51451)));
            zz = -1.54511 + (((tickAnim - 16) / 2) * (0-(-1.54511)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 46.41 + (((tickAnim - 18) / 5) * (54-(46.41)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.15-(0)));
            yy = 0.8 + (((tickAnim - 0) / 6) * (0.625-(0.8)));
            zz = -0.675 + (((tickAnim - 0) / 6) * (-1.07-(-0.675)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.15 + (((tickAnim - 6) / 2) * (0.15-(0.15)));
            yy = 0.625 + (((tickAnim - 6) / 2) * (0.625-(0.625)));
            zz = -1.07 + (((tickAnim - 6) / 2) * (-1.07-(-1.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.15 + (((tickAnim - 8) / 3) * (0-(0.15)));
            yy = 0.625 + (((tickAnim - 8) / 3) * (1.05-(0.625)));
            zz = -1.07 + (((tickAnim - 8) / 3) * (-0.8-(-1.07)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 11) / 2) * (2.15-(1.05)));
            zz = -0.8 + (((tickAnim - 11) / 2) * (-0.25-(-0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.15 + (((tickAnim - 13) / 1) * (2.05-(2.15)));
            zz = -0.25 + (((tickAnim - 13) / 1) * (-0.55-(-0.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 2.05 + (((tickAnim - 14) / 2) * (0.73-(2.05)));
            zz = -0.55 + (((tickAnim - 14) / 2) * (-0.09-(-0.55)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0.73 + (((tickAnim - 16) / 1) * (0.82-(0.73)));
            zz = -0.09 + (((tickAnim - 16) / 1) * (-0.18-(-0.09)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.82 + (((tickAnim - 17) / 1) * (1.575-(0.82)));
            zz = -0.18 + (((tickAnim - 17) / 1) * (-0.28-(-0.18)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.575 + (((tickAnim - 18) / 5) * (0.8-(1.575)));
            zz = -0.28 + (((tickAnim - 18) / 5) * (-0.675-(-0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 31.25 + (((tickAnim - 0) / 6) * (32.13-(31.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 32.13 + (((tickAnim - 6) / 5) * (0-(32.13)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-56.28-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -56.28 + (((tickAnim - 18) / 5) * (31.25-(-56.28)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0.525 + (((tickAnim - 0) / 6) * (0.55-(0.525)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0.55 + (((tickAnim - 6) / 5) * (0-(0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBaryonyx ee = (EntityPrehistoricFloraBaryonyx) entitylivingbaseIn;

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
        EntityPrehistoricFloraBaryonyx e = (EntityPrehistoricFloraBaryonyx) entity;
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
