package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLoricatosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLoricatosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Loricatosaurus;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer LeftPlate11;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer RightPlate11;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer LeftSpike1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer RightSpike1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer LeftSpike2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer RightSpike2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer LeftSpike3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer RightSpike3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer LeftSpike4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer RightSpike4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer LeftSpike5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer RightSpike5;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer LeftSpike6;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer RightSpike6;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer LeftSpike7;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer RightSpike7;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer LeftSpike8;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer RightSpike8;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer LeftPlate10;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer RightPlate10;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer LeftPlate9;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer RightPlate9;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer LeftPlate8;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer RightPlate8;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer LeftPlate7;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer RightPlate7;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer LeftPlate6;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer RightPlate6;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer LeftPlate5;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer RightPlate5;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer LeftPlate4;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer RightPlate4;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer LeftPlate3;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer RightPlate3;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer LeftPlate2;
    private final AdvancedModelRenderer RightPlate2;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer LeftPlate1;
    private final AdvancedModelRenderer RightPlate1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;

    private ModelAnimator animator;

    public ModelLoricatosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Loricatosaurus = new AdvancedModelRenderer(this);
        this.Loricatosaurus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.75F, 8.75F);
        this.Loricatosaurus.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 45, 35, -6.0F, -6.25F, -4.5F, 12, 15, 9, 0.0F, false));

        this.LeftPlate11 = new AdvancedModelRenderer(this);
        this.LeftPlate11.setRotationPoint(2.25F, -5.25F, 2.75F);
        this.hips.addChild(LeftPlate11);
        this.setRotateAngle(LeftPlate11, -0.2618F, 0.0F, 0.1745F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate11.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2356F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 59, -1.0F, -6.7F, 3.6F, 1, 7, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.7F, -3.2F);
        this.LeftPlate11.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 81, -1.0F, -9.0F, 0.0F, 1, 9, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPlate11.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 81, -1.0F, -3.0F, -1.25F, 1, 3, 4, 0.0F, false));

        this.RightPlate11 = new AdvancedModelRenderer(this);
        this.RightPlate11.setRotationPoint(-2.25F, -5.25F, 2.75F);
        this.hips.addChild(RightPlate11);
        this.setRotateAngle(RightPlate11, -0.2618F, 0.0F, -0.1745F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate11.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 59, 0.0F, -6.7F, 3.6F, 1, 7, 2, -0.02F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.7F, -3.2F);
        this.RightPlate11.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 81, 0.0F, -9.0F, 0.0F, 1, 9, 2, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPlate11.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.9599F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 81, 0.0F, -3.0F, -1.25F, 1, 3, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -3.25F, 4.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 35, -4.5F, -2.5F, -1.75F, 9, 10, 13, 0.0F, false));

        this.LeftSpike1 = new AdvancedModelRenderer(this);
        this.LeftSpike1.setRotationPoint(2.0F, -2.5F, 3.5F);
        this.tail1.addChild(LeftSpike1);
        this.setRotateAngle(LeftSpike1, 1.309F, 0.0F, 0.2618F);
        this.LeftSpike1.cubeList.add(new ModelBox(LeftSpike1, 95, 0, -1.0F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 95, -1.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 97, -1.0F, -1.0F, -11.0F, 1, 1, 7, -0.02F, false));

        this.RightSpike1 = new AdvancedModelRenderer(this);
        this.RightSpike1.setRotationPoint(-2.0F, -2.5F, 3.5F);
        this.tail1.addChild(RightSpike1);
        this.setRotateAngle(RightSpike1, 1.309F, 0.0F, -0.2618F);
        this.RightSpike1.cubeList.add(new ModelBox(RightSpike1, 95, 0, 0.0F, -1.0F, -1.0F, 1, 1, 11, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 95, 0.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 97, 0.0F, -1.0F, -11.0F, 1, 1, 7, -0.02F, true));

        this.LeftSpike2 = new AdvancedModelRenderer(this);
        this.LeftSpike2.setRotationPoint(1.75F, -3.0F, 8.75F);
        this.tail1.addChild(LeftSpike2);
        this.setRotateAngle(LeftSpike2, 1.1781F, 0.0F, 0.3491F);
        this.LeftSpike2.cubeList.add(new ModelBox(LeftSpike2, 0, 81, -1.0F, -1.0F, -2.0F, 1, 1, 12, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 93, 59, -1.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 59, -1.0F, -1.0F, -11.0F, 1, 1, 7, -0.02F, false));

        this.RightSpike2 = new AdvancedModelRenderer(this);
        this.RightSpike2.setRotationPoint(-1.75F, -3.0F, 8.75F);
        this.tail1.addChild(RightSpike2);
        this.setRotateAngle(RightSpike2, 1.1781F, 0.0F, -0.3491F);
        this.RightSpike2.cubeList.add(new ModelBox(RightSpike2, 0, 81, 0.0F, -1.0F, -2.0F, 1, 1, 12, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 93, 59, 0.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 59, 0.0F, -1.0F, -11.0F, 1, 1, 7, -0.02F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 10.25F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 45, 60, -3.0F, -2.0F, 0.0F, 6, 7, 12, 0.0F, false));

        this.LeftSpike3 = new AdvancedModelRenderer(this);
        this.LeftSpike3.setRotationPoint(1.75F, -2.5F, 4.25F);
        this.tail2.addChild(LeftSpike3);
        this.setRotateAngle(LeftSpike3, 1.2217F, 0.0F, 0.4363F);
        this.LeftSpike3.cubeList.add(new ModelBox(LeftSpike3, 33, 80, -1.0F, -1.0F, -2.0F, 1, 1, 12, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 93, 17, -1.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 81, -1.0F, -1.0F, -11.5F, 1, 1, 6, -0.02F, false));

        this.RightSpike3 = new AdvancedModelRenderer(this);
        this.RightSpike3.setRotationPoint(-1.75F, -2.5F, 4.25F);
        this.tail2.addChild(RightSpike3);
        this.setRotateAngle(RightSpike3, 1.2217F, 0.0F, -0.4363F);
        this.RightSpike3.cubeList.add(new ModelBox(RightSpike3, 33, 80, 0.0F, -1.0F, -2.0F, 1, 1, 12, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 93, 17, 0.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 81, 0.0F, -1.0F, -11.5F, 1, 1, 6, -0.02F, true));

        this.LeftSpike4 = new AdvancedModelRenderer(this);
        this.LeftSpike4.setRotationPoint(1.5F, -1.75F, 9.75F);
        this.tail2.addChild(LeftSpike4);
        this.setRotateAngle(LeftSpike4, 1.1345F, 0.0F, 0.5236F);
        this.LeftSpike4.cubeList.add(new ModelBox(LeftSpike4, 92, 87, -1.0F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 100, -1.0F, -1.0F, -10.0F, 1, 1, 10, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 0, -1.0F, -1.0F, -10.5F, 1, 1, 5, -0.02F, false));

        this.RightSpike4 = new AdvancedModelRenderer(this);
        this.RightSpike4.setRotationPoint(-1.5F, -1.75F, 9.75F);
        this.tail2.addChild(RightSpike4);
        this.setRotateAngle(RightSpike4, 1.1345F, 0.0F, -0.5236F);
        this.RightSpike4.cubeList.add(new ModelBox(RightSpike4, 92, 87, 0.0F, -1.0F, -1.0F, 1, 1, 11, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 100, 0.0F, -1.0F, -10.0F, 1, 1, 10, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 78, 0, 0.0F, -1.0F, -10.5F, 1, 1, 5, -0.02F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 61, 15, -2.0F, -1.5F, -1.0F, 4, 5, 10, 0.0F, false));

        this.LeftSpike5 = new AdvancedModelRenderer(this);
        this.LeftSpike5.setRotationPoint(1.0F, -0.25F, 4.5F);
        this.tail3.addChild(LeftSpike5);
        this.setRotateAngle(LeftSpike5, 1.1345F, 0.0F, 0.6109F);
        this.LeftSpike5.cubeList.add(new ModelBox(LeftSpike5, 48, 80, -1.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 106, 84, -1.0F, -1.0F, -9.0F, 1, 1, 9, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 109, -1.0F, -1.0F, -9.5F, 1, 1, 4, -0.02F, false));

        this.RightSpike5 = new AdvancedModelRenderer(this);
        this.RightSpike5.setRotationPoint(-1.0F, -0.25F, 4.5F);
        this.tail3.addChild(RightSpike5);
        this.setRotateAngle(RightSpike5, 1.1345F, 0.0F, -0.6109F);
        this.RightSpike5.cubeList.add(new ModelBox(RightSpike5, 48, 80, 0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 106, 84, 0.0F, -1.0F, -9.0F, 1, 1, 9, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 109, 0.0F, -1.0F, -9.5F, 1, 1, 4, -0.02F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 25, 97, -1.5F, -1.25F, 0.0F, 3, 3, 9, 0.0F, false));

        this.LeftSpike6 = new AdvancedModelRenderer(this);
        this.LeftSpike6.setRotationPoint(0.0F, 1.65F, 2.5F);
        this.tail4.addChild(LeftSpike6);
        this.setRotateAngle(LeftSpike6, 1.2217F, 0.0F, 0.6981F);
        this.LeftSpike6.cubeList.add(new ModelBox(LeftSpike6, 109, 0, -1.0F, -1.0F, 2.0F, 1, 1, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike6.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 108, -1.0F, -1.0F, -8.0F, 1, 1, 8, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 109, 0, -1.0F, -1.0F, -7.5F, 1, 1, 2, -0.02F, false));

        this.RightSpike6 = new AdvancedModelRenderer(this);
        this.RightSpike6.setRotationPoint(0.0F, 1.65F, 2.5F);
        this.tail4.addChild(RightSpike6);
        this.setRotateAngle(RightSpike6, 1.2217F, 0.0F, -0.6981F);
        this.RightSpike6.cubeList.add(new ModelBox(RightSpike6, 109, 0, 0.0F, -1.0F, 2.0F, 1, 1, 8, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 108, 0.0F, -1.0F, -8.0F, 1, 1, 8, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike6.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 109, 0, 0.0F, -1.0F, -7.5F, 1, 1, 2, -0.02F, true));

        this.LeftSpike7 = new AdvancedModelRenderer(this);
        this.LeftSpike7.setRotationPoint(2.5F, -0.75F, 9.2F);
        this.tail4.addChild(LeftSpike7);
        this.setRotateAngle(LeftSpike7, 1.0036F, 0.0F, 0.8727F);
        this.LeftSpike7.cubeList.add(new ModelBox(LeftSpike7, 77, 18, -1.0F, -1.0F, -3.0F, 1, 1, 13, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike7.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0855F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 3, -1.0F, -1.0F, -12.0F, 1, 1, 12, -0.01F, false));

        this.RightSpike7 = new AdvancedModelRenderer(this);
        this.RightSpike7.setRotationPoint(-2.5F, -0.75F, 9.2F);
        this.tail4.addChild(RightSpike7);
        this.setRotateAngle(RightSpike7, 1.0036F, 0.0F, -0.8727F);
        this.RightSpike7.cubeList.add(new ModelBox(RightSpike7, 77, 18, 0.0F, -1.0F, -3.0F, 1, 1, 13, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike7.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0855F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 80, 3, 0.0F, -1.0F, -12.0F, 1, 1, 12, -0.01F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 103, 72, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));

        this.LeftSpike8 = new AdvancedModelRenderer(this);
        this.LeftSpike8.setRotationPoint(1.5F, -0.1F, 5.95F);
        this.tail5.addChild(LeftSpike8);
        this.setRotateAngle(LeftSpike8, 0.6109F, 0.0F, 1.0472F);
        this.LeftSpike8.cubeList.add(new ModelBox(LeftSpike8, 75, 47, -1.0F, -1.0F, -3.0F, 1, 1, 13, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.LeftSpike8.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 84, -1.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, false));

        this.RightSpike8 = new AdvancedModelRenderer(this);
        this.RightSpike8.setRotationPoint(-1.5F, -0.1F, 5.95F);
        this.tail5.addChild(RightSpike8);
        this.setRotateAngle(RightSpike8, 0.6109F, 0.0F, -1.0472F);
        this.RightSpike8.cubeList.add(new ModelBox(RightSpike8, 75, 47, 0.0F, -1.0F, -3.0F, 1, 1, 13, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.RightSpike8.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0873F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 16, 84, 0.0F, -1.0F, -11.0F, 1, 1, 11, -0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.5F, -4.25F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -2.75F, -14.5F, 14, 18, 16, 0.0F, false));

        this.LeftPlate10 = new AdvancedModelRenderer(this);
        this.LeftPlate10.setRotationPoint(2.5F, -2.25F, 1.25F);
        this.body.addChild(LeftPlate10);
        this.setRotateAngle(LeftPlate10, -0.3054F, 0.0F, 0.1745F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate10.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2356F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 79, 41, -1.0F, -2.7F, 3.1F, 1, 1, 1, -0.03F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 80, -1.0F, -5.7F, 3.6F, 1, 6, 2, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate10.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.288F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 94, -1.0F, -8.0F, 0.0F, 1, 8, 2, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPlate10.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.9599F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 35, -1.0F, -4.0F, -1.25F, 1, 4, 4, 0.0F, false));

        this.RightPlate10 = new AdvancedModelRenderer(this);
        this.RightPlate10.setRotationPoint(-2.5F, -2.25F, 1.25F);
        this.body.addChild(RightPlate10);
        this.setRotateAngle(RightPlate10, -0.3054F, 0.0F, -0.1745F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate10.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2356F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 79, 41, 0.0F, -2.7F, 3.1F, 1, 1, 1, -0.03F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 48, 80, 0.0F, -5.7F, 3.6F, 1, 6, 2, -0.02F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate10.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.288F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 41, 94, 0.0F, -8.0F, 0.0F, 1, 8, 2, -0.01F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPlate10.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.9599F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 35, 0.0F, -4.0F, -1.25F, 1, 4, 4, 0.0F, true));

        this.LeftPlate9 = new AdvancedModelRenderer(this);
        this.LeftPlate9.setRotationPoint(2.75F, -2.75F, -4.75F);
        this.body.addChild(LeftPlate9);
        this.setRotateAngle(LeftPlate9, 0.0F, 0.0F, 0.1745F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate9.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2356F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 80, 22, -1.0F, -2.7F, 3.1F, 1, 1, 1, -0.03F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 106, 84, -1.0F, -5.7F, 3.6F, 1, 6, 2, -0.02F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate9.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.288F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 95, -1.0F, -8.0F, 0.0F, 1, 8, 2, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPlate9.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.9599F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 61, 80, -1.0F, -4.0F, -1.25F, 1, 4, 4, 0.0F, false));

        this.RightPlate9 = new AdvancedModelRenderer(this);
        this.RightPlate9.setRotationPoint(-2.75F, -2.75F, -4.75F);
        this.body.addChild(RightPlate9);
        this.setRotateAngle(RightPlate9, 0.0F, 0.0F, -0.1745F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate9.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2356F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 80, 22, 0.0F, -2.7F, 3.1F, 1, 1, 1, -0.03F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 106, 84, 0.0F, -5.7F, 3.6F, 1, 6, 2, -0.02F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate9.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.288F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 95, 0.0F, -8.0F, 0.0F, 1, 8, 2, -0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPlate9.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.9599F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 61, 80, 0.0F, -4.0F, -1.25F, 1, 4, 4, 0.0F, true));

        this.LeftPlate8 = new AdvancedModelRenderer(this);
        this.LeftPlate8.setRotationPoint(2.5F, -2.25F, -11.0F);
        this.body.addChild(LeftPlate8);
        this.setRotateAngle(LeftPlate8, -0.0873F, 0.0F, 0.1745F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.LeftPlate8.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.4538F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 70, 109, -1.0F, -4.5F, 3.45F, 1, 6, 2, -0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -0.7F, -3.2F);
        this.LeftPlate8.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0262F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 61, 15, -1.0F, -7.0F, 0.0F, 1, 7, 2, -0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftPlate8.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.9599F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 93, 17, -1.0F, -3.0F, -1.25F, 1, 3, 4, 0.0F, false));

        this.RightPlate8 = new AdvancedModelRenderer(this);
        this.RightPlate8.setRotationPoint(-2.5F, -2.25F, -11.0F);
        this.body.addChild(RightPlate8);
        this.setRotateAngle(RightPlate8, -0.0873F, 0.0F, -0.1745F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -1.2F, -3.95F);
        this.RightPlate8.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.4538F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 70, 109, 0.0F, -4.5F, 3.45F, 1, 6, 2, -0.02F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.7F, -3.2F);
        this.RightPlate8.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0262F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 61, 15, 0.0F, -7.0F, 0.0F, 1, 7, 2, -0.01F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightPlate8.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.9599F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 93, 17, 0.0F, -3.0F, -1.25F, 1, 3, 4, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.75F, -10.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.2182F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 59, -6.0F, 2.0F, -10.5F, 12, 11, 10, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.75F, -10.25F);
        this.chest.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.6981F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 45, 0, -6.0F, -0.25F, -0.6F, 12, 6, 8, -0.01F, false));

        this.LeftPlate7 = new AdvancedModelRenderer(this);
        this.LeftPlate7.setRotationPoint(2.25F, -2.25F, -6.65F);
        this.chest.addChild(LeftPlate7);
        this.setRotateAngle(LeftPlate7, 0.6981F, 0.0F, 0.1745F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate7.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 2.2689F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 88, 33, -1.0F, 0.15F, -2.25F, 1, 3, 2, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate7.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 1.5272F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 108, -1.0F, 2.1F, 0.95F, 1, 1, 2, -0.03F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 45, 60, -1.0F, 2.8F, 0.45F, 1, 1, 4, -0.02F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate7.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 1.0472F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 79, 33, -1.0F, 0.3F, 0.05F, 1, 1, 6, -0.01F, false));

        this.RightPlate7 = new AdvancedModelRenderer(this);
        this.RightPlate7.setRotationPoint(-2.25F, -2.25F, -6.65F);
        this.chest.addChild(RightPlate7);
        this.setRotateAngle(RightPlate7, 0.6981F, 0.0F, -0.1745F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate7.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 2.2689F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 88, 33, 0.0F, 0.15F, -2.25F, 1, 3, 2, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate7.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 1.5272F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 108, 0.0F, 2.1F, 0.95F, 1, 1, 2, -0.03F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 45, 60, 0.0F, 2.8F, 0.45F, 1, 1, 4, -0.02F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate7.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 1.0472F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 79, 33, 0.0F, 0.3F, 0.05F, 1, 1, 6, -0.01F, true));

        this.LeftPlate6 = new AdvancedModelRenderer(this);
        this.LeftPlate6.setRotationPoint(2.0F, 0.15F, -8.85F);
        this.chest.addChild(LeftPlate6);
        this.setRotateAngle(LeftPlate6, 0.829F, 0.0F, 0.1745F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate6.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 1.6144F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 48, 94, -1.0F, 1.15F, -0.75F, 1, 1, 2, -0.02F, false));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 80, 17, -1.0F, 2.0F, -0.5F, 1, 1, 3, -0.01F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate6.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 1.0036F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 95, 0, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.RightPlate6 = new AdvancedModelRenderer(this);
        this.RightPlate6.setRotationPoint(-2.0F, 0.15F, -8.85F);
        this.chest.addChild(RightPlate6);
        this.setRotateAngle(RightPlate6, 0.829F, 0.0F, -0.1745F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate6.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.6144F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 48, 94, 0.0F, 1.15F, -0.75F, 1, 1, 2, -0.02F, true));
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 80, 17, 0.0F, 2.0F, -0.5F, 1, 1, 3, -0.01F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate6.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.0036F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 95, 0, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(5.25F, 10.0F, -7.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.5672F, 0.0F, -0.2618F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 100, 100, -2.0F, -2.0F, -2.0F, 4, 10, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.25F, 8.0F, 1.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.6109F, 0.0F, 0.3054F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -1.5F, -1.0F, -3.0F, 3, 9, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1309F, 0.1745F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 32, 35, -2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-5.25F, 10.0F, -7.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.5672F, 0.0F, 0.2618F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 100, 100, -2.0F, -2.0F, -2.0F, 4, 10, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.25F, 8.0F, 1.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.6109F, 0.0F, -0.3054F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -1.5F, -1.0F, -3.0F, 3, 9, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1309F, -0.1745F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 32, 35, -2.0F, 0.0F, -3.5F, 4, 2, 5, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.0436F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 91, 45, -4.0F, 0.0F, -5.0F, 8, 8, 5, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck1.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.6981F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 70, 62, -4.0F, 0.0F, 0.0F, 8, 3, 4, -0.01F, false));

        this.LeftPlate5 = new AdvancedModelRenderer(this);
        this.LeftPlate5.setRotationPoint(1.75F, -1.25F, -3.25F);
        this.neck1.addChild(LeftPlate5);
        this.setRotateAngle(LeftPlate5, 0.829F, 0.0F, 0.1745F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate5.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 1.6144F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 20, 108, -1.0F, 1.15F, -0.75F, 1, 1, 2, -0.02F, false));
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 95, 6, -1.0F, 2.0F, -0.5F, 1, 1, 3, -0.01F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.LeftPlate5.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 1.0036F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 109, 30, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.RightPlate5 = new AdvancedModelRenderer(this);
        this.RightPlate5.setRotationPoint(-1.75F, -1.25F, -3.25F);
        this.neck1.addChild(RightPlate5);
        this.setRotateAngle(RightPlate5, 0.829F, 0.0F, -0.1745F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate5.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 1.6144F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 20, 108, 0.0F, 1.15F, -0.75F, 1, 1, 2, -0.02F, true));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 95, 6, 0.0F, 2.0F, -0.5F, 1, 1, 3, -0.01F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.RightPlate5.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 1.0036F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 109, 30, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 77, 100, -2.5F, -1.75F, -4.5F, 5, 6, 6, -0.01F, false));

        this.LeftPlate4 = new AdvancedModelRenderer(this);
        this.LeftPlate4.setRotationPoint(1.5F, -1.75F, -0.25F);
        this.neck2.addChild(LeftPlate4);
        this.setRotateAngle(LeftPlate4, 0.0F, 0.0F, 0.1745F);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.LeftPlate4.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.2182F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 32, 35, -1.0F, -1.9F, 0.9F, 1, 3, 1, -0.01F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.LeftPlate4.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.1745F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 78, 0, -1.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F, false));

        this.RightPlate4 = new AdvancedModelRenderer(this);
        this.RightPlate4.setRotationPoint(-1.5F, -1.75F, -0.25F);
        this.neck2.addChild(RightPlate4);
        this.setRotateAngle(RightPlate4, 0.0F, 0.0F, -0.1745F);


        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.RightPlate4.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.2182F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 32, 35, 0.0F, -1.9F, 0.9F, 1, 3, 1, -0.01F, true));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.RightPlate4.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -0.1745F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 78, 0, 0.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F, true));

        this.LeftPlate3 = new AdvancedModelRenderer(this);
        this.LeftPlate3.setRotationPoint(1.25F, -1.5F, -3.0F);
        this.neck2.addChild(LeftPlate3);
        this.setRotateAngle(LeftPlate3, -0.0873F, 0.0F, 0.1745F);


        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.LeftPlate3.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.2182F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 11, 0, -1.0F, -1.9F, 0.9F, 1, 2, 1, -0.01F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.LeftPlate3.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.1745F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 79, 33, -1.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F, false));

        this.RightPlate3 = new AdvancedModelRenderer(this);
        this.RightPlate3.setRotationPoint(-1.25F, -1.5F, -3.0F);
        this.neck2.addChild(RightPlate3);
        this.setRotateAngle(RightPlate3, -0.0873F, 0.0F, -0.1745F);


        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.RightPlate3.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.2182F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 11, 0, 0.0F, -1.9F, 0.9F, 1, 2, 1, -0.01F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.RightPlate3.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.1745F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 79, 33, 0.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F, true));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.25F, -4.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 107, 59, -2.0F, -1.25F, -3.5F, 4, 5, 5, -0.01F, false));

        this.LeftPlate2 = new AdvancedModelRenderer(this);
        this.LeftPlate2.setRotationPoint(0.75F, -1.25F, -2.0F);
        this.neck3.addChild(LeftPlate2);
        this.setRotateAngle(LeftPlate2, 0.0F, 0.0F, 0.1745F);
        this.LeftPlate2.cubeList.add(new ModelBox(LeftPlate2, 7, 81, 0.0F, -1.5F, -0.85F, 0, 2, 2, 0.0F, false));

        this.RightPlate2 = new AdvancedModelRenderer(this);
        this.RightPlate2.setRotationPoint(-0.75F, -1.25F, -2.0F);
        this.neck3.addChild(RightPlate2);
        this.setRotateAngle(RightPlate2, 0.0F, 0.0F, -0.1745F);
        this.RightPlate2.cubeList.add(new ModelBox(RightPlate2, 7, 81, 0.0F, -1.5F, -0.85F, 0, 2, 2, 0.0F, true));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.3927F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 95, 72, -1.5F, -1.25F, -3.75F, 3, 3, 4, -0.01F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, 2.7F, -3.15F);
        this.neck4.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.1745F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 11, 108, -1.0F, -2.3F, 0.0F, 2, 2, 4, 0.0F, false));

        this.LeftPlate1 = new AdvancedModelRenderer(this);
        this.LeftPlate1.setRotationPoint(0.5F, -1.25F, -1.75F);
        this.neck4.addChild(LeftPlate1);
        this.setRotateAngle(LeftPlate1, 0.0F, 0.0F, 0.1745F);
        this.LeftPlate1.cubeList.add(new ModelBox(LeftPlate1, 0, 0, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.RightPlate1 = new AdvancedModelRenderer(this);
        this.RightPlate1.setRotationPoint(-0.5F, -1.25F, -1.75F);
        this.neck4.addChild(RightPlate1);
        this.setRotateAngle(RightPlate1, 0.0F, 0.0F, -0.1745F);
        this.RightPlate1.cubeList.add(new ModelBox(RightPlate1, 0, 0, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.25F, -3.5F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 94, 100, -0.5F, 0.0F, -5.75F, 1, 1, 3, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 89, -1.0F, 0.0F, -3.5F, 2, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 43, -1.5F, -1.0F, -1.75F, 3, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 60, 0.75F, 0.25F, -2.95F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 60, -0.75F, 0.25F, -2.95F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 52, 66, 0.55F, -0.6F, -1.65F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 52, 66, -1.55F, -0.6F, -1.65F, 1, 1, 1, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-1.5F, -0.05F, 0.25F);
        this.head.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0F, -0.0873F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 107, 24, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(1.5F, -0.05F, 0.25F);
        this.head.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.0F, 0.0873F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 107, 24, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.head.addChild(bone3);
        this.setRotateAngle(bone3, 0.2182F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 24, 97, -0.5F, 0.0F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone3.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0436F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 70, 31, -1.0F, 0.0F, 0.15F, 2, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.0F, -0.2F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0349F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 44, -1.0F, -0.25F, -1.55F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 7, 35, 1.2F, -0.48F, -2.75F, 0, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 7, 35, -0.2F, -0.48F, -2.75F, 0, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 95, 62, 0.0F, -0.25F, -5.55F, 1, 1, 3, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 68, -0.5F, -0.25F, -3.3F, 2, 1, 2, -0.01F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.1F, -0.25F, -2.75F);
        this.jaw.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.4363F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 14, 97, -0.36F, -0.95F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 46, 35, -0.37F, -0.95F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 14, 97, 1.56F, -0.95F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 46, 35, 1.57F, -0.95F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.1F, -0.25F, -2.75F);
        this.jaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, -0.0873F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 35, 59, -0.35F, -1.45F, 0.3F, 0, 2, 3, 0.0F, true));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 45, 0, -0.38F, -1.45F, 0.3F, 0, 2, 3, 0.0F, true));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 35, 59, 1.55F, -1.45F, 0.3F, 0, 2, 3, 0.0F, false));
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 45, 0, 1.58F, -1.45F, 0.3F, 0, 2, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 0.7782F, -1.5129F);
        this.jaw.addChild(throat);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.5F, -0.0282F, -2.0371F);
        this.throat.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.2618F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 61, 31, -1.5F, -1.0F, 1.95F, 2, 1, 2, -0.02F, false));
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 109, 4, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.03F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1745F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 74, 72, -1.5F, -3.0F, -4.0F, 6, 17, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 13.0F, -1.5F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6545F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 54, 92, -1.0F, -1.0F, -2.0F, 5, 10, 6, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.0F, 3.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 107, 13, -0.5F, -0.5F, -6.0F, 4, 4, 6, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 2.0F, -1.75F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.2182F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 88, 33, -1.5F, 0.0F, -6.5F, 6, 3, 8, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1745F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 74, 72, -4.5F, -3.0F, -4.0F, 6, 17, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 13.0F, -1.5F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6545F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 54, 92, -4.0F, -1.0F, -2.0F, 5, 10, 6, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.0F, 3.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 107, 13, -3.5F, -0.5F, -6.0F, 4, 4, 6, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 2.0F, -1.75F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.2182F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 88, 33, -4.5F, 0.0F, -6.5F, 6, 3, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraLoricatosaurus)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Loricatosaurus.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Loricatosaurus.offsetY = 0.F;
        this.Loricatosaurus.offsetX = 1.3F;
        this.Loricatosaurus.rotateAngleY = (float)Math.toRadians(180);
        this.Loricatosaurus.rotateAngleX = (float)Math.toRadians(10);
        this.Loricatosaurus.rotateAngleZ = (float)Math.toRadians(-10);
        this.Loricatosaurus.scaleChildren = true;
        float scaler = 0.6F;
        this.Loricatosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Loricatosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Loricatosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Loricatosaurus.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Loricatosaurus.offsetY = -0.13F;
        this.Loricatosaurus.render(0.01f);
        this.Loricatosaurus.setScale(1F,1F,1F);
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

        EntityPrehistoricFloraLoricatosaurus Loricatosaurus = (EntityPrehistoricFloraLoricatosaurus) e;
        if (Loricatosaurus.getIsSneaking()) {
            this.faceTarget(f3, f4, 1, this.Loricatosaurus);
        }
        this.faceTarget(f3, f4, 14, neck1);
        this.faceTarget(f3, f4, 14, neck2);
        this.faceTarget(f3, f4, 14, neck3);
        this.faceTarget(f3, f4, 14, neck4);
        this.faceTarget(f3, f4, 14, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Loricatosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Loricatosaurus.getAnimation() == Loricatosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!Loricatosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !Loricatosaurus.getIsMoving()) {
                    if (Loricatosaurus.getAnimation() != Loricatosaurus.EAT_ANIMATION
                            && Loricatosaurus.getAnimation() != Loricatosaurus.DRINK_ANIMATION
                            && Loricatosaurus.getAnimation() != Loricatosaurus.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (Loricatosaurus.getAnimation() != Loricatosaurus.ATTACK_ANIMATION) {
                        this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    }

                    return;
                }

                if (Loricatosaurus.getIsFast()) { //Running
                    if (Loricatosaurus.getIsSneaking()) {

                    }
                    else { //normal run:

                    }

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

        EntityPrehistoricFloraLoricatosaurus ee = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animSneaking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar/warn anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The ambient noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 220;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 87) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1 + (((tickAnim - 40) / 47) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*1)));
            yy = 0 + (((tickAnim - 40) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 47) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 220) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*1 + (((tickAnim - 87) / 133) * (0-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*1)));
            yy = 0 + (((tickAnim - 87) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 133) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 87) {
            xx = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2 + (((tickAnim - 40) / 47) * (2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-2-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2)));
            yy = 0 + (((tickAnim - 40) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 47) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 220) {
            xx = 2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-2 + (((tickAnim - 87) / 133) * (0-(2.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*-2)));
            yy = 0 + (((tickAnim - 87) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 133) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 87) {
            xx = 0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2 + (((tickAnim - 40) / 47) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+20))*4-(0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*2)));
            yy = 0 + (((tickAnim - 40) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 47) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 220) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+20))*4 + (((tickAnim - 87) / 133) * (0-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+20))*4)));
            yy = 0 + (((tickAnim - 87) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 133) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 87) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*4 + (((tickAnim - 40) / 47) * (5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*4-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*4)));
            yy = 0 + (((tickAnim - 40) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 47) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 220) {
            xx = 5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*4 + (((tickAnim - 87) / 133) * (0-(5.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*4)));
            yy = 0 + (((tickAnim - 87) / 133) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 133) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 88) {
            xx = 6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*6 + (((tickAnim - 40) / 48) * (10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-4-(6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-50))*6)));
            yy = 0 + (((tickAnim - 40) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 48) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 220) {
            xx = 10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-4 + (((tickAnim - 88) / 132) * (0-(10.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-4)));
            yy = 0 + (((tickAnim - 88) / 132) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 132) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 3.5 + (((tickAnim - 40) / 140) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 3.5 + (((tickAnim - 180) / 40) * (0-(3.5)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 2 + (((tickAnim - 40) / 140) * (2-(2)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 2 + (((tickAnim - 180) / 40) * (0-(2)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -3 + (((tickAnim - 40) / 140) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3 + (((tickAnim - 180) / 40) * (0-(-3)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-18.82308-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.70318-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.34677-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -18.82308 + (((tickAnim - 40) / 140) * (-18.82308-(-18.82308)));
            yy = 4.70318 + (((tickAnim - 40) / 140) * (4.70318-(4.70318)));
            zz = 0.34677 + (((tickAnim - 40) / 140) * (0.34677-(0.34677)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -18.82308 + (((tickAnim - 180) / 40) * (0-(-18.82308)));
            yy = 4.70318 + (((tickAnim - 180) / 40) * (0-(4.70318)));
            zz = 0.34677 + (((tickAnim - 180) / 40) * (0-(0.34677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 18 + (((tickAnim - 40) / 140) * (18-(18)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 18 + (((tickAnim - 180) / 40) * (0-(18)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -3 + (((tickAnim - 40) / 140) * (-3-(-3)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -3 + (((tickAnim - 180) / 40) * (0-(-3)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-18.82308-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-4.70318-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.34677-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -18.82308 + (((tickAnim - 40) / 140) * (-18.82308-(-18.82308)));
            yy = -4.70318 + (((tickAnim - 40) / 140) * (-4.70318-(-4.70318)));
            zz = -0.34677 + (((tickAnim - 40) / 140) * (-0.34677-(-0.34677)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -18.82308 + (((tickAnim - 180) / 40) * (0-(-18.82308)));
            yy = -4.70318 + (((tickAnim - 180) / 40) * (0-(-4.70318)));
            zz = -0.34677 + (((tickAnim - 180) / 40) * (0-(-0.34677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 18 + (((tickAnim - 40) / 140) * (18-(18)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 18 + (((tickAnim - 180) / 40) * (0-(18)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = -1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5 + (((tickAnim - 40) / 140) * (7.25-(-1.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*5)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 7.25 + (((tickAnim - 180) / 40) * (0-(7.25)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 120) {
            xx = 5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6 + (((tickAnim - 40) / 80) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6-(5.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6)));
            yy = 0 + (((tickAnim - 40) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 80) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6 + (((tickAnim - 120) / 60) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*6-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-6)));
            yy = 0 + (((tickAnim - 120) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*6 + (((tickAnim - 180) / 40) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*6)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 10 + (((tickAnim - 40) / 140) * (-1.5-(10)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -1.5 + (((tickAnim - 180) / 40) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 64) {
            xx = 18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 40) / 24) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(18+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 40) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 24) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 64) / 9) * (23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 64) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 73) / 11) * (22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 119) {
            xx = 22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 84) / 35) * (17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 84) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 35) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 128) {
            xx = 17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 119) / 9) * (23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(17.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 119) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 9) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 128) / 11) * (22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(23.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 180) {
            xx = 22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 139) / 41) * (14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(22+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 139) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 41) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 180) / 40) * (0-(14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 64) {
            xx = 12 + (((tickAnim - 40) / 24) * (0-(12)));
            yy = 0 + (((tickAnim - 40) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 24) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 64) / 9) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 64) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = -8.5 + (((tickAnim - 73) / 11) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 84) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 35) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 119) / 9) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 119) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 9) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = -8.5 + (((tickAnim - 128) / 11) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 139) / 41) * (13-(0)));
            yy = 0 + (((tickAnim - 139) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 41) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 13 + (((tickAnim - 180) / 40) * (0-(13)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 40) * (0.175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            zz = 0.175 + (((tickAnim - 40) / 99) * (0-(0.175)));
        }
        else if (tickAnim >= 139 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 139) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 41) * (0.075-(0)));
            zz = 0 + (((tickAnim - 139) / 41) * (0.2-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            yy = 0.075 + (((tickAnim - 180) / 40) * (0-(0.075)));
            zz = 0.2 + (((tickAnim - 180) / 40) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 40) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 24) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 64) / 9) * (20.75-(0)));
            yy = 0 + (((tickAnim - 64) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 9) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 84) {
            xx = 20.75 + (((tickAnim - 73) / 11) * (0-(20.75)));
            yy = 0 + (((tickAnim - 73) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 11) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 84) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 35) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 119) / 9) * (20.75-(0)));
            yy = 0 + (((tickAnim - 119) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 9) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = 20.75 + (((tickAnim - 128) / 11) * (0-(20.75)));
            yy = 0 + (((tickAnim - 128) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 84) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 84) / 15) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 84) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 15) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = -16.25 + (((tickAnim - 99) / 21) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 99) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 21) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 120) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 19) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 139) / 15) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 139) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 15) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 175) {
            xx = -16.25 + (((tickAnim - 154) / 21) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 154) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 0) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 99) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 99) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 99) / 55) * (0-(0)));
            yy = 0.1 + (((tickAnim - 99) / 55) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 99) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 0) / 84) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 84) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 84) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 99) {
            xx = 1 + (((tickAnim - 84) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 84) / 15) * (0.7175-(1)));
            zz = 1 + (((tickAnim - 84) / 15) * (1-(1)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 99) / 21) * (1-(1)));
            yy = 0.7175 + (((tickAnim - 99) / 21) * (1-(0.7175)));
            zz = 1 + (((tickAnim - 99) / 21) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 139) {
            xx = 1 + (((tickAnim - 120) / 19) * (1-(1)));
            yy = 1 + (((tickAnim - 120) / 19) * (1-(1)));
            zz = 1 + (((tickAnim - 120) / 19) * (1-(1)));
        }
        else if (tickAnim >= 139 && tickAnim < 154) {
            xx = 1 + (((tickAnim - 139) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 139) / 15) * (0.7175-(1)));
            zz = 1 + (((tickAnim - 139) / 15) * (1-(1)));
        }
        else if (tickAnim >= 154 && tickAnim < 175) {
            xx = 1 + (((tickAnim - 154) / 21) * (1-(1)));
            yy = 0.7175 + (((tickAnim - 154) / 21) * (1-(0.7175)));
            zz = 1 + (((tickAnim - 154) / 21) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -5.75 + (((tickAnim - 17) / 17) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 34) / 16) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-4.85-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -4.85 + (((tickAnim - 17) / 17) * (-4.85-(-4.85)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -4.85 + (((tickAnim - 34) / 16) * (0-(-4.85)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -7.75 + (((tickAnim - 17) / 17) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 34) / 16) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.9-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -7.9 + (((tickAnim - 7) / 10) * (-9.25-(-7.9)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -9.25 + (((tickAnim - 17) / 17) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 34) / 6) * (-7.34-(-9.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7.34 + (((tickAnim - 40) / 10) * (0-(-7.34)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.15-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = -4.15 + (((tickAnim - 7) / 10) * (-4.75-(-4.15)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -4.75 + (((tickAnim - 17) / 17) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.75 + (((tickAnim - 34) / 6) * (-8-(-4.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 40) / 10) * (0-(-8)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0.2 + (((tickAnim - 7) / 10) * (27.5-(0.2)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 27.5 + (((tickAnim - 17) / 17) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 27.5 + (((tickAnim - 34) / 6) * (13.12-(27.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 13.12 + (((tickAnim - 40) / 4) * (3.11-(13.12)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 3.11 + (((tickAnim - 44) / 6) * (0-(3.11)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 16.25 + (((tickAnim - 10) / 7) * (32.5-(16.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 32.5 + (((tickAnim - 17) / 17) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 34) / 6) * (14.78-(32.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 14.78 + (((tickAnim - 40) / 4) * (-5.18-(14.78)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.18 + (((tickAnim - 44) / 6) * (0-(-5.18)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0.5 + (((tickAnim - 17) / 17) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 34) / 16) * (0-(0.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 15.75 + (((tickAnim - 17) / 17) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 34) / 16) * (0-(15.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-33.04582-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (1.72267-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-3.04716-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -33.04582 + (((tickAnim - 17) / 17) * (-33.04582-(-33.04582)));
            yy = 1.72267 + (((tickAnim - 17) / 17) * (1.72267-(1.72267)));
            zz = -3.04716 + (((tickAnim - 17) / 17) * (-3.04716-(-3.04716)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.04582 + (((tickAnim - 34) / 16) * (0-(-33.04582)));
            yy = 1.72267 + (((tickAnim - 34) / 16) * (0-(1.72267)));
            zz = -3.04716 + (((tickAnim - 34) / 16) * (0-(-3.04716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (22.6967-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-2.61438-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (4.60611-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 22.6967 + (((tickAnim - 17) / 17) * (22.6967-(22.6967)));
            yy = -2.61438 + (((tickAnim - 17) / 17) * (-2.61438-(-2.61438)));
            zz = 4.60611 + (((tickAnim - 17) / 17) * (4.60611-(4.60611)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 22.6967 + (((tickAnim - 34) / 16) * (0-(22.6967)));
            yy = -2.61438 + (((tickAnim - 34) / 16) * (0-(-2.61438)));
            zz = 4.60611 + (((tickAnim - 34) / 16) * (0-(4.60611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 15.75 + (((tickAnim - 17) / 17) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 15.75 + (((tickAnim - 34) / 16) * (0-(15.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-33.04582-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-1.72267-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (3.04716-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -33.04582 + (((tickAnim - 17) / 17) * (-33.04582-(-33.04582)));
            yy = -1.72267 + (((tickAnim - 17) / 17) * (-1.72267-(-1.72267)));
            zz = 3.04716 + (((tickAnim - 17) / 17) * (3.04716-(3.04716)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.04582 + (((tickAnim - 34) / 16) * (0-(-33.04582)));
            yy = -1.72267 + (((tickAnim - 34) / 16) * (0-(-1.72267)));
            zz = 3.04716 + (((tickAnim - 34) / 16) * (0-(3.04716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (22.6967-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (2.61438-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-4.60611-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 22.6967 + (((tickAnim - 17) / 17) * (22.6967-(22.6967)));
            yy = 2.61438 + (((tickAnim - 17) / 17) * (2.61438-(2.61438)));
            zz = -4.60611 + (((tickAnim - 17) / 17) * (-4.60611-(-4.60611)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 22.6967 + (((tickAnim - 34) / 16) * (0-(22.6967)));
            yy = 2.61438 + (((tickAnim - 34) / 16) * (0-(2.61438)));
            zz = -4.60611 + (((tickAnim - 34) / 16) * (0-(-4.60611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -15 + (((tickAnim - 17) / 17) * (-15-(-15)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 34) / 16) * (0-(-15)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 10.5 + (((tickAnim - 17) / 17) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 34) / 16) * (0-(10.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 14.75 + (((tickAnim - 17) / 17) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 34) / 16) * (0-(14.75)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -6.5 + (((tickAnim - 17) / 17) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 34) / 16) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 12.25 + (((tickAnim - 17) / 17) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 34) / 16) * (0-(12.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 25.25 + (((tickAnim - 17) / 17) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 34) / 16) * (0-(25.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.65 + (((tickAnim - 17) / 17) * (0.65-(0.65)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.65 + (((tickAnim - 34) / 16) * (0-(0.65)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-33.98843-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.00149-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.90064-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -33.98843 + (((tickAnim - 17) / 17) * (-33.98843-(-33.98843)));
            yy = 0.00149 + (((tickAnim - 17) / 17) * (0.00149-(0.00149)));
            zz = -0.90064 + (((tickAnim - 17) / 17) * (-0.90064-(-0.90064)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.98843 + (((tickAnim - 34) / 16) * (0-(-33.98843)));
            yy = 0.00149 + (((tickAnim - 34) / 16) * (0-(0.00149)));
            zz = -0.90064 + (((tickAnim - 34) / 16) * (0-(-0.90064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 17) * (-0.2-(-0.2)));
            zz = -0.1 + (((tickAnim - 17) / 17) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 16) * (0-(-0.2)));
            zz = -0.1 + (((tickAnim - 34) / 16) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 2.25 + (((tickAnim - 17) / 17) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 34) / 16) * (0-(2.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 12.25 + (((tickAnim - 17) / 17) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 34) / 16) * (0-(12.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 25.25 + (((tickAnim - 17) / 17) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 34) / 16) * (0-(25.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.65 + (((tickAnim - 17) / 17) * (0.65-(0.65)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.65 + (((tickAnim - 34) / 16) * (0-(0.65)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-33.98843-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.00149-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.90064-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -33.98843 + (((tickAnim - 17) / 17) * (-33.98843-(-33.98843)));
            yy = 0.00149 + (((tickAnim - 17) / 17) * (0.00149-(0.00149)));
            zz = -0.90064 + (((tickAnim - 17) / 17) * (-0.90064-(-0.90064)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -33.98843 + (((tickAnim - 34) / 16) * (0-(-33.98843)));
            yy = 0.00149 + (((tickAnim - 34) / 16) * (0-(0.00149)));
            zz = -0.90064 + (((tickAnim - 34) / 16) * (0-(-0.90064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.1-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 17) * (-0.2-(-0.2)));
            zz = -0.1 + (((tickAnim - 17) / 17) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 16) * (0-(-0.2)));
            zz = -0.1 + (((tickAnim - 34) / 16) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 2.25 + (((tickAnim - 17) / 17) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 34) / 16) * (0-(2.25)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+150))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+200))*-3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+250))*-3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75+50))*-1));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-28.80129-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.6185-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.48003-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -28.80129 + (((tickAnim - 13) / 27) * (-28.80129-(-28.80129)));
            yy = -0.6185 + (((tickAnim - 13) / 27) * (-0.6185-(-0.6185)));
            zz = 9.48003 + (((tickAnim - 13) / 27) * (9.48003-(9.48003)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -28.80129 + (((tickAnim - 40) / 10) * (0-(-28.80129)));
            yy = -0.6185 + (((tickAnim - 40) / 10) * (0-(-0.6185)));
            zz = 9.48003 + (((tickAnim - 40) / 10) * (0-(9.48003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-38.36667-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.01667-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -38.36667 + (((tickAnim - 6) / 7) * (7.25-(-38.36667)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -5.01667 + (((tickAnim - 6) / 7) * (-10.75-(-5.01667)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 7.25 + (((tickAnim - 13) / 27) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = -10.75 + (((tickAnim - 13) / 27) * (-10.75-(-10.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.25 + (((tickAnim - 40) / 5) * (-38.36667-(7.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -10.75 + (((tickAnim - 40) / 5) * (-5.01667-(-10.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -38.36667 + (((tickAnim - 45) / 5) * (0-(-38.36667)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -5.01667 + (((tickAnim - 45) / 5) * (0-(-5.01667)));
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
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (96.87875-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.80437-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.43988-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 96.87875 + (((tickAnim - 6) / 7) * (22.24019-(96.87875)));
            yy = -0.80437 + (((tickAnim - 6) / 7) * (-1.72364-(-0.80437)));
            zz = 1.43988 + (((tickAnim - 6) / 7) * (3.08545-(1.43988)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 22.24019 + (((tickAnim - 13) / 27) * (22.24019-(22.24019)));
            yy = -1.72364 + (((tickAnim - 13) / 27) * (-1.72364-(-1.72364)));
            zz = 3.08545 + (((tickAnim - 13) / 27) * (3.08545-(3.08545)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 22.24019 + (((tickAnim - 40) / 5) * (96.87875-(22.24019)));
            yy = -1.72364 + (((tickAnim - 40) / 5) * (-0.80437-(-1.72364)));
            zz = 3.08545 + (((tickAnim - 40) / 5) * (1.43988-(3.08545)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 96.87875 + (((tickAnim - 45) / 5) * (0-(96.87875)));
            yy = -0.80437 + (((tickAnim - 45) / 5) * (0-(-0.80437)));
            zz = 1.43988 + (((tickAnim - 45) / 5) * (0-(1.43988)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 6) * (0.6-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.8-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 7) * (0-(0.6)));
            zz = -0.8 + (((tickAnim - 6) / 7) * (0-(-0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.6-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.8-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 45) / 5) * (0-(0.6)));
            zz = -0.8 + (((tickAnim - 45) / 5) * (0-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.37757-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-7.1092342346+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-3.02038-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = 0.37757 + (((tickAnim - 14) / 24) * (0.37757-(0.37757)));
            yy = -7.1092342346+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 14) / 24) * (-6.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(-7.1092342346+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = -3.02038 + (((tickAnim - 14) / 24) * (-3.02038-(-3.02038)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.37757 + (((tickAnim - 38) / 12) * (0-(0.37757)));
            yy = -6.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 38) / 12) * (0-(-6.4842+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            zz = -3.02038 + (((tickAnim - 38) / 12) * (0-(-3.02038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (1.1854-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-3.48408-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = 1.1854 + (((tickAnim - 14) / 24) * (1.1854-(1.1854)));
            yy = -19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*1 + (((tickAnim - 14) / 24) * (-19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*-1-(-19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*1)));
            zz = -3.48408 + (((tickAnim - 14) / 24) * (-3.48408-(-3.48408)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.1854 + (((tickAnim - 38) / 12) * (0-(1.1854)));
            yy = -19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*-1 + (((tickAnim - 38) / 12) * (0-(-19.2685701936+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160))*-1)));
            zz = -3.48408 + (((tickAnim - 38) / 12) * (0-(-3.48408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (4.08904-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-22.88956-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (3.64716-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = 4.08904 + (((tickAnim - 14) / 24) * (4.08904-(4.08904)));
            yy = -22.88956 + (((tickAnim - 14) / 24) * (-22.88956-(-22.88956)));
            zz = 3.64716 + (((tickAnim - 14) / 24) * (3.64716-(3.64716)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.08904 + (((tickAnim - 38) / 12) * (0-(4.08904)));
            yy = -22.88956 + (((tickAnim - 38) / 12) * (0-(-22.88956)));
            zz = 3.64716 + (((tickAnim - 38) / 12) * (0-(3.64716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (24.58315-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-16.23983-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.58281-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 38) {
            xx = 24.58315 + (((tickAnim - 14) / 24) * (24.58315-(24.58315)));
            yy = -16.23983 + (((tickAnim - 14) / 24) * (-16.23983-(-16.23983)));
            zz = -0.58281 + (((tickAnim - 14) / 24) * (-0.58281-(-0.58281)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 24.58315 + (((tickAnim - 38) / 12) * (0-(24.58315)));
            yy = -16.23983 + (((tickAnim - 38) / 12) * (0-(-16.23983)));
            zz = -0.58281 + (((tickAnim - 38) / 12) * (0-(-0.58281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 24 + (((tickAnim - 9) / 15) * (-6-(24)));
            yy = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 15) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -6 + (((tickAnim - 24) / 8) * (24-(-6)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 32) / 18) * (0-(24)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 17.75 + (((tickAnim - 9) / 15) * (-7.5-(17.75)));
            yy = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 15) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 24) / 8) * (17.75-(-7.5)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 32) / 18) * (0-(17.75)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 18.5 + (((tickAnim - 9) / 6) * (-20.69-(18.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.69 + (((tickAnim - 15) / 5) * (-10.59-(-20.69)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -10.59 + (((tickAnim - 20) / 4) * (9.75-(-10.59)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 9.75 + (((tickAnim - 24) / 8) * (18.5-(9.75)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 18.5 + (((tickAnim - 32) / 6) * (-20.69-(18.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -20.69 + (((tickAnim - 38) / 5) * (-10.59-(-20.69)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.59 + (((tickAnim - 43) / 7) * (0-(-10.59)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.075-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            zz = 0.075 + (((tickAnim - 9) / 15) * (0-(0.075)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0.075-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0.075 + (((tickAnim - 32) / 18) * (0-(0.075)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 30.5 + (((tickAnim - 9) / 6) * (39.77-(30.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 39.77 + (((tickAnim - 15) / 5) * (25.33-(39.77)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 25.33 + (((tickAnim - 20) / 4) * (0-(25.33)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (30.5-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 30.5 + (((tickAnim - 32) / 6) * (39.77-(30.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 39.77 + (((tickAnim - 38) / 5) * (25.33-(39.77)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25.33 + (((tickAnim - 43) / 7) * (0-(25.33)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.975-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 9) / 6) * (2.165-(0.9)));
            zz = -0.975 + (((tickAnim - 9) / 6) * (-0.965-(-0.975)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 2.165 + (((tickAnim - 15) / 5) * (1.78-(2.165)));
            zz = -0.965 + (((tickAnim - 15) / 5) * (-0.44-(-0.965)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 1.78 + (((tickAnim - 20) / 4) * (0-(1.78)));
            zz = -0.44 + (((tickAnim - 20) / 4) * (0-(-0.44)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0.9-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (-0.975-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 32) / 6) * (2.165-(0.9)));
            zz = -0.975 + (((tickAnim - 32) / 6) * (-0.965-(-0.975)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.165 + (((tickAnim - 38) / 5) * (1.78-(2.165)));
            zz = -0.965 + (((tickAnim - 38) / 5) * (-0.44-(-0.965)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.78 + (((tickAnim - 43) / 7) * (0-(1.78)));
            zz = -0.44 + (((tickAnim - 43) / 7) * (0-(-0.44)));
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
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*5 + (((tickAnim - 18) / 15) * (0-(-3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 18) / 4) * (-18.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170+50))*-5-(-10.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = -18.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170+50))*-5 + (((tickAnim - 22) / 11) * (0-(-18.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170+50))*-5)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*5 + (((tickAnim - 18) / 15) * (0-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 13 + (((tickAnim - 17) / 5) * (17.9-(13)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 17.9 + (((tickAnim - 22) / 11) * (0-(17.9)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -13.25 + (((tickAnim - 18) / 15) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.61-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.61 + (((tickAnim - 4) / 4) * (0-(6.61)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (27-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 27 + (((tickAnim - 18) / 4) * (0-(27)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 4) / 4) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1 + (((tickAnim - 4) / 4) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.5))*0.1)));
            zz = 1 + (((tickAnim - 4) / 4) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 10) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 8) * (0.8525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.2-(1)));
            zz = 1 + (((tickAnim - 10) / 8) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 18) / 4) * (1-(1)));
            yy = 0.8525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.2 + (((tickAnim - 18) / 4) * (1-(0.8525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500/0.5))*0.2)));
            zz = 1 + (((tickAnim - 18) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.06177-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.62999-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.99344-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0.06177 + (((tickAnim - 4) / 11) * (1.00599-(0.06177)));
            yy = -3.62999 + (((tickAnim - 4) / 11) * (26.99367-(-3.62999)));
            zz = -0.99344 + (((tickAnim - 4) / 11) * (2.22543-(-0.99344)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.00599 + (((tickAnim - 15) / 10) * (0-(1.00599)));
            yy = 26.99367 + (((tickAnim - 15) / 10) * (0-(26.99367)));
            zz = 2.22543 + (((tickAnim - 15) / 10) * (0-(2.22543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4 + (((tickAnim - 4) / 4) * (-5.70434-(-4)));
            yy = -7.25 + (((tickAnim - 4) / 4) * (6.78797-(-7.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (-1.85663-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -5.70434 + (((tickAnim - 8) / 7) * (-1.69041-(-5.70434)));
            yy = 6.78797 + (((tickAnim - 8) / 7) * (26.44113-(6.78797)));
            zz = -1.85663 + (((tickAnim - 8) / 7) * (-4.4559-(-1.85663)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.69041 + (((tickAnim - 15) / 10) * (0-(-1.69041)));
            yy = 26.44113 + (((tickAnim - 15) / 10) * (0-(26.44113)));
            zz = -4.4559 + (((tickAnim - 15) / 10) * (0-(-4.4559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.75 + (((tickAnim - 0) / 4) * (-5.44532-(-2.75)));
            yy = -4.75 + (((tickAnim - 0) / 4) * (-2.85848-(-4.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.71295-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = -5.44532 + (((tickAnim - 4) / 7) * (1.24564-(-5.44532)));
            yy = -2.85848 + (((tickAnim - 4) / 7) * (19.85164-(-2.85848)));
            zz = -2.71295 + (((tickAnim - 4) / 7) * (-10.21348-(-2.71295)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.24564 + (((tickAnim - 11) / 4) * (0.66943-(1.24564)));
            yy = 19.85164 + (((tickAnim - 11) / 4) * (14.82111-(19.85164)));
            zz = -10.21348 + (((tickAnim - 11) / 4) * (-6.20831-(-10.21348)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0.66943 + (((tickAnim - 15) / 6) * (0-(0.66943)));
            yy = 14.82111 + (((tickAnim - 15) / 6) * (0-(14.82111)));
            zz = -6.20831 + (((tickAnim - 15) / 6) * (0-(-6.20831)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (-4.75-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 11) / 10) * (0-(-0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-3.72708-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.66379-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.76669-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.72708 + (((tickAnim - 8) / 7) * (11.4362-(-3.72708)));
            yy = -10.66379 + (((tickAnim - 8) / 7) * (29.20728-(-10.66379)));
            zz = 5.76669 + (((tickAnim - 8) / 7) * (1.41638-(5.76669)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 11.4362 + (((tickAnim - 15) / 10) * (0-(11.4362)));
            yy = 29.20728 + (((tickAnim - 15) / 10) * (0-(29.20728)));
            zz = 1.41638 + (((tickAnim - 15) / 10) * (0-(1.41638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.5806-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.41562-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.08104-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 1.5806 + (((tickAnim - 2) / 2) * (3.1395-(1.5806)));
            yy = 0.41562 + (((tickAnim - 2) / 2) * (-9.15091-(0.41562)));
            zz = -0.08104 + (((tickAnim - 2) / 2) * (0.4355-(-0.08104)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 3.1395 + (((tickAnim - 4) / 4) * (5.84525-(3.1395)));
            yy = -9.15091 + (((tickAnim - 4) / 4) * (-3.71637-(-9.15091)));
            zz = 0.4355 + (((tickAnim - 4) / 4) * (7.38393-(0.4355)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5.84525 + (((tickAnim - 8) / 3) * (8.20563-(5.84525)));
            yy = -3.71637 + (((tickAnim - 8) / 3) * (1.20879-(-3.71637)));
            zz = 7.38393 + (((tickAnim - 8) / 3) * (-0.04504-(7.38393)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 8.20563 + (((tickAnim - 11) / 4) * (14.13566-(8.20563)));
            yy = 1.20879 + (((tickAnim - 11) / 4) * (18.47682-(1.20879)));
            zz = -0.04504 + (((tickAnim - 11) / 4) * (0.48405-(-0.04504)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 14.13566 + (((tickAnim - 15) / 4) * (9.74324-(14.13566)));
            yy = 18.47682 + (((tickAnim - 15) / 4) * (11.57186-(18.47682)));
            zz = 0.48405 + (((tickAnim - 15) / 4) * (0.25973-(0.48405)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 9.74324 + (((tickAnim - 19) / 6) * (0-(9.74324)));
            yy = 11.57186 + (((tickAnim - 19) / 6) * (0-(11.57186)));
            zz = 0.25973 + (((tickAnim - 19) / 6) * (0-(0.25973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (3.18307-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.93444-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.40674-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 3.18307 + (((tickAnim - 2) / 2) * (6.13847-(3.18307)));
            yy = 1.93444 + (((tickAnim - 2) / 2) * (-16.19475-(1.93444)));
            zz = -0.40674 + (((tickAnim - 2) / 2) * (3.40526-(-0.40674)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.13847 + (((tickAnim - 4) / 4) * (11.94642-(6.13847)));
            yy = -16.19475 + (((tickAnim - 4) / 4) * (-7.52543-(-16.19475)));
            zz = 3.40526 + (((tickAnim - 4) / 4) * (7.58462-(3.40526)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.94642 + (((tickAnim - 8) / 3) * (16.54501-(11.94642)));
            yy = -7.52543 + (((tickAnim - 8) / 3) * (-11.12794-(-7.52543)));
            zz = 7.58462 + (((tickAnim - 8) / 3) * (0.37246-(7.58462)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 16.54501 + (((tickAnim - 11) / 4) * (24.57879-(16.54501)));
            yy = -11.12794 + (((tickAnim - 11) / 4) * (16.50306-(-11.12794)));
            zz = 0.37246 + (((tickAnim - 11) / 4) * (-1.98989-(0.37246)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 24.57879 + (((tickAnim - 15) / 4) * (21.19424-(24.57879)));
            yy = 16.50306 + (((tickAnim - 15) / 4) * (21.23588-(16.50306)));
            zz = -1.98989 + (((tickAnim - 15) / 4) * (-1.30454-(-1.98989)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 21.19424 + (((tickAnim - 19) / 6) * (0-(21.19424)));
            yy = 21.23588 + (((tickAnim - 19) / 6) * (0-(21.23588)));
            zz = -1.30454 + (((tickAnim - 19) / 6) * (0-(-1.30454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 2 + (((tickAnim - 4) / 11) * (-22.75-(2)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -22.75 + (((tickAnim - 15) / 10) * (0-(-22.75)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 1 + (((tickAnim - 15) / 10) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.09855-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.6142-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.24377-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0.09855 + (((tickAnim - 4) / 11) * (0.71882-(0.09855)));
            yy = 2.6142 + (((tickAnim - 4) / 11) * (-8.40479-(2.6142)));
            zz = 2.24377 + (((tickAnim - 4) / 11) * (-5.03514-(2.24377)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.71882 + (((tickAnim - 15) / 10) * (0-(0.71882)));
            yy = -8.40479 + (((tickAnim - 15) / 10) * (0-(-8.40479)));
            zz = -5.03514 + (((tickAnim - 15) / 10) * (0-(-5.03514)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.65 + (((tickAnim - 15) / 10) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (9.5-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 2 + (((tickAnim - 4) / 11) * (-10.25-(2)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.5 + (((tickAnim - 15) / 10) * (0-(9.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -10.25 + (((tickAnim - 15) / 10) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (1-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-0.825-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 10) * (0-(1)));
            zz = -0.825 + (((tickAnim - 15) / 10) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (-36.30206-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (7.40955-(0)));
            zz = -7.5 + (((tickAnim - 4) / 11) * (2.22949-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -36.30206 + (((tickAnim - 15) / 10) * (0-(-36.30206)));
            yy = 7.40955 + (((tickAnim - 15) / 10) * (0-(7.40955)));
            zz = 2.22949 + (((tickAnim - 15) / 10) * (0-(2.22949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (-0.375-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0.65-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.375 + (((tickAnim - 15) / 10) * (0-(-0.375)));
            yy = 0.65 + (((tickAnim - 15) / 10) * (0-(0.65)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (71.25-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 71.25 + (((tickAnim - 15) / 6) * (-5.59-(71.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -5.59 + (((tickAnim - 21) / 4) * (0-(-5.59)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 11) * (-1.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -1.05 + (((tickAnim - 15) / 10) * (0-(-1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.17851-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.49487-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.0335-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.17851 + (((tickAnim - 15) / 10) * (0-(0.17851)));
            yy = 2.49487 + (((tickAnim - 15) / 10) * (0-(2.49487)));
            zz = 3.0335 + (((tickAnim - 15) / 10) * (0-(3.0335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 4) / 11) * (0-(0)));
            yy = -0.625 + (((tickAnim - 4) / 11) * (0.605-(-0.625)));
            zz = 0 + (((tickAnim - 4) / 11) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0.605 + (((tickAnim - 15) / 10) * (0-(0.605)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.85115-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-8.6028-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.97215-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -15.85115 + (((tickAnim - 15) / 10) * (0-(-15.85115)));
            yy = -8.6028 + (((tickAnim - 15) / 10) * (0-(-8.6028)));
            zz = 0.97215 + (((tickAnim - 15) / 10) * (0-(0.97215)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.325 + (((tickAnim - 15) / 10) * (0-(0.325)));
            yy = -0.725 + (((tickAnim - 15) / 10) * (0-(-0.725)));
            zz = -0.225 + (((tickAnim - 15) / 10) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 15.25 + (((tickAnim - 15) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 10) * (0-(0.525)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.62292 + (((tickAnim - 0) / 15) * (1.26363-(0.62292)));
            yy = -6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5 + (((tickAnim - 0) / 15) * (-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5)));
            zz = -3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 0) / 15) * (0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(-3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.26363 + (((tickAnim - 15) / 10) * (0.58059-(1.26363)));
            yy = -1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-12.4129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5-(-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 15) / 10) * (-2.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.62292 + (((tickAnim - 0) / 15) * (1.26363-(0.62292)));
            yy = -6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5 + (((tickAnim - 0) / 15) * (-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-6.3161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5)));
            zz = -3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 0) / 15) * (0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(-3.797+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.26363 + (((tickAnim - 15) / 10) * (0.58059-(1.26363)));
            yy = -1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-12.4129+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3.5-(-1.0067+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1 + (((tickAnim - 15) / 10) * (-2.112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1-(0.1691+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 4.11521 + (((tickAnim - 0) / 7) * (3.79614-(4.11521)));
            yy = -31.7168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 0) / 7) * (-37.92131-(-31.7168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0.77155 + (((tickAnim - 0) / 7) * (1.24526-(0.77155)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 3.79614 + (((tickAnim - 7) / 8) * (4.64663-(3.79614)));
            yy = -37.92131 + (((tickAnim - 7) / 8) * (-21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-37.92131)));
            zz = 1.24526 + (((tickAnim - 7) / 8) * (-0.38349-(1.24526)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.64663 + (((tickAnim - 15) / 10) * (4.14273-(4.64663)));
            yy = -21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-36.493+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-21.267+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = -0.38349 + (((tickAnim - 15) / 10) * (0.75845-(-0.38349)));
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
            zz = 0.45 + (((tickAnim - 0) / 25) * (0.45-(0.45)));
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
            xx = 9.25 + (((tickAnim - 0) / 15) * (9.64613-(9.25)));
            yy = -13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 0) / 15) * (-18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.37638-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 9.64613 + (((tickAnim - 15) / 10) * (9.32301-(9.64613)));
            yy = -18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3 + (((tickAnim - 15) / 10) * (-17.4334+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3-(-18.8535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*3)));
            zz = -1.37638 + (((tickAnim - 15) / 10) * (-0.3868-(-1.37638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0.225);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -12.25 + (((tickAnim - 0) / 15) * (-18-(-12.25)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -18 + (((tickAnim - 15) / 10) * (-12.25-(-18)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 25) * (0.5-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.61615-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-18.16673-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.41459-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 21.61615 + (((tickAnim - 15) / 4) * (4.55807-(21.61615)));
            yy = -18.16673 + (((tickAnim - 15) / 4) * (-9.08336-(-18.16673)));
            zz = -8.41459 + (((tickAnim - 15) / 4) * (-4.2073-(-8.41459)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 4.55807 + (((tickAnim - 19) / 6) * (0-(4.55807)));
            yy = -9.08336 + (((tickAnim - 19) / 6) * (0-(-9.08336)));
            zz = -4.2073 + (((tickAnim - 19) / 6) * (0-(-4.2073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -11.25 + (((tickAnim - 15) / 4) * (23.375-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 6 + (((tickAnim - 15) / 4) * (3-(6)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 23.375 + (((tickAnim - 19) / 6) * (0-(23.375)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 3 + (((tickAnim - 19) / 6) * (0-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.575-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.625 + (((tickAnim - 19) / 6) * (0-(0.625)));
            zz = -0.575 + (((tickAnim - 19) / 6) * (0-(-0.575)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 15) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 13.5 + (((tickAnim - 19) / 4) * (-0.71-(13.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.71 + (((tickAnim - 23) / 2) * (0-(-0.71)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (2.29488-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.73091-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.30961-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 15) {
            xx = 2.29488 + (((tickAnim - 4) / 11) * (-1.27167-(2.29488)));
            yy = 2.73091 + (((tickAnim - 4) / 11) * (-28.10503-(2.73091)));
            zz = 0.30961 + (((tickAnim - 4) / 11) * (-3.67888-(0.30961)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -1.27167 + (((tickAnim - 15) / 10) * (0-(-1.27167)));
            yy = -28.10503 + (((tickAnim - 15) / 10) * (0-(-28.10503)));
            zz = -3.67888 + (((tickAnim - 15) / 10) * (0-(-3.67888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 15) / 10) * (0-(-0.55)));
            zz = -2.275 + (((tickAnim - 15) / 10) * (0-(-2.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.40478-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.5571-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.10573-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1.40478 + (((tickAnim - 15) / 10) * (0-(1.40478)));
            yy = 0.5571 + (((tickAnim - 15) / 10) * (0-(0.5571)));
            zz = -3.10573 + (((tickAnim - 15) / 10) * (0-(-3.10573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 15) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 15) / 10) * (0-(-0.325)));
            zz = 0.925 + (((tickAnim - 15) / 10) * (0-(0.925)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 15) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(0);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(-0.575);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(0);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-170))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+190))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+200))*-5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+220))*-5));



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 7.25 + (((tickAnim - 28) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 7.25 + (((tickAnim - 48) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 6 + (((tickAnim - 28) / 20) * (6-(6)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 6 + (((tickAnim - 48) / 22) * (0-(6)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 8) / 14) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 6.75 + (((tickAnim - 22) / 7) * (0.5-(6.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0.5 + (((tickAnim - 29) / 19) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0.5 + (((tickAnim - 48) / 19) * (-4.5-(0.5)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -4.5 + (((tickAnim - 67) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 14) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 24) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 29) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 35) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = -29.5 + (((tickAnim - 8) / 14) * (-5.75-(-29.5)));
            yy = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 14) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -5.75 + (((tickAnim - 22) / 7) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -5.75 + (((tickAnim - 29) / 19) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -5.75 + (((tickAnim - 48) / 7) * (-27.98-(-5.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = -27.98 + (((tickAnim - 55) / 12) * (-0.25-(-27.98)));
            yy = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 12) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -0.25 + (((tickAnim - 67) / 3) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.76-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0.415-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -0.475 + (((tickAnim - 11) / 11) * (0-(-0.475)));
            yy = 0.76 + (((tickAnim - 11) / 11) * (0-(0.76)));
            zz = 0.415 + (((tickAnim - 11) / 11) * (0-(0.415)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 7) * (0.625-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.625 + (((tickAnim - 29) / 19) * (0.625-(0.625)));
            zz = 0.25 + (((tickAnim - 29) / 19) * (0.25-(0.25)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 48) / 7) * (1.42-(0.625)));
            zz = 0.25 + (((tickAnim - 48) / 7) * (0.93-(0.25)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = 1.42 + (((tickAnim - 55) / 12) * (0.575-(1.42)));
            zz = 0.93 + (((tickAnim - 55) / 12) * (0-(0.93)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 67) / 3) * (0-(0.575)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 32.75 + (((tickAnim - 8) / 11) * (6.74-(32.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 6.74 + (((tickAnim - 19) / 3) * (-11.75-(6.74)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -11.75 + (((tickAnim - 22) / 7) * (-7.25-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -7.25 + (((tickAnim - 29) / 19) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -7.25 + (((tickAnim - 48) / 7) * (35.99-(-7.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 35.99 + (((tickAnim - 55) / 8) * (-3.4-(35.99)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = -3.4 + (((tickAnim - 63) / 4) * (4.75-(-3.4)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 67) / 3) * (0-(4.75)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 8) / 14) * (0-(0)));
            yy = 0.4 + (((tickAnim - 8) / 14) * (0.15-(0.4)));
            zz = -0.15 + (((tickAnim - 8) / 14) * (0-(-0.15)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 22) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 22) / 7) * (0.35-(0.15)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 19) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 48) / 3) * (1.06-(0.35)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 51) / 4) * (-0.02-(1.06)));
            zz = 0 + (((tickAnim - 51) / 4) * (-1.05-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 55) / 12) * (0-(0)));
            yy = -0.02 + (((tickAnim - 55) / 12) * (0-(-0.02)));
            zz = -1.05 + (((tickAnim - 55) / 12) * (0-(-1.05)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -37.75 + (((tickAnim - 28) / 20) * (-37.75-(-37.75)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -37.75 + (((tickAnim - 48) / 22) * (0-(-37.75)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 6) * (0.565-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.565 + (((tickAnim - 6) / 7) * (0.875-(0.565)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 8) * (0.7-(0.875)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 21) / 7) * (0.475-(0.7)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0.475 + (((tickAnim - 28) / 20) * (0.475-(0.475)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 48) / 5) * (0.605-(0.475)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            yy = 0.605 + (((tickAnim - 53) / 5) * (0.865-(0.605)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 58) / 6) * (0.61-(0.865)));
            zz = 0 + (((tickAnim - 58) / 6) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0.61 + (((tickAnim - 64) / 6) * (-0.05-(0.61)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -16 + (((tickAnim - 28) / 20) * (-16-(-16)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = -16 + (((tickAnim - 48) / 22) * (0-(-16)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0.1 + (((tickAnim - 28) / 20) * (0.1-(0.1)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (41.64705-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (4.33145-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-2.97101-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 41.64705 + (((tickAnim - 28) / 20) * (41.64705-(41.64705)));
            yy = 4.33145 + (((tickAnim - 28) / 20) * (4.33145-(4.33145)));
            zz = -2.97101 + (((tickAnim - 28) / 20) * (-2.97101-(-2.97101)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 41.64705 + (((tickAnim - 48) / 22) * (0-(41.64705)));
            yy = 4.33145 + (((tickAnim - 48) / 22) * (0-(4.33145)));
            zz = -2.97101 + (((tickAnim - 48) / 22) * (0-(-2.97101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = -0.9 + (((tickAnim - 28) / 20) * (-0.9-(-0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (9.09961-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.14454-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-3.042-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 9.09961 + (((tickAnim - 28) / 8) * (7.84961-(9.09961)));
            yy = 1.14454 + (((tickAnim - 28) / 8) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 28) / 8) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 7.84961 + (((tickAnim - 36) / 12) * (9.09961-(7.84961)));
            yy = 1.14454 + (((tickAnim - 36) / 12) * (1.14454-(1.14454)));
            zz = -3.042 + (((tickAnim - 36) / 12) * (-3.042-(-3.042)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 9.09961 + (((tickAnim - 48) / 22) * (0-(9.09961)));
            yy = 1.14454 + (((tickAnim - 48) / 22) * (0-(1.14454)));
            zz = -3.042 + (((tickAnim - 48) / 22) * (0-(-3.042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 28) / 8) * (-1.03-(-0.85)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            yy = -1.03 + (((tickAnim - 36) / 12) * (-0.85-(-1.03)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.85 + (((tickAnim - 48) / 22) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (14.88119-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.01848-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-4.35723-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 14.88119 + (((tickAnim - 28) / 8) * (15.631-(14.88119)));
            yy = 1.01848 + (((tickAnim - 28) / 8) * (1.02138-(1.01848)));
            zz = -4.35723 + (((tickAnim - 28) / 8) * (-4.36967-(-4.35723)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 15.631 + (((tickAnim - 36) / 12) * (14.88119-(15.631)));
            yy = 1.02138 + (((tickAnim - 36) / 12) * (1.01848-(1.02138)));
            zz = -4.36967 + (((tickAnim - 36) / 12) * (-4.35723-(-4.36967)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 14.88119 + (((tickAnim - 48) / 22) * (0-(14.88119)));
            yy = 1.01848 + (((tickAnim - 48) / 22) * (0-(1.01848)));
            zz = -4.35723 + (((tickAnim - 48) / 22) * (0-(-4.35723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (3.03845-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.16763-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.45687-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3.03845 + (((tickAnim - 28) / 8) * (7.28766-(3.03845)));
            yy = 0.16763 + (((tickAnim - 28) / 8) * (1.33795-(0.16763)));
            zz = -0.45687 + (((tickAnim - 28) / 8) * (-5.33527-(-0.45687)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 7.28766 + (((tickAnim - 36) / 12) * (3.03845-(7.28766)));
            yy = 1.33795 + (((tickAnim - 36) / 12) * (0.16763-(1.33795)));
            zz = -5.33527 + (((tickAnim - 36) / 12) * (-0.45687-(-5.33527)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 3.03845 + (((tickAnim - 48) / 22) * (0-(3.03845)));
            yy = 0.16763 + (((tickAnim - 48) / 22) * (0-(0.16763)));
            zz = -0.45687 + (((tickAnim - 48) / 22) * (0-(-0.45687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.1 + (((tickAnim - 28) / 20) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = -0.1 + (((tickAnim - 48) / 22) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 28 && tickAnim < 36) {
            xx = 4.25 + (((tickAnim - 28) / 8) * (10.75-(4.25)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 10.75 + (((tickAnim - 36) / 12) * (4.25-(10.75)));
            yy = 0 + (((tickAnim - 36) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 8 + (((tickAnim - 29) / 7) * (0-(8)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (8-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = 8 + (((tickAnim - 43) / 27) * (0-(8)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 2.75 + (((tickAnim - 29) / 7) * (20.03-(2.75)));
            yy = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 20.03 + (((tickAnim - 36) / 7) * (0-(20.03)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 12.25 + (((tickAnim - 28) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 12.25 + (((tickAnim - 48) / 8) * (-5.6-(12.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -5.6 + (((tickAnim - 56) / 7) * (0-(-5.6)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 65) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 65) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 65) / 2) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 68) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (30.44-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 30.44 + (((tickAnim - 56) / 4) * (6.65-(30.44)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 6.65 + (((tickAnim - 60) / 3) * (0-(6.65)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = -0.25 + (((tickAnim - 56) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0.25 + (((tickAnim - 0) / 28) * (0-(0.25)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 56) / 4) * (1.63-(-15.5)));
            yy = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 4) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 1.63 + (((tickAnim - 60) / 3) * (0-(1.63)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0.25-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.125 + (((tickAnim - 28) / 20) * (-0.125-(-0.125)));
            zz = 0.175 + (((tickAnim - 28) / 20) * (0.175-(0.175)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            yy = -0.125 + (((tickAnim - 48) / 8) * (-0.22-(-0.125)));
            zz = 0.175 + (((tickAnim - 48) / 8) * (-0.09-(0.175)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 56) / 4) * (0-(0)));
            yy = -0.22 + (((tickAnim - 56) / 4) * (0-(-0.22)));
            zz = -0.09 + (((tickAnim - 56) / 4) * (0-(-0.09)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 63) / 7) * (-0.125-(-0.3)));
            zz = 0.425 + (((tickAnim - 63) / 7) * (0.175-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = -12.5 + (((tickAnim - 28) / 20) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -12.5 + (((tickAnim - 48) / 8) * (6.16-(-12.5)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = 6.16 + (((tickAnim - 56) / 5) * (0.39-(6.16)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 0.39 + (((tickAnim - 61) / 2) * (0-(0.39)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 28) / 20) * (0-(0)));
            yy = -0.975 + (((tickAnim - 28) / 20) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 28) / 20) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 48) / 15) * (0-(0)));
            yy = -0.975 + (((tickAnim - 48) / 15) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 48) / 15) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 31;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -30.75 + (((tickAnim - 0) / 18) * (13-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 18) / 11) * (-36.25-(13)));
            yy = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -36.25 + (((tickAnim - 29) / 3) * (-30.75-(-36.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 15.43773 + (((tickAnim - 0) / 10) * (-3.39-(15.43773)));
            yy = 1.79486 + (((tickAnim - 0) / 10) * (0-(1.79486)));
            zz = -2.74717 + (((tickAnim - 0) / 10) * (0-(-2.74717)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.39 + (((tickAnim - 10) / 8) * (52.75-(-3.39)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 52.75 + (((tickAnim - 18) / 7) * (93.03098-(52.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (7.408-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (1.06805-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 93.03098 + (((tickAnim - 25) / 4) * (22.18773-(93.03098)));
            yy = 7.408 + (((tickAnim - 25) / 4) * (1.79486-(7.408)));
            zz = 1.06805 + (((tickAnim - 25) / 4) * (-2.74717-(1.06805)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 22.18773 + (((tickAnim - 29) / 3) * (15.43773-(22.18773)));
            yy = 1.79486 + (((tickAnim - 29) / 3) * (1.79486-(1.79486)));
            zz = -2.74717 + (((tickAnim - 29) / 3) * (-2.74717-(-2.74717)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (1.375-(0.3)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 1.375 + (((tickAnim - 3) / 7) * (0-(1.375)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.615-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.615 + (((tickAnim - 18) / 2) * (1.165-(0.615)));
            zz = -0.625 + (((tickAnim - 18) / 2) * (-0.71-(-0.625)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.165 + (((tickAnim - 20) / 3) * (0.96-(1.165)));
            zz = -0.71 + (((tickAnim - 20) / 3) * (-0.8-(-0.71)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.96 + (((tickAnim - 23) / 2) * (0.08-(0.96)));
            zz = -0.8 + (((tickAnim - 23) / 2) * (-1-(-0.8)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.08 + (((tickAnim - 25) / 4) * (0.3-(0.08)));
            zz = -1 + (((tickAnim - 25) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 29) / 3) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.25 + (((tickAnim - 0) / 3) * (13-(5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 13 + (((tickAnim - 3) / 11) * (-36.25-(13)));
            yy = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = -36.25 + (((tickAnim - 14) / 18) * (5.25-(-36.25)));
            yy = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.5 + (((tickAnim - 0) / 3) * (16.75-(14.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 16.75 + (((tickAnim - 3) / 7) * (-25.23511-(16.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (-9.03331-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (3.86442-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -25.23511 + (((tickAnim - 10) / 4) * (14.25-(-25.23511)));
            yy = -9.03331 + (((tickAnim - 10) / 4) * (0-(-9.03331)));
            zz = 3.86442 + (((tickAnim - 10) / 4) * (0-(3.86442)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = 14.25 + (((tickAnim - 14) / 18) * (14.5-(14.25)));
            yy = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 6) * (0.62-(0.275)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.075-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.62 + (((tickAnim - 6) / 4) * (0.6-(0.62)));
            zz = 0.075 + (((tickAnim - 6) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 10) / 4) * (0-(0.6)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 14) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 18) * (0.275-(0)));
            zz = 0 + (((tickAnim - 14) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.75 + (((tickAnim - 0) / 3) * (52.75-(18.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 52.75 + (((tickAnim - 3) / 7) * (93.03098-(52.75)));
            yy = 0 + (((tickAnim - 3) / 7) * (7.408-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (1.06805-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 93.03098 + (((tickAnim - 10) / 4) * (22.18773-(93.03098)));
            yy = 7.408 + (((tickAnim - 10) / 4) * (1.79486-(7.408)));
            zz = 1.06805 + (((tickAnim - 10) / 4) * (-2.74717-(1.06805)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 22.18773 + (((tickAnim - 14) / 14) * (-5.57497-(22.18773)));
            yy = 1.79486 + (((tickAnim - 14) / 14) * (0.28147-(1.79486)));
            zz = -2.74717 + (((tickAnim - 14) / 14) * (-0.27284-(-2.74717)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -5.57497 + (((tickAnim - 28) / 4) * (18.75-(-5.57497)));
            yy = 0.28147 + (((tickAnim - 28) / 4) * (0-(0.28147)));
            zz = -0.27284 + (((tickAnim - 28) / 4) * (0-(-0.27284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.615-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.615 + (((tickAnim - 3) / 2) * (1.165-(0.615)));
            zz = -0.625 + (((tickAnim - 3) / 2) * (-0.71-(-0.625)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.165 + (((tickAnim - 5) / 2) * (0.96-(1.165)));
            zz = -0.71 + (((tickAnim - 5) / 2) * (-0.8-(-0.71)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.96 + (((tickAnim - 7) / 3) * (0.08-(0.96)));
            zz = -0.8 + (((tickAnim - 7) / 3) * (-1-(-0.8)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.08 + (((tickAnim - 10) / 4) * (0.3-(0.08)));
            zz = -1 + (((tickAnim - 10) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 4) * (1.33-(0.3)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 1.33 + (((tickAnim - 18) / 10) * (0.4-(1.33)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 28) / 4) * (0.5-(0.4)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8 + (((tickAnim - 0) / 12) * (22-(8)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 22 + (((tickAnim - 12) / 6) * (4.00224-(22)));
            yy = 0 + (((tickAnim - 12) / 6) * (-0.5647-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.24149-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 4.00224 + (((tickAnim - 18) / 5) * (-3.5-(4.00224)));
            yy = -0.5647 + (((tickAnim - 18) / 5) * (0-(-0.5647)));
            zz = -0.24149 + (((tickAnim - 18) / 5) * (0-(-0.24149)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 23) / 9) * (8-(-3.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.75 + (((tickAnim - 0) / 12) * (13.75-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 13.75 + (((tickAnim - 12) / 6) * (-8-(13.75)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 18) / 5) * (-13.5-(-8)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -13.5 + (((tickAnim - 23) / 9) * (-0.75-(-13.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.175-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 5) * (0-(0.175)));
            zz = -0.2 + (((tickAnim - 18) / 5) * (0-(-0.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 0) / 12) * (10.75-(8.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 12) / 3) * (-27.25-(10.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -27.25 + (((tickAnim - 15) / 3) * (-19-(-27.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -19 + (((tickAnim - 18) / 5) * (10.75-(-19)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 10.75 + (((tickAnim - 23) / 9) * (8.75-(10.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 12) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 20) * (0-(0)));
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
            xx = -15.75 + (((tickAnim - 0) / 5) * (-22.29-(-15.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -22.29 + (((tickAnim - 5) / 7) * (10.5-(-22.29)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.5 + (((tickAnim - 12) / 3) * (49.04-(10.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 49.04 + (((tickAnim - 15) / 3) * (49.5-(49.04)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 49.5 + (((tickAnim - 18) / 5) * (6.25-(49.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 6.25 + (((tickAnim - 23) / 9) * (-15.75-(6.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 5) * (-0.775-(0.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.775 + (((tickAnim - 5) / 7) * (0.95-(-0.775)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 12) / 3) * (2.2-(0.95)));
            zz = 0 + (((tickAnim - 12) / 3) * (-1.9-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 2.2 + (((tickAnim - 15) / 3) * (2.2-(2.2)));
            zz = -1.9 + (((tickAnim - 15) / 3) * (-1.9-(-1.9)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 2.2 + (((tickAnim - 18) / 5) * (0.925-(2.2)));
            zz = -1.9 + (((tickAnim - 18) / 5) * (0-(-1.9)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.925 + (((tickAnim - 23) / 9) * (0.2-(0.925)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
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
            xx = 0.00224 + (((tickAnim - 0) / 3) * (-4.5-(0.00224)));
            yy = 0.5647 + (((tickAnim - 0) / 3) * (0-(0.5647)));
            zz = 0.24149 + (((tickAnim - 0) / 3) * (0-(0.24149)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = -4.5 + (((tickAnim - 3) / 22) * (21.5-(-4.5)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 21.5 + (((tickAnim - 25) / 7) * (0.00224-(21.5)));
            yy = 0 + (((tickAnim - 25) / 7) * (0.5647-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0.24149-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8 + (((tickAnim - 0) / 3) * (-13.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -13.5 + (((tickAnim - 3) / 12) * (-3.58-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.58 + (((tickAnim - 15) / 10) * (13.75-(-3.58)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 13.75 + (((tickAnim - 25) / 2) * (17-(13.75)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 17 + (((tickAnim - 27) / 5) * (-8-(17)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (0-(0.175)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (0-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 22) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0.175-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-0.2-(0)));
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
            xx = -23.75 + (((tickAnim - 0) / 3) * (10.75-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 3) / 12) * (0-(10.75)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 10.75 + (((tickAnim - 25) / 4) * (-23.67-(10.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -23.67 + (((tickAnim - 29) / 3) * (-23.75-(-23.67)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37 + (((tickAnim - 0) / 3) * (6.25-(37)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 6.25 + (((tickAnim - 3) / 12) * (-3.5-(6.25)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 15) / 10) * (10.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 10.5 + (((tickAnim - 25) / 4) * (40.58-(10.5)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 40.58 + (((tickAnim - 29) / 3) * (37-(40.58)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.225 + (((tickAnim - 0) / 3) * (0.75-(1.225)));
            zz = -1.225 + (((tickAnim - 0) / 3) * (0-(-1.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 5) * (0.255-(0.75)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.255 + (((tickAnim - 8) / 7) * (0-(0.255)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0.95-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 25) / 4) * (1.715-(0.95)));
            zz = 0 + (((tickAnim - 25) / 4) * (-1.46-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 1.715 + (((tickAnim - 29) / 3) * (1.225-(1.715)));
            zz = -1.46 + (((tickAnim - 29) / 3) * (-1.225-(-1.46)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5))*1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+45))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+20))*1.2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-50))*-0.15);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-50))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-50))*0.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-50))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-20))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-60))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-150))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-120))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-200))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-120))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-150))*-6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-250))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-140))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227-190))*-8));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-50))*-0.7), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+10))*-1.2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+30))*-1.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*1.2));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 13.75 + (((tickAnim - 0) / 18) * (16.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 16.75 + (((tickAnim - 18) / 7) * (-25.23511-(16.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (9.03331-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-3.86442-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -25.23511 + (((tickAnim - 25) / 4) * (14.25-(-25.23511)));
            yy = 9.03331 + (((tickAnim - 25) / 4) * (0-(9.03331)));
            zz = -3.86442 + (((tickAnim - 25) / 4) * (0-(-3.86442)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 14.25 + (((tickAnim - 29) / 3) * (13.75-(14.25)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.62-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.075-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.62 + (((tickAnim - 21) / 4) * (0.6-(0.62)));
            zz = 0.075 + (((tickAnim - 21) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 25) / 4) * (0-(0.6)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*1), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+30))*-0.5), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+130))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-120))*1), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+50))*-0.5), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+170))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-170))*1), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+80))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+190))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-200))*1.5), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+120))*-0.5), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+240))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-230))*1.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+150))*-0.5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+280))*2));


        this.setRotateAngle(LeftPlate11, LeftPlate11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftPlate11.rotateAngleY + (float) Math.toRadians(0), LeftPlate11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate11, RightPlate11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightPlate11.rotateAngleY + (float) Math.toRadians(0), RightPlate11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftSpike1, LeftSpike1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftSpike1.rotateAngleY + (float) Math.toRadians(0), LeftSpike1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightSpike1, RightSpike1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightSpike1.rotateAngleY + (float) Math.toRadians(0), RightSpike1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftSpike2, LeftSpike2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftSpike2.rotateAngleY + (float) Math.toRadians(0), LeftSpike2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightSpike2, RightSpike2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightSpike2.rotateAngleY + (float) Math.toRadians(0), RightSpike2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftPlate10, LeftPlate10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftPlate10.rotateAngleY + (float) Math.toRadians(0), LeftPlate10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate10, RightPlate10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightPlate10.rotateAngleY + (float) Math.toRadians(0), RightPlate10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftPlate9, LeftPlate9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftPlate9.rotateAngleY + (float) Math.toRadians(0), LeftPlate9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate9, RightPlate9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightPlate9.rotateAngleY + (float) Math.toRadians(0), RightPlate9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftPlate8, LeftPlate8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), LeftPlate8.rotateAngleY + (float) Math.toRadians(0), LeftPlate8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate8, RightPlate8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-0.5), RightPlate8.rotateAngleY + (float) Math.toRadians(0), RightPlate8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(LeftPlate7, LeftPlate7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-1), LeftPlate7.rotateAngleY + (float) Math.toRadians(0), LeftPlate7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2.5));


        this.setRotateAngle(RightPlate7, RightPlate7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-1), RightPlate7.rotateAngleY + (float) Math.toRadians(0), RightPlate7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2.5));


        this.setRotateAngle(LeftPlate6, LeftPlate6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-1), LeftPlate6.rotateAngleY + (float) Math.toRadians(0), LeftPlate6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate6, RightPlate6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227/0.5-70))*-1), RightPlate6.rotateAngleY + (float) Math.toRadians(0), RightPlate6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*227+90))*2));


        this.setRotateAngle(RightPlate5, RightPlate5.rotateAngleX + (float) Math.toRadians(0), RightPlate5.rotateAngleY + (float) Math.toRadians(0), RightPlate5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(RightPlate4, RightPlate4.rotateAngleX + (float) Math.toRadians(0), RightPlate4.rotateAngleY + (float) Math.toRadians(0), RightPlate4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(RightPlate3, RightPlate3.rotateAngleX + (float) Math.toRadians(0), RightPlate3.rotateAngleY + (float) Math.toRadians(0), RightPlate3.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 18;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-50))*1.8), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+20))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-50))*-0.59);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-50))*0.8);


        this.setRotateAngle(LeftPlate11, LeftPlate11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), LeftPlate11.rotateAngleY + (float) Math.toRadians(0), LeftPlate11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate11, RightPlate11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), RightPlate11.rotateAngleY + (float) Math.toRadians(0), RightPlate11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-100))*1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-40))*-3));


        this.setRotateAngle(LeftSpike1, LeftSpike1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), LeftSpike1.rotateAngleY + (float) Math.toRadians(0), LeftSpike1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(RightSpike1, RightSpike1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), RightSpike1.rotateAngleY + (float) Math.toRadians(0), RightSpike1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(LeftSpike2, LeftSpike2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), LeftSpike2.rotateAngleY + (float) Math.toRadians(0), LeftSpike2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(RightSpike2, RightSpike2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), RightSpike2.rotateAngleY + (float) Math.toRadians(0), RightSpike2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-150))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-80))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-80))*-5));


        this.setRotateAngle(LeftSpike3, LeftSpike3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), LeftSpike3.rotateAngleY + (float) Math.toRadians(0), LeftSpike3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(RightSpike3, RightSpike3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), RightSpike3.rotateAngleY + (float) Math.toRadians(0), RightSpike3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-200))*5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-120))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*-7));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-160))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+160))*-9));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-300))*9), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-200))*15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+200))*-11));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-120))*-1.8), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-50))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+100))*-3));


        this.setRotateAngle(LeftPlate10, LeftPlate10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), LeftPlate10.rotateAngleY + (float) Math.toRadians(0), LeftPlate10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate10, RightPlate10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), RightPlate10.rotateAngleY + (float) Math.toRadians(0), RightPlate10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(LeftPlate9, LeftPlate9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), LeftPlate9.rotateAngleY + (float) Math.toRadians(0), LeftPlate9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate9, RightPlate9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), RightPlate9.rotateAngleY + (float) Math.toRadians(0), RightPlate9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(LeftPlate8, LeftPlate8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), LeftPlate8.rotateAngleY + (float) Math.toRadians(0), LeftPlate8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate8, RightPlate8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), RightPlate8.rotateAngleY + (float) Math.toRadians(0), RightPlate8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-120))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*3));


        this.setRotateAngle(LeftPlate7, LeftPlate7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), LeftPlate7.rotateAngleY + (float) Math.toRadians(0), LeftPlate7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate7, RightPlate7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), RightPlate7.rotateAngleY + (float) Math.toRadians(0), RightPlate7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(LeftPlate6, LeftPlate6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), LeftPlate6.rotateAngleY + (float) Math.toRadians(0), LeftPlate6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));


        this.setRotateAngle(RightPlate6, RightPlate6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-220))*3), RightPlate6.rotateAngleY + (float) Math.toRadians(0), RightPlate6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+120))*4));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -39.5 + (((tickAnim - 0) / 10) * (21.5-(-39.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 21.5 + (((tickAnim - 10) / 4) * (-9.06462-(21.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (-1.79282-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-4.12812-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -9.06462 + (((tickAnim - 14) / 4) * (-39.5-(-9.06462)));
            yy = -1.79282 + (((tickAnim - 14) / 4) * (0-(-1.79282)));
            zz = -4.12812 + (((tickAnim - 14) / 4) * (0-(-4.12812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 0) / 10) * (13-(17.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 13 + (((tickAnim - 10) / 4) * (-26.1915-(13)));
            yy = 0 + (((tickAnim - 10) / 4) * (3.67686-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-5.96066-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -26.1915 + (((tickAnim - 14) / 2) * (-26.3649-(-26.1915)));
            yy = 3.67686 + (((tickAnim - 14) / 2) * (2.20612-(3.67686)));
            zz = -5.96066 + (((tickAnim - 14) / 2) * (-3.5764-(-5.96066)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -26.3649 + (((tickAnim - 16) / 2) * (17.75-(-26.3649)));
            yy = 2.20612 + (((tickAnim - 16) / 2) * (0-(2.20612)));
            zz = -3.5764 + (((tickAnim - 16) / 2) * (0-(-3.5764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.075-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 12) / 2) * (0.75-(1.075)));
            zz = 0.225 + (((tickAnim - 12) / 2) * (0-(0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 14) / 4) * (0-(0.75)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
            xx = 21.18126 + (((tickAnim - 0) / 5) * (-4.78437-(21.18126)));
            yy = -1.43016 + (((tickAnim - 0) / 5) * (0.71508-(-1.43016)));
            zz = 2.67226 + (((tickAnim - 0) / 5) * (-1.33613-(2.67226)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.78437 + (((tickAnim - 5) / 5) * (57.25-(-4.78437)));
            yy = 0.71508 + (((tickAnim - 5) / 5) * (0-(0.71508)));
            zz = -1.33613 + (((tickAnim - 5) / 5) * (0-(-1.33613)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 57.25 + (((tickAnim - 10) / 2) * (90.43625-(57.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.28603-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.53445-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 90.43625 + (((tickAnim - 12) / 4) * (100.10188-(90.43625)));
            yy = 0.28603 + (((tickAnim - 12) / 4) * (1.00111-(0.28603)));
            zz = -0.53445 + (((tickAnim - 12) / 4) * (-1.87058-(-0.53445)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 100.10188 + (((tickAnim - 16) / 2) * (16.9048-(100.10188)));
            yy = 1.00111 + (((tickAnim - 16) / 2) * (-1.28714-(1.00111)));
            zz = -1.87058 + (((tickAnim - 16) / 2) * (2.40503-(-1.87058)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 16.9048 + (((tickAnim - 18) / 0) * (21.18126-(16.9048)));
            yy = -1.28714 + (((tickAnim - 18) / 0) * (-1.43016-(-1.28714)));
            zz = 2.40503 + (((tickAnim - 18) / 0) * (2.67226-(2.40503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.03-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.14-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.03 + (((tickAnim - 3) / 2) * (0-(1.03)));
            zz = -0.14 + (((tickAnim - 3) / 2) * (0-(-0.14)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.575-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 10) / 2) * (1.365-(0.3)));
            zz = -0.575 + (((tickAnim - 10) / 2) * (-0.76-(-0.575)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.365 + (((tickAnim - 12) / 4) * (0.09-(1.365)));
            zz = -0.76 + (((tickAnim - 12) / 4) * (-1.02-(-0.76)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 16) / 2) * (-0.65-(0.09)));
            zz = -1.02 + (((tickAnim - 16) / 2) * (0-(-1.02)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = -0.65 + (((tickAnim - 18) / 0) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.5 + (((tickAnim - 0) / 4) * (-9.06462-(21.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.79282-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (4.12812-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -9.06462 + (((tickAnim - 4) / 5) * (-39.5-(-9.06462)));
            yy = -1.79282 + (((tickAnim - 4) / 5) * (0-(-1.79282)));
            zz = 4.12812 + (((tickAnim - 4) / 5) * (0-(4.12812)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -39.5 + (((tickAnim - 9) / 9) * (21.5-(-39.5)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 13 + (((tickAnim - 0) / 4) * (-26.1915-(13)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.67686-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (5.96066-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -26.1915 + (((tickAnim - 4) / 2) * (-26.3649-(-26.1915)));
            yy = -3.67686 + (((tickAnim - 4) / 2) * (-2.20612-(-3.67686)));
            zz = 5.96066 + (((tickAnim - 4) / 2) * (3.5764-(5.96066)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -26.3649 + (((tickAnim - 6) / 3) * (17.75-(-26.3649)));
            yy = -2.20612 + (((tickAnim - 6) / 3) * (0-(-2.20612)));
            zz = 3.5764 + (((tickAnim - 6) / 3) * (0-(3.5764)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 17.75 + (((tickAnim - 9) / 9) * (13-(17.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 0) / 4) * (0.75-(0.925)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 4) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.925-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 88 + (((tickAnim - 0) / 2) * (90.43625-(88)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.28603-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.53445-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 90.43625 + (((tickAnim - 2) / 4) * (100.10188-(90.43625)));
            yy = 0.28603 + (((tickAnim - 2) / 4) * (1.00111-(0.28603)));
            zz = -0.53445 + (((tickAnim - 2) / 4) * (-1.87058-(-0.53445)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 100.10188 + (((tickAnim - 6) / 2) * (16.9048-(100.10188)));
            yy = 1.00111 + (((tickAnim - 6) / 2) * (1.28714-(1.00111)));
            zz = -1.87058 + (((tickAnim - 6) / 2) * (-2.40503-(-1.87058)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.9048 + (((tickAnim - 8) / 1) * (21.18126-(16.9048)));
            yy = 1.28714 + (((tickAnim - 8) / 1) * (1.43016-(1.28714)));
            zz = -2.40503 + (((tickAnim - 8) / 1) * (-2.67226-(-2.40503)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 21.18126 + (((tickAnim - 9) / 4) * (-3.09083-(21.18126)));
            yy = 1.43016 + (((tickAnim - 9) / 4) * (0.91592-(1.43016)));
            zz = -2.67226 + (((tickAnim - 9) / 4) * (-4.11441-(-2.67226)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.09083 + (((tickAnim - 13) / 5) * (88-(-3.09083)));
            yy = 0.91592 + (((tickAnim - 13) / 5) * (0-(0.91592)));
            zz = -4.11441 + (((tickAnim - 13) / 5) * (0-(-4.11441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.3 + (((tickAnim - 0) / 2) * (1.09-(1.3)));
            zz = -0.575 + (((tickAnim - 0) / 2) * (-0.76-(-0.575)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 1.09 + (((tickAnim - 2) / 4) * (0.09-(1.09)));
            zz = -0.76 + (((tickAnim - 2) / 4) * (-1.02-(-0.76)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 6) / 2) * (-0.65-(0.09)));
            zz = -1.02 + (((tickAnim - 6) / 2) * (0-(-1.02)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.65 + (((tickAnim - 8) / 1) * (0.1-(-0.65)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 9) / 2) * (0.9-(0.1)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 11) / 2) * (0.475-(0.9)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 5) * (1.3-(0.475)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-250))*3), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-150))*-3), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+180))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-300))*-4), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-230))*3), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+220))*-3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-350))*-5), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-290))*-3), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+250))*-3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-400))*5), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-280))*3), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+280))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.458-450))*-5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458-280))*-1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.458+200))*1));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 21.09032 + (((tickAnim - 0) / 4) * (-8.9932-(21.09032)));
            yy = -4.69819 + (((tickAnim - 0) / 4) * (-3.18669-(-4.69819)));
            zz = -1.1542 + (((tickAnim - 0) / 4) * (-4.5204-(-1.1542)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.9932 + (((tickAnim - 4) / 4) * (-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-8.9932)));
            yy = -3.18669 + (((tickAnim - 4) / 4) * (0-(-3.18669)));
            zz = -4.5204 + (((tickAnim - 4) / 4) * (0-(-4.5204)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 8) / 10) * (21.09032-(-13.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 8) / 10) * (-4.69819-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-1.1542-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24 + (((tickAnim - 0) / 3) * (32.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70-(24)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 32.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70 + (((tickAnim - 3) / 2) * (-7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(32.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 5) / 3) * (-18.75-(-7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -18.75 + (((tickAnim - 8) / 10) * (24-(-18.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 5) * (0-(0.7)));
            zz = -0.15 + (((tickAnim - 3) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
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
            xx = 17.5 + (((tickAnim - 0) / 2) * (1.8-(17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1.8 + (((tickAnim - 2) / 3) * (-14.51-(1.8)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -14.51 + (((tickAnim - 5) / 3) * (12.25-(-14.51)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 8) / 2) * (6.46-(12.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 6.46 + (((tickAnim - 10) / 8) * (17.5-(6.46)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.805-(0.35)));
            zz = 0.325 + (((tickAnim - 0) / 2) * (0.31-(0.325)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.805 + (((tickAnim - 2) / 6) * (0-(0.805)));
            zz = 0.31 + (((tickAnim - 2) / 6) * (0.25-(0.31)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0.35-(0)));
            zz = 0.25 + (((tickAnim - 8) / 10) * (0.325-(0.25)));
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
            xx = 22.5 + (((tickAnim - 0) / 2) * (42.85-(22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 42.85 + (((tickAnim - 2) / 3) * (65.69-(42.85)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 65.69 + (((tickAnim - 5) / 2) * (14.56-(65.69)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 14.56 + (((tickAnim - 7) / 1) * (13-(14.56)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13 + (((tickAnim - 8) / 4) * (-5.25-(13)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -5.25 + (((tickAnim - 12) / 6) * (22.5-(-5.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 2) * (1.88-(1.15)));
            zz = -0.7 + (((tickAnim - 0) / 2) * (-1.075-(-0.7)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.88 + (((tickAnim - 2) / 2) * (3.105-(1.88)));
            zz = -1.075 + (((tickAnim - 2) / 2) * (-2.15-(-1.075)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 3.105 + (((tickAnim - 4) / 1) * (1.205-(3.105)));
            zz = -2.15 + (((tickAnim - 4) / 1) * (-2.875-(-2.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.205 + (((tickAnim - 5) / 2) * (0-(1.205)));
            zz = -2.875 + (((tickAnim - 5) / 2) * (0-(-2.875)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.525-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 10) * (1.15-(0.525)));
            zz = 0 + (((tickAnim - 8) / 10) * (-0.7-(0)));
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
            xx = -8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 0) / 10) * (21.09032-(-8.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.69819-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.1542-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 21.09032 + (((tickAnim - 10) / 4) * (-3.4932-(21.09032)));
            yy = -4.69819 + (((tickAnim - 10) / 4) * (3.18669-(-4.69819)));
            zz = -1.1542 + (((tickAnim - 10) / 4) * (4.5204-(-1.1542)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -3.4932 + (((tickAnim - 14) / 4) * (-8.75-(-3.4932)));
            yy = 3.18669 + (((tickAnim - 14) / 4) * (0-(3.18669)));
            zz = 4.5204 + (((tickAnim - 14) / 4) * (0-(4.5204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.75 + (((tickAnim - 0) / 10) * (18.25-(-18.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 10) / 3) * (84.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70-(18.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 84.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70 + (((tickAnim - 13) / 3) * (7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(84.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-70)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 16) / 2) * (-18.75-(7.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 13) / 5) * (0-(0.7)));
            zz = -0.15 + (((tickAnim - 13) / 5) * (0-(-0.15)));
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
            xx = 17.25 + (((tickAnim - 0) / 3) * (7.31-(17.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 7.31 + (((tickAnim - 3) / 7) * (17.5-(7.31)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 10) / 2) * (1.8-(17.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 1.8 + (((tickAnim - 12) / 4) * (-14.51-(1.8)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -14.51 + (((tickAnim - 16) / 2) * (17.25-(-14.51)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 10) * (0.35-(0.4)));
            zz = 0.25 + (((tickAnim - 0) / 10) * (0.325-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 2) * (0.805-(0.35)));
            zz = 0.325 + (((tickAnim - 10) / 2) * (0.31-(0.325)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.805 + (((tickAnim - 12) / 6) * (0.4-(0.805)));
            zz = 0.31 + (((tickAnim - 12) / 6) * (0.25-(0.31)));
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
            xx = 13 + (((tickAnim - 0) / 3) * (-5.25-(13)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -5.25 + (((tickAnim - 3) / 7) * (10-(-5.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 10) / 2) * (42.85-(10)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 42.85 + (((tickAnim - 12) / 4) * (65.69-(42.85)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 65.69 + (((tickAnim - 16) / 2) * (14.56-(65.69)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 14.56 + (((tickAnim - 18) / 0) * (13-(14.56)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 10) * (0.4-(0.525)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 2) * (1.88-(0.4)));
            zz = 0 + (((tickAnim - 10) / 2) * (-1.075-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.88 + (((tickAnim - 12) / 2) * (3.105-(1.88)));
            zz = -1.075 + (((tickAnim - 12) / 2) * (-2.15-(-1.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 3.105 + (((tickAnim - 14) / 2) * (1.205-(3.105)));
            zz = -2.15 + (((tickAnim - 14) / 2) * (-2.875-(-2.15)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.205 + (((tickAnim - 16) / 2) * (0-(1.205)));
            zz = -2.875 + (((tickAnim - 16) / 2) * (0-(-2.875)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 0) * (0.525-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
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
    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLoricatosaurus entity = (EntityPrehistoricFloraLoricatosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-55))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75))*-2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75))*-0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 0) / 15) * (2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3 + (((tickAnim - 0) / 15) * (0.2238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 0) / 15) * (0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 15) / 25) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(2.0082+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
            yy = 0.2238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-5 + (((tickAnim - 15) / 25) * (-2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-3-(0.2238+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+150))*-5)));
            zz = 0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1 + (((tickAnim - 15) / 25) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1-(0.0916+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1 + (((tickAnim - 0) / 23) * (-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5 + (((tickAnim - 0) / 23) * (4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3 + (((tickAnim - 0) / 23) * (-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1-(-0.0535+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-1)));
            yy = 4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5-(4.7149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*2.5)));
            zz = -0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3-(-0.6893+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75-170))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.09895-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5 + (((tickAnim - 0) / 19) * (5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3 + (((tickAnim - 0) / 19) * (-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -0.09895 + (((tickAnim - 19) / 21) * (0-(-0.09895)));
            yy = 5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5-(5.7045+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*2.5)));
            zz = -1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3 + (((tickAnim - 19) / 21) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3-(-1.0379+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+190))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 0) / 23) * (6.48796-(3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5 + (((tickAnim - 0) / 23) * (3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5 + (((tickAnim - 0) / 23) * (-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 6.48796 + (((tickAnim - 23) / 17) * (3-(6.48796)));
            yy = 3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5 + (((tickAnim - 23) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5-(3.2411+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*3.5)));
            zz = -0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5 + (((tickAnim - 23) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5-(-0.1708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+200))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 4 + (((tickAnim - 0) / 21) * (8.52947-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3 + (((tickAnim - 0) / 21) * (7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5 + (((tickAnim - 0) / 21) * (0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 8.52947 + (((tickAnim - 21) / 19) * (4-(8.52947)));
            yy = 7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3 + (((tickAnim - 21) / 19) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3-(7.4816+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*3)));
            zz = 0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5 + (((tickAnim - 21) / 19) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5-(0.1274+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/0.75+220))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+150))*1.5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75+50))*2.5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*135/0.75-120))*1.5));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 10.5 + (((tickAnim - 0) / 6) * (17-(10.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 15) * (0-(0)));
            zz = 17 + (((tickAnim - 6) / 15) * (-10-(17)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = -10 + (((tickAnim - 21) / 19) * (10.5-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (-1-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = -1 + (((tickAnim - 21) / 19) * (0-(-1)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.75 + (((tickAnim - 6) / 7) * (-33.83466-(-3.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (6.99551-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.34286-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -33.83466 + (((tickAnim - 13) / 8) * (0-(-33.83466)));
            yy = 6.99551 + (((tickAnim - 13) / 8) * (0-(6.99551)));
            zz = -0.34286 + (((tickAnim - 13) / 8) * (9.5-(-0.34286)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 9.5 + (((tickAnim - 21) / 19) * (0-(9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (-0.125-(0)));
            yy = -0.25 + (((tickAnim - 6) / 7) * (0.685-(-0.25)));
            zz = -0.4 + (((tickAnim - 6) / 7) * (0.155-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -0.125 + (((tickAnim - 13) / 8) * (0-(-0.125)));
            yy = 0.685 + (((tickAnim - 13) / 8) * (0-(0.685)));
            zz = 0.155 + (((tickAnim - 13) / 8) * (0-(0.155)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -6.75 + (((tickAnim - 0) / 6) * (-12.75-(-6.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 6) / 7) * (87.7309-(3.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (-3.7803-(0)));
            zz = -12.75 + (((tickAnim - 6) / 7) * (1.38141-(-12.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 87.7309 + (((tickAnim - 13) / 6) * (24.93643-(87.7309)));
            yy = -3.7803 + (((tickAnim - 13) / 6) * (-6.86102-(-3.7803)));
            zz = 1.38141 + (((tickAnim - 13) / 6) * (-4.49519-(1.38141)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 24.93643 + (((tickAnim - 19) / 2) * (0-(24.93643)));
            yy = -6.86102 + (((tickAnim - 19) / 2) * (0-(-6.86102)));
            zz = -4.49519 + (((tickAnim - 19) / 2) * (0-(-4.49519)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 19) * (-6.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.62 + (((tickAnim - 0) / 6) * (-0.35-(-0.62)));
            zz = -0.67 + (((tickAnim - 0) / 6) * (0-(-0.67)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 6) / 7) * (0.525-(-0.35)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.675-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 27) * (-0.62-(0.525)));
            zz = -0.675 + (((tickAnim - 13) / 27) * (-0.67-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -20.44961 + (((tickAnim - 0) / 23) * (0-(-20.44961)));
            yy = 3.73929 + (((tickAnim - 0) / 23) * (0-(3.73929)));
            zz = -21.18752 + (((tickAnim - 0) / 23) * (11.5-(-21.18752)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (-20.44961-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (3.73929-(0)));
            zz = 11.5 + (((tickAnim - 23) / 17) * (-21.18752-(11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -1.675 + (((tickAnim - 23) / 9) * (0-(-1.675)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 11.25 + (((tickAnim - 0) / 23) * (0-(11.25)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-14-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (-19.82225-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (-10.73125-(0)));
            zz = -14 + (((tickAnim - 23) / 9) * (2.29326-(-14)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -19.82225 + (((tickAnim - 32) / 8) * (11.25-(-19.82225)));
            yy = -10.73125 + (((tickAnim - 32) / 8) * (0-(-10.73125)));
            zz = 2.29326 + (((tickAnim - 32) / 8) * (0-(2.29326)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -0.195 + (((tickAnim - 0) / 23) * (0.375-(-0.195)));
            yy = -0.445 + (((tickAnim - 0) / 23) * (0.725-(-0.445)));
            zz = -0.32 + (((tickAnim - 0) / 23) * (-0.325-(-0.32)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0.375 + (((tickAnim - 23) / 9) * (-0.195-(0.375)));
            yy = 0.725 + (((tickAnim - 23) / 9) * (0.73-(0.725)));
            zz = -0.325 + (((tickAnim - 23) / 9) * (-0.32-(-0.325)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.195 + (((tickAnim - 32) / 8) * (-0.195-(-0.195)));
            yy = 0.73 + (((tickAnim - 32) / 8) * (-0.445-(0.73)));
            zz = -0.32 + (((tickAnim - 32) / 8) * (-0.32-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 10.72747 + (((tickAnim - 0) / 23) * (0-(10.72747)));
            yy = -7.5617 + (((tickAnim - 0) / 23) * (0-(-7.5617)));
            zz = 18.83566 + (((tickAnim - 0) / 23) * (0-(18.83566)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (73.886-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (4.187-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (2.2465-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 73.886 + (((tickAnim - 32) / 8) * (10.72747-(73.886)));
            yy = 4.187 + (((tickAnim - 32) / 8) * (-7.5617-(4.187)));
            zz = 2.2465 + (((tickAnim - 32) / 8) * (18.83566-(2.2465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0.075 + (((tickAnim - 0) / 12) * (0.2-(-0.075)));
            yy = 0.875 + (((tickAnim - 0) / 12) * (1.21-(0.875)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0.2 + (((tickAnim - 12) / 11) * (0-(0.2)));
            yy = 1.21 + (((tickAnim - 12) / 11) * (0-(1.21)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0.2-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0.46-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (-0.775-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0.2 + (((tickAnim - 32) / 8) * (-0.075-(0.2)));
            yy = 0.46 + (((tickAnim - 32) / 8) * (0.875-(0.46)));
            zz = -0.775 + (((tickAnim - 32) / 8) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0.5818), neck1.rotateAngleY + (float) Math.toRadians(-6.3296+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-3.5), neck1.rotateAngleZ + (float) Math.toRadians(-3.544+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(4.11521), neck2.rotateAngleY + (float) Math.toRadians(-31.7168+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), neck2.rotateAngleZ + (float) Math.toRadians(0.77155));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4.11521), neck3.rotateAngleY + (float) Math.toRadians(-31.7168+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3), neck3.rotateAngleZ + (float) Math.toRadians(0.77155));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.45);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(9.25), neck4.rotateAngleY + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-3), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-12.25), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -9.15574 + (((tickAnim - 0) / 8) * (-15.11051-(-9.15574)));
            yy = 0.85375 + (((tickAnim - 0) / 8) * (-5.39444-(0.85375)));
            zz = 6.77722 + (((tickAnim - 0) / 8) * (0.00362-(6.77722)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -15.11051 + (((tickAnim - 8) / 7) * (-7.35841-(-15.11051)));
            yy = -5.39444 + (((tickAnim - 8) / 7) * (-1.68515-(-5.39444)));
            zz = 0.00362 + (((tickAnim - 8) / 7) * (-9.60466-(0.00362)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -7.35841 + (((tickAnim - 15) / 25) * (-9.15574-(-7.35841)));
            yy = -1.68515 + (((tickAnim - 15) / 25) * (0.85375-(-1.68515)));
            zz = -9.60466 + (((tickAnim - 15) / 25) * (6.77722-(-9.60466)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 0) / 8) * (12.25-(-16)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 8) / 7) * (-10.74763-(12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (-3.15825-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (8.9642-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = -10.74763 + (((tickAnim - 15) / 25) * (-16-(-10.74763)));
            yy = -3.15825 + (((tickAnim - 15) / 25) * (0-(-3.15825)));
            zz = 8.9642 + (((tickAnim - 15) / 25) * (0-(8.9642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.75 + (((tickAnim - 0) / 8) * (-0.87-(10.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.87 + (((tickAnim - 8) / 7) * (18-(-0.87)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 18 + (((tickAnim - 15) / 25) * (10.75-(18)));
            yy = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -0.2 + (((tickAnim - 0) / 8) * (0-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0.65 + (((tickAnim - 15) / 25) * (0-(0.65)));
            zz = 0.2 + (((tickAnim - 15) / 25) * (-0.2-(0.2)));
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
            xx = 13.05788 + (((tickAnim - 0) / 3) * (18.04815-(13.05788)));
            yy = 3.25079 + (((tickAnim - 0) / 3) * (2.43762-(3.25079)));
            zz = -6.76251 + (((tickAnim - 0) / 3) * (-5.09426-(-6.76251)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 18.04815 + (((tickAnim - 3) / 5) * (21-(18.04815)));
            yy = 2.43762 + (((tickAnim - 3) / 5) * (0-(2.43762)));
            zz = -5.09426 + (((tickAnim - 3) / 5) * (0-(-5.09426)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 8) / 5) * (0-(21)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (13.05788-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (3.25079-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (-6.76251-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 3) * (0.855-(0.15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.855 + (((tickAnim - 3) / 5) * (1.01-(0.855)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.01 + (((tickAnim - 8) / 7) * (0-(1.01)));
            zz = -0.65 + (((tickAnim - 8) / 7) * (0-(-0.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 15) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 25) * (0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 25) * (0-(0)));
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
            xx = 7.49882 + (((tickAnim - 0) / 15) * (0-(7.49882)));
            yy = 0.10894 + (((tickAnim - 0) / 15) * (0-(0.10894)));
            zz = -1.24524 + (((tickAnim - 0) / 15) * (10.75-(-1.24524)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (3.49009-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (-2.27627-(0)));
            zz = 10.75 + (((tickAnim - 15) / 10) * (3.13319-(10.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 3.49009 + (((tickAnim - 25) / 9) * (7.4771-(3.49009)));
            yy = -2.27627 + (((tickAnim - 25) / 9) * (0.47863-(-2.27627)));
            zz = 3.13319 + (((tickAnim - 25) / 9) * (-5.4792-(3.13319)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 7.4771 + (((tickAnim - 34) / 6) * (7.49882-(7.4771)));
            yy = 0.47863 + (((tickAnim - 34) / 6) * (0.10894-(0.47863)));
            zz = -5.4792 + (((tickAnim - 34) / 6) * (-1.24524-(-5.4792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -9.25 + (((tickAnim - 0) / 15) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (14.16667-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = -11.25 + (((tickAnim - 15) / 10) * (-3.08333-(-11.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 14.16667 + (((tickAnim - 25) / 9) * (-8.75-(14.16667)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = -3.08333 + (((tickAnim - 25) / 9) * (6.25-(-3.08333)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 34) / 6) * (-9.25-(-8.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 6.25 + (((tickAnim - 34) / 6) * (0-(6.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.25 + (((tickAnim - 0) / 15) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 15) / 10) * (0.25-(0.25)));
            yy = -0.65 + (((tickAnim - 15) / 10) * (0.515-(-0.65)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0.25 + (((tickAnim - 25) / 9) * (0.25-(0.25)));
            yy = 0.515 + (((tickAnim - 25) / 9) * (0-(0.515)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.25 + (((tickAnim - 34) / 6) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 15) * (0-(-0.075)));
            zz = 0.55 + (((tickAnim - 0) / 15) * (0-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 15) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 19) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 15) / 19) * (0.55-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 34) / 6) * (-0.075-(-0.075)));
            zz = 0.55 + (((tickAnim - 34) / 6) * (0.55-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 22.25 + (((tickAnim - 25) / 9) * (0-(22.25)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (1.575-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 1.575 + (((tickAnim - 25) / 9) * (0-(1.575)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
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



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLoricatosaurus e = (EntityPrehistoricFloraLoricatosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck4, (float) Math.toRadians(-4), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(10);

    }
}
