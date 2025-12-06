package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTrypanognathus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTrypanognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer upperarmright;
    private final AdvancedModelRenderer lowerarmleft;
    private final AdvancedModelRenderer upperarmright2;
    private final AdvancedModelRenderer upperarmleft;
    private final AdvancedModelRenderer lowerarmright;
    private final AdvancedModelRenderer upperarmleft2;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelTrypanognathus() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -0.075F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -0.75F, 7.025F);
        this.base.addChild(hip);
        this.hip.cubeList.add(new ModelBox(hip, 10, 19, -1.5F, -1.8F, -3.35F, 3, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.3F, -2.375F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 21, -1.0F, -1.0F, -1.0F, 2, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.75F, -6.5F, 4, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.6F, -4.525F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 11, -1.0F, -1.0F, -2.0F, 3, 1, 7, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -6.25F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 9, -2.5F, -0.5F, -5.5F, 5, 2, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.3F, -4.5F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 3, -3.0F, -2.0F, -1.0F, 4, 2, 6, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.chest.addChild(neck);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 1.45F, -0.85F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 28, -4.0F, -2.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.35F, -0.85F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 0, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.35F, -1.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 22, -0.5F, -1.0F, -6.0F, 1, 1, 3, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 29, 29, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.35F, 0.75F, -5.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0908F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 5, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.85F, 0.5F, -4.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.0908F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 1, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.45F, 0.5F, -3.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -1.2654F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.975F, 0.25F, -4.725F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.1781F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, 0.0F, -1.0F, 0.0F, 3, 1, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.0908F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 9, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.45F, 0.0F, -4.225F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -1.2217F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 19, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.475F, 0.0F, -1.4F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.4399F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 35, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.015F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.175F, -1.85F, -3.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3054F, -0.5236F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 3, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.475F, 0.0F, -1.4F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.4399F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 35, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.015F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.975F, 0.25F, -4.725F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 1.1781F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 6, -3.0F, -1.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.45F, 0.0F, -4.225F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 1.2217F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 19, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.45F, 0.5F, -3.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 1.2654F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.85F, 0.5F, -4.75F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.0908F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 1, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.35F, 0.75F, -5.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 1.0908F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 5, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 1.0908F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 9, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.175F, -1.85F, -3.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.3054F, 0.5236F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 15, 3, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 35, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 21, 32, -0.5F, 0.0F, -5.75F, 1, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 4, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 30, -1.5F, -1.75F, -2.0F, 3, 2, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.025F, 0.75F, -4.575F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -1.1345F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 5, 0, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.525F, 0.75F, -3.175F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -1.1345F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 5, 2, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.525F, 1.0F, -5.7F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -1.0472F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 4, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.45F, 1.0F, -4.075F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -1.2217F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 6, 35, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.1F, 1.0F, -2.4F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -1.4399F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 0, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.1F, 1.0F, -2.4F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.4399F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 0, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.375F, 0.15F, -5.725F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -1.0472F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 5, 4, 0.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.375F, 0.15F, -5.725F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 1.0472F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 5, 4, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.525F, 1.0F, -5.7F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 1.0472F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 4, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.525F, 0.75F, -3.175F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 1.1345F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 5, 2, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.025F, 0.75F, -4.575F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 1.1345F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 5, 0, -1.0F, -1.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.45F, 1.0F, -4.075F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.2217F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 6, 35, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.upperarmright = new AdvancedModelRenderer(this);
        this.upperarmright.setRotationPoint(-2.0F, 0.85F, -5.0F);
        this.chest.addChild(upperarmright);
        this.setRotateAngle(upperarmright, 0.0F, -0.1309F, -0.0873F);
        this.upperarmright.cubeList.add(new ModelBox(upperarmright, 22, 19, -2.0F, -0.55F, -0.25F, 3, 1, 1, 0.01F, false));

        this.lowerarmleft = new AdvancedModelRenderer(this);
        this.lowerarmleft.setRotationPoint(-1.6F, 0.0F, 0.15F);
        this.upperarmright.addChild(lowerarmleft);
        this.setRotateAngle(lowerarmleft, 0.0F, -1.2217F, -0.7418F);
        this.lowerarmleft.cubeList.add(new ModelBox(lowerarmleft, 0, 13, -2.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.upperarmright2 = new AdvancedModelRenderer(this);
        this.upperarmright2.setRotationPoint(-2.0F, 0.0F, 0.25F);
        this.lowerarmleft.addChild(upperarmright2);
        this.setRotateAngle(upperarmright2, 0.7375F, 0.0883F, 0.3832F);
        this.upperarmright2.cubeList.add(new ModelBox(upperarmright2, 27, 34, -1.4F, -0.5F, -1.25F, 2, 1, 2, 0.0F, false));

        this.upperarmleft = new AdvancedModelRenderer(this);
        this.upperarmleft.setRotationPoint(2.0F, 0.85F, -5.0F);
        this.chest.addChild(upperarmleft);
        this.setRotateAngle(upperarmleft, 0.0F, 0.1309F, 0.0873F);
        this.upperarmleft.cubeList.add(new ModelBox(upperarmleft, 22, 19, -1.0F, -0.55F, -0.25F, 3, 1, 1, 0.01F, true));

        this.lowerarmright = new AdvancedModelRenderer(this);
        this.lowerarmright.setRotationPoint(1.6F, 0.0F, 0.15F);
        this.upperarmleft.addChild(lowerarmright);
        this.setRotateAngle(lowerarmright, 0.0F, 1.2217F, 0.7418F);
        this.lowerarmright.cubeList.add(new ModelBox(lowerarmright, 0, 13, 0.0F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.upperarmleft2 = new AdvancedModelRenderer(this);
        this.upperarmleft2.setRotationPoint(2.0F, 0.0F, 0.25F);
        this.lowerarmright.addChild(upperarmleft2);
        this.setRotateAngle(upperarmleft2, 0.7375F, -0.0883F, -0.3832F);
        this.upperarmleft2.cubeList.add(new ModelBox(upperarmleft2, 27, 34, -0.6F, -0.5F, -1.25F, 2, 1, 2, 0.0F, true));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-1.5F, -0.4F, 1.0F);
        this.hip.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.0873F, 0.0873F, -0.0436F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 2, -1.25F, -0.55F, -0.75F, 2, 1, 1, 0.01F, false));
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 0, -1.25F, -0.55F, -0.3F, 2, 1, 1, 0.0F, false));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.85F, 0.0F, -0.1F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.1745F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 0, 11, -2.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-2.0F, 0.25F, 0.25F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.0436F, -0.7854F, 0.2182F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 0.5F, -6.25F);
        this.footright.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.1745F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 34, -3.25F, -0.975F, 4.75F, 2, 1, 2, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(1.5F, -0.4F, 1.0F);
        this.hip.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.0873F, -0.0873F, 0.0436F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 2, -0.75F, -0.55F, -0.75F, 2, 1, 1, 0.01F, true));
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 0, -0.75F, -0.55F, -0.3F, 2, 1, 1, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.85F, 0.0F, -0.1F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.1745F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 0, 11, 0.0F, -0.5F, -0.65F, 2, 1, 1, -0.01F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(2.0F, 0.25F, 0.25F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.0436F, 0.7854F, -0.2182F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.5F, -6.25F);
        this.footleft.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1745F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 34, 1.25F, -0.975F, 4.75F, 2, 1, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.8F, 2.65F);
        this.hip.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 22, -1.0F, -1.0F, -0.5F, 2, 2, 6, -0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 12, 0.0F, -1.75F, -0.5F, 0, 1, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 11, 0.0F, -2.0F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 27, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, 0.0F, -2.0F, 0.0F, 0, 3, 8, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 11, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.base.offsetZ = -0.3F;
        this.base.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.2F;
        this.base.offsetX = 0.2F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(120);
        this.base.rotateAngleX = (float)Math.toRadians(1);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 1.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        this.faceTarget(f3, f4, 5, neck);
        //this.faceTarget(f3, f4, 6, wholehead);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraTrypanognathus entitySilesaurus = (EntityPrehistoricFloraTrypanognathus) e;
        ((EntityPrehistoricFloraTrypanognathus)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraTrypanognathus ee = (EntityPrehistoricFloraTrypanognathus) entitylivingbaseIn;

        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
        }
        else {
            //Swimming pose:
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) {
                    animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrypanognathus entity = (EntityPrehistoricFloraTrypanognathus) entitylivingbaseIn;
        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10.7227-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.63021-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-4.96022-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10.7227 + (((tickAnim - 3) / 5) * (0-(-10.7227)));
            yy = -0.63021 + (((tickAnim - 3) / 5) * (0-(-0.63021)));
            zz = -4.96022 + (((tickAnim - 3) / 5) * (0-(-4.96022)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.75 + (((tickAnim - 3) / 2) * (0-(30.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrypanognathus entity = (EntityPrehistoricFloraTrypanognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+160))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+220))*10), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+370))*14), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.51155 + (((tickAnim - 0) / 10) * (9.75-(2.51155)));
            yy = -35.16928 + (((tickAnim - 0) / 10) * (56.25-(-35.16928)));
            zz = -3.36283 + (((tickAnim - 0) / 10) * (7.44-(-3.36283)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (2.51155-(9.75)));
            yy = 56.25 + (((tickAnim - 10) / 10) * (-35.16928-(56.25)));
            zz = 7.44 + (((tickAnim - 10) / 10) * (-3.36283-(7.44)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(xx), upperarmright.rotateAngleY + (float) Math.toRadians(yy), upperarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -83.75978 + (((tickAnim - 0) / 10) * (-71.77429-(-83.75978)));
            yy = 52.38252 + (((tickAnim - 0) / 10) * (66.37985-(52.38252)));
            zz = 39.06098 + (((tickAnim - 0) / 10) * (43.51785-(39.06098)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -71.77429 + (((tickAnim - 10) / 5) * (-81.22832-(-71.77429)));
            yy = 66.37985 + (((tickAnim - 10) / 5) * (56.95816-(66.37985)));
            zz = 43.51785 + (((tickAnim - 10) / 5) * (56.60757-(43.51785)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -81.22832 + (((tickAnim - 15) / 5) * (-83.75978-(-81.22832)));
            yy = 56.95816 + (((tickAnim - 15) / 5) * (52.38252-(56.95816)));
            zz = 56.60757 + (((tickAnim - 15) / 5) * (39.06098-(56.60757)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(xx), lowerarmleft.rotateAngleY + (float) Math.toRadians(yy), lowerarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 43.26553 + (((tickAnim - 0) / 5) * (31.83848-(43.26553)));
            yy = -7.55568 + (((tickAnim - 0) / 5) * (-9.97077-(-7.55568)));
            zz = -44.9853 + (((tickAnim - 0) / 5) * (-42.26744-(-44.9853)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 31.83848 + (((tickAnim - 5) / 3) * (42.87495-(31.83848)));
            yy = -9.97077 + (((tickAnim - 5) / 3) * (-11.17831-(-9.97077)));
            zz = -42.26744 + (((tickAnim - 5) / 3) * (-40.90851-(-42.26744)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 42.87495 + (((tickAnim - 8) / 2) * (84.91142-(42.87495)));
            yy = -11.17831 + (((tickAnim - 8) / 2) * (-12.38585-(-11.17831)));
            zz = -40.90851 + (((tickAnim - 8) / 2) * (-39.54958-(-40.90851)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 84.91142 + (((tickAnim - 10) / 5) * (72.63868-(84.91142)));
            yy = -12.38585 + (((tickAnim - 10) / 5) * (-17.86091-(-12.38585)));
            zz = -39.54958 + (((tickAnim - 10) / 5) * (-64.29076-(-39.54958)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 72.63868 + (((tickAnim - 15) / 5) * (43.26553-(72.63868)));
            yy = -17.86091 + (((tickAnim - 15) / 5) * (-7.55568-(-17.86091)));
            zz = -64.29076 + (((tickAnim - 15) / 5) * (-44.9853-(-64.29076)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(xx), upperarmright2.rotateAngleY + (float) Math.toRadians(yy), upperarmright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.00188 + (((tickAnim - 0) / 5) * (0.0391-(0.00188)));
            yy = -0.22823 + (((tickAnim - 0) / 5) * (-0.12428-(-0.22823)));
            zz = 0.47279 + (((tickAnim - 0) / 5) * (0.31791-(0.47279)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.0391 + (((tickAnim - 5) / 5) * (0.06888-(0.0391)));
            yy = -0.12428 + (((tickAnim - 5) / 5) * (0.00573-(-0.12428)));
            zz = 0.31791 + (((tickAnim - 5) / 5) * (0.06487-(0.31791)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.06888 + (((tickAnim - 10) / 5) * (-0.14042-(0.06888)));
            yy = 0.00573 + (((tickAnim - 10) / 5) * (-0.28714-(0.00573)));
            zz = 0.06487 + (((tickAnim - 10) / 5) * (0.18252-(0.06487)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.14042 + (((tickAnim - 15) / 5) * (0.00188-(-0.14042)));
            yy = -0.28714 + (((tickAnim - 15) / 5) * (-0.22823-(-0.28714)));
            zz = 0.18252 + (((tickAnim - 15) / 5) * (0.47279-(0.18252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmright2.rotationPointX = this.upperarmright2.rotationPointX + (float)(xx);
        this.upperarmright2.rotationPointY = this.upperarmright2.rotationPointY - (float)(yy);
        this.upperarmright2.rotationPointZ = this.upperarmright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.60854 + (((tickAnim - 0) / 5) * (13.27943-(9.60854)));
            yy = 47.49191 + (((tickAnim - 0) / 5) * (-15.35931-(47.49191)));
            zz = 4.18006 + (((tickAnim - 0) / 5) * (7.05669-(4.18006)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.27943 + (((tickAnim - 5) / 5) * (21.17015-(13.27943)));
            yy = -15.35931 + (((tickAnim - 5) / 5) * (-73.97501-(-15.35931)));
            zz = 7.05669 + (((tickAnim - 5) / 5) * (-16.06413-(7.05669)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.17015 + (((tickAnim - 10) / 10) * (9.60854-(21.17015)));
            yy = -73.97501 + (((tickAnim - 10) / 10) * (47.49191-(-73.97501)));
            zz = -16.06413 + (((tickAnim - 10) / 10) * (4.18006-(-16.06413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.4891 + (((tickAnim - 0) / 5) * (4.7266-(2.4891)));
            yy = -27.99911 + (((tickAnim - 0) / 5) * (-21.05902-(-27.99911)));
            zz = 4.50361 + (((tickAnim - 0) / 5) * (8.98353-(4.50361)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.7266 + (((tickAnim - 5) / 5) * (4.97297-(4.7266)));
            yy = -21.05902 + (((tickAnim - 5) / 5) * (-13.99823-(-21.05902)));
            zz = 8.98353 + (((tickAnim - 5) / 5) * (8.99695-(8.98353)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.97297 + (((tickAnim - 10) / 10) * (2.4891-(4.97297)));
            yy = -13.99823 + (((tickAnim - 10) / 10) * (-27.99911-(-13.99823)));
            zz = 8.99695 + (((tickAnim - 10) / 10) * (4.50361-(8.99695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 54.50948 + (((tickAnim - 0) / 5) * (-7.71058-(54.50948)));
            yy = 16.01865 + (((tickAnim - 0) / 5) * (16.07032-(16.01865)));
            zz = -5.93002 + (((tickAnim - 0) / 5) * (5.21798-(-5.93002)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.71058 + (((tickAnim - 5) / 5) * (-2.93064-(-7.71058)));
            yy = 16.07032 + (((tickAnim - 5) / 5) * (16.12198-(16.07032)));
            zz = 5.21798 + (((tickAnim - 5) / 5) * (-4.50594-(5.21798)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.93064 + (((tickAnim - 10) / 5) * (-0.66045-(-2.93064)));
            yy = 16.12198 + (((tickAnim - 10) / 5) * (17.82788-(16.12198)));
            zz = -4.50594 + (((tickAnim - 10) / 5) * (1.57953-(-4.50594)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.66045 + (((tickAnim - 15) / 5) * (54.50948-(-0.66045)));
            yy = 17.82788 + (((tickAnim - 15) / 5) * (16.01865-(17.82788)));
            zz = 1.57953 + (((tickAnim - 15) / 5) * (-5.93002-(1.57953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.12323 + (((tickAnim - 0) / 10) * (0-(-0.12323)));
            yy = 0.45181 + (((tickAnim - 0) / 10) * (0-(0.45181)));
            zz = -0.12769 + (((tickAnim - 0) / 10) * (0-(-0.12769)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.15285-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.16944-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.0219 + (((tickAnim - 15) / 5) * (-0.12323-(-0.0219)));
            yy = -0.15285 + (((tickAnim - 15) / 5) * (0.45181-(-0.15285)));
            zz = -0.16944 + (((tickAnim - 15) / 5) * (-0.12769-(-0.16944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*15), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-190))*10));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-250))*20));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9.75 + (((tickAnim - 0) / 10) * (2.51155-(9.75)));
            yy = -56.25 + (((tickAnim - 0) / 10) * (35.16928-(-56.25)));
            zz = -7.44 + (((tickAnim - 0) / 10) * (-3.36283-(-7.44)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.51155 + (((tickAnim - 10) / 10) * (9.75-(2.51155)));
            yy = 35.16928 + (((tickAnim - 10) / 10) * (-56.25-(35.16928)));
            zz = -3.36283 + (((tickAnim - 10) / 10) * (-7.44-(-3.36283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(xx), upperarmleft.rotateAngleY + (float) Math.toRadians(yy), upperarmleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -71.77429 + (((tickAnim - 0) / 5) * (-81.22832-(-71.77429)));
            yy = -66.37985 + (((tickAnim - 0) / 5) * (-56.95816-(-66.37985)));
            zz = -43.51785 + (((tickAnim - 0) / 5) * (-56.60757-(-43.51785)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -81.22832 + (((tickAnim - 5) / 5) * (-83.75978-(-81.22832)));
            yy = -56.95816 + (((tickAnim - 5) / 5) * (-52.38252-(-56.95816)));
            zz = -56.60757 + (((tickAnim - 5) / 5) * (-39.06098-(-56.60757)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -83.75978 + (((tickAnim - 10) / 10) * (-71.77429-(-83.75978)));
            yy = -52.38252 + (((tickAnim - 10) / 10) * (-66.37985-(-52.38252)));
            zz = -39.06098 + (((tickAnim - 10) / 10) * (-43.51785-(-39.06098)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(xx), lowerarmright.rotateAngleY + (float) Math.toRadians(yy), lowerarmright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 84.91142 + (((tickAnim - 0) / 5) * (72.63868-(84.91142)));
            yy = 12.38585 + (((tickAnim - 0) / 5) * (17.86091-(12.38585)));
            zz = 39.54958 + (((tickAnim - 0) / 5) * (64.29076-(39.54958)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 72.63868 + (((tickAnim - 5) / 5) * (43.26553-(72.63868)));
            yy = 17.86091 + (((tickAnim - 5) / 5) * (7.55568-(17.86091)));
            zz = 64.29076 + (((tickAnim - 5) / 5) * (44.9853-(64.29076)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 43.26553 + (((tickAnim - 10) / 5) * (31.83848-(43.26553)));
            yy = 7.55568 + (((tickAnim - 10) / 5) * (9.97077-(7.55568)));
            zz = 44.9853 + (((tickAnim - 10) / 5) * (42.26744-(44.9853)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 31.83848 + (((tickAnim - 15) / 3) * (42.87495-(31.83848)));
            yy = 9.97077 + (((tickAnim - 15) / 3) * (11.17831-(9.97077)));
            zz = 42.26744 + (((tickAnim - 15) / 3) * (40.90851-(42.26744)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 42.87495 + (((tickAnim - 18) / 2) * (84.91142-(42.87495)));
            yy = 11.17831 + (((tickAnim - 18) / 2) * (12.38585-(11.17831)));
            zz = 40.90851 + (((tickAnim - 18) / 2) * (39.54958-(40.90851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(xx), upperarmleft2.rotateAngleY + (float) Math.toRadians(yy), upperarmleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.06888 + (((tickAnim - 0) / 5) * (-0.14042-(0.06888)));
            yy = 0.00573 + (((tickAnim - 0) / 5) * (-0.28714-(0.00573)));
            zz = 0.06487 + (((tickAnim - 0) / 5) * (0.18252-(0.06487)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.14042 + (((tickAnim - 5) / 5) * (0.00188-(-0.14042)));
            yy = -0.28714 + (((tickAnim - 5) / 5) * (-0.22823-(-0.28714)));
            zz = 0.18252 + (((tickAnim - 5) / 5) * (0.47279-(0.18252)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0.00188 + (((tickAnim - 10) / 5) * (0.0391-(0.00188)));
            yy = -0.22823 + (((tickAnim - 10) / 5) * (-0.12428-(-0.22823)));
            zz = 0.47279 + (((tickAnim - 10) / 5) * (0.31791-(0.47279)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.0391 + (((tickAnim - 15) / 5) * (0.06888-(0.0391)));
            yy = -0.12428 + (((tickAnim - 15) / 5) * (0.00573-(-0.12428)));
            zz = 0.31791 + (((tickAnim - 15) / 5) * (0.06487-(0.31791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmleft2.rotationPointX = this.upperarmleft2.rotationPointX + (float)(xx);
        this.upperarmleft2.rotationPointY = this.upperarmleft2.rotationPointY - (float)(yy);
        this.upperarmleft2.rotationPointZ = this.upperarmleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 21.17015 + (((tickAnim - 0) / 10) * (9.60854-(21.17015)));
            yy = 73.97501 + (((tickAnim - 0) / 10) * (-47.49191-(73.97501)));
            zz = 16.06413 + (((tickAnim - 0) / 10) * (-4.18006-(16.06413)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.60854 + (((tickAnim - 10) / 5) * (13.27943-(9.60854)));
            yy = -47.49191 + (((tickAnim - 10) / 5) * (15.35931-(-47.49191)));
            zz = -4.18006 + (((tickAnim - 10) / 5) * (-7.05669-(-4.18006)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.27943 + (((tickAnim - 15) / 5) * (21.17015-(13.27943)));
            yy = 15.35931 + (((tickAnim - 15) / 5) * (73.97501-(15.35931)));
            zz = -7.05669 + (((tickAnim - 15) / 5) * (16.06413-(-7.05669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.97297 + (((tickAnim - 0) / 10) * (2.4891-(4.97297)));
            yy = 13.99823 + (((tickAnim - 0) / 10) * (27.99911-(13.99823)));
            zz = -8.99695 + (((tickAnim - 0) / 10) * (-4.50361-(-8.99695)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2.4891 + (((tickAnim - 10) / 5) * (4.7266-(2.4891)));
            yy = 27.99911 + (((tickAnim - 10) / 5) * (21.05902-(27.99911)));
            zz = -4.50361 + (((tickAnim - 10) / 5) * (-8.98353-(-4.50361)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.7266 + (((tickAnim - 15) / 5) * (4.97297-(4.7266)));
            yy = 21.05902 + (((tickAnim - 15) / 5) * (13.99823-(21.05902)));
            zz = -8.98353 + (((tickAnim - 15) / 5) * (-8.99695-(-8.98353)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.93064 + (((tickAnim - 0) / 5) * (-0.66045-(-2.93064)));
            yy = -16.12198 + (((tickAnim - 0) / 5) * (-17.82788-(-16.12198)));
            zz = 4.50594 + (((tickAnim - 0) / 5) * (-1.57953-(4.50594)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.66045 + (((tickAnim - 5) / 5) * (54.50948-(-0.66045)));
            yy = -17.82788 + (((tickAnim - 5) / 5) * (-16.01865-(-17.82788)));
            zz = -1.57953 + (((tickAnim - 5) / 5) * (5.93002-(-1.57953)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 54.50948 + (((tickAnim - 10) / 5) * (-7.71058-(54.50948)));
            yy = -16.01865 + (((tickAnim - 10) / 5) * (-16.07032-(-16.01865)));
            zz = 5.93002 + (((tickAnim - 10) / 5) * (5.21798-(5.93002)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.71058 + (((tickAnim - 15) / 5) * (-2.93064-(-7.71058)));
            yy = -16.07032 + (((tickAnim - 15) / 5) * (-16.12198-(-16.07032)));
            zz = 5.21798 + (((tickAnim - 15) / 5) * (4.50594-(5.21798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15285-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.16944-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.0219 + (((tickAnim - 5) / 5) * (-0.12323-(-0.0219)));
            yy = -0.15285 + (((tickAnim - 5) / 5) * (0.45181-(-0.15285)));
            zz = -0.16944 + (((tickAnim - 5) / 5) * (-0.12769-(-0.16944)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.12323 + (((tickAnim - 10) / 10) * (0-(-0.12323)));
            yy = 0.45181 + (((tickAnim - 10) / 10) * (0-(0.45181)));
            zz = -0.12769 + (((tickAnim - 10) / 10) * (0-(-0.12769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);



        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*8), base.rotateAngleZ + (float) Math.toRadians(0));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-180))*2);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrypanognathus entity = (EntityPrehistoricFloraTrypanognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*3), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-230))*5), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+190))*6), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(70), upperarmright.rotateAngleY + (float) Math.toRadians(70-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmright.rotateAngleZ + (float) Math.toRadians(10));
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(0), lowerarmleft.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(0), upperarmright2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(20), upperlegright.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegright.rotateAngleZ + (float) Math.toRadians(-20));
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(0), lowerlegright.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-50))*10), lowerlegright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footright.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*6), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2.5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*12), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60+30))*5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100+60))*15));
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(70.00004), upperarmleft.rotateAngleY + (float) Math.toRadians(-70-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmleft.rotateAngleZ + (float) Math.toRadians(-10.00004));
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(0), lowerarmright.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(0), upperarmleft2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(20), upperlegleft.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(0), lowerlegleft.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), lowerlegleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footleft.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*6), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*2));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


    }

    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrypanognathus entity = (EntityPrehistoricFloraTrypanognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+205))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-230))*10), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+190))*10), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))));
        this.setRotateAngle(upperarmright, upperarmright.rotateAngleX + (float) Math.toRadians(70), upperarmright.rotateAngleY + (float) Math.toRadians(70-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmright.rotateAngleZ + (float) Math.toRadians(10));
        this.setRotateAngle(lowerarmleft, lowerarmleft.rotateAngleX + (float) Math.toRadians(0), lowerarmleft.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmright2, upperarmright2.rotateAngleX + (float) Math.toRadians(0), upperarmright2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(20), upperlegright.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegright.rotateAngleZ + (float) Math.toRadians(-20));
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(0), lowerlegright.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-50))*10), lowerlegright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footright.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*2.5));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60+30))*5));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-100+60))*15));
        this.setRotateAngle(upperarmleft, upperarmleft.rotateAngleX + (float) Math.toRadians(70.00004), upperarmleft.rotateAngleY + (float) Math.toRadians(-70-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*10), upperarmleft.rotateAngleZ + (float) Math.toRadians(-10.00004));
        this.setRotateAngle(lowerarmright, lowerarmright.rotateAngleX + (float) Math.toRadians(0), lowerarmright.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+150))*10), lowerarmright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperarmleft2, upperarmleft2.rotateAngleX + (float) Math.toRadians(0), upperarmleft2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+120))*20), upperarmleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(20), upperlegleft.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(0), lowerlegleft.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-20))*10), lowerlegleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(30-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-80))*20), footleft.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-110))*10), footleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+30))*20), base.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*5));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-220))*1.5);
        this.base.rotationPointY = this.base.rotationPointY - (float)(0);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(0);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTrypanognathus e = (EntityPrehistoricFloraTrypanognathus) entity;
        animator.update(entity);


    }
}
