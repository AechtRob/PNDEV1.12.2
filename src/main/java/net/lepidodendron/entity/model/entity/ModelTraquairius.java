package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTraquairius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer BackRightFin;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer BackLeftFin;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer FrontRightFin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer FrontLeftFin;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer BackFin;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer spines;
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
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;

    public ModelTraquairius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 18.0F, -6.0F);
        this.Head.cubeList.add(new ModelBox(Head, 38, 29, -1.5F, -1.3F, -7.0F, 3, 1, 2, -0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 30, 23, -1.5F, -0.8F, -6.0F, 3, 2, 4, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 30, 29, -1.8F, -0.9F, -2.5F, 1, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 4, 3, 0.8F, -0.9F, -2.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.9F, -1.0F, -2.2F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 14, -2.8F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 2.7F, -0.8F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2094F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 9, -1.0F, -1.0F, -2.0F, 3, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.85F, 1.6F, -1.7F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.165F, -0.5267F, -0.794F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 35, 0.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.35F, 1.0F, -1.6F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3439F, -0.4376F, -1.1756F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, 0.0266F, -0.1463F, -0.5301F, 3, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.4F, 1.0F, -1.6F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3439F, 0.4376F, 1.1756F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 39, -3.0266F, -0.1463F, -0.5301F, 3, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.9F, 1.6F, -1.7F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.165F, 0.5267F, 0.794F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 38, -2.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.3F, -6.5F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1257F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 0, -1.0F, -1.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.3F, -2.9F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 5, -1.0F, -2.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, -1.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 0, -1.0F, -2.0F, -2.0F, 3, 4, 3, 0.004F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.4F, -0.4F);
        this.Head.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.0F, -2.5F, 0.0F, 4, 5, 8, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 20, 23, 0.0F, -9.1F, 1.3F, 0, 7, 5, 0.0F, false));

        this.BackRightFin = new AdvancedModelRenderer(this);
        this.BackRightFin.setRotationPoint(-1.1F, 1.6F, 7.6F);
        this.Body.addChild(BackRightFin);
        this.setRotateAngle(BackRightFin, -0.3204F, -1.0843F, 0.2882F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.973F, -1.6332F, 0.8978F);
        this.BackRightFin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4189F, 0.8363F, 0.0236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 15, 1.0F, 0.0F, -1.0F, 0, 1, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.973F, 0.3668F, 0.8978F);
        this.BackRightFin.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.829F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 19, 1.0F, -1.0F, -1.0F, 0, 2, 7, 0.0F, false));

        this.BackLeftFin = new AdvancedModelRenderer(this);
        this.BackLeftFin.setRotationPoint(1.1F, 1.6F, 7.6F);
        this.Body.addChild(BackLeftFin);
        this.setRotateAngle(BackLeftFin, -0.3204F, 1.0843F, -0.2882F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.973F, -1.6332F, 0.8978F);
        this.BackLeftFin.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4189F, -0.8363F, -0.0236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 15, -1.0F, 0.0F, -1.0F, 0, 1, 7, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.973F, 0.3668F, 0.8978F);
        this.BackLeftFin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, -0.829F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 19, -1.0F, -1.0F, -1.0F, 0, 2, 7, 0.0F, true));

        this.FrontRightFin = new AdvancedModelRenderer(this);
        this.FrontRightFin.setRotationPoint(-1.5F, 1.9F, 0.7F);
        this.Body.addChild(FrontRightFin);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2F, -1.4F, 0.5F);
        this.FrontRightFin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3069F, -0.8992F, 0.0876F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 3, -0.2685F, -1.2478F, -0.0903F, 0, 5, 10, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2F, -0.7F, 1.1F);
        this.FrontRightFin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3069F, -0.8992F, 0.0876F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 14, -1.2685F, -0.2478F, -0.0903F, 1, 2, 4, 0.0F, false));

        this.FrontLeftFin = new AdvancedModelRenderer(this);
        this.FrontLeftFin.setRotationPoint(1.7F, 2.0F, 0.9F);
        this.Body.addChild(FrontLeftFin);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.5F, 0.3F);
        this.FrontLeftFin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3069F, 0.8992F, -0.0876F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, 0.2685F, -1.2478F, -0.0903F, 0, 5, 10, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, -0.8F, 0.9F);
        this.FrontLeftFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3069F, 0.8992F, -0.0876F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 35, 0.2685F, -0.2478F, -0.0903F, 1, 2, 4, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(-0.1F, -0.2F, 7.9F);
        this.Body.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 12, 15, -1.4F, -1.4F, -1.4F, 3, 3, 8, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 20, 5, -1.4F, 1.4F, -1.4F, 3, 1, 8, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, -1.4F, 1.7F);
        this.Tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, -1.0F, -3.0F, -2.0F, 0, 3, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4F, -0.3F, 0.5F);
        this.Tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0698F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 26, -1.0F, -2.0F, -1.0F, 3, 1, 7, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.2F, 5.8F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 30, 29, -0.9F, -0.6F, 0.3F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.9F, 1.9F, 1.1F);
        this.Tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6109F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.9F, -0.6F, 4.0F);
        this.Tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2433F, 0.0079F, 0.0105F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 0, 0.0F, -0.0211F, -3.9036F, 2, 1, 4, 0.0F, false));

        this.BackFin = new AdvancedModelRenderer(this);
        this.BackFin.setRotationPoint(0.0F, 1.9F, 0.7F);
        this.Tail2.addChild(BackFin);


        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.4F, 4.2F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 26, 14, -0.4F, -1.0F, -1.0F, 1, 2, 6, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 29, 0.3F, -4.8F, 0.0F, 0, 5, 5, 0.0F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 10, 29, 0.3F, 0.2F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.1F, -0.2F, 4.2F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 26, 35, -0.5F, -0.4F, -0.2F, 1, 1, 4, -0.01F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 24, 8, 0.2F, -3.1F, 0.8F, 0, 3, 2, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 24, 5, 0.2F, -0.1F, 0.8F, 0, 3, 2, 0.0F, false));

        this.spines = new AdvancedModelRenderer(this);
        this.spines.setRotationPoint(1.1F, -0.8F, -6.0F);
        this.Head.addChild(spines);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9F, -0.4F, 1.6F);
        this.spines.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6291F, 0.2389F, 0.5811F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 6, 6, 0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.3F, -0.2F, 1.2F);
        this.spines.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.8385F, 0.2389F, 0.5811F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 13, 0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.6F, -0.2F, 2.5F);
        this.spines.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0701F, 0.2809F, 0.6105F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 26, 13, 0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.9F, -0.9F, 3.5F);
        this.spines.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4996F, 0.277F, 0.3718F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 4, 25, 0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.9F, -0.6F, 2.5F);
        this.spines.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0241F, 0.2883F, 0.447F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 16, 0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.1F, -0.4F, 2.5F);
        this.spines.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3712F, 0.2821F, 0.5923F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 27, 0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.1F, -0.7F, 2.9F);
        this.spines.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4338F, 0.1651F, 0.3125F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 27, 25, 0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.1F, -0.1F, 1.6F);
        this.spines.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.6291F, 0.2389F, 0.5811F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 13, 0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spines.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.6291F, 0.2389F, 0.5811F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 2, 0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.6F, 0.0F, 0.0F);
        this.spines.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4688F, -0.4937F, -0.1432F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 0, -0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.3F, -0.4F, 1.6F);
        this.spines.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.6291F, -0.2389F, -0.5811F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 6, 0, -0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.2F, 0.0F, 0.0F);
        this.spines.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.6291F, -0.2389F, -0.5811F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 13, -0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.1F, -0.1F, 1.6F);
        this.spines.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.6291F, -0.2389F, -0.5811F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 0, -0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.1F, -0.7F, 2.9F);
        this.spines.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4338F, -0.1651F, -0.3125F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 17, 27, -0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-2.1F, -0.4F, 2.5F);
        this.spines.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3712F, -0.2821F, -0.5923F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 25, -0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.3F, -0.6F, 2.5F);
        this.spines.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0241F, -0.2883F, -0.447F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 0, -0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.3F, -0.9F, 3.5F);
        this.spines.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.4996F, -0.277F, -0.3718F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 6, 4, -0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.6F, -0.2F, 2.5F);
        this.spines.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0701F, -0.2809F, -0.6105F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 2, -0.0219F, -2.0F, -0.2079F, 0, 2, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.9F, -0.2F, 1.2F);
        this.spines.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.8385F, -0.2389F, -0.5811F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 22, 6, -0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.6F, 0.0F, 0.0F);
        this.spines.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4688F, 0.4937F, 0.1432F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 0, 0.0219F, -1.0F, -0.2079F, 0, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.1F, -2.6F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0087F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 32, 35, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0F, 0.3F, -2.4F);
        this.Jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0017F, -0.6696F, -0.0092F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 26, 17, -0.0393F, -1.2994F, 0.3624F, 1, 1, 2, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, 0.3F, -2.4F);
        this.Jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0017F, 0.6696F, 0.0092F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 26, 17, -0.9607F, -1.2994F, 0.3624F, 1, 1, 2, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.3F, -0.4F, -1.2F);
        this.Jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.3491F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 3, -1.55F, -2.9066F, -0.9642F, 1, 3, 2, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 26, 0.0F, -2.9066F, -0.9642F, 1, 3, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Head.render(f5 * 0.23F);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Head.offsetY = 0.0F;
        this.Head.offsetX = 0.35F;
        this.Head.offsetZ = 2.0F;
        this.Head.rotateAngleY = (float)Math.toRadians(120);
        this.Head.rotateAngleX = (float)Math.toRadians(0);
        this.Head.rotateAngleZ = (float)Math.toRadians(0);
        this.Head.scaleChildren = true;
        float scaler = 0.6F;
        this.Head.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Head, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.2F, 0.0F);
        //End of pose, now render the model:
        this.Head.render(f);
        //Reset rotations, positions and sizing:
        this.Head.setScale(1.0F, 1.0F, 1.0F);
        this.Head.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Head.rotateAngleY = (float) Math.toRadians(90);
        this.Head.offsetY = -0.25F;
        this.Head.offsetX = -0.15F;
        this.Head.offsetZ = -0.4F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, -0.2F, 0.0F);
        this.Head.offsetY = -0.0F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.Head.offsetY = 1.1F;
        this.Head.offsetZ = -0.15F;

        AdvancedModelRenderer[] fishTail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};

        float speed = 0.245F;
        if (!e.isInWater()) {
            speed = 0.421F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed * 1.5F, 0.32F, -0.75, f2, 0.6F);

        }

        this.flap(FrontLeftFin, (float) (speed * 0.65), 0.3F, false, 0.8F, 0, f2, 0.78F);
        this.swing(FrontLeftFin, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.78F);
        this.flap(FrontRightFin, (float) (speed * 0.65), -0.3F, false, 0.8F, 0, f2, 0.78F);
        this.swing(FrontRightFin, (float) (speed * 0.65), -0.2F, true, 0, 0, f2, 0.78F);

        this.flap(BackLeftFin, (float) (speed * 0.65), 0.3F, false, 1.8F, 0, f2, 0.78F);
        this.swing(BackLeftFin, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.78F);
        this.flap(BackRightFin, (float) (speed * 0.65), -0.3F, false, 1.8F, 0, f2, 0.78F);
        this.swing(BackRightFin, (float) (speed * 0.65), -0.2F, true, 1, 0, f2, 0.78F);


        if (!e.isInWater()) {
            this.Head.rotateAngleZ = (float) Math.toRadians(90);
            this.Head.offsetY = 1.2F;
            this.bob(Head, -speed * 1.95F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.1F, 0.02F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, speed * 2.1F, 0.2F, -0.55, f2, 0.4F);

        }

    }

}

