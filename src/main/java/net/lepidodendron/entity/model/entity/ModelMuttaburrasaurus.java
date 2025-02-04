package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMuttaburrasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMuttaburrasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer opposablePinkie;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer opposablePinkie2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r16;
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
    private final AdvancedModelRenderer nasalLeft;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer nasalRight;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;

    private ModelAnimator animator;

    public ModelMuttaburrasaurus() {
        this.textureWidth = 150;
        this.textureHeight = 150;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.scaleChildren = true;
        this.hips.setRotationPoint(0.0F, -7.225F, 2.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, -5.2F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2967F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -5.0F, -0.9F, 0.0F, 10, 16, 18, 0.004F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 83, -1.5F, -3.9F, -1.0F, 3, 3, 17, 0.004F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.5F, -1.2F, 0.6F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 9.3086F, -1.506F);
        this.leftLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 83, -4.0F, -11.8476F, -1.0348F, 6, 18, 9, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 15.4086F, -2.206F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0297F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 113, 79, -2.9F, -0.2283F, -0.2481F, 4, 17, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-1.0F, 16.3717F, 3.8519F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 126, 115, -1.5F, -0.0808F, -2.3989F, 3, 8, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 6.4192F, -0.8989F);
        this.leftLeg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0274F, -0.1041F, 0.5141F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 98, 29, -0.6F, -1.5F, 0.4F, 1, 3, 1, -0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 7.3192F, -0.0989F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2967F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 78, 23, -2.6F, -1.0319F, -3.2504F, 5, 2, 4, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 50, 120, -2.6F, -1.3F, -3.2F, 5, 2, 4, -0.003F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.5F, -1.2F, 0.6F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 9.3086F, -1.506F);
        this.rightLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0175F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 83, -2.0F, -11.8476F, -1.0348F, 6, 18, 9, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 15.4086F, -2.206F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0297F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 113, 79, -1.1F, -0.2283F, -0.2481F, 4, 17, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(1.0F, 16.3717F, 3.8519F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 126, 115, -1.5F, -0.0808F, -2.3989F, 3, 8, 3, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 6.4192F, -0.8989F);
        this.rightLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0274F, 0.1041F, -0.5141F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 98, 29, -0.4F, -1.5F, 0.4F, 1, 3, 1, -0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 7.3192F, -0.0989F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2967F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 78, 23, -2.4F, -1.0319F, -3.2504F, 5, 2, 4, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.2681F, -3.0504F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 50, 120, -2.4F, -1.3F, -3.2F, 5, 2, 4, -0.003F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.0F, -5.3F);
        this.hips.addChild(body);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.0F, -0.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 0, -2.0F, -0.0122F, -13.0512F, 4, 3, 14, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, -6.0F, 2.9878F, -13.0512F, 12, 18, 14, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.8F, -13.7F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 11.6354F, -11.9383F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 35, -5.5F, -9.1733F, -0.0195F, 11, 9, 14, -0.006F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.1F, -0.1F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4712F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 0, -5.5F, 2.8069F, -11.5617F, 11, 11, 11, 0.006F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 104, -2.0F, -0.1931F, -11.5617F, 4, 3, 12, -0.004F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.3F, 11.3F, -7.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.557F, 0.2272F, -0.2535F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7F, 8.4F, 2.2F);
        this.leftArm.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4518F, 0.0185F, -0.0103F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 68, -1.7F, -9.6775F, -0.161F, 2, 10, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 7.6F, 3.3F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.2404F, 0.2786F, -0.038F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 82, 127, -1.262F, -0.892F, -0.7458F, 2, 10, 2, -0.01F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.638F, 9.008F, -0.4458F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.2562F, 0.2955F, 0.2874F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 97, 23, -1.1578F, 0.0F, -0.3394F, 1, 3, 2, 0.0F, false));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(-0.6578F, 3.0F, -0.2394F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.0F, 0.0F, 1.5708F);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 94, 79, 0.0F, -0.5F, -0.1F, 2, 1, 2, -0.003F, false));

        this.opposablePinkie = new AdvancedModelRenderer(this);
        this.opposablePinkie.setRotationPoint(-0.6284F, 0.3F, 1.5096F);
        this.leftArm3.addChild(opposablePinkie);
        this.setRotateAngle(opposablePinkie, 0.4363F, 0.0F, 0.0F);
        this.opposablePinkie.cubeList.add(new ModelBox(opposablePinkie, 53, 135, -0.5794F, -0.3392F, -0.6694F, 1, 2, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.3F, 11.3F, -7.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.557F, -0.2272F, 0.2535F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.7F, 8.4F, 2.2F);
        this.rightArm.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4518F, -0.0185F, 0.0103F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 68, -0.3F, -9.6775F, -0.161F, 2, 10, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 7.6F, 3.3F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2404F, -0.2786F, 0.038F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 82, 127, -0.738F, -0.892F, -0.7458F, 2, 10, 2, -0.01F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.638F, 9.008F, -0.4458F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.2562F, -0.2955F, -0.2874F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 97, 23, 0.1578F, 0.0F, -0.3394F, 1, 3, 2, 0.0F, true));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.6578F, 3.0F, -0.2394F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.0F, 0.0F, -1.5708F);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 94, 79, -2.0F, -0.5F, -0.1F, 2, 1, 2, -0.003F, true));

        this.opposablePinkie2 = new AdvancedModelRenderer(this);
        this.opposablePinkie2.setRotationPoint(0.6284F, 0.3F, 1.5096F);
        this.rightArm3.addChild(opposablePinkie2);
        this.setRotateAngle(opposablePinkie2, 0.4363F, 0.0F, 0.0F);
        this.opposablePinkie2.cubeList.add(new ModelBox(opposablePinkie2, 53, 135, -0.4206F, -0.3392F, -0.6694F, 1, 2, 1, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 3.2F, -8.2F);
        this.chest.addChild(neck3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.6F, -3.6F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 113, -3.5F, -2.5637F, -0.9935F, 7, 9, 6, 0.004F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 23, -2.0F, -4.5637F, -0.9935F, 4, 2, 6, 0.004F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.9F, -7.9F);
        this.neck3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2269F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 132, 79, 0.0F, -0.4287F, -0.0553F, 0, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 120, -2.0F, -2.9F, -6.6F, 4, 8, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6F, -9.3F);
        this.neck3.addChild(neck2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -6.2F, -6.1F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 127, -0.5F, -2.1151F, 0.0903F, 0, 2, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -6.6F, -6.8F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4887F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 99, 111, -2.0F, -0.0906F, -0.1038F, 3, 6, 10, 0.002F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.5F, -6.9F);
        this.neck2.addChild(neck);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.6F, -3.1F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0349F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 139, 3, -0.5F, -3.7F, 0.2F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 113, 102, -2.0F, -2.7F, 0.2F, 3, 5, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.192F, -0.5308F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.096F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 76, 137, 0.0F, -1.7994F, -0.4651F, 0, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -2.6F);
        this.neck.addChild(head);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.4F, -2.3F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3142F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 32, -1.0F, -0.9591F, -1.0496F, 3, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.5F, -6.4F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 131, 54, -1.0F, -0.5538F, -0.6398F, 2, 1, 4, -0.2F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 2.4F, -6.4F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2094F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 127, -1.0F, -0.9538F, -1.5398F, 2, 1, 6, 0.005F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.0F, -4.1F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.733F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 78, 30, -1.0F, 0.0339F, -4.0241F, 2, 1, 3, -0.005F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 89, 30, -1.0F, 0.0339F, -2.0241F, 2, 2, 2, -0.004F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 2.7126F, -8.7029F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 2.3195F, 0.2213F, 0.141F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 25, 136, 0.0658F, -0.0337F, -1.1452F, 1, 2, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 1.9126F, -7.2029F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 2.0577F, 0.2213F, 0.141F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 136, 0.5048F, -1.5668F, -0.7717F, 1, 2, 1, 0.005F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.9126F, -7.2029F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 2.0577F, -0.2213F, -0.141F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 136, -1.5048F, -1.5668F, -0.7717F, 1, 2, 1, 0.005F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 2.7126F, -8.7029F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 2.3195F, -0.2213F, -0.141F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 136, -1.0658F, -0.0337F, -1.1452F, 1, 2, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.9126F, -8.5063F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.5882F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 132, 86, -1.5F, -0.5F, -0.3F, 3, 1, 1, 0.005F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.0F, -9.0F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.5882F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 32, -1.5F, -0.0223F, -1.7211F, 3, 1, 1, -0.005F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 132, 97, -1.0F, -0.0223F, -1.0211F, 2, 1, 1, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.1F, -8.6F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.1868F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 35, 136, -0.5F, -0.0561F, -1.0054F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.2F, -7.1F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.7156F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 132, 93, -0.5F, -0.059F, -1.9903F, 1, 1, 2, 0.005F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.3F, -6.1F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1222F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 136, -0.5F, 0.9183F, -1.995F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 91, 135, -0.5F, -0.0817F, -0.995F, 1, 2, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.9F, 3.2166F, -4.7039F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2531F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 104, -0.001F, -1.3F, -2.0F, 0, 1, 5, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 131, 72, 0.01F, -1.3F, -2.0F, 0, 1, 5, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 131, 72, 1.79F, -1.3F, -2.0F, 0, 1, 5, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 104, 1.801F, -1.3F, -2.0F, 0, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, -5.2F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.4363F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 132, 89, -1.0F, 0.0268F, -0.9375F, 2, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.5F, 0.5F, -3.0F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2694F, 0.2359F, 0.0644F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 119, 128, -1.0F, -0.3168F, -2.1379F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.5F, 0.5F, -3.0F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2694F, -0.2359F, -0.0644F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 119, 128, 0.0F, -0.3168F, -2.1379F, 1, 1, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -1.4F, -3.2F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4712F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 122, 54, -1.0F, -0.0183F, -1.0076F, 3, 2, 1, 0.008F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -2.0F, -1.3F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2967F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 13, 129, -1.0F, 0.0F, -2.0F, 3, 3, 3, 0.003F, false));

        this.nasalLeft = new AdvancedModelRenderer(this);
        this.nasalLeft.scaleChildren = true;
        this.nasalLeft.setRotationPoint(0.2365F, 0.6145F, -6.6353F);
        this.head.addChild(nasalLeft);
        this.setRotateAngle(nasalLeft, -0.5715F, -0.5007F, 0.8686F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.4927F, 1.2302F, -1.1464F);
        this.nasalLeft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.8214F, -0.1284F, 0.1186F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 113, 54, -0.8268F, -0.7F, -0.6F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.4927F, 1.2302F, -1.1464F);
        this.nasalLeft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.6192F, -0.5697F, 0.7008F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 104, 54, -0.4268F, -0.6F, -0.6F, 1, 1, 3, -0.01F, false));

        this.nasalRight = new AdvancedModelRenderer(this);
        this.nasalRight.scaleChildren = true;
        this.nasalRight.setRotationPoint(-0.2365F, 0.6145F, -6.6353F);
        this.head.addChild(nasalRight);
        this.setRotateAngle(nasalRight, -0.5715F, 0.5007F, -0.8686F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.4927F, 1.2302F, -1.1464F);
        this.nasalRight.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.8214F, 0.1284F, -0.1186F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 113, 54, -0.1732F, -0.7F, -0.6F, 1, 1, 3, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.4927F, 1.2302F, -1.1464F);
        this.nasalRight.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.6192F, 0.5697F, -0.7008F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 104, 54, -0.5732F, -0.6F, -0.6F, 1, 1, 3, -0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6F, 0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.4407F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.4F, -1.0953F, -7.1537F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2269F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 131, 66, -1.9F, -2.5955F, 4.2474F, 3, 2, 3, -0.005F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 131, 60, -1.9F, -0.5955F, 4.2474F, 3, 2, 3, 0.005F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -1.0953F, -7.1537F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1396F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 106, 128, -0.9F, -1.0955F, -0.4526F, 0, 1, 6, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 129, -0.88F, -1.0955F, -0.4526F, 0, 1, 6, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 129, 0.88F, -1.0955F, -0.4526F, 0, 1, 6, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 106, 128, 0.9F, -1.0955F, -0.4526F, 0, 1, 6, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 91, 128, -1.0F, -0.0955F, -0.0526F, 2, 1, 5, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -1.0953F, -7.1537F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2793F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 27, 113, -0.8F, -0.3955F, -0.6526F, 0, 1, 4, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 27, 113, 0.8F, -0.3955F, -0.6526F, 0, 1, 4, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.5953F, -8.4537F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -1.6057F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 135, 37, -1.0F, -0.01F, -1.102F, 2, 1, 1, 0.0005F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 128, 134, -1.0F, -0.41F, -1.102F, 2, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.1953F, -7.4537F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.2967F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 103, 79, -1.0F, -1.0439F, -1.5785F, 2, 1, 2, 0.005F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 1.1047F, -3.7537F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.3491F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 126, 127, -1.0F, -1.0F, -4.5F, 2, 1, 5, -0.005F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.scaleChildren = true;
        this.eye.setRotationPoint(0.0F, -0.0928F, -3.5552F);
        this.head.addChild(eye);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.2F, 0.0F, 0.0F);
        this.eye.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4189F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 40, 136, -1.33F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.2F, 0.0F, 0.0F);
        this.eye.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4189F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 40, 136, 0.33F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 9.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 53, 59, -3.0F, -1.0F, 0.0F, 6, 9, 14, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.tail.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0698F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 104, 18, -1.0F, 0.1F, 0.0F, 2, 4, 14, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 13.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0698F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 68, -2.0F, -1.0F, -1.0F, 4, 7, 16, 0.004F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -4.0F, -0.9F);
        this.tail2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0873F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 94, 59, -1.0F, 0.0F, -0.1F, 2, 3, 16, 0.004F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 15.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 92, -1.5F, -0.5005F, -1.0218F, 3, 5, 15, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -2.2005F, -0.0218F);
        this.tail3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0873F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 37, -0.5F, 0.1F, 0.0F, 1, 2, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1005F, 13.9782F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0349F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 126, 102, -1.0F, -0.4F, 0.0F, 2, 3, 9, 0.004F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.909F, 8.4229F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 70, 111, -0.5F, -1.0F, 0.5F, 1, 2, 13, 0.004F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.offsetZ = 0.7F;
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.10F;
        this.hips.offsetX = 0.05F;
        this.hips.rotateAngleY = (float)Math.toRadians(115);
        this.hips.rotateAngleX = (float)Math.toRadians(-2);
        this.hips.rotateAngleZ = (float)Math.toRadians(2);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraMuttaburrasaurus entityMuttaburrasaurus = (EntityPrehistoricFloraMuttaburrasaurus) e;

        this.faceTarget(f3, f4, 10, neck3);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck3, this.neck2, this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        entityMuttaburrasaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityMuttaburrasaurus.getAnimation() == entityMuttaburrasaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityMuttaburrasaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityMuttaburrasaurus.getIsMoving()) {
                    if (entityMuttaburrasaurus.getAnimation() != entityMuttaburrasaurus.EAT_ANIMATION
                        && (!entityMuttaburrasaurus.isAnimationDirectionLocked(entityMuttaburrasaurus.getAnimation()))) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm2, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm2, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);


                    return;
                }

                if (entityMuttaburrasaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraMuttaburrasaurus ee = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE1) { //The noise anim
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE2) { //The noise anim
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 7.25 + (((tickAnim - 10) / 7) * (0-(7.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (0.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0.725 + (((tickAnim - 10) / 7) * (0-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 11 + (((tickAnim - 10) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.775-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 10) / 7) * (0-(-0.125)));
            zz = 0.775 + (((tickAnim - 10) / 7) * (0-(0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 18 + (((tickAnim - 10) / 7) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.29337-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.39008-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.5118-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25.29337 + (((tickAnim - 5) / 5) * (24.25-(25.29337)));
            yy = -5.39008 + (((tickAnim - 5) / 5) * (0-(-5.39008)));
            zz = -3.5118 + (((tickAnim - 5) / 5) * (0-(-3.5118)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 24.25 + (((tickAnim - 10) / 2) * (25.69-(24.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 25.69 + (((tickAnim - 12) / 5) * (0-(25.69)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 5.25 + (((tickAnim - 10) / 7) * (0-(5.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.75 + (((tickAnim - 5) / 5) * (-13.5-(13.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -13.5 + (((tickAnim - 10) / 2) * (5.63-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 5.63 + (((tickAnim - 12) / 5) * (0-(5.63)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 5) * (0.475-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            zz = 0.475 + (((tickAnim - 5) / 12) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);



        this.nasalLeft.setScale((float)1,(float)0,(float)0);


        this.nasalRight.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (13.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 13.25 + (((tickAnim - 10) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -6.25 + (((tickAnim - 5) / 8) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -2.75 + (((tickAnim - 5) / 8) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-97.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -97.25 + (((tickAnim - 5) / 3) * (-76.38-(-97.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -76.38 + (((tickAnim - 8) / 5) * (0-(-76.38)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.79846-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-27.39017-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-11.83079-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 34.79846 + (((tickAnim - 5) / 1) * (20.70531-(34.79846)));
            yy = -27.39017 + (((tickAnim - 5) / 1) * (-31.45869-(-27.39017)));
            zz = -11.83079 + (((tickAnim - 5) / 1) * (-8.98983-(-11.83079)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20.70531 + (((tickAnim - 6) / 2) * (78.3269-(20.70531)));
            yy = -31.45869 + (((tickAnim - 6) / 2) * (-9.00589-(-31.45869)));
            zz = -8.98983 + (((tickAnim - 6) / 2) * (32.18413-(-8.98983)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 78.3269 + (((tickAnim - 8) / 5) * (0-(78.3269)));
            yy = -9.00589 + (((tickAnim - 8) / 5) * (0-(-9.00589)));
            zz = 32.18413 + (((tickAnim - 8) / 5) * (0-(32.18413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.35 + (((tickAnim - 5) / 3) * (0-(-0.35)));
            yy = 0.7 + (((tickAnim - 5) / 3) * (0-(0.7)));
            zz = 0.425 + (((tickAnim - 5) / 3) * (0-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -10.25 + (((tickAnim - 5) / 3) * (47.12-(-10.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 47.12 + (((tickAnim - 8) / 5) * (0-(47.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-97.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -97.25 + (((tickAnim - 5) / 3) * (-68.13-(-97.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -68.13 + (((tickAnim - 8) / 5) * (0-(-68.13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (34.79846-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (27.3902-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.8308-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 34.79846 + (((tickAnim - 5) / 1) * (13.82626-(34.79846)));
            yy = 27.3902 + (((tickAnim - 5) / 1) * (35.53493-(27.3902)));
            zz = 11.8308 + (((tickAnim - 5) / 1) * (9.13268-(11.8308)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 13.82626 + (((tickAnim - 6) / 2) * (120.7587+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50-(13.82626)));
            yy = 35.53493 + (((tickAnim - 6) / 2) * (17.41666-(35.53493)));
            zz = 9.13268 + (((tickAnim - 6) / 2) * (-31.4376-(9.13268)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 120.7587+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50 + (((tickAnim - 8) / 5) * (0-(120.7587+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-50)));
            yy = 17.41666 + (((tickAnim - 8) / 5) * (0-(17.41666)));
            zz = -31.4376 + (((tickAnim - 8) / 5) * (0-(-31.4376)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.35 + (((tickAnim - 5) / 3) * (0-(-0.35)));
            yy = 0.7 + (((tickAnim - 5) / 3) * (0-(0.7)));
            zz = 0.425 + (((tickAnim - 5) / 3) * (0-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (11-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 11 + (((tickAnim - 5) / 3) * (-53.75-(11)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -53.75 + (((tickAnim - 8) / 5) * (0-(-53.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 5) / 3) * (-4.79-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4.79 + (((tickAnim - 8) / 5) * (0-(-4.79)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (-18.14-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -18.14 + (((tickAnim - 8) / 5) * (0-(-18.14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 5) / 3) * (6.57-(10.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.57 + (((tickAnim - 8) / 5) * (0-(6.57)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (25.86-(20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 25.86 + (((tickAnim - 8) / 5) * (0-(25.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 3) * (0.06-(0.1)));
            zz = 0.525 + (((tickAnim - 5) / 3) * (1.015-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 8) / 5) * (0-(0.06)));
            zz = 1.015 + (((tickAnim - 8) / 5) * (0-(1.015)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10.75 + (((tickAnim - 15) / 20) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-6.85-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -6.85 + (((tickAnim - 15) / 20) * (-6.85-(-6.85)));
            zz = 5.825 + (((tickAnim - 15) / 20) * (5.825-(5.825)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -6.85 + (((tickAnim - 35) / 15) * (0-(-6.85)));
            zz = 5.825 + (((tickAnim - 35) / 15) * (0-(5.825)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11 + (((tickAnim - 15) / 20) * (-11-(-11)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 15) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 15) / 20) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11 + (((tickAnim - 15) / 20) * (-11-(-11)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 15) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 35) / 15) * (0-(23)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -24.75 + (((tickAnim - 15) / 20) * (-24.75-(-24.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.75 + (((tickAnim - 35) / 15) * (0-(-24.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 20) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.1 + (((tickAnim - 35) / 15) * (0-(1.1)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.65 + (((tickAnim - 15) / 20) * (0.65-(0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.65 + (((tickAnim - 35) / 15) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0.65 + (((tickAnim - 15) / 20) * (0.65-(0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0.65 + (((tickAnim - 35) / 15) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 15) / 20) * (3-(3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 3 + (((tickAnim - 35) / 4) * (-8.5-(3)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 39) / 11) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 10.75 + (((tickAnim - 35) / 4) * (8.27-(10.75)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 8.27 + (((tickAnim - 39) / 4) * (-5.22-(8.27)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5.22 + (((tickAnim - 43) / 7) * (0-(-5.22)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (3.63-(0)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 3.63 + (((tickAnim - 39) / 4) * (-10.75-(3.63)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 43) / 7) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 21 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 21) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 5) * (0.01-(1)));
            zz = 1 + (((tickAnim - 21) / 5) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 26) / 4) * (1-(1)));
            yy = 0.01 + (((tickAnim - 26) / 4) * (1-(0.01)));
            zz = 1 + (((tickAnim - 26) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = -23.5 + (((tickAnim - 0) / 15) * (24.75-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 24.75 + (((tickAnim - 15) / 13) * (-23.5-(24.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = -23.5 + (((tickAnim - 28) / 13) * (24.75-(-23.5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 41) / 9) * (-23.5-(24.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 0) / 15) * (20.75-(-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 20.75 + (((tickAnim - 15) / 13) * (-5-(20.75)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = -5 + (((tickAnim - 28) / 13) * (20.75-(-5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 41) / 9) * (-5-(20.75)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 0) / 15) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 21.5 + (((tickAnim - 15) / 4) * (-40-(21.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -40 + (((tickAnim - 19) / 5) * (-37.1-(-40)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -37.1 + (((tickAnim - 24) / 4) * (21.5-(-37.1)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 21.5 + (((tickAnim - 28) / 13) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 21.5 + (((tickAnim - 41) / 4) * (-50.75-(21.5)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -50.75 + (((tickAnim - 45) / 3) * (-50.75-(-50.75)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -50.75 + (((tickAnim - 48) / 2) * (21.5-(-50.75)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 31.25 + (((tickAnim - 0) / 6) * (-21-(31.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -21 + (((tickAnim - 6) / 9) * (66.25-(-21)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 66.25 + (((tickAnim - 15) / 4) * (83.58-(66.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 83.58 + (((tickAnim - 19) / 5) * (91-(83.58)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 91 + (((tickAnim - 24) / 4) * (31.25-(91)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 31.25 + (((tickAnim - 28) / 4) * (-15.5-(31.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -15.5 + (((tickAnim - 32) / 9) * (66.25-(-15.5)));
            yy = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 66.25 + (((tickAnim - 41) / 7) * (82.8-(66.25)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 82.8 + (((tickAnim - 48) / 2) * (31.25-(82.8)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -1.05 + (((tickAnim - 6) / 9) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 6) / 9) * (-1.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (1.9-(0)));
            zz = -1.65 + (((tickAnim - 15) / 4) * (-2.075-(-1.65)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 1.9 + (((tickAnim - 19) / 5) * (0.76-(1.9)));
            zz = -2.075 + (((tickAnim - 19) / 5) * (-1.98-(-2.075)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.76 + (((tickAnim - 24) / 4) * (0-(0.76)));
            zz = -1.98 + (((tickAnim - 24) / 4) * (0-(-1.98)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (0-(0)));
            yy = -1.05 + (((tickAnim - 32) / 9) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 32) / 9) * (-1.65-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = -1.65 + (((tickAnim - 41) / 7) * (-1.7-(-1.65)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = -1.7 + (((tickAnim - 48) / 2) * (0-(-1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -23.5 + (((tickAnim - 0) / 6) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (-45.98919-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (-0.7785-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-0.1724-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -45.98919 + (((tickAnim - 11) / 4) * (16.25-(-45.98919)));
            yy = -0.7785 + (((tickAnim - 11) / 4) * (0-(-0.7785)));
            zz = -0.1724 + (((tickAnim - 11) / 4) * (0-(-0.1724)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 16.25 + (((tickAnim - 15) / 4) * (0-(16.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -23.5 + (((tickAnim - 28) / 4) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (-45.98919-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (-0.7785-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-0.1724-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -45.98919 + (((tickAnim - 37) / 4) * (16.25-(-45.98919)));
            yy = -0.7785 + (((tickAnim - 37) / 4) * (0-(-0.7785)));
            zz = -0.1724 + (((tickAnim - 37) / 4) * (0-(-0.1724)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 16.25 + (((tickAnim - 41) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (-23.5-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0.465-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.465 + (((tickAnim - 11) / 4) * (-0.2-(0.465)));
            zz = -0.325 + (((tickAnim - 11) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 4) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0.465-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            yy = 0.465 + (((tickAnim - 37) / 4) * (-0.2-(0.465)));
            zz = -0.325 + (((tickAnim - 37) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 41 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 41) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 41) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 41) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 15) * (3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(2)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 15) / 22) * (0-(0)));
            yy = 3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 15) / 22) * (5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(3.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            zz = 0 + (((tickAnim - 15) / 22) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 37) / 13) * (2-(5.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.09735 + (((tickAnim - 0) / 15) * (0.32476-(0.09735)));
            yy = -3.68329 + (((tickAnim - 0) / 15) * (0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-3.68329)));
            zz = -1.50167 + (((tickAnim - 0) / 15) * (-3.20859-(-1.50167)));
        }
        else if (tickAnim >= 15 && tickAnim < 37) {
            xx = 0.32476 + (((tickAnim - 15) / 22) * (0.32476-(0.32476)));
            yy = 0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 15) / 22) * (-2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(0.0173+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            zz = -3.20859 + (((tickAnim - 15) / 22) * (-3.20859-(-3.20859)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0.32476 + (((tickAnim - 37) / 13) * (0.09735-(0.32476)));
            yy = -2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 37) / 13) * (-3.68329-(-2.6327+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            zz = -3.20859 + (((tickAnim - 37) / 13) * (-1.50167-(-3.20859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.39852 + (((tickAnim - 0) / 15) * (6.89852-(0.39852)));
            yy = -6.48782 + (((tickAnim - 0) / 15) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 0) / 15) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 6.89852 + (((tickAnim - 15) / 13) * (0.39852-(6.89852)));
            yy = -6.48782 + (((tickAnim - 15) / 13) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 15) / 13) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0.39852 + (((tickAnim - 28) / 9) * (6.89852-(0.39852)));
            yy = -6.48782 + (((tickAnim - 28) / 9) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 28) / 9) * (-3.52259-(-3.52259)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 6.89852 + (((tickAnim - 37) / 13) * (0.39852-(6.89852)));
            yy = -6.48782 + (((tickAnim - 37) / 13) * (-6.48782-(-6.48782)));
            zz = -3.52259 + (((tickAnim - 37) / 13) * (-3.52259-(-3.52259)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 11.76991 + (((tickAnim - 0) / 15) * (17.51991-(11.76991)));
            yy = -11.02959 + (((tickAnim - 0) / 15) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 0) / 15) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 17.51991 + (((tickAnim - 15) / 13) * (11.76991-(17.51991)));
            yy = -11.02959 + (((tickAnim - 15) / 13) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 15) / 13) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 11.76991 + (((tickAnim - 28) / 9) * (17.51991-(11.76991)));
            yy = -11.02959 + (((tickAnim - 28) / 9) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 28) / 9) * (-2.28518-(-2.28518)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 17.51991 + (((tickAnim - 37) / 13) * (11.76991-(17.51991)));
            yy = -11.02959 + (((tickAnim - 37) / 13) * (-11.02959-(-11.02959)));
            zz = -2.28518 + (((tickAnim - 37) / 13) * (-2.28518-(-2.28518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 15) * (-15-(-15)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = -15 + (((tickAnim - 15) / 13) * (-15-(-15)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = -15 + (((tickAnim - 28) / 9) * (-15-(-15)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = -15 + (((tickAnim - 37) / 13) * (-15-(-15)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(3.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+120))*-7), tail5.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 285;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.nasalRight.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-3 + (((tickAnim - 0) / 50) * (16.75-(2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-3)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 16.75 + (((tickAnim - 50) / 50) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 16.75 + (((tickAnim - 100) / 15) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 16.75 + (((tickAnim - 115) / 8) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 16.75 + (((tickAnim - 123) / 21) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 16.75 + (((tickAnim - 144) / 119) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 16.75 + (((tickAnim - 263) / 22) * (0-(16.75)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 9.25 + (((tickAnim - 50) / 50) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 9.25 + (((tickAnim - 100) / 15) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 9.25 + (((tickAnim - 115) / 8) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 9.25 + (((tickAnim - 123) / 21) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 9.25 + (((tickAnim - 144) / 119) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 9.25 + (((tickAnim - 263) / 22) * (0-(9.25)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -16 + (((tickAnim - 50) / 50) * (-16-(-16)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -16 + (((tickAnim - 100) / 15) * (-16-(-16)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -16 + (((tickAnim - 115) / 8) * (-16-(-16)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -16 + (((tickAnim - 123) / 21) * (-16-(-16)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -16 + (((tickAnim - 144) / 119) * (-16-(-16)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = -16 + (((tickAnim - 263) / 11) * (-21.25-(-16)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = -21.25 + (((tickAnim - 274) / 11) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 263) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 11) * (2.375-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            yy = 2.375 + (((tickAnim - 274) / 11) * (0-(2.375)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 263) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (-43-(0)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = -43 + (((tickAnim - 274) / 11) * (0-(-43)));
            yy = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -12 + (((tickAnim - 50) / 50) * (-12-(-12)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -12 + (((tickAnim - 100) / 15) * (-12-(-12)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -12 + (((tickAnim - 115) / 8) * (-12-(-12)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -12 + (((tickAnim - 123) / 21) * (-12-(-12)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -12 + (((tickAnim - 144) / 119) * (-12-(-12)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = -12 + (((tickAnim - 263) / 11) * (80-(-12)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = 80 + (((tickAnim - 274) / 11) * (0-(80)));
            yy = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 263) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 263) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 263) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 263) / 11) * (8.75-(0)));
            yy = 0 + (((tickAnim - 263) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 11) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 285) {
            xx = 8.75 + (((tickAnim - 274) / 11) * (0-(8.75)));
            yy = 0 + (((tickAnim - 274) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.76-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 28) {
            xx = -2.76 + (((tickAnim - 7) / 21) * (-10.83-(-2.76)));
            yy = 0 + (((tickAnim - 7) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 21) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -10.83 + (((tickAnim - 28) / 22) * (-15.5-(-10.83)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -15.5 + (((tickAnim - 50) / 50) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -15.5 + (((tickAnim - 100) / 15) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -15.5 + (((tickAnim - 115) / 8) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -15.5 + (((tickAnim - 123) / 21) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -15.5 + (((tickAnim - 144) / 119) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -15.5 + (((tickAnim - 263) / 22) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -2.5 + (((tickAnim - 50) / 50) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -2.5 + (((tickAnim - 100) / 15) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -2.5 + (((tickAnim - 115) / 8) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -2.5 + (((tickAnim - 123) / 21) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -2.5 + (((tickAnim - 144) / 119) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -2.5 + (((tickAnim - 263) / 22) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(0), rightLeg5.rotateAngleY + (float) Math.toRadians(0), rightLeg5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -3.75 + (((tickAnim - 50) / 50) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -3.75 + (((tickAnim - 100) / 15) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -3.75 + (((tickAnim - 115) / 8) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -3.75 + (((tickAnim - 123) / 21) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -3.75 + (((tickAnim - 144) / 119) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -3.75 + (((tickAnim - 263) / 22) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -36.5 + (((tickAnim - 50) / 50) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -36.5 + (((tickAnim - 100) / 15) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -36.5 + (((tickAnim - 115) / 8) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -36.5 + (((tickAnim - 123) / 21) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -36.5 + (((tickAnim - 144) / 119) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -36.5 + (((tickAnim - 263) / 22) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 39.25 + (((tickAnim - 50) / 50) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 39.25 + (((tickAnim - 100) / 15) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 39.25 + (((tickAnim - 115) / 8) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 39.25 + (((tickAnim - 123) / 21) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 39.25 + (((tickAnim - 144) / 119) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 39.25 + (((tickAnim - 263) / 22) * (0-(39.25)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-3.25-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = -3.25 + (((tickAnim - 50) / 50) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = -3.25 + (((tickAnim - 100) / 15) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = -3.25 + (((tickAnim - 115) / 8) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = -3.25 + (((tickAnim - 123) / 21) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = -3.25 + (((tickAnim - 144) / 119) * (-3.25-(-3.25)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = -3.25 + (((tickAnim - 263) / 22) * (0-(-3.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (-93.25-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = -93.25 + (((tickAnim - 50) / 50) * (-93.25-(-93.25)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = -93.25 + (((tickAnim - 100) / 15) * (-93.25-(-93.25)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = -93.25 + (((tickAnim - 115) / 8) * (-93.25-(-93.25)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = -93.25 + (((tickAnim - 123) / 21) * (-93.25-(-93.25)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = -93.25 + (((tickAnim - 144) / 119) * (-93.25-(-93.25)));
        }
        else if (tickAnim >= 263 && tickAnim < 269) {
            xx = 0 + (((tickAnim - 263) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 6) * (0-(0)));
            zz = -93.25 + (((tickAnim - 263) / 6) * (9.25-(-93.25)));
        }
        else if (tickAnim >= 269 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 269) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 269) / 16) * (0-(0)));
            zz = 9.25 + (((tickAnim - 269) / 16) * (0-(9.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -20.75 + (((tickAnim - 50) / 50) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -20.75 + (((tickAnim - 100) / 15) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -20.75 + (((tickAnim - 115) / 8) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -20.75 + (((tickAnim - 123) / 21) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = -20.75 + (((tickAnim - 144) / 119) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -20.75 + (((tickAnim - 263) / 22) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 29 + (((tickAnim - 50) / 50) * (29-(29)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 29 + (((tickAnim - 100) / 15) * (29-(29)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 29 + (((tickAnim - 115) / 8) * (29-(29)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 29 + (((tickAnim - 123) / 21) * (29-(29)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 29 + (((tickAnim - 144) / 119) * (29-(29)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 119) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 29 + (((tickAnim - 263) / 22) * (0-(29)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 285) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 285) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (55-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 55 + (((tickAnim - 50) / 50) * (55-(55)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 55 + (((tickAnim - 100) / 15) * (55-(55)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 55 + (((tickAnim - 115) / 8) * (55-(55)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 55 + (((tickAnim - 123) / 21) * (55-(55)));
        }
        else if (tickAnim >= 144 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 119) * (0-(0)));
            zz = 55 + (((tickAnim - 144) / 119) * (55-(55)));
        }
        else if (tickAnim >= 263 && tickAnim < 269) {
            xx = 0 + (((tickAnim - 263) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 6) * (0-(0)));
            zz = 55 + (((tickAnim - 263) / 6) * (-13.06-(55)));
        }
        else if (tickAnim >= 269 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 269) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 269) / 16) * (0-(0)));
            zz = -13.06 + (((tickAnim - 269) / 16) * (0-(-13.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2 + (((tickAnim - 50) / 50) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*-2-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-2)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*-2 + (((tickAnim - 100) / 15) * (-12.2-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-100))*-2)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 144) {
            xx = -12.2 + (((tickAnim - 115) / 29) * (-16.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*3-(-12.2)));
            yy = 0 + (((tickAnim - 115) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 29) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 176) {
            xx = -16.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*3 + (((tickAnim - 144) / 32) * (-5.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-10))*10-(-16.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+100))*3)));
            yy = 0 + (((tickAnim - 144) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 32) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = -5.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-10))*10 + (((tickAnim - 176) / 11) * (8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(-5.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-10))*10)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 195) {
            xx = 8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 187) / 8) * (12.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(8.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 187) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 8) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 12.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 195) / 8) * (16.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(12.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 195) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 8) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 235) {
            xx = 16.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 203) / 32) * (19.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10-(16.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 203) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 32) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = 19.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10 + (((tickAnim - 235) / 15) * (20.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(19.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*10)));
            yy = 0 + (((tickAnim - 235) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 15) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 263) {
            xx = 20.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 250) / 13) * (17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(20.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 250) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 13) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 263) / 22) * (0-(17.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
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
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 144) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 32) * (0.4-(0)));
            zz = 0 + (((tickAnim - 144) / 32) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 176) / 72) * (0-(0)));
            yy = 0.4 + (((tickAnim - 176) / 72) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 176) / 72) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 248) / 37) * (0-(0)));
            yy = 0.4 + (((tickAnim - 248) / 37) * (0-(0.4)));
            zz = 0 + (((tickAnim - 248) / 37) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 50) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -3.75 + (((tickAnim - 50) / 50) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -3.75 + (((tickAnim - 100) / 15) * (-3.77236-(-3.75)));
            yy = 0 + (((tickAnim - 100) / 15) * (6.23657-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (-0.41039-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -3.77236 + (((tickAnim - 115) / 8) * (-1.47236-(-3.77236)));
            yy = 6.23657 + (((tickAnim - 115) / 8) * (6.23657-(6.23657)));
            zz = -0.41039 + (((tickAnim - 115) / 8) * (-0.41039-(-0.41039)));
        }
        else if (tickAnim >= 123 && tickAnim < 133) {
            xx = -1.47236 + (((tickAnim - 123) / 10) * (1.32764-(-1.47236)));
            yy = 6.23657 + (((tickAnim - 123) / 10) * (6.23657-(6.23657)));
            zz = -0.41039 + (((tickAnim - 123) / 10) * (-0.41039-(-0.41039)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 1.32764 + (((tickAnim - 133) / 11) * (1.52764-(1.32764)));
            yy = 6.23657 + (((tickAnim - 133) / 11) * (6.23657-(6.23657)));
            zz = -0.41039 + (((tickAnim - 133) / 11) * (-0.41039-(-0.41039)));
        }
        else if (tickAnim >= 144 && tickAnim < 176) {
            xx = 1.52764 + (((tickAnim - 144) / 32) * (17.9776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-40))*15-(1.52764)));
            yy = 6.23657 + (((tickAnim - 144) / 32) * (0-(6.23657)));
            zz = -0.41039 + (((tickAnim - 144) / 32) * (0-(-0.41039)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 17.9776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-40))*15 + (((tickAnim - 176) / 11) * (32.73-(17.9776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-40))*15)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 195) {
            xx = 32.73 + (((tickAnim - 187) / 8) * (30.755-(32.73)));
            yy = 0 + (((tickAnim - 187) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 8) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 30.755 + (((tickAnim - 195) / 8) * (29.73-(30.755)));
            yy = 0 + (((tickAnim - 195) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 8) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 210) {
            xx = 29.73 + (((tickAnim - 203) / 7) * (35.98-(29.73)));
            yy = 0 + (((tickAnim - 203) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 7) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 235) {
            xx = 35.98 + (((tickAnim - 210) / 25) * (26.805-(35.98)));
            yy = 0 + (((tickAnim - 210) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 25) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = 26.805 + (((tickAnim - 235) / 15) * (35.98-(26.805)));
            yy = 0 + (((tickAnim - 235) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 15) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 263) {
            xx = 35.98 + (((tickAnim - 250) / 13) * (32.73-(35.98)));
            yy = 0 + (((tickAnim - 250) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 13) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 32.73 + (((tickAnim - 263) / 22) * (0-(32.73)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -12.5 + (((tickAnim - 50) / 50) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -12.5 + (((tickAnim - 100) / 15) * (-2.52773-(-12.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (8.49185-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (-0.3735-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -2.52773 + (((tickAnim - 115) / 8) * (-1.37773-(-2.52773)));
            yy = 8.49185 + (((tickAnim - 115) / 8) * (8.49185-(8.49185)));
            zz = -0.3735 + (((tickAnim - 115) / 8) * (-0.3735-(-0.3735)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -1.37773 + (((tickAnim - 123) / 21) * (-2.52773-(-1.37773)));
            yy = 8.49185 + (((tickAnim - 123) / 21) * (8.49185-(8.49185)));
            zz = -0.3735 + (((tickAnim - 123) / 21) * (-0.3735-(-0.3735)));
        }
        else if (tickAnim >= 144 && tickAnim < 163) {
            xx = -2.52773 + (((tickAnim - 144) / 19) * (3.49668-(-2.52773)));
            yy = 8.49185 + (((tickAnim - 144) / 19) * (0.09202-(8.49185)));
            zz = -0.3735 + (((tickAnim - 144) / 19) * (-0.39774-(-0.3735)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 3.49668 + (((tickAnim - 163) / 13) * (8.47227-(3.49668)));
            yy = 0.09202 + (((tickAnim - 163) / 13) * (0-(0.09202)));
            zz = -0.39774 + (((tickAnim - 163) / 13) * (0-(-0.39774)));
        }
        else if (tickAnim >= 176 && tickAnim < 195) {
            xx = 8.47227 + (((tickAnim - 176) / 19) * (18.47-(8.47227)));
            yy = 0 + (((tickAnim - 176) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 19) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 18.47 + (((tickAnim - 195) / 8) * (19.72-(18.47)));
            yy = 0 + (((tickAnim - 195) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 8) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 250) {
            xx = 19.72 + (((tickAnim - 203) / 47) * (18.47-(19.72)));
            yy = 0 + (((tickAnim - 203) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 47) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 263) {
            xx = 18.47 + (((tickAnim - 250) / 13) * (13.97-(18.47)));
            yy = 0 + (((tickAnim - 250) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 13) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 13.97 + (((tickAnim - 263) / 22) * (0-(13.97)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 144) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 32) * (0.275-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 176) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 176) / 27) * (0.025-(0)));
            zz = 0.275 + (((tickAnim - 176) / 27) * (0.705-(0.275)));
        }
        else if (tickAnim >= 203 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 203) / 82) * (0-(0)));
            yy = 0.025 + (((tickAnim - 203) / 82) * (0-(0.025)));
            zz = 0.705 + (((tickAnim - 203) / 82) * (0-(0.705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (14-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 50) / 15) * (0-(0)));
            yy = 14 + (((tickAnim - 50) / 15) * (14-(14)));
            zz = 0 + (((tickAnim - 50) / 15) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 65) / 3) * (-1.25-(0)));
            yy = 14 + (((tickAnim - 65) / 3) * (14-(14)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = -1.25 + (((tickAnim - 68) / 2) * (0-(-1.25)));
            yy = 14 + (((tickAnim - 68) / 2) * (14-(14)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (-1.25-(0)));
            yy = 14 + (((tickAnim - 70) / 3) * (14-(14)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = -1.25 + (((tickAnim - 73) / 2) * (0-(-1.25)));
            yy = 14 + (((tickAnim - 73) / 2) * (14-(14)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (-0.5-(0)));
            yy = 14 + (((tickAnim - 75) / 5) * (14-(14)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.5 + (((tickAnim - 80) / 20) * (0-(-0.5)));
            yy = 14 + (((tickAnim - 80) / 20) * (14-(14)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 14 + (((tickAnim - 100) / 15) * (25.5-(14)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (1.15-(0)));
            yy = 25.5 + (((tickAnim - 115) / 8) * (25.5-(25.5)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 1.15 + (((tickAnim - 123) / 21) * (0-(1.15)));
            yy = 25.5 + (((tickAnim - 123) / 21) * (25.5-(25.5)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 144) / 19) * (0-(0)));
            yy = 25.5 + (((tickAnim - 144) / 19) * (-2.73-(25.5)));
            zz = 0 + (((tickAnim - 144) / 19) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 163) / 13) * (-8.5-(0)));
            yy = -2.73 + (((tickAnim - 163) / 13) * (0-(-2.73)));
            zz = 0 + (((tickAnim - 163) / 13) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = -8.5 + (((tickAnim - 176) / 11) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 187) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 187) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 14) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 201) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 201) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 7) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 216) {
            xx = -4.75 + (((tickAnim - 208) / 8) * (-5.5-(-4.75)));
            yy = 0 + (((tickAnim - 208) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 8) * (0-(0)));
        }
        else if (tickAnim >= 216 && tickAnim < 235) {
            xx = -5.5 + (((tickAnim - 216) / 19) * (5.25-(-5.5)));
            yy = 0 + (((tickAnim - 216) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 216) / 19) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 250) {
            xx = 5.25 + (((tickAnim - 235) / 15) * (-9.5-(5.25)));
            yy = 0 + (((tickAnim - 235) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 15) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 263) {
            xx = -9.5 + (((tickAnim - 250) / 13) * (-4.25-(-9.5)));
            yy = 0 + (((tickAnim - 250) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 13) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -4.25 + (((tickAnim - 263) / 22) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 225) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 225) * (0.325-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 225) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 60) * (0-(0)));
            zz = 0.325 + (((tickAnim - 225) / 60) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 179) {
            xx = 0 + (((tickAnim - 0) / 179) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 179) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 179) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 179) / 5) * (11.25-(0)));
            yy = 0 + (((tickAnim - 179) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 5) * (0-(0)));
        }
        else if (tickAnim >= 184 && tickAnim < 195) {
            xx = 11.25 + (((tickAnim - 184) / 11) * (-1-(11.25)));
            yy = 0 + (((tickAnim - 184) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 184) / 11) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = -1 + (((tickAnim - 195) / 9) * (-1-(-1)));
            yy = 0 + (((tickAnim - 195) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 9) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = -1 + (((tickAnim - 204) / 7) * (9-(-1)));
            yy = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 7) * (0-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 218) {
            xx = 9 + (((tickAnim - 211) / 7) * (-1-(9)));
            yy = 0 + (((tickAnim - 211) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 211) / 7) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 243) {
            xx = -1 + (((tickAnim - 218) / 25) * (0-(-1)));
            yy = 0 + (((tickAnim - 218) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 25) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 250) {
            xx = 0 + (((tickAnim - 243) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 243) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 7) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 257) {
            xx = 10 + (((tickAnim - 250) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 250) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 61 && tickAnim < 64) {
            xx = 1 + (((tickAnim - 61) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 61) / 3) * (0-(1)));
            zz = 1 + (((tickAnim - 61) / 3) * (1-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 64) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 64) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 64) / 4) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 68) / 47) * (1-(1)));
            yy = 1 + (((tickAnim - 68) / 47) * (1-(1)));
            zz = 1 + (((tickAnim - 68) / 47) * (1-(1)));
        }
        else if (tickAnim >= 115 && tickAnim < 119) {
            xx = 1 + (((tickAnim - 115) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 115) / 4) * (0-(1)));
            zz = 1 + (((tickAnim - 115) / 4) * (1-(1)));
        }
        else if (tickAnim >= 119 && tickAnim < 123) {
            xx = 1 + (((tickAnim - 119) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 119) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 119) / 4) * (1-(1)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 1 + (((tickAnim - 123) / 21) * (1-(1)));
            yy = 1 + (((tickAnim - 123) / 21) * (1-(1)));
            zz = 1 + (((tickAnim - 123) / 21) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 1.25 + (((tickAnim - 50) / 50) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.2-(1.25)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 210) {
            xx = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.2 + (((tickAnim - 100) / 110) * (1.25-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.2)));
            yy = 0 + (((tickAnim - 100) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 110) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 285) {
            xx = 1.25 + (((tickAnim - 210) / 75) * (0-(1.25)));
            yy = 0 + (((tickAnim - 210) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -3.5 + (((tickAnim - 50) / 50) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(-3.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 210) {
            xx = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 100) / 110) * (-3.5-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
            yy = 0 + (((tickAnim - 100) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 110) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = -3.5 + (((tickAnim - 210) / 53) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 53) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -3.5 + (((tickAnim - 263) / 22) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -4.5 + (((tickAnim - 50) / 50) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*1-(-4.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 210) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*1 + (((tickAnim - 100) / 110) * (-4.5-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-200))*1)));
            yy = 0 + (((tickAnim - 100) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 110) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = -4.5 + (((tickAnim - 210) / 53) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 53) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -4.5 + (((tickAnim - 263) / 22) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.125-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = -0.125 + (((tickAnim - 50) / 50) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = -0.125 + (((tickAnim - 100) / 15) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = -0.125 + (((tickAnim - 115) / 8) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 123 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 123) / 87) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 87) * (0-(0)));
            zz = -0.125 + (((tickAnim - 123) / 87) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            zz = -0.125 + (((tickAnim - 210) / 53) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = -0.125 + (((tickAnim - 263) / 22) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-4.82964-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (1.60755-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-1.35624-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -4.82964 + (((tickAnim - 50) / 50) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 50) / 50) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 50) / 50) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -4.82964 + (((tickAnim - 100) / 15) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 100) / 15) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 100) / 15) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -4.82964 + (((tickAnim - 115) / 8) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 115) / 8) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 115) / 8) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -4.82964 + (((tickAnim - 123) / 21) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 123) / 21) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 123) / 21) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 144 && tickAnim < 210) {
            xx = -4.82964 + (((tickAnim - 144) / 66) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 144) / 66) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 144) / 66) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = -4.82964 + (((tickAnim - 210) / 53) * (-4.82964-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 210) / 53) * (1.60755-(1.60755)));
            zz = -1.35624 + (((tickAnim - 210) / 53) * (-1.35624-(-1.35624)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -4.82964 + (((tickAnim - 263) / 22) * (0-(-4.82964)));
            yy = 1.60755 + (((tickAnim - 263) / 22) * (0-(1.60755)));
            zz = -1.35624 + (((tickAnim - 263) / 22) * (0-(-1.35624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.075-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = -0.075 + (((tickAnim - 50) / 50) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = -0.075 + (((tickAnim - 100) / 15) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = -0.075 + (((tickAnim - 115) / 8) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = -0.075 + (((tickAnim - 123) / 21) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 144 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 144) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 144) / 66) * (0-(0)));
            zz = -0.075 + (((tickAnim - 144) / 66) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            zz = -0.075 + (((tickAnim - 210) / 53) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = -0.075 + (((tickAnim - 263) / 22) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 100) {
            xx = -5.5 + (((tickAnim - 50) / 50) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 50) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 50) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 115) {
            xx = -5.5 + (((tickAnim - 100) / 15) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 100) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 15) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 123) {
            xx = -5.5 + (((tickAnim - 115) / 8) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 115) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 8) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 144) {
            xx = -5.5 + (((tickAnim - 123) / 21) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 123) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 21) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 210) {
            xx = -5.5 + (((tickAnim - 144) / 66) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 144) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 66) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 263) {
            xx = -5.5 + (((tickAnim - 210) / 53) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 210) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 53) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 285) {
            xx = -5.5 + (((tickAnim - 263) / 22) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 263) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(0);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(0);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(0);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (2-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 2 + (((tickAnim - 15) / 6) * (2.08-(2)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 2.08 + (((tickAnim - 21) / 4) * (0-(2.08)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.5 + (((tickAnim - 8) / 7) * (5-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 15) / 6) * (-0.42-(5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.42 + (((tickAnim - 21) / 4) * (0-(-0.42)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 8) / 7) * (-8.25-(1.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -8.25 + (((tickAnim - 15) / 6) * (1.06-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.06 + (((tickAnim - 21) / 4) * (0-(1.06)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 3.25 + (((tickAnim - 8) / 7) * (-5.25-(3.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -5.25 + (((tickAnim - 15) / 6) * (-6.19-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -6.19 + (((tickAnim - 21) / 4) * (0-(-6.19)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 8) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 5) * (0.5-(1)));
            zz = 1 + (((tickAnim - 8) / 5) * (0.5-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.5 + (((tickAnim - 13) / 5) * (1-(0.5)));
            zz = 0.5 + (((tickAnim - 13) / 5) * (1-(0.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 18) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 3) * (0.5-(1)));
            zz = 1 + (((tickAnim - 18) / 3) * (0.5-(1)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 21) / 4) * (1-(1)));
            yy = 0.5 + (((tickAnim - 21) / 4) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 21) / 4) * (0-(0.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalLeft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 8) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 7) * (0.5-(1)));
            zz = 1 + (((tickAnim - 8) / 7) * (0.5-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 15) / 6) * (1-(1)));
            yy = 0.5 + (((tickAnim - 15) / 6) * (1-(0.5)));
            zz = 0.5 + (((tickAnim - 15) / 6) * (1-(0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 21) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 21) / 4) * (0-(1)));
            zz = 1 + (((tickAnim - 21) / 4) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.nasalRight.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 5.75 + (((tickAnim - 8) / 5) * (12-(5.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 13) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 21) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.nasalRight.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = -20.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-3 + (((tickAnim - 40) / 1) * (-19.9-(-20.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-3)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 85) {
            xx = -19.9 + (((tickAnim - 41) / 44) * (-19.9-(-19.9)));
            yy = 0 + (((tickAnim - 41) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 44) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -19.9 + (((tickAnim - 85) / 55) * (-19.9-(-19.9)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -19.9 + (((tickAnim - 140) / 20) * (0-(-19.9)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 40) / 1) * (18.525-(19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 18.525 + (((tickAnim - 41) / 99) * (18.525-(18.525)));
            yy = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 99) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 18.525 + (((tickAnim - 140) / 20) * (0-(18.525)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3 + (((tickAnim - 40) / 1) * (18.525-(19+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*3)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 18.525 + (((tickAnim - 41) / 99) * (18.525-(18.525)));
            yy = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 99) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 18.525 + (((tickAnim - 140) / 20) * (0-(18.525)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 84) {
            xx = 4.5 + (((tickAnim - 40) / 44) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 40) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 44) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 100) {
            xx = 4.5 + (((tickAnim - 84) / 16) * (7-(4.5)));
            yy = 0 + (((tickAnim - 84) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 16) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 109) {
            xx = 7 + (((tickAnim - 100) / 9) * (7.5-(7)));
            yy = 0 + (((tickAnim - 100) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 9) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 7.5 + (((tickAnim - 109) / 31) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 7.5 + (((tickAnim - 140) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 85) {
            xx = 22.5 + (((tickAnim - 40) / 45) * (19.75-(22.5)));
            yy = 0 + (((tickAnim - 40) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 45) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 19.75 + (((tickAnim - 85) / 15) * (22-(19.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 22 + (((tickAnim - 100) / 40) * (22-(22)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 22 + (((tickAnim - 140) / 20) * (0-(22)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 85) {
            xx = 14.25 + (((tickAnim - 40) / 45) * (16.25-(14.25)));
            yy = 0 + (((tickAnim - 40) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 45) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 16.25 + (((tickAnim - 85) / 15) * (20-(16.25)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 20 + (((tickAnim - 100) / 40) * (20-(20)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 20 + (((tickAnim - 140) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.925-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.925 + (((tickAnim - 40) / 20) * (-3.25-(-2.925)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -3.25 + (((tickAnim - 60) / 25) * (-3.75-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -3.75 + (((tickAnim - 85) / 15) * (-16.189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-3.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (3.07472-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (1.05273-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -16.189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 100) / 10) * (-20.089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-16.189+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 3.07472 + (((tickAnim - 100) / 10) * (3.07472-(3.07472)));
            zz = 1.05273 + (((tickAnim - 100) / 10) * (1.05273-(1.05273)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -20.089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 110) / 15) * (-22.314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-20.089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 3.07472 + (((tickAnim - 110) / 15) * (3.07472-(3.07472)));
            zz = 1.05273 + (((tickAnim - 110) / 15) * (1.05273-(1.05273)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -22.314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 125) / 15) * (-23.139+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2-(-22.314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 3.07472 + (((tickAnim - 125) / 15) * (3.07472-(3.07472)));
            zz = 1.05273 + (((tickAnim - 125) / 15) * (1.05273-(1.05273)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -23.139+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2 + (((tickAnim - 140) / 20) * (0-(-23.139+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2)));
            yy = 3.07472 + (((tickAnim - 140) / 20) * (0-(3.07472)));
            zz = 1.05273 + (((tickAnim - 140) / 20) * (0-(1.05273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = 0.35 + (((tickAnim - 40) / 100) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 140) / 20) * (0-(0.35)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -1.75 + (((tickAnim - 60) / 25) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = -1.75 + (((tickAnim - 85) / 15) * (4.92319-(-1.75)));
            yy = 0 + (((tickAnim - 85) / 15) * (12.28815-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (1.15027-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 4.92319 + (((tickAnim - 100) / 10) * (4.92319-(4.92319)));
            yy = 12.28815 + (((tickAnim - 100) / 10) * (12.28815-(12.28815)));
            zz = 1.15027 + (((tickAnim - 100) / 10) * (1.15027-(1.15027)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 4.92319 + (((tickAnim - 110) / 15) * (3.92319-(4.92319)));
            yy = 12.28815 + (((tickAnim - 110) / 15) * (12.28815-(12.28815)));
            zz = 1.15027 + (((tickAnim - 110) / 15) * (1.15027-(1.15027)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 3.92319 + (((tickAnim - 125) / 15) * (3.67319-(3.92319)));
            yy = 12.28815 + (((tickAnim - 125) / 15) * (12.28815-(12.28815)));
            zz = 1.15027 + (((tickAnim - 125) / 15) * (1.15027-(1.15027)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = 3.67319 + (((tickAnim - 140) / 12) * (-0.2195-(3.67319)));
            yy = 12.28815 + (((tickAnim - 140) / 12) * (5.12006-(12.28815)));
            zz = 1.15027 + (((tickAnim - 140) / 12) * (0.47928-(1.15027)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -0.2195 + (((tickAnim - 152) / 8) * (0-(-0.2195)));
            yy = 5.12006 + (((tickAnim - 152) / 8) * (0-(5.12006)));
            zz = 0.47928 + (((tickAnim - 152) / 8) * (0-(0.47928)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 4.5 + (((tickAnim - 40) / 20) * (7-(4.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 7 + (((tickAnim - 60) / 25) * (7-(7)));
            yy = 0 + (((tickAnim - 60) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 7 + (((tickAnim - 85) / 15) * (7.12219-(7)));
            yy = 0 + (((tickAnim - 85) / 15) * (1.15258-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (4.92877-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 125) {
            xx = 7.12219 + (((tickAnim - 100) / 25) * (6.12219-(7.12219)));
            yy = 1.15258 + (((tickAnim - 100) / 25) * (1.15258-(1.15258)));
            zz = 4.92877 + (((tickAnim - 100) / 25) * (4.92877-(4.92877)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 6.12219 + (((tickAnim - 125) / 15) * (6.12219-(6.12219)));
            yy = 1.15258 + (((tickAnim - 125) / 15) * (1.15258-(1.15258)));
            zz = 4.92877 + (((tickAnim - 125) / 15) * (4.92877-(4.92877)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = 6.12219 + (((tickAnim - 140) / 12) * (16.05091-(6.12219)));
            yy = 1.15258 + (((tickAnim - 140) / 12) * (0.48024-(1.15258)));
            zz = 4.92877 + (((tickAnim - 140) / 12) * (2.05366-(4.92877)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 16.05091 + (((tickAnim - 152) / 8) * (0-(16.05091)));
            yy = 0.48024 + (((tickAnim - 152) / 8) * (0-(0.48024)));
            zz = 2.05366 + (((tickAnim - 152) / 8) * (0-(2.05366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.45-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0.45 + (((tickAnim - 40) / 100) * (0.45-(0.45)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0.45 + (((tickAnim - 140) / 20) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6 + (((tickAnim - 40) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 6 + (((tickAnim - 60) / 3) * (5-(6)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 63) / 2) * (6-(5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 6 + (((tickAnim - 65) / 3) * (5-(6)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 5 + (((tickAnim - 68) / 2) * (6-(5)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 6 + (((tickAnim - 70) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 100) {
            xx = 6 + (((tickAnim - 85) / 15) * (9.225-(6)));
            yy = 0 + (((tickAnim - 85) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 15) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 9.225 + (((tickAnim - 100) / 10) * (6.5-(9.225)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 6.5 + (((tickAnim - 110) / 30) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = 6.5 + (((tickAnim - 140) / 12) * (15.46-(6.5)));
            yy = 0 + (((tickAnim - 140) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 12) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 15.46 + (((tickAnim - 152) / 8) * (0-(15.46)));
            yy = 0 + (((tickAnim - 152) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 152) {
            xx = 0 + (((tickAnim - 140) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 12) * (0.525-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 152) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 152) / 8) * (0-(0)));
            zz = 0.525 + (((tickAnim - 152) / 8) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125))*5-(0)));
            yy = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 5) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = -2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125))*5 + (((tickAnim - 128) / 6) * (0-(-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125))*5)));
            yy = 0 + (((tickAnim - 128) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 41 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 41) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 4) * (0-(1)));
            zz = 1 + (((tickAnim - 41) / 4) * (1-(1)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 45) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 45) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 45) / 4) * (1-(1)));
        }
        else if (tickAnim >= 49 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 49) / 49) * (1-(1)));
            yy = 1 + (((tickAnim - 49) / 49) * (1-(1)));
            zz = 1 + (((tickAnim - 49) / 49) * (1-(1)));
        }
        else if (tickAnim >= 98 && tickAnim < 103) {
            xx = 1 + (((tickAnim - 98) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 98) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 98) / 5) * (1-(1)));
        }
        else if (tickAnim >= 103 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 103) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 103) / 5) * (1-(0)));
            zz = 1 + (((tickAnim - 103) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 140) {
            xx = 0.25 + (((tickAnim - 18) / 122) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 18) / 122) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 122) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0.25 + (((tickAnim - 140) / 20) * (0-(0.25)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 18) / 22) * (-3.5-(-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -3.5 + (((tickAnim - 40) / 100) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -3.5 + (((tickAnim - 140) / 20) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 18) / 22) * (2.75-(-5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 2.75 + (((tickAnim - 40) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 2.75 + (((tickAnim - 140) / 7) * (-3.67-(2.75)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 160) {
            xx = -3.67 + (((tickAnim - 147) / 13) * (0-(-3.67)));
            yy = 0 + (((tickAnim - 147) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 4.75 + (((tickAnim - 18) / 22) * (19.75-(4.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 19.75 + (((tickAnim - 40) / 100) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 19.75 + (((tickAnim - 140) / 7) * (-0.08-(19.75)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = -0.08 + (((tickAnim - 147) / 5) * (-6.3-(-0.08)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -6.3 + (((tickAnim - 152) / 8) * (0-(-6.3)));
            yy = 0 + (((tickAnim - 152) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (-0.8-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = -0.8 + (((tickAnim - 40) / 100) * (-0.8-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 9.75 + (((tickAnim - 18) / 12) * (18.75-(9.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 18.75 + (((tickAnim - 30) / 11) * (6.75-(18.75)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 140) {
            xx = 6.75 + (((tickAnim - 41) / 99) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 41) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 99) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 147) {
            xx = 6.75 + (((tickAnim - 140) / 7) * (17-(6.75)));
            yy = 0 + (((tickAnim - 140) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 7) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 152) {
            xx = 17 + (((tickAnim - 147) / 5) * (-11.8-(17)));
            yy = 0 + (((tickAnim - 147) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 5) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 155) {
            xx = -11.8 + (((tickAnim - 152) / 3) * (-15.55-(-11.8)));
            yy = 0 + (((tickAnim - 152) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 3) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = -15.55 + (((tickAnim - 155) / 5) * (0-(-15.55)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 1.75 + (((tickAnim - 15) / 9) * (1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+90))*-2-(1.75)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.2))*0.5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+90))*-2 + (((tickAnim - 24) / 6) * (0-(1.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+90))*-2)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.2))*0.5 + (((tickAnim - 24) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.2))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -1.75 + (((tickAnim - 15) / 9) * (1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+50))*5-(-1.75)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-50))*2-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+50))*5 + (((tickAnim - 24) / 6) * (0-(1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250+50))*5)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-50))*2 + (((tickAnim - 24) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-50))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 2.25 + (((tickAnim - 14) / 9) * (5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*15-(2.25)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-100))*3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*15 + (((tickAnim - 23) / 7) * (0-(5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*15)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-100))*3 + (((tickAnim - 23) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.75 + (((tickAnim - 13) / 2) * (-9.025-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -9.025 + (((tickAnim - 15) / 8) * (0-(-9.025)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-150))*4-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-150))*4 + (((tickAnim - 23) / 7) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.25-150))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.nasalLeft.setScale((float)1,(float)0,(float)0);


        this.nasalRight.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 11.75 + (((tickAnim - 13) / 2) * (12.92366-(11.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 12.92366 + (((tickAnim - 15) / 3) * (0-(12.92366)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.0175-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 8) / 7) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 8) / 7) * (0.0175-(0.0175)));
            zz = 1 + (((tickAnim - 8) / 7) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 15) / 5) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 15) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 16;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -24 + (((tickAnim - 0) / 8) * (33.95013-(-24)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.2159-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.3094-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 33.95013 + (((tickAnim - 8) / 9) * (-24-(33.95013)));
            yy = -2.2159 + (((tickAnim - 8) / 9) * (0-(-2.2159)));
            zz = 1.3094 + (((tickAnim - 8) / 9) * (0-(1.3094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -28.25 + (((tickAnim - 0) / 8) * (9.5-(-28.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 9.5 + (((tickAnim - 8) / 1) * (9.46-(9.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 9.46 + (((tickAnim - 9) / 4) * (-20.46-(9.46)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -20.46 + (((tickAnim - 13) / 4) * (-28.25-(-20.46)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 8) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (3.3-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 3.3 + (((tickAnim - 13) / 4) * (-0.25-(3.3)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
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
            xx = 10.25 + (((tickAnim - 0) / 3) * (-3.59-(10.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.59 + (((tickAnim - 3) / 5) * (26.5-(-3.59)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 26.5 + (((tickAnim - 8) / 4) * (-41.6-(26.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -41.6 + (((tickAnim - 12) / 2) * (-41.6-(-41.6)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -41.6 + (((tickAnim - 14) / 3) * (10.25-(-41.6)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 8) * (0-(0.525)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0.525-(0)));
            zz = -0.225 + (((tickAnim - 8) / 9) * (0-(-0.225)));
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
            xx = 34 + (((tickAnim - 0) / 3) * (22.13-(34)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 22.13 + (((tickAnim - 3) / 0) * (16.36-(22.13)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.36 + (((tickAnim - 3) / 2) * (-13.92-(16.36)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -13.92 + (((tickAnim - 5) / 3) * (49-(-13.92)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 49 + (((tickAnim - 8) / 1) * (70.5-(49)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 70.5 + (((tickAnim - 9) / 3) * (93.41-(70.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 93.41 + (((tickAnim - 12) / 2) * (93.41-(93.41)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 93.41 + (((tickAnim - 14) / 3) * (34-(93.41)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 3) * (-0.4-(0.825)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.22-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.4 + (((tickAnim - 3) / 0) * (-0.63-(-0.4)));
            zz = -0.22 + (((tickAnim - 3) / 0) * (-0.15-(-0.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.63 + (((tickAnim - 3) / 2) * (0.25-(-0.63)));
            zz = -0.15 + (((tickAnim - 3) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 3) * (0.75-(0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 1) * (2.825-(0.75)));
            zz = -0.625 + (((tickAnim - 8) / 1) * (-0.75-(-0.625)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 2.825 + (((tickAnim - 9) / 1) * (2.405-(2.825)));
            zz = -0.75 + (((tickAnim - 9) / 1) * (-0.96-(-0.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 2.405 + (((tickAnim - 10) / 2) * (1.425-(2.405)));
            zz = -0.96 + (((tickAnim - 10) / 2) * (-0.85-(-0.96)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.425 + (((tickAnim - 12) / 2) * (1.425-(1.425)));
            zz = -0.85 + (((tickAnim - 12) / 2) * (-0.85-(-0.85)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.425 + (((tickAnim - 14) / 3) * (0.825-(1.425)));
            zz = -0.85 + (((tickAnim - 14) / 3) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 33.95013 + (((tickAnim - 0) / 6) * (-2.34321-(33.95013)));
            yy = 2.2159 + (((tickAnim - 0) / 6) * (1.95097-(2.2159)));
            zz = -1.3094 + (((tickAnim - 0) / 6) * (-0.73008-(-1.3094)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.34321 + (((tickAnim - 6) / 2) * (-24-(-2.34321)));
            yy = 1.95097 + (((tickAnim - 6) / 2) * (0-(1.95097)));
            zz = -0.73008 + (((tickAnim - 6) / 2) * (0-(-0.73008)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -24 + (((tickAnim - 8) / 9) * (33.95013-(-24)));
            yy = 0 + (((tickAnim - 8) / 9) * (2.2159-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (-1.3094-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.5 + (((tickAnim - 0) / 2) * (9.46-(9.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.46 + (((tickAnim - 2) / 2) * (-27.21-(9.46)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -27.21 + (((tickAnim - 4) / 4) * (-28.25-(-27.21)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -28.25 + (((tickAnim - 8) / 9) * (9.5-(-28.25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.55-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 3.55 + (((tickAnim - 4) / 4) * (-0.25-(3.55)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 9) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
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
            xx = 34 + (((tickAnim - 0) / 2) * (70.5-(34)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 70.5 + (((tickAnim - 2) / 1) * (93.41-(70.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 93.41 + (((tickAnim - 3) / 2) * (93.41-(93.41)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 93.41 + (((tickAnim - 5) / 3) * (34-(93.41)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 34 + (((tickAnim - 8) / 2) * (29.05-(34)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.05 + (((tickAnim - 10) / 3) * (18.31768-(29.05)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.96782-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (1.45809-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.31768 + (((tickAnim - 13) / 4) * (34-(18.31768)));
            yy = -0.96782 + (((tickAnim - 13) / 4) * (0-(-0.96782)));
            zz = 1.45809 + (((tickAnim - 13) / 4) * (0-(1.45809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 2) * (2.825-(0.825)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.75-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.825 + (((tickAnim - 2) / 1) * (1.1-(2.825)));
            zz = -0.75 + (((tickAnim - 2) / 1) * (-0.675-(-0.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 2) * (1.1-(1.1)));
            zz = -0.675 + (((tickAnim - 3) / 2) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 5) / 3) * (0.825-(1.1)));
            zz = -0.675 + (((tickAnim - 5) / 3) * (0-(-0.675)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 2) * (0-(0.825)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.775-(0)));
            zz = 0.4 + (((tickAnim - 10) / 3) * (0-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.775 + (((tickAnim - 13) / 2) * (2.475-(-0.775)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.16-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 2.475 + (((tickAnim - 15) / 2) * (0.825-(2.475)));
            zz = -0.16 + (((tickAnim - 15) / 2) * (0-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 9.75 + (((tickAnim - 0) / 1) * (0.4-(9.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.4 + (((tickAnim - 1) / 2) * (7.99-(0.4)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7.99 + (((tickAnim - 3) / 5) * (0-(7.99)));
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
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -20.25 + (((tickAnim - 13) / 2) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (9.75-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.065-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.57-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            yy = -0.065 + (((tickAnim - 1) / 7) * (0-(-0.065)));
            zz = -0.57 + (((tickAnim - 1) / 7) * (0-(-0.57)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-30.13-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -30.13 + (((tickAnim - 6) / 1) * (-16.75-(-30.13)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -16.75 + (((tickAnim - 7) / 1) * (16.25-(-16.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.25 + (((tickAnim - 8) / 1) * (0-(16.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (19.13-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 19.13 + (((tickAnim - 12) / 2) * (34.63-(19.13)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 34.63 + (((tickAnim - 14) / 3) * (0-(34.63)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.235-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.075-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.235 + (((tickAnim - 12) / 2) * (-0.235-(-0.235)));
            zz = -0.075 + (((tickAnim - 12) / 2) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.235 + (((tickAnim - 14) / 3) * (0-(-0.235)));
            zz = -0.075 + (((tickAnim - 14) / 3) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.5 + (((tickAnim - 0) / 3) * (-41.6-(26.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -41.6 + (((tickAnim - 3) / 2) * (-41.6-(-41.6)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -41.6 + (((tickAnim - 5) / 3) * (10.25-(-41.6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 8) / 2) * (-0.8-(10.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.8 + (((tickAnim - 10) / 3) * (-8.53-(-0.8)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -8.53 + (((tickAnim - 13) / 4) * (26.5-(-8.53)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.525-(0)));
            zz = -0.225 + (((tickAnim - 0) / 8) * (0-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 5) * (-0.01-(0.525)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.01 + (((tickAnim - 13) / 4) * (0-(-0.01)));
            zz = -0.1 + (((tickAnim - 13) / 4) * (-0.225-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+80))*4.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*2), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+20))*1.8));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*423/0.5-50))*1.5 + (((tickAnim - 0) / 3) * (0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*423/0.5-50))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2 + (((tickAnim - 3) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2)));
            yy = 0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5 + (((tickAnim - 3) / 5) * (-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5-(0.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5 + (((tickAnim - 3) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2 + (((tickAnim - 8) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2)));
            yy = -0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5 + (((tickAnim - 8) / 5) * (0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5-(-0.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5 + (((tickAnim - 8) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432))*-0.2)));
            yy = 0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5-(0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5-50))*1.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5 + (((tickAnim - 13) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*432/0.5))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-20))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-50))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+120))*1.5));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-100))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*1));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(16+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-150))*6), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*2));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-16.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*2));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-250))*-4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*1.5));
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(16.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455/0.5-150))*6), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*455+150))*2));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-22+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-200))*-8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*2));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-250))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+150))*1.5));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-150))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+190))*1.5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-190))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+230))*1.5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-230))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+220))*-1.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5-250))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+150))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-100))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+50))*2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+200))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-200))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+50))*2));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+250))*-4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+50))*2));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+300))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-250))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+50))*2));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.5+350))*7), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432-300))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432+50))*2));
        this.nasalLeft.setScale((float)1,(float)0,(float)0);
        this.nasalRight.setScale((float)1,(float)0,(float)0);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMuttaburrasaurus entity = (EntityPrehistoricFloraMuttaburrasaurus) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 0) / 13) * (26.70013-(-16.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (2.21595-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-1.30943-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 26.70013 + (((tickAnim - 13) / 14) * (-16.5-(26.70013)));
            yy = 2.21595 + (((tickAnim - 13) / 14) * (0-(2.21595)));
            zz = -1.30943 + (((tickAnim - 13) / 14) * (0-(-1.30943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -23.5 + (((tickAnim - 0) / 13) * (3-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 13) / 3) * (9.46-(3)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 9.46 + (((tickAnim - 16) / 4) * (-5.71-(9.46)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -5.71 + (((tickAnim - 20) / 7) * (-23.5-(-5.71)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (1.575-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.575 + (((tickAnim - 20) / 7) * (0-(1.575)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
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
            xx = 4 + (((tickAnim - 0) / 5) * (-3.59-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -3.59 + (((tickAnim - 5) / 8) * (26-(-3.59)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 13) / 7) * (-41.6-(26)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -41.6 + (((tickAnim - 20) / 3) * (-41.6-(-41.6)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -41.6 + (((tickAnim - 23) / 4) * (4-(-41.6)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 13) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 14) * (-0.125-(0)));
            zz = -0.225 + (((tickAnim - 13) / 14) * (0-(-0.225)));
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
            xx = 34 + (((tickAnim - 0) / 5) * (18.13-(34)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 18.13 + (((tickAnim - 5) / 3) * (-9.17-(18.13)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.17 + (((tickAnim - 8) / 5) * (37.75-(-9.17)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 37.75 + (((tickAnim - 13) / 3) * (70.5-(37.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 70.5 + (((tickAnim - 16) / 4) * (93.41-(70.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 93.41 + (((tickAnim - 20) / 3) * (93.41-(93.41)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 93.41 + (((tickAnim - 23) / 4) * (34-(93.41)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 0) / 5) * (0.975-(0.825)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.22-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 5) / 3) * (1.2-(0.975)));
            zz = -0.22 + (((tickAnim - 5) / 3) * (0-(-0.22)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 8) / 5) * (0.75-(1.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.625-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 3) * (2.825-(0.75)));
            zz = -0.625 + (((tickAnim - 13) / 3) * (-0.75-(-0.625)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.825 + (((tickAnim - 16) / 2) * (2.405-(2.825)));
            zz = -0.75 + (((tickAnim - 16) / 2) * (-0.96-(-0.75)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 2.405 + (((tickAnim - 18) / 2) * (1.425-(2.405)));
            zz = -0.96 + (((tickAnim - 18) / 2) * (-0.85-(-0.96)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.425 + (((tickAnim - 20) / 3) * (1.425-(1.425)));
            zz = -0.85 + (((tickAnim - 20) / 3) * (-0.85-(-0.85)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.425 + (((tickAnim - 23) / 4) * (0.825-(1.425)));
            zz = -0.85 + (((tickAnim - 23) / 4) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 26.70013 + (((tickAnim - 0) / 9) * (-2.34321-(26.70013)));
            yy = 2.21595 + (((tickAnim - 0) / 9) * (1.95097-(2.21595)));
            zz = -1.30943 + (((tickAnim - 0) / 9) * (-0.73008-(-1.30943)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -2.34321 + (((tickAnim - 9) / 5) * (-16.5-(-2.34321)));
            yy = 1.95097 + (((tickAnim - 9) / 5) * (0-(1.95097)));
            zz = -0.73008 + (((tickAnim - 9) / 5) * (0-(-0.73008)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = -16.5 + (((tickAnim - 14) / 13) * (26.70013-(-16.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (2.21595-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (-1.30943-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (9.46-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.46 + (((tickAnim - 3) / 4) * (-5.71-(9.46)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -5.71 + (((tickAnim - 7) / 7) * (-24.5-(-5.71)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = -24.5 + (((tickAnim - 14) / 13) * (3-(-24.5)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 1.575 + (((tickAnim - 7) / 7) * (0-(1.575)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 13) * (0-(0)));
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
            xx = 37.75 + (((tickAnim - 0) / 3) * (70.5-(37.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 70.5 + (((tickAnim - 3) / 4) * (93.41-(70.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 93.41 + (((tickAnim - 7) / 3) * (93.41-(93.41)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 93.41 + (((tickAnim - 10) / 4) * (36.25-(93.41)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 36.25 + (((tickAnim - 14) / 3) * (35.55-(36.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 35.55 + (((tickAnim - 17) / 3) * (19.58-(35.55)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 19.58 + (((tickAnim - 20) / 7) * (37.75-(19.58)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.825-(0)));
            zz = -0.225 + (((tickAnim - 0) / 3) * (-0.75-(-0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 2.825 + (((tickAnim - 3) / 4) * (1.1-(2.825)));
            zz = -0.75 + (((tickAnim - 3) / 4) * (-0.675-(-0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 7) / 3) * (1.1-(1.1)));
            zz = -0.675 + (((tickAnim - 7) / 3) * (-0.675-(-0.675)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 10) / 4) * (0-(1.1)));
            zz = -0.675 + (((tickAnim - 10) / 4) * (0-(-0.675)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.05-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 20) / 3) * (2.475-(1.05)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.16-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 2.475 + (((tickAnim - 23) / 4) * (0-(2.475)));
            zz = -0.16 + (((tickAnim - 23) / 4) * (-0.225-(-0.16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -26.75 + (((tickAnim - 0) / 2) * (0.4-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0.4 + (((tickAnim - 2) / 5) * (7.99-(0.4)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 7.99 + (((tickAnim - 7) / 7) * (0-(7.99)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-34.63-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -34.63 + (((tickAnim - 23) / 4) * (-26.75-(-34.63)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 2) * (-0.065-(0.3)));
            zz = -0.65 + (((tickAnim - 0) / 2) * (-0.57-(-0.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 2) / 12) * (0-(0)));
            yy = -0.065 + (((tickAnim - 2) / 12) * (0-(-0.065)));
            zz = -0.57 + (((tickAnim - 2) / 12) * (0-(-0.57)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0.3-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-0.65-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-40.12-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -40.12 + (((tickAnim - 11) / 2) * (-12.75-(-40.12)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -12.75 + (((tickAnim - 13) / 3) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (4.38-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.38 + (((tickAnim - 20) / 3) * (4.38-(4.38)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 4.38 + (((tickAnim - 23) / 4) * (0-(4.38)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 7) * (-0.06-(0.3)));
            zz = -0.65 + (((tickAnim - 13) / 7) * (-0.075-(-0.65)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = -0.06 + (((tickAnim - 20) / 3) * (-0.06-(-0.06)));
            zz = -0.075 + (((tickAnim - 20) / 3) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.06 + (((tickAnim - 23) / 4) * (0-(-0.06)));
            zz = -0.075 + (((tickAnim - 23) / 4) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 26 + (((tickAnim - 0) / 7) * (-41.6-(26)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -41.6 + (((tickAnim - 7) / 3) * (-41.6-(-41.6)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -41.6 + (((tickAnim - 10) / 4) * (4-(-41.6)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 4 + (((tickAnim - 14) / 3) * (-9.3-(4)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -9.3 + (((tickAnim - 17) / 3) * (-8.53-(-9.3)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -8.53 + (((tickAnim - 20) / 7) * (26-(-8.53)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(-0.125);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+80))*1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+20))*1.8));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-50))*0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5))*0.55);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-20))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*-1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+120))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-80))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-150))*4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-200))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-250))*-4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-150))*4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-200))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-250))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-150))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+190))*1.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-190))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+230))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-230))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+220))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-250))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.nasalLeft.setScale((float)1,(float)0,(float)0);


        this.nasalRight.setScale((float)1,(float)0,(float)0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+150))*1.2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-100))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+200))*-1.2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-150))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+250))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-200))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+300))*3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-250))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5+350))*4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-300))*6), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*1.5));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMuttaburrasaurus e = (EntityPrehistoricFloraMuttaburrasaurus) entity;
        animator.update(entity);


    }
}
