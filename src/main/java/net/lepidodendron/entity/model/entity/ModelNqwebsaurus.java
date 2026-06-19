package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNqwebsaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNqwebsaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightFinger;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftFinger;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
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
    private final AdvancedModelRenderer crest1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer crest2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer crest3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;


    private ModelAnimator animator;

    public ModelNqwebsaurus() {
        this.textureWidth = 99;
        this.textureHeight = 98;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 6.6F, 1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.5F, -2.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 73, 27, -2.5F, -0.9F, 2.9F, 4, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.5F, -2.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 67, -2.5F, -1.3F, -1.1F, 4, 1, 5, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 59, -1.5F, 4.9F, -1.1F, 3, 1, 6, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 37, -2.0F, -1.1F, -1.1F, 4, 6, 6, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.9F, 0.7F, -0.15F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 62, 0, -0.5F, -0.7948F, -1.5638F, 3, 7, 4, 0.0F, false));
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 90, 20, 0.5F, -0.7948F, 2.4362F, 0, 7, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.8052F, -1.1638F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6807F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 78, -0.1F, 0.2533F, -0.2677F, 2, 9, 2, 0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 73, 80, -0.5F, 0.0533F, -0.5362F, 3, 3, 3, -0.01F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 37, 85, -0.5F, 3.0333F, -0.5362F, 3, 1, 3, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.9F, 8.9533F, 1.3323F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 57, 88, -1.0F, -0.2067F, -0.6088F, 2, 4, 1, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4363F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 88, 8, -1.5F, -0.5F, -1.3F, 3, 1, 2, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, 0.0F, -1.3F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 88, 12, -1.0F, -0.5F, -2.0F, 3, 1, 2, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.9F, 0.7F, -0.15F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 46, 59, -2.5F, -0.7948F, -1.5638F, 3, 7, 4, 0.0F, false));
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 28, 39, -0.5F, -0.7948F, 2.4362F, 0, 7, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.8052F, -1.1638F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6807F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 71, -1.9F, 0.2533F, -0.2677F, 2, 9, 2, 0.01F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 80, 66, -2.5F, 0.0533F, -0.5362F, 3, 3, 3, -0.01F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 13, 85, -2.5F, 3.0333F, -0.5362F, 3, 1, 3, -0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.9F, 8.9533F, 1.3323F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 19, 54, -1.0F, -0.2067F, -0.6088F, 2, 4, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.7934F, -0.3088F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4363F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 52, 46, -1.5F, -0.5F, -1.3F, 3, 1, 2, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, 0.0F, -1.3F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 77, 8, -2.0F, -0.5F, -2.0F, 3, 1, 2, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2F, -2.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0349F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.2F, 0.2F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 69, 0.0F, 5.2F, -6.0F, 2, 1, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 77, 3.0F, 5.2F, -6.0F, 0, 1, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 77, 0, -1.0F, 5.2F, -6.0F, 0, 1, 6, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 13, -1.5F, -1.8F, -6.0F, 5, 7, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.2F, 0.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 27, -3.0F, -2.3F, -6.0F, 5, 2, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.6F, -5.8F);
        this.body.addChild(chest);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.2F, -2.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 73, 74, -1.5F, 3.7F, 0.7F, 3, 1, 4, 0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 71, -2.0F, 2.0F, 0.1F, 4, 2, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.2F, -3.6F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 61, -2.5F, -2.0F, 0.1F, 4, 2, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.3F, -3.7F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 13, -2.5F, -2.0F, 0.1F, 4, 6, 4, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.0474F, 4.0395F, -1.9157F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.7502F, -0.3187F, 0.1359F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 88, -0.4941F, -1.5647F, -1.0475F, 1, 5, 2, 0.008F, false));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 7, 88, -0.4941F, -1.5647F, 0.9525F, 0, 5, 2, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1059F, 3.2353F, 0.6525F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2647F, -0.0116F, -0.0079F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 93, 58, -0.55F, -0.25F, -0.8F, 1, 4, 1, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 38, 61, -0.55F, -2.25F, 0.2F, 0, 6, 3, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.5F, 3.7F, -0.2F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.4868F, 0.0692F, -0.0532F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 93, 20, 0.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 26, 90, 0.0F, 1.7F, -0.5F, 1, 2, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.25F, 0.5F);
        this.rightHand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0349F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 85, 0.0F, -2.5F, -0.2F, 0, 5, 3, -0.01F, false));

        this.rightFinger = new AdvancedModelRenderer(this);
        this.rightFinger.setRotationPoint(0.0F, 0.4717F, -0.0024F);
        this.rightHand.addChild(rightFinger);
        this.setRotateAngle(rightFinger, -0.2618F, 0.0F, 0.0F);
        this.rightFinger.cubeList.add(new ModelBox(rightFinger, 40, 90, 0.0F, 0.0F, -0.5F, 2, 3, 1, -0.02F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.0474F, 4.0395F, -1.9157F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7502F, 0.3187F, -0.1359F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 73, 87, -0.5059F, -1.5647F, -1.0475F, 1, 5, 2, 0.008F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 80, 87, 0.4941F, -1.5647F, 0.9525F, 0, 5, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1059F, 3.2353F, 0.6525F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2647F, 0.0116F, 0.0079F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 93, 25, -0.45F, -0.25F, -0.8F, 1, 4, 1, 0.0F, false));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 21, 39, 0.55F, -2.25F, 0.2F, 0, 6, 3, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.5F, 3.7F, -0.2F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.4868F, -0.0692F, 0.0532F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 47, 92, -1.0F, -0.25F, -0.5F, 1, 2, 2, -0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 64, 88, -1.0F, 1.7F, -0.5F, 1, 2, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.25F, 0.5F);
        this.leftHand.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0349F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 83, 0.0F, -2.5F, -0.2F, 0, 5, 3, -0.01F, false));

        this.leftFinger = new AdvancedModelRenderer(this);
        this.leftFinger.setRotationPoint(0.0F, 0.4717F, -0.0024F);
        this.leftHand.addChild(leftFinger);
        this.setRotateAngle(leftFinger, -0.2618F, 0.0F, 0.0F);
        this.leftFinger.cubeList.add(new ModelBox(leftFinger, 33, 90, -2.0F, 0.0F, -0.5F, 2, 3, 1, -0.02F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.8F, -3.7F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.1571F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.2F, -1.9F);
        this.neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0087F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 46, -2.0F, -1.9F, 0.3F, 3, 2, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -0.2F, -1.9F);
        this.neck1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6458F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 86, 80, -2.0F, 1.9F, 1.5F, 2, 1, 3, 0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 73, 40, -2.5F, 1.0F, 0.4F, 3, 1, 4, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.2F, -1.9F);
        this.neck1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 60, 74, -2.0F, -2.0F, 0.0F, 3, 4, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.6F, -1.4F);
        this.neck1.addChild(neck2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.6F, -0.6F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.829F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 81, -1.5F, 2.0F, -2.4F, 1, 1, 5, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 65, -2.0F, 0.1F, -4.0F, 2, 2, 6, -0.004F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 46, -2.0F, -0.6F, -4.0F, 2, 2, 6, 0.004F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.6F, -0.6F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7069F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 73, 33, -1.5F, -1.1F, -4.0F, 2, 1, 5, 0.005F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.2F, -3.8F);
        this.neck2.addChild(neck3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.2F, -2.8F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.384F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 59, -1.0F, 0.5917F, 0.0227F, 2, 2, 4, -0.06F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 78, -1.0F, -0.1083F, 0.0227F, 2, 2, 4, -0.03F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.1966F, 0.7704F);
        this.neck3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5411F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 88, 42, -1.0F, -0.2F, -1.2F, 2, 1, 2, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.2F, -2.8F);
        this.neck3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2967F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 88, 38, -1.0F, -0.3083F, 0.8227F, 2, 1, 2, 0.015F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck3.addChild(head);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0044F, -0.3063F, -4.1717F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1396F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 95, -0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.198F, -3.6661F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1571F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 90, -0.9F, 0.0119F, -1.2624F, 0, 1, 3, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 88, 73, -0.1F, 0.0119F, -1.2624F, 0, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 93, 89, -1.1F, -0.7F, -2.1F, 1, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 93, -0.1F, -0.7F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.1F, -0.9064F, -0.6608F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0175F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 88, 16, -1.1F, -0.4F, -0.7F, 2, 1, 2, 0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.1F, -1.298F, -1.1661F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2269F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 95, -1.1F, 0.0F, -1.2F, 1, 1, 1, 0.007F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 96, -1.12F, 0.3F, -1.1F, 1, 1, 1, 0.007F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 95, 75, -0.08F, 0.3F, -1.1F, 1, 1, 1, 0.007F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 95, 72, -0.1F, 0.0F, -1.2F, 1, 1, 1, 0.007F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.1F, -1.1106F, -2.1465F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3167F, 0.1245F, 0.0407F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 95, 0.09F, 0.0301F, -2.0676F, 1, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1F, -1.1106F, -2.1465F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3167F, -0.1245F, -0.0407F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 93, 93, -1.09F, 0.0301F, -2.0676F, 1, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0181F, -0.4597F, -4.0281F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.314F, -0.0113F, 0.0159F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 88, 33, -0.5F, -0.0403F, -0.1719F, 1, 1, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -0.198F, -5.266F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1582F, -0.1207F, -0.0192F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 94, -1.0993F, 0.0622F, 1.23F, 1, 1, 2, -0.002F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, -0.198F, -5.266F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1582F, 0.1207F, 0.0192F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 93, 64, 0.0993F, 0.0622F, 1.23F, 1, 1, 2, -0.002F, false));

        this.crest1 = new AdvancedModelRenderer(this);
        this.crest1.setRotationPoint(0.0819F, -1.327F, -1.2935F);
        this.head.addChild(crest1);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.4F, 0.8F);
        this.crest1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2443F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 95, -0.6F, -0.6F, -0.7F, 1, 1, 2, 0.02F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.0819F, -0.2979F, 0.3442F);
        this.crest1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5934F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 61, 35, -0.5F, 0.7F, 1.3F, 1, 0, 1, 0.0F, false));

        this.crest2 = new AdvancedModelRenderer(this);
        this.crest2.setRotationPoint(-0.0819F, -0.2979F, 0.3442F);
        this.crest1.addChild(crest2);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.2F, 0.1204F, 0.1597F);
        this.crest2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.925F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 88, 78, -0.7F, 0.0F, -0.4F, 1, 0, 1, 0.0F, false));

        this.crest3 = new AdvancedModelRenderer(this);
        this.crest3.setRotationPoint(-0.0819F, -0.2469F, 0.7617F);
        this.crest1.addChild(crest3);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.5206F, 0.7913F);
        this.crest3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.0996F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 35, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.0446F, -0.8219F);
        this.crest3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6109F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 35, 0.0F, 0.5353F, 0.5945F, 1, 0, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.2F, 0.3F, -0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0262F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 93, 68, 0.19F, -0.0773F, -1.8539F, 1, 1, 2, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 95, -0.8F, -1.0773F, -1.0539F, 2, 1, 1, -0.004F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 85, 94, -0.79F, -0.0773F, -1.8539F, 1, 1, 2, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 86, 52, -0.3F, -0.04F, -4.8324F, 1, 1, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.1F, 0.4227F, -1.7539F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.1396F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 93, 85, -0.901F, -0.5F, -2.0861F, 1, 1, 2, -0.001F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 90, 0, -0.201F, -0.7F, -3.0861F, 0, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.7F, 0.4227F, -1.7539F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.1396F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 19, 90, 0.201F, -0.7F, -3.0861F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.7039F, 0.4227F, -1.7549F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1396F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 95, -0.099F, -0.5F, -2.0861F, 1, 1, 2, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.1F, 0.4227F, -1.7539F);
        this.jaw.addChild(bone);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.2F, 2.9F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1047F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 24, -1.5F, -1.6F, -1.1F, 3, 5, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 74, -1.0F, 3.4F, -1.1F, 2, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 73, 20, -1.5F, -1.9F, -0.1F, 3, 1, 5, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0175F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 50, -1.0F, -1.6F, 0.0F, 2, 3, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 71, 12, -1.0F, 1.4F, 0.0F, 2, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 82, -1.0F, -2.0F, 0.0F, 2, 1, 4, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1047F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 54, -0.5F, -1.6F, -0.1F, 1, 2, 8, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0349F, 0.0F, -0.3927F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 37, -2.0F, -0.9F, -0.1F, 2, 0, 8, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0349F, 0.0F, 0.3927F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 46, 50, 0.0F, -0.9F, -0.1F, 2, 0, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 7.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1222F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 39, -0.5F, -0.3F, -0.1F, 1, 1, 9, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.0193F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.192F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 13, 0.0F, -0.1F, -0.1F, 3, 0, 12, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.9447F, 0.4743F, 7.4F);
        this.tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.8203F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 31, 0, 0.0F, 0.0F, -5.5F, 3, 0, 12, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.9447F, 0.4743F, 7.4F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.8203F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 26, -3.0F, 0.0F, -5.5F, 3, 0, 12, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0193F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.192F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 0, -3.0F, -0.1F, -0.1F, 3, 0, 12, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.5F, 0.4181F, 11.7743F);
        this.tail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.8203F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 50, -5.5F, 0.0F, 0.1F, 10, 0, 3, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, -0.1F, 8.8F);
        this.tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.192F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 67, 55, -3.5F, 0.0F, 0.1F, 6, 0, 3, 0.0F, false));

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
        this.neck1.offsetX = -0.F;
        this.neck1.offsetZ = -0.045F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.hips.offsetY = 0.165F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.4F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(2);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 1F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        setRotateAngle(hips, 0.0F, 4.0F, 0F);
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

        EntityPrehistoricFloraNqwebsaurus entityNqwebsaurus = (EntityPrehistoricFloraNqwebsaurus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityNqwebsaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityNqwebsaurus.getAnimation() == entityNqwebsaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityNqwebsaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityNqwebsaurus.getIsMoving()) {
                    if (entityNqwebsaurus.getAnimation() != entityNqwebsaurus.EAT_ANIMATION
                            && entityNqwebsaurus.getAnimation() != entityNqwebsaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityNqwebsaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraNqwebsaurus ee = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -19.25 + (((tickAnim - 3) / 3) * (24-(-19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 6) / 4) * (0-(24)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 3) * (0-(-0.5)));
            zz = 0.575 + (((tickAnim - 3) / 3) * (0-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.25 + (((tickAnim - 3) / 3) * (18-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 18 + (((tickAnim - 6) / 4) * (0-(18)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 3) / 3) * (0-(-0.575)));
            zz = -0.025 + (((tickAnim - 3) / 3) * (0-(-0.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.25 + (((tickAnim - 3) / 3) * (-20.75-(19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 6) / 2) * (-0.95-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.95 + (((tickAnim - 8) / 2) * (0-(-0.95)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 3) * (0.15-(-0.3)));
            zz = -0.1 + (((tickAnim - 3) / 3) * (0.3-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (-0.16-(0.15)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.18-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 8) / 2) * (0-(-0.16)));
            zz = 0.18 + (((tickAnim - 8) / 2) * (0-(0.18)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 18 + (((tickAnim - 3) / 3) * (-21.25-(18)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -21.25 + (((tickAnim - 6) / 4) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(xx), crest1.rotateAngleY + (float) Math.toRadians(yy), crest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest2, crest2.rotateAngleX + (float) Math.toRadians(xx), crest2.rotateAngleY + (float) Math.toRadians(yy), crest2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest3, crest3.rotateAngleX + (float) Math.toRadians(xx), crest3.rotateAngleY + (float) Math.toRadians(yy), crest3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (51.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 51.25 + (((tickAnim - 6) / 2) * (0-(51.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = -36 + (((tickAnim - 20) / 65) * (-36-(-36)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -36 + (((tickAnim - 85) / 10) * (-36-(-36)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -36 + (((tickAnim - 95) / 20) * (0-(-36)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.05-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            yy = -2.05 + (((tickAnim - 20) / 65) * (-2.05-(-2.05)));
            zz = 2.15 + (((tickAnim - 20) / 65) * (2.15-(2.15)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = -2.05 + (((tickAnim - 85) / 10) * (-2.05-(-2.05)));
            zz = 2.15 + (((tickAnim - 85) / 10) * (2.15-(2.15)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = -2.05 + (((tickAnim - 95) / 20) * (0-(-2.05)));
            zz = 2.15 + (((tickAnim - 95) / 20) * (0-(2.15)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 8.25 + (((tickAnim - 20) / 65) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 8.25 + (((tickAnim - 85) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 8.25 + (((tickAnim - 95) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 28 + (((tickAnim - 20) / 65) * (28-(28)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 28 + (((tickAnim - 85) / 10) * (28-(28)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 28 + (((tickAnim - 95) / 20) * (0-(28)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 8.25 + (((tickAnim - 20) / 65) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 8.25 + (((tickAnim - 85) / 10) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 8.25 + (((tickAnim - 95) / 20) * (0-(8.25)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 28 + (((tickAnim - 20) / 65) * (28-(28)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 28 + (((tickAnim - 85) / 10) * (28-(28)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 28 + (((tickAnim - 95) / 20) * (0-(28)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 2 + (((tickAnim - 20) / 65) * (2-(2)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 2 + (((tickAnim - 85) / 10) * (2-(2)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 2 + (((tickAnim - 95) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 10) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 31.25 + (((tickAnim - 20) / 65) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 31.25 + (((tickAnim - 85) / 10) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 31.25 + (((tickAnim - 95) / 10) * (0-(31.25)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 31.25 + (((tickAnim - 20) / 65) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 31.25 + (((tickAnim - 85) / 10) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 31.25 + (((tickAnim - 95) / 10) * (0-(31.25)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-84.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+65))*90-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -84.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+65))*90 + (((tickAnim - 10) / 10) * (6.25-(-84.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+65))*90)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 6.25 + (((tickAnim - 20) / 20) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 40) / 5) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 6.25 + (((tickAnim - 45) / 9) * (8.25169-(6.25)));
            yy = 0 + (((tickAnim - 45) / 9) * (-4.5867-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (-2.18192-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 8.25169 + (((tickAnim - 54) / 10) * (6.75337-(8.25169)));
            yy = -4.5867 + (((tickAnim - 54) / 10) * (-9.1734-(-4.5867)));
            zz = -2.18192 + (((tickAnim - 54) / 10) * (-4.36385-(-2.18192)));
        }
        else if (tickAnim >= 64 && tickAnim < 85) {
            xx = 6.75337 + (((tickAnim - 64) / 21) * (6.75337-(6.75337)));
            yy = -9.1734 + (((tickAnim - 64) / 21) * (-9.1734-(-9.1734)));
            zz = -4.36385 + (((tickAnim - 64) / 21) * (-4.36385-(-4.36385)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 6.75337 + (((tickAnim - 85) / 10) * (6.75337-(6.75337)));
            yy = -9.1734 + (((tickAnim - 85) / 10) * (-9.1734-(-9.1734)));
            zz = -4.36385 + (((tickAnim - 85) / 10) * (-4.36385-(-4.36385)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = 6.75337 + (((tickAnim - 95) / 11) * (32.5953-(6.75337)));
            yy = -9.1734 + (((tickAnim - 95) / 11) * (-4.20447-(-9.1734)));
            zz = -4.36385 + (((tickAnim - 95) / 11) * (-2.0001-(-4.36385)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 32.5953 + (((tickAnim - 106) / 9) * (0-(32.5953)));
            yy = -4.20447 + (((tickAnim - 106) / 9) * (0-(-4.20447)));
            zz = -2.0001 + (((tickAnim - 106) / 9) * (0-(-2.0001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.675 + (((tickAnim - 10) / 10) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 54) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 10) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 64) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 21) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 95) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 11) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 95) / 11) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 106) / 9) * (0-(0)));
            yy = -0.725 + (((tickAnim - 106) / 9) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 106) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (149.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-190-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 149.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-190 + (((tickAnim - 10) / 10) * (-19.75-(149.28+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-190)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.75 + (((tickAnim - 20) / 5) * (-17.5-(-19.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -17.5 + (((tickAnim - 25) / 5) * (-19.75-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -19.75 + (((tickAnim - 30) / 5) * (-17.5-(-19.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -17.5 + (((tickAnim - 35) / 5) * (-19.75-(-17.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -19.75 + (((tickAnim - 40) / 5) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -19.75 + (((tickAnim - 45) / 9) * (-25.11009-(-19.75)));
            yy = 0 + (((tickAnim - 45) / 9) * (-2.86173-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (-2.42758-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = -25.11009 + (((tickAnim - 54) / 10) * (-18.47017-(-25.11009)));
            yy = -2.86173 + (((tickAnim - 54) / 10) * (-5.72346-(-2.86173)));
            zz = -2.42758 + (((tickAnim - 54) / 10) * (-4.85516-(-2.42758)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -18.47017 + (((tickAnim - 64) / 6) * (-18.97017-(-18.47017)));
            yy = -5.72346 + (((tickAnim - 64) / 6) * (-5.72346-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 64) / 6) * (-4.85516-(-4.85516)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -18.97017 + (((tickAnim - 70) / 5) * (-18.47017-(-18.97017)));
            yy = -5.72346 + (((tickAnim - 70) / 5) * (-5.72346-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 70) / 5) * (-4.85516-(-4.85516)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -18.47017 + (((tickAnim - 75) / 5) * (-18.97017-(-18.47017)));
            yy = -5.72346 + (((tickAnim - 75) / 5) * (-5.72346-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 75) / 5) * (-4.85516-(-4.85516)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -18.97017 + (((tickAnim - 80) / 5) * (-18.47017-(-18.97017)));
            yy = -5.72346 + (((tickAnim - 80) / 5) * (-5.72346-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 80) / 5) * (-4.85516-(-4.85516)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -18.47017 + (((tickAnim - 85) / 10) * (-18.47017-(-18.47017)));
            yy = -5.72346 + (((tickAnim - 85) / 10) * (-5.72346-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 85) / 10) * (-4.85516-(-4.85516)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = -18.47017 + (((tickAnim - 95) / 11) * (-28.21549-(-18.47017)));
            yy = -5.72346 + (((tickAnim - 95) / 11) * (-2.62325-(-5.72346)));
            zz = -4.85516 + (((tickAnim - 95) / 11) * (-2.22528-(-4.85516)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -28.21549 + (((tickAnim - 106) / 9) * (0-(-28.21549)));
            yy = -2.62325 + (((tickAnim - 106) / 9) * (0-(-2.62325)));
            zz = -2.22528 + (((tickAnim - 106) / 9) * (0-(-2.22528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.795-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.965-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -1.795 + (((tickAnim - 10) / 10) * (-0.75-(-1.795)));
            zz = 0.965 + (((tickAnim - 10) / 10) * (0.575-(0.965)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 20) / 10) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 20) / 10) * (0.575-(0.575)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 30) / 10) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 30) / 10) * (0.575-(0.575)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 40) / 5) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 40) / 5) * (0.575-(0.575)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (-0.06-(0)));
            yy = -0.75 + (((tickAnim - 45) / 9) * (-0.825-(-0.75)));
            zz = 0.575 + (((tickAnim - 45) / 9) * (0.695-(0.575)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = -0.06 + (((tickAnim - 54) / 10) * (-0.125-(-0.06)));
            yy = -0.825 + (((tickAnim - 54) / 10) * (-0.75-(-0.825)));
            zz = 0.695 + (((tickAnim - 54) / 10) * (0.575-(0.695)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = -0.125 + (((tickAnim - 64) / 11) * (-0.125-(-0.125)));
            yy = -0.75 + (((tickAnim - 64) / 11) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 64) / 11) * (0.575-(0.575)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = -0.125 + (((tickAnim - 75) / 10) * (-0.125-(-0.125)));
            yy = -0.75 + (((tickAnim - 75) / 10) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 75) / 10) * (0.575-(0.575)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -0.125 + (((tickAnim - 85) / 10) * (-0.125-(-0.125)));
            yy = -0.75 + (((tickAnim - 85) / 10) * (-0.75-(-0.75)));
            zz = 0.575 + (((tickAnim - 85) / 10) * (0.575-(0.575)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = -0.125 + (((tickAnim - 95) / 11) * (-0.06-(-0.125)));
            yy = -0.75 + (((tickAnim - 95) / 11) * (-1.49-(-0.75)));
            zz = 0.575 + (((tickAnim - 95) / 11) * (0.735-(0.575)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -0.06 + (((tickAnim - 106) / 9) * (0-(-0.06)));
            yy = -1.49 + (((tickAnim - 106) / 9) * (0-(-1.49)));
            zz = 0.735 + (((tickAnim - 106) / 9) * (0-(0.735)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.25 + (((tickAnim - 10) / 10) * (11-(32.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 11 + (((tickAnim - 20) / 20) * (11-(11)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 11 + (((tickAnim - 40) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 11 + (((tickAnim - 45) / 9) * (17.80298-(11)));
            yy = 0 + (((tickAnim - 45) / 9) * (-1.55084-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0.19039-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 17.80298 + (((tickAnim - 54) / 10) * (10.10596-(17.80298)));
            yy = -1.55084 + (((tickAnim - 54) / 10) * (-3.10167-(-1.55084)));
            zz = 0.19039 + (((tickAnim - 54) / 10) * (0.38078-(0.19039)));
        }
        else if (tickAnim >= 64 && tickAnim < 85) {
            xx = 10.10596 + (((tickAnim - 64) / 21) * (10.10596-(10.10596)));
            yy = -3.10167 + (((tickAnim - 64) / 21) * (-3.10167-(-3.10167)));
            zz = 0.38078 + (((tickAnim - 64) / 21) * (0.38078-(0.38078)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 10.10596 + (((tickAnim - 85) / 10) * (10.10596-(10.10596)));
            yy = -3.10167 + (((tickAnim - 85) / 10) * (-3.10167-(-3.10167)));
            zz = 0.38078 + (((tickAnim - 85) / 10) * (0.38078-(0.38078)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = 10.10596 + (((tickAnim - 95) / 11) * (28.6319-(10.10596)));
            yy = -3.10167 + (((tickAnim - 95) / 11) * (-1.4216-(-3.10167)));
            zz = 0.38078 + (((tickAnim - 95) / 11) * (0.17452-(0.38078)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 28.6319 + (((tickAnim - 106) / 9) * (0-(28.6319)));
            yy = -1.4216 + (((tickAnim - 106) / 9) * (0-(-1.4216)));
            zz = 0.17452 + (((tickAnim - 106) / 9) * (0-(0.17452)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.485-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.485 + (((tickAnim - 10) / 10) * (-0.125-(-0.485)));
            zz = -0.05 + (((tickAnim - 10) / 10) * (-0.1-(-0.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.125 + (((tickAnim - 20) / 20) * (-0.125-(-0.125)));
            zz = -0.1 + (((tickAnim - 20) / 20) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 40) / 5) * (-0.125-(-0.125)));
            zz = -0.1 + (((tickAnim - 40) / 5) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = -0.125 + (((tickAnim - 45) / 9) * (-0.295-(-0.125)));
            zz = -0.1 + (((tickAnim - 45) / 9) * (-0.075-(-0.1)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 54) / 10) * (0-(0)));
            yy = -0.295 + (((tickAnim - 54) / 10) * (-0.125-(-0.295)));
            zz = -0.075 + (((tickAnim - 54) / 10) * (-0.1-(-0.075)));
        }
        else if (tickAnim >= 64 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 64) / 21) * (0-(0)));
            yy = -0.125 + (((tickAnim - 64) / 21) * (-0.125-(-0.125)));
            zz = -0.1 + (((tickAnim - 64) / 21) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 85) / 10) * (-0.125-(-0.125)));
            zz = -0.1 + (((tickAnim - 85) / 10) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 95 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 95) / 11) * (0-(0)));
            yy = -0.125 + (((tickAnim - 95) / 11) * (-0.46-(-0.125)));
            zz = -0.1 + (((tickAnim - 95) / 11) * (-0.05-(-0.1)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 106) / 9) * (0-(0)));
            yy = -0.46 + (((tickAnim - 106) / 9) * (0-(-0.46)));
            zz = -0.05 + (((tickAnim - 106) / 9) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 35.25 + (((tickAnim - 20) / 5) * (1031.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-152))*1000-(35.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1031.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-152))*1000 + (((tickAnim - 25) / 5) * (35.25-(1031.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-152))*1000)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 35.25 + (((tickAnim - 30) / 5) * (1031.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+2))*-1000-(35.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1031.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+2))*-1000 + (((tickAnim - 35) / 5) * (35.25-(1031.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+2))*-1000)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 35.25 + (((tickAnim - 40) / 5) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 35.25 + (((tickAnim - 45) / 9) * (29.80517-(35.25)));
            yy = 0 + (((tickAnim - 45) / 9) * (-7.82533-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (-4.4596-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 29.80517 + (((tickAnim - 54) / 10) * (35.25-(29.80517)));
            yy = -7.82533 + (((tickAnim - 54) / 10) * (0-(-7.82533)));
            zz = -4.4596 + (((tickAnim - 54) / 10) * (0-(-4.4596)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 35.25 + (((tickAnim - 64) / 6) * (31.75-(35.25)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 31.75 + (((tickAnim - 70) / 5) * (35.25-(31.75)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 35.25 + (((tickAnim - 75) / 5) * (31.75-(35.25)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 31.75 + (((tickAnim - 80) / 5) * (35.25-(31.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 35.25 + (((tickAnim - 85) / 10) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 35.25 + (((tickAnim - 95) / 5) * (34.36-(35.25)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 106) {
            xx = 34.36 + (((tickAnim - 100) / 6) * (-4.59-(34.36)));
            yy = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 6) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -4.59 + (((tickAnim - 106) / 9) * (0-(-4.59)));
            yy = 0 + (((tickAnim - 106) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 95) {
            xx = -0.1 + (((tickAnim - 54) / 41) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 54) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 41) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -0.1 + (((tickAnim - 95) / 20) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = -18 + (((tickAnim - 20) / 65) * (-18-(-18)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = -18 + (((tickAnim - 85) / 10) * (-18-(-18)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -18 + (((tickAnim - 95) / 10) * (0-(-18)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(xx), crest1.rotateAngleY + (float) Math.toRadians(yy), crest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest2, crest2.rotateAngleX + (float) Math.toRadians(xx), crest2.rotateAngleY + (float) Math.toRadians(yy), crest2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest3, crest3.rotateAngleX + (float) Math.toRadians(xx), crest3.rotateAngleY + (float) Math.toRadians(yy), crest3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (6-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 64) {
            xx = 6 + (((tickAnim - 54) / 10) * (0-(6)));
            yy = 0 + (((tickAnim - 54) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 9.5 + (((tickAnim - 20) / 65) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 9.5 + (((tickAnim - 85) / 10) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 9.5 + (((tickAnim - 95) / 20) * (0-(9.5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 11.5 + (((tickAnim - 20) / 65) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 11.5 + (((tickAnim - 85) / 10) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 11.5 + (((tickAnim - 95) / 20) * (0-(11.5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = -0.45 + (((tickAnim - 20) / 65) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = -0.45 + (((tickAnim - 85) / 10) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = -0.45 + (((tickAnim - 95) / 20) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 13.75 + (((tickAnim - 20) / 65) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 65) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 13.75 + (((tickAnim - 85) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 13.75 + (((tickAnim - 95) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 65) * (0-(0)));
            zz = -0.15 + (((tickAnim - 20) / 65) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = -0.15 + (((tickAnim - 85) / 10) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = -0.15 + (((tickAnim - 95) / 20) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 39 + (((tickAnim - 20) / 16) * (-6.13-(39)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -6.13 + (((tickAnim - 36) / 4) * (0-(-6.13)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 25) / 15) * (0-(22.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
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
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-39.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -39.75 + (((tickAnim - 30) / 6) * (-39.75-(-39.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -39.75 + (((tickAnim - 36) / 4) * (0-(-39.75)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 60 + (((tickAnim - 20) / 10) * (66.75-(60)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 66.75 + (((tickAnim - 30) / 6) * (66.75-(66.75)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 66.75 + (((tickAnim - 36) / 4) * (0-(66.75)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.275-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 10) * (0.975-(-0.2)));
            zz = 0.275 + (((tickAnim - 20) / 10) * (0.29-(0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 30) / 6) * (0.975-(0.975)));
            zz = 0.29 + (((tickAnim - 30) / 6) * (0.29-(0.29)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 36) / 4) * (0-(0.975)));
            zz = 0.29 + (((tickAnim - 36) / 4) * (0-(0.29)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (-52.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -52.25 + (((tickAnim - 11) / 9) * (0-(-52.25)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (37.5-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 37.5 + (((tickAnim - 30) / 6) * (37.5-(37.5)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 37.5 + (((tickAnim - 36) / 4) * (0-(37.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.15-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 11) / 9) * (0-(-0.375)));
            zz = 0.15 + (((tickAnim - 11) / 9) * (0-(0.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.125-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.3-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0.125 + (((tickAnim - 30) / 6) * (0.125-(0.125)));
            zz = 0.3 + (((tickAnim - 30) / 6) * (0.3-(0.3)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 36) / 4) * (0-(0.125)));
            zz = 0.3 + (((tickAnim - 36) / 4) * (0-(0.3)));
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
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -16.25 + (((tickAnim - 18) / 5) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -16.25 + (((tickAnim - 23) / 9) * (7.01-(-16.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 7.01 + (((tickAnim - 32) / 8) * (0-(7.01)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.4-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -8.2 + (((tickAnim - 18) / 5) * (-8.2-(-8.2)));
            zz = 4.4 + (((tickAnim - 18) / 5) * (4.4-(4.4)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -8.2 + (((tickAnim - 23) / 9) * (-3.25-(-8.2)));
            zz = 4.4 + (((tickAnim - 23) / 9) * (0.625-(4.4)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -3.25 + (((tickAnim - 32) / 8) * (0-(-3.25)));
            zz = 0.625 + (((tickAnim - 32) / 8) * (0-(0.625)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -43.75 + (((tickAnim - 18) / 5) * (-43.75-(-43.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -43.75 + (((tickAnim - 23) / 17) * (0-(-43.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 59 + (((tickAnim - 18) / 5) * (59-(59)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 59 + (((tickAnim - 23) / 17) * (0-(59)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -61.25 + (((tickAnim - 18) / 5) * (-61.25-(-61.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -61.25 + (((tickAnim - 23) / 17) * (0-(-61.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 64.75 + (((tickAnim - 18) / 5) * (64.75-(64.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 64.75 + (((tickAnim - 23) / 9) * (15.83-(64.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 15.83 + (((tickAnim - 32) / 8) * (0-(15.83)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0.35 + (((tickAnim - 18) / 5) * (0.35-(0.35)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0.35 + (((tickAnim - 23) / 17) * (0-(0.35)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -43.75 + (((tickAnim - 18) / 5) * (-43.75-(-43.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -43.75 + (((tickAnim - 23) / 17) * (0-(-43.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 59 + (((tickAnim - 18) / 5) * (59-(59)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 59 + (((tickAnim - 23) / 17) * (0-(59)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -61.25 + (((tickAnim - 18) / 5) * (-61.25-(-61.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -61.25 + (((tickAnim - 23) / 17) * (0-(-61.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 64.75 + (((tickAnim - 18) / 5) * (64.75-(64.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 64.75 + (((tickAnim - 23) / 9) * (15.83-(64.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 15.83 + (((tickAnim - 32) / 8) * (0-(15.83)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.35-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0.35 + (((tickAnim - 18) / 5) * (0.35-(0.35)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0.35 + (((tickAnim - 23) / 17) * (0-(0.35)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (13.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.25 + (((tickAnim - 18) / 5) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 13.25 + (((tickAnim - 18) / 5) * (13.25-(13.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 23) / 17) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 13.25 + (((tickAnim - 23) / 17) * (0-(13.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14 + (((tickAnim - 18) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -14 + (((tickAnim - 23) / 9) * (-22.42-(-14)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -22.42 + (((tickAnim - 32) / 8) * (0-(-22.42)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-13.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -13.25 + (((tickAnim - 18) / 5) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = -13.25 + (((tickAnim - 18) / 5) * (-13.25-(-13.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -13.25 + (((tickAnim - 23) / 17) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = -13.25 + (((tickAnim - 23) / 17) * (0-(-13.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14 + (((tickAnim - 18) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -14 + (((tickAnim - 23) / 9) * (-22.42-(-14)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -22.42 + (((tickAnim - 32) / 8) * (0-(-22.42)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 20.25 + (((tickAnim - 18) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 20.25 + (((tickAnim - 23) / 9) * (-5.61-(20.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -5.61 + (((tickAnim - 32) / 8) * (0-(-5.61)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 18) / 5) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 23) / 17) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.5 + (((tickAnim - 8) / 10) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 8) / 10) * (3.75-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 18) / 5) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 3.75 + (((tickAnim - 23) / 9) * (-11.46-(3.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -11.46 + (((tickAnim - 32) / 8) * (0-(-11.46)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 26 + (((tickAnim - 18) / 5) * (26-(26)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 26 + (((tickAnim - 23) / 9) * (-7.87-(26)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -7.87 + (((tickAnim - 32) / 8) * (0-(-7.87)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 20) * (-14-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14 + (((tickAnim - 20) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -14 + (((tickAnim - 25) / 3) * (-14-(-14)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -14 + (((tickAnim - 28) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -14 + (((tickAnim - 33) / 7) * (88.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-90-(-14)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.55-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0.55 + (((tickAnim - 20) / 5) * (0.55-(0.55)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0.55 + (((tickAnim - 25) / 3) * (0.55-(0.55)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0.55 + (((tickAnim - 28) / 5) * (0.55-(0.55)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0.55 + (((tickAnim - 33) / 7) * (0-(0.55)));
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
         //HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII   xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-=20 + (((tickAnim - 0) / 8) * (30.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-=20)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 30.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70 + (((tickAnim - 8) / 12) * (-21.25-(30.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-70)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -21.25 + (((tickAnim - 20) / 5) * (-7.25-(-21.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -7.25 + (((tickAnim - 25) / 3) * (-21.25-(-7.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -21.25 + (((tickAnim - 28) / 5) * (-7.25-(-21.25)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -7.25 + (((tickAnim - 33) / 7) * (147.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-7.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -1.1 + (((tickAnim - 20) / 8) * (-1.1-(-1.1)));
            zz = 0.425 + (((tickAnim - 20) / 8) * (0.425-(0.425)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -1.1 + (((tickAnim - 28) / 12) * (0-(-1.1)));
            zz = 0.425 + (((tickAnim - 28) / 12) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-34.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -34.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90 + (((tickAnim - 8) / 12) * (29.75-(-34.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*90)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 29.75 + (((tickAnim - 20) / 5) * (-0.75-(29.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -0.75 + (((tickAnim - 25) / 3) * (29.75-(-0.75)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 29.75 + (((tickAnim - 28) / 5) * (-0.75-(29.75)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.75 + (((tickAnim - 33) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 5) * (0-(-0.525)));
            zz = 0.025 + (((tickAnim - 20) / 5) * (0-(0.025)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0.025-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.525 + (((tickAnim - 28) / 5) * (0-(-0.525)));
            zz = 0.025 + (((tickAnim - 28) / 5) * (0-(0.025)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-18-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -18 + (((tickAnim - 23) / 2) * (0-(-18)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (-18-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -18 + (((tickAnim - 30) / 3) * (0-(-18)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (-10-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 30) / 3) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(xx), crest1.rotateAngleY + (float) Math.toRadians(yy), crest1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.crest1.rotationPointX = this.crest1.rotationPointX + (float)(xx);
        this.crest1.rotationPointY = this.crest1.rotationPointY - (float)(yy);
        this.crest1.rotationPointZ = this.crest1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 49 + (((tickAnim - 10) / 10) * (0-(49)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (43.5-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 43.5 + (((tickAnim - 23) / 2) * (0-(43.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (43.5-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 43.5 + (((tickAnim - 30) / 3) * (0-(43.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 10) / 10) * (0-(11.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.75 + (((tickAnim - 10) / 10) * (0-(23.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31 + (((tickAnim - 10) / 10) * (0-(31)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.88 + (((tickAnim - 5) / 5) * (14.75-(20.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 10) / 10) * (0-(14.75)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 5) / 5) * (-0.3-(-0.45)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.25 + (((tickAnim - 5) / 5) * (-23-(13.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -23 + (((tickAnim - 10) / 3) * (0-(-23)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (28.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 10) / 3) * (0-(28.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 49.25 + (((tickAnim - 0) / 3) * (23.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(49.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 3) / 2) * (-26.48546-(23.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 3) / 2) * (1.95948-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-5.71931-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.48546 + (((tickAnim - 5) / 5) * (49.25-(-26.48546)));
            yy = 1.95948 + (((tickAnim - 5) / 5) * (0-(1.95948)));
            zz = -5.71931 + (((tickAnim - 5) / 5) * (0-(-5.71931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.5 + (((tickAnim - 0) / 2) * (44.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-220-(18.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 44.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-220 + (((tickAnim - 2) / 3) * (3.25-(44.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-220)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.25 + (((tickAnim - 5) / 5) * (18.5-(3.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -45 + (((tickAnim - 2) / 1) * (-45.5-(-45)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -45.5 + (((tickAnim - 3) / 2) * (22.5-(-45.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 5) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 5) / 5) * (0-(-0.25)));
            zz = -0.275 + (((tickAnim - 5) / 5) * (0-(-0.275)));
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
            xx = 38.75 + (((tickAnim - 0) / 2) * (68-(38.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 68 + (((tickAnim - 2) / 1) * (67-(68)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 67 + (((tickAnim - 3) / 2) * (16.25432-(67)));
            yy = 0 + (((tickAnim - 3) / 2) * (-6.07919-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (3.61991-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 16.25432 + (((tickAnim - 5) / 1) * (-7.14988-(16.25432)));
            yy = -6.07919 + (((tickAnim - 5) / 1) * (-4.49483-(-6.07919)));
            zz = 3.61991 + (((tickAnim - 5) / 1) * (4.79476-(3.61991)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -7.14988 + (((tickAnim - 6) / 1) * (-24.06612-(-7.14988)));
            yy = -4.49483 + (((tickAnim - 6) / 1) * (-0.54638-(-4.49483)));
            zz = 4.79476 + (((tickAnim - 6) / 1) * (5.47288-(4.79476)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -24.06612 + (((tickAnim - 7) / 1) * (23.85549-(-24.06612)));
            yy = -0.54638 + (((tickAnim - 7) / 1) * (-0.31221-(-0.54638)));
            zz = 5.47288 + (((tickAnim - 7) / 1) * (3.12732-(5.47288)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.85549 + (((tickAnim - 8) / 2) * (38.75-(23.85549)));
            yy = -0.31221 + (((tickAnim - 8) / 2) * (0-(-0.31221)));
            zz = 3.12732 + (((tickAnim - 8) / 2) * (0-(3.12732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.93-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.325-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.93 + (((tickAnim - 2) / 1) * (0.93-(0.93)));
            zz = 0.325 + (((tickAnim - 2) / 1) * (0.325-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 3) / 2) * (-0.4-(0.93)));
            zz = 0.325 + (((tickAnim - 3) / 2) * (0-(0.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 5) / 1) * (1.065-(-0.4)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.065 + (((tickAnim - 6) / 1) * (0.3-(1.065)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 7) / 3) * (0-(0.3)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
            xx = 32.25 + (((tickAnim - 0) / 3) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 32.25 + (((tickAnim - 3) / 2) * (0-(32.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (32.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 3) * (0.1-(0.1)));
            zz = 0.275 + (((tickAnim - 0) / 3) * (0.275-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 3) / 2) * (0-(0.1)));
            zz = 0.275 + (((tickAnim - 3) / 2) * (0-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.48546 + (((tickAnim - 0) / 5) * (41.5-(-26.48546)));
            yy = -1.95948 + (((tickAnim - 0) / 5) * (0-(-1.95948)));
            zz = 5.71931 + (((tickAnim - 0) / 5) * (0-(5.71931)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 41.5 + (((tickAnim - 5) / 3) * (92.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(41.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 92.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 8) / 2) * (-26.48546-(92.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.95948-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (5.71931-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.25 + (((tickAnim - 0) / 5) * (26.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.5 + (((tickAnim - 5) / 3) * (90.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(26.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 90.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 8) / 2) * (3.25-(90.165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22.5 + (((tickAnim - 0) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (-45-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -45 + (((tickAnim - 7) / 1) * (-44-(-45)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -44 + (((tickAnim - 8) / 2) * (22.5-(-44)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            zz = -0.275 + (((tickAnim - 0) / 5) * (0-(-0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 16.25432 + (((tickAnim - 0) / 1) * (-7.14988-(16.25432)));
            yy = 6.07919 + (((tickAnim - 0) / 1) * (4.49483-(6.07919)));
            zz = -3.61991 + (((tickAnim - 0) / 1) * (-4.79476-(-3.61991)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -7.14988 + (((tickAnim - 1) / 1) * (-24.06612-(-7.14988)));
            yy = 4.49483 + (((tickAnim - 1) / 1) * (0.54638-(4.49483)));
            zz = -4.79476 + (((tickAnim - 1) / 1) * (-5.47288-(-4.79476)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.06612 + (((tickAnim - 2) / 1) * (23.85549-(-24.06612)));
            yy = 0.54638 + (((tickAnim - 2) / 1) * (0.31221-(0.54638)));
            zz = -5.47288 + (((tickAnim - 2) / 1) * (-3.12732-(-5.47288)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 23.85549 + (((tickAnim - 3) / 2) * (38.75-(23.85549)));
            yy = 0.31221 + (((tickAnim - 3) / 2) * (0-(0.31221)));
            zz = -3.12732 + (((tickAnim - 3) / 2) * (0-(-3.12732)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 38.75 + (((tickAnim - 5) / 2) * (68-(38.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 68 + (((tickAnim - 7) / 1) * (67-(68)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 67 + (((tickAnim - 8) / 2) * (18.75432-(67)));
            yy = 0 + (((tickAnim - 8) / 2) * (6.07919-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-3.61991-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 1) * (1.04-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.04 + (((tickAnim - 1) / 1) * (0.35-(1.04)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 3) * (0-(0.35)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.93-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.325-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.93 + (((tickAnim - 7) / 1) * (0.93-(0.93)));
            zz = 0.325 + (((tickAnim - 7) / 1) * (0.325-(0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 8) / 2) * (-0.4-(0.93)));
            zz = 0.325 + (((tickAnim - 8) / 2) * (0-(0.325)));
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
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (32.25-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.25 + (((tickAnim - 5) / 3) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.25 + (((tickAnim - 8) / 2) * (0-(32.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 3) * (0.1-(0.1)));
            zz = 0.275 + (((tickAnim - 5) / 3) * (0.275-(0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 2) * (0-(0.1)));
            zz = 0.275 + (((tickAnim - 8) / 2) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-70))*8), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*2);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+40))*8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-10), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-17), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-10), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-17), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(20.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*8), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-27+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*8), crest1.rotateAngleY + (float) Math.toRadians(0), crest1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest2, crest2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*8), crest2.rotateAngleY + (float) Math.toRadians(0), crest2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest3, crest3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*8), crest3.rotateAngleY + (float) Math.toRadians(0), crest3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*-4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+100))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*1.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1.5));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33 + (((tickAnim - 0) / 5) * (34.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(33)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 5) / 5) * (-26.48546-(34.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 5) / 5) * (1.95948-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-5.71931-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -26.48546 + (((tickAnim - 10) / 10) * (33-(-26.48546)));
            yy = 1.95948 + (((tickAnim - 10) / 10) * (0-(1.95948)));
            zz = -5.71931 + (((tickAnim - 10) / 10) * (0-(-5.71931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.5 + (((tickAnim - 0) / 3) * (45.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(18.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 45.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 3) / 7) * (3.25-(45.49+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 10) / 10) * (18.5-(3.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-45-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -45 + (((tickAnim - 4) / 4) * (-45.5-(-45)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -45.5 + (((tickAnim - 8) / 2) * (22.5-(-45.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 10) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 10) * (0-(-0.25)));
            zz = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 38.75 + (((tickAnim - 0) / 4) * (68-(38.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 68 + (((tickAnim - 4) / 4) * (67-(68)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 67 + (((tickAnim - 8) / 2) * (16.25432-(67)));
            yy = 0 + (((tickAnim - 8) / 2) * (-6.07919-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (3.61991-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 16.25432 + (((tickAnim - 10) / 2) * (-7.14988-(16.25432)));
            yy = -6.07919 + (((tickAnim - 10) / 2) * (-4.49483-(-6.07919)));
            zz = 3.61991 + (((tickAnim - 10) / 2) * (4.79476-(3.61991)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -7.14988 + (((tickAnim - 12) / 2) * (-24.06612-(-7.14988)));
            yy = -4.49483 + (((tickAnim - 12) / 2) * (-0.54638-(-4.49483)));
            zz = 4.79476 + (((tickAnim - 12) / 2) * (5.47288-(4.79476)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -24.06612 + (((tickAnim - 14) / 3) * (23.85549-(-24.06612)));
            yy = -0.54638 + (((tickAnim - 14) / 3) * (-0.31221-(-0.54638)));
            zz = 5.47288 + (((tickAnim - 14) / 3) * (3.12732-(5.47288)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 23.85549 + (((tickAnim - 17) / 3) * (38.75-(23.85549)));
            yy = -0.31221 + (((tickAnim - 17) / 3) * (0-(-0.31221)));
            zz = 3.12732 + (((tickAnim - 17) / 3) * (0-(3.12732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.93-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.325-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.93 + (((tickAnim - 4) / 4) * (0.93-(0.93)));
            zz = 0.325 + (((tickAnim - 4) / 4) * (0.325-(0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 8) / 2) * (-0.4-(0.93)));
            zz = 0.325 + (((tickAnim - 8) / 2) * (0-(0.325)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 2) * (0.54-(-0.4)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.54 + (((tickAnim - 12) / 1) * (0.775-(0.54)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 1) * (-0.175-(0.775)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 14) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
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
            xx = 32.25 + (((tickAnim - 0) / 6) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 32.25 + (((tickAnim - 6) / 4) * (0-(32.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (32.25-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 5) * (0.1-(0.1)));
            zz = 0.275 + (((tickAnim - 0) / 5) * (0.275-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 5) * (0-(0.1)));
            zz = 0.275 + (((tickAnim - 5) / 5) * (0-(0.275)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -26.48546 + (((tickAnim - 0) / 10) * (33-(-26.48546)));
            yy = -1.95948 + (((tickAnim - 0) / 10) * (0-(-1.95948)));
            zz = 5.71931 + (((tickAnim - 0) / 10) * (0-(5.71931)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 33 + (((tickAnim - 10) / 5) * (94.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(33)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 94.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 15) / 5) * (-26.48546-(94.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 15) / 5) * (-1.95948-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (5.71931-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 3.25 + (((tickAnim - 0) / 10) * (18.5-(3.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 10) / 3) * (113.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(18.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 113.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 13) / 7) * (3.25-(113.24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-45-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -45 + (((tickAnim - 14) / 4) * (-44-(-45)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -44 + (((tickAnim - 18) / 2) * (22.5-(-44)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 10) * (0-(-0.25)));
            zz = -0.275 + (((tickAnim - 0) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-0.275-(0)));
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
            xx = 16.25432 + (((tickAnim - 0) / 2) * (-7.14988-(16.25432)));
            yy = 6.07919 + (((tickAnim - 0) / 2) * (4.49483-(6.07919)));
            zz = -3.61991 + (((tickAnim - 0) / 2) * (-4.79476-(-3.61991)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -7.14988 + (((tickAnim - 2) / 2) * (-24.06612-(-7.14988)));
            yy = 4.49483 + (((tickAnim - 2) / 2) * (0.54638-(4.49483)));
            zz = -4.79476 + (((tickAnim - 2) / 2) * (-5.47288-(-4.79476)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -24.06612 + (((tickAnim - 4) / 3) * (23.85549-(-24.06612)));
            yy = 0.54638 + (((tickAnim - 4) / 3) * (0.31221-(0.54638)));
            zz = -5.47288 + (((tickAnim - 4) / 3) * (-3.12732-(-5.47288)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 23.85549 + (((tickAnim - 7) / 3) * (38.75-(23.85549)));
            yy = 0.31221 + (((tickAnim - 7) / 3) * (0-(0.31221)));
            zz = -3.12732 + (((tickAnim - 7) / 3) * (0-(-3.12732)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 38.75 + (((tickAnim - 10) / 4) * (68-(38.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 68 + (((tickAnim - 14) / 4) * (67-(68)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 67 + (((tickAnim - 18) / 2) * (18.75432-(67)));
            yy = 0 + (((tickAnim - 18) / 2) * (6.07919-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-3.61991-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 2) * (0.54-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.54 + (((tickAnim - 2) / 1) * (0.775-(0.54)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 1) * (-0.175-(0.775)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 4) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.93-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.325-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.93 + (((tickAnim - 14) / 4) * (0.93-(0.93)));
            zz = 0.325 + (((tickAnim - 14) / 4) * (0.325-(0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 18) / 2) * (-0.4-(0.93)));
            zz = 0.325 + (((tickAnim - 18) / 2) * (0-(0.325)));
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
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (32.25-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 32.25 + (((tickAnim - 10) / 6) * (32.25-(32.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 32.25 + (((tickAnim - 16) / 4) * (0-(32.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 10) / 5) * (0.1-(0.1)));
            zz = 0.275 + (((tickAnim - 10) / 5) * (0.275-(0.275)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 15) / 5) * (0-(0.1)));
            zz = 0.275 + (((tickAnim - 15) / 5) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-70))*5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.59);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*1.19);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-6), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-7), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-6), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-7), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*4), crest1.rotateAngleY + (float) Math.toRadians(0), crest1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest2, crest2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*8), crest2.rotateAngleY + (float) Math.toRadians(0), crest2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(crest3, crest3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*8), crest3.rotateAngleY + (float) Math.toRadians(0), crest3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.5));

    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (-24.75-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 30) / 20) * (5.25-(-24.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5.25 + (((tickAnim - 50) / 10) * (-24.75-(5.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -24.75 + (((tickAnim - 60) / 20) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -5.25 + (((tickAnim - 20) / 10) * (-0.225-(-5.25)));
            zz = 3.3 + (((tickAnim - 20) / 10) * (0-(3.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 30) / 20) * (-5.25-(-0.225)));
            zz = 0 + (((tickAnim - 30) / 20) * (3.3-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -5.25 + (((tickAnim - 50) / 10) * (-0.225-(-5.25)));
            zz = 3.3 + (((tickAnim - 50) / 10) * (0-(3.3)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 60) / 20) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-48.0192-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.0192 + (((tickAnim - 20) / 10) * (25.75-(-48.0192)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 30) / 20) * (-48.0192-(25.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -48.0192 + (((tickAnim - 50) / 10) * (25.75-(-48.0192)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 25.75 + (((tickAnim - 60) / 20) * (0-(25.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.5 + (((tickAnim - 20) / 10) * (0-(46.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (46.5-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 46.5 + (((tickAnim - 50) / 10) * (0-(46.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.75 + (((tickAnim - 20) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -40.75 + (((tickAnim - 50) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 20) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 50) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (38.44735-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38.44735 + (((tickAnim - 20) / 10) * (0-(38.44735)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (38.44735-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 38.44735 + (((tickAnim - 50) / 10) * (0-(38.44735)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 20) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 50) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-48.0192-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.0192 + (((tickAnim - 20) / 10) * (25.75-(-48.0192)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 30) / 20) * (-48.0192-(25.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -48.0192 + (((tickAnim - 50) / 10) * (25.75-(-48.0192)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 25.75 + (((tickAnim - 60) / 20) * (0-(25.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 46.5 + (((tickAnim - 20) / 10) * (0-(46.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (46.5-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 46.5 + (((tickAnim - 50) / 10) * (0-(46.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -40.75 + (((tickAnim - 20) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (-40.75-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -40.75 + (((tickAnim - 50) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 20) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 50) / 10) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (38.44735-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38.44735 + (((tickAnim - 20) / 10) * (0-(38.44735)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (38.44735-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 38.44735 + (((tickAnim - 50) / 10) * (0-(38.44735)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 20) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 50) / 10) * (0-(0.375)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 20) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 50) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 20) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.5 + (((tickAnim - 50) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (1.4-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 1.4 + (((tickAnim - 20) / 30) * (1.4-(1.4)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 1.4 + (((tickAnim - 50) / 30) * (0-(1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-37.26254-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 0) / 20) * (63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -37.26254 + (((tickAnim - 20) / 5) * (20.5-(-37.26254)));
            yy = -28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 20) / 5) * (0-(-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
            zz = 63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 20) / 5) * (0-(63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 25) / 5) * (-37.26254-(20.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -37.26254 + (((tickAnim - 30) / 20) * (-37.26254-(-37.26254)));
            yy = -28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 30) / 20) * (-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
            zz = 63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 30) / 20) * (63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -37.26254 + (((tickAnim - 50) / 5) * (20.5-(-37.26254)));
            yy = -28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 50) / 5) * (0-(-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
            zz = 63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 50) / 5) * (0-(63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 20.5 + (((tickAnim - 55) / 5) * (-37.26254-(20.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -37.26254 + (((tickAnim - 60) / 20) * (0-(-37.26254)));
            yy = -28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 60) / 20) * (0-(-28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
            zz = 63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10 + (((tickAnim - 60) / 20) * (8.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10-(63.1524848915+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = -14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20-(-14.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (24.25-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20 + (((tickAnim - 20) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 25) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20 + (((tickAnim - 30) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (24.25-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20 + (((tickAnim - 50) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 24.25 + (((tickAnim - 55) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20 + (((tickAnim - 60) / 20) * (18.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 0) / 20) * (-37.26254-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 0) / 20) * (28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            zz = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 0) / 20) * (-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -37.26254 + (((tickAnim - 20) / 5) * (20.5-(-37.26254)));
            yy = 28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 20) / 5) * (0-(28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            zz = -70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 20) / 5) * (-7.725-(-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 25) / 5) * (-37.26254-(20.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(0)));
            zz = -7.725 + (((tickAnim - 25) / 5) * (-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-7.725)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -37.26254 + (((tickAnim - 30) / 20) * (-37.26254-(-37.26254)));
            yy = 28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 30) / 20) * (28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            zz = -70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 30) / 20) * (-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -37.26254 + (((tickAnim - 50) / 5) * (20.5-(-37.26254)));
            yy = 28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 50) / 5) * (0-(28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            zz = -70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 50) / 5) * (-7.725-(-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 20.5 + (((tickAnim - 55) / 5) * (-37.26254-(20.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(0)));
            zz = -7.725 + (((tickAnim - 55) / 5) * (-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-7.725)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -37.26254 + (((tickAnim - 60) / 20) * (0-(-37.26254)));
            yy = 28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 60) / 20) * (0-(28.5846425881+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
            zz = -70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10 + (((tickAnim - 60) / 20) * (-8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10-(-70.8775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 15.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20 + (((tickAnim - 0) / 25) * (0-(15.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 25) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (24.25-(0)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20 + (((tickAnim - 30) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 24.25 + (((tickAnim - 55) / 5) * (0-(24.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20 + (((tickAnim - 60) / 20) * (-18.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200-230))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 20) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (10.25-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 10.25 + (((tickAnim - 50) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 40.5 + (((tickAnim - 20) / 4) * (9.38-(40.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 9.38 + (((tickAnim - 24) / 6) * (0-(9.38)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (40.5-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 40.5 + (((tickAnim - 50) / 4) * (9.38-(40.5)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 9.38 + (((tickAnim - 54) / 6) * (0-(9.38)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5.5 + (((tickAnim - 70) / 10) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 20) / 10) * (0-(-0.325)));
            zz = -0.5 + (((tickAnim - 20) / 10) * (0-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (-0.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 50) / 10) * (0-(-0.325)));
            zz = -0.5 + (((tickAnim - 50) / 10) * (0-(-0.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 70) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 32.75 + (((tickAnim - 20) / 4) * (-18.4-(32.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -18.4 + (((tickAnim - 24) / 6) * (22-(-18.4)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22 + (((tickAnim - 30) / 20) * (32.75-(22)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 32.75 + (((tickAnim - 50) / 4) * (-18.4-(32.75)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -18.4 + (((tickAnim - 54) / 6) * (22-(-18.4)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 22 + (((tickAnim - 60) / 10) * (29.5-(22)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 29.5 + (((tickAnim - 70) / 10) * (0-(29.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.525 + (((tickAnim - 20) / 4) * (0.165-(-0.525)));
            zz = 0 + (((tickAnim - 20) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.165 + (((tickAnim - 24) / 6) * (-0.425-(0.165)));
            zz = 0.2 + (((tickAnim - 24) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.425 + (((tickAnim - 30) / 20) * (-0.525-(-0.425)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = -0.525 + (((tickAnim - 50) / 4) * (0.165-(-0.525)));
            zz = 0 + (((tickAnim - 50) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 0.165 + (((tickAnim - 54) / 6) * (-0.425-(0.165)));
            zz = 0.2 + (((tickAnim - 54) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 60) / 10) * (-0.56-(-0.425)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -0.56 + (((tickAnim - 70) / 10) * (0-(-0.56)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (-54.71-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -54.71 + (((tickAnim - 22) / 2) * (-27-(-54.71)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -27 + (((tickAnim - 24) / 6) * (0-(-27)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 50) / 2) * (-54.71-(0)));
            yy = 0 + (((tickAnim - 50) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 2) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = -54.71 + (((tickAnim - 52) / 2) * (-27-(-54.71)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -27 + (((tickAnim - 54) / 6) * (0-(-27)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (14.5-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 14.5 + (((tickAnim - 70) / 10) * (0-(14.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3 + (((tickAnim - 0) / 80) * (2.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3 + (((tickAnim - 0) / 80) * (2.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1200))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest1, crest1.rotateAngleX + (float) Math.toRadians(xx), crest1.rotateAngleY + (float) Math.toRadians(yy), crest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (44.25-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 44.25 + (((tickAnim - 30) / 5) * (0-(44.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (44.25-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 44.25 + (((tickAnim - 60) / 5) * (0-(44.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18 + (((tickAnim - 20) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (18-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 50) / 30) * (0-(18)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.5 + (((tickAnim - 20) / 10) * (8.25-(5.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 30) / 20) * (5.5-(8.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 5.5 + (((tickAnim - 50) / 30) * (0-(5.5)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = -0.6 + (((tickAnim - 30) / 50) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13 + (((tickAnim - 20) / 10) * (17.25-(13)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 17.25 + (((tickAnim - 30) / 20) * (13-(17.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 13 + (((tickAnim - 50) / 30) * (0-(13)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.175-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = -0.175 + (((tickAnim - 30) / 50) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.25 + (((tickAnim - 20) / 10) * (34.5-(3.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 30) / 20) * (3.25-(34.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 3.25 + (((tickAnim - 50) / 30) * (0-(3.25)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = -0.325 + (((tickAnim - 30) / 50) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNqwebsaurus entity = (EntityPrehistoricFloraNqwebsaurus) entitylivingbaseIn;
        int animCycle = 222;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 9.5 + (((tickAnim - 20) / 182) * (9.5 - (9.5)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 9.5 + (((tickAnim - 202) / 18) * (0 - (9.5)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.9 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.9 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            yy = -0.9 + (((tickAnim - 20) / 182) * (-0.9 - (-0.9)));
            zz = -3.9 + (((tickAnim - 20) / 182) * (-3.9 - (-3.9)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = -0.9 + (((tickAnim - 202) / 18) * (0 - (-0.9)));
            zz = -3.9 + (((tickAnim - 202) / 18) * (0 - (-3.9)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float) (xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float) (yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16.75 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 16.75 + (((tickAnim - 20) / 182) * (16.75 - (16.75)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 16.75 + (((tickAnim - 202) / 18) * (0 - (16.75)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 4.75 + (((tickAnim - 20) / 182) * (4.75 - (4.75)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 4.75 + (((tickAnim - 202) / 18) * (0 - (4.75)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (55.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 55.5 + (((tickAnim - 20) / 182) * (55.5 - (55.5)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 55.5 + (((tickAnim - 202) / 18) * (0 - (55.5)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.175 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0.175 + (((tickAnim - 20) / 182) * (0.175 - (0.175)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0.175 + (((tickAnim - 202) / 18) * (0 - (0.175)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float) (xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float) (yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-86.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = -86.25 + (((tickAnim - 20) / 182) * (-86.25 - (-86.25)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -86.25 + (((tickAnim - 202) / 18) * (0 - (-86.25)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.075 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.71 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            yy = 0.075 + (((tickAnim - 10) / 10) * (-0.5 - (0.075)));
            zz = 0.71 + (((tickAnim - 10) / 10) * (-0.275 - (0.71)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            yy = -0.5 + (((tickAnim - 20) / 182) * (-0.5 - (-0.5)));
            zz = -0.275 + (((tickAnim - 20) / 182) * (-0.275 - (-0.275)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = -0.5 + (((tickAnim - 202) / 18) * (0 - (-0.5)));
            zz = -0.275 + (((tickAnim - 202) / 18) * (0 - (-0.275)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float) (xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float) (yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -40.5 + (((tickAnim - 10) / 10) * (-30.5 - (-40.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = -30.5 + (((tickAnim - 20) / 66) * (-30.5 - (-30.5)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = -30.5 + (((tickAnim - 86) / 7) * (-35.07 - (-30.5)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = -35.07 + (((tickAnim - 93) / 7) * (-19.5 - (-35.07)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = -19.5 + (((tickAnim - 100) / 102) * (-19.5 - (-19.5)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 223) {
            xx = -19.5 + (((tickAnim - 202) / 21) * (0 - (-19.5)));
            yy = 0 + (((tickAnim - 202) / 21) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 21) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (28.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.25 + (((tickAnim - 10) / 10) * (0 - (28.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 86) / 7) * (25.26 - (0)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 25.26 + (((tickAnim - 93) / 7) * (3.75 - (25.26)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = 3.75 + (((tickAnim - 100) / 102) * (3.75 - (3.75)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = 3.75 + (((tickAnim - 202) / 11) * (43.3 - (3.75)));
            yy = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = 43.3 + (((tickAnim - 213) / 10) * (0 - (43.3)));
            yy = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -40.25 + (((tickAnim - 10) / 10) * (0 - (-40.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 86) / 7) * (-25.66 - (0)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = -25.66 + (((tickAnim - 93) / 7) * (-11.5 - (-25.66)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = -11.5 + (((tickAnim - 100) / 102) * (-11.5 - (-11.5)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = -11.5 + (((tickAnim - 202) / 11) * (-40.52 - (-11.5)));
            yy = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = -40.52 + (((tickAnim - 213) / 10) * (0 - (-40.52)));
            yy = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 76.5 + (((tickAnim - 10) / 10) * (23 - (76.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 23 + (((tickAnim - 20) / 66) * (23 - (23)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 23 + (((tickAnim - 86) / 7) * (66.72 - (23)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 66.72 + (((tickAnim - 93) / 7) * (19.75 - (66.72)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = 19.75 + (((tickAnim - 100) / 102) * (19.75 - (19.75)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = 19.75 + (((tickAnim - 202) / 11) * (72.73 - (19.75)));
            yy = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = 72.73 + (((tickAnim - 213) / 10) * (0 - (72.73)));
            yy = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.425 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.44 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            yy = 0.425 + (((tickAnim - 10) / 10) * (0 - (0.425)));
            zz = 0.44 + (((tickAnim - 10) / 10) * (0 - (0.44)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 86) / 7) * (1.325 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0.35 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            yy = 1.325 + (((tickAnim - 93) / 7) * (0 - (1.325)));
            zz = 0.35 + (((tickAnim - 93) / 7) * (0 - (0.35)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0.525 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            yy = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            zz = 0.525 + (((tickAnim - 213) / 10) * (0 - (0.525)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float) (xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float) (yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (55.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 55.5 + (((tickAnim - 10) / 10) * (0 - (55.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 86) / 7) * (28.25 - (0)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 28.25 + (((tickAnim - 93) / 7) * (0 - (28.25)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 202) / 11) * (26 - (0)));
            yy = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = 26 + (((tickAnim - 213) / 10) * (0 - (26)));
            yy = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.25 - (0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.425 - (0)));
        } else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0 - (0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (0 - (0.25)));
            zz = 0.425 + (((tickAnim - 10) / 10) * (0 - (0.425)));
        } else if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 86) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 7) * (0.225 - (0)));
        } else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 93) / 7) * (0 - (0)));
            zz = 0.225 + (((tickAnim - 93) / 7) * (0 - (0.225)));
        } else if (tickAnim >= 100 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            yy = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
            zz = 0 + (((tickAnim - 100) / 102) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 202) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 11) * (0.025 - (0)));
            zz = 0 + (((tickAnim - 202) / 11) * (0.2 - (0)));
        } else if (tickAnim >= 213 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 213) / 10) * (0 - (0)));
            yy = 0.025 + (((tickAnim - 213) / 10) * (0 - (0.025)));
            zz = 0.2 + (((tickAnim - 213) / 10) * (0 - (0.2)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float) (xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float) (yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 6.75 + (((tickAnim - 20) / 182) * (6.75 - (6.75)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 6.75 + (((tickAnim - 202) / 18) * (0 - (6.75)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = 12 + (((tickAnim - 20) / 182) * (12 - (12)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 12 + (((tickAnim - 202) / 18) * (0 - (12)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.73785 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.13146 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-15.20918 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = -2.73785 + (((tickAnim - 20) / 182) * (-2.73785 - (-2.73785)));
            yy = -1.13146 + (((tickAnim - 20) / 182) * (-1.13146 - (-1.13146)));
            zz = -15.20918 + (((tickAnim - 20) / 182) * (-15.20918 - (-15.20918)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -2.73785 + (((tickAnim - 202) / 18) * (0 - (-2.73785)));
            yy = -1.13146 + (((tickAnim - 202) / 18) * (0 - (-1.13146)));
            zz = -15.20918 + (((tickAnim - 202) / 18) * (0 - (-15.20918)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.5 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.5 + (((tickAnim - 20) / 10) * (-7.25601 - (-15.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.14489 - (0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-4.74779 - (0)));
        } else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -7.25601 + (((tickAnim - 30) / 5) * (2.00336 - (-7.25601)));
            yy = 0.14489 + (((tickAnim - 30) / 5) * (2.35357 - (0.14489)));
            zz = -4.74779 + (((tickAnim - 30) / 5) * (-4.31845 - (-4.74779)));
        } else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 2.00336 + (((tickAnim - 35) / 12) * (-15.5 - (2.00336)));
            yy = 2.35357 + (((tickAnim - 35) / 12) * (0 - (2.35357)));
            zz = -4.31845 + (((tickAnim - 35) / 12) * (0 - (-4.31845)));
        } else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -15.5 + (((tickAnim - 47) / 6) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -20.25 + (((tickAnim - 53) / 6) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -15.5 + (((tickAnim - 59) / 10) * (-7.25601 - (-15.5)));
            yy = 0 + (((tickAnim - 59) / 10) * (0.14489 - (0)));
            zz = 0 + (((tickAnim - 59) / 10) * (-4.74779 - (0)));
        } else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -7.25601 + (((tickAnim - 69) / 5) * (2.00336 - (-7.25601)));
            yy = 0.14489 + (((tickAnim - 69) / 5) * (2.35357 - (0.14489)));
            zz = -4.74779 + (((tickAnim - 69) / 5) * (-4.31845 - (-4.74779)));
        } else if (tickAnim >= 74 && tickAnim < 86) {
            xx = 2.00336 + (((tickAnim - 74) / 12) * (-15.5 - (2.00336)));
            yy = 2.35357 + (((tickAnim - 74) / 12) * (0 - (2.35357)));
            zz = -4.31845 + (((tickAnim - 74) / 12) * (0 - (-4.31845)));
        } else if (tickAnim >= 86 && tickAnim < 92) {
            xx = -15.5 + (((tickAnim - 86) / 6) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -20.25 + (((tickAnim - 92) / 6) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 104) {
            xx = -15.5 + (((tickAnim - 98) / 6) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = -20.25 + (((tickAnim - 104) / 7) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 121) {
            xx = -15.5 + (((tickAnim - 111) / 10) * (-7.25601 - (-15.5)));
            yy = 0 + (((tickAnim - 111) / 10) * (0.14489 - (0)));
            zz = 0 + (((tickAnim - 111) / 10) * (-4.74779 - (0)));
        } else if (tickAnim >= 121 && tickAnim < 126) {
            xx = -7.25601 + (((tickAnim - 121) / 5) * (2.00336 - (-7.25601)));
            yy = 0.14489 + (((tickAnim - 121) / 5) * (2.35357 - (0.14489)));
            zz = -4.74779 + (((tickAnim - 121) / 5) * (-4.31845 - (-4.74779)));
        } else if (tickAnim >= 126 && tickAnim < 138) {
            xx = 2.00336 + (((tickAnim - 126) / 12) * (-15.5 - (2.00336)));
            yy = 2.35357 + (((tickAnim - 126) / 12) * (0 - (2.35357)));
            zz = -4.31845 + (((tickAnim - 126) / 12) * (0 - (-4.31845)));
        } else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -15.5 + (((tickAnim - 138) / 5) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -20.25 + (((tickAnim - 143) / 7) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -15.5 + (((tickAnim - 150) / 10) * (-7.25601 - (-15.5)));
            yy = 0 + (((tickAnim - 150) / 10) * (0.14489 - (0)));
            zz = 0 + (((tickAnim - 150) / 10) * (-4.74779 - (0)));
        } else if (tickAnim >= 160 && tickAnim < 165) {
            xx = -7.25601 + (((tickAnim - 160) / 5) * (2.00336 - (-7.25601)));
            yy = 0.14489 + (((tickAnim - 160) / 5) * (2.35357 - (0.14489)));
            zz = -4.74779 + (((tickAnim - 160) / 5) * (-4.31845 - (-4.74779)));
        } else if (tickAnim >= 165 && tickAnim < 177) {
            xx = 2.00336 + (((tickAnim - 165) / 12) * (-15.5 - (2.00336)));
            yy = 2.35357 + (((tickAnim - 165) / 12) * (0 - (2.35357)));
            zz = -4.31845 + (((tickAnim - 165) / 12) * (0 - (-4.31845)));
        } else if (tickAnim >= 177 && tickAnim < 183) {
            xx = -15.5 + (((tickAnim - 177) / 6) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = -20.25 + (((tickAnim - 183) / 6) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 195) {
            xx = -15.5 + (((tickAnim - 189) / 6) * (-20.25 - (-15.5)));
            yy = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = -20.25 + (((tickAnim - 195) / 7) * (-15.5 - (-20.25)));
            yy = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -15.5 + (((tickAnim - 202) / 18) * (0 - (-15.5)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.475 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 20) / 27) * (0 - (0)));
            yy = 0 + (((tickAnim - 20) / 27) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 20) / 27) * (0.475 - (0.475)));
        } else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 47) / 6) * (0.83 - (0.475)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 53) / 6) * (0.475 - (0.83)));
        } else if (tickAnim >= 59 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 59) / 27) * (0 - (0)));
            yy = 0 + (((tickAnim - 59) / 27) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 59) / 27) * (0.475 - (0.475)));
        } else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 86) / 6) * (0.83 - (0.475)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 92) / 6) * (0.475 - (0.83)));
        } else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 98) / 6) * (0.83 - (0.475)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 104) / 7) * (0.475 - (0.83)));
        } else if (tickAnim >= 111 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 111) / 27) * (0 - (0)));
            yy = 0 + (((tickAnim - 111) / 27) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 111) / 27) * (0.475 - (0.475)));
        } else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 138) / 5) * (0.83 - (0.475)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 143) / 7) * (0.475 - (0.83)));
        } else if (tickAnim >= 150 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 150) / 27) * (0 - (0)));
            yy = 0 + (((tickAnim - 150) / 27) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 150) / 27) * (0.475 - (0.475)));
        } else if (tickAnim >= 177 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 177) / 6) * (0.83 - (0.475)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 183) / 6) * (0.475 - (0.83)));
        } else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 189) / 6) * (0.83 - (0.475)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            zz = 0.83 + (((tickAnim - 195) / 7) * (0.475 - (0.83)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0.475 + (((tickAnim - 202) / 18) * (0 - (0.475)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float) (xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float) (yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -19.25 + (((tickAnim - 20) / 7) * (11.61212 - (-19.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0.47487 - (0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-1.55414 - (0)));
        } else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 11.61212 + (((tickAnim - 27) / 3) * (16.97423 - (11.61212)));
            yy = 0.47487 + (((tickAnim - 27) / 3) * (0.94974 - (0.47487)));
            zz = -1.55414 + (((tickAnim - 27) / 3) * (-3.10828 - (-1.55414)));
        } else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 16.97423 + (((tickAnim - 30) / 5) * (6.27963 - (16.97423)));
            yy = 0.94974 + (((tickAnim - 30) / 5) * (7.65969 - (0.94974)));
            zz = -3.10828 + (((tickAnim - 30) / 5) * (-2.37154 - (-3.10828)));
        } else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 6.27963 + (((tickAnim - 35) / 12) * (-19.25 - (6.27963)));
            yy = 7.65969 + (((tickAnim - 35) / 12) * (0 - (7.65969)));
            zz = -2.37154 + (((tickAnim - 35) / 12) * (0 - (-2.37154)));
        } else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -19.25 + (((tickAnim - 47) / 6) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -28 + (((tickAnim - 53) / 6) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 66) {
            xx = -19.25 + (((tickAnim - 59) / 7) * (11.61212 - (-19.25)));
            yy = 0 + (((tickAnim - 59) / 7) * (0.47487 - (0)));
            zz = 0 + (((tickAnim - 59) / 7) * (-1.55414 - (0)));
        } else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 11.61212 + (((tickAnim - 66) / 3) * (16.97423 - (11.61212)));
            yy = 0.47487 + (((tickAnim - 66) / 3) * (0.94974 - (0.47487)));
            zz = -1.55414 + (((tickAnim - 66) / 3) * (-3.10828 - (-1.55414)));
        } else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 16.97423 + (((tickAnim - 69) / 5) * (6.27963 - (16.97423)));
            yy = 0.94974 + (((tickAnim - 69) / 5) * (7.65969 - (0.94974)));
            zz = -3.10828 + (((tickAnim - 69) / 5) * (-2.37154 - (-3.10828)));
        } else if (tickAnim >= 74 && tickAnim < 86) {
            xx = 6.27963 + (((tickAnim - 74) / 12) * (-19.25 - (6.27963)));
            yy = 7.65969 + (((tickAnim - 74) / 12) * (0 - (7.65969)));
            zz = -2.37154 + (((tickAnim - 74) / 12) * (0 - (-2.37154)));
        } else if (tickAnim >= 86 && tickAnim < 92) {
            xx = -19.25 + (((tickAnim - 86) / 6) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -28 + (((tickAnim - 92) / 6) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 104) {
            xx = -19.25 + (((tickAnim - 98) / 6) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = -28 + (((tickAnim - 104) / 7) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 118) {
            xx = -19.25 + (((tickAnim - 111) / 7) * (11.61212 - (-19.25)));
            yy = 0 + (((tickAnim - 111) / 7) * (0.47487 - (0)));
            zz = 0 + (((tickAnim - 111) / 7) * (-1.55414 - (0)));
        } else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 11.61212 + (((tickAnim - 118) / 3) * (16.97423 - (11.61212)));
            yy = 0.47487 + (((tickAnim - 118) / 3) * (0.94974 - (0.47487)));
            zz = -1.55414 + (((tickAnim - 118) / 3) * (-3.10828 - (-1.55414)));
        } else if (tickAnim >= 121 && tickAnim < 126) {
            xx = 16.97423 + (((tickAnim - 121) / 5) * (6.27963 - (16.97423)));
            yy = 0.94974 + (((tickAnim - 121) / 5) * (7.65969 - (0.94974)));
            zz = -3.10828 + (((tickAnim - 121) / 5) * (-2.37154 - (-3.10828)));
        } else if (tickAnim >= 126 && tickAnim < 138) {
            xx = 6.27963 + (((tickAnim - 126) / 12) * (-19.25 - (6.27963)));
            yy = 7.65969 + (((tickAnim - 126) / 12) * (0 - (7.65969)));
            zz = -2.37154 + (((tickAnim - 126) / 12) * (0 - (-2.37154)));
        } else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -19.25 + (((tickAnim - 138) / 5) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -28 + (((tickAnim - 143) / 7) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 157) {
            xx = -19.25 + (((tickAnim - 150) / 7) * (11.61212 - (-19.25)));
            yy = 0 + (((tickAnim - 150) / 7) * (0.47487 - (0)));
            zz = 0 + (((tickAnim - 150) / 7) * (-1.55414 - (0)));
        } else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 11.61212 + (((tickAnim - 157) / 3) * (16.97423 - (11.61212)));
            yy = 0.47487 + (((tickAnim - 157) / 3) * (0.94974 - (0.47487)));
            zz = -1.55414 + (((tickAnim - 157) / 3) * (-3.10828 - (-1.55414)));
        } else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 16.97423 + (((tickAnim - 160) / 5) * (6.27963 - (16.97423)));
            yy = 0.94974 + (((tickAnim - 160) / 5) * (7.65969 - (0.94974)));
            zz = -3.10828 + (((tickAnim - 160) / 5) * (-2.37154 - (-3.10828)));
        } else if (tickAnim >= 165 && tickAnim < 177) {
            xx = 6.27963 + (((tickAnim - 165) / 12) * (-19.25 - (6.27963)));
            yy = 7.65969 + (((tickAnim - 165) / 12) * (0 - (7.65969)));
            zz = -2.37154 + (((tickAnim - 165) / 12) * (0 - (-2.37154)));
        } else if (tickAnim >= 177 && tickAnim < 183) {
            xx = -19.25 + (((tickAnim - 177) / 6) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = -28 + (((tickAnim - 183) / 6) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 195) {
            xx = -19.25 + (((tickAnim - 189) / 6) * (-28 - (-19.25)));
            yy = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = -28 + (((tickAnim - 195) / 7) * (-19.25 - (-28)));
            yy = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -19.25 + (((tickAnim - 202) / 18) * (0 - (-19.25)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.8 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.6 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 20) / 10) * (0 - (-0.8)));
            zz = 0.6 + (((tickAnim - 20) / 10) * (0 - (0.6)));
        } else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 30) / 17) * (-0.8 - (0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0.6 - (0)));
        } else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 47) / 6) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 47) / 6) * (0.875 - (0.6)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 53) / 6) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 53) / 6) * (0.6 - (0.875)));
        } else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 59) / 10) * (0 - (-0.8)));
            zz = 0.6 + (((tickAnim - 59) / 10) * (0 - (0.6)));
        } else if (tickAnim >= 69 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 69) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 69) / 17) * (-0.8 - (0)));
            zz = 0 + (((tickAnim - 69) / 17) * (0.6 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 86) / 6) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 86) / 6) * (0.875 - (0.6)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 92) / 6) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 92) / 6) * (0.6 - (0.875)));
        } else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 98) / 6) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 98) / 6) * (0.875 - (0.6)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 104) / 7) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 104) / 7) * (0.6 - (0.875)));
        } else if (tickAnim >= 111 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 111) / 10) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 111) / 10) * (0 - (-0.8)));
            zz = 0.6 + (((tickAnim - 111) / 10) * (0 - (0.6)));
        } else if (tickAnim >= 121 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 121) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 121) / 17) * (-0.8 - (0)));
            zz = 0 + (((tickAnim - 121) / 17) * (0.6 - (0)));
        } else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 138) / 5) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 138) / 5) * (0.875 - (0.6)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 143) / 7) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 143) / 7) * (0.6 - (0.875)));
        } else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 150) / 10) * (0 - (-0.8)));
            zz = 0.6 + (((tickAnim - 150) / 10) * (0 - (0.6)));
        } else if (tickAnim >= 160 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 160) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 160) / 17) * (-0.8 - (0)));
            zz = 0 + (((tickAnim - 160) / 17) * (0.6 - (0)));
        } else if (tickAnim >= 177 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 177) / 6) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 177) / 6) * (0.875 - (0.6)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 183) / 6) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 183) / 6) * (0.6 - (0.875)));
        } else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 189) / 6) * (-0.925 - (-0.8)));
            zz = 0.6 + (((tickAnim - 189) / 6) * (0.875 - (0.6)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            yy = -0.925 + (((tickAnim - 195) / 7) * (-0.8 - (-0.925)));
            zz = 0.875 + (((tickAnim - 195) / 7) * (0.6 - (0.875)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = -0.8 + (((tickAnim - 202) / 18) * (0 - (-0.8)));
            zz = 0.6 + (((tickAnim - 202) / 18) * (0 - (0.6)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float) (xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float) (yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (-16.09903 - (0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-4.15931 - (0)));
            zz = 0 + (((tickAnim - 20) / 7) * (1.36153 - (0)));
        } else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -16.09903 + (((tickAnim - 27) / 3) * (-18.19806 - (-16.09903)));
            yy = -4.15931 + (((tickAnim - 27) / 3) * (-8.31863 - (-4.15931)));
            zz = 1.36153 + (((tickAnim - 27) / 3) * (2.72306 - (1.36153)));
        } else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -18.19806 + (((tickAnim - 30) / 5) * (-0.19806 - (-18.19806)));
            yy = -8.31863 + (((tickAnim - 30) / 5) * (-8.31863 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 30) / 5) * (2.72306 - (2.72306)));
        } else if (tickAnim >= 35 && tickAnim < 47) {
            xx = -0.19806 + (((tickAnim - 35) / 12) * (0 - (-0.19806)));
            yy = -8.31863 + (((tickAnim - 35) / 12) * (0 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 35) / 12) * (0 - (2.72306)));
        } else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0 - (0)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -10.5 + (((tickAnim - 53) / 6) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 59) / 7) * (-16.09903 - (0)));
            yy = 0 + (((tickAnim - 59) / 7) * (-4.15931 - (0)));
            zz = 0 + (((tickAnim - 59) / 7) * (1.36153 - (0)));
        } else if (tickAnim >= 66 && tickAnim < 69) {
            xx = -16.09903 + (((tickAnim - 66) / 3) * (-18.19806 - (-16.09903)));
            yy = -4.15931 + (((tickAnim - 66) / 3) * (-8.31863 - (-4.15931)));
            zz = 1.36153 + (((tickAnim - 66) / 3) * (2.72306 - (1.36153)));
        } else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -18.19806 + (((tickAnim - 69) / 5) * (-0.19806 - (-18.19806)));
            yy = -8.31863 + (((tickAnim - 69) / 5) * (-8.31863 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 69) / 5) * (2.72306 - (2.72306)));
        } else if (tickAnim >= 74 && tickAnim < 86) {
            xx = -0.19806 + (((tickAnim - 74) / 12) * (0 - (-0.19806)));
            yy = -8.31863 + (((tickAnim - 74) / 12) * (0 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 74) / 12) * (0 - (2.72306)));
        } else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 86) / 6) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 6) * (0 - (0)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -10.5 + (((tickAnim - 92) / 6) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 98) / 6) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0 - (0)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = -10.5 + (((tickAnim - 104) / 7) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 111) / 7) * (-16.09903 - (0)));
            yy = 0 + (((tickAnim - 111) / 7) * (-4.15931 - (0)));
            zz = 0 + (((tickAnim - 111) / 7) * (1.36153 - (0)));
        } else if (tickAnim >= 118 && tickAnim < 121) {
            xx = -16.09903 + (((tickAnim - 118) / 3) * (-18.19806 - (-16.09903)));
            yy = -4.15931 + (((tickAnim - 118) / 3) * (-8.31863 - (-4.15931)));
            zz = 1.36153 + (((tickAnim - 118) / 3) * (2.72306 - (1.36153)));
        } else if (tickAnim >= 121 && tickAnim < 126) {
            xx = -18.19806 + (((tickAnim - 121) / 5) * (-0.19806 - (-18.19806)));
            yy = -8.31863 + (((tickAnim - 121) / 5) * (-8.31863 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 121) / 5) * (2.72306 - (2.72306)));
        } else if (tickAnim >= 126 && tickAnim < 138) {
            xx = -0.19806 + (((tickAnim - 126) / 12) * (0 - (-0.19806)));
            yy = -8.31863 + (((tickAnim - 126) / 12) * (0 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 126) / 12) * (0 - (2.72306)));
        } else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 138) / 5) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0 - (0)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = -10.5 + (((tickAnim - 143) / 7) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 150) / 7) * (-16.09903 - (0)));
            yy = 0 + (((tickAnim - 150) / 7) * (-4.15931 - (0)));
            zz = 0 + (((tickAnim - 150) / 7) * (1.36153 - (0)));
        } else if (tickAnim >= 157 && tickAnim < 160) {
            xx = -16.09903 + (((tickAnim - 157) / 3) * (-18.19806 - (-16.09903)));
            yy = -4.15931 + (((tickAnim - 157) / 3) * (-8.31863 - (-4.15931)));
            zz = 1.36153 + (((tickAnim - 157) / 3) * (2.72306 - (1.36153)));
        } else if (tickAnim >= 160 && tickAnim < 165) {
            xx = -18.19806 + (((tickAnim - 160) / 5) * (-0.19806 - (-18.19806)));
            yy = -8.31863 + (((tickAnim - 160) / 5) * (-8.31863 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 160) / 5) * (2.72306 - (2.72306)));
        } else if (tickAnim >= 165 && tickAnim < 177) {
            xx = -0.19806 + (((tickAnim - 165) / 12) * (0 - (-0.19806)));
            yy = -8.31863 + (((tickAnim - 165) / 12) * (0 - (-8.31863)));
            zz = 2.72306 + (((tickAnim - 165) / 12) * (0 - (2.72306)));
        } else if (tickAnim >= 177 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 177) / 6) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 177) / 6) * (0 - (0)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = -10.5 + (((tickAnim - 183) / 6) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (-10.5 - (0)));
            yy = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0 - (0)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = -10.5 + (((tickAnim - 195) / 7) * (0 - (-10.5)));
            yy = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0.025 - (0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.175 - (0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.075 - (0)));
        } else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.025 + (((tickAnim - 30) / 5) * (0 - (0.025)));
            yy = 0.175 + (((tickAnim - 30) / 5) * (0 - (0.175)));
            zz = 0.075 + (((tickAnim - 30) / 5) * (0 - (0.075)));
        } else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 35) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 35) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 35) / 12) * (0 - (0)));
        } else if (tickAnim >= 47 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 47) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 47) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 47) / 12) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (0.025 - (0)));
            yy = 0 + (((tickAnim - 59) / 10) * (0.175 - (0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0.075 - (0)));
        } else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 0.025 + (((tickAnim - 69) / 5) * (0 - (0.025)));
            yy = 0.175 + (((tickAnim - 69) / 5) * (0 - (0.175)));
            zz = 0.075 + (((tickAnim - 69) / 5) * (0 - (0.075)));
        } else if (tickAnim >= 74 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 74) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 74) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 74) / 12) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 86) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 86) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 12) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 98) / 13) * (0 - (0)));
            yy = 0 + (((tickAnim - 98) / 13) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 13) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 111) / 10) * (0.025 - (0)));
            yy = 0 + (((tickAnim - 111) / 10) * (0.175 - (0)));
            zz = 0 + (((tickAnim - 111) / 10) * (0.075 - (0)));
        } else if (tickAnim >= 121 && tickAnim < 126) {
            xx = 0.025 + (((tickAnim - 121) / 5) * (0 - (0.025)));
            yy = 0.175 + (((tickAnim - 121) / 5) * (0 - (0.175)));
            zz = 0.075 + (((tickAnim - 121) / 5) * (0 - (0.075)));
        } else if (tickAnim >= 126 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 126) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 126) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 126) / 12) * (0 - (0)));
        } else if (tickAnim >= 138 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 138) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 138) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 138) / 12) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (0.025 - (0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0.175 - (0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0.075 - (0)));
        } else if (tickAnim >= 160 && tickAnim < 165) {
            xx = 0.025 + (((tickAnim - 160) / 5) * (0 - (0.025)));
            yy = 0.175 + (((tickAnim - 160) / 5) * (0 - (0.175)));
            zz = 0.075 + (((tickAnim - 160) / 5) * (0 - (0.075)));
        } else if (tickAnim >= 165 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 165) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 165) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 165) / 12) * (0 - (0)));
        } else if (tickAnim >= 177 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 177) / 12) * (0 - (0)));
            yy = 0 + (((tickAnim - 177) / 12) * (0 - (0)));
            zz = 0 + (((tickAnim - 177) / 12) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 189) / 13) * (0 - (0)));
            yy = 0 + (((tickAnim - 189) / 13) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 13) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float) (xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float) (yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float) (zz);


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-17.5 - (0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0 - (0)));
        } else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 30) / 5) * (-41.73783 - (-17.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (-9.7746 - (0)));
            zz = 0 + (((tickAnim - 30) / 5) * (8.61274 - (0)));
        } else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -41.73783 + (((tickAnim - 35) / 5) * (0 - (-41.73783)));
            yy = -9.7746 + (((tickAnim - 35) / 5) * (0 - (-9.7746)));
            zz = 8.61274 + (((tickAnim - 35) / 5) * (0 - (8.61274)));
        } else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0 - (0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0 - (0)));
        } else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 45) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0 - (0)));
        } else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 20.75 + (((tickAnim - 56) / 3) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 56) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (-17.5 - (0)));
            yy = 0 + (((tickAnim - 59) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0 - (0)));
        } else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -17.5 + (((tickAnim - 69) / 5) * (-41.73783 - (-17.5)));
            yy = 0 + (((tickAnim - 69) / 5) * (-9.7746 - (0)));
            zz = 0 + (((tickAnim - 69) / 5) * (8.61274 - (0)));
        } else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -41.73783 + (((tickAnim - 74) / 5) * (0 - (-41.73783)));
            yy = -9.7746 + (((tickAnim - 74) / 5) * (0 - (-9.7746)));
            zz = 8.61274 + (((tickAnim - 74) / 5) * (0 - (8.61274)));
        } else if (tickAnim >= 79 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 79) / 5) * (0 - (0)));
            yy = 0 + (((tickAnim - 79) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 79) / 5) * (0 - (0)));
        } else if (tickAnim >= 84 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 84) / 11) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 84) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 84) / 11) * (0 - (0)));
        } else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 20.75 + (((tickAnim - 95) / 3) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 95) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 95) / 3) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 98) / 10) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 98) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 10) * (0 - (0)));
        } else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 20.75 + (((tickAnim - 108) / 3) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 108) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 108) / 3) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 111) / 10) * (-17.5 - (0)));
            yy = 0 + (((tickAnim - 111) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 111) / 10) * (0 - (0)));
        } else if (tickAnim >= 121 && tickAnim < 126) {
            xx = -17.5 + (((tickAnim - 121) / 5) * (-41.73783 - (-17.5)));
            yy = 0 + (((tickAnim - 121) / 5) * (-9.7746 - (0)));
            zz = 0 + (((tickAnim - 121) / 5) * (8.61274 - (0)));
        } else if (tickAnim >= 126 && tickAnim < 131) {
            xx = -41.73783 + (((tickAnim - 126) / 5) * (0 - (-41.73783)));
            yy = -9.7746 + (((tickAnim - 126) / 5) * (0 - (-9.7746)));
            zz = 8.61274 + (((tickAnim - 126) / 5) * (0 - (8.61274)));
        } else if (tickAnim >= 131 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 131) / 5) * (0 - (0)));
            yy = 0 + (((tickAnim - 131) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 131) / 5) * (0 - (0)));
        } else if (tickAnim >= 136 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 136) / 11) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 136) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 136) / 11) * (0 - (0)));
        } else if (tickAnim >= 147 && tickAnim < 150) {
            xx = 20.75 + (((tickAnim - 147) / 3) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 147) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 147) / 3) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 150) / 10) * (-17.5 - (0)));
            yy = 0 + (((tickAnim - 150) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 150) / 10) * (0 - (0)));
        } else if (tickAnim >= 160 && tickAnim < 165) {
            xx = -17.5 + (((tickAnim - 160) / 5) * (-41.73783 - (-17.5)));
            yy = 0 + (((tickAnim - 160) / 5) * (-9.7746 - (0)));
            zz = 0 + (((tickAnim - 160) / 5) * (8.61274 - (0)));
        } else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -41.73783 + (((tickAnim - 165) / 5) * (0 - (-41.73783)));
            yy = -9.7746 + (((tickAnim - 165) / 5) * (0 - (-9.7746)));
            zz = 8.61274 + (((tickAnim - 165) / 5) * (0 - (8.61274)));
        } else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 170) / 5) * (0 - (0)));
            yy = 0 + (((tickAnim - 170) / 5) * (0 - (0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0 - (0)));
        } else if (tickAnim >= 175 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 175) / 11) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 175) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 175) / 11) * (0 - (0)));
        } else if (tickAnim >= 186 && tickAnim < 189) {
            xx = 20.75 + (((tickAnim - 186) / 3) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 186) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 186) / 3) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 189) / 9) * (20.75 - (0)));
            yy = 0 + (((tickAnim - 189) / 9) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 9) * (0 - (0)));
        } else if (tickAnim >= 198 && tickAnim < 202) {
            xx = 20.75 + (((tickAnim - 198) / 4) * (0 - (20.75)));
            yy = 0 + (((tickAnim - 198) / 4) * (0 - (0)));
            zz = 0 + (((tickAnim - 198) / 4) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0 - (0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0 - (0)));
        } else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 45) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0.575 - (0)));
        } else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 56) / 3) * (0 - (0)));
            yy = 0 + (((tickAnim - 56) / 3) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 56) / 3) * (0 - (0.575)));
        } else if (tickAnim >= 59 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 59) / 25) * (0 - (0)));
            yy = 0 + (((tickAnim - 59) / 25) * (0 - (0)));
            zz = 0 + (((tickAnim - 59) / 25) * (0 - (0)));
        } else if (tickAnim >= 84 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 84) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 84) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 84) / 11) * (0.575 - (0)));
        } else if (tickAnim >= 95 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 95) / 3) * (0 - (0)));
            yy = 0 + (((tickAnim - 95) / 3) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 95) / 3) * (0 - (0.575)));
        } else if (tickAnim >= 98 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 98) / 10) * (0 - (0)));
            yy = 0 + (((tickAnim - 98) / 10) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 10) * (0.575 - (0)));
        } else if (tickAnim >= 108 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 108) / 3) * (0 - (0)));
            yy = 0 + (((tickAnim - 108) / 3) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 108) / 3) * (0 - (0.575)));
        } else if (tickAnim >= 111 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 111) / 25) * (0 - (0)));
            yy = 0 + (((tickAnim - 111) / 25) * (0 - (0)));
            zz = 0 + (((tickAnim - 111) / 25) * (0 - (0)));
        } else if (tickAnim >= 136 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 136) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 136) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 136) / 11) * (0.575 - (0)));
        } else if (tickAnim >= 147 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 147) / 3) * (0 - (0)));
            yy = 0 + (((tickAnim - 147) / 3) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 147) / 3) * (0 - (0.575)));
        } else if (tickAnim >= 150 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 150) / 25) * (0 - (0)));
            yy = 0 + (((tickAnim - 150) / 25) * (0 - (0)));
            zz = 0 + (((tickAnim - 150) / 25) * (0 - (0)));
        } else if (tickAnim >= 175 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 175) / 11) * (0 - (0)));
            yy = 0 + (((tickAnim - 175) / 11) * (0 - (0)));
            zz = 0 + (((tickAnim - 175) / 11) * (0.575 - (0)));
        } else if (tickAnim >= 186 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 186) / 3) * (0 - (0)));
            yy = 0 + (((tickAnim - 186) / 3) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 186) / 3) * (0 - (0.575)));
        } else if (tickAnim >= 189 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 189) / 9) * (0 - (0)));
            yy = 0 + (((tickAnim - 189) / 9) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 9) * (0.575 - (0)));
        } else if (tickAnim >= 198 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 198) / 4) * (0 - (0)));
            yy = 0 + (((tickAnim - 198) / 4) * (0 - (0)));
            zz = 0.575 + (((tickAnim - 198) / 4) * (0 - (0.575)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float) (xx);
        this.head.rotationPointY = this.head.rotationPointY - (float) (yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float) (zz);


        if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (37 - (0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0 - (0)));
        } else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 37 + (((tickAnim - 27) / 3) * (0 - (37)));
            yy = 0 + (((tickAnim - 27) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0 - (0)));
        } else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 30) / 17) * (0 - (0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0 - (0)));
        } else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 47) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0 - (0)));
        } else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 14.75 + (((tickAnim - 50) / 3) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 50) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0 - (0)));
        } else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0 - (0)));
        } else if (tickAnim >= 59 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 59) / 7) * (37 - (0)));
            yy = 0 + (((tickAnim - 59) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 59) / 7) * (0 - (0)));
        } else if (tickAnim >= 66 && tickAnim < 69) {
            xx = 37 + (((tickAnim - 66) / 3) * (0 - (37)));
            yy = 0 + (((tickAnim - 66) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 66) / 3) * (0 - (0)));
        } else if (tickAnim >= 69 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 69) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 69) / 17) * (0 - (0)));
            zz = 0 + (((tickAnim - 69) / 17) * (0 - (0)));
        } else if (tickAnim >= 86 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 86) / 3) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 86) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 86) / 3) * (0 - (0)));
        } else if (tickAnim >= 89 && tickAnim < 92) {
            xx = 14.75 + (((tickAnim - 89) / 3) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 89) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 89) / 3) * (0 - (0)));
        } else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0 - (0)));
        } else if (tickAnim >= 98 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 98) / 4) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 98) / 4) * (0 - (0)));
            zz = 0 + (((tickAnim - 98) / 4) * (0 - (0)));
        } else if (tickAnim >= 102 && tickAnim < 104) {
            xx = 14.75 + (((tickAnim - 102) / 2) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 102) / 2) * (0 - (0)));
            zz = 0 + (((tickAnim - 102) / 2) * (0 - (0)));
        } else if (tickAnim >= 104 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 104) / 7) * (0 - (0)));
        } else if (tickAnim >= 111 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 111) / 7) * (37 - (0)));
            yy = 0 + (((tickAnim - 111) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 111) / 7) * (0 - (0)));
        } else if (tickAnim >= 118 && tickAnim < 121) {
            xx = 37 + (((tickAnim - 118) / 3) * (0 - (37)));
            yy = 0 + (((tickAnim - 118) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 118) / 3) * (0 - (0)));
        } else if (tickAnim >= 121 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 121) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 121) / 17) * (0 - (0)));
            zz = 0 + (((tickAnim - 121) / 17) * (0 - (0)));
        } else if (tickAnim >= 138 && tickAnim < 141) {
            xx = 0 + (((tickAnim - 138) / 3) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 138) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 138) / 3) * (0 - (0)));
        } else if (tickAnim >= 141 && tickAnim < 143) {
            xx = 14.75 + (((tickAnim - 141) / 2) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 141) / 2) * (0 - (0)));
            zz = 0 + (((tickAnim - 141) / 2) * (0 - (0)));
        } else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0 - (0)));
        } else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 150) / 7) * (37 - (0)));
            yy = 0 + (((tickAnim - 150) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 150) / 7) * (0 - (0)));
        } else if (tickAnim >= 157 && tickAnim < 160) {
            xx = 37 + (((tickAnim - 157) / 3) * (0 - (37)));
            yy = 0 + (((tickAnim - 157) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 157) / 3) * (0 - (0)));
        } else if (tickAnim >= 160 && tickAnim < 177) {
            xx = 0 + (((tickAnim - 160) / 17) * (0 - (0)));
            yy = 0 + (((tickAnim - 160) / 17) * (0 - (0)));
            zz = 0 + (((tickAnim - 160) / 17) * (0 - (0)));
        } else if (tickAnim >= 177 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 177) / 3) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 177) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 177) / 3) * (0 - (0)));
        } else if (tickAnim >= 180 && tickAnim < 183) {
            xx = 14.75 + (((tickAnim - 180) / 3) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 180) / 3) * (0 - (0)));
            zz = 0 + (((tickAnim - 180) / 3) * (0 - (0)));
        } else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            yy = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0 - (0)));
        } else if (tickAnim >= 189 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 189) / 4) * (14.75 - (0)));
            yy = 0 + (((tickAnim - 189) / 4) * (0 - (0)));
            zz = 0 + (((tickAnim - 189) / 4) * (0 - (0)));
        } else if (tickAnim >= 193 && tickAnim < 195) {
            xx = 14.75 + (((tickAnim - 193) / 2) * (0 - (14.75)));
            yy = 0 + (((tickAnim - 193) / 2) * (0 - (0)));
            zz = 0 + (((tickAnim - 193) / 2) * (0 - (0)));
        } else if (tickAnim >= 195 && tickAnim < 202) {
            xx = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            yy = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
            zz = 0 + (((tickAnim - 195) / 7) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = -6 + (((tickAnim - 20) / 182) * (-6 - (-6)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -6 + (((tickAnim - 202) / 18) * (0 - (-6)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.25 - (0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0 - (0)));
        } else if (tickAnim >= 20 && tickAnim < 202) {
            xx = -7.25 + (((tickAnim - 20) / 182) * (-7.25 - (-7.25)));
            yy = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
            zz = 0 + (((tickAnim - 20) / 182) * (0 - (0)));
        } else if (tickAnim >= 202 && tickAnim < 220) {
            xx = -7.25 + (((tickAnim - 202) / 18) * (0 - (-7.25)));
            yy = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
            zz = 0 + (((tickAnim - 202) / 18) * (0 - (0)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNqwebsaurus e = (EntityPrehistoricFloraNqwebsaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
