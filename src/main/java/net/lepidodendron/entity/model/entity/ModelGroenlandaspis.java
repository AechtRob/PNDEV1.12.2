package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGroenlandaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r44;

    public ModelGroenlandaspis() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -6.85F, -0.05F, 6, 5, 5, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 11, -3.5F, -5.85F, -3.65F, 7, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -8.0256F, 2.9488F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4931F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 20, -1.5F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -10.6247F, 3.5395F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4843F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 42, -1.5F, 0.0F, -4.0F, 1, 5, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -8.3742F, -1.036F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6545F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 34, -1.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -8.3742F, -1.036F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 20, -1.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.0778F, -3.0864F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.6842F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 35, -2.5F, 0.0F, 0.0F, 6, 7, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -1.4694F, -6.0608F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.4399F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 7, -0.5F, 0.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -2.3929F, -7.8348F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0908F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 45, -1.5F, 0.0F, 0.0F, 4, 2, 2, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -3.7856F, -7.5892F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6109F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 0, -0.5F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -6.0799F, -4.3126F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6109F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 28, -0.5F, 0.0F, -4.0F, 4, 2, 4, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.35F, -2.15F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6109F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 20, -3.0F, -0.2F, -2.5F, 6, 3, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5289F, -1.6617F, -3.4059F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1F, -0.3565F, -0.104F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 29, -1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.6229F, -4.05F, -6.5189F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6545F, -0.1396F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 51, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.5F, -3.55F, -3.65F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2967F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 48, 50, 0.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.6229F, -3.55F, -6.5189F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.5585F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 11, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.6229F, -3.55F, -6.5189F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5585F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 11, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.6229F, -4.05F, -6.5189F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6545F, 0.1396F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 51, -2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.5289F, -1.6617F, -3.4059F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1F, 0.3565F, 0.104F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 53, 29, -1.0F, -0.5F, -2.5F, 2, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.5F, -3.55F, -3.65F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.2967F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 50, -2.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.24F, -5.7525F);
        this.main.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.3471F, -0.0823F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 45, -1.5F, -0.525F, -2.075F, 3, 1, 2, -0.006F, false));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(2.1767F, -1.4289F, -1.0864F);
        this.main.addChild(leftSpike);
        this.setRotateAngle(leftSpike, 0.0F, 0.0F, 0.1309F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.0F, -3.65F);
        this.leftSpike.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3491F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 42, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.432F, -1.0F, 0.5047F);
        this.leftSpike.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1639F, 0.1446F, 0.854F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 45, 41, -4.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.4557F, -1.0F, 0.7211F);
        this.leftSpike.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1038F, 0.267F, -0.4977F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 52, -2.0F, -4.0F, -1.0F, 2, 4, 2, -0.006F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.6485F, 0.0F, 1.481F);
        this.leftSpike.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0041F, 0.2748F, -0.0042F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 16, -4.0F, -1.0F, -2.0F, 4, 1, 2, 0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.6867F, 0.0F, 0.9382F);
        this.leftSpike.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1745F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 3, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(3.3681F, 0.0F, -1.0099F);
        this.leftSpike.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -1.1781F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 26, 0.0F, -1.0F, 0.0F, 5, 1, 1, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.1931F, -1.0F, -0.4849F);
        this.leftSpike.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.0945F, -0.9596F, -0.2241F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 14, -3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.4397F, 0.0F, -3.308F);
        this.leftSpike.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.8727F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 50, 0.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.3764F, -0.8759F, 1.652F);
        this.leftSpike.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.3491F, 0.5236F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 26, 45, -2.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(-2.1767F, -1.4289F, -1.0864F);
        this.main.addChild(rightSpike);
        this.setRotateAngle(rightSpike, 0.0F, 0.0F, -0.1309F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 0.0F, -3.65F);
        this.rightSpike.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3491F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 42, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.003F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.432F, -1.0F, 0.5047F);
        this.rightSpike.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1639F, -0.1446F, -0.854F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 41, 0.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.4557F, -1.0F, 0.7211F);
        this.rightSpike.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1038F, -0.267F, 0.4977F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 52, 0.0F, -4.0F, -1.0F, 2, 4, 2, -0.006F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.6485F, 0.0F, 1.481F);
        this.rightSpike.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0041F, -0.2748F, 0.0042F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 16, 0.0F, -1.0F, -2.0F, 4, 1, 2, 0.006F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-3.6867F, 0.0F, 0.9382F);
        this.rightSpike.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.1745F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 3, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-3.3681F, 0.0F, -1.0099F);
        this.rightSpike.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 1.1781F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 53, 26, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.003F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.1931F, -1.0F, -0.4849F);
        this.rightSpike.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.0945F, 0.9596F, 0.2241F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 14, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.4397F, 0.0F, -3.308F);
        this.rightSpike.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.8727F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 26, 50, -3.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.3764F, -0.8759F, 1.652F);
        this.rightSpike.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.3491F, -0.5236F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 26, 45, -1.0F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.1188F, 4.3227F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.5F, -1.8062F, 1.2523F);
        this.tail.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.192F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 15, 35, -0.5F, 0.25F, -1.075F, 4, 2, 4, -0.003F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 3.1738F, 0.2156F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1876F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 27, -1.5F, -3.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.95F, 2.4677F, 2.1667F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3073F, 0.2485F, -0.6595F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 55, 6, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.95F, 2.4677F, 2.1667F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3073F, -0.2485F, 0.6595F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 55, 6, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4562F, 3.0023F);
        this.tail.addChild(tail2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.5F, 2.2407F, 3.3699F);
        this.tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.733F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 20, 52, 1.5F, -0.1F, -0.2F, 0, 2, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.0F, 2.9918F, 0.4654F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2531F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 23, 8, -0.5F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.5F, -0.5F, 0.0F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1571F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 39, 50, 2.5F, -3.125F, 1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.tail2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0698F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 23, 0, -0.5F, -0.125F, 0.0F, 3, 2, 5, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 1.4028F, 0.1748F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.1396F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 38, 27, -0.5F, -1.2F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.5F, -1.0F, 0.0F);
        this.tail3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.048F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 40, 0, 0.5F, 0.175F, -0.05F, 2, 1, 5, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.4363F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 44, -0.5F, -0.575F, -0.175F, 1, 1, 5, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.1353F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 32, 35, 0.5F, -0.5F, 0.075F, 0, 3, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.20F;
        this.main.offsetX = -0.05F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.3F, 0.2F, 0.2F);

        this.main.offsetY = -0.05F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
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
        //this.Groenlandaspis.offsetY = 1.0F;

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
            this.walk(jaw, (float) (speed * 0.75), -0.4F, true, 0.20F, 0, f2, 1);
            this.walk(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.Groenlandaspis.offsetY = 1.0F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
