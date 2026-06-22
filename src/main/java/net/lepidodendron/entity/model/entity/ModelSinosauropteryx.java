package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinosauropteryx;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinosauropteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
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
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelSinosauropteryx() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 42, 49, -2.0F, -1.5F, -2.0F, 4, 6, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.6F, -2.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 60, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.75F, 0.5F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.3491F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 52, 0, -1.0F, -0.75F, -1.0F, 2, 5, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 3.75F, -0.25F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1345F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 32, 51, -0.25F, -0.25F, -0.75F, 1, 7, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 58, 60, -0.75F, -0.25F, -0.75F, 1, 7, 2, -0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 38, 51, -0.5F, -0.25F, -0.5F, 1, 4, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 3.75F, 0.25F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -1.309F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 64, 58, -1.0F, -0.25F, -0.5F, 2, 2, 1, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 64, 31, -1.5F, -0.25F, -0.5F, 3, 3, 1, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.75F, 0.5F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3491F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 52, 0, -1.0F, -0.75F, -1.0F, 2, 5, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 3.75F, -0.25F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.1345F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 32, 51, -0.75F, -0.25F, -0.75F, 1, 7, 2, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 58, 60, -0.25F, -0.25F, -0.75F, 1, 7, 2, -0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 38, 51, -0.5F, -0.25F, -0.5F, 1, 4, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 3.75F, 0.25F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -1.309F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 64, 58, -1.0F, -0.25F, -0.5F, 2, 2, 1, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 64, 31, -1.5F, -0.25F, -0.5F, 3, 3, 1, -0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 22, 40, -1.5F, -1.15F, -0.5F, 3, 4, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.85F, 6.5F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1658F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 11, -1.0F, -1.0F, -7.0F, 2, 1, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.9F, 0.5F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 58, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 27, -1.5F, -0.9F, -0.5F, 3, 3, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 31, -2.0F, 0.1F, -0.5F, 4, 1, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 20, -0.5F, -1.9F, -0.5F, 1, 5, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 7.25F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 38, -1.5F, -0.6F, -0.25F, 3, 2, 8, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 11, -2.5F, 0.15F, -0.25F, 5, 1, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 48, -0.5F, -1.6F, -0.25F, 1, 5, 8, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 40, -1.5F, 0.9F, -0.25F, 3, 1, 8, -0.02F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 7.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 0, -1.0F, -0.65F, -0.25F, 2, 2, 9, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -2.5F, -0.15F, -0.25F, 5, 1, 10, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 11, -0.5F, -1.85F, -0.25F, 1, 5, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, -1.75F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 24, 20, -2.5F, -1.35F, -5.75F, 5, 5, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 3.9F, -5.75F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 33, -1.5F, -1.0F, 0.0F, 4, 1, 5, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 18, 51, -2.0F, -1.25F, -2.75F, 4, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.75F, -2.5F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 64, 4, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.75F, 1.75F, -2.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7854F, 0.4363F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 18, 48, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7854F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 38, 56, -0.5F, -0.25F, -0.5F, 1, 2, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.5F, 1.75F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.3054F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 22, 27, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.leftHand.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 58, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.75F, 1.75F, -2.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.7854F, -0.4363F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 18, 48, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7854F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 38, 56, -0.5F, -0.25F, -0.5F, 1, 2, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.5F, 1.75F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.3054F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 22, 27, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.rightHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 58, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.25F, -2.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3054F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 60, 49, -1.5F, -1.25F, -2.5F, 3, 2, 3, 0.01F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 60, 54, -1.5F, 0.25F, -2.5F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.75F, -2.5F);
        this.neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 0, -1.5F, 0.0F, 0.25F, 2, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -1.75F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.6545F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 46, 60, -1.0F, -0.5F, -3.5F, 2, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.25F, 1.5F, -2.5F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 61, -0.25F, -0.75F, -0.6F, 1, 1, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6109F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 10, 61, -1.0F, -0.75F, -1.75F, 2, 2, 2, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -1.5F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 64, 39, -1.0F, -0.35F, -1.75F, 2, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.35F, -1.75F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2211F, -0.1618F, -0.0362F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 64, 23, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.35F, -1.75F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2211F, 0.1618F, 0.0362F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 23, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.35F, -1.75F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 64, 7, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.25F, -0.9477F, -1.8023F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4102F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 27, -0.25F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.25F, -0.35F, -1.75F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 42, -0.75F, -0.6F, 0.0F, 2, 1, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -0.35F, -2.1F);
        this.head.addChild(eyes);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyes.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 9, -1.0F, -0.25F, 0.5F, 2, 1, 1, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6F, -0.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 19, -0.5F, -0.45F, -4.4F, 1, 1, 3, -0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.95F, -0.45F, -1.65F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1745F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 35, 0.0F, 0.0F, -2.65F, 1, 1, 3, -0.03F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.95F, -0.45F, -1.65F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 35, -1.0F, 0.0F, -2.65F, 1, 1, 3, -0.03F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.45F, -1.6F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 9, -1.0F, -0.95F, 0.0F, 2, 1, 1, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.2F, -1.65F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0524F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 45, -1.0F, -0.25F, 0.0F, 2, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.offsetY = -0.01F;
        this.chest.offsetZ = -0.058F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.2F;
        this.hips.offsetX = 0.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 1.0F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.hips.offsetY = -0.005F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraSinosauropteryx entitySinosauropteryx = (EntityPrehistoricFloraSinosauropteryx) e;

        if (entitySinosauropteryx.getAnimation() == entitySinosauropteryx.NO_ANIMATION) {
            this.faceTarget(f3, f4, 10, neck1);
            this.faceTarget(f3, f4, 10, neck2);
            this.faceTarget(f3, f4, 10, neck3);
            this.faceTarget(f3, f4, 10, head);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        entitySinosauropteryx.tailBuffer.applyChainSwingBuffer(Tail);

//        if (entitySinosauropteryx.getAnimation() == entitySinosauropteryx.LAY_ANIMATION) {
//            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
//            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
//        }
//        else {
        if (!entitySinosauropteryx.isReallyInWater()) {

            if (f3 == 0.0F || !entitySinosauropteryx.getIsMoving()) {
                if (entitySinosauropteryx.getAnimation() == entitySinosauropteryx.NO_ANIMATION) {
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
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                }

                return;
            }

            if (entitySinosauropteryx.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eyes.setScale(1,1,1);
        EntityPrehistoricFloraSinosauropteryx ee = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    if (ee.getIsCuriousWalking()) { //layer this on top:
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime); //this was animHopping if we are to change back
                    }
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The social anim
            animChatter(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_CURIOUS1) {
            //animCurious1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE_CURIOUS2) {
            //animCurious2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE1) {
            //animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE2) {
            //animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE3) {
           // animIdle3(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE4) {
            //animIdle4(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            //animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }

    public void animChatter(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 19.75 + (((tickAnim - 40) / 26) * (16.75-(19.75)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 16.75 + (((tickAnim - 66) / 34) * (0-(16.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-3.575-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            yy = -3.575 + (((tickAnim - 40) / 26) * (-3.575-(-3.575)));
            zz = -2.25 + (((tickAnim - 40) / 26) * (-2.25-(-2.25)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = -3.575 + (((tickAnim - 66) / 34) * (0-(-3.575)));
            zz = -2.25 + (((tickAnim - 66) / 34) * (0-(-2.25)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-14.24567-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.6626-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.74899-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -14.24567 + (((tickAnim - 40) / 26) * (-11.99567-(-14.24567)));
            yy = -0.6626 + (((tickAnim - 40) / 26) * (-0.6626-(-0.6626)));
            zz = -0.74899 + (((tickAnim - 40) / 26) * (-0.74899-(-0.74899)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -11.99567 + (((tickAnim - 66) / 34) * (0-(-11.99567)));
            yy = -0.6626 + (((tickAnim - 66) / 34) * (0-(-0.6626)));
            zz = -0.74899 + (((tickAnim - 66) / 34) * (0-(-0.74899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 26.25 + (((tickAnim - 40) / 26) * (26.50435-(26.25)));
            yy = 0 + (((tickAnim - 40) / 26) * (-0.05975-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (-0.08465-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 26.50435 + (((tickAnim - 66) / 34) * (0-(26.50435)));
            yy = -0.05975 + (((tickAnim - 66) / 34) * (0-(-0.05975)));
            zz = -0.08465 + (((tickAnim - 66) / 34) * (0-(-0.08465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-44-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -44 + (((tickAnim - 40) / 26) * (-41.75-(-44)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -41.75 + (((tickAnim - 66) / 34) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0.8 + (((tickAnim - 40) / 26) * (0.8-(0.8)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0.8 + (((tickAnim - 66) / 34) * (0-(0.8)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 12.25 + (((tickAnim - 40) / 26) * (10.75-(12.25)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 10.75 + (((tickAnim - 66) / 34) * (0-(10.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.07 + (((tickAnim - 20) / 20) * (-0.15-(-0.07)));
            zz = -0.225 + (((tickAnim - 20) / 20) * (0-(-0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 26) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = -0.15 + (((tickAnim - 66) / 34) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-14.24567-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.6626-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.74899-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -14.24567 + (((tickAnim - 40) / 26) * (-11.99567-(-14.24567)));
            yy = -0.6626 + (((tickAnim - 40) / 26) * (-0.6626-(-0.6626)));
            zz = -0.74899 + (((tickAnim - 40) / 26) * (-0.74899-(-0.74899)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -11.99567 + (((tickAnim - 66) / 34) * (0-(-11.99567)));
            yy = -0.6626 + (((tickAnim - 66) / 34) * (0-(-0.6626)));
            zz = -0.74899 + (((tickAnim - 66) / 34) * (0-(-0.74899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 26.25 + (((tickAnim - 40) / 26) * (26.50435-(26.25)));
            yy = 0 + (((tickAnim - 40) / 26) * (-0.05975-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (-0.08465-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 26.50435 + (((tickAnim - 66) / 34) * (0-(26.50435)));
            yy = -0.05975 + (((tickAnim - 66) / 34) * (0-(-0.05975)));
            zz = -0.08465 + (((tickAnim - 66) / 34) * (0-(-0.08465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-44-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -44 + (((tickAnim - 40) / 26) * (-41.75-(-44)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -41.75 + (((tickAnim - 66) / 34) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0.8 + (((tickAnim - 40) / 26) * (0.8-(0.8)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0.8 + (((tickAnim - 66) / 34) * (0-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 12.25 + (((tickAnim - 40) / 26) * (10.75-(12.25)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 10.75 + (((tickAnim - 66) / 34) * (0-(10.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.07 + (((tickAnim - 20) / 20) * (-0.15-(-0.07)));
            zz = -0.225 + (((tickAnim - 20) / 20) * (0-(-0.225)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            yy = -0.15 + (((tickAnim - 40) / 26) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = -0.15 + (((tickAnim - 66) / 34) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 10 + (((tickAnim - 40) / 26) * (23.75-(10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 40) / 26) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 77) {
            xx = 23.75 + (((tickAnim - 66) / 11) * (22-(23.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 66) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 66) / 11) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 22 + (((tickAnim - 77) / 23) * (0-(22)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 77) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
            zz = 0 + (((tickAnim - 77) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (-0.3-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = -0.3 + (((tickAnim - 66) / 34) * (0-(-0.3)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-4.4102-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.00369-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -4.4102 + (((tickAnim - 40) / 26) * (20.8398-(-4.4102)));
            yy = 0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2 + (((tickAnim - 40) / 26) * (0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2-(0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2)));
            zz = -0.00369 + (((tickAnim - 40) / 26) * (-0.00369-(-0.00369)));
        }
        else if (tickAnim >= 66 && tickAnim < 77) {
            xx = 20.8398 + (((tickAnim - 66) / 11) * (18.3398-(20.8398)));
            yy = 0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2 + (((tickAnim - 66) / 11) * (0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2-(0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2)));
            zz = -0.00369 + (((tickAnim - 66) / 11) * (-0.00369-(-0.00369)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 18.3398 + (((tickAnim - 77) / 23) * (0-(18.3398)));
            yy = 0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2 + (((tickAnim - 77) / 23) * (0-(0.8948502431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*2)));
            zz = -0.00369 + (((tickAnim - 77) / 23) * (0-(-0.00369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -5.25 + (((tickAnim - 40) / 13) * (-11.58-(-5.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 40) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = -11.58 + (((tickAnim - 53) / 13) * (12.25-(-11.58)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 53) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 77) {
            xx = 12.25 + (((tickAnim - 66) / 11) * (25-(12.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 66) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            zz = 0 + (((tickAnim - 66) / 11) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 25 + (((tickAnim - 77) / 23) * (0-(25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 77) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
            zz = 0 + (((tickAnim - 77) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 77) * (-0.425-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 77) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 23) * (0-(0)));
            zz = -0.425 + (((tickAnim - 77) / 23) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -12.75 + (((tickAnim - 40) / 26) * (-3.5-(-12.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 40) / 26) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 77) {
            xx = -3.5 + (((tickAnim - 66) / 11) * (28.5-(-3.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 66) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 66) / 11) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 100) {
            xx = 28.5 + (((tickAnim - 77) / 23) * (0-(28.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2 + (((tickAnim - 77) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*2)));
            zz = 0 + (((tickAnim - 77) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5 + (((tickAnim - 40) / 26) * (-2.25-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -2.25 + (((tickAnim - 66) / 34) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 3.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5 + (((tickAnim - 40) / 26) * (0.25-(3.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*5)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 0.25 + (((tickAnim - 66) / 34) * (0-(0.25)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (11.23-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 11.23 + (((tickAnim - 19) / 21) * (-5.25-(11.23)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -5.25 + (((tickAnim - 40) / 4) * (-8.5-(-5.25)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 66) {
            xx = -8.5 + (((tickAnim - 44) / 22) * (-14.75-(-8.5)));
            yy = 0 + (((tickAnim - 44) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 22) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -14.75 + (((tickAnim - 66) / 34) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (16.63-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 16.63 + (((tickAnim - 19) / 21) * (18-(16.63)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 18 + (((tickAnim - 40) / 4) * (15.25-(18)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 66) {
            xx = 15.25 + (((tickAnim - 44) / 22) * (10-(15.25)));
            yy = 0 + (((tickAnim - 44) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 22) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = 10 + (((tickAnim - 66) / 34) * (0-(10)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (3.43-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 3.43 + (((tickAnim - 16) / 13) * (-30.09-(3.43)));
            yy = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -30.09 + (((tickAnim - 29) / 11) * (-48.75-(-30.09)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -48.75 + (((tickAnim - 40) / 4) * (-54.9-(-48.75)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -54.9 + (((tickAnim - 44) / 9) * (-58.38-(-54.9)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 66) {
            xx = -58.38 + (((tickAnim - 53) / 13) * (-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25-(-58.38)));
            yy = 0 + (((tickAnim - 53) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 13) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25 + (((tickAnim - 66) / 34) * (0-(-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*25)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25.83-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 25.83 + (((tickAnim - 8) / 8) * (2.49-(25.83)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = 2.49 + (((tickAnim - 16) / 24) * (-29.75-(2.49)));
            yy = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 24) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = -29.75 + (((tickAnim - 40) / 26) * (-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*10-(-29.75)));
            yy = 0 + (((tickAnim - 40) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 100) {
            xx = -9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*10 + (((tickAnim - 66) / 34) * (0-(-9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*10)));
            yy = 0 + (((tickAnim - 66) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.45-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 8) / 92) * (0-(0)));
            yy = 0.175 + (((tickAnim - 8) / 92) * (0-(0.175)));
            zz = 0.45 + (((tickAnim - 8) / 92) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (17.25-(0)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 17.25 + (((tickAnim - 33) / 4) * (0-(17.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (17.25-(0)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 17.25 + (((tickAnim - 41) / 3) * (0-(17.25)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (17.25-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 17.25 + (((tickAnim - 48) / 4) * (0-(17.25)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 52) / 4) * (17.25-(0)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 17.25 + (((tickAnim - 56) / 3) * (0-(17.25)));
            yy = 0 + (((tickAnim - 56) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.59096-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.59096 + (((tickAnim - 15) / 20) * (-12.59096-(-12.59096)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.59096 + (((tickAnim - 35) / 15) * (0-(-12.59096)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-4.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -4.575 + (((tickAnim - 15) / 20) * (-4.575-(-4.575)));
            zz = 6.25 + (((tickAnim - 15) / 20) * (6.25-(6.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.575 + (((tickAnim - 35) / 15) * (0-(-4.575)));
            zz = 6.25 + (((tickAnim - 35) / 15) * (0-(6.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-38.74395-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.06862-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.64854-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -38.74395 + (((tickAnim - 15) / 20) * (-38.74395-(-38.74395)));
            yy = -1.06862 + (((tickAnim - 15) / 20) * (-1.06862-(-1.06862)));
            zz = -0.64854 + (((tickAnim - 15) / 20) * (-0.64854-(-0.64854)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -38.74395 + (((tickAnim - 35) / 15) * (0-(-38.74395)));
            yy = -1.06862 + (((tickAnim - 35) / 15) * (0-(-1.06862)));
            zz = -0.64854 + (((tickAnim - 35) / 15) * (0-(-0.64854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29 + (((tickAnim - 15) / 20) * (29-(29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 35) / 15) * (0-(29)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -53.25 + (((tickAnim - 15) / 20) * (-53.25-(-53.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (77.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 77.5 + (((tickAnim - 15) / 20) * (77.5-(77.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 77.5 + (((tickAnim - 35) / 15) * (0-(77.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 7) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-38.74395-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.06862-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.64854-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -38.74395 + (((tickAnim - 15) / 20) * (-38.74395-(-38.74395)));
            yy = 1.06862 + (((tickAnim - 15) / 20) * (1.06862-(1.06862)));
            zz = 0.64854 + (((tickAnim - 15) / 20) * (0.64854-(0.64854)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -38.74395 + (((tickAnim - 35) / 15) * (0-(-38.74395)));
            yy = 1.06862 + (((tickAnim - 35) / 15) * (0-(1.06862)));
            zz = 0.64854 + (((tickAnim - 35) / 15) * (0-(0.64854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29 + (((tickAnim - 15) / 20) * (29-(29)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 35) / 15) * (0-(29)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.75 + (((tickAnim - 15) / 20) * (0.75-(0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.75 + (((tickAnim - 35) / 15) * (0-(0.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -53.25 + (((tickAnim - 15) / 20) * (-53.25-(-53.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (77.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 77.5 + (((tickAnim - 15) / 20) * (77.5-(77.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 77.5 + (((tickAnim - 35) / 15) * (0-(77.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 7) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.75 + (((tickAnim - 15) / 20) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.75 + (((tickAnim - 35) / 15) * (0-(-8.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.5 + (((tickAnim - 15) / 20) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 35) / 15) * (0-(11.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 15) / 20) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 35) / 15) * (0-(17.5)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (45.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 45.75 + (((tickAnim - 15) / 8) * (-16.75-(45.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -16.75 + (((tickAnim - 23) / 5) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (45.75-(0)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 45.75 + (((tickAnim - 39) / 6) * (-16.75-(45.75)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 45) / 5) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (24-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 45) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 24.25 + (((tickAnim - 15) / 8) * (-49.92-(24.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -49.92 + (((tickAnim - 23) / 5) * (0-(-49.92)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 28) / 11) * (24.25-(0)));
            yy = 0 + (((tickAnim - 28) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 11) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 24.25 + (((tickAnim - 39) / 6) * (-49.92-(24.25)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -49.92 + (((tickAnim - 45) / 5) * (0-(-49.92)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -12 + (((tickAnim - 3) / 3) * (3.25-(-12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 6) / 2) * (43.31-(3.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 43.31 + (((tickAnim - 8) / 7) * (37.5-(43.31)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 37.5 + (((tickAnim - 15) / 8) * (77.5-(37.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 77.5 + (((tickAnim - 23) / 5) * (0-(77.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (-12-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -12 + (((tickAnim - 30) / 3) * (3.25-(-12)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 3.25 + (((tickAnim - 33) / 1) * (43.31-(3.25)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 43.31 + (((tickAnim - 34) / 5) * (37.5-(43.31)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 37.5 + (((tickAnim - 39) / 6) * (77.5-(37.5)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 77.5 + (((tickAnim - 45) / 5) * (0-(77.5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.32 + (((tickAnim - 3) / 3) * (-0.35-(-0.32)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 6) / 2) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (2.015-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (-0.11-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 2.015 + (((tickAnim - 19) / 4) * (1.3-(2.015)));
            zz = -0.11 + (((tickAnim - 19) / 4) * (-0.15-(-0.11)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 23) / 5) * (0-(1.3)));
            zz = -0.15 + (((tickAnim - 23) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.32-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -0.32 + (((tickAnim - 30) / 3) * (-0.35-(-0.32)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 33) / 1) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 9) * (2.015-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (-0.11-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 2.015 + (((tickAnim - 43) / 2) * (1.3-(2.015)));
            zz = -0.11 + (((tickAnim - 43) / 2) * (-0.15-(-0.11)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 45) / 5) * (0-(1.3)));
            zz = -0.15 + (((tickAnim - 45) / 5) * (0-(-0.15)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -27.25 + (((tickAnim - 6) / 2) * (-78.44-(-27.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -78.44 + (((tickAnim - 8) / 5) * (0-(-78.44)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 12 + (((tickAnim - 15) / 8) * (38-(12)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 38 + (((tickAnim - 23) / 5) * (0-(38)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = -27.25 + (((tickAnim - 33) / 1) * (-78.44-(-27.25)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -78.44 + (((tickAnim - 34) / 4) * (0-(-78.44)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 38) / 1) * (12-(0)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 12 + (((tickAnim - 39) / 6) * (38-(12)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 45) / 5) * (0-(38)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
            zz = 0.175 + (((tickAnim - 8) / 5) * (0-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 1) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0.175-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 4) * (0-(-0.2)));
            zz = 0.175 + (((tickAnim - 34) / 4) * (0-(0.175)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 3) / 5) * (17-(-5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17 + (((tickAnim - 8) / 5) * (0-(17)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10.25 + (((tickAnim - 3) / 5) * (19.5-(-10.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 19.5 + (((tickAnim - 8) / 5) * (0-(19.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12 + (((tickAnim - 3) / 3) * (-29.5-(12)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -29.5 + (((tickAnim - 6) / 2) * (-33-(-29.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -33 + (((tickAnim - 8) / 5) * (0-(-33)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 3) / 5) * (0-(0.075)));
            zz = 0.125 + (((tickAnim - 3) / 5) * (0-(0.125)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-4.45-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.45 + (((tickAnim - 3) / 3) * (6.4-(-4.45)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.4 + (((tickAnim - 6) / 2) * (-34.25-(6.4)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -34.25 + (((tickAnim - 8) / 5) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 3) / 3) * (45-(12.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 45 + (((tickAnim - 6) / 2) * (0-(45)));
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

    public void animIdle4(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;

    }

    public void animIdle3(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;


    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;


    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 8) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 1.25 + (((tickAnim - 18) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 1.25 + (((tickAnim - 28) / 12) * (0-(1.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2 + (((tickAnim - 8) / 5) * (-1.25-(2)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 13) / 5) * (2-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 2 + (((tickAnim - 18) / 10) * (2-(2)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 28) / 12) * (0-(2)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 8) / 5) * (-4-(2.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 13) / 5) * (2.5-(-4)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 2.5 + (((tickAnim - 18) / 5) * (-1-(2.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1 + (((tickAnim - 23) / 5) * (2.5-(-1)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 28) / 12) * (0-(2.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.5 + (((tickAnim - 8) / 5) * (-10-(-3.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 13) / 5) * (-3.5-(-10)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.5 + (((tickAnim - 18) / 10) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 28) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 8) / 5) * (4.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 4.5 + (((tickAnim - 13) / 5) * (-10-(4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 18) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 28) / 12) * (0-(-10)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -9.25 + (((tickAnim - 3) / 5) * (-23-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -23 + (((tickAnim - 8) / 5) * (0-(-23)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-23-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -23 + (((tickAnim - 18) / 5) * (0-(-23)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (-23-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -23 + (((tickAnim - 28) / 12) * (0-(-23)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 8) / 5) * (0-(27.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 27.75 + (((tickAnim - 18) / 5) * (0-(27.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 27.75 + (((tickAnim - 28) / 12) * (0-(27.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
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
            xx = 0 + (((tickAnim - 0) / 10) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.5 + (((tickAnim - 10) / 10) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 32 + (((tickAnim - 5) / 5) * (18.5-(32)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 10) / 10) * (0-(18.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (44-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 44 + (((tickAnim - 10) / 10) * (0-(44)));
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
            yy = 0 + (((tickAnim - 0) / 10) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.5 + (((tickAnim - 10) / 3) * (11.75-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 13) / 7) * (0-(11.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 16.25 + (((tickAnim - 5) / 3) * (-8.62-(16.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.62 + (((tickAnim - 8) / 2) * (-15.75-(-8.62)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15.75 + (((tickAnim - 10) / 3) * (16.38-(-15.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 16.38 + (((tickAnim - 13) / 7) * (0-(16.38)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.3 + (((tickAnim - 5) / 5) * (0-(0.3)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (33-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33 + (((tickAnim - 8) / 2) * (0-(33)));
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

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -23.74755 + (((tickAnim - 0) / 10) * (40.75-(-23.74755)));
            yy = -0.51863 + (((tickAnim - 0) / 10) * (0-(-0.51863)));
            zz = -0.54179 + (((tickAnim - 0) / 10) * (0-(-0.54179)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40.75 + (((tickAnim - 10) / 5) * (-15.82843-(40.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (-4.6941-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.75837-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.82843 + (((tickAnim - 15) / 5) * (-23.74755-(-15.82843)));
            yy = -4.6941 + (((tickAnim - 15) / 5) * (-0.51863-(-4.6941)));
            zz = -0.75837 + (((tickAnim - 15) / 5) * (-0.54179-(-0.75837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15.5 + (((tickAnim - 0) / 10) * (6.25-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 10) / 5) * (25.88-(6.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.88 + (((tickAnim - 15) / 5) * (-15.5-(25.88)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 0) / 10) * (20.5-(25.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.5 + (((tickAnim - 10) / 5) * (-47.37-(20.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -47.37 + (((tickAnim - 15) / 3) * (-37.18-(-47.37)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.18 + (((tickAnim - 18) / 2) * (25.5-(-37.18)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14 + (((tickAnim - 0) / 3) * (-12.83-(14)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -12.83 + (((tickAnim - 3) / 4) * (58.96-(-12.83)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 58.96 + (((tickAnim - 7) / 3) * (50-(58.96)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 50 + (((tickAnim - 10) / 2) * (85.29-(50)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 85.29 + (((tickAnim - 12) / 3) * (73.88-(85.29)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 73.88 + (((tickAnim - 15) / 3) * (78.19-(73.88)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 78.19 + (((tickAnim - 18) / 2) * (14-(78.19)));
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
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 2) * (0.665-(0.525)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 2) / 1) * (0.475-(0.665)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 3) / 2) * (1.08-(0.475)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.09-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.08 + (((tickAnim - 5) / 2) * (0.48-(1.08)));
            zz = -0.09 + (((tickAnim - 5) / 2) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 7) / 5) * (1.625-(0.48)));
            zz = -0.175 + (((tickAnim - 7) / 5) * (-0.19-(-0.175)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 12) / 1) * (2.31-(1.625)));
            zz = -0.19 + (((tickAnim - 12) / 1) * (-0.19-(-0.19)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.31 + (((tickAnim - 13) / 2) * (1.255-(2.31)));
            zz = -0.19 + (((tickAnim - 13) / 2) * (-0.195-(-0.19)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.255 + (((tickAnim - 15) / 5) * (0.525-(1.255)));
            zz = -0.195 + (((tickAnim - 15) / 5) * (0-(-0.195)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 40.75 + (((tickAnim - 0) / 5) * (-15.82843-(40.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.6941-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.75837-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.82843 + (((tickAnim - 5) / 5) * (-23.74755-(-15.82843)));
            yy = -4.6941 + (((tickAnim - 5) / 5) * (-0.51863-(-4.6941)));
            zz = -0.75837 + (((tickAnim - 5) / 5) * (-0.54179-(-0.75837)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.74755 + (((tickAnim - 10) / 10) * (40.75-(-23.74755)));
            yy = -0.51863 + (((tickAnim - 10) / 10) * (0-(-0.51863)));
            zz = -0.54179 + (((tickAnim - 10) / 10) * (0-(-0.54179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6.25 + (((tickAnim - 0) / 5) * (25.88-(6.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.88 + (((tickAnim - 5) / 5) * (-15.5-(25.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 10) / 10) * (6.25-(-15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 0) / 5) * (-47.37-(20.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -47.37 + (((tickAnim - 5) / 3) * (-37.18-(-47.37)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.18 + (((tickAnim - 8) / 2) * (25.5-(-37.18)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.5 + (((tickAnim - 10) / 10) * (20.5-(25.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 50 + (((tickAnim - 0) / 2) * (85.29-(50)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 85.29 + (((tickAnim - 2) / 3) * (73.88-(85.29)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 73.88 + (((tickAnim - 5) / 3) * (78.19-(73.88)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 78.19 + (((tickAnim - 8) / 2) * (14-(78.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 10) / 3) * (-14.33-(14)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -14.33 + (((tickAnim - 13) / 4) * (55.71-(-14.33)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 55.71 + (((tickAnim - 17) / 3) * (50-(55.71)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.19-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 2) / 1) * (2.31-(1.625)));
            zz = -0.19 + (((tickAnim - 2) / 1) * (-0.19-(-0.19)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 2.31 + (((tickAnim - 3) / 2) * (1.255-(2.31)));
            zz = -0.19 + (((tickAnim - 3) / 2) * (-0.195-(-0.19)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.255 + (((tickAnim - 5) / 5) * (0.325-(1.255)));
            zz = -0.195 + (((tickAnim - 5) / 5) * (0-(-0.195)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 10) / 2) * (1.015-(0.325)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.015 + (((tickAnim - 12) / 1) * (0.475-(1.015)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 2) * (1.08-(0.475)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.09-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.08 + (((tickAnim - 15) / 2) * (0.355-(1.08)));
            zz = -0.09 + (((tickAnim - 15) / 2) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.355 + (((tickAnim - 17) / 3) * (0-(0.355)));
            zz = -0.175 + (((tickAnim - 17) / 3) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 29.5 + (((tickAnim - 0) / 10) * (0-(29.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-99-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -99 + (((tickAnim - 17) / 3) * (29.5-(-99)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.325 + (((tickAnim - 17) / 3) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 17) / 3) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-99-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -99 + (((tickAnim - 7) / 3) * (29.5-(-99)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.5 + (((tickAnim - 10) / 10) * (0-(29.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.325 + (((tickAnim - 7) / 13) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 7) / 13) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*3.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*12), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*18), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-7), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-7), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-8.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -36.7161 + (((tickAnim - 0) / 6) * (55.25-(-36.7161)));
            yy = -2.39995 + (((tickAnim - 0) / 6) * (0-(-2.39995)));
            zz = -1.77639 + (((tickAnim - 0) / 6) * (0-(-1.77639)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 55.25 + (((tickAnim - 6) / 4) * (-42.07843-(55.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (-4.6941-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.75837-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -42.07843 + (((tickAnim - 10) / 2) * (-36.7161-(-42.07843)));
            yy = -4.6941 + (((tickAnim - 10) / 2) * (-2.39995-(-4.6941)));
            zz = -0.75837 + (((tickAnim - 10) / 2) * (-1.77639-(-0.75837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -15.5 + (((tickAnim - 0) / 6) * (-8.75-(-15.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -8.75 + (((tickAnim - 6) / 2) * (24-(-8.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 8) / 2) * (29.38-(24)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 29.38 + (((tickAnim - 10) / 2) * (-15.5-(29.38)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 0) / 6) * (20.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 20.5 + (((tickAnim - 6) / 3) * (-47.37-(20.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -47.37 + (((tickAnim - 9) / 1) * (-37.18-(-47.37)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -37.18 + (((tickAnim - 10) / 2) * (7.5-(-37.18)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 59.25 + (((tickAnim - 0) / 2) * (5.83729-(59.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (-1.71416-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.79498-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 5.83729 + (((tickAnim - 2) / 2) * (58.96-(5.83729)));
            yy = -1.71416 + (((tickAnim - 2) / 2) * (0-(-1.71416)));
            zz = -0.79498 + (((tickAnim - 2) / 2) * (0-(-0.79498)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 58.96 + (((tickAnim - 4) / 2) * (50-(58.96)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 50 + (((tickAnim - 6) / 1) * (85.29-(50)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 85.29 + (((tickAnim - 7) / 1) * (73.88-(85.29)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 73.88 + (((tickAnim - 8) / 2) * (78.19-(73.88)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 78.19 + (((tickAnim - 10) / 2) * (59.25-(78.19)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.665-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 1) / 1) * (0.475-(0.665)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 2) / 1) * (1.08-(0.475)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.08 + (((tickAnim - 3) / 1) * (0.48-(1.08)));
            zz = -0.09 + (((tickAnim - 3) / 1) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.48 + (((tickAnim - 4) / 3) * (1.625-(0.48)));
            zz = -0.175 + (((tickAnim - 4) / 3) * (-0.19-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 7) / 1) * (2.31-(1.625)));
            zz = -0.19 + (((tickAnim - 7) / 1) * (-0.19-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2.31 + (((tickAnim - 8) / 0) * (1.255-(2.31)));
            zz = -0.19 + (((tickAnim - 8) / 0) * (-0.195-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.255 + (((tickAnim - 8) / 4) * (0-(1.255)));
            zz = -0.195 + (((tickAnim - 8) / 4) * (0-(-0.195)));
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
            xx = 55.25 + (((tickAnim - 0) / 3) * (-15.82843-(55.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.6941-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.75837-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -15.82843 + (((tickAnim - 3) / 3) * (-36.7161-(-15.82843)));
            yy = -4.6941 + (((tickAnim - 3) / 3) * (2.39995-(-4.6941)));
            zz = -0.75837 + (((tickAnim - 3) / 3) * (1.77639-(-0.75837)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -36.7161 + (((tickAnim - 6) / 6) * (55.25-(-36.7161)));
            yy = 2.39995 + (((tickAnim - 6) / 6) * (0-(2.39995)));
            zz = 1.77639 + (((tickAnim - 6) / 6) * (0-(1.77639)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.75 + (((tickAnim - 0) / 2) * (24-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 24 + (((tickAnim - 2) / 1) * (29.38-(24)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 29.38 + (((tickAnim - 3) / 3) * (-15.5-(29.38)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -15.5 + (((tickAnim - 6) / 6) * (-8.75-(-15.5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.5 + (((tickAnim - 0) / 3) * (-47.37-(20.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -47.37 + (((tickAnim - 3) / 1) * (-37.18-(-47.37)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -37.18 + (((tickAnim - 4) / 2) * (7.5-(-37.18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 6) / 6) * (20.5-(7.5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 50 + (((tickAnim - 0) / 1) * (85.29-(50)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 85.29 + (((tickAnim - 1) / 2) * (73.88-(85.29)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 73.88 + (((tickAnim - 3) / 1) * (78.19-(73.88)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 78.19 + (((tickAnim - 4) / 2) * (59.25-(78.19)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 59.25 + (((tickAnim - 6) / 2) * (5.83729-(59.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.71416-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.79498-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.83729 + (((tickAnim - 8) / 2) * (58.96-(5.83729)));
            yy = -1.71416 + (((tickAnim - 8) / 2) * (0-(-1.71416)));
            zz = -0.79498 + (((tickAnim - 8) / 2) * (0-(-0.79498)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 58.96 + (((tickAnim - 10) / 2) * (50-(58.96)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.19-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.625 + (((tickAnim - 1) / 1) * (2.31-(1.625)));
            zz = -0.19 + (((tickAnim - 1) / 1) * (-0.19-(-0.19)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.31 + (((tickAnim - 2) / 1) * (1.255-(2.31)));
            zz = -0.19 + (((tickAnim - 2) / 1) * (-0.195-(-0.19)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.255 + (((tickAnim - 3) / 3) * (0-(1.255)));
            zz = -0.195 + (((tickAnim - 3) / 3) * (0-(-0.195)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.665-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 7) / 1) * (0.475-(0.665)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 0) * (1.08-(0.475)));
            zz = 0 + (((tickAnim - 8) / 0) * (-0.09-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.08 + (((tickAnim - 8) / 2) * (0.48-(1.08)));
            zz = -0.09 + (((tickAnim - 8) / 2) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.48 + (((tickAnim - 10) / 2) * (0-(0.48)));
            zz = -0.175 + (((tickAnim - 10) / 2) * (0-(-0.175)));
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
            xx = 29.5 + (((tickAnim - 0) / 6) * (0-(29.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-99-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -99 + (((tickAnim - 10) / 2) * (29.5-(-99)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 10) / 2) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 10) / 2) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-99-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -99 + (((tickAnim - 4) / 2) * (29.5-(-99)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 29.5 + (((tickAnim - 6) / 6) * (0-(29.5)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -0.325 + (((tickAnim - 4) / 8) * (0-(-0.325)));
            zz = 0.1 + (((tickAnim - 4) / 8) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-20))*5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*-5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*-8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-80))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*1.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*4), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-90))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-100))*10), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-50))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*15), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-120))*17), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-170))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-220))*20), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-140))*26), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-60))*-6), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-100))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-150))*8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-8));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*-7), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*-7), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-200))*-3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(25.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-35.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-300))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-400))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animHopping(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinosauropteryx entity = (EntityPrehistoricFloraSinosauropteryx) entitylivingbaseIn;


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSinosauropteryx e = (EntityPrehistoricFloraSinosauropteryx) entity;
        animator.update(entity);

    }
}
