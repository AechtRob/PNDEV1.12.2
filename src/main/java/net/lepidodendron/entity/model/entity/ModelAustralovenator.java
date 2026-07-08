package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAustralovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAustralovenator extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Australovenator;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer leftClaw;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer rightClaw;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r21;
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

    public ModelAustralovenator() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.Australovenator = new AdvancedModelRenderer(this);
        this.Australovenator.setRotationPoint(0.0F, 2.75F, 0.5F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Australovenator.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 24, -3.5F, -4.5F, -4.25F, 7, 12, 10, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -3.0F, 5.75F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 35, -3.0F, -1.0257F, -1.6084F, 6, 9, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7757F, 8.3916F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 0, -2.0516F, -0.0376F, -1.3824F, 4, 6, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0515F, 0.2124F, 7.6176F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 54, -1.5258F, -0.0022F, -1.0615F, 3, 4, 9, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.0258F, 0.7478F, 7.9385F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 57, 6, -1.0F, -0.5F, -1.0F, 2, 3, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 57, 26, -0.5F, -0.5F, -1.0F, 1, 2, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 8.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1745F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 29, 0, -0.5F, -0.5F, -0.25F, 1, 1, 8, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, -4.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -4.4F, -10.0F, 9, 13, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -10.25F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 34, 15, -3.5F, -3.0F, -7.25F, 7, 11, 9, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(3.5F, 5.0F, -5.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.3491F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 66, 37, -1.5F, -1.9F, -1.0F, 3, 7, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.5F, 0.75F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.829F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 24, -1.0F, -0.55F, -0.65F, 2, 5, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.0F, 4.2F, 0.35F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.2182F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 56, 37, -2.0F, 0.0F, -1.0F, 2, 6, 1, 0.01F, false));
        this.leftHand.cubeList.add(new ModelBox(leftHand, 0, 46, -1.0F, 0.0F, 0.0F, 1, 5, 1, 0.01F, false));

        this.leftClaw = new AdvancedModelRenderer(this);
        this.leftClaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.leftHand.addChild(leftClaw);
        this.setRotateAngle(leftClaw, -0.3491F, 0.0F, 0.2618F);
        this.leftClaw.cubeList.add(new ModelBox(leftClaw, 30, 0, -2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-3.5F, 5.0F, -5.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.3491F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 66, 37, -1.5F, -1.9F, -1.0F, 3, 7, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.5F, 0.75F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.829F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 24, -1.0F, -0.55F, -0.65F, 2, 5, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.0F, 4.2F, 0.35F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, -0.2182F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 56, 37, 0.0F, 0.0F, -1.0F, 2, 6, 1, 0.01F, true));
        this.rightHand.cubeList.add(new ModelBox(rightHand, 0, 46, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.01F, true));

        this.rightClaw = new AdvancedModelRenderer(this);
        this.rightClaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rightHand.addChild(rightClaw);
        this.setRotateAngle(rightClaw, -0.3491F, 0.0F, -0.2618F);
        this.rightClaw.cubeList.add(new ModelBox(rightClaw, 30, 0, 0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.25F, -6.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5236F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 35, 54, -2.5F, -2.5F, -3.25F, 5, 7, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 57, 54, -2.0F, -2.5F, -3.25F, 4, 6, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 53, 65, -1.5F, -2.0F, -3.25F, 3, 5, 4, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5672F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 26, 50, -1.0F, -1.9F, -2.8F, 2, 4, 4, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 57, 18, -1.5F, -2.15F, -3.1F, 3, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.566F, -7.0298F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1619F, -0.2592F, -0.0373F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 35, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.566F, -7.0298F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1619F, 0.2592F, 0.0373F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 35, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.566F, -7.0298F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1396F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 0, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.6639F, -9.8909F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 46, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.7191F, -7.0471F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 8, -0.5F, -1.75F, -1.0F, 1, 1, 1, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 58, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.3928F, -9.5258F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1314F, -0.0865F, 0.0114F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5115F, 1.2786F, -6.628F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0005F, -0.0865F, 0.0114F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 0, 0.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5115F, 1.2786F, -6.628F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0005F, 0.0865F, -0.0114F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 0, 0.0F, -1.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.25F, 0.3928F, -9.5258F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1314F, 0.0865F, -0.0114F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.85F, -3.05F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 0, -0.5F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(-1.0F, -0.65F, -2.05F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 0, 31, -0.5F, -0.5F, -1.05F, 3, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1F, -0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 67, -1.5F, -0.25F, -2.7F, 3, 2, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.75F, -2.7F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 47, -0.5F, -1.0F, -3.9F, 2, 1, 4, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, -0.0176F, -9.1515F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0438F, -0.0872F, 0.0038F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5115F, -0.3868F, -6.144F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0871F, -0.0872F, 0.0038F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.0F, 1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5115F, -0.3868F, -6.144F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0871F, 0.0872F, -0.0038F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.25F, -0.0176F, -9.1515F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0438F, 0.0872F, -0.0038F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 7, 0.0F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 1.0948F, -6.5976F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 40, 0.5F, -1.0F, -3.1F, 1, 1, 4, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.25F, -2.7F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 67, -0.5F, 0.0F, -3.95F, 2, 1, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -0.25F, -2.65F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 51, 54, -0.5F, -1.95F, -0.05F, 3, 2, 2, -0.03F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -0.25F, 0.3F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 29, 6, -0.5F, -0.95F, -1.0F, 3, 1, 1, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.75F, -2.65F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.4102F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.throat.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6545F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 29, -0.5F, -2.0F, -0.05F, 2, 2, 3, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 1.5567F, 2.2085F);
        this.throat.addChild(throat2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.throat2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.0036F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 24, -1.0F, -2.073F, 0.0728F, 2, 2, 3, 0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0873F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 46, -2.0F, -2.0F, -2.0F, 4, 11, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.0F, -0.75F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.829F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 64, -1.5F, 0.0F, -1.25F, 3, 9, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -1.0F, -1.0F, -1.25F, 2, 7, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 6.0F, -0.25F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.2618F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 66, 21, -1.5F, -1.0F, -2.25F, 3, 2, 3, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 0.0F, -2.25F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 14, 46, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0873F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 46, -2.0F, -2.0F, -2.0F, 4, 11, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.0F, -0.75F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.829F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 64, -1.5F, 0.0F, -1.25F, 3, 9, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.0F, -1.0F, -1.25F, 2, 7, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 6.0F, -0.25F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.2618F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 66, 21, -1.5F, -1.0F, -2.25F, 3, 2, 3, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 0.0F, -2.25F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 14, 46, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Australovenator.render(f5);
    }
    public void renderStaticWall(float f) {
        this.chest.offsetZ = 0.05F;
        this.chest.offsetY = -0.025F;
        this.chest.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Australovenator.offsetY = -0.16F;
        this.Australovenator.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Australovenator.offsetY = 0.60F;
        this.Australovenator.offsetX = 0.0F;
        this.Australovenator.rotateAngleY = (float)Math.toRadians(220);
        this.Australovenator.rotateAngleX = (float)Math.toRadians(12);
        this.Australovenator.rotateAngleZ = (float)Math.toRadians(-2);
        this.Australovenator.scaleChildren = true;
        float scaler = 0.6F;
        this.Australovenator.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.Australovenator.render(f);
        //Reset rotations, positions and sizing:
        this.Australovenator.setScale(1.0F, 1.0F, 1.0F);
        this.Australovenator.scaleChildren = false;
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

        EntityPrehistoricFloraAustralovenator EntityAustralovenator = (EntityPrehistoricFloraAustralovenator) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.rightArm1, this.rightArm2, this.rightHand};
        AdvancedModelRenderer[] ArmR = {this.leftArm1, this.leftArm2, this.leftHand};

        EntityAustralovenator.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityAustralovenator.getAnimation() == EntityAustralovenator.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityAustralovenator.isReallyInWater()) {

                if (f3 == 0.0F || !EntityAustralovenator.getIsMoving()) {
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

                if (EntityAustralovenator.getIsFast()) { //Running


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
        EntityPrehistoricFloraAustralovenator ee = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;

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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -5 + (((tickAnim - 7) / 4) * (5.75-(-5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 11) / 4) * (0-(5.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -8 + (((tickAnim - 5) / 6) * (-7.5-(-8)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 11) / 4) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-23.4672-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-41.1141-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-52.3026-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -23.4672 + (((tickAnim - 3) / 4) * (-37.75-(-23.4672)));
            yy = -41.1141 + (((tickAnim - 3) / 4) * (0-(-41.1141)));
            zz = -52.3026 + (((tickAnim - 3) / 4) * (0-(-52.3026)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -37.75 + (((tickAnim - 7) / 8) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (24-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 7) / 8) * (0-(10.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 24 + (((tickAnim - 7) / 8) * (0-(24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -20.5 + (((tickAnim - 3) / 2) * (-31.08-(-20.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -31.08 + (((tickAnim - 5) / 2) * (25.5-(-31.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 25.5 + (((tickAnim - 7) / 8) * (0-(25.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-23.4672-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (41.1141-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (52.3026-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -23.4672 + (((tickAnim - 3) / 4) * (-45.25-(-23.4672)));
            yy = 41.1141 + (((tickAnim - 3) / 4) * (0-(41.1141)));
            zz = 52.3026 + (((tickAnim - 3) / 4) * (0-(52.3026)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -45.25 + (((tickAnim - 7) / 8) * (0-(-45.25)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -33.75 + (((tickAnim - 7) / 8) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-11.1884-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-3.5626-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (29.5877-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -11.1884 + (((tickAnim - 5) / 2) * (-18.1351-(-11.1884)));
            yy = -3.5626 + (((tickAnim - 5) / 2) * (-3.2448-(-3.5626)));
            zz = 29.5877 + (((tickAnim - 5) / 2) * (-29.8402-(29.5877)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -18.1351 + (((tickAnim - 7) / 8) * (0-(-18.1351)));
            yy = -3.2448 + (((tickAnim - 7) / 8) * (0-(-3.2448)));
            zz = -29.8402 + (((tickAnim - 7) / 8) * (0-(-29.8402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -8 + (((tickAnim - 5) / 6) * (15.25-(-8)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 15.25 + (((tickAnim - 11) / 4) * (0-(15.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-1.725-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -1.725 + (((tickAnim - 11) / 4) * (0-(-1.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -13 + (((tickAnim - 5) / 6) * (10.5-(-13)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10.5 + (((tickAnim - 11) / 4) * (0-(10.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 18.25 + (((tickAnim - 5) / 6) * (-2.75-(18.25)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2.75 + (((tickAnim - 11) / 4) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 6.5 + (((tickAnim - 5) / 6) * (-17.5-(6.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 11) / 4) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.6-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 11) / 4) * (0-(0.075)));
            zz = -0.6 + (((tickAnim - 11) / 4) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 9.5 + (((tickAnim - 5) / 6) * (-8.75-(9.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.75 + (((tickAnim - 11) / 4) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 11) / 4) * (0-(-0.175)));
            zz = -0.5 + (((tickAnim - 11) / 4) * (0-(-0.5)));
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
            xx = 0 + (((tickAnim - 5) / 3) * (42.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 42.25 + (((tickAnim - 8) / 3) * (0-(42.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -31.5 + (((tickAnim - 8) / 3) * (-1.75-(-31.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 11) / 4) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (51-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 51 + (((tickAnim - 11) / 4) * (0-(51)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 5) / 6) * (0.9-(1)));
            yy = 1 + (((tickAnim - 5) / 6) * (1.3-(1)));
            zz = 1 + (((tickAnim - 5) / 6) * (0.9-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.9 + (((tickAnim - 11) / 4) * (1-(0.9)));
            yy = 1.3 + (((tickAnim - 11) / 4) * (1-(1.3)));
            zz = 0.9 + (((tickAnim - 11) / 4) * (1-(0.9)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -14.5 + (((tickAnim - 18) / 14) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -14.5 + (((tickAnim - 32) / 9) * (47.585-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50-(-14.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 47.585-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50 + (((tickAnim - 41) / 9) * (0-(47.585-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*50)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-9.925-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.55-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = -9.925 + (((tickAnim - 18) / 14) * (-9.925-(-9.925)));
            zz = 4.55 + (((tickAnim - 18) / 14) * (4.55-(4.55)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            yy = -9.925 + (((tickAnim - 32) / 9) * (-3.86-(-9.925)));
            zz = 4.55 + (((tickAnim - 32) / 9) * (1.42-(4.55)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -3.86 + (((tickAnim - 41) / 9) * (0-(-3.86)));
            zz = 1.42 + (((tickAnim - 41) / 9) * (0-(1.42)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -9 + (((tickAnim - 18) / 14) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -9 + (((tickAnim - 32) / 9) * (-9-(-9)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 41) / 9) * (0-(-9)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (10-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 18) / 14) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 10 + (((tickAnim - 32) / 9) * (-6-(10)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 41) / 9) * (0-(-6)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 14 + (((tickAnim - 18) / 14) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 14 + (((tickAnim - 32) / 9) * (-3.25-(14)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 41) / 9) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (7-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 7 + (((tickAnim - 18) / 14) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 7 + (((tickAnim - 32) / 9) * (0-(7)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 9.5 + (((tickAnim - 18) / 14) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 9.5 + (((tickAnim - 32) / 9) * (0-(9.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.1976-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.2135-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.7117-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 19.1976 + (((tickAnim - 18) / 14) * (19.1976-(19.1976)));
            yy = 2.2135 + (((tickAnim - 18) / 14) * (2.2135-(2.2135)));
            zz = -2.7117 + (((tickAnim - 18) / 14) * (-2.7117-(-2.7117)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 19.1976 + (((tickAnim - 32) / 9) * (23.3488-(19.1976)));
            yy = 2.2135 + (((tickAnim - 32) / 9) * (1.1067-(2.2135)));
            zz = -2.7117 + (((tickAnim - 32) / 9) * (-1.3558-(-2.7117)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 23.3488 + (((tickAnim - 41) / 9) * (0-(23.3488)));
            yy = 1.1067 + (((tickAnim - 41) / 9) * (0-(1.1067)));
            zz = -1.3558 + (((tickAnim - 41) / 9) * (0-(-1.3558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -36 + (((tickAnim - 18) / 14) * (-36-(-36)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -36 + (((tickAnim - 32) / 9) * (-47.25-(-36)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -47.25 + (((tickAnim - 41) / 9) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.1976-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.2135-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.7117-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 19.1976 + (((tickAnim - 18) / 14) * (19.1976-(19.1976)));
            yy = -2.2135 + (((tickAnim - 18) / 14) * (-2.2135-(-2.2135)));
            zz = 2.7117 + (((tickAnim - 18) / 14) * (2.7117-(2.7117)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 19.1976 + (((tickAnim - 32) / 9) * (23.3488-(19.1976)));
            yy = -2.2135 + (((tickAnim - 32) / 9) * (-1.1067-(-2.2135)));
            zz = 2.7117 + (((tickAnim - 32) / 9) * (1.3558-(2.7117)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 23.3488 + (((tickAnim - 41) / 9) * (0-(23.3488)));
            yy = -1.1067 + (((tickAnim - 41) / 9) * (0-(-1.1067)));
            zz = 1.3558 + (((tickAnim - 41) / 9) * (0-(1.3558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -36 + (((tickAnim - 18) / 14) * (-36-(-36)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -36 + (((tickAnim - 32) / 9) * (-47.25-(-36)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -47.25 + (((tickAnim - 41) / 9) * (0-(-47.25)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 8 + (((tickAnim - 18) / 14) * (8-(8)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 8 + (((tickAnim - 32) / 9) * (-2.75-(8)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 41) / 9) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-34.2025-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.1087-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-8.995-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -34.2025 + (((tickAnim - 18) / 14) * (-34.2025-(-34.2025)));
            yy = -10.1087 + (((tickAnim - 18) / 14) * (-10.1087-(-10.1087)));
            zz = -8.995 + (((tickAnim - 18) / 14) * (-8.995-(-8.995)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -34.2025 + (((tickAnim - 32) / 9) * (-25.8512-(-34.2025)));
            yy = -10.1087 + (((tickAnim - 32) / 9) * (-5.0543-(-10.1087)));
            zz = -8.995 + (((tickAnim - 32) / 9) * (-4.4975-(-8.995)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -25.8512 + (((tickAnim - 41) / 9) * (0-(-25.8512)));
            yy = -5.0543 + (((tickAnim - 41) / 9) * (0-(-5.0543)));
            zz = -4.4975 + (((tickAnim - 41) / 9) * (0-(-4.4975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 39.75 + (((tickAnim - 18) / 14) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 32) / 18) * (0-(39.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-44.0861-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.4308-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (3.7252-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -44.0861 + (((tickAnim - 9) / 9) * (-63.4611-(-44.0861)));
            yy = 0.4308 + (((tickAnim - 9) / 9) * (1.1686-(0.4308)));
            zz = 3.7252 + (((tickAnim - 9) / 9) * (3.826-(3.7252)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -63.4611 + (((tickAnim - 18) / 14) * (-63.4611-(-63.4611)));
            yy = 1.1686 + (((tickAnim - 18) / 14) * (1.1686-(1.1686)));
            zz = 3.826 + (((tickAnim - 18) / 14) * (3.826-(3.826)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -63.4611 + (((tickAnim - 32) / 9) * (-34.596-(-63.4611)));
            yy = 1.1686 + (((tickAnim - 32) / 9) * (0.5312-(1.1686)));
            zz = 3.826 + (((tickAnim - 32) / 9) * (1.7391-(3.826)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -34.596 + (((tickAnim - 41) / 9) * (0-(-34.596)));
            yy = 0.5312 + (((tickAnim - 41) / 9) * (0-(0.5312)));
            zz = 1.7391 + (((tickAnim - 41) / 9) * (0-(1.7391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.275-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0.625 + (((tickAnim - 18) / 14) * (0.625-(0.625)));
            zz = 0.275 + (((tickAnim - 18) / 14) * (0.275-(0.275)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.625 + (((tickAnim - 32) / 18) * (0-(0.625)));
            zz = 0.275 + (((tickAnim - 32) / 18) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (48.13-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 48.13 + (((tickAnim - 9) / 9) * (73-(48.13)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 73 + (((tickAnim - 18) / 14) * (73-(73)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 73 + (((tickAnim - 32) / 9) * (34.68-(73)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 34.68 + (((tickAnim - 41) / 9) * (0-(34.68)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-34.2025-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (10.1087-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (8.995-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -34.2025 + (((tickAnim - 18) / 14) * (-34.2025-(-34.2025)));
            yy = 10.1087 + (((tickAnim - 18) / 14) * (10.1087-(10.1087)));
            zz = 8.995 + (((tickAnim - 18) / 14) * (8.995-(8.995)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -34.2025 + (((tickAnim - 32) / 9) * (-23.6012-(-34.2025)));
            yy = 10.1087 + (((tickAnim - 32) / 9) * (5.0543-(10.1087)));
            zz = 8.995 + (((tickAnim - 32) / 9) * (4.4975-(8.995)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -23.6012 + (((tickAnim - 41) / 9) * (0-(-23.6012)));
            yy = 5.0543 + (((tickAnim - 41) / 9) * (0-(5.0543)));
            zz = 4.4975 + (((tickAnim - 41) / 9) * (0-(4.4975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 39.75 + (((tickAnim - 18) / 14) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 32) / 18) * (0-(39.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-44.0861-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.4308-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-3.7252-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -44.0861 + (((tickAnim - 9) / 9) * (-63.4611-(-44.0861)));
            yy = -0.4308 + (((tickAnim - 9) / 9) * (-1.1686-(-0.4308)));
            zz = -3.7252 + (((tickAnim - 9) / 9) * (-3.826-(-3.7252)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -63.4611 + (((tickAnim - 18) / 14) * (-63.4611-(-63.4611)));
            yy = -1.1686 + (((tickAnim - 18) / 14) * (-1.1686-(-1.1686)));
            zz = -3.826 + (((tickAnim - 18) / 14) * (-3.826-(-3.826)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -63.4611 + (((tickAnim - 32) / 9) * (-36.846-(-63.4611)));
            yy = -1.1686 + (((tickAnim - 32) / 9) * (-0.5312-(-1.1686)));
            zz = -3.826 + (((tickAnim - 32) / 9) * (-1.7391-(-3.826)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -36.846 + (((tickAnim - 41) / 9) * (0-(-36.846)));
            yy = -0.5312 + (((tickAnim - 41) / 9) * (0-(-0.5312)));
            zz = -1.7391 + (((tickAnim - 41) / 9) * (0-(-1.7391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.275-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0.625 + (((tickAnim - 18) / 14) * (0.625-(0.625)));
            zz = 0.275 + (((tickAnim - 18) / 14) * (0.275-(0.275)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0.625 + (((tickAnim - 32) / 18) * (0-(0.625)));
            zz = 0.275 + (((tickAnim - 32) / 18) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (48.13-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 48.13 + (((tickAnim - 9) / 9) * (73-(48.13)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 73 + (((tickAnim - 18) / 14) * (73-(73)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 73 + (((tickAnim - 32) / 9) * (34.6582-(73)));
            yy = 0 + (((tickAnim - 32) / 9) * (1.7153-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (-1.4564-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 34.6582 + (((tickAnim - 41) / 9) * (0-(34.6582)));
            yy = 1.7153 + (((tickAnim - 41) / 9) * (0-(1.7153)));
            zz = -1.4564 + (((tickAnim - 41) / 9) * (0-(-1.4564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.76-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -18.76 + (((tickAnim - 8) / 9) * (-27.25-(-18.76)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = -27.25 + (((tickAnim - 17) / 16) * (19.25-(-27.25)));
            yy = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 33) / 17) * (0-(19.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.38-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 6.38 + (((tickAnim - 8) / 9) * (-12.5-(6.38)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 17) / 7) * (7.5-(-12.5)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 24) / 9) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 33) / 7) * (25.75-(7.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 40) / 10) * (0-(25.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-51.65-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -51.65 + (((tickAnim - 8) / 9) * (23-(-51.65)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 23 + (((tickAnim - 17) / 7) * (-5.75-(23)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -5.75 + (((tickAnim - 24) / 16) * (18.02-(-5.75)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 18.02 + (((tickAnim - 40) / 6) * (-53.99-(18.02)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -53.99 + (((tickAnim - 46) / 4) * (0-(-53.99)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (73.9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 73.9 + (((tickAnim - 8) / 9) * (17-(73.9)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 17 + (((tickAnim - 17) / 7) * (5-(17)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 24) / 9) * (38.5-(5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 38.5 + (((tickAnim - 33) / 7) * (70.35-(38.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 70.35 + (((tickAnim - 40) / 3) * (98.65-(70.35)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 98.65 + (((tickAnim - 43) / 7) * (0-(98.65)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = -0.425 + (((tickAnim - 17) / 4) * (0.48-(-0.425)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.48 + (((tickAnim - 21) / 3) * (0-(0.48)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0.405-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.405 + (((tickAnim - 29) / 4) * (-0.41-(0.405)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            yy = -0.41 + (((tickAnim - 33) / 13) * (1.725-(-0.41)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 1.725 + (((tickAnim - 46) / 4) * (0-(1.725)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -31.75 + (((tickAnim - 29) / 4) * (-59-(-31.75)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -59 + (((tickAnim - 33) / 7) * (0-(-59)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (42.25-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 42.25 + (((tickAnim - 43) / 3) * (61.41-(42.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 61.41 + (((tickAnim - 46) / 4) * (0-(61.41)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 4) * (-0.575-(0)));
            zz = 0.325 + (((tickAnim - 29) / 4) * (0.455-(0.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.575 + (((tickAnim - 33) / 7) * (0-(-0.575)));
            zz = 0.455 + (((tickAnim - 33) / 7) * (0-(0.455)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.7-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0.7 + (((tickAnim - 43) / 3) * (0.89-(0.7)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0.89 + (((tickAnim - 46) / 4) * (0-(0.89)));
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

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37.25 + (((tickAnim - 10) / 10) * (0-(37.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17 + (((tickAnim - 10) / 3) * (17-(17)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 13) / 7) * (0-(17)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 10) / 3) * (20.06-(16.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20.06 + (((tickAnim - 13) / 7) * (0-(20.06)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.75 + (((tickAnim - 5) / 5) * (-12-(3.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12 + (((tickAnim - 10) / 3) * (0.25-(-12)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 13) / 7) * (0-(0.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 5) / 5) * (-15.75-(8.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.75 + (((tickAnim - 10) / 3) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (11.25-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 16) / 4) * (0-(11.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 5) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (0-(12.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.25 + (((tickAnim - 10) / 10) * (0-(12.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (4.2484-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (3.7497-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.0492-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 4.2484 + (((tickAnim - 14) / 16) * (0-(4.2484)));
            yy = 3.7497 + (((tickAnim - 14) / 16) * (0-(3.7497)));
            zz = -0.0492 + (((tickAnim - 14) / 16) * (0-(-0.0492)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (5.25-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 5.25 + (((tickAnim - 47) / 13) * (0-(5.25)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-8.55-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = -8.55 + (((tickAnim - 14) / 16) * (-15.6-(-8.55)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = -15.6 + (((tickAnim - 30) / 4) * (-15.6-(-15.6)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = -15.6 + (((tickAnim - 34) / 26) * (0-(-15.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 4 + (((tickAnim - 10) / 20) * (0-(4)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = -1.25 + (((tickAnim - 34) / 13) * (-5.75-(-1.25)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -5.75 + (((tickAnim - 47) / 13) * (0-(-5.75)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 3.5 + (((tickAnim - 10) / 20) * (11.25-(3.5)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 11.25 + (((tickAnim - 30) / 4) * (10-(11.25)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 10 + (((tickAnim - 34) / 13) * (-22.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+50))*50-(10)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -22.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+50))*50 + (((tickAnim - 47) / 13) * (0-(-22.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70+50))*50)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -3.25 + (((tickAnim - 10) / 20) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (2-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 2 + (((tickAnim - 34) / 13) * (8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*20-(2)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*20 + (((tickAnim - 47) / 13) * (0-(8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*20)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -8.75 + (((tickAnim - 10) / 20) * (-69.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(-8.75)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = -69.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 30) / 4) * (4.75-(-69.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 4.75 + (((tickAnim - 34) / 13) * (34.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(4.75)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 34.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 47) / 13) * (0-(34.95-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -5.75 + (((tickAnim - 10) / 20) * (13.25-(-5.75)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 13.25 + (((tickAnim - 30) / 4) * (16.5-(13.25)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 16.5 + (((tickAnim - 34) / 13) * (39.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-50-(16.5)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 39.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-50 + (((tickAnim - 47) / 13) * (0-(39.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-50)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-16.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -16.5 + (((tickAnim - 10) / 10) * (-19.17-(-16.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = -19.17 + (((tickAnim - 20) / 6) * (-6-(-19.17)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -6 + (((tickAnim - 26) / 8) * (36.25-(-6)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 36.25 + (((tickAnim - 34) / 6) * (32.975-(36.25)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 32.975 + (((tickAnim - 40) / 7) * (-12.825-(32.975)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 47) / 4) * (0-(0)));
            yy = -12.825 + (((tickAnim - 47) / 4) * (-13.17-(-12.825)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            yy = -13.17 + (((tickAnim - 51) / 4) * (14.81-(-13.17)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 14.81 + (((tickAnim - 55) / 5) * (0-(14.81)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 14) * (1.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 0) / 14) * (2.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 1.75 + (((tickAnim - 14) / 16) * (0-(1.75)));
            yy = 2.75 + (((tickAnim - 14) / 16) * (0-(2.75)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-3-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = -3 + (((tickAnim - 34) / 13) * (0-(-3)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 14) * (-0.7078-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 0) / 14) * (-2.3691-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.9923-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -0.7078 + (((tickAnim - 14) / 16) * (0-(-0.7078)));
            yy = -2.3691 + (((tickAnim - 14) / 16) * (0-(-2.3691)));
            zz = -0.9923 + (((tickAnim - 14) / 16) * (0-(-0.9923)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-12.6718-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 14) / 16) * (-15.4786-(22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -12.6718 + (((tickAnim - 14) / 16) * (-12.6718-(-12.6718)));
            zz = 34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 14) / 16) * (-71.444-(34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -15.4786 + (((tickAnim - 30) / 4) * (-15.0334-(-15.4786)));
            yy = -12.6718 + (((tickAnim - 30) / 4) * (-12.5064-(-12.6718)));
            zz = -71.444 + (((tickAnim - 30) / 4) * (-73.4862-(-71.444)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = -15.0334 + (((tickAnim - 34) / 26) * (0-(-15.0334)));
            yy = -12.5064 + (((tickAnim - 34) / 26) * (0-(-12.5064)));
            zz = -73.4862 + (((tickAnim - 34) / 26) * (0-(-73.4862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-32-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -32 + (((tickAnim - 14) / 16) * (0-(-32)));
            yy = -12.25 + (((tickAnim - 14) / 16) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (-25-(0)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -25 + (((tickAnim - 47) / 13) * (0-(-25)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (12.6718-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 14) / 16) * (-15.4786-(-22.7036-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 12.6718 + (((tickAnim - 14) / 16) * (12.6718-(12.6718)));
            zz = -34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 14) / 16) * (71.444-(-34.581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -15.4786 + (((tickAnim - 30) / 4) * (-14.9782-(-15.4786)));
            yy = 12.6718 + (((tickAnim - 30) / 4) * (12.4846-(12.6718)));
            zz = 71.444 + (((tickAnim - 30) / 4) * (73.7414-(71.444)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = -14.9782 + (((tickAnim - 34) / 26) * (0-(-14.9782)));
            yy = 12.4846 + (((tickAnim - 34) / 26) * (0-(12.4846)));
            zz = 73.7414 + (((tickAnim - 34) / 26) * (0-(73.7414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-32-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (12.25-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -32 + (((tickAnim - 14) / 16) * (0-(-32)));
            yy = 12.25 + (((tickAnim - 14) / 16) * (0-(12.25)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.3963-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-4.2439-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (5.653-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -0.3963 + (((tickAnim - 14) / 16) * (16.25-(-0.3963)));
            yy = -4.2439 + (((tickAnim - 14) / 16) * (0-(-4.2439)));
            zz = 5.653 + (((tickAnim - 14) / 16) * (0-(5.653)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 16.25 + (((tickAnim - 30) / 4) * (19.75-(16.25)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 19.75 + (((tickAnim - 34) / 13) * (-10.75-(19.75)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -10.75 + (((tickAnim - 47) / 13) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -8.25 + (((tickAnim - 14) / 9) * (-11.91-(-8.25)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -11.91 + (((tickAnim - 23) / 7) * (0-(-11.91)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 7.5 + (((tickAnim - 34) / 13) * (0-(7.5)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-0.0172-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.1218-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-2.861-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -0.0172 + (((tickAnim - 14) / 9) * (-13.2672-(-0.0172)));
            yy = 1.1218 + (((tickAnim - 14) / 9) * (1.1218-(1.1218)));
            zz = -2.861 + (((tickAnim - 14) / 9) * (-2.861-(-2.861)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -13.2672 + (((tickAnim - 23) / 7) * (0-(-13.2672)));
            yy = 1.1218 + (((tickAnim - 23) / 7) * (0-(1.1218)));
            zz = -2.861 + (((tickAnim - 23) / 7) * (0-(-2.861)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = -7.5 + (((tickAnim - 34) / 13) * (-6.75-(-7.5)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -6.75 + (((tickAnim - 47) / 13) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4.06-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.06 + (((tickAnim - 23) / 7) * (-18.75-(-4.06)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -18.75 + (((tickAnim - 30) / 4) * (-21.25-(-18.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = -21.25 + (((tickAnim - 34) / 13) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (10.81-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 10.81 + (((tickAnim - 23) / 7) * (-5.5-(10.81)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = -5.5 + (((tickAnim - 30) / 17) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 14) / 4) * (20-(20)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 18) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 20 + (((tickAnim - 30) / 17) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -14 + (((tickAnim - 14) / 4) * (-14-(-14)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -14 + (((tickAnim - 18) / 5) * (-10.75-(-14)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -10.75 + (((tickAnim - 23) / 7) * (-10.5-(-10.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = -10.5 + (((tickAnim - 30) / 17) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (0.9-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 0.9 + (((tickAnim - 30) / 17) * (1-(0.9)));
            yy = 1 + (((tickAnim - 30) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 12.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 9) / 5) * (-27-(12.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -27 + (((tickAnim - 14) / 16) * (0-(-27)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -27.5 + (((tickAnim - 47) / 6) * (-22.25-(-27.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -22.25 + (((tickAnim - 53) / 7) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (54.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 54.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 5) / 9) * (-11.75-(54.57-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -11.75 + (((tickAnim - 14) / 16) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -18.25 + (((tickAnim - 47) / 6) * (24.87-(-18.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 24.87 + (((tickAnim - 53) / 7) * (0-(24.87)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-46.91-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -46.91 + (((tickAnim - 7) / 4) * (-121.21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-46.91)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -121.21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 11) / 3) * (18.25-(-121.21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 18.25 + (((tickAnim - 14) / 16) * (0-(18.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (19.25-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 19.25 + (((tickAnim - 47) / 6) * (-50.87-(19.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -50.87 + (((tickAnim - 53) / 7) * (0-(-50.87)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (86.62-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 86.62 + (((tickAnim - 7) / 4) * (86.62-(86.62)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 86.62 + (((tickAnim - 11) / 3) * (17.25-(86.62)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 17.25 + (((tickAnim - 14) / 16) * (0-(17.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (20.75-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 20.75 + (((tickAnim - 47) / 6) * (77.38-(20.75)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 77.38 + (((tickAnim - 53) / 7) * (0-(77.38)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.825-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.175-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 7) / 4) * (1.825-(1.825)));
            zz = 0.175 + (((tickAnim - 7) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 1.825 + (((tickAnim - 11) / 3) * (0-(1.825)));
            zz = 0.175 + (((tickAnim - 11) / 3) * (0-(0.175)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0.875-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 23) / 7) * (0-(0.875)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 7) * (0.765-(0)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            yy = 0.765 + (((tickAnim - 41) / 6) * (-0.4-(0.765)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = -0.4 + (((tickAnim - 47) / 13) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 28.75 + (((tickAnim - 7) / 7) * (0-(28.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (28.5-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 28.5 + (((tickAnim - 53) / 7) * (0-(28.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.55-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 7) / 7) * (0-(0.1)));
            zz = 0.55 + (((tickAnim - 7) / 7) * (0-(0.55)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 13) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0.65 + (((tickAnim - 53) / 7) * (0-(0.65)));
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
            xx = 0 + (((tickAnim - 0) / 14) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 22.75 + (((tickAnim - 14) / 16) * (-17.75-(22.75)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -17.75 + (((tickAnim - 30) / 4) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -17.75 + (((tickAnim - 34) / 6) * (-6.6-(-17.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -6.6 + (((tickAnim - 40) / 7) * (19-(-6.6)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 19 + (((tickAnim - 47) / 13) * (0-(19)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (22.7-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 22.7 + (((tickAnim - 21) / 2) * (19.64-(22.7)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.64 + (((tickAnim - 23) / 7) * (-12-(19.64)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -12 + (((tickAnim - 30) / 4) * (-12-(-12)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 34) / 6) * (35.88-(-12)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 35.88 + (((tickAnim - 40) / 7) * (6.5-(35.88)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 6.5 + (((tickAnim - 47) / 6) * (0.66-(6.5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.66 + (((tickAnim - 53) / 7) * (0-(0.66)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 11.5 + (((tickAnim - 14) / 4) * (19.75-(11.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 19.75 + (((tickAnim - 18) / 5) * (-46.82-(19.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -46.82 + (((tickAnim - 23) / 3) * (-46.82-(-46.82)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -46.82 + (((tickAnim - 26) / 4) * (6-(-46.82)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 6 + (((tickAnim - 30) / 4) * (6-(6)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 6 + (((tickAnim - 34) / 26) * (0-(6)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 39.75 + (((tickAnim - 14) / 7) * (91.25-(39.75)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 91.25 + (((tickAnim - 21) / 9) * (24.25-(91.25)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 24.25 + (((tickAnim - 30) / 4) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 24.25 + (((tickAnim - 34) / 6) * (57.33-(24.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 57.33 + (((tickAnim - 40) / 7) * (51.75-(57.33)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 51.75 + (((tickAnim - 47) / 6) * (-16.25-(51.75)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -16.25 + (((tickAnim - 53) / 7) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (1.44-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0.15-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 1.44 + (((tickAnim - 21) / 9) * (-0.225-(1.44)));
            zz = 0.15 + (((tickAnim - 21) / 9) * (0-(0.15)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 30) / 4) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 34) / 3) * (1.305-(-0.225)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 1.305 + (((tickAnim - 37) / 3) * (1.05-(1.305)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            yy = 1.05 + (((tickAnim - 40) / 7) * (-0.625-(1.05)));
            zz = 0 + (((tickAnim - 40) / 7) * (-0.325-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 47) / 6) * (-0.675-(-0.625)));
            zz = -0.325 + (((tickAnim - 47) / 6) * (0-(-0.325)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -0.675 + (((tickAnim - 53) / 7) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-79-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -79 + (((tickAnim - 14) / 7) * (44-(-79)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 44 + (((tickAnim - 21) / 9) * (0-(44)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (-44.17-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -44.17 + (((tickAnim - 37) / 3) * (38.25-(-44.17)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 38.25 + (((tickAnim - 40) / 7) * (-87.25-(38.25)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -87.25 + (((tickAnim - 47) / 6) * (0-(-87.25)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
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
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-1.025-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (-0.65-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            yy = -1.025 + (((tickAnim - 14) / 7) * (0.325-(-1.025)));
            zz = -0.65 + (((tickAnim - 14) / 7) * (0.725-(-0.65)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.325 + (((tickAnim - 21) / 9) * (0-(0.325)));
            zz = 0.725 + (((tickAnim - 21) / 9) * (0-(0.725)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.7-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (-0.39-(0)));
            zz = 0.7 + (((tickAnim - 40) / 3) * (0.79-(0.7)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = -0.39 + (((tickAnim - 43) / 4) * (-0.775-(-0.39)));
            zz = 0.79 + (((tickAnim - 43) / 4) * (-0.425-(0.79)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 47) / 6) * (0-(-0.775)));
            zz = -0.425 + (((tickAnim - 47) / 6) * (0-(-0.425)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 47) {
            xx = 20.25 + (((tickAnim - 30) / 17) * (0-(20.25)));
            yy = 0 + (((tickAnim - 30) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = -5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-7 + (((tickAnim - 5) / 20) * (-6.75-(-5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-7)));
            yy = 0 + (((tickAnim - 5) / 20) * (1.0518-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (1.8546-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 25) / 5) * (-6.75-(-6.75)));
            yy = 1.0518 + (((tickAnim - 25) / 5) * (1.0518-(1.0518)));
            zz = 1.8546 + (((tickAnim - 25) / 5) * (1.8546-(1.8546)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -6.75 + (((tickAnim - 30) / 15) * (-6.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*7-(-6.75)));
            yy = 1.0518 + (((tickAnim - 30) / 15) * (0-(1.0518)));
            zz = 1.8546 + (((tickAnim - 30) / 15) * (0-(1.8546)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -6.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*7 + (((tickAnim - 45) / 10) * (0-(-6.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*7)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = -2.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1 + (((tickAnim - 5) / 20) * (-6.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1-(-2.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -6.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1 + (((tickAnim - 25) / 5) * (-7.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*-1-(-6.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-1)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*-1 + (((tickAnim - 30) / 15) * (-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*8-(-7.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*-1)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*8 + (((tickAnim - 45) / 10) * (0-(-6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-220))*8)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (23.4524-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (5.6947-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-5.9793-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.4524 + (((tickAnim - 25) / 5) * (23.4524-(23.4524)));
            yy = 5.6947 + (((tickAnim - 25) / 5) * (5.6947-(5.6947)));
            zz = -5.9793 + (((tickAnim - 25) / 5) * (-5.9793-(-5.9793)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 23.4524 + (((tickAnim - 30) / 15) * (0-(23.4524)));
            yy = 5.6947 + (((tickAnim - 30) / 15) * (0-(5.6947)));
            zz = -5.9793 + (((tickAnim - 30) / 15) * (0-(-5.9793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (23.4524-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-5.6947-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (5.9793-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.4524 + (((tickAnim - 25) / 5) * (23.4524-(23.4524)));
            yy = -5.6947 + (((tickAnim - 25) / 5) * (-5.6947-(-5.6947)));
            zz = 5.9793 + (((tickAnim - 25) / 5) * (5.9793-(5.9793)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 23.4524 + (((tickAnim - 30) / 15) * (0-(23.4524)));
            yy = -5.6947 + (((tickAnim - 30) / 15) * (0-(-5.6947)));
            zz = 5.9793 + (((tickAnim - 30) / 15) * (0-(5.9793)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = -1.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2 + (((tickAnim - 5) / 20) * (-4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2-(-1.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2 + (((tickAnim - 25) / 5) * (-4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2-(-4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2 + (((tickAnim - 30) / 1) * (-6.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5-(-4.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5))*-2)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -6.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5 + (((tickAnim - 31) / 14) * (0.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5-(-6.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5 + (((tickAnim - 45) / 10) * (0-(0.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = -6.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2 + (((tickAnim - 5) / 20) * (-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2-(-6.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2 + (((tickAnim - 25) / 5) * (-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-2-(-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-120))*-2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-2 + (((tickAnim - 30) / 15) * (-3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-5-(-10.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-2)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-5 + (((tickAnim - 45) / 10) * (0-(-3.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-120))*-5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2 + (((tickAnim - 5) / 20) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2-(8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2 + (((tickAnim - 25) / 5) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2 + (((tickAnim - 30) / 15) * (-1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*45-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*400/0.5-220))*-2)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*45 + (((tickAnim - 45) / 10) * (0-(-1.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*45)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 4.5 + (((tickAnim - 5) / 20) * (-20-(4.5)));
            yy = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -20 + (((tickAnim - 25) / 5) * (-20-(-20)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -20 + (((tickAnim - 30) / 15) * (-11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-80))*20-(-20)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-80))*20 + (((tickAnim - 45) / 10) * (0-(-11.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-80))*20)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -6 + (((tickAnim - 45) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.25 + (((tickAnim - 5) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5 + (((tickAnim - 17) / 8) * (5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5-(5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5 + (((tickAnim - 25) / 5) * (5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5-(5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5 + (((tickAnim - 30) / 1) * (13.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*-5-(5.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*5)));
            yy = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 13.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*-5 + (((tickAnim - 31) / 14) * (33.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5-(13.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*-5)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 33.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5 + (((tickAnim - 45) / 10) * (0-(33.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (0.9-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.9 + (((tickAnim - 25) / 5) * (0.9-(0.9)));
            yy = 1 + (((tickAnim - 25) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 25) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5 + (((tickAnim - 17) / 8) * (23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5-(14.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5 + (((tickAnim - 25) / 5) * (23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5-(23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5 + (((tickAnim - 30) / 4) * (0-(23.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*700/0.5))*-5)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 34) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (0.9-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (1.1225-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.9 + (((tickAnim - 25) / 5) * (0.9-(0.9)));
            yy = 1.1225 + (((tickAnim - 25) / 5) * (1.13-(1.1225)));
            zz = 1 + (((tickAnim - 25) / 5) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0.9 + (((tickAnim - 30) / 25) * (1-(0.9)));
            yy = 1.13 + (((tickAnim - 30) / 25) * (1-(1.13)));
            zz = 1 + (((tickAnim - 30) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.75 + (((tickAnim - 30) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-1.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+110))*-2-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+110))*-2 + (((tickAnim - 40) / 10) * (0-(-1.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*350+110))*-2)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-6.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -6.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10 + (((tickAnim - 40) / 4) * (-11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(-6.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-10)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 44) / 4) * (2.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*20-(-11.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 2.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*20 + (((tickAnim - 48) / 2) * (0-(2.175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*20)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (0.165-(1)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 18) / 12) * (1-(1)));
            yy = 0.165 + (((tickAnim - 18) / 12) * (0.07-(0.165)));
            zz = 1 + (((tickAnim - 18) / 12) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 30) / 20) * (1-(1)));
            yy = 0.07 + (((tickAnim - 30) / 20) * (1-(0.07)));
            zz = 1 + (((tickAnim - 30) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (19.96-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 19.96 + (((tickAnim - 18) / 12) * (26.5-(19.96)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 26.5 + (((tickAnim - 30) / 10) * (-20.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50-(26.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -20.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 40) / 4) * (3.25-(-20.35-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 3.25 + (((tickAnim - 44) / 4) * (0-(3.25)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-16.13-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -16.13 + (((tickAnim - 18) / 12) * (-19.5-(-16.13)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.5 + (((tickAnim - 30) / 10) * (24.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50-(-19.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 24.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50 + (((tickAnim - 40) / 4) * (-3-(24.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*50)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -3 + (((tickAnim - 44) / 4) * (0-(-3)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 34;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-65))*2), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-50))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-40))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-40))*1);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-50))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-150))*2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-100))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-100))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-150))*3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-200))*5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-200))*5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-200))*4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-250))*5), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-250))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-250))*5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-300))*8), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-300))*11), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210-300))*8));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-20))*-3), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-50))*-2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210+70))*-2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+50))*4), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210))*1));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+150))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0.2);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0.025);


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+120))*4), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+50))*4), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210))*1));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-10.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+150))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0.2);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0.025);


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5+120))*4), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-120))*-2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-150))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-190))*-2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-250))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-400))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-400))*2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -21.75 + (((tickAnim - 0) / 17) * (18-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 18 + (((tickAnim - 17) / 4) * (75.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(18)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 75.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 21) / 13) * (-21.75-(75.24-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 0) / 17) * (21.5-(1.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 17) / 6) * (38.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(21.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 38.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 23) / 11) * (1.5-(38.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 9.5 + (((tickAnim - 0) / 17) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 17) / 8) * (-48.5-(17.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -48.5 + (((tickAnim - 25) / 3) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -48.5 + (((tickAnim - 28) / 6) * (9.5-(-48.5)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 2) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            yy = -0.3 + (((tickAnim - 9) / 8) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
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
            xx = 8.75 + (((tickAnim - 0) / 4) * (-5.81-(8.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -5.81 + (((tickAnim - 4) / 5) * (-25.02-(-5.81)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -25.02 + (((tickAnim - 9) / 3) * (9.82-(-25.02)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 9.82 + (((tickAnim - 12) / 5) * (54-(9.82)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 54 + (((tickAnim - 17) / 8) * (112.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(54)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 112.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 25) / 3) * (56.25-(112.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 56.25 + (((tickAnim - 28) / 6) * (8.75-(56.25)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 4) * (-0.35-(0.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 5) * (-0.95-(-0.35)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -0.95 + (((tickAnim - 9) / 3) * (0.255-(-0.95)));
            zz = 0 + (((tickAnim - 9) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.255 + (((tickAnim - 12) / 5) * (0.5-(0.255)));
            zz = 0.2 + (((tickAnim - 12) / 5) * (0-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 17) / 8) * (1.575-(0.5)));
            zz = 0 + (((tickAnim - 17) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 1.575 + (((tickAnim - 25) / 9) * (0.5-(1.575)));
            zz = 0.225 + (((tickAnim - 25) / 9) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (-45.31-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -45.31 + (((tickAnim - 12) / 5) * (0-(-45.31)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (35.98-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 35.98 + (((tickAnim - 21) / 4) * (26-(35.98)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 26 + (((tickAnim - 25) / 9) * (0-(26)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0.165-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.525 + (((tickAnim - 12) / 5) * (0-(-0.525)));
            zz = 0.165 + (((tickAnim - 12) / 5) * (0.65-(0.165)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0.65 + (((tickAnim - 17) / 4) * (0.685-(0.65)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0.685 + (((tickAnim - 21) / 4) * (0.55-(0.685)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0.55 + (((tickAnim - 25) / 9) * (0-(0.55)));
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
            xx = 18 + (((tickAnim - 0) / 4) * (27.515-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(18)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 27.515-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 4) / 14) * (-21.75-(27.515-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = -21.75 + (((tickAnim - 18) / 16) * (18-(-21.75)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 21.5 + (((tickAnim - 0) / 6) * (2.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(21.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 2.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 6) / 12) * (1.5-(2.11-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 1.5 + (((tickAnim - 18) / 16) * (21.5-(1.5)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 0) / 8) * (-48.5-(17.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -48.5 + (((tickAnim - 8) / 4) * (-48.5-(-48.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -48.5 + (((tickAnim - 12) / 6) * (9.5-(-48.5)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 9.5 + (((tickAnim - 18) / 16) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 16) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 24) / 3) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 27) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
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
            xx = 54 + (((tickAnim - 0) / 4) * (80.94-(54)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 80.94 + (((tickAnim - 4) / 4) * (74.5-(80.94)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 74.5 + (((tickAnim - 8) / 10) * (8.75-(74.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 18) / 4) * (-5.81-(8.75)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.81 + (((tickAnim - 22) / 5) * (-25.02-(-5.81)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -25.02 + (((tickAnim - 27) / 2) * (9.82-(-25.02)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 9.82 + (((tickAnim - 29) / 5) * (54-(9.82)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 4) * (1.39-(0.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.11-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.39 + (((tickAnim - 4) / 4) * (2.075-(1.39)));
            zz = 0.11 + (((tickAnim - 4) / 4) * (0.225-(0.11)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 2.075 + (((tickAnim - 8) / 10) * (0.5-(2.075)));
            zz = 0.225 + (((tickAnim - 8) / 10) * (0-(0.225)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 4) * (-0.35-(0.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 22) / 5) * (-0.95-(-0.35)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.95 + (((tickAnim - 27) / 2) * (0.255-(-0.95)));
            zz = 0 + (((tickAnim - 27) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 0.255 + (((tickAnim - 29) / 5) * (0.5-(0.255)));
            zz = 0.2 + (((tickAnim - 29) / 5) * (0-(0.2)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (35.98-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 35.98 + (((tickAnim - 4) / 4) * (26-(35.98)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 26 + (((tickAnim - 8) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (-45.31-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = -45.31 + (((tickAnim - 29) / 5) * (0-(-45.31)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.685-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0.685 + (((tickAnim - 4) / 4) * (0.55-(0.685)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.55 + (((tickAnim - 8) / 10) * (0-(0.55)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0.315-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 29) / 5) * (0-(-0.6)));
            zz = 0.315 + (((tickAnim - 29) / 5) * (0-(0.315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*210/0.5-280))*3), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

   }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAustralovenator entity = (EntityPrehistoricFloraAustralovenator) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0.35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-120))*5.5), hips.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-80))*-1), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-80))*-3.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-190))*-2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+50))*-4), tail1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*-3), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*-3.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-50))*-5), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*-3.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*-6), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*-8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*-7), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-150))*-12), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-150))*-8));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-150))*-8), tail5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-200))*-15), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-200))*-12));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-9), tail6.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-250))*-18), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-250))*-18));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-50))*-2.5), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-80))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432))*4.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0.9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*-6), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*4.5));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(25.2411-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*-5), leftArm1.rotateAngleY + (float) Math.toRadians(19.6595), leftArm1.rotateAngleZ + (float) Math.toRadians(-4.954+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-25.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(25.2411-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*-5), rightArm1.rotateAngleY + (float) Math.toRadians(-19.6595), rightArm1.rotateAngleZ + (float) Math.toRadians(4.954+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-25.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(6.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-150))*-6), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-10.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-250))*-6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-350))*-6), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-450))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.75), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.setScale((float)0.9,(float)1,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -27.25 + (((tickAnim - 0) / 8) * (26.5-(-27.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 26.5 + (((tickAnim - 8) / 4) * (121.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(26.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 121.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 12) / 5) * (-27.25-(121.13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -13.75 + (((tickAnim - 0) / 4) * (5.25-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.25 + (((tickAnim - 4) / 4) * (13.25-(5.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13.25 + (((tickAnim - 8) / 4) * (1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 12) / 5) * (-13.75-(1.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 19.5 + (((tickAnim - 0) / 2) * (4.58-(19.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 4.58 + (((tickAnim - 2) / 2) * (16.9-(4.58)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 16.9 + (((tickAnim - 4) / 4) * (26-(16.9)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 26 + (((tickAnim - 8) / 5) * (-147.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350-(26)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -147.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350 + (((tickAnim - 13) / 1) * (-183.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-147.9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -183.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 14) / 3) * (19.5-(-183.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
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
            xx = 16.25 + (((tickAnim - 0) / 2) * (13.3972-(16.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.1895-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.199-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 13.3972 + (((tickAnim - 2) / 2) * (-16.4-(13.3972)));
            yy = 1.1895 + (((tickAnim - 2) / 2) * (0-(1.1895)));
            zz = -2.199 + (((tickAnim - 2) / 2) * (0-(-2.199)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16.4 + (((tickAnim - 4) / 4) * (36-(-16.4)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 36 + (((tickAnim - 8) / 4) * (87-(36)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 87 + (((tickAnim - 12) / 1) * (85.75-(87)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 85.75 + (((tickAnim - 13) / 4) * (16.25-(85.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.35 + (((tickAnim - 0) / 2) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5-(1.35)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5 + (((tickAnim - 2) / 2) * (-1.025-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5)));
            zz = 0.2 + (((tickAnim - 2) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -1.025 + (((tickAnim - 4) / 2) * (-0.11-(-1.025)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 6) / 2) * (0.5-(-0.11)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 4) * (2.205-(0.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.275-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 2.205 + (((tickAnim - 12) / 1) * (2.305-(2.205)));
            zz = 0.275 + (((tickAnim - 12) / 1) * (0.2-(0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 2.305 + (((tickAnim - 13) / 4) * (1.35-(2.305)));
            zz = 0.2 + (((tickAnim - 13) / 4) * (0-(0.2)));
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
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -32.75 + (((tickAnim - 6) / 2) * (-27-(-32.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -27 + (((tickAnim - 8) / 0) * (20.25-(-27)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 20.25 + (((tickAnim - 8) / 4) * (47-(20.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 47 + (((tickAnim - 12) / 5) * (0-(47)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
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
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-0.31-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.31 + (((tickAnim - 6) / 2) * (0.125-(-0.31)));
            zz = 0.45 + (((tickAnim - 6) / 2) * (0.45-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 4) * (0.265-(0.125)));
            zz = 0.45 + (((tickAnim - 8) / 4) * (0.775-(0.45)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 12) / 5) * (0-(0.265)));
            zz = 0.775 + (((tickAnim - 12) / 5) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.5 + (((tickAnim - 0) / 3) * (32.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(26.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 32.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 3) / 5) * (-27.25-(32.58-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1 + (((tickAnim - 3) / 5) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -27.25 + (((tickAnim - 8) / 9) * (26.5-(-27.25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.25 + (((tickAnim - 0) / 3) * (-8.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 3) / 5) * (-13.75-(-8.8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1 + (((tickAnim - 3) / 5) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5 + (((tickAnim - 3) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432-80))*-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -13.75 + (((tickAnim - 8) / 5) * (1.75-(-13.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.75 + (((tickAnim - 13) / 4) * (13.25-(1.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26 + (((tickAnim - 0) / 3) * (-208.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250-(26)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -208.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250 + (((tickAnim - 3) / 2) * (-114.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-208.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*250)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -114.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 5) / 3) * (19.5-(-114.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 8) / 2) * (4.58-(19.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.58 + (((tickAnim - 10) / 3) * (11.65-(4.58)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 11.65 + (((tickAnim - 13) / 4) * (26-(11.65)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
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
            xx = 36 + (((tickAnim - 0) / 3) * (108.75-(36)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 108.75 + (((tickAnim - 3) / 2) * (85.75-(108.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 85.75 + (((tickAnim - 5) / 3) * (17-(85.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17 + (((tickAnim - 8) / 2) * (15.92-(17)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15.92 + (((tickAnim - 10) / 3) * (-8.15-(15.92)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -8.15 + (((tickAnim - 13) / 4) * (36-(-8.15)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.73-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.73 + (((tickAnim - 3) / 2) * (1.855-(1.73)));
            zz = 0.275 + (((tickAnim - 3) / 2) * (0.2-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.855 + (((tickAnim - 5) / 3) * (1.525-(1.855)));
            zz = 0.2 + (((tickAnim - 5) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 8) / 2) * (0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5-(1.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5 + (((tickAnim - 10) / 3) * (-0.775-(0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-5)));
            zz = 0.2 + (((tickAnim - 10) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.775 + (((tickAnim - 13) / 1) * (0.315-(-0.775)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.315 + (((tickAnim - 14) / 3) * (0.725-(0.315)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
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
            xx = 20.25 + (((tickAnim - 0) / 3) * (47-(20.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 47 + (((tickAnim - 3) / 5) * (0-(47)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -32.75 + (((tickAnim - 14) / 2) * (-27-(-32.75)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -27 + (((tickAnim - 16) / 1) * (20.25-(-27)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (0.265-(0.125)));
            zz = 0.45 + (((tickAnim - 0) / 3) * (0.775-(0.45)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 3) / 5) * (0-(0.265)));
            zz = 0.775 + (((tickAnim - 3) / 5) * (0-(0.775)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.31-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0.45-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.31 + (((tickAnim - 14) / 3) * (0.125-(-0.31)));
            zz = 0.45 + (((tickAnim - 14) / 3) * (0.45-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(8.5), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAustralovenator e = (EntityPrehistoricFloraAustralovenator) entity;
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
