package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSegisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSegisaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Segisaurus;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private ModelAnimator animator;

    public ModelSegisaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Segisaurus = new AdvancedModelRenderer(this);
        this.Segisaurus.setRotationPoint(0.0F, 10.5F, 0.25F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Segisaurus.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 22, 9, -2.5F, -2.05F, -3.0F, 5, 6, 7, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.8F, 4.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 43, 16, -1.5F, -1.0F, -1.0F, 3, 4, 7, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 40, 50, -1.5F, 2.5F, 0.0F, 3, 2, 6, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 16, -1.0F, -1.0F, -1.0F, 2, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 23, -1.0F, 1.5F, -1.0F, 2, 2, 10, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.15F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 0, -0.5F, -0.75F, -1.0F, 1, 2, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 38, -1.0F, -0.25F, 0.0F, 2, 3, 9, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 25, -0.5F, -0.75F, -0.25F, 1, 1, 11, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -1.0F, -0.25F, -0.75F, 2, 3, 12, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -2.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 36, -3.0F, -1.375F, -5.7F, 3, 7, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 36, 0.0F, -1.375F, -5.7F, 3, 7, 6, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.3F, 0.05F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 13, -1.5F, 0.0F, -5.0F, 2, 2, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.3F, 0.05F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 28, -2.5F, 0.0F, -5.0F, 4, 1, 5, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -5.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 46, 38, -2.5F, -1.05F, -5.0F, 5, 6, 5, -0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 46, 38, -2.5F, -1.05F, -5.0F, 5, 6, 5, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.5F, -4.6F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 53, -1.5F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.05F, -4.75F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -2.5F, 0.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.05F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2182F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 53, 0, -1.5F, -1.0F, -3.0F, 3, 4, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.5F, 0.25F);
        this.neck1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 36, -0.5F, 0.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 50, -1.0F, -1.0F, -6.5F, 2, 3, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.4F, -6.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 33, 0, -0.075F, -0.5F, -2.575F, 1, 2, 3, -0.01F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 33, 0, -0.925F, -0.5F, -2.575F, 1, 2, 3, -0.01F, true));
        this.neck3.cubeList.add(new ModelBox(neck3, 37, 38, -1.0F, 0.9F, -2.5F, 2, 1, 3, -0.11F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.4F, -2.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.3994F, -1.9994F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.576F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 13, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.02F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 20, -1.0F, 0.0F, -3.4F, 1, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.15F, -0.25F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 8, -1.0F, -0.75F, -1.65F, 2, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.7065F, -3.3587F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.341F, -0.2308F, -0.081F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 30, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 1.7065F, -3.3587F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.341F, 0.2308F, 0.081F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 30, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.1368F, -1.704F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 0, -1.0F, -1.0F, -1.85F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.15F, -0.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 6, -1.0F, 0.1F, -1.6F, 2, 1, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 0.0839F, -1.015F);
        this.head.addChild(eyes);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.2339F, 0.765F);
        this.eyes.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 30, -1.0F, -0.5F, -1.3F, 2, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7F, 0.3F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.85F, -0.55F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 38, -0.5F, 0.6F, -4.4F, 1, 1, 1, -0.03F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 23, 41, -0.5F, 0.6F, -3.45F, 1, 1, 2, -0.02F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 29, -1.0F, 0.6F, -1.6F, 2, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.1463F, -3.68F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1259F, -0.2425F, -0.0304F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 16, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.03F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 1.1463F, -3.68F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1259F, 0.2425F, 0.0304F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 16, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.03F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.0708F, -1.5626F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3142F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 13, -1.0F, -1.0F, 0.0F, 2, 1, 1, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.7163F, -1.393F);
        this.jaw.addChild(throat);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.2168F, -0.5501F);
        this.throat.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1396F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 30, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.75F, 2.75F, -3.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.6545F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 43, 28, -1.0F, -0.25F, -0.5F, 1, 3, 1, 0.01F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 36, -1.0F, -0.25F, -1.0F, 1, 3, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 2.75F, 0.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.9163F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 17, 0, -1.0F, 0.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 2.95F, -0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, 0.3491F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 26, 8, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.leftHand.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6109F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 43, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.75F, 2.75F, -3.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.6545F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 43, 28, 0.0F, -0.25F, -0.5F, 1, 3, 1, 0.01F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 36, 0.0F, -0.25F, -1.0F, 1, 3, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 2.75F, 0.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.9163F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 17, 0, 0.0F, 0.0F, -1.0F, 1, 3, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 2.95F, -0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.3491F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 26, 8, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.rightHand.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 43, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.75F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 19, 51, -2.25F, -1.5F, -1.0F, 3, 7, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7418F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 0, -1.75F, -0.75F, -0.65F, 2, 6, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.25F, 1.25F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7418F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 16, -1.75F, -0.3371F, -0.7117F, 2, 5, 2, -0.1F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.6629F, -0.0617F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -1.309F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 30, 23, -2.25F, -1.25F, -0.4F, 3, 4, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.75F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 19, 51, -0.75F, -1.5F, -1.0F, 3, 7, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7418F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 0, -0.25F, -0.75F, -0.65F, 2, 6, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.25F, 1.25F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 16, -0.25F, -0.3371F, -0.7117F, 2, 5, 2, -0.1F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.6629F, -0.0617F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -1.309F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 30, 23, -0.75F, -1.25F, -0.4F, 3, 4, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Segisaurus.render(f5);
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
        this.Segisaurus.offsetY = 0.250F;
        this.Segisaurus.offsetX = 0.4F;
        this.Segisaurus.rotateAngleY = (float)Math.toRadians(240);
        this.Segisaurus.rotateAngleX = (float)Math.toRadians(-0);
        this.Segisaurus.rotateAngleZ = (float)Math.toRadians(3);
        this.Segisaurus.scaleChildren = true;
        float scaler = 0.75F;
        this.Segisaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Segisaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Segisaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Segisaurus.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSegisaurus EntityMegalosaurus = (EntityPrehistoricFloraSegisaurus) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftHand};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightHand};

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

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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
        EntityPrehistoricFloraSegisaurus ee = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
 if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 3) / 5) * (18-(8)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 8) / 5) * (0-(18)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -27.25 + (((tickAnim - 3) / 5) * (2.5-(-27.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 8) / 5) * (0-(2.5)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0.375 + (((tickAnim - 3) / 10) * (0-(0.375)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.25 + (((tickAnim - 3) / 5) * (-22-(-11.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -22 + (((tickAnim - 8) / 5) * (0-(-22)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (36.28-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 36.28 + (((tickAnim - 3) / 5) * (-16.25-(36.28)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -16.25 + (((tickAnim - 8) / 1) * (6.92-(-16.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.92 + (((tickAnim - 9) / 4) * (0-(6.92)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1 + (((tickAnim - 0) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 2) * (0.005-(1)));
            zz = 1 + (((tickAnim - 0) / 2) * (1-(1)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 2) / 3) * (1-(1)));
            yy = 0.005 + (((tickAnim - 2) / 3) * (1-(0.005)));
            zz = 1 + (((tickAnim - 2) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (40.25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 40.25 + (((tickAnim - 8) / 1) * (0-(40.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 4) / 6) * (12-(1)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 10) / 8) * (0-(12)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 4.5 + (((tickAnim - 4) / 6) * (10.25-(4.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10.25 + (((tickAnim - 10) / 8) * (0-(10.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 8.75 + (((tickAnim - 4) / 6) * (13.75-(8.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 10) / 3) * (12.75-(13.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12.75 + (((tickAnim - 13) / 5) * (0-(12.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 10) / 8) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 4) / 6) * (16.75-(-13.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 10) / 3) * (0-(16.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (6.5-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.5 + (((tickAnim - 15) / 3) * (0-(6.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 4) / 9) * (0-(12.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -27.75 + (((tickAnim - 15) / 3) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 29.75 + (((tickAnim - 4) / 4) * (5.21-(29.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.21 + (((tickAnim - 8) / 2) * (6.5-(5.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.5 + (((tickAnim - 10) / 3) * (0-(6.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-13-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13 + (((tickAnim - 15) / 3) * (0-(-13)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (-0.005-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 3) / 1) * (1-(1)));
            yy = -0.005 + (((tickAnim - 3) / 1) * (1-(-0.005)));
            zz = 1 + (((tickAnim - 3) / 1) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 4) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 4) / 4) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (-0.02-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = -0.02 + (((tickAnim - 10) / 3) * (1-(-0.02)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (36.25-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 36.25 + (((tickAnim - 9) / 1) * (0-(36.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 13) / 2) * (23.35-(1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.35 + (((tickAnim - 15) / 3) * (0-(23.35)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 4) / 14) * (0-(7.5)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.84479-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (5.70951-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.11184-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -8.84479 + (((tickAnim - 4) / 14) * (0-(-8.84479)));
            yy = 5.70951 + (((tickAnim - 4) / 14) * (0-(5.70951)));
            zz = 3.11184 + (((tickAnim - 4) / 14) * (0-(3.11184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (13.27108-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-8.55907-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (32.25247-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 13.27108 + (((tickAnim - 4) / 14) * (0-(13.27108)));
            yy = -8.55907 + (((tickAnim - 4) / 14) * (0-(-8.55907)));
            zz = 32.25247 + (((tickAnim - 4) / 14) * (0-(32.25247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 20.5 + (((tickAnim - 4) / 14) * (0-(20.5)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -22.25 + (((tickAnim - 4) / 14) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-21.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 4) / 14) * (0-(7.5)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = -21.5 + (((tickAnim - 4) / 14) * (0-(-21.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.5751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.21454-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.735-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -2.5751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5 + (((tickAnim - 7) / 8) * (-0.00019-(-2.5751+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*5)));
            yy = -0.21454 + (((tickAnim - 7) / 8) * (-0.4981-(-0.21454)));
            zz = -0.735 + (((tickAnim - 7) / 8) * (-1.70642-(-0.735)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -0.00019 + (((tickAnim - 15) / 45) * (-0.00019-(-0.00019)));
            yy = -0.4981 + (((tickAnim - 15) / 45) * (-0.4981-(-0.4981)));
            zz = -1.70642 + (((tickAnim - 15) / 45) * (-1.70642-(-1.70642)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -0.00019 + (((tickAnim - 60) / 15) * (-4.25019-(-0.00019)));
            yy = -0.4981 + (((tickAnim - 60) / 15) * (-0.4981-(-0.4981)));
            zz = -1.70642 + (((tickAnim - 60) / 15) * (-1.70642-(-1.70642)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -4.25019 + (((tickAnim - 75) / 30) * (-4.25019-(-4.25019)));
            yy = -0.4981 + (((tickAnim - 75) / 30) * (-0.4981-(-0.4981)));
            zz = -1.70642 + (((tickAnim - 75) / 30) * (-1.70642-(-1.70642)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -4.25019 + (((tickAnim - 105) / 15) * (0-(-4.25019)));
            yy = -0.4981 + (((tickAnim - 105) / 15) * (0-(-0.4981)));
            zz = -1.70642 + (((tickAnim - 105) / 15) * (0-(-1.70642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.775-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = -0.775 + (((tickAnim - 15) / 45) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = -0.775 + (((tickAnim - 60) / 45) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = -0.775 + (((tickAnim - 105) / 15) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.025-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.07545-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -1.025 + (((tickAnim - 7) / 8) * (4.5-(-1.025)));
            yy = -2.07545 + (((tickAnim - 7) / 8) * (-4.5-(-2.07545)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 4.5 + (((tickAnim - 15) / 9) * (4.28684-(4.5)));
            yy = -4.5 + (((tickAnim - 15) / 9) * (-4.01789-(-4.5)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = 4.28684 + (((tickAnim - 24) / 31) * (-1.525-(4.28684)));
            yy = -4.01789 + (((tickAnim - 24) / 31) * (-2-(-4.01789)));
            zz = 0 + (((tickAnim - 24) / 31) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -1.525 + (((tickAnim - 55) / 5) * (0-(-1.525)));
            yy = -2 + (((tickAnim - 55) / 5) * (-2-(-2)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (-2-(0)));
            yy = -2 + (((tickAnim - 60) / 15) * (1.75-(-2)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -2 + (((tickAnim - 75) / 30) * (-9.71629-(-2)));
            yy = 1.75 + (((tickAnim - 75) / 30) * (4.69623-(1.75)));
            zz = 0 + (((tickAnim - 75) / 30) * (1.83949-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -9.71629 + (((tickAnim - 105) / 15) * (0-(-9.71629)));
            yy = 4.69623 + (((tickAnim - 105) / 15) * (0-(4.69623)));
            zz = 1.83949 + (((tickAnim - 105) / 15) * (0-(1.83949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.775-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-4.46228-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -2.775 + (((tickAnim - 7) / 8) * (-3.75-(-2.775)));
            yy = -4.46228 + (((tickAnim - 7) / 8) * (-9.5-(-4.46228)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -3.75 + (((tickAnim - 15) / 9) * (-7.33423-(-3.75)));
            yy = -9.5 + (((tickAnim - 15) / 9) * (-8.08717-(-9.5)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = -7.33423 + (((tickAnim - 24) / 31) * (-1.525-(-7.33423)));
            yy = -8.08717 + (((tickAnim - 24) / 31) * (-2.75-(-8.08717)));
            zz = 0 + (((tickAnim - 24) / 31) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -1.525 + (((tickAnim - 55) / 5) * (0-(-1.525)));
            yy = -2.75 + (((tickAnim - 55) / 5) * (-2.75-(-2.75)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -2.75 + (((tickAnim - 60) / 15) * (3.75-(-2.75)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (-6.3005-(0)));
            yy = 3.75 + (((tickAnim - 75) / 30) * (4.75278-(3.75)));
            zz = 0 + (((tickAnim - 75) / 30) * (-0.26612-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -6.3005 + (((tickAnim - 105) / 15) * (0-(-6.3005)));
            yy = 4.75278 + (((tickAnim - 105) / 15) * (0-(4.75278)));
            zz = -0.26612 + (((tickAnim - 105) / 15) * (0-(-0.26612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.225-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.07545-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 4.225 + (((tickAnim - 7) / 8) * (0-(4.225)));
            yy = -2.07545 + (((tickAnim - 7) / 8) * (-4.5-(-2.07545)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -4.5 + (((tickAnim - 15) / 10) * (-2-(-4.5)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 25) / 30) * (-1.525-(0)));
            yy = -2 + (((tickAnim - 25) / 30) * (2.75-(-2)));
            zz = 0 + (((tickAnim - 25) / 30) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -1.525 + (((tickAnim - 55) / 5) * (0-(-1.525)));
            yy = 2.75 + (((tickAnim - 55) / 5) * (2.75-(2.75)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 2.75 + (((tickAnim - 60) / 5) * (-10.98-(2.75)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            yy = -10.98 + (((tickAnim - 65) / 10) * (-3.5-(-10.98)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (4.75-(0)));
            yy = -3.5 + (((tickAnim - 75) / 30) * (6-(-3.5)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 4.75 + (((tickAnim - 105) / 7) * (-3.36111-(4.75)));
            yy = 6 + (((tickAnim - 105) / 7) * (3.33333-(6)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -3.36111 + (((tickAnim - 112) / 8) * (0-(-3.36111)));
            yy = 3.33333 + (((tickAnim - 112) / 8) * (0-(3.33333)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (5.975-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.25034-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 5.975 + (((tickAnim - 7) / 8) * (0-(5.975)));
            yy = -3.25034 + (((tickAnim - 7) / 8) * (-6.75-(-3.25034)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (-1.525-(0)));
            yy = -6.75 + (((tickAnim - 15) / 40) * (-0.5-(-6.75)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -1.525 + (((tickAnim - 55) / 5) * (0-(-1.525)));
            yy = -0.5 + (((tickAnim - 55) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            yy = -0.5 + (((tickAnim - 60) / 6) * (-9.88-(-0.5)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 66) / 9) * (0-(0)));
            yy = -9.88 + (((tickAnim - 66) / 9) * (-7.75-(-9.88)));
            zz = 0 + (((tickAnim - 66) / 9) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 75) / 13) * (3.54574-(0)));
            yy = -7.75 + (((tickAnim - 75) / 13) * (-13.08494-(-7.75)));
            zz = 0 + (((tickAnim - 75) / 13) * (0.61709-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 105) {
            xx = 3.54574 + (((tickAnim - 88) / 17) * (11.48429-(3.54574)));
            yy = -13.08494 + (((tickAnim - 88) / 17) * (6.658-(-13.08494)));
            zz = 0.61709 + (((tickAnim - 88) / 17) * (1.63523-(0.61709)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 11.48429 + (((tickAnim - 105) / 7) * (-1.36984-(11.48429)));
            yy = 6.658 + (((tickAnim - 105) / 7) * (3.69889-(6.658)));
            zz = 1.63523 + (((tickAnim - 105) / 7) * (0.90846-(1.63523)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -1.36984 + (((tickAnim - 112) / 8) * (0-(-1.36984)));
            yy = 3.69889 + (((tickAnim - 112) / 8) * (0-(3.69889)));
            zz = 0.90846 + (((tickAnim - 112) / 8) * (0-(0.90846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.61523-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -1.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 7) / 18) * (0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(-1.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = -1.61523 + (((tickAnim - 7) / 18) * (-3.75-(-1.61523)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 25) / 20) * (2-(0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = -3.75 + (((tickAnim - 25) / 20) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 2 + (((tickAnim - 45) / 10) * (0.15-(2)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 45) / 10) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0.15 + (((tickAnim - 55) / 5) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0.15)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = -3.75 + (((tickAnim - 55) / 5) * (-3.75-(-3.75)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 60) / 10) * (-7.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 60) / 10) * (0-(-3.75)));
        }
        else if (tickAnim >= 70 && tickAnim < 105) {
            xx = -7.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 70) / 35) * (-5.75-(-7.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 70) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 35) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -5.75 + (((tickAnim - 105) / 15) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 5.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 13) / 10) * (3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(5.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 3.75 + (((tickAnim - 13) / 10) * (3.75-(3.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 23) / 22) * (3-(3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 3.75 + (((tickAnim - 23) / 22) * (3.75-(3.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 3 + (((tickAnim - 45) / 10) * (-0.025-(3)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 3.75 + (((tickAnim - 45) / 10) * (3.75-(3.75)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -0.025 + (((tickAnim - 55) / 5) * (1.5-(-0.025)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 3.75 + (((tickAnim - 55) / 5) * (3.75-(3.75)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 1.5 + (((tickAnim - 60) / 10) * (-1.93981-(1.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (-11.7383-(0)));
            zz = 3.75 + (((tickAnim - 60) / 10) * (-1.96065-(3.75)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = -1.93981 + (((tickAnim - 70) / 25) * (4.55893-(-1.93981)));
            yy = -11.7383 + (((tickAnim - 70) / 25) * (-12.08512-(-11.7383)));
            zz = -1.96065 + (((tickAnim - 70) / 25) * (-3.24465-(-1.96065)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 4.55893 + (((tickAnim - 95) / 10) * (3.80893-(4.55893)));
            yy = -12.08512 + (((tickAnim - 95) / 10) * (-12.08512-(-12.08512)));
            zz = -3.24465 + (((tickAnim - 95) / 10) * (-3.24465-(-3.24465)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 3.80893 + (((tickAnim - 105) / 15) * (0-(3.80893)));
            yy = -12.08512 + (((tickAnim - 105) / 15) * (0-(-12.08512)));
            zz = -3.24465 + (((tickAnim - 105) / 15) * (0-(-3.24465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.2872-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.04856-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.04182-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 7.2872 + (((tickAnim - 7) / 8) * (11.49786-(7.2872)));
            yy = 1.04856 + (((tickAnim - 7) / 8) * (2.49807-(1.04856)));
            zz = -0.04182 + (((tickAnim - 7) / 8) * (-0.09821-(-0.04182)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 11.49786 + (((tickAnim - 15) / 10) * (9.49744-(11.49786)));
            yy = 2.49807 + (((tickAnim - 15) / 10) * (2.99799-(2.49807)));
            zz = -0.09821 + (((tickAnim - 15) / 10) * (-0.10697-(-0.09821)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 9.49744 + (((tickAnim - 25) / 20) * (6.99744-(9.49744)));
            yy = 2.99799 + (((tickAnim - 25) / 20) * (2.99799-(2.99799)));
            zz = -0.10697 + (((tickAnim - 25) / 20) * (-0.10697-(-0.10697)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 6.99744 + (((tickAnim - 45) / 10) * (7.47244-(6.99744)));
            yy = 2.99799 + (((tickAnim - 45) / 10) * (2.99799-(2.99799)));
            zz = -0.10697 + (((tickAnim - 45) / 10) * (-0.10697-(-0.10697)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7.47244 + (((tickAnim - 55) / 5) * (6.74744-(7.47244)));
            yy = 2.99799 + (((tickAnim - 55) / 5) * (2.99799-(2.99799)));
            zz = -0.10697 + (((tickAnim - 55) / 5) * (-0.10697-(-0.10697)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 6.74744 + (((tickAnim - 60) / 10) * (0.8232-(6.74744)));
            yy = 2.99799 + (((tickAnim - 60) / 10) * (-13.69368-(2.99799)));
            zz = -0.10697 + (((tickAnim - 60) / 10) * (-0.19179-(-0.10697)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = 0.8232 + (((tickAnim - 70) / 25) * (-9.26213-(0.8232)));
            yy = -13.69368 + (((tickAnim - 70) / 25) * (-17.52645-(-13.69368)));
            zz = -0.19179 + (((tickAnim - 70) / 25) * (-0.94201-(-0.19179)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -9.26213 + (((tickAnim - 95) / 10) * (-10.01213-(-9.26213)));
            yy = -17.52645 + (((tickAnim - 95) / 10) * (-17.52645-(-17.52645)));
            zz = -0.94201 + (((tickAnim - 95) / 10) * (-0.94201-(-0.94201)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -10.01213 + (((tickAnim - 105) / 15) * (0-(-10.01213)));
            yy = -17.52645 + (((tickAnim - 105) / 15) * (0-(-17.52645)));
            zz = -0.94201 + (((tickAnim - 105) / 15) * (0-(-0.94201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.71762-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (7.77885-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.13782-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -2.71762 + (((tickAnim - 7) / 8) * (7.32017-(-2.71762)));
            yy = 7.77885 + (((tickAnim - 7) / 8) * (18.31353-(7.77885)));
            zz = -1.13782 + (((tickAnim - 7) / 8) * (-2.66615-(-1.13782)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 7.32017 + (((tickAnim - 15) / 10) * (4.50651-(7.32017)));
            yy = 18.31353 + (((tickAnim - 15) / 10) * (20.30527-(18.31353)));
            zz = -2.66615 + (((tickAnim - 15) / 10) * (-2.85864-(-2.66615)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 4.50651 + (((tickAnim - 25) / 20) * (2.98151-(4.50651)));
            yy = 20.30527 + (((tickAnim - 25) / 20) * (20.30527-(20.30527)));
            zz = -2.85864 + (((tickAnim - 25) / 20) * (-2.85864-(-2.85864)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 2.98151 + (((tickAnim - 45) / 10) * (-18.5656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(2.98151)));
            yy = 20.30527 + (((tickAnim - 45) / 10) * (35.15001-(20.30527)));
            zz = -2.85864 + (((tickAnim - 45) / 10) * (-5.30306-(-2.85864)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -18.5656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 55) / 5) * (-12.14055-(-18.5656+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 35.15001 + (((tickAnim - 55) / 5) * (35.15001-(35.15001)));
            zz = -5.30306 + (((tickAnim - 55) / 5) * (-5.30306-(-5.30306)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.14055 + (((tickAnim - 60) / 10) * (-4.08342-(-12.14055)));
            yy = 35.15001 + (((tickAnim - 60) / 10) * (-7.85475-(35.15001)));
            zz = -5.30306 + (((tickAnim - 60) / 10) * (2.98287-(-5.30306)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = -4.08342 + (((tickAnim - 70) / 25) * (-10.08342-(-4.08342)));
            yy = -7.85475 + (((tickAnim - 70) / 25) * (-7.85475-(-7.85475)));
            zz = 2.98287 + (((tickAnim - 70) / 25) * (2.98287-(2.98287)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -10.08342 + (((tickAnim - 95) / 10) * (-9.58342-(-10.08342)));
            yy = -7.85475 + (((tickAnim - 95) / 10) * (-7.85475-(-7.85475)));
            zz = 2.98287 + (((tickAnim - 95) / 10) * (2.98287-(2.98287)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -9.58342 + (((tickAnim - 105) / 15) * (0-(-9.58342)));
            yy = -7.85475 + (((tickAnim - 105) / 15) * (0-(-7.85475)));
            zz = 2.98287 + (((tickAnim - 105) / 15) * (0-(2.98287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (1.47993-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (5.08851-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.72533-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 1.47993 + (((tickAnim - 7) / 8) * (-11.8161-(1.47993)));
            yy = 5.08851 + (((tickAnim - 7) / 8) * (12.12896-(5.08851)));
            zz = 0.72533 + (((tickAnim - 7) / 8) * (1.73081-(0.72533)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -11.8161 + (((tickAnim - 15) / 10) * (-8.98109-(-11.8161)));
            yy = 12.12896 + (((tickAnim - 15) / 10) * (14.60325-(12.12896)));
            zz = 1.73081 + (((tickAnim - 15) / 10) * (2.09845-(1.73081)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -8.98109 + (((tickAnim - 25) / 20) * (-8.98109-(-8.98109)));
            yy = 14.60325 + (((tickAnim - 25) / 20) * (14.60325-(14.60325)));
            zz = 2.09845 + (((tickAnim - 25) / 20) * (2.09845-(2.09845)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -8.98109 + (((tickAnim - 45) / 10) * (7.14244-(-8.98109)));
            yy = 14.60325 + (((tickAnim - 45) / 10) * (12.01158-(14.60325)));
            zz = 2.09845 + (((tickAnim - 45) / 10) * (7.08399-(2.09845)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7.14244 + (((tickAnim - 55) / 5) * (8.66744-(7.14244)));
            yy = 12.01158 + (((tickAnim - 55) / 5) * (12.01158-(12.01158)));
            zz = 7.08399 + (((tickAnim - 55) / 5) * (7.08399-(7.08399)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 8.66744 + (((tickAnim - 60) / 5) * (17.69008-(8.66744)));
            yy = 12.01158 + (((tickAnim - 60) / 5) * (-5.44541-(12.01158)));
            zz = 7.08399 + (((tickAnim - 60) / 5) * (-3.81219-(7.08399)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 17.69008 + (((tickAnim - 65) / 5) * (11.25-(17.69008)));
            yy = -5.44541 + (((tickAnim - 65) / 5) * (0-(-5.44541)));
            zz = -3.81219 + (((tickAnim - 65) / 5) * (0-(-3.81219)));
        }
        else if (tickAnim >= 70 && tickAnim < 95) {
            xx = 11.25 + (((tickAnim - 70) / 25) * (19.75-(11.25)));
            yy = 0 + (((tickAnim - 70) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 25) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 19.75 + (((tickAnim - 95) / 10) * (20.25-(19.75)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 20.25 + (((tickAnim - 105) / 15) * (0-(20.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 15) / 105) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 105) * (0-(0.05)));
            zz = 0 + (((tickAnim - 15) / 105) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -6.75 + (((tickAnim - 15) / 2) * (-4.47164-(-6.75)));
            yy = 9.5 + (((tickAnim - 15) / 2) * (10.04977-(9.5)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -4.47164 + (((tickAnim - 17) / 1) * (-6.75-(-4.47164)));
            yy = 10.04977 + (((tickAnim - 17) / 1) * (9.5-(10.04977)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 18) / 2) * (-4.47164-(-6.75)));
            yy = 9.5 + (((tickAnim - 18) / 2) * (10.04977-(9.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -4.47164 + (((tickAnim - 20) / 2) * (-6.75-(-4.47164)));
            yy = 10.04977 + (((tickAnim - 20) / 2) * (9.5-(10.04977)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -6.75 + (((tickAnim - 22) / 3) * (-9.5-(-6.75)));
            yy = 9.5 + (((tickAnim - 22) / 3) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -9.5 + (((tickAnim - 25) / 20) * (-9.5-(-9.5)));
            yy = 9.5 + (((tickAnim - 25) / 20) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -9.5 + (((tickAnim - 45) / 10) * (-4.525-(-9.5)));
            yy = 9.5 + (((tickAnim - 45) / 10) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -4.525 + (((tickAnim - 55) / 5) * (-3-(-4.525)));
            yy = 9.5 + (((tickAnim - 55) / 5) * (9.5-(9.5)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -3 + (((tickAnim - 60) / 5) * (-0.37206-(-3)));
            yy = 9.5 + (((tickAnim - 60) / 5) * (-8.40811-(9.5)));
            zz = 0 + (((tickAnim - 60) / 5) * (1.07163-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -0.37206 + (((tickAnim - 65) / 5) * (0-(-0.37206)));
            yy = -8.40811 + (((tickAnim - 65) / 5) * (0-(-8.40811)));
            zz = 1.07163 + (((tickAnim - 65) / 5) * (0-(1.07163)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 89) {
            xx = -1.5 + (((tickAnim - 88) / 1) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 88) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 1) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 89) / 2) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 89) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 2) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = -1.5 + (((tickAnim - 91) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 15) / 55) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 55) * (0-(0.05)));
            zz = 0 + (((tickAnim - 15) / 55) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 86) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 9) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 28) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 28) / 4) * (-0.0075-(1)));
            zz = 1 + (((tickAnim - 28) / 4) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 32) / 3) * (1-(1)));
            yy = -0.0075 + (((tickAnim - 32) / 3) * (1-(-0.0075)));
            zz = 1 + (((tickAnim - 32) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 120) {
            xx = 11.25 + (((tickAnim - 15) / 105) * (0-(11.25)));
            yy = 0 + (((tickAnim - 15) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 105) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 120) {
            xx = 9.5 + (((tickAnim - 15) / 105) * (0-(9.5)));
            yy = 0 + (((tickAnim - 15) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 105) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.64903-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.10318-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.07187-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 8.64903 + (((tickAnim - 7) / 8) * (15.4948-(8.64903)));
            yy = -0.10318 + (((tickAnim - 7) / 8) * (-0.23954-(-0.10318)));
            zz = 1.07187 + (((tickAnim - 7) / 8) * (2.4885-(1.07187)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 15.4948 + (((tickAnim - 15) / 45) * (15.4948-(15.4948)));
            yy = -0.23954 + (((tickAnim - 15) / 45) * (-0.23954-(-0.23954)));
            zz = 2.4885 + (((tickAnim - 15) / 45) * (2.4885-(2.4885)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 15.4948 + (((tickAnim - 60) / 15) * (19.4948-(15.4948)));
            yy = -0.23954 + (((tickAnim - 60) / 15) * (-0.23954-(-0.23954)));
            zz = 2.4885 + (((tickAnim - 60) / 15) * (2.4885-(2.4885)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 19.4948 + (((tickAnim - 75) / 30) * (19.4948-(19.4948)));
            yy = -0.23954 + (((tickAnim - 75) / 30) * (-0.23954-(-0.23954)));
            zz = 2.4885 + (((tickAnim - 75) / 30) * (2.4885-(2.4885)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 19.4948 + (((tickAnim - 105) / 15) * (0-(19.4948)));
            yy = -0.23954 + (((tickAnim - 105) / 15) * (0-(-0.23954)));
            zz = 2.4885 + (((tickAnim - 105) / 15) * (0-(2.4885)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -10.25 + (((tickAnim - 15) / 45) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -10.25 + (((tickAnim - 60) / 45) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -10.25 + (((tickAnim - 105) / 15) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 13.75 + (((tickAnim - 15) / 45) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 13.75 + (((tickAnim - 60) / 45) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 13.75 + (((tickAnim - 105) / 15) * (0-(13.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 15) / 45) * (-20-(-20)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -20 + (((tickAnim - 60) / 15) * (-19.25-(-20)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -19.25 + (((tickAnim - 75) / 30) * (-19.25-(-19.25)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -19.25 + (((tickAnim - 105) / 15) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -22.5 + (((tickAnim - 15) / 45) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -22.5 + (((tickAnim - 60) / 15) * (-18.25-(-22.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -18.25 + (((tickAnim - 75) / 30) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -18.25 + (((tickAnim - 105) / 15) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -14.5 + (((tickAnim - 15) / 45) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -14.5 + (((tickAnim - 60) / 45) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = -14.5 + (((tickAnim - 105) / 8) * (37.09-(-14.5)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 37.09 + (((tickAnim - 113) / 7) * (0-(37.09)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = -0.325 + (((tickAnim - 15) / 45) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = -0.325 + (((tickAnim - 60) / 45) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 105) / 15) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-38.285-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -38.285 + (((tickAnim - 7) / 8) * (11-(-38.285)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 11 + (((tickAnim - 15) / 45) * (11-(11)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 11 + (((tickAnim - 60) / 45) * (11-(11)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 11 + (((tickAnim - 105) / 8) * (-43.89-(11)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -43.89 + (((tickAnim - 113) / 7) * (0-(-43.89)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = -0.5 + (((tickAnim - 15) / 45) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 15) / 45) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = -0.5 + (((tickAnim - 60) / 45) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 60) / 45) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 105) / 15) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 105) / 15) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (75.535-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 75.535 + (((tickAnim - 7) / 8) * (26.25-(75.535)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 26.25 + (((tickAnim - 15) / 45) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 26.25 + (((tickAnim - 60) / 45) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 26.25 + (((tickAnim - 105) / 8) * (60.6-(26.25)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 60.6 + (((tickAnim - 113) / 7) * (0-(60.6)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 105) {
            xx = 7.5 + (((tickAnim - 15) / 90) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 90) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 7.5 + (((tickAnim - 105) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.5 + (((tickAnim - 15) / 20) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.5 + (((tickAnim - 35) / 15) * (0-(-18.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-5.875-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.875 + (((tickAnim - 15) / 20) * (-5.875-(-5.875)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.875 + (((tickAnim - 35) / 15) * (0-(-5.875)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-8.45479-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.44616-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.69119-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.45479 + (((tickAnim - 15) / 20) * (-8.45479-(-8.45479)));
            yy = 5.44616 + (((tickAnim - 15) / 20) * (5.44616-(5.44616)));
            zz = -8.69119 + (((tickAnim - 15) / 20) * (-8.69119-(-8.69119)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.45479 + (((tickAnim - 35) / 15) * (0-(-8.45479)));
            yy = 5.44616 + (((tickAnim - 35) / 15) * (0-(5.44616)));
            zz = -8.69119 + (((tickAnim - 35) / 15) * (0-(-8.69119)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.46158-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.8652-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.2235-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.46158 + (((tickAnim - 15) / 20) * (7.46158-(7.46158)));
            yy = 21.8652 + (((tickAnim - 15) / 20) * (21.8652-(21.8652)));
            zz = -6.2235 + (((tickAnim - 15) / 20) * (-6.2235-(-6.2235)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.46158 + (((tickAnim - 35) / 15) * (0-(7.46158)));
            yy = 21.8652 + (((tickAnim - 35) / 15) * (0-(21.8652)));
            zz = -6.2235 + (((tickAnim - 35) / 15) * (0-(-6.2235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.73964-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.48061-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-19.85453-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.73964 + (((tickAnim - 15) / 20) * (3.73964-(3.73964)));
            yy = 8.48061 + (((tickAnim - 15) / 20) * (8.48061-(8.48061)));
            zz = -19.85453 + (((tickAnim - 15) / 20) * (-19.85453-(-19.85453)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.73964 + (((tickAnim - 35) / 15) * (0-(3.73964)));
            yy = 8.48061 + (((tickAnim - 35) / 15) * (0-(8.48061)));
            zz = -19.85453 + (((tickAnim - 35) / 15) * (0-(-19.85453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.92701-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.19156-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-23.02205-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -22.92701 + (((tickAnim - 15) / 20) * (-22.92701-(-22.92701)));
            yy = 6.19156 + (((tickAnim - 15) / 20) * (6.19156-(6.19156)));
            zz = -23.02205 + (((tickAnim - 15) / 20) * (-23.02205-(-23.02205)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -22.92701 + (((tickAnim - 35) / 15) * (0-(-22.92701)));
            yy = 6.19156 + (((tickAnim - 35) / 15) * (0-(6.19156)));
            zz = -23.02205 + (((tickAnim - 35) / 15) * (0-(-23.02205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.5 + (((tickAnim - 15) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.75 + (((tickAnim - 15) / 20) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 35) / 15) * (0-(13.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 20) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.2 + (((tickAnim - 35) / 15) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -9 + (((tickAnim - 15) / 20) * (-9-(-9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 35) / 15) * (0-(-9)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 1 + (((tickAnim - 15) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 4) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 15) / 4) * (1-(1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 19) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 19) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 19) / 4) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 23) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 12) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 1 + (((tickAnim - 35) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 4) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 35) / 4) * (1-(1)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 39) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 39) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 39) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.94206-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.0424-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.9766-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.94206 + (((tickAnim - 15) / 20) * (5.94206-(5.94206)));
            yy = -11.0424 + (((tickAnim - 15) / 20) * (-11.0424-(-11.0424)));
            zz = -6.9766 + (((tickAnim - 15) / 20) * (-6.9766-(-6.9766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.94206 + (((tickAnim - 35) / 15) * (0-(5.94206)));
            yy = -11.0424 + (((tickAnim - 35) / 15) * (0-(-11.0424)));
            zz = -6.9766 + (((tickAnim - 35) / 15) * (0-(-6.9766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39 + (((tickAnim - 15) / 20) * (39-(39)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 35) / 15) * (0-(39)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-94.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -94.25 + (((tickAnim - 15) / 20) * (-94.25-(-94.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.25 + (((tickAnim - 35) / 15) * (0-(-94.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.8 + (((tickAnim - 15) / 20) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.8 + (((tickAnim - 35) / 15) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.75 + (((tickAnim - 15) / 20) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.75 + (((tickAnim - 35) / 15) * (0-(70.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.325 + (((tickAnim - 15) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.325 + (((tickAnim - 35) / 15) * (0-(0.325)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (5.94206-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.0424-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.9766-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.94206 + (((tickAnim - 15) / 20) * (5.94206-(5.94206)));
            yy = 11.0424 + (((tickAnim - 15) / 20) * (11.0424-(11.0424)));
            zz = 6.9766 + (((tickAnim - 15) / 20) * (6.9766-(6.9766)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.94206 + (((tickAnim - 35) / 15) * (0-(5.94206)));
            yy = 11.0424 + (((tickAnim - 35) / 15) * (0-(11.0424)));
            zz = 6.9766 + (((tickAnim - 35) / 15) * (0-(6.9766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 39 + (((tickAnim - 15) / 20) * (39-(39)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 39 + (((tickAnim - 35) / 15) * (0-(39)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 15) / 20) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.575 + (((tickAnim - 35) / 15) * (0-(0.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-94.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -94.25 + (((tickAnim - 15) / 20) * (-94.25-(-94.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -94.25 + (((tickAnim - 35) / 15) * (0-(-94.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.8 + (((tickAnim - 15) / 20) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.8 + (((tickAnim - 35) / 15) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (70.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 70.75 + (((tickAnim - 15) / 20) * (70.75-(70.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 70.75 + (((tickAnim - 35) / 15) * (0-(70.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.325 + (((tickAnim - 15) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.325 + (((tickAnim - 35) / 15) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 6.25 + (((tickAnim - 8) / 3) * (4.725-(6.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4.725 + (((tickAnim - 11) / 2) * (5.5-(4.725)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 13) / 2) * (6.25-(5.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.25 + (((tickAnim - 15) / 3) * (4.725-(6.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 4.725 + (((tickAnim - 18) / 3) * (5.5-(4.725)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 5.5 + (((tickAnim - 21) / 2) * (0-(5.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5.25 + (((tickAnim - 8) / 3) * (-1.5-(5.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 11) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (5.25-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5.25 + (((tickAnim - 15) / 3) * (-3.75-(5.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -3.75 + (((tickAnim - 18) / 3) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9 + (((tickAnim - 8) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.75 + (((tickAnim - 13) / 2) * (-9-(-2.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 15) / 3) * (0-(-9)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -2.75 + (((tickAnim - 21) / 2) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -13.5 + (((tickAnim - 8) / 3) * (-16.25-(-13.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -16.25 + (((tickAnim - 11) / 2) * (-13-(-16.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -13 + (((tickAnim - 13) / 2) * (-13.5-(-13)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -13.5 + (((tickAnim - 15) / 3) * (-16.25-(-13.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -16.25 + (((tickAnim - 18) / 3) * (-13-(-16.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -13 + (((tickAnim - 21) / 2) * (0-(-13)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-11.83-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -11.83 + (((tickAnim - 5) / 3) * (-1.25-(-11.83)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.25 + (((tickAnim - 8) / 3) * (7.5-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 11) / 2) * (5.8955-(7.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.42325-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-1.52552-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.8955 + (((tickAnim - 13) / 2) * (-1.25-(5.8955)));
            yy = 0.42325 + (((tickAnim - 13) / 2) * (0-(0.42325)));
            zz = -1.52552 + (((tickAnim - 13) / 2) * (0-(-1.52552)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 15) / 3) * (7.5-(-1.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 18) / 3) * (5.8955-(7.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0.42325-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (-1.52552-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 5.8955 + (((tickAnim - 21) / 2) * (0-(5.8955)));
            yy = 0.42325 + (((tickAnim - 21) / 2) * (0-(0.42325)));
            zz = -1.52552 + (((tickAnim - 21) / 2) * (0-(-1.52552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.33-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.33 + (((tickAnim - 5) / 3) * (14.75-(22.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 14.75 + (((tickAnim - 8) / 3) * (1.25-(14.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1.25 + (((tickAnim - 11) / 2) * (0-(1.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (14.75-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 14.75 + (((tickAnim - 15) / 3) * (1.25-(14.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.25 + (((tickAnim - 18) / 3) * (0-(1.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 5) / 3) * (0-(20.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (21.5-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 21.5 + (((tickAnim - 11) / 2) * (5.75-(21.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 13) / 2) * (0-(5.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (33.75-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 33.75 + (((tickAnim - 18) / 5) * (0-(33.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 8) / 7) * (18-(18)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 18 + (((tickAnim - 15) / 8) * (0-(18)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -27.75 + (((tickAnim - 8) / 7) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -27.75 + (((tickAnim - 15) / 8) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.5 + (((tickAnim - 8) / 7) * (23.5-(23.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 23.5 + (((tickAnim - 15) / 8) * (0-(23.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -27.25 + (((tickAnim - 8) / 7) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -27.25 + (((tickAnim - 15) / 8) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 7.25 + (((tickAnim - 0) / 20) * (-8-(7.25)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -8 + (((tickAnim - 20) / 15) * (7.25-(-8)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 7.25 + (((tickAnim - 35) / 9) * (-14-(7.25)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -14 + (((tickAnim - 44) / 4) * (0.64-(-14)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.64 + (((tickAnim - 48) / 2) * (7.25-(0.64)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 13.25 + (((tickAnim - 0) / 20) * (-4.25-(13.25)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -4.25 + (((tickAnim - 20) / 15) * (13.25-(-4.25)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 13.25 + (((tickAnim - 35) / 4) * (0.02-(13.25)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0.02 + (((tickAnim - 39) / 5) * (-1-(0.02)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 44) / 4) * (6.32-(-1)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 6.32 + (((tickAnim - 48) / 2) * (13.25-(6.32)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -11 + (((tickAnim - 0) / 5) * (13.35-(-11)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 13.35 + (((tickAnim - 5) / 15) * (-1.25-(13.35)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 20) / 5) * (-12-(-1.25)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -12 + (((tickAnim - 25) / 10) * (-11-(-12)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = -11 + (((tickAnim - 35) / 4) * (10.32-(-11)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 10.32 + (((tickAnim - 39) / 5) * (5-(10.32)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 44) / 4) * (-13-(5)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -13 + (((tickAnim - 48) / 2) * (-11-(-13)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -13.25 + (((tickAnim - 0) / 5) * (11.62-(-13.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 11.62 + (((tickAnim - 5) / 15) * (-3.5-(11.62)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -3.5 + (((tickAnim - 20) / 5) * (-12.33-(-3.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -12.33 + (((tickAnim - 25) / 10) * (-13.25-(-12.33)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = -13.25 + (((tickAnim - 35) / 4) * (16.41-(-13.25)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 16.41 + (((tickAnim - 39) / 5) * (3-(16.41)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 3 + (((tickAnim - 44) / 4) * (-20.21-(3)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = -20.21 + (((tickAnim - 48) / 2) * (-13.25-(-20.21)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6.61037 + (((tickAnim - 0) / 20) * (6.80692-(6.61037)));
            yy = -2.52361 + (((tickAnim - 0) / 20) * (-1.30493-(-2.52361)));
            zz = 3.5633 + (((tickAnim - 0) / 20) * (-2.31502-(3.5633)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.80692 + (((tickAnim - 20) / 15) * (6.61037-(6.80692)));
            yy = -1.30493 + (((tickAnim - 20) / 15) * (-2.52361-(-1.30493)));
            zz = -2.31502 + (((tickAnim - 20) / 15) * (3.5633-(-2.31502)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 6.61037 + (((tickAnim - 35) / 9) * (6.80692-(6.61037)));
            yy = -2.52361 + (((tickAnim - 35) / 9) * (-1.30493-(-2.52361)));
            zz = 3.5633 + (((tickAnim - 35) / 9) * (-2.31502-(3.5633)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 6.80692 + (((tickAnim - 44) / 6) * (6.61037-(6.80692)));
            yy = -1.30493 + (((tickAnim - 44) / 6) * (-2.52361-(-1.30493)));
            zz = -2.31502 + (((tickAnim - 44) / 6) * (3.5633-(-2.31502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -0.12548 + (((tickAnim - 0) / 20) * (0.24823-(-0.12548)));
            yy = -9.56455 + (((tickAnim - 0) / 20) * (-9.36602-(-9.56455)));
            zz = 0.75768 + (((tickAnim - 0) / 20) * (-1.51449-(0.75768)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0.24823 + (((tickAnim - 20) / 15) * (-0.12548-(0.24823)));
            yy = -9.36602 + (((tickAnim - 20) / 15) * (-9.56455-(-9.36602)));
            zz = -1.51449 + (((tickAnim - 20) / 15) * (0.75768-(-1.51449)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -0.12548 + (((tickAnim - 35) / 9) * (0.24823-(-0.12548)));
            yy = -9.56455 + (((tickAnim - 35) / 9) * (-9.36602-(-9.56455)));
            zz = 0.75768 + (((tickAnim - 35) / 9) * (-1.51449-(0.75768)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.24823 + (((tickAnim - 44) / 6) * (-0.12548-(0.24823)));
            yy = -9.36602 + (((tickAnim - 44) / 6) * (-9.56455-(-9.36602)));
            zz = -1.51449 + (((tickAnim - 44) / 6) * (0.75768-(-1.51449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 11.07561 + (((tickAnim - 0) / 20) * (7.91575-(11.07561)));
            yy = -15.9553 + (((tickAnim - 0) / 20) * (-15.36355-(-15.9553)));
            zz = 2.55503 + (((tickAnim - 0) / 20) * (14.22406-(2.55503)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 7.91575 + (((tickAnim - 20) / 15) * (11.07561-(7.91575)));
            yy = -15.36355 + (((tickAnim - 20) / 15) * (-15.9553-(-15.36355)));
            zz = 14.22406 + (((tickAnim - 20) / 15) * (2.55503-(14.22406)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 11.07561 + (((tickAnim - 35) / 9) * (7.91575-(11.07561)));
            yy = -15.9553 + (((tickAnim - 35) / 9) * (-15.36355-(-15.9553)));
            zz = 2.55503 + (((tickAnim - 35) / 9) * (14.22406-(2.55503)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 7.91575 + (((tickAnim - 44) / 6) * (11.07561-(7.91575)));
            yy = -15.36355 + (((tickAnim - 44) / 6) * (-15.9553-(-15.36355)));
            zz = 14.22406 + (((tickAnim - 44) / 6) * (2.55503-(14.22406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 35) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 35) / 15) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.83166 + (((tickAnim - 0) / 20) * (-5.02312-(-2.83166)));
            yy = -24.24503 + (((tickAnim - 0) / 20) * (-22.7591-(-24.24503)));
            zz = 6.69406 + (((tickAnim - 0) / 20) * (12.18545-(6.69406)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.02312 + (((tickAnim - 20) / 15) * (-2.83166-(-5.02312)));
            yy = -22.7591 + (((tickAnim - 20) / 15) * (-24.24503-(-22.7591)));
            zz = 12.18545 + (((tickAnim - 20) / 15) * (6.69406-(12.18545)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -2.83166 + (((tickAnim - 35) / 9) * (-5.02312-(-2.83166)));
            yy = -24.24503 + (((tickAnim - 35) / 9) * (-22.7591-(-24.24503)));
            zz = 6.69406 + (((tickAnim - 35) / 9) * (12.18545-(6.69406)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.02312 + (((tickAnim - 44) / 6) * (-2.83166-(-5.02312)));
            yy = -22.7591 + (((tickAnim - 44) / 6) * (-24.24503-(-22.7591)));
            zz = 12.18545 + (((tickAnim - 44) / 6) * (6.69406-(12.18545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(1.80189), neck3.rotateAngleY + (float) Math.toRadians(-16.01808), neck3.rotateAngleZ + (float) Math.toRadians(-6.10978));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-9.5), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -28 + (((tickAnim - 0) / 20) * (15.75-(-28)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 20) / 15) * (-28-(15.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -28 + (((tickAnim - 35) / 9) * (15.75-(-28)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 44) / 6) * (-28-(15.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -24.5 + (((tickAnim - 0) / 20) * (24.5-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 24.5 + (((tickAnim - 20) / 15) * (-24.5-(24.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -24.5 + (((tickAnim - 35) / 9) * (24.5-(-24.5)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 24.5 + (((tickAnim - 44) / 6) * (-24.5-(24.5)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 20) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 9) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
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
            xx = 33.31146 + (((tickAnim - 0) / 20) * (20.34172-(33.31146)));
            yy = -2.88987 + (((tickAnim - 0) / 20) * (-0.22576-(-2.88987)));
            zz = -2.1306 + (((tickAnim - 0) / 20) * (1.71885-(-2.1306)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 20.34172 + (((tickAnim - 20) / 9) * (-58.39396-(20.34172)));
            yy = -0.22576 + (((tickAnim - 20) / 9) * (-1.40981-(-0.22576)));
            zz = 1.71885 + (((tickAnim - 20) / 9) * (0.00798-(1.71885)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -58.39396 + (((tickAnim - 29) / 2) * (-33.54125-(-58.39396)));
            yy = -1.40981 + (((tickAnim - 29) / 2) * (-2.14984-(-1.40981)));
            zz = 0.00798 + (((tickAnim - 29) / 2) * (-1.06131-(0.00798)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -33.54125 + (((tickAnim - 31) / 4) * (33.31146-(-33.54125)));
            yy = -2.14984 + (((tickAnim - 31) / 4) * (-2.88987-(-2.14984)));
            zz = -1.06131 + (((tickAnim - 31) / 4) * (-2.1306-(-1.06131)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 33.31146 + (((tickAnim - 35) / 9) * (20.34172-(33.31146)));
            yy = -2.88987 + (((tickAnim - 35) / 9) * (-0.22576-(-2.88987)));
            zz = -2.1306 + (((tickAnim - 35) / 9) * (1.71885-(-2.1306)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 20.34172 + (((tickAnim - 44) / 3) * (-32.44982-(20.34172)));
            yy = -0.22576 + (((tickAnim - 44) / 3) * (-1.36752-(-0.22576)));
            zz = 1.71885 + (((tickAnim - 44) / 3) * (0.06909-(1.71885)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = -32.44982 + (((tickAnim - 47) / 1) * (-45.89418-(-32.44982)));
            yy = -1.36752 + (((tickAnim - 47) / 1) * (-2.1287-(-1.36752)));
            zz = 0.06909 + (((tickAnim - 47) / 1) * (-1.03076-(0.06909)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -45.89418 + (((tickAnim - 48) / 2) * (33.31146-(-45.89418)));
            yy = -2.1287 + (((tickAnim - 48) / 2) * (-2.88987-(-2.1287)));
            zz = -1.03076 + (((tickAnim - 48) / 2) * (-2.1306-(-1.03076)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 20) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 0) / 20) * (-0.4-(-0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (-0.525-(0)));
            zz = -0.4 + (((tickAnim - 20) / 15) * (-0.2-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.525 + (((tickAnim - 35) / 9) * (0-(-0.525)));
            zz = -0.2 + (((tickAnim - 35) / 9) * (-0.4-(-0.2)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (-0.525-(0)));
            zz = -0.4 + (((tickAnim - 44) / 6) * (-0.2-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.25 + (((tickAnim - 0) / 5) * (-3.37-(19.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.37 + (((tickAnim - 5) / 5) * (-20-(-3.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 10) / 4) * (-14.81-(-20)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -14.81 + (((tickAnim - 14) / 6) * (105.25-(-14.81)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 105.25 + (((tickAnim - 20) / 3) * (77.02-(105.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 77.02 + (((tickAnim - 23) / 4) * (93.28-(77.02)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 93.28 + (((tickAnim - 27) / 4) * (81.76-(93.28)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 81.76 + (((tickAnim - 31) / 4) * (19.25-(81.76)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 19.25 + (((tickAnim - 35) / 3) * (-3.88-(19.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -3.88 + (((tickAnim - 38) / 2) * (-13.34-(-3.88)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -13.34 + (((tickAnim - 40) / 4) * (105.25-(-13.34)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 105.25 + (((tickAnim - 44) / 3) * (69.79-(105.25)));
            yy = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 3) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 69.79 + (((tickAnim - 47) / 1) * (80.32-(69.79)));
            yy = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 80.32 + (((tickAnim - 48) / 2) * (19.25-(80.32)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 5) * (0.905-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.905 + (((tickAnim - 5) / 5) * (0.9-(0.905)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 4) * (0-(0.9)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 20) / 3) * (1.3-(-0.05)));
            zz = 0.7 + (((tickAnim - 20) / 3) * (0.365-(0.7)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 1.3 + (((tickAnim - 23) / 8) * (0.43-(1.3)));
            zz = 0.365 + (((tickAnim - 23) / 8) * (0.455-(0.365)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.43 + (((tickAnim - 31) / 4) * (-0.05-(0.43)));
            zz = 0.455 + (((tickAnim - 31) / 4) * (0-(0.455)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 35) / 3) * (1.16-(-0.05)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1.16 + (((tickAnim - 38) / 2) * (0.525-(1.16)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0.525 + (((tickAnim - 40) / 4) * (-0.05-(0.525)));
            zz = 0 + (((tickAnim - 40) / 4) * (0.7-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 44) / 3) * (0.625-(-0.05)));
            zz = 0.7 + (((tickAnim - 44) / 3) * (0.3-(0.7)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 47) / 3) * (-0.05-(0.625)));
            zz = 0.3 + (((tickAnim - 47) / 3) * (0-(0.3)));
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
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625-20))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+20))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*280/0.245-70))*0.05);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*280/0.245))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*280/0.245-30))*0.3);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -22.19097 + (((tickAnim - 0) / 6) * (16.02597-(-22.19097)));
            yy = -1.83507 + (((tickAnim - 0) / 6) * (-8.47222-(-1.83507)));
            zz = 3.8311 + (((tickAnim - 0) / 6) * (0.19109-(3.8311)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 16.02597 + (((tickAnim - 6) / 3) * (-1.89192-(16.02597)));
            yy = -8.47222 + (((tickAnim - 6) / 3) * (-3.77862-(-8.47222)));
            zz = 0.19109 + (((tickAnim - 6) / 3) * (-4.06587-(0.19109)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.89192 + (((tickAnim - 9) / 4) * (-22.19097-(-1.89192)));
            yy = -3.77862 + (((tickAnim - 9) / 4) * (-1.83507-(-3.77862)));
            zz = -4.06587 + (((tickAnim - 9) / 4) * (3.8311-(-4.06587)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -21.5 + (((tickAnim - 0) / 6) * (26.99839-(-21.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.7025-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.26267-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 26.99839 + (((tickAnim - 6) / 3) * (-3.36954-(26.99839)));
            yy = 0.7025 + (((tickAnim - 6) / 3) * (2.05689-(0.7025)));
            zz = -0.26267 + (((tickAnim - 6) / 3) * (6.1845-(-0.26267)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -3.36954 + (((tickAnim - 9) / 4) * (-21.5-(-3.36954)));
            yy = 2.05689 + (((tickAnim - 9) / 4) * (0-(2.05689)));
            zz = 6.1845 + (((tickAnim - 9) / 4) * (0-(6.1845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 6) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
            xx = 21 + (((tickAnim - 0) / 6) * (25.62744-(21)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.14293-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.1644-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 25.62744 + (((tickAnim - 6) / 2) * (-49.91-(25.62744)));
            yy = 2.14293 + (((tickAnim - 6) / 2) * (0-(2.14293)));
            zz = -0.1644 + (((tickAnim - 6) / 2) * (0-(-0.1644)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -49.91 + (((tickAnim - 8) / 2) * (-56.84777-(-49.91)));
            yy = 0 + (((tickAnim - 8) / 2) * (2.24712-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.11389-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -56.84777 + (((tickAnim - 10) / 3) * (21-(-56.84777)));
            yy = 2.24712 + (((tickAnim - 10) / 3) * (0-(2.24712)));
            zz = 0.11389 + (((tickAnim - 10) / 3) * (0-(0.11389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 6) * (0-(-0.4)));
            zz = -0.3 + (((tickAnim - 0) / 6) * (-0.125-(-0.3)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (-0.4-(0)));
            zz = -0.125 + (((tickAnim - 6) / 7) * (-0.3-(-0.125)));
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
            xx = 19.82434 + (((tickAnim - 0) / 2) * (-6.32943-(19.82434)));
            yy = 3.47062 + (((tickAnim - 0) / 2) * (2.31568-(3.47062)));
            zz = -4.50721 + (((tickAnim - 0) / 2) * (-3.57511-(-4.50721)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.32943 + (((tickAnim - 2) / 1) * (-8.04916-(-6.32943)));
            yy = 2.31568 + (((tickAnim - 2) / 1) * (1.94218-(2.31568)));
            zz = -3.57511 + (((tickAnim - 2) / 1) * (-0.58787-(-3.57511)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -8.04916 + (((tickAnim - 3) / 3) * (92.12071-(-8.04916)));
            yy = 1.94218 + (((tickAnim - 3) / 3) * (0.79584-(1.94218)));
            zz = -0.58787 + (((tickAnim - 3) / 3) * (2.35163-(-0.58787)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 92.12071 + (((tickAnim - 6) / 2) * (77.10332-(92.12071)));
            yy = 0.79584 + (((tickAnim - 6) / 2) * (1.79888-(0.79584)));
            zz = 2.35163 + (((tickAnim - 6) / 2) * (-0.22044-(2.35163)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.10332 + (((tickAnim - 8) / 2) * (92.18616-(77.10332)));
            yy = 1.79888 + (((tickAnim - 8) / 2) * (1.95246-(1.79888)));
            zz = -0.22044 + (((tickAnim - 8) / 2) * (0.51304-(-0.22044)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 92.18616 + (((tickAnim - 10) / 2) * (33.19495-(92.18616)));
            yy = 1.95246 + (((tickAnim - 10) / 2) * (2.96457-(1.95246)));
            zz = 0.51304 + (((tickAnim - 10) / 2) * (-2.83379-(0.51304)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 33.19495 + (((tickAnim - 12) / 1) * (19.82434-(33.19495)));
            yy = 2.96457 + (((tickAnim - 12) / 1) * (3.47062-(2.96457)));
            zz = -2.83379 + (((tickAnim - 12) / 1) * (-4.50721-(-2.83379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.3-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.12-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 2) / 4) * (0-(1.3)));
            zz = 0.12 + (((tickAnim - 2) / 4) * (0.4-(0.12)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.18-(0)));
            zz = 0.4 + (((tickAnim - 6) / 2) * (0.3-(0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.18 + (((tickAnim - 8) / 0) * (0.65-(1.18)));
            zz = 0.3 + (((tickAnim - 8) / 0) * (0.25-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 8) / 2) * (0.39-(0.65)));
            zz = 0.25 + (((tickAnim - 8) / 2) * (0.25-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.39 + (((tickAnim - 10) / 3) * (0-(0.39)));
            zz = 0.25 + (((tickAnim - 10) / 3) * (0-(0.25)));
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
            xx = 21.37934 + (((tickAnim - 0) / 3) * (-4.61754-(21.37934)));
            yy = 5.17653 + (((tickAnim - 0) / 3) * (3.04395-(5.17653)));
            zz = -3.84657 + (((tickAnim - 0) / 3) * (5.24156-(-3.84657)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -4.61754 + (((tickAnim - 3) / 3) * (-23.22621-(-4.61754)));
            yy = 3.04395 + (((tickAnim - 3) / 3) * (-0.52807-(3.04395)));
            zz = 5.24156 + (((tickAnim - 3) / 3) * (-1.99345-(5.24156)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -23.22621 + (((tickAnim - 6) / 7) * (21.37934-(-23.22621)));
            yy = -0.52807 + (((tickAnim - 6) / 7) * (5.17653-(-0.52807)));
            zz = -1.99345 + (((tickAnim - 6) / 7) * (-3.84657-(-1.99345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 6) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 7) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.75 + (((tickAnim - 0) / 3) * (1.42316-(32.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.23048-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-10.1648-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.42316 + (((tickAnim - 3) / 3) * (-23.08065-(1.42316)));
            yy = -1.23048 + (((tickAnim - 3) / 3) * (1.81506-(-1.23048)));
            zz = -10.1648 + (((tickAnim - 3) / 3) * (-4.92498-(-10.1648)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -23.08065 + (((tickAnim - 6) / 7) * (32.75-(-23.08065)));
            yy = 1.81506 + (((tickAnim - 6) / 7) * (0-(1.81506)));
            zz = -4.92498 + (((tickAnim - 6) / 7) * (0-(-4.92498)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 7) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
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
            xx = 19.75 + (((tickAnim - 0) / 2) * (-40.2475-(19.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.17668-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.43194-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -40.2475 + (((tickAnim - 2) / 1) * (-51.24625-(-40.2475)));
            yy = 0.17668 + (((tickAnim - 2) / 1) * (0.26502-(0.17668)));
            zz = 0.43194 + (((tickAnim - 2) / 1) * (0.64791-(0.43194)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -51.24625 + (((tickAnim - 3) / 0) * (-49.74438-(-51.24625)));
            yy = 0.26502 + (((tickAnim - 3) / 0) * (0.39753-(0.26502)));
            zz = 0.64791 + (((tickAnim - 3) / 0) * (0.97186-(0.64791)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -49.74438 + (((tickAnim - 3) / 1) * (-34.24313-(-49.74438)));
            yy = 0.39753 + (((tickAnim - 3) / 1) * (0.48587-(0.39753)));
            zz = 0.97186 + (((tickAnim - 3) / 1) * (1.18783-(0.97186)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -34.24313 + (((tickAnim - 4) / 2) * (22.50937-(-34.24313)));
            yy = 0.48587 + (((tickAnim - 4) / 2) * (0.66255-(0.48587)));
            zz = 1.18783 + (((tickAnim - 4) / 2) * (1.61977-(1.18783)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 22.50937 + (((tickAnim - 6) / 7) * (19.75-(22.50937)));
            yy = 0.66255 + (((tickAnim - 6) / 7) * (0-(0.66255)));
            zz = 1.61977 + (((tickAnim - 6) / 7) * (0-(1.61977)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.475 + (((tickAnim - 6) / 7) * (0-(-0.475)));
            zz = -0.2 + (((tickAnim - 6) / 7) * (0-(-0.2)));
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
            xx = 91.5 + (((tickAnim - 0) / 2) * (81.20168-(91.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.5659-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.94365-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 81.20168 + (((tickAnim - 2) / 1) * (90.40336-(81.20168)));
            yy = -0.5659 + (((tickAnim - 2) / 1) * (-1.1318-(-0.5659)));
            zz = 0.94365 + (((tickAnim - 2) / 1) * (1.8873-(0.94365)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 90.40336 + (((tickAnim - 3) / 0) * (84.12803-(90.40336)));
            yy = -1.1318 + (((tickAnim - 3) / 0) * (-1.30244-(-1.1318)));
            zz = 1.8873 + (((tickAnim - 3) / 0) * (0.36155-(1.8873)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 84.12803 + (((tickAnim - 3) / 2) * (26.61006-(84.12803)));
            yy = -1.30244 + (((tickAnim - 3) / 2) * (-2.45224-(-1.30244)));
            zz = 0.36155 + (((tickAnim - 3) / 2) * (4.08916-(0.36155)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 26.61006 + (((tickAnim - 5) / 1) * (24.88341-(26.61006)));
            yy = -2.45224 + (((tickAnim - 5) / 1) * (-2.82951-(-2.45224)));
            zz = 4.08916 + (((tickAnim - 5) / 1) * (4.71826-(4.08916)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.88341 + (((tickAnim - 6) / 2) * (-0.61144-(24.88341)));
            yy = -2.82951 + (((tickAnim - 6) / 2) * (-3.15002-(-2.82951)));
            zz = 4.71826 + (((tickAnim - 6) / 2) * (7.87302-(4.71826)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.61144 + (((tickAnim - 8) / 1) * (4.05929-(-0.61144)));
            yy = -3.15002 + (((tickAnim - 8) / 1) * (-1.71239-(-3.15002)));
            zz = 7.87302 + (((tickAnim - 8) / 1) * (2.85545-(7.87302)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 4.05929 + (((tickAnim - 9) / 4) * (91.5-(4.05929)));
            yy = -1.71239 + (((tickAnim - 9) / 4) * (0-(-1.71239)));
            zz = 2.85545 + (((tickAnim - 9) / 4) * (0-(2.85545)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.85-(0)));
            zz = 0.425 + (((tickAnim - 0) / 2) * (0.045-(0.425)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 2) / 1) * (0-(0.85)));
            zz = 0.045 + (((tickAnim - 2) / 1) * (0.21-(0.045)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0.21 + (((tickAnim - 3) / 3) * (0-(0.21)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.8-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.11-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.8 + (((tickAnim - 8) / 5) * (0-(1.8)));
            zz = 0.11 + (((tickAnim - 8) / 5) * (0.425-(0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625-80))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+40))*7), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625-20))*-1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-70))*7.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+10))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-100))*6.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*3));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+10))*-10), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625-100))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625))*4));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+50))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+80))*2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+45))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+150))*3));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+120))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+130))*2));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+200))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+240))*2));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+230))*-5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+320))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+550))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.625+350))*2));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(10.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+85))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+105))*8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+135))*-12), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(9.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+85))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-19+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+105))*8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.625+135))*-12), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSegisaurus entity = (EntityPrehistoricFloraSegisaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -16.69097 + (((tickAnim - 0) / 11) * (15.41741-(-16.69097)));
            yy = -1.83507 + (((tickAnim - 0) / 11) * (-0.37736-(-1.83507)));
            zz = 3.8311 + (((tickAnim - 0) / 11) * (1.88-(3.8311)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 15.41741 + (((tickAnim - 11) / 5) * (-5.07699-(15.41741)));
            yy = -0.37736 + (((tickAnim - 11) / 5) * (-0.44522-(-0.37736)));
            zz = 1.88 + (((tickAnim - 11) / 5) * (-4.13938-(1.88)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.07699 + (((tickAnim - 16) / 4) * (-19.19097-(-5.07699)));
            yy = -0.44522 + (((tickAnim - 16) / 4) * (-1.83507-(-0.44522)));
            zz = -4.13938 + (((tickAnim - 16) / 4) * (3.8311-(-4.13938)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -19.19097 + (((tickAnim - 20) / 2) * (-16.69097-(-19.19097)));
            yy = -1.83507 + (((tickAnim - 20) / 2) * (-1.83507-(-1.83507)));
            zz = 3.8311 + (((tickAnim - 20) / 2) * (3.8311-(3.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -10.75 + (((tickAnim - 0) / 11) * (35.25-(-10.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 35.25 + (((tickAnim - 11) / 5) * (-58.7385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55-(35.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (1.48738-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (5.85095-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -58.7385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55 + (((tickAnim - 16) / 4) * (-22.25-(-58.7385+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55)));
            yy = 1.48738 + (((tickAnim - 16) / 4) * (0-(1.48738)));
            zz = 5.85095 + (((tickAnim - 16) / 4) * (0-(5.85095)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -22.25 + (((tickAnim - 20) / 2) * (-10.75-(-22.25)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 18.75 + (((tickAnim - 0) / 11) * (2.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 2.5 + (((tickAnim - 11) / 4) * (-41.68847-(2.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.37854-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-1.02195-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -41.68847 + (((tickAnim - 15) / 3) * (-48.68048-(-41.68847)));
            yy = 0.37854 + (((tickAnim - 15) / 3) * (0.49691-(0.37854)));
            zz = -1.02195 + (((tickAnim - 15) / 3) * (1.21483-(-1.02195)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -48.68048 + (((tickAnim - 18) / 2) * (26-(-48.68048)));
            yy = 0.49691 + (((tickAnim - 18) / 2) * (0-(0.49691)));
            zz = 1.21483 + (((tickAnim - 18) / 2) * (0-(1.21483)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 26 + (((tickAnim - 20) / 2) * (18.75-(26)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = -0.3 + (((tickAnim - 0) / 11) * (0-(-0.3)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (-0.3-(0)));
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
            xx = 8.07434 + (((tickAnim - 0) / 3) * (-5.08783-(8.07434)));
            yy = 3.47062 + (((tickAnim - 0) / 3) * (1.73531-(3.47062)));
            zz = -4.50721 + (((tickAnim - 0) / 3) * (-2.2536-(-4.50721)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5.08783 + (((tickAnim - 3) / 2) * (0-(-5.08783)));
            yy = 1.73531 + (((tickAnim - 3) / 2) * (0-(1.73531)));
            zz = -2.2536 + (((tickAnim - 3) / 2) * (0-(-2.2536)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (92.12071-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0.79584-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (2.35163-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 92.12071 + (((tickAnim - 11) / 3) * (78.14225-(92.12071)));
            yy = 0.79584 + (((tickAnim - 11) / 3) * (6.37305-(0.79584)));
            zz = 2.35163 + (((tickAnim - 11) / 3) * (0.20407-(2.35163)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 78.14225 + (((tickAnim - 14) / 4) * (100.52451-(78.14225)));
            yy = 6.37305 + (((tickAnim - 14) / 4) * (2.60297-(6.37305)));
            zz = 0.20407 + (((tickAnim - 14) / 4) * (-3.3804-(0.20407)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 100.52451 + (((tickAnim - 18) / 2) * (15.32434-(100.52451)));
            yy = 2.60297 + (((tickAnim - 18) / 2) * (3.47062-(2.60297)));
            zz = -3.3804 + (((tickAnim - 18) / 2) * (-4.50721-(-3.3804)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 15.32434 + (((tickAnim - 20) / 2) * (8.07434-(15.32434)));
            yy = 3.47062 + (((tickAnim - 20) / 2) * (3.47062-(3.47062)));
            zz = -4.50721 + (((tickAnim - 20) / 2) * (-4.50721-(-4.50721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.4-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (1.2-(0)));
            zz = 0.4 + (((tickAnim - 11) / 3) * (0.175-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 14) / 4) * (0-(1.2)));
            zz = 0.175 + (((tickAnim - 14) / 4) * (0.675-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0.675 + (((tickAnim - 18) / 2) * (0-(0.675)));
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
            xx = 15.72409 + (((tickAnim - 0) / 6) * (-2.7638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15-(15.72409)));
            yy = 4.62206 + (((tickAnim - 0) / 6) * (2.35246-(4.62206)));
            zz = -3.71083 + (((tickAnim - 0) / 6) * (-31.9093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*35-(-3.71083)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -2.7638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15 + (((tickAnim - 6) / 3) * (-19.22852-(-2.7638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-15)));
            yy = 2.35246 + (((tickAnim - 6) / 3) * (-0.98101-(2.35246)));
            zz = -31.9093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*35 + (((tickAnim - 6) / 3) * (-2.30323-(-31.9093+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*35)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.22852 + (((tickAnim - 9) / 5) * (-5.77215-(-19.22852)));
            yy = -0.98101 + (((tickAnim - 9) / 5) * (0.30877-(-0.98101)));
            zz = -2.30323 + (((tickAnim - 9) / 5) * (-4.98788-(-2.30323)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -5.77215 + (((tickAnim - 14) / 8) * (0.6441+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(-5.77215)));
            yy = 0.30877 + (((tickAnim - 14) / 8) * (4.7123-(0.30877)));
            zz = -4.98788 + (((tickAnim - 14) / 8) * (-3.7108-(-4.98788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 9) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 9) / 13) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
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
            xx = 35.25 + (((tickAnim - 0) / 6) * (15.5701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25-(35.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.70649-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.50622-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 15.5701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25 + (((tickAnim - 6) / 3) * (-19.00319-(15.5701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-25)));
            yy = -1.70649 + (((tickAnim - 6) / 3) * (0.39873-(-1.70649)));
            zz = 0.50622 + (((tickAnim - 6) / 3) * (-0.91707-(0.50622)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -19.00319 + (((tickAnim - 9) / 5) * (2.69973-(-19.00319)));
            yy = 0.39873 + (((tickAnim - 9) / 5) * (-0.17739-(0.39873)));
            zz = -0.91707 + (((tickAnim - 9) / 5) * (0.17616-(-0.91707)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.69973 + (((tickAnim - 14) / 8) * (35.25-(2.69973)));
            yy = -0.17739 + (((tickAnim - 14) / 8) * (0-(-0.17739)));
            zz = 0.17616 + (((tickAnim - 14) / 8) * (0-(0.17616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 0) / 4) * (-46.92-(2.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -46.92 + (((tickAnim - 4) / 2) * (-41.36123-(-46.92)));
            yy = 0 + (((tickAnim - 4) / 2) * (-4.25411-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-5.16875-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -41.36123 + (((tickAnim - 6) / 1) * (-39.755-(-41.36123)));
            yy = -4.25411 + (((tickAnim - 6) / 1) * (-4.575-(-4.25411)));
            zz = -5.16875 + (((tickAnim - 6) / 1) * (0-(-5.16875)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -39.755 + (((tickAnim - 7) / 2) * (23.75937-(-39.755)));
            yy = -4.575 + (((tickAnim - 7) / 2) * (0.66255-(-4.575)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.61977-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 23.75937 + (((tickAnim - 9) / 5) * (11.33269-(23.75937)));
            yy = 0.66255 + (((tickAnim - 9) / 5) * (0.40772-(0.66255)));
            zz = 1.61977 + (((tickAnim - 9) / 5) * (0.99678-(1.61977)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 11.33269 + (((tickAnim - 14) / 8) * (2.5-(11.33269)));
            yy = 0.40772 + (((tickAnim - 14) / 8) * (0-(0.40772)));
            zz = 0.99678 + (((tickAnim - 14) / 8) * (0-(0.99678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = -0.075 + (((tickAnim - 9) / 13) * (0-(-0.075)));
            zz = -0.2 + (((tickAnim - 9) / 13) * (0-(-0.2)));
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
            xx = 95.5 + (((tickAnim - 0) / 2) * (94.41-(95.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 94.41 + (((tickAnim - 2) / 5) * (84.95-(94.41)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 84.95 + (((tickAnim - 7) / 2) * (15.99133-(84.95)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.77249-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.28583-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 15.99133 + (((tickAnim - 9) / 5) * (-8.68344-(15.99133)));
            yy = -0.77249 + (((tickAnim - 9) / 5) * (-0.41316-(-0.77249)));
            zz = 1.28583 + (((tickAnim - 9) / 5) * (3.7272-(1.28583)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -8.68344 + (((tickAnim - 14) / 8) * (95.5-(-8.68344)));
            yy = -0.41316 + (((tickAnim - 14) / 8) * (0-(-0.41316)));
            zz = 3.7272 + (((tickAnim - 14) / 8) * (0-(3.7272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.85-(0)));
            zz = 0.425 + (((tickAnim - 0) / 2) * (0.32-(0.425)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 2) / 1) * (0.88-(0.85)));
            zz = 0.32 + (((tickAnim - 2) / 1) * (0.21-(0.32)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.88 + (((tickAnim - 3) / 1) * (0.88-(0.88)));
            zz = 0.21 + (((tickAnim - 3) / 1) * (0.21-(0.21)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.88 + (((tickAnim - 4) / 5) * (0-(0.88)));
            zz = 0.21 + (((tickAnim - 4) / 5) * (0-(0.21)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0.485-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.485 + (((tickAnim - 12) / 1) * (0.35-(0.485)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 9) * (0-(0.35)));
            zz = 0 + (((tickAnim - 13) / 9) * (0.425-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+150))*-1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75))*0.75), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.075+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*0.1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+50))*-1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+80))*1));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*0.05);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+70))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+150))*1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-150))*-1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-20))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2.6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-150))*-0.3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-70))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-100))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0.65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+40))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75-150))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+20))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+120))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+130))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+190))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+220))*2));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*0.05);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+250))*3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+240))*3));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.27))*-0.05);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54+280))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*250/0.75+240))*3));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-70))*5), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-120))*5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-100))*5), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-70))*5), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-150))*5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.54-140))*5), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSegisaurus e = (EntityPrehistoricFloraSegisaurus) entity;
        animator.update(entity);


    }
}
