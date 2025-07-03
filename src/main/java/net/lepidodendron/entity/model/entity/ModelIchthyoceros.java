package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIchthyoceros extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
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
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelIchthyoceros() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -9.0F, -0.1F, 3, 6, 5, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 40, -1.0F, -7.0F, 4.9F, 2, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -11.0787F, 3.6383F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.0036F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 40, -0.5F, 0.0F, 3.0F, 2, 2, 2, -0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 25, 0.475F, -1.3F, -0.625F, 0, 2, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 6, -1.0F, 0.0F, 0.0F, 3, 2, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -11.0787F, 3.6383F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 46, 1.5F, -1.475F, -2.0F, 0, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 0, 0.0F, 0.0F, -3.0F, 3, 2, 3, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -1.4222F, -1.5054F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 26, -0.5F, -4.0F, -3.0F, 3, 4, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.4886F, 6.8675F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.1345F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 42, 0.0F, -1.6F, -1.9F, 0, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -1.4211F, 5.4148F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.2217F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 34, 0.5F, -2.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.425F, -5.1251F, 3.5354F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6171F, -0.4642F, -0.0793F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.425F, -6.6751F, 3.7854F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6171F, -0.4642F, -0.0793F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.425F, -6.3001F, 2.2604F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6171F, -0.4642F, -0.0793F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.425F, -7.5751F, 1.5104F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6171F, -0.4642F, -0.0793F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.425F, -7.5751F, 1.5104F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6171F, 0.4642F, 0.0793F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.425F, -6.6751F, 3.7854F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6171F, 0.4642F, 0.0793F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.425F, -6.3001F, 2.2604F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6171F, 0.4642F, 0.0793F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.425F, -5.1251F, 3.5354F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6171F, 0.4642F, 0.0793F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 50, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -0.9001F, 2.4604F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 12, -0.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.15F, -2.1686F, -0.8886F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3992F, -0.4127F, -0.0113F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 34, 0.0F, -0.5F, 1.0F, 1, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.15F, -2.1686F, -0.8886F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3992F, 0.4127F, 0.0113F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 34, -1.0F, -0.5F, 1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -2.883F, 2.7214F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 20, -0.5F, 0.0F, -4.0F, 3, 2, 4, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.5073F, -3.6137F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 2.2646F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 18, -1.5F, 0.0F, 0.0F, 3, 3, 4, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -8.6307F, -4.0914F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 2.9671F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 32, -1.5F, -1.25F, -0.35F, 3, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -3.5327F, -6.9215F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 2.0944F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 29, 45, -0.5F, 1.0F, 0.975F, 2, 2, 1, -0.003F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 41, -0.5F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -7.5024F, 0.808F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 17, 0, -1.5F, 0.0F, -3.0F, 4, 5, 3, 0.006F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -4.3438F, -8.0799F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.7453F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 45, 15, -0.5F, 0.0F, -1.0F, 2, 1, 1, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -9.4042F, -4.8562F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.0036F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 34, -0.5F, -0.1F, -6.0F, 0, 1, 5, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 12, -1.5F, 0.0F, -6.0F, 2, 1, 6, 0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.3F, -11.3325F, -2.558F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6981F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 46, -4.5F, 0.75F, -1.5F, 1, 1, 1, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 21, 46, -1.1F, 0.75F, -1.5F, 1, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 9, -4.3F, 0.0F, -3.0F, 4, 5, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, -10.5265F, 0.8169F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.1781F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 26, -0.5F, -2.0F, -2.0F, 3, 5, 2, -0.006F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -13.5768F, -0.1013F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 40, -0.5F, 0.0F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -11.6694F, -0.7027F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.2654F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 5, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -11.8325F, -1.692F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.829F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 48, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0F, -11.8325F, -1.692F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3054F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 27, -0.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -10.5F, -1.5F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 18, -1.5F, -1.25F, -0.5F, 4, 5, 1, 0.003F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.975F, -11.1561F, -3.9721F);
        this.main.addChild(bone);
        this.setRotateAngle(bone, -0.034F, -0.1489F, 0.2251F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0916F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 45, -0.5F, -0.45F, 0.65F, 1, 1, 2, 0.003F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 47, -0.5F, -1.45F, 0.9F, 1, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.0632F, 0.9636F);
        this.bone.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.0036F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 43, 45, -0.5F, -4.0F, -0.75F, 1, 4, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.4306F, -0.451F);
        this.bone.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 1.2654F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 40, -0.5F, -1.0F, 0.3F, 1, 1, 1, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 42, 36, -0.5F, -0.025F, -0.5F, 1, 1, 2, 0.006F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-0.975F, -11.1561F, -3.9721F);
        this.main.addChild(bone2);
        this.setRotateAngle(bone2, -0.034F, 0.1489F, -0.2251F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0916F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 36, 45, -0.5F, -0.45F, 0.65F, 1, 1, 2, 0.003F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 47, -0.5F, -1.45F, 0.9F, 1, 1, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.0632F, 0.9636F);
        this.bone2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.0036F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 43, 45, -0.5F, -4.0F, -0.75F, 1, 4, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.4306F, -0.451F);
        this.bone2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.2654F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 47, 40, -0.5F, -1.0F, 0.3F, 1, 1, 1, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 42, 36, -0.5F, -0.025F, -0.5F, 1, 1, 2, 0.006F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -1.4001F, 3.9604F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4733F, 0.233F, -0.4235F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 16, 41, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -1.4001F, 3.9604F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4733F, -0.233F, 0.4235F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 16, 41, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.8496F, -4.6224F);
        this.main.addChild(jaw);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 2.183F, -1.799F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.7453F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 45, 0, -0.5F, 0.0F, 0.0F, 2, 3, 1, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 1.317F, -2.299F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 2.0944F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 43, 18, -0.5F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.5F, 6.4F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 45, 10, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 33, 0.0F, -2.0F, 0.0F, 0, 4, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.25F;
        this.main.offsetX = 1.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 5.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);

            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                //this.body.offsetY = -0.10F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
