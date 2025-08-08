package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProcompsognathus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProcompsognathus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Procompsognathus;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private ModelAnimator animator;

    public ModelProcompsognathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Procompsognathus = new AdvancedModelRenderer(this);
        this.Procompsognathus.setRotationPoint(0.0F, 13.6F, 1.5F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Procompsognathus.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 29, 33, -2.0F, -1.7F, -1.5F, 4, 4, 4, -0.1F, false));
        this.hips.cubeList.add(new ModelBox(hips, 13, 46, -1.0F, -1.95F, -1.5F, 2, 1, 4, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 15, 39, -2.0F, 0.8F, -1.5F, 4, 2, 4, -0.11F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.45F, -1.5F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.35F, 2.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 27, -1.5F, -1.0F, -0.25F, 3, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.5F, -0.25F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 36, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 3, -1.0F, -1.0F, -1.0F, 2, 2, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 0, -0.5F, -0.5F, -0.25F, 1, 1, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 25, -1.0F, 0.0F, -0.25F, 2, 0, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 30, -0.5F, 0.0F, -0.25F, 1, 1, 7, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.75F, 6.75F);
        this.tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 37, 0.0F, -1.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.25F, 6.75F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 19, 0.0F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 16, -0.5F, -0.5F, -0.25F, 1, 1, 9, -0.1F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 11, 0.0F, -1.25F, -0.25F, 0, 3, 10, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.5F, 0.0F, -0.25F, 3, 0, 10, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.6F, -1.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 24, 14, -2.0F, -1.1F, -4.5F, 4, 5, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 28, -1.0F, -1.6F, -4.5F, 2, 1, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 47, 0.0F, -1.85F, -4.5F, 0, 1, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.1F, -4.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 38, 10, -2.0F, -1.0F, -4.0F, 4, 4, 4, -0.1F, false));
        this.chest.cubeList.add(new ModelBox(chest, 46, 19, -1.0F, -1.25F, -4.0F, 2, 1, 4, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 42, 0, -2.0F, 2.5F, -4.0F, 4, 1, 4, -0.11F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 50, 0.0F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.9F, 1.75F, -2.75F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.6109F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 24, 14, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.5F, 2.5F, 0.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9599F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 52, 27, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.3927F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 7, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.leftHand.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.9F, 1.75F, -2.75F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.6109F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 24, 14, -0.5F, -0.5F, -0.5F, 1, 3, 1, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.5F, 2.5F, 0.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9599F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 52, 27, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.3927F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 7, 0, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.rightHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3927F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 28, 42, -1.5F, -1.0F, -3.0F, 3, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.25F, 0.0F);
        this.neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 27, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 46, -1.0F, -1.0F, -3.75F, 2, 2, 4, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 49, 35, -1.0F, 0.5F, -3.75F, 2, 1, 4, -0.02F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.4363F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 11, 52, -1.0F, -1.05F, -1.55F, 2, 2, 2, -0.1F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.45F, -1.2F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 22, 33, -1.0F, -0.2F, -1.95F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -0.5F, -0.2F, -3.75F, 1, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 28, -1.0F, -0.5937F, -1.9693F, 2, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5937F, -1.9693F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 50, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.8F, -1.95F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2531F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 46, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.011F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.8F, -1.95F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2531F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 46, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.011F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.0F, -1.15F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 18, 27, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.55F, -0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 6, -1.0F, 0.0F, -1.75F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 11, 16, -0.5F, 0.0F, -4.45F, 1, 1, 3, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 39, 0.0F, 0.0F, -1.95F, 1, 1, 2, -0.03F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.0F, -1.75F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2618F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 39, -1.0F, 0.0F, -1.95F, 1, 1, 2, -0.03F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 51, 6, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.05F, -1.75F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 0, -1.0F, -1.0F, 0.35F, 2, 1, 1, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.2164F, -0.7737F);
        this.jaw.addChild(throat);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 0, -0.5F, -1.9F, -0.1F, 1, 2, 2, -0.1F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.25F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 43, 44, -0.5F, -1.0F, -1.0F, 2, 5, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 4.0F, 0.1F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.8727F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 11, -0.25F, -0.75F, -0.75F, 1, 5, 2, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 0, 0.25F, -0.75F, -0.75F, 1, 5, 2, -0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.25F, 0.25F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 13, 27, 0.0F, -0.5F, -0.25F, 1, 3, 1, -0.01F, true));
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 25, 0.0F, -0.5F, -0.75F, 1, 3, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.1745F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 11, 11, -0.5F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.25F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 43, 44, -1.5F, -1.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 4.0F, 0.1F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.8727F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 11, -0.75F, -0.75F, -0.75F, 1, 5, 2, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 0, -1.25F, -0.75F, -0.75F, 1, 5, 2, -0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.25F, 0.25F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 13, 27, -1.0F, -0.5F, -0.25F, 1, 3, 1, -0.01F, false));
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 25, -1.0F, -0.5F, -0.75F, 1, 3, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.1745F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 11, 11, -1.5F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Procompsognathus.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Procompsognathus.offsetY = -0.650F;
        this.Procompsognathus.offsetX = 0.2F;
        this.Procompsognathus.offsetZ = 2.0F;
        this.Procompsognathus.rotateAngleY = (float)Math.toRadians(225);
        this.Procompsognathus.rotateAngleX = (float)Math.toRadians(0);
        this.Procompsognathus.rotateAngleZ = (float)Math.toRadians(0);
        this.Procompsognathus.scaleChildren = true;
        float scaler = 1.0F;
        this.Procompsognathus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Procompsognathus.render(f);
        //Reset rotations, positions and sizing:
        this.Procompsognathus.setScale(1.0F, 1.0F, 1.0F);
        this.Procompsognathus.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraProcompsognathus EntityMegalosaurus = (EntityPrehistoricFloraProcompsognathus) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightHand};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, -0.05F, f2, 1F);

                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraProcompsognathus ee = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 13.25 + (((tickAnim - 3) / 5) * (15.75-(13.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.75 + (((tickAnim - 8) / 5) * (0-(15.75)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-1.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 5) * (0-(-0.05)));
            zz = -1.075 + (((tickAnim - 8) / 5) * (0-(-1.075)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.75 + (((tickAnim - 3) / 5) * (10.18347-(-18.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.68268-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.88821-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10.18347 + (((tickAnim - 8) / 5) * (0-(10.18347)));
            yy = -0.68268 + (((tickAnim - 8) / 5) * (0-(-0.68268)));
            zz = 0.88821 + (((tickAnim - 8) / 5) * (0-(0.88821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 5) * (0-(0.425)));
            zz = -0.65 + (((tickAnim - 8) / 5) * (0-(-0.65)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 3) / 5) * (-27.5-(4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 8) / 5) * (0-(-27.5)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -5.75 + (((tickAnim - 3) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 7 + (((tickAnim - 3) / 4) * (41-(7)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 41 + (((tickAnim - 7) / 1) * (0-(41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.25 + (((tickAnim - 10) / 10) * (0-(14.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.25 + (((tickAnim - 10) / 10) * (0-(28.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7 + (((tickAnim - 5) / 5) * (18.5-(-7)));
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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.5 + (((tickAnim - 5) / 5) * (0-(9.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16 + (((tickAnim - 5) / 5) * (0-(16)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (35.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35.75 + (((tickAnim - 8) / 2) * (0-(35.75)));
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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -39.75 + (((tickAnim - 5) / 3) * (-69.25-(-39.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -69.25 + (((tickAnim - 8) / 2) * (0-(-69.25)));
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
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 84;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 30.25 + (((tickAnim - 20) / 50) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 30.25 + (((tickAnim - 70) / 14) * (0-(30.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = -6.25 + (((tickAnim - 20) / 50) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -6.25 + (((tickAnim - 70) / 14) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 9.5 + (((tickAnim - 20) / 50) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 9.5 + (((tickAnim - 70) / 14) * (0-(9.5)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 30.25 + (((tickAnim - 20) / 50) * (30.25-(30.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 30.25 + (((tickAnim - 70) / 14) * (0-(30.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = -6.25 + (((tickAnim - 20) / 50) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -6.25 + (((tickAnim - 70) / 14) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 9.5 + (((tickAnim - 20) / 50) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 9.5 + (((tickAnim - 70) / 14) * (0-(9.5)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = -34.25 + (((tickAnim - 20) / 50) * (-34.25-(-34.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -34.25 + (((tickAnim - 70) / 14) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0.825 + (((tickAnim - 20) / 50) * (0.825-(0.825)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0.825 + (((tickAnim - 70) / 14) * (0-(0.825)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 8.75 + (((tickAnim - 20) / 50) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 8.75 + (((tickAnim - 70) / 14) * (0-(8.75)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 9.5 + (((tickAnim - 20) / 50) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 9.5 + (((tickAnim - 70) / 14) * (0-(9.5)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 10.75 + (((tickAnim - 20) / 50) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 10.75 + (((tickAnim - 70) / 14) * (0-(10.75)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 10.25 + (((tickAnim - 20) / 50) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 10.25 + (((tickAnim - 70) / 14) * (0-(10.25)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0.09085-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (1.4641-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (3.23868-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0.09085 + (((tickAnim - 40) / 20) * (0.09085-(0.09085)));
            yy = 1.4641 + (((tickAnim - 40) / 20) * (1.4641-(1.4641)));
            zz = 3.23868 + (((tickAnim - 40) / 20) * (3.23868-(3.23868)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.09085 + (((tickAnim - 60) / 10) * (0.09085-(0.09085)));
            yy = 1.4641 + (((tickAnim - 60) / 10) * (1.4641-(1.4641)));
            zz = 3.23868 + (((tickAnim - 60) / 10) * (3.23868-(3.23868)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 0.09085 + (((tickAnim - 70) / 14) * (0-(0.09085)));
            yy = 1.4641 + (((tickAnim - 70) / 14) * (0-(1.4641)));
            zz = 3.23868 + (((tickAnim - 70) / 14) * (0-(3.23868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 70) {
            xx = 27 + (((tickAnim - 20) / 50) * (27-(27)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 27 + (((tickAnim - 70) / 14) * (0-(27)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 70) {
            xx = 27 + (((tickAnim - 20) / 50) * (27-(27)));
            yy = 0 + (((tickAnim - 20) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 50) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 27 + (((tickAnim - 70) / 14) * (0-(27)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 10) / 10) * (-9.75-(-2.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.75 + (((tickAnim - 20) / 10) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.75 + (((tickAnim - 30) / 10) * (-8.49288-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (10.30555-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (8.65635-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -8.49288 + (((tickAnim - 40) / 20) * (-8.49288-(-8.49288)));
            yy = 10.30555 + (((tickAnim - 40) / 20) * (10.30555-(10.30555)));
            zz = 8.65635 + (((tickAnim - 40) / 20) * (8.65635-(8.65635)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -8.49288 + (((tickAnim - 60) / 10) * (-8.49288-(-8.49288)));
            yy = 10.30555 + (((tickAnim - 60) / 10) * (10.30555-(10.30555)));
            zz = 8.65635 + (((tickAnim - 60) / 10) * (8.65635-(8.65635)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = -8.49288 + (((tickAnim - 70) / 7) * (-14.25-(-8.49288)));
            yy = 10.30555 + (((tickAnim - 70) / 7) * (0-(10.30555)));
            zz = 8.65635 + (((tickAnim - 70) / 7) * (0-(8.65635)));
        }
        else if (tickAnim >= 77 && tickAnim < 84) {
            xx = -14.25 + (((tickAnim - 77) / 7) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 77) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 10) / 10) * (1-(-5.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 30) / 5) * (2.62572-(1)));
            yy = 0 + (((tickAnim - 30) / 5) * (7.98944-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (14.05189-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.62572 + (((tickAnim - 35) / 5) * (1.73347-(2.62572)));
            yy = 7.98944 + (((tickAnim - 35) / 5) * (6.64385-(7.98944)));
            zz = 14.05189 + (((tickAnim - 35) / 5) * (7.87468-(14.05189)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 1.73347 + (((tickAnim - 40) / 2) * (0.73347-(1.73347)));
            yy = 6.64385 + (((tickAnim - 40) / 2) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 40) / 2) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0.73347 + (((tickAnim - 42) / 1) * (1.73347-(0.73347)));
            yy = 6.64385 + (((tickAnim - 42) / 1) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 42) / 1) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 1.73347 + (((tickAnim - 43) / 2) * (0.73347-(1.73347)));
            yy = 6.64385 + (((tickAnim - 43) / 2) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 43) / 2) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0.73347 + (((tickAnim - 45) / 2) * (1.73347-(0.73347)));
            yy = 6.64385 + (((tickAnim - 45) / 2) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 45) / 2) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 1.73347 + (((tickAnim - 47) / 1) * (0.73347-(1.73347)));
            yy = 6.64385 + (((tickAnim - 47) / 1) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 47) / 1) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.73347 + (((tickAnim - 48) / 2) * (1.73347-(0.73347)));
            yy = 6.64385 + (((tickAnim - 48) / 2) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 48) / 2) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1.73347 + (((tickAnim - 50) / 10) * (1.73347-(1.73347)));
            yy = 6.64385 + (((tickAnim - 50) / 10) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 50) / 10) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 1.73347 + (((tickAnim - 60) / 10) * (1.73347-(1.73347)));
            yy = 6.64385 + (((tickAnim - 60) / 10) * (6.64385-(6.64385)));
            zz = 7.87468 + (((tickAnim - 60) / 10) * (7.87468-(7.87468)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 1.73347 + (((tickAnim - 70) / 7) * (-5.25-(1.73347)));
            yy = 6.64385 + (((tickAnim - 70) / 7) * (0-(6.64385)));
            zz = 7.87468 + (((tickAnim - 70) / 7) * (0-(7.87468)));
        }
        else if (tickAnim >= 77 && tickAnim < 84) {
            xx = -5.25 + (((tickAnim - 77) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 77) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.4388-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.99033-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.10119-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.4388 + (((tickAnim - 10) / 10) * (0.6888-(11.4388)));
            yy = -0.99033 + (((tickAnim - 10) / 10) * (-0.99033-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 10) / 10) * (-0.10119-(-0.10119)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0.6888 + (((tickAnim - 20) / 3) * (2.6888-(0.6888)));
            yy = -0.99033 + (((tickAnim - 20) / 3) * (-0.99033-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 20) / 3) * (-0.10119-(-0.10119)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 2.6888 + (((tickAnim - 23) / 2) * (0.6888-(2.6888)));
            yy = -0.99033 + (((tickAnim - 23) / 2) * (-0.99033-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 23) / 2) * (-0.10119-(-0.10119)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0.6888 + (((tickAnim - 25) / 3) * (2.6888-(0.6888)));
            yy = -0.99033 + (((tickAnim - 25) / 3) * (-0.99033-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 25) / 3) * (-0.10119-(-0.10119)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.6888 + (((tickAnim - 28) / 2) * (0.6888-(2.6888)));
            yy = -0.99033 + (((tickAnim - 28) / 2) * (-0.99033-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 28) / 2) * (-0.10119-(-0.10119)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.6888 + (((tickAnim - 30) / 10) * (0.47018-(0.6888)));
            yy = -0.99033 + (((tickAnim - 30) / 10) * (2.0493-(-0.99033)));
            zz = -0.10119 + (((tickAnim - 30) / 10) * (7.44322-(-0.10119)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0.47018 + (((tickAnim - 40) / 2) * (8.97018-(0.47018)));
            yy = 2.0493 + (((tickAnim - 40) / 2) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 40) / 2) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 8.97018 + (((tickAnim - 42) / 1) * (0.47018-(8.97018)));
            yy = 2.0493 + (((tickAnim - 42) / 1) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 42) / 1) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.47018 + (((tickAnim - 43) / 2) * (8.97018-(0.47018)));
            yy = 2.0493 + (((tickAnim - 43) / 2) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 43) / 2) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 8.97018 + (((tickAnim - 45) / 2) * (0.47018-(8.97018)));
            yy = 2.0493 + (((tickAnim - 45) / 2) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 45) / 2) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0.47018 + (((tickAnim - 47) / 1) * (8.97018-(0.47018)));
            yy = 2.0493 + (((tickAnim - 47) / 1) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 47) / 1) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 8.97018 + (((tickAnim - 48) / 2) * (0.47018-(8.97018)));
            yy = 2.0493 + (((tickAnim - 48) / 2) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 48) / 2) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0.47018 + (((tickAnim - 50) / 10) * (0.47018-(0.47018)));
            yy = 2.0493 + (((tickAnim - 50) / 10) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 50) / 10) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.47018 + (((tickAnim - 60) / 10) * (0.47018-(0.47018)));
            yy = 2.0493 + (((tickAnim - 60) / 10) * (2.0493-(2.0493)));
            zz = 7.44322 + (((tickAnim - 60) / 10) * (7.44322-(7.44322)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0.47018 + (((tickAnim - 70) / 7) * (16.7155-(0.47018)));
            yy = 2.0493 + (((tickAnim - 70) / 7) * (0.93926-(2.0493)));
            zz = 7.44322 + (((tickAnim - 70) / 7) * (3.41148-(7.44322)));
        }
        else if (tickAnim >= 77 && tickAnim < 84) {
            xx = 16.7155 + (((tickAnim - 77) / 7) * (0-(16.7155)));
            yy = 0.93926 + (((tickAnim - 77) / 7) * (0-(0.93926)));
            zz = 3.41148 + (((tickAnim - 77) / 7) * (0-(3.41148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 7) * (0.1-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 77) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 7) * (0-(0)));
            zz = 0.1 + (((tickAnim - 77) / 7) * (0-(0.1)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31 + (((tickAnim - 10) / 10) * (31-(31)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 31 + (((tickAnim - 20) / 3) * (26.75-(31)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 23) / 2) * (31-(26.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 31 + (((tickAnim - 25) / 3) * (26.75-(31)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 26.75 + (((tickAnim - 28) / 2) * (31-(26.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 31 + (((tickAnim - 30) / 3) * (39.75-(31)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 39.75 + (((tickAnim - 33) / 7) * (31-(39.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 31 + (((tickAnim - 40) / 2) * (20.75-(31)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 20.75 + (((tickAnim - 42) / 1) * (31-(20.75)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 31 + (((tickAnim - 43) / 2) * (20.75-(31)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 20.75 + (((tickAnim - 45) / 2) * (31-(20.75)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 31 + (((tickAnim - 47) / 1) * (20.75-(31)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 48) / 2) * (31-(20.75)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 31 + (((tickAnim - 50) / 10) * (31-(31)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 31 + (((tickAnim - 60) / 10) * (31-(31)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 31 + (((tickAnim - 70) / 14) * (0-(31)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.125-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 10) / 10) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 10) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 20) / 10) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 20) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 30) / 10) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 30) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 40) / 3) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 40) / 3) * (0.125-(0.125)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = 0.05 + (((tickAnim - 43) / 4) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 43) / 4) * (0.125-(0.125)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 47) / 3) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 47) / 3) * (0.125-(0.125)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 50) / 10) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 50) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0.05 + (((tickAnim - 60) / 10) * (0.05-(0.05)));
            zz = 0.125 + (((tickAnim - 60) / 10) * (0.125-(0.125)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            yy = 0.05 + (((tickAnim - 70) / 14) * (0-(0.05)));
            zz = 0.125 + (((tickAnim - 70) / 14) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 5) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 5) * (0.02-(1)));
            zz = 1 + (((tickAnim - 5) / 5) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1-(1)));
            yy = 0.02 + (((tickAnim - 10) / 5) * (1-(0.02)));
            zz = 1 + (((tickAnim - 10) / 5) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 15) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 16) * (1-(1)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 31) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 31) / 2) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 31) / 2) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 33) / 3) * (1-(1)));
            yy = -0.01 + (((tickAnim - 33) / 3) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 33) / 3) * (1-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 36) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 36) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 36) / 19) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 1 + (((tickAnim - 55) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 3) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 55) / 3) * (1-(1)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 58) / 2) * (1-(1)));
            yy = -0.01 + (((tickAnim - 58) / 2) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 58) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 6.25 + (((tickAnim - 33) / 4) * (0-(6.25)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -50.5 + (((tickAnim - 20) / 20) * (-40-(-50.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -40 + (((tickAnim - 40) / 30) * (-40-(-40)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 84) {
            xx = -40 + (((tickAnim - 70) / 14) * (0-(-40)));
            yy = 0 + (((tickAnim - 70) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26 + (((tickAnim - 15) / 15) * (-26-(-26)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26 + (((tickAnim - 30) / 10) * (-24-(-26)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 40) / 10) * (0-(-24)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 15) / 15) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39.25 + (((tickAnim - 30) / 10) * (-17.75-(39.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 40) / 10) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 15) / 15) * (0.625-(0.625)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 10) * (0-(0.625)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -70.75 + (((tickAnim - 15) / 15) * (-70.75-(-70.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -70.75 + (((tickAnim - 30) / 10) * (0-(-70.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (80.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 80.5 + (((tickAnim - 15) / 15) * (80.5-(80.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 80.5 + (((tickAnim - 30) / 10) * (18-(80.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 40) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (1.075-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.075 + (((tickAnim - 34) / 6) * (0.325-(1.075)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26 + (((tickAnim - 15) / 15) * (-26-(-26)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26 + (((tickAnim - 30) / 10) * (-24-(-26)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 40) / 10) * (0-(-24)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 15) / 15) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39.25 + (((tickAnim - 30) / 10) * (-17.75-(39.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 40) / 10) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 15) / 15) * (0.625-(0.625)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 10) * (0-(0.625)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -70.75 + (((tickAnim - 15) / 15) * (-70.75-(-70.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -70.75 + (((tickAnim - 30) / 10) * (0-(-70.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (80.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 80.5 + (((tickAnim - 15) / 15) * (80.5-(80.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 80.5 + (((tickAnim - 30) / 10) * (18-(80.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 40) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (1.075-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 1.075 + (((tickAnim - 34) / 6) * (0.325-(1.075)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 15) / 15) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 30) / 10) * (25.5-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.5 + (((tickAnim - 40) / 10) * (0-(25.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.525-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -4.5 + (((tickAnim - 15) / 15) * (-4.5-(-4.5)));
            zz = 1.525 + (((tickAnim - 15) / 15) * (1.525-(1.525)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -4.5 + (((tickAnim - 30) / 10) * (0-(-4.5)));
            zz = 1.525 + (((tickAnim - 30) / 10) * (1.825-(1.525)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 1.825 + (((tickAnim - 40) / 10) * (0-(1.825)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 40) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (9.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 15) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 30) / 3) * (-18-(9.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -18 + (((tickAnim - 33) / 7) * (-19-(-18)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 40) / 10) * (0-(-19)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.325-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 40) / 10) * (0-(-0.325)));
            zz = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (11.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 15) / 15) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 30) / 3) * (12.67-(11.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.67 + (((tickAnim - 33) / 2) * (-1.5-(12.67)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 35) / 5) * (-11.71281-(-1.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (-0.34851-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-3.5416-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.71281 + (((tickAnim - 40) / 10) * (0-(-11.71281)));
            yy = -0.34851 + (((tickAnim - 40) / 10) * (0-(-0.34851)));
            zz = -3.5416 + (((tickAnim - 40) / 10) * (0-(-3.5416)));
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
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (7.25-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 15) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 30) / 3) * (19.83-(7.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 19.83 + (((tickAnim - 33) / 2) * (17.41-(19.83)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 17.41 + (((tickAnim - 35) / 2) * (0-(17.41)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -12.25 + (((tickAnim - 15) / 15) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12.25 + (((tickAnim - 30) / 10) * (1.25-(-12.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 40) / 10) * (0-(1.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -6 + (((tickAnim - 30) / 10) * (-5.75-(-6)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 40) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 15) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.5 + (((tickAnim - 30) / 10) * (-23.25-(9.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 40) / 10) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20.75 + (((tickAnim - 15) / 15) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20.75 + (((tickAnim - 30) / 10) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.05 + (((tickAnim - 15) / 15) * (0.05-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 0) / 10) * (8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 10) / 8) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20-(8.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20 + (((tickAnim - 18) / 7) * (-4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-20)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 25) / 10) * (49.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-4.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-99.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -99.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100 + (((tickAnim - 10) / 8) * (-97.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100-(-99.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -97.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100 + (((tickAnim - 18) / 17) * (0-(-97.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-100)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250 + (((tickAnim - 18) / 7) * (-26.75-(-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 25) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250 + (((tickAnim - 18) / 7) * (-26.75-(-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 25) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250 + (((tickAnim - 18) / 7) * (-26.75-(-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 25) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250 + (((tickAnim - 18) / 7) * (-26.75-(-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 25) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*150 + (((tickAnim - 10) / 8) * (-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250-(122+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*150)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250 + (((tickAnim - 18) / 7) * (-26.75-(-250+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-133))*-250)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -26.75 + (((tickAnim - 25) / 10) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -14 + (((tickAnim - 10) / 8) * (0-(-14)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-14-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -14 + (((tickAnim - 25) / 10) * (0-(-14)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0.275 + (((tickAnim - 10) / 8) * (0-(0.275)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0.275-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0.275 + (((tickAnim - 25) / 10) * (0-(0.275)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 26 + (((tickAnim - 10) / 8) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (26-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 26 + (((tickAnim - 25) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0.275 + (((tickAnim - 10) / 8) * (0-(0.275)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0.275-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0.275 + (((tickAnim - 25) / 10) * (0-(0.275)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.25 + (((tickAnim - 10) / 8) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (11.25-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 25) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 38.25 + (((tickAnim - 10) / 8) * (0-(38.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (38.25-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 38.25 + (((tickAnim - 25) / 10) * (0-(38.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-114.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -114.75 + (((tickAnim - 10) / 8) * (0-(-114.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-114.75-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -114.75 + (((tickAnim - 25) / 10) * (0-(-114.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 15) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 10.25 + (((tickAnim - 15) / 2) * (23.54-(10.25)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 23.54 + (((tickAnim - 17) / 8) * (0-(23.54)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 10.25 + (((tickAnim - 40) / 2) * (23.54-(10.25)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 23.54 + (((tickAnim - 42) / 8) * (0-(23.54)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 15) / 5) * (-49.25-(3.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -49.25 + (((tickAnim - 20) / 2) * (-49.25-(-49.25)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -49.25 + (((tickAnim - 22) / 3) * (0-(-49.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 3.5 + (((tickAnim - 40) / 5) * (-49.25-(3.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -49.25 + (((tickAnim - 45) / 2) * (-49.25-(-49.25)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -49.25 + (((tickAnim - 47) / 3) * (0-(-49.25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 2) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 22) / 3) * (0-(0.625)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 45) / 2) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 47) / 3) * (0-(0.625)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (79.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 79.75 + (((tickAnim - 15) / 5) * (91.88-(79.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 91.88 + (((tickAnim - 20) / 2) * (91.88-(91.88)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 91.88 + (((tickAnim - 22) / 3) * (0-(91.88)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (79.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 79.75 + (((tickAnim - 40) / 5) * (91.88-(79.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 91.88 + (((tickAnim - 45) / 2) * (91.88-(91.88)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 91.88 + (((tickAnim - 47) / 3) * (0-(91.88)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -32.5 + (((tickAnim - 0) / 5) * (37-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 37 + (((tickAnim - 5) / 5) * (-32.5-(37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.25 + (((tickAnim - 0) / 2) * (-16-(2.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -16 + (((tickAnim - 2) / 3) * (1.5-(-16)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 1.5 + (((tickAnim - 5) / 2) * (96.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(1.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 96.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 7) / 3) * (2.25-(96.73+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 2) * (-0.07-(0.175)));
            zz = -0.025 + (((tickAnim - 0) / 2) * (-0.03-(-0.025)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 2) / 3) * (0.35-(-0.07)));
            zz = -0.03 + (((tickAnim - 2) / 3) * (-0.05-(-0.03)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 5) / 5) * (0.175-(0.35)));
            zz = -0.05 + (((tickAnim - 5) / 5) * (-0.025-(-0.05)));
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
            xx = -34.67029 + (((tickAnim - 0) / 2) * (6.5-(-34.67029)));
            yy = -1.98478 + (((tickAnim - 0) / 2) * (0-(-1.98478)));
            zz = 6.87829 + (((tickAnim - 0) / 2) * (0-(6.87829)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 6.5 + (((tickAnim - 2) / 3) * (-7-(6.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7 + (((tickAnim - 5) / 3) * (-44.87-(-7)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -44.87 + (((tickAnim - 8) / 0) * (-50.12-(-44.87)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -50.12 + (((tickAnim - 8) / 2) * (-34.67029-(-50.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1.98478-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (6.87829-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 2) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.035-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.035 + (((tickAnim - 3) / 2) * (0.175-(-0.035)));
            zz = -0.175 + (((tickAnim - 3) / 2) * (0-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 3) * (0.59-(0.175)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.59 + (((tickAnim - 8) / 0) * (0.59-(0.59)));
            zz = 0.425 + (((tickAnim - 8) / 0) * (0.425-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 8) / 2) * (0.225-(0.59)));
            zz = 0.425 + (((tickAnim - 8) / 2) * (0-(0.425)));
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
            xx = 76.5 + (((tickAnim - 0) / 2) * (18-(76.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 18 + (((tickAnim - 2) / 1) * (9.96-(18)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9.96 + (((tickAnim - 3) / 2) * (57.75-(9.96)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 57.75 + (((tickAnim - 5) / 1) * (87.75-(57.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 87.75 + (((tickAnim - 6) / 2) * (89.25-(87.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 89.25 + (((tickAnim - 8) / 0) * (89.25-(89.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 89.25 + (((tickAnim - 8) / 2) * (76.5-(89.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 2) * (-0.61-(0.425)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.61 + (((tickAnim - 2) / 1) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5-(-0.61)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5 + (((tickAnim - 3) / 0) * (0.525-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 3) / 2) * (0-(0.525)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.19-(0)));
            zz = -0.4 + (((tickAnim - 5) / 3) * (-0.415-(-0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.19 + (((tickAnim - 8) / 0) * (0.19-(0.19)));
            zz = -0.415 + (((tickAnim - 8) / 0) * (-0.415-(-0.415)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 8) / 2) * (0.425-(0.19)));
            zz = -0.415 + (((tickAnim - 8) / 2) * (0-(-0.415)));
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
            xx = 37 + (((tickAnim - 0) / 5) * (-32.5-(37)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.5 + (((tickAnim - 5) / 5) * (37-(-32.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.5 + (((tickAnim - 0) / 2) * (61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(1.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 2) / 3) * (2.25-(61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.25 + (((tickAnim - 5) / 2) * (-16-(2.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16 + (((tickAnim - 7) / 3) * (1.5-(-16)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 5) * (0.175-(0.35)));
            zz = -0.05 + (((tickAnim - 0) / 5) * (-0.025-(-0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 5) / 2) * (-0.07-(0.175)));
            zz = -0.025 + (((tickAnim - 5) / 2) * (-0.03-(-0.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.07 + (((tickAnim - 7) / 3) * (0.35-(-0.07)));
            zz = -0.03 + (((tickAnim - 7) / 3) * (-0.05-(-0.03)));
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
            xx = -7 + (((tickAnim - 0) / 3) * (-44.87-(-7)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -44.87 + (((tickAnim - 3) / 0) * (-50.12-(-44.87)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -50.12 + (((tickAnim - 3) / 2) * (-34.67029-(-50.12)));
            yy = 0 + (((tickAnim - 3) / 2) * (-1.98478-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (6.87829-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -34.67029 + (((tickAnim - 5) / 2) * (6.5-(-34.67029)));
            yy = -1.98478 + (((tickAnim - 5) / 2) * (0-(-1.98478)));
            zz = 6.87829 + (((tickAnim - 5) / 2) * (0-(6.87829)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 7) / 3) * (-7-(6.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (0.59-(0.175)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.59 + (((tickAnim - 3) / 0) * (0.59-(0.59)));
            zz = 0.425 + (((tickAnim - 3) / 0) * (0.425-(0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 3) / 2) * (0.225-(0.59)));
            zz = 0.425 + (((tickAnim - 3) / 2) * (0-(0.425)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 5) / 2) * (0-(0.225)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.035-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.035 + (((tickAnim - 8) / 2) * (0.175-(-0.035)));
            zz = -0.175 + (((tickAnim - 8) / 2) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 57.75 + (((tickAnim - 0) / 1) * (87.75-(57.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 87.75 + (((tickAnim - 1) / 2) * (89.25-(87.75)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 89.25 + (((tickAnim - 3) / 0) * (89.25-(89.25)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 89.25 + (((tickAnim - 3) / 2) * (76.5-(89.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 76.5 + (((tickAnim - 5) / 2) * (18-(76.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 18 + (((tickAnim - 7) / 1) * (9.96-(18)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 9.96 + (((tickAnim - 8) / 2) * (57.75-(9.96)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.19-(0)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.415-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.19 + (((tickAnim - 3) / 0) * (0.19-(0.19)));
            zz = -0.415 + (((tickAnim - 3) / 0) * (-0.415-(-0.415)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 3) / 2) * (0.425-(0.19)));
            zz = -0.415 + (((tickAnim - 3) / 2) * (0-(-0.415)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 2) * (-0.61-(0.425)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.61 + (((tickAnim - 7) / 1) * (-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5-(-0.61)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5 + (((tickAnim - 8) / 0) * (0.525-(-0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 2) * (0-(0.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+50))*7), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*0.75);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*7), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*7), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*7));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*7), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*7));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*9), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+200))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*7));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*15), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+300))*7), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*7));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-5))*-9), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-15))*7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-15))*4), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-55))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-15))*4), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-55))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(16.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*7), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-190))*9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*-9), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*7), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProcompsognathus entity = (EntityPrehistoricFloraProcompsognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -19.5 + (((tickAnim - 0) / 10) * (37-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37 + (((tickAnim - 10) / 10) * (-19.5-(37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -10.25 + (((tickAnim - 0) / 10) * (1.5-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 10) / 3) * (139.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(1.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 139.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 13) / 7) * (-10.25-(139.98+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 10) * (0.35-(-0.1)));
            zz = 0.1 + (((tickAnim - 0) / 10) * (-0.05-(0.1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 10) * (-0.1-(0.35)));
            zz = -0.05 + (((tickAnim - 10) / 10) * (0.1-(-0.05)));
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
            xx = 8.75 + (((tickAnim - 0) / 10) * (-7-(8.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7 + (((tickAnim - 10) / 5) * (-44.87-(-7)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -44.87 + (((tickAnim - 15) / 3) * (-50.12-(-44.87)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -50.12 + (((tickAnim - 18) / 2) * (8.75-(-50.12)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.055-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.175-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.055 + (((tickAnim - 4) / 6) * (0.175-(-0.055)));
            zz = -0.175 + (((tickAnim - 4) / 6) * (0-(-0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 10) / 5) * (0.59-(0.175)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.59 + (((tickAnim - 15) / 3) * (0.59-(0.59)));
            zz = 0.425 + (((tickAnim - 15) / 3) * (0.425-(0.425)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 18) / 2) * (0-(0.59)));
            zz = 0.425 + (((tickAnim - 18) / 2) * (0-(0.425)));
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
            xx = 19.75 + (((tickAnim - 0) / 4) * (-0.79-(19.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.79 + (((tickAnim - 4) / 6) * (57.75-(-0.79)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 57.75 + (((tickAnim - 10) / 2) * (87.75-(57.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 87.75 + (((tickAnim - 12) / 3) * (89.25-(87.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 89.25 + (((tickAnim - 15) / 3) * (89.25-(89.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 89.25 + (((tickAnim - 18) / 2) * (19.75-(89.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 4) * (0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*5-(0.4)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*5 + (((tickAnim - 4) / 6) * (0-(0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*5)));
            zz = 0 + (((tickAnim - 4) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.19-(0)));
            zz = -0.4 + (((tickAnim - 10) / 5) * (-0.415-(-0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 15) / 3) * (0.19-(0.19)));
            zz = -0.415 + (((tickAnim - 15) / 3) * (-0.415-(-0.415)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 18) / 2) * (0.4-(0.19)));
            zz = -0.415 + (((tickAnim - 18) / 2) * (0-(-0.415)));
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
            xx = 37 + (((tickAnim - 0) / 10) * (-19.5-(37)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.5 + (((tickAnim - 10) / 10) * (37-(-19.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.5 + (((tickAnim - 0) / 3) * (61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(1.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 3) / 7) * (-10.25-(61.48+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 10) / 10) * (1.5-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 10) * (-0.1-(0.35)));
            zz = -0.05 + (((tickAnim - 0) / 10) * (0.1-(-0.05)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 10) / 10) * (0.35-(-0.1)));
            zz = 0.1 + (((tickAnim - 10) / 10) * (-0.05-(0.1)));
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
            xx = -7 + (((tickAnim - 0) / 5) * (-44.87-(-7)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -44.87 + (((tickAnim - 5) / 3) * (-50.12-(-44.87)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -50.12 + (((tickAnim - 8) / 2) * (8.75-(-50.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 10) / 10) * (-7-(8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 5) * (0.59-(0.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.59 + (((tickAnim - 5) / 3) * (0.59-(0.59)));
            zz = 0.425 + (((tickAnim - 5) / 3) * (0.425-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 8) / 2) * (0-(0.59)));
            zz = 0.425 + (((tickAnim - 8) / 2) * (0-(0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.035-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.035 + (((tickAnim - 15) / 5) * (0.175-(-0.035)));
            zz = -0.175 + (((tickAnim - 15) / 5) * (0-(-0.175)));
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
            xx = 57.75 + (((tickAnim - 0) / 2) * (87.75-(57.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 87.75 + (((tickAnim - 2) / 3) * (89.25-(87.75)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 89.25 + (((tickAnim - 5) / 3) * (89.25-(89.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 89.25 + (((tickAnim - 8) / 2) * (19.75-(89.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 19.75 + (((tickAnim - 10) / 5) * (-2.79-(19.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.79 + (((tickAnim - 15) / 5) * (57.75-(-2.79)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.19-(0)));
            zz = -0.4 + (((tickAnim - 0) / 5) * (-0.415-(-0.4)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 5) / 3) * (0.19-(0.19)));
            zz = -0.415 + (((tickAnim - 5) / 3) * (-0.415-(-0.415)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 8) / 2) * (0.425-(0.19)));
            zz = -0.415 + (((tickAnim - 8) / 2) * (0-(-0.415)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 10) / 5) * (-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5-(0.425)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5 + (((tickAnim - 15) / 5) * (0-(-0.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*-50))*-0.5)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*4), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-0.25);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*4), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+200))*-4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*9), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-5))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-15))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-15))*4), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-55))*4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-15))*4), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-55))*4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*-6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProcompsognathus e = (EntityPrehistoricFloraProcompsognathus) entity;
        animator.update(entity);


    }
}
