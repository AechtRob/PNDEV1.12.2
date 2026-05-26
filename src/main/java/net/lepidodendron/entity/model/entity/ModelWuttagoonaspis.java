package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraWuttagoonaspis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelWuttagoonaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private ModelAnimator animator;


    public ModelWuttagoonaspis() {
        animator = ModelAnimator.create();

        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(1.3904F, 23.9462F, -4.2355F);
        this.main.cubeList.add(new ModelBox(main, 56, 31, -2.8904F, -2.3462F, -15.2645F, 3, 2, 7, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.1096F, -0.8462F, -8.7457F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 12, -10.0F, -0.1F, 4.4F, 9, 1, 7, 0.003F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -10.5F, -0.1F, 0.0F, 10, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 0, -10.5F, -3.5F, 0.0F, 10, 4, 5, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.1096F, -0.8462F, -8.6457F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -10.0F, -4.5F, 5.4F, 9, 5, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.6391F, -4.0015F, -7.7127F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2132F, -0.0392F, -0.223F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 71, -3.275F, -1.425F, -4.75F, 3, 2, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-5.8509F, -4.5291F, -8.8492F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1846F, -0.0459F, -0.2277F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 62, 0, -0.15F, 0.0F, -0.025F, 2, 2, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0701F, -4.5291F, -8.8492F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1846F, 0.0459F, 0.2277F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 0, -1.85F, 0.0F, -0.025F, 2, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.7302F, -4.3921F, -10.2386F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2154F, -0.0205F, -0.3532F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 74, -0.5F, -0.3F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.9494F, -4.3921F, -10.2386F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2154F, 0.0205F, 0.3532F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 74, -0.5F, -0.3F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1417F, -4.0015F, -7.7127F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2132F, 0.0392F, 0.223F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 71, 0.275F, -1.425F, -4.75F, 3, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.8904F, -0.8462F, -15.2645F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -1.0472F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 46, 0.0F, -1.5F, 0.0F, 2, 2, 2, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.6224F, -0.8462F, -14.2645F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 73, 0.0F, -1.5F, 0.0F, 3, 2, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.2343F, -0.8462F, -11.7343F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 70, 0.0F, -2.5F, 0.0F, 4, 3, 3, -0.003F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.4536F, -0.8462F, -11.7343F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 70, -4.0F, -2.5F, 0.0F, 4, 3, 3, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.8417F, -0.8462F, -14.2645F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 73, -3.0F, -1.5F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1096F, -0.8462F, -15.2645F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 1.0472F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 75, 46, -2.0F, -1.5F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.3904F, -5.9558F, -3.3734F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 41, -3.5F, 0.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.3904F, -5.1207F, -9.315F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1396F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 46, -3.5F, 0.0F, 0.0F, 7, 1, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.8904F, -4.2788F, -13.135F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2094F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 70, 66, -2.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.8904F, -2.3462F, -15.2645F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5546F, -0.5655F, -0.3144F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 71, 57, 0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.1096F, -2.3462F, -15.2645F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5546F, 0.5655F, 0.3144F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 71, 57, -2.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.8904F, -2.3462F, -15.2645F);
        this.main.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7069F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 73, 41, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.7269F, -0.3462F, -0.6696F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0436F, 0.3054F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 34, 66, -1.5F, 0.0F, 0.0F, 3, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-5.5077F, -0.3462F, -0.6696F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0436F, -0.3054F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 34, 66, -1.5F, 0.0F, 0.0F, 3, 0, 6, 0.0F, true));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(3.8076F, -0.5212F, -4.3449F);
        this.main.addChild(spine);
        this.setRotateAngle(spine, 0.0F, -0.0654F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.7561F, 0.0F, 7.5896F);
        this.spine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.0908F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 30, -4.0F, -0.5F, -1.0F, 4, 1, 1, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.8666F, 0.0F, 3.468F);
        this.spine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -1.3526F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 30, 0.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2021F, -0.5F, 0.0353F);
        this.spine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1735F, -1.3F, 0.176F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 66, -1.0F, -3.95F, -0.15F, 5, 4, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4275F, 0.0F, -0.0728F);
        this.spine.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -1.0908F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 56, 41, -0.8F, -0.5F, -0.4F, 5, 1, 3, 0.003F, false));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(-6.5884F, -0.5212F, -4.3449F);
        this.main.addChild(spine2);
        this.setRotateAngle(spine2, 0.0F, 0.0654F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.7561F, 0.0F, 7.5896F);
        this.spine2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 1.0908F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 11, 30, 0.0F, -0.5F, -1.0F, 4, 1, 1, -0.003F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.8666F, 0.0F, 3.468F);
        this.spine2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 1.3526F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 30, -4.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2021F, -0.5F, 0.0353F);
        this.spine2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1735F, 1.3F, -0.176F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 53, 66, -4.0F, -3.95F, -0.15F, 5, 4, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.4275F, 0.0F, -0.0728F);
        this.spine2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.0908F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 56, 41, -4.2F, -0.5F, -0.4F, 5, 1, 3, 0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.3661F, -0.9462F, -8.8335F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 50, 57, -1.5243F, 0.0F, -6.4309F, 3, 1, 7, -0.009F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(5.4757F, 0.1F, 0.0878F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 25, 54, -9.0F, -0.1F, -5.0F, 7, 1, 5, 0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.8682F, 0.1F, -2.9008F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.0873F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 34, 61, 0.0F, -0.1F, 0.0F, 4, 1, 3, -0.006F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.2563F, 0.1F, -5.4309F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.5672F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 43, 74, 0.0F, -0.1F, 0.0F, 3, 1, 3, -0.009F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.5243F, 0.1F, -6.4309F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -1.0472F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 75, 51, 0.0F, -0.1F, 0.0F, 2, 1, 2, -0.006F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(4.8197F, 0.1F, -2.9008F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0873F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 34, 61, -4.0F, -0.1F, 0.0F, 4, 1, 3, -0.006F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.4757F, 0.1F, -6.4309F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 1.0472F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 51, -2.0F, -0.1F, 0.0F, 2, 1, 2, -0.006F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(3.2078F, 0.1F, -5.4309F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.5672F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 43, 74, -3.0F, -0.1F, 0.0F, 3, 1, 3, -0.009F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-1.3904F, -3.8244F, 2.0998F);
        this.main.addChild(tail);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 3.5994F, 7.0002F);
        this.tail.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0305F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 25, 21, -4.5F, -5.0F, -7.0F, 7, 5, 7, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, -2.2769F, 0.4667F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.3963F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 56, 74, 0.0F, 0.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -2.4006F, 0.1002F);
        this.tail.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 50, -2.5F, 0.0F, 0.0F, 5, 2, 7, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.425F, 3.0994F, 6.0002F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.1897F, 0.8283F, -0.0224F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 70, 72, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.425F, 3.0994F, 6.0002F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.1897F, -0.8283F, 0.0224F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 70, 72, -1.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1704F, 6.6777F);
        this.tail.addChild(tail2);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.5F, 3.7039F, -0.0472F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0349F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 31, 34, -4.0F, -4.0F, 0.0F, 5, 4, 7, -0.003F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-1.0F, -1.5961F, -0.0472F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1265F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 54, 21, -1.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6794F, 6.2205F);
        this.tail2.addChild(tail3);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 2.7802F, -0.022F);
        this.tail3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0349F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 54, 46, -2.0F, -3.0F, 0.0F, 3, 3, 7, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-2.0F, -1.3921F, -0.0737F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1265F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 58, 10, 1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2994F, 6.2044F);
        this.tail3.addChild(tail4);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, -2.2401F, 6.5103F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.2356F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 17, 61, -1.0F, 0.0F, -7.0F, 1, 2, 7, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 2.2365F, 0.7693F);
        this.tail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.384F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 12, 0.0F, -2.0F, 0.0F, 0, 5, 12, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 60, -0.5F, -2.0F, 0.0F, 1, 2, 7, 0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.13F;
        this.main.offsetY = -0.22F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.9F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
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
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraWuttagoonaspis ee = (EntityPrehistoricFloraWuttagoonaspis) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.main.offsetY = 1.45F - 1.05F;
                this.main.rotateAngleX = -(float) Math.toRadians(15);
                swaymodifier = 0;
            }
            else {
                this.main.offsetY = 1.05F - 1.05F + (0.08F * (float)((double)ee.getBuriedTick()/60D));
                this.main.rotateAngleX = -(float) Math.toRadians(30 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.main.offsetY = 1.05F - 1.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.4F;
        float taildegree = 0.35F;

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
            speed = 0.15F * speedmodifier;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.05F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.flap(backRightFin, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 1.0F - 1.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
