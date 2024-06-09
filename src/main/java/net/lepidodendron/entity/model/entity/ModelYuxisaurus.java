package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraYuxisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelYuxisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer topspike;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer topspike3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer spikegroup;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer spikegroup2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer knobs;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer knobs2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer topspike2;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer topspike4;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer spike3;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer spike4;
    private final AdvancedModelRenderer cube_r48;

    private ModelAnimator animator;

    public ModelYuxisaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 9.8859F, 5.66F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -4.8067F, 2.4282F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 14, 0.0F, -2.0F, -5.5F, 0, 3, 7, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 14, 5.0F, -2.0F, -5.5F, 0, 3, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.2609F, -1.66F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 21, -3.5F, 0.1F, -1.475F, 7, 9, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.254F, -3.15F);
        this.hips.addChild(body);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.5228F, -5.5229F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 29, 2.0F, -0.9943F, -5.3693F, 0, 1, 11, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 29, 4.0F, -0.9943F, -5.3693F, 0, 1, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, 0.5228F, -5.5229F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0832F, 0.0262F, -0.3043F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 26, 0.0F, -2.9943F, -5.3693F, 0, 3, 11, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, 0.5228F, -5.5229F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0832F, -0.0262F, 0.3043F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 26, 0.0F, -2.9943F, -5.3693F, 0, 3, 11, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.4931F, -5.7599F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -4.5F, -4.925F, -4.7F, 9, 10, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 4.9931F, -10.5099F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.9861F, -0.4368F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 0, -3.0F, -1.0F, -3.0F, 6, 2, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, -1.8912F, -4.4141F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.432F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 10, 2.0F, -2.0893F, -1.7923F, 0, 3, 6, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 10, 4.0F, -2.0893F, -1.7923F, 0, 3, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, -1.8912F, -4.4141F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3799F, 0.2109F, -0.4829F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 32, 0.0F, -3.0893F, -1.2673F, 0, 3, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.0F, -1.8912F, -4.4141F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3799F, -0.2109F, 0.4829F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 32, 0.0F, -3.0893F, -1.2673F, 0, 3, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.0F, 1.5F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.432F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 21, -3.5F, 0.258F, -9.9397F, 7, 8, 8, 0.0F, false));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(3.5F, 0.5839F, -5.2191F);
        this.chest.addChild(spike);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.4453F, -0.2373F, -0.1117F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, 0.05F, -1.5F, 0.9F, 4, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 16, 0.55F, 0.0F, 2.15F, 4, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 54, -0.45F, 2.0F, 0.65F, 5, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 27, -0.45F, 0.0F, -1.1F, 4, 0, 3, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-3.5F, 0.5839F, -5.2191F);
        this.chest.addChild(spike2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4453F, 0.2373F, 0.1117F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 7, -4.05F, -1.5F, 0.9F, 4, 0, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 16, -4.55F, 0.0F, 2.15F, 4, 0, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 54, -4.55F, 2.0F, 0.65F, 5, 0, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 27, -3.55F, 0.0F, -1.1F, 4, 0, 3, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.25F, 4.575F, -2.95F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.5716F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 20, 54, -1.5F, -1.5F, -1.5F, 3, 7, 3, 0.0F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 2, 1.5F, 0.25F, -1.5F, 2, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, -0.75F, 0.5F);
        this.leftArm.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 4.25F, 0.3F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7418F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 51, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 4.325F, 0.75F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1614F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 54, 55, -1.5F, 0.013F, -3.3393F, 3, 1, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.25F, 4.575F, -3.05F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.5716F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 20, 54, -1.5F, -1.5F, -1.5F, 3, 7, 3, 0.0F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 2, -3.5F, 0.25F, -1.5F, 2, 0, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.5F, -0.75F, 0.5F);
        this.rightArm.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 4.25F, 0.3F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7418F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 51, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 4.325F, 0.75F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.1614F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 54, 55, -1.5F, 0.013F, -3.3393F, 3, 1, 4, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 36, 49, -2.5F, -0.5F, -3.5F, 5, 4, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.2071F, -1.2071F, -0.45F);
        this.neck1.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0229F, 0.1323F, 0.9113F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 34, 41, -1.5F, -0.25F, -1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(3.2071F, -1.2071F, -0.45F);
        this.neck1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0229F, -0.1323F, -0.9113F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 41, -1.5F, -0.25F, -1.0F, 3, 0, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.5F, -0.5F, -2.0F);
        this.neck1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 43, -2.5F, 0.0F, -1.45F, 3, 0, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.5F, -0.5F, -2.0F);
        this.neck1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 43, -0.5F, 0.0F, -1.45F, 3, 0, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.5F, 0.5F, -2.5F);
        this.neck1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 61, -2.1F, 0.5F, 1.475F, 4, 0, 2, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 62, -1.6F, 0.0F, -0.525F, 4, 0, 2, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.5F, 0.5F, -2.5F);
        this.neck1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 61, -1.9F, 0.5F, 1.475F, 4, 0, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 62, -2.4F, 0.0F, -0.525F, 4, 0, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, -0.5F, -2.5F);
        this.neck1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.4363F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 19, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -0.5F, -2.5F);
        this.neck1.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.4363F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 19, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 42, 59, -2.0F, 0.0F, -2.0F, 4, 3, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.neck2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 64, -1.0F, -0.875F, -2.5F, 3, 1, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.neck2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -0.2618F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 2, 0.0F, -1.5F, -1.0F, 0, 2, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.neck2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.2618F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 2, 0.0F, -1.5F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, 1.0F, -1.0F);
        this.neck2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0579F, 0.2555F, -0.2256F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 27, -2.725F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.0F, 1.0F, -1.0F);
        this.neck2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0579F, -0.2555F, 0.2256F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 27, -0.275F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 64, -1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 10, 63, -1.0F, 1.0F, -5.0F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 9, 0.6F, 0.5F, -2.55F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 9, -1.6F, 0.5F, -2.55F, 1, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3316F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 59, 62, 0.0F, 0.05F, -3.0F, 2, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, -0.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 64, 55, -1.5F, 0.0F, -1.75F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 64, -1.0F, -2.0F, -1.75F, 2, 2, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 63, -1.0F, 0.0F, -4.75F, 2, 1, 3, 0.0F, false));

        this.topspike = new AdvancedModelRenderer(this);
        this.topspike.setRotationPoint(1.0F, 0.6914F, -6.8846F);
        this.body.addChild(topspike);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topspike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0618F, 0.0617F, -0.7835F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 3, 5, 0.2F, 0.325F, -2.75F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 3, 5, 0.2F, 0.325F, 1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 3, 5, 0.2F, 0.325F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 3, 5, 0.2F, 0.325F, 5.25F, 1, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 3, 5, 0.2F, 0.325F, 3.25F, 1, 1, 1, 0.0F, false));

        this.topspike3 = new AdvancedModelRenderer(this);
        this.topspike3.setRotationPoint(-1.0F, 0.6914F, -6.8846F);
        this.body.addChild(topspike3);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topspike3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0618F, -0.0617F, 0.7835F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 3, 5, -1.2F, 0.325F, -2.75F, 1, 1, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 3, 5, -1.2F, 0.325F, 1.25F, 1, 1, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 3, 5, -1.2F, 0.325F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 3, 5, -1.2F, 0.325F, 5.25F, 1, 1, 1, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 3, 5, -1.2F, 0.325F, 3.25F, 1, 1, 1, 0.0F, true));

        this.spikegroup = new AdvancedModelRenderer(this);
        this.spikegroup.setRotationPoint(3.5F, 7.8391F, -8.7669F);
        this.body.addChild(spikegroup);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.0346F, -5.5013F, 8.3798F);
        this.spikegroup.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0962F, -0.4346F, -0.0406F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 61, 3, -2.0F, -0.25F, -1.0F, 4, 0, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spikegroup.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0903F, -0.2608F, -0.0233F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 43, 1.25F, -6.75F, 5.5F, 4, 0, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 5, 1.25F, -5.25F, 4.25F, 4, 0, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 38, 19, 0.25F, -6.5F, 0.25F, 4, 0, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 7, 0.25F, -5.45F, 1.95F, 4, 0, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 30, 1.5F, 0.5F, 3.5F, 4, 0, 3, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 61, -0.25F, -5.0F, -1.5F, 4, 0, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 33, 0.5F, 0.5F, -0.75F, 4, 0, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.spikegroup.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0903F, 0.2608F, 0.0233F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 61, 7, -4.25F, -5.45F, 1.95F, 4, 0, 2, 0.0F, true));

        this.spikegroup2 = new AdvancedModelRenderer(this);
        this.spikegroup2.setRotationPoint(-3.5F, 7.8391F, -8.7669F);
        this.body.addChild(spikegroup2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.0346F, -5.5013F, 8.3798F);
        this.spikegroup2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0962F, 0.4346F, 0.0406F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 61, 3, -2.0F, -0.25F, -1.0F, 4, 0, 2, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spikegroup2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0903F, 0.2608F, 0.0233F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 43, -5.25F, -6.75F, 5.5F, 4, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 61, 5, -5.25F, -5.25F, 4.25F, 4, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 19, -4.25F, -6.5F, 0.25F, 4, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 58, 30, -5.5F, 0.5F, 3.5F, 4, 0, 3, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 8, 61, -3.75F, -5.0F, -1.5F, 4, 0, 2, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 58, 33, -4.5F, 0.5F, -0.75F, 4, 0, 3, 0.0F, true));

        this.knobs = new AdvancedModelRenderer(this);
        this.knobs.setRotationPoint(0.0F, 5.4931F, -5.7599F);
        this.body.addChild(knobs);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.knobs.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0873F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -0.925F, -4.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, 0.825F, -4.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -2.675F, -4.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -2.925F, -0.5F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, 1.075F, -0.5F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -0.925F, -0.5F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -2.675F, 3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, 1.075F, 3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 86, 3, 4.0F, -0.925F, 3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 41, 4.0F, 0.075F, 1.9F, 1, 1, 1, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 41, 4.0F, 0.075F, -1.85F, 1, 1, 1, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 41, 4.0F, -1.675F, -1.85F, 1, 1, 1, 0.0F, false));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 41, 4.0F, -1.675F, 1.9F, 1, 1, 1, 0.0F, false));

        this.knobs2 = new AdvancedModelRenderer(this);
        this.knobs2.setRotationPoint(0.0F, 5.4931F, -5.7599F);
        this.body.addChild(knobs2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.knobs2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -0.925F, -4.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, 0.825F, -4.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -2.675F, -4.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -2.925F, -0.5F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, 1.075F, -0.5F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -0.925F, -0.5F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -2.675F, 3.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, 1.075F, 3.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 86, 3, -5.0F, -0.925F, 3.25F, 1, 1, 2, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 41, -5.0F, 0.075F, 1.9F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 41, -5.0F, 0.075F, -1.85F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 41, -5.0F, -1.675F, -1.85F, 1, 1, 1, 0.0F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 41, -5.0F, -1.675F, 1.9F, 1, 1, 1, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.0F, 3.2391F, -1.16F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3491F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 49, 3, -1.5F, -3.5F, -2.5F, 4, 7, 6, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(2.9009F, -2.5393F, 2.4105F);
        this.leftLeg.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.3721F, -0.2409F, -0.1896F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 47, -2.0F, -0.2F, -1.0F, 4, 0, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.2815F, -2.1249F, 1.207F);
        this.leftLeg.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.023F, -0.2409F, -0.1896F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 57, -2.0F, 0.8F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.5F, -0.5F, -0.5F);
        this.leftLeg.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.6775F, -0.2409F, -0.1896F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 60, 38, -0.55F, -0.25F, -2.0F, 4, 0, 2, 0.0F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 9, 51, -0.55F, -1.55F, -1.0F, 4, 0, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 3.5F, -2.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0297F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 16, -1.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.225F, 2.6F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8727F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 32, 59, -0.5F, -0.2195F, -1.8676F, 2, 5, 3, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.0305F, 0.6324F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1745F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 58, 40, -1.0F, 0.0152F, -4.0764F, 3, 1, 4, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.0F, 3.2391F, -1.16F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3491F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 49, 3, -2.5F, -3.5F, -2.5F, 4, 7, 6, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.9009F, -2.5393F, 2.4105F);
        this.rightLeg.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3721F, 0.2409F, 0.1896F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 56, 47, -2.0F, -0.2F, -1.0F, 4, 0, 2, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-3.2815F, -2.1249F, 1.207F);
        this.rightLeg.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.023F, 0.2409F, 0.1896F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 10, 57, -2.0F, 0.8F, -0.5F, 4, 0, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-2.5F, -0.5F, -0.5F);
        this.rightLeg.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.6775F, 0.2409F, 0.1896F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 60, 38, -3.45F, -0.25F, -2.0F, 4, 0, 2, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 9, 51, -3.45F, -1.55F, -1.0F, 4, 0, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 3.5F, -2.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0297F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 51, 16, -2.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.225F, 2.6F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8727F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 32, 59, -1.5F, -0.2195F, -1.8676F, 2, 5, 3, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.0305F, 0.6324F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1745F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 58, 40, -2.0F, 0.0152F, -4.0764F, 3, 1, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -3.5109F, 3.84F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 37, -3.0F, 0.0F, -1.5F, 6, 6, 8, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 0, 2.5F, 2.0F, 0.5F, 2, 0, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 0, -4.5F, 2.0F, 0.5F, 2, 0, 6, 0.0F, true));
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 10, 2.5F, 3.0F, 0.5F, 2, 0, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 34, 10, -4.5F, 3.0F, 0.5F, 2, 0, 6, 0.0F, true));
        this.tail1.cubeList.add(new ModelBox(tail1, 38, 10, 3.0F, 1.0F, 0.5F, 2, 0, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 38, 10, -5.0F, 1.0F, 0.5F, 2, 0, 6, 0.0F, true));
        this.tail1.cubeList.add(new ModelBox(tail1, 50, 35, 2.0F, -3.0F, 0.5F, 0, 3, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 50, 35, -2.0F, -3.0F, 0.5F, 0, 3, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 6.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 37, -2.0F, 0.0F, -1.0F, 4, 4, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, 2.0F, 0.525F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -3.0F, 0.525F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 0, 1.625F, 1.525F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 0, -2.625F, 1.525F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 17, 1.5F, -2.0F, 0.0F, 0, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 17, -1.5F, -2.0F, 0.0F, 0, 2, 7, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 43, -1.5F, 0.0F, -1.0F, 3, 3, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, 1.5F, 0.75F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, -2.5F, 0.75F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 2, 0, 0.95F, 1.75F, 0.0F, 1, 0, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 2, 0, -1.95F, 1.75F, 0.0F, 1, 0, 7, 0.0F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 19, 1.25F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 19, -1.25F, -1.0F, 0.0F, 0, 1, 7, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 51, -1.0F, 0.0F, -1.25F, 2, 2, 8, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 37, 1.0F, 0.5F, 0.25F, 1, 0, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 37, -2.0F, 0.5F, 0.25F, 1, 0, 6, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 21, 0.575F, 1.1F, 0.25F, 1, 0, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 21, -1.575F, 1.1F, 0.25F, 1, 0, 6, 0.0F, true));
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 20, 0.75F, -1.0F, -0.25F, 0, 1, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 20, -0.75F, -1.0F, -0.25F, 0, 1, 7, 0.0F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 6.75F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 50, 28, -0.5F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.175F, 0.25F, 0.5F, 1, 0, 7, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -1.175F, 0.25F, 0.5F, 1, 0, 7, 0.0F, true));
        this.tail5.cubeList.add(new ModelBox(tail5, 29, 1, 0.325F, -1.0F, 0.0F, 0, 1, 8, 0.0F, false));

        this.topspike2 = new AdvancedModelRenderer(this);
        this.topspike2.setRotationPoint(0.15F, -4.0126F, -1.2846F);
        this.hips.addChild(topspike2);
        this.setRotateAngle(topspike2, -0.1745F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topspike2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0618F, 0.0617F, -0.7835F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 3, 5, 0.2F, 0.325F, 1.25F, 1, 1, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 3, 5, 0.2F, 0.325F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 3, 5, 0.2F, 0.325F, 3.25F, 1, 1, 1, 0.0F, false));

        this.topspike4 = new AdvancedModelRenderer(this);
        this.topspike4.setRotationPoint(-0.15F, -4.0126F, -1.2846F);
        this.hips.addChild(topspike4);
        this.setRotateAngle(topspike4, -0.1745F, 0.0F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topspike4.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0618F, -0.0617F, 0.7835F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 3, 5, -1.2F, 0.325F, 1.25F, 1, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 3, 5, -1.2F, 0.325F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 3, 5, -1.2F, 0.325F, 3.25F, 1, 1, 1, 0.0F, true));

        this.spike3 = new AdvancedModelRenderer(this);
        this.spike3.setRotationPoint(3.5F, -2.1231F, -1.32F);
        this.hips.addChild(spike3);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0944F, -0.3911F, 0.0361F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 43, -0.625F, -1.5F, -1.0F, 4, 0, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 60, 60, -0.625F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 49, 0.775F, -1.0F, 2.0F, 4, 0, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 52, 60, 0.775F, 1.0F, 2.0F, 4, 0, 2, 0.0F, false));

        this.spike4 = new AdvancedModelRenderer(this);
        this.spike4.setRotationPoint(-3.5F, -2.1231F, -1.32F);
        this.hips.addChild(spike4);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.0944F, 0.3911F, -0.0361F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 43, -3.375F, -1.5F, -1.0F, 4, 0, 2, 0.0F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 60, 60, -3.375F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 49, -4.775F, -1.0F, 2.0F, 4, 0, 2, 0.0F, true));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 52, 60, -4.775F, 1.0F, 2.0F, 4, 0, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.rightArm.setScale(0,0,0);
        this.leftArm.setScale(0,0,0);
        this.rightArm.scaleChildren = true;
        this.leftArm.scaleChildren = true;
        this.chest.offsetY = -0.05F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.15F;
        this.chest.render(0.01F);
        this.rightArm.setScale(1,1,1);
        this.leftArm.setScale(1,1,1);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 1.05F, 0.15F, -0.1F);
        this.setRotateAngle(leftArm2, -1.75F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, -0.4F, 0.15F, 0.1F);
        this.setRotateAngle(rightLeg2, 1.5F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, -0.05F, 0.1F, 0.05F);
        this.setRotateAngle(tail3, -0.05F, 0.1F, 0.07F);
        this.setRotateAngle(tail4, -0.05F, 0.1F, 0.09F);
        this.setRotateAngle(tail5, -0.05F, 0.1F, 0.12F);
        this.setRotateAngle(head, 0.3F, -0.3F, 0.0F);
        this.root.offsetY = -0.146F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraYuxisaurus entityYuxi = (EntityPrehistoricFloraYuxisaurus) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


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

        EntityPrehistoricFloraYuxisaurus ee = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
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
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 29;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 6) / 7) * (3-(5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 13) / 5) * (0-(3)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = -6 + (((tickAnim - 18) / 6) * (5-(-6)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 5) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3 + (((tickAnim - 6) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 7 + (((tickAnim - 18) / 6) * (-6-(7)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = -6 + (((tickAnim - 24) / 5) * (0-(-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 6) / 7) * (-11-(-11)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 13) / 5) * (-14-(-11)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -14 + (((tickAnim - 18) / 6) * (0-(-14)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = -7 + (((tickAnim - 18) / 6) * (7-(-7)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 7 + (((tickAnim - 24) / 5) * (0-(7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 6) / 7) * (15-(8)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 13) / 5) * (6-(15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 6 + (((tickAnim - 18) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 10) / 36) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 46) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 2 + (((tickAnim - 10) / 36) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 46) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 11) / 7) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 11) / 7) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.37738-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.86606 + (((tickAnim - 18) / 4) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 18) / 4) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 18) / 4) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.13394 + (((tickAnim - 22) / 5) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 22) / 5) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 22) / 5) * (0-(-1.37738)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 27) / 6) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 27) / 6) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (-1.37738-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 12.86606 + (((tickAnim - 33) / 5) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 33) / 5) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 33) / 5) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -5.13394 + (((tickAnim - 38) / 7) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 38) / 7) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 38) / 7) * (0-(-1.37738)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 45) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 14) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 45) / 5) * (0-(0.1)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 11) / 7) * (-51-(-10)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -51 + (((tickAnim - 18) / 4) * (-44-(-51)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -44 + (((tickAnim - 22) / 5) * (-10-(-44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 27) / 6) * (-51-(-10)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -51 + (((tickAnim - 33) / 5) * (-44-(-51)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -44 + (((tickAnim - 38) / 7) * (-10-(-44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 45) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 24) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 42) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 11) / 7) * (-1-(-9)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 18) / 4) * (44-(-1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 44 + (((tickAnim - 22) / 5) * (-9-(44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 27) / 6) * (-1-(-9)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -1 + (((tickAnim - 33) / 5) * (44-(-1)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 44 + (((tickAnim - 38) / 7) * (-9-(44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 45) / 5) * (0-(-9)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 16) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 27) / 18) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 18) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 27) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 45) {
            xx = 12 + (((tickAnim - 11) / 34) * (12-(12)));
            yy = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 34) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 45) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 34) * (0.1-(0.1)));
            zz = 0.1 + (((tickAnim - 11) / 34) * (0.1-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 11) / 34) * (-10-(-10)));
            yy = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 34) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 45) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            zz = -0.1 + (((tickAnim - 11) / 34) * (-0.1-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 45) {
            xx = -9 + (((tickAnim - 11) / 34) * (-9-(-9)));
            yy = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 34) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 45) / 5) * (0-(-9)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 11) / 34) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 34) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (24.74534-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.63039-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (12.71743-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 24.74534 + (((tickAnim - 21) / 12) * (27.74534-(24.74534)));
            yy = -2.63039 + (((tickAnim - 21) / 12) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 21) / 12) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 27.74534 + (((tickAnim - 33) / 13) * (24.74534-(27.74534)));
            yy = -2.63039 + (((tickAnim - 33) / 13) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 33) / 13) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 24.74534 + (((tickAnim - 46) / 4) * (0-(24.74534)));
            yy = -2.63039 + (((tickAnim - 46) / 4) * (0-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 46) / 4) * (0-(12.71743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (3-(0)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 8 + (((tickAnim - 21) / 12) * (8-(8)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 33) / 13) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 8 + (((tickAnim - 33) / 13) * (8-(8)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 8 + (((tickAnim - 46) / 4) * (0-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.57594-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-11.96731-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8.64235-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -1.57594 + (((tickAnim - 21) / 12) * (1.42406-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 21) / 12) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 21) / 12) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 1.42406 + (((tickAnim - 33) / 13) * (-1.57594-(1.42406)));
            yy = -11.96731 + (((tickAnim - 33) / 13) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 33) / 13) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -1.57594 + (((tickAnim - 46) / 4) * (0-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 46) / 4) * (0-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 46) / 4) * (0-(8.64235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 29) / 21) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 29) / 21) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*5 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 29) / 21) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -12 + (((tickAnim - 12) / 5) * (-15-(-12)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-3.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (4.3-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -3.2 + (((tickAnim - 12) / 5) * (-3.17-(-3.2)));
            zz = 4.3 + (((tickAnim - 12) / 5) * (3.72-(4.3)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -3.17 + (((tickAnim - 17) / 17) * (-3.17-(-3.17)));
            zz = 3.72 + (((tickAnim - 17) / 17) * (3.72-(3.72)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -3.17 + (((tickAnim - 34) / 16) * (0-(-3.17)));
            zz = 3.72 + (((tickAnim - 34) / 16) * (0-(3.72)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 4 + (((tickAnim - 12) / 5) * (7-(4)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 7 + (((tickAnim - 17) / 17) * (7-(7)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 34) / 16) * (0-(7)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-13.42-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -13.42 + (((tickAnim - 8) / 4) * (23.80598-(-13.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (8.62294-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-3.26998-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 23.80598 + (((tickAnim - 12) / 5) * (11-(23.80598)));
            yy = 8.62294 + (((tickAnim - 12) / 5) * (0-(8.62294)));
            zz = -3.26998 + (((tickAnim - 12) / 5) * (0-(-3.26998)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 17) / 17) * (11-(11)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 11 + (((tickAnim - 34) / 3) * (8.48481-(11)));
            yy = 0 + (((tickAnim - 34) / 3) * (12.45723-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (-4.96784-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8.48481 + (((tickAnim - 37) / 3) * (-26-(8.48481)));
            yy = 12.45723 + (((tickAnim - 37) / 3) * (0-(12.45723)));
            zz = -4.96784 + (((tickAnim - 37) / 3) * (0-(-4.96784)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -26 + (((tickAnim - 40) / 10) * (0-(-26)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.33-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 9) * (0.6-(0.45)));
            zz = 0.33 + (((tickAnim - 8) / 9) * (0.8-(0.33)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 1) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 17) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 0.5 + (((tickAnim - 18) / 0) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 18) / 0) * (0.8-(0.8)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 18) / 1) * (0.5-(0.6)));
            zz = 0.8 + (((tickAnim - 18) / 1) * (0.8-(0.8)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 19) / 15) * (0.6-(0.5)));
            zz = 0.8 + (((tickAnim - 19) / 15) * (0.8-(0.8)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 34) / 6) * (0-(0.6)));
            zz = 0.8 + (((tickAnim - 34) / 6) * (0-(0.8)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 41) / 1) * (0-(0)));
            yy = 0.01 + (((tickAnim - 41) / 1) * (-0.1-(0.01)));
            zz = 0 + (((tickAnim - 41) / 1) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 42) / 1) * (0.01-(-0.1)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.01 + (((tickAnim - 43) / 7) * (0-(0.01)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9.25 + (((tickAnim - 8) / 4) * (-40.27-(-9.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -40.27 + (((tickAnim - 12) / 5) * (-3-(-40.27)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -3 + (((tickAnim - 17) / 17) * (-3-(-3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = -3 + (((tickAnim - 34) / 3) * (-32.63-(-3)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -32.63 + (((tickAnim - 37) / 3) * (0-(-32.63)));
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
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 9) * (0-(0.1)));
            zz = 0.2 + (((tickAnim - 8) / 9) * (0-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0.5-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 40) / 5) * (0.35-(0.5)));
            zz = 0.2 + (((tickAnim - 40) / 5) * (0.3-(0.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.35 + (((tickAnim - 45) / 5) * (0-(0.35)));
            zz = 0.3 + (((tickAnim - 45) / 5) * (0-(0.3)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (27.42-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.42 + (((tickAnim - 8) / 4) * (41.84-(27.42)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 41.84 + (((tickAnim - 12) / 5) * (1-(41.84)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 17) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 34) / 3) * (33.88-(0)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 33.88 + (((tickAnim - 37) / 3) * (31-(33.88)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 31 + (((tickAnim - 40) / 2) * (25.36-(31)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 25.36 + (((tickAnim - 42) / 8) * (0-(25.36)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 4) / 13) * (0-(0)));
            yy = 0.1 + (((tickAnim - 4) / 13) * (0-(0.1)));
            zz = 0 + (((tickAnim - 4) / 13) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 40) / 2) * (0.06-(-0.05)));
            zz = 0 + (((tickAnim - 40) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0.06 + (((tickAnim - 42) / 3) * (0.14-(0.06)));
            zz = -0.1 + (((tickAnim - 42) / 3) * (-0.06-(-0.1)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0.14 + (((tickAnim - 45) / 3) * (0.12-(0.14)));
            zz = -0.06 + (((tickAnim - 45) / 3) * (-0.03-(-0.06)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.12 + (((tickAnim - 48) / 2) * (0-(0.12)));
            zz = -0.03 + (((tickAnim - 48) / 2) * (0-(-0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.54747-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-11.20302-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.44987-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.54747 + (((tickAnim - 4) / 4) * (14-(4.54747)));
            yy = -11.20302 + (((tickAnim - 4) / 4) * (0-(-11.20302)));
            zz = 1.44987 + (((tickAnim - 4) / 4) * (0-(1.44987)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 14 + (((tickAnim - 8) / 4) * (11-(14)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 11 + (((tickAnim - 12) / 5) * (11-(11)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 17) / 17) * (11-(11)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 11 + (((tickAnim - 34) / 6) * (13.54313-(11)));
            yy = 0 + (((tickAnim - 34) / 6) * (-4.74291-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0.07609-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 13.54313 + (((tickAnim - 40) / 2) * (8.48481-(13.54313)));
            yy = -4.74291 + (((tickAnim - 40) / 2) * (-12.4572-(-4.74291)));
            zz = 0.07609 + (((tickAnim - 40) / 2) * (4.9678-(0.07609)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 8.48481 + (((tickAnim - 42) / 2) * (-8-(8.48481)));
            yy = -12.4572 + (((tickAnim - 42) / 2) * (0-(-12.4572)));
            zz = 4.9678 + (((tickAnim - 42) / 2) * (0-(4.9678)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 44) / 6) * (0-(-8)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.88-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.95-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.88 + (((tickAnim - 4) / 4) * (0.2-(0.88)));
            zz = 0.95 + (((tickAnim - 4) / 4) * (0.4-(0.95)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 1) * (0.2-(0.2)));
            zz = 0.4 + (((tickAnim - 8) / 1) * (0.5-(0.4)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 9) / 1) * (0.43-(0.2)));
            zz = 0.5 + (((tickAnim - 9) / 1) * (0.6-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.43 + (((tickAnim - 10) / 1) * (0.42-(0.43)));
            zz = 0.6 + (((tickAnim - 10) / 1) * (0.7-(0.6)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.42 + (((tickAnim - 11) / 1) * (0.6-(0.42)));
            zz = 0.7 + (((tickAnim - 11) / 1) * (0.8-(0.7)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 12) / 5) * (0.6-(0.6)));
            zz = 0.8 + (((tickAnim - 12) / 5) * (0.8-(0.8)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 17) * (0.6-(0.6)));
            zz = 0.8 + (((tickAnim - 17) / 17) * (0.8-(0.8)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 34) / 6) * (0.21-(0.6)));
            zz = 0.8 + (((tickAnim - 34) / 6) * (0.75-(0.8)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0.21 + (((tickAnim - 40) / 4) * (0-(0.21)));
            zz = 0.75 + (((tickAnim - 40) / 4) * (-0.1-(0.75)));
        }
        else if (tickAnim >= 44 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 1) * (-0.1-(0)));
            zz = -0.1 + (((tickAnim - 44) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 45 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 45) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 45) / 1) * (0.01-(-0.1)));
            zz = 0 + (((tickAnim - 45) / 1) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 46) / 2) * (0.01-(0.01)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 48) / 2) * (0-(0.01)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-31.81-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -31.81 + (((tickAnim - 4) / 4) * (16.5-(-31.81)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16.5 + (((tickAnim - 8) / 4) * (-1-(16.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -1 + (((tickAnim - 12) / 5) * (-1-(-1)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -1 + (((tickAnim - 17) / 17) * (-1-(-1)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 34) / 6) * (4.88561-(-1)));
            yy = 0 + (((tickAnim - 34) / 6) * (3.33279-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (-2.21316-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 4.88561 + (((tickAnim - 40) / 2) * (-32.63-(4.88561)));
            yy = 3.33279 + (((tickAnim - 40) / 2) * (0-(3.33279)));
            zz = -2.21316 + (((tickAnim - 40) / 2) * (0-(-2.21316)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -32.63 + (((tickAnim - 42) / 2) * (-12-(-32.63)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 44) / 6) * (0-(-12)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 3) * (-0.5-(-0.1)));
            zz = 0.1 + (((tickAnim - 5) / 3) * (-0.2-(0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 4) * (-0.2-(-0.5)));
            zz = -0.2 + (((tickAnim - 8) / 4) * (-0.22-(-0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 5) * (-0.2-(-0.2)));
            zz = -0.22 + (((tickAnim - 12) / 5) * (-0.22-(-0.22)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 17) * (-0.2-(-0.2)));
            zz = -0.22 + (((tickAnim - 17) / 17) * (-0.22-(-0.22)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 6) * (-0.4-(-0.2)));
            zz = -0.22 + (((tickAnim - 34) / 6) * (-0.4-(-0.22)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = -0.4 + (((tickAnim - 40) / 4) * (0.3-(-0.4)));
            zz = -0.4 + (((tickAnim - 40) / 4) * (0.2-(-0.4)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 44) / 6) * (0-(0.3)));
            zz = 0.2 + (((tickAnim - 44) / 6) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 45.5 + (((tickAnim - 4) / 4) * (-28-(45.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -28 + (((tickAnim - 8) / 4) * (-1.2-(-28)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -1.2 + (((tickAnim - 12) / 5) * (-1-(-1.2)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -1 + (((tickAnim - 17) / 17) * (-2-(-1)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 34) / 6) * (-12.54-(-2)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = -12.54 + (((tickAnim - 40) / 2) * (33.88-(-12.54)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 33.88 + (((tickAnim - 42) / 2) * (24-(33.88)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 44) / 6) * (0-(24)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 4) * (0.4-(0.1)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 12) / 5) * (0.26-(0.4)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0.26 + (((tickAnim - 17) / 23) * (0.3-(0.26)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 40) / 2) * (0.2-(0.3)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 42) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 42) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 44) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 3) * (0.1-(0)));
            zz = 0.1 + (((tickAnim - 44) / 3) * (0.06-(0.1)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 47) / 3) * (0-(0.1)));
            zz = 0.06 + (((tickAnim - 47) / 3) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2 + (((tickAnim - 17) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2 + (((tickAnim - 34) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.75+150))*-2)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5 + (((tickAnim - 17) / 17) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5 + (((tickAnim - 34) / 16) * (0-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+150))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2 + (((tickAnim - 17) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+150))*2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 6) / 6) * (27.42867-(16)));
            yy = 0 + (((tickAnim - 6) / 6) * (-9.17731-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-2.39834-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 27.42867 + (((tickAnim - 12) / 5) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 12) / 5) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 12) / 5) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 27.42867 + (((tickAnim - 17) / 17) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 17) / 17) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 17) / 17) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 27.42867 + (((tickAnim - 34) / 4) * (27.42867-(27.42867)));
            yy = -9.17731 + (((tickAnim - 34) / 4) * (-9.17731-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 34) / 4) * (-2.39834-(-2.39834)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 27.42867 + (((tickAnim - 38) / 4) * (-5.88564-(27.42867)));
            yy = -9.17731 + (((tickAnim - 38) / 4) * (-6.73003-(-9.17731)));
            zz = -2.39834 + (((tickAnim - 38) / 4) * (-1.75879-(-2.39834)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -5.88564 + (((tickAnim - 42) / 4) * (0-(-5.88564)));
            yy = -6.73003 + (((tickAnim - 42) / 4) * (0-(-6.73003)));
            zz = -1.75879 + (((tickAnim - 42) / 4) * (0-(-1.75879)));
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
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 6) / 6) * (1.4-(0.9)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.4 + (((tickAnim - 12) / 1) * (1.42-(1.4)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.42 + (((tickAnim - 13) / 1) * (1.32-(1.42)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.32 + (((tickAnim - 14) / 1) * (1.45-(1.32)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.45 + (((tickAnim - 15) / 2) * (1.4-(1.45)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 1.4 + (((tickAnim - 17) / 17) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 1.4 + (((tickAnim - 34) / 4) * (1.4-(1.4)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 1.4 + (((tickAnim - 38) / 4) * (0.74-(1.4)));
            zz = 0 + (((tickAnim - 38) / 4) * (-0.4-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            yy = 0.74 + (((tickAnim - 42) / 4) * (0-(0.74)));
            zz = -0.4 + (((tickAnim - 42) / 4) * (0-(-0.4)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 1) * (0.01-(0)));
            zz = 0 + (((tickAnim - 46) / 1) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 0.01 + (((tickAnim - 47) / 1) * (-0.09-(0.01)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            yy = -0.09 + (((tickAnim - 48) / 0) * (0.02-(-0.09)));
            zz = 0 + (((tickAnim - 48) / 0) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.02 + (((tickAnim - 48) / 2) * (0-(0.02)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 6) / 6) * (3-(9)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 3 + (((tickAnim - 12) / 5) * (3-(3)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 3 + (((tickAnim - 17) / 17) * (3-(3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 3 + (((tickAnim - 34) / 4) * (-8-(3)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -8 + (((tickAnim - 38) / 4) * (16.13-(-8)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 16.13 + (((tickAnim - 42) / 4) * (3-(16.13)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 46) / 4) * (0-(3)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 14 + (((tickAnim - 6) / 6) * (-24-(14)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -24 + (((tickAnim - 12) / 5) * (-24-(-24)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -24 + (((tickAnim - 17) / 17) * (-24-(-24)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -24 + (((tickAnim - 34) / 4) * (-13-(-24)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -13 + (((tickAnim - 38) / 4) * (-28.53-(-13)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -28.53 + (((tickAnim - 42) / 4) * (2-(-28.53)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 46) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.18-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.18 + (((tickAnim - 3) / 3) * (0.2-(0.18)));
            zz = 0.18 + (((tickAnim - 3) / 3) * (0.2-(0.18)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
            zz = 0.2 + (((tickAnim - 6) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0.7-(0)));
            zz = 0.5 + (((tickAnim - 38) / 8) * (0.5-(0.5)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = 0.7 + (((tickAnim - 46) / 4) * (0-(0.7)));
            zz = 0.5 + (((tickAnim - 46) / 4) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -3 + (((tickAnim - 6) / 6) * (8-(-3)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 8 + (((tickAnim - 12) / 5) * (8-(8)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 8 + (((tickAnim - 17) / 17) * (8-(8)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 8 + (((tickAnim - 34) / 4) * (5-(8)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 38) / 2) * (15.15-(5)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 15.15 + (((tickAnim - 40) / 2) * (13.29-(15.15)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 13.29 + (((tickAnim - 42) / 1) * (-2.62-(13.29)));
            yy = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -2.62 + (((tickAnim - 43) / 3) * (0-(-2.62)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 17) / 17) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = 0.2 + (((tickAnim - 34) / 12) * (0-(0.2)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 13) / 13) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 26) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -27.5 + (((tickAnim - 13) / 13) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -27.5 + (((tickAnim - 26) / 10) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 17.5 + (((tickAnim - 13) / 13) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 26) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.3-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 6) / 7) * (-0.3-(0.1)));
            zz = -0.3 + (((tickAnim - 6) / 7) * (-0.6-(-0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 13) * (-0.3-(-0.3)));
            zz = -0.6 + (((tickAnim - 13) / 13) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 26) / 5) * (0.1-(-0.3)));
            zz = -0.6 + (((tickAnim - 26) / 5) * (-0.3-(-0.6)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 31) / 5) * (0-(0.1)));
            zz = -0.3 + (((tickAnim - 31) / 5) * (0-(-0.3)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 13) / 13) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 26) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -30 + (((tickAnim - 13) / 13) * (-30-(-30)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -30 + (((tickAnim - 26) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 20 + (((tickAnim - 13) / 13) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 20 + (((tickAnim - 26) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 6) / 7) * (-0.2-(0.1)));
            zz = -0.2 + (((tickAnim - 6) / 7) * (-0.3-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 13) * (-0.2-(-0.2)));
            zz = -0.3 + (((tickAnim - 13) / 13) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 26) / 5) * (0.2-(-0.2)));
            zz = -0.3 + (((tickAnim - 26) / 5) * (-0.1-(-0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 31) / 5) * (0-(0.2)));
            zz = -0.1 + (((tickAnim - 31) / 5) * (0-(-0.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (20-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 20 + (((tickAnim - 20) / 13) * (-15-(20)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 33) / 7) * (0-(-15)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 13) / 10) * (20-(25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 23) / 8) * (-5-(20)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 31) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
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
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15 + (((tickAnim - 18) / 7) * (25-(-15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 25 + (((tickAnim - 25) / 8) * (15-(25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 33) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 10 + (((tickAnim - 43) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 48) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (15-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 30) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 33) / 2) * (5-(5)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (20-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 38) / 2) * (5-(20)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 40) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 5 + (((tickAnim - 43) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 45) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
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

    }

    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (0-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.7252-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.18705-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.08143-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.7252 + (((tickAnim - 8) / 3) * (27.63512-(17.7252)));
            yy = 6.18705 + (((tickAnim - 8) / 3) * (3.71223-(6.18705)));
            zz = -5.08143 + (((tickAnim - 8) / 3) * (-3.04886-(-5.08143)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.63512 + (((tickAnim - 11) / 3) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 11) / 3) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 11) / 3) * (0-(-3.04886)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 14) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 16) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 18) / 99) * (31-(31)));
            yy = 0 + (((tickAnim - 18) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 99) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 31 + (((tickAnim - 117) / 16) * (25-(31)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 25 + (((tickAnim - 133) / 6) * (13.16794-(25)));
            yy = 0 + (((tickAnim - 133) / 6) * (7.21884-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (-6.93856-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 13.16794 + (((tickAnim - 139) / 5) * (3.73551-(13.16794)));
            yy = 7.21884 + (((tickAnim - 139) / 5) * (2.97798-(7.21884)));
            zz = -6.93856 + (((tickAnim - 139) / 5) * (-4.01823-(-6.93856)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 3.73551 + (((tickAnim - 144) / 16) * (0-(3.73551)));
            yy = 2.97798 + (((tickAnim - 144) / 16) * (0-(2.97798)));
            zz = -4.01823 + (((tickAnim - 144) / 16) * (0-(-4.01823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (-0.2-(-0.2)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0.6-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (0.5-(-0.2)));
            zz = 0.6 + (((tickAnim - 8) / 6) * (0.3-(0.6)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 14) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 16) / 101) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 101) * (0.6-(0.4)));
            zz = 0.3 + (((tickAnim - 16) / 101) * (0.5-(0.3)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.6 + (((tickAnim - 117) / 16) * (0.6-(0.6)));
            zz = 0.5 + (((tickAnim - 117) / 16) * (0.5-(0.5)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 133) / 3) * (0.83-(0.6)));
            zz = 0.5 + (((tickAnim - 133) / 3) * (0.76-(0.5)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = 0.83 + (((tickAnim - 136) / 8) * (0.41-(0.83)));
            zz = 0.76 + (((tickAnim - 136) / 8) * (0.53-(0.76)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = 0.41 + (((tickAnim - 144) / 2) * (0.56-(0.41)));
            zz = 0.53 + (((tickAnim - 144) / 2) * (0.48-(0.53)));
        }
        else if (tickAnim >= 146 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 146) / 2) * (0-(0)));
            yy = 0.56 + (((tickAnim - 146) / 2) * (0.28-(0.56)));
            zz = 0.48 + (((tickAnim - 146) / 2) * (0.44-(0.48)));
        }
        else if (tickAnim >= 148 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 148) / 1) * (0-(0)));
            yy = 0.28 + (((tickAnim - 148) / 1) * (0.43-(0.28)));
            zz = 0.44 + (((tickAnim - 148) / 1) * (0.39-(0.44)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = 0.43 + (((tickAnim - 149) / 2) * (0.25-(0.43)));
            zz = 0.39 + (((tickAnim - 149) / 2) * (0.35-(0.39)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = 0.25 + (((tickAnim - 151) / 9) * (-0.1-(0.25)));
            zz = 0.35 + (((tickAnim - 151) / 9) * (0.1-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -33 + (((tickAnim - 3) / 8) * (3-(-33)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-17-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17 + (((tickAnim - 18) / 2) * (-19.99933-(-17)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.15205-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.08957-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -19.99933 + (((tickAnim - 20) / 11) * (-16.99618-(-19.99933)));
            yy = -0.15205 + (((tickAnim - 20) / 11) * (-0.86162-(-0.15205)));
            zz = -0.08957 + (((tickAnim - 20) / 11) * (-0.50758-(-0.08957)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -16.99618 + (((tickAnim - 31) / 86) * (-16.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 31) / 86) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 31) / 86) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -16.99618 + (((tickAnim - 117) / 16) * (-2.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 117) / 16) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 117) / 16) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -2.99618 + (((tickAnim - 133) / 6) * (-50.69775-(-2.99618)));
            yy = -0.86162 + (((tickAnim - 133) / 6) * (-0.58132-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 133) / 6) * (-0.34245-(-0.50758)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = -50.69775 + (((tickAnim - 139) / 5) * (-14.70156-(-50.69775)));
            yy = -0.58132 + (((tickAnim - 139) / 5) * (2.18123-(-0.58132)));
            zz = -0.34245 + (((tickAnim - 139) / 5) * (1.42364-(-0.34245)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = -14.70156 + (((tickAnim - 144) / 16) * (0-(-14.70156)));
            yy = 2.18123 + (((tickAnim - 144) / 16) * (0-(2.18123)));
            zz = 1.42364 + (((tickAnim - 144) / 16) * (0-(1.42364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.46-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.46 + (((tickAnim - 3) / 5) * (0.12-(-0.46)));
            zz = 0.12 + (((tickAnim - 3) / 5) * (0.35-(0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.12 + (((tickAnim - 8) / 3) * (0.2-(0.12)));
            zz = 0.35 + (((tickAnim - 8) / 3) * (0.2-(0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 2) * (-0.16-(0.2)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (-0.85-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.16 + (((tickAnim - 13) / 3) * (-0.09-(-0.16)));
            zz = -0.85 + (((tickAnim - 13) / 3) * (-0.79-(-0.85)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.09 + (((tickAnim - 16) / 2) * (0.01-(-0.09)));
            zz = -0.79 + (((tickAnim - 16) / 2) * (-0.41-(-0.79)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 18) / 2) * (0.01-(0.01)));
            zz = -0.41 + (((tickAnim - 18) / 2) * (-0.31-(-0.41)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 20) / 3) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 20) / 3) * (-0.31-(-0.31)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 23) / 5) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 23) / 5) * (-0.11-(-0.31)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 28) / 3) * (0.01-(0.01)));
            zz = -0.11 + (((tickAnim - 28) / 3) * (-0.01-(-0.11)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0.01 + (((tickAnim - 31) / 86) * (0.01-(0.01)));
            zz = -0.01 + (((tickAnim - 31) / 86) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.01 + (((tickAnim - 117) / 16) * (-0.39-(0.01)));
            zz = -0.01 + (((tickAnim - 117) / 16) * (-0.21-(-0.01)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.39 + (((tickAnim - 133) / 3) * (0.04-(-0.39)));
            zz = -0.21 + (((tickAnim - 133) / 3) * (0.14-(-0.21)));
        }
        else if (tickAnim >= 136 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 136) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 136) / 3) * (0.15-(0.04)));
            zz = 0.14 + (((tickAnim - 136) / 3) * (0.14-(0.14)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 139) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 139) / 5) * (-0.23-(0.15)));
            zz = 0.14 + (((tickAnim - 139) / 5) * (-0.09-(0.14)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 144) / 16) * (0-(0)));
            yy = -0.23 + (((tickAnim - 144) / 16) * (-0.2-(-0.23)));
            zz = -0.09 + (((tickAnim - 144) / 16) * (0-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55556-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-15-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.55556 + (((tickAnim - 3) / 5) * (-1-(-0.55556)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (-24.97532-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.12972-(0)));
            zz = -1 + (((tickAnim - 8) / 3) * (-0.67698-(-1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -24.97532 + (((tickAnim - 11) / 2) * (-37-(-24.97532)));
            yy = -0.12972 + (((tickAnim - 11) / 2) * (0-(-0.12972)));
            zz = -0.67698 + (((tickAnim - 11) / 2) * (0-(-0.67698)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 13) / 3) * (-22-(-37)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 16) / 2) * (-17.99383-(-22)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.74485-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.86146-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -17.99383 + (((tickAnim - 18) / 11) * (-13.92254-(-17.99383)));
            yy = -0.74485 + (((tickAnim - 18) / 11) * (-0.73066-(-0.74485)));
            zz = 0.86146 + (((tickAnim - 18) / 11) * (1.32282-(0.86146)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -13.92254 + (((tickAnim - 29) / 88) * (-10.98057-(-13.92254)));
            yy = -0.73066 + (((tickAnim - 29) / 88) * (-0.77517-(-0.73066)));
            zz = 1.32282 + (((tickAnim - 29) / 88) * (-0.13816-(1.32282)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -10.98057 + (((tickAnim - 117) / 16) * (-19.93444-(-10.98057)));
            yy = -0.77517 + (((tickAnim - 117) / 16) * (-1.58427-(-0.77517)));
            zz = -0.13816 + (((tickAnim - 117) / 16) * (-1.05315-(-0.13816)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -19.93444 + (((tickAnim - 133) / 6) * (60.42621-(-19.93444)));
            yy = -1.58427 + (((tickAnim - 133) / 6) * (-1.23771-(-1.58427)));
            zz = -1.05315 + (((tickAnim - 133) / 6) * (-0.82278-(-1.05315)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 60.42621 + (((tickAnim - 139) / 5) * (10.8853-(60.42621)));
            yy = -1.23771 + (((tickAnim - 139) / 5) * (-6.41695-(-1.23771)));
            zz = -0.82278 + (((tickAnim - 139) / 5) * (2.69485-(-0.82278)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 10.8853 + (((tickAnim - 144) / 16) * (0-(10.8853)));
            yy = -6.41695 + (((tickAnim - 144) / 16) * (0-(-6.41695)));
            zz = 2.69485 + (((tickAnim - 144) / 16) * (0-(2.69485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.33-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 16) / 2) * (0.2-(0.33)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 18) / 2) * (0.1-(0.2)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 6) * (0.52-(0.2)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.52 + (((tickAnim - 29) / 88) * (0.5-(0.52)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 16) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 133) / 11) * (0.46-(0.3)));
            zz = 0 + (((tickAnim - 133) / 11) * (-0.08-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 144) / 2) * (0.23-(0.46)));
            zz = -0.08 + (((tickAnim - 144) / 2) * (-0.09-(-0.08)));
        }
        else if (tickAnim >= 146 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 146) / 14) * (0-(0)));
            yy = 0.23 + (((tickAnim - 146) / 14) * (0.2-(0.23)));
            zz = -0.09 + (((tickAnim - 146) / 14) * (-0.2-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 10) / 3) * (-31.34436-(-40)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.7498-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.25841-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.34436 + (((tickAnim - 13) / 5) * (-5.26625-(-31.34436)));
            yy = 2.7498 + (((tickAnim - 13) / 5) * (-0.57627-(2.7498)));
            zz = -2.25841 + (((tickAnim - 13) / 5) * (-7.07087-(-2.25841)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -5.26625 + (((tickAnim - 18) / 3) * (27.63512-(-5.26625)));
            yy = -0.57627 + (((tickAnim - 18) / 3) * (3.71223-(-0.57627)));
            zz = -7.07087 + (((tickAnim - 18) / 3) * (-3.04886-(-7.07087)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 27.63512 + (((tickAnim - 21) / 4) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 21) / 4) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 21) / 4) * (0-(-3.04886)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 25) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 29 + (((tickAnim - 27) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 29) / 88) * (32.0968-(31)));
            yy = 0 + (((tickAnim - 29) / 88) * (2.59146-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (4.27748-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 32.0968 + (((tickAnim - 117) / 6) * (28.19418-(32.0968)));
            yy = 2.59146 + (((tickAnim - 117) / 6) * (-3.79706-(2.59146)));
            zz = 4.27748 + (((tickAnim - 117) / 6) * (5.91482-(4.27748)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 28.19418 + (((tickAnim - 123) / 5) * (3.06208-(28.19418)));
            yy = -3.79706 + (((tickAnim - 123) / 5) * (1.55488-(-3.79706)));
            zz = 5.91482 + (((tickAnim - 123) / 5) * (2.56649-(5.91482)));
        }
        else if (tickAnim >= 128 && tickAnim < 145) {
            xx = 3.06208 + (((tickAnim - 128) / 17) * (0.10865-(3.06208)));
            yy = 1.55488 + (((tickAnim - 128) / 17) * (-9.69232-(1.55488)));
            zz = 2.56649 + (((tickAnim - 128) / 17) * (16.70221-(2.56649)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 0.10865 + (((tickAnim - 145) / 7) * (11.72274-(0.10865)));
            yy = -9.69232 + (((tickAnim - 145) / 7) * (-2.63698-(-9.69232)));
            zz = 16.70221 + (((tickAnim - 145) / 7) * (4.54415-(16.70221)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 11.72274 + (((tickAnim - 152) / 8) * (0-(11.72274)));
            yy = -2.63698 + (((tickAnim - 152) / 8) * (0-(-2.63698)));
            zz = 4.54415 + (((tickAnim - 152) / 8) * (0-(4.54415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 10) * (0.4-(-0.4)));
            zz = 0.4 + (((tickAnim - 0) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 3) * (1.43-(0.4)));
            zz = 0.4 + (((tickAnim - 10) / 3) * (0.49-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.43 + (((tickAnim - 13) / 5) * (1.45-(1.43)));
            zz = 0.49 + (((tickAnim - 13) / 5) * (0.66-(0.49)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.45 + (((tickAnim - 18) / 3) * (0.8-(1.45)));
            zz = 0.66 + (((tickAnim - 18) / 3) * (0.1-(0.66)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 21) / 4) * (0.5-(0.8)));
            zz = 0.1 + (((tickAnim - 21) / 4) * (0.3-(0.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 25) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 27) / 1) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 27) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 29) / 2) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 29) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 31) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 85) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 32) / 85) * (0.3-(0.3)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 117) / 11) * (1.44-(0.3)));
            zz = 0.3 + (((tickAnim - 117) / 11) * (1.58-(0.3)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 1.44 + (((tickAnim - 128) / 1) * (1.26-(1.44)));
            zz = 1.58 + (((tickAnim - 128) / 1) * (1.5-(1.58)));
        }
        else if (tickAnim >= 129 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 129) / 2) * (0-(0)));
            yy = 1.26 + (((tickAnim - 129) / 2) * (1.29-(1.26)));
            zz = 1.5 + (((tickAnim - 129) / 2) * (1.42-(1.5)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.29 + (((tickAnim - 131) / 2) * (1.01-(1.29)));
            zz = 1.42 + (((tickAnim - 131) / 2) * (1.34-(1.42)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 1.01 + (((tickAnim - 133) / 1) * (1.04-(1.01)));
            zz = 1.34 + (((tickAnim - 133) / 1) * (1.26-(1.34)));
        }
        else if (tickAnim >= 134 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 134) / 26) * (0-(0)));
            yy = 1.04 + (((tickAnim - 134) / 26) * (-0.1-(1.04)));
            zz = 1.26 + (((tickAnim - 134) / 26) * (0.1-(1.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.29-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.29 + (((tickAnim - 5) / 7) * (-17-(-1.29)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -17 + (((tickAnim - 12) / 5) * (-54.35-(-17)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -54.35 + (((tickAnim - 17) / 7) * (-17-(-54.35)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = -17 + (((tickAnim - 24) / 93) * (-12-(-17)));
            yy = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 93) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -12 + (((tickAnim - 117) / 7) * (-44.32428-(-12)));
            yy = 0 + (((tickAnim - 117) / 7) * (-2.63157-(0)));
            zz = 0 + (((tickAnim - 117) / 7) * (-0.89032-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = -44.32428 + (((tickAnim - 124) / 4) * (-28.78371-(-44.32428)));
            yy = -2.63157 + (((tickAnim - 124) / 4) * (-4.73683-(-2.63157)));
            zz = -0.89032 + (((tickAnim - 124) / 4) * (-1.60258-(-0.89032)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -28.78371 + (((tickAnim - 128) / 5) * (-23.54851-(-28.78371)));
            yy = -4.73683 + (((tickAnim - 128) / 5) * (-5.30773-(-4.73683)));
            zz = -1.60258 + (((tickAnim - 128) / 5) * (-3.04499-(-1.60258)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -23.54851 + (((tickAnim - 133) / 7) * (-16.66138-(-23.54851)));
            yy = -5.30773 + (((tickAnim - 133) / 7) * (-3.9808-(-5.30773)));
            zz = -3.04499 + (((tickAnim - 133) / 7) * (-2.28374-(-3.04499)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -16.66138 + (((tickAnim - 140) / 5) * (-12.39571-(-16.66138)));
            yy = -3.9808 + (((tickAnim - 140) / 5) * (-2.47897-(-3.9808)));
            zz = -2.28374 + (((tickAnim - 140) / 5) * (-11.1353-(-2.28374)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = -12.39571 + (((tickAnim - 145) / 7) * (-40.79337-(-12.39571)));
            yy = -2.47897 + (((tickAnim - 145) / 7) * (-0.0007-(-2.47897)));
            zz = -11.1353 + (((tickAnim - 145) / 7) * (-0.00314-(-11.1353)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -40.79337 + (((tickAnim - 152) / 8) * (0-(-40.79337)));
            yy = -0.0007 + (((tickAnim - 152) / 8) * (0-(-0.0007)));
            zz = -0.00314 + (((tickAnim - 152) / 8) * (0-(-0.00314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (-0.08-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = -0.08 + (((tickAnim - 17) / 7) * (0.01-(-0.08)));
            zz = 0.35 + (((tickAnim - 17) / 7) * (-0.01-(0.35)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            yy = 0.01 + (((tickAnim - 24) / 93) * (0.51-(0.01)));
            zz = -0.01 + (((tickAnim - 24) / 93) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            yy = 0.51 + (((tickAnim - 117) / 6) * (0.39-(0.51)));
            zz = -0.01 + (((tickAnim - 117) / 6) * (0.42-(-0.01)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            yy = 0.39 + (((tickAnim - 123) / 5) * (0.14-(0.39)));
            zz = 0.42 + (((tickAnim - 123) / 5) * (0.39-(0.42)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            yy = 0.14 + (((tickAnim - 128) / 32) * (-0.2-(0.14)));
            zz = 0.39 + (((tickAnim - 128) / 32) * (0-(0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (40.86-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40.86 + (((tickAnim - 8) / 5) * (53-(40.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 53 + (((tickAnim - 13) / 6) * (-10.33-(53)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.33 + (((tickAnim - 19) / 4) * (-19.33-(-10.33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.33 + (((tickAnim - 23) / 4) * (-17.33-(-19.33)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -17.33 + (((tickAnim - 27) / 2) * (-14.33-(-17.33)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -14.33 + (((tickAnim - 29) / 88) * (-17.29966-(-14.33)));
            yy = 0 + (((tickAnim - 29) / 88) * (-0.7019-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (-4.95061-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -17.29966 + (((tickAnim - 117) / 7) * (0-(-17.29966)));
            yy = -0.7019 + (((tickAnim - 117) / 7) * (0-(-0.7019)));
            zz = -4.95061 + (((tickAnim - 117) / 7) * (0-(-4.95061)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (28.85-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 28.85 + (((tickAnim - 128) / 2) * (25.2637-(28.85)));
            yy = 0 + (((tickAnim - 128) / 2) * (1.13352-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (-1.64787-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 25.2637 + (((tickAnim - 130) / 10) * (17.25654-(25.2637)));
            yy = 1.13352 + (((tickAnim - 130) / 10) * (8.95221-(1.13352)));
            zz = -1.64787 + (((tickAnim - 130) / 10) * (-4.49939-(-1.64787)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 17.25654 + (((tickAnim - 140) / 5) * (12-(17.25654)));
            yy = 8.95221 + (((tickAnim - 140) / 5) * (0-(8.95221)));
            zz = -4.49939 + (((tickAnim - 140) / 5) * (0-(-4.49939)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 12 + (((tickAnim - 145) / 7) * (46.69038-(12)));
            yy = 0 + (((tickAnim - 145) / 7) * (2.17904-(0)));
            zz = 0 + (((tickAnim - 145) / 7) * (-0.72817-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 46.69038 + (((tickAnim - 152) / 8) * (0-(46.69038)));
            yy = 2.17904 + (((tickAnim - 152) / 8) * (0-(2.17904)));
            zz = -0.72817 + (((tickAnim - 152) / 8) * (0-(-0.72817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 10) * (0.12-(0.3)));
            zz = 0 + (((tickAnim - 3) / 10) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.12 + (((tickAnim - 13) / 6) * (0.36-(0.12)));
            zz = -0.1 + (((tickAnim - 13) / 6) * (0-(-0.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 19) / 4) * (0.36-(0.36)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 23) / 4) * (0.26-(0.36)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.26 + (((tickAnim - 27) / 2) * (0.35-(0.26)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 88) * (0.425-(0.35)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 117) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 117) / 5) * (0.2-(0.425)));
            zz = 0 + (((tickAnim - 117) / 5) * (-0.01-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 122) / 6) * (-0.18-(0.2)));
            zz = -0.01 + (((tickAnim - 122) / 6) * (-0.05-(-0.01)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = -0.18 + (((tickAnim - 128) / 12) * (0.17-(-0.18)));
            zz = -0.05 + (((tickAnim - 128) / 12) * (-0.15-(-0.05)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 140) / 20) * (0.3-(0.17)));
            zz = -0.15 + (((tickAnim - 140) / 20) * (-0.3-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (39-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 29) / 88) * (39-(39)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 39 + (((tickAnim - 117) / 43) * (0-(39)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
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
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 12 + (((tickAnim - 117) / 43) * (0-(12)));
            yy = 0.42902 + (((tickAnim - 117) / 43) * (0-(0.42902)));
            zz = -0.33008 + (((tickAnim - 117) / 43) * (0-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 13) * (0-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 27 + (((tickAnim - 13) / 4) * (40-(27)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 40 + (((tickAnim - 17) / 10) * (-31.87058-(40)));
            yy = 0 + (((tickAnim - 17) / 10) * (-4.16037-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-1.63998-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -31.87058 + (((tickAnim - 27) / 5) * (-47.07579-(-31.87058)));
            yy = -4.16037 + (((tickAnim - 27) / 5) * (-7.6538-(-4.16037)));
            zz = -1.63998 + (((tickAnim - 27) / 5) * (-2.5254-(-1.63998)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -47.07579 + (((tickAnim - 32) / 1) * (-47.02019-(-47.07579)));
            yy = -7.6538 + (((tickAnim - 32) / 1) * (-8.57463-(-7.6538)));
            zz = -2.5254 + (((tickAnim - 32) / 1) * (-2.9193-(-2.5254)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -47.02019 + (((tickAnim - 33) / 84) * (-47.02019-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 33) / 84) * (-8.57463-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 33) / 84) * (-2.9193-(-2.9193)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = -47.02019 + (((tickAnim - 117) / 19) * (0-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 117) / 19) * (0-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 117) / 19) * (0-(-2.9193)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 17) * (0.6-(0.2)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 6) * (1.85-(0.6)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 23) / 4) * (1.5-(1.85)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 27) / -27) * (-(0)));
            yy = 1.5 + (((tickAnim - 27) / -27) * (-(1.5)));
            zz = 0 + (((tickAnim - 27) / -27) * (-(0)));
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 8) / 5) * (45-(27.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 13) / 7) * (0-(45)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 8) / 8) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (5-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 6) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (0-(20)));
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

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);










        if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.69154 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75-40))*-3-(-4.69154)));
            yy = -4.66982 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*5-(-4.66982)));
            zz = 2.2011 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*-3-(2.2011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
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
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (25.83333-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.83333 + (((tickAnim - 2) / 1) * (27.5-(25.83333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (-17.5-(32.5)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-25-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 2) * (5-(10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 10) / 1) * (-12.5-(-25)));
            yy = 5 + (((tickAnim - 10) / 1) * (3.33333-(5)));
            zz = -10 + (((tickAnim - 10) / 1) * (-8.33333-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-2.5-(-12.5)));
            yy = 3.33333 + (((tickAnim - 11) / 2) * (0-(3.33333)));
            zz = -8.33333 + (((tickAnim - 11) / 2) * (-5-(-8.33333)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 13) / 2) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 2) * (0.53-(0.4)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.53 + (((tickAnim - 2) / 1) * (0.5-(0.53)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.4)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 11) / 1) * (-0.28-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 1) * (-0.5-(-0.28)));
            zz = 0.1 + (((tickAnim - 12) / 1) * (0.3-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.5)));
            zz = 0.3 + (((tickAnim - 13) / 0) * (0.6-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 13) / 2) * (0-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.6 + (((tickAnim - 13) / 2) * (0.4-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.4239-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.46453-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.05965 + (((tickAnim - 5) / 3) * (-32.22845-(-60.05965)));
            yy = -0.4239 + (((tickAnim - 5) / 3) * (-0.36445-(-0.4239)));
            zz = -2.46453 + (((tickAnim - 5) / 3) * (-1.77222-(-2.46453)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.22845 + (((tickAnim - 8) / 2) * (0.04703-(-32.22845)));
            yy = -0.36445 + (((tickAnim - 8) / 2) * (-0.55262-(-0.36445)));
            zz = -1.77222 + (((tickAnim - 8) / 2) * (2.71402-(-1.77222)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.04703 + (((tickAnim - 10) / 1) * (-9.96865-(0.04703)));
            yy = -0.55262 + (((tickAnim - 10) / 1) * (-0.36842-(-0.55262)));
            zz = 2.71402 + (((tickAnim - 10) / 1) * (1.80935-(2.71402)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.96865 + (((tickAnim - 11) / 2) * (-15-(-9.96865)));
            yy = -0.36842 + (((tickAnim - 11) / 2) * (0-(-0.36842)));
            zz = 1.80935 + (((tickAnim - 11) / 2) * (0-(1.80935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 13) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (5-(0)));
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
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (40-(15)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 40 + (((tickAnim - 3) / 2) * (105-(40)));
            yy = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 2) * (0-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 105 + (((tickAnim - 5) / 3) * (77.5-(105)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5 + (((tickAnim - 8) / 2) * (25-(77.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (17.5-(25)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (15-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-22.5-(-17.5)));
            yy = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
            zz = 15 + (((tickAnim - 0) / 3) * (10-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-2.5-(-22.5)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 10 + (((tickAnim - 3) / 2) * (5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (25-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 0) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (22.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            zz = 5 + (((tickAnim - 10) / 3) * (10-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (-17.5-(32.5)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (15-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 0) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 3) / 2) * (-0.8-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 1) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.8)));
            zz = 0.4 + (((tickAnim - 5) / 1) * (0.3-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 6) / 2) * (0.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.4-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0.4 + (((tickAnim - 8) / 2) * (0.6-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.6 + (((tickAnim - 10) / 3) * (0.5-(0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.22845 + (((tickAnim - 0) / 3) * (-7.45297-(-32.22845)));
            yy = 0.36445 + (((tickAnim - 0) / 3) * (0.55262-(0.36445)));
            zz = 1.77222 + (((tickAnim - 0) / 3) * (-2.71402-(1.77222)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.45297 + (((tickAnim - 3) / 2) * (-15-(-7.45297)));
            yy = 0.55262 + (((tickAnim - 3) / 2) * (0-(0.55262)));
            zz = -2.71402 + (((tickAnim - 3) / 2) * (0-(-2.71402)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.33333-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 8) / 2) * (0-(-3.33333)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 10) / 3) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.4239-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.46453-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -60.05965 + (((tickAnim - 13) / 2) * (-32.22845-(-60.05965)));
            yy = 0.4239 + (((tickAnim - 13) / 2) * (0.36445-(0.4239)));
            zz = 2.46453 + (((tickAnim - 13) / 2) * (1.77222-(2.46453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
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
            xx = 77.5 + (((tickAnim - 0) / 3) * (30-(77.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 3) / 2) * (17.5-(30)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (-5-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (15-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 8) / 2) * (57.5-(15)));
            yy = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 57.5 + (((tickAnim - 10) / 3) * (105-(57.5)));
            yy = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 105 + (((tickAnim - 13) / 2) * (77.5-(105)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42 + (((tickAnim - 0) / 1) * (-21.66667-(-42)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -21.66667 + (((tickAnim - 1) / 2) * (-10-(-21.66667)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 1) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (15-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (25-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 13) / 2) * (-42-(-30)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 0) / 1) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 1) / 1) * (-0.28-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 2) / 1) * (-0.6-(-0.28)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 0) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 3) / 2) * (-0.5-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31 + (((tickAnim - 0) / 1) * (19.66667-(31)));
            yy = -5 + (((tickAnim - 0) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 0) / 1) * (5-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.66667 + (((tickAnim - 1) / 1) * (12.83333-(19.66667)));
            yy = -5 + (((tickAnim - 1) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 1) / 1) * (5-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.83333 + (((tickAnim - 2) / 1) * (12-(12.83333)));
            yy = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 2) / 1) * (5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12 + (((tickAnim - 3) / 2) * (-2.5-(12)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 5 + (((tickAnim - 3) / 2) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (0-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (34.66284-(17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.95085-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (4.44344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.66284 + (((tickAnim - 10) / 3) * (22.40747-(34.66284)));
            yy = 1.95085 + (((tickAnim - 10) / 3) * (2.89034-(1.95085)));
            zz = 4.44344 + (((tickAnim - 10) / 3) * (8.65534-(4.44344)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.40747 + (((tickAnim - 13) / 2) * (31-(22.40747)));
            yy = 2.89034 + (((tickAnim - 13) / 2) * (-5-(2.89034)));
            zz = 8.65534 + (((tickAnim - 13) / 2) * (5-(8.65534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8.5 + (((tickAnim - 0) / 1) * (-0.90424-(8.5)));
            yy = 2.5 + (((tickAnim - 0) / 1) * (1.37761-(2.5)));
            zz = 5 + (((tickAnim - 0) / 1) * (3.35853-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.90424 + (((tickAnim - 1) / 1) * (1.69153-(-0.90424)));
            yy = 1.37761 + (((tickAnim - 1) / 1) * (0.25522-(1.37761)));
            zz = 3.35853 + (((tickAnim - 1) / 1) * (1.71706-(3.35853)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.69153 + (((tickAnim - 2) / 1) * (-5.46271-(1.69153)));
            yy = 0.25522 + (((tickAnim - 2) / 1) * (-0.86717-(0.25522)));
            zz = 1.71706 + (((tickAnim - 2) / 1) * (0.07558-(1.71706)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5.46271 + (((tickAnim - 3) / 0) * (-7.47514-(-5.46271)));
            yy = -0.86717 + (((tickAnim - 3) / 0) * (-0.57811-(-0.86717)));
            zz = 0.07558 + (((tickAnim - 3) / 0) * (0.05039-(0.07558)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.47514 + (((tickAnim - 3) / 2) * (-3-(-7.47514)));
            yy = -0.57811 + (((tickAnim - 3) / 2) * (0-(-0.57811)));
            zz = 0.05039 + (((tickAnim - 3) / 2) * (0-(0.05039)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (40-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (47.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.5 + (((tickAnim - 10) / 3) * (22.5-(47.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 13) / 2) * (8.5-(22.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (2.5-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
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
            xx = 25 + (((tickAnim - 0) / 3) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.5 + (((tickAnim - 3) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 3) / 3) * (10-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 6) / 2) * (-41.52976-(-30)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 6) / 2) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -41.52976 + (((tickAnim - 8) / 0) * (-23.33333-(-41.52976)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 0) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -23.33333 + (((tickAnim - 8) / 2) * (-21.66667-(-23.33333)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 2) * (10-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -21.66667 + (((tickAnim - 10) / 1) * (-15-(-21.66667)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 1) * (10-(10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 11) / 2) * (15-(-15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 11) / 2) * (5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (25-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 0) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 8) / 1) * (-0.72-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.72 + (((tickAnim - 9) / 1) * (-1-(-0.72)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 1) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 11) / 2) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
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
            xx = 17.5 + (((tickAnim - 0) / 3) * (34.71686-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.66716-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 34.71686 + (((tickAnim - 3) / 3) * (22.40747-(34.71686)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -5.66716 + (((tickAnim - 3) / 3) * (-8.65534-(-5.66716)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.40747 + (((tickAnim - 6) / 2) * (31.71919-(22.40747)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -8.65534 + (((tickAnim - 6) / 2) * (-6.44947-(-8.65534)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 31.71919 + (((tickAnim - 8) / 0) * (22.33333-(31.71919)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -6.44947 + (((tickAnim - 8) / 0) * (-5-(-6.44947)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.33333 + (((tickAnim - 8) / 1) * (16.66667-(22.33333)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 16.66667 + (((tickAnim - 9) / 1) * (18-(16.66667)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 9) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 10) / 3) * (17.5-(18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
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
            xx = 40 + (((tickAnim - 0) / 3) * (47.5-(40)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 47.5 + (((tickAnim - 3) / 3) * (13.5-(47.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 6) / 2) * (11.79448-(13.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.96731-(0)));
            zz = -5 + (((tickAnim - 6) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 11.79448 + (((tickAnim - 8) / 0) * (0.96161-(11.79448)));
            yy = -0.96731 + (((tickAnim - 8) / 0) * (-0.93627-(-0.96731)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.75037-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.96161 + (((tickAnim - 8) / 1) * (4.12874-(0.96161)));
            yy = -0.93627 + (((tickAnim - 8) / 1) * (-0.90523-(-0.93627)));
            zz = -3.75037 + (((tickAnim - 8) / 1) * (-2.50075-(-3.75037)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 4.12874 + (((tickAnim - 9) / 1) * (-4.5-(4.12874)));
            yy = -0.90523 + (((tickAnim - 9) / 1) * (0-(-0.90523)));
            zz = -2.50075 + (((tickAnim - 9) / 1) * (-5-(-2.50075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 10) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+30))*-5.1837), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-4.7781), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-0.5031));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-3));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 0) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 18 + (((tickAnim - 8) / 4) * (-16-(18)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -16 + (((tickAnim - 12) / 1) * (-16.67-(-16)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -16.67 + (((tickAnim - 13) / 2) * (4-(-16.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14 + (((tickAnim - 0) / 4) * (-18-(14)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18 + (((tickAnim - 4) / 2) * (-16-(-18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 6) / 2) * (0-(-16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (14-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraYuxisaurus entity = (EntityPrehistoricFloraYuxisaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.0062));

        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
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
            xx = 27.5 + (((tickAnim - 0) / 4) * (-6.25-(27.5)));
            yy = 10 + (((tickAnim - 0) / 4) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.25 + (((tickAnim - 4) / 3) * (-17.5-(-6.25)));
            yy = 10 + (((tickAnim - 4) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 4) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 7) / 5) * (-22.5-(-17.5)));
            yy = 10 + (((tickAnim - 7) / 5) * (0-(10)));
            zz = -10 + (((tickAnim - 7) / 5) * (-5-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -22.5 + (((tickAnim - 12) / 10) * (10-(-22.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 10) * (-2.5-(-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 22) / 4) * (17.75-(10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 22) / 4) * (-0.75-(-2.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 26) / 2) * (17.5-(17.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 26) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 28) / 7) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 35) / 5) * (27.5-(32.5)));
            yy = 2.5 + (((tickAnim - 35) / 5) * (10-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 5) * (-10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 7) * (0.2-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (-0.25-(0)));
            zz = 0.2 + (((tickAnim - 7) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 5) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = 0.2 + (((tickAnim - 12) / 5) * (0.35-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 17) / 5) * (-0.9-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.35 + (((tickAnim - 17) / 5) * (0.9-(0.35)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -0.9 + (((tickAnim - 22) / 4) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2-(-0.9)));
            zz = 0.9 + (((tickAnim - 22) / 4) * (1.15-(0.9)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2 + (((tickAnim - 26) / 2) * (-1.3-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2)));
            zz = 1.15 + (((tickAnim - 26) / 2) * (1-(1.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 4) * (-0.6-(-1.3)));
            zz = 1 + (((tickAnim - 28) / 4) * (0.8-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 3) * (-0.3-(-0.6)));
            zz = 0.8 + (((tickAnim - 32) / 3) * (0.8-(0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 35) / 5) * (0-(-0.3)));
            zz = 0.8 + (((tickAnim - 35) / 5) * (0.5-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -56.0482 + (((tickAnim - 0) / 5) * (-56.12249-(-56.0482)));
            yy = 1.69871 + (((tickAnim - 0) / 5) * (-0.72162-(1.69871)));
            zz = -2.10316 + (((tickAnim - 0) / 5) * (-2.21221-(-2.10316)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -56.12249 + (((tickAnim - 5) / 7) * (-15.21694-(-56.12249)));
            yy = -0.72162 + (((tickAnim - 5) / 7) * (2.69952-(-0.72162)));
            zz = -2.21221 + (((tickAnim - 5) / 7) * (0.7854-(-2.21221)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -15.21694 + (((tickAnim - 12) / 4) * (-17.46178-(-15.21694)));
            yy = 2.69952 + (((tickAnim - 12) / 4) * (2.31367-(2.69952)));
            zz = 0.7854 + (((tickAnim - 12) / 4) * (-0.66643-(0.7854)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -17.46178 + (((tickAnim - 16) / 4) * (-19.20662-(-17.46178)));
            yy = 2.31367 + (((tickAnim - 16) / 4) * (1.92782-(2.31367)));
            zz = -0.66643 + (((tickAnim - 16) / 4) * (-2.11825-(-0.66643)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -19.20662 + (((tickAnim - 20) / 6) * (-17.61198-(-19.20662)));
            yy = 1.92782 + (((tickAnim - 20) / 6) * (0.57834-(1.92782)));
            zz = -2.11825 + (((tickAnim - 20) / 6) * (-0.63547-(-2.11825)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -17.61198 + (((tickAnim - 26) / 2) * (-12.5-(-17.61198)));
            yy = 0.57834 + (((tickAnim - 26) / 2) * (0-(0.57834)));
            zz = -0.63547 + (((tickAnim - 26) / 2) * (0-(-0.63547)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 28) / 7) * (-25.18327-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (3.5637-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0.23014-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -25.18327 + (((tickAnim - 35) / 5) * (-56.0482-(-25.18327)));
            yy = 3.5637 + (((tickAnim - 35) / 5) * (1.69871-(3.5637)));
            zz = 0.23014 + (((tickAnim - 35) / 5) * (-2.10316-(0.23014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 12) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0.2)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 16) / 4) * (0.2-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.2)));
            zz = 0.2 + (((tickAnim - 20) / 4) * (0.1-(0.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 24) / 2) * (0.17-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.1 + (((tickAnim - 24) / 2) * (0.08-(0.1)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.17 + (((tickAnim - 26) / 2) * (0.3-(0.17)));
            zz = 0.08 + (((tickAnim - 26) / 2) * (0.3-(0.08)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 7) * (0.8-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 7) * (0.2-(0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 35) / 5) * (0.2-(0.8)));
            zz = 0.2 + (((tickAnim - 35) / 5) * (0-(0.2)));
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
            xx = 87.5 + (((tickAnim - 0) / 8) * (67.5-(87.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 67.5 + (((tickAnim - 8) / 4) * (33.46783-(67.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1.38475-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.66155-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 33.46783 + (((tickAnim - 12) / 8) * (10.98436-(33.46783)));
            yy = -1.38475 + (((tickAnim - 12) / 8) * (-0.75155-(-1.38475)));
            zz = 2.66155 + (((tickAnim - 12) / 8) * (2.38443-(2.66155)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 10.98436 + (((tickAnim - 20) / 6) * (2.54531-(10.98436)));
            yy = -0.75155 + (((tickAnim - 20) / 6) * (-0.22546-(-0.75155)));
            zz = 2.38443 + (((tickAnim - 20) / 6) * (0.71533-(2.38443)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 2.54531 + (((tickAnim - 26) / 2) * (-2.5-(2.54531)));
            yy = -0.22546 + (((tickAnim - 26) / 2) * (0-(-0.22546)));
            zz = 0.71533 + (((tickAnim - 26) / 2) * (0-(0.71533)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 28) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 42.5 + (((tickAnim - 35) / 5) * (87.5-(42.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (15-(10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 8) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 15) / 5) * (27.5-(27.5)));
            yy = -2.5 + (((tickAnim - 15) / 5) * (-10-(-2.5)));
            zz = 2.5 + (((tickAnim - 15) / 5) * (10-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 20) / 8) * (-22.5-(27.5)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = 10 + (((tickAnim - 20) / 8) * (10-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -22.5 + (((tickAnim - 28) / 4) * (-12-(-22.5)));
            yy = -10 + (((tickAnim - 28) / 4) * (0-(-10)));
            zz = 10 + (((tickAnim - 28) / 4) * (5-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 32) / 8) * (10-(-12)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 8) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.23-(-0.9)));
            zz = 0.8 + (((tickAnim - 0) / 2) * (1-(0.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.23 + (((tickAnim - 2) / 2) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.23)));
            zz = 1 + (((tickAnim - 2) / 2) * (1.05-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 4) / 3) * (-1.21-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = 1.05 + (((tickAnim - 4) / 3) * (1-(1.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -1.21 + (((tickAnim - 7) / 1) * (-1.3-(-1.21)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.3 + (((tickAnim - 8) / 2) * (-0.65-(-1.3)));
            zz = 1 + (((tickAnim - 8) / 2) * (0.8-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.65 + (((tickAnim - 10) / 5) * (-0.3-(-0.65)));
            zz = 0.8 + (((tickAnim - 10) / 5) * (0.8-(0.8)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 5) * (0-(-0.3)));
            zz = 0.8 + (((tickAnim - 15) / 5) * (0.6-(0.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0.6 + (((tickAnim - 20) / 8) * (0-(0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -0.4 + (((tickAnim - 32) / 1) * (-0.25-(-0.4)));
            zz = 0 + (((tickAnim - 32) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 33) / 3) * (-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.25)));
            zz = 0.1 + (((tickAnim - 33) / 3) * (0.25-(0.1)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 36) / 2) * (-0.61-(-0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.25 + (((tickAnim - 36) / 2) * (0.65-(0.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.61 + (((tickAnim - 38) / 2) * (-0.9-(-0.61)));
            zz = 0.65 + (((tickAnim - 38) / 2) * (0.8-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.58426 + (((tickAnim - 0) / 8) * (2.5-(-12.58426)));
            yy = -1.16329 + (((tickAnim - 0) / 8) * (0-(-1.16329)));
            zz = -0.2855 + (((tickAnim - 0) / 8) * (0-(-0.2855)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-26.64782-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-3.63642-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.62082-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -26.64782 + (((tickAnim - 16) / 4) * (-58.74987-(-26.64782)));
            yy = -3.63642 + (((tickAnim - 16) / 4) * (-3.28469-(-3.63642)));
            zz = 0.62082 + (((tickAnim - 16) / 4) * (2.44489-(0.62082)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -58.74987 + (((tickAnim - 20) / 4) * (-58.37537-(-58.74987)));
            yy = -3.28469 + (((tickAnim - 20) / 4) * (-0.94768-(-3.28469)));
            zz = 2.44489 + (((tickAnim - 20) / 4) * (1.18031-(2.44489)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -58.37537 + (((tickAnim - 24) / 4) * (-25.17367-(-58.37537)));
            yy = -0.94768 + (((tickAnim - 24) / 4) * (1.5984-(-0.94768)));
            zz = 1.18031 + (((tickAnim - 24) / 4) * (2.399-(1.18031)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.17367 + (((tickAnim - 28) / 4) * (-16.21678-(-25.17367)));
            yy = 1.5984 + (((tickAnim - 28) / 4) * (-2.66269-(1.5984)));
            zz = 2.399 + (((tickAnim - 28) / 4) * (-0.76204-(2.399)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -16.21678 + (((tickAnim - 32) / 8) * (-12.58426-(-16.21678)));
            yy = -2.66269 + (((tickAnim - 32) / 8) * (-1.16329-(-2.66269)));
            zz = -0.76204 + (((tickAnim - 32) / 8) * (-0.2855-(-0.76204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.1)));
            zz = 0.3 + (((tickAnim - 0) / 4) * (0.2-(0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 4) / 4) * (0.3-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.2 + (((tickAnim - 4) / 4) * (0.1-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 24) * (0-(0.3)));
            zz = 0.1 + (((tickAnim - 8) / 24) * (0-(0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.4972 + (((tickAnim - 0) / 4) * (-5.31659-(2.4972)));
            yy = 0.342 + (((tickAnim - 0) / 4) * (0.18155-(0.342)));
            zz = -0.9397 + (((tickAnim - 0) / 4) * (-0.97202-(-0.9397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.31659 + (((tickAnim - 4) / 3) * (-12.10056-(-5.31659)));
            yy = 0.18155 + (((tickAnim - 4) / 3) * (0.0684-(0.18155)));
            zz = -0.97202 + (((tickAnim - 4) / 3) * (-0.18794-(-0.97202)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.10056 + (((tickAnim - 7) / 1) * (-12-(-12.10056)));
            yy = 0.0684 + (((tickAnim - 7) / 1) * (0-(0.0684)));
            zz = -0.18794 + (((tickAnim - 7) / 1) * (0-(-0.18794)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (2.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (8.17-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.17 + (((tickAnim - 12) / 3) * (42.5-(8.17)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 42.5 + (((tickAnim - 15) / 5) * (87.5-(42.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 87.5 + (((tickAnim - 20) / 8) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 77.5 + (((tickAnim - 28) / 4) * (24.97476-(77.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (1.02565-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (-2.81938-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 24.97476 + (((tickAnim - 32) / 8) * (2.4972-(24.97476)));
            yy = 1.02565 + (((tickAnim - 32) / 8) * (0.342-(1.02565)));
            zz = -2.81938 + (((tickAnim - 32) / 8) * (-0.9397-(-2.81938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2 + (((tickAnim - 0) / 26) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -44.5 + (((tickAnim - 0) / 4) * (-23.03301-(-44.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -23.03301 + (((tickAnim - 4) / 4) * (-10-(-23.03301)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 8) / 9) * (11-(-10)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 9) * (0-(-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 17) / 3) * (15-(11)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = -5 + (((tickAnim - 20) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 28) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 28) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -37.5 + (((tickAnim - 33) / 4) * (-35.5-(-37.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 33) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -35.5 + (((tickAnim - 37) / 3) * (-44.5-(-35.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 37) / 3) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 3) * (-0.76-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.76 + (((tickAnim - 3) / 1) * (-0.15-(-0.76)));
            zz = -0.15 + (((tickAnim - 3) / 1) * (-0.25-(-0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 4) / 4) * (-1-(-0.15)));
            zz = -0.25 + (((tickAnim - 4) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 8) / 5) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-1)));
            zz = -0.5 + (((tickAnim - 8) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 13) / 4) * (-0.5-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 13) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
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
            xx = 27.5 + (((tickAnim - 0) / 4) * (17.25-(27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 17.25 + (((tickAnim - 4) / 4) * (13-(17.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 13 + (((tickAnim - 8) / 9) * (-1-(13)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -1 + (((tickAnim - 17) / 6) * (25-(-1)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 25 + (((tickAnim - 23) / 5) * (36.40083-(25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 23) / 5) * (3.94479-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 36.40083 + (((tickAnim - 28) / 5) * (37.73399-(36.40083)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 3.94479 + (((tickAnim - 28) / 5) * (4.80494-(3.94479)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.73399 + (((tickAnim - 33) / 4) * (22.42158-(37.73399)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 4.80494 + (((tickAnim - 33) / 4) * (8.84456-(4.80494)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 22.42158 + (((tickAnim - 37) / 3) * (27.5-(22.42158)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 8.84456 + (((tickAnim - 37) / 3) * (0-(8.84456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
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
            xx = 17.98072 + (((tickAnim - 0) / 4) * (7.49527-(17.98072)));
            yy = 0.95645 + (((tickAnim - 0) / 4) * (0.21782-(0.95645)));
            zz = 2.69009 + (((tickAnim - 0) / 4) * (2.5095-(2.69009)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.49527 + (((tickAnim - 4) / 4) * (-2.99294-(7.49527)));
            yy = 0.21782 + (((tickAnim - 4) / 4) * (-0.32621-(0.21782)));
            zz = 2.5095 + (((tickAnim - 4) / 4) * (2.52136-(2.5095)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.99294 + (((tickAnim - 8) / 9) * (-9-(-2.99294)));
            yy = -0.32621 + (((tickAnim - 8) / 9) * (0-(-0.32621)));
            zz = 2.52136 + (((tickAnim - 8) / 9) * (0-(2.52136)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 17) / 6) * (49-(-9)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 49 + (((tickAnim - 23) / 7) * (7.5-(49)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 7.5 + (((tickAnim - 30) / 7) * (5-(7.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 37) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.95645-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (2.69009-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 0) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 8) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 8) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 5) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.5 + (((tickAnim - 13) / 4) * (-32.5-(-37.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 4) * (5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 17) / 3) * (-40.5-(-32.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 17) / 3) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -40.5 + (((tickAnim - 20) / 4) * (-16.25-(-40.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 20) / 4) * (5-(5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -16.25 + (((tickAnim - 24) / 4) * (-10-(-16.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 4) * (5-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 28) / 9) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 5 + (((tickAnim - 28) / 9) * (0-(5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 37) / 3) * (15-(12.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 20) / 4) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.75-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 24) / 4) * (-0.9-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = -0.75 + (((tickAnim - 24) / 4) * (-0.5-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.9 + (((tickAnim - 28) / 5) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.9)));
            zz = -0.5 + (((tickAnim - 28) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 33) / 4) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 33) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 37) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (36.44546-(25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 8) * (-3.01148-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 36.44546 + (((tickAnim - 8) / 9) * (19.91451-(36.44546)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -3.01148 + (((tickAnim - 8) / 9) * (-8.74877-(-3.01148)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.91451 + (((tickAnim - 17) / 3) * (24.5-(19.91451)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -8.74877 + (((tickAnim - 17) / 3) * (0-(-8.74877)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 24.5 + (((tickAnim - 20) / 4) * (17.25-(24.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 17.25 + (((tickAnim - 24) / 4) * (12-(17.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 28) / 5) * (4.5-(12)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 4.5 + (((tickAnim - 33) / 4) * (15-(4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 37) / 3) * (25-(15)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (-5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.1-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = -0.1 + (((tickAnim - 24) / 4) * (0-(-0.1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 0) / 8) * (17.5-(35)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 8) / 5) * (0.5-(17.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.5 + (((tickAnim - 13) / 4) * (5-(0.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.95645-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-2.69009-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 17.98072 + (((tickAnim - 20) / 4) * (1.49527-(17.98072)));
            yy = -0.95645 + (((tickAnim - 20) / 4) * (-0.21782-(-0.95645)));
            zz = -2.69009 + (((tickAnim - 20) / 4) * (-2.5095-(-2.69009)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.49527 + (((tickAnim - 24) / 4) * (-1.99294-(1.49527)));
            yy = -0.21782 + (((tickAnim - 24) / 4) * (0.32621-(-0.21782)));
            zz = -2.5095 + (((tickAnim - 24) / 4) * (-2.52136-(-2.5095)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.99294 + (((tickAnim - 28) / 5) * (-4.5-(-1.99294)));
            yy = 0.32621 + (((tickAnim - 28) / 5) * (0-(0.32621)));
            zz = -2.52136 + (((tickAnim - 28) / 5) * (-2.5-(-2.52136)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -4.5 + (((tickAnim - 33) / 4) * (8-(-4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 37) / 3) * (35-(8)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 24) / 4) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (7-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 22) / 6) * (11-(7)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 11 + (((tickAnim - 28) / 5) * (-11-(11)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -11 + (((tickAnim - 33) / 7) * (0-(-11)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 0) / 16) * (-8-(13)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -8 + (((tickAnim - 16) / 4) * (0-(-8)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 33) / 7) * (13-(2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraYuxisaurus e = (EntityPrehistoricFloraYuxisaurus) entity;
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
