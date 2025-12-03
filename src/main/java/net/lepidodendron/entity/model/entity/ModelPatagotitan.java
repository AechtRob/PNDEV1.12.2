package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPatagotitan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPatagotitan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Patagotitan;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tail9;
    private final AdvancedModelRenderer tail10;
    private final AdvancedModelRenderer tail11;
    private final AdvancedModelRenderer tail12;
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer throat3;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r86;

    private ModelAnimator animator;

    public ModelPatagotitan() {
        this.textureWidth = 384;
        this.textureHeight = 384;

        this.Patagotitan = new AdvancedModelRenderer(this);
        this.Patagotitan.setRotationPoint(0.0F, -37.5F, 25.5F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Patagotitan.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3067F, 0.097F, 0.1777F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 229, 183, 0.0F, 0.0F, 0.0F, 7, 5, 2, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3251F, 0.346F, 0.0946F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 152, 91, 3.9F, 0.0F, 0.0F, 3, 5, 2, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3707F, 0.5923F, -0.0052F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 120, 0.0F, 0.0F, 0.0F, 8, 5, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3707F, -0.5923F, 0.0052F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 234, 120, -8.0F, 0.0F, 0.0F, 8, 5, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3067F, -0.097F, -0.1777F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 229, 183, -7.0F, 0.0F, 0.0F, 7, 5, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(20.5433F, -18.2962F, 6.6658F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3251F, -0.346F, -0.0946F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 152, 91, -6.9F, 0.0F, 0.0F, 3, 5, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 23.0F, 1.0F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 142, 0, -15.0F, -41.0F, -20.0F, 30, 18, 28, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 15.75F, 24.5F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 123, 113, -19.0F, -28.0F, -37.0F, 38, 28, 35, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.5F, 13.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 248, 155, -12.5F, -15.0F, -1.0F, 25, 28, 21, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0143F, -0.0385F, 0.265F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 117, 0.0F, 0.0F, 0.0F, 6, 5, 2, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0148F, 0.2669F, 0.2695F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 91, 3.25F, 0.0F, 0.0F, 3, 5, 2, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.017F, 0.5723F, 0.2748F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 229, 176, 0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0148F, -0.2669F, -0.2695F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 91, -6.25F, 0.0F, 0.0F, 3, 5, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0143F, 0.0385F, -0.265F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 117, -6.0F, 0.0F, 0.0F, 6, 5, 2, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(16.5433F, -14.7962F, 8.6658F);
        this.tail1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.017F, -0.5723F, -0.2748F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 229, 176, -7.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.75F, 20.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 258, 0, -10.0F, -13.0F, -3.0F, 20, 25, 23, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0916F, 0.2347F, 0.287F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 10, 3.7F, 0.0F, 0.0F, 1, 5, 1, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0892F, 0.0609F, 0.2711F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 119, 113, 0.0F, 0.0F, 0.0F, 5, 5, 2, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1099F, 0.6255F, 0.3302F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 117, 0.0F, 0.0F, 0.0F, 6, 5, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0916F, -0.2347F, -0.287F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 10, -4.7F, 0.0F, 0.0F, 1, 5, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0892F, -0.0609F, -0.2711F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 119, 113, -5.0F, 0.0F, 0.0F, 5, 5, 2, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(13.1433F, -12.9462F, 5.4158F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1099F, -0.6255F, -0.3302F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 117, -6.0F, 0.0F, 0.0F, 6, 5, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -2.75F, 20.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 216, 267, -8.0F, -10.0F, -3.0F, 16, 20, 22, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-9.9433F, -9.2962F, 4.6658F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.034F, 0.0804F, 0.2631F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 109, 210, 0.0F, 0.0F, 0.0F, 4, 5, 2, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-9.9433F, -9.2962F, 4.6658F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0456F, 0.7344F, 0.291F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 37, 0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(9.9433F, -9.2962F, 4.6658F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.034F, -0.0804F, -0.2631F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 109, 210, -4.0F, 0.0F, 0.0F, 4, 5, 2, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(9.9433F, -9.2962F, 4.6658F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0456F, -0.7344F, -0.291F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 37, -5.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 19.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 258, 48, -6.5F, -9.0F, -3.0F, 13, 16, 22, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-7.9433F, -8.5462F, 5.6658F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0413F, 0.8062F, 0.2859F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 119, 120, 0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-7.9433F, -8.5462F, 5.6658F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0286F, -0.0224F, 0.2555F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, 0.0F, 0.0F, 3, 5, 2, 0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(7.9433F, -8.5462F, 5.6658F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0413F, -0.8062F, -0.2859F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 119, 120, -4.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(7.9433F, -8.5462F, 5.6658F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0286F, 0.0224F, -0.2555F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -3.0F, 0.0F, 0.0F, 3, 5, 2, 0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -1.75F, 19.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.2182F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 299, 204, -5.0F, -7.0F, -3.0F, 10, 12, 21, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.75F, 18.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0873F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 312, 66, -4.0F, -6.0F, -2.0F, 8, 10, 20, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.25F, 18.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, 0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 138, 236, -3.0F, -5.5F, -2.0F, 6, 7, 19, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -1.25F, 17.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1309F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 201, 176, -2.5F, -4.0F, -2.0F, 5, 5, 18, 0.0F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, -1.75F, 16.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.2618F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 230, 0, -2.0F, -2.0F, -1.0F, 4, 4, 17, 0.0F, false));

        this.tail10 = new AdvancedModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1309F, 0.0F, 0.0F);
        this.tail10.cubeList.add(new ModelBox(tail10, 0, 110, -1.5F, -1.25F, -1.0F, 3, 3, 16, 0.0F, false));

        this.tail11 = new AdvancedModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.1745F, 0.0F, 0.0F);
        this.tail11.cubeList.add(new ModelBox(tail11, 119, 113, -1.0F, -1.0F, -1.0F, 2, 2, 15, 0.0F, false));

        this.tail12 = new AdvancedModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, -0.25F, 14.0F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.1309F, 0.0F, 0.0F);
        this.tail12.cubeList.add(new ModelBox(tail12, 188, 46, -0.5F, -0.5F, -0.5F, 1, 1, 15, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.5F, -3.5F);
        this.hips.addChild(body);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.327F, 0.0652F, 0.2176F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 25, 30, 0.0F, 0.0F, 0.0F, 8, 5, 2, 0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3391F, 0.2714F, 0.1454F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 188, 46, 4.55F, 0.0F, 0.0F, 4, 5, 2, -0.01F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3689F, 0.4762F, 0.0643F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 157, 0.0F, 0.0F, 0.0F, 9, 5, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3282F, 0.1065F, 0.2035F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 122, 187, 0.0F, 0.0F, 0.0F, 11, 5, 2, 0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3391F, 0.2714F, 0.1454F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 22, 110, 5.8F, 0.0F, 0.0F, 6, 5, 2, -0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3613F, 0.4354F, 0.0816F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 228, 46, 0.0F, 0.0F, 0.0F, 12, 5, 2, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.327F, -0.0652F, -0.2176F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 25, 30, -8.0F, 0.0F, 0.0F, 8, 5, 2, 0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3391F, -0.2714F, -0.1454F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 188, 46, -8.55F, 0.0F, 0.0F, 4, 5, 2, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(26.5433F, -16.7962F, -8.3342F);
        this.body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3689F, -0.4762F, -0.0643F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 157, -9.0F, 0.0F, 0.0F, 9, 5, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3613F, -0.4354F, -0.0816F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 228, 46, -12.0F, 0.0F, 0.0F, 12, 5, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.3391F, -0.2714F, -0.1454F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 22, 110, -11.8F, 0.0F, 0.0F, 6, 5, 2, -0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(29.5433F, -22.5462F, -25.3342F);
        this.body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3282F, -0.1065F, -0.2035F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 122, 187, -11.0F, 0.0F, 0.0F, 11, 5, 2, 0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 20.0F, -21.75F);
        this.body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.3491F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 91, -20.0F, -41.0F, -29.0F, 40, 18, 39, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 35.0F, -22.0F);
        this.body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1745F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -24.0F, -45.0F, -29.0F, 48, 45, 46, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -9.0F, -41.0F);
        this.body.addChild(chest);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.3217F, 0.0924F, 0.1524F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 188, 53, 4.55F, 0.0F, 0.0F, 4, 5, 2, -0.01F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.3225F, -0.1146F, 0.2213F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 164, 0.0F, 0.0F, 0.0F, 9, 5, 2, 0.01F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.3357F, 0.299F, 0.0807F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 230, 21, 0.0F, 0.0F, 0.0F, 9, 5, 2, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.3217F, -0.0924F, -0.1524F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 188, 53, -8.55F, 0.0F, 0.0F, 4, 5, 2, -0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.3225F, 0.1146F, -0.2213F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 164, -9.0F, 0.0F, 0.0F, 9, 5, 2, 0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(23.5433F, -18.5462F, -2.3342F);
        this.chest.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.3357F, -0.299F, -0.0807F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 230, 21, -9.0F, 0.0F, 0.0F, 9, 5, 2, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 13.0F, -24.75F);
        this.chest.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.3927F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 210, -16.0F, -41.0F, -2.0F, 32, 30, 20, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 26.0F, -25.25F);
        this.chest.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -1.4399F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 162, 65, -17.0F, -22.0F, -26.0F, 35, 22, 26, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 25.0F, -27.0F);
        this.chest.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.5672F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 148, -19.0F, -39.0F, 2.0F, 38, 39, 23, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(19.0F, 25.0F, -14.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0873F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 64, 292, -6.0F, -8.0F, -6.0F, 12, 35, 13, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2182F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -5.0F, -3.0F, -5.0F, 10, 19, 11, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 16.0F, 0.5F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1309F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 119, 91, -6.0F, -3.0F, -4.5F, 12, 13, 9, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-19.0F, 25.0F, -14.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0873F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 64, 292, -6.0F, -8.0F, -6.0F, 12, 35, 13, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2182F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -5.0F, -3.0F, -5.0F, 10, 19, 11, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 16.0F, 0.5F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1309F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 119, 91, -6.0F, -3.0F, -4.5F, 12, 13, 9, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -5.0F, -16.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.6545F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 122, 176, -13.0F, -19.75F, -22.0F, 26, 33, 27, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0201F, 0.217F, 0.2567F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 138, 121, 0.0F, 0.0F, 0.0F, 8, 5, 2, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0196F, -0.0447F, 0.2619F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 119, 91, 5.05F, 0.0F, 0.0F, 3, 5, 1, -0.01F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0199F, -0.1756F, 0.2645F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 210, 0.0F, 0.0F, 0.0F, 8, 5, 2, 0.01F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0199F, 0.1756F, -0.2645F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 210, -8.0F, 0.0F, 0.0F, 8, 5, 2, 0.01F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0201F, -0.217F, -0.2567F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 138, 121, -8.0F, 0.0F, 0.0F, 8, 5, 2, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(18.5433F, -17.5462F, -13.3342F);
        this.neck1.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0196F, 0.0447F, -0.2619F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 119, 91, -8.05F, 0.0F, 0.0F, 3, 5, 1, -0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.25F, -22.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 199, 207, -10.5F, -21.75F, -26.0F, 21, 31, 29, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0201F, -0.2192F, 0.2654F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 201, 176, 0.0F, 0.0F, 0.0F, 7, 5, 2, 0.01F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r59);
        this.setRotateAngle(cube_r59, -0.0197F, -0.0883F, 0.2627F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 0, 30, 4.3F, 0.0F, 0.0F, 2, 5, 1, -0.01F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0203F, 0.2607F, 0.2558F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 110, 0.0F, 0.0F, 0.0F, 6, 5, 2, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0201F, 0.2192F, -0.2654F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 201, 176, -7.0F, 0.0F, 0.0F, 7, 5, 2, 0.01F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.0203F, -0.2607F, -0.2558F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 110, -6.0F, 0.0F, 0.0F, 6, 5, 2, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(14.5433F, -19.7962F, -17.3342F);
        this.neck2.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.0197F, 0.0883F, -0.2627F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 30, -6.3F, 0.0F, 0.0F, 2, 5, 1, -0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.75F, -26.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2182F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 76, 236, -8.5F, -19.75F, -25.0F, 17, 28, 28, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -3.25F, -25.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0873F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 257, 86, -7.0F, -16.25F, -24.0F, 14, 25, 27, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -4.25F, -24.0F);
        this.neck4.addChild(neck5);
        this.neck5.cubeList.add(new ModelBox(neck5, 140, 266, -6.0F, -11.75F, -23.0F, 12, 21, 26, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.75F, -23.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1309F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 274, 242, -5.0F, -10.75F, -22.0F, 10, 18, 25, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -2.25F, -22.0F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.2269F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 269, 286, -4.5F, -8.25F, -21.0F, 9, 15, 23, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, -1.25F, -21.0F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.3927F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 0, 91, -4.0F, -6.0F, -8.0F, 8, 8, 11, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.25F, -0.7691F, -6.4435F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 30, -4.25F, -5.5F, -5.6F, 9, 9, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 188, 62, -4.25F, -3.5F, -3.6F, 9, 1, 2, 0.01F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.25F, -2.726F, -9.7704F);
        this.head.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.9861F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 27, 91, -2.5F, -5.0F, 0.0F, 3, 5, 3, 0.01F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.25F, 2.6787F, -15.6687F);
        this.head.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.829F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 31, 0, -2.5F, -8.0F, 0.0F, 3, 8, 3, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(1.25F, -0.3321F, -8.4279F);
        this.head.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 1.0647F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 148, -3.5F, 0.0F, -0.1F, 5, 3, 6, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(1.25F, 3.026F, -13.699F);
        this.head.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.5672F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 122, 176, -3.5F, 0.0F, 0.0F, 5, 3, 8, -0.01F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(1.25F, 5.6331F, -16.1896F);
        this.head.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.1309F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 234, 113, -3.5F, 0.0F, 0.0F, 5, 2, 5, -0.01F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(1.25F, 7.2431F, -12.8179F);
        this.head.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.1134F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 201, 199, -2.5F, -1.0F, 0.0F, 3, 1, 3, -0.01F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(1.25F, 6.7221F, -15.7724F);
        this.head.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.1745F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 213, 199, -2.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(1.25F, 6.5014F, -11.2656F);
        this.head.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.1745F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 138, 113, -3.5F, -3.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(1.25F, 1.0699F, -7.3287F);
        this.head.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 1.1345F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 228, 199, -4.5F, 0.0F, 0.0F, 7, 2, 5, -0.01F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(1.25F, 6.5014F, -11.2656F);
        this.head.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.48F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 84, 220, -4.5F, -0.4F, 0.0F, 7, 1, 7, -0.01F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(1.25F, 6.9266F, -9.9168F);
        this.head.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.6545F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 201, 190, -3.5F, -1.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(1.25F, 3.5F, -5.5F);
        this.head.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.48F, 0.0F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 205, 46, -4.5F, -3.0F, -6.5F, 7, 3, 9, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.25F, 3.0191F, -0.5565F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1571F, 0.0F, 0.0F);


        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 0.4325F, -5.012F);
        this.jaw.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.8203F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 99, 158, -3.0F, 0.0F, -4.95F, 7, 2, 5, -0.03F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, 6.7241F, -8.7609F);
        this.jaw.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.4102F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 27, 99, -2.0F, -1.95F, -0.95F, 5, 2, 1, -0.03F, false));
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 201, 183, -1.0F, -2.9F, -4.4F, 3, 1, 6, 0.0F, false));
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 217, -2.0F, -1.95F, -5.25F, 5, 2, 5, -0.02F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 7.0094F, -14.3071F);
        this.jaw.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.3927F, 0.0F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 99, 165, -2.0F, -0.95F, -0.05F, 5, 1, 5, -0.03F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, 5.1129F, -9.8921F);
        this.jaw.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.5672F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 122, 194, -3.0F, -0.9F, 0.0F, 7, 1, 6, -0.04F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.0F, 3.4122F, -4.6738F);
        this.jaw.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.6109F, 0.0F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 142, 13, -3.0F, -1.6F, -5.25F, 7, 2, 7, -0.02F, false));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.0F, 0.4314F, -5.0158F);
        this.jaw.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.1309F, 0.0F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 104, 228, -3.0F, -2.1F, -1.9F, 7, 5, 2, -0.05F, false));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 142, 22, -4.0F, -1.95F, 0.0F, 9, 2, 4, -0.02F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.0F, 2.85F, -5.0F);
        this.jaw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.1309F, 0.0F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 84, 210, -4.0F, -2.4F, 0.3F, 9, 3, 7, -0.01F, false));

        this.throat3 = new AdvancedModelRenderer(this);
        this.throat3.setRotationPoint(0.0F, 5.215F, -6.487F);
        this.jaw.addChild(throat3);
        this.setRotateAngle(throat3, 0.3491F, 0.0F, 0.0F);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat3.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.2356F, 0.0F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 99, 148, -2.0F, -3.0F, -0.05F, 5, 3, 7, -0.02F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.0F, 1.1672F, 4.8619F);
        this.throat3.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.4974F, 0.0F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 142, 0, -2.5F, -6.0F, -0.05F, 6, 6, 7, -0.02F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(19.0F, 0.0F, 0.0F);
        this.Patagotitan.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.3491F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 260, -7.0F, -8.0F, -8.0F, 14, 43, 18, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 35.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5672F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 203, 309, -6.0F, -5.0F, -6.0F, 12, 31, 13, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2182F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 310, 285, -7.0F, -1.0F, -9.0F, 14, 6, 17, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.leftFoot.addChild(leftToes);


        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.leftToes.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, -0.2618F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 232, 53, -5.0F, 0.0F, -3.0F, 10, 6, 5, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-19.0F, 0.0F, 0.0F);
        this.Patagotitan.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.3491F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 260, -7.0F, -8.0F, -8.0F, 14, 43, 18, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 35.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5672F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 203, 309, -6.0F, -5.0F, -6.0F, 12, 31, 13, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.2182F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 310, 285, -7.0F, -1.0F, -9.0F, 14, 6, 17, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.rightFoot.addChild(rightToes);


        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.rightToes.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, 0.2618F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 232, 53, -5.0F, 0.0F, -3.0F, 10, 6, 5, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Patagotitan.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Patagotitan.offsetY = 1.8F;
        this.Patagotitan.offsetX = 0.2F;
        this.Patagotitan.rotateAngleY = (float)Math.toRadians(-68);
        this.Patagotitan.rotateAngleX = (float)Math.toRadians(15);
        this.Patagotitan.rotateAngleZ = (float)Math.toRadians(-10);
        this.Patagotitan.scaleChildren = true;
        float scaler = 0.35F;
        this.Patagotitan.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Patagotitan, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Patagotitan.render(f);
        //Reset rotations, positions and sizing:
        this.Patagotitan.setScale(1.0F, 1.0F, 1.0F);
        this.Patagotitan.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPatagotitan camara = (EntityPrehistoricFloraPatagotitan) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = camara.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck3.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck3.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11, this.tail12};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        camara.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = camara.getTravelSpeed()/2;

            if (!camara.isInWater()) {

                if (f3 == 0.0F || !camara.getIsMoving()) {
                    if (camara.getAnimation() != camara.EAT_ANIMATION
                        && camara.getAnimation() != camara.DRINK_ANIMATION
                        && camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.04F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.walk(jaw, (float) ( 0.04), 0.1F, true, 0, 0, f2, 1);
                    }

                    if (camara.getAnimation() != camara.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
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
        EntityPrehistoricFloraPatagotitan ee = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }



    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 229;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -2 + (((tickAnim - 40) / 34) * (-0.75-(-2)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 201) {
            xx = -0.75 + (((tickAnim - 74) / 127) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 74) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 127) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 229) {
            xx = -0.75 + (((tickAnim - 201) / 28) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 201) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5 + (((tickAnim - 40) / 189) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-0.5)));
            yy = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 40) / 189) * (0-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 40) / 53) * (-2.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(-2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 229) {
            xx = -2.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 93) / 136) * (0-(-2.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 93) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 136) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = -1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 40) / 53) * (1.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(-1.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 229) {
            xx = 1.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 93) / 136) * (0-(1.43+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 93) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 136) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 40) / 53) * (7.42+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 229) {
            xx = 7.42+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 93) / 136) * (0-(7.42+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 93) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 136) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 93) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2 + (((tickAnim - 40) / 53) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2)));
            yy = 0 + (((tickAnim - 40) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 53) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 229) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2 + (((tickAnim - 93) / 136) * (0-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*-2)));
            yy = 0 + (((tickAnim - 93) / 136) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 136) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = 7 + (((tickAnim - 40) / 189) * (0-(7)));
            yy = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 0.75 + (((tickAnim - 74) / 25) * (2.25-(0.75)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 201) {
            xx = 2.25 + (((tickAnim - 99) / 102) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 99) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 102) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 229) {
            xx = 2.25 + (((tickAnim - 201) / 28) * (0-(2.25)));
            yy = 0 + (((tickAnim - 201) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 1 + (((tickAnim - 74) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 99) / 102) * (1-(0)));
            yy = 0 + (((tickAnim - 99) / 102) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 102) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 229) {
            xx = 1 + (((tickAnim - 201) / 28) * (0-(1)));
            yy = 0 + (((tickAnim - 201) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 2.75 + (((tickAnim - 40) / 34) * (0-(2.75)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 74) / 25) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 229) {
            xx = -1.5 + (((tickAnim - 99) / 130) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 99) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 130) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(0);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(0);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            yy = -1.125 + (((tickAnim - 40) / 189) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            yy = -1.475 + (((tickAnim - 40) / 34) * (0.355-(-1.475)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            yy = 0.355 + (((tickAnim - 74) / 25) * (0-(0.355)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 99) / 130) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 130) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -11.25 + (((tickAnim - 40) / 34) * (-16.5-(-11.25)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -16.5 + (((tickAnim - 74) / 25) * (-15.75-(-16.5)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 203) {
            xx = -15.75 + (((tickAnim - 99) / 104) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 99) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 104) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 218) {
            xx = -15.75 + (((tickAnim - 203) / 15) * (4.61-(-15.75)));
            yy = 0 + (((tickAnim - 203) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 15) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 229) {
            xx = 4.61 + (((tickAnim - 218) / 11) * (0-(4.61)));
            yy = 0 + (((tickAnim - 218) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(0);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(0);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -28 + (((tickAnim - 20) / 20) * (0-(-28)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 40) / 59) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 40) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 59) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 203) {
            xx = -7.25 + (((tickAnim - 99) / 104) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 99) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 104) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 218) {
            xx = -7.25 + (((tickAnim - 203) / 15) * (-35.42-(-7.25)));
            yy = 0 + (((tickAnim - 203) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 15) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 229) {
            xx = -35.42 + (((tickAnim - 218) / 11) * (0-(-35.42)));
            yy = 0 + (((tickAnim - 218) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 1.975 + (((tickAnim - 20) / 20) * (-2.3-(1.975)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 40) / 163) * (0-(0)));
            yy = -2.3 + (((tickAnim - 40) / 163) * (0-(-2.3)));
            zz = 0 + (((tickAnim - 40) / 163) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 203) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 203) / 15) * (2.685-(0)));
            zz = 0 + (((tickAnim - 203) / 15) * (1.075-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 218) / 11) * (0-(0)));
            yy = 2.685 + (((tickAnim - 218) / 11) * (0-(2.685)));
            zz = 1.075 + (((tickAnim - 218) / 11) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (54-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 54 + (((tickAnim - 20) / 20) * (4.5-(54)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 4.5 + (((tickAnim - 40) / 34) * (17.75-(4.5)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 17.75 + (((tickAnim - 74) / 25) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 203) {
            xx = 17.75 + (((tickAnim - 99) / 104) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 99) / 104) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 104) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 218) {
            xx = 17.75 + (((tickAnim - 203) / 15) * (27.26-(17.75)));
            yy = 0 + (((tickAnim - 203) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 15) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 229) {
            xx = 27.26 + (((tickAnim - 218) / 11) * (0-(27.26)));
            yy = 0 + (((tickAnim - 218) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.325-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.9-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 2.325 + (((tickAnim - 20) / 20) * (-1.7-(2.325)));
            zz = -0.9 + (((tickAnim - 20) / 20) * (0-(-0.9)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            yy = -1.7 + (((tickAnim - 40) / 34) * (-0.05-(-1.7)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            yy = -0.05 + (((tickAnim - 74) / 25) * (-0.05-(-0.05)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 99) / 104) * (0-(0)));
            yy = -0.05 + (((tickAnim - 99) / 104) * (-1.3-(-0.05)));
            zz = 0 + (((tickAnim - 99) / 104) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 203) / 26) * (0-(0)));
            yy = -1.3 + (((tickAnim - 203) / 26) * (0-(-1.3)));
            zz = 0 + (((tickAnim - 203) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 3.5 + (((tickAnim - 40) / 34) * (2.25-(3.5)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 2.25 + (((tickAnim - 74) / 25) * (-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*3-(2.25)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = -1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*3 + (((tickAnim - 99) / 31) * (0-(-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+150))*3)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 174) {
            xx = 0 + (((tickAnim - 130) / 44) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 130) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 44) * (0-(0)));
        }
        else if (tickAnim >= 174 && tickAnim < 204) {
            xx = -1.25 + (((tickAnim - 174) / 30) * (-0.75-(-1.25)));
            yy = 0 + (((tickAnim - 174) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 174) / 30) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -0.75 + (((tickAnim - 204) / 25) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 2.5 + (((tickAnim - 40) / 34) * (-0.25-(2.5)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -0.25 + (((tickAnim - 74) / 25) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3-(-0.25)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 170) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3 + (((tickAnim - 99) / 71) * (2.5-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*3)));
            yy = 0 + (((tickAnim - 99) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 71) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = 2.5 + (((tickAnim - 170) / 34) * (-0.25-(2.5)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -0.25 + (((tickAnim - 204) / 25) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 3.25 + (((tickAnim - 40) / 34) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = 4.75 + (((tickAnim - 74) / 25) * (-1.75-(4.75)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = -1.75 + (((tickAnim - 99) / 31) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = 3.25 + (((tickAnim - 170) / 34) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = 4.75 + (((tickAnim - 204) / 25) * (0-(4.75)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 1.25 + (((tickAnim - 40) / 34) * (-3.5-(1.25)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -3.5 + (((tickAnim - 74) / 25) * (-1.5-(-3.5)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = -1.5 + (((tickAnim - 99) / 31) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (1.25-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = 1.25 + (((tickAnim - 170) / 34) * (-3.5-(1.25)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -3.5 + (((tickAnim - 204) / 25) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = 1.75 + (((tickAnim - 40) / 34) * (3.23492-(1.75)));
            yy = 0 + (((tickAnim - 40) / 34) * (0.20027-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0.07262-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 130) {
            xx = 3.23492 + (((tickAnim - 74) / 56) * (0-(3.23492)));
            yy = 0.20027 + (((tickAnim - 74) / 56) * (0-(0.20027)));
            zz = 0.07262 + (((tickAnim - 74) / 56) * (0-(0.07262)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (1.75-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = 1.75 + (((tickAnim - 170) / 34) * (3.23492-(1.75)));
            yy = 0 + (((tickAnim - 170) / 34) * (0.20027-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0.07262-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = 3.23492 + (((tickAnim - 204) / 25) * (0-(3.23492)));
            yy = 0.20027 + (((tickAnim - 204) / 25) * (0-(0.20027)));
            zz = 0.07262 + (((tickAnim - 204) / 25) * (0-(0.07262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -1.75 + (((tickAnim - 40) / 34) * (3.75-(-1.75)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 130) {
            xx = 3.75 + (((tickAnim - 74) / 56) * (0-(3.75)));
            yy = 0 + (((tickAnim - 74) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 56) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = -1.75 + (((tickAnim - 170) / 34) * (3.75-(-1.75)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = 3.75 + (((tickAnim - 204) / 25) * (0-(3.75)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -14.25 + (((tickAnim - 40) / 34) * (-5.5-(-14.25)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -5.5 + (((tickAnim - 74) / 25) * (4.25-(-5.5)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = 4.25 + (((tickAnim - 99) / 31) * (0-(4.25)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = -14.25 + (((tickAnim - 170) / 34) * (-5.5-(-14.25)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -5.5 + (((tickAnim - 204) / 25) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -8.5 + (((tickAnim - 40) / 34) * (-9.14-(-8.5)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -9.14 + (((tickAnim - 74) / 25) * (9-(-9.14)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = 9 + (((tickAnim - 99) / 31) * (0-(9)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = -8.5 + (((tickAnim - 170) / 34) * (-9.14-(-8.5)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -9.14 + (((tickAnim - 204) / 25) * (0-(-9.14)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 74) {
            xx = -9 + (((tickAnim - 40) / 34) * (-23.25-(-9)));
            yy = 0 + (((tickAnim - 40) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 34) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 99) {
            xx = -23.25 + (((tickAnim - 74) / 25) * (-6.75-(-23.25)));
            yy = 0 + (((tickAnim - 74) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 25) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 130) {
            xx = -6.75 + (((tickAnim - 99) / 31) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 99) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 31) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 130) / 40) * (-9-(0)));
            yy = 0 + (((tickAnim - 130) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 40) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 204) {
            xx = -9 + (((tickAnim - 170) / 34) * (-23.25-(-9)));
            yy = 0 + (((tickAnim - 170) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 34) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = -23.25 + (((tickAnim - 204) / 25) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (19.5-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 19.5 + (((tickAnim - 34) / 6) * (0-(19.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 40) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 94) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 157) {
            xx = 0 + (((tickAnim - 134) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 23) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 157) / 11) * (19.5-(0)));
            yy = 0 + (((tickAnim - 157) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 11) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 174) {
            xx = 19.5 + (((tickAnim - 168) / 6) * (0-(19.5)));
            yy = 0 + (((tickAnim - 168) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 74) / 56) * (0-(1)));
            yy = 0 + (((tickAnim - 74) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 56) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 130) / 74) * (1-(0)));
            yy = 0 + (((tickAnim - 130) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 74) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = 1 + (((tickAnim - 204) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (1.325-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (1.25-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 74) / 56) * (0-(0)));
            yy = 1.325 + (((tickAnim - 74) / 56) * (0-(1.325)));
            zz = 1.25 + (((tickAnim - 74) / 56) * (0-(1.25)));
        }
        else if (tickAnim >= 130 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 130) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 74) * (1.325-(0)));
            zz = 0 + (((tickAnim - 130) / 74) * (1.25-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 204) / 25) * (0-(0)));
            yy = 1.325 + (((tickAnim - 204) / 25) * (0-(1.325)));
            zz = 1.25 + (((tickAnim - 204) / 25) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat3.rotationPointX = this.throat3.rotationPointX + (float)(xx);
        this.throat3.rotationPointY = this.throat3.rotationPointY - (float)(yy);
        this.throat3.rotationPointZ = this.throat3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = 8.25 + (((tickAnim - 40) / 189) * (0-(8.25)));
            yy = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 229) {
            xx = -9.5 + (((tickAnim - 40) / 189) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 40) / 189) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 189) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 229) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 229) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 16 + (((tickAnim - 22) / 2) * (16-(16)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 16 + (((tickAnim - 24) / 21) * (0-(16)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 5 + (((tickAnim - 22) / 2) * (5-(5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 24) / 21) * (0-(5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-53.20372-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-12.05858-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-21.4882-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -53.20372 + (((tickAnim - 22) / 2) * (-53.20372-(-53.20372)));
            yy = -12.05858 + (((tickAnim - 22) / 2) * (-12.05858-(-12.05858)));
            zz = -21.4882 + (((tickAnim - 22) / 2) * (-21.4882-(-21.4882)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -53.20372 + (((tickAnim - 24) / 21) * (0-(-53.20372)));
            yy = -12.05858 + (((tickAnim - 24) / 21) * (0-(-12.05858)));
            zz = -21.4882 + (((tickAnim - 24) / 21) * (0-(-21.4882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-23.06568-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-6.66886-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (26.18389-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -23.06568 + (((tickAnim - 22) / 2) * (-23.06568-(-23.06568)));
            yy = -6.66886 + (((tickAnim - 22) / 2) * (-6.66886-(-6.66886)));
            zz = 26.18389 + (((tickAnim - 22) / 2) * (26.18389-(26.18389)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -23.06568 + (((tickAnim - 24) / 21) * (0-(-23.06568)));
            yy = -6.66886 + (((tickAnim - 24) / 21) * (0-(-6.66886)));
            zz = 26.18389 + (((tickAnim - 24) / 21) * (0-(26.18389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (58.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 58.75 + (((tickAnim - 22) / 2) * (58.75-(58.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 58.75 + (((tickAnim - 24) / 21) * (0-(58.75)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-0.325-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 1.9 + (((tickAnim - 22) / 2) * (1.9-(1.9)));
            zz = -0.325 + (((tickAnim - 22) / 2) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            yy = 1.9 + (((tickAnim - 24) / 21) * (0-(1.9)));
            zz = -0.325 + (((tickAnim - 24) / 21) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-53.20372-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (12.0586-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (21.4882-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -53.20372 + (((tickAnim - 22) / 2) * (-53.20372-(-53.20372)));
            yy = 12.0586 + (((tickAnim - 22) / 2) * (12.0586-(12.0586)));
            zz = 21.4882 + (((tickAnim - 22) / 2) * (21.4882-(21.4882)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -53.20372 + (((tickAnim - 24) / 21) * (0-(-53.20372)));
            yy = 12.0586 + (((tickAnim - 24) / 21) * (0-(12.0586)));
            zz = 21.4882 + (((tickAnim - 24) / 21) * (0-(21.4882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-23.06568-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (6.6689-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-26.1839-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -23.06568 + (((tickAnim - 22) / 2) * (-23.06568-(-23.06568)));
            yy = 6.6689 + (((tickAnim - 22) / 2) * (6.6689-(6.6689)));
            zz = -26.1839 + (((tickAnim - 22) / 2) * (-26.1839-(-26.1839)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -23.06568 + (((tickAnim - 24) / 21) * (0-(-23.06568)));
            yy = 6.6689 + (((tickAnim - 24) / 21) * (0-(6.6689)));
            zz = -26.1839 + (((tickAnim - 24) / 21) * (0-(-26.1839)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (58.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 58.75 + (((tickAnim - 22) / 2) * (58.75-(58.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 58.75 + (((tickAnim - 24) / 21) * (0-(58.75)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-0.325-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 1.9 + (((tickAnim - 22) / 2) * (1.9-(1.9)));
            zz = -0.325 + (((tickAnim - 22) / 2) * (-0.325-(-0.325)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            yy = 1.9 + (((tickAnim - 24) / 21) * (0-(1.9)));
            zz = -0.325 + (((tickAnim - 24) / 21) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 9.25 + (((tickAnim - 22) / 2) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 9.25 + (((tickAnim - 24) / 21) * (0-(9.25)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 19.5 + (((tickAnim - 22) / 2) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 19.5 + (((tickAnim - 24) / 21) * (0-(19.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 19 + (((tickAnim - 22) / 2) * (19-(19)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 19 + (((tickAnim - 24) / 21) * (0-(19)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 12 + (((tickAnim - 22) / 2) * (12-(12)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 12 + (((tickAnim - 24) / 21) * (0-(12)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 11.75 + (((tickAnim - 22) / 2) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 11.75 + (((tickAnim - 24) / 21) * (0-(11.75)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 7 + (((tickAnim - 22) / 2) * (7-(7)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 7 + (((tickAnim - 24) / 21) * (0-(7)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -0.5 + (((tickAnim - 22) / 2) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -0.5 + (((tickAnim - 24) / 21) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -1.75 + (((tickAnim - 22) / 2) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -1.75 + (((tickAnim - 24) / 21) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -16.5 + (((tickAnim - 22) / 2) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -16.5 + (((tickAnim - 24) / 21) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 21 + (((tickAnim - 22) / 2) * (0-(21)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -3.25 + (((tickAnim - 22) / 2) * (5.5-(-3.25)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 24) / 21) * (0-(5.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat3, throat3.rotateAngleX + (float) Math.toRadians(xx), throat3.rotateAngleY + (float) Math.toRadians(yy), throat3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.37888-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 27.50565 + (((tickAnim - 15) / 12) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 15) / 12) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 15) / 12) * (0-(-0.37888)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27.50565-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-1.70851-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (-0.37888-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27.50565 + (((tickAnim - 40) / 10) * (0-(27.50565)));
            yy = -1.70851 + (((tickAnim - 40) / 10) * (0-(-1.70851)));
            zz = -0.37888 + (((tickAnim - 40) / 10) * (0-(-0.37888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 15) / 8) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.55 + (((tickAnim - 23) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (8.25-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 8.25 + (((tickAnim - 40) / 6) * (-19.55-(8.25)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -19.55 + (((tickAnim - 46) / 4) * (0-(-19.55)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (5.475-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 23) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 6) * (5.475-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 5.475 + (((tickAnim - 46) / 4) * (0-(5.475)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 15) / 8) * (19.75-(27)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 19.75 + (((tickAnim - 23) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 27 + (((tickAnim - 40) / 6) * (19.75-(27)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 46) / 4) * (0-(19.75)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-61-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -61 + (((tickAnim - 15) / 8) * (0-(-61)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (-61-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -61 + (((tickAnim - 40) / 6) * (0-(-61)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 8) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 15) / 8) * (0-(1.725)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 13) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (1.725-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 40) / 6) * (0-(-0.775)));
            zz = 1.725 + (((tickAnim - 40) / 6) * (0-(1.725)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
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
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -17 + (((tickAnim - 15) / 20) * (-17-(-17)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 35) / 15) * (0-(-17)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-7.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.35 + (((tickAnim - 15) / 20) * (-7.35-(-7.35)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.35 + (((tickAnim - 35) / 15) * (0-(-7.35)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 15) / 20) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 2.25 + (((tickAnim - 35) / 4) * (-6.87-(2.25)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -6.87 + (((tickAnim - 39) / 4) * (-7.98-(-6.87)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -7.98 + (((tickAnim - 43) / 7) * (0-(-7.98)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 9.25 + (((tickAnim - 11) / 4) * (11.75-(9.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 11) / 4) * (12.25-(10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 15) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 35) / 15) * (0-(11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm1.rotationPointX = this.leftArm1.rotationPointX + (float)(xx);
        this.leftArm1.rotationPointY = this.leftArm1.rotationPointY - (float)(yy);
        this.leftArm1.rotationPointZ = this.leftArm1.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm1.rotationPointX = this.rightArm1.rotationPointX + (float)(xx);
        this.rightArm1.rotationPointY = this.rightArm1.rotationPointY - (float)(yy);
        this.rightArm1.rotationPointZ = this.rightArm1.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.5 + (((tickAnim - 15) / 20) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 35) / 15) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 15) / 20) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 35) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 35) / 15) * (0-(1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.75 + (((tickAnim - 15) / 20) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 35) / 15) * (0-(5.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 15) / 20) * (-13-(-13)));
            yy = -11.5 + (((tickAnim - 15) / 20) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 35) / 15) * (0-(-13)));
            yy = -11.5 + (((tickAnim - 35) / 15) * (0-(-11.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 15) / 20) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.5 + (((tickAnim - 35) / 15) * (0-(31.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.425 + (((tickAnim - 15) / 20) * (2.425-(2.425)));
            zz = -0.45 + (((tickAnim - 15) / 20) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.425 + (((tickAnim - 35) / 15) * (0-(2.425)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.5 + (((tickAnim - 15) / 20) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 35) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = 0 + (((tickAnim - 0) / 15) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 15) / 20) * (-13-(-13)));
            yy = 11.5 + (((tickAnim - 15) / 20) * (11.5-(11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13 + (((tickAnim - 35) / 15) * (0-(-13)));
            yy = 11.5 + (((tickAnim - 35) / 15) * (0-(11.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.575 + (((tickAnim - 15) / 20) * (-7.575-(-7.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.575 + (((tickAnim - 35) / 15) * (0-(-7.575)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 15) / 20) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.5 + (((tickAnim - 35) / 15) * (0-(31.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.425 + (((tickAnim - 15) / 20) * (2.425-(2.425)));
            zz = -0.45 + (((tickAnim - 15) / 20) * (-0.45-(-0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.425 + (((tickAnim - 35) / 15) * (0-(2.425)));
            zz = -0.45 + (((tickAnim - 35) / 15) * (0-(-0.45)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.5 + (((tickAnim - 15) / 20) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 35) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-90))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-120))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-140))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-180))*-1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*287/2.0-200))*1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 20) / 10) * (20.75-(15.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20.75 + (((tickAnim - 30) / 20) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-90))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-120))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-140))*1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-180))*1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-200))*1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*239-200))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10 + (((tickAnim - 12) / 18) * (0-(8.1752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*10)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 39) {
            xx = -17.5 + (((tickAnim - 0) / 39) * (17-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 17 + (((tickAnim - 39) / 6) * (-6.91404-(17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.10029-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (2.99832-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -6.91404 + (((tickAnim - 45) / 6) * (-17.5-(-6.91404)));
            yy = 0.10029 + (((tickAnim - 45) / 6) * (0-(0.10029)));
            zz = 2.99832 + (((tickAnim - 45) / 6) * (0-(2.99832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = -1.5 + (((tickAnim - 0) / 39) * (2.25-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 39) / 6) * (-33.54406-(2.25)));
            yy = 0 + (((tickAnim - 39) / 6) * (-5.41393-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (-5.19806-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -33.54406 + (((tickAnim - 45) / 6) * (-1.5-(-33.54406)));
            yy = -5.41393 + (((tickAnim - 45) / 6) * (0-(-5.41393)));
            zz = -5.19806 + (((tickAnim - 45) / 6) * (0-(-5.19806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.8 + (((tickAnim - 0) / 5) * (-1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 5) / 6) * (-1.875-(-1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 11) / 28) * (0-(0)));
            yy = -1.875 + (((tickAnim - 11) / 28) * (-1.875-(-1.875)));
            zz = 0 + (((tickAnim - 11) / 28) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = -1.875 + (((tickAnim - 39) / 6) * (2.39-(-1.875)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = 2.39 + (((tickAnim - 45) / 6) * (-1.8-(2.39)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 17.5 + (((tickAnim - 0) / 18) * (1.43-(17.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 1.43 + (((tickAnim - 18) / 21) * (0-(1.43)));
            yy = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (46.97-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 46.97 + (((tickAnim - 45) / 4) * (9.5-(46.97)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 9.5 + (((tickAnim - 49) / 2) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.875 + (((tickAnim - 0) / 18) * (1.42-(-0.875)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 18) / 21) * (0-(0)));
            yy = 1.42 + (((tickAnim - 18) / 21) * (0-(1.42)));
            zz = 0 + (((tickAnim - 18) / 21) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (1.905-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 1.905 + (((tickAnim - 45) / 4) * (-1.7-(1.905)));
            zz = -0.525 + (((tickAnim - 45) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            yy = -1.7 + (((tickAnim - 49) / 2) * (-0.875-(-1.7)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 17 + (((tickAnim - 17) / 6) * (-6.91404-(17)));
            yy = 0 + (((tickAnim - 17) / 6) * (0.10029-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (2.99832-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -6.91404 + (((tickAnim - 23) / 6) * (-17.5-(-6.91404)));
            yy = 0.10029 + (((tickAnim - 23) / 6) * (0-(0.10029)));
            zz = 2.99832 + (((tickAnim - 23) / 6) * (0-(2.99832)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -17.5 + (((tickAnim - 29) / 22) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 3 + (((tickAnim - 0) / 17) * (2.25-(3)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 2.25 + (((tickAnim - 17) / 6) * (-33.54406-(2.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (-5.41393-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (-5.19806-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -33.54406 + (((tickAnim - 23) / 6) * (-1.5-(-33.54406)));
            yy = -5.41393 + (((tickAnim - 23) / 6) * (0-(-5.41393)));
            zz = -5.19806 + (((tickAnim - 23) / 6) * (0-(-5.19806)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -1.5 + (((tickAnim - 29) / 22) * (3-(-1.5)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 17) * (-1.875-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -1.875 + (((tickAnim - 17) / 6) * (2.39-(-1.875)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 2.39 + (((tickAnim - 23) / 6) * (-1.8-(2.39)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = -1.8 + (((tickAnim - 29) / 5) * (-1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(-1.8)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 34) / 6) * (-0.55-(-1.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            yy = -0.55 + (((tickAnim - 40) / 11) * (-0.5-(-0.55)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -3.25 + (((tickAnim - 0) / 17) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (46.97-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 46.97 + (((tickAnim - 23) / 4) * (9.5-(46.97)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 9.5 + (((tickAnim - 27) / 2) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = 17.5 + (((tickAnim - 29) / 22) * (-3.25-(17.5)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 17) * (0-(0.175)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (1.905-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.905 + (((tickAnim - 23) / 4) * (-1.7-(1.905)));
            zz = -0.525 + (((tickAnim - 23) / 4) * (0-(-0.525)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -1.7 + (((tickAnim - 27) / 2) * (-0.875-(-1.7)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            yy = -0.875 + (((tickAnim - 29) / 22) * (0.175-(-0.875)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
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
            xx = 23.43285 + (((tickAnim - 0) / 15) * (-5.25-(23.43285)));
            yy = 0.21307 + (((tickAnim - 0) / 15) * (0-(0.21307)));
            zz = -0.22416 + (((tickAnim - 0) / 15) * (0-(-0.22416)));
        }
        else if (tickAnim >= 15 && tickAnim < 51) {
            xx = -5.25 + (((tickAnim - 15) / 36) * (23.43285-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 36) * (0.21307-(0)));
            zz = 0 + (((tickAnim - 15) / 36) * (-0.22416-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.75 + (((tickAnim - 0) / 10) * (-26.22-(4.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -26.22 + (((tickAnim - 10) / 5) * (-14.5-(-26.22)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 51) {
            xx = -14.5 + (((tickAnim - 15) / 36) * (4.75-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (8.06-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 8.06 + (((tickAnim - 10) / 5) * (0-(8.06)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 20) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 24) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 27) * (0-(0)));
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
            xx = 18.25 + (((tickAnim - 0) / 5) * (20.93-(18.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.93 + (((tickAnim - 5) / 5) * (9.21-(20.93)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.21 + (((tickAnim - 10) / 5) * (18-(9.21)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 18 + (((tickAnim - 15) / 18) * (-3.75-(18)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = -3.75 + (((tickAnim - 33) / 18) * (18.25-(-3.75)));
            yy = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 2.45 + (((tickAnim - 0) / 15) * (-1.975-(2.45)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = -1.975 + (((tickAnim - 15) / 18) * (0-(-1.975)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 18) * (2.45-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -48.73866 + (((tickAnim - 0) / 5) * (0-(-48.73866)));
            yy = -8.65716 + (((tickAnim - 0) / 5) * (0-(-8.65716)));
            zz = 9.73537 + (((tickAnim - 0) / 5) * (0-(9.73537)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (-48.73866-(0)));
            yy = 0 + (((tickAnim - 33) / 18) * (-8.65716-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (9.73537-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 5) * (0-(-1.125)));
            zz = 3.025 + (((tickAnim - 0) / 5) * (0-(3.025)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 33) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 18) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 33) / 18) * (3.025-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-30))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+150))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-40))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-120))*1), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-260))*-1));



        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -0.25 + (((tickAnim - 0) / 27) * (23.43285-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 27) * (0.21307-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-0.22416-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 23.43285 + (((tickAnim - 27) / 15) * (-5.25-(23.43285)));
            yy = 0.21307 + (((tickAnim - 27) / 15) * (0-(0.21307)));
            zz = -0.22416 + (((tickAnim - 27) / 15) * (0-(-0.22416)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -5.25 + (((tickAnim - 42) / 9) * (-0.25-(-5.25)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -4 + (((tickAnim - 0) / 27) * (4.75-(-4)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 4.75 + (((tickAnim - 27) / 10) * (-26.22-(4.75)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -26.22 + (((tickAnim - 37) / 5) * (-14.5-(-26.22)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -14.5 + (((tickAnim - 42) / 9) * (-4-(-14.5)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 10) * (8.06-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            yy = 8.06 + (((tickAnim - 37) / 5) * (0-(8.06)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 47) / 4) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08 + (((tickAnim - 47) / 4) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.7))*0.08)));
            zz = 0 + (((tickAnim - 47) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 4 + (((tickAnim - 0) / 27) * (18.25-(4)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 18.25 + (((tickAnim - 27) / 5) * (20.93-(18.25)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 20.93 + (((tickAnim - 32) / 5) * (9.21-(20.93)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 9.21 + (((tickAnim - 37) / 5) * (18-(9.21)));
            yy = 0 + (((tickAnim - 37) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 5) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 18 + (((tickAnim - 42) / 9) * (4-(18)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 27) * (2.45-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            yy = 2.45 + (((tickAnim - 27) / 15) * (-1.975-(2.45)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            yy = -1.975 + (((tickAnim - 42) / 9) * (-0.6-(-1.975)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-48.73866-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (-8.65716-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (9.73537-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -48.73866 + (((tickAnim - 27) / 5) * (0-(-48.73866)));
            yy = -8.65716 + (((tickAnim - 27) / 5) * (0-(-8.65716)));
            zz = 9.73537 + (((tickAnim - 27) / 5) * (0-(9.73537)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (3.025-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -1.125 + (((tickAnim - 27) / 5) * (0-(-1.125)));
            zz = 3.025 + (((tickAnim - 27) / 5) * (0-(3.025)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-30))*-0.5), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-80))*-0.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-30))*0.5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-140))*-0.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-20))*1));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-180))*-1), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-50))*1));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-220))*-3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-70))*1));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-250))*-4), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-120))*1));
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-20))*1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-270))*-5), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-150))*1));
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-50))*1), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-300))*-6), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-180))*1));
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-100))*2), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-320))*-7), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-220))*1));
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-130))*2), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-350))*-8), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-240))*1));
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-180))*4), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-380))*-9), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-270))*1));
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706-200))*6), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-400))*-14), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-300))*1));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+40))*1.5), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41))*-1), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-160))*-1));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+40))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41))*2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41-200))*-1));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+60))*-0.3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+260))*-1));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+100))*-0.3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+300))*-1));
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+140))*-0.3), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+330))*-1));
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+170))*-0.3), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+360))*-1));
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+220))*-0.5), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+430))*-1));
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706+260))*-1), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/1.41+470))*-1));
        this.throat3.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.706))*0.2),(float)1);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPatagotitan entity = (EntityPrehistoricFloraPatagotitan) entitylivingbaseIn;
        int animCycle = 31;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -23.25 + (((tickAnim - 0) / 21) * (17-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 17 + (((tickAnim - 21) / 6) * (-6.91404-(17)));
            yy = 0 + (((tickAnim - 21) / 6) * (0.10029-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (-2.9983-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -6.91404 + (((tickAnim - 27) / 5) * (-23.25-(-6.91404)));
            yy = 0.10029 + (((tickAnim - 27) / 5) * (0-(0.10029)));
            zz = -2.9983 + (((tickAnim - 27) / 5) * (0-(-2.9983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 4.5 + (((tickAnim - 0) / 21) * (2.25-(4.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 2.25 + (((tickAnim - 21) / 6) * (-33.54406-(2.25)));
            yy = 0 + (((tickAnim - 21) / 6) * (5.4139-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (5.1981-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -33.54406 + (((tickAnim - 27) / 5) * (4.5-(-33.54406)));
            yy = 5.4139 + (((tickAnim - 27) / 5) * (0-(5.4139)));
            zz = 5.1981 + (((tickAnim - 27) / 5) * (0-(5.1981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = -2.45 + (((tickAnim - 0) / 21) * (-1.875-(-2.45)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = -1.875 + (((tickAnim - 21) / 6) * (2.39-(-1.875)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 2.39 + (((tickAnim - 27) / 5) * (-2.45-(2.39)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 19.25 + (((tickAnim - 0) / 11) * (1.43-(19.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 1.43 + (((tickAnim - 11) / 10) * (0-(1.43)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (46.97-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 46.97 + (((tickAnim - 27) / 2) * (9.5-(46.97)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 9.5 + (((tickAnim - 29) / 3) * (19.25-(9.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.05 + (((tickAnim - 0) / 11) * (1.42-(-1.05)));
            zz = 0.375 + (((tickAnim - 0) / 11) * (0-(0.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = 1.42 + (((tickAnim - 11) / 10) * (0-(1.42)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 6) * (1.905-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (-0.525-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 1.905 + (((tickAnim - 27) / 2) * (-1.7-(1.905)));
            zz = -0.525 + (((tickAnim - 27) / 2) * (0-(-0.525)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = -1.7 + (((tickAnim - 29) / 3) * (-1.05-(-1.7)));
            zz = 0 + (((tickAnim - 29) / 3) * (0.375-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.25 + (((tickAnim - 0) / 7) * (17-(3.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17 + (((tickAnim - 7) / 5) * (-6.91404-(17)));
            yy = 0 + (((tickAnim - 7) / 5) * (0.10029-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (2.99832-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -6.91404 + (((tickAnim - 12) / 5) * (-23.25-(-6.91404)));
            yy = 0.10029 + (((tickAnim - 12) / 5) * (0-(0.10029)));
            zz = 2.99832 + (((tickAnim - 12) / 5) * (0-(2.99832)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = -23.25 + (((tickAnim - 17) / 15) * (3.25-(-23.25)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3 + (((tickAnim - 0) / 7) * (2.25-(3)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 7) / 5) * (-33.54406-(2.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (-5.41393-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-5.19806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -33.54406 + (((tickAnim - 12) / 5) * (4.5-(-33.54406)));
            yy = -5.41393 + (((tickAnim - 12) / 5) * (0-(-5.41393)));
            zz = -5.19806 + (((tickAnim - 12) / 5) * (0-(-5.19806)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 4.5 + (((tickAnim - 17) / 15) * (3-(4.5)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 7) * (-1.875-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -1.875 + (((tickAnim - 7) / 5) * (2.39-(-1.875)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 2.39 + (((tickAnim - 12) / 5) * (-2.45-(2.39)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            yy = -2.45 + (((tickAnim - 17) / 15) * (-0.5-(-2.45)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -3.25 + (((tickAnim - 0) / 7) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (46.97-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 46.97 + (((tickAnim - 12) / 2) * (9.5-(46.97)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 9.5 + (((tickAnim - 14) / 3) * (17.5-(9.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 17.5 + (((tickAnim - 17) / 15) * (-3.25-(17.5)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 7) * (0-(0.175)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (1.905-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-0.525-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.905 + (((tickAnim - 12) / 2) * (-1.7-(1.905)));
            zz = -0.525 + (((tickAnim - 12) / 2) * (0-(-0.525)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -1.7 + (((tickAnim - 14) / 3) * (-0.875-(-1.7)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            yy = -0.875 + (((tickAnim - 17) / 15) * (0.175-(-0.875)));
            zz = 0 + (((tickAnim - 17) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 3.75 + (((tickAnim - 0) / 13) * (23.43285-(3.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.21307-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.22416-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 23.43285 + (((tickAnim - 13) / 10) * (-5.25-(23.43285)));
            yy = 0.21307 + (((tickAnim - 13) / 10) * (0-(0.21307)));
            zz = -0.22416 + (((tickAnim - 13) / 10) * (0-(-0.22416)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -5.25 + (((tickAnim - 23) / 9) * (3.75-(-5.25)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.75 + (((tickAnim - 0) / 13) * (4.75-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 4.75 + (((tickAnim - 13) / 6) * (-26.22-(4.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -26.22 + (((tickAnim - 19) / 4) * (-14.5-(-26.22)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -14.5 + (((tickAnim - 23) / 9) * (-0.75-(-14.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
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
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (8.06-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 8.06 + (((tickAnim - 19) / 4) * (0-(8.06)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -3.5 + (((tickAnim - 0) / 13) * (18.25-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 18.25 + (((tickAnim - 13) / 3) * (29.13-(18.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 29.13 + (((tickAnim - 16) / 3) * (9.21-(29.13)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.21 + (((tickAnim - 19) / 4) * (18-(9.21)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 18 + (((tickAnim - 23) / 9) * (-3.5-(18)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 13) * (2.45-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 2.45 + (((tickAnim - 13) / 10) * (-1.975-(2.45)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = -1.975 + (((tickAnim - 23) / 9) * (-0.6-(-1.975)));
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




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-48.73866-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-8.65716-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.73537-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -48.73866 + (((tickAnim - 13) / 6) * (0-(-48.73866)));
            yy = -8.65716 + (((tickAnim - 13) / 6) * (0-(-8.65716)));
            zz = 9.73537 + (((tickAnim - 13) / 6) * (0-(9.73537)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = -1.125 + (((tickAnim - 13) / 6) * (0-(-1.125)));
            zz = 3.025 + (((tickAnim - 13) / 6) * (0-(3.025)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
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
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.68285 + (((tickAnim - 0) / 8) * (-5.25-(17.68285)));
            yy = 0.21307 + (((tickAnim - 0) / 8) * (0-(0.21307)));
            zz = -0.22416 + (((tickAnim - 0) / 8) * (0-(-0.22416)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = -5.25 + (((tickAnim - 8) / 20) * (23.43285-(-5.25)));
            yy = 0 + (((tickAnim - 8) / 20) * (0.21307-(0)));
            zz = 0 + (((tickAnim - 8) / 20) * (-0.22416-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 23.43285 + (((tickAnim - 28) / 4) * (17.68285-(23.43285)));
            yy = 0.21307 + (((tickAnim - 28) / 4) * (0.21307-(0.21307)));
            zz = -0.22416 + (((tickAnim - 28) / 4) * (-0.22416-(-0.22416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1 + (((tickAnim - 0) / 4) * (-26.22-(-1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -26.22 + (((tickAnim - 4) / 4) * (-14.5-(-26.22)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = -14.5 + (((tickAnim - 8) / 20) * (4.75-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 20) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 4.75 + (((tickAnim - 28) / 4) * (-1-(4.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 4.2 + (((tickAnim - 0) / 4) * (8.06-(4.2)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 8.06 + (((tickAnim - 4) / 4) * (0-(8.06)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 8) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 20) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (4.2-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
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
            xx = 33 + (((tickAnim - 0) / 5) * (2.46-(33)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.46 + (((tickAnim - 5) / 3) * (18-(2.46)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 18 + (((tickAnim - 8) / 10) * (-6.36-(18)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6.36 + (((tickAnim - 18) / 10) * (18.25-(-6.36)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 18.25 + (((tickAnim - 28) / 4) * (33-(18.25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 0) / 5) * (-1.83-(2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -1.83 + (((tickAnim - 5) / 3) * (-1.975-(-1.83)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 8) / 20) * (0-(0)));
            yy = -1.975 + (((tickAnim - 8) / 20) * (2.45-(-1.975)));
            zz = 0 + (((tickAnim - 8) / 20) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 2.45 + (((tickAnim - 28) / 4) * (2-(2.45)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (-48.73866-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (-8.65716-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (9.73537-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -48.73866 + (((tickAnim - 28) / 4) * (0-(-48.73866)));
            yy = -8.65716 + (((tickAnim - 28) / 4) * (0-(-8.65716)));
            zz = 9.73537 + (((tickAnim - 28) / 4) * (0-(9.73537)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (3.025-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.125 + (((tickAnim - 28) / 4) * (0-(-1.125)));
            zz = 3.025 + (((tickAnim - 28) / 4) * (0-(3.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88))), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*1.5));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-40))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-120))*1.8));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-190))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-190))*1.8));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-20))*0.1), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-30))*1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*1.5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-20))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-60))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*1.5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-20))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-120))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*1.5));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-20))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-150))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*1.5));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-40))*0.3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-180))*4), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-40))*1.5));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-70))*0.9), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-200))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-60))*1.5));
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-100))*1), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-230))*6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-80))*1.5));
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-120))*1), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-260))*7), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-120))*1.5));
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-150))*2), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-290))*8), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-140))*1.5));
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-190))*3), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-320))*9), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-160))*1.5));
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-220))*5), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-330))*10), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-180))*1.5));
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-260))*9), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-320))*12), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-200))*1.5));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-260))*-1), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-20))*-1), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-200))*1.8));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-300))*0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-250))*1.8));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-340))*0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-280))*1.8));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-390))*-0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-320))*1.8));
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-430))*0.5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-350))*1.8));
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-470))*-0.8), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-390))*1.8));
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-540))*-1), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-430))*1.8));
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.44-590))*-1.5), neck8.rotateAngleY + (float) Math.toRadians(0), neck8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*200/0.88-480))*1.8));


    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPatagotitan e = (EntityPrehistoricFloraPatagotitan) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
