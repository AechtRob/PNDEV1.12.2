package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBobosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBobosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;

    private ModelAnimator animator;

    public ModelBobosaurus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.0F, -2.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.root.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 29, 22, -4.0F, -2.0F, 0.0F, 8, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -3.8F, 6.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.384F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 60, 0.0F, 0.3F, -6.2F, 1, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.4F, 6.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.384F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 47, -1.5F, 0.0F, -6.2F, 4, 3, 7, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 22, 35, -2.5F, -2.0F, -2.0F, 5, 4, 7, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.0F, 0.3F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.3325F, 0.0077F, 1, 3, 5, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2269F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 67, -1.5F, 0.7F, 0.3F, 3, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 61, -1.5F, -1.0F, -1.0F, 3, 3, 5, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2793F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 75, -0.5F, 0.0F, 0.2F, 1, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 70, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 70, -0.5F, 0.0F, -0.7F, 1, 2, 5, 0.002F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.tail4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 36, -0.5F, 0.7F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.tail4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 53, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 61, -0.5F, -0.1F, -1.0F, 1, 1, 7, 0.003F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.7F, 5.6F);
        this.tail4.addChild(tail5);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.9F, 0.4F);
        this.tail5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 61, -0.5F, -0.0137F, -0.8437F, 1, 1, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tail5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 73, -0.5F, -0.5F, -1.0F, 1, 1, 5, 0.002F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(4.1F, 2.0F, 3.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.035F, -0.2595F, 0.1355F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 63, 9, -1.0F, -1.3F, -2.0F, 5, 2, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.0F, 0.2F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.1745F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 32, 8, -1.0F, -1.0F, -1.0F, 6, 1, 3, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 45, 18, 2.0F, -1.0F, 2.0F, 3, 1, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(4.7F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.2182F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 61, 47, 0.0F, -1.0F, -1.0F, 5, 1, 4, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3316F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 0, -0.4F, -1.0F, -0.9F, 3, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.1F, 2.0F, 3.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.035F, 0.2595F, -0.1355F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 63, 9, -4.0F, -1.3F, -2.0F, 5, 2, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.0F, 0.2F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1745F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 32, 8, -5.0F, -1.0F, -1.0F, 6, 1, 3, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 45, 18, -5.0F, -1.0F, 2.0F, 3, 1, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-4.7F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.2182F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 61, 47, -5.0F, -1.0F, -1.0F, 5, 1, 4, 0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3316F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 0, -2.6F, -1.0F, -0.9F, 3, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -3.0F, -13.0F, 9, 8, 13, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -5.5F, -6.4F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 37, 0.0F, -0.3044F, -0.36F, 1, 2, 7, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -4.3F, -13.0F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2094F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 54, 0.0F, -0.2F, -0.6F, 1, 2, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -4.5F, -6.4F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1396F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 40, -2.0F, -0.3044F, -0.36F, 5, 2, 7, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -3.3F, -13.0F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2094F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 8, -2.0F, -0.2F, -0.6F, 5, 2, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 22, -3.5F, -2.0F, -6.0F, 7, 6, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.3F, -6.0F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2269F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 70, -0.5F, 0.2F, -0.3F, 1, 2, 6, 0.002F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2269F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 52, -2.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.5F, 2.8F, -3.0F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0267F, -0.2961F, 0.0912F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 52, 18, -1.0F, -1.0F, -2.0F, 8, 2, 4, -0.002F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(6.0F, -0.1F, 0.3F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, -0.096F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 32, 0, -1.0309F, -0.4F, -2.0951F, 8, 1, 6, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(6.7F, 0.0F, -0.9F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3054F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.763F, 0.0F, -1.2406F);
        this.leftArm3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.096F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 35, -0.1049F, -0.4F, -0.4001F, 3, 1, 3, -0.005F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.763F, 0.0F, -0.2406F);
        this.leftArm3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 30, -1.0F, -0.4F, -1.0F, 5, 1, 5, -0.003F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.5F, 2.8F, -3.0F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0267F, 0.2961F, -0.0912F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 52, 18, -7.0F, -1.0F, -2.0F, 8, 2, 4, -0.002F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-6.0F, -0.1F, 0.3F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, 0.096F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 32, 0, -6.9691F, -0.4F, -2.0951F, 8, 1, 6, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-6.7F, 0.0F, -0.9F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3054F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.763F, 0.0F, -1.2406F);
        this.rightArm3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.096F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 35, -2.8951F, -0.4F, -0.4001F, 3, 1, 3, -0.005F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.763F, 0.0F, -0.2406F);
        this.rightArm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 30, -4.0F, -0.4F, -1.0F, 5, 1, 5, -0.003F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0873F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 40, -2.5F, -2.0F, -5.0F, 5, 4, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.6F, -5.0F);
        this.neck1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1396F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 68, 31, -0.5F, 0.1F, -1.2F, 1, 2, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -2.3F, -5.0F);
        this.neck1.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1396F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 58, -1.5F, -0.1F, -0.2F, 3, 2, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck1.addChild(neck2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -3.1F, -6.0F);
        this.neck2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1047F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 70, -0.5F, 0.3F, 0.0F, 1, 1, 5, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.8F, -6.0F);
        this.neck2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 63, 0, -1.0F, 0.0F, 0.0F, 2, 2, 6, -0.002F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0524F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 41, 50, -2.0F, -1.4F, 0.0F, 4, 3, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -5.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1047F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 64, -1.5F, -1.0F, 0.0F, 3, 3, 5, 0.004F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.1F, -4.1F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.4887F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 73, 73, -0.5F, 0.0636F, -0.0348F, 1, 2, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.7F, -4.1F);
        this.neck3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4014F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 22, 22, -1.0F, 0.3F, 0.0F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 73, 15, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.2F, -2.1F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2443F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 36, -1.0F, -0.3129F, -0.0754F, 2, 1, 2, -0.002F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.2F, 0.5F, -3.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.3927F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 22, -0.1F, 0.0F, -0.8F, 0, 1, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.6642F, 1.2456F, -5.6976F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1161F, -0.2313F, 0.8015F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 25, -0.2749F, -0.0414F, 0.0083F, 0, 1, 1, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 3, 25, -0.2749F, -0.0414F, -1.9917F, 0, 1, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.2F, -7.8F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0915F, -0.2419F, -0.0347F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 76, 49, -0.5F, 0.5149F, 0.064F, 1, 1, 4, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.6F, -0.1F, -3.3F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.2618F, 0.3142F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 8, 0, -0.54F, -0.1F, -0.5F, 1, 1, 1, 0.003F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.6642F, 1.2456F, -5.6976F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1161F, 0.2313F, -0.8015F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 25, 0.2749F, -0.0414F, 0.0083F, 0, 1, 1, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 3, 25, 0.2749F, -0.0414F, -1.9917F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.2F, -7.8F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0915F, 0.2419F, 0.0347F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 76, 49, -0.5F, 0.5149F, 0.064F, 1, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1396F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 47, -0.5F, 0.0F, -3.8F, 1, 1, 3, 0.002F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.1F, -4.9F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3316F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, -0.5F, 0.0123F, -0.0939F, 1, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.7418F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 52, 25, -1.0F, -1.5F, -2.0F, 3, 1, 1, -0.004F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 53, 37, -1.0F, -2.0F, -2.0F, 3, 1, 1, -0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.6F, -0.1F, -3.3F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.2618F, -0.3142F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 8, 0, -0.46F, -0.1F, -0.5F, 1, 1, 1, 0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.5F, -2.1F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0698F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 36, -1.0F, -0.0166F, -2.0223F, 2, 1, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.2F, 0.5F, -3.0F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.3927F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 31, 22, 0.1F, 0.0F, -0.8F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0524F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 69, 25, -1.5F, 0.0F, -4.0F, 3, 1, 4, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 75, 40, -0.5F, 0.0F, -7.7F, 1, 1, 4, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 9, -1.5F, -1.0F, -2.0F, 3, 1, 2, -0.005F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.8322F, 0.0F, -5.129F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1788F, -0.1405F, -0.9115F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 3, 22, -0.1138F, -0.9725F, -1.5846F, 0, 1, 1, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 22, 22, -0.1138F, -0.6725F, 0.4154F, 0, 1, 1, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.2269F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 74, 0, -0.4F, 0.0F, 0.4F, 1, 1, 4, -0.003F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.8322F, 0.0F, -5.129F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1788F, 0.1405F, 0.9115F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 3, 22, 0.1138F, -0.9725F, -1.5846F, 0, 1, 1, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 22, 22, 0.1138F, -0.6725F, 0.4154F, 0, 1, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.2269F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 74, 0, -0.6F, 0.0F, 0.4F, 1, 1, 4, -0.005F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
        public void renderStaticWall(float f) {
            this.neck1.rotateAngleY = (float) Math.toRadians(0);
            this.setRotateAngle(neck2, 0.12F, 0.14F, 0.12F);
            this.setRotateAngle(neck3, -0.1F, -0.15F, -0.15F);
            this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
            this.neck1.offsetY = -0.02F;
            this.neck1.offsetX = 0.0F;
            this.neck1.offsetZ = -0.21F;
            this.neck1.render(0.01F);
            resetToDefaultPose();
        }
        public void renderStaticFloor(float f) {
            this.setRotateAngle(hips, 0.0F, 0.0F, 0.8F);
            this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(chest, 0.0F, 0.3F, 0.0F);
            this.setRotateAngle(leftArm, 0.0F, 0.0F, -0.3F);
            this.setRotateAngle(leftArm2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm, 0.0F, 0.0F, 0.3F);
            this.setRotateAngle(rightArm2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm3, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(neck1, 0.1F, 0.13F, 0.1F);
            this.setRotateAngle(neck2, 0.12F, 0.14F, 0.12F);
            this.setRotateAngle(neck3, 0.1F, 0.15F, 0.1F);
            this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.0F, 0.0F, 0.5F);
            this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, 0.0F, 0.0F, -0.5F);
            this.setRotateAngle(rightLeg2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg3, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, 0.0F, -0.2F, 0.0F);
            this.setRotateAngle(tail2, 0.0F, -0.11F, 0.0F);
            this.setRotateAngle(tail3, 0.0F, -0.12F, 0.0F);
            this.setRotateAngle(tail4, 0.0F, -0.21F, 0.0F);
            this.setRotateAngle(tail5, 0.0F, -0.23F, 0.0F);
            this.root.offsetY = -0.43F;
            this.root.render(0.01F);
            resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(hips, 0.09F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.09F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.0F, 0.0F, 0.4F);
        this.setRotateAngle(leftArm2, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.0F, 0.0F, -0.4F);
        this.setRotateAngle(rightArm2, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, 0.05F, 0.08F, 0.0F);
        this.setRotateAngle(neck2, 0.06F, 0.09F, 0.0F);
        this.setRotateAngle(neck3, 0.07F, 0.1F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.01F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.03F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.12F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, 0.0F, 0.0F);
        this.root.offsetY = 0.09F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBobosaurus ee = (EntityPrehistoricFloraBobosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBobosaurus entity = (EntityPrehistoricFloraBobosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*2.5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-2.5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*-5))));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*10))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1) + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*10))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+50))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 0) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5)-(2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5)-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5) + (((tickAnim - 10) / 10) * (0-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*7.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5) + (((tickAnim - 10) / 10) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+120))*-5))));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1) + (((tickAnim - 0) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1))));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+60))*25))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+280))*15))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+240))*-10))));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5) + (((tickAnim - 0) / 10) * (25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5))));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15) + (((tickAnim - 10) / 3) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1)-(25+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.66+240))*15))));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1) + (((tickAnim - 13) / 7) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+240))*-1))));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBobosaurus entity = (EntityPrehistoricFloraBobosaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

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
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 60) / 70) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5) + (((tickAnim - 60) / 70) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 70) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 130) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 0) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 0) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 60) / 70) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3) + (((tickAnim - 60) / 70) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-3))));
        }
        else if (tickAnim >= 130 && tickAnim < 160) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 130) / 30) * (15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 30) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 60) / 70) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3) + (((tickAnim - 60) / 70) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3))));
        }
        else if ((tickAnim >= 130 && tickAnim < 160) || (tickAnim >=0 && tickAnim <30)) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3) + (((tickAnim - 130) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*3))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 130) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 130) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 0) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 0) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 30) / 30) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 60 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 60) / 70) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3) + (((tickAnim - 60) / 70) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*3))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3) + (((tickAnim - 60) / 70) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        //this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.4325+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 5) * (0.20869-(-0.4325+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = 0.0968+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 0) / 5) * (5.00632-(0.0968+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 7.53528 + (((tickAnim - 0) / 5) * (6.66605-(7.53528)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0.20869 + (((tickAnim - 5) / 15) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(0.20869)));
            yy = 5.00632 + (((tickAnim - 5) / 15) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-(5.00632)));
            zz = 6.66605 + (((tickAnim - 5) / 15) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(6.66605)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 20) / 20) * (-0.7925+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 20) / 20) * (0.1257+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 20) / 20) * (8.10033-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 120) {
            xx = -0.7925+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 40) / 80) * (-0.52826-(-0.7925+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = 0.1257+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5) + (((tickAnim - 40) / 80) * (0.08376-(0.1257+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5))));
            zz = 8.10033 + (((tickAnim - 40) / 80) * (7.06688-(8.10033)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -0.52826 + (((tickAnim - 120) / 40) * (-0.4325+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.52826)));
            yy = 0.08376 + (((tickAnim - 120) / 40) * (0.0968+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*5)-(0.08376)));
            zz = 7.06688 + (((tickAnim - 120) / 40) * (7.53528-(7.06688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 0) / 20) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 20) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 20) / 20) * (-10-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 40 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5) + (((tickAnim - 40) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-270))*-2.5))));
            zz = -10 + (((tickAnim - 40) / 120) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = -0.6609+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 79) * (-0.6531+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.6609+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = -0.1018+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 0) / 79) * (-0.1073+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-(-0.1018+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -7.58387 + (((tickAnim - 0) / 79) * (-7.58166-(-7.58387)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = -0.6531+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.6531+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = -0.1073+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-(-0.1073+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -7.58166 + (((tickAnim - 79) / 21) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-7.58166)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 100) / 20) * (-1.2583+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 100) / 20) * (-0.1608+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 100) / 20) * (-8.71579-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -1.2583+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * (-0.6609+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-1.2583+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = -0.1608+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5) + (((tickAnim - 120) / 40) * (-0.1018+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5)-(-0.1608+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*5))));
            zz = -8.71579 + (((tickAnim - 120) / 40) * (-7.58387-(-8.71579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 0) / 79) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 0) / 79) * (10-(10)));
        }
        else if (tickAnim >= 79 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 79) / 21) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 79) / 21) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(10)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 100) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 100) / 20) * (10-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-2.5))));
            zz = 10 + (((tickAnim - 120) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 60) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 60) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 100) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 100) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 20) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 60) / 40) * (0-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 60) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 60) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else if (tickAnim >= 100 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 100) / 60) * (0-(0)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 100) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 100) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = -0.9118+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 60) * (-0.7132+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.9118+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = 0.104+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 0) / 60) * (0.0987+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(0.104+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 5.63375 + (((tickAnim - 0) / 60) * (5.58203-(5.63375)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = -0.7132+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.7132+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = 0.0987+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(0.0987+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 5.58203 + (((tickAnim - 60) / 30) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(5.58203)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 90) / 30) * (-1.4061+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 90) / 30) * (0.1364+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 90) / 30) * (6.26932-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -1.4061+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 40) * (-0.9118+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-1.4061+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = 0.1364+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 120) / 40) * (0.104+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(0.1364+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 6.26932 + (((tickAnim - 120) / 40) * (5.63375-(6.26932)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 0) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 0) / 60) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 60) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 60) / 30) * (-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(-7.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 90) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 90) / 30) * (-7.5-(-7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5) + (((tickAnim - 120) / 40) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-2.5))));
            zz = -7.5 + (((tickAnim - 120) / 40) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = -0.7378+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 0) / 120) * (-1.2141+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-0.7378+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = -0.1159+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 0) / 120) * (-0.1491+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-(-0.1159+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -6.075 + (((tickAnim - 0) / 120) * (-6.67746-(-6.075)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -1.2141+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-(-1.2141+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = -0.1491+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-(-0.1491+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = -6.67746 + (((tickAnim - 120) / 20) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5)-(-6.67746)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1) + (((tickAnim - 140) / 20) * (-0.7378+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5) + (((tickAnim - 140) / 20) * (-0.1159+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5))));
            zz = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5) + (((tickAnim - 140) / 20) * (-6.075-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 0) / 120) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 0) / 120) * (7.5-(7.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 120) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5 + (((tickAnim - 120) / 20) * (7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)-(7.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5) + (((tickAnim - 140) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-2.5))));
            zz = 7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5) + (((tickAnim - 140) / 20) * (7.5-(7.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8.3109+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 20) * (9.1745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(8.3109+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 8.8826+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 0) / 20) * (8.5391+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(8.8826+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 1.9406+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 0) / 20) * (4.5444+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(1.9406+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.1745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 20) / 10) * (3.7714+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(9.1745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 8.5391+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 20) / 10) * (9.2978+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1)-(8.5391+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 4.5444+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 20) / 10) * (4.5745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(4.5444+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 3.7714+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 10) * (9.8949+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)-(3.7714+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 9.2978+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1) + (((tickAnim - 30) / 10) * (7.6258+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(9.2978+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-1))));
            zz = 4.5745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 30) / 10) * (7.0049+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(4.5745+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.8949+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1) + (((tickAnim - 40) / 10) * (9.3303+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(9.8949+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1))));
            yy = 7.6258+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 40) / 10) * (8.6127+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(7.6258+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 7.0049+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 40) / 10) * (4.5944+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(7.0049+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 9.3303+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 50) / 60) * (7.6419+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(9.3303+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 8.6127+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 50) / 60) * (9.3613+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(8.6127+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 4.5944+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 50) / 60) * (-0.5923+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(4.5944+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 7.6419+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 110) / 15) * (2.84128-(7.6419+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
            yy = 9.3613+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 110) / 15) * (-0.96678-(9.3613+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = -0.5923+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3) + (((tickAnim - 110) / 15) * (-0.24157-(-0.5923+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3))));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 2.84128 + (((tickAnim - 125) / 15) * (-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)-(2.84128)));
            yy = -0.96678 + (((tickAnim - 125) / 15) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)-(-0.96678)));
            zz = -0.24157 + (((tickAnim - 125) / 15) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)-(-0.24157)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1) + (((tickAnim - 140) / 10) * (8.145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)-(-5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10) + (((tickAnim - 140) / 10) * (8.8897+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3) + (((tickAnim - 140) / 10) * (1.9177+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3))));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 8.145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1) + (((tickAnim - 150) / 10) * (8.3109+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(8.145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1))));
            yy = 8.8897+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5) + (((tickAnim - 150) / 10) * (8.8826+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)-(8.8897+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5))));
            zz = 1.9177+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1) + (((tickAnim - 150) / 10) * (1.9406+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-3)-(1.9177+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -4.556+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 0) / 20) * (-2.2165+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-4.556+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 10.2083+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 0) / 20) * (10.0103+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-(10.2083+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = -0.4694+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 0) / 20) * (-0.484+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(-0.4694+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2.2165+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 20) / 10) * (-1.567+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-2.2165+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 10.0103+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 20) / 10) * (9.4998+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1)-(10.0103+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = -0.484+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 20) / 10) * (2.0616+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(-0.484+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.567+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 30) / 10) * (-4.5487+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)-(-1.567+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 9.4998+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1) + (((tickAnim - 30) / 10) * (10.3294+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-(9.4998+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-1))));
            zz = 2.0616+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 30) / 10) * (2.0095+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(2.0616+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.5487+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1) + (((tickAnim - 40) / 10) * (-4.5308+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-4.5487+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1))));
            yy = 10.3294+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 40) / 10) * (9.9558+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-(10.3294+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = 2.0095+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 40) / 10) * (2.0218+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(2.0095+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -4.5308+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 50) / 60) * (-0.5005+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-4.5308+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 9.9558+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 50) / 60) * (10.4197+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-(9.9558+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = 2.0218+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 50) / 60) * (4.7383+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(2.0218+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -0.5005+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3) + (((tickAnim - 110) / 15) * (-2.40747-(-0.5005+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3))));
            yy = 10.4197+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 110) / 15) * (2.75867-(10.4197+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = 4.7383+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3) + (((tickAnim - 110) / 15) * (1.63382-(4.7383+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3))));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -2.40747 + (((tickAnim - 125) / 15) * (-1.7389+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1)-(-2.40747)));
            yy = 2.75867 + (((tickAnim - 125) / 15) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-9.7396)-(2.75867)));
            zz = 1.63382 + (((tickAnim - 125) / 15) * (5.0508+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)-(1.63382)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -1.7389+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1) + (((tickAnim - 140) / 10) * (-1.2472+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1)-(-1.7389+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-9.7396) + (((tickAnim - 140) / 10) * (7.6145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-9.7396))));
            zz = 5.0508+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3) + (((tickAnim - 140) / 10) * (4.6029+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1)-(5.0508+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3))));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -1.2472+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1) + (((tickAnim - 150) / 10) * (-4.556+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*3)-(-1.2472+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-1))));
            yy = 7.6145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5) + (((tickAnim - 150) / 10) * (10.2083+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)-(7.6145+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5))));
            zz = 4.6029+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1) + (((tickAnim - 150) / 10) * (-0.4694+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*-3)-(4.6029+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2.724+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 0) / 20) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(2.724+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 5.3215+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 0) / 20) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(5.3215+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = -0.5107+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 0) / 20) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-0.5107+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 20) / 10) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 20) / 10) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 20) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 30) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1) + (((tickAnim - 30) / 10) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+120))*-1))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 30) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1) + (((tickAnim - 40) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 40) / 10) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 40) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 50) / 50) * (3.8904+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 50) / 50) * (6.279+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 50) / 50) * (4.5198+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 3.8904+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 100) / 10) * (3.6914+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(3.8904+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 6.279+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 100) / 10) * (6.1782+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(6.279+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = 4.5198+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 100) / 10) * (4.5021+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(4.5198+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 3.6914+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3) + (((tickAnim - 110) / 30) * (-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)-(3.6914+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3))));
            yy = 6.1782+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 110) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5)-(6.1782+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = 4.5021+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3) + (((tickAnim - 110) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3)-(4.5021+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3))));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1) + (((tickAnim - 140) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1)-(-2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5) + (((tickAnim - 140) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-5))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3) + (((tickAnim - 140) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*3))));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1) + (((tickAnim - 150) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-3)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-1))));
            yy = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5) + (((tickAnim - 150) / 10) * (5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1) + (((tickAnim - 150) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 0) / 20) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 0) / 20) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 20) / 10) * (-20+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 20) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 20) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -20+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 30) / 10) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1)-(-20+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5) + (((tickAnim - 30) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+180))*-5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3) + (((tickAnim - 30) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+180))*-3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1) + (((tickAnim - 40) / 10) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 40) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 40) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 50) / 60) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 50) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 50) / 60) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1) + (((tickAnim - 110) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 110) / 30) * (-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3) + (((tickAnim - 110) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3))));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10) + (((tickAnim - 140) / 10) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10))));
            yy = -10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10) + (((tickAnim - 140) / 10) * (2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-(-10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*10))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3) + (((tickAnim - 140) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+200))*-3))));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = -15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1) + (((tickAnim - 150) / 10) * (-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1)-(-15+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-1))));
            yy = 2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5) + (((tickAnim - 150) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5)-(2.5+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*5))));
            zz = -3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1) + (((tickAnim - 150) / 10) * (-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-190))*-3)-(-3+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*1))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 0) / 20) * (6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 0) / 20) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 20) / 10) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1)-(6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 20) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 20) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1) + (((tickAnim - 30) / 10) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 30) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 30) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2) + (((tickAnim - 40) / 10) * (6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 40) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 40) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 50 && tickAnim < 110) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 50) / 60) * (6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 50) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 50) / 60) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1) + (((tickAnim - 110) / 30) * (10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)-(6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 110) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 110) / 30) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10) + (((tickAnim - 140) / 10) * (2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2)-(10+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 140) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5) + (((tickAnim - 140) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*5))));
        }
        else if (tickAnim >= 150 && tickAnim < 160) {
            xx = 2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2) + (((tickAnim - 150) / 10) * (6+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)-(2+(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-2))));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1) + (((tickAnim - 150) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*1))));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3) + (((tickAnim - 150) / 10) * ((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3)-((Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-200))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBobosaurus entity = (EntityPrehistoricFloraBobosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(16.9741+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*30)), leftArm.rotateAngleY + (float) Math.toRadians(8.2663+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*30)), leftArm.rotateAngleZ + (float) Math.toRadians(10.6688+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20)));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*30)), leftLeg.rotateAngleY + (float) Math.toRadians(-10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*25)), leftLeg.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10)));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(4);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*6)), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-3)));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-1));
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*2.5));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*2.5)), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-3)));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2.5)), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3)));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5)), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3)));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5)), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3)));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5)), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-3)));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*5)), leftLeg2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*5)), leftLeg2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*10)));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30)), rightLeg.rotateAngleY + (float) Math.toRadians(10+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-25)), rightLeg.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*-10)));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*5)), rightLeg2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*-5)), rightLeg2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*-10)));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*5)), rightLeg3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*-5)), rightLeg3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*-10)));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2.5)), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*3)));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-2)), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-20))*3)));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*5)), leftArm2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*5)), leftArm2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*10)));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-40))*5)), rightArm2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+80))*-5)), rightArm2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*-10)));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*5)), rightArm3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+110))*-5)), rightArm3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-10)));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-3)), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-2.5)), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*2.5)));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-2.5)), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*2.5)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*5)));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1)), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBobosaurus entity = (EntityPrehistoricFloraBobosaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(14.7754+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+260))*-20)), leftArm.rotateAngleY + (float) Math.toRadians(13.6362+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*20)), leftArm.rotateAngleZ + (float) Math.toRadians(7.1073+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*20)));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20)), leftLeg.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+80))*20)), leftLeg.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*15)));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(2);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(3+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*6)), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+80))*-3)));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-1));
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-1.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*-2.5));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*5)), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*-3)));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*2.5)), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-10))*-3)));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5)), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3)));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*2.5)), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-70))*-3)));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-5)), leftLeg2.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+110))*15)), leftLeg2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-80))*10)));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(15+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+190))*-20)), rightLeg.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*-20)), rightLeg.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15)));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*-5)), rightLeg2.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+130))*-15)), rightLeg2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-60))*-10)));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5)), rightLeg3.rotateAngleY + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+160))*-15)), rightLeg3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-90))*-10)));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2.5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5)), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+60))*3)));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+50))*-2.5)), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+50))*2)));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+290))*-5)), leftArm2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+220))*10)), leftArm2.rotateAngleZ + (float) Math.toRadians(5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-10))*15)));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(15.0326+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+240))*-20)), rightArm.rotateAngleY + (float) Math.toRadians(-13.7195+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+170))*-20)), rightArm.rotateAngleZ + (float) Math.toRadians(-7.1474+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+10))*-20)));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+250))*-5)), rightArm2.rotateAngleY + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+200))*-10)), rightArm2.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*-15)));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+300))*-5)), rightArm3.rotateAngleY + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+230))*-10)), rightArm3.rotateAngleZ + (float) Math.toRadians(-5+(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-70))*-15)));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+30))*-2.5)), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+30))*3)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*2.5)), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-50))*-3)));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-190))*-2.5)), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-80))*3)));
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck1);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        EntityPrehistoricFloraBobosaurus ee = (EntityPrehistoricFloraBobosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

