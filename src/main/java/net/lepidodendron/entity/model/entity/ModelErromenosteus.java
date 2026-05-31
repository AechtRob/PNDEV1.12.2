package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelErromenosteus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;


    private ModelAnimator animator;

    public ModelErromenosteus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.0F, -5.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 21, -4.0F, -6.0F, 0.0F, 8, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 27, 11, -3.5F, -7.0F, 1.0F, 7, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.7519F, -1.8817F, -4.3558F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1746F, -0.3026F, 0.0015F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 48, 0.0F, -3.0F, 0.0F, 2, 3, 5, 0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7519F, -1.8817F, -4.3558F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1746F, 0.3026F, -0.0015F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 48, -2.0F, -3.0F, 0.0F, 2, 3, 5, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.7022F, -5.2773F, -3.3474F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.197F, -0.1647F, 0.0294F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 18, -0.175F, -0.175F, 0.0F, 2, 2, 5, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.1143F, -3.4255F, -5.8425F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2701F, -0.3152F, 0.1246F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 57, 0.05F, -0.925F, 0.0F, 2, 2, 3, 0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.7022F, -5.2773F, -3.3474F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.197F, 0.1647F, -0.0294F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 18, -1.825F, -0.175F, 0.0F, 2, 2, 5, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0525F, -3.548F, -5.1802F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0365F, -0.2676F, 0.0676F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 63, -0.3875F, -1.0625F, -1.15F, 1, 2, 2, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 51, -0.4625F, -0.5375F, -0.65F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0525F, -3.548F, -5.1802F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0365F, 0.2676F, -0.0676F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 63, -0.6125F, -1.0625F, -1.15F, 1, 2, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 51, -0.5375F, -0.5375F, -0.65F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.1143F, -3.4255F, -5.8425F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2701F, 0.3152F, -0.1246F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 57, -2.05F, -0.925F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.15F, -2.4802F, -6.1668F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.338F, -0.2846F, 0.1141F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 65, 22, 0.25F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 65, 22, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.15F, -2.4802F, -6.1668F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.338F, 0.2846F, -0.1141F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 22, -1.25F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 65, 22, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.8566F, -3.909F, -7.3907F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3832F, -0.5692F, 0.2365F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 18, -0.1F, 0.0F, 0.05F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.366F, -2.19F, -4.526F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2795F, -0.441F, 0.2003F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 62, 0.15F, -0.575F, -3.575F, 0, 1, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.366F, -2.19F, -4.526F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2795F, 0.441F, -0.2003F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 62, -0.15F, -0.575F, -3.575F, 0, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.8566F, -3.909F, -7.3907F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3832F, 0.5692F, -0.2365F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 65, 18, -0.9F, 0.0F, 0.05F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -4.434F, -6.5592F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4363F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 55, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -2.5862F, -5.7938F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3054F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 55, 46, -0.5F, -0.75F, -1.975F, 2, 1, 1, -0.006F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 49, -1.0F, -0.75F, -1.0F, 3, 1, 5, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, -5.9647F, -2.8637F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 53, 49, -0.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -7.0F, 1.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 35, -2.5F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 8, -3.0F, -2.0F, -2.0F, 6, 2, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.0109F, -1.0F, 0.5002F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0266F, -0.0346F, 0.655F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 34, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.0109F, -1.0F, 0.5002F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0266F, 0.0346F, -0.655F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 34, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.4804F, -1.8496F, -1.9776F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4804F, 1.2687F, -2.7365F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 63, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.5732F, 0.379F, -2.6561F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3958F, -0.5544F, 0.1653F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 65, 0.175F, -0.4F, -3.275F, 0, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.7869F, -0.2128F, -5.5313F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3203F, -0.2282F, 0.0749F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 48, 0.225F, -0.5F, -0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.1738F, -0.2128F, -5.5313F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3203F, 0.2282F, -0.0749F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 48, -0.225F, -0.5F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.6125F, 0.379F, -2.6561F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3958F, 0.5544F, -0.1653F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 65, -0.175F, -0.4F, -3.275F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5345F, 0.3575F, -5.5247F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3412F, -0.5468F, 0.1602F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 46, 0.0F, -1.0F, -0.1F, 1, 1, 1, -0.003F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 65, 0.0F, -1.0F, 0.4F, 1, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.2963F, 0.7143F, -4.4005F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2654F, -0.3354F, 0.0985F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 59, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5196F, 0.1627F, -2.68F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.2373F, -0.0236F, 0.0044F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 56, -0.5F, -2.0F, 0.325F, 1, 2, 3, -0.003F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 56, -0.5F, -2.0F, 0.325F, 1, 2, 3, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5738F, 0.3575F, -5.5247F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3412F, 0.5468F, -0.1602F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 53, 65, -1.0F, -1.0F, 0.4F, 1, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 62, 46, -1.0F, -1.0F, -0.1F, 1, 1, 1, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.3356F, 0.7143F, -4.4005F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2654F, 0.3354F, -0.0985F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 64, 59, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.4804F, 0.1627F, -2.68F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2373F, 0.0236F, -0.0044F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 56, -0.5F, -2.0F, 0.325F, 1, 2, 3, -0.003F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0196F, 0.1411F, 0.325F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0654F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 13, -3.0F, -0.175F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.4804F, 1.6603F, 0.2379F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1309F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 55, 41, -2.0F, -1.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5657F, 5.6205F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 0, -3.5F, -2.4343F, -0.1205F, 7, 5, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 3.5657F, -0.1205F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0262F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 29, 28, -3.0F, -1.0F, 0.025F, 6, 1, 5, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.5F, -3.3091F, 1.023F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3054F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 53, 55, 2.5F, -3.85F, -0.6F, 0, 4, 5, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, -3.4343F, -0.1205F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.1309F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 23, 35, -1.5F, 0.025F, 0.15F, 5, 1, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.4749F, 3.1692F, 1.8526F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.1682F, -0.1396F, 0.8845F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 30, 56, 0.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.4749F, 3.1692F, 1.8526F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.1682F, 0.1396F, -0.8845F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 30, 56, -3.0F, 0.0F, 0.0F, 3, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.231F, 4.5115F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 18, -2.5F, -1.5533F, -0.1319F, 5, 4, 5, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, -2.713F, -0.0283F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1963F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 36, 42, -1.5F, 0.175F, 0.075F, 4, 1, 5, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 3.2329F, 0.1448F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1702F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 40, -2.0F, -1.6F, -0.15F, 4, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.3172F, 3.4735F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 42, -1.5F, -0.6111F, -0.1055F, 3, 3, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -1.1718F, 0.8759F);
        this.tail3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1265F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 52, 26, -0.5F, -0.05F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 2.5322F, 0.6175F);
        this.tail3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4451F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 63, 33, 0.0F, -0.2F, -0.4F, 0, 3, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 2.9799F, 1.2341F);
        this.tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.1484F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 52, 0, -1.0F, -1.925F, -1.2F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2376F, 4.675F);
        this.tail3.addChild(tail4);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 2.6468F, 0.2684F);
        this.tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4407F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 22, 60, -1.0F, -2.0F, -0.3F, 2, 2, 3, -0.006F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.5036F, 2.6141F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0131F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 59, -1.0F, -1.0F, -3.0F, 2, 2, 3, -0.003F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 1.4564F, 2.5988F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.7243F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 33, 60, -0.5F, -1.025F, 0.025F, 1, 1, 4, -0.003F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.4515F, 2.1195F);
        this.tail4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.48F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 0, 0.5F, -0.875F, -2.2F, 0, 7, 13, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 51, 0.0F, -0.925F, 0.0F, 1, 1, 6, 0.0F, false));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
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
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

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

