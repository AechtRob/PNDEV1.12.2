package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProceratosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProceratosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer throatPouch;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer crest;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private ModelAnimator animator;

    public ModelProceratosaurus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.0F, 0.0F);
        this.root.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -3.5F, 0.0F, -1.0F, 7, 10, 8, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.48F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 68, -2.0F, -2.0F, -2.0F, 3, 9, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.6F, -1.6F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 33, 77, -1.5F, 0.1414F, -0.5414F, 2, 10, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 10.0F, 1.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -1.0F, -1.0F, -1.0F, 2, 6, 2, -0.005F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.4363F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 17, 72, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.48F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 68, -1.0F, -2.0F, -2.0F, 3, 9, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.6F, -1.6F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.9599F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 33, 77, -0.5F, 0.1414F, -0.5414F, 2, 10, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 10.0F, 1.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.0F, -1.0F, -1.0F, 2, 6, 2, -0.005F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.4363F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 17, 72, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.2F, 4.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 21, 28, -2.5F, -2.0F, -1.0F, 5, 6, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 0, -2.0F, -2.0F, -1.0F, 4, 4, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 38, -1.5F, -2.0F, -1.0F, 3, 3, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 48, -0.5F, 1.0F, -1.0F, 1, 1, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 53, 51, -1.0F, -2.0F, -1.0F, 2, 2, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 41, 15, -1.5F, -1.3F, -1.0F, 3, 0, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 54, -0.5F, 0.0F, -1.0F, 1, 2, 11, -0.002F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.7F, 10.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3054F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 33, -0.5F, -1.0F, -1.0F, 1, 2, 12, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 23, 5, 0.0F, -1.5F, -1.0F, 0, 5, 14, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 45, -1.5F, -1.3F, 0.0F, 3, 0, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -4.0F, -8.0F, 8, 9, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 5.0F, -8.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 27, -3.0F, -1.6F, 0.0F, 6, 2, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.0F, -7.9F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 59, -1.0F, -0.9F, -0.1F, 2, 2, 9, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.0F, -7.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 39, -2.0F, 0.1F, -0.1F, 4, 1, 9, 0.003F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(chest);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 3.2F, -3.7F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 23, -2.0F, -2.4653F, 0.2648F, 4, 3, 4, -0.005F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 57, 0, -3.0F, -2.9653F, 0.2648F, 6, 3, 4, -0.005F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.6F, -3.3F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 80, -1.0F, -0.5261F, -0.0263F, 2, 2, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.6F, -3.3F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 27, -2.0F, -0.5261F, -0.0263F, 4, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 10, -3.0F, -4.0F, -4.0F, 6, 7, 5, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 2.4F, -2.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.8132F, 0.2201F, -0.143F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 19, 0.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.7F, 0.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.1338F, 0.1744F, 0.0077F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 38, 0, 0.0F, -0.4129F, -1.6287F, 1, 6, 2, -0.005F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 5.3F, -1.4F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.015F, -0.0029F, 0.3463F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 38, 0.0F, -0.1F, -1.2F, 1, 6, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 2.4F, -2.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.8132F, -0.2201F, 0.143F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 19, -1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.7F, 0.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.1338F, -0.1744F, -0.0077F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 38, 0, -1.0F, -0.4129F, -1.6287F, 1, 6, 2, -0.005F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 5.3F, -1.3F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.015F, 0.0029F, -0.3463F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 38, -1.0F, -0.075F, -1.2F, 1, 6, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -3.2F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0F, -0.0611F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.2F, -5.3F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 69, 50, -1.5F, -2.2897F, -0.3227F, 3, 2, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, -0.8F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 84, 31, -1.5F, -3.3F, -3.0F, 3, 1, 3, -0.004F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 65, -2.0F, -2.7F, -4.0F, 4, 5, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -3.2F);
        this.neck.addChild(neck2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8727F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 74, 59, -1.0F, 1.6F, -5.3F, 2, 2, 6, 0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.1648F, -2.495F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 77, -1.0F, -0.0586F, -0.5302F, 2, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 65, -1.5F, -2.1F, -6.3F, 3, 4, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -4.7F, -3.2F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.9F, -3.8F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 38, -1.0F, -3.0683F, -1.4829F, 2, 3, 5, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.8F, -3.8F);
        this.neck3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 59, 78, -1.0F, -0.4F, 0.0F, 2, 4, 4, 0.0F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(0.0F, 2.9F, -3.9F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 1.0036F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.throatPouch.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.3963F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 0, -1.0F, -3.0683F, -0.1829F, 2, 3, 3, -0.2F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.3F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 3.7F, -8.7F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0996F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 55, -1.0F, 0.0715F, 0.0392F, 1, 1, 2, -0.003F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 55, -1.0F, -0.0285F, 0.0392F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.1F, -7.6F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 68, 70, 0.0F, -2.7855F, -2.7986F, 0, 4, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 2.1F, -7.6F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5585F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 1, 55, -1.0F, -0.2855F, -0.0986F, 1, 2, 3, 0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 1, 55, -1.0F, -0.2855F, 0.2014F, 1, 2, 3, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4F, 4.6253F, -8.297F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4377F, -0.0803F, -0.0342F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 48, 0.2F, -0.5377F, 0.2297F, 0, 1, 5, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4F, 4.6253F, -8.297F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4377F, 0.0803F, 0.0342F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 48, -0.2F, -0.5377F, 0.2297F, 0, 1, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.8F, -4.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4014F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 15, -0.5F, -0.8412F, -4.2786F, 1, 1, 2, 0.006F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 82, 47, -1.0F, -0.8412F, -2.2786F, 2, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.6F, -5.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3316F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 33, -1.0F, -0.4867F, 0.0349F, 2, 2, 1, -0.002F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.9F, 0.5F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 76, 68, -1.5F, -2.3F, -4.3F, 3, 3, 4, 0.0F, false));

        this.crest = new AdvancedModelRenderer(this);
        this.crest.setRotationPoint(0.0F, -0.2F, -3.6F);
        this.head.addChild(crest);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 48, -0.5F, -0.021F, -0.0448F, 1, 2, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.6475F, -0.1317F, -1.0594F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 45, -0.5F, 0.279F, 1.1552F, 1, 0, 4, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.6846F, -0.046F, -0.7565F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 82, -0.5F, 0.279F, 1.1552F, 1, 0, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6322F, 0.0111F, -0.3133F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 83, -0.5F, 0.279F, 1.1552F, 1, 0, 5, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6691F, -0.0896F, -0.3899F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 54, -0.7F, 0.079F, 0.2552F, 1, 2, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6322F, -0.0111F, 0.3133F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 83, -0.5F, 0.279F, 1.1552F, 1, 0, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.5847F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 71, 1, -0.5F, -0.021F, -0.0448F, 1, 0, 7, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6691F, 0.0896F, 0.3899F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 54, -0.3F, 0.079F, 0.2552F, 1, 2, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6846F, 0.046F, 0.7565F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 67, 82, -0.5F, 0.279F, 1.1552F, 1, 0, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.7003F, -0.0838F, -0.362F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 19, 45, -0.5F, 0.279F, 1.1552F, 1, 0, 4, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.7003F, 0.0838F, 0.362F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 45, -0.5F, 0.279F, 1.1552F, 1, 0, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.8273F, 0.023F, -1.0346F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 19, 45, -0.4F, 0.579F, 0.5552F, 1, 0, 4, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.8273F, -0.023F, 1.0346F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 45, -0.6F, 0.579F, 0.5552F, 1, 0, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.crest.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.6475F, 0.1317F, 1.0594F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 19, 45, -0.5F, 0.279F, 1.1552F, 1, 0, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6F, 0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2793F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 80, 9, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 79, 78, -1.5F, 0.4F, -4.0F, 3, 1, 4, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 38, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.005F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 1.3F, -8.9F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0175F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 48, 65, -1.0F, -0.8748F, 2.014F, 2, 1, 4, -0.006F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 45, 15, -0.5F, -0.8748F, 0.014F, 1, 1, 2, -0.006F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.4F, 0.1201F, -8.9989F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1051F, -0.0868F, -0.0091F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 30, 58, 0.2F, -0.2909F, -0.011F, 0, 1, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.4F, 0.1201F, -8.9989F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1051F, 0.0868F, 0.0091F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 30, 58, -0.2F, -0.2909F, -0.011F, 0, 1, 4, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, -4.9F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1047F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 81, 0, -1.0F, 0.0F, -2.1F, 2, 1, 4, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 55, 27, -0.5F, 0.0F, -4.1F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(throatPouch, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, -0.015F, 0.0029F, -0.3463F);
        this.setRotateAngle(rightArm2, -1.1338F, -0.1744F, -0.0077F);
        this.setRotateAngle(rightArm, 0.8132F, -0.2201F, 0.143F);
        this.setRotateAngle(neck3, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.0F, -0.0611F);
        this.setRotateAngle(leftLeg4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, -0.015F, -0.0029F, 0.3463F);
        this.setRotateAngle(leftArm2, -1.1338F, 0.1744F, 0.0077F);
        this.setRotateAngle(leftArm, 0.8132F, 0.2201F, -0.143F);
        this.setRotateAngle(jaw, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 0.1051F, 0.0868F, 0.0091F);
        this.setRotateAngle(cube_r41, 0.1051F, -0.0868F, -0.0091F);
        this.setRotateAngle(cube_r40, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, 0.6475F, 0.1317F, 1.0594F);
        this.setRotateAngle(cube_r38, 0.8273F, -0.023F, 1.0346F);
        this.setRotateAngle(cube_r37, 0.8273F, 0.023F, -1.0346F);
        this.setRotateAngle(cube_r36, 0.7003F, 0.0838F, 0.362F);
        this.setRotateAngle(cube_r35, 0.7003F, -0.0838F, -0.362F);
        this.setRotateAngle(cube_r34, 0.6846F, 0.046F, 0.7565F);
        this.setRotateAngle(cube_r33, 0.6691F, 0.0896F, 0.3899F);
        this.setRotateAngle(cube_r32, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.6322F, -0.0111F, 0.3133F);
        this.setRotateAngle(cube_r30, 0.6691F, -0.0896F, -0.3899F);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.6322F, 0.0111F, -0.3133F);
        this.setRotateAngle(cube_r28, 0.6846F, -0.046F, -0.7565F);
        this.setRotateAngle(cube_r27, 0.6475F, -0.1317F, -1.0594F);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.4377F, 0.0803F, 0.0342F);
        this.setRotateAngle(cube_r21, 0.4377F, -0.0803F, -0.0342F);
        this.setRotateAngle(cube_r20, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.0996F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(crest, 0.6981F, 0.0F, 0.0F);
        this.neck.offsetY = -0.01F;
        this.neck.offsetZ = -0.04F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(throatPouch, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.3155F, -0.2494F, 0.0804F);
        this.setRotateAngle(tail4, -0.1772F, -0.1719F, 0.0306F);
        this.setRotateAngle(tail3, 0.0873F, 0.0435F, 0.0038F);
        this.setRotateAngle(tail2, 0.0452F, 0.2615F, 0.0117F);
        this.setRotateAngle(tail, -0.0886F, 0.1739F, -0.0154F);
        this.setRotateAngle(rightLeg4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, -0.015F, 0.0029F, -0.3463F);
        this.setRotateAngle(rightArm2, -0.9983F, -0.2111F, -0.0317F);
        this.setRotateAngle(rightArm, 0.8132F, -0.2201F, 0.143F);
        this.setRotateAngle(neck3, -0.3626F, -0.3405F, 0.0786F);
        this.setRotateAngle(neck2, 0.3732F, -0.5944F, 0.2643F);
        this.setRotateAngle(neck, 0.6545F, -0.7418F, 0.0F);
        this.setRotateAngle(leftLeg4, 1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 1.3526F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, -1.9963F, -0.4084F, 0.1582F);
        this.setRotateAngle(leftArm3, -0.015F, -0.0029F, 0.3463F);
        this.setRotateAngle(leftArm2, -1.5131F, 0.2926F, 0.0654F);
        this.setRotateAngle(leftArm, 1.075F, 0.2201F, -0.143F);
        this.setRotateAngle(jaw, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0976F, -0.0445F, -0.0377F);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 0.1051F, 0.0868F, 0.0091F);
        this.setRotateAngle(cube_r41, 0.1051F, -0.0868F, -0.0091F);
        this.setRotateAngle(cube_r40, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, 0.6475F, 0.1317F, 1.0594F);
        this.setRotateAngle(cube_r38, 0.8273F, -0.023F, 1.0346F);
        this.setRotateAngle(cube_r37, 0.8273F, 0.023F, -1.0346F);
        this.setRotateAngle(cube_r36, 0.7003F, 0.0838F, 0.362F);
        this.setRotateAngle(cube_r35, 0.7003F, -0.0838F, -0.362F);
        this.setRotateAngle(cube_r34, 0.6846F, 0.046F, 0.7565F);
        this.setRotateAngle(cube_r33, 0.6691F, 0.0896F, 0.3899F);
        this.setRotateAngle(cube_r32, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.6322F, -0.0111F, 0.3133F);
        this.setRotateAngle(cube_r30, 0.6691F, -0.0896F, -0.3899F);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.6322F, 0.0111F, -0.3133F);
        this.setRotateAngle(cube_r28, 0.6846F, -0.046F, -0.7565F);
        this.setRotateAngle(cube_r27, 0.6475F, -0.1317F, -1.0594F);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.4377F, 0.0803F, 0.0342F);
        this.setRotateAngle(cube_r21, 0.4377F, -0.0803F, -0.0342F);
        this.setRotateAngle(cube_r20, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.0996F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(crest, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);
        this.root.offsetY = -0.058F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.2F;
        this.root.offsetX = 0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(-60);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(-1);
        this.root.scaleChildren = true;
        float scaler = 0.85F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(throatPouch, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(tail5, -0.3155F, -0.2494F, 0.0804F);
        this.setRotateAngle(tail4, -0.1772F, -0.1719F, 0.0306F);
        this.setRotateAngle(tail3, 0.0873F, 0.0435F, 0.0038F);
        this.setRotateAngle(tail2, 0.0452F, 0.2615F, 0.0117F);
        this.setRotateAngle(tail, -0.0886F, 0.1739F, -0.0154F);
        this.setRotateAngle(rightLeg4, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.48F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, -0.015F, 0.0029F, -0.3463F);
        this.setRotateAngle(rightArm2, -0.9983F, -0.2111F, -0.0317F);
        this.setRotateAngle(rightArm, 0.8132F, -0.2201F, 0.143F);
        this.setRotateAngle(neck3, -0.3626F, -0.3405F, 0.0786F);
        this.setRotateAngle(neck2, 0.3732F, -0.5944F, 0.2643F);
        this.setRotateAngle(neck, 0.6545F, -0.7418F, 0.0F);
        this.setRotateAngle(leftLeg4, 1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -1.5272F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 1.3526F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, -1.9963F, -0.4084F, 0.1582F);
        this.setRotateAngle(leftArm3, -0.015F, -0.0029F, 0.3463F);
        this.setRotateAngle(leftArm2, -1.5131F, 0.2926F, 0.0654F);
        this.setRotateAngle(leftArm, 1.075F, 0.2201F, -0.143F);
        this.setRotateAngle(jaw, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0976F, -0.0445F, -0.0377F);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r43, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r42, 0.1051F, 0.0868F, 0.0091F);
        this.setRotateAngle(cube_r41, 0.1051F, -0.0868F, -0.0091F);
        this.setRotateAngle(cube_r40, 0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r39, 0.6475F, 0.1317F, 1.0594F);
        this.setRotateAngle(cube_r38, 0.8273F, -0.023F, 1.0346F);
        this.setRotateAngle(cube_r37, 0.8273F, 0.023F, -1.0346F);
        this.setRotateAngle(cube_r36, 0.7003F, 0.0838F, 0.362F);
        this.setRotateAngle(cube_r35, 0.7003F, -0.0838F, -0.362F);
        this.setRotateAngle(cube_r34, 0.6846F, 0.046F, 0.7565F);
        this.setRotateAngle(cube_r33, 0.6691F, 0.0896F, 0.3899F);
        this.setRotateAngle(cube_r32, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r31, 0.6322F, -0.0111F, 0.3133F);
        this.setRotateAngle(cube_r30, 0.6691F, -0.0896F, -0.3899F);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, 0.6322F, 0.0111F, -0.3133F);
        this.setRotateAngle(cube_r28, 0.6846F, -0.046F, -0.7565F);
        this.setRotateAngle(cube_r27, 0.6475F, -0.1317F, -1.0594F);
        this.setRotateAngle(cube_r26, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.3316F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.4377F, 0.0803F, 0.0342F);
        this.setRotateAngle(cube_r21, 0.4377F, -0.0803F, -0.0342F);
        this.setRotateAngle(cube_r20, 0.5585F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 1.0996F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(crest, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraProceratosaurus EntityProceratosaurus = (EntityPrehistoricFloraProceratosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityProceratosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityProceratosaurus.getAnimation() == EntityProceratosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityProceratosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityProceratosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityProceratosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraProceratosaurus ee = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 4) / 4) * (1.96-(7.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.96 + (((tickAnim - 8) / 7) * (3.3-(1.96)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.3 + (((tickAnim - 15) / 5) * (0-(3.3)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 4) / 4) * (-8.04-(5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -8.04 + (((tickAnim - 8) / 12) * (0-(-8.04)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17 + (((tickAnim - 3) / 1) * (-15-(-17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 4) / 4) * (11.07-(-15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.07 + (((tickAnim - 8) / 3) * (11.6-(11.07)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.6 + (((tickAnim - 11) / 4) * (-1.49-(11.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.49 + (((tickAnim - 15) / 5) * (0-(-1.49)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (26.61-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 26.61 + (((tickAnim - 8) / 3) * (29.35-(26.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29.35 + (((tickAnim - 11) / 4) * (15.89-(29.35)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.89 + (((tickAnim - 15) / 5) * (0-(15.89)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (-18.57-(27.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -18.57 + (((tickAnim - 8) / 3) * (-8.31-(-18.57)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.31 + (((tickAnim - 11) / 4) * (-3.62-(-8.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.62 + (((tickAnim - 15) / 5) * (0-(-3.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 4) / 2) * (-20.36-(12.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.36 + (((tickAnim - 6) / 2) * (-6.4-(-20.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.4 + (((tickAnim - 8) / 3) * (6.71-(-6.4)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.71 + (((tickAnim - 11) / 2) * (18.44-(6.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.44 + (((tickAnim - 13) / 4) * (11.5-(18.44)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 17) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 3) / 4) * (48.45-(17.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 48.45 + (((tickAnim - 7) / 2) * (0-(48.45)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -10.25 + (((tickAnim - 0) / 25) * (33.51465-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 25) * (-7.48138-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-4.04625-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 33.51465 + (((tickAnim - 25) / 13) * (-4.75323-(33.51465)));
            yy = -7.48138 + (((tickAnim - 25) / 13) * (-7.9636-(-7.48138)));
            zz = -4.04625 + (((tickAnim - 25) / 13) * (0.76475-(-4.04625)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4.75323 + (((tickAnim - 38) / 12) * (-10.25-(-4.75323)));
            yy = -7.9636 + (((tickAnim - 38) / 12) * (0-(-7.9636)));
            zz = 0.76475 + (((tickAnim - 38) / 12) * (0-(0.76475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (1.37-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 1.37 + (((tickAnim - 25) / 13) * (1.025-(1.37)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 38) / 12) * (0-(1.025)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -17.25 + (((tickAnim - 0) / 18) * (12.63-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12.63 + (((tickAnim - 18) / 7) * (18-(12.63)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 18 + (((tickAnim - 25) / 13) * (1.75783-(18)));
            yy = 0 + (((tickAnim - 25) / 13) * (2.33816-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (-2.68802-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.75783 + (((tickAnim - 38) / 12) * (-17.25-(1.75783)));
            yy = 2.33816 + (((tickAnim - 38) / 12) * (0-(2.33816)));
            zz = -2.68802 + (((tickAnim - 38) / 12) * (0-(-2.68802)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 13.75 + (((tickAnim - 0) / 12) * (-6.6-(13.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -6.6 + (((tickAnim - 12) / 13) * (-9.5-(-6.6)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -9.5 + (((tickAnim - 25) / 6) * (-35.29-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -35.29 + (((tickAnim - 31) / 7) * (-45.6-(-35.29)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -45.6 + (((tickAnim - 38) / 12) * (13.75-(-45.6)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13.75 + (((tickAnim - 0) / 5) * (4.88-(13.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.88 + (((tickAnim - 5) / 7) * (0.05-(4.88)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.05 + (((tickAnim - 12) / 13) * (54.75-(0.05)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 54.75 + (((tickAnim - 25) / 6) * (54.68-(54.75)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 54.68 + (((tickAnim - 31) / 7) * (61.05-(54.68)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 61.05 + (((tickAnim - 38) / 12) * (13.75-(61.05)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 5) * (0.625-(0.05)));
            zz = -0.1 + (((tickAnim - 0) / 5) * (-0.08-(-0.1)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 5) / 7) * (0.03-(0.625)));
            zz = -0.08 + (((tickAnim - 5) / 7) * (-0.48-(-0.08)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0.03 + (((tickAnim - 12) / 13) * (0-(0.03)));
            zz = -0.48 + (((tickAnim - 12) / 13) * (-0.125-(-0.48)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 6) * (0.685-(0)));
            zz = -0.125 + (((tickAnim - 25) / 6) * (0.095-(-0.125)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            yy = 0.685 + (((tickAnim - 31) / 7) * (0.24-(0.685)));
            zz = 0.095 + (((tickAnim - 31) / 7) * (0.02-(0.095)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.24 + (((tickAnim - 38) / 12) * (0.05-(0.24)));
            zz = 0.02 + (((tickAnim - 38) / 12) * (-0.1-(0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.44784-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.98925-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.33013-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 7.44784 + (((tickAnim - 15) / 10) * (4.94784-(7.44784)));
            yy = -12.98925 + (((tickAnim - 15) / 10) * (-12.98925-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 15) / 10) * (4.33013-(4.33013)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.94784 + (((tickAnim - 25) / 10) * (7.44784-(4.94784)));
            yy = -12.98925 + (((tickAnim - 25) / 10) * (-12.98925-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 25) / 10) * (4.33013-(4.33013)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.44784 + (((tickAnim - 35) / 15) * (0-(7.44784)));
            yy = -12.98925 + (((tickAnim - 35) / 15) * (0-(-12.98925)));
            zz = 4.33013 + (((tickAnim - 35) / 15) * (0-(4.33013)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.28938-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.53425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.48093-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.28938 + (((tickAnim - 15) / 10) * (0.96062-(-0.28938)));
            yy = -4.53425 + (((tickAnim - 15) / 10) * (-4.53425-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 15) / 10) * (3.48093-(3.48093)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0.96062 + (((tickAnim - 25) / 10) * (-0.28938-(0.96062)));
            yy = -4.53425 + (((tickAnim - 25) / 10) * (-4.53425-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 25) / 10) * (3.48093-(3.48093)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.28938 + (((tickAnim - 35) / 15) * (0-(-0.28938)));
            yy = -4.53425 + (((tickAnim - 35) / 15) * (0-(-4.53425)));
            zz = 3.48093 + (((tickAnim - 35) / 15) * (0-(3.48093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-14-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (2.25-(0)));
            yy = -14 + (((tickAnim - 15) / 10) * (-14-(-14)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 25) / 10) * (0-(2.25)));
            yy = -14 + (((tickAnim - 25) / 10) * (-14-(-14)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -14 + (((tickAnim - 35) / 15) * (0-(-14)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.5 + (((tickAnim - 20) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 30) / 20) * (0-(-11.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-8.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.325 + (((tickAnim - 20) / 10) * (-8.325-(-8.325)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.325 + (((tickAnim - 30) / 20) * (0-(-8.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-41.85307-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-26.71769-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.13433-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.85307 + (((tickAnim - 20) / 10) * (-41.85307-(-41.85307)));
            yy = -26.71769 + (((tickAnim - 20) / 10) * (-26.71769-(-26.71769)));
            zz = -6.13433 + (((tickAnim - 20) / 10) * (-6.13433-(-6.13433)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.85307 + (((tickAnim - 30) / 20) * (0-(-41.85307)));
            yy = -26.71769 + (((tickAnim - 30) / 20) * (0-(-26.71769)));
            zz = -6.13433 + (((tickAnim - 30) / 20) * (0-(-6.13433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.2 + (((tickAnim - 20) / 10) * (1.2-(1.2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.2 + (((tickAnim - 30) / 20) * (0-(1.2)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42 + (((tickAnim - 20) / 10) * (42-(42)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 30) / 20) * (0-(42)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 20) / 10) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 30) / 20) * (0-(-15)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.75 + (((tickAnim - 20) / 10) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 30) / 20) * (0-(29.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.025 + (((tickAnim - 20) / 10) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.025 + (((tickAnim - 30) / 20) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41.85307-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (26.7177-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.1343-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.85307 + (((tickAnim - 20) / 10) * (-41.85307-(-41.85307)));
            yy = 26.7177 + (((tickAnim - 20) / 10) * (26.7177-(26.7177)));
            zz = 6.1343 + (((tickAnim - 20) / 10) * (6.1343-(6.1343)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.85307 + (((tickAnim - 30) / 20) * (0-(-41.85307)));
            yy = 26.7177 + (((tickAnim - 30) / 20) * (0-(26.7177)));
            zz = 6.1343 + (((tickAnim - 30) / 20) * (0-(6.1343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.2 + (((tickAnim - 20) / 10) * (1.2-(1.2)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.2 + (((tickAnim - 30) / 20) * (0-(1.2)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (42-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42 + (((tickAnim - 20) / 10) * (42-(42)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 42 + (((tickAnim - 30) / 20) * (0-(42)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 20) / 10) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 30) / 20) * (0-(-15)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.75 + (((tickAnim - 20) / 10) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 30) / 20) * (0-(29.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.025-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.025 + (((tickAnim - 20) / 10) * (-0.025-(-0.025)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.025 + (((tickAnim - 30) / 20) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 20) / 10) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 30) / 20) * (0-(-7.25)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.06-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -6.06 + (((tickAnim - 13) / 7) * (-6.5-(-6.06)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 20) / 10) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 30) / 5) * (-12-(-6.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 35) / 5) * (-12.12-(-12)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -12.12 + (((tickAnim - 40) / 10) * (0-(-12.12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.41-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.41 + (((tickAnim - 13) / 7) * (8.5-(10.41)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.5 + (((tickAnim - 20) / 10) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 30) / 5) * (-2-(8.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 35) / 5) * (-3.85-(-2)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.85 + (((tickAnim - 40) / 10) * (0-(-3.85)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26.85-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 26.85 + (((tickAnim - 13) / 7) * (25.75-(26.85)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 25.75 + (((tickAnim - 20) / 2) * (34.75-(25.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 34.75 + (((tickAnim - 22) / 8) * (25.75-(34.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.75 + (((tickAnim - 30) / 5) * (30.25-(25.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 30.25 + (((tickAnim - 35) / 5) * (6.85-(30.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.85 + (((tickAnim - 40) / 10) * (0-(6.85)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 22.21 + (((tickAnim - 13) / 7) * (10.5-(22.21)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 10.5 + (((tickAnim - 20) / 2) * (-6.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -6.5 + (((tickAnim - 22) / 3) * (24.05-(-6.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 24.05 + (((tickAnim - 25) / 5) * (10.5-(24.05)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 30) / 5) * (20.5-(10.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20.5 + (((tickAnim - 35) / 5) * (35.55-(20.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 35.55 + (((tickAnim - 40) / 5) * (-8.6-(35.55)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -8.6 + (((tickAnim - 45) / 5) * (0-(-8.6)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.25 + (((tickAnim - 20) / 10) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 30) / 20) * (0-(5.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.25 + (((tickAnim - 20) / 10) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 30) / 20) * (0-(15.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33.0325-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.2379-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.1765-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -33.0325 + (((tickAnim - 20) / 10) * (-33.0325-(-33.0325)));
            yy = 1.2379 + (((tickAnim - 20) / 10) * (1.2379-(1.2379)));
            zz = -0.1765 + (((tickAnim - 20) / 10) * (-0.1765-(-0.1765)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -33.0325 + (((tickAnim - 30) / 20) * (0-(-33.0325)));
            yy = 1.2379 + (((tickAnim - 30) / 20) * (0-(1.2379)));
            zz = -0.1765 + (((tickAnim - 30) / 20) * (0-(-0.1765)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (27.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 27.25 + (((tickAnim - 20) / 10) * (27.25-(27.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 27.25 + (((tickAnim - 30) / 20) * (0-(27.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.25 + (((tickAnim - 20) / 10) * (0.25-(0.25)));
            yy = 0.45 + (((tickAnim - 20) / 10) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 30) / 20) * (0-(0.25)));
            yy = 0.45 + (((tickAnim - 30) / 20) * (0-(0.45)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 26.75 + (((tickAnim - 20) / 10) * (26.75-(26.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 30) / 20) * (0-(26.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -20 + (((tickAnim - 20) / 10) * (-20-(-20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 30) / 20) * (0-(-20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-38.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -38.75 + (((tickAnim - 20) / 10) * (-38.75-(-38.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -38.75 + (((tickAnim - 30) / 20) * (0-(-38.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.375 + (((tickAnim - 20) / 10) * (-0.375-(-0.375)));
            yy = 0.525 + (((tickAnim - 20) / 10) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.375 + (((tickAnim - 30) / 20) * (0-(-0.375)));
            yy = 0.525 + (((tickAnim - 30) / 20) * (0-(0.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 20) / 10) * (-14-(-14)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 30) / 20) * (0-(-14)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (-7.48605-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (6.74587-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0.23667-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -7.48605 + (((tickAnim - 25) / 15) * (-6.47583-(-7.48605)));
            yy = 6.74587 + (((tickAnim - 25) / 15) * (-5.55594-(6.74587)));
            zz = 0.23667 + (((tickAnim - 25) / 15) * (-10.2516-(0.23667)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.47583 + (((tickAnim - 40) / 10) * (0-(-6.47583)));
            yy = -5.55594 + (((tickAnim - 40) / 10) * (0-(-5.55594)));
            zz = -10.2516 + (((tickAnim - 40) / 10) * (0-(-10.2516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-11.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-11.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-11.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(22.5), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 5) * (-19.53-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -19.53 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(-19.53)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 7) / 5) * (27.5-(17.5)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 12) / 3) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 15) / 2) * (-10-(32.5)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 17) / 3) * (-27.5-(-10)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -27.5 + (((tickAnim - 20) / 3) * (-12.5-(-27.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -12.5 + (((tickAnim - 23) / 6) * (15-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 15 + (((tickAnim - 29) / 5) * (5-(15)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 34) / 6) * (0-(5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -3 + (((tickAnim - 15) / 7) * (15.5-(-3)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 15.5 + (((tickAnim - 22) / 18) * (0-(15.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.5 + (((tickAnim - 15) / 5) * (0.75-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0.75 + (((tickAnim - 20) / 4) * (23-(0.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 23 + (((tickAnim - 24) / 16) * (0-(23)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (15-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 40) / 20) * (10-(15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (0-(10)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-15-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-10-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 60) / 19) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-15-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-10-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = -10 + (((tickAnim - 60) / 19) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 20) / 20) * (15-(12.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 40) / 20) * (12.5-(15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 79) {
            xx = 12.5 + (((tickAnim - 60) / 19) * (0-(12.5)));
            yy = 0 + (((tickAnim - 60) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 10) / 10) * (-2.5-(1.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 20) / 20) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 40) / 7) * (-6.67-(-5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -6.67 + (((tickAnim - 47) / 13) * (-2.5-(-6.67)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 12) / 26) * (-14.89266-(-12.5)));
            yy = 20 + (((tickAnim - 12) / 26) * (22.77849-(20)));
            zz = -25 + (((tickAnim - 12) / 26) * (-29.79642-(-25)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -14.89266 + (((tickAnim - 38) / 5) * (-11.75441-(-14.89266)));
            yy = 22.77849 + (((tickAnim - 38) / 5) * (18.95151-(22.77849)));
            zz = -29.79642 + (((tickAnim - 38) / 5) * (-23.79742-(-29.79642)));
        }
        else if (tickAnim >= 43 && tickAnim < 57) {
            xx = -11.75441 + (((tickAnim - 43) / 14) * (5-(-11.75441)));
            yy = 18.95151 + (((tickAnim - 43) / 14) * (0-(18.95151)));
            zz = -23.79742 + (((tickAnim - 43) / 14) * (0-(-23.79742)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 5 + (((tickAnim - 57) / 6) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 63) / 17) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.06-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.06 + (((tickAnim - 13) / 6) * (12.5-(-13.06)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 12.5 + (((tickAnim - 19) / 3) * (4.38-(12.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 41) {
            xx = 4.38 + (((tickAnim - 22) / 19) * (-10-(4.38)));
            yy = 0 + (((tickAnim - 22) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 19) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -10 + (((tickAnim - 41) / 7) * (-5-(-10)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 48) / 32) * (0-(-5)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-20-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 38) {
            xx = -12.5 + (((tickAnim - 12) / 26) * (-14.89266-(-12.5)));
            yy = -20 + (((tickAnim - 12) / 26) * (-22.7785-(-20)));
            zz = 25 + (((tickAnim - 12) / 26) * (29.7964-(25)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -14.89266 + (((tickAnim - 38) / 5) * (-11.75441-(-14.89266)));
            yy = -22.7785 + (((tickAnim - 38) / 5) * (-18.9515-(-22.7785)));
            zz = 29.7964 + (((tickAnim - 38) / 5) * (23.7974-(29.7964)));
        }
        else if (tickAnim >= 43 && tickAnim < 57) {
            xx = -11.75441 + (((tickAnim - 43) / 14) * (5-(-11.75441)));
            yy = -18.9515 + (((tickAnim - 43) / 14) * (0-(-18.9515)));
            zz = 23.7974 + (((tickAnim - 43) / 14) * (0-(23.7974)));
        }
        else if (tickAnim >= 57 && tickAnim < 63) {
            xx = 5 + (((tickAnim - 57) / 6) * (-12.5-(5)));
            yy = 0 + (((tickAnim - 57) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 6) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -12.5 + (((tickAnim - 63) / 17) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.06-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.06 + (((tickAnim - 13) / 6) * (12.5-(-13.06)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 12.5 + (((tickAnim - 19) / 3) * (4.38-(12.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 41) {
            xx = 4.38 + (((tickAnim - 22) / 19) * (-10-(4.38)));
            yy = 0 + (((tickAnim - 22) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 19) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = -10 + (((tickAnim - 41) / 7) * (-5-(-10)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 48) / 32) * (0-(-5)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 10) / 5) * (-23.75-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -23.75 + (((tickAnim - 15) / 5) * (-25-(-23.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -25 + (((tickAnim - 20) / 20) * (-2.5-(-25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 40) / 20) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 10) / 5) * (-20.62-(1.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.62 + (((tickAnim - 15) / 5) * (-2.5-(-20.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (-3.75-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 25) / 15) * (2.5-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 40) / 20) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -3.75 + (((tickAnim - 10) / 1) * (-0.31-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.31 + (((tickAnim - 11) / 4) * (6.88-(-0.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 6.88 + (((tickAnim - 15) / 3) * (-5.31-(6.88)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.31 + (((tickAnim - 18) / 2) * (-17.5-(-5.31)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-19.37-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -19.37 + (((tickAnim - 25) / 15) * (-15-(-19.37)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-17.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 60) / 20) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20 + (((tickAnim - 40) / 40) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*20)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21.88 + (((tickAnim - 5) / 5) * (8.75-(21.88)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 10) / 5) * (8.13-(8.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 8.13 + (((tickAnim - 15) / 4) * (11.57-(8.13)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 11.57 + (((tickAnim - 19) / 4) * (-2.5-(11.57)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 23) / 3) * (0.63-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0.63 + (((tickAnim - 26) / 14) * (0-(0.63)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 6) / 9) * (42.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10-(7.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 42.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10 + (((tickAnim - 15) / 25) * (45-(42.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 40) / 10) * (25-(45)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 25 + (((tickAnim - 50) / 30) * (0-(25)));
            yy = 0 + (((tickAnim - 50) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 20) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*6-(2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*6 + (((tickAnim - 40) / 20) * (2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*6)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 60) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-8.92-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 63) {
            xx = -8.92 + (((tickAnim - 29) / 34) * (-5.75-(-8.92)));
            yy = 0 + (((tickAnim - 29) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 34) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -5.75 + (((tickAnim - 63) / 17) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = -9.25 + (((tickAnim - 29) / 18) * (5.25-(-9.25)));
            yy = 0 + (((tickAnim - 29) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 18) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 63) {
            xx = 5.25 + (((tickAnim - 47) / 16) * (15-(5.25)));
            yy = 0 + (((tickAnim - 47) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 16) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 15 + (((tickAnim - 63) / 10) * (11.18-(15)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 11.18 + (((tickAnim - 73) / 7) * (0-(11.18)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = -9.25 + (((tickAnim - 29) / 18) * (18.75-(-9.25)));
            yy = 0 + (((tickAnim - 29) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 18) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 63) {
            xx = 18.75 + (((tickAnim - 47) / 16) * (26.75-(18.75)));
            yy = 0 + (((tickAnim - 47) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 16) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 26.75 + (((tickAnim - 63) / 10) * (20.71-(26.75)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 20.71 + (((tickAnim - 73) / 7) * (0-(20.71)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 82;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-102.78252-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-29.55548-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (18.89343-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -102.78252 + (((tickAnim - 23) / 3) * (-100.78252-(-102.78252)));
            yy = -29.55548 + (((tickAnim - 23) / 3) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 23) / 3) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -100.78252 + (((tickAnim - 26) / 2) * (-102.78252-(-100.78252)));
            yy = -29.55548 + (((tickAnim - 26) / 2) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 26) / 2) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -102.78252 + (((tickAnim - 28) / 3) * (-100.78252-(-102.78252)));
            yy = -29.55548 + (((tickAnim - 28) / 3) * (-29.55548-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 28) / 3) * (18.89343-(18.89343)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -100.78252 + (((tickAnim - 31) / 12) * (-62.99988-(-100.78252)));
            yy = -29.55548 + (((tickAnim - 31) / 12) * (-2.21464-(-29.55548)));
            zz = 18.89343 + (((tickAnim - 31) / 12) * (-18.52671-(18.89343)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -62.99988 + (((tickAnim - 43) / 17) * (-62.99988-(-62.99988)));
            yy = -2.21464 + (((tickAnim - 43) / 17) * (-2.21464-(-2.21464)));
            zz = -18.52671 + (((tickAnim - 43) / 17) * (-18.52671-(-18.52671)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -62.99988 + (((tickAnim - 60) / 23) * (0-(-62.99988)));
            yy = -2.21464 + (((tickAnim - 60) / 23) * (0-(-2.21464)));
            zz = -18.52671 + (((tickAnim - 60) / 23) * (0-(-18.52671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(-0.525);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -20.75 + (((tickAnim - 23) / 2) * (-20.55722-(-20.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (-2.84678-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (-7.74647-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -20.55722 + (((tickAnim - 25) / 2) * (-20.75-(-20.55722)));
            yy = -2.84678 + (((tickAnim - 25) / 2) * (0-(-2.84678)));
            zz = -7.74647 + (((tickAnim - 25) / 2) * (0-(-7.74647)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -20.75 + (((tickAnim - 27) / 2) * (-20.55722-(-20.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (-2.84678-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (-7.74647-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -20.55722 + (((tickAnim - 29) / 3) * (-20.75-(-20.55722)));
            yy = -2.84678 + (((tickAnim - 29) / 3) * (0-(-2.84678)));
            zz = -7.74647 + (((tickAnim - 29) / 3) * (0-(-7.74647)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -20.75 + (((tickAnim - 32) / 11) * (9.88784-(-20.75)));
            yy = 0 + (((tickAnim - 32) / 11) * (-8.99432-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (-6.36861-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 9.88784 + (((tickAnim - 43) / 17) * (9.88784-(9.88784)));
            yy = -8.99432 + (((tickAnim - 43) / 17) * (-8.99432-(-8.99432)));
            zz = -6.36861 + (((tickAnim - 43) / 17) * (-6.36861-(-6.36861)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 9.88784 + (((tickAnim - 60) / 23) * (0-(9.88784)));
            yy = -8.99432 + (((tickAnim - 60) / 23) * (0-(-8.99432)));
            zz = -6.36861 + (((tickAnim - 60) / 23) * (0-(-6.36861)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (20.00706-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-21.8308-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (9.5299-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 20.00706 + (((tickAnim - 23) / 6) * (20.00706-(20.00706)));
            yy = -21.8308 + (((tickAnim - 23) / 6) * (-21.8308-(-21.8308)));
            zz = 9.5299 + (((tickAnim - 23) / 6) * (9.5299-(9.5299)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 20.00706 + (((tickAnim - 29) / 10) * (35.39468-(20.00706)));
            yy = -21.8308 + (((tickAnim - 29) / 10) * (-18.1224-(-21.8308)));
            zz = 9.5299 + (((tickAnim - 29) / 10) * (-8.40481-(9.5299)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 35.39468 + (((tickAnim - 39) / 9) * (42.64468-(35.39468)));
            yy = -18.1224 + (((tickAnim - 39) / 9) * (-18.1224-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 39) / 9) * (-8.40481-(-8.40481)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 42.64468 + (((tickAnim - 48) / 12) * (42.64468-(42.64468)));
            yy = -18.1224 + (((tickAnim - 48) / 12) * (-18.1224-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 48) / 12) * (-8.40481-(-8.40481)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 42.64468 + (((tickAnim - 60) / 23) * (0-(42.64468)));
            yy = -18.1224 + (((tickAnim - 60) / 23) * (0-(-18.1224)));
            zz = -8.40481 + (((tickAnim - 60) / 23) * (0-(-8.40481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.7442-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-6.82874-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.945-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 24.7442 + (((tickAnim - 23) / 6) * (24.7442-(24.7442)));
            yy = -6.82874 + (((tickAnim - 23) / 6) * (-6.82874-(-6.82874)));
            zz = 2.945 + (((tickAnim - 23) / 6) * (2.945-(2.945)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 24.7442 + (((tickAnim - 29) / 10) * (24.43121-(24.7442)));
            yy = -6.82874 + (((tickAnim - 29) / 10) * (-14.701-(-6.82874)));
            zz = 2.945 + (((tickAnim - 29) / 10) * (-2.69969-(2.945)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 24.43121 + (((tickAnim - 39) / 9) * (33.18121-(24.43121)));
            yy = -14.701 + (((tickAnim - 39) / 9) * (-14.701-(-14.701)));
            zz = -2.69969 + (((tickAnim - 39) / 9) * (-2.69969-(-2.69969)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 33.18121 + (((tickAnim - 48) / 12) * (33.18121-(33.18121)));
            yy = -14.701 + (((tickAnim - 48) / 12) * (-14.701-(-14.701)));
            zz = -2.69969 + (((tickAnim - 48) / 12) * (-2.69969-(-2.69969)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 33.18121 + (((tickAnim - 60) / 23) * (0-(33.18121)));
            yy = -14.701 + (((tickAnim - 60) / 23) * (0-(-14.701)));
            zz = -2.69969 + (((tickAnim - 60) / 23) * (0-(-2.69969)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (5.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 5.25 + (((tickAnim - 23) / 6) * (5.25-(5.25)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (23.83015-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-3.58223-(0)));
            zz = 5.25 + (((tickAnim - 29) / 10) * (10.67734-(5.25)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 23.83015 + (((tickAnim - 39) / 9) * (23.99598-(23.83015)));
            yy = -3.58223 + (((tickAnim - 39) / 9) * (0.55192-(-3.58223)));
            zz = 10.67734 + (((tickAnim - 39) / 9) * (4.41609-(10.67734)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 23.99598 + (((tickAnim - 48) / 3) * (23.95079-(23.99598)));
            yy = 0.55192 + (((tickAnim - 48) / 3) * (-1.93094-(0.55192)));
            zz = 4.41609 + (((tickAnim - 48) / 3) * (8.16971-(4.41609)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 23.95079 + (((tickAnim - 51) / 2) * (23.99598-(23.95079)));
            yy = -1.93094 + (((tickAnim - 51) / 2) * (0.55192-(-1.93094)));
            zz = 8.16971 + (((tickAnim - 51) / 2) * (4.41609-(8.16971)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 23.99598 + (((tickAnim - 53) / 5) * (23.95079-(23.99598)));
            yy = 0.55192 + (((tickAnim - 53) / 5) * (-1.93094-(0.55192)));
            zz = 4.41609 + (((tickAnim - 53) / 5) * (8.16971-(4.41609)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 23.95079 + (((tickAnim - 58) / 2) * (23.99598-(23.95079)));
            yy = -1.93094 + (((tickAnim - 58) / 2) * (0.55192-(-1.93094)));
            zz = 8.16971 + (((tickAnim - 58) / 2) * (4.41609-(8.16971)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 23.99598 + (((tickAnim - 60) / 23) * (0-(23.99598)));
            yy = 0.55192 + (((tickAnim - 60) / 23) * (0-(0.55192)));
            zz = 4.41609 + (((tickAnim - 60) / 23) * (0-(4.41609)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 10 + (((tickAnim - 48) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (10-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 10 + (((tickAnim - 55) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 58) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 64) {
            xx = 10 + (((tickAnim - 61) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 61) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 104;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 4 + (((tickAnim - 13) / 30) * (-3.47217-(4)));
            yy = 0 + (((tickAnim - 13) / 30) * (6.73348-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0.47304-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = -3.47217 + (((tickAnim - 43) / 10) * (-3.47217-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 43) / 10) * (6.73348-(6.73348)));
            zz = 0.47304 + (((tickAnim - 43) / 10) * (0.47304-(0.47304)));
        }
        else if (tickAnim >= 53 && tickAnim < 79) {
            xx = -3.47217 + (((tickAnim - 53) / 26) * (-3.47217-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 53) / 26) * (6.73348-(6.73348)));
            zz = 0.47304 + (((tickAnim - 53) / 26) * (0.47304-(0.47304)));
        }
        else if (tickAnim >= 79 && tickAnim < 104) {
            xx = -3.47217 + (((tickAnim - 79) / 25) * (0-(-3.47217)));
            yy = 6.73348 + (((tickAnim - 79) / 25) * (0-(6.73348)));
            zz = 0.47304 + (((tickAnim - 79) / 25) * (0-(0.47304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-12.125-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -17 + (((tickAnim - 7) / 6) * (-10-(-17)));
            yy = -12.125 + (((tickAnim - 7) / 6) * (-24.25-(-12.125)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -10 + (((tickAnim - 13) / 30) * (1.05802-(-10)));
            yy = -24.25 + (((tickAnim - 13) / 30) * (-29.96421-(-24.25)));
            zz = 0 + (((tickAnim - 13) / 30) * (-8.3173-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 1.05802 + (((tickAnim - 43) / 36) * (1.05802-(1.05802)));
            yy = -29.96421 + (((tickAnim - 43) / 36) * (-29.96421-(-29.96421)));
            zz = -8.3173 + (((tickAnim - 43) / 36) * (-8.3173-(-8.3173)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = 1.05802 + (((tickAnim - 79) / 7) * (6.3505-(1.05802)));
            yy = -29.96421 + (((tickAnim - 79) / 7) * (-17.00671-(-29.96421)));
            zz = -8.3173 + (((tickAnim - 79) / 7) * (-4.72063-(-8.3173)));
        }
        else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 6.3505 + (((tickAnim - 86) / 6) * (11-(6.3505)));
            yy = -17.00671 + (((tickAnim - 86) / 6) * (0-(-17.00671)));
            zz = -4.72063 + (((tickAnim - 86) / 6) * (0-(-4.72063)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 11 + (((tickAnim - 92) / 12) * (0-(11)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.74-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-1.225-(0)));
            yy = 0.74 + (((tickAnim - 7) / 6) * (-0.525-(0.74)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -1.225 + (((tickAnim - 13) / 30) * (-1.225-(-1.225)));
            yy = -0.525 + (((tickAnim - 13) / 30) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = -1.225 + (((tickAnim - 43) / 36) * (-1.225-(-1.225)));
            yy = -0.525 + (((tickAnim - 43) / 36) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = -1.225 + (((tickAnim - 79) / 7) * (-0.7-(-1.225)));
            yy = -0.525 + (((tickAnim - 79) / 7) * (1.175-(-0.525)));
            zz = 0 + (((tickAnim - 79) / 7) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 92) {
            xx = -0.7 + (((tickAnim - 86) / 6) * (0-(-0.7)));
            yy = 1.175 + (((tickAnim - 86) / 6) * (0-(1.175)));
            zz = 0 + (((tickAnim - 86) / 6) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (19.63-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 19.63 + (((tickAnim - 7) / 6) * (0-(19.63)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (-7.56987-(0)));
            yy = 0 + (((tickAnim - 13) / 30) * (-1.32571-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (3.79567-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = -7.56987 + (((tickAnim - 43) / 36) * (-7.56987-(-7.56987)));
            yy = -1.32571 + (((tickAnim - 43) / 36) * (-1.32571-(-1.32571)));
            zz = 3.79567 + (((tickAnim - 43) / 36) * (3.79567-(3.79567)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = -7.56987 + (((tickAnim - 79) / 7) * (15.45359-(-7.56987)));
            yy = -1.32571 + (((tickAnim - 79) / 7) * (-0.75243-(-1.32571)));
            zz = 3.79567 + (((tickAnim - 79) / 7) * (2.1543-(3.79567)));
        }
        else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 15.45359 + (((tickAnim - 86) / 6) * (-13.00133-(15.45359)));
            yy = -0.75243 + (((tickAnim - 86) / 6) * (-1.65031-(-0.75243)));
            zz = 2.1543 + (((tickAnim - 86) / 6) * (-1.04351-(2.1543)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = -13.00133 + (((tickAnim - 92) / 12) * (0-(-13.00133)));
            yy = -1.65031 + (((tickAnim - 92) / 12) * (0-(-1.65031)));
            zz = -1.04351 + (((tickAnim - 92) / 12) * (0-(-1.04351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 30) * (0.425-(-0.05)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            yy = 0.425 + (((tickAnim - 43) / 36) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            yy = 0.425 + (((tickAnim - 79) / 13) * (0.9-(0.425)));
            zz = 0 + (((tickAnim - 79) / 13) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = 0.9 + (((tickAnim - 92) / 12) * (0-(0.9)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -17 + (((tickAnim - 7) / 6) * (-4.75-(-17)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = -4.75 + (((tickAnim - 13) / 30) * (10.5-(-4.75)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 10.5 + (((tickAnim - 43) / 36) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = 10.5 + (((tickAnim - 79) / 7) * (-18.29-(10.5)));
            yy = 0 + (((tickAnim - 79) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 7) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 92) {
            xx = -18.29 + (((tickAnim - 86) / 6) * (0-(-18.29)));
            yy = 0 + (((tickAnim - 86) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 6) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = -0.125 + (((tickAnim - 43) / 36) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            zz = -0.125 + (((tickAnim - 79) / 13) * (0-(-0.125)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (35.13-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 35.13 + (((tickAnim - 7) / 5) * (15.22-(35.13)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 15.22 + (((tickAnim - 12) / 1) * (10.5-(15.22)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 10.5 + (((tickAnim - 13) / 30) * (1.75-(10.5)));
            yy = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 30) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 1.75 + (((tickAnim - 43) / 36) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = 1.75 + (((tickAnim - 79) / 7) * (29.74-(1.75)));
            yy = 0 + (((tickAnim - 79) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 7) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 92) {
            xx = 29.74 + (((tickAnim - 86) / 6) * (4.5-(29.74)));
            yy = 0 + (((tickAnim - 86) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 6) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 4.5 + (((tickAnim - 92) / 12) * (0-(4.5)));
            yy = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.06-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.18 + (((tickAnim - 7) / 6) * (-0.125-(0.18)));
            zz = -0.06 + (((tickAnim - 7) / 6) * (-0.425-(-0.06)));
        }
        else if (tickAnim >= 13 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 13) / 30) * (0-(0)));
            yy = -0.125 + (((tickAnim - 13) / 30) * (0.4-(-0.125)));
            zz = -0.425 + (((tickAnim - 13) / 30) * (0.05-(-0.425)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            yy = 0.4 + (((tickAnim - 43) / 36) * (0.4-(0.4)));
            zz = 0.05 + (((tickAnim - 43) / 36) * (0.05-(0.05)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            yy = 0.4 + (((tickAnim - 79) / 13) * (0.25-(0.4)));
            zz = 0.05 + (((tickAnim - 79) / 13) * (0-(0.05)));
        }
        else if (tickAnim >= 92 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 92) / 12) * (0-(0)));
            yy = 0.25 + (((tickAnim - 92) / 12) * (0-(0.25)));
            zz = 0 + (((tickAnim - 92) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = -4.5 + (((tickAnim - 17) / 19) * (5.75-(-4.5)));
            yy = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 19) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 5.75 + (((tickAnim - 36) / 7) * (16.5-(5.75)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 16.5 + (((tickAnim - 43) / 36) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 16.5 + (((tickAnim - 79) / 13) * (15.2745-(16.5)));
            yy = 0 + (((tickAnim - 79) / 13) * (3.93606-(0)));
            zz = 0 + (((tickAnim - 79) / 13) * (0.7129-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 15.2745 + (((tickAnim - 92) / 6) * (4.63725-(15.2745)));
            yy = 3.93606 + (((tickAnim - 92) / 6) * (1.96803-(3.93606)));
            zz = 0.7129 + (((tickAnim - 92) / 6) * (0.35645-(0.7129)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 4.63725 + (((tickAnim - 98) / 6) * (0-(4.63725)));
            yy = 1.96803 + (((tickAnim - 98) / 6) * (0-(1.96803)));
            zz = 0.35645 + (((tickAnim - 98) / 6) * (0-(0.35645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            yy = -0.15 + (((tickAnim - 17) / 19) * (1.125-(-0.15)));
            zz = 0 + (((tickAnim - 17) / 19) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 1.125 + (((tickAnim - 36) / 7) * (-0.12-(1.125)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            yy = -0.12 + (((tickAnim - 43) / 36) * (-0.12-(-0.12)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            yy = -0.12 + (((tickAnim - 79) / 13) * (-0.12-(-0.12)));
            zz = 0 + (((tickAnim - 79) / 13) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            yy = -0.12 + (((tickAnim - 92) / 6) * (1.365-(-0.12)));
            zz = 0 + (((tickAnim - 92) / 6) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 98) / 6) * (0-(0)));
            yy = 1.365 + (((tickAnim - 98) / 6) * (0-(1.365)));
            zz = 0 + (((tickAnim - 98) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 17) / 19) * (30.25-(0)));
            yy = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 19) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 30.25 + (((tickAnim - 36) / 7) * (0.25-(30.25)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0.25 + (((tickAnim - 43) / 36) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0.25 + (((tickAnim - 79) / 13) * (-0.5-(0.25)));
            yy = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 13) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -0.5 + (((tickAnim - 92) / 6) * (12.88-(-0.5)));
            yy = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 12.88 + (((tickAnim - 98) / 6) * (0-(12.88)));
            yy = 0 + (((tickAnim - 98) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 17) / 19) * (-16-(0)));
            yy = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 19) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -16 + (((tickAnim - 36) / 7) * (-1.5-(-16)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = -1.5 + (((tickAnim - 43) / 36) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = -1.5 + (((tickAnim - 79) / 13) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 13) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -1.5 + (((tickAnim - 92) / 6) * (-32.5-(-1.5)));
            yy = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = -32.5 + (((tickAnim - 98) / 6) * (0-(-32.5)));
            yy = 0 + (((tickAnim - 98) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 17) / 19) * (29-(0)));
            yy = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 19) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 29 + (((tickAnim - 36) / 7) * (-12.25-(29)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = -12.25 + (((tickAnim - 43) / 36) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 36) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = -12.25 + (((tickAnim - 79) / 13) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 13) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = -12.25 + (((tickAnim - 92) / 6) * (26.63-(-12.25)));
            yy = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 6) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 26.63 + (((tickAnim - 98) / 6) * (0-(26.63)));
            yy = 0 + (((tickAnim - 98) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 19) * (-1-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (-0.525-(0)));
            zz = -1 + (((tickAnim - 36) / 7) * (0.05-(-1)));
        }
        else if (tickAnim >= 43 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 43) / 36) * (0-(0)));
            yy = -0.525 + (((tickAnim - 43) / 36) * (-0.525-(-0.525)));
            zz = 0.05 + (((tickAnim - 43) / 36) * (0.05-(0.05)));
        }
        else if (tickAnim >= 79 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 79) / 13) * (0-(0)));
            yy = -0.525 + (((tickAnim - 79) / 13) * (-0.525-(-0.525)));
            zz = 0.05 + (((tickAnim - 79) / 13) * (0.05-(0.05)));
        }
        else if (tickAnim >= 92 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 92) / 6) * (0-(0)));
            yy = -0.525 + (((tickAnim - 92) / 6) * (-0.26-(-0.525)));
            zz = 0.05 + (((tickAnim - 92) / 6) * (-1.02-(0.05)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 98) / 6) * (0-(0)));
            yy = -0.26 + (((tickAnim - 98) / 6) * (0-(-0.26)));
            zz = -1.02 + (((tickAnim - 98) / 6) * (0-(-1.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 12) / 8) * (2.25-(1)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 2.25 + (((tickAnim - 20) / 9) * (0.24954-(2.25)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.99863-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.05234-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 53) {
            xx = 0.24954 + (((tickAnim - 29) / 24) * (-5.02402-(0.24954)));
            yy = 0.99863 + (((tickAnim - 29) / 24) * (6.64067-(0.99863)));
            zz = -0.05234 + (((tickAnim - 29) / 24) * (-0.2919-(-0.05234)));
        }
        else if (tickAnim >= 53 && tickAnim < 67) {
            xx = -5.02402 + (((tickAnim - 53) / 14) * (-5.02068-(-5.02402)));
            yy = 6.64067 + (((tickAnim - 53) / 14) * (-3.35338-(6.64067)));
            zz = -0.2919 + (((tickAnim - 53) / 14) * (0.14728-(-0.2919)));
        }
        else if (tickAnim >= 67 && tickAnim < 81) {
            xx = -5.02068 + (((tickAnim - 67) / 14) * (-5.00954-(-5.02068)));
            yy = -3.35338 + (((tickAnim - 67) / 14) * (-4.99523-(-3.35338)));
            zz = 0.14728 + (((tickAnim - 67) / 14) * (0.21865-(0.14728)));
        }
        else if (tickAnim >= 81 && tickAnim < 93) {
            xx = -5.00954 + (((tickAnim - 81) / 12) * (-3.3026-(-5.00954)));
            yy = -4.99523 + (((tickAnim - 81) / 12) * (-2.52461-(-4.99523)));
            zz = 0.21865 + (((tickAnim - 81) / 12) * (0.1106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*-2-(0.21865)));
        }
        else if (tickAnim >= 93 && tickAnim < 104) {
            xx = -3.3026 + (((tickAnim - 93) / 11) * (0-(-3.3026)));
            yy = -2.52461 + (((tickAnim - 93) / 11) * (0-(-2.52461)));
            zz = 0.1106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*-2 + (((tickAnim - 93) / 11) * (0-(0.1106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1250))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 29) {
            xx = -3.5 + (((tickAnim - 9) / 20) * (6.50266-(-3.5)));
            yy = 0 + (((tickAnim - 9) / 20) * (1.2249-(0)));
            zz = 0 + (((tickAnim - 9) / 20) * (0.24925-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 6.50266 + (((tickAnim - 29) / 9) * (-1.49157-(6.50266)));
            yy = 1.2249 + (((tickAnim - 29) / 9) * (2.98446-(1.2249)));
            zz = 0.24925 + (((tickAnim - 29) / 9) * (0.21551-(0.24925)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -1.49157 + (((tickAnim - 38) / 15) * (-7.27418-(-1.49157)));
            yy = 2.98446 + (((tickAnim - 38) / 15) * (8.62495-(2.98446)));
            zz = 0.21551 + (((tickAnim - 38) / 15) * (-0.25756-(0.21551)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = -7.27418 + (((tickAnim - 53) / 9) * (-3.5-(-7.27418)));
            yy = 8.62495 + (((tickAnim - 53) / 9) * (-5.75-(8.62495)));
            zz = -0.25756 + (((tickAnim - 53) / 9) * (0-(-0.25756)));
        }
        else if (tickAnim >= 62 && tickAnim < 81) {
            xx = -3.5 + (((tickAnim - 62) / 19) * (-3.5-(-3.5)));
            yy = -5.75 + (((tickAnim - 62) / 19) * (-5.75-(-5.75)));
            zz = 0 + (((tickAnim - 62) / 19) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = -3.5 + (((tickAnim - 81) / 5) * (-6.68225-(-3.5)));
            yy = -5.75 + (((tickAnim - 81) / 5) * (-3.85328-(-5.75)));
            zz = 0 + (((tickAnim - 81) / 5) * (0.37115-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 93) {
            xx = -6.68225 + (((tickAnim - 86) / 7) * (1.90809-(-6.68225)));
            yy = -3.85328 + (((tickAnim - 86) / 7) * (-1.3243-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(-3.85328)));
            zz = 0.37115 + (((tickAnim - 86) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(0.37115)));
        }
        else if (tickAnim >= 93 && tickAnim < 104) {
            xx = 1.90809 + (((tickAnim - 93) / 11) * (0-(1.90809)));
            yy = -1.3243-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 93) / 11) * (0-(-1.3243-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 93) / 11) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -5.25 + (((tickAnim - 12) / 17) * (16.75376-(-5.25)));
            yy = 0 + (((tickAnim - 12) / 17) * (1.19696-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0.3603-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 16.75376 + (((tickAnim - 29) / 9) * (13.38442-(16.75376)));
            yy = 1.19696 + (((tickAnim - 29) / 9) * (1.45928-(1.19696)));
            zz = 0.3603 + (((tickAnim - 29) / 9) * (0.34719-(0.3603)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 13.38442 + (((tickAnim - 38) / 15) * (4.25-(13.38442)));
            yy = 1.45928 + (((tickAnim - 38) / 15) * (0.66-(1.45928)));
            zz = 0.34719 + (((tickAnim - 38) / 15) * (0-(0.34719)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 4.25 + (((tickAnim - 53) / 9) * (0-(4.25)));
            yy = 0.66 + (((tickAnim - 53) / 9) * (3.57-(0.66)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 62) / 19) * (1-(0)));
            yy = 3.57 + (((tickAnim - 62) / 19) * (-16.5-(3.57)));
            zz = 0 + (((tickAnim - 62) / 19) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = 1 + (((tickAnim - 81) / 5) * (-0.16196-(1)));
            yy = -16.5 + (((tickAnim - 81) / 5) * (-6.59204-(-16.5)));
            zz = 0 + (((tickAnim - 81) / 5) * (-0.5677-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = -0.16196 + (((tickAnim - 86) / 8) * (13.82721-(-0.16196)));
            yy = -6.59204 + (((tickAnim - 86) / 8) * (-1.4189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(-6.59204)));
            zz = -0.5677 + (((tickAnim - 86) / 8) * (0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-4-(-0.5677)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 13.82721 + (((tickAnim - 94) / 10) * (0-(13.82721)));
            yy = -1.4189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 94) / 10) * (0-(-1.4189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
            zz = 0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-4 + (((tickAnim - 94) / 10) * (0-(0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1550))*-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -6 + (((tickAnim - 12) / 17) * (23.75-(-6)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 23.75 + (((tickAnim - 29) / 9) * (18.03-(23.75)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 18.03 + (((tickAnim - 38) / 15) * (12.92027-(18.03)));
            yy = 0 + (((tickAnim - 38) / 15) * (4.82157-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (-0.39137-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 12.92027 + (((tickAnim - 53) / 9) * (2.13937-(12.92027)));
            yy = 4.82157 + (((tickAnim - 53) / 9) * (11.83502-(4.82157)));
            zz = -0.39137 + (((tickAnim - 53) / 9) * (-0.29047-(-0.39137)));
        }
        else if (tickAnim >= 62 && tickAnim < 81) {
            xx = 2.13937 + (((tickAnim - 62) / 19) * (-2.06239-(2.13937)));
            yy = 11.83502 + (((tickAnim - 62) / 19) * (-32.69544-(11.83502)));
            zz = -0.29047 + (((tickAnim - 62) / 19) * (-2.33048-(-0.29047)));
        }
        else if (tickAnim >= 81 && tickAnim < 86) {
            xx = -2.06239 + (((tickAnim - 81) / 5) * (-9.83572-(-2.06239)));
            yy = -32.69544 + (((tickAnim - 81) / 5) * (-18.71914-(-32.69544)));
            zz = -2.33048 + (((tickAnim - 81) / 5) * (-1.37574-(-2.33048)));
        }
        else if (tickAnim >= 86 && tickAnim < 93) {
            xx = -9.83572 + (((tickAnim - 86) / 7) * (20.7041+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(-9.83572)));
            yy = -18.71914 + (((tickAnim - 86) / 7) * (-6.2414-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*8-(-18.71914)));
            zz = -1.37574 + (((tickAnim - 86) / 7) * (-0.4908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*5-(-1.37574)));
        }
        else if (tickAnim >= 93 && tickAnim < 104) {
            xx = 20.7041+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 93) / 11) * (0-(20.7041+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = -6.2414-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*8 + (((tickAnim - 93) / 11) * (0-(-6.2414-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*8)));
            zz = -0.4908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*5 + (((tickAnim - 93) / 11) * (0-(-0.4908+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1660))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.9571-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (3.26383-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.40108-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 3.9571 + (((tickAnim - 13) / 20) * (2.8321-(3.9571)));
            yy = 3.26383 + (((tickAnim - 13) / 20) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 13) / 20) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = 2.8321 + (((tickAnim - 33) / 11) * (-1.7929-(2.8321)));
            yy = 3.26383 + (((tickAnim - 33) / 11) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 33) / 11) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -1.7929 + (((tickAnim - 44) / 9) * (-1.7929-(-1.7929)));
            yy = 3.26383 + (((tickAnim - 44) / 9) * (3.26383-(3.26383)));
            zz = -0.40108 + (((tickAnim - 44) / 9) * (-0.40108-(-0.40108)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -1.7929 + (((tickAnim - 53) / 5) * (2.951-(-1.7929)));
            yy = 3.26383 + (((tickAnim - 53) / 5) * (-2.7124-(3.26383)));
            zz = -0.40108 + (((tickAnim - 53) / 5) * (-0.21362-(-0.40108)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 2.951 + (((tickAnim - 58) / 5) * (-1.80336-(2.951)));
            yy = -2.7124 + (((tickAnim - 58) / 5) * (-6.98115-(-2.7124)));
            zz = -0.21362 + (((tickAnim - 58) / 5) * (-0.07971-(-0.21362)));
        }
        else if (tickAnim >= 63 && tickAnim < 82) {
            xx = -1.80336 + (((tickAnim - 63) / 19) * (-1.80336-(-1.80336)));
            yy = -6.98115 + (((tickAnim - 63) / 19) * (-6.98115-(-6.98115)));
            zz = -0.07971 + (((tickAnim - 63) / 19) * (-0.07971-(-0.07971)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = -1.80336 + (((tickAnim - 82) / 9) * (-1.06866-(-1.80336)));
            yy = -6.98115 + (((tickAnim - 82) / 9) * (-4.13698-(-6.98115)));
            zz = -0.07971 + (((tickAnim - 82) / 9) * (-0.0472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3-(-0.07971)));
        }
        else if (tickAnim >= 91 && tickAnim < 104) {
            xx = -1.06866 + (((tickAnim - 91) / 13) * (0-(-1.06866)));
            yy = -4.13698 + (((tickAnim - 91) / 13) * (0-(-4.13698)));
            zz = -0.0472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3 + (((tickAnim - 91) / 13) * (0-(-0.0472+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (6.91371-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.53698-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.82046-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.91371 + (((tickAnim - 9) / 4) * (6.91371-(6.91371)));
            yy = 1.53698 + (((tickAnim - 9) / 4) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 9) / 4) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 6.91371 + (((tickAnim - 13) / 20) * (-11.08629-(6.91371)));
            yy = 1.53698 + (((tickAnim - 13) / 20) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 13) / 20) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 33 && tickAnim < 44) {
            xx = -11.08629 + (((tickAnim - 33) / 11) * (0.16371-(-11.08629)));
            yy = 1.53698 + (((tickAnim - 33) / 11) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 33) / 11) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0.16371 + (((tickAnim - 44) / 9) * (0.16371-(0.16371)));
            yy = 1.53698 + (((tickAnim - 44) / 9) * (1.53698-(1.53698)));
            zz = -0.82046 + (((tickAnim - 44) / 9) * (-0.82046-(-0.82046)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0.16371 + (((tickAnim - 53) / 5) * (3.19149-(0.16371)));
            yy = 1.53698 + (((tickAnim - 53) / 5) * (-5.08077-(1.53698)));
            zz = -0.82046 + (((tickAnim - 53) / 5) * (-1.13209-(-0.82046)));
        }
        else if (tickAnim >= 58 && tickAnim < 59) {
            xx = 3.19149 + (((tickAnim - 58) / 1) * (-1.66961-(3.19149)));
            yy = -5.08077 + (((tickAnim - 58) / 1) * (-8.38965-(-5.08077)));
            zz = -1.13209 + (((tickAnim - 58) / 1) * (-1.2879-(-1.13209)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = -1.66961 + (((tickAnim - 59) / 4) * (0.21928-(-1.66961)));
            yy = -8.38965 + (((tickAnim - 59) / 4) * (-11.69853-(-8.38965)));
            zz = -1.2879 + (((tickAnim - 59) / 4) * (-1.44372-(-1.2879)));
        }
        else if (tickAnim >= 63 && tickAnim < 82) {
            xx = 0.21928 + (((tickAnim - 63) / 19) * (0.21928-(0.21928)));
            yy = -11.69853 + (((tickAnim - 63) / 19) * (-11.69853-(-11.69853)));
            zz = -1.44372 + (((tickAnim - 63) / 19) * (-1.44372-(-1.44372)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 0.21928 + (((tickAnim - 82) / 9) * (0.13016-(0.21928)));
            yy = -11.69853 + (((tickAnim - 82) / 9) * (-7.68246-(-11.69853)));
            zz = -1.44372 + (((tickAnim - 82) / 9) * (-0.8573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1350))*2-(-1.44372)));
        }
        else if (tickAnim >= 91 && tickAnim < 104) {
            xx = 0.13016 + (((tickAnim - 91) / 13) * (0-(0.13016)));
            yy = -7.68246 + (((tickAnim - 91) / 13) * (0-(-7.68246)));
            zz = -0.8573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1350))*2 + (((tickAnim - 91) / 13) * (0-(-0.8573+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1350))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 9) / 4) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 13) / 69) * (0-(0)));
            yy = -0.225 + (((tickAnim - 13) / 69) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 13) / 69) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10.5 + (((tickAnim - 9) / 4) * (18-(10.5)));
            yy = 7.5 + (((tickAnim - 9) / 4) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 18 + (((tickAnim - 13) / 6) * (15.70833-(18)));
            yy = 7.5 + (((tickAnim - 13) / 6) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 15.70833 + (((tickAnim - 19) / 9) * (6.91667-(15.70833)));
            yy = 7.5 + (((tickAnim - 19) / 9) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 6.91667 + (((tickAnim - 28) / 16) * (-4.5-(6.91667)));
            yy = 7.5 + (((tickAnim - 28) / 16) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -4.5 + (((tickAnim - 44) / 9) * (-4.5-(-4.5)));
            yy = 7.5 + (((tickAnim - 44) / 9) * (7.5-(7.5)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = -4.5 + (((tickAnim - 53) / 3) * (-1.42671-(-4.5)));
            yy = 7.5 + (((tickAnim - 53) / 3) * (4.03295-(7.5)));
            zz = 0 + (((tickAnim - 53) / 3) * (0.21878-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = -1.42671 + (((tickAnim - 56) / 2) * (-1.5244-(-1.42671)));
            yy = 4.03295 + (((tickAnim - 56) / 2) * (-2.51518-(4.03295)));
            zz = 0.21878 + (((tickAnim - 56) / 2) * (1.1212-(0.21878)));
        }
        else if (tickAnim >= 58 && tickAnim < 59) {
            xx = -1.5244 + (((tickAnim - 58) / 1) * (3.88472-(-1.5244)));
            yy = -2.51518 + (((tickAnim - 58) / 1) * (-0.61829-(-2.51518)));
            zz = 1.1212 + (((tickAnim - 58) / 1) * (1.05824-(1.1212)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 3.88472 + (((tickAnim - 59) / 4) * (-4.23463-(3.88472)));
            yy = -0.61829 + (((tickAnim - 59) / 4) * (-8.57414-(-0.61829)));
            zz = 1.05824 + (((tickAnim - 59) / 4) * (2.40011-(1.05824)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = -4.23463 + (((tickAnim - 63) / 12) * (2.69422-(-4.23463)));
            yy = -8.57414 + (((tickAnim - 63) / 12) * (-8.86064-(-8.57414)));
            zz = 2.40011 + (((tickAnim - 63) / 12) * (-0.37383-(2.40011)));
        }
        else if (tickAnim >= 75 && tickAnim < 81) {
            xx = 2.69422 + (((tickAnim - 75) / 6) * (-9.30578-(2.69422)));
            yy = -8.86064 + (((tickAnim - 75) / 6) * (-8.86064-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 75) / 6) * (-0.37383-(-0.37383)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = -9.30578 + (((tickAnim - 81) / 2) * (-9.30578-(-9.30578)));
            yy = -8.86064 + (((tickAnim - 81) / 2) * (-8.86064-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 81) / 2) * (-0.37383-(-0.37383)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = -9.30578 + (((tickAnim - 83) / 5) * (1.19842-(-9.30578)));
            yy = -8.86064 + (((tickAnim - 83) / 5) * (-5.3718-(-8.86064)));
            zz = -0.37383 + (((tickAnim - 83) / 5) * (0.4935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(-0.37383)));
        }
        else if (tickAnim >= 88 && tickAnim < 104) {
            xx = 1.19842 + (((tickAnim - 88) / 16) * (0-(1.19842)));
            yy = -5.3718 + (((tickAnim - 88) / 16) * (0-(-5.3718)));
            zz = 0.4935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 88) / 16) * (0-(0.4935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 33) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 33) / 20) * (0-(0.375)));
            zz = 0 + (((tickAnim - 33) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 27) {
            xx = 12 + (((tickAnim - 9) / 18) * (-23.04-(12)));
            yy = 0 + (((tickAnim - 9) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 18) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = -23.04 + (((tickAnim - 27) / 16) * (15.25-(-23.04)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 15.25 + (((tickAnim - 43) / 3) * (11.25-(15.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 11.25 + (((tickAnim - 46) / 2) * (15.25-(11.25)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 15.25 + (((tickAnim - 48) / 3) * (11.25-(15.25)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 11.25 + (((tickAnim - 51) / 2) * (15.25-(11.25)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 15.25 + (((tickAnim - 53) / 3) * (20.34303-(15.25)));
            yy = 0 + (((tickAnim - 53) / 3) * (-10.2535-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (-2.46358-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 20.34303 + (((tickAnim - 56) / 3) * (11.90484-(20.34303)));
            yy = -10.2535 + (((tickAnim - 56) / 3) * (-18.79064-(-10.2535)));
            zz = -2.46358 + (((tickAnim - 56) / 3) * (-3.31637-(-2.46358)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 11.90484 + (((tickAnim - 59) / 4) * (23.41137-(11.90484)));
            yy = -18.79064 + (((tickAnim - 59) / 4) * (-12.94037-(-18.79064)));
            zz = -3.31637 + (((tickAnim - 59) / 4) * (-1.74181-(-3.31637)));
        }
        else if (tickAnim >= 63 && tickAnim < 75) {
            xx = 23.41137 + (((tickAnim - 63) / 12) * (23.16945-(23.41137)));
            yy = -12.94037 + (((tickAnim - 63) / 12) * (-12.44111-(-12.94037)));
            zz = -1.74181 + (((tickAnim - 63) / 12) * (-2.91648-(-1.74181)));
        }
        else if (tickAnim >= 75 && tickAnim < 81) {
            xx = 23.16945 + (((tickAnim - 75) / 6) * (32.91945-(23.16945)));
            yy = -12.44111 + (((tickAnim - 75) / 6) * (-12.44111-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 75) / 6) * (-2.91648-(-2.91648)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 32.91945 + (((tickAnim - 81) / 2) * (32.91945-(32.91945)));
            yy = -12.44111 + (((tickAnim - 81) / 2) * (-12.44111-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 81) / 2) * (-2.91648-(-2.91648)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 32.91945 + (((tickAnim - 83) / 7) * (13.28482-(32.91945)));
            yy = -12.44111 + (((tickAnim - 83) / 7) * (-4.99832-(-12.44111)));
            zz = -2.91648 + (((tickAnim - 83) / 7) * (-6.4047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(-2.91648)));
        }
        else if (tickAnim >= 90 && tickAnim < 104) {
            xx = 13.28482 + (((tickAnim - 90) / 14) * (0-(13.28482)));
            yy = -4.99832 + (((tickAnim - 90) / 14) * (0-(-4.99832)));
            zz = -6.4047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 90) / 14) * (0-(-6.4047+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (-19-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -19 + (((tickAnim - 48) / 5) * (0-(-19)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 10) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 72) / 3) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -24.5 + (((tickAnim - 75) / 3) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 78) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 1) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 79) / 2) * (-39.5-(0)));
            yy = 0 + (((tickAnim - 79) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 2) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = -39.5 + (((tickAnim - 81) / 2) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 2) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (8-(0)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 8 + (((tickAnim - 94) / 10) * (0-(8)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 43) / 5) * (0-(0.125)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 5) * (0.125-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 53) / 9) * (0-(0)));
            yy = 0.125 + (((tickAnim - 53) / 9) * (0-(0.125)));
            zz = 0 + (((tickAnim - 53) / 9) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 10) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 72) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throatPouch.rotationPointX = this.throatPouch.rotationPointX + (float)(xx);
        this.throatPouch.rotationPointY = this.throatPouch.rotationPointY - (float)(yy);
        this.throatPouch.rotationPointZ = this.throatPouch.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 9) / 4) * (-9.25-(-1.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -9.25 + (((tickAnim - 13) / 17) * (-2.12-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -2.12 + (((tickAnim - 30) / 6) * (8.36-(-2.12)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 8.36 + (((tickAnim - 36) / 5) * (3.34-(8.36)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 43) {
            xx = 3.34 + (((tickAnim - 41) / 2) * (-3.75-(3.34)));
            yy = 0 + (((tickAnim - 41) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 2) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -3.75 + (((tickAnim - 43) / 3) * (-1.07-(-3.75)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -1.07 + (((tickAnim - 46) / 2) * (-9.69-(-1.07)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -9.69 + (((tickAnim - 48) / 3) * (-1.07-(-9.69)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = -1.07 + (((tickAnim - 51) / 2) * (-3.75-(-1.07)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -3.75 + (((tickAnim - 53) / 4) * (1.60349-(-3.75)));
            yy = 0 + (((tickAnim - 53) / 4) * (-6.57184-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (-1.63109-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 1.60349 + (((tickAnim - 57) / 3) * (-10.98847-(1.60349)));
            yy = -6.57184 + (((tickAnim - 57) / 3) * (-6.02419-(-6.57184)));
            zz = -1.63109 + (((tickAnim - 57) / 3) * (-1.49516-(-1.63109)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = -10.98847 + (((tickAnim - 60) / 4) * (-3.75-(-10.98847)));
            yy = -6.02419 + (((tickAnim - 60) / 4) * (0-(-6.02419)));
            zz = -1.49516 + (((tickAnim - 60) / 4) * (0-(-1.49516)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = -3.75 + (((tickAnim - 64) / 8) * (-3.79567-(-3.75)));
            yy = 0 + (((tickAnim - 64) / 8) * (0.72445-(0)));
            zz = 0 + (((tickAnim - 64) / 8) * (-7.21391-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = -3.79567 + (((tickAnim - 72) / 3) * (-3.79567-(-3.79567)));
            yy = 0.72445 + (((tickAnim - 72) / 3) * (0.72445-(0.72445)));
            zz = -7.21391 + (((tickAnim - 72) / 3) * (-7.21391-(-7.21391)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -3.79567 + (((tickAnim - 75) / 3) * (1.85967-(-3.79567)));
            yy = 0.72445 + (((tickAnim - 75) / 3) * (-2.45795-(0.72445)));
            zz = -7.21391 + (((tickAnim - 75) / 3) * (12.16975-(-7.21391)));
        }
        else if (tickAnim >= 78 && tickAnim < 81) {
            xx = 1.85967 + (((tickAnim - 78) / 3) * (6.83466-(1.85967)));
            yy = -2.45795 + (((tickAnim - 78) / 3) * (-1.41113-(-2.45795)));
            zz = 12.16975 + (((tickAnim - 78) / 3) * (10.03223-(12.16975)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 6.83466 + (((tickAnim - 81) / 2) * (6.83466-(6.83466)));
            yy = -1.41113 + (((tickAnim - 81) / 2) * (-1.41113-(-1.41113)));
            zz = 10.03223 + (((tickAnim - 81) / 2) * (10.03223-(10.03223)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 6.83466 + (((tickAnim - 83) / 7) * (13.79556-(6.83466)));
            yy = -1.41113 + (((tickAnim - 83) / 7) * (7.17411-(-1.41113)));
            zz = 10.03223 + (((tickAnim - 83) / 7) * (11.52251-(10.03223)));
        }
        else if (tickAnim >= 90 && tickAnim < 91) {
            xx = 13.79556 + (((tickAnim - 90) / 1) * (5.94692-(13.79556)));
            yy = 7.17411 + (((tickAnim - 90) / 1) * (8.24726-(7.17411)));
            zz = 11.52251 + (((tickAnim - 90) / 1) * (11.7088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-8-(11.52251)));
        }
        else if (tickAnim >= 91 && tickAnim < 104) {
            xx = 5.94692 + (((tickAnim - 91) / 13) * (0-(5.94692)));
            yy = 8.24726 + (((tickAnim - 91) / 13) * (0-(8.24726)));
            zz = 11.7088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-8 + (((tickAnim - 91) / 13) * (0-(11.7088-Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0.6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            zz = 0.6 + (((tickAnim - 30) / 13) * (0-(0.6)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0.25-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0.25 + (((tickAnim - 48) / 5) * (0-(0.25)));
        }
        else if (tickAnim >= 53 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 53) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 29) {
            xx = -14 + (((tickAnim - 12) / 17) * (-13.25-(-14)));
            yy = 0 + (((tickAnim - 12) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 17) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -13.25 + (((tickAnim - 29) / 14) * (26.5-(-13.25)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 26.5 + (((tickAnim - 43) / 10) * (23.75-(26.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 23.75 + (((tickAnim - 53) / 5) * (-18.5-(23.75)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = -18.5 + (((tickAnim - 58) / 5) * (19-(-18.5)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = 19 + (((tickAnim - 63) / 10) * (0-(19)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 73) / 10) * (40.5-(0)));
            yy = 0 + (((tickAnim - 73) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 10) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 40.5 + (((tickAnim - 83) / 6) * (0.08387-(40.5)));
            yy = 0 + (((tickAnim - 83) / 6) * (-2.05072-(0)));
            zz = 0 + (((tickAnim - 83) / 6) * (5.90525-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 92) {
            xx = 0.08387 + (((tickAnim - 89) / 3) * (19.08387-(0.08387)));
            yy = -2.05072 + (((tickAnim - 89) / 3) * (-2.05072-(-2.05072)));
            zz = 5.90525 + (((tickAnim - 89) / 3) * (-5.9052-(5.90525)));
        }
        else if (tickAnim >= 92 && tickAnim < 95) {
            xx = 19.08387 + (((tickAnim - 92) / 3) * (-2.41613-(19.08387)));
            yy = -2.05072 + (((tickAnim - 92) / 3) * (-2.05072-(-2.05072)));
            zz = -5.9052 + (((tickAnim - 92) / 3) * (5.90525-(-5.9052)));
        }
        else if (tickAnim >= 95 && tickAnim < 98) {
            xx = -2.41613 + (((tickAnim - 95) / 3) * (19.08387-(-2.41613)));
            yy = -2.05072 + (((tickAnim - 95) / 3) * (-2.05072-(-2.05072)));
            zz = 5.90525 + (((tickAnim - 95) / 3) * (-5.9052-(5.90525)));
        }
        else if (tickAnim >= 98 && tickAnim < 104) {
            xx = 19.08387 + (((tickAnim - 98) / 6) * (0-(19.08387)));
            yy = -2.05072 + (((tickAnim - 98) / 6) * (0-(-2.05072)));
            zz = -5.9052 + (((tickAnim - 98) / 6) * (0-(-5.9052)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 64 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 64) / 10) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 64) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 10) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 81) {
            xx = -1.5 + (((tickAnim - 74) / 7) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 74) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 7) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 88) {
            xx = -1.5 + (((tickAnim - 81) / 7) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 81) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (3.11-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 53) {
            xx = 3.11 + (((tickAnim - 29) / 24) * (-3-(3.11)));
            yy = 0 + (((tickAnim - 29) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 24) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 82) {
            xx = -3 + (((tickAnim - 53) / 29) * (0-(-3)));
            yy = 0 + (((tickAnim - 53) / 29) * (-9-(0)));
            zz = 0 + (((tickAnim - 53) / 29) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 82) / 9) * (0-(0)));
            yy = -9 + (((tickAnim - 82) / 9) * (-6.04-(-9)));
            zz = 0 + (((tickAnim - 82) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1180))*1-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 91) / 13) * (0-(0)));
            yy = -6.04 + (((tickAnim - 91) / 13) * (0-(-6.04)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1180))*1 + (((tickAnim - 91) / 13) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1180))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 11.5 + (((tickAnim - 18) / 25) * (0-(11.5)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 52) / 4) * (7.25-(0)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 7.25 + (((tickAnim - 56) / 5) * (0-(7.25)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 22) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (11.25-(0)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 11.25 + (((tickAnim - 94) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -18 + (((tickAnim - 18) / 25) * (0-(-18)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 52) / 4) * (-14-(0)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -14 + (((tickAnim - 56) / 5) * (0-(-14)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 22) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -14.25 + (((tickAnim - 94) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 11.5 + (((tickAnim - 18) / 25) * (0-(11.5)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 52) / 4) * (7.25-(0)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 7.25 + (((tickAnim - 56) / 5) * (0-(7.25)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 22) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (8.75-(0)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = 8.75 + (((tickAnim - 94) / 10) * (0-(8.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -18 + (((tickAnim - 18) / 25) * (0-(-18)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 52) / 4) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 52) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 4) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -7.25 + (((tickAnim - 56) / 5) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 22) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 83) / 11) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 83) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 11) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 104) {
            xx = -12.75 + (((tickAnim - 94) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 94) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 104) {
            xx = 0 + (((tickAnim - 87) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1 + (((tickAnim - 87) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));


        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.33724 + (((tickAnim - 0) / 3) * (-25-(-16.33724)));
            yy = -6.98519 + (((tickAnim - 0) / 3) * (0-(-6.98519)));
            zz = 1.31992 + (((tickAnim - 0) / 3) * (0-(1.31992)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-3.94898-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-2.05397-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15.99476 + (((tickAnim - 4) / 3) * (6.05131-(-15.99476)));
            yy = -3.94898 + (((tickAnim - 4) / 3) * (-9.97674-(-3.94898)));
            zz = -2.05397 + (((tickAnim - 4) / 3) * (0.68516-(-2.05397)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 6.05131 + (((tickAnim - 7) / 1) * (15.07673-(6.05131)));
            yy = -9.97674 + (((tickAnim - 7) / 1) * (-9.96156-(-9.97674)));
            zz = 0.68516 + (((tickAnim - 7) / 1) * (-0.88045-(0.68516)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.07673 + (((tickAnim - 8) / 5) * (-7.67448-(15.07673)));
            yy = -9.96156 + (((tickAnim - 8) / 5) * (-13.97038-(-9.96156)));
            zz = -0.88045 + (((tickAnim - 8) / 5) * (2.63984-(-0.88045)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.67448 + (((tickAnim - 13) / 2) * (-16.33724-(-7.67448)));
            yy = -13.97038 + (((tickAnim - 13) / 2) * (-6.98519-(-13.97038)));
            zz = 2.63984 + (((tickAnim - 13) / 2) * (1.31992-(2.63984)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-1-(0)));
            zz = -1 + (((tickAnim - 3) / 1) * (-0.56-(-1)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 4) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 5) / 2) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 5) / 2) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 7) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 7) / 1) * (1-(0.56)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 8) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (0-(1)));
            zz = -0.11 + (((tickAnim - 13) / 2) * (-1-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.08 + (((tickAnim - 0) / 3) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -35 + (((tickAnim - 3) / 1) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -33.72 + (((tickAnim - 4) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.94 + (((tickAnim - 5) / 2) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 34.72 + (((tickAnim - 7) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 56.94 + (((tickAnim - 11) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 55.16 + (((tickAnim - 13) / 1) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 5) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
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
            xx = -52.16 + (((tickAnim - 0) / 2) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -24.89 + (((tickAnim - 2) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 19.72 + (((tickAnim - 4) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.56 + (((tickAnim - 5) / 2) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.22 + (((tickAnim - 7) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 40 + (((tickAnim - 8) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -54.44 + (((tickAnim - 12) / 2) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -50.23 + (((tickAnim - 14) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.21 + (((tickAnim - 0) / 3) * (45-(58.21)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (30.83-(45)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 30.83 + (((tickAnim - 4) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -9.17 + (((tickAnim - 5) / 2) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 50.41 + (((tickAnim - 7) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 60 + (((tickAnim - 8) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 75.83 + (((tickAnim - 12) / 3) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.07673 + (((tickAnim - 0) / 5) * (-7.67448-(15.07673)));
            yy = 9.96156 + (((tickAnim - 0) / 5) * (13.97038-(9.96156)));
            zz = 0.88045 + (((tickAnim - 0) / 5) * (-2.63984-(0.88045)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.67448 + (((tickAnim - 5) / 3) * (-16.33724-(-7.67448)));
            yy = 13.97038 + (((tickAnim - 5) / 3) * (6.98519-(13.97038)));
            zz = -2.63984 + (((tickAnim - 5) / 3) * (-1.31992-(-2.63984)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.33724 + (((tickAnim - 8) / 2) * (-25-(-16.33724)));
            yy = 6.98519 + (((tickAnim - 8) / 2) * (0-(6.98519)));
            zz = -1.31992 + (((tickAnim - 8) / 2) * (0-(-1.31992)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -25 + (((tickAnim - 10) / 2) * (-15.99476-(-25)));
            yy = 0 + (((tickAnim - 10) / 2) * (3.94898-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (2.05397-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -15.99476 + (((tickAnim - 12) / 2) * (6.05131-(-15.99476)));
            yy = 3.94898 + (((tickAnim - 12) / 2) * (9.97674-(3.94898)));
            zz = 2.05397 + (((tickAnim - 12) / 2) * (-0.68516-(2.05397)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.05131 + (((tickAnim - 14) / 1) * (15.07673-(6.05131)));
            yy = 9.97674 + (((tickAnim - 14) / 1) * (9.96156-(9.97674)));
            zz = -0.68516 + (((tickAnim - 14) / 1) * (0.88045-(-0.68516)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 5) * (-0.11-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 5) * (0-(1)));
            zz = -0.11 + (((tickAnim - 5) / 5) * (-1-(-0.11)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-1-(0)));
            zz = -1 + (((tickAnim - 10) / 2) * (-0.56-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 12) / 1) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75-(-1)));
            zz = -0.56 + (((tickAnim - 12) / 1) * (-0.33-(-0.56)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75 + (((tickAnim - 13) / 1) * (0.12-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*0.75)));
            zz = -0.33 + (((tickAnim - 13) / 1) * (0.56-(-0.33)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.12 + (((tickAnim - 14) / 1) * (0-(0.12)));
            zz = 0.56 + (((tickAnim - 14) / 1) * (1-(0.56)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (56.94-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.94 + (((tickAnim - 3) / 2) * (55.16-(56.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 55.16 + (((tickAnim - 5) / 3) * (10.08-(55.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.08 + (((tickAnim - 8) / 2) * (-35-(10.08)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -35 + (((tickAnim - 10) / 2) * (-33.72-(-35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -33.72 + (((tickAnim - 12) / 1) * (11.94-(-33.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.94 + (((tickAnim - 13) / 1) * (34.72-(11.94)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 34.72 + (((tickAnim - 14) / 1) * (22.5-(34.72)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25 + (((tickAnim - 13) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.25)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-54.44-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -54.44 + (((tickAnim - 4) / 3) * (-50.23-(-54.44)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -50.23 + (((tickAnim - 7) / 1) * (-52.16-(-50.23)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -52.16 + (((tickAnim - 8) / 1) * (-24.89-(-52.16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -24.89 + (((tickAnim - 9) / 1) * (7.5-(-24.89)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (19.72-(7.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 19.72 + (((tickAnim - 12) / 1) * (0.56-(19.72)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.56 + (((tickAnim - 13) / 1) * (-2.22-(0.56)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -2.22 + (((tickAnim - 14) / 1) * (40-(-2.22)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 0) / 4) * (75.83-(60)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 75.83 + (((tickAnim - 4) / 4) * (58.21-(75.83)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.21 + (((tickAnim - 8) / 2) * (45-(58.21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 45 + (((tickAnim - 10) / 2) * (30.83-(45)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.83 + (((tickAnim - 12) / 1) * (-9.17-(30.83)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -9.17 + (((tickAnim - 13) / 1) * (50.41-(-9.17)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.41 + (((tickAnim - 14) / 1) * (60-(50.41)));
            yy = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*-7), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-12), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-9), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-6), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-70))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-8), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-6), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), leftArm.rotateAngleY + (float) Math.toRadians(5), leftArm.rotateAngleZ + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), rightArm.rotateAngleY + (float) Math.toRadians(5), rightArm.rotateAngleZ + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+20))*10), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*6), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+200))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*-11), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-1));


        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*5), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-200))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (-2.5-(-10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-15-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
    }



    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProceratosaurus entity = (EntityPrehistoricFloraProceratosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*1), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.15693-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.43893-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = -15.57952 + (((tickAnim - 4) / 11) * (15.04292-(-15.57952)));
            yy = -3.15693 + (((tickAnim - 4) / 11) * (-7.4713-(-3.15693)));
            zz = -2.43893 + (((tickAnim - 4) / 11) * (-0.6574-(-2.43893)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 15.04292 + (((tickAnim - 15) / 8) * (-8.7679-(15.04292)));
            yy = -7.4713 + (((tickAnim - 15) / 8) * (-9.1645-(-7.4713)));
            zz = -0.6574 + (((tickAnim - 15) / 8) * (1.22035-(-0.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -8.7679 + (((tickAnim - 23) / 7) * (-27.5-(-8.7679)));
            yy = -9.1645 + (((tickAnim - 23) / 7) * (0-(-9.1645)));
            zz = 1.22035 + (((tickAnim - 23) / 7) * (0-(1.22035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 4) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 4) / 4) * (0.38-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.38 + (((tickAnim - 8) / 7) * (0-(0.38)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.42-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 23) / 7) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.5 + (((tickAnim - 0) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.03 + (((tickAnim - 4) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.56 + (((tickAnim - 8) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20 + (((tickAnim - 15) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 40.7 + (((tickAnim - 19) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 46.39 + (((tickAnim - 23) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.25 + (((tickAnim - 0) / 4) * (4.03-(20.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 4.03 + (((tickAnim - 4) / 11) * (0-(4.03)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-13.61-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -13.61 + (((tickAnim - 19) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -47.22 + (((tickAnim - 23) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -25.71 + (((tickAnim - 28) / 2) * (20.25-(-25.71)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.25 + (((tickAnim - 0) / 4) * (1.75-(11.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 4) / 4) * (-14.83043-(1.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (4.97976-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.44995-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.83043 + (((tickAnim - 8) / 7) * (4.7495-(-14.83043)));
            yy = 4.97976 + (((tickAnim - 8) / 7) * (6.63927-(4.97976)));
            zz = 0.44995 + (((tickAnim - 8) / 7) * (-2.43531-(0.44995)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 4.7495 + (((tickAnim - 15) / 4) * (57.22-(4.7495)));
            yy = 6.63927 + (((tickAnim - 15) / 4) * (0-(6.63927)));
            zz = -2.43531 + (((tickAnim - 15) / 4) * (0-(-2.43531)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 57.22 + (((tickAnim - 19) / 4) * (81.94-(57.22)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 81.94 + (((tickAnim - 23) / 4) * (55.97-(81.94)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 55.97 + (((tickAnim - 27) / 3) * (11.25-(55.97)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 4) / 3) * (0.29-(-0.3)));
            zz = 0 + (((tickAnim - 4) / 3) * (-0.03-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.29 + (((tickAnim - 7) / 1) * (0.48-(0.29)));
            zz = -0.03 + (((tickAnim - 7) / 1) * (-0.04-(-0.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.48 + (((tickAnim - 8) / 0) * (0.375-(0.48)));
            zz = -0.04 + (((tickAnim - 8) / 0) * (-0.05-(-0.04)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 22) * (0-(0.375)));
            zz = -0.05 + (((tickAnim - 8) / 22) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.04292 + (((tickAnim - 0) / 8) * (-8.7679-(15.04292)));
            yy = 7.4713 + (((tickAnim - 0) / 8) * (9.1645-(7.4713)));
            zz = 0.6574 + (((tickAnim - 0) / 8) * (-1.22035-(0.6574)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.7679 + (((tickAnim - 8) / 7) * (-27.5-(-8.7679)));
            yy = 9.1645 + (((tickAnim - 8) / 7) * (0-(9.1645)));
            zz = -1.22035 + (((tickAnim - 8) / 7) * (0-(-1.22035)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 15) / 4) * (-15.57952-(-27.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (3.15693-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (2.43893-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -15.57952 + (((tickAnim - 19) / 11) * (15.04292-(-15.57952)));
            yy = 3.15693 + (((tickAnim - 19) / 11) * (7.4713-(3.15693)));
            zz = 2.43893 + (((tickAnim - 19) / 11) * (0.6574-(2.43893)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.42-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.42 + (((tickAnim - 8) / 7) * (-0.85-(1.42)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -0.85 + (((tickAnim - 15) / 4) * (0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55-(-0.85)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55 + (((tickAnim - 19) / 4) * (0.38-(0.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*0.55)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.38 + (((tickAnim - 23) / 7) * (0-(0.38)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (40.7-(20)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 40.7 + (((tickAnim - 4) / 4) * (46.39-(40.7)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 46.39 + (((tickAnim - 8) / 7) * (-7.5-(46.39)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 15) / 4) * (9.03-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.03 + (((tickAnim - 19) / 4) * (15.56-(9.03)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15.56 + (((tickAnim - 23) / 7) * (20-(15.56)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5))*-0.3)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (-13.61-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -13.61 + (((tickAnim - 4) / 4) * (-47.22-(-13.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -47.22 + (((tickAnim - 8) / 5) * (-25.71-(-47.22)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.71 + (((tickAnim - 13) / 2) * (22.5-(-25.71)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 22.5 + (((tickAnim - 15) / 4) * (4.03-(22.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 4.03 + (((tickAnim - 19) / 11) * (10-(4.03)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.7495 + (((tickAnim - 0) / 4) * (57.22-(4.7495)));
            yy = -6.63927 + (((tickAnim - 0) / 4) * (0-(-6.63927)));
            zz = 2.43531 + (((tickAnim - 0) / 4) * (0-(2.43531)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 57.22 + (((tickAnim - 4) / 4) * (84.44-(57.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 84.44 + (((tickAnim - 8) / 4) * (55.97-(84.44)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 55.97 + (((tickAnim - 12) / 3) * (11.25-(55.97)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 11.25 + (((tickAnim - 15) / 4) * (3.5-(11.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 3.5 + (((tickAnim - 19) / 4) * (-17.1-(3.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -17.1 + (((tickAnim - 23) / 7) * (4.7495-(-17.1)));
            yy = 0 + (((tickAnim - 23) / 7) * (-6.63927-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (2.43531-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 19) / 2) * (0.165-(-0.3)));
            zz = 0.175 + (((tickAnim - 19) / 2) * (0.09-(0.175)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.165 + (((tickAnim - 21) / 2) * (0.6-(0.165)));
            zz = 0.09 + (((tickAnim - 21) / 2) * (0.04-(0.09)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            yy = 0.6 + (((tickAnim - 23) / 0) * (0.425-(0.6)));
            zz = 0.04 + (((tickAnim - 23) / 0) * (0-(0.04)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 23) / 4) * (0.6-(0.425)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 27) / 3) * (0-(0.6)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-4), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-50))*-1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-70))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-70))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-90))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-90))*-4), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5-90))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), leftArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*-3+10), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), leftArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*-1), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), rightArm.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3-10), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*3), rightArm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-100))*1), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+200))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*-5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-1), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 7) / 8) * (12.5-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 15) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));

        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 2.5 + (((tickAnim - 6) / 8) * (-12.5-(2.5)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -12.5 + (((tickAnim - 14) / 7) * (2.5-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 21) / 9) * (0-(2.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crest, crest.rotateAngleX + (float) Math.toRadians(xx), crest.rotateAngleY + (float) Math.toRadians(yy), crest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProceratosaurus e = (EntityPrehistoricFloraProceratosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, (float) Math.toRadians(10),0,0);
        animator.move(this.neck2, (float) Math.toRadians(10),0,0);
        animator.move(this.neck3, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
