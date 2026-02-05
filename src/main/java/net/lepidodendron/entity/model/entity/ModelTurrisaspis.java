package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTurrisaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r45;

    public ModelTurrisaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.5F, -4.85F, -3.65F, 7, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.8702F, 3.8686F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.6842F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -2.5F, -7.0F, 0.0F, 6, 5, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -0.4694F, -6.0608F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4399F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 32, -0.5F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.3929F, -7.8348F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0908F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 29, -1.5F, 0.0F, 0.0F, 4, 2, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.7856F, -7.5892F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 50, -0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.7856F, -7.5892F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 25, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.5039F, -0.108F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.4835F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 26, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -10.4782F, -0.4995F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.7017F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 52, -0.5F, -1.35F, -2.0F, 1, 1, 1, -0.006F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 26, 0.0F, -0.75F, -2.45F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 29, 0.0F, -0.75F, -1.2F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 50, -0.5F, -1.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -7.273F, -0.3297F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.5272F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 51, 0.5F, -0.6F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -9.166F, -2.31F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0908F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 51, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -5.4072F, -3.6781F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.2217F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 34, -0.5F, 0.0F, 0.0F, 1, 2, 4, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -7.0674F, -0.8701F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 23, -2.0F, 0.0F, 0.0F, 5, 3, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.9299F, -1.1083F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 9, -3.0F, 0.0F, -3.725F, 6, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.6229F, -2.55F, -6.5189F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5585F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 44, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.6229F, -2.55F, -6.5189F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5585F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 44, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.5289F, -0.6617F, -3.4059F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1549F, -0.3118F, -0.0533F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 47, -0.975F, -0.4F, -2.45F, 2, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.5F, -2.55F, -3.65F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.2967F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 43, 41, 0.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.6229F, -3.05F, -6.5189F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6545F, -0.1396F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 44, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.6229F, -3.05F, -6.5189F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6545F, 0.1396F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 44, -2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.5289F, -0.6617F, -3.4059F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1549F, 0.3118F, 0.0533F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 47, -1.025F, -0.4F, -2.45F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.5F, -2.55F, -3.65F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2967F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 41, -2.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.35F, 0.825F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 26, -2.5F, -5.625F, -1.45F, 5, 5, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.24F, -5.7525F);
        this.main.addChild(jaw);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.3471F, -0.0823F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 13, -1.5F, -0.525F, -2.075F, 3, 1, 2, -0.006F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(2.6063F, -4.3565F, -0.563F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0404F, -0.0151F, 0.1181F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.432F, 3.0F, 0.5297F);
        this.leftSpike.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1747F, 0.1314F, 0.9322F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 49, 13, -4.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.4557F, 3.0F, 0.7461F);
        this.leftSpike.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1125F, 0.267F, -0.4977F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 50, -2.0F, -4.0F, -1.025F, 2, 4, 1, -0.006F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.3604F, 4.0053F, 0.5234F);
        this.leftSpike.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0054F, 0.2923F, 0.0004F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 48, 47, -4.0F, -1.0F, -1.05F, 4, 1, 1, 0.006F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.6868F, 4.0F, 0.3382F);
        this.leftSpike.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.1745F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 29, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.3681F, 4.0F, -1.0098F);
        this.leftSpike.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -1.1781F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 9, 48, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.1931F, 3.0F, -0.4599F);
        this.leftSpike.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.0515F, -0.943F, -0.1713F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 17, -3.0F, 0.0F, 0.0F, 3, 1, 4, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.368F, 4.0F, -1.0098F);
        this.leftSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.026F, -0.8724F, 0.0339F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 8, -4.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.3764F, 3.1241F, 0.652F);
        this.leftSpike.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1745F, 0.5236F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 39, -2.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-2.6063F, -4.3565F, -0.563F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0404F, 0.0151F, -0.1181F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.432F, 3.0F, 0.5297F);
        this.rightSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1747F, -0.1314F, -0.9322F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 49, 13, 0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.4557F, 3.0F, 0.7461F);
        this.rightSpike.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1125F, -0.267F, 0.4977F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 29, 50, 0.0F, -4.0F, -1.025F, 2, 4, 1, -0.006F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.3604F, 4.0053F, 0.5234F);
        this.rightSpike.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0054F, -0.2923F, -0.0004F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 47, 0.0F, -1.0F, -1.05F, 4, 1, 1, 0.006F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.6868F, 4.0F, 0.3382F);
        this.rightSpike.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.1745F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 29, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.3681F, 4.0F, -1.0098F);
        this.rightSpike.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.1781F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 48, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.003F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.1931F, 3.0F, -0.4599F);
        this.rightSpike.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.0515F, 0.943F, 0.1713F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 17, 0.0F, 0.0F, 0.0F, 3, 1, 4, -0.003F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.368F, 4.0F, -1.0098F);
        this.rightSpike.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.026F, 0.8724F, -0.0339F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 8, 0.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.3764F, 3.1241F, 0.652F);
        this.rightSpike.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1745F, -0.5236F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 39, -1.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.1623F, 0.3246F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -1.0027F, 4.5759F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2225F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 17, -2.0F, 0.0F, -5.0F, 4, 3, 5, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 2.4277F, 4.6454F);
        this.tail.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2836F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 23, 0, -1.5F, -3.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.95F, 2.1807F, 3.3596F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3073F, 0.2485F, -0.6595F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 51, 16, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.95F, 2.1807F, 3.3596F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3073F, -0.2485F, 0.6595F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 51, 16, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5437F, 3.7524F);
        this.tail.addChild(tail2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.5F, 1.2407F, 3.1198F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.733F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 51, 21, 1.5F, -0.1F, -0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, 1.9918F, 0.2154F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2531F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 19, 17, -0.5F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -1.4186F, 0.7441F);
        this.tail2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2007F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 47, 0.0F, -3.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0F, -1.5F, -0.25F);
        this.tail2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0698F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 21, 9, -0.5F, -0.125F, 0.0F, 3, 2, 5, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 4.25F);
        this.tail2.addChild(tail3);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 1.4028F, 0.1748F);
        this.tail3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1396F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 13, 42, -0.5F, -1.2F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-1.5F, -1.0F, 0.0F);
        this.tail3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.048F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 41, 0.5F, 0.175F, -0.05F, 2, 1, 4, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.275F, 3.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4363F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 0, -0.5F, -0.575F, -0.175F, 1, 1, 5, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1353F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 15, 32, 0.5F, -0.5F, 0.075F, 0, 3, 6, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5 * 0.14F);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = 0.03F;
        this.main.offsetX = -0.15F;
        this.main.offsetZ = -0.55F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetZ = -0.08F;
        this.main.offsetX = -0.015F;
        this.main.offsetY = 0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 1.55F;
        this.main.offsetX = 0.25F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.main.offsetY = 1.3F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] fishfinL = {this.frontLeftFin};
        AdvancedModelRenderer[] fishfinR = {this.frontRightFin};

        float speed = 0.3F;
        float taildegree = 0.22F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.09F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.33, f2, 1);
            this.chainSwing(fishfinL, speed, -0.15F, -3, f2, 1);
            this.chainWave(fishfinL, speed, 0.15F, -3, f2, 1);
            this.chainSwing(fishfinR, speed, 0.15F, -3, f2, 1);
            this.chainWave(fishfinR, speed, 0.15F, -3, f2, 1);
            this.swing(main, speed, 0.22F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.5), (float)Math.toRadians(5), true, 0.20F, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 1.3F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
