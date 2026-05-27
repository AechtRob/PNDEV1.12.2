package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArenipiscis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftSpike;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightSpike;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private ModelAnimator animator;

    public ModelArenipiscis() {
        animator = ModelAnimator.create();
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 22, -4.0F, -5.75F, -2.0F, 8, 5, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.9931F, -8.1893F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.4399F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 67, 38, -1.5F, 2.0F, -1.0F, 5, 3, 1, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.7825F, -2.0759F, -7.6511F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.4773F, -0.3027F, 0.0411F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 66, 0.125F, -1.5F, -0.475F, 0, 3, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.7825F, -2.0759F, -7.6511F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.4773F, 0.3027F, -0.0411F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 66, -0.125F, -1.5F, -0.475F, 0, 3, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7406F, -6.3369F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.4137F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 52, -2.0F, -2.0F, 0.0F, 4, 2, 1, 0.006F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.3229F, -3.7592F, -8.9338F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5755F, -0.3346F, 0.1015F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 13, -0.5F, -0.275F, -0.825F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.3229F, -3.7592F, -8.9338F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5755F, 0.3346F, -0.1015F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 13, -0.5F, -0.275F, -0.825F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -2.5307F, -10.0795F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2682F, -0.3512F, 0.107F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 34, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, -2.5307F, -10.0795F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.2682F, 0.3512F, -0.107F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 34, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -2.5307F, -10.0795F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.3134F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 68, 52, -2.0F, 0.0F, 0.0F, 3, 2, 1, -0.008F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -3.943F, -10.0054F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.733F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 69, 7, -2.0F, 0.0F, -1.0F, 3, 1, 1, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -5.3049F, -7.3324F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4712F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 63, -2.0F, 0.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -6.3064F, -4.5045F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3403F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 60, -3.0F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -6.3064F, -4.5045F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2531F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 53, -3.0F, 0.0F, 0.0F, 6, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0461F, 1.1002F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 22, -3.5F, -1.0F, 0.0F, 7, 1, 3, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.0461F, 1.1002F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1178F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 29, 30, -4.0F, -2.0F, -5.0F, 7, 2, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.3835F, -1.565F, -2.18F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2536F, -0.399F, -0.0084F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 65, 0.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.2061F, -1.9946F, -8.4006F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1488F, -0.2514F, -0.0503F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 42, 0.0F, -3.0F, 0.0F, 2, 3, 7, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(2.2061F, -1.9946F, -8.4006F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1488F, 0.2514F, 0.0503F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 42, -2.0F, -3.0F, 0.0F, 2, 3, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(4.3835F, -1.565F, -2.18F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2536F, 0.399F, 0.0084F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 65, -2.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.7603F, -1.4611F, 2.1153F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.075F, -0.1693F, 0.1414F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 27, 0, -1.25F, 0.0F, 0.0F, 10, 0, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.7603F, -1.4611F, 2.1153F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.075F, 0.1693F, -0.1414F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 27, 0, -8.75F, 0.0F, 0.0F, 10, 0, 6, 0.0F, true));

        this.leftSpike = new AdvancedModelRenderer(this);
        this.leftSpike.setRotationPoint(-0.925F, 0.5F, -0.025F);
        this.main.addChild(leftSpike);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.5419F, -3.25F, -2.3026F);
        this.leftSpike.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1011F, 0.0612F, -0.1467F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 56, -1.975F, -3.0F, 0.05F, 2, 3, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(5.7F, -2.25F, -2.3F);
        this.leftSpike.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.2618F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 44, -2.15F, -1.0F, -0.15F, 2, 2, 5, 0.0F, false));

        this.rightSpike = new AdvancedModelRenderer(this);
        this.rightSpike.setRotationPoint(0.925F, 0.5F, -0.025F);
        this.main.addChild(rightSpike);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-5.5419F, -3.25F, -2.3026F);
        this.rightSpike.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1011F, -0.0612F, 0.1467F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 36, 56, -0.025F, -3.0F, 0.05F, 2, 3, 5, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-5.7F, -2.25F, -2.3F);
        this.rightSpike.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, -0.2618F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 57, 44, 0.15F, -1.0F, -0.15F, 2, 2, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.5578F, -3.6792F);
        this.main.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5274F, -0.4231F, -2.3449F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1713F, -0.2538F, 0.0434F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 41, 65, 0.0F, -1.925F, 0.0F, 1, 2, 3, -0.003F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.5274F, -0.4231F, -2.3449F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1713F, 0.2538F, -0.0434F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 41, 65, -1.0F, -1.925F, 0.0F, 1, 2, 3, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.25F, 0.957F, -0.1565F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1726F, -0.2796F, 0.0481F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 60, 0, 0.0F, -1.0F, -4.5F, 2, 1, 5, -0.003F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.25F, 0.957F, -0.1565F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1726F, 0.2796F, -0.0481F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 0, -2.0F, -1.0F, -4.5F, 2, 1, 5, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-2.1F, -0.7308F, -4.1832F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2421F, -0.2971F, 0.0721F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 68, 56, 0.65F, -0.3F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.1F, -0.7308F, -4.1832F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2421F, 0.2971F, -0.0721F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 68, 56, -0.65F, -0.3F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0395F, 0.3366F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1658F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 69, 10, -1.5F, -1.0F, -5.975F, 3, 1, 1, -0.01F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 27, -2.0F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.3327F, 3.5025F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 29, 20, -3.5F, -1.1673F, -0.0025F, 7, 4, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 4.1123F, 0.1061F);
        this.body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 38, -2.0F, -2.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-4.0F, -3.1219F, 1.0392F);
        this.body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 64, 4.0F, -3.875F, -0.225F, 0, 4, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -3.2103F, -2.8425F);
        this.body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2051F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 54, 16, -3.5F, 0.0F, -3.0F, 7, 2, 3, -0.003F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -3.172F, 0.0822F);
        this.body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0131F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 38, -3.5F, 0.0F, -2.925F, 7, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, -2.3111F, 6.0201F);
        this.body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.144F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 34, -2.5F, 0.0F, -5.925F, 6, 2, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.526F, -0.1227F, 3.9748F);
        this.body.addChild(tail);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.0259F, 2.3022F, 6.6928F);
        this.tail.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1614F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 56, 0.5F, -1.85F, -6.525F, 4, 2, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-2.5259F, -2.0225F, 4.4885F);
        this.tail.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0611F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 50, 7, -0.5F, -0.075F, -4.25F, 5, 4, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6082F, 3.2197F, 1.5406F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.0584F, -0.1967F, 0.3469F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 54, 34, 0.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.6601F, 3.2197F, 1.5406F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.0584F, 0.1967F, -0.3469F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 54, 34, -4.0F, 0.0F, -0.5F, 4, 0, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.526F, 0.6479F, 4.1004F);
        this.tail.addChild(tail2);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.0866F, -0.0936F);
        this.tail2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1047F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 56, -1.5F, -1.875F, -0.975F, 3, 2, 5, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.5341F, 2.062F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0829F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 38, 46, -2.0F, -2.0F, -3.0F, 4, 4, 5, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.599F, 3.536F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 19, 46, -1.5F, -1.6935F, 0.0113F, 3, 3, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 2.2606F, 0.1032F);
        this.tail3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 51, 63, -0.5F, -0.875F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.8493F, 5.4268F);
        this.tail3.addChild(tail4);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 2.1072F, 0.6709F);
        this.tail4.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.589F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 66, -0.5F, -1.05F, -0.15F, 1, 1, 5, -0.003F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 2.1558F, 0.5845F);
        this.tail4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3927F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, 0.5F, -2.95F, 0.0F, 0, 8, 13, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -0.742F, -0.192F);
        this.tail4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.3927F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 27, 7, -0.5F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

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
        this.main.offsetZ = -0.5F;

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
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

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
