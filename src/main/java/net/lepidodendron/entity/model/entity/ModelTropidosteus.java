package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelTropidosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer frontRightFin;

    public ModelTropidosteus() {
        this.textureWidth = 102;
        this.textureHeight = 102;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.6F, -13.2F);
        this.main.cubeList.add(new ModelBox(main, 40, 81, -2.5F, -4.2F, -5.8F, 5, 2, 2, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 69, 33, -3.0F, -0.5329F, 2.7224F, 6, 2, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.2F, -2.1129F, -8.8047F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2836F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 33, 0.025F, -0.9F, -0.4F, 0, 1, 2, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 33, 2.375F, -0.9F, -0.4F, 0, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -2.3097F, -9.3041F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1091F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 47, -2.2F, -0.75F, -0.525F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 47, 0.2F, -0.75F, -0.525F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.4523F, -3.8795F, -8.2462F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3537F, -0.5421F, 0.6932F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 8, -0.45F, -0.475F, 0.45F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.0998F, -0.0857F, -3.28F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.307F, -0.599F, 0.1314F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 61, 80, 0.0F, -4.0F, -4.0F, 3, 4, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.9437F, -0.4F, 3.5466F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0031F, 0.318F, -0.0452F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 22, 0.025F, -2.1F, -0.075F, 3, 3, 11, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-6.9338F, -2.5623F, 3.6976F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0459F, 0.3406F, 0.1044F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 50, 0.1F, -5.7F, 0.2F, 3, 6, 7, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.8311F, -3.6998F, -2.1312F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1781F, -0.3927F, 0.1123F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 63, -0.5F, -5.2F, -0.325F, 3, 5, 7, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-5.0998F, -0.0857F, -3.28F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1444F, -0.4302F, 0.037F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 0, 0.0F, -4.0F, 0.0F, 6, 4, 7, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 1.4671F, 7.3724F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 23, -1.5F, -2.0F, 0.0F, 5, 2, 7, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.8361F, -2.2376F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1265F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 0, -2.5F, -2.0F, 0.0F, 7, 2, 5, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -0.7521F, -6.6611F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3447F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 73, -1.5F, -2.0F, -0.275F, 5, 2, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -2.2097F, -9.3041F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.24F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 47, -0.5F, -1.15F, -0.725F, 3, 1, 1, 0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.29F, -9.0013F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3316F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 81, -2.0F, -1.0F, -0.2F, 4, 1, 3, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -2.3807F, -8.8342F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 86, -0.5F, -1.55F, -1.05F, 3, 1, 3, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.4523F, -3.8795F, -8.2462F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3537F, 0.5421F, -0.6932F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 8, -0.55F, -0.475F, 0.45F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -4.4023F, -8.1026F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8378F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 86, -1.5F, 0.575F, -1.125F, 4, 2, 2, 0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.5924F, -9.9116F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6065F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 83, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -10.1733F, 11.9568F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5061F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 75, 8, -3.5F, 0.0F, 0.0F, 6, 3, 4, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -11.8774F, 6.2039F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.288F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 12, -3.5F, 0.0F, 0.0F, 6, 4, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -11.2862F, 2.2478F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 64, -3.5F, 0.0F, 0.0F, 7, 4, 4, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -9.5327F, -1.3473F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4538F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 63, -3.5F, 0.0F, 0.0F, 7, 4, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -10.9751F, 12.0902F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -2.2951F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 88, -0.5F, -4.0F, 0.0F, 2, 4, 1, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -12.2774F, 8.3081F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.9024F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 88, -0.5F, -4.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -12.4867F, 5.3154F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.6406F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 88, 62, -0.5F, -3.0F, 0.0F, 2, 3, 1, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -11.8954F, 1.3593F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.4224F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 83, 86, -0.5F, -4.0F, 0.0F, 2, 4, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.5F, -9.5443F, -1.8767F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.9425F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 88, 50, -3.5F, -4.0F, 0.0F, 2, 4, 1, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, -12.9064F, 9.038F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -2.186F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 61, 73, -3.5F, -3.0F, 0.0F, 1, 3, 1, 0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.0F, -13.876F, 7.2887F);
        this.main.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -2.0769F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 88, 67, -3.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.0F, -14.3453F, 4.3257F);
        this.main.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.7279F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 86, -3.5F, -3.0F, 0.0F, 1, 3, 2, 0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.0F, -13.4115F, 0.4362F);
        this.main.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.3352F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 41, 86, -3.5F, -4.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.0F, -11.544F, -1.9116F);
        this.main.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.8988F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 88, 56, -3.5F, -3.0F, 0.0F, 1, 3, 2, 0.003F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.0F, -9.5443F, -1.8767F);
        this.main.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.5533F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 86, -3.5F, -1.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -8.1634F, -2.1988F);
        this.main.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.8901F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 16, -3.5F, -0.2F, -1.4F, 7, 3, 3, 0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -8.1634F, -2.1988F);
        this.main.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4974F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 67, 72, -2.5F, 0.0F, -4.3F, 6, 3, 4, 0.003F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 80, -2.0F, 0.0F, -6.0F, 5, 3, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, -0.2F, -0.7F);
        this.main.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0524F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 50, -2.5F, -7.325F, 10.95F, 7, 8, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(5.0998F, -0.0857F, -3.28F);
        this.main.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.307F, 0.599F, -0.1314F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 61, 80, -3.0F, -4.0F, -4.0F, 3, 4, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(6.9437F, -0.4F, 3.5466F);
        this.main.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0031F, -0.318F, 0.0452F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 21, 22, -3.025F, -2.1F, -0.075F, 3, 3, 11, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(6.9338F, -2.5623F, 3.6976F);
        this.main.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0459F, -0.3406F, -0.1044F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 46, 50, -3.1F, -5.7F, 0.2F, 3, 6, 7, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(3.8311F, -3.6998F, -2.1312F);
        this.main.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1781F, 0.3927F, -0.1123F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 63, -2.5F, -5.2F, -0.325F, 3, 5, 7, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(5.0998F, -0.0857F, -3.28F);
        this.main.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1444F, 0.4302F, -0.037F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 31, 0, -6.0F, -4.0F, 0.0F, 6, 4, 7, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, -4.2F, -3.8F);
        this.main.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1309F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 69, 41, -3.0F, -1.575F, -2.225F, 6, 4, 4, 0.01F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(7.207F, -1.2594F, 3.4729F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.6142F, -0.0777F, -1.4757F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 22, -0.5955F, -0.1767F, 0.005F, 0, 14, 10, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.05F, -2.2429F, -6.5061F);
        this.main.addChild(jaw);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.55F, 0.4051F, -3.4308F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.384F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 50, 33, -2.6F, -1.225F, 0.025F, 0, 1, 2, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 50, 33, -0.4F, -1.225F, 0.025F, 0, 1, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.45F, 0.2832F, -3.298F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.24F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 60, 33, -0.5F, -0.8F, 0.0F, 2, 1, 0, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 47, -1.0F, -0.6F, -0.275F, 3, 1, 1, -0.01F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 83, 0, -1.5F, -0.6F, 0.7F, 4, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.9643F, 13.5422F);
        this.main.addChild(tail);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-2.0F, -2.547F, 7.1822F);
        this.tail.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.2836F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 21, 37, -0.5F, -0.075F, -7.125F, 5, 5, 7, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-1.5F, 3.2948F, 5.8111F);
        this.tail.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.1309F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 67, 50, -0.5F, -3.4F, -5.825F, 4, 4, 6, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.0F, 2.9643F, 1.6578F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0178F, -0.3487F, 0.1337F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 76, 0.0751F, 0.595F, -0.0168F, 6, 0, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.9857F, 5.6578F);
        this.tail.addChild(tail2);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 5.1201F, 6.6313F);
        this.tail2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 21, 72, -1.0F, -3.0F, -7.0F, 3, 4, 6, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 0.6F, 0.0F);
        this.tail2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 67, 61, -1.5F, -0.075F, 0.0F, 4, 4, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.8464F, 4.951F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 12, -1.5F, -0.7113F, 0.0224F, 3, 3, 6, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 4.2685F, 0.171F);
        this.tail3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1309F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 75, 23, -0.5F, -2.975F, 0.025F, 2, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2217F, 4.9106F);
        this.tail3.addChild(tail4);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, 3.8675F, 1.0686F);
        this.tail4.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.3011F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 8, 0.5F, -3.35F, -0.1F, 0, 6, 16, -0.003F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 3.8675F, 1.0686F);
        this.tail4.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3883F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 23, 50, -0.5F, -2.35F, -0.1F, 1, 2, 10, -0.003F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-2.0F, -0.4146F, 1.1118F);
        this.tail4.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.2182F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 46, 37, 1.5F, -0.075F, -1.35F, 1, 2, 10, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.0F, 2.9643F, 1.6578F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0178F, 0.3487F, -0.1337F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 76, -6.0751F, 0.595F, -0.0168F, 6, 0, 4, 0.0F, true));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-7.207F, -1.2594F, 3.4729F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.6142F, 0.0777F, 1.4757F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 22, 0.5955F, -0.1767F, 0.005F, 0, 14, 10, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }
}
