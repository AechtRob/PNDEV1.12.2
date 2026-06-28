package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSquatina;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSquatina extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    public ModelSquatina() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 1.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 8, -4.0F, -2.0F, -9.0F, 8, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 25, -3.5F, -2.0F, -4.0F, 7, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 24, 47, -2.5F, -1.3F, -10.8F, 5, 1, 2, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 0, -3.0F, -2.3309F, -6.0029F, 6, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 51, 51, -0.5F, -1.0F, -13.075F, 1, 1, 2, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.7452F, -0.5F, -12.7379F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.612F, -0.1889F, -0.1497F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 54, 0.0F, -0.3F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.3886F, -0.05F, -12.5341F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2914F, 0.5852F, 0.2306F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 6, -0.5F, -0.5F, -0.25F, 1, 1, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.3886F, -0.05F, -12.5341F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2914F, -0.5852F, -0.2306F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 6, -0.5F, -0.5F, -0.25F, 1, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.3512F, -0.475F, -7.5255F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 33, -0.625F, -0.5F, -0.05F, 2, 1, 6, -0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, -0.475F, -9.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.829F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 51, -2.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.3512F, -0.475F, -7.5255F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -1.375F, -0.5F, -0.05F, 2, 1, 6, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7452F, -0.5F, -12.7379F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.612F, 0.1889F, 0.1497F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 54, 0.0F, -0.3F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.4784F, -0.1386F, -12.4475F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.27F, 1.1708F, 0.1521F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 6, -2.05F, -0.6F, 0.0F, 2, 1, 0, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.4784F, -0.1386F, -12.4475F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.27F, -1.1708F, -0.1521F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 6, 0.05F, -0.6F, 0.0F, 2, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0088F, -0.5F, -12.793F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 43, -0.25F, -0.5F, -0.15F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0088F, -0.5F, -12.793F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 43, -0.75F, -0.5F, -0.15F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-4.1689F, -0.5F, -8.8157F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 1.2217F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 51, -0.75F, -0.5F, 0.0F, 2, 1, 2, 0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.7414F, -0.5F, -9.9903F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.9163F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 16, 0.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.9151F, -0.5F, -12.3704F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 33, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.003F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.9151F, -0.5F, -12.3704F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 33, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.7414F, -0.5F, -9.9903F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.9163F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 16, -3.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.1689F, -0.5F, -8.8157F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -1.2217F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 33, 51, -1.25F, -0.5F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.0F, -0.475F, -9.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.829F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 51, 0.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -1.6791F, -11.9544F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5018F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 47, -1.0F, 0.0F, -1.325F, 1, 1, 1, -0.003F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 54, -1.5F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.3309F, -2.0029F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 30, -3.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.7659F, -7.4796F);
        this.main.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 38, -3.0F, -0.5F, -1.5F, 6, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.575F, -1.3485F, -11.3752F);
        this.main.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0052F, -0.716F, 0.1962F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 55, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.575F, -1.3485F, -11.3752F);
        this.main.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0052F, 0.716F, -0.1962F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 55, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -2.2F, -9.0F);
        this.main.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 51, -2.0F, 0.0F, -3.0F, 3, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 12, -3.0F, 0.0F, -2.0F, 5, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-3.0F, 0.0F, -12.0F);
        this.main.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 20, 1.0F, -1.0F, 0.025F, 4, 1, 1, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 43, 0.0F, -1.0F, 1.0F, 6, 1, 2, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-4.0F, 0.3029F, -4.0503F);
        this.main.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0611F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 25, 23, 1.0F, -0.825F, 0.0F, 6, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-3.5F, 0.5209F, -9.0456F);
        this.main.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 16, 0.0F, -0.825F, 0.0F, 7, 1, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(5.9153F, -0.275F, -7.3007F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, -0.829F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 0, 0.0F, 0.0F, 0.0F, 7, 0, 7, 0.0F, false));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, -7, 57, 0.0F, 0.05F, 0.0F, 7, 0, 7, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-5.9153F, -0.275F, -7.3007F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.829F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 0, -7.0F, 0.0F, 0.0F, 7, 0, 7, 0.0F, true));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, -7, 57, -7.0F, 0.05F, 0.0F, 7, 0, 7, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.975F, 0.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -3.0F, -1.0F, 0.0F, 6, 2, 6, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.0F, 0.5F, 1.0F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.2618F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 41, -0.225F, -0.5F, -0.1F, 2, 1, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(4.0F, 0.5F, 1.0F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2618F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 41, -1.775F, -0.5F, -0.1F, 2, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(4.1626F, 0.85F, 1.2132F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, -0.8727F, 0.0F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 27, 8, 0.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 21, 58, 0.0F, 0.05F, 0.0F, 4, 0, 6, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-4.1626F, 0.85F, 1.2132F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.8727F, 0.0F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 27, 8, -4.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 21, 58, -4.0F, 0.05F, 0.0F, 4, 0, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 38, -2.0F, -0.5F, 0.0F, 4, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 25, 30, -1.5F, -0.5F, 0.0F, 3, 2, 5, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.5F, 1.5F);
        this.tail3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3927F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 53, 35, 0.0F, -3.0F, 0.0F, 0, 3, 2, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 48, -1.0F, -0.475F, 0.0F, 2, 1, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 6, -1.0F, 0.125F, 0.0F, 2, 1, 4, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.475F, 1.4F);
        this.tail4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3491F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 42, 54, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 48, 23, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -0.75F, 0.95F);
        this.tail5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 1.0908F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 45, 0.5F, 0.0F, -1.0F, 0, 6, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.076F, -9.1923F);
        this.main.addChild(jaw);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-2.5F, 0.449F, -1.833F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0611F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 39, 47, 0.0F, -1.0F, 0.175F, 5, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.5F, 0.1812F, -3.3025F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2721F, 1.0264F, -0.2343F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 7, 54, -2.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5231F, -0.7515F, -3.0491F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.6839F, 1.0949F, -0.5949F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 29, 6, -1.95F, -0.325F, 0.05F, 2, 1, 0, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.5231F, -0.7515F, -3.0491F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.6839F, -1.0949F, 0.5949F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 29, 6, -0.05F, -0.325F, 0.05F, 2, 1, 0, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.5F, 0.1812F, -3.3025F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2721F, -1.0264F, 0.2343F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 7, 54, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-2.5F, 0.074F, -2.8077F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1396F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 50, 0, 1.0F, -0.825F, -0.475F, 3, 1, 2, -0.003F, false));

        updateDefaultPose();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.07F;
        this.main.offsetZ = 0.02F;
        this.main.offsetY = -0.245F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
        public void renderStaticFloor(float f) {
            this.main.offsetY = -0.14F;
            this.main.render(0.01F);
            resetToDefaultPose();
        }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.4F;
        this.main.offsetX = 0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-10);
        this.main.scaleChildren = true;
        float scaler = 1.F;
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
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        ((EntityPrehistoricFloraSquatina) e).tailBuffer.applyChainSwingBuffer(fishTail);

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] leftwings = {this.frontLeftFin};
        AdvancedModelRenderer[] rightwings = {this.frontRightFin};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {

                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed * 0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            if (ee.getIsMoving() || e.isInWater()) { //if moving, slap fins
                //this.flap(LeftPectoral, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                //this.flap(RightPectoral, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed * 2.5F, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed * 2.5F, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed * 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed * 2.5F, 0.25F, -3, f2, 1);
            } else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
//                this.flap(LeftPectoral, (speed), 0.25F, true, -3, 0, f2, 1);
//                this.flap(RightPectoral, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainFlap(leftwings, speed, 0.15F, 0, f2, 1);
                this.chainFlap(rightwings, speed, -0.15F, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backRightFin, (float) (speed), 0.2F, false, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, false, 0, 0, f2, 1);


        }
    }
}